package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/** Trigger endpoints that span every module. Saving a trigger stays on its own module. */
class TriggersModule(private val transport: Transport) {
    /** What an identity lacks for a `triggerType` and `action`. Nothing is saved. */
    fun checkTriggerExecutionIdentity(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/triggers/execution-identity/check",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** One trigger's runs, newest first: `triggerType`, `triggerId`, optional `status`, paging. */
    fun getTriggerRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/triggers/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** One run: `id` (trr_…) and `triggerType`, which is required. */
    fun getTriggerRun(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/triggers/runs/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )
}
