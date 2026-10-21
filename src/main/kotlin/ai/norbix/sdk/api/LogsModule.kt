package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Project logs on the data plane: write your app's own log lines into the
 * project's Logs.
 *
 * Request and response shapes: `WriteLogs`, `WriteLogEntry`,
 * `WriteLogsResponse` in `references/api.dtos.kt`.
 */
class LogsModule(private val transport: Transport) {
    /**
     * `POST /{version}/logs`
     *
     * Writes 1–100 log entries. Send `entries`, a list of maps:
     * `level?` (`information` default, `warning`, `error`), `title`
     * (1–200 characters), `message?` (at most 8 000), `eventCode?` (lower case
     * letters, digits and `_ . : -`, at most 64; stored as `app:<code>`),
     * `correlationId?` (at most 64 letters, digits, `_` or `-`), `timestamp?`
     * (UTC, at most 7 days old and 5 minutes ahead), `meta?` (a string map, at
     * most 20 keys).
     *
     * Answers `{ accepted }`. The call returns at once: the entries are
     * queued, not yet stored.
     *
     * Refusals throw [ai.norbix.sdk.core.NorbixError]: 400 for a broken entry,
     * 400 `CM-ERRORS-LOGGING-002` when the Logs module is off, and 429
     * `CM-ERRORS-LOGGING-003` when the project's per-minute quota is used up.
     * The gateway sends a `Retry-After` header (seconds) with the 429; this SDK
     * does not surface response headers on errors yet, so wait about a minute
     * before sending again.
     */
    fun writeLogs(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )
}
