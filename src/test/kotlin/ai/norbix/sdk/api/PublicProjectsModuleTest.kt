package ai.norbix.sdk.api

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * The public project routes, checked against a throw-away local server:
 * verb, resolved path, and no `Authorization` header even though the client
 * has a key.
 */
class PublicProjectsModuleTest {

    private class Recorder {
        var path: String? = null
        var method: String? = null
        var auth: String? = null
    }

    private fun withServer(body: String, block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.method = ex.requestMethod
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = body.toByteArray()
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
    fun getPublicProjectConfigHitsThePublicRouteWithoutAuth() {
        withServer("""{"displayName":"Shop"}""") { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val res = api.publicProjects.getPublicProjectConfig(projectId = "p1")
            assertEquals("GET", rec.method)
            assertEquals("/v2/public/projects/p1/config", rec.path)
            assertNull(rec.auth, "the public config must be readable before sign-in")
            assertEquals(mapOf("displayName" to "Shop"), res)
        }
    }

    @Test
    fun getPublicProjectLegalHitsThePublicRouteWithoutAuth() {
        withServer("""{"kind":"terms","body":"# Terms","available":true}""") { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            api.publicProjects.getPublicProjectLegal(projectId = "p1", kind = "terms")
            assertEquals("GET", rec.method)
            assertEquals("/v2/public/projects/p1/legal/terms", rec.path)
            assertNull(rec.auth, "a legal page link must work without signing in")
        }
    }
}
