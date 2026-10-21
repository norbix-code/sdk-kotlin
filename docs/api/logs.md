# API · Logs

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `writeLogs` | `POST` | `/{version}/logs` | `project` |

## Write your app's own log lines

`writeLogs` sends 1–100 entries to the project's Logs. The call returns at
once — the entries are queued — and answers `{ accepted }`.

```kotlin
api.logs.writeLogs(mapOf("entries" to listOf(mapOf(
    "level" to "error",                   // information (default) | warning | error
    "title" to "Payment failed",          // required, 1–200 characters
    "message" to "card declined",         // at most 8 000
    "eventCode" to "order:payment_failed", // a-z 0-9 _ . : -, at most 64; stored as app:<code>
    "correlationId" to "checkout-42",     // letters digits _ -, at most 64
    "timestamp" to "2026-10-21T10:00:00Z", // UTC, at most 7 days old, 5 minutes ahead
    "meta" to mapOf("orderId" to "ord_1"), // at most 20 keys
))))
```

Refusals throw `NorbixError`:

| Status | Code | When |
| --- | --- | --- |
| 400 | — | an entry is broken (missing title, too long, bad event code …) |
| 400 | `CM-ERRORS-LOGGING-002` | the Logs module is off |
| 429 | `CM-ERRORS-LOGGING-003` | the project's per-minute quota is used up |

The gateway sends a `Retry-After` header (seconds) with the 429; the SDK puts it
on the error as `NorbixError.retryAfterSeconds` (`null` when the header is
absent or unreadable). Wait that long before sending again — the SDK does not
resend the call by itself:

```kotlin
try {
    api.logs.writeLogs(mapOf("entries" to entries))
} catch (e: NorbixError) {
    if (e.httpStatus != 429) throw e
    Thread.sleep((e.retryAfterSeconds ?: 60) * 1000L) // then send the entries again
}
```
