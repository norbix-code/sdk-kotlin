# Norbix Kotlin SDK — Architect Overview

Author role: Kotlin Architect (20+ years), focus on developer UX of config and module usage.
Scope: code under `src/main/kotlin/dev/norbix/sdk/**`, `build.gradle.kts`, `docs/**`, `references/**`.

## Suggestions list

### A. Configuration & initialization

1. Keep env-var loading (good), but split it from the constructor. Make a separate `NorbixConfig.fromEnv()` and `NorbixConfig.builder()` so users can compose config in tests, scripts, and DI containers without `System.getenv()` magic hidden inside `init {}`.
2. Add a `.env` file loader (opt-in). Many users run scripts locally without exporting variables. Today only `System.getenv()` works.
3. Replace the 10-argument constructor with a Kotlin builder/DSL (`Norbix { apiKey = ... ; projectId = ... }`). Right now the constructor signature is hard to read and any new option will break the API.
4. Validate config eagerly and clearly. Today only `projectId` is checked. Add fail-fast validation with one combined error message ("missing projectId AND no apiKey/bearerToken") instead of a runtime `NORBIX_NOT_AUTHENTICATED` later inside `Transport`.
5. Stop exposing `transport` and the mutable `TransportConfig` to callers. `var bearerToken`, `var apiKey`, `var projectId` on a public field is a footgun — any thread can mutate it.
6. Make `Norbix` implement `Closeable / AutoCloseable` and own a single shared `HttpClient`. Today the `HttpClient` is constructed inline and never closed.
7. Allow injecting a custom `HttpClient`, logger, JSON mapper, retry policy, and clock. Best SDKs (Stripe, AWS, OpenAI) all expose these hooks. Today everything is hardcoded inside `Transport`.
8. Remove the empty `object NorbixSdk` — it is dead code and confusing as the package entry point.
9. Fix the duplicate timeout config: `HttpClient.connectTimeout(30s)` is hardcoded, but request `timeoutMs` is configurable. Use one source of truth.
10. Replace `setScope(projectId, accountId)` global mutation with per-call overrides (`norbix.withProject("proj_x").api.database.find(...)`) so multi-tenant code is safe.

### B. Module UX (the `db.findAll()`, `files.download()` style)

11. **The biggest issue: every method takes `Map<String, Any?>` and returns `Any?`.** This kills the whole "import a module and quickly call it" promise. Compare: today you must write `database.find(mapOf("collectionName" to "orders", "take" to 20))` instead of `database.find(collectionName = "orders", take = 20)`.
12. Generate strongly-typed DTOs from `references/api.dtos.kt` (they already exist!) and use them as request/response types. Right now those DTOs are unused — wasted asset.
13. Use Kotlin idiomatic naming: drop the suffix in module method names. `hub.files.disableFiles()` is redundant — should be `hub.files.disable()`. Same for `disableScheduler`, `enableScheduler`, `getFilesTriggers` → `triggers.list()`.
14. The `files` module name promises file operations, but it only manages triggers and integrations. There is no `files.upload()` or `files.download()`. Either rename to `files.config` / `files.admin`, or actually add upload/download.
15. Sub-resources should be sub-namespaces. Today `FilesModule` mixes `triggers`, `integrations`, and module on/off in one flat class. Better: `hub.files.triggers.list()`, `hub.files.integrations.save(...)`. This matches Stripe (`stripe.customers.subscriptions.list()`).
16. The reserved keyword workaround `internal_ = InternalModule(...)` in `HubNamespace.kt:15` is ugly. Rename the module (e.g. `system`, `platform`).
17. Path templating in `Transport.buildUrlAndBody` does case-insensitive map lookup for `{collectionName}` etc. This is fragile — typo `collection_name` silently passes. Use typed parameters instead.
18. Add `suspend` versions for coroutines. A modern Kotlin SDK without `suspend fun` looks dated. Today the calls are blocking on `HttpClient.send()`.
19. Provide pagination helpers (`Flow<Item>` or `PagedIterator`). `database.find()` returns `Any?`, so users have to cast and parse pages by hand.
20. Provide a real error hierarchy (`NorbixAuthError`, `NorbixNetworkError`, `NorbixValidationError`) instead of a single `NorbixError` with a string code field.

### C. Modularity & packaging

21. The library is one Gradle module that publishes one JAR. Promise of "import separate modules" is not met. Consider Gradle multi-module: `norbix-core`, `norbix-api-database`, `norbix-hub-files`, etc., so users only pull what they need.
22. Replace Gson with `kotlinx.serialization` for proper Kotlin support (null safety, sealed classes, `data class` defaults, multiplatform).
23. Add `@JvmStatic` factory and named-arg friendly API for Java callers if Java interop matters.

### D. Tests, docs, observability

24. Tests only check `assertNotNull(client.api.database)` (e.g. `DatabaseModuleTest.kt:11`). No real HTTP mock, no error-path tests, no path-template tests. Add tests with `MockWebServer` (OkHttp) or `WireMock`.
25. Docs (`docs/api/database.md`) only show a method/path table. Add a small Kotlin code example for each method, like Stripe docs do.
26. Add a request/response logger interceptor, request IDs, and metrics hooks. Production users always need this.
27. Add retries (with `Retry-After` support), 429/5xx exponential backoff, and idempotency keys for POST/PUT.

---

## Summary

The SDK has a clean folder layout (`api/` + `hub/` namespaces, one module per resource) and a few good ideas — env-var fallback in `Norbix.kt:29-44`, a clear `Transport` boundary, and auto-generated docs and tests. But as a Kotlin SDK aimed at developer UX, it does not yet feel like a "modern best-in-class" library. It feels more like a thin REST wrapper auto-generated from a server spec.

### Config UX is OK but limited

The constructor in `src/main/kotlin/dev/norbix/sdk/core/Norbix.kt:12-23` does mix env vars and constructor args, which is good — `NORBIX_PROJECT_ID`, `NORBIX_API_KEY`, `NORBIX_BEARER_TOKEN`, `NORBIX_ACCOUNT_ID`, `NORBIX_API_URL`, `NORBIX_HUB_URL` all work. So scripts do not need manual config every time. However:

- There is no `NorbixConfig` data class users can build outside the constructor. Everything is decided inside `init {}` (`Norbix.kt:28-48`) — bad for testing and DI.
- There is no `.env` loader. Only `System.getenv()` is checked.
- The 10-parameter constructor will not scale. A builder/DSL (`Norbix { apiKey = ... }`) would read better.
- `transport: Transport` and `transport.config` are public and **mutable** (`Transport.kt:16-27`, `var bearerToken`, `var apiKey`). External code can change them at any time, including across threads. Hide them behind `internal` and expose only `setBearerToken()` style methods.
- The class is not `Closeable`. The internal `HttpClient` (`Transport.kt:31`) is created with default settings and never released.

### Module UX is the weakest point

Your goal is `db.findAll()`, `files.download()`, `code.execute()` style — short, typed, discoverable. Today you get this:

```kotlin
val response = norbix.api.database.find(
    mapOf("collectionName" to "orders", "take" to 20)
)
```

This works, but it has three problems:

1. **No type safety.** Every method in `src/main/kotlin/dev/norbix/sdk/api/DatabaseModule.kt:8-150` and `src/main/kotlin/dev/norbix/sdk/hub/FilesModule.kt:8-127` accepts `Map<String, Any?>` and returns `Any?`. The IDE cannot autocomplete fields. A typo like `"collectionname"` silently fails inside the path resolver in `Transport.kt:110-119`. Compare with Stripe Java/Kotlin SDK or OpenAI Kotlin SDK — they ship full DTOs. The DTOs already exist in `references/api.dtos.kt`, but nobody uses them. That is a wasted opportunity.

2. **The `files` module does not download files.** Looking at `FilesModule.kt`, there is no `upload()` or `download()` — only `enableFiles`, `disableFiles`, triggers, and integrations. So the user expectation `files.Download()` does not exist. Either implement it, or rename the module to something honest like `files.admin`.

3. **Naming is verbose and not idiomatic Kotlin.** Examples:
   - `hub.files.disableFiles()` — repeats "files". Should be `hub.files.disable()`.
   - `hub.scheduler.disableScheduler()` (`SchedulerModule.kt:8`) — same problem.
   - `hub.internal_` (`HubNamespace.kt:15`) — reserved-word collision; rename the module.
   - `getFilesTriggers` / `getFilesIntegrations` — should be sub-namespaces: `hub.files.triggers.list()`, `hub.files.integrations.list()`.

A target end-state for a single call could look like:

```kotlin
// today
norbix.api.database.find(mapOf("collectionName" to "orders", "take" to 20))

// proposed
norbix.api.database.find(
    collection = "orders",
    take = 20,
    where = Filter.eq("status", "PAID"),
)
```

### Other gaps vs best Kotlin libraries (Ktor client, OpenAI Kotlin, Stripe)

- No `suspend fun` / coroutines support. `Transport.send()` is blocking (`Transport.kt:82-87`).
- No retry, no idempotency keys, no rate-limit handling.
- No pluggable logger or HTTP interceptor.
- One single error type `NorbixError` (`NorbixError.kt`) for everything — auth, network, validation, server.
- `Gson` instead of `kotlinx.serialization` — works, but not the Kotlin standard.
- The library is one JAR (`build.gradle.kts:35`). The "import only what you need" promise is not met.
- Tests are surface-only. `NorbixClientTest.kt` and `DatabaseModuleTest.kt:7-13` only check that fields are not null. There are no HTTP mock tests, no path-template tests, no error-path tests.
- The empty `object NorbixSdk` in `src/main/kotlin/dev/norbix/sdk/NorbixSdk.kt:7` is dead code.

### Overall verdict

The SDK is a solid first version: structure is clean, env-var support is there, docs are auto-generated. But the developer experience today is closer to "typed `curl` wrapper" than to a modern Kotlin SDK. The two highest-impact fixes are:

1. Replace `Map<String, Any?>` with generated DTOs and named parameters.
2. Reorganize modules so names are short, sub-resources are nested, and the `files` module actually has `upload`/`download`.

After that, add coroutine support, a builder-based `NorbixConfig`, real error hierarchy, and `MockWebServer`-based tests. Those changes will move it from "auto-generated wrapper" to "library people enjoy importing".
