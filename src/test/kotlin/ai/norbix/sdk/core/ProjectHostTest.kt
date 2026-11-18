package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import java.net.http.HttpRequest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * The project's own API host (`pr-<32 hex>.api.norbix.ai`) — the settled
 * design is in devops docs/tasks/clients-project-host.md. Requests are built
 * with the client's own pipeline and inspected, never sent.
 */
class ProjectHostTest {

    // The first three labels are the server's own values (project DTO
    // `hostLabel`, a project's DNS record), not this decoder's.
    private val vectors = listOf(
        "pr_5XvmrTA6JVggZdmEE5bGdm" to "pr-022c4aca9f9e4df787ab0a20c83c44b6",
        "pr_3vlTD52e9VK8lXzdv0SmWG" to "pr-184336d00e2141c3be5138e8dcf52e81",
        "pr_89W9MJvt0StwxsEvyohlJ" to "pr-60d101b1938747659947d507192a5204",
        "pr_xCeyU0VjHvjVi5MpOYSGY" to "pr-6b8b6182960c416098d153d3eb0e601f",
    )
    private val notAProjectId = listOf(
        "p1",
        "proj_123",
        "pr_",
        "pr_!!!",
        "pr_zzzzzzzzzzzzzzzzzzzzzzz",
        "acc_oOAAIfAzbauZ6f0NHEHjP",
        "",
        "pr_1",
        "pr_ąčę",
        "PR_5XvmrTA6JVggZdmEE5bGdm",
    )

    private val virginia = "pr_5XvmrTA6JVggZdmEE5bGdm"
    private val virginiaHost = "https://pr-022c4aca9f9e4df787ab0a20c83c44b6.api.norbix.ai"
    private val germany = "pr_3vlTD52e9VK8lXzdv0SmWG"
    private val germanyHost = "https://pr-184336d00e2141c3be5138e8dcf52e81.api.norbix.ai"

    /** The request a call would send, built by the transport's own pipeline. */
    private fun request(transport: Transport, scope: Scope = Scope.PROJECT): HttpRequest =
        transport.buildRequest(
            path = "/{version}/echo",
            method = "GET",
            request = emptyMap(),
            scope = scope,
            bearerToken = null,
            timeoutMs = null,
            env = null,
            region = null,
            language = null,
        ).build()

    private fun HttpRequest.header(name: String): String? = headers().firstValue(name).orElse(null)

    // ── the label ───────────────────────────────────────────────────────────

    @Test
    fun labelVectors() {
        vectors.forEach { (projectId, label) -> assertEquals(label, projectHostLabel(projectId), projectId) }
    }

    @Test
    fun notAProjectIdGivesNoLabelAndNeverThrows() {
        notAProjectId.forEach { assertNull(projectHostLabel(it), "\"$it\"") }
        assertNull(projectHostLabel(null))
    }

    // ── default base URL ────────────────────────────────────────────────────

    @Test
    fun apiCallsGoToTheProjectHostAndStillSendTheProjectHeader() {
        val api = NorbixApi(projectId = virginia, apiKey = "k")
        val req = request(api.transport)
        assertEquals("$virginiaHost/v3/echo", req.uri().toString())
        assertEquals(virginia, req.header("norbix-project-id"))
        assertNull(req.header("nb-region"))
        assertEquals(virginiaHost, api.getBaseUrl())
    }

    @Test
    fun loginGoesToTheProjectHost() {
        val api = NorbixApi(projectId = virginia)
        val req = api.transport.buildRequest(
            path = "/auth", method = "POST", request = mapOf("userName" to "alice"),
            scope = Scope.UNAUTHENTICATED, bearerToken = null, timeoutMs = null,
            env = null, region = null, language = null,
        ).build()
        assertEquals("$virginiaHost/auth", req.uri().toString())
    }

    @Test
    fun hubCallsStayOnTheSharedHost() {
        val hub = NorbixHub(projectId = virginia, apiKey = "k")
        val req = request(hub.transport)
        assertEquals("https://hub.norbix.ai/v3/echo", req.uri().toString())
        assertEquals(virginia, req.header("norbix-project-id"))
        assertFalse(hub.transport.config.useProjectHost)
    }

    @Test
    fun aProjectIdThatIsNotANorbixIdKeepsTheSharedHost() {
        val api = NorbixApi(projectId = "p1", apiKey = "k")
        val req = request(api.transport)
        assertEquals("https://api.norbix.ai/v3/echo", req.uri().toString())
        assertEquals("p1", req.header("norbix-project-id"))
        assertEquals(NorbixApi.DEFAULT_BASE_URL, api.getBaseUrl())
    }

    @Test
    fun theHostFollowsAProjectSwitch() {
        val api = NorbixApi(projectId = virginia, apiKey = "k")

        api.transport.config.projectId = germany
        var req = request(api.transport)
        assertEquals("$germanyHost/v3/echo", req.uri().toString())
        assertEquals(germany, req.header("norbix-project-id"))

        api.transport.config.projectId = "p1"
        req = request(api.transport)
        assertEquals("https://api.norbix.ai/v3/echo", req.uri().toString())
        assertEquals("p1", req.header("norbix-project-id"))
    }

    @Test
    fun theSocialSignInLinkStaysOnTheSharedHost() {
        val url = NorbixApi(projectId = virginia, apiKey = "k").membership.socialSignInUrl("google")
        assertEquals("https://api.norbix.ai/v3/membership/auth/social/google?projectId=$virginia", url)
    }

    // ── with a region ───────────────────────────────────────────────────────

    @Test
    fun withARegionTheApiHostHasNoRegionLabelAndTheHubIsRegional() {
        val api = NorbixApi(projectId = germany, apiKey = "k", region = "nb-eu-germany")
        val req = request(api.transport)
        assertEquals("$germanyHost/v3/echo", req.uri().toString())
        assertEquals("nb-eu-germany", req.header("nb-region"))
        assertEquals(germany, req.header("norbix-project-id"))

        val hub = NorbixHub(projectId = germany, apiKey = "k", region = "nb-eu-germany")
        val hubReq = request(hub.transport)
        assertEquals("https://nb-eu-germany.hub.norbix.ai/v3/echo", hubReq.uri().toString())
        assertEquals("nb-eu-germany", hubReq.header("nb-region"))
    }

    @Test
    fun setRegionNeverMovesAProjectOffItsOwnHost() {
        val api = NorbixApi(projectId = germany, apiKey = "k")

        api.setRegion("nb-eu-germany")
        var req = request(api.transport)
        assertEquals("$germanyHost/v3/echo", req.uri().toString())
        assertEquals("nb-eu-germany", req.header("nb-region"))

        api.setRegion(null)
        req = request(api.transport)
        assertEquals("$germanyHost/v3/echo", req.uri().toString())
        assertNull(req.header("nb-region"))
    }

    @Test
    fun withARegionAnIdThatDoesNotDecodeKeepsTheRegionalHost() {
        val api = NorbixApi(projectId = "p1", apiKey = "k", region = "nb-eu-germany")
        val req = request(api.transport)
        assertEquals("https://nb-eu-germany.api.norbix.ai/v3/echo", req.uri().toString())
        assertEquals("nb-eu-germany", req.header("nb-region"))
    }

    @Test
    fun theSocialSignInLinkUsesTheRegionalSharedHost() {
        val url = NorbixApi(projectId = germany, apiKey = "k", region = "nb-eu-germany")
            .membership.socialSignInUrl("google")
        assertTrue(url.startsWith("https://nb-eu-germany.api.norbix.ai/v3/membership/auth/social/google?"), url)
    }

    // ── another address is used as given ────────────────────────────────────

    @Test
    fun anAddressThatServesNoProjectHostsIsUsedAsGiven() {
        val api = NorbixApi(
            projectId = virginia, apiKey = "k", region = "nb-eu-germany",
            baseUrl = "https://api.norbix.io",
        )
        var req = request(api.transport)
        assertEquals("https://api.norbix.io/v3/echo", req.uri().toString())
        assertEquals(virginia, req.header("norbix-project-id"))
        assertEquals("nb-eu-germany", req.header("nb-region"))
        assertEquals("https://api.norbix.io", api.getBaseUrl())

        api.transport.config.projectId = germany
        api.setRegion(null)
        req = request(api.transport)
        assertEquals("https://api.norbix.io/v3/echo", req.uri().toString())

        assertTrue(api.membership.socialSignInUrl("google").startsWith("https://api.norbix.io/"))
    }

    @Test
    fun aBaseUrlSetByHandOnTheTransportFollowsTheSameRule() {
        val api = NorbixApi(projectId = virginia, apiKey = "k")
        api.transport.config.baseUrl = "http://localhost:5002"
        assertEquals("http://localhost:5002/v3/echo", request(api.transport).uri().toString())
        api.transport.config.baseUrl = "https://nb-eu-germany.api.norbix.ai"
        assertEquals("$virginiaHost/v3/echo", request(api.transport).uri().toString())
    }

    @Test
    fun aPlainOwnDomainStagingAndLocalhostAreUsedAsGiven() {
        listOf(
            "https://api.customer.com",
            "https://api.norbix.io",
            "http://localhost:5002",
            "http://api.norbix.ai",
        ).forEach { base ->
            val api = NorbixApi(projectId = virginia, apiKey = "k", baseUrl = base)
            assertEquals("$base/v3/echo", request(api.transport).uri().toString(), base)
            assertEquals(base, api.getBaseUrl(), base)
        }
    }

    // ── a norbix.ai API address written out ─────────────────────────────────

    @Test
    fun aNorbixAiApiAddressWrittenOutGoesToTheProjectHost() {
        val api = NorbixApi(projectId = virginia, apiKey = "k", baseUrl = "https://api.norbix.ai")
        assertEquals("$virginiaHost/v3/echo", request(api.transport).uri().toString())

        val regional = NorbixApi(projectId = germany, apiKey = "k", baseUrl = "https://nb-eu-germany.api.norbix.ai")
        val req = request(regional.transport)
        assertEquals("$germanyHost/v3/echo", req.uri().toString())
        assertEquals(germany, req.header("norbix-project-id"))
        assertTrue(
            regional.membership.socialSignInUrl("google")
                .startsWith("https://nb-eu-germany.api.norbix.ai/v3/membership/auth/social/google?"),
        )
    }

    // ── an install on its own domain ────────────────────────────────────────

    private val template = "https://{projectHostLabel}.api.customer.com"

    @Test
    fun aTemplateIsFilledAndHostAndHeaderMoveTogether() {
        val api = NorbixApi(projectId = virginia, apiKey = "k", baseUrl = template)
        var req = request(api.transport)
        assertEquals("https://pr-022c4aca9f9e4df787ab0a20c83c44b6.api.customer.com/v3/echo", req.uri().toString())
        assertEquals(virginia, req.header("norbix-project-id"))

        api.transport.config.projectId = germany
        req = request(api.transport)
        assertEquals("https://pr-184336d00e2141c3be5138e8dcf52e81.api.customer.com/v3/echo", req.uri().toString())
        assertEquals(germany, req.header("norbix-project-id"))

        assertEquals(
            "https://api.customer.com/v3/membership/auth/social/google?projectId=$germany",
            api.membership.socialSignInUrl("google"),
        )

        val hub = NorbixHub(projectId = virginia, apiKey = "k", baseUrl = "https://hub.customer.com")
        assertEquals("https://hub.customer.com/v3/echo", request(hub.transport).uri().toString())
    }

    @Test
    fun aTemplateWithAPort() {
        val api = NorbixApi(projectId = virginia, apiKey = "k", baseUrl = "http://{projectHostLabel}.api.local.norbix.test:8443")
        assertEquals(
            "http://pr-022c4aca9f9e4df787ab0a20c83c44b6.api.local.norbix.test:8443/v3/echo",
            request(api.transport).uri().toString(),
        )
    }

    @Test
    fun aTemplateWithAnIdThatIsNotANorbixIdLosesTheLabel() {
        val api = NorbixApi(projectId = "p1", apiKey = "k", baseUrl = template)
        assertEquals("https://api.customer.com/v3/echo", request(api.transport).uri().toString())
        assertEquals("https://api.customer.com", api.getBaseUrl())
    }

    @Test
    fun aPastedProjectHostFollowsTheClientsProject() {
        val api = NorbixApi(
            projectId = germany, apiKey = "k",
            baseUrl = "https://pr-022c4aca9f9e4df787ab0a20c83c44b6.api.customer.com",
        )
        assertEquals(
            "https://pr-184336d00e2141c3be5138e8dcf52e81.api.customer.com/v3/echo",
            request(api.transport).uri().toString(),
        )
        assertTrue(api.membership.socialSignInUrl("google").startsWith("https://api.customer.com/v3/"))
    }

    // ── the helper itself ───────────────────────────────────────────────────

    @Test
    fun projectApiBaseUrlTable() {
        val label = "pr-022c4aca9f9e4df787ab0a20c83c44b6"
        // base URL → project, shared
        val cases = listOf(
            Triple("https://api.norbix.ai", "https://$label.api.norbix.ai", "https://api.norbix.ai"),
            Triple("https://api.norbix.ai/v3", "https://$label.api.norbix.ai/v3", "https://api.norbix.ai/v3"),
            Triple("https://api.norbix.ai/", "https://$label.api.norbix.ai/", "https://api.norbix.ai/"),
            Triple("https://API.Norbix.AI", "https://$label.api.norbix.ai", "https://API.Norbix.AI"),
            Triple("https://api.norbix.ai:8443/v3", "https://$label.api.norbix.ai:8443/v3", "https://api.norbix.ai:8443/v3"),
            Triple("https://nb-eu-germany.api.norbix.ai", "https://$label.api.norbix.ai", "https://nb-eu-germany.api.norbix.ai"),
            Triple("https://a.b.api.norbix.ai", "https://a.b.api.norbix.ai", "https://a.b.api.norbix.ai"),
            Triple("http://api.norbix.ai", "http://api.norbix.ai", "http://api.norbix.ai"),
            Triple("https://{projectHostLabel}.api.customer.com/v3", "https://$label.api.customer.com/v3", "https://api.customer.com/v3"),
            Triple(
                "https://PR-184336D00E2141C3BE5138E8DCF52E81.api.customer.com/v3",
                "https://$label.api.customer.com/v3",
                "https://api.customer.com/v3",
            ),
            Triple(
                "https://pr-184336d00e2141c3be5138e8dcf52e81.api.norbix.ai",
                "https://$label.api.norbix.ai",
                "https://api.norbix.ai",
            ),
            Triple("https://pr-1234.api.customer.com", "https://pr-1234.api.customer.com", "https://pr-1234.api.customer.com"),
            Triple("http://[::1]:5002", "http://[::1]:5002", "http://[::1]:5002"),
            Triple("http://localhost:5002", "http://localhost:5002", "http://localhost:5002"),
            Triple("not a url", "not a url", "not a url"),
            Triple("", "", ""),
            Triple("https://", "https://", "https://"),
        )
        cases.forEach { (base, project, shared) ->
            assertEquals(ProjectApiBaseUrl(project, shared), projectApiBaseUrl(base, virginia), base)
        }
    }

    @Test
    fun projectApiBaseUrlWithNoLabelGivesTheSharedAddress() {
        listOf(null, "p1", "proj_123").forEach { id ->
            assertEquals(
                ProjectApiBaseUrl("https://nb-eu-germany.api.norbix.ai", "https://nb-eu-germany.api.norbix.ai"),
                projectApiBaseUrl("https://nb-eu-germany.api.norbix.ai", id),
            )
            assertEquals(
                ProjectApiBaseUrl("https://api.customer.com", "https://api.customer.com"),
                projectApiBaseUrl("https://{projectHostLabel}.api.customer.com", id),
            )
            assertEquals(
                ProjectApiBaseUrl("https://api.customer.com", "https://api.customer.com"),
                projectApiBaseUrl("https://pr-184336d00e2141c3be5138e8dcf52e81.api.customer.com", id),
            )
        }
        assertEquals("{projectHostLabel}", PROJECT_HOST_LABEL_PLACEHOLDER)
    }
}
