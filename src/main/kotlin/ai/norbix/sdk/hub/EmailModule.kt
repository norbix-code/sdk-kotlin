package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class EmailModule(private val transport: Transport) {
    fun oneClickUnsubscribe(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/email/one-click-unsubscribe",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
