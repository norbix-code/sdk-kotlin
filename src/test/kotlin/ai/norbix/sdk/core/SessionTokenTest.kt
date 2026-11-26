package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Sessions (D18): the `norbix-session-token` swap and `rememberMe` on login,
 * checked against a throw-away local server. Never a real gateway.
 */
class SessionTokenTest {

    private class Recorder {
        val auths = mutableListOf<String?>()
        var body: String? = null
        /** The value the next answer carries in `norbix-session-token`; null sends no header. */
        var renewed: String? = null
        var status: Int = 200
        var answer: String = """{"responseStatus":{"isSuccess":true}}"""
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.auths += ex.requestHeaders.getFirst("Authorization")
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.renewed?.let { ex.responseHeaders.add(SESSION_TOKEN_HEADER, it) }
            val bytes = rec.answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(rec.status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun headerPresentSwapsTheStoredTokenAndCallsTheCallback() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "new"
        api.membership.getUser(mapOf("id" to "usr_1"))
        assertEquals(listOf("new"), seen)
        assertEquals("new", api.transport.config.bearerToken)

        rec.renewed = null
        api.membership.getUser(mapOf("id" to "usr_1"))
        assertEquals(listOf<String?>("Bearer old", "Bearer new"), rec.auths)
        assertEquals(listOf("new"), seen)
    }

    @Test
    fun headerAbsentLeavesTheTokenAlone() = withServer { base, _ ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        api.membership.getUser(mapOf("id" to "usr_1"))
        assertEquals("old", api.transport.config.bearerToken)
        assertEquals(emptyList<String>(), seen)
    }

    @Test
    fun emptyHeaderIsIgnored() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "  "
        api.membership.getUser(mapOf("id" to "usr_1"))
        assertEquals("old", api.transport.config.bearerToken)
        assertEquals(emptyList<String>(), seen)
    }

    @Test
    fun apiKeyClientNeverSwaps() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", apiKey = "sk_key", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "new"
        api.membership.getUser(mapOf("id" to "usr_1"))
        assertEquals("Bearer sk_key", rec.auths.single())
        assertNull(api.transport.config.bearerToken)
        assertEquals("sk_key", api.transport.config.apiKey)
        assertEquals(emptyList<String>(), seen)
    }

    @Test
    fun perCallTokenNeverSwaps() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "new"
        api.transport.send(
            path = "/{version}/membership/users/{id}",
            method = "GET",
            request = mapOf("id" to "usr_1"),
            bearerToken = "someone-else",
        )
        assertEquals("Bearer someone-else", rec.auths.single())
        assertEquals("old", api.transport.config.bearerToken)
        assertEquals(emptyList<String>(), seen)
    }

    @Test
    fun aRenewalOnAnErrorAnswerIsStillTaken() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val hub = NorbixHub(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "new"
        rec.status = 404
        rec.answer = """{"responseStatus":{"errorCode":"NotFound","message":"No"}}"""
        runCatching { hub.account.getTeamMember("usr_1") }
        assertEquals("new", hub.transport.config.bearerToken)
        assertEquals(listOf("new"), seen)
    }

    @Test
    fun loginSendsRememberMeFalseByDefault() = withServer { base, rec ->
        val api = NorbixApi(projectId = "proj", baseUrl = base)
        rec.answer = """{"bearerToken":"jwt"}"""
        api.login(LoginCredentials("alice@team.io", "secret"))
        @Suppress("UNCHECKED_CAST")
        val body = Gson().fromJson(rec.body, Map::class.java) as Map<String, Any?>
        assertEquals(false, body["rememberMe"])
        assertNull(rec.auths.single())
        assertEquals("jwt", api.transport.config.bearerToken)
    }

    @Test
    fun loginSendsRememberMeTrue() = withServer { base, rec ->
        val api = NorbixApi(projectId = "proj", baseUrl = base)
        rec.answer = """{"bearerToken":"jwt"}"""
        api.login(LoginCredentials("alice@team.io", "secret", rememberMe = true))
        @Suppress("UNCHECKED_CAST")
        val body = Gson().fromJson(rec.body, Map::class.java) as Map<String, Any?>
        assertEquals(true, body["rememberMe"])
    }

    @Test
    fun hubLoginDoesNotSendRememberMe() = withServer { base, rec ->
        val hub = NorbixHub(baseUrl = base)
        rec.answer = """{"bearerToken":"jwt"}"""
        hub.login(LoginCredentials("owner@team.io", "secret", rememberMe = true))
        @Suppress("UNCHECKED_CAST")
        val body = Gson().fromJson(rec.body, Map::class.java) as Map<String, Any?>
        assertEquals(false, body.containsKey("rememberMe"))
    }

    @Test
    fun theLoginAnswerItselfIsNotARenewal() = withServer { base, rec ->
        val seen = mutableListOf<String>()
        val api = NorbixApi(projectId = "proj", bearerToken = "old", baseUrl = base, onSessionToken = { seen += it })
        rec.renewed = "header-token"
        rec.answer = """{"bearerToken":"jwt"}"""
        api.login(LoginCredentials("alice@team.io", "secret"))
        assertEquals("jwt", api.transport.config.bearerToken)
        assertEquals(emptyList<String>(), seen)
    }
}
