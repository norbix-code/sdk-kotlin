# SDK Endpoint Audit — norbix-kotlin vs gateway

Date: 2026-05-21
Compared: gateway `[Route(...)]` definitions vs the Kotlin SDK modules.
Method: every gateway HTTP route was read from source, grouped by plane
(`Gateway.Hub.*` → Hub, `Gateway.Api.*` → API), and matched against the
SDK module that owns the same path prefix. Internal handlers
(`.Persistent` / `.Volatile` / `.Mq`) and localhost-only services were
skipped — they are not HTTP endpoints.

## Short answer

The two `.csproj` changes you mentioned added **internal event-handler
projects** (`AI.Persistent`, `Files.Persistent`, `Payments.Persistent`).
These do not add public endpoints by themselves. But the audit found the
SDK has drifted from the gateway in many modules: **120 public endpoints
are missing**, including **2 whole modules that do not exist in the SDK**.

## In sync — no change needed

API plane: `chat`, `database`, `echo`.
Hub plane: `ai`, `echo`, `system` (internal typegen), `payments`, `scheduler`.
`accessToken`, `apikeys`, `auth` — paths are framework-provided (ServiceStack),
not `[Route]` attributes; the SDK is correct here.

## Correction

Earlier I said the Hub plane `AskChat` endpoint was missing from the SDK.
That was wrong. It **is** already exposed as `hub.account.askChat`
(`POST /{version}/account/chat/complete`). No new module is required. It
could optionally be moved to a dedicated `hub.chat` module to mirror the
API plane, but that would rename a public method (a breaking change).

## Missing endpoints — existing modules

### API · membership (16 missing)
Passkey sign-up / login / management, account recovery, token refresh,
identity linking. Files: `Api.Membership/Passkey/*`, `Users/LinkIdentity.cs`.

| Verb | Path |
| --- | --- |
| POST | /{version}/membership/userauth/email/start-verification |
| POST | /{version}/membership/userauth/email/confirm-verification |
| POST | /{version}/membership/userauth/has-passkey |
| POST | /{version}/membership/userauth/passkey/registration-options |
| POST | /{version}/membership/userauth/passkey/verify-registration |
| POST | /{version}/membership/userauth/passkey/authentication-options |
| POST | /{version}/membership/userauth/passkey/verify-authentication |
| GET  | /{version}/membership/userauth/passkeys |
| POST | /{version}/membership/userauth/passkeys/{CredentialId}/rename |
| POST | /{version}/membership/userauth/passkeys/{CredentialId}/revoke |
| POST | /{version}/membership/userauth/recovery/magic-link/request |
| POST | /{version}/membership/userauth/recovery/magic-link/consume |
| POST | /{version}/membership/userauth/recovery/use-code |
| POST | /{version}/membership/userauth/logout |
| POST | /{version}/membership/userauth/token/refresh |
| POST | /{version}/membership/users/{userId}/link-identity |

### Hub · database (3 missing)

| Verb | Path |
| --- | --- |
| GET  | /{version}/database/integrations/flex-tiers |
| POST | /{version}/database/integrations/test |
| GET  | /{version}/database/integrations/{Id}/connection-string |

### Hub · files (2 missing)

| Verb | Path |
| --- | --- |
| GET  | /{version}/files/folder |
| GET  | /{version}/files/item |

### Hub · logs (1 missing)

| Verb | Path |
| --- | --- |
| GET  | /{version}/logs/audit |

### Hub · membership (3 missing)

| Verb | Path |
| --- | --- |
| GET  | /{version}/membership/passkey/settings |
| POST | /{version}/membership/passkey/settings |
| GET  | /{version}/membership/policies/new/options |

### Hub · notifications (59 missing)
The SDK `notifications` module covers `email` and `push` only. The gateway
also exposes, under `/{version}/notifications/`, the full **SMS** area
(campaigns, templates, integrations, settings — ~46), the **contacts**
area (~10), and **email validation / razor-syntax-check** (~3). All 59
come from `Gateway.Hub.Sms`, `Gateway.Hub.Contacts`, `Gateway.Hub.Emails`.

## Missing modules — do not exist in the SDK

### API · files (8 endpoints) — NEW MODULE
File data-plane operations from `Gateway.Api.Files`.

| Verb | Path |
| --- | --- |
| GET    | /{version}/files/{filesIntegrationId} |
| DELETE | /{version}/files/{filesIntegrationId} |
| DELETE | /{version}/files/{filesIntegrationId}/bulk |
| POST   | /{version}/files/{filesIntegrationId}/commit |
| GET    | /{version}/files/{filesIntegrationId}/download |
| GET    | /{version}/files/{filesIntegrationId}/info |
| GET    | /{version}/files/{filesIntegrationId}/sign |
| POST   | /{version}/files/{filesIntegrationId}/upload-url |

### Hub · code (28 endpoints) — NEW MODULE
Code integrations + marketplace from `Gateway.Hub.Code`
(`/{version}/code/integrations/*` and `/{version}/code/marketplace/*`).

## Excluded on purpose — not client SDK methods

These are inbound webhook receivers (called by Stripe / Mailgun / external
services, never by an SDK user) or infrastructure endpoints. The current
SDK does not expose them, which is correct:

- `POST /{version}/account/payments/stripe/webhook`
- `POST /{version}/email/webhooks/mailgun/{projectId}/{integrationId}`
- `POST /{version}/webhooks/{source}/{integrationInstanceId}` (inbound receiver)
- `/{version}/resources/*`, `/health`, `/up`

## No changed/removed endpoints

Every endpoint currently in the SDK still exists in the gateway with the
same path and verb. The drift is purely **missing** endpoints, not changed
ones.
