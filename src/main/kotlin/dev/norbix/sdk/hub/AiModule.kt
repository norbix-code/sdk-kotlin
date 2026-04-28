package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class AiModule(private val transport: Transport) {
    fun deleteLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLlmIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testLlmIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/llms/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMcpIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testMcpIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/integrations/mcp/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
