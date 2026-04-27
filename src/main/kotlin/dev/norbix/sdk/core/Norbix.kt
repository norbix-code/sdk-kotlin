package dev.norbix.sdk.core

import dev.norbix.sdk.api.ApiNamespace
import dev.norbix.sdk.hub.HubNamespace

data class LoginCredentials(
    val userName: String,
    val password: String,
    val provider: String = "credentials",
)

class Norbix(
    projectId: String? = null,
    apiKey: String? = null,
    bearerToken: String? = null,
    accountId: String? = null,
    baseUrlApi: String = "https://api.norbix.dev",
    baseUrlHub: String = "https://hub.norbix.dev",
    apiVersion: String = "v2",
    hubVersion: String = "v2",
    timeoutMs: Long = 30_000,
    defaultHeaders: Map<String, String> = emptyMap(),
) {
    val transport: Transport
    val api: ApiNamespace
    val hub: HubNamespace

    init {
        val env = System.getenv()
        val resolvedProject = projectId ?: env["NORBIX_PROJECT_ID"]
            ?: throw IllegalArgumentException("Norbix: projectId is required.")
        transport = Transport(
            TransportConfig(
                apiKey = apiKey ?: env["NORBIX_API_KEY"],
                bearerToken = bearerToken ?: env["NORBIX_BEARER_TOKEN"],
                projectId = resolvedProject,
                accountId = accountId ?: env["NORBIX_ACCOUNT_ID"],
                baseUrlApi = env["NORBIX_API_URL"] ?: baseUrlApi,
                baseUrlHub = env["NORBIX_HUB_URL"] ?: baseUrlHub,
                apiVersion = env["NORBIX_API_VERSION"] ?: apiVersion,
                hubVersion = env["NORBIX_HUB_VERSION"] ?: hubVersion,
                timeoutMs = timeoutMs,
                defaultHeaders = defaultHeaders,
            ),
        )
        api = ApiNamespace(transport)
        hub = HubNamespace(transport)
    }

    fun login(credentials: LoginCredentials): Map<String, Any?> {
        val res = transport.send(
            target = Target.API,
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

    fun logout() {
        transport.config.bearerToken = null
    }

    fun setBearerToken(token: String?) {
        transport.config.bearerToken = token
    }

    fun setApiKey(apiKey: String?) {
        transport.config.apiKey = apiKey
    }

    fun setScope(projectId: String, accountId: String? = null) {
        transport.config.projectId = projectId
        transport.config.accountId = accountId
    }

    fun isAuthenticated(): Boolean = !transport.config.bearerToken.isNullOrBlank() || !transport.config.apiKey.isNullOrBlank()
}
