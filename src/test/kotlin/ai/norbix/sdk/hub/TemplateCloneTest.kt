package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Template clone answers the new copy's id. The gateway's clone requests
 * (email, SMS and push templates) answer an `IdResponse`
 * (`{"id": "<new template id>"}`); the SDK hands it to the caller as is.
 * Every call goes to a throw-away local server (the same fake-transport
 * pattern as [SmsNotificationsTest]) — never a real gateway.
 */
class TemplateCloneTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var calls = 0
    }

    private fun withServer(block: (NorbixHub, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.calls++
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            val bytes = """{"id":"tpl_copy"}""".toByteArray()
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

    private fun assertClone(rec: Recorder, channel: String, answer: Any?) {
        assertEquals("tpl_copy", (answer as Map<*, *>)["id"])
        assertEquals(1, rec.calls)
        assertEquals("POST", rec.method)
        assertEquals("/v3/notifications/$channel/templates/tpl_source/clone", rec.path)
    }

    @Test
    fun cloneEmailTemplateReturnsTheCopyId() = withServer { hub, rec ->
        val answer = hub.notifications.cloneEmailTemplate(mapOf("Id" to "tpl_source"))
        assertClone(rec, "email", answer)
    }

    @Test
    fun cloneSmsTemplateReturnsTheCopyId() = withServer { hub, rec ->
        val answer = hub.notifications.cloneSmsTemplate(mapOf("Id" to "tpl_source"))
        assertClone(rec, "sms", answer)
    }

    @Test
    fun clonePushTemplateReturnsTheCopyId() = withServer { hub, rec ->
        val answer = hub.notifications.clonePushTemplate(mapOf("Id" to "tpl_source"))
        assertClone(rec, "push", answer)
    }
}
