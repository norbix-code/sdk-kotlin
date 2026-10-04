package ai.norbix.sdk.hub

import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * `hub.scheduler` — all 8 Scheduler Hub endpoints, one test per method,
 * against a throw-away local server (the same fake-transport pattern as
 * [SmsNotificationsTest]). Never a real gateway. Each test checks the verb,
 * the full path with the task id substituted, where the parameters go
 * (path / query / body), and for save the JSON body with the typed
 * email-campaign task.
 */
class SchedulerModuleTest {

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
    fun enableScheduler() = withServer { hub, rec ->
        hub.scheduler.enableScheduler()
        assertEquals("PUT", rec.method)
        assertEquals("/v2/scheduler/enable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableScheduler() = withServer { hub, rec ->
        hub.scheduler.disableScheduler()
        assertEquals("PUT", rec.method)
        assertEquals("/v2/scheduler/disable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSchedulerTasks() = withServer { hub, rec ->
        hub.scheduler.getSchedulerTasks(
            mapOf("type" to "EmailCampaign", "enabled" to true, "pageSize" to 20),
        )
        assertEquals("GET", rec.method)
        assertEquals("/v2/scheduler/tasks", rec.path)
        assertEquals("type=EmailCampaign&enabled=true&pageSize=20", rec.query)
        assertEquals("", rec.body)
    }

    @Test
    fun getSchedulerTask() = withServer { hub, rec ->
        hub.scheduler.getSchedulerTask(mapOf("id" to "tsk_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/scheduler/tasks/tsk_1", rec.path)
        assertNull(rec.query)
    }

    @Test
    fun saveSchedulerTask() = withServer { hub, rec ->
        hub.scheduler.saveSchedulerTask(
            mapOf(
                "name" to "Weekly digest",
                "cron" to "0 9 * * 1",
                "initiatorUserId" to "usr_1",
                "isEnabled" to true,
                "stopOnError" to false,
                "task" to mapOf(
                    "type" to "EmailCampaign",
                    "campaign" to mapOf(
                        "source" to "AllUsers",
                        "templateId" to "tmpl_1",
                    ),
                ),
            ),
        )
        assertEquals("POST", rec.method)
        assertEquals("/v2/scheduler/tasks", rec.path)
        assertNull(rec.query)
        assertEquals(
            mapOf(
                "name" to "Weekly digest",
                "cron" to "0 9 * * 1",
                "initiatorUserId" to "usr_1",
                "isEnabled" to true,
                "stopOnError" to false,
                "task" to mapOf(
                    "type" to "EmailCampaign",
                    "campaign" to mapOf("source" to "AllUsers", "templateId" to "tmpl_1"),
                ),
            ),
            Gson().fromJson(rec.body, Map::class.java),
        )
    }

    @Test
    fun deleteSchedulerTask() = withServer { hub, rec ->
        hub.scheduler.deleteSchedulerTask(mapOf("id" to "tsk_1"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v2/scheduler/tasks/tsk_1", rec.path)
        assertNull(rec.query)
    }

    @Test
    fun enableSchedulerTask() = withServer { hub, rec ->
        hub.scheduler.enableSchedulerTask(mapOf("id" to "tsk_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/scheduler/tasks/tsk_1/enable", rec.path)
        assertEquals("", rec.body)
    }

    @Test
    fun disableSchedulerTask() = withServer { hub, rec ->
        hub.scheduler.disableSchedulerTask(mapOf("id" to "tsk_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/scheduler/tasks/tsk_1/disable", rec.path)
        assertEquals("", rec.body)
    }
}
