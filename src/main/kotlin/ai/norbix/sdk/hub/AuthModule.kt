package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class AuthModule(private val transport: Transport) {
    fun authenticate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/auth",
        method = "POST",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

}
