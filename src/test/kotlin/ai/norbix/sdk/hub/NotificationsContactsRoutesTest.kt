package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.io.File
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Contacts moved from `/notifications/contacts` to `/membership/users`; the
 * gateway answers 404 on the old path. The deprecated notifications contact
 * methods keep their names and call the membership routes. Consent and
 * unsubscribe are served by the API host only, which a Hub client cannot
 * reach, so they throw before sending anything.
 */
@Suppress("DEPRECATION")
class NotificationsContactsRoutesTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
    }

    private fun withServer(block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.rawQuery
            val body = "{}".toByteArray()
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

    private val cases: List<Triple<String, String, (NotificationsModule) -> Any?>> = listOf(
        Triple("GET", "/v3/membership/users", { m -> m.getAllContacts() }),
        Triple("POST", "/v3/membership/users", { m -> m.createContact() }),
        Triple("POST", "/v3/membership/users/merge", { m -> m.mergeContacts() }),
        Triple("DELETE", "/v3/membership/users/ct_1", { m -> m.deleteContact(mapOf("contactId" to "ct_1")) }),
        Triple("GET", "/v3/membership/users/ct_1", { m -> m.getContact(mapOf("contactId" to "ct_1")) }),
        Triple("POST", "/v3/membership/users/ct_1/identities", { m ->
            m.addContactIdentity(mapOf("contactId" to "ct_1", "authId" to "usr_1"))
        }),
        Triple("DELETE", "/v3/membership/users/ct_1/identities/usr_1", { m ->
            m.removeContactIdentity(mapOf("contactId" to "ct_1", "authId" to "usr_1"))
        }),
        Triple("POST", "/v3/membership/users/ct_1/identities/usr_1/promote", { m ->
            m.promoteContactIdentity(mapOf("contactId" to "ct_1", "authId" to "usr_1"))
        }),
    )

    @Test
    fun contactMethodsCallTheMembershipRoutes() {
        for ((method, path, call) in cases) {
            withServer { base, rec ->
                val hub = NorbixHub(projectId = "proj", apiKey = "key_1", baseUrl = base)
                call(hub.notifications)

                assertEquals(method, rec.method, path)
                assertEquals(path, rec.path)
            }
        }
    }

    @Test
    fun identityMethodsStillAcceptTheOldIdentityIdKey() {
        withServer { base, rec ->
            val hub = NorbixHub(projectId = "proj", apiKey = "key_1", baseUrl = base)
            hub.notifications.removeContactIdentity(mapOf("contactId" to "ct_1", "identityId" to "usr_1"))

            assertEquals("/v3/membership/users/ct_1/identities/usr_1", rec.path)
            assertNull(rec.query, "identityId must not leak into the query string")
        }
        withServer { base, rec ->
            val hub = NorbixHub(projectId = "proj", apiKey = "key_1", baseUrl = base)
            hub.notifications.promoteContactIdentity(mapOf("contactId" to "ct_1", "identityId" to "usr_1"))

            assertEquals("/v3/membership/users/ct_1/identities/usr_1/promote", rec.path)
        }
    }

    @Test
    fun consentMethodsThrowAndPointToTheApiClient() {
        withServer { base, rec ->
            val hub = NorbixHub(projectId = "proj", apiKey = "key_1", baseUrl = base)
            val request = mapOf("contactId" to "ct_1", "channel" to "Email")
            for ((name, call) in listOf<Pair<String, () -> Any?>>(
                "grantContactConsent" to { hub.notifications.grantContactConsent(request) },
                "unsubscribeContact" to { hub.notifications.unsubscribeContact(request) },
            )) {
                val err = assertFailsWith<NorbixError> { call() }
                assertEquals("NORBIX_API_ROUTE", err.code)
                assertTrue(err.message.contains("NorbixApi.membership.$name"), err.message)
            }
            assertNull(rec.path, "nothing may be sent to the Hub")
        }
    }

    @Test
    fun noModuleCallsTheOldContactsRoute() {
        val offenders = File("src/main/kotlin").walkTopDown()
            .filter { it.isFile && it.extension == "kt" && it.readText().contains("/notifications/contacts") }
            .map { it.path }
            .toList()
        assertEquals(emptyList(), offenders)
    }
}
