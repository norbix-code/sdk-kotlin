package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class InternalModule(private val transport: Transport) {
    fun internalsTypeGen(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/internal/_typegen",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

}
