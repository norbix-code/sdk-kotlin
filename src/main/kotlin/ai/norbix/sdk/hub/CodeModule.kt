package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class CodeModule(private val transport: Transport) {
    fun disableCode(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableCode(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmCodeIntegrationHumanDelivery(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/confirm-human-delivery",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableCodeIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceListings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/listings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceListingFunctionTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/listings/{ListingViewId}/functions/{FunctionKey}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/enable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/disable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunctions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/enable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/disable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunctionTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun invokeMarketplaceFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/functions/{FunctionViewId}/invoke",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceListing(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/listings/{ListingViewId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** GET the stored MCP tool catalog of a connection (route 24): `{"integrationViewId": "int_…"}`. */
    fun getMarketplaceIntegrationTools(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/tools",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** GET the access matrix of a connection (route 25): `{"integrationViewId": "int_…"}`. */
    fun getMarketplaceIntegrationAccess(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/access",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** PUT one package (None, Viewer, FunctionsOnly, ReadOnly, FullAccess) and the Manage flag on a role (route 26): `{"integrationViewId", "roleId", "package", "manage"}`. */
    fun setMarketplaceIntegrationRoleAccess(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/access/roles",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** POST a custom access policy of the connection for one role (route 27): `{"integrationViewId", "roleId", "basePackage", "tools", "functions", "manage", "newPolicyForThisRoleOnly"}`. */
    fun saveMarketplaceIntegrationCustomAccess(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/access/roles/custom",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** POST: start the OAuth sign-in of an MCP connection (route 28): `{"integrationViewId": "int_…"}`; answers `authorizeUrl` (open it in a browser), `redirectUrl`, `expiresAt`. */
    fun startMarketplaceIntegrationSignIn(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/oauth/start",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** POST: sign an MCP connection out of OAuth (route 30): `{"integrationViewId": "int_…"}`; answers `wasSignedIn` and `revoke` (Revoked, NoRevocationEndpoint, Failed or null). */
    fun signOutMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/oauth/sign-out",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun replaceMarketplaceIntegrationSecrets(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun revealMarketplaceIntegrationSecrets(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets/reveal",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setMarketplaceIntegrationTokenMappings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/token-mappings",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunctionCatalog(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/catalog",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunctionRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/functions/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeFunctions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/functions",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeFunctionQualifiers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/functions/qualifiers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun invokeCodeFunction(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/functions/invoke",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeFunctionEventSample(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/functions/event-sample",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getCodeFunctionRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/functions/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    // Workflows (Code.Workflows.md §7). Workflows are in beta; bugs may occur.

    /** Beta: GET — list the project's workflows: `isEnabled?`, `pageSize?`, `startingAfter?`, `endingBefore?` (query). */
    fun getCodeWorkflows(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: PUT — create or update a workflow's draft: `definition` (the workflow definition object, body). */
    fun saveCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — one workflow: `id` (path), `pinnedVersion?` (query). */
    fun getCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: DELETE — delete a workflow: `id` (path). */
    fun deleteCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: PUT — turn one workflow on: `id` (path). */
    fun enableCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: PUT — turn one workflow off: `id` (path). */
    fun disableCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — publish the draft as a new version: `id` (path). */
    fun publishCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/publish",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — the workflow's draft: `id` (path). */
    fun getCodeWorkflowDraft(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/draft",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: DELETE — throw the draft away: `id` (path). */
    fun discardCodeWorkflowDraft(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/draft",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — the published versions: `id` (path). */
    fun getCodeWorkflowVersions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/versions",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — diff of two versions: `id` (path), `fromVersion`, `toVersion` (query). */
    fun getCodeWorkflowVersionDiff(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/versions/diff",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — check a definition without saving it: `definition` (body). */
    fun validateCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/validate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — the JSON Schema of a workflow definition; no fields. */
    fun getCodeWorkflowSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/schema",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: PUT — turn the Workflows feature on for the project; no fields. */
    fun enableCodeWorkflows(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: PUT — turn the Workflows feature off for the project; no fields. */
    fun disableCodeWorkflows(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — start a run: `id` (path), `payload?` (object), `waitSeconds?` (0–30), `runVersion?` (`"draft"` or a version number as a string) (body). */
    fun invokeCodeWorkflow(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/invoke",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — one workflow's runs: `id` (path), `status?`, `from?`, `to?`, `pageSize?`, `startingAfter?`, `endingBefore?` (query). */
    fun getCodeWorkflowRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — runs across workflows (waiting by default): `status?`, `waitingKind?`, `assignee?` (`me` or `usr_…`), `workflowId?`, `key?`, plus paging (query). */
    fun getCodeWorkflowWaitingRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — one run: `runId` (path). */
    fun getCodeWorkflowRun(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — a run's log lines: `runId` (path), `stepId?`, `level?`, plus paging (query). */
    fun getCodeWorkflowRunLogs(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}/logs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — answer a waiting step: `runId` (path), `stepId?`, `decision?` (`approved` | `rejected`), `payload?` (body). */
    fun resumeCodeWorkflowRun(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}/resume",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — answer a waiting step by business key: `id` (path), `key`, `stepId?`, `decision?`, `payload?` (body). */
    fun resumeCodeWorkflowRunByKey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/{Id}/resume",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — retry a failed step: `runId` (path), `stepId?` (body). */
    fun retryCodeWorkflowRunStep(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}/retry",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: POST — cancel a run: `runId` (path), `reason?` (body). */
    fun cancelCodeWorkflowRun(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}/cancel",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Beta: GET — what a one-click resume link will do, nothing changes: `token` (path). The signed token is the key — auth is sent only when the client has one ([Scope.OPTIONAL]). */
    fun openCodeWorkflowResumeLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/resume/{Token}",
        method = "GET",
        request = request,
        scope = Scope.OPTIONAL,
    )

    /** Beta: POST — answer a waiting step with a one-click resume link: `token` (path). The signed token is the key — auth is sent only when the client has one ([Scope.OPTIONAL]). */
    fun useCodeWorkflowResumeLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/resume/{Token}",
        method = "POST",
        request = request,
        scope = Scope.OPTIONAL,
    )
}
