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

    fun getAllContacts(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createContact(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun mergeContacts(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/merge",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteContact(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getContact(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun addContactIdentity(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}/identities",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun removeContactIdentity(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}/identities/{identityId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun promoteContactIdentity(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}/identities/{identityId}/promote",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun grantContactConsent(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}/marketing-state/{channel}/consent",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun unsubscribeContact(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/contacts/{contactId}/marketing-state/{channel}/unsubscribe",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun razorSyntaxCheck(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/templates/razor-syntax-check",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveEmailValidationIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/validation/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testEmailValidationIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/email/validation/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaigns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createPushCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignMessages(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{campaignId}/messages",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignMessage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{campaignId}/messages/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deletePushCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignBatches(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{id}/batches",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignBatchNotifications(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{id}/batches/{batchId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignBatchNotification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{id}/batches/{batchId}/{notificationId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushCampaignStatistics(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/campaigns/{id}/stats",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun checkIntegrationAvailability(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/app/check",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testCodeMashIosAppIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/integrations/test/codemash-app",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getPushSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/push/settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaigns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createSmsCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignMessages(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{campaignId}/messages",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignMessage(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{campaignId}/messages/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteSmsCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaign(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignBatches(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}/batches",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignBatchNotifications(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}/batches/{batchId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignBatchNotification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}/batches/{batchId}/{notificationId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsCampaignStatistics(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/campaigns/{id}/stats",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableSms(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableSms(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun confirmSmsIntegrationHumanDelivery(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/confirm-human-delivery",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setSmsIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableSmsIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun previewSmsNotification(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/preview",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsTemplates(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun smsRazorSyntaxCheck(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/razor-syntax-check",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun archiveSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{Id}/archive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun cloneSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{Id}/clone",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSmsMessageContentTokens(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{id}/tokens",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun unArchiveSmsTemplate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/notifications/sms/templates/{Id}/unarchive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

}
