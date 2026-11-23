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

    private class Seen {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String = ""
    }

    private fun <T> withServer(status: Int, answer: String, call: (NorbixHub) -> T): Pair<Seen, T> {
        val seen = Seen()
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            seen.method = ex.requestMethod
            seen.path = ex.requestURI.path
            seen.query = ex.requestURI.rawQuery
            seen.body = ex.requestBody.readBytes().decodeToString()
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        return try {
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            seen to call(hub)
        } finally {
            server.stop(0)
        }
    }

    /** GET /{version}/integrations/{IntegrationId}/secrets: the id in the path, env on the query, rows without values. */
    @Test
    fun getIntegrationSecretsPutsTheIdInThePath() {
        val (seen, res) = withServer(
            200,
            """{"result":[{"key":"secretKey","field":"secretKey","isSet":true,"isOptional":false},{"key":"webhookSigningSecret","field":"webhookSigningSecret","isSet":false,"isOptional":true}]}""",
        ) { it.integrations.getIntegrationSecrets("int_1", env = "TEST") }

        assertEquals("GET", seen.method)
        assertEquals(true, seen.path?.endsWith("/integrations/int_1/secrets"))
        assertEquals(true, seen.query.orEmpty().split("&").contains("env=TEST"))
        @Suppress("UNCHECKED_CAST")
        val rows = (res as Map<String, Any?>)["result"] as List<Map<String, Any?>>
        assertEquals(2, rows.size)
        assertEquals(mapOf("key" to "secretKey", "field" to "secretKey", "isSet" to true, "isOptional" to false), rows.first())
    }

    /** POST /{version}/integrations/{IntegrationId}/secrets/remove: the keys in the body. */
    @Test
    fun removeIntegrationSecretsSendsTheKeys() {
        val (seen, res) = withServer(200, """{"id":"int_1"}""") {
            it.integrations.removeIntegrationSecrets("int_1", listOf("webhookSigningSecret"))
        }

        assertEquals("POST", seen.method)
        assertEquals(true, seen.path?.endsWith("/integrations/int_1/secrets/remove"))
        assertEquals(true, seen.body.contains("\"keys\":[\"webhookSigningSecret\"]"))
        assertEquals(false, seen.body.contains("IntegrationId"))
        @Suppress("UNCHECKED_CAST")
        assertEquals("int_1", (res as Map<String, Any?>)["id"])
    }
}
