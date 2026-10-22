package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
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
    /** Montonio integration save (campaign audit/payments-checkout): the provider and its keys go under `integration`. */
    @Test
    fun savePaymentsIntegrationPostsAMontonioIntegration() {
        var method: String? = null
        var path: String? = null
        var body: Map<String, Any?> = emptyMap()
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            method = ex.requestMethod
            path = ex.requestURI.path
            val type = object : TypeToken<Map<String, Any?>>() {}.type
            body = Gson().fromJson(ex.requestBody.readBytes().toString(Charsets.UTF_8), type)
            val bytes = """{"id":"int_montonio"}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        val res = try {
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            hub.payments.savePaymentsIntegration(
                mapOf(
                    "integration" to mapOf(
                        "provider" to "Montonio",
                        "accessKey" to "ak_test",
                        "secretKey" to "sk_test",
                        "isSandbox" to true,
                        "locale" to "lt",
                    ),
                ),
            )
        } finally {
            server.stop(0)
        }

        assertEquals("POST", method)
        assertEquals(true, path?.endsWith("/payments/integrations"))
        assertEquals(
            mapOf("provider" to "Montonio", "accessKey" to "ak_test", "secretKey" to "sk_test", "isSandbox" to true, "locale" to "lt"),
            body["integration"],
        )
        assertEquals("int_montonio", (res as Map<*, *>)["id"])
    }

    /**
     * Owner 2026-10-22: `isSandbox` is optional and empty = true (sandbox) on the
     * gateway. The SDK must not fill in a default, or an unset field would mean live money.
     */
    @Test
    fun savePaymentsIntegrationLeavesOutAnUnsetIsSandbox() {
        var raw = ""
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            raw = ex.requestBody.readBytes().toString(Charsets.UTF_8)
            val bytes = """{"id":"int_montonio"}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            hub.payments.savePaymentsIntegration(
                mapOf("integration" to mapOf("provider" to "Montonio", "accessKey" to "ak_test", "secretKey" to "sk_test")),
            )
        } finally {
            server.stop(0)
        }

        val type = object : TypeToken<Map<String, Any?>>() {}.type
        val body: Map<String, Any?> = Gson().fromJson(raw, type)
        assertEquals(
            mapOf("provider" to "Montonio", "accessKey" to "ak_test", "secretKey" to "sk_test"),
            body["integration"],
        )
        assertEquals(false, raw.contains("isSandbox"))
    }
}
