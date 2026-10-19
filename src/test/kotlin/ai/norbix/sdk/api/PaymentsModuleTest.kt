package ai.norbix.sdk.api

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * Payment orders + checkout (gateway campaign audit/payments-checkout): verb,
 * path, path parameter and body / query of every call, against a throw-away
 * local server — no real gateway.
 */
class PaymentsModuleTest {
    private data class Captured(val method: String, val path: String, val query: String?, val body: Map<String, Any?>)

    private fun capture(response: String, call: (NorbixApi) -> Any?): Pair<Captured, Any?> {
        var captured: Captured? = null
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            val raw = ex.requestBody.readBytes().toString(Charsets.UTF_8)
            val type = object : TypeToken<Map<String, Any?>>() {}.type
            val body: Map<String, Any?> = if (raw.isBlank()) emptyMap() else Gson().fromJson(raw, type)
            captured = Captured(ex.requestMethod, ex.requestURI.path, ex.requestURI.rawQuery, body)
            val bytes = response.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        val result = try {
            val api = NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            call(api)
        } finally {
            server.stop(0)
        }
        return captured!! to result
    }

    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.payments)
    }

    @Test
    fun createPaymentOrderPostsTheOrderAndAnswersTheId() {
        val (req, res) = capture("""{"id":"ord_1"}""") { api ->
            api.payments.createPaymentOrder(
                mapOf(
                    "buyerUserId" to "usr_1",
                    "merchantReference" to "listing-42",
                    "idempotencyKey" to "listing-42-key",
                    "currency" to "EUR",
                    "priceVersion" to "v1",
                    "lines" to listOf(mapOf("sku" to "promo", "quantity" to 21, "unitAmountMinor" to 30)),
                    "metadata" to mapOf("listingId" to "42"),
                ),
            )
        }

        assertEquals("POST", req.method)
        assertEquals("/v3/payments/orders", req.path)
        assertEquals("usr_1", req.body["buyerUserId"])
        assertEquals("listing-42", req.body["merchantReference"])
        assertEquals("listing-42-key", req.body["idempotencyKey"])
        assertEquals("EUR", req.body["currency"])
        assertEquals("v1", req.body["priceVersion"])
        @Suppress("UNCHECKED_CAST")
        val line = (req.body["lines"] as List<Map<String, Any?>>).single()
        assertEquals("promo", line["sku"])
        assertEquals(21.0, line["quantity"])
        assertEquals(30.0, line["unitAmountMinor"])
        assertEquals(mapOf("listingId" to "42"), req.body["metadata"])
        assertEquals("ord_1", (res as Map<*, *>)["id"])
    }

    @Test
    fun getPaymentOrderPutsTheIdOnThePath() {
        val (req, res) = capture("""{"item":{"id":"ord_1","status":"Paid","totalMinor":630}}""") { api ->
            api.payments.getPaymentOrder(mapOf("id" to "ord_1"))
        }

        assertEquals("GET", req.method)
        assertEquals("/v3/payments/orders/ord_1", req.path)
        assertNull(req.query)
        assertEquals("Paid", ((res as Map<*, *>)["item"] as Map<*, *>)["status"])
    }

    @Test
    fun getPaymentOrdersSendsTheFiltersOnTheQuery() {
        val (req, _) = capture("""{"list":{"items":[],"hasMore":false}}""") { api ->
            api.payments.getPaymentOrders(mapOf("buyerUserId" to "usr_1", "merchantReference" to "listing-42", "status" to "Paid"))
        }

        assertEquals("GET", req.method)
        assertEquals("/v3/payments/orders", req.path)
        assertEquals(
            setOf("buyerUserId=usr_1", "merchantReference=listing-42", "status=Paid"),
            req.query.orEmpty().split("&").toSet(),
        )
    }

    @Test
    fun startPaymentCheckoutPostsToTheOrdersCheckoutPath() {
        val (req, res) = capture(
            """{"checkout":{"attempt":1,"paymentUrl":"https://pay.example/1"},"reused":false,"order":{"id":"ord_1"}}""",
        ) { api ->
            api.payments.startPaymentCheckout(
                mapOf(
                    "id" to "ord_1",
                    "integrationId" to "int_montonio",
                    "method" to "paymentInitiation",
                    "returnUrl" to "https://shop.example/return",
                    "preferredCountry" to "LT",
                    "preferredProvider" to "SWEDBANK",
                ),
            )
        }

        assertEquals("POST", req.method)
        assertEquals("/v3/payments/orders/ord_1/checkout", req.path)
        assertNull(req.body["id"])
        assertEquals("int_montonio", req.body["integrationId"])
        assertEquals("paymentInitiation", req.body["method"])
        assertEquals("https://shop.example/return", req.body["returnUrl"])
        assertEquals("LT", req.body["preferredCountry"])
        assertEquals("SWEDBANK", req.body["preferredProvider"])
        val checkout = (res as Map<*, *>)["checkout"] as Map<*, *>
        assertEquals("https://pay.example/1", checkout["paymentUrl"])
        assertEquals(false, res["reused"])
    }
}
