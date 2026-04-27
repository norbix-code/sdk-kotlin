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

enum class Target { API, HUB }
enum class Scope { PROJECT, ACCOUNT, UNAUTHENTICATED }

data class TransportConfig(
    var apiKey: String? = null,
    var bearerToken: String? = null,
    var projectId: String,
    var accountId: String? = null,
    var baseUrlApi: String = "https://api.norbix.dev",
    var baseUrlHub: String = "https://hub.norbix.dev",
    var apiVersion: String = "v2",
    var hubVersion: String = "v2",
    var timeoutMs: Long = 30_000,
    var defaultHeaders: Map<String, String> = emptyMap(),
)

class Transport(
    var config: TransportConfig,
    private val client: HttpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(30)).build(),
    private val gson: Gson = Gson(),
) {
    fun send(
        target: Target,
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

        val baseUrl = if (target == Target.API) config.baseUrlApi else config.baseUrlHub
        val version = if (target == Target.API) config.apiVersion else config.hubVersion
        val built = buildUrlAndBody(baseUrl, path, method, version, request)

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
