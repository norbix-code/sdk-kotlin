package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * `hub.notifications` — email click ids (`nblid`): the per-project switch
 * (`PATCH /{version}/notifications/email/settings/click-tracking`) and handing
 * clicks back (`POST /{version}/notifications/email/clicks`). Every call goes
 * to a throw-away local server (the same fake-transport pattern as
 * [RetryFailedNotificationsTest]) — never a real gateway. Each test checks the
 * verb, the path, that the request travels as the JSON body (no query) and
 * that the gateway's answer is handed back as is.
 */
class EmailClickIdsTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String? = null
        var auth: String? = null
        var calls = 0
    }

    private fun withServer(body: String = "{}", block: (NorbixHub, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.calls++
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.query
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = body.toByteArray()
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
        val type = object : TypeToken<Map<String, Any?>>() {}.type
        return Gson().fromJson(rec.body!!, type)
    }

    @Test
    fun updateEmailClickTrackingOn() = withServer { hub, rec ->
        hub.notifications.updateEmailClickTracking(mapOf("enabled" to true))
        assertEquals(1, rec.calls)
        assertEquals("PATCH", rec.method)
        assertEquals("/v3/notifications/email/settings/click-tracking", rec.path)
        assertNull(rec.query)
        assertEquals(mapOf<String, Any?>("enabled" to true), bodyOf(rec))
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun updateEmailClickTrackingOffIsSent() = withServer { hub, rec ->
        hub.notifications.updateEmailClickTracking(mapOf("enabled" to false))
        assertEquals("PATCH", rec.method)
        assertNull(rec.query)
        // false is a value, not a default: it must be on the wire.
        assertEquals(mapOf<String, Any?>("enabled" to false), bodyOf(rec))
    }

    @Test
    fun recordEmailClicks() {
        val answer = """{"recorded":1,"duplicates":0,"flagged":1,"rejected":1,"clicks":[""" +
            """{"index":0,"status":"recorded","flag":"suspected-scanner","flagReason":"user-agent",""" +
            """"campaignId":"cmp_1","notificationId":"ntf_1","linkIndex":2,"to":["ann@example.com"]},""" +
            """{"index":1,"status":"rejected","reason":"not-valid"}]}"""
        withServer(answer) { hub, rec ->
            val clicks = listOf(
                mapOf(
                    "nblid" to "ntf_1.2.1.abc",
                    "url" to "https://shop.example.com/sale?nblid=ntf_1.2.1.abc",
                    "clickedAt" to "2026-11-11T10:00:00Z",
                    "userAgent" to "Mozilla/5.0",
                ),
                mapOf("nblid" to "made-up"),
            )
            val result = hub.notifications.recordEmailClicks(mapOf("clicks" to clicks)) as Map<*, *>

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/notifications/email/clicks", rec.path)
            assertNull(rec.query)
            assertEquals("Bearer token", rec.auth)
            assertEquals(mapOf<String, Any?>("clicks" to clicks), bodyOf(rec))

            assertEquals(1.0, result["recorded"])
            assertEquals(1.0, result["rejected"])
            val results = result["clicks"] as List<*>
            assertEquals(2, results.size)
            val first = results[0] as Map<*, *>
            assertEquals("suspected-scanner", first["flag"])
            assertEquals("user-agent", first["flagReason"])
            assertEquals(listOf("ann@example.com"), first["to"])
            val second = results[1] as Map<*, *>
            assertEquals("rejected", second["status"])
            assertEquals("not-valid", second["reason"])
        }
    }
}
