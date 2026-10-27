package ai.norbix.sdk.api

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * `api.code` — the four Workflows Beta routes a project user calls on the data
 * plane (Code.Workflows.md §7), one test per method, against a throw-away
 * local server. Never a real gateway. The two signed resume-link routes are
 * also sent with no credentials at all.
 */
class CodeModuleTest {

    private val gson = Gson()

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String? = null
        var auth: String? = null
    }

    private fun withServer(
        bearerToken: String? = "token",
        block: (NorbixApi, Recorder) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.query
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = "{}".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            block(NorbixApi(projectId = "proj", bearerToken = bearerToken, baseUrl = base), rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun moduleSurface() {
        assertNotNull(NorbixApi(projectId = "proj", bearerToken = "token").code)
    }

    @Test
    fun getCodeWorkflowWaitingRuns() = withServer { api, rec ->
        api.code.getCodeWorkflowWaitingRuns(mapOf("status" to "waiting", "waitingKind" to "approval", "assignee" to "me", "workflowId" to "wf_1p4R3gTobGZpD6fXvHT4rd", "key" to "order-42", "pageSize" to 25))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/runs", rec.path)
        assertEquals("status=waiting&waitingKind=approval&assignee=me&workflowId=wf_1p4R3gTobGZpD6fXvHT4rd&key=order-42&pageSize=25", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun resumeCodeWorkflowRun() = withServer { api, rec ->
        api.code.resumeCodeWorkflowRun(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD", "stepId" to "approve", "decision" to "approved", "payload" to mapOf("note" to "ok")))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD/resume", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("stepId" to "approve", "decision" to "approved", "payload" to mapOf("note" to "ok"))), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun openCodeWorkflowResumeLink() = withServer { api, rec ->
        api.code.openCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun useCodeWorkflowResumeLink() = withServer { api, rec ->
        api.code.useCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    /** A signed resume link opens with the token alone: no credentials, no Authorization header. */
    @Test
    fun openCodeWorkflowResumeLinkWithoutCredentials() = withServer(bearerToken = null) { api, rec ->
        api.code.openCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.auth)
    }

    /** Using a signed resume link needs no sign-in either. */
    @Test
    fun useCodeWorkflowResumeLinkWithoutCredentials() = withServer(bearerToken = null) { api, rec ->
        api.code.useCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertEquals("", rec.body)
        assertNull(rec.auth)
    }
}
