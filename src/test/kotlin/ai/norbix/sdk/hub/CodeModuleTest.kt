package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * `hub.code` — the five cloud-function routes of the gateway contract
 * (Code.Functions.md §3.3, §3.4, §5.1), one test per method, against a
 * throw-away local server (the same fake-transport pattern as
 * [SchedulerModuleTest]). Never a real gateway. Each test checks the verb,
 * the path, and where the parameters go (query for GET, JSON body for the
 * invoke).
 */
class CodeModuleTest {

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
            rec.query = ex.requestURI.query
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = "{}".toByteArray()
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

    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.code)
    }

    @Test
    fun getCodeFunctions() = withServer { hub, rec ->
        hub.code.getCodeFunctions(
            mapOf("integrationId" to "int_1", "prefix" to "orders-", "tag" to "team=orders", "pageSize" to 50),
        )
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/functions", rec.path)
        assertEquals("integrationId=int_1&prefix=orders-&tag=team=orders&pageSize=50", rec.query)
        assertEquals("", rec.body)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getCodeFunctionQualifiers() = withServer { hub, rec ->
        hub.code.getCodeFunctionQualifiers(mapOf("integrationId" to "int_1", "functionId" to "orders-on-update"))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/functions/qualifiers", rec.path)
        assertEquals("integrationId=int_1&functionId=orders-on-update", rec.query)
        assertEquals("", rec.body)
    }

    @Test
    fun invokeCodeFunction() = withServer { hub, rec ->
        hub.code.invokeCodeFunction(
            mapOf(
                "functionRef" to mapOf(
                    "integrationId" to "int_1",
                    "functionId" to "orders-on-update",
                    "qualifier" to "prod",
                ),
                "payload" to mapOf("orderId" to "6ac54a59212c29912eaddd81", "dryRun" to true),
                "invocationType" to "Sync",
                "runAsUserId" to "usr_svc",
            ),
        )
        assertEquals("POST", rec.method)
        assertEquals("/v3/code/functions/invoke", rec.path)
        assertNull(rec.query)
        assertEquals(
            mapOf(
                "functionRef" to mapOf(
                    "integrationId" to "int_1",
                    "functionId" to "orders-on-update",
                    "qualifier" to "prod",
                ),
                "payload" to mapOf("orderId" to "6ac54a59212c29912eaddd81", "dryRun" to true),
                "invocationType" to "Sync",
                "runAsUserId" to "usr_svc",
            ),
            Gson().fromJson(rec.body, Map::class.java),
        )
    }

    @Test
    fun getCodeFunctionEventSample() = withServer { hub, rec ->
        hub.code.getCodeFunctionEventSample(
            mapOf("source" to "database", "event" to "database.record.updated", "schemaId" to "sch_1"),
        )
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/functions/event-sample", rec.path)
        assertEquals("source=database&event=database.record.updated&schemaId=sch_1", rec.query)
        assertEquals("", rec.body)
    }

    @Test
    fun getCodeFunctionRuns() = withServer { hub, rec ->
        hub.code.getCodeFunctionRuns(mapOf("triggerId" to "trg_1", "limit" to 5))
        assertEquals("GET", rec.method)
        assertEquals("/v3/code/functions/runs", rec.path)
        assertEquals("triggerId=trg_1&limit=5", rec.query)
        assertEquals("", rec.body)
    }
}
