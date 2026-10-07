package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Every wave-3 route on `account` and the method that calls it, checked
 * against a throw-away local server (verb, resolved path, auth and project
 * headers). Never a real gateway, never a real provider.
 */
class AccountAiRoutesTest {

    private class Case(val name: String, val verb: String, val path: String, val call: (NorbixHub) -> Any?)

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
            Case("getProjectAiSettings", "GET", "/v3/account/projects/projectId1/ai/settings") { c -> c.account.getProjectAiSettings(mapOf("projectId" to "projectId1", "probe" to "value")) },
            Case("updateProjectAiSettings", "PUT", "/v3/account/projects/projectId1/ai/settings") { c -> c.account.updateProjectAiSettings(mapOf("projectId" to "projectId1", "probe" to "value")) },
            Case("createProjectAiAssistant", "POST", "/v3/account/projects/projectId1/ai/assistants") { c -> c.account.createProjectAiAssistant(mapOf("projectId" to "projectId1", "probe" to "value")) },
            Case("updateProjectAiAssistant", "PUT", "/v3/account/projects/projectId1/ai/assistants/assistantId1") { c -> c.account.updateProjectAiAssistant(mapOf("projectId" to "projectId1", "assistantId" to "assistantId1", "probe" to "value")) },
            Case("deleteProjectAiAssistant", "DELETE", "/v3/account/projects/projectId1/ai/assistants/assistantId1") { c -> c.account.deleteProjectAiAssistant(mapOf("projectId" to "projectId1", "assistantId" to "assistantId1", "probe" to "value")) },
            Case("getProjectAiUsage", "GET", "/v3/account/projects/projectId1/ai/usage") { c -> c.account.getProjectAiUsage(mapOf("projectId" to "projectId1", "probe" to "value")) },
            Case("setAdminPortalEnabled", "PUT", "/v3/account/projects/projectId1/admin-portal/enabled") { c -> c.account.setAdminPortalEnabled(mapOf("projectId" to "projectId1", "probe" to "value")) },
    )

    @Test
    fun everyRouteHitsTheExpectedPathAndVerb() {
        assertEquals(7, cases.size)
        for (case in cases) {
            withServer { base, rec ->
                val client = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
                case.call(client)
                assertEquals(case.verb, rec.method, case.name)
                assertEquals(case.path, rec.path, case.name)
                assertEquals("Bearer token", rec.auth, case.name)
                assertEquals("proj", rec.projectId, case.name)
            }
        }
    }
}
