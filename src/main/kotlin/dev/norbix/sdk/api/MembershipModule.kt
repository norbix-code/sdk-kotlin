package dev.norbix.sdk.api

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class MembershipModule(private val transport: Transport) {
    fun blockUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/block",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveSystemUserWithPermissions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/service",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveGuestUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/guest",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveUserNameUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/user-name",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/email",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun savePhoneUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/phone",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun savePhoneUserNameWithPermissions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/phone-with-permissions",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailUserNameWithPermissions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/email-with-permissions",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveUserNameWithPermissions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/register/user-name-with-permissions",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getUsers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getUserPreferences(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/{id}/preferences",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun inviteUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/invite",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun assignRolePermissions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/assign-roles",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun unblockUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/unblock",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateUser(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateUserPreferences(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/{id}/preferences",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmEmailVerification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/email/confirm-verification",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun startEmailVerification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/email/start-verification",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun hasPasskey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/has-passkey",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun passkeyLogout(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/logout",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun passkeyAuthenticationOptions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkey/authentication-options",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun passkeyRegistrationOptions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkey/registration-options",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun verifyPasskeyAuthentication(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkey/verify-authentication",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun verifyPasskeyRegistration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkey/verify-registration",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun listPasskeys(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkeys",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun renamePasskey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkeys/{CredentialId}/rename",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun revokePasskey(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/passkeys/{CredentialId}/revoke",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun consumeMagicLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/recovery/magic-link/consume",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun requestMagicLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/recovery/magic-link/request",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun useRecoveryCode(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/recovery/use-code",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun refreshPasskeyToken(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/userauth/token/refresh",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun linkIdentity(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/membership/users/{userId}/link-identity",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
