package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * The developer MCP endpoint, checked against a throw-away local server:
 * verb, path, the MCP headers going out, and the session id, JSON and SSE
 * coming back. Never a real gateway.
 */
class AccountMcpTest {

    private class Recorder {
        var path: String? = null
        var query: String? = null
        var method: String? = null
        var auth: String? = null
        var accept: String? = null
        var session: String? = null
        var lastEventId: String? = null
        var body: String? = null
    }

    private fun withServer(
        status: Int = 200,
        contentType: String = "application/json",
        answer: String = """{"jsonrpc":"2.0","id":1,"result":{}}""",
        sessionHeader: String? = null,
        block: (NorbixHub, Recorder) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.rawQuery
            rec.method = ex.requestMethod
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.accept = ex.requestHeaders.getFirst("Accept")
            rec.session = ex.requestHeaders.getFirst("Mcp-Session-Id")
            rec.lastEventId = ex.requestHeaders.getFirst("Last-Event-ID")
            rec.body = String(ex.requestBody.readAllBytes())
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", contentType)
            sessionHeader?.let { ex.responseHeaders.add("Mcp-Session-Id", it) }
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block(NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}"), rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun initializeReadsTheSessionIdFromTheAnswerHeader() {
        withServer(sessionHeader = "sess_1") { hub, rec ->
            val res = hub.account.sendMcpMessage(
                message = mapOf("jsonrpc" to "2.0", "id" to 1, "method" to "initialize"),
                toolsets = "ai:campaigns",
            )
            assertEquals("POST", rec.method)
            assertEquals("/v3/account/mcp", rec.path)
            assertEquals("toolsets=ai%3Acampaigns", rec.query)
            assertEquals("Bearer token", rec.auth)
            assertEquals("application/json, text/event-stream", rec.accept)
            assertTrue(rec.body!!.contains("\"method\":\"initialize\""), rec.body)
            assertEquals("sess_1", res.sessionId)
            assertEquals(mapOf("jsonrpc" to "2.0", "id" to 1.0, "result" to emptyMap<String, Any?>()), res.json)
        }
    }

    @Test
    fun aStreamedAnswerIsKeptAsRawSseText() {
        withServer(contentType = "text/event-stream", answer = "id: 1\ndata: {}\n\n") { hub, rec ->
            val res = hub.account.sendMcpMessage(
                message = mapOf("jsonrpc" to "2.0", "id" to 2, "method" to "tools/call"),
                sessionId = "sess_1",
            )
            assertEquals("sess_1", rec.session)
            assertTrue(res.isEventStream)
            assertNull(res.json)
            assertEquals("id: 1\ndata: {}\n\n", res.body)
        }
    }

    @Test
    fun openMcpStreamAsksForSseWithTheSession() {
        withServer(contentType = "text/event-stream", answer = "") { hub, rec ->
            hub.account.openMcpStream(sessionId = "sess_1", lastEventId = "ev_9")
            assertEquals("GET", rec.method)
            assertEquals("/v3/account/mcp", rec.path)
            assertEquals("text/event-stream", rec.accept)
            assertEquals("sess_1", rec.session)
            assertEquals("ev_9", rec.lastEventId)
        }
    }

    @Test
    fun endMcpSessionSendsDeleteWithTheSession() {
        withServer(answer = "") { hub, rec ->
            hub.account.endMcpSession(sessionId = "sess_1")
            assertEquals("DELETE", rec.method)
            assertEquals("/v3/account/mcp", rec.path)
            assertEquals("sess_1", rec.session)
        }
    }

    @Test
    fun anErrorStatusThrows() {
        withServer(status = 400, answer = """{"jsonrpc":"2.0","error":{"code":-32600,"message":"no session"}}""") { hub, _ ->
            val err = assertFailsWith<NorbixError> {
                hub.account.sendMcpMessage(mapOf("jsonrpc" to "2.0", "id" to 3, "method" to "tools/list"))
            }
            assertEquals(400, err.status)
        }
    }
}
