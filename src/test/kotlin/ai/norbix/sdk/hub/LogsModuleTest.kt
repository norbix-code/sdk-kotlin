package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * The log routes (gateway campaign audit/logging, Logs stage A and finding
 * L12): verb, path, path parameter, query and body of every call, against a
 * throw-away local server — no real gateway.
 */
class LogsModuleTest {
    private data class Captured(val method: String, val path: String, val query: String?, val body: Map<String, Any?>)

    private fun capture(response: String, call: (NorbixHub) -> Any?): Pair<Captured, Any?> {
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
            val hub = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}")
            call(hub)
        } finally {
            server.stop(0)
        }
        return captured!! to result
    }

    private fun params(query: String?): Set<String> = query.orEmpty().split("&").filter { it.isNotEmpty() }.toSet()

    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.logs)
    }

    @Test
    fun getLogsSendsAGetWithFiltersAndPagingOnTheQuery() {
        val (req, res) = capture("""{"list":{"items":[],"hasMore":false}}""") { hub ->
            hub.logs.getLogs(
                mapOf(
                    "level" to "Error",
                    "logCorrelationId" to "corr_1",
                    "eventCode" to "app:order:paid",
                    "pageSize" to 20,
                    "startingAfter" to "cur_1",
                ),
            )
        }

        assertEquals("GET", req.method)
        assertEquals("/v3/logs", req.path)
        assertEquals(
            setOf("level=Error", "logCorrelationId=corr_1", "eventCode=app%3Aorder%3Apaid", "pageSize=20", "startingAfter=cur_1"),
            params(req.query),
        )
        assertNotNull((res as Map<*, *>)["list"])
    }

    @Test
    fun getLogPutsTheIdInThePath() {
        val (req, res) = capture("""{"item":{"id":"6650f0c2a1b2c3d4e5f60718","title":"t"}}""") { hub ->
            hub.logs.getLog(mapOf("id" to "6650f0c2a1b2c3d4e5f60718"))
        }

        assertEquals("GET", req.method)
        assertEquals("/v3/logs/6650f0c2a1b2c3d4e5f60718", req.path)
        assertNull(req.query)
        assertEquals("t", ((res as Map<*, *>)["item"] as Map<*, *>)["title"])
    }

    @Test
    fun cleanLogsPostsToClean() {
        val (req, _) = capture("{}") { hub -> hub.logs.cleanLogs() }

        assertEquals("POST", req.method)
        assertEquals("/v3/logs/clean", req.path)
        assertEquals(emptyMap(), req.body)
    }

    @Test
    fun getLogSettingsReadsTheFlags() {
        val (req, res) = capture(
            """{"skipCloudDashboardLogs":true,"skipHttpBodyMeta":false,"aiChatLoggingEnabled":false,"hasNorbixLogging":true}""",
        ) { hub -> hub.logs.getLogSettings() }

        assertEquals("GET", req.method)
        assertEquals("/v3/logs/settings", req.path)
        assertEquals(true, (res as Map<*, *>)["hasNorbixLogging"])
    }

    @Test
    fun saveLogSettingsPostsTheFlagsInTheBody() {
        val (req, _) = capture("{}") { hub ->
            hub.logs.saveLogSettings(mapOf("skipCloudDashboardLogs" to true, "aiChatLoggingEnabled" to true))
        }

        assertEquals("POST", req.method)
        assertEquals("/v3/logs/settings", req.path)
        assertEquals(mapOf("skipCloudDashboardLogs" to true, "aiChatLoggingEnabled" to true), req.body)
    }

    @Test
    fun getLogsByCorrelationIdSendsTargetCorrelationIdOnTheQuery() {
        val (req, _) = capture("""{"items":[]}""") { hub ->
            hub.logs.getLogsByCorrelationId(mapOf("targetCorrelationId" to "corr_1"))
        }

        assertEquals("GET", req.method)
        assertEquals("/v3/logs/audit", req.path)
        assertEquals(setOf("targetCorrelationId=corr_1"), params(req.query))
    }

    @Test
    fun testLoggingIntegrationPostsTheIntegrationId() {
        val (req, _) = capture("""{"isSuccess":true}""") { hub ->
            hub.logs.testLoggingIntegration(mapOf("integrationId" to "int_mongo"))
        }

        assertEquals("POST", req.method)
        assertEquals("/v3/logs/integrations/test", req.path)
        assertEquals(mapOf("integrationId" to "int_mongo"), req.body)
    }
}
