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

    fun getFolderFiles(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/folder",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getFile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/item",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/files/integrations/test`
     *
     * Tries the credentials of a files integration against the storage
     * provider and answers whether they work. Nothing is saved — call it
     * before [saveFilesIntegration] to tell a bad key from a bad bucket.
     */
    fun testFilesIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/files/item/public`
     *
     * Makes one file readable by anyone holding its link. Answers with the
     * `nbpf_…` public id; the link itself arrives on the file's `publicUrl`
     * the next time you read the file. Send `filesIntegrationId` and `path`.
     */
    fun makeFilePublic(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/item/public",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/files/item/private`
     *
     * Takes a file's public link away. It is refused while a folder above the
     * file is public — switch the folder off with [makeFolderPrivate] instead.
     */
    fun makeFilePrivate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/item/private",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/files/folder/public`
     *
     * Publishes a whole folder prefix — one record, however many files sit
     * under it, at any depth. The root cannot be published.
     */
    fun makeFolderPublic(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/folder/public",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/files/folder/private`
     *
     * Takes back every link inside the folder, including per-file ones.
     */
    fun makeFolderPrivate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/files/folder/private",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
