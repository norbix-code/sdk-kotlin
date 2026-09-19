package ai.norbix.sdk.api

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * `api.files.testFilesIntegration` — the API-surface integration test
 * (`POST /{version}/files/{filesIntegrationId}/test`). Checked against a
 * throw-away local server, the same fake-transport pattern as
 * [FilesPublicLinkTest]. Never a real gateway.
 */
class FilesTestIntegrationTest {

    private class Recorder {
        var path: String? = null
        var method: String? = null
        var body: String? = null
        var auth: String? = null
        var projectId: String? = null
    }

    private fun withServer(
        status: Int = 200,
        body: String,
        block: (String, Recorder) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.method = ex.requestMethod
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.projectId = ex.requestHeaders.getFirst("X-CM-ProjectId")
            val bytes = body.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    private val okBody = """
        {
          "items": [
            {"operation": "Upload", "result": "OK"},
            {"operation": "Read",   "result": "OK"},
            {"operation": "List",   "result": "OK"},
            {"operation": "Delete", "result": "Failed", "errors": ["Access denied"]}
          ],
          "responseStatus": {"isSuccess": true}
        }
    """.trimIndent()

    @Test
    fun testFilesIntegrationPostsToTheIntegrationTestRoute() {
        withServer(body = okBody) { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            api.files.testFilesIntegration(mapOf("filesIntegrationId" to "nbin_1"))

            assertEquals("POST", rec.method)
            assertEquals("/v2/files/nbin_1/test", rec.path)
            // Project scope, like every other API Files call.
            assertEquals("Bearer k", rec.auth)
            assertEquals("proj", rec.projectId)
            // The id travels in the path only; nothing is left for the body.
            assertTrue(rec.body.isNullOrEmpty(), "unexpected body: ${rec.body}")
        }
    }

    @Test
    fun testFilesIntegrationParsesTheStepResults() {
        withServer(body = okBody) { base, _ ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val response = api.files.testFilesIntegration(mapOf("filesIntegrationId" to "nbin_1"))

            @Suppress("UNCHECKED_CAST")
            val items = (response as Map<String, Any?>)["items"] as List<Map<String, Any?>>
            assertEquals(4, items.size)
            assertEquals("Upload", items[0]["operation"])
            assertEquals("OK", items[0]["result"])
            assertNull(items[0]["errors"])
            assertEquals("Delete", items[3]["operation"])
            assertEquals("Failed", items[3]["result"])
            assertEquals(listOf("Access denied"), items[3]["errors"])
        }
    }

    @Test
    fun testFilesIntegrationSurfacesAnErrorResponseStatusAsNorbixError() {
        val body = """
            {"responseStatus": {"isSuccess": false,
              "errors": [{"errorCode": "NotFound", "message": "Files integration not found"}]}}
        """.trimIndent()
        withServer(status = 404, body = body) { base, _ ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val error = assertFailsWith<NorbixError> {
                api.files.testFilesIntegration(mapOf("filesIntegrationId" to "nbin_gone"))
            }
            assertEquals(404, error.status)
            assertNotNull(error.details["responseStatus"], "the gateway's responseStatus is kept on the error")
        }
    }

    @Test
    fun testFilesIntegrationRequiresTheIntegrationId() {
        val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = "http://127.0.0.1:1")
        val error = assertFailsWith<NorbixError> { api.files.testFilesIntegration() }
        assertEquals("NORBIX_MISSING_PATH_PARAM", error.code)
    }
}
