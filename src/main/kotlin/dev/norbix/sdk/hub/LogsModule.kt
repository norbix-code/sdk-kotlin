package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class LogsModule(private val transport: Transport) {
    fun disableLogging(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableLogging(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLoggingIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/logs/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
