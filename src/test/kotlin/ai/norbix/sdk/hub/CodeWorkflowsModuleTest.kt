package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * `hub.code` — the 26 Workflows Beta routes of the gateway contract
 * (Code.Workflows.md §7), one test per method, against a throw-away local
 * server. Never a real gateway. Each test checks the verb, the resolved path,
 * and where the parameters go (path tokens removed; query for GET / DELETE,
 * JSON body for POST / PUT). The two signed resume-link routes are also sent
 * with no credentials at all.
 */
class CodeWorkflowsModuleTest {

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
        block: (NorbixHub, Recorder) -> Unit,
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
            block(NorbixHub(projectId = "proj", bearerToken = bearerToken, baseUrl = base), rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun getCodeWorkflows() = withServer { hub, rec ->
        hub.code.getCodeWorkflows(mapOf("isEnabled" to true, "pageSize" to 20, "startingAfter" to "wf_0"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows", rec.path)
        assertEquals("isEnabled=true&pageSize=20&startingAfter=wf_0", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun saveCodeWorkflow() = withServer { hub, rec ->
        hub.code.saveCodeWorkflow(mapOf("definition" to mapOf("name" to "Order approval", "trigger" to mapOf("kind" to "manual"), "steps" to listOf(mapOf("id" to "approve", "kind" to "approval")))))
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/workflows", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("definition" to mapOf("name" to "Order approval", "trigger" to mapOf("kind" to "manual"), "steps" to listOf(mapOf("id" to "approve", "kind" to "approval"))))), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflow() = withServer { hub, rec ->
        hub.code.getCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd", "pinnedVersion" to 3))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd", rec.path)
        assertEquals("pinnedVersion=3", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteCodeWorkflow() = withServer { hub, rec ->
        hub.code.deleteCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun enableCodeWorkflow() = withServer { hub, rec ->
        hub.code.enableCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/enable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableCodeWorkflow() = withServer { hub, rec ->
        hub.code.disableCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/disable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun publishCodeWorkflow() = withServer { hub, rec ->
        hub.code.publishCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/publish", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowDraft() = withServer { hub, rec ->
        hub.code.getCodeWorkflowDraft(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/draft", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun discardCodeWorkflowDraft() = withServer { hub, rec ->
        hub.code.discardCodeWorkflowDraft(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/draft", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowVersions() = withServer { hub, rec ->
        hub.code.getCodeWorkflowVersions(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/versions", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowVersionDiff() = withServer { hub, rec ->
        hub.code.getCodeWorkflowVersionDiff(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd", "fromVersion" to 1, "toVersion" to 2))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/versions/diff", rec.path)
        assertEquals("fromVersion=1&toVersion=2", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun validateCodeWorkflow() = withServer { hub, rec ->
        hub.code.validateCodeWorkflow(mapOf("definition" to mapOf("name" to "Order approval", "trigger" to mapOf("kind" to "manual"), "steps" to listOf(mapOf("id" to "approve", "kind" to "approval")))))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/validate", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("definition" to mapOf("name" to "Order approval", "trigger" to mapOf("kind" to "manual"), "steps" to listOf(mapOf("id" to "approve", "kind" to "approval"))))), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowSchema() = withServer { hub, rec ->
        hub.code.getCodeWorkflowSchema()
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/schema", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun enableCodeWorkflows() = withServer { hub, rec ->
        hub.code.enableCodeWorkflows()
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/workflows/enable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableCodeWorkflows() = withServer { hub, rec ->
        hub.code.disableCodeWorkflows()
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/workflows/disable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun invokeCodeWorkflow() = withServer { hub, rec ->
        hub.code.invokeCodeWorkflow(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd", "payload" to mapOf("orderId" to "ord_1"), "waitSeconds" to 5, "runVersion" to "draft"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/invoke", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("payload" to mapOf("orderId" to "ord_1"), "waitSeconds" to 5, "runVersion" to "draft")), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowRuns() = withServer { hub, rec ->
        hub.code.getCodeWorkflowRuns(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd", "status" to "failed", "from" to "2026-10-01T00:00:00Z", "to" to "2026-10-27T00:00:00Z", "pageSize" to 10))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/runs", rec.path)
        assertEquals("status=failed&from=2026-10-01T00:00:00Z&to=2026-10-27T00:00:00Z&pageSize=10", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowWaitingRuns() = withServer { hub, rec ->
        hub.code.getCodeWorkflowWaitingRuns(mapOf("status" to "waiting", "waitingKind" to "approval", "assignee" to "me", "workflowId" to "wf_1p4R3gTobGZpD6fXvHT4rd", "key" to "order-42", "pageSize" to 25))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/runs", rec.path)
        assertEquals("status=waiting&waitingKind=approval&assignee=me&workflowId=wf_1p4R3gTobGZpD6fXvHT4rd&key=order-42&pageSize=25", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowRun() = withServer { hub, rec ->
        hub.code.getCodeWorkflowRun(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeWorkflowRunLogs() = withServer { hub, rec ->
        hub.code.getCodeWorkflowRunLogs(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD", "stepId" to "approve", "level" to "error", "pageSize" to 50))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD/logs", rec.path)
        assertEquals("stepId=approve&level=error&pageSize=50", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun resumeCodeWorkflowRun() = withServer { hub, rec ->
        hub.code.resumeCodeWorkflowRun(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD", "stepId" to "approve", "decision" to "approved", "payload" to mapOf("note" to "ok")))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD/resume", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("stepId" to "approve", "decision" to "approved", "payload" to mapOf("note" to "ok"))), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun resumeCodeWorkflowRunByKey() = withServer { hub, rec ->
        hub.code.resumeCodeWorkflowRunByKey(mapOf("id" to "wf_1p4R3gTobGZpD6fXvHT4rd", "key" to "order-42", "stepId" to "approve", "decision" to "rejected", "payload" to mapOf("note" to "no")))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/wf_1p4R3gTobGZpD6fXvHT4rd/resume", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("key" to "order-42", "stepId" to "approve", "decision" to "rejected", "payload" to mapOf("note" to "no"))), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun retryCodeWorkflowRunStep() = withServer { hub, rec ->
        hub.code.retryCodeWorkflowRunStep(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD", "stepId" to "charge"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD/retry", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("stepId" to "charge")), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun cancelCodeWorkflowRun() = withServer { hub, rec ->
        hub.code.cancelCodeWorkflowRun(mapOf("runId" to "wfr_7Kq2mN8pL3sT5vX9yB1cD", "reason" to "duplicate order"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/runs/wfr_7Kq2mN8pL3sT5vX9yB1cD/cancel", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("reason" to "duplicate order")), gson.fromJson(rec.body, JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun openCodeWorkflowResumeLink() = withServer { hub, rec ->
        hub.code.openCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun useCodeWorkflowResumeLink() = withServer { hub, rec ->
        hub.code.useCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    /** A signed resume link opens with the token alone: no credentials, no Authorization header. */
    @Test
    fun openCodeWorkflowResumeLinkWithoutCredentials() = withServer(bearerToken = null) { hub, rec ->
        hub.code.openCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertNull(rec.auth)
    }

    /** Using a signed resume link needs no sign-in either. */
    @Test
    fun useCodeWorkflowResumeLinkWithoutCredentials() = withServer(bearerToken = null) { hub, rec ->
        hub.code.useCodeWorkflowResumeLink(mapOf("token" to "wrl_signed-abc"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/workflows/resume/wrl_signed-abc", rec.path)
        assertEquals("", rec.body)
        assertNull(rec.auth)
    }
}
