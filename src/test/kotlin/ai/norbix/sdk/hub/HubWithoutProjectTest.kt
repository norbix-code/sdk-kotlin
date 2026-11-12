package ai.norbix.sdk.hub

import ai.norbix.sdk.core.LoginCredentials
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

// An account owner logs in and lists projects before choosing one.
class HubWithoutProjectTest {

    private fun withServer(block: (baseUrl: String, seen: MutableList<Map<String, String?>>) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = mutableListOf<Map<String, String?>>()
        server.createContext("/") { ex ->
            seen += mapOf(
                "path" to ex.requestURI.path,
                "authorization" to ex.requestHeaders.getFirst("Authorization"),
                "project" to ex.requestHeaders.getFirst("norbix-project-id"),
                "account" to ex.requestHeaders.getFirst("norbix-account-id"),
            )
            val body = (if (ex.requestURI.path == "/auth") """{"bearerToken":"tok"}""" else """{"list":[]}""").toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", seen)
        } finally {
            server.stop(0)
        }
    }

    /** A hub with no project and no account id — env vars ignored too. */
    private fun bareHub(baseUrl: String): NorbixHub = NorbixHub(baseUrl = baseUrl, version = "v3").also {
        it.setProjectId(null)
        it.setAccountId(null)
        it.setBearerToken(null)
        it.setApiKey(null)
    }

    @Test
    fun loginAndAccountCallsWorkWithoutProjectOrAccountId() = withServer { baseUrl, seen ->
        val hub = bareHub(baseUrl)

        hub.login(LoginCredentials(userName = "a@b.c", password = "pw"))
        hub.account.getProjects()

        val projects = seen[1]
        assertEquals("/v3/account/projects", projects["path"])
        assertEquals("Bearer tok", projects["authorization"])
        assertNull(projects["project"])
        assertNull(projects["account"])
    }

    @Test
    fun setProjectIdSendsTheProjectOnLaterCalls() = withServer { baseUrl, seen ->
        val hub = bareHub(baseUrl)
        hub.setBearerToken("tok")

        hub.echo.echo()
        assertNull(seen.last()["project"])

        hub.setProjectId("p1")
        hub.echo.echo()
        assertEquals("p1", seen.last()["project"])
    }
}
