package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class SchedulerModule(private val transport: Transport) {
    fun disableScheduler(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableScheduler(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteSchedulerTask(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableSchedulerTask(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableSchedulerTask(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSchedulerTask(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSchedulerTasks(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveSchedulerTask(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/scheduler/tasks",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
