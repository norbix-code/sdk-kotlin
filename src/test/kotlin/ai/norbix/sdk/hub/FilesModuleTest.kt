package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FilesModuleTest {

    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.files)
    }

    /**
     * Route + verb + body checks against a throw-away local server — the same
     * fake-transport pattern the regions tests use. Never a real gateway.
     */
    @Test
    fun filesRoutesAndBodies() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["method"] = ex.requestMethod
            seen["path"] = ex.requestURI.path
            seen["query"] = ex.requestURI.query
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            seen["auth"] = ex.requestHeaders.getFirst("Authorization")
            val body = "{}".toByteArray()
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)

            hub.files.testFilesIntegration(
                mapOf("provider" to "AwsS3", "settings" to mapOf("bucket" to "b")),
            )
            assertEquals("POST", seen["method"])
            assertEquals("/v2/files/integrations/test", seen["path"])
            assertTrue(seen["body"]!!.contains("\"provider\":\"AwsS3\""), seen["body"]!!)

            hub.files.makeFilePublic(
                mapOf("filesIntegrationId" to "nbin_1", "path" to "docs/a.pdf"),
            )
            assertEquals("POST", seen["method"])
            assertEquals("/v2/files/item/public", seen["path"])
            assertTrue(seen["body"]!!.contains("\"path\":\"docs/a.pdf\""), seen["body"]!!)
            // Publishing is a dashboard action: it needs the caller's token.
            // Only reading the resulting link does not.
            assertEquals("Bearer token", seen["auth"])

            hub.files.makeFilePrivate(
                mapOf("filesIntegrationId" to "nbin_1", "path" to "docs/a.pdf"),
            )
            assertEquals("POST", seen["method"])
            assertEquals("/v2/files/item/private", seen["path"])

            hub.files.makeFolderPublic(
                mapOf("filesIntegrationId" to "nbin_1", "path" to "docs"),
            )
            assertEquals("POST", seen["method"])
            assertEquals("/v2/files/folder/public", seen["path"])

            hub.files.makeFolderPrivate(
                mapOf("filesIntegrationId" to "nbin_1", "path" to "docs"),
            )
            assertEquals("POST", seen["method"])
            assertEquals("/v2/files/folder/private", seen["path"])

            // Already present, asserted here so the whole module is covered.
            hub.files.getFolderFiles(mapOf("filesIntegrationId" to "nbin_1", "path" to "docs"))
            assertEquals("GET", seen["method"])
            assertEquals("/v2/files/folder", seen["path"])
            assertTrue(seen["query"]!!.contains("path=docs"), seen["query"]!!)

            hub.files.getFile(mapOf("filesIntegrationId" to "nbin_1", "path" to "docs/a.pdf"))
            assertEquals("/v2/files/item", seen["path"])

            hub.files.deleteFilesIntegration(mapOf("Id" to "nbin_1"))
            assertEquals("DELETE", seen["method"])
            assertEquals("/v2/files/integrations/nbin_1", seen["path"])

            hub.files.setFilesIntegrationAsDefault(mapOf("Id" to "nbin_1"))
            assertEquals("PUT", seen["method"])
            assertEquals("/v2/files/integrations/nbin_1/default", seen["path"])
        } finally {
            server.stop(0)
        }
    }
}
