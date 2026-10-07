package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Every wave-3 route on `ai` and the method that calls it, checked
 * against a throw-away local server (verb, resolved path, auth and project
 * headers). Never a real gateway, never a real provider.
 */
class AiEmbeddingRoutesTest {

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
            Case("getEmbeddingIntegrations", "GET", "/v3/ai/integrations/embeddings") { c -> c.ai.getEmbeddingIntegrations(mapOf("probe" to "value")) },
            Case("saveEmbeddingIntegration", "POST", "/v3/ai/integrations/embeddings") { c -> c.ai.saveEmbeddingIntegration(mapOf("probe" to "value")) },
            Case("getEmbeddingIntegration", "GET", "/v3/ai/integrations/embeddings/id1") { c -> c.ai.getEmbeddingIntegration(mapOf("Id" to "id1", "probe" to "value")) },
            Case("deleteEmbeddingIntegration", "DELETE", "/v3/ai/integrations/embeddings/id1") { c -> c.ai.deleteEmbeddingIntegration(mapOf("Id" to "id1", "probe" to "value")) },
            Case("testEmbeddingIntegration", "POST", "/v3/ai/integrations/embeddings/id1/test") { c -> c.ai.testEmbeddingIntegration(mapOf("Id" to "id1", "probe" to "value")) },
            Case("setLlmIntegrationAsDefault", "PUT", "/v3/ai/integrations/llms/id1/default") { c -> c.ai.setLlmIntegrationAsDefault(mapOf("Id" to "id1", "probe" to "value")) },
    )

    @Test
    fun everyRouteHitsTheExpectedPathAndVerb() {
        assertEquals(6, cases.size)
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
