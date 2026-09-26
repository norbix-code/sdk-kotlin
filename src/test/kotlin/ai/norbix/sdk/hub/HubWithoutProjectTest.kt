package ai.norbix.sdk.hub

import ai.norbix.sdk.core.LoginCredentials
import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

// An account owner logs in and lists projects before choosing one.
class HubWithoutProjectTest {

    private fun withServer(block: (baseUrl: String, seen: MutableList<Map<String, String?>>) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = mutableListOf<Map<String, String?>>()
        server.createContext("/") { ex ->
            seen += mapOf(
                "path" to ex.requestURI.path,
                "authorization" to ex.requestHeaders.getFirst("Authorization"),
                "project" to ex.requestHeaders.getFirst("X-CM-ProjectId"),
                "account" to ex.requestHeaders.getFirst("X-CM-AccountId"),
            )
            val body = (if (ex.requestURI.path == "/auth") """{"bearerToken":"tok"}""" else """{"list":[]}""").toByteArray()
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

    @Test
    fun loginAndAccountCallsWorkWithoutProjectOrAccountId() = withServer { baseUrl, seen ->
        val hub = NorbixHub(baseUrl = baseUrl, version = "v3")

        hub.login(LoginCredentials(userName = "a@b.c", password = "pw"))
        hub.account.getProjects()

        val projects = seen[1]
        assertEquals("/v3/account/projects", projects["path"])
        assertEquals("Bearer tok", projects["authorization"])
        assertNull(projects["project"])
        assertNull(projects["account"])
    }

    @Test
    fun projectCallWithoutProjectThrowsUntilProjectIsSet() = withServer { baseUrl, seen ->
        val hub = NorbixHub(bearerToken = "tok", baseUrl = baseUrl)

        val error = assertFailsWith<NorbixError> { hub.echo.echo() }
        assertEquals("NORBIX_PROJECT_SCOPE_REQUIRED", error.code)
        assertTrue(seen.isEmpty(), "nothing should be sent without a project")

        hub.setProjectId("p1")
        hub.echo.echo()
        assertEquals("p1", seen.single()["project"])
    }
}
