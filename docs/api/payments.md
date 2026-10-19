# API · Payments

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `createPaymentOrder` | `POST` | `/{version}/payments/orders` | `project` |
| `getPaymentOrder` | `GET` | `/{version}/payments/orders/{Id}` | `project` |
| `getPaymentOrders` | `GET` | `/{version}/payments/orders` | `project` |
| `startPaymentCheckout` | `POST` | `/{version}/payments/orders/{Id}/checkout` | `project` |

## Orders and checkout

An order is the server-side record of what a buyer pays for. Amounts are in
minor units (cents); the gateway computes each line's `amountMinor` and the
order's `totalMinor`.

```kotlin
val created = api.payments.createPaymentOrder(mapOf(
    "buyerUserId" to userId,
    "merchantReference" to "listing-42",
    "idempotencyKey" to "listing-42-promo-1",   // 8+ chars; a retry answers the same id
    "currency" to "EUR",
    "priceVersion" to "v1",
    "lines" to listOf(mapOf("sku" to "promo-7d", "quantity" to 1, "unitAmountMinor" to 499)),
)) as Map<*, *>
val orderId = created["id"] as String          // "ord_…"

val started = api.payments.startPaymentCheckout(mapOf(
    "id" to orderId,
    "integrationId" to "int_montonio",
    "returnUrl" to "https://shop.example/return",
)) as Map<*, *>
val paymentUrl = (started["checkout"] as Map<*, *>)["paymentUrl"]   // send the buyer here
// started["reused"] == true when an open checkout of the order was handed back

val order = api.payments.getPaymentOrder(mapOf("id" to orderId))          // { item: PaymentOrderDto }
val mine = api.payments.getPaymentOrders(mapOf("buyerUserId" to userId)) // { list: { items, … } }
```

The order's `status` moves on when the provider confirms the payment; the
same moves are published as `payments.order.paid`, `payments.order.partially_refunded`,
`payments.order.refunded`, `payments.order.reversed` and `payments.order.expired`
events (payload `PaymentOrderEventDto`; its `orderEventId` is the
de-duplication key).

Typed shapes: `CreatePaymentOrderRequest`, `PaymentOrderDto`,
`PaymentOrderLineDto`, `PaymentOrderCheckoutDto` in `references/api.dtos.kt`.
