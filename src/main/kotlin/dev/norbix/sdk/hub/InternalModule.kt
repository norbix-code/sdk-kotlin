package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class InternalModule(private val transport: Transport) {
    fun internalsTypeGen(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/internal/_typegen",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

}
