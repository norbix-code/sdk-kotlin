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
| `linkIdentity` | `POST` | `/{version}/membership/users/{userId}/link-identity` | `project` |

## Password change answers the credential version

`changePassword` (`POST /{version}/membership/userauth/password/change`) and
`confirmPasswordReset` (`POST /{version}/membership/userauth/password/reset/confirm`)
answer `{ authId, credentialVersion }` since gateway release 2.3.9 (before:
an empty OK). `credentialVersion` changes every time the member's credential
changes; the same value is on the member's auth record (`AuthDto.credentialVersion`)
so a session issued before the change can be told apart. The Kotlin SDK hands
the answer back as a map, so existing callers keep working.
