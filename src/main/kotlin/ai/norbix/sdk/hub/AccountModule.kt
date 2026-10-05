package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport
import com.google.gson.Gson

class AccountModule(private val transport: Transport) {
    fun getAccountProfile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/profile",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateAccountProfile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/profile",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * The signed-in team member's (or owner's) own record — not the
     * organisation's profile ([getAccountProfile]). The answer carries `item`;
     * `item.generalInfo.phone` is the number "Account users" SMS campaigns send to.
     */
    fun getMyAccountUserProfile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/me",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * Saves or clears the signed-in team member's own phone number: pass
     * `mapOf("phone" to "+37060000000")` (E.164 — `+`, the country code, then
     * digits); an empty or missing `phone` clears it. There is no user id: the
     * user is always the caller. Members without a phone are skipped by
     * "Account users" SMS campaigns.
     */
    fun updateMyAccountUserPhone(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/me/phone",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun resendAccountVerificationToken(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/verify/resend",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getAccountStatus(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/status",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createStripeCheckoutSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/stripe/create-checkout-session",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getStripeBillingPortalUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/stripe/get-portal-url",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * Accepts a team invitation. The gateway route is anonymous (no
     * `[Authenticate]`): the invited person has no token yet, so no
     * `Authorization` header is sent and no `accountId` is needed.
     */
    fun createTeamMemberFromInvitation(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/team/member",
        method = "POST",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

    /**
     * Confirms the account from the verification email link. The gateway
     * route is anonymous (no `[Authenticate]`) and reads the account id from
     * the request, not from the session or a header: pass `accountId` and
     * `token` from the email — they go in the query. The client needs no token
     * and no `accountId` of its own.
     */
    fun verifyAccount(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/verify",
        method = "GET",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

    fun deleteNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteNotificationsTag(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/tag",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun removeTagFromNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group/tag",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveNotificationsTag(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/tag",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getProjects(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Lists the Norbix regions. Anonymous on the gateway: no token, no `accountId`. */
    fun getAccountRegions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/regions",
        method = "GET",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

    fun getProjectTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectAccentColor(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/accent-color",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectIcon(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/icon",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectLogo(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/logo",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectMainColor(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/main-color",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectAllowedOrigins(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/origins",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectDefaultLanguage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/default-language",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectDescription(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/description",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectLanguages(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/languages",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/url",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectName(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/name",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectRegions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/regions",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /** Sign-up. Anonymous on the gateway: no token, no `accountId`. */
    fun createAccount(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account",
        method = "POST",
        request = request,
        scope = Scope.UNAUTHENTICATED,
    )

    fun getAccountCollaborators(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/collaborators",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun sendInviteToTeamMember(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/team/member/invite",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getLicenses(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/licenses",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getProjectAiSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectAiSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/settings",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createProjectAiAssistant(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/assistants",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateProjectAiAssistant(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/assistants/{assistantId}",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteProjectAiAssistant(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/assistants/{assistantId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getProjectAiUsage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/ai/usage",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setAdminPortalEnabled(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/admin-portal/enabled",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PATCH /{version}/account/projects/{projectId}/settings/admin-url`
     *
     * Set or clear the project's admin portal URL: `mapOf("projectId" to id, "url" to "https://admin.example.com")` (`null` clears it).
     */
    fun updateProjectAdminUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/admin-url",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PATCH /{version}/account/projects/{projectId}/settings/legal`
     *
     * Save the project's terms and privacy texts (Markdown): keys `termsMarkdown`, `privacyMarkdown`.
     */
    fun updateProjectLegalDocuments(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/legal",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PATCH /{version}/account/projects/{projectId}/settings/legal/expose`
     *
     * Show or hide the legal documents on the public project routes: key `exposed` (Boolean).
     */
    fun updateProjectExposeLegal(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/legal/expose",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PATCH /{version}/account/projects/{projectId}/settings/brand/expose`
     *
     * Show or hide the project brand (logo, colours) in the Admin Portal: key `exposed` (Boolean).
     */
    fun updateProjectExposeBrand(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/brand/expose",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PATCH /{version}/account/projects/{projectId}/settings/auth/expose`
     *
     * Show or hide the sign-in settings (auth flows) in the Admin Portal: key `exposed` (Boolean).
     */
    fun updateProjectExposeAuth(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/auth/expose",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/account/projects/{projectId}/admin-portal/structure`
     *
     * The admin portal's structure for the project.
     */
    fun getAdminPortalStructure(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/admin-portal/structure",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PUT /{version}/account/projects/{projectId}/settings/admin-portal/service-user`
     *
     * Choose the AI service user the admin portal acts as: key `serviceUserId`.
     */
    fun assignAdminPortalServiceUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/admin-portal/service-user",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/account/ai/service-users`
     *
     * Create an AI service user (a scoped key for MCP and AI tools): keys `name`, `scope`. The answer holds the key once — store it.
     */
    fun createAiServiceUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/ai/service-users",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/account/ai/service-users`
     *
     * List the account's AI service users and their keys (no secrets).
     */
    fun listAiServiceUsers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/ai/service-users",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/account/ai/service-users/{Id}/keys`
     *
     * Issue a new key for service user `Id`; optional `revokeKeyId` revokes an old key in the same call.
     */
    fun rotateAiServiceUserKey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/ai/service-users/{Id}/keys",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `DELETE /{version}/account/ai/service-users/{Id}/keys/{KeyId}`
     *
     * Revoke key `KeyId` of service user `Id`.
     */
    fun revokeAiServiceUserKey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/ai/service-users/{Id}/keys/{KeyId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `DELETE /{version}/account/ai/service-users/{Id}`
     *
     * Delete service user `Id` and all its keys.
     */
    fun deleteAiServiceUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/ai/service-users/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/account/mcp`
     *
     * Developer MCP endpoint (Streamable HTTP, MCP revision 2025-11-25): send
     * one JSON-RPC 2.0 [message] (`initialize`, `tools/list`, `tools/call`, ...).
     * The `initialize` answer carries the session id in [McpResponse.sessionId];
     * pass it as [sessionId] on every later call. The answer is JSON
     * ([McpResponse.json]) or, for a `tools/call`, an SSE stream
     * ([McpResponse.body]). [toolsets] filters `tools/list`, e.g.
     * `ai:campaigns,ai:project-context`. An AI service user key (`nbsu_...`) as
     * the client's key narrows the tools to that user's scope.
     */
    fun sendMcpMessage(
        message: Map<String, Any?>,
        sessionId: String? = null,
        protocolVersion: String? = null,
        toolsets: String? = null,
    ): McpResponse = McpResponse(
        transport.sendRaw(
            path = "/{version}/account/mcp",
            method = "POST",
            body = gson.toJson(message),
            query = if (toolsets == null) emptyMap() else mapOf("toolsets" to toolsets),
            headers = mcpHeaders(sessionId, protocolVersion, null),
            scope = Scope.PROJECT,
            accept = "application/json, text/event-stream",
        ),
    )

    /**
     * `GET /{version}/account/mcp`
     *
     * Open the server-to-client SSE stream of the session [sessionId];
     * [lastEventId] resumes a dropped stream. This SDK has no SSE client: the
     * call returns only when the server closes the stream, with the raw SSE
     * text in [McpResponse.body].
     */
    fun openMcpStream(sessionId: String, lastEventId: String? = null): McpResponse = McpResponse(
        transport.sendRaw(
            path = "/{version}/account/mcp",
            method = "GET",
            headers = mcpHeaders(sessionId, null, lastEventId),
            scope = Scope.PROJECT,
            accept = "text/event-stream",
        ),
    )

    /**
     * `DELETE /{version}/account/mcp`
     *
     * End the MCP session [sessionId].
     */
    fun endMcpSession(sessionId: String): McpResponse = McpResponse(
        transport.sendRaw(
            path = "/{version}/account/mcp",
            method = "DELETE",
            headers = mcpHeaders(sessionId, null, null),
            scope = Scope.PROJECT,
        ),
    )

    private val gson = Gson()

    private fun mcpHeaders(sessionId: String?, protocolVersion: String?, lastEventId: String?): Map<String, String> =
        buildMap {
            sessionId?.let { put("Mcp-Session-Id", it) }
            protocolVersion?.let { put("MCP-Protocol-Version", it) }
            lastEventId?.let { put("Last-Event-ID", it) }
        }
}
