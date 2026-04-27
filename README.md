# norbix-kotlin

[![CI](https://github.com/norbix-dev/norbix-kotlin/actions/workflows/ci.yml/badge.svg)](https://github.com/norbix-dev/norbix-kotlin/actions/workflows/ci.yml)
[![Kotlin](https://img.shields.io/badge/kotlin-2.0-purple.svg)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)

Official Kotlin SDK for [Norbix](https://norbix.dev). One client wraps both:

- **API** for project-scoped data
- **Hub** for project/account configuration

## Install

Gradle:

```kotlin
dependencies {
  implementation("dev.norbix:norbix-kotlin:<version>")
}
```

## Quickstart

```kotlin
import dev.norbix.sdk.core.Norbix

val norbix = Norbix(apiKey = "sk_live_xxx", projectId = "proj_123")
val response = norbix.api.database.find(mapOf("collectionName" to "orders", "take" to 20))
println(response)
```

```kotlin
val norbix = Norbix(projectId = "proj_123")
val auth = norbix.login(dev.norbix.sdk.core.LoginCredentials("alice@team.io", "secret"))
println(auth["bearerToken"])
```

## Real examples

```kotlin
val norbix = Norbix(apiKey = "sk_live_xxx", projectId = "proj_123", accountId = "acc_456")
val account = norbix.hub.account.getAccount()
println(account)
```

## ServiceStack references (`x kotlin`)

This SDK follows ServiceStack Add Reference for Kotlin:

- `python3 scripts/sync_types.py` -> runs `x kotlin <url> <name>`
- `python3 scripts/sync_types.py --update-only` -> runs `x kotlin <file.dtos.kt>`
- `python3 scripts/generate_endpoints.py` -> generates API/hub wrappers + tests + docs

Install `x` if needed:

```bash
dotnet tool install --global x
```

## Development

```bash
python3 scripts/sync_types.py
python3 scripts/generate_endpoints.py
gradle test
gradle build
```
