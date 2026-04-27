package dev.norbix.sdk.api

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class AuthModule(private val transport: Transport) {
    fun authenticate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/auth",
        method = "POST",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

}
