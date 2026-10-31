package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class TriggersModuleTest {
    private data class Seen(val method: String, val path: String, val query: String?, val body: String)

    /** Runs [call] against a throw-away local server, never a real gateway. */
    private fun capture(call: (NorbixHub) -> Unit): Seen {
        var seen: Seen? = null
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            val body = ex.requestBody.readBytes().toString(Charsets.UTF_8)
            seen = Seen(ex.requestMethod, ex.requestURI.path, ex.requestURI.rawQuery, body)
            val bytes = "{}".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            call(NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = "http://127.0.0.1:${server.address.port}"))
        } finally {
            server.stop(0)
        }
        return assertNotNull(seen)
    }

    @Test
    fun moduleSurface() {
        assertNotNull(NorbixHub(projectId = "proj", bearerToken = "token").triggers)
    }

    @Test
    fun getTriggerRunsSendsTheFiltersOnTheQuery() {
        val seen = capture { it.triggers.getTriggerRuns(mapOf("triggerType" to "Schema", "triggerId" to "trg_1", "status" to "failed")) }
        assertEquals("GET", seen.method)
        assertTrue(seen.path.endsWith("/triggers/runs"), seen.path)
        assertEquals(setOf("triggerType=Schema", "triggerId=trg_1", "status=failed"), seen.query?.split("&")?.toSet())
    }

    @Test
    fun getTriggerRunPutsTheIdInThePathAndKeepsTheType() {
        val seen = capture { it.triggers.getTriggerRun(mapOf("id" to "trr_1", "triggerType" to "Membership")) }
        assertTrue(seen.path.endsWith("/triggers/runs/trr_1"), seen.path)
        assertEquals("triggerType=Membership", seen.query)
    }

    @Test
    fun checkTriggerExecutionIdentityPostsTheAction() {
        val seen = capture { it.triggers.checkTriggerExecutionIdentity(mapOf("triggerType" to "Schema", "action" to mapOf("type" to "Email"))) }
        assertEquals("POST", seen.method)
        assertTrue(seen.path.endsWith("/triggers/execution-identity/check"), seen.path)
        assertTrue(seen.body.contains("\"triggerType\":\"Schema\""), seen.body)
    }

    @Test
    fun executionIdentitiesListAndCreate() {
        val list = capture { it.membership.getExecutionIdentities() }
        assertEquals("GET", list.method)
        assertTrue(list.path.endsWith("/membership/execution-identities"), list.path)

        val create = capture { it.membership.createExecutionIdentity(mapOf("name" to "Orders bot", "roleIds" to listOf("Editor"))) }
        assertEquals("POST", create.method)
        assertTrue(create.body.contains("\"name\":\"Orders bot\""), create.body)
    }
}
