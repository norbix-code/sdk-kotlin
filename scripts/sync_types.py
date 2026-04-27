from __future__ import annotations

import argparse
import subprocess
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
TARGETS = [
    {"name": "api.dtos.kt", "metadata_url": "http://localhost:5002", "output_name": "api"},
    {"name": "hub.dtos.kt", "metadata_url": "http://localhost:5001", "output_name": "hub"},
]


def main() -> None:
    parser = argparse.ArgumentParser(description="Sync Kotlin ServiceStack references for norbix-kotlin.")
    parser.add_argument(
        "--update-only",
        action="store_true",
        help="Update existing *.dtos.kt files in references/ by running `x kotlin` in-place.",
    )
    args = parser.parse_args()

    out_dir = ROOT / "references"
    out_dir.mkdir(parents=True, exist_ok=True)

    if args.update_only:
        existing = sorted(out_dir.glob("*.dtos.kt"))
        if not existing:
            raise FileNotFoundError("No existing Kotlin references found in references/.")
        for file in existing:
            cmd = ["x", "kotlin", str(file)]
            print(f"[sync-types] updating {file.name} with: {' '.join(cmd)}")
            subprocess.run(cmd, check=True, cwd=out_dir)
    else:
        for target in TARGETS:
            output_path = out_dir / target["name"]
            cmd = ["x", "kotlin", target["metadata_url"], target["output_name"]]
            print(f"[sync-types] generating {output_path.name} with: {' '.join(cmd)}")
            subprocess.run(cmd, check=True, cwd=out_dir)

    print("[sync-types] done")


if __name__ == "__main__":
    main()
