package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class AccountModule(private val transport: Transport) {
    fun getAccountProfile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/profile",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateAccountProfile(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/profile",
        method = "PUT",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun resendAccountVerificationToken(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/verify/resend",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getAccountStatus(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/status",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun createStripeCheckoutSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/stripe/create-checkout-session",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getStripeBillingPortalUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/stripe/get-portal-url",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun createTeamMemberFromInvitation(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/team/member",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun verifyAccount(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/verify",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun deleteNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group",
        method = "DELETE",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun deleteNotificationsTag(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/tag",
        method = "DELETE",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun removeTagFromNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group/tag",
        method = "DELETE",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun saveNotificationsGroup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/group",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun saveNotificationsTag(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/notifications/settings/tag",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun createProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun deleteProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}",
        method = "DELETE",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getProjects(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getAccountRegions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/regions",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getProjectTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/tokens",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectAccentColor(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/accent-color",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectIcon(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/icon",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectLogo(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/logo",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectMainColor(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/main-color",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectAllowedOrigins(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/origins",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectDefaultLanguage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/default-language",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectDescription(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/description",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun disableProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun enableProject(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectLanguages(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/languages",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectUrl(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/url",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectName(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/name",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun updateProjectRegions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/regions",
        method = "PATCH",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun createAccount(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getAccountCollaborators(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/collaborators",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun sendInviteToTeamMember(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/team/member/invite",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun getLicenses(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/licenses",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun askChat(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/account/chat/complete",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

}
