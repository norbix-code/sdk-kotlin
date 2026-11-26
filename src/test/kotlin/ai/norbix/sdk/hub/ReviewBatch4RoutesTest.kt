package ai.norbix.sdk.hub

import ai.norbix.sdk.api.NorbixApi
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * One team member, one user's AI plan, and the new workflow list filters,
 * checked against a throw-away local server (verb, resolved path, query).
 * Never a real gateway.
 */
class ReviewBatch4RoutesTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.rawQuery
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

    @Test
    fun getTeamMember() = withServer { base, rec ->
        NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base).account.getTeamMember("usr_7")
        assertEquals("GET", rec.method)
        assertEquals("/v3/account/team/member/usr_7", rec.path)
        assertEquals(null, rec.query)
    }

    @Test
    fun hubGetUserAiPlan() = withServer { base, rec ->
        NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base).membership.getUserAiPlan("ct_1")
        assertEquals("GET", rec.method)
        assertEquals("/v3/membership/users/ct_1/ai-plan", rec.path)
    }

    @Test
    fun apiGetUserAiPlan() = withServer { base, rec ->
        NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = base).membership.getUserAiPlan(
            mapOf("userId" to "ct_1", "databaseIntegrationId" to "int_1"),
        )
        assertEquals("GET", rec.method)
        assertEquals("/v3/membership/users/ct_1/ai-plan", rec.path)
        assertEquals("databaseIntegrationId=int_1", rec.query)
    }

    @Test
    fun workflowListAndRunsPassTheNewFilters() = withServer { base, rec ->
        val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
        hub.code.getCodeWorkflows(mapOf("search" to "invoice"))
        assertEquals("/v3/code/workflows", rec.path)
        assertEquals("search=invoice", rec.query)

        hub.code.getCodeWorkflowRuns(mapOf("id" to "wf_1", "workflowVersion" to 3))
        assertEquals("/v3/code/workflows/wf_1/runs", rec.path)
        assertEquals("workflowVersion=3", rec.query)
    }
}
