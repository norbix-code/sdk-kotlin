package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * `hub.code` — the 23 marketplace routes of the gateway contract
 * (Code.Marketplace.md §14), one test per method, against a throw-away local
 * server. Never a real gateway. Each test checks the verb, the resolved path,
 * and where the parameters go (query for GET / DELETE, JSON body for POST / PUT).
 */
class CodeMarketplaceModuleTest {

    private val gson = Gson()

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String? = null
        var auth: String? = null
    }

    private fun withServer(block: (NorbixHub, Recorder) -> Unit) {
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
            block(NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base), rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun getMarketplaceListings() = withServer { hub, rec ->
        hub.code.getMarketplaceListings(mapOf("search" to "slack"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/listings", rec.path)
        assertEquals("search=slack", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceListingFunctionTokens() = withServer { hub, rec ->
        hub.code.getMarketplaceListingFunctionTokens(mapOf("listingViewId" to "ml_slack_v1", "functionKey" to "slack.post-message"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/listings/ml_slack_v1/functions/slack.post-message/tokens", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceIntegrations() = withServer { hub, rec ->
        hub.code.getMarketplaceIntegrations()
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.getMarketplaceIntegration(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun saveMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.saveMarketplaceIntegration(mapOf("integration" to mapOf("listingViewId" to "ml_slack_v1", "config" to mapOf("workspace" to "acme")), "secrets" to mapOf("botToken" to "xoxb-test")))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("integration" to mapOf("listingViewId" to "ml_slack_v1", "config" to mapOf("workspace" to "acme")), "secrets" to mapOf("botToken" to "xoxb-test"))), gson.fromJson(rec.body, com.google.gson.JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.deleteMarketplaceIntegration(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun enableMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.enableMarketplaceIntegration(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/enable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.disableMarketplaceIntegration(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/disable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceFunctions() = withServer { hub, rec ->
        hub.code.getMarketplaceFunctions(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceFunction() = withServer { hub, rec ->
        hub.code.getMarketplaceFunction(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions/func_4hT2b9QkLm3XcT1yRfGh7a", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun saveMarketplaceFunction() = withServer { hub, rec ->
        hub.code.saveMarketplaceFunction(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "function" to mapOf("functionKey" to "slack.post-message", "displayName" to "Post order", "arguments" to mapOf("channel" to "#orders"))))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("function" to mapOf("functionKey" to "slack.post-message", "displayName" to "Post order", "arguments" to mapOf("channel" to "#orders")))), gson.fromJson(rec.body, com.google.gson.JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteMarketplaceFunction() = withServer { hub, rec ->
        hub.code.deleteMarketplaceFunction(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions/func_4hT2b9QkLm3XcT1yRfGh7a", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun enableMarketplaceFunction() = withServer { hub, rec ->
        hub.code.enableMarketplaceFunction(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions/func_4hT2b9QkLm3XcT1yRfGh7a/enable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableMarketplaceFunction() = withServer { hub, rec ->
        hub.code.disableMarketplaceFunction(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions/func_4hT2b9QkLm3XcT1yRfGh7a/disable", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceFunctionTokens() = withServer { hub, rec ->
        hub.code.getMarketplaceFunctionTokens(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/functions/func_4hT2b9QkLm3XcT1yRfGh7a/tokens", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun invokeMarketplaceFunction() = withServer { hub, rec ->
        hub.code.invokeMarketplaceFunction(mapOf("functionViewId" to "func_4hT2b9QkLm3XcT1yRfGh7a", "payload" to mapOf("text" to "Order 6ac54a59 shipped")))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/functions/func_4hT2b9QkLm3XcT1yRfGh7a/invoke", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("payload" to mapOf("text" to "Order 6ac54a59 shipped"))), gson.fromJson(rec.body, com.google.gson.JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceListing() = withServer { hub, rec ->
        hub.code.getMarketplaceListing(mapOf("listingViewId" to "ml_slack_v1"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/listings/ml_slack_v1", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun testMarketplaceIntegration() = withServer { hub, rec ->
        hub.code.testMarketplaceIntegration(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/test", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun replaceMarketplaceIntegrationSecrets() = withServer { hub, rec ->
        hub.code.replaceMarketplaceIntegrationSecrets(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "secrets" to mapOf("botToken" to "xoxb-new")))
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/secrets", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("secrets" to mapOf("botToken" to "xoxb-new"))), gson.fromJson(rec.body, com.google.gson.JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun revealMarketplaceIntegrationSecrets() = withServer { hub, rec ->
        hub.code.revealMarketplaceIntegrationSecrets(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/secrets/reveal", rec.path)
        assertNull(rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun setMarketplaceIntegrationTokenMappings() = withServer { hub, rec ->
        hub.code.setMarketplaceIntegrationTokenMappings(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb", "tokenMappings" to listOf(mapOf("key" to "channel", "value" to "#orders", "resolver" to "Custom"))))
        assertEquals("PUT", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/token-mappings", rec.path)
        assertNull(rec.query)
        assertEquals(gson.toJsonTree(mapOf("tokenMappings" to listOf(mapOf("key" to "channel", "value" to "#orders", "resolver" to "Custom")))), gson.fromJson(rec.body, com.google.gson.JsonElement::class.java))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceFunctionCatalog() = withServer { hub, rec ->
        hub.code.getMarketplaceFunctionCatalog(mapOf("integrationViewId" to "int_6Qp1dW2kRm8NsT4vYc0Hb"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/integrations/int_6Qp1dW2kRm8NsT4vYc0Hb/catalog", rec.path)
        assertEquals(null, rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getMarketplaceFunctionRuns() = withServer { hub, rec ->
        hub.code.getMarketplaceFunctionRuns(mapOf("triggerId" to "trg_1p4R3gTobGZpD6fXvHT4rd", "limit" to 5))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/marketplace/functions/runs", rec.path)
        assertEquals("triggerId=trg_1p4R3gTobGZpD6fXvHT4rd&limit=5", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }
}
