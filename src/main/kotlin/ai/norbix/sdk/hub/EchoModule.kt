package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class EchoModule(private val transport: Transport) {
    fun echo(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/echo",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

}
