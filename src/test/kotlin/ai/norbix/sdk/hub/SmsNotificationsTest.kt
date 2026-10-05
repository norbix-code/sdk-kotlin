package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * `hub.notifications` SMS — all 34 SMS Hub endpoints, one test per method,
 * against a throw-away local server (the same fake-transport pattern as
 * [FilesModuleTest]). Never a real gateway, never a real provider. Each
 * test checks the verb, the full path with the ids substituted in the
 * gateway's own spelling, and the body or query where the call carries one.
 */
class SmsNotificationsTest {

    private class Recorder {
        var method: String? = null
        var path: String? = null
        var query: String? = null
        var body: String? = null
        var auth: String? = null
    }

    private fun withServer(status: Int = 200, body: String = "{}", block: (NorbixHub, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.method = ex.requestMethod
            rec.path = ex.requestURI.path
            rec.query = ex.requestURI.query
            rec.body = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            val bytes = body.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
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

    @Test
    fun enableSms() = withServer { hub, rec ->
        hub.notifications.enableSms(emptyMap())
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/enable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableSms() = withServer { hub, rec ->
        hub.notifications.disableSms(emptyMap())
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/disable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsDisableDependencies() = withServer { hub, rec ->
        hub.notifications.getSmsDisableDependencies(emptyMap())
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/disable-dependencies", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsSettings() = withServer { hub, rec ->
        hub.notifications.getSmsSettings(emptyMap())
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/settings", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun previewSmsNotification() = withServer { hub, rec ->
        hub.notifications.previewSmsNotification(mapOf("hash" to "abc.def"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/preview", rec.path)
        assertTrue(rec.query!!.contains("hash=abc.def"), rec.query!!)
    }

    @Test
    fun getSmsIntegrations() = withServer { hub, rec ->
        hub.notifications.getSmsIntegrations(emptyMap())
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/integrations", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsIntegration() = withServer { hub, rec ->
        hub.notifications.getSmsIntegration(mapOf("id" to "nbin_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/integrations/nbin_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun saveSmsIntegration() = withServer { hub, rec ->
        hub.notifications.saveSmsIntegration(mapOf("integration" to mapOf("smsType" to "Fake", "integrationName" to "sms-sdk-secondary-fake")))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/integrations", rec.path)
        assertTrue(rec.body!!.contains(""""smsType":"Fake""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun testSmsIntegration() = withServer { hub, rec ->
        hub.notifications.testSmsIntegration(mapOf("integrationId" to "nbin_1", "phoneNumber" to "+37060000000"))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/integrations/test", rec.path)
        assertTrue(rec.body!!.contains(""""integrationId":"nbin_1""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun confirmSmsIntegrationHumanDelivery() = withServer { hub, rec ->
        hub.notifications.confirmSmsIntegrationHumanDelivery(mapOf("integrationId" to "nbin_1"))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/integrations/confirm-human-delivery", rec.path)
        assertTrue(rec.body!!.contains(""""integrationId":"nbin_1""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteSmsIntegration() = withServer { hub, rec ->
        hub.notifications.deleteSmsIntegration(mapOf("Id" to "nbin_1"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v2/notifications/sms/integrations/nbin_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun setSmsIntegrationAsDefault() = withServer { hub, rec ->
        hub.notifications.setSmsIntegrationAsDefault(mapOf("Id" to "nbin_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/integrations/nbin_1/default", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun enableSmsIntegration() = withServer { hub, rec ->
        hub.notifications.enableSmsIntegration(mapOf("Id" to "nbin_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/integrations/nbin_1/enable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun disableSmsIntegration() = withServer { hub, rec ->
        hub.notifications.disableSmsIntegration(mapOf("Id" to "nbin_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/integrations/nbin_1/disable", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsTemplates() = withServer { hub, rec ->
        hub.notifications.getSmsTemplates(mapOf("pageSize" to 20))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/templates", rec.path)
        assertTrue(rec.query!!.contains("pageSize=20"), rec.query!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsTemplate() = withServer { hub, rec ->
        hub.notifications.getSmsTemplate(mapOf("id" to "tpl_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun createSmsTemplate() = withServer { hub, rec ->
        hub.notifications.createSmsTemplate(mapOf("name" to "sms-sdk-secondary-t1", "content" to mapOf("body" to "Hi @Model.FirstName")))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/templates", rec.path)
        assertTrue(rec.body!!.contains(""""name":"sms-sdk-secondary-t1""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun updateSmsTemplate() = withServer { hub, rec ->
        hub.notifications.updateSmsTemplate(mapOf("id" to "tpl_1", "name" to "sms-sdk-secondary-t1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/templates", rec.path)
        assertTrue(rec.body!!.contains(""""id":"tpl_1""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteSmsTemplate() = withServer { hub, rec ->
        hub.notifications.deleteSmsTemplate(mapOf("Id" to "tpl_1"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun archiveSmsTemplate() = withServer { hub, rec ->
        hub.notifications.archiveSmsTemplate(mapOf("Id" to "tpl_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1/archive", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun unArchiveSmsTemplate() = withServer { hub, rec ->
        hub.notifications.unArchiveSmsTemplate(mapOf("Id" to "tpl_1"))
        assertEquals("PUT", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1/unarchive", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun cloneSmsTemplate() = withServer { hub, rec ->
        hub.notifications.cloneSmsTemplate(mapOf("Id" to "tpl_1"))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1/clone", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsMessageContentTokens() = withServer { hub, rec ->
        hub.notifications.getSmsMessageContentTokens(mapOf("id" to "tpl_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/templates/tpl_1/tokens", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun renderSms() = withServer { hub, rec ->
        hub.notifications.renderSms(mapOf("code" to "Hi @Model.FirstName", "tokens" to listOf(mapOf("name" to "FirstName", "value" to "Ada"))))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/templates/render", rec.path)
        assertTrue(rec.body!!.contains(""""value":"Ada""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaigns() = withServer { hub, rec ->
        hub.notifications.getSmsCampaigns(mapOf("templateId" to "tpl_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns", rec.path)
        assertTrue(rec.query!!.contains("templateId=tpl_1"), rec.query!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun createSmsCampaign() = withServer { hub, rec ->
        hub.notifications.createSmsCampaign(mapOf("templateId" to "tpl_1", "deliveryStrategy" to "AllUsers"))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/campaigns", rec.path)
        assertTrue(rec.body!!.contains(""""templateId":"tpl_1""""), rec.body!!)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaign() = withServer { hub, rec ->
        hub.notifications.getSmsCampaign(mapOf("id" to "cmp_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun deleteSmsCampaign() = withServer { hub, rec ->
        hub.notifications.deleteSmsCampaign(mapOf("id" to "cmp_1"))
        assertEquals("DELETE", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun stopSmsCampaign() = withServer { hub, rec ->
        hub.notifications.stopSmsCampaign(mapOf("Id" to "cmp_1"))
        assertEquals("POST", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/stop", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaignStatistics() = withServer { hub, rec ->
        hub.notifications.getSmsCampaignStatistics(mapOf("id" to "cmp_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/stats", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaignBatches() = withServer { hub, rec ->
        hub.notifications.getSmsCampaignBatches(mapOf("id" to "cmp_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/batches", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaignBatchNotifications() = withServer { hub, rec ->
        hub.notifications.getSmsCampaignBatchNotifications(mapOf("id" to "cmp_1", "batchId" to "b_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/batches/b_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaignBatchNotification() = withServer { hub, rec ->
        hub.notifications.getSmsCampaignBatchNotification(mapOf("id" to "cmp_1", "batchId" to "b_1", "notificationId" to "n_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/batches/b_1/n_1", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun getSmsCampaignMessages() = withServer { hub, rec ->
        hub.notifications.getSmsCampaignMessages(mapOf("campaignId" to "cmp_1"))
        assertEquals("GET", rec.method)
        assertEquals("/v2/notifications/sms/campaigns/cmp_1/messages", rec.path)
        assertEquals("Bearer token", rec.auth)
    }

    @Test
    fun stopSmsCampaignRefusedByTheGatewayThrowsTheTypedError() = withServer(
        status = 400,
        body = """{"responseStatus":{"errorCode":"CM-ERRORS-SMS-001","message":"Campaign is already stopped"}}""",
    ) { hub, _ ->
        val error = assertFailsWith<NorbixError> {
            hub.notifications.stopSmsCampaign(mapOf("Id" to "cmp_1"))
        }
        assertEquals(400, error.status)
    }

    @Test
    fun stopSmsCampaignWithoutTheIdIsRefusedBeforeAnyRequest() = withServer { hub, rec ->
        val error = assertFailsWith<NorbixError> {
            hub.notifications.stopSmsCampaign(mapOf("campaignId" to "cmp_1"))
        }
        assertEquals("NORBIX_MISSING_PATH_PARAM", error.code)
        assertEquals(null, rec.path)
    }
}
