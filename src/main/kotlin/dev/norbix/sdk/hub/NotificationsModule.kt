package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class NotificationsModule(private val transport: Transport) {
    fun getUserNotificationPreferences(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/user/preferences",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateUserNotificationsPreferences(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/user/preferences",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableEmail(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableEmail(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun attachFileToTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/attachments",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailTemplates(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getMjml(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/mjml",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSystemEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/system-templates/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSystemEmailTemplates(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/system-templates",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailTemplateAvailableTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{id}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEmailSignature(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/signatures/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailSignature(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/signatures/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailSignatures(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/signatures",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailSignature(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/signatures",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmEmailIntegrationHumanDelivery(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/confirm-human-delivery",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setEmailsIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testEmailIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun archiveEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{Id}/archive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun cloneEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{Id}/clone",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun unArchiveEmailTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/{Id}/unarchive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEmailFooter(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/footers/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailFooter(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/footers/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailFooters(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/footers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailFooter(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/footers",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createEmailCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEmailCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaigns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignBatches(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{id}/batches",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignBatchNotification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{id}/batches/{batchId}/{notificationId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignBatchNotifications(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{id}/batches/{batchId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignStatistics(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/campaigns/{id}/stats",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun previewEmailNotification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/preview",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignMessage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/emails/campaigns/{campaignId}/messages/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEmailCampaignMessages(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/emails/campaigns/{campaignId}/messages",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disablePush(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enablePush(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun archivePushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{Id}/archive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun clonePushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{Id}/clone",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createPushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushTemplates(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushMessageContentTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{id}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun unArchivePushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates/{Id}/unarchive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updatePushTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/templates",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmPushIntegrationHumanDelivery(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/confirm-human-delivery",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disablePushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enablePushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun savePushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setPushIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testPushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun registerCodeMashAppPushIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/app/request",
        method = "POST",
        request = request,
        scope = Scope.ACCOUNT,
    )

    fun registerDevice(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/devices",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
