package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class EmailModule(private val transport: Transport) {
    fun oneClickUnsubscribe(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/email/one-click-unsubscribe",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
