package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class FilesModule(private val transport: Transport) {
    fun disableFiles(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableFiles(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteFilesTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers/{triggerId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableFilesTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers/{triggerId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableFilesTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers/{triggerId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFilesTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFilesTriggers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveFilesTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/triggers",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFilesIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setFilesIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

}
