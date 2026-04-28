package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class WebhooksModule(private val transport: Transport) {
    fun getWebhookIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/integration",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun revealWebhookIntegrationSecret(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/integration/secret",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun rotateWebhookIntegrationSecret(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/integration/secret/rotate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateWebhookIntegrationExtraHeaders(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/integration/extra-headers",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableWebhookDestination(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/destinations/{DestinationId}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableWebhookDestination(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/destinations/{DestinationId}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun removeWebhookDestination(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/destinations/{DestinationId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveWebhookDestination(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/webhooks/destinations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
