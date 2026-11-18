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
 * Trial limits with a token only (no `accountId`), checked against a
 * throw-away local server (verb, resolved path, query, auth header, body) and
 * a trial checkout in a full region (HTTP 400 `CM-ERRORS-ACCOUNT-040`). Never
 * a real gateway.
 */
class AccountTrialLimitsRoutesTest {

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
    fun getTrialAvailabilitySendsTheRegionInTheQuery() = withServer { hub, rec ->
        hub.account.getTrialAvailability(mapOf("region" to "nb-eu-germany"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/account/trial-availability", rec.path)
        assertEquals("region=nb-eu-germany", rec.query)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getTrialAvailabilityAnswersAFullRegionWithAnOpenWaitingList() = withServer(
        answer = """{"limitsOn":true,"region":"nb-eu-germany","trialsOpen":false,"waitlistOpen":true,"onWaitlist":false,"refusal":"","responseStatus":{"isSuccess":true}}""",
    ) { hub, _ ->
        @Suppress("UNCHECKED_CAST")
        val answer = hub.account.getTrialAvailability(mapOf("region" to "nb-eu-germany")) as Map<String, Any?>
        assertEquals(true, answer["limitsOn"])
        assertEquals("nb-eu-germany", answer["region"])
        assertEquals(false, answer["trialsOpen"])
        assertEquals(true, answer["waitlistOpen"])
        assertEquals(false, answer["onWaitlist"])
    }

    @Test
    fun joinTrialWaitlistSendsRegionAndConsentInTheBody() = withServer { hub, rec ->
        val request = mapOf("region" to "nb-eu-germany", "consent" to true, "consentVersion" to "2026-11")
        hub.account.joinTrialWaitlist(request)
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/trial-waitlist", rec.path)
        assertNull(rec.query)
        assertEquals("Bearer token", rec.auth)
        assertEquals(request, bodyOf(rec))
    }

    @Test
    fun joinTrialWaitlistAnswersTheStatus() = withServer(
        answer = """{"status":"added","message":"You are on the waiting list.","responseStatus":{"isSuccess":true}}""",
    ) { hub, _ ->
        @Suppress("UNCHECKED_CAST")
        val answer = hub.account.joinTrialWaitlist(
            mapOf("region" to "nb-eu-germany", "consent" to true, "consentVersion" to "2026-11"),
        ) as Map<String, Any?>
        assertEquals("added", answer["status"])
        assertEquals("You are on the waiting list.", answer["message"])
    }

    @Test
    fun aTrialCheckoutInAFullRegionReachesTheCallerWith040() = withServer(
        status = 400,
        answer = """
            {"responseStatus": {"isSuccess": false, "errors": [
              {"errorCode": "CM-ERRORS-ACCOUNT-040", "message": "Free trials in this region are full."}
            ]}}
        """.trimIndent(),
    ) { hub, _ ->
        val error = assertFailsWith<NorbixError> {
            hub.account.createStripeCheckoutSession(
                mapOf("subscriptionType" to "ManagedService", "bundle" to "Starter", "billingPeriod" to "Monthly", "region" to "nb-eu-germany"),
            )
        }
        assertEquals(400, error.httpStatus)
        assertEquals("CM-ERRORS-ACCOUNT-040", error.errorCode)
    }

    @Test
    fun createStripeCheckoutSessionSendsRegionWithoutTrialAndTrialInviteInTheBody() = withServer { hub, rec ->
        val request = mapOf(
            "subscriptionType" to "ManagedService",
            "bundle" to "Starter",
            "billingPeriod" to "Monthly",
            "region" to "nb-eu-germany",
            "withoutTrial" to true,
            "trialInvite" to "inv_token",
        )
        hub.account.createStripeCheckoutSession(request)
        assertEquals("POST", rec.method)
        assertEquals("/v3/account/stripe/create-checkout-session", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertEquals(request, bodyOf(rec))
    }
}
