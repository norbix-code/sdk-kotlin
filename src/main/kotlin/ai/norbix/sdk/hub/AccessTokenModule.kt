package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class AccessTokenModule(private val transport: Transport) {
    fun getAccessToken(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/access-token",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
