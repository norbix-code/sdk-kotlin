package ai.norbix.sdk.api

import ai.norbix.sdk.core.LoginCredentials
import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport
import ai.norbix.sdk.core.TransportConfig
import ai.norbix.sdk.core.composeRegionalUrl
import ai.norbix.sdk.core.projectHostLabel

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
 * Defaults connect to `https://api.norbix.ai`; on that default every call goes
 * to the project's own host, `https://pr-<32 hex>.api.norbix.ai` (see
 * [projectHostLabel]). Override [baseUrl] (or set the `NORBIX_API_URL` env var)
 * for a custom domain, e.g. `https://api.norbix.isidos.lt` or
 * `http://localhost:5000` — a custom address is used as given.
 *
 * Construction order for every option: explicit constructor argument
 * → `NORBIX_*` env var → built-in default.
 */
class NorbixApi(
    projectId: String? = null,
    apiKey: String? = null,
    bearerToken: String? = null,
    accountId: String? = null,
    env: String? = null,
    region: String? = null,
    language: String? = null,
    baseUrl: String = DEFAULT_BASE_URL,
    version: String = DEFAULT_VERSION,
    timeoutMs: Long = 30_000,
    defaultHeaders: Map<String, String> = emptyMap(),
) : AutoCloseable {

    val transport: Transport
    val accessToken: AccessTokenModule
    val ai: AiModule
    val apikeys: ApikeysModule
    val auth: AuthModule
    val code: CodeModule
    val database: DatabaseModule
    val echo: EchoModule
    val files: FilesModule
    val logs: LogsModule
    val membership: MembershipModule
    val payments: PaymentsModule
    val publicProjects: PublicProjectsModule

    /** True when the client owns the base URL (the SDK default) and may compose the project's or a regional variant of it. */
    private val managedBaseUrl: Boolean

    init {
        val sysEnv = System.getenv()
        val resolvedProject = projectId ?: sysEnv["NORBIX_PROJECT_ID"]
            ?: throw IllegalArgumentException("NorbixApi: projectId is required (pass it or set NORBIX_PROJECT_ID).")

        val resolvedRegion = (region ?: sysEnv["NORBIX_REGION"])?.takeIf { it.isNotBlank() }
        val resolvedBaseUrl = sysEnv["NORBIX_API_URL"] ?: baseUrl
        // The project host and the regional base URL are composed only from
        // the SDK default; a user-supplied custom base URL is never rewritten.
        managedBaseUrl = resolvedBaseUrl == DEFAULT_BASE_URL

        transport = Transport(
            TransportConfig(
                apiKey = apiKey ?: sysEnv["NORBIX_API_KEY"],
                bearerToken = bearerToken ?: sysEnv["NORBIX_BEARER_TOKEN"],
                projectId = resolvedProject,
                accountId = accountId ?: sysEnv["NORBIX_ACCOUNT_ID"],
                env = env ?: sysEnv["NORBIX_ENV"] ?: "PROD",
                region = resolvedRegion,
                language = (language ?: sysEnv["NORBIX_LANGUAGE"])?.takeIf { it.isNotBlank() },
                baseUrl = if (managedBaseUrl) regionalBaseUrl(resolvedRegion) else resolvedBaseUrl,
                version = sysEnv["NORBIX_API_VERSION"] ?: version,
                timeoutMs = timeoutMs,
                defaultHeaders = defaultHeaders,
                projectHostBaseUrl = if (managedBaseUrl) DEFAULT_BASE_URL else null,
            ),
        )

        accessToken = AccessTokenModule(transport)
        ai = AiModule(transport)
        apikeys = ApikeysModule(transport)
        auth = AuthModule(transport)
        code = CodeModule(transport)
        database = DatabaseModule(transport)
        echo = EchoModule(transport)
        files = FilesModule(transport)
        logs = LogsModule(transport)
        membership = MembershipModule(transport)
        payments = PaymentsModule(transport)
        publicProjects = PublicProjectsModule(transport)
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

    /** Switch the project environment for subsequent requests (norbix-env header). Pass "PROD"/null for production. */
    fun setEnv(env: String?) { transport.config.env = if (env.isNullOrBlank()) "PROD" else env }

    /** Current project environment the client targets (defaults to "PROD"). */
    fun getEnv(): String = transport.config.env

    /**
     * Switch the Norbix region for subsequent requests (nb-region header).
     * Pass null/blank to unset. Calls of a project keep going to the project's
     * own host, which carries no region label. For a project id that does not
     * decode, on the SDK default base URL, the regional URL is (re)composed
     * under the same rule as construction; a custom base URL is never rewritten.
     */
    fun setRegion(region: String?) {
        val resolved = region?.takeIf { it.isNotBlank() }
        transport.config.region = resolved
        if (managedBaseUrl) transport.config.baseUrl = regionalBaseUrl(resolved)
    }

    /** Current Norbix region the client targets, or null when unset. */
    fun getRegion(): String? = transport.config.region

    /**
     * Switch the language for subsequent requests, sent as the standard
     * `Accept-Language` header (e.g. "lt" or "lt-LT, en;q=0.8"). Pass
     * null/blank to unset: no header is sent and the gateway answers in the
     * project's default language. The base URL is never touched.
     */
    fun setLanguage(language: String?) {
        transport.config.language = language?.takeIf { it.isNotBlank() }
    }

    /** Current language (`Accept-Language` value) the client asks for, or null when unset. */
    fun getLanguage(): String? = transport.config.language

    /**
     * The base URL calls go to right now: the project's own host
     * (`https://pr-<32 hex>.api.norbix.ai`) on the SDK default address, else
     * the shared, regional or custom base URL.
     */
    fun getBaseUrl(): String = transport.requestBaseUrl()

    fun isAuthenticated(): Boolean =
        !transport.config.bearerToken.isNullOrBlank() || !transport.config.apiKey.isNullOrBlank()

    override fun close() { transport.close() }

    companion object {
        const val DEFAULT_BASE_URL: String = "https://api.norbix.ai"
        const val DEFAULT_VERSION: String = "v3"

        /** `https://{region}.api.norbix.ai` for a region, or the plain default when unset. */
        internal fun regionalBaseUrl(region: String?): String = composeRegionalUrl(region, DEFAULT_BASE_URL)
    }
}
