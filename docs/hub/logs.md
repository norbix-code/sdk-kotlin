# HUB · Logs

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `disableLogging` | `PUT` | `/{version}/logs/disable` | `project` |
| `enableLogging` | `PUT` | `/{version}/logs/enable` | `project` |
| `deleteLoggingIntegration` | `DELETE` | `/{version}/logs/integrations/{Id}` | `project` |
| `disableLoggingIntegration` | `PUT` | `/{version}/logs/integrations/{Id}/disable` | `project` |
| `enableLoggingIntegration` | `PUT` | `/{version}/logs/integrations/{Id}/enable` | `project` |
| `getLoggingIntegration` | `GET` | `/{version}/logs/integrations/{id}` | `project` |
| `getLoggingIntegrations` | `GET` | `/{version}/logs/integrations` | `project` |
| `saveLoggingIntegration` | `POST` | `/{version}/logs/integrations` | `project` |
| `testLoggingIntegration` | `POST` | `/{version}/logs/integrations/test` | `project` |
| `getLogsByCorrelationId` | `GET` | `/{version}/logs/audit` | `project` |
| `getLogs` | `GET` | `/{version}/logs` | `project` |
| `getLog` | `GET` | `/{version}/logs/{Id}` | `project` |
| `cleanLogs` | `POST` | `/{version}/logs/clean` | `project` |
| `getLogSettings` | `GET` | `/{version}/logs/settings` | `project` |
| `saveLogSettings` | `POST` | `/{version}/logs/settings` | `project` |

## Reading logs

```kotlin
val page = hub.logs.getLogs(mapOf(
    "level" to "Error",                 // Information | Warning | Error
    "logCorrelationId" to "checkout-42",
    "eventCode" to "app:order:paid",
    "pageSize" to 20,                   // paging: startingAfter / endingBefore
)) as Map<*, *>                         // { list }
val one = hub.logs.getLog(mapOf("id" to "6650f0c2a1b2c3d4e5f60718"))   // { item }
val trail = hub.logs.getLogsByCorrelationId(mapOf("targetCorrelationId" to "checkout-42"))
```

Other filters: `module`, `search`, `metaKey` + `metaValue`, `fromUtc`, `toUtc`.
`cleanLogs()` deletes every entry stored in the project's Norbix Logging.
`getLogSettings()` / `saveLogSettings(...)` read and change
`skipCloudDashboardLogs`, `skipHttpBodyMeta` and `aiChatLoggingEnabled`
(a flag not sent stays unchanged).

## Logging integrations — test after saving

Nothing is delivered to a logging integration (Datadog, AWS CloudWatch,
MongoDB, …) until its last test passed. After saving or changing one, test it:

```kotlin
val saved = hub.logs.saveLoggingIntegration(mapOf("integration" to mapOf(
    "provider" to "MongoDB",
    "integrationName" to "Audit copy",
    "isEnabled" to true,
    "connectionString" to "mongodb+srv://…",
    "databaseName" to "logs",           // optional
))) as Map<*, *>
hub.logs.testLoggingIntegration(mapOf("integrationId" to saved["id"]))
```

Request types (`MongoDbLoggingIntegrationRequest`,
`DataDogLoggingIntegrationRequest` with its `site`,
`AwsCloudWatchLoggingIntegrationRequest`, …) are in `references/hub.dtos.kt`.
