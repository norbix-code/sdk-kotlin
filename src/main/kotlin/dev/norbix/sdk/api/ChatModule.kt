package dev.norbix.sdk.api

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class ChatModule(private val transport: Transport) {
    fun askChat(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/chat/complete",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
