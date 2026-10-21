package ai.norbix.sdk.api

import ai.norbix.sdk.core.NorbixError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * The app's own log lines (gateway campaign audit/logging, Logs stage A):
 * verb, path, body and answer of writeLogs, and the 429 quota refusal,
 * against a throw-away local server — no real gateway.
 */
class LogsModuleTest {
    private data class Captured(val method: String, val path: String, val body: Map<String, Any?>)

    private fun capture(
        response: String,
        status: Int = 200,
        headers: Map<String, String> = emptyMap(),
        call: (NorbixApi) -> Any?,
    ): Triple<List<Captured>, Any?, Throwable?> {
        val captured = mutableListOf<Captured>()
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            val raw = ex.requestBody.readBytes().toString(Charsets.UTF_8)
            val type = object : TypeToken<Map<String, Any?>>() {}.type
            val body: Map<String, Any?> = if (raw.isBlank()) emptyMap() else Gson().fromJson(raw, type)
            captured += Captured(ex.requestMethod, ex.requestURI.path, body)
            val bytes = response.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            headers.forEach { (k, v) -> ex.responseHeaders.add(k, v) }
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        var result: Any? = null
        var error: Throwable? = null
        try {
            val api = NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            result = call(api)
        } catch (t: Throwable) {
            error = t
        } finally {
            server.stop(0)
        }
        return Triple(captured, result, error)
    }

    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.logs)
    }

    @Test
    fun writeLogsPostsTheEntriesAndAnswersAccepted() {
        val (reqs, res, err) = capture("""{"accepted":2}""") { api ->
            api.logs.writeLogs(
                mapOf(
                    "entries" to listOf(
                        mapOf(
                            "level" to "error",
                            "title" to "Payment failed",
                            "message" to "card declined",
                            "eventCode" to "order:payment_failed",
                            "correlationId" to "checkout-42",
                            "meta" to mapOf("orderId" to "ord_1"),
                        ),
                        mapOf("title" to "Checkout opened"),
                    ),
                ),
            )
        }

        assertEquals(null, err)
        val req = reqs.single()
        assertEquals("POST", req.method)
        assertEquals("/v3/logs", req.path)
        @Suppress("UNCHECKED_CAST")
        val entries = req.body["entries"] as List<Map<String, Any?>>
        assertEquals(2, entries.size)
        assertEquals("error", entries[0]["level"])
        assertEquals("Payment failed", entries[0]["title"])
        assertEquals("order:payment_failed", entries[0]["eventCode"])
        assertEquals("checkout-42", entries[0]["correlationId"])
        assertEquals(mapOf("orderId" to "ord_1"), entries[0]["meta"])
        assertEquals(mapOf("title" to "Checkout opened"), entries[1])
        assertEquals(2.0, (res as Map<*, *>)["accepted"])
    }

    @Test
    fun writeLogsOverTheQuotaThrowsA429WithTheGatewayCodeAndIsSentOnce() {
        val body = """{"responseStatus":{"isSuccess":false,"errors":[{"errorCode":"CM-ERRORS-LOGGING-003","message":"Log quota used up"}]}}"""
        val (reqs, _, err) = capture(body, status = 429, headers = mapOf("Retry-After" to "37")) { api ->
            api.logs.writeLogs(mapOf("entries" to listOf(mapOf("title" to "x"))))
        }

        val error = assertFailsWith<NorbixError> { throw err ?: AssertionError("no error") }
        assertEquals(429, error.status)
        assertEquals("CM-ERRORS-LOGGING-003", error.code)
        assertEquals(37, error.retryAfterSeconds)
        assertEquals(1, reqs.size)
        assertEquals("POST", reqs.single().method)
        assertEquals("/v3/logs", reqs.single().path)
    }

    @Test
    fun writeLogsOverTheQuotaWithAnHttpDateGivesTheSecondsUntilIt() {
        val at = java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC).plusSeconds(120)
            .format(java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME)
        val (_, _, err) = capture(QUOTA_BODY, status = 429, headers = mapOf("Retry-After" to at)) { api ->
            api.logs.writeLogs(mapOf("entries" to listOf(mapOf("title" to "x"))))
        }

        val error = assertFailsWith<NorbixError> { throw err ?: AssertionError("no error") }
        val seconds = assertNotNull(error.retryAfterSeconds)
        assertTrue(seconds in 115..121, "got $seconds, want about 120")
    }

    @Test
    fun writeLogsOverTheQuotaWithoutRetryAfterLeavesItNull() {
        val (reqs, _, err) = capture(QUOTA_BODY, status = 429) { api ->
            api.logs.writeLogs(mapOf("entries" to listOf(mapOf("title" to "x"))))
        }

        val error = assertFailsWith<NorbixError> { throw err ?: AssertionError("no error") }
        assertEquals(429, error.status)
        assertNull(error.retryAfterSeconds)
        assertEquals(1, reqs.size)
    }

    @Test
    fun writeLogsA500HasNoRetryAfter() {
        val body = """{"responseStatus":{"errorCode":"CM-ERRORS-500","message":"Boom"}}"""
        val (reqs, _, err) = capture(body, status = 500) { api ->
            api.logs.writeLogs(mapOf("entries" to listOf(mapOf("title" to "x"))))
        }

        val error = assertFailsWith<NorbixError> { throw err ?: AssertionError("no error") }
        assertEquals(500, error.status)
        assertNull(error.retryAfterSeconds)
        assertEquals(1, reqs.size)
    }

    @Test
    fun retryAfterSecondsOfReadsDeltaSecondsAndHttpDates() {
        val now = java.time.Instant.parse("2026-10-21T08:00:00Z")
        assertEquals(37, NorbixError.retryAfterSecondsOf("37", now))
        assertEquals(0, NorbixError.retryAfterSecondsOf(" 0 ", now))
        assertEquals(2, NorbixError.retryAfterSecondsOf("1.2", now))
        assertEquals(90, NorbixError.retryAfterSecondsOf("Wed, 21 Oct 2026 08:01:30 GMT", now))
        assertEquals(0, NorbixError.retryAfterSecondsOf("Wed, 21 Oct 2026 07:00:00 GMT", now))
        assertNull(NorbixError.retryAfterSecondsOf(null, now))
        assertNull(NorbixError.retryAfterSecondsOf("", now))
        assertNull(NorbixError.retryAfterSecondsOf("soon", now))
        assertNull(NorbixError.retryAfterSecondsOf("-1", now))
        assertNull(NorbixError.retryAfterSecondsOf("NaN", now))
    }

    private companion object {
        const val QUOTA_BODY =
            """{"responseStatus":{"isSuccess":false,"errors":[{"errorCode":"CM-ERRORS-LOGGING-003","message":"Log quota used up"}]}}"""
    }
}
