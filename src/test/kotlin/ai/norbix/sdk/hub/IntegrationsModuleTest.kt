package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class IntegrationsModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.integrations)
    }

    /**
     * GET /{version}/integrations/keyless/setup (gateway feat/keyless-cloud):
     * verb, path, module / cloud / integration id on the query, no body, and the
     * answer, against a throw-away local server — no real gateway.
     */
    @Test
    fun getKeylessIntegrationSetupSendsAGetWithTheQuery() {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var bodyLength = -1
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            method = ex.requestMethod
            path = ex.requestURI.path
            query = ex.requestURI.rawQuery
            bodyLength = ex.requestBody.readBytes().size
            val bytes = """{"integrationId":"int_1","module":"files","cloud":"aws","available":true,"subject":"p/proj/e/PROD/files/i/int_1","audience":"sts.amazonaws.com","script":"aws iam create-role ...","templates":[{"kind":"terraform","fileName":"norbix-files-aws.tf","content":"resource \"aws_iam_role\" ..."}]}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        val res = try {
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            hub.integrations.getKeylessIntegrationSetup(mapOf("module" to "files", "cloud" to "aws", "integrationId" to "int_1"))
        } finally {
            server.stop(0)
        }

        assertEquals("GET", method)
        assertEquals(true, path?.endsWith("/integrations/keyless/setup"))
        val params = query.orEmpty().split("&").toSet()
        assertEquals(true, params.containsAll(setOf("module=files", "cloud=aws", "integrationId=int_1")))
        assertEquals(0, bodyLength)
        @Suppress("UNCHECKED_CAST")
        val answer = res as Map<String, Any?>
        assertEquals("p/proj/e/PROD/files/i/int_1", answer["subject"])
        assertEquals(true, answer["available"])
        val template = (answer["templates"] as List<*>).first() as Map<*, *>
        assertEquals("terraform", template["kind"])
        assertEquals("norbix-files-aws.tf", template["fileName"])
        assertEquals("resource \"aws_iam_role\" ...", template["content"])
    }
}
