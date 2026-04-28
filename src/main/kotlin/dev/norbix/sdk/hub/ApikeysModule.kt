package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class ApikeysModule(private val transport: Transport) {
    fun getApiKeys(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/apikeys",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun regenerateApiKeys(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/apikeys/regenerate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
