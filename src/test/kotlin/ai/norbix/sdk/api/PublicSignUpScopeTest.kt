package ai.norbix.sdk.api

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

/**
 * The gateway does not authenticate public sign-up, password reset and the
 * other sign-in helpers. A client with a project id and no credentials must
 * send those calls — with no Authorization header — instead of refusing
 * them locally. A route that does need sign-in still refuses before sending.
 */
class PublicSignUpScopeTest {

    private class Recorder {
        var calls = 0
        var method: String? = null
        var path: String? = null
        var auth: String? = null
        var hasAuth: Boolean = false
        var projectId: String? = null
        var body: String? = null
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.calls++
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.hasAuth = ex.requestHeaders.containsKey("Authorization")
            rec.projectId = ex.requestHeaders.getFirst("norbix-project-id")
            rec.body = ex.requestBody.readBytes().toString(Charsets.UTF_8)
            val body = """{"result":"ok"}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    /** A client that knows its project and nothing else — no key, no token, whatever the machine's environment holds. */
    private fun anonymousClient(base: String): NorbixApi =
        NorbixApi(projectId = "proj", baseUrl = base).also {
            it.transport.config.apiKey = null
            it.transport.config.bearerToken = null
        }

    @Test
    fun registerWithEmailGoesOutWithoutCredentials() {
        withServer { base, rec ->
            val result = anonymousClient(base).membership.saveEmailUser(
                mapOf("email" to "new@example.com", "password" to "secret1"),
            )

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/auth/register/email", rec.path)
            assertEquals(false, rec.hasAuth, "public sign-up must not send an Authorization header")
            assertNull(rec.auth)
            assertEquals("proj", rec.projectId)
            assertEquals("""{"email":"new@example.com","password":"secret1"}""", rec.body)
            assertEquals(mapOf<String, Any?>("result" to "ok"), result)
        }
    }

    @Test
    fun registerWithUserNameGoesOutWithoutCredentials() {
        withServer { base, rec ->
            anonymousClient(base).membership.saveUserNameUser(
                mapOf("userName" to "newuser", "password" to "secret1"),
            )

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/auth/register/user-name", rec.path)
            assertEquals(false, rec.hasAuth, "public sign-up must not send an Authorization header")
            assertEquals("proj", rec.projectId)
        }
    }

    @Test
    fun passwordResetRequestGoesOutWithoutCredentials() {
        withServer { base, rec ->
            anonymousClient(base).membership.requestPasswordReset(mapOf("email" to "new@example.com"))

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/userauth/password/reset/request", rec.path)
            assertEquals(false, rec.hasAuth, "a password reset request must not send an Authorization header")
            assertEquals("proj", rec.projectId)
        }
    }

    @Test
    fun registerWithEmailCarriesTheApiKeyWhenTheClientHasOne() {
        withServer { base, rec ->
            val client = NorbixApi(projectId = "proj", apiKey = "sk_test", baseUrl = base)
            client.transport.config.bearerToken = null
            client.membership.saveEmailUser(mapOf("email" to "new@example.com", "password" to "secret1"))

            assertEquals(1, rec.calls)
            assertEquals("/v3/membership/auth/register/email", rec.path)
            assertEquals("Bearer sk_test", rec.auth)
            assertEquals("proj", rec.projectId)
        }
    }

    @Test
    fun routeThatNeedsSignInStillRefusesAndSendsNothing() {
        withServer { base, rec ->
            val error = assertFailsWith<NorbixError> {
                anonymousClient(base).membership.blockUser(mapOf("id" to "user-1"))
            }

            assertEquals("NORBIX_NOT_AUTHENTICATED", error.code)
            assertEquals(0, rec.calls, "an authenticated route must not be sent without credentials")
        }
    }
}
