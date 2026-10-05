package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * The signed-in team member's own record (`GET /account/me`) and own phone
 * number (`PUT /account/me/phone`) on `account`, checked against a throw-away
 * local server (verb, resolved path, auth header, body). Never a real gateway.
 */
class AccountMeRoutesTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var body: String? = null
        var auth: String? = null
    }

    private fun withServer(block: (NorbixHub, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = """{"responseStatus":{"isSuccess":true}}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            block(NorbixHub(projectId = "proj", bearerToken = "token", accountId = "acc", baseUrl = base), rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun getMyAccountUserProfile() = withServer { hub, rec ->
        hub.account.getMyAccountUserProfile()
        assertEquals("GET", rec.method)
        assertEquals("/v2/account/me", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun updateMyAccountUserPhoneSendsThePhoneInThePutBody() = withServer { hub, rec ->
        hub.account.updateMyAccountUserPhone(mapOf("phone" to "+37060000000"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/account/me/phone", rec.path)
        assertEquals("Bearer token", rec.auth)
        @Suppress("UNCHECKED_CAST")
        val body = Gson().fromJson(rec.body, Map::class.java) as Map<String, Any?>
        assertEquals(mapOf("phone" to "+37060000000"), body)
    }
}
