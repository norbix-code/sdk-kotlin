package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

// The gateway reads nb-project-id / nb-account-id on every call, and
// norbix-project-id on /auth (project-user login). It never read X-CM-*.
class TenantHeadersTest {

    private fun withServer(block: (baseUrl: String, seen: MutableList<Map<String, String?>>) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = mutableListOf<Map<String, String?>>()
        server.createContext("/") { ex ->
            seen += mapOf(
                "path" to ex.requestURI.path,
                "nb-project-id" to ex.requestHeaders.getFirst("nb-project-id"),
                "nb-account-id" to ex.requestHeaders.getFirst("nb-account-id"),
                "norbix-project-id" to ex.requestHeaders.getFirst("norbix-project-id"),
                "X-CM-ProjectId" to ex.requestHeaders.getFirst("X-CM-ProjectId"),
                "X-CM-AccountId" to ex.requestHeaders.getFirst("X-CM-AccountId"),
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
    fun projectScopedHubCallSendsTheGatewayProjectAndAccountHeaders() = withServer { baseUrl, seen ->
        val hub = NorbixHub(bearerToken = "tok", baseUrl = baseUrl, version = "v3")
        hub.setProjectId("prj_1")
        hub.setAccountId("acc_1")

        hub.membership.getRoles()

        val request = seen.single()
        assertEquals("/v3/membership/roles", request["path"])
        assertEquals("prj_1", request["nb-project-id"])
        assertEquals("acc_1", request["nb-account-id"])
        assertNull(request["X-CM-ProjectId"])
        assertNull(request["X-CM-AccountId"])
    }

    @Test
    fun hubLoginDoesNotSendTheLoginProjectHeader() = withServer { baseUrl, seen ->
        val hub = NorbixHub(projectId = "prj_1", baseUrl = baseUrl)

        hub.login(LoginCredentials(userName = "a@b.c", password = "pw"))

        assertNull(seen.single()["norbix-project-id"])
    }

    @Test
    fun apiLoginSendsTheLoginProjectHeader() = withServer { baseUrl, seen ->
        val api = NorbixApi(projectId = "prj_1", baseUrl = baseUrl)

        api.login(LoginCredentials(userName = "alice", password = "secret"))

        val request = seen.single()
        assertEquals("/auth", request["path"])
        assertEquals("prj_1", request["norbix-project-id"])
        assertEquals("prj_1", request["nb-project-id"])
    }
}
