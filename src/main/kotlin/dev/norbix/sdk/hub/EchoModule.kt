package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class EchoModule(private val transport: Transport) {
    fun echo(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/echo",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

}
