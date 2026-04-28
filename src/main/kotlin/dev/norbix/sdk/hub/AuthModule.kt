package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class AuthModule(private val transport: Transport) {
    fun authenticate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/auth",
        method = "POST",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

}
