package ai.norbix.sdk.hub

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Every module switch (enable / disable for database, files, push, SMS,
 * email, payments, logs, membership and code) is sent as PUT. The gateway
 * moved these 18 routes from GET to PUT; GET is kept only as a hidden,
 * deprecated alias. Runs against a throw-away local server, never a real
 * gateway, and checks the verb, the path and that no query string is sent.
 */
class ModuleEnableVerbTest {

    private data class Sent(val method: String, val path: String, val query: String?)

    private data class Case(val name: String, val path: String, val call: (NorbixHub) -> Any?)

    private val cases = listOf(
        Case("enableDatabase", "/v2/database/enable") { it.database.enableDatabase() },
        Case("disableDatabase", "/v2/database/disable") { it.database.disableDatabase() },
        Case("enableFiles", "/v2/files/enable") { it.files.enableFiles() },
        Case("disableFiles", "/v2/files/disable") { it.files.disableFiles() },
        Case("enablePush", "/v2/notifications/push/enable") { it.notifications.enablePush() },
        Case("disablePush", "/v2/notifications/push/disable") { it.notifications.disablePush() },
        Case("enableSms", "/v2/notifications/sms/enable") { it.notifications.enableSms() },
        Case("disableSms", "/v2/notifications/sms/disable") { it.notifications.disableSms() },
        Case("enableEmail", "/v2/notifications/email/enable") { it.notifications.enableEmail() },
        Case("disableEmail", "/v2/notifications/email/disable") { it.notifications.disableEmail() },
        Case("enablePayments", "/v2/payments/enable") { it.payments.enablePayments() },
        Case("disablePayments", "/v2/payments/disable") { it.payments.disablePayments() },
        Case("enableLogging", "/v2/logs/enable") { it.logs.enableLogging() },
        Case("disableLogging", "/v2/logs/disable") { it.logs.disableLogging() },
        Case("enableMembership", "/v2/membership/enable") { it.membership.enableMembership() },
        Case("disableMembership", "/v2/membership/disable") { it.membership.disableMembership() },
        Case("enableCode", "/v2/code/enable") { it.code.enableCode() },
        Case("disableCode", "/v2/code/disable") { it.code.disableCode() },
    )

    @Test
    fun everyModuleSwitchIsSentAsPut() {
        val sent = mutableListOf<Sent>()
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            sent += Sent(ex.requestMethod, ex.requestURI.path, ex.requestURI.query)
            val bytes = "{}".toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(200, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val hub = NorbixHub(
                projectId = "proj",
                bearerToken = "token",
                baseUrl = "http://127.0.0.1:${server.address.port}",
            )
            cases.forEach { it.call(hub) }
        } finally {
            server.stop(0)
        }

        assertEquals(
            cases.map { "${it.name}: PUT ${it.path} query=null" },
            cases.zip(sent).map { (c, s) -> "${c.name}: ${s.method} ${s.path} query=${s.query}" },
        )
    }
}
