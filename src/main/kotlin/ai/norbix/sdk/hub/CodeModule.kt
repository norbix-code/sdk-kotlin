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

}
