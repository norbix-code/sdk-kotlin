package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * The gateway reads the caller's project id ONLY from `norbix-project-id` and
 * the account id from `norbix-account-id` (RequestProjectHeader). The old
 * `X-CM-ProjectId` / `X-CM-AccountId` names are not read, so they must never
 * go out. Each header is sent only when its id is set, like the TypeScript SDK.
 */
class TenantHeadersTest {

    private class Seen {
        var project: String? = null
        var account: String? = null
        var legacyProject: String? = null
        var legacyAccount: String? = null
        var legacyNbProject: String? = null
    }

    private fun withServer(block: (baseUrl: String) -> Unit): Seen {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = Seen()
        server.createContext("/") { ex ->
            seen.project = ex.requestHeaders.getFirst("norbix-project-id")
            seen.account = ex.requestHeaders.getFirst("norbix-account-id")
            seen.legacyProject = ex.requestHeaders.getFirst("X-CM-ProjectId")
            seen.legacyAccount = ex.requestHeaders.getFirst("X-CM-AccountId")
            seen.legacyNbProject = ex.requestHeaders.getFirst("nb-project-id")
            val bytes = """{"responseStatus":{"isSuccess":true}}""".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}")
        } finally {
            server.stop(0)
        }
        return seen
    }

    private fun assertNoLegacyHeaders(seen: Seen) {
        assertNull(seen.legacyProject, "X-CM-ProjectId must not be sent")
        assertNull(seen.legacyAccount, "X-CM-AccountId must not be sent")
        assertNull(seen.legacyNbProject, "nb-project-id must not be sent")
    }

    @Test
    fun apiSendsProjectAndAccountInNorbixHeaders() {
        val seen = withServer { baseUrl ->
            val api = NorbixApi(projectId = "proj_1", bearerToken = "tok", baseUrl = baseUrl)
            api.setAccountId("acc_1")
            api.echo.echo()
        }
        assertEquals("proj_1", seen.project)
        assertEquals("acc_1", seen.account)
        assertNoLegacyHeaders(seen)
    }

    @Test
    fun hubSendsProjectAndAccountInNorbixHeaders() {
        val seen = withServer { baseUrl ->
            val hub = NorbixHub(projectId = "proj_2", bearerToken = "tok", baseUrl = baseUrl)
            hub.setAccountId("acc_2")
            hub.echo.echo()
        }
        assertEquals("proj_2", seen.project)
        assertEquals("acc_2", seen.account)
        assertNoLegacyHeaders(seen)
    }

    @Test
    fun noAccountHeaderWhenAccountIdIsNullOrBlank() {
        for (accountId in listOf(null, "", "   ")) {
            val seen = withServer { baseUrl ->
                val api = NorbixApi(projectId = "proj_1", bearerToken = "tok", baseUrl = baseUrl)
                api.setAccountId(accountId) // also ignores a NORBIX_ACCOUNT_ID in the environment
                api.echo.echo()
            }
            assertEquals("proj_1", seen.project)
            assertNull(seen.account, "accountId=${accountId?.let { "'$it'" }}")
            assertNoLegacyHeaders(seen)
        }
    }

    @Test
    fun noProjectHeaderWhenProjectIdIsBlank() {
        val seen = withServer { baseUrl ->
            val hub = NorbixHub(projectId = "", bearerToken = "tok", baseUrl = baseUrl)
            hub.setAccountId(null)
            hub.echo.echo()
        }
        assertNull(seen.project)
        assertNull(seen.account)
        assertNoLegacyHeaders(seen)
    }
}
