package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

/**
 * Bundle discount codes with a token only (no `accountId`), checked against a
 * throw-away local server (verb, resolved path, query, auth header, body) and
 * a refused code (HTTP 400 `CM-ERRORS-ACCOUNT-027` with its `reason`). Never a
 * real gateway.
 */
class AccountBundleDiscountsRoutesTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String? = null
        var auth: String? = null
    }

    private fun withServer(
        status: Int = 200,
        answer: String = """{"responseStatus":{"isSuccess":true}}""",
        block: (NorbixHub, Recorder) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.rawQuery
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
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
    fun checkBundleDiscountSendsCodeBundleAndBillingPeriodInTheBody() = withServer { hub, rec ->
        hub.account.checkBundleDiscount(mapOf("code" to "LAUNCH20", "bundle" to "Growth", "billingPeriod" to "Annual"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/discount/check", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
        assertEquals(mapOf("code" to "LAUNCH20", "bundle" to "Growth", "billingPeriod" to "Annual"), bodyOf(rec))
    }

    @Test
    fun checkBundleDiscountAnswersTheDiscount() = withServer(
        answer = """{"discount":{"code":"LAUNCH20","percentOff":20,"months":3},"responseStatus":{"isSuccess":true}}""",
    ) { hub, _ ->
        @Suppress("UNCHECKED_CAST")
        val answer = hub.account.checkBundleDiscount(mapOf("code" to "LAUNCH20")) as Map<String, Any?>
        @Suppress("UNCHECKED_CAST")
        val discount = answer["discount"] as Map<String, Any?>
        assertEquals("LAUNCH20", discount["code"])
        assertEquals(20, (discount["percentOff"] as Number).toInt())
        assertEquals(3, (discount["months"] as Number).toInt())
    }

    @Test
    fun applyBundleDiscountSendsTheCodeInTheBody() = withServer { hub, rec ->
        hub.account.applyBundleDiscount(mapOf("code" to "LAUNCH20"))
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/discount", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
        assertEquals(mapOf("code" to "LAUNCH20"), bodyOf(rec))
    }

    @Test
    fun aUsedCodeReachesTheCallerWith027AndItsReason() = withServer(
        status = 400,
        answer = """
            {"responseStatus": {"isSuccess": false, "errors": [
              {"errorCode": "CM-ERRORS-ACCOUNT-027", "message": "This discount code cannot be used.", "context": {"reason": "already_used"}}
            ]}}
        """.trimIndent(),
    ) { hub, _ ->
        val error = assertFailsWith<NorbixError> {
            hub.account.applyBundleDiscount(mapOf("code" to "LAUNCH20"))
        }
        assertEquals(400, error.httpStatus)
        assertEquals("CM-ERRORS-ACCOUNT-027", error.errorCode)
        assertEquals("already_used", error.errors.single().context["reason"])
    }

    @Test
    fun createStripeCheckoutSessionSendsDiscountCodeInTheBody() = withServer { hub, rec ->
        val request = mapOf(
            "subscriptionType" to "ManagedService",
            "bundle" to "Starter",
            "billingPeriod" to "Monthly",
            "discountCode" to "LAUNCH20",
        )
        hub.account.createStripeCheckoutSession(request)
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/create-checkout-session", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertEquals(request, bodyOf(rec))
    }
}
