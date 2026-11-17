package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * The membership token routes (e-mail bindings of the settings, trigger event values) against a
 * throw-away local server (fake transport, never a real gateway): verb, path, query string and
 * headers.
 */
class MembershipTokenRoutesTest {

    private fun <T> withServer(block: (String, HashMap<String, String?>) -> T): T {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["method"] = ex.requestMethod
            seen["path"] = ex.requestURI.path
            seen["query"] = ex.requestURI.query
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            seen["auth"] = ex.requestHeaders.getFirst("Authorization")
            seen["project"] = ex.requestHeaders.getFirst("norbix-project-id")
            val body = """{"result":{"ok":true}}""".toByteArray()
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            return block("http://127.0.0.1:${server.address.port}", seen)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun emailBindingsSendsSettingAndTemplateInTheQuery() = withServer { base, seen ->
        val client = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
        val answer = client.membership.getMembershipEmailBindings(mapOf("setting" to "Welcome", "templateId" to "tmpl_1"))
        assertEquals("GET", seen["method"])
        assertEquals("/v3/membership/settings/email-bindings", seen["path"])
        assertEquals(setOf("setting=Welcome", "templateId=tmpl_1"), seen["query"]!!.split('&').toSet())
        assertEquals("", seen["body"])
        assertEquals("Bearer token", seen["auth"])
        assertEquals("proj", seen["project"])
        assertEquals(mapOf("result" to mapOf("ok" to true)), answer)
    }

    @Test
    fun triggerEventValuesIsAPlainGet() = withServer { base, seen ->
        val client = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
        val answer = client.membership.getMembershipTriggerEventValues()
        assertEquals("GET", seen["method"])
        assertEquals("/v3/membership/triggers/event-values", seen["path"])
        assertEquals(null, seen["query"])
        assertEquals("Bearer token", seen["auth"])
        assertEquals("proj", seen["project"])
        assertEquals(mapOf("result" to mapOf("ok" to true)), answer)
    }
}
