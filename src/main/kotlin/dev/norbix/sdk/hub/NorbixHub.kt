package dev.norbix.sdk.hub

import dev.norbix.sdk.core.LoginCredentials
import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport
import dev.norbix.sdk.core.TransportConfig

/**
 * Top-level client for the Norbix **Hub** plane (project/account configuration).
 *
 * Modules are exposed as flat fields, so call sites read like:
 *
 * ```kotlin
 * val hub = NorbixHub(apiKey = "sk_live_xxx", projectId = "proj_123", accountId = "acc_456")
 * val schemas  = hub.database.getDatabaseSchemas()
 * val profile  = hub.account.getAccountProfile()
 * ```
 *
 * Defaults connect to `https://hub.norbix.ai`. Override [baseUrl] (or set the
 * `NORBIX_HUB_URL` env var) when self-hosting, e.g. `https://hub.norbix.isidos.lt`
 * or `http://localhost:5001`.
 *
 * Construction order for every option: explicit constructor argument
 * → `NORBIX_*` env var → built-in default.
 *
 * The internal type-gen module is exposed as [system] (the Hub path
 * `/internal/_typegen` collides with Kotlin's `internal` keyword as a field name).
 */
class NorbixHub(
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
    val account: AccountModule
    val ai: AiModule
    val apikeys: ApikeysModule
    val auth: AuthModule
    val database: DatabaseModule
    val echo: EchoModule
    val email: EmailModule
    val files: FilesModule
    val system: InternalModule
    val logs: LogsModule
    val membership: MembershipModule
    val notifications: NotificationsModule
    val payments: PaymentsModule
    val scheduler: SchedulerModule
    val webhooks: WebhooksModule

    init {
        val env = System.getenv()
        val resolvedProject = projectId ?: env["NORBIX_PROJECT_ID"]
            ?: throw IllegalArgumentException("NorbixHub: projectId is required (pass it or set NORBIX_PROJECT_ID).")

        transport = Transport(
            TransportConfig(
                apiKey = apiKey ?: env["NORBIX_API_KEY"],
                bearerToken = bearerToken ?: env["NORBIX_BEARER_TOKEN"],
                projectId = resolvedProject,
                accountId = accountId ?: env["NORBIX_ACCOUNT_ID"],
                baseUrl = env["NORBIX_HUB_URL"] ?: baseUrl,
                version = env["NORBIX_HUB_VERSION"] ?: version,
                timeoutMs = timeoutMs,
                defaultHeaders = defaultHeaders,
            ),
        )

        accessToken = AccessTokenModule(transport)
        account = AccountModule(transport)
        ai = AiModule(transport)
        apikeys = ApikeysModule(transport)
        auth = AuthModule(transport)
        database = DatabaseModule(transport)
        echo = EchoModule(transport)
        email = EmailModule(transport)
        files = FilesModule(transport)
        system = InternalModule(transport)
        logs = LogsModule(transport)
        membership = MembershipModule(transport)
        notifications = NotificationsModule(transport)
        payments = PaymentsModule(transport)
        scheduler = SchedulerModule(transport)
        webhooks = WebhooksModule(transport)
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
        const val DEFAULT_BASE_URL: String = "https://hub.norbix.ai"
        const val DEFAULT_VERSION: String = "v2"
    }
}
