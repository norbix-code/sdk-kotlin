package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Project logs: read and clean the log entries, the log settings, and the
 * logging integrations.
 *
 * Nothing is delivered to a logging integration until its last
 * [testLoggingIntegration] passed — after saving or changing one, test it.
 *
 * Request and response shapes: `GetLogs`, `GetLog`, `CleanLogs`,
 * `GetLogSettings`, `SaveLogSettings`, `*LoggingIntegrationRequest` & co. in
 * `references/hub.dtos.kt`.
 */
class LogsModule(private val transport: Transport) {
    fun disableLogging(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableLogging(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLoggingIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/logs/integrations/test`
     *
     * Tests a logging integration. Send `integrationId`. Only an integration
     * whose last test passed receives log entries.
     */
    fun testLoggingIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/logs/audit`
     *
     * The full request trail of one correlation id, oldest first. Send
     * `targetCorrelationId`.
     */
    fun getLogsByCorrelationId(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/audit",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/logs`
     *
     * Lists the project's log entries, newest first, cursor-paged. Filters
     * (all optional): `level` (Information, Warning, Error), `module`,
     * `logCorrelationId`, `eventCode`, `search`, `metaKey` + `metaValue`,
     * `fromUtc`, `toUtc`; paging: `pageSize`, `startingAfter`, `endingBefore`.
     *
     * Answers `{ list }` — a page of `TenantLogEntryDto`.
     */
    fun getLogs(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/logs/{Id}`
     *
     * Reads one log entry. Send `id` (24 hex characters, from a [getLogs]
     * row). Answers `{ item }` — a `TenantLogEntryDto`.
     */
    fun getLog(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/logs/clean`
     *
     * Permanently deletes every log entry stored in the project's Norbix
     * Logging integration.
     */
    fun cleanLogs(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/clean",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/logs/settings`
     *
     * Reads the project's log settings: `skipCloudDashboardLogs`,
     * `skipHttpBodyMeta`, `aiChatLoggingEnabled`, `hasNorbixLogging`.
     */
    fun getLogSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/logs/settings`
     *
     * Updates the project's log settings. Each flag is optional — not sent =
     * unchanged: `skipCloudDashboardLogs`, `skipHttpBodyMeta`,
     * `aiChatLoggingEnabled`.
     */
    fun saveLogSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/logs/settings",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
