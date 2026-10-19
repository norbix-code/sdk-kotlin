# HUB · Payments

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `disablePayments` | `PUT` | `/{version}/payments/disable` | `project` |
| `enablePayments` | `PUT` | `/{version}/payments/enable` | `project` |
| `deletePaymentsTrigger` | `DELETE` | `/{version}/payments/triggers/{triggerId}` | `project` |
| `disablePaymentsTrigger` | `PATCH` | `/{version}/payments/triggers/{triggerId}/disable` | `project` |
| `enablePaymentsTrigger` | `PATCH` | `/{version}/payments/triggers/{triggerId}/enable` | `project` |
| `getPaymentsTrigger` | `GET` | `/{version}/payments/triggers/{id}` | `project` |
| `getPaymentsTriggers` | `GET` | `/{version}/payments/triggers` | `project` |
| `savePaymentsTrigger` | `POST` | `/{version}/payments/triggers` | `project` |
| `confirmPaymentsIntegrationHumanDelivery` | `POST` | `/{version}/payments/integrations/confirm-human-delivery` | `project` |
| `deletePaymentsIntegration` | `DELETE` | `/{version}/payments/integrations/{Id}` | `project` |
| `disablePaymentsIntegration` | `PUT` | `/{version}/payments/integrations/{Id}/disable` | `project` |
| `enablePaymentsIntegration` | `PUT` | `/{version}/payments/integrations/{Id}/enable` | `project` |
| `getPaymentsIntegration` | `GET` | `/{version}/payments/integrations/{id}` | `project` |
| `getPaymentsIntegrations` | `GET` | `/{version}/payments/integrations` | `project` |
| `getPaymentsWebhookLog` | `GET` | `/{version}/payments/webhooks/log` | `project` |
| `savePaymentsIntegration` | `POST` | `/{version}/payments/integrations` | `project` |
| `testPaymentsIntegration` | `POST` | `/{version}/payments/integrations/test` | `project` |

## Saving a Montonio integration

`savePaymentsIntegration` takes the integration under `integration`, with the
provider's own keys. Montonio (Baltic bank links and cards) needs the
`accessKey` / `secretKey` pair from the Montonio partner system, `isSandbox`,
and an optional checkout `locale`:

```kotlin
hub.payments.savePaymentsIntegration(mapOf(
    "integration" to mapOf(
        "provider" to "Montonio",
        "accessKey" to accessKey,
        "secretKey" to secretKey,
        "isSandbox" to true,
        "locale" to "lt",
    ),
))
```

Typed shape: `MontonioPaymentIntegrationRequest` in `references/hub.dtos.kt`.
