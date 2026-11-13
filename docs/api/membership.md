# API · Membership

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `blockUser` | `PATCH` | `/{version}/membership/users/block` | `project` |
| `saveSystemUserWithPermissions` | `POST` | `/{version}/membership/users/register/service` | `project` |
| `saveGuestUser` | `POST` | `/{version}/membership/users/register/guest` | `project` |
| `saveUserNameUser` | `POST` | `/{version}/membership/users/register/user-name` | `project` |
| `saveEmailUser` | `POST` | `/{version}/membership/users/register/email` | `project` |
| `savePhoneUser` | `POST` | `/{version}/membership/users/register/phone` | `project` |
| `savePhoneUserNameWithPermissions` | `POST` | `/{version}/membership/users/register/phone-with-permissions` | `project` |
| `saveEmailUserNameWithPermissions` | `POST` | `/{version}/membership/users/register/email-with-permissions` | `project` |
| `saveUserNameWithPermissions` | `POST` | `/{version}/membership/users/register/user-name-with-permissions` | `project` |
| `deleteUser` | `DELETE` | `/{version}/membership/users` | `project` |
| `getUser` | `GET` | `/{version}/membership/users/{id}` | `project` |
| `getUsers` | `GET` | `/{version}/membership/users` | `project` |
| `getUserPreferences` | `GET` | `/{version}/membership/users/{id}/preferences` | `project` |
| `inviteUser` | `POST` | `/{version}/membership/users/invite` | `project` |
| `assignRolePermissions` | `PUT` | `/{version}/membership/users/assign-roles` | `project` |
| `unblockUser` | `PATCH` | `/{version}/membership/users/unblock` | `project` |
| `updateUser` | `PUT` | `/{version}/membership/users` | `project` |
| `updateUserPreferences` | `PUT` | `/{version}/membership/users/{id}/preferences` | `project` |
| `confirmEmailVerification` | `POST` | `/{version}/membership/userauth/email/confirm-verification` | `project` |
| `startEmailVerification` | `POST` | `/{version}/membership/userauth/email/start-verification` | `project` |
| `hasPasskey` | `POST` | `/{version}/membership/userauth/has-passkey` | `project` |
| `passkeyLogout` | `POST` | `/{version}/membership/userauth/logout` | `project` |
| `passkeyAuthenticationOptions` | `POST` | `/{version}/membership/userauth/passkey/authentication-options` | `project` |
| `passkeyRegistrationOptions` | `POST` | `/{version}/membership/userauth/passkey/registration-options` | `project` |
| `verifyPasskeyAuthentication` | `POST` | `/{version}/membership/userauth/passkey/verify-authentication` | `project` |
| `verifyPasskeyRegistration` | `POST` | `/{version}/membership/userauth/passkey/verify-registration` | `project` |
| `listPasskeys` | `GET` | `/{version}/membership/userauth/passkeys` | `project` |
| `renamePasskey` | `POST` | `/{version}/membership/userauth/passkeys/{CredentialId}/rename` | `project` |
| `revokePasskey` | `POST` | `/{version}/membership/userauth/passkeys/{CredentialId}/revoke` | `project` |
| `consumeMagicLink` | `POST` | `/{version}/membership/userauth/recovery/magic-link/consume` | `project` |
| `requestMagicLink` | `POST` | `/{version}/membership/userauth/recovery/magic-link/request` | `project` |
| `useRecoveryCode` | `POST` | `/{version}/membership/userauth/recovery/use-code` | `project` |
| `refreshPasskeyToken` | `POST` | `/{version}/membership/userauth/token/refresh` | `project` |
| `startLinkIdentity` | `POST` | `/{version}/membership/auth/{UserId}/link-identity/start` | `project` |
| `linkIdentity` | `POST` | `/{version}/membership/auth/{UserId}/link-identity` | `project` |
| `exchangeSocialSignInCode` | `POST` | `/{version}/membership/auth/social/{Provider}/exchange` | `unauthenticated` |
| `socialSignInUrl` | — | builds `GET /{version}/membership/auth/social/{provider}?projectId=…` (a URL, not a call) | — |

## Social sign-in and link identity

Project users can sign in with Google, Apple, Microsoft, GitHub, Facebook, X or
Okta. The project's enabled providers are in the public config
(`publicProjects.getPublicProjectConfig` → `auth.socialSignIn`: `provider`,
`displayName`, `startPath`).

```kotlin
// 1. PKCE: keep the verifier in memory; only the challenge travels.
val pkce = Pkce.create()
// Open the start URL in a Custom Tab (not a WebView). It is not a call: it redirects.
val start = api.membership.socialSignInUrl(
    "google", returnUrl = "https://app.example.com/oauth/callback", codeChallenge = pkce.codeChallenge,
)

// 2. The return page gets ?code=…&provider=google (or ?error=…). Trade the code within 2 minutes:
val token = api.membership.exchangeSocialSignInCode(
    mapOf("provider" to "google", "code" to code, "codeVerifier" to pkce.codeVerifier),
) as Map<*, *>
// token["bearerToken"]: the project JWT (14 days, no refresh token)

// Link another provider to the signed-in user (yourself only):
val linkPkce = Pkce.create()
val link = api.membership.startLinkIdentity(
    mapOf(
        "userId" to "usr_…", "provider" to "github", "returnUrl" to "https://app.example.com/settings",
        "codeChallenge" to linkPkce.codeChallenge,
    ),
) as Map<*, *>
// open link["authorizeUrl"]; it comes back with ?intent=link&code=…
api.membership.linkIdentity(mapOf("userId" to "usr_…", "code" to linkCode, "codeVerifier" to linkPkce.codeVerifier))
```

- `socialSignInUrl(provider, mode, returnUrl)` puts the project id and a
  non-PROD env in the query, because a navigation sends no headers. The start
  and the provider callback have no call method.
- `exchangeSocialSignInCode` sends no credentials, even when the client has a
  key or a JWT: the gateway refuses an old token on any route, and the
  exchange is how a user signs in again.
- `linkIdentity` now takes `userId` and `code` (the link code); `provider` /
  `providerToken` are gone.
- PKCE (S256) is optional but strongly recommended: `Pkce.create()`
  (`ai.norbix.sdk.core`) gives `codeVerifier` and `codeChallenge` (32 random
  bytes, base64url). A code started with a challenge needs its verifier; a
  verifier for a code started without one is refused too.
- Refusals: `CM-ERRORS-MEMBERSHIP-051` (code used, expired or unknown), `-055`
  (409, the provider account belongs to another user), `-056` (403, not
  yourself), `-058` (PKCE: `context.Reason` `verifier_missing`,
  `verifier_wrong` or `challenge_missing`; the code is used up — start
  again), `-059` (the challenge is not a 43-character S256). A refused
  `returnUrl` sends the browser to the mode's failure page with
  `error=return_url_not_allowed`.

## Password change answers the credential version

`changePassword` (`POST /{version}/membership/userauth/password/change`) and
`confirmPasswordReset` (`POST /{version}/membership/userauth/password/reset/confirm`)
answer `{ authId, credentialVersion }` since gateway release 2.3.9 (before:
an empty OK). `credentialVersion` changes every time the member's credential
changes; the same value is on the member's auth record (`AuthDto.credentialVersion`)
so a session issued before the change can be told apart. The Kotlin SDK hands
the answer back as a map, so existing callers keep working.
