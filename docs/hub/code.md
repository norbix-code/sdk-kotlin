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
| `setCodeIntegrationAsDefault` | `PUT` | `/{version}/code/integrations/{Id}/default` | `project` |
| `disableCodeIntegration` | `PUT` | `/{version}/code/integrations/{Id}/disable` | `project` |
| `enableCodeIntegration` | `PUT` | `/{version}/code/integrations/{Id}/enable` | `project` |
| `getMarketplaceIntegrations` | `GET` | `/{version}/code/marketplace/integrations` | `project` |
| `saveMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations` | `project` |
| `deleteMarketplaceIntegration` | `DELETE` | `/{version}/code/marketplace/integrations/{IntegrationViewId}` | `project` |
| `getMarketplaceIntegration` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}` | `project` |
| `getMarketplaceBindings` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings` | `project` |
| `saveMarketplaceFunctionBinding` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings` | `project` |
| `deleteMarketplaceFunctionBinding` | `DELETE` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}` | `project` |
| `getMarketplaceBinding` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}` | `project` |
| `disableMarketplaceFunctionBinding` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/disable` | `project` |
| `enableMarketplaceFunctionBinding` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/enable` | `project` |
| `invokeMarketplaceFunctionBinding` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/invoke` | `project` |
| `getMarketplaceBindingTokens` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/tokens` | `project` |
| `disableMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/disable` | `project` |
| `enableMarketplaceIntegration` | `POST` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/enable` | `project` |
| `getMarketplaceFunctionCatalog` | `GET` | `/{version}/code/marketplace/integrations/{IntegrationViewId}/functions` | `project` |
| `getMarketplaceListings` | `GET` | `/{version}/code/marketplace/listings` | `project` |
| `getMarketplaceListingFunctionTokens` | `GET` | `/{version}/code/marketplace/listings/{ListingViewId}/functions/{FunctionKey}/tokens` | `project` |
| `getCodeFunctions` | `GET` | `/{version}/code/functions` | `project` |
| `getCodeFunctionQualifiers` | `GET` | `/{version}/code/functions/qualifiers` | `project` |
| `invokeCodeFunction` | `POST` | `/{version}/code/functions/invoke` | `project` |
| `getCodeFunctionEventSample` | `GET` | `/{version}/code/functions/event-sample` | `project` |
| `getCodeFunctionRuns` | `GET` | `/{version}/code/functions/runs` | `project` |

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
| `getCodeFunctionEventSample` | query: `source` (`database` · `membership` · `files` · `payments` · `ai` · `scheduler` · `manual`), `event?`, `schemaId?` — a sample envelope for a local run |
| `getCodeFunctionRuns` | query: exactly one of `triggerId` / `taskId`, `limit` (1–50, default 20) — the last runs, newest first |

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
