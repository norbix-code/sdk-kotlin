package dev.norbix.sdk.core

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets
import java.time.Duration

/**
 * Authorization scope of a single request.
 *
 * - [PROJECT]          — needs `apiKey` or `bearerToken` and `X-CM-ProjectId`.
 * - [ACCOUNT]          — also needs `X-CM-AccountId`.
 * - [UNAUTHENTICATED]  — used by login / public endpoints.
 */
enum class Scope { PROJECT, ACCOUNT, UNAUTHENTICATED }

/**
 * Mutable runtime config for [Transport]. One Transport == one base URL,
 * so each top-level client (NorbixApi, NorbixHub) owns its own instance.
 */
data class TransportConfig(
    var apiKey: String? = null,
    var bearerToken: String? = null,
    var projectId: String,
    var accountId: String? = null,
    var baseUrl: String,
    var version: String = "v2",
    var timeoutMs: Long = 30_000,
    var defaultHeaders: Map<String, String> = emptyMap(),
)

class Transport(
    var config: TransportConfig,
    private val client: HttpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofMillis(config.timeoutMs))
        .build(),
    private val gson: Gson = Gson(),
) : AutoCloseable {
    fun send(
        path: String,
        method: String,
        request: Map<String, Any?> = emptyMap(),
        scope: Scope = Scope.PROJECT,
        bearerToken: String? = null,
        timeoutMs: Long? = null,
    ): Any? {
        if (scope == Scope.ACCOUNT && config.accountId.isNullOrBlank()) {
            throw NorbixError(
                code = "NORBIX_ACCOUNT_SCOPE_REQUIRED",
                message = "This endpoint is account-scoped. Configure accountId on the client.",
            )
        }

        val built = buildUrlAndBody(config.baseUrl, path, method, config.version, request)

        val builder = HttpRequest.newBuilder()
            .uri(URI.create(built.url))
            .timeout(Duration.ofMillis(timeoutMs ?: config.timeoutMs))
            .header("Accept", "application/json")
        config.defaultHeaders.forEach { (k, v) -> builder.header(k, v) }

        if (scope != Scope.UNAUTHENTICATED) {
            val token = bearerToken ?: config.bearerToken ?: config.apiKey
            if (token.isNullOrBlank()) {
                throw NorbixError(
                    code = "NORBIX_NOT_AUTHENTICATED",
                    message = "Not authenticated. Set apiKey/bearerToken or login first.",
                )
            }
            builder.header("Authorization", "Bearer $token")
        }

        builder.header("X-CM-ProjectId", config.projectId)
        config.accountId?.let { builder.header("X-CM-AccountId", it) }

        val bodyPublisher = if (built.body == null) {
            HttpRequest.BodyPublishers.noBody()
        } else {
            builder.header("Content-Type", "application/json")
            HttpRequest.BodyPublishers.ofString(gson.toJson(built.body))
        }
        builder.method(method, bodyPublisher)

        val response = try {
            client.send(builder.build(), HttpResponse.BodyHandlers.ofString())
        } catch (ex: Exception) {
            throw NorbixError(code = "NORBIX_NETWORK_ERROR", message = ex.message ?: "Network error")
        }

        if (response.statusCode() >= 400) {
            val parsed = parseJsonObject(response.body())
            throw NorbixError(
                code = parsed["errorCode"]?.toString() ?: "HTTP_${response.statusCode()}",
                status = response.statusCode(),
                message = parsed["message"]?.toString() ?: "Request failed",
                details = parsed,
            )
        }
        if (response.body().isBlank()) return null
        return gson.fromJson(response.body(), Any::class.java)
    }

    override fun close() {
        // java.net.http.HttpClient does not expose close() on JDK 17.
        // Hook kept for future migrations (e.g. OkHttp / Ktor client).
    }

    private fun buildUrlAndBody(
        baseUrl: String,
        path: String,
        method: String,
        version: String,
        request: Map<String, Any?>,
    ): BuiltRequest {
        var normalized = path.replace("{version}", version)
        val consumed = mutableSetOf<String>()
        val tokenRegex = Regex("""\{([^/{}]+)\}""")
        tokenRegex.findAll(normalized).toList().reversed().forEach { match ->
            val token = match.groupValues[1]
            val key = request.keys.firstOrNull { it.equals(token, ignoreCase = true) }
                ?: throw NorbixError(
                    code = "NORBIX_MISSING_PATH_PARAM",
                    message = "Missing path parameter '$token' for $path",
                )
            consumed += key
            normalized = normalized.replace(match.value, request[key].toString())
        }

        val remaining = request.filterKeys { it !in consumed }.filterValues { it != null }
        val root = baseUrl.trimEnd('/')
        val fullPath = if (normalized.startsWith("/")) normalized else "/$normalized"
        val base = "$root$fullPath"

        return if (method == "GET" || method == "DELETE") {
            val query = remaining.entries.flatMap { (k, v) ->
                if (v is List<*>) v.map { "${enc(k)}=${enc(it.toString())}" }
                else listOf("${enc(k)}=${enc(v.toString())}")
            }.joinToString("&")
            BuiltRequest(url = if (query.isBlank()) base else "$base?$query", body = null)
        } else {
            BuiltRequest(url = base, body = if (remaining.isEmpty()) null else remaining)
        }
    }

    private fun parseJsonObject(body: String): Map<String, Any?> {
        if (body.isBlank()) return emptyMap()
        val type = object : TypeToken<Map<String, Any?>>() {}.type
        return runCatching { gson.fromJson<Map<String, Any?>>(body, type) }.getOrDefault(emptyMap())
    }

    private fun enc(value: String): String = URLEncoder.encode(value, StandardCharsets.UTF_8)
}

private data class BuiltRequest(val url: String, val body: Map<String, Any?>?)
