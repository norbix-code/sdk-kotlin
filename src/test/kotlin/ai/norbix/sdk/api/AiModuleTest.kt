package ai.norbix.sdk.api

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Every wave-3 route on `ai` and the method that calls it, checked
 * against a throw-away local server (verb, resolved path, auth and project
 * headers). Never a real gateway, never a real provider.
 */
class AiModuleTest {

    private class Case(val name: String, val verb: String, val path: String, val call: (NorbixApi) -> Any?)

    private class Recorder {
        var path: String? = null
        var method: String? = null
        var auth: String? = null
        var projectId: String? = null
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.method = ex.requestMethod
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.projectId = ex.requestHeaders.getFirst("X-CM-ProjectId")
            ex.requestBody.readAllBytes()
            val bytes = """{"responseStatus":{"isSuccess":true}}""".toByteArray()
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

    private val cases = listOf(
            Case("getEndUserChatAvailability", "GET", "/v3/ai/chat/availability") { c -> c.ai.getEndUserChatAvailability(mapOf("probe" to "value")) },
            Case("listEndUserChatSessions", "GET", "/v3/ai/chat/sessions") { c -> c.ai.listEndUserChatSessions(mapOf("probe" to "value")) },
            Case("createEndUserChatSession", "POST", "/v3/ai/chat/sessions") { c -> c.ai.createEndUserChatSession(mapOf("probe" to "value")) },
            Case("getEndUserChatSession", "GET", "/v3/ai/chat/sessions/sessionId1") { c -> c.ai.getEndUserChatSession(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("renameEndUserChatSession", "PATCH", "/v3/ai/chat/sessions/sessionId1") { c -> c.ai.renameEndUserChatSession(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("deleteEndUserChatSession", "DELETE", "/v3/ai/chat/sessions/sessionId1") { c -> c.ai.deleteEndUserChatSession(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("pinEndUserChatSession", "PUT", "/v3/ai/chat/sessions/sessionId1/pin") { c -> c.ai.pinEndUserChatSession(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("archiveEndUserChatSession", "PUT", "/v3/ai/chat/sessions/sessionId1/archive") { c -> c.ai.archiveEndUserChatSession(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("getEndUserChatEntries", "GET", "/v3/ai/chat/sessions/sessionId1/entries") { c -> c.ai.getEndUserChatEntries(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("setEndUserChatEntryFeedback", "PUT", "/v3/ai/chat/sessions/sessionId1/entries/entryId1/feedback") { c -> c.ai.setEndUserChatEntryFeedback(mapOf("SessionId" to "sessionId1", "EntryId" to "entryId1", "probe" to "value")) },
            Case("listEndUserChatAttachments", "GET", "/v3/ai/chat/sessions/sessionId1/attachments") { c -> c.ai.listEndUserChatAttachments(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("uploadEndUserChatAttachment", "POST", "/v3/ai/chat/sessions/sessionId1/attachments") { c -> c.ai.uploadEndUserChatAttachment(mapOf("SessionId" to "sessionId1", "probe" to "value")) },
            Case("deleteEndUserChatAttachment", "DELETE", "/v3/ai/chat/attachments/attachmentId1") { c -> c.ai.deleteEndUserChatAttachment(mapOf("AttachmentId" to "attachmentId1", "probe" to "value")) },
            Case("listEndUserChatMemory", "GET", "/v3/ai/chat/memory") { c -> c.ai.listEndUserChatMemory(mapOf("probe" to "value")) },
            Case("forgetEndUserChatMemory", "DELETE", "/v3/ai/chat/memory/noteId1") { c -> c.ai.forgetEndUserChatMemory(mapOf("NoteId" to "noteId1", "probe" to "value")) },
            Case("startEndUserChatTurn", "POST", "/v3/ai/chat/turn") { c -> c.ai.startEndUserChatTurn(mapOf("probe" to "value")) },
    )

    @Test
    fun everyRouteHitsTheExpectedPathAndVerb() {
        assertEquals(16, cases.size)
        for (case in cases) {
            withServer { base, rec ->
                val client = NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = base)
                case.call(client)
                assertEquals(case.verb, rec.method, case.name)
                assertEquals(case.path, rec.path, case.name)
                assertEquals("Bearer token", rec.auth, case.name)
                assertEquals("proj", rec.projectId, case.name)
            }
        }
    }
}
