package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Payment orders and their checkout, on the project's data plane.
 *
 * An order is the server-side record of what a buyer pays for: lines,
 * currency and a total the gateway computes. You create it, start a checkout
 * at a payments integration (Montonio, Stripe, …), send the buyer to the
 * returned `paymentUrl`, and learn the outcome from the order's status or from
 * the `payments.order.*` events (`OnOrderPaid` triggers, webhooks).
 *
 * Request and response shapes: `CreatePaymentOrderRequest`,
 * `PaymentOrderDto`, `PaymentOrderCheckoutDto` & co. in
 * `references/api.dtos.kt`.
 */
class PaymentsModule(private val transport: Transport) {
    /**
     * `POST /{version}/payments/orders`
     *
     * Creates a payment order. Send `buyerUserId`, `merchantReference`,
     * `currency`, `priceVersion` and `lines` — each line a map of `sku?`,
     * `title?`, `quantity` and `unitAmountMinor` (the price in minor units,
     * cents) — plus an optional `metadata` string map.
     *
     * Send an `idempotencyKey` (8 characters or more) to make a retry safe:
     * the same body with the same key answers the same order id instead of a
     * second order.
     *
     * Answers `{ id }` — the `ord_…` id of the order.
     */
    fun createPaymentOrder(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/payments/orders",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/payments/orders/{Id}`
     *
     * Reads one payment order. Answers `{ item }` — a `PaymentOrderDto`:
     * lines, `totalMinor`, `status`, the checkout attempts, `settledMinor`,
     * `refundedMinor`, `paidOnUtc` and any `mismatches` between what was
     * ordered and what the provider settled.
     *
     * Send `id` (the `ord_…` id).
     */
    fun getPaymentOrder(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/payments/orders/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/payments/orders`
     *
     * Lists payment orders, filtered on the query by the optional
     * `buyerUserId`, `merchantReference` and `status`. Answers `{ list }` — a
     * paginated list of `PaymentOrderDto`.
     */
    fun getPaymentOrders(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/payments/orders",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `POST /{version}/payments/orders/{Id}/checkout`
     *
     * Starts (or reuses) a checkout for an order at a payments integration.
     * Send `id`, `integrationId` and `returnUrl` (where the provider sends the
     * buyer back), and optionally `method`, `preferredCountry` and
     * `preferredProvider` (e.g. a bank for Montonio).
     *
     * Answers `{ checkout, reused, order }`: send the buyer to
     * `checkout.paymentUrl`. `reused` is true when an open checkout of the
     * order was handed back instead of a new one.
     */
    fun startPaymentCheckout(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/payments/orders/{Id}/checkout",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )
}
