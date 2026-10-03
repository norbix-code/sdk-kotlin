package ai.norbix.sdk.hub

import ai.norbix.sdk.core.RawResponse
import com.google.gson.Gson

/**
 * The answer of the developer MCP endpoint (`/{version}/account/mcp`).
 *
 * MCP is not a plain JSON API: `initialize` hands out the session id in the
 * `Mcp-Session-Id` answer header, a `tools/call` may answer with an SSE
 * stream, and a notification answers `202` with no body. So the SDK keeps the
 * whole answer instead of only a parsed body.
 */
class McpResponse(val raw: RawResponse) {
    /** HTTP status: 200 with a body, 202 for an accepted notification. */
    val statusCode: Int get() = raw.statusCode

    /** The `Mcp-Session-Id` header — set on the `initialize` answer. Pass it back as `sessionId`. */
    val sessionId: String? get() = raw.header("Mcp-Session-Id")

    /** The answer's content type: `application/json` or `text/event-stream`. */
    val contentType: String? get() = raw.header("Content-Type")

    /** True when the server answered with an SSE stream. */
    val isEventStream: Boolean get() = contentType?.contains("text/event-stream", ignoreCase = true) == true

    /** The raw body: JSON-RPC JSON, or SSE text (`event:` / `data:` lines). */
    val body: String get() = raw.body

    /** The JSON-RPC message when the body is JSON; null for SSE or no body. */
    val json: Any?
        get() = if (isEventStream || raw.body.isBlank()) null
        else runCatching { Gson().fromJson(raw.body, Any::class.java) }.getOrNull()
}
