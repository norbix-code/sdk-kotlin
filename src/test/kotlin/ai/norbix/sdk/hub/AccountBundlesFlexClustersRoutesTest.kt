package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Managed Service bundles and the account's Flex clusters with a token only
 * (no `accountId`), checked against a throw-away local server (verb, resolved
 * path, query, auth header, body). Never a real gateway.
 */
class AccountBundlesFlexClustersRoutesTest {

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
            rec.query = ex.requestURI.rawQuery
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = """{"responseStatus":{"isSuccess":true}}""".toByteArray()
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

    private fun bodyOf(rec: Recorder): Map<String, Any?> {
        @Suppress("UNCHECKED_CAST")
        return Gson().fromJson(rec.body, Map::class.java) as Map<String, Any?>
    }

    @Test
    fun getManagedServiceBundles() = withServer { hub, rec ->
        hub.account.getManagedServiceBundles()
        assertEquals("GET", rec.method)
        assertEquals("/v3/account/stripe/bundles", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun changeManagedServiceBundleSendsBundleAndBillingPeriodInTheBody() = withServer { hub, rec ->
        hub.account.changeManagedServiceBundle(mapOf("bundle" to "Growth", "billingPeriod" to "Annual"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/change-bundle", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
        assertEquals(mapOf("bundle" to "Growth", "billingPeriod" to "Annual"), bodyOf(rec))
    }

    @Test
    fun getFlexClusters() = withServer { hub, rec ->
        hub.account.getFlexClusters()
        assertEquals("GET", rec.method)
        assertEquals("/v3/account/flex-clusters", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun upgradeFlexClusterPutsTheIdInThePathAndTierCodeInTheBody() = withServer { hub, rec ->
        hub.account.upgradeFlexCluster(mapOf("flexClusterId" to "fc_1", "tierCode" to "M10"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/flex-clusters/fc_1/upgrade", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
        assertEquals(mapOf("tierCode" to "M10"), bodyOf(rec))
    }

    @Test
    fun createStripeCheckoutSessionSendsBundleAndBillingPeriodInTheBody() = withServer { hub, rec ->
        hub.account.createStripeCheckoutSession(
            mapOf("subscriptionType" to "ManagedService", "bundle" to "Starter", "billingPeriod" to "Monthly"),
        )
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/create-checkout-session", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertEquals(
            mapOf("subscriptionType" to "ManagedService", "bundle" to "Starter", "billingPeriod" to "Monthly"),
            bodyOf(rec),
        )
    }
}
