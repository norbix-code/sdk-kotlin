package dev.norbix.sdk.api

import dev.norbix.sdk.core.LoginCredentials
import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport
import dev.norbix.sdk.core.TransportConfig

/**
 * Top-level client for the Norbix **API** plane (project-scoped data).
 *
 * Modules are exposed as flat fields, so call sites read like:
 *
 * ```kotlin
 * val api = NorbixApi(apiKey = "sk_live_xxx", projectId = "proj_123")
 * val orders = api.database.find(mapOf("collectionName" to "orders", "take" to 20))
 * val auth   = api.login(LoginCredentials("alice@team.io", "secret"))
 * ```
 *
 * Defaults connect to `https://api.norbix.ai`. Override [baseUrl] (or set the
 * `NORBIX_API_URL` env var) when self-hosting, e.g. `https://api.norbix.isidos.lt`
 * or `http://localhost:5000`.
 *
 * Construction order for every option: explicit constructor argument
 * → `NORBIX_*` env var → built-in default.
 */
class NorbixApi(
    projectId: String? = null,
    apiKey: String? = null,
    bearerToken: String? = null,
    accountId: String? = null,
    baseUrl: String = DEFAULT_BASE_URL,
    version: String = DEFAULT_VERSION,
    timeoutMs: Long = 30_000,
    defaultHeaders: Map<String, String> = emptyMap(),
) : AutoCloseable {

    val transport: Transport
    val accessToken: AccessTokenModule
    val apikeys: ApikeysModule
    val auth: AuthModule
    val chat: ChatModule
    val database: DatabaseModule
    val echo: EchoModule
    val membership: MembershipModule

    init {
        val env = System.getenv()
        val resolvedProject = projectId ?: env["NORBIX_PROJECT_ID"]
            ?: throw IllegalArgumentException("NorbixApi: projectId is required (pass it or set NORBIX_PROJECT_ID).")

        transport = Transport(
            TransportConfig(
                apiKey = apiKey ?: env["NORBIX_API_KEY"],
                bearerToken = bearerToken ?: env["NORBIX_BEARER_TOKEN"],
                projectId = resolvedProject,
                accountId = accountId ?: env["NORBIX_ACCOUNT_ID"],
                baseUrl = env["NORBIX_API_URL"] ?: baseUrl,
                version = env["NORBIX_API_VERSION"] ?: version,
                timeoutMs = timeoutMs,
                defaultHeaders = defaultHeaders,
            ),
        )

        accessToken = AccessTokenModule(transport)
        apikeys = ApikeysModule(transport)
        auth = AuthModule(transport)
        chat = ChatModule(transport)
        database = DatabaseModule(transport)
        echo = EchoModule(transport)
        membership = MembershipModule(transport)
    }

    /** Username/password login. On success the bearer token is stored on the client. */
    fun login(credentials: LoginCredentials): Map<String, Any?> {
        @Suppress("UNCHECKED_CAST")
        val res = transport.send(
            path = "/auth",
            method = "POST",
            request = mapOf(
                "userName" to credentials.userName,
                "password" to credentials.password,
                "provider" to credentials.provider,
            ),
            scope = Scope.UNAUTHENTICATED,
        ) as? Map<String, Any?> ?: emptyMap()
        val token = res["bearerToken"] as? String
        if (!token.isNullOrBlank()) transport.config.bearerToken = token
        return res
    }

    fun logout() { transport.config.bearerToken = null }
    fun setBearerToken(token: String?) { transport.config.bearerToken = token }
    fun setApiKey(apiKey: String?) { transport.config.apiKey = apiKey }
    fun setAccountId(accountId: String?) { transport.config.accountId = accountId }
    fun isAuthenticated(): Boolean =
        !transport.config.bearerToken.isNullOrBlank() || !transport.config.apiKey.isNullOrBlank()

    override fun close() { transport.close() }

    companion object {
        const val DEFAULT_BASE_URL: String = "https://api.norbix.ai"
        const val DEFAULT_VERSION: String = "v2"
    }
}
