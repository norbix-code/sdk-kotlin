package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import ai.norbix.sdk.api.NorbixApi
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class EnvironmentsModuleTest {

    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.environments)
    }

    @Test
    fun defaultsToProd() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        assertEquals("PROD", client.getEnv())
        assertEquals("PROD", client.transport.config.env)
    }

    @Test
    fun acceptsConfiguredEnv() {
        val client = NorbixHub(projectId = "proj", apiKey = "k", env = "TEST")
        assertEquals("TEST", client.getEnv())
    }

    @Test
    fun setEnvRuntimeAndProdReset() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        client.setEnv("STAGING")
        assertEquals("STAGING", client.getEnv())
        client.setEnv(null)
        assertEquals("PROD", client.getEnv())
    }

    // End-to-end header check against a tiny local server.
    @Test
    fun sendsNorbixEnvHeaderWhenNonProd() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["norbix-env"] = ex.requestHeaders.getFirst("norbix-env")
            val body = "{}".toByteArray()
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"

            // PROD: no header.
            NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base).echo.echo()
            assertNull(seen["norbix-env"])

            // Configured env: header present.
            NorbixApi(projectId = "proj", apiKey = "k", env = "TEST", baseUrl = base).echo.echo()
            assertEquals("TEST", seen["norbix-env"])

            // Per-call override on the environments module.
            NorbixHub(projectId = "proj", apiKey = "k", baseUrl = base)
                .environments.list(env = "STAGING")
            assertEquals("STAGING", seen["norbix-env"])
        } finally {
            server.stop(0)
        }
    }
}
