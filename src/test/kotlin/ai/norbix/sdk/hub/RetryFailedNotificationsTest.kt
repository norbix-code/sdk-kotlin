package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * `hub.notifications` — retry the failed recipients of an email, SMS or push
 * campaign (`POST /{version}/notifications/{channel}/campaigns/{Id}/retry-failed`,
 * gateway release 2.3.9 / N-28). Every call goes to a throw-away local server
 * (the same fake-transport pattern as [SmsNotificationsTest]) — never a real
 * gateway, never a real provider. Each test checks the verb, the full path
 * with the campaign id substituted, the JSON body (only the keys the caller
 * set; `Id` is a path parameter and never part of the body) and that the
 * gateway's answer is handed back as is.
 */
class RetryFailedNotificationsTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var body: String? = null
        var auth: String? = null
        var calls = 0
    }

    private val answer = """{"retryRequestId":"rr_1","selected":2,"skipped":{"notFailed":1},"replayed":false,"warning":null}"""

    private fun withServer(status: Int = 200, body: String = answer, block: (NorbixHub, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.calls++
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = body.toByteArray()
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
        val type = object : TypeToken<Map<String, Any?>>() {}.type
        return Gson().fromJson(rec.body!!, type)
    }

    private val fullRequest = mapOf(
        "Id" to "cmp_1",
        "idempotencyKey" to "retry-2026-10-26-1",
        "databaseIntegrationId" to "dbi_1",
        "notificationIds" to listOf("n_1", "n_2"),
        "includeAmbiguous" to true,
        "categories" to listOf("Transient", "Unknown"),
    )

    private fun assertFullBody(rec: Recorder) {
        val body = bodyOf(rec)
        assertEquals(setOf("idempotencyKey", "databaseIntegrationId", "notificationIds", "includeAmbiguous", "categories"), body.keys)
        assertEquals("retry-2026-10-26-1", body["idempotencyKey"])
        assertEquals("dbi_1", body["databaseIntegrationId"])
        assertEquals(listOf("n_1", "n_2"), body["notificationIds"])
        assertEquals(true, body["includeAmbiguous"])
        assertEquals(listOf("Transient", "Unknown"), body["categories"])
    }

    // ---- email ------------------------------------------------------------

    @Test
    fun retryFailedEmailNotifications() = withServer { hub, rec ->
        val result = hub.notifications.retryFailedEmailNotifications(fullRequest) as Map<*, *>
        assertEquals("POST", rec.method)
        assertEquals("/v3/notifications/email/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertFullBody(rec)
        assertEquals("rr_1", result["retryRequestId"])
        assertEquals(2.0, result["selected"])
        assertEquals(false, result["replayed"])
    }

    @Test
    fun retryFailedEmailNotificationsSendsOnlyTheKeysSet() = withServer { hub, rec ->
        hub.notifications.retryFailedEmailNotifications(mapOf("Id" to "cmp_1", "idempotencyKey" to "k1"))
        assertEquals("/v3/notifications/email/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals(mapOf("idempotencyKey" to "k1"), bodyOf(rec))
    }

    // ---- SMS --------------------------------------------------------------

    @Test
    fun retryFailedSmsNotifications() = withServer { hub, rec ->
        val result = hub.notifications.retryFailedSmsNotifications(fullRequest) as Map<*, *>
        assertEquals("POST", rec.method)
        assertEquals("/v3/notifications/sms/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertFullBody(rec)
        assertEquals("rr_1", result["retryRequestId"])
    }

    @Test
    fun retryFailedSmsNotificationsSendsOnlyTheKeysSet() = withServer { hub, rec ->
        hub.notifications.retryFailedSmsNotifications(mapOf("Id" to "cmp_1", "idempotencyKey" to "k1"))
        assertEquals("/v3/notifications/sms/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals(mapOf("idempotencyKey" to "k1"), bodyOf(rec))
    }

    // ---- push -------------------------------------------------------------

    @Test
    fun retryFailedPushNotifications() = withServer { hub, rec ->
        val result = hub.notifications.retryFailedPushNotifications(fullRequest) as Map<*, *>
        assertEquals("POST", rec.method)
        assertEquals("/v3/notifications/push/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals("Bearer token", rec.auth)
        assertFullBody(rec)
        assertEquals("rr_1", result["retryRequestId"])
    }

    @Test
    fun retryFailedPushNotificationsSendsOnlyTheKeysSet() = withServer { hub, rec ->
        hub.notifications.retryFailedPushNotifications(mapOf("Id" to "cmp_1", "idempotencyKey" to "k1"))
        assertEquals("/v3/notifications/push/campaigns/cmp_1/retry-failed", rec.path)
        assertEquals(mapOf("idempotencyKey" to "k1"), bodyOf(rec))
    }

    // ---- shared behaviour -------------------------------------------------

    @Test
    fun nullOptionalsAreNotSent() = withServer { hub, rec ->
        hub.notifications.retryFailedEmailNotifications(
            mapOf("Id" to "cmp_1", "idempotencyKey" to "k1", "notificationIds" to null, "includeAmbiguous" to null, "categories" to null),
        )
        assertEquals(mapOf("idempotencyKey" to "k1"), bodyOf(rec))
    }

    @Test
    fun withoutTheCampaignIdTheCallIsRefusedBeforeAnyRequest() = withServer { hub, rec ->
        val error = assertFailsWith<NorbixError> {
            hub.notifications.retryFailedSmsNotifications(mapOf("campaignId" to "cmp_1", "idempotencyKey" to "k1"))
        }
        assertEquals("NORBIX_MISSING_PATH_PARAM", error.code)
        assertEquals(0, rec.calls)
        assertEquals(null, rec.path)
    }

    @Test
    fun aReusedKeyWithAnotherBodyIsRefusedByTheGatewayAsATypedError() = withServer(
        status = 409,
        body = """{"responseStatus":{"errorCode":"CM-ERRORS-NOTIFICATIONS-409","message":"Idempotency key reused with a different body"}}""",
    ) { hub, _ ->
        val error = assertFailsWith<NorbixError> {
            hub.notifications.retryFailedPushNotifications(mapOf("Id" to "cmp_1", "idempotencyKey" to "k1"))
        }
        assertEquals(409, error.status)
    }

    @Test
    fun aReplayedAnswerIsHandedBackAsIs() = withServer(
        body = """{"retryRequestId":"rr_1","selected":2,"skipped":{},"replayed":true,"warning":"replayed: same key seen before"}""",
    ) { hub, _ ->
        val result = hub.notifications.retryFailedEmailNotifications(mapOf("Id" to "cmp_1", "idempotencyKey" to "k1")) as Map<*, *>
        assertEquals(true, result["replayed"])
        assertTrue((result["warning"] as String).startsWith("replayed"))
    }
}
