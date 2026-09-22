# norbix-kotlin

[![CI](https://github.com/norbix-code/sdk-kotlin/actions/workflows/ci.yml/badge.svg)](https://github.com/norbix-code/sdk-kotlin/actions/workflows/ci.yml)
[![Kotlin](https://img.shields.io/badge/kotlin-2.0-purple.svg)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)

Official Kotlin SDK for [Norbix](https://norbix.ai). The SDK ships **two top-level clients**, one per plane:

- `NorbixApi` (package `ai.norbix.sdk.api`) — project-scoped data. Default base URL: `https://api.norbix.ai`.
- `NorbixHub` (package `ai.norbix.sdk.hub`) — project / account configuration. Default base URL: `https://hub.norbix.ai`.

Modules are exposed as flat fields on each client, so call sites read like `api.database.find(...)` or `hub.files.getFilesIntegrations(...)`.

## Install

Published to Maven Central as `ai.norbix:norbix-kotlin`. Gradle:

```kotlin
repositories {
  mavenCentral()
}

dependencies {
  implementation("ai.norbix:norbix-kotlin:0.1.0")
}
```

Requires Java 17+; compiled for Kotlin 2.0+ consumers.

## Quickstart — API

```kotlin
import ai.norbix.sdk.api.NorbixApi

val api = NorbixApi(apiKey = "sk_live_xxx", projectId = "proj_123")
val response = api.database.find(mapOf("collectionName" to "orders", "take" to 20))
println(response)
```

Login flow (no API key, just user credentials):

```kotlin
import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.core.LoginCredentials

val api = NorbixApi(projectId = "proj_123")
val auth = api.login(LoginCredentials("alice@team.io", "secret"))
println(auth["bearerToken"])
```

## Quickstart — Hub

```kotlin
import ai.norbix.sdk.hub.NorbixHub

val hub = NorbixHub(
    apiKey = "sk_live_xxx",
    projectId = "proj_123",
    accountId = "acc_456", // required for account-scoped endpoints
)
val schemas = hub.database.getDatabaseSchemas()
val profile = hub.account.getAccountProfile()
println(profile)
```

## Configuration

Every constructor argument is optional and resolved in this order:

1. Explicit constructor argument.
2. Matching `NORBIX_*` environment variable.
3. Built-in default.

| Constructor arg  | Env variable           | Default                   |
|------------------|------------------------|---------------------------|
| `projectId`      | `NORBIX_PROJECT_ID`    | — (required)              |
| `apiKey`         | `NORBIX_API_KEY`       | `null`                    |
| `bearerToken`    | `NORBIX_BEARER_TOKEN`  | `null`                    |
| `accountId`      | `NORBIX_ACCOUNT_ID`    | `null`                    |
| `region`         | `NORBIX_REGION`        | `null` (no region — see [Regions](#regions)) |
| `baseUrl` (API)  | `NORBIX_API_URL`       | `https://api.norbix.ai`   |
| `baseUrl` (Hub)  | `NORBIX_HUB_URL`       | `https://hub.norbix.ai`   |
| `version` (API)  | `NORBIX_API_VERSION`   | `v2`                      |
| `version` (Hub)  | `NORBIX_HUB_VERSION`   | `v2`                      |

This means a script that exports `NORBIX_PROJECT_ID` and `NORBIX_API_KEY` can call `NorbixApi()` with no arguments.

### Self-hosted / custom domain

If you deploy Norbix to your own infrastructure, point the SDK at it through `baseUrl` or the matching env var:

```kotlin
val api = NorbixApi(
    projectId = "proj_123",
    apiKey = "sk_live_xxx",
    baseUrl = "https://api.norbix.isidos.lt",
)

val hubLocal = NorbixHub(
    projectId = "proj_123",
    apiKey = "sk_live_xxx",
    baseUrl = "http://localhost:5001",
)
```

Or, without code changes:

```bash
export NORBIX_API_URL=https://api.norbix.isidos.lt
export NORBIX_HUB_URL=https://hub.norbix.isidos.lt
```

## Regions

Norbix can serve a project from multiple regions. The SDK targets a region by sending the `nb-region` header on every request. Unlike other options there is **no default region**: when no region is configured, no header is sent and the backend picks its own default.

The region resolves in the usual configuration order: explicit constructor argument → `NORBIX_REGION` environment variable → unset.

```kotlin
val hub = NorbixHub(projectId = "proj_123", apiKey = "sk_live_xxx", region = "nb-eu-germany")
val api = NorbixApi(projectId = "proj_123", apiKey = "sk_live_xxx", region = "nb-eu-germany")
```

Or, without code changes:

```bash
export NORBIX_REGION=nb-eu-germany
```

### Switching regions at runtime

Both clients expose `setRegion` / `getRegion`:

```kotlin
hub.setRegion("nb-us-east")  // subsequent requests send nb-region: nb-us-east
hub.getRegion()              // "nb-us-east"
hub.setRegion(null)          // unset: header no longer sent, default base URL restored
```

`getRegion()` returns `null` when no region is set.

### Per-call override

Methods on `hub.regions` (and `Transport.send` itself) accept an optional `region` argument that wins over the client's region for that single request. The override only changes the `nb-region` header — the base URL is not touched:

```kotlin
hub.regions.list(region = "nb-us-east")
```

### Regional base URLs

When the client points at the SDK **default** base URL, configuring a region (constructor, `NORBIX_REGION`, or `setRegion`) also composes a regional variant of that URL:

| Plane | Default                 | With `region = "nb-eu-germany"`          |
|-------|-------------------------|------------------------------------------|
| Hub   | `https://hub.norbix.ai` | `https://nb-eu-germany.hub.norbix.ai`    |
| API   | `https://api.norbix.ai` | `https://nb-eu-germany.api.norbix.ai`    |

`setRegion(null)` restores the plain default URL.

A **custom** base URL — passed to the constructor or set via `NORBIX_HUB_URL` / `NORBIX_API_URL` — is **never rewritten**, so self-hosted deployments are unaffected: the client keeps your URL and only sends the `nb-region` header.

### Managing regions — `hub.regions`

`hub.regions.list()` (`GET /{version}/account/regions`, account-scoped) lists the regions available to the account. Each item carries `id` (the region code), `continent`, and `name`:

```json
{ "items": [ { "id": "nb-eu-germany", "continent": "Europe", "name": "Germany" } ] }
```

`hub.regions.updateProjectRegions(...)` (`PATCH /{version}/account/projects/{projectId}/settings/regions`, account-scoped) updates the project's regions. `primaryRegion` and `additionalRegions` are region code strings; pass `null` to leave one unchanged. Empty response on success:

```kotlin
hub.regions.updateProjectRegions(
    projectId = "proj_123",
    primaryRegion = "nb-eu-germany",
    additionalRegions = listOf("nb-us-east"),
)
```

### Regions at project creation

The SDK is untyped on the wire, so `hub.account.createProject` takes a `Map` and passes the region keys straight through to the gateway:

```kotlin
hub.account.createProject(mapOf(
    "name" to "My project",
    "primaryRegion" to "nb-eu-germany",
    "additionalRegions" to listOf("nb-us-east"),
))
```

## Errors

```kotlin
try {
    api.files.getFileInfo(mapOf("filesIntegrationId" to id, "path" to "a/b.txt"))
} catch (e: NorbixError) {
    // httpStatus / errorCode are the names every Norbix SDK uses.
    // status / code are the same values, kept for older code.
    println("${e.httpStatus} ${e.errorCode}: ${e.message}")
    e.errors.forEach { println("${it.errorCode} ${it.fieldName}: ${it.message}") }
    println(e.body) // the answer exactly as it arrived
}
```

`message` and `errorCode` are the gateway's own. The gateway puts them inside
`responseStatus.errors[]`, so the SDK reads that list first, takes the first
entry for the message and the code, and keeps every entry in `errors`. Only
when the body has no `responseStatus` are the top-level `message` and
`errorCode` read. `Request failed (HTTP N)` with the code `HTTP_<status>` is
the last fallback, used when the body says nothing — a 500 page that is not
JSON, say.

### Breaking change — a refused call now throws

The gateway answers a business refusal (an unknown id, a rule that says no)
with **HTTP 200** and `responseStatus.isSuccess = false`. The SDK used to hand
that answer back as a normal value, so code carried on as if the call had
worked. It now throws a `NorbixError` with `httpStatus` 200 and the gateway's
message and error code.

If your code checked the `responseStatus` of the answer itself, move that check
into a `try / catch`. Endpoints that answer with raw bytes rather than a
document (`sendBytes` — file download, the public file link) are not JSON and
are unchanged.

## Resource cleanup

Both clients implement `AutoCloseable`, so they work with `use { }`:

```kotlin
NorbixApi(projectId = "proj_123", apiKey = "sk_live_xxx").use { api ->
    api.echo.echo()
}
```

## SDK maintenance

API/Hub modules, tests, and per-module docs are generated by the SDK maintenance workflow.

## Development

```bash
./gradlew test
./gradlew build
```
