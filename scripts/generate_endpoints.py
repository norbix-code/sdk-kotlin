from __future__ import annotations

import re
from collections import defaultdict
from dataclasses import dataclass
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
SRC_ROOT = ROOT / "src" / "main" / "kotlin" / "dev" / "norbix" / "sdk"
TEST_ROOT = ROOT / "src" / "test" / "kotlin" / "dev" / "norbix" / "sdk"
DOCS_ROOT = ROOT / "docs"


@dataclass
class Endpoint:
    class_name: str
    route: str
    method: str
    group: str
    account_scoped: bool


TARGETS = [
    {"name": "api", "dto_file": ROOT / "references" / "api.dtos.kt", "namespace": "ApiNamespace"},
    {"name": "hub", "dto_file": ROOT / "references" / "hub.dtos.kt", "namespace": "HubNamespace"},
]


def main() -> None:
    clean_generated_outputs()
    for target in TARGETS:
        endpoints = parse_dto(target["dto_file"])
        emit_modules(target["name"], target["namespace"], endpoints)
        emit_tests(target["name"], endpoints)
        emit_docs(target["name"], endpoints)
    emit_docs_index()
    print("Codegen complete.")


def parse_dto(path: Path) -> list[Endpoint]:
    lines = path.read_text(encoding="utf-8").splitlines()
    pending_routes: list[tuple[str, str]] = []
    endpoints: list[Endpoint] = []

    for idx, line in enumerate(lines):
        route_match = re.search(r'//\s*@Route\("([^"]+)"(?:,\s*"([^"]+)")?\)', line)
        if not route_match:
            route_match = re.search(r'@Route\((?:Path\s*=\s*)?"([^"]+)"(?:,\s*(?:Verbs\s*=\s*)?"([^"]+)")?\)', line)
        if route_match:
            route = route_match.group(1)
            methods = route_match.group(2) or "POST"
            method = pick_method([m.strip().upper() for m in methods.split(",") if m.strip()])
            pending_routes.append((route, method))
            continue

        cls = re.search(r"^\s*(?:open\s+)?class\s+([A-Za-z0-9_]+)", line)
        if not cls or not pending_routes:
            continue

        header = line
        probe = idx
        while "{" not in header and probe + 1 < len(lines):
            probe += 1
            header += " " + lines[probe].strip()

        route, method = pending_routes[0]
        endpoints.append(
            Endpoint(
                class_name=cls.group(1),
                route=route,
                method=method,
                group=derive_group(route),
                account_scoped=("IHasAccountId" in header or "/account" in route),
            )
        )
        pending_routes = []

    return endpoints


def pick_method(verbs: list[str]) -> str:
    for v in ["POST", "PUT", "PATCH", "DELETE", "GET"]:
        if v in verbs:
            return v
    return "POST"


def derive_group(route: str) -> str:
    route = route.lstrip("/")
    parts = route.split("/")
    head = parts[1] if parts and parts[0] == "{version}" and len(parts) > 1 else (parts[0] if parts else "misc")
    return re.sub(r"[^a-zA-Z0-9]+", "_", head).strip("_").lower() or "misc"


def method_name(class_name: str, used: set[str]) -> str:
    base = re.sub(r"Request$", "", class_name)
    candidate = base[:1].lower() + base[1:]
    out = candidate
    idx = 1
    while out in used:
        idx += 1
        out = f"{candidate}{idx}"
    used.add(out)
    return out


def scope_for(ep: Endpoint) -> str:
    if ep.route == "/auth" or ep.route.startswith("/auth/"):
        return "Scope.UNAUTHENTICATED"
    return "Scope.ACCOUNT" if ep.account_scoped else "Scope.PROJECT"


def emit_modules(target: str, namespace: str, endpoints: list[Endpoint]) -> None:
    by_group: dict[str, list[Endpoint]] = defaultdict(list)
    for ep in endpoints:
        by_group[ep.group].append(ep)

    target_root = SRC_ROOT / target
    target_root.mkdir(parents=True, exist_ok=True)

    for group, items in sorted(by_group.items()):
        used: set[str] = set()
        klass = f"{pascal(group)}Module"
        lines = [
            f"package dev.norbix.sdk.{target}",
            "",
            "import dev.norbix.sdk.core.Scope",
            "import dev.norbix.sdk.core.Target",
            "import dev.norbix.sdk.core.Transport",
            "",
            f"class {klass}(private val transport: Transport) {{",
        ]
        for ep in items:
            method = method_name(ep.class_name, used)
            lines.extend(
                [
                    f"    fun {method}(request: Map<String, Any?> = emptyMap()): Any? = transport.send(",
                    f"        target = Target.{target.upper()},",
                    f"        path = \"{ep.route}\",",
                    f"        method = \"{ep.method}\",",
                    "        request = request,",
                    f"        scope = {scope_for(ep)},",
                    "    )",
                    "",
                ]
            )
        lines.append("}")
        (target_root / f"{klass}.kt").write_text("\n".join(lines) + "\n", encoding="utf-8")

    namespace_lines = [
        f"package dev.norbix.sdk.{target}",
        "",
        "import dev.norbix.sdk.core.Transport",
        "",
        f"class {namespace}(transport: Transport) {{",
    ]
    for group in sorted(by_group.keys()):
        namespace_lines.append(f"    val {safe_ident(group)} = {pascal(group)}Module(transport)")
    namespace_lines.extend(["}", ""])
    (target_root / f"{namespace}.kt").write_text("\n".join(namespace_lines), encoding="utf-8")


def emit_tests(target: str, endpoints: list[Endpoint]) -> None:
    by_group: dict[str, list[Endpoint]] = defaultdict(list)
    for ep in endpoints:
        by_group[ep.group].append(ep)

    out_root = TEST_ROOT / target
    out_root.mkdir(parents=True, exist_ok=True)

    for group in sorted(by_group.keys()):
        klass = f"{pascal(group)}ModuleTest"
        lines = [
            f"package dev.norbix.sdk.{target}",
            "",
            "import dev.norbix.sdk.core.Norbix",
            "import kotlin.test.Test",
            "import kotlin.test.assertNotNull",
            "",
            f"class {klass} {{",
            "    @Test",
            "    fun moduleSurface() {",
            "        val client = Norbix(projectId = \"proj\", bearerToken = \"token\")",
            f"        assertNotNull(client.{target}.{safe_ident(group)})",
            "    }",
            "}",
            "",
        ]
        (out_root / f"{klass}.kt").write_text("\n".join(lines), encoding="utf-8")


def emit_docs(target: str, endpoints: list[Endpoint]) -> None:
    by_group: dict[str, list[Endpoint]] = defaultdict(list)
    for ep in endpoints:
        by_group[ep.group].append(ep)
    docs_target = DOCS_ROOT / target
    docs_target.mkdir(parents=True, exist_ok=True)

    rows = []
    for group, items in sorted(by_group.items()):
        used: set[str] = set()
        lines = [
            f"# {target.upper()} · {pascal(group)}",
            "",
            "| Method | Verb | Path | Scope |",
            "| --- | --- | --- | --- |",
        ]
        for ep in items:
            m = method_name(ep.class_name, used)
            scope = "account" if ep.account_scoped else "project"
            lines.append(f"| `{m}` | `{ep.method}` | `{ep.route}` | `{scope}` |")
        (docs_target / f"{group}.md").write_text("\n".join(lines) + "\n", encoding="utf-8")
        rows.append(f"| [`{group}`](./{group}.md) | {len(items)} |")

    index = [f"# {target.upper()} reference", "", "| Module | Endpoints |", "| --- | ---: |", *rows]
    (docs_target / "_index.md").write_text("\n".join(index) + "\n", encoding="utf-8")


def emit_docs_index() -> None:
    lines = ["# Norbix Kotlin SDK docs", "", "- [API reference](./api/_index.md)", "- [Hub reference](./hub/_index.md)"]
    (DOCS_ROOT / "README.md").write_text("\n".join(lines) + "\n", encoding="utf-8")


def clean_generated_outputs() -> None:
    for folder in (SRC_ROOT / "api", SRC_ROOT / "hub"):
        if not folder.exists():
            continue
        for file in folder.glob("*.kt"):
            file.unlink(missing_ok=True)

    for folder in (TEST_ROOT / "api", TEST_ROOT / "hub"):
        if not folder.exists():
            continue
        for file in folder.glob("*Test.kt"):
            file.unlink(missing_ok=True)

    for folder in (DOCS_ROOT / "api", DOCS_ROOT / "hub"):
        if not folder.exists():
            continue
        for file in folder.glob("*.md"):
            file.unlink(missing_ok=True)


def pascal(value: str) -> str:
    return "".join(part.capitalize() for part in re.split(r"[_-]+", value) if part)


def safe_ident(value: str) -> str:
    return value + "_" if value in {"internal", "public", "private", "class", "object"} else value


if __name__ == "__main__":
    main()
