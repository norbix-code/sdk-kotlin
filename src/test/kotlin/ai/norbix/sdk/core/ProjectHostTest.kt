package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import java.net.http.HttpRequest
import kotlin.test.Test
import kotlin.test.assertEquals
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
        assertNull(hub.transport.config.projectHostBaseUrl)
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

    // ── a custom base URL is never rewritten ────────────────────────────────

    @Test
    fun aCustomBaseUrlIsNeverRewritten() {
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
    fun aBaseUrlSetByHandOnTheTransportIsNotRewrittenEither() {
        val api = NorbixApi(projectId = virginia, apiKey = "k")
        api.transport.config.baseUrl = "http://localhost:5002"
        assertEquals("http://localhost:5002/v3/echo", request(api.transport).uri().toString())
    }
}
