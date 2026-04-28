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

}
