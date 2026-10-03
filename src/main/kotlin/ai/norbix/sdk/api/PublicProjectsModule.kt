package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Public project routes on the API host — no sign-in needed.
 *
 * The admin portal reads them before anyone signs in. Safety is the answer's
 * shape and the project's own opt-in flags, not the caller's credentials, so
 * — like the public file link — these calls go out with no `Authorization`
 * header even when the client has a key.
 */
class PublicProjectsModule(private val transport: Transport) {

    /**
     * `GET /{version}/public/projects/{ProjectId}/config`
     *
     * The project's public, non-sensitive config for the admin portal: display
     * name, brand, social providers, passkey, and — only when the project opts
     * in — sign-in methods and password policy.
     */
    fun getPublicProjectConfig(projectId: String): Any? = transport.send(
        path = "/{version}/public/projects/{ProjectId}/config",
        method = "GET",
        request = mapOf("ProjectId" to projectId),
        scope = Scope.UNAUTHENTICATED,
    )

    /**
     * `GET /{version}/public/projects/{ProjectId}/legal/{Kind}`
     *
     * One public legal document of the project. When the project does not
     * expose it, the answer has `available = false` — it never says why.
     *
     * @param kind `terms` or `privacy`.
     */
    fun getPublicProjectLegal(projectId: String, kind: String): Any? = transport.send(
        path = "/{version}/public/projects/{ProjectId}/legal/{Kind}",
        method = "GET",
        request = mapOf("ProjectId" to projectId, "Kind" to kind),
        scope = Scope.UNAUTHENTICATED,
    )
}
