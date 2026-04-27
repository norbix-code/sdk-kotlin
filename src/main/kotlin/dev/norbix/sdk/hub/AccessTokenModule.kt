package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class AccessTokenModule(private val transport: Transport) {
    fun getAccessToken(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/access-token",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
