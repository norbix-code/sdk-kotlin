package ai.norbix.sdk.api

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.net.URI
import java.net.URLDecoder
import java.nio.charset.StandardCharsets
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Project social sign-in and link identity (gateway 3fb6f5569): the start URL
 * builder, the code exchange and the two link calls. Each call test pins the
 * exact verb, path and body against a throw-away local server.
 */
class MembershipSocialTest {

    private class Recorder {
        var path: String? = null
        var method: String? = null
        var auth: String? = null
        var project: String? = null
        var body: Map<*, *>? = null
    }

    private fun withServer(answer: String, block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.rawPath
            rec.method = ex.requestMethod
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.project = ex.requestHeaders.getFirst("norbix-project-id")
            val raw = ex.requestBody.readBytes().toString(StandardCharsets.UTF_8)
            rec.body = if (raw.isBlank()) null else Gson().fromJson(raw, Map::class.java)
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    private fun api(env: String = "PROD", base: String = "https://api.test") =
        NorbixApi(projectId = "pr_1", bearerToken = "jwt-1", baseUrl = base, env = env)

    @Test
    fun socialSignInUrlCarriesTheProjectIdAndNoEnvForProd() {
        assertEquals(
            "https://api.test/v3/membership/auth/social/google?projectId=pr_1",
            api().membership.socialSignInUrl("google"),
        )
    }

    @Test
    fun socialSignInUrlEncodesModeAndReturnUrl() {
        val url = api().membership.socialSignInUrl(
            "github",
            mode = "Admin portal & app",
            returnUrl = "https://app.example.com/oauth/callback?next=/a b&x=1",
        )
        assertEquals(
            "https://api.test/v3/membership/auth/social/github?projectId=pr_1" +
                "&mode=Admin+portal+%26+app" +
                "&returnUrl=https%3A%2F%2Fapp.example.com%2Foauth%2Fcallback%3Fnext%3D%2Fa+b%26x%3D1",
            url,
        )
        val query = URI(url).rawQuery.split("&").associate {
            val (k, v) = it.split("=", limit = 2)
            k to URLDecoder.decode(v, StandardCharsets.UTF_8)
        }
        assertEquals("Admin portal & app", query["mode"])
        assertEquals("https://app.example.com/oauth/callback?next=/a b&x=1", query["returnUrl"])
    }

    @Test
    fun socialSignInUrlPutsANonProdEnvInTheQuery() {
        assertEquals(
            "https://api.test/v3/membership/auth/social/okta?projectId=pr_1&env=TEST",
            api(env = "TEST").membership.socialSignInUrl("okta"),
        )
    }

    @Test
    fun socialSignInUrlEscapesTheProvider() {
        assertEquals(
            "https://api.test/v3/membership/auth/social/a%2Fb?projectId=pr_1",
            api().membership.socialSignInUrl("a/b"),
        )
    }

    @Test
    fun exchangeSocialSignInCodePostsTheCode() {
        withServer("""{"bearerToken":"a.b.c","userId":"usr_1"}""") { base, rec ->
            val res = api(base = base).membership.exchangeSocialSignInCode(
                mapOf("provider" to "google", "code" to "one-time"),
            )
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/auth/social/google/exchange", rec.path)
            assertEquals(mapOf("code" to "one-time"), rec.body)
            assertEquals("pr_1", rec.project)
            assertNull(rec.auth, "an old JWT on the client must not be sent")
            assertEquals("a.b.c", (res as Map<*, *>)["bearerToken"])
        }
    }

    /**
     * The gateway judges any token it gets, even on this open route: a JWT from
     * before a password change is refused 401. The exchange is how a user signs
     * in again, so a client with an API key sends no credentials either.
     */
    @Test
    fun exchangeSocialSignInCodeSendsNoApiKey() {
        withServer("""{"bearerToken":"a.b.c"}""") { base, rec ->
            NorbixApi(projectId = "pr_1", apiKey = "ak-1", baseUrl = base)
                .membership.exchangeSocialSignInCode(mapOf("provider" to "google", "code" to "c"))
            assertEquals("/v3/membership/auth/social/google/exchange", rec.path)
            assertNull(rec.auth)
        }
    }

    @Test
    fun startLinkIdentityPostsProviderModeAndReturnUrl() {
        withServer("""{"authorizeUrl":"https://accounts.example/authorize"}""") { base, rec ->
            api(base = base).membership.startLinkIdentity(
                mapOf(
                    "userId" to "usr_1",
                    "provider" to "google",
                    "mode" to "app",
                    "returnUrl" to "https://app.example.com/settings",
                ),
            )
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/auth/usr_1/link-identity/start", rec.path)
            assertEquals(
                mapOf("provider" to "google", "mode" to "app", "returnUrl" to "https://app.example.com/settings"),
                rec.body,
            )
            assertEquals("Bearer jwt-1", rec.auth)
        }
    }

    @Test
    fun linkIdentityPostsTheLinkCode() {
        withServer("{}") { base, rec ->
            api(base = base).membership.linkIdentity(mapOf("userId" to "usr_1", "code" to "link-code"))
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/auth/usr_1/link-identity", rec.path)
            assertEquals(mapOf("code" to "link-code"), rec.body)
            assertEquals("Bearer jwt-1", rec.auth)
        }
    }
}
