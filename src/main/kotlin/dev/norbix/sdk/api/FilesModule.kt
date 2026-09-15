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

    /**
     * `GET /{version}/files/public/{PublicId}/{Name*}`
     *
     * Reads a file somebody made public from the Hub side (`makeFilePublic` /
     * `makeFolderPublic`).
     *
     * **No sign-in.** This is the one call in the SDK that deliberately goes
     * out with no `Authorization` header, because the link has to work in an
     * e-mail, in an `<img src>`, or in a browser on a stranger's phone. The
     * unguessable `nbpf_…` id is the whole credential.
     *
     * Answers with the file's raw bytes. When the storage provider can sign
     * its own links (Amazon S3, Azure Blob, Google Cloud Storage) the gateway
     * replies `302` and the HTTP client follows it, so the bytes come straight
     * from the provider and never pass through Norbix.
     *
     * Every miss — unknown id, wrong name, made private again, file gone — is
     * the same plain `404`. That is deliberate: a more precise answer would
     * tell a stranger that the file exists.
     *
     * @param publicId the `nbpf_…` id from the link.
     * @param name what follows the id: the file's name for a file link, or the
     *   path inside the folder for a folder link (`2026/q1/report.pdf`). Its
     *   slashes stay slashes.
     */
    fun getPublicFile(publicId: String, name: String): ByteArray = transport.sendBytes(
        path = "/{version}/files/public/{PublicId}/{Name*}",
        method = "GET",
        request = mapOf("PublicId" to publicId, "Name" to name),
        scope = Scope.UNAUTHENTICATED,
    )

}
