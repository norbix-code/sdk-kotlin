# HUB · Account

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `getAccountProfile` | `GET` | `/{version}/account/profile` | `project` |
| `updateAccountProfile` | `PUT` | `/{version}/account/profile` | `project` |
| `getMyAccountUserProfile` | `GET` | `/{version}/account/me` | `project` |
| `updateMyAccountUserPhone` | `PUT` | `/{version}/account/me/phone` | `project` |
| `resendAccountVerificationToken` | `GET` | `/{version}/account/verify/resend` | `project` |
| `getAccountStatus` | `GET` | `/{version}/account/status` | `project` |
| `createStripeCheckoutSession` | `POST` | `/{version}/account/stripe/create-checkout-session` | `project` |
| `getStripeBillingPortalUrl` | `POST` | `/{version}/account/stripe/get-portal-url` | `project` |
| `checkBundleDiscount` | `POST` | `/{version}/account/stripe/discount/check` | `project` |
| `applyBundleDiscount` | `POST` | `/{version}/account/stripe/discount` | `project` |
| `getTrialAvailability` | `GET` | `/{version}/account/trial-availability` | `project` |
| `joinTrialWaitlist` | `POST` | `/{version}/account/trial-waitlist` | `project` |
| `getManagedServiceBundles` | `GET` | `/{version}/account/stripe/bundles` | `project` |
| `changeManagedServiceBundle` | `POST` | `/{version}/account/stripe/change-bundle` | `project` |
| `getFlexClusters` | `GET` | `/{version}/account/flex-clusters` | `project` |
| `upgradeFlexCluster` | `POST` | `/{version}/account/flex-clusters/{flexClusterId}/upgrade` | `project` |
| `createTeamMemberFromInvitation` | `POST` | `/{version}/account/team/member` | `unauthenticated` |
| `verifyAccount` | `GET` | `/{version}/account/verify` | `unauthenticated` |
| `deleteNotificationsGroup` | `DELETE` | `/{version}/account/projects/{projectId}/notifications/settings/group` | `project` |
| `deleteNotificationsTag` | `DELETE` | `/{version}/account/projects/{projectId}/notifications/settings/tag` | `project` |
| `removeTagFromNotificationsGroup` | `DELETE` | `/{version}/account/projects/{projectId}/notifications/settings/group/tag` | `project` |
| `saveNotificationsGroup` | `POST` | `/{version}/account/projects/{projectId}/notifications/settings/group` | `project` |
| `saveNotificationsTag` | `POST` | `/{version}/account/projects/{projectId}/notifications/settings/tag` | `project` |
| `createProject` | `POST` | `/{version}/account/projects` | `project` |
| `deleteProject` | `DELETE` | `/{version}/account/projects/{projectId}` | `project` |
| `getProject` | `GET` | `/{version}/account/projects/{projectId}` | `project` |
| `getProjects` | `GET` | `/{version}/account/projects` | `project` |
| `getAccountRegions` | `GET` | `/{version}/account/regions` | `unauthenticated` |
| `getProjectTokens` | `GET` | `/{version}/account/projects/{projectId}/tokens` | `project` |
| `updateProjectAccentColor` | `PATCH` | `/{version}/account/projects/{projectId}/settings/accent-color` | `project` |
| `updateProjectIcon` | `PATCH` | `/{version}/account/projects/{projectId}/settings/icon` | `project` |
| `updateProjectLogo` | `PATCH` | `/{version}/account/projects/{projectId}/settings/logo` | `project` |
| `updateProjectMainColor` | `PATCH` | `/{version}/account/projects/{projectId}/settings/main-color` | `project` |
| `updateProjectAllowedOrigins` | `PATCH` | `/{version}/account/projects/{projectId}/settings/origins` | `project` |
| `updateProjectDefaultLanguage` | `PATCH` | `/{version}/account/projects/{projectId}/settings/default-language` | `project` |
| `updateProjectDescription` | `PATCH` | `/{version}/account/projects/{projectId}/settings/description` | `project` |
| `disableProject` | `PATCH` | `/{version}/account/projects/{projectId}/disable` | `project` |
| `enableProject` | `PATCH` | `/{version}/account/projects/{projectId}/enable` | `project` |
| `updateProjectLanguages` | `PATCH` | `/{version}/account/projects/{projectId}/settings/languages` | `project` |
| `updateProjectUrl` | `PATCH` | `/{version}/account/projects/{projectId}/settings/url` | `project` |
| `updateProjectName` | `PATCH` | `/{version}/account/projects/{projectId}/settings/name` | `project` |
| `updateProjectRegions` | `PATCH` | `/{version}/account/projects/{projectId}/settings/regions` | `project` |
| `createAccount` | `POST` | `/{version}/account` | `unauthenticated` |
| `getAccountCollaborators` | `GET` | `/{version}/account/collaborators` | `project` |
| `sendInviteToTeamMember` | `POST` | `/{version}/account/team/member/invite` | `project` |
| `getTeamMember` | `GET` | `/{version}/account/team/member/{MemberId}` | `project` |
| `getProjectAiSettings` | `GET` | `/{version}/account/projects/{projectId}/ai/settings` | `project` |
| `updateProjectAiSettings` | `PUT` | `/{version}/account/projects/{projectId}/ai/settings` | `project` |
| `createProjectAiAssistant` | `POST` | `/{version}/account/projects/{projectId}/ai/assistants` | `project` |
| `updateProjectAiAssistant` | `PUT` | `/{version}/account/projects/{projectId}/ai/assistants/{assistantId}` | `project` |
| `deleteProjectAiAssistant` | `DELETE` | `/{version}/account/projects/{projectId}/ai/assistants/{assistantId}` | `project` |
| `getProjectAiUsage` | `GET` | `/{version}/account/projects/{projectId}/ai/usage` | `project` |
| `updateProjectAdminUrl` | `PATCH` | `/{version}/account/projects/{projectId}/settings/admin-url` | `project` |
| `updateProjectLegalDocuments` | `PATCH` | `/{version}/account/projects/{projectId}/settings/legal` | `project` |
| `getAdminPortalStructure` | `GET` | `/{version}/account/projects/{projectId}/admin-portal/structure` | `project` |
| `assignAdminPortalServiceUser` | `PUT` | `/{version}/account/projects/{projectId}/settings/admin-portal/service-user` | `project` |
| `createAiServiceUser` | `POST` | `/{version}/account/ai/service-users` | `project` |
| `listAiServiceUsers` | `GET` | `/{version}/account/ai/service-users` | `project` |
| `rotateAiServiceUserKey` | `POST` | `/{version}/account/ai/service-users/{Id}/keys` | `project` |
| `revokeAiServiceUserKey` | `DELETE` | `/{version}/account/ai/service-users/{Id}/keys/{KeyId}` | `project` |
| `deleteAiServiceUser` | `DELETE` | `/{version}/account/ai/service-users/{Id}` | `project` |
| `sendMcpMessage` | `POST` | `/{version}/account/mcp` | `project` |
| `openMcpStream` | `GET` | `/{version}/account/mcp` | `project` |
| `endMcpSession` | `DELETE` | `/{version}/account/mcp` | `project` |

Every `project` method here works with a token only (`apiKey` or
`bearerToken`): the gateway takes the account from the signed-in session, or
from the project id in the path. The client does not need `accountId`.

The four `unauthenticated` methods — `createAccount` (sign-up),
`createTeamMemberFromInvitation` (accept an invitation), `getAccountRegions`
and `verifyAccount` — are anonymous on the gateway: they send no
`Authorization` header and need no token and no `accountId` on the client.
`verifyAccount` takes the account id in the request — pass `accountId` and
`token` from the verification email; they go in the query.

```kotlin
val hub = NorbixHub(projectId = "proj_123") // no token, no accountId
hub.account.verifyAccount(mapOf("accountId" to accountIdFromEmail, "token" to tokenFromEmail))
```

## Developer MCP endpoint

`sendMcpMessage`, `openMcpStream` and `endMcpSession` return an `McpResponse`
(`statusCode`, `sessionId`, `contentType`, `isEventStream`, `body`, `json`), not
a parsed map: the gateway hands out the session id only in the
`Mcp-Session-Id` answer header of `initialize`, and a `tools/call` may answer
with an SSE stream. This SDK has no SSE client — `openMcpStream` returns only
when the server closes the stream.

```kotlin
val init = hub.account.sendMcpMessage(mapOf(
    "jsonrpc" to "2.0", "id" to 1, "method" to "initialize",
    "params" to mapOf("protocolVersion" to "2025-11-25", "capabilities" to emptyMap<String, Any>(),
        "clientInfo" to mapOf("name" to "my-app", "version" to "1.0")),
))
val sessionId = init.sessionId!!
val tools = hub.account.sendMcpMessage(mapOf("jsonrpc" to "2.0", "id" to 2, "method" to "tools/list"), sessionId = sessionId)
println(tools.json)
hub.account.endMcpSession(sessionId)
```

A service user key (`nbsu_...`, from `createAiServiceUser` / `rotateAiServiceUserKey`)
used as the client's key narrows the MCP tools to that user's scope.

## Bundles and Flex clusters

A Managed Service subscription is one of three bundles (`Starter`, `Growth`,
`Scale`), paid `Monthly` or `Annual`. Each bundle allows a number of enabled
projects.

- `getManagedServiceBundles()` answers `bundles`, each with `bundle`,
  `projectCap` and the `monthly` and `annual` prices (`amount` in minor units,
  lower-case `currency`).
- `changeManagedServiceBundle` takes `bundle` and `billingPeriod`. It is
  refused with `CM-ERRORS-ACCOUNT-023` when the account has more enabled
  projects than the new bundle allows.
- `createStripeCheckoutSession` for a Managed Service subscription needs
  `bundle` and `billingPeriod`. `projectCap` is no longer accepted.
- `getAccountStatus()` also answers `bundle`, `billingPeriod`, `isTrial`,
  `renewsOn` and `enabledProjects`.
- `getFlexClusters()` answers `clusters` (the account's Norbix-managed Atlas
  clusters with their `databases`, `usage`, `nearLimits`, `nextTierCode` — the
  next upgrade step, empty when there is none — and `topTierCode`, the plan's
  highest tier), `canCreateNew`
  and `cannotCreateReason` (`TrialOneCluster` or `ClusterLimitReached`).
- `upgradeFlexCluster` takes `flexClusterId` (it goes in the path) and
  `tierCode` — the cluster's `nextTierCode`: one step on FLEX → M10 → M20 →
  M30 → M40, within the plan (trial: FLEX only · Starter: up to M20 · Growth:
  up to M30 · Scale: up to M40); the upgrade is queued.

```kotlin
val bundles = hub.account.getManagedServiceBundles()
hub.account.changeManagedServiceBundle(mapOf("bundle" to "Growth", "billingPeriod" to "Annual"))

val flex = hub.account.getFlexClusters()
hub.account.upgradeFlexCluster(mapOf("flexClusterId" to "fxc_1", "tierCode" to "M20")) // the cluster's nextTierCode
```

To put a new managed database on a cluster the account already has, send
`flexClusterId` in the `MongoDbAtlasFlexManaged` database integration request;
to name a new cluster, send `clusterDisplayName`.

## Bundle discounts

A discount code lowers what the account pays for its bundle: a percentage
(`percentOff`) or a fixed amount (`amountOff` in minor units, with
`currency`), for `months` months or forever (`months` is null), optionally
until `endsAt`.

- `checkBundleDiscount` takes `code` and, optionally, `bundle` and
  `billingPeriod`. It only reads: the answer carries `discount`.
- `applyBundleDiscount` takes `code` and puts the discount on the account's
  running subscription. It changes what the account pays. Refused with
  `CM-ERRORS-PROJECTS-039` when the account has no subscription.
- `createStripeCheckoutSession` takes an optional `discountCode` for a new
  subscription.
- `getAccountStatus()` also answers `discount` while one is in force.

A code that cannot be used is refused with HTTP 400 `CM-ERRORS-ACCOUNT-027`.
The error context `reason` says why: `not_found`, `not_started`, `expired`,
`not_for_bundle`, `monthly_only`, `wrong_billing_period`,
`already_has_discount` or `already_used`.

```kotlin
val check = hub.account.checkBundleDiscount(
    mapOf("code" to "LAUNCH20", "bundle" to "Growth", "billingPeriod" to "Annual"),
)

try {
    hub.account.applyBundleDiscount(mapOf("code" to "LAUNCH20"))
} catch (e: NorbixError) {
    if (e.errorCode == "CM-ERRORS-ACCOUNT-027") {
        val reason = e.errors.first().context["reason"] // e.g. "already_used"
    }
}
```

## Trial limits

A free Managed Service trial can be limited per region. Ask before opening a
checkout.

- `getTrialAvailability` takes an optional `region` (sent in the query string)
  and answers `limitsOn`, `region`, `trialsOpen`, `waitlistOpen`,
  `onWaitlist` and `refusal`.
  - `limitsOn` false: this installation has no trial limits; start the trial
    as before.
  - `trialsOpen` false: the region's trials are full. Offer buy now without a
    trial (`createStripeCheckoutSession` with `withoutTrial` true) or, when
    `waitlistOpen` is true, the waiting list.
  - `onWaitlist`: the owner email is already on the list.
  - `refusal`: why this account's trial was refused after checkout
    (`CardAlreadyHadTrial`), or empty.
- `joinTrialWaitlist` puts the account owner's email on the waiting list for a
  region. `consent` must be true; `consentVersion` names the consent text
  shown. When a slot frees, Norbix emails an invitation link valid for a few
  days. The answer carries `status` (`added`, `alreadyListed` or
  `alreadyCustomer`: an email that already had a trial or pays is never added)
  and a `message` that can be shown as is. Errors: `CM-ERRORS-ACCOUNT-044`
  (list switched off), `CM-ERRORS-ACCOUNT-043` (unknown region), a validation
  error when `consent` is not true.
- `createStripeCheckoutSession` takes optional `region`, `withoutTrial` and
  `trialInvite`. A trial checkout in a full region fails with
  `CM-ERRORS-ACCOUNT-040`. The invitation token from the waiting-list email
  goes in `trialInvite` and starts the trial once even when the region is
  full; an expired or someone else's invitation fails with
  `CM-ERRORS-ACCOUNT-042`.

The waiting-list intake route (`/account/trial-waitlist/intake`) is for the
Norbix website server only and has no SDK method.

```kotlin
@Suppress("UNCHECKED_CAST")
val availability = hub.account.getTrialAvailability(mapOf("region" to "nb-eu-germany")) as Map<String, Any?>

if (availability["trialsOpen"] == false && availability["waitlistOpen"] == true) {
    hub.account.joinTrialWaitlist(
        mapOf("region" to "nb-eu-germany", "consent" to true, "consentVersion" to "2026-11"),
    )
}

try {
    hub.account.createStripeCheckoutSession(
        mapOf("subscriptionType" to "ManagedService", "bundle" to "Starter", "billingPeriod" to "Monthly", "region" to "nb-eu-germany"),
    )
} catch (e: NorbixError) {
    if (e.errorCode == "CM-ERRORS-ACCOUNT-040") {
        // trials full: offer withoutTrial = true or the waiting list
    }
}
```
