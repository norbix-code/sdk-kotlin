package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * The three notification preview routes open with a signed link (`hash`)
 * alone. A client with no credentials must still send the call — with no
 * Authorization header — and a client with a key must still send it.
 */
class NotificationPreviewSignedLinkTest {

    private class Recorder {
        var path: String? = null
        var query: String? = null
        var auth: String? = null
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.rawQuery
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val body = """{"html":"<p>hi</p>"}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    private val previews: List<Pair<String, (NotificationsModule, Map<String, Any?>) -> Any?>> = listOf(
        "push" to { m, r -> m.previewPushNotification(r) },
        "email" to { m, r -> m.previewEmailNotification(r) },
        "sms" to { m, r -> m.previewSmsNotification(r) },
    )

    @Test
    fun previewWithSignedLinkAndNoCredentialsSendsNoAuthorization() {
        for ((kind, call) in previews) {
            withServer { base, rec ->
                val hub = NorbixHub(projectId = "proj", baseUrl = base)
                call(hub.notifications, mapOf("hash" to "signed-link-abc"))

                assertEquals("/v2/notifications/$kind/preview", rec.path, kind)
                assertEquals("hash=signed-link-abc", rec.query, kind)
                assertNull(rec.auth, "$kind: a signed preview link must work without signing in")
            }
        }
    }

    @Test
    fun previewWithApiKeySendsAuthorization() {
        for ((kind, call) in previews) {
            withServer { base, rec ->
                val hub = NorbixHub(projectId = "proj", apiKey = "sk_test", baseUrl = base)
                call(hub.notifications, mapOf("hash" to "signed-link-abc"))

                assertEquals("Bearer sk_test", rec.auth, kind)
            }
        }
    }
}
