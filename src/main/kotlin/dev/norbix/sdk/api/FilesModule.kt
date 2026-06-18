package dev.norbix.sdk.api

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class FilesModule(private val transport: Transport) {
    fun deleteFileApi(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun listFiles(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteManyFilesApi(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/bulk",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun commitUpload(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/commit",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun downloadFileApi(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/download",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFileInfo(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/info",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSignedUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/sign",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun requestUploadUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/{filesIntegrationId}/upload-url",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
