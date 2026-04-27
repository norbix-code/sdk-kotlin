package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class MembershipModule(private val transport: Transport) {
    fun disableMembership(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMembership(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMembershipTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers/{triggerId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMembershipTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers/{triggerId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMembershipTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers/{triggerId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMembershipTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMembershipTriggers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMembershipTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/triggers",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createRole(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/roles",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteRole(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/roles",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getRole(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/roles/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getRoles(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/roles",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateRolePolicies(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/roles",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createPolicy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/policies",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePolicy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/policies",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPolicy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/policies/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPolicies(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/policies",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updatePolicy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/policies",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMembershipIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableMembershipIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableMembershipIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMembershipIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMembershipIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveMembershipIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setMembershipIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/membership/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

}
