package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PaymentsModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.payments)
    }

    /**
     * GET /{version}/payments/webhooks/log (gateway campaign audit/payments,
     * item 8): verb, path and the filters on the query, against a throw-away
     * local server — no real gateway.
     */
    @Test
    fun getPaymentsWebhookLogSendsAGetWithTheFiltersOnTheQuery() {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            method = ex.requestMethod
            path = ex.requestURI.path
            query = ex.requestURI.rawQuery
            val bytes = """{"list":[{"integrationId":"int_stripe","eventName":"payment_intent.succeeded","statusCode":200}]}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            hub.payments.getPaymentsWebhookLog(mapOf("integrationId" to "int_stripe", "limit" to 20))
        } finally {
            server.stop(0)
        }

        assertEquals("GET", method)
        assertEquals(true, path?.endsWith("/payments/webhooks/log"))
        val params = query.orEmpty().split("&").toSet()
        assertEquals(setOf("integrationId=int_stripe", "limit=20"), params)
    }
}
