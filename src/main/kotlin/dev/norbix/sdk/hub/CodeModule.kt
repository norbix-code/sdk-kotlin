package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class CodeModule(private val transport: Transport) {
    fun disableCode(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableCode(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/enable",
        method = "GET",
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

    fun setCodeIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/integrations/{Id}/default",
        method = "PUT",
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

    fun getMarketplaceIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations",
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

    fun getMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceBindings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMarketplaceFunctionBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMarketplaceFunctionBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMarketplaceFunctionBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/disable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMarketplaceFunctionBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/enable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun invokeMarketplaceFunctionBinding(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/invoke",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceBindingTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/bindings/{BindingViewId}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/disable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMarketplaceIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/enable",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMarketplaceFunctionCatalog(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/marketplace/integrations/{IntegrationViewId}/functions",
        method = "GET",
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

}
