# HUB · Code

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `disableCode` | `PUT` | `/{version}/code/disable` | `project` |
| `enableCode` | `PUT` | `/{version}/code/enable` | `project` |
| `getCodeIntegrations` | `GET` | `/{version}/code/integrations` | `project` |
| `saveCodeIntegration` | `POST` | `/{version}/code/integrations` | `project` |
| `confirmCodeIntegrationHumanDelivery` | `POST` | `/{version}/code/integrations/confirm-human-delivery` | `project` |
| `testCodeIntegration` | `POST` | `/{version}/code/integrations/test` | `project` |
| `deleteCodeIntegration` | `DELETE` | `/{version}/code/integrations/{Id}` | `project` |
| `getCodeIntegration` | `GET` | `/{version}/code/integrations/{id}` | `project` |
| `disableCodeIntegration` | `PUT` | `/{version}/code/integrations/{Id}/disable` | `project` |
| `enableCodeIntegration` | `PUT` | `/{version}/code/integrations/{Id}/enable` | `project` |
| `getMarketplaceListings` | `GET` | `/{version}/code/marketplace/listings` | `project` |
| `getMarketplaceListingFunctionTokens` | `GET` | `/{version}/code/marketplace/listings/{ListingViewId}/functions/{FunctionKey}/tokens` | `project` |
| `getMarketplaceIntegrations` | `GET` | `/{version}/code/marketplace/integrations` | `project` |
| `getMarketplaceIntegration` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}` | `project` |
| `saveMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations` | `project` |
| `deleteMarketplaceIntegration` | `DELETE` | `/{version}/code/marketplace/integrations/{IntegrationViewId}` | `project` |
| `enableMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/enable` | `project` |
| `disableMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/disable` | `project` |
| `getMarketplaceFunctions` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions` | `project` |
| `getMarketplaceFunction` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}` | `project` |
| `saveMarketplaceFunction` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions` | `project` |
| `deleteMarketplaceFunction` | `DELETE` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}` | `project` |
| `enableMarketplaceFunction` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/enable` | `project` |
| `disableMarketplaceFunction` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/disable` | `project` |
| `getMarketplaceFunctionTokens` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/tokens` | `project` |
| `invokeMarketplaceFunction` | `POST` | `/{version}/code/marketplace/functions/{FunctionViewId}/invoke` | `project` |
| `getMarketplaceListing` | `GET` | `/{version}/code/marketplace/listings/{ListingViewId}` | `project` |
| `testMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/test` | `project` |
| `getMarketplaceIntegrationTools` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/tools` | `project` |
| `getMarketplaceIntegrationAccess` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/access` | `project` |
| `setMarketplaceIntegrationRoleAccess` | `PUT` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/access/roles` | `project` |
| `saveMarketplaceIntegrationCustomAccess` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/access/roles/custom` | `project` |
| `startMarketplaceIntegrationSignIn` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/oauth/start` | `project` |
| `signOutMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/oauth/sign-out` | `project` |
| `replaceMarketplaceIntegrationSecrets` | `PUT` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets` | `project` |
| `revealMarketplaceIntegrationSecrets` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets/reveal` | `project` |
| `setMarketplaceIntegrationTokenMappings` | `PUT` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/token-mappings` | `project` |
| `getMarketplaceFunctionCatalog` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/catalog` | `project` |
| `getMarketplaceFunctionRuns` | `GET` | `/{version}/code/marketplace/functions/runs` | `project` |
| `getCodeFunctions` | `GET` | `/{version}/code/functions` | `project` |
| `getCodeFunctionQualifiers` | `GET` | `/{version}/code/functions/qualifiers` | `project` |
| `invokeCodeFunction` | `POST` | `/{version}/code/functions/invoke` | `project` |
| `getCodeFunctionEventSample` | `GET` | `/{version}/code/functions/event-sample` | `project` |
| `getCodeFunctionRuns` | `GET` | `/{version}/code/functions/runs` | `project` |

## Marketplace function runs

Each call of a marketplace function is one run row: an invoke (user, API key,
AI), a trigger run or a scheduler fire. `getMarketplaceFunctionRuns` takes
exactly one of `functionId` (every source, newest first, up to 50),
`triggerId` or `taskId`, plus `limit` (1–50, default 20). A row carries
`status` (`ok` / `failed` / `skipped`, null on rows written before the field
existed), `durationMs`, `source`, `event`, `correlationId` and `hasDetails`.

The input, steps and response of a run are written to the project log under
the row's `correlationId`, only while the environment's Norbix Logging is on —
then `hasDetails` is true. Read them with the logs route; its query field is
`targetCorrelationId`:

```kotlin
@Suppress("UNCHECKED_CAST")
val runs = (hub.code.getMarketplaceFunctionRuns(mapOf("functionId" to "func_…", "limit" to 10)) as Map<String, Any?>)["runs"] as List<Map<String, Any?>>
for (run in runs) {
    if (run["hasDetails"] != true) continue // logs were off for this run
    val details = hub.logs.getLogsByCorrelationId(mapOf("targetCorrelationId" to run["correlationId"]))
    // details["items"]: marketplace:run:started → marketplace:run:step … → completed | failed | skipped
}
```

## Cloud functions

The five `code/functions` routes of the gateway contract `Code.Functions.md`
(§3.3, §3.4, §5.1); each is asserted (verb, path, query / body) in
`CodeModuleTest`. Norbix does not host code: a trigger's `Code` action, a
scheduler `CodeFunctionalCall` task or `invokeCodeFunction` runs a function in
your own cloud through a Code integration.

| Method | Parameters |
| --- | --- |
| `getCodeFunctions` | query: `integrationId` (required), `prefix`, `tag` (`key` or `key=value`), `pageSize`, `startingAfter`, `endingBefore` — a live listing from the provider |
| `getCodeFunctionQualifiers` | query: `integrationId`, `functionId` — the aliases and versions |
| `invokeCodeFunction` | body: `functionRef` `{integrationId, functionId, qualifier?}`, `payload?`, `invocationType` (`Sync` / `Async`), `runAsUserId?`, `config?` → `{statusCode, output, durationMs, requestId?, logs?}` |
| `getCodeFunctionEventSample` | query: `source` (`database` · `membership` · `files` · `payments` · `ai` · `scheduler` · `manual`, any case), `event?`, `schemaId?` — a sample envelope for a local run |
| `getCodeFunctionRuns` | query: exactly one of `triggerId` / `taskId`, `limit` (1–50, default 20) — the last runs, newest first; each run carries `input` — the scrubbed envelope a Fake-provider run received |

```kotlin
val functions = hub.code.getCodeFunctions(mapOf("integrationId" to "int_1", "prefix" to "orders-"))
val result = hub.code.invokeCodeFunction(
    mapOf(
        "functionRef" to mapOf("integrationId" to "int_1", "functionId" to "orders-on-update", "qualifier" to "prod"),
        "payload" to mapOf("orderId" to "6ac54a59212c29912eaddd81", "dryRun" to true),
        "invocationType" to "Sync",
    ),
)
val runs = hub.code.getCodeFunctionRuns(mapOf("triggerId" to "trg_1", "limit" to 5))
```

The function receives one JSON envelope (`CodeFunctionEventDto` in
`references/hub.dtos.kt`): `event`, `source`, `context` (`projectId`,
`environment`, `hubUrl`, `apiUrl`, `runAs.accessToken` — a 15-minute token
for the run-as user) and `data` with one slot per source (`database`, `user`,
`file`, `payment`, `ai`, `task`, `payload`).
