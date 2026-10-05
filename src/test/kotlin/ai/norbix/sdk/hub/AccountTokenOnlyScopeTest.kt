package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * The gateway takes the account from the signed-in session on every
 * `/account/...` route in [cases] (`UserSession.UserAuth.AccountId`), or from
 * the project id in the path, or needs no account at all. So each method works
 * with a token only — a client with no `accountId` — like the TypeScript,
 * .NET, Go and Python SDKs.
 *
 * Four routes have no `[Authenticate]` on the gateway at all (sign-up,
 * accepting an invitation, the region list and the email verification link),
 * so [anonymousCases] run on a client with NO token and NO `accountId`: no
 * `Authorization` header goes out. `verifyAccount` carries the account id in
 * the request (query), never on the client.
 *
 * One dynamic test per method, against a throw-away local server (verb,
 * resolved path, auth header, account header, query). Never a real gateway.
 */
class AccountTokenOnlyScopeTest {

    private class Seen {
        var method: String? = null
        var path: String? = null
        var auth: String? = null
        var accountHeader: String? = null
        var query: String? = null
    }

    private fun withTokenOnlyHub(block: (NorbixHub) -> Unit): Seen = withHub(token = "token", block = block)

    /** A hub with no token, no api key and no account id — env vars ignored too. */
    private fun withAnonymousHub(block: (NorbixHub) -> Unit): Seen = withHub(token = null, block = block)

    private fun withHub(token: String?, block: (NorbixHub) -> Unit): Seen {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = Seen()
        server.createContext("/") { ex ->
            seen.method = ex.requestMethod
            seen.path = ex.requestURI.path
            seen.auth = ex.requestHeaders.getFirst("Authorization")
            seen.accountHeader = ex.requestHeaders.getFirst("X-CM-AccountId")
            seen.query = ex.requestURI.rawQuery
            val bytes = """{"responseStatus":{"isSuccess":true}}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val hub = NorbixHub(projectId = "proj", bearerToken = token, baseUrl = "http://127.0.0.1:${server.address.port}")
            hub.setAccountId(null) // also ignore a NORBIX_ACCOUNT_ID in the environment
            if (token == null) {
                hub.setBearerToken(null) // ignore NORBIX_BEARER_TOKEN
                hub.setApiKey(null) // ignore NORBIX_API_KEY
            }
            block(hub)
        } finally {
            server.stop(0)
        }
        return seen
    }

    private data class Case(val name: String, val verb: String, val path: String, val call: (NorbixHub) -> Unit)

    private val p = mapOf("projectId" to "proj_1")

    private val cases = listOf(
        Case("getAccountProfile", "GET", "/v2/account/profile") { it.account.getAccountProfile() },
        Case("updateAccountProfile", "PUT", "/v2/account/profile") { it.account.updateAccountProfile() },
        Case("getMyAccountUserProfile", "GET", "/v2/account/me") { it.account.getMyAccountUserProfile() },
        Case("updateMyAccountUserPhone", "PUT", "/v2/account/me/phone") { it.account.updateMyAccountUserPhone(mapOf("phone" to "+37060000000")) },
        Case("resendAccountVerificationToken", "GET", "/v2/account/verify/resend") { it.account.resendAccountVerificationToken() },
        Case("getAccountStatus", "GET", "/v2/account/status") { it.account.getAccountStatus() },
        Case("createStripeCheckoutSession", "POST", "/v2/account/stripe/create-checkout-session") { it.account.createStripeCheckoutSession() },
        Case("getStripeBillingPortalUrl", "POST", "/v2/account/stripe/get-portal-url") { it.account.getStripeBillingPortalUrl() },
        Case("deleteNotificationsGroup", "DELETE", "/v2/account/projects/proj_1/notifications/settings/group") { it.account.deleteNotificationsGroup(p) },
        Case("deleteNotificationsTag", "DELETE", "/v2/account/projects/proj_1/notifications/settings/tag") { it.account.deleteNotificationsTag(p) },
        Case("removeTagFromNotificationsGroup", "DELETE", "/v2/account/projects/proj_1/notifications/settings/group/tag") { it.account.removeTagFromNotificationsGroup(p) },
        Case("saveNotificationsGroup", "POST", "/v2/account/projects/proj_1/notifications/settings/group") { it.account.saveNotificationsGroup(p) },
        Case("saveNotificationsTag", "POST", "/v2/account/projects/proj_1/notifications/settings/tag") { it.account.saveNotificationsTag(p) },
        Case("createProject", "POST", "/v2/account/projects") { it.account.createProject() },
        Case("deleteProject", "DELETE", "/v2/account/projects/proj_1") { it.account.deleteProject(p) },
        Case("getProject", "GET", "/v2/account/projects/proj_1") { it.account.getProject(p) },
        Case("getProjects", "GET", "/v2/account/projects") { it.account.getProjects() },
        Case("getProjectTokens", "GET", "/v2/account/projects/proj_1/tokens") { it.account.getProjectTokens(p) },
        Case("updateProjectAccentColor", "PATCH", "/v2/account/projects/proj_1/settings/accent-color") { it.account.updateProjectAccentColor(p) },
        Case("updateProjectIcon", "PATCH", "/v2/account/projects/proj_1/settings/icon") { it.account.updateProjectIcon(p) },
        Case("updateProjectLogo", "PATCH", "/v2/account/projects/proj_1/settings/logo") { it.account.updateProjectLogo(p) },
        Case("updateProjectMainColor", "PATCH", "/v2/account/projects/proj_1/settings/main-color") { it.account.updateProjectMainColor(p) },
        Case("updateProjectAllowedOrigins", "PATCH", "/v2/account/projects/proj_1/settings/origins") { it.account.updateProjectAllowedOrigins(p) },
        Case("updateProjectDefaultLanguage", "PATCH", "/v2/account/projects/proj_1/settings/default-language") { it.account.updateProjectDefaultLanguage(p) },
        Case("updateProjectDescription", "PATCH", "/v2/account/projects/proj_1/settings/description") { it.account.updateProjectDescription(p) },
        Case("disableProject", "PATCH", "/v2/account/projects/proj_1/disable") { it.account.disableProject(p) },
        Case("enableProject", "PATCH", "/v2/account/projects/proj_1/enable") { it.account.enableProject(p) },
        Case("updateProjectLanguages", "PATCH", "/v2/account/projects/proj_1/settings/languages") { it.account.updateProjectLanguages(p) },
        Case("updateProjectUrl", "PATCH", "/v2/account/projects/proj_1/settings/url") { it.account.updateProjectUrl(p) },
        Case("updateProjectName", "PATCH", "/v2/account/projects/proj_1/settings/name") { it.account.updateProjectName(p) },
        Case("updateProjectRegions", "PATCH", "/v2/account/projects/proj_1/settings/regions") { it.account.updateProjectRegions(p) },
        Case("getAccountCollaborators", "GET", "/v2/account/collaborators") { it.account.getAccountCollaborators() },
        Case("sendInviteToTeamMember", "POST", "/v2/account/team/member/invite") { it.account.sendInviteToTeamMember() },
        Case("getLicenses", "GET", "/v2/account/licenses") { it.account.getLicenses() },
        Case("regions.updateProjectRegions", "PATCH", "/v2/account/projects/proj_1/settings/regions") {
            it.regions.updateProjectRegions(projectId = "proj_1", primaryRegion = "nb-eu-germany")
        },
    )

    @TestFactory
    fun everyAccountRouteWorksWithATokenAndNoAccountId(): List<DynamicTest> = cases.map { c ->
        DynamicTest.dynamicTest(c.name) {
            val seen = withTokenOnlyHub { hub -> c.call(hub) }
            assertEquals(c.verb, seen.method, c.name)
            assertEquals(c.path, seen.path, c.name)
            assertEquals("Bearer token", seen.auth, c.name)
            assertNull(seen.accountHeader, c.name)
        }
    }

    private data class AnonymousCase(
        val name: String,
        val verb: String,
        val path: String,
        val query: String? = null,
        val call: (NorbixHub) -> Unit,
    )

    private val anonymousCases = listOf(
        AnonymousCase("createAccount", "POST", "/v2/account") { it.account.createAccount() },
        AnonymousCase("createTeamMemberFromInvitation", "POST", "/v2/account/team/member") {
            it.account.createTeamMemberFromInvitation()
        },
        AnonymousCase("getAccountRegions", "GET", "/v2/account/regions") { it.account.getAccountRegions() },
        AnonymousCase("regions.list", "GET", "/v2/account/regions") { it.regions.list() },
        AnonymousCase("verifyAccount", "GET", "/v2/account/verify", query = "accountId=acc_1&token=t") {
            it.account.verifyAccount(mapOf("accountId" to "acc_1", "token" to "t"))
        },
    )

    @TestFactory
    fun anonymousAccountRoutesWorkWithNoTokenAndNoAccountId(): List<DynamicTest> = anonymousCases.map { c ->
        DynamicTest.dynamicTest(c.name) {
            val seen = withAnonymousHub { hub -> c.call(hub) }
            assertEquals(c.verb, seen.method, c.name)
            assertEquals(c.path, seen.path, c.name)
            assertNull(seen.auth, c.name)
            assertNull(seen.accountHeader, c.name)
            if (c.query != null) assertEquals(c.query, seen.query, c.name)
        }
    }
}
