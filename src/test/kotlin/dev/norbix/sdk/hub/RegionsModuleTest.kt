package dev.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import dev.norbix.sdk.api.NorbixApi
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class RegionsModuleTest {

    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.regions)
    }

    @Test
    fun defaultsToUnset() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        assertNull(client.getRegion())
        assertNull(client.transport.config.region)
        assertEquals(NorbixHub.DEFAULT_BASE_URL, client.transport.config.baseUrl)
    }

    @Test
    fun acceptsConfiguredRegionAndComposesDefaultBaseUrl() {
        val hub = NorbixHub(projectId = "proj", apiKey = "k", region = "nb-eu-germany")
        assertEquals("nb-eu-germany", hub.getRegion())
        assertEquals("https://nb-eu-germany.hub.norbix.ai", hub.transport.config.baseUrl)

        val api = NorbixApi(projectId = "proj", apiKey = "k", region = "nb-eu-germany")
        assertEquals("nb-eu-germany", api.getRegion())
        assertEquals("https://nb-eu-germany.api.norbix.ai", api.transport.config.baseUrl)
    }

    @Test
    fun neverRewritesCustomBaseUrl() {
        val custom = "https://hub.norbix.isidos.lt"
        val client = NorbixHub(projectId = "proj", apiKey = "k", region = "nb-eu-germany", baseUrl = custom)
        assertEquals("nb-eu-germany", client.getRegion())
        assertEquals(custom, client.transport.config.baseUrl)

        client.setRegion("nb-us-east")
        assertEquals(custom, client.transport.config.baseUrl)
    }

    @Test
    fun setRegionRuntimeAndUnsetReset() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        client.setRegion("nb-eu-germany")
        assertEquals("nb-eu-germany", client.getRegion())
        assertEquals("https://nb-eu-germany.hub.norbix.ai", client.transport.config.baseUrl)

        client.setRegion("nb-us-east")
        assertEquals("https://nb-us-east.hub.norbix.ai", client.transport.config.baseUrl)

        client.setRegion(null)
        assertNull(client.getRegion())
        assertEquals(NorbixHub.DEFAULT_BASE_URL, client.transport.config.baseUrl)
    }

    // End-to-end header + route check against a tiny local server.
    @Test
    fun sendsNbRegionHeaderOnlyWhenResolved() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["nb-region"] = ex.requestHeaders.getFirst("nb-region")
            seen["method"] = ex.requestMethod
            seen["path"] = ex.requestURI.path
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            val body = "{}".toByteArray()
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"

            // Unset: no header.
            NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base).echo.echo()
            assertNull(seen["nb-region"])

            // Configured region: header present; custom base URL untouched.
            NorbixApi(projectId = "proj", apiKey = "k", region = "nb-eu-germany", baseUrl = base).echo.echo()
            assertEquals("nb-eu-germany", seen["nb-region"])

            // Per-call override wins over the client region.
            val hub = NorbixHub(
                projectId = "proj", apiKey = "k", accountId = "acc",
                region = "nb-eu-germany", baseUrl = base,
            )
            hub.regions.list(region = "nb-us-east")
            assertEquals("nb-us-east", seen["nb-region"])
            assertEquals("GET", seen["method"])
            assertEquals("/v2/account/regions", seen["path"])

            // Update-project-regions route + body.
            hub.regions.updateProjectRegions(
                projectId = "proj_1",
                primaryRegion = "nb-eu-germany",
                additionalRegions = listOf("nb-us-east"),
            )
            assertEquals("nb-eu-germany", seen["nb-region"])
            assertEquals("PATCH", seen["method"])
            assertEquals("/v2/account/projects/proj_1/settings/regions", seen["path"])
            assertTrue(seen["body"]!!.contains("\"primaryRegion\":\"nb-eu-germany\""))
            assertTrue(seen["body"]!!.contains("\"additionalRegions\":[\"nb-us-east\"]"))
        } finally {
            server.stop(0)
        }
    }
}
