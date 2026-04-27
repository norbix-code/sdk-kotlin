package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class PaymentsModule(private val transport: Transport) {
    fun disablePayments(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enablePayments(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePaymentsTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers/{triggerId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disablePaymentsTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers/{triggerId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enablePaymentsTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers/{triggerId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPaymentsTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPaymentsTriggers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun savePaymentsTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/triggers",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmPaymentsIntegrationHumanDelivery(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/confirm-human-delivery",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disablePaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enablePaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPaymentsIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun savePaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testPaymentsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.HUB,
        path = "/{version}/payments/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
