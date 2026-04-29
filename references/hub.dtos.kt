/* Options:
Date: 2026-04-27 20:33:14
Version: 10.06
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://localhost:5001

//Package: 
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddImplicitVersion: 
//AddDescriptionAsComments: True
//IncludeTypes: 
//ExcludeTypes: 
//InitializeCollections: False
//TreatTypesAsStrings: 
//DefaultImports: java.math.*,java.util.*,java.io.InputStream,net.servicestack.client.*,com.google.gson.annotations.*,com.google.gson.reflect.*
*/

import java.math.*
import java.util.*
import java.io.InputStream
import net.servicestack.client.*
import com.google.gson.annotations.*
import com.google.gson.reflect.*


@Route(Path="/internal/_typegen", Verbs="GET")
open class InternalsTypeGen
{
    open var typegen_0_SmtpEmailIntegrationRequest:SmtpEmailIntegrationRequest? = null
    open var typegen_1_AwsSesEmailIntegrationRequest:AwsSesEmailIntegrationRequest? = null
    open var typegen_2_SendGridEmailIntegrationRequest:SendGridEmailIntegrationRequest? = null
    open var typegen_3_MailGunEmailIntegrationRequest:MailGunEmailIntegrationRequest? = null
    open var typegen_4_EmailToAllUsersDeliverySettingsRequest:EmailToAllUsersDeliverySettingsRequest? = null
    open var typegen_5_EmailToAccountUsersDeliverySettingsRequest:EmailToAccountUsersDeliverySettingsRequest? = null
    open var typegen_6_EmailToCollectionRecordsDeliverySettingsRequest:EmailToCollectionRecordsDeliverySettingsRequest? = null
    open var typegen_7_EmailToEmailsDeliverySettingsRequest:EmailToEmailsDeliverySettingsRequest? = null
    open var typegen_8_EmailToUsersDeliverySettingsRequest:EmailToUsersDeliverySettingsRequest? = null
    open var typegen_9_MembershipTriggerRequest:MembershipTriggerRequest? = null
    open var typegen_10_SchemaTriggerRequest:SchemaTriggerRequest? = null
    open var typegen_11_FilesTriggerRequest:FilesTriggerRequest? = null
    open var typegen_12_PaymentTriggerRequest:PaymentTriggerRequest? = null
    open var typegen_13_MongoDbAtlasServerlessDatabaseIntegrationRequest:MongoDbAtlasServerlessDatabaseIntegrationRequest? = null
    open var typegen_14_MongoDbAtlasClusterDatabaseIntegrationRequest:MongoDbAtlasClusterDatabaseIntegrationRequest? = null
    open var typegen_15_MongoDbConnectionStringDatabaseIntegrationRequest:MongoDbConnectionStringDatabaseIntegrationRequest? = null
    open var typegen_16_GoogleDriveFilesIntegrationRequest:GoogleDriveFilesIntegrationRequest? = null
    open var typegen_17_FtpFilesIntegrationRequest:FtpFilesIntegrationRequest? = null
    open var typegen_18_DropBoxFilesIntegrationRequest:DropBoxFilesIntegrationRequest? = null
    open var typegen_19_AppleICloudFilesIntegrationRequest:AppleICloudFilesIntegrationRequest? = null
    open var typegen_20_AwsS3FilesIntegrationRequest:AwsS3FilesIntegrationRequest? = null
    open var typegen_21_GoogleCloudFilesIntegrationRequest:GoogleCloudFilesIntegrationRequest? = null
    open var typegen_22_AzureBlobFilesIntegrationRequest:AzureBlobFilesIntegrationRequest? = null
    open var typegen_23_LocalFilesIntegrationRequest:LocalFilesIntegrationRequest? = null
    open var typegen_24_AmqpLoggingIntegrationRequest:AmqpLoggingIntegrationRequest? = null
    open var typegen_25_AwsKinesisLoggingIntegrationRequest:AwsKinesisLoggingIntegrationRequest? = null
    open var typegen_26_AwsS3LoggingIntegrationRequest:AwsS3LoggingIntegrationRequest? = null
    open var typegen_27_TelegramLoggingIntegrationRequest:TelegramLoggingIntegrationRequest? = null
    open var typegen_28_NewRelicLoggingIntegrationRequest:NewRelicLoggingIntegrationRequest? = null
    open var typegen_29_MicrosoftTeamsLoggingIntegrationRequest:MicrosoftTeamsLoggingIntegrationRequest? = null
    open var typegen_30_MongoDbLoggingIntegrationRequest:MongoDbLoggingIntegrationRequest? = null
    open var typegen_31_KafkaLoggingIntegrationRequest:KafkaLoggingIntegrationRequest? = null
    open var typegen_32_PrometheusLoggingIntegrationRequest:PrometheusLoggingIntegrationRequest? = null
    open var typegen_33_DataDogLoggingIntegrationRequest:DataDogLoggingIntegrationRequest? = null
    open var typegen_34_InternalKafkaLoggingIntegrationRequest:InternalKafkaLoggingIntegrationRequest? = null
    open var typegen_35_ElasticSearchLoggingIntegrationRequest:ElasticSearchLoggingIntegrationRequest? = null
    open var typegen_36_ZabbixLoggingIntegrationRequest:ZabbixLoggingIntegrationRequest? = null
    open var typegen_37_SplunkLoggingIntegrationRequest:SplunkLoggingIntegrationRequest? = null
    open var typegen_38_AzureOtelLoggingIntegrationRequest:AzureOtelLoggingIntegrationRequest? = null
    open var typegen_39_KibanaLoggingIntegrationRequest:KibanaLoggingIntegrationRequest? = null
    open var typegen_40_LocalFileLoggingIntegrationRequest:LocalFileLoggingIntegrationRequest? = null
    open var typegen_41_OktaMembershipIntegrationRequest:OktaMembershipIntegrationRequest? = null
    open var typegen_42_XMembershipIntegrationRequest:XMembershipIntegrationRequest? = null
    open var typegen_43_GoogleMembershipIntegrationRequest:GoogleMembershipIntegrationRequest? = null
    open var typegen_44_MicrosoftMembershipIntegrationRequest:MicrosoftMembershipIntegrationRequest? = null
    open var typegen_45_GitHubMembershipIntegrationRequest:GitHubMembershipIntegrationRequest? = null
    open var typegen_46_MetaMembershipIntegrationRequest:MetaMembershipIntegrationRequest? = null
    open var typegen_47_AppleMembershipIntegrationRequest:AppleMembershipIntegrationRequest? = null
    open var typegen_48_LemonSqueezyPaymentIntegrationRequest:LemonSqueezyPaymentIntegrationRequest? = null
    open var typegen_49_AdyenPaymentIntegrationRequest:AdyenPaymentIntegrationRequest? = null
    open var typegen_50_MolliePaymentIntegrationRequest:MolliePaymentIntegrationRequest? = null
    open var typegen_51_PaddlePaymentIntegrationRequest:PaddlePaymentIntegrationRequest? = null
    open var typegen_52_PayPalPaymentIntegrationRequest:PayPalPaymentIntegrationRequest? = null
    open var typegen_53_StripePaymentIntegrationRequest:StripePaymentIntegrationRequest? = null
    open var typegen_54_AppleInAppPaymentIntegrationRequest:AppleInAppPaymentIntegrationRequest? = null
    open var typegen_55_GoogleInAppPaymentIntegrationRequest:GoogleInAppPaymentIntegrationRequest? = null
    open var typegen_56_EdgeWebPushIntegrationRequest:EdgeWebPushIntegrationRequest? = null
    open var typegen_57_ChromePluginPushIntegrationRequest:ChromePluginPushIntegrationRequest? = null
    open var typegen_58_SafariPushIntegrationRequest:SafariPushIntegrationRequest? = null
    open var typegen_59_ChromeWebPushIntegrationRequest:ChromeWebPushIntegrationRequest? = null
    open var typegen_60_FirefoxWebPushIntegrationRequest:FirefoxWebPushIntegrationRequest? = null
    open var typegen_61_AndroidFirebasePushIntegrationRequest:AndroidFirebasePushIntegrationRequest? = null
    open var typegen_62_AppleApnsPushIntegrationRequest:AppleApnsPushIntegrationRequest? = null
    open var typegen_65_AwsLambdaCodeIntegrationRequest:AwsLambdaCodeIntegrationRequest? = null
    open var typegen_66_AzureFunctionsCodeIntegrationRequest:AzureFunctionsCodeIntegrationRequest? = null
    open var typegen_67_GoogleCloudFunctionsCodeIntegrationRequest:GoogleCloudFunctionsCodeIntegrationRequest? = null
    open var typegen_68_OllamaLlmIntegrationRequest:OllamaLlmIntegrationRequest? = null
    open var typegen_69_OpenRouterLlmIntegrationRequest:OpenRouterLlmIntegrationRequest? = null
    open var typegen_70_MistralLlmIntegrationRequest:MistralLlmIntegrationRequest? = null
    open var typegen_71_GrokLlmIntegrationRequest:GrokLlmIntegrationRequest? = null
    open var typegen_72_GroqLlmIntegrationRequest:GroqLlmIntegrationRequest? = null
    open var typegen_73_GoogleLlmIntegrationRequest:GoogleLlmIntegrationRequest? = null
    open var typegen_74_AnthropicLlmIntegrationRequest:AnthropicLlmIntegrationRequest? = null
    open var typegen_75_OpenAiLlmIntegrationRequest:OpenAiLlmIntegrationRequest? = null
    open var typegen_76_PlaywrightMcpIntegrationRequest:PlaywrightMcpIntegrationRequest? = null
    open var typegen_77_MongoDbMcpIntegrationRequest:MongoDbMcpIntegrationRequest? = null
    open var typegen_78_GitHubMcpIntegrationRequest:GitHubMcpIntegrationRequest? = null
    open var typegen_79_StripeMcpIntegrationRequest:StripeMcpIntegrationRequest? = null
    open var typegen_80_BraveSearchMcpIntegrationRequest:BraveSearchMcpIntegrationRequest? = null
    open var typegen_81_ObsidianMcpIntegrationRequest:ObsidianMcpIntegrationRequest? = null
    open var typegen_82_EmailTemplateDto:EmailTemplateDto? = null
    open var typegen_83_PushTemplateDto:PushTemplateDto? = null
    open var typegen_84_SmsTemplateDto:SmsTemplateDto? = null
    open var typegen_85_SystemEmailTemplateDto:SystemEmailTemplateDto? = null
    open var typegen_86_TriggerActionEmailDto:TriggerActionEmailDto? = null
    open var typegen_87_TriggerActionPushDto:TriggerActionPushDto? = null
    open var typegen_88_TriggerActionCodeDto:TriggerActionCodeDto? = null
    open var typegen_89_TriggerActionWebhookDto:TriggerActionWebhookDto? = null
    open var typegen_90_EmailToAllUsersDeliverySettingsDto:EmailToAllUsersDeliverySettingsDto? = null
    open var typegen_91_EmailToAccountUsersDeliverySettingsDto:EmailToAccountUsersDeliverySettingsDto? = null
    open var typegen_92_EmailToUsersDeliverySettingsDto:EmailToUsersDeliverySettingsDto? = null
    open var typegen_93_EmailToEmailAddressesDeliverySettingsDto:EmailToEmailAddressesDeliverySettingsDto? = null
    open var typegen_94_EmailToCollectionRecordsDeliverySettingsDto:EmailToCollectionRecordsDeliverySettingsDto? = null
    open var typegen_95_PushToAllUsersDeliverySettingsDto:PushToAllUsersDeliverySettingsDto? = null
    open var typegen_96_PushToUsersDeliverySettingsDto:PushToUsersDeliverySettingsDto? = null
    open var typegen_97_PushToCollectionRecordsDeliverySettingsDto:PushToCollectionRecordsDeliverySettingsDto? = null
    open var typegen_98_PushToDevicesDeliverySettingsDto:PushToDevicesDeliverySettingsDto? = null
    open var typegen_99_SmsToAllUsersDeliverySettingsDto:SmsToAllUsersDeliverySettingsDto? = null
    open var typegen_100_SmsToUsersDeliverySettingsDto:SmsToUsersDeliverySettingsDto? = null
    open var typegen_101_SmsToCollectionRecordsDeliverySettingsDto:SmsToCollectionRecordsDeliverySettingsDto? = null
    open var typegen_102_SmsToPhoneNumbersDeliverySettingsDto:SmsToPhoneNumbersDeliverySettingsDto? = null
    open var typegen_103_OpenAiLlmIntegrationDto:OpenAiLlmIntegrationDto? = null
    open var typegen_104_AnthropicLlmIntegrationDto:AnthropicLlmIntegrationDto? = null
    open var typegen_105_OllamaLlmIntegrationDto:OllamaLlmIntegrationDto? = null
    open var typegen_106_GroqLlmIntegrationDto:GroqLlmIntegrationDto? = null
    open var typegen_107_GoogleLlmIntegrationDto:GoogleLlmIntegrationDto? = null
    open var typegen_108_MistralLlmIntegrationDto:MistralLlmIntegrationDto? = null
    open var typegen_109_OpenRouterLlmIntegrationDto:OpenRouterLlmIntegrationDto? = null
    open var typegen_110_GrokLlmIntegrationDto:GrokLlmIntegrationDto? = null
    open var typegen_111_DockerMcpIntegrationDto:DockerMcpIntegrationDto? = null
    open var typegen_112_GoogleCalendarMcpIntegrationDto:GoogleCalendarMcpIntegrationDto? = null
    open var typegen_113_ObsidianMcpIntegrationDto:ObsidianMcpIntegrationDto? = null
    open var typegen_114_AwsLambdaCrossAccountRoleCodeIntegrationDto:AwsLambdaCrossAccountRoleCodeIntegrationDto? = null
    open var typegen_115_AwsLambdaIamCodeIntegrationDto:AwsLambdaIamCodeIntegrationDto? = null
    open var typegen_116_AzureFunctionsCodeIntegrationDto:AzureFunctionsCodeIntegrationDto? = null
    open var typegen_118_GoogleCloudFunctionsCodeIntegrationDto:GoogleCloudFunctionsCodeIntegrationDto? = null
    open var typegen_120_AdyenPaymentIntegrationDto:AdyenPaymentIntegrationDto? = null
    open var typegen_121_AppleInAppPaymentIntegrationDto:AppleInAppPaymentIntegrationDto? = null
    open var typegen_122_GoogleInAppPaymentIntegrationDto:GoogleInAppPaymentIntegrationDto? = null
    open var typegen_123_LemonSqueezyPaymentIntegrationDto:LemonSqueezyPaymentIntegrationDto? = null
    open var typegen_124_MolliePaymentIntegrationDto:MolliePaymentIntegrationDto? = null
    open var typegen_125_PaddlePaymentIntegrationDto:PaddlePaymentIntegrationDto? = null
    open var typegen_126_PayPalPaymentIntegrationDto:PayPalPaymentIntegrationDto? = null
    open var typegen_127_StripePaymentIntegrationDto:StripePaymentIntegrationDto? = null
    open var typegen_184_ShopifyPaymentIntegrationDto:ShopifyPaymentIntegrationDto? = null
    open var typegen_185_WooCommercePaymentIntegrationDto:WooCommercePaymentIntegrationDto? = null
    open var typegen_186_MagentoPaymentIntegrationDto:MagentoPaymentIntegrationDto? = null
    open var typegen_187_BraintreePaymentIntegrationDto:BraintreePaymentIntegrationDto? = null
    open var typegen_188_AuthorizeNetPaymentIntegrationDto:AuthorizeNetPaymentIntegrationDto? = null
    open var typegen_189_CheckOutComPaymentIntegrationDto:CheckOutComPaymentIntegrationDto? = null
    open var typegen_190_WorldpayPaymentIntegrationDto:WorldpayPaymentIntegrationDto? = null
    open var typegen_128_AppleSignInMembershipIntegrationDto:AppleSignInMembershipIntegrationDto? = null
    open var typegen_129_GitHubMembershipIntegrationDto:GitHubMembershipIntegrationDto? = null
    open var typegen_130_GoogleMembershipIntegrationDto:GoogleMembershipIntegrationDto? = null
    open var typegen_131_MetaMembershipIntegrationDto:MetaMembershipIntegrationDto? = null
    open var typegen_132_MicrosoftMembershipIntegrationDto:MicrosoftMembershipIntegrationDto? = null
    open var typegen_133_OktaMembershipIntegrationDto:OktaMembershipIntegrationDto? = null
    open var typegen_134_XMembershipIntegrationDto:XMembershipIntegrationDto? = null
    open var typegen_135_AmqpLoggingIntegrationDto:AmqpLoggingIntegrationDto? = null
    open var typegen_136_AwsKinesisLoggingIntegrationDto:AwsKinesisLoggingIntegrationDto? = null
    open var typegen_137_AwsS3CrossAccountRoleLoggingIntegrationDto:AwsS3CrossAccountRoleLoggingIntegrationDto? = null
    open var typegen_138_AwsS3IamLoggingIntegrationDto:AwsS3IamLoggingIntegrationDto? = null
    open var typegen_139_AzureOtelLoggingIntegrationDto:AzureOtelLoggingIntegrationDto? = null
    open var typegen_140_DataDogLoggingIntegrationDto:DataDogLoggingIntegrationDto? = null
    open var typegen_141_ElasticSearchLoggingIntegrationDto:ElasticSearchLoggingIntegrationDto? = null
    open var typegen_142_InternalKafkaLoggingIntegrationDto:InternalKafkaLoggingIntegrationDto? = null
    open var typegen_143_KafkaLoggingIntegrationDto:KafkaLoggingIntegrationDto? = null
    open var typegen_144_KibanaLoggingIntegrationDto:KibanaLoggingIntegrationDto? = null
    open var typegen_145_LocalFileLoggingIntegrationDto:LocalFileLoggingIntegrationDto? = null
    open var typegen_146_MicrosoftTeamsLoggingIntegrationDto:MicrosoftTeamsLoggingIntegrationDto? = null
    open var typegen_147_MongoDbLoggingIntegrationDto:MongoDbLoggingIntegrationDto? = null
    open var typegen_148_NewRelicLoggingIntegrationDto:NewRelicLoggingIntegrationDto? = null
    open var typegen_149_PrometheusLoggingIntegrationDto:PrometheusLoggingIntegrationDto? = null
    open var typegen_150_SplunkLoggingIntegrationDto:SplunkLoggingIntegrationDto? = null
    open var typegen_151_TelegramLoggingIntegrationDto:TelegramLoggingIntegrationDto? = null
    open var typegen_152_ZabbixLoggingIntegrationDto:ZabbixLoggingIntegrationDto? = null
    open var typegen_191_SlackLoggingIntegrationDto:SlackLoggingIntegrationDto? = null
    open var typegen_153_AppleICloudFilesIntegrationDto:AppleICloudFilesIntegrationDto? = null
    open var typegen_154_AwsS3CrossAccountRoleFilesIntegrationDto:AwsS3CrossAccountRoleFilesIntegrationDto? = null
    open var typegen_155_AwsS3IamFilesIntegrationDto:AwsS3IamFilesIntegrationDto? = null
    open var typegen_156_AzureBlobFilesIntegrationDto:AzureBlobFilesIntegrationDto? = null
    open var typegen_157_DropBoxFilesIntegrationDto:DropBoxFilesIntegrationDto? = null
    open var typegen_158_FtpFilesIntegrationDto:FtpFilesIntegrationDto? = null
    open var typegen_159_GoogleCloudFilesIntegrationDto:GoogleCloudFilesIntegrationDto? = null
    open var typegen_160_GoogleDriveFilesIntegrationDto:GoogleDriveFilesIntegrationDto? = null
    open var typegen_161_LocalFilesIntegrationDto:LocalFilesIntegrationDto? = null
    open var typegen_162_MongoDbAtlasClusterIntegrationDto:MongoDbAtlasClusterIntegrationDto? = null
    open var typegen_163_MongoDbAtlasServerlessIntegrationDto:MongoDbAtlasServerlessIntegrationDto? = null
    open var typegen_164_MongoDbConnectionStringIntegrationDto:MongoDbConnectionStringIntegrationDto? = null
    open var typegen_165_BirdSmsIntegrationDto:BirdSmsIntegrationDto? = null
    open var typegen_166_PlivoSmsIntegrationDto:PlivoSmsIntegrationDto? = null
    open var typegen_167_SinchSmsIntegrationDto:SinchSmsIntegrationDto? = null
    open var typegen_168_TelesignSmsIntegrationDto:TelesignSmsIntegrationDto? = null
    open var typegen_169_TelnyxSmsIntegrationDto:TelnyxSmsIntegrationDto? = null
    open var typegen_170_TwilioSmsIntegrationDto:TwilioSmsIntegrationDto? = null
    open var typegen_171_VonageSmsIntegrationDto:VonageSmsIntegrationDto? = null
    open var typegen_172_AndroidFirebasePushIntegrationDto:AndroidFirebasePushIntegrationDto? = null
    open var typegen_173_AppleApnsPushIntegrationDto:AppleApnsPushIntegrationDto? = null
    open var typegen_174_ChromePluginPushIntegrationDto:ChromePluginPushIntegrationDto? = null
    open var typegen_175_ChromeWebPushIntegrationDto:ChromeWebPushIntegrationDto? = null
    open var typegen_176_EdgeWebPushIntegrationDto:EdgeWebPushIntegrationDto? = null
    open var typegen_177_FirefoxWebPushIntegrationDto:FirefoxWebPushIntegrationDto? = null
    open var typegen_178_SafariPushIntegrationDto:SafariPushIntegrationDto? = null
    open var typegen_179_AwsCrossAccountRoleEmailIntegrationDto:AwsCrossAccountRoleEmailIntegrationDto? = null
    open var typegen_180_AwsIamEmailIntegrationDto:AwsIamEmailIntegrationDto? = null
    open var typegen_181_MailGunEmailIntegrationDto:MailGunEmailIntegrationDto? = null
    open var typegen_182_SendGridEmailIntegrationDto:SendGridEmailIntegrationDto? = null
    open var typegen_183_SmtpEmailIntegrationDto:SmtpEmailIntegrationDto? = null
    open var typegen_192_WebhookIntegrationDto:WebhookIntegrationDto? = null
    open var typegen_193_WebhookDestinationDto:WebhookDestinationDto? = null
    open var typegen_194_SchedulerTaskDto:SchedulerTaskDto? = null
    open var typegen_195_MongoDbAggregateDto:MongoDbAggregateDto? = null
    open var typegen_196_MarketplaceIntegrationDto:MarketplaceIntegrationDto? = null
    open var typegen_197_MarketplaceFunctionBindingDto:MarketplaceFunctionBindingDto? = null
    open var typegen_198_MarketplaceListingDto:MarketplaceListingDto? = null
    open var typegen_199_MarketplaceFunctionDefinitionDto:MarketplaceFunctionDefinitionDto? = null
    open var typegen_200_MarketplaceFunctionParameterDto:MarketplaceFunctionParameterDto? = null
    open var typegen_201_MarketplaceMappingDto:MarketplaceMappingDto? = null
}

@Route(Path="/{version}/echo", Verbs="GET")
open class Echo : RequestBase(), IReturn<EchoResponse>
{
    companion object { private val responseType = EchoResponse::class.java }
    override fun getResponseType(): Any? = Echo.responseType
}

@Route(Path="/{version}/account/profile", Verbs="GET")
open class GetAccountProfile : RequestBase(), IReturn<GetAccountProfileResponse>
{
    companion object { private val responseType = GetAccountProfileResponse::class.java }
    override fun getResponseType(): Any? = GetAccountProfile.responseType
}

@Route(Path="/{version}/account/profile", Verbs="PUT")
@DataContract
open class UpdateAccountProfile : RequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var displayName:String? = null

    @DataMember
    open var billingEmail:String? = null

    @DataMember
    open var operationsEmail:String? = null

    @DataMember
    open var securityEmail:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateAccountProfile.responseType
}

@Route(Path="/{version}/account/verify/resend", Verbs="GET")
open class ResendAccountVerificationToken : RequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ResendAccountVerificationToken.responseType
}

/**
* Get Account Status.
*/
@Route(Path="/{version}/account/status", Verbs="GET")
@Api(Description="Get Account Status.")
open class GetAccountStatus : RequestBase(), IReturn<GetAccountStatusResponse>
{
    companion object { private val responseType = GetAccountStatusResponse::class.java }
    override fun getResponseType(): Any? = GetAccountStatus.responseType
}

@Route(Path="/{version}/account/stripe/create-checkout-session", Verbs="POST")
@DataContract
open class CreateStripeCheckoutSession : RequestBase(), IReturn<CreateStripeCheckoutSessionResponse>
{
    @DataMember
    open var subscriptionType:SubscriptionType? = null

    @DataMember
    open var domain:String? = null

    @DataMember
    open var projectCap:Int? = null

    @DataMember
    open var newProjectSessionId:UUID? = null

    @DataMember
    open var returnUrl:String? = null
    companion object { private val responseType = CreateStripeCheckoutSessionResponse::class.java }
    override fun getResponseType(): Any? = CreateStripeCheckoutSession.responseType
}

@Route(Path="/{version}/account/stripe/get-portal-url", Verbs="POST")
@DataContract
open class GetStripeBillingPortalUrl : RequestBase(), IReturn<GetStripeBillingPortalUrlResponse>
{
    @DataMember
    open var subscriptionType:SubscriptionType? = null

    @DataMember
    open var returnUrl:String? = null
    companion object { private val responseType = GetStripeBillingPortalUrlResponse::class.java }
    override fun getResponseType(): Any? = GetStripeBillingPortalUrl.responseType
}

@Route(Path="/{version}/account/team/member", Verbs="POST")
open class CreateTeamMemberFromInvitation : RequestBase(), IReturn<CreateTeamMemberFromInvitationResponse>
{
    /**
    * Display name of the account holder
    */
    @ApiMember(DataType="string", Description="Display name of the account holder", IsRequired=true, Name="DisplayName", ParameterType="form")
    open var displayName:String? = null

    /**
    * Token from invitation email
    */
    @ApiMember(DataType="string", Description="Token from invitation email", IsRequired=true, Name="Token", ParameterType="form")
    open var token:String? = null

    /**
    * Set password for a new account
    */
    @ApiMember(DataType="string", Description="Set password for a new account", Format="password", IsRequired=true, Name="Password", ParameterType="form")
    open var password:String? = null
    companion object { private val responseType = CreateTeamMemberFromInvitationResponse::class.java }
    override fun getResponseType(): Any? = CreateTeamMemberFromInvitation.responseType
}

@Route(Path="/{version}/account/verify", Verbs="GET")
open class VerifyAccount : RequestBase(), IReturn<EmptyResponse>, IHasAccountId
{
    open var token:String? = null
    override var accountId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = VerifyAccount.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/group", Verbs="DELETE")
open class DeleteNotificationsGroup : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var groupTag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/tag", Verbs="DELETE")
open class DeleteNotificationsTag : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var tag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteNotificationsTag.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/group/tag", Verbs="DELETE")
open class RemoveTagFromNotificationsGroup : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var groupTag:String? = null
    open var tag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveTagFromNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/group", Verbs="POST")
open class SaveNotificationsGroup : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var groupDefinition:GroupDefinitionDto? = null
    open var channel:CommunicationChannel? = null
    open var originChannel:CommunicationChannel? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/tag", Verbs="POST")
open class SaveNotificationsTag : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var tagDefinition:TagDefinitionDto? = null
    open var channel:CommunicationChannel? = null
    open var groupTag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveNotificationsTag.responseType
}

/**
* Create a new backend project.
*/
@Route(Path="/{version}/account/projects", Verbs="POST")
@Api(Description="Create a new backend project.")
@DataContract
open class CreateProjectRequest : RequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:DatabaseIntegrationRequest? = null

    @DataMember
    open var projectName:String? = null

    @DataMember
    open var regions:ArrayList<String>? = null

    @DataMember
    open var description:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateProjectRequest.responseType
}

@Route(Path="/{version}/account/projects/{projectId}", Verbs="DELETE")
open class DeleteProject : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteProject.responseType
}

/**
* Gets project info.
*/
@Route(Path="/{version}/account/projects/{projectId}", Verbs="GET")
@Api(Description="Gets project info.")
open class GetProject : CodeMashRequestBase(), IReturn<GetProjectResponse>
{
    companion object { private val responseType = GetProjectResponse::class.java }
    override fun getResponseType(): Any? = GetProject.responseType
}

/**
* Retrieve projects list.
*/
@Route(Path="/{version}/account/projects", Verbs="GET")
@Api(Description="Retrieve projects list.")
open class GetProjects : RequestBase(), IReturn<GetProjectsResponse>
{
    companion object { private val responseType = GetProjectsResponse::class.java }
    override fun getResponseType(): Any? = GetProjects.responseType
}

/**
* Get available project regions.
*/
@Route(Path="/{version}/account/regions", Verbs="GET")
@Api(Description="Get available project regions.")
open class GetAccountRegions : RequestBase(), IReturn<GetAccountRegionsResponse>
{
    companion object { private val responseType = GetAccountRegionsResponse::class.java }
    override fun getResponseType(): Any? = GetAccountRegions.responseType
}

/**
* Gets project tokens.
*/
@Route(Path="/{version}/account/projects/{projectId}/tokens", Verbs="GET")
@Api(Description="Gets project tokens.")
open class GetProjectTokens : CodeMashRequestBase(), IReturn<GetProjectTokensResponse>
{
    open var initiatorId:String? = null
    open var recipientId:String? = null
    open var targetUserId:String? = null
    open var membershipTriggerOldUserId:String? = null
    open var membershipTriggerNewUserId:String? = null
    companion object { private val responseType = GetProjectTokensResponse::class.java }
    override fun getResponseType(): Any? = GetProjectTokens.responseType
}

/**
* Updates project accent color
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/accent-color", Verbs="PATCH")
@Api(Description="Updates project accent color")
open class UpdateProjectAccentColor : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var color:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectAccentColor.responseType
}

/**
* Updates project icon
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/icon", Verbs="PATCH")
@Api(Description="Updates project icon")
open class UpdateProjectIcon : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var fileResource:FileResourceDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectIcon.responseType
}

/**
* Updates project logo
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/logo", Verbs="PATCH")
@Api(Description="Updates project logo")
open class UpdateProjectLogo : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var fileResource:FileResourceDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectLogo.responseType
}

/**
* Updates project main color
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/main-color", Verbs="PATCH")
@Api(Description="Updates project main color")
open class UpdateProjectMainColor : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var color:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectMainColor.responseType
}

/**
* Updates project CORS settings
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/origins", Verbs="PATCH")
@Api(Description="Updates project CORS settings")
open class UpdateProjectAllowedOrigins : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var origins:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectAllowedOrigins.responseType
}

/**
* Update project default language
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/default-language", Verbs="PATCH")
@Api(Description="Update project default language")
open class UpdateProjectDefaultLanguage : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var defaultLanguage:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectDefaultLanguage.responseType
}

/**
* Updates project description
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/description", Verbs="PATCH")
@Api(Description="Updates project description")
open class UpdateProjectDescription : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var description:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectDescription.responseType
}

/**
* Disables project
*/
@Route(Path="/{version}/account/projects/{projectId}/disable", Verbs="PATCH")
@Api(Description="Disables project")
open class DisableProject : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableProject.responseType
}

/**
* Enables project
*/
@Route(Path="/{version}/account/projects/{projectId}/enable", Verbs="PATCH")
@Api(Description="Enables project")
open class EnableProject : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableProject.responseType
}

/**
* Updates project languages
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/languages", Verbs="PATCH")
@Api(Description="Updates project languages")
open class UpdateProjectLanguages : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var languages:ArrayList<String> = ArrayList<String>()
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectLanguages.responseType
}

/**
* Updates project marketing url
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/url", Verbs="PATCH")
@Api(Description="Updates project marketing url")
open class UpdateProjectUrl : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var url:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectUrl.responseType
}

/**
* Updates project name
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/name", Verbs="PATCH")
@Api(Description="Updates project name")
open class UpdateProjectName : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var name:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectName.responseType
}

/**
* Updates project regions
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/regions", Verbs="PATCH")
@Api(Description="Updates project regions")
open class UpdateProjectRegions : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var regions:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectRegions.responseType
}

/**
* This API endpoint allows users to create a new CodeMash account.
*/
@Route(Path="/{version}/account", Verbs="POST")
@Api(Description="This API endpoint allows users to create a new CodeMash account.")
open class CreateAccount : RequestBase(), IReturn<CreateAccountResponse>
{
    /**
    * Display name of the account holder
    */
    @ApiMember(DataType="string", Description="Display name of the account holder", IsRequired=true, Name="DisplayName", ParameterType="form")
    open var displayName:String? = null

    /**
    * Real email of account holder
    */
    @ApiMember(DataType="string", Description="Real email of account holder", IsRequired=true, Name="Email", ParameterType="form")
    open var email:String? = null

    /**
    * Set password for a new account
    */
    @ApiMember(DataType="string", Description="Set password for a new account", Format="password", IsRequired=true, Name="Password", ParameterType="form")
    open var password:String? = null
    companion object { private val responseType = CreateAccountResponse::class.java }
    override fun getResponseType(): Any? = CreateAccount.responseType
}

@Route(Path="/{version}/account/collaborators", Verbs="GET")
open class GetAccountCollaborators : RequestBase(), IReturn<GetAccountCollaboratorsResponse>
{
    open var includeAccountOwner:Boolean? = null
    open var userShouldHavePushDevice:Boolean? = null
    open var projectId:String? = null
    open var userIds:ArrayList<String>? = null
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetAccountCollaboratorsResponse::class.java }
    override fun getResponseType(): Any? = GetAccountCollaborators.responseType
}

@Route(Path="/{version}/account/team/member/invite", Verbs="POST")
open class SendInviteToTeamMember : RequestBase(), IReturn<EmptyResponse>
{
    open var email:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SendInviteToTeamMember.responseType
}

@Route(Path="/{version}/account/licenses", Verbs="GET")
open class GetLicenses : RequestBase(), IReturn<GetLicensesResponse>
{
    companion object { private val responseType = GetLicensesResponse::class.java }
    override fun getResponseType(): Any? = GetLicenses.responseType
}

open class AccountCreated
{
    open var email:EmailAddress? = null
    open var displayName:DisplayName? = null
    open var accountId:AccountId? = null
    open var createdOn:UtcDateTime? = null
}

open class AccountProfileUpdated
{
    open var displayName:DisplayName? = null
    open var billingEmail:EmailAddress? = null
    open var operationsEmail:EmailAddress? = null
    open var securityEmail:EmailAddress? = null
}

open class AccountSetAsActive
{
}

open class AccountValidationTokenIssued
{
    open var expiration:ExpirationToken? = null
}

open class AccountVerified
{
}

open class AccountBlocked
{
}

open class AccountSetAsInactive
{
}

open class AccountUnregistered
{
}

open class LicenseCreated
{
    open var license:CodeMashLicense? = null
}

open class ProjectCreated
{
    open var id:ProjectId? = null
    open var name:ProjectName? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var regions:ArrayList<ProjectRegion>? = null
    open var description:String? = null
}

open class ProjectActivated
{
}

open class ProjectDisabled
{
}

open class ProjectDeleted
{
}

open class ProjectNameChanged
{
    open var projectName:ProjectName? = null
}

open class ProjectDescriptionChanged
{
    open var description:String? = null
}

open class ProjectMarketingUrlChanged
{
    open var url:DomainUrl? = null
}

open class ProjectAllowedOriginsChanged
{
    open var origins:ArrayList<DomainUrl>? = null
}

open class ProjectDefaultLanguageChanged
{
    open var language:Language? = null
}

open class ProjectLanguagesChanged
{
    open var languages:ArrayList<Language> = ArrayList<Language>()
}

open class ProjectLogoChanged
{
    open var logo:ProjectLogo? = null
}

open class ProjectIconChanged
{
    open var icon:ProjectIcon? = null
}

open class ProjectMainColorChanged
{
    open var color:BrandColor? = null
}

open class ProjectAccentColorChanged
{
    open var color:BrandColor? = null
}

open class ProjectRegionsChanged
{
    open var regions:ArrayList<ProjectRegion>? = null
}

open class ProjectEnabled
{
}

open class ProjectCommunicationSet
{
    open var projectCommunication:ProjectCommunication? = null
}

open class ProjectTimeZoneChanged
{
    open var timeZone:TimeZone? = null
}

open class ProjectPaymentZonesChanged
{
    open var paymentZones:ArrayList<TimeZone>? = null
}

open class ProjectCommunicationGroupSaved
{
    open var group:GroupDefinition? = null
    open var channel:CommunicationChannel? = null
    open var originChannel:CommunicationChannel? = null
}

open class ProjectCommunicationTagFromGroupDeleted
{
    open var groupTag:Tag? = null
    open var removedTag:Tag? = null
}

open class ProjectCommunicationGroupDeleted
{
    open var groupTag:Tag? = null
}

open class ProjectCommunicationTagSaved
{
    open var tag:TagDefinition? = null
    open var groupTag:Tag? = null
    open var channel:CommunicationChannel? = null
}

open class ProjectCommunicationTagDeleted
{
    open var tag:Tag? = null
}

open class CustomerCreated
{
    open var customerId:ExternalCustomerId? = null
}

open class SubscriptionChanged
{
    open var subscription:CodeMashManagedServiceSubscription? = null
}

open class SubscriptionCanceled
{
    open var customerId:ExternalCustomerId? = null
    open var subscriptionId:String? = null
}

@Route(Path="/{version}/membership/disable", Verbs="GET")
open class DisableMembership : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMembership.responseType
}

@Route(Path="/{version}/membership/enable", Verbs="GET")
open class EnableMembership : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMembership.responseType
}

@Route(Path="/{version}/notifications/user/preferences", Verbs="GET")
open class GetUserNotificationPreferences : CodeMashRequestBase(), IReturn<GetUserEmailPreferencesResponse>
{
    open var userId:String? = null
    companion object { private val responseType = GetUserEmailPreferencesResponse::class.java }
    override fun getResponseType(): Any? = GetUserNotificationPreferences.responseType
}

@Route(Path="/{version}/notifications/user/preferences", Verbs="PUT")
open class UpdateUserNotificationsPreferences : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var userId:String? = null
    open var blockAllMarketingMessages:Boolean? = null
    open var subscribedToTags:HashMap<DeliveryChannel,HashSet<String>>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateUserNotificationsPreferences.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}", Verbs="DELETE")
// @Route(Path="/{version}/triggers", Verbs="DELETE")
@DataContract
open class DeleteMembershipTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMembershipTrigger.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}/disable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/disable", Verbs="PUT")
@DataContract
open class DisableMembershipTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMembershipTrigger.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}/enable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/enable", Verbs="PUT")
@DataContract
open class EnableMembershipTrigger : EnableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMembershipTrigger.responseType
}

/**
* Gets membership trigger by specified Id
*/
@Route(Path="/{version}/membership/triggers/{id}", Verbs="GET")
@Api(Description="Gets membership trigger by specified Id")
open class GetMembershipTrigger : GetTrigger(), IReturn<GetMembershipTriggerResponse>
{
    companion object { private val responseType = GetMembershipTriggerResponse::class.java }
    override fun getResponseType(): Any? = GetMembershipTrigger.responseType
}

/**
* Gets membership triggers
*/
@Route(Path="/{version}/membership/triggers", Verbs="GET")
@Api(Description="Gets membership triggers")
open class GetMembershipTriggers : GetTriggers(), IReturn<GetMembershipTriggersResponse>
{
    companion object { private val responseType = GetMembershipTriggersResponse::class.java }
    override fun getResponseType(): Any? = GetMembershipTriggers.responseType
}

@Route(Path="/{version}/membership/triggers", Verbs="POST")
// @Route(Path="/{version}/triggers", Verbs="POST")
@DataContract
open class SaveMembershipTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMembershipTrigger.responseType
}

/**
* Create a new custom role for project.
*/
@Route(Path="/{version}/membership/roles", Verbs="POST")
@Api(Description="Create a new custom role for project.")
open class CreateRole : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var roleName:String? = null
    open var description:String? = null
    open var policies:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateRole.responseType
}

/**
* Deletes custom role from project.
*/
@Route(Path="/{version}/membership/roles", Verbs="DELETE")
@Api(Description="Deletes custom role from project.")
open class DeleteRole : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteRole.responseType
}

/**
* Gets project role details.
*/
@Route(Path="/{version}/membership/roles/{Id}", Verbs="GET")
@Api(Description="Gets project role details.")
open class GetRole : CodeMashRequestBase(), IReturn<GetRoleResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetRoleResponse::class.java }
    override fun getResponseType(): Any? = GetRole.responseType
}

/**
* Gets project roles.
*/
@Route(Path="/{version}/membership/roles", Verbs="GET")
@Api(Description="Gets project roles.")
open class GetRoles : CodeMashRequestBase(), IReturn<GetRolesResponse>
{
    companion object { private val responseType = GetRolesResponse::class.java }
    override fun getResponseType(): Any? = GetRoles.responseType
}

/**
* Updates role policies
*/
@Route(Path="/{version}/membership/roles", Verbs="PATCH")
@Api(Description="Updates role policies")
open class UpdateRolePolicies : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    open var roleName:String? = null
    open var description:String? = null
    open var policies:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateRolePolicies.responseType
}

/**
* Create a new custom policy for project.
*/
@Route(Path="/{version}/membership/policies", Verbs="POST")
@Api(Description="Create a new custom policy for project.")
open class CreatePolicy : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var policyName:String? = null
    open var description:String? = null
    open var policyDocumentJson:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreatePolicy.responseType
}

/**
* Deletes custom policy from project.
*/
@Route(Path="/{version}/membership/policies", Verbs="DELETE")
@Api(Description="Deletes custom policy from project.")
open class DeletePolicy : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePolicy.responseType
}

/**
* Gets project policy details.
*/
@Route(Path="/{version}/membership/policies/{Id}", Verbs="GET")
@Api(Description="Gets project policy details.")
open class GetPolicy : CodeMashRequestBase(), IReturn<GetPolicyResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetPolicyResponse::class.java }
    override fun getResponseType(): Any? = GetPolicy.responseType
}

/**
* Gets project policies.
*/
@Route(Path="/{version}/membership/policies", Verbs="GET")
@Api(Description="Gets project policies.")
open class GetPolicies : CodeMashRequestBase(), IReturn<GetPoliciesResponse>
{
    companion object { private val responseType = GetPoliciesResponse::class.java }
    override fun getResponseType(): Any? = GetPolicies.responseType
}

/**
* Updates a custom policy for project.
*/
@Route(Path="/{version}/membership/policies", Verbs="PUT")
@Api(Description="Updates a custom policy for project.")
open class UpdatePolicy : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var id:String? = null
    open var policyName:String? = null
    open var description:String? = null
    open var policyDocumentJson:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdatePolicy.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}", Verbs="DELETE")
open class DeleteMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/disable", Verbs="PUT")
open class DisableMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/enable", Verbs="PUT")
open class EnableMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{id}", Verbs="GET")
open class GetMembershipIntegration : CodeMashRequestBase(), IReturn<GetMembershipIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetMembershipIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetMembershipIntegration.responseType
}

@Route(Path="/{version}/membership/integrations", Verbs="GET")
open class GetMembershipIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetMembershipIntegrationsResponse>
{
    companion object { private val responseType = GetMembershipIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetMembershipIntegrations.responseType
}

@Route(Path="/{version}/membership/integrations", Verbs="POST")
@DataContract
open class SaveMembershipIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:MembershipIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMembershipIntegration.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/default", Verbs="PUT")
open class SetMembershipIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetMembershipIntegrationAsDefaultRequest.responseType
}

open class MembershipIntegrationSaved
{
    open var integration:MembershipIntegration? = null
}

open class MembershipIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class MembershipIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class MembershipIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class MembershipIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class MembershipIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class MembershipIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class MembershipEstablished
{
}

open class MembershipEnabled
{
}

open class MembershipDisabled
{
}

open class SetUserRegistersAsRole
{
    open var projectId:ProjectId? = null
    open var role:RoleName? = null
}

open class PolicyCreated
{
    open var policy:MembershipPolicy? = null
}

open class PolicyUpdated
{
    open var policy:MembershipPolicy? = null
}

open class PolicyDeleted
{
    open var policyId:PolicyId? = null
}

open class RoleCreated
{
    open var role:MembershipRole? = null
}

open class RoleUpdated
{
    open var role:MembershipRole? = null
}

open class RoleDeleted
{
    open var roleId:RoleId? = null
}

open class MembershipTriggerSaved
{
    open var trigger:MembershipTrigger? = null
}

open class MembershipTriggerEnabled : TriggerByIdEventBase()
{
}

open class MembershipTriggerDisabled : TriggerByIdEventBase()
{
}

open class MembershipTriggerDeleted : TriggerByIdEventBase()
{
}

@Route(Path="/{version}/database/disable", Verbs="GET")
open class DisableDatabase : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableDatabase.responseType
}

@Route(Path="/{version}/database/enable", Verbs="GET")
open class EnableDatabase : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableDatabase.responseType
}

@Route(Path="/{version}/database/schemas/triggers/{triggerId}", Verbs="DELETE")
// @Route(Path="/{version}/triggers", Verbs="DELETE")
@DataContract
open class DeleteSchemaTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSchemaTrigger.responseType
}

@Route(Path="/{version}/database/schemas/triggers/{triggerId}/disable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/disable", Verbs="PUT")
@DataContract
open class DisableSchemaTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableSchemaTrigger.responseType
}

@Route(Path="/{version}/database/schemas/triggers/{triggerId}/enable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/enable", Verbs="PUT")
@DataContract
open class EnableSchemaTrigger : EnableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableSchemaTrigger.responseType
}

/**
* Gets database trigger by specified Id
*/
@Route(Path="/{version}/database/schemas/triggers/{id}", Verbs="GET")
@Api(Description="Gets database trigger by specified Id")
open class GetSchemaTrigger : GetTrigger(), IReturn<GetSchemaTriggerResponse>
{
    companion object { private val responseType = GetSchemaTriggerResponse::class.java }
    override fun getResponseType(): Any? = GetSchemaTrigger.responseType
}

/**
* Gets database triggers
*/
@Route(Path="/{version}/database/schemas/triggers", Verbs="GET")
@Api(Description="Gets database triggers")
open class GetSchemaTriggers : GetTriggers(), IReturn<GetSchemaTriggersResponse>
{
    open var schemaId:String? = null
    companion object { private val responseType = GetSchemaTriggersResponse::class.java }
    override fun getResponseType(): Any? = GetSchemaTriggers.responseType
}

@Route(Path="/{version}/database/schemas/triggers", Verbs="POST")
// @Route(Path="/{version}/triggers", Verbs="POST")
@DataContract
open class SaveSchemaTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveSchemaTrigger.responseType
}

@Route(Path="/{version}/database/taxonomies/{Id}", Verbs="DELETE")
open class DeleteDatabaseTaxonomyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseTaxonomyRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{id}", Verbs="GET")
open class GetDatabaseTaxonomy : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomy.responseType
}

@Route(Path="/{version}/database/taxonomies", Verbs="GET")
open class GetDatabaseTaxonomies : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseTaxonomiesResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseTaxonomiesResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomies.responseType
}

@Route(Path="/{version}/database/taxonomies", Verbs="POST")
@DataContract
open class SaveDatabaseTaxonomyRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var taxonomyName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var termsMetaDataSchema:String? = null

    @DataMember
    open var termsMetaVisualSchema:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var dependencies:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseTaxonomyRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="DELETE")
@DataContract
open class DeleteDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseTaxonomyTermRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/many", Verbs="DELETE")
@DataContract
open class DeleteManyDatabaseTaxonomyTermsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteManyDatabaseTaxonomyTermsRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="GET")
@DataContract
open class GetDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyTermResponse>
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyTermResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomyTermRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms", Verbs="POST")
@DataContract
open class SaveDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var document:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseTaxonomyTermRequest.responseType
}

@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="PUT")
@DataContract
open class UpdateDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var update:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseTaxonomyTermRequest.responseType
}

@Route(Path="/{version}/database/schemas/{Id}", Verbs="DELETE")
open class DeleteDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseSchemaRequest.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="DELETE")
@DataContract
open class DiscardDatabaseSchemaDraftRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DiscardDatabaseSchemaDraftRequest.responseType
}

@Route(Path="/{version}/database/schemas/{id}", Verbs="GET")
@DataContract
open class GetDatabaseSchema : CodeMashRequestBase(), IReturn<GetDatabaseSchemaResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember(Name="version")
    @SerializedName("version")
    @ApiMember(DataType="integer", Name="version", ParameterType="query")
    open var schemaVersion:Int? = null
    companion object { private val responseType = GetDatabaseSchemaResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchema.responseType
}

@Route(Path="/{version}/database/schemas", Verbs="GET")
open class GetDatabaseSchemas : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseSchemasResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseSchemasResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemas.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="GET")
@DataContract
open class GetDatabaseSchemaDraft : CodeMashRequestBase(), IReturn<GetDatabaseSchemaDraftResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = GetDatabaseSchemaDraftResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaDraft.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/versions/diff", Verbs="GET")
@DataContract
open class GetDatabaseSchemaVersionDiff : CodeMashRequestBase(), IReturn<GetDatabaseSchemaVersionDiffResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var fromVersion:Int? = null

    @DataMember
    open var toVersion:Int? = null
    companion object { private val responseType = GetDatabaseSchemaVersionDiffResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaVersionDiff.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/versions", Verbs="GET")
@DataContract
open class GetDatabaseSchemaVersions : CodeMashRequestBase(), IReturn<GetDatabaseSchemaVersionsResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = GetDatabaseSchemaVersionsResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaVersions.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/publish", Verbs="POST")
@DataContract
open class PublishDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PublishDatabaseSchemaRequest.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/rename", Verbs="PUT")
@DataContract
open class RenameDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var renameUniqueName:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RenameDatabaseSchemaRequest.responseType
}

@Route(Path="/{version}/database/schemas", Verbs="POST")
@DataContract
open class SaveDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var dataSchema:String? = null

    @DataMember
    open var visualSchema:String? = null

    @DataMember
    open var settings:SchemaSettingsDto? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseSchemaRequest.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="PUT")
@DataContract
open class UpdateDatabaseSchemaDraftRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var dataSchema:String? = null

    @DataMember
    open var visualSchema:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseSchemaDraftRequest.responseType
}

@Route(Path="/{version}/database/schemas/{Id}/settings", Verbs="PUT")
@DataContract
open class UpdateDatabaseSchemaSettingsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var settings:SchemaSettingsDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseSchemaSettingsRequest.responseType
}

@Route(Path="/{version}/database/integrations/{Id}", Verbs="DELETE")
open class DeleteDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseIntegrationRequest.responseType
}

@Route(Path="/{version}/database/integrations/{Id}/disable", Verbs="PUT")
open class DisableDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableDatabaseIntegrationRequest.responseType
}

@Route(Path="/{version}/database/integrations/{Id}/enable", Verbs="PUT")
open class EnableDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableDatabaseIntegrationRequest.responseType
}

@Route(Path="/{version}/database/integrations/{id}", Verbs="GET")
open class GetDatabaseIntegration : CodeMashRequestBase(), IReturn<GetDatabaseIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetDatabaseIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseIntegration.responseType
}

@Route(Path="/{version}/database/integrations", Verbs="GET")
open class GetDatabaseIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseIntegrationsResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseIntegrations.responseType
}

@Route(Path="/{version}/database/integrations", Verbs="POST")
@DataContract
open class SaveDatabaseIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:DatabaseIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseIntegration.responseType
}

@Route(Path="/{version}/database/integrations/{Id}/default", Verbs="PUT")
open class SetDatabaseIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetDatabaseIntegrationAsDefaultRequest.responseType
}

@Route(Path="/{version}/database/aggregates/{Id}", Verbs="DELETE")
@DataContract
open class DeleteDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var schemaId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseAggregateRequest.responseType
}

@Route(Path="/{version}/database/aggregates/{Id}", Verbs="GET")
open class GetDatabaseAggregate : CodeMashRequestBase(), IReturn<GetDatabaseAggregateResponse>
{
    open var id:String? = null
    open var schemaId:String? = null
    companion object { private val responseType = GetDatabaseAggregateResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseAggregate.responseType
}

@Route(Path="/{version}/database/aggregates", Verbs="GET")
open class GetDatabaseAggregates : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseAggregatesResponse>
{
    open var schemaId:String? = null
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseAggregatesResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseAggregates.responseType
}

@Route(Path="/{version}/database/aggregates", Verbs="POST")
@DataContract
open class SaveDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var schemaId:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var pipeline:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseAggregateRequest.responseType
}

@Route(Path="/{version}/database/aggregates/test", Verbs="POST")
@DataContract
open class TestDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<TestDatabaseAggregateResponse>
{
    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var pipeline:String? = null

    @DataMember
    open var tokens:HashMap<String,String>? = null
    companion object { private val responseType = TestDatabaseAggregateResponse::class.java }
    override fun getResponseType(): Any? = TestDatabaseAggregateRequest.responseType
}

open class MongoDbAggregateCreated
{
    open var aggregate:MongoDbAggregate? = null
}

open class MongoDbAggregateUpdated
{
    open var aggregate:MongoDbAggregate? = null
}

open class MongoDbAggregateDeleted
{
    open var schemaId:SchemaId? = null
    open var id:MongoDbAggregateId? = null
}

open class DatabaseEstablished
{
}

open class DatabaseEnabled
{
}

open class DatabaseDisabled
{
}

open class DatabaseIntegrationSaved
{
    open var integration:DatabaseIntegration? = null
}

open class DatabaseIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class DatabaseIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class DatabaseIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class DatabaseIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class DatabaseIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class DatabaseIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class SchemaCreated
{
    open var schema:Schema? = null
}

open class SchemaDraftUpdated
{
    open var id:SchemaId? = null
    open var draft:SchemaDraft? = null
}

open class SchemaDraftDiscarded
{
    open var id:SchemaId? = null
}

open class SchemaVersionPublished
{
    open var id:SchemaId? = null
    open var version:PublishedSchemaVersion? = null
    open var diff:SchemaDiff? = null
}

open class SchemaSettingsUpdated
{
    open var id:SchemaId? = null
    open var settings:SchemaSettings? = null
}

open class SchemaDeleted
{
    open var id:SchemaId? = null
}

open class SchemaRenamed
{
    open var schemaId:SchemaId? = null
    open var newName:SchemaName? = null
    open var renameUniqueName:Boolean? = null
}

open class SchemaDataCleared
{
    open var id:SchemaId? = null
    open var integrations:ArrayList<IntegrationId> = ArrayList<IntegrationId>()
}

open class TaxonomyCreated
{
    open var taxonomy:Taxonomy? = null
}

open class TaxonomyUpdated
{
    open var taxonomy:Taxonomy? = null
}

open class TaxonomyDeleted
{
    open var taxonomyId:TaxonomyId? = null
}

open class TaxonomyDataCleared
{
    open var taxonomyId:TaxonomyId? = null
    open var integrations:ArrayList<IntegrationId> = ArrayList<IntegrationId>()
}

open class SchemaTriggerSaved
{
    open var trigger:SchemaTrigger? = null
}

open class SchemaTriggerEnabled : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
}

open class SchemaTriggerDisabled : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
}

open class SchemaTriggerDeleted : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
}

@Route(Path="/{version}/files/disable", Verbs="GET")
open class DisableFiles : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableFiles.responseType
}

@Route(Path="/{version}/files/enable", Verbs="GET")
open class EnableFiles : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableFiles.responseType
}

@Route(Path="/{version}/files/triggers/{triggerId}", Verbs="DELETE")
// @Route(Path="/{version}/triggers", Verbs="DELETE")
@DataContract
open class DeleteFilesTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteFilesTrigger.responseType
}

@Route(Path="/{version}/files/triggers/{triggerId}/disable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/disable", Verbs="PUT")
@DataContract
open class DisableFilesTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableFilesTrigger.responseType
}

@Route(Path="/{version}/files/triggers/{triggerId}/enable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/enable", Verbs="PUT")
@DataContract
open class EnableFilesTrigger : EnableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableFilesTrigger.responseType
}

/**
* Gets files trigger by specified Id
*/
@Route(Path="/{version}/files/triggers/{id}", Verbs="GET")
@Api(Description="Gets files trigger by specified Id")
open class GetFilesTrigger : GetTrigger(), IReturn<GetFilesTriggerResponse>
{
    companion object { private val responseType = GetFilesTriggerResponse::class.java }
    override fun getResponseType(): Any? = GetFilesTrigger.responseType
}

/**
* Gets files triggers
*/
@Route(Path="/{version}/files/triggers", Verbs="GET")
@Api(Description="Gets files triggers")
open class GetFilesTriggers : GetTriggers(), IReturn<GetFilesTriggersResponse>
{
    companion object { private val responseType = GetFilesTriggersResponse::class.java }
    override fun getResponseType(): Any? = GetFilesTriggers.responseType
}

@Route(Path="/{version}/files/triggers", Verbs="POST")
// @Route(Path="/{version}/triggers", Verbs="POST")
@DataContract
open class SaveFilesTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveFilesTrigger.responseType
}

@Route(Path="/{version}/files/integrations/{Id}", Verbs="DELETE")
open class DeleteFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteFilesIntegrationRequest.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/disable", Verbs="PUT")
open class DisableFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableFilesIntegrationRequest.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/enable", Verbs="PUT")
open class EnableFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableFilesIntegrationRequest.responseType
}

@Route(Path="/{version}/files/integrations/{id}", Verbs="GET")
open class GetFilesIntegration : CodeMashRequestBase(), IReturn<GetFilesIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetFilesIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetFilesIntegration.responseType
}

@Route(Path="/{version}/files/integrations", Verbs="GET")
open class GetFilesIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetFilesIntegrationsResponse>
{
    companion object { private val responseType = GetFilesIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetFilesIntegrations.responseType
}

@Route(Path="/{version}/files/integrations", Verbs="POST")
@DataContract
open class SaveFilesIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:FilesIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveFilesIntegration.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/default", Verbs="PUT")
open class SetFilesIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetFilesIntegrationAsDefaultRequest.responseType
}

@Route(Path="/{version}/notifications/email/disable", Verbs="GET")
open class DisableEmail : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableEmail.responseType
}

@Route(Path="/{version}/notifications/email/enable", Verbs="GET")
open class EnableEmail : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableEmail.responseType
}

@Route(Path="/{version}/notifications/email/templates/attachments", Verbs="POST")
open class AttachFileToTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var language:String? = null
    open var templateId:String? = null
    open var fileRef:FileResourceRefDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AttachFileToTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/templates", Verbs="POST")
open class CreateEmailTemplateRequest : SaveEmailTemplate(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/templates/{Id}", Verbs="DELETE")
open class DeleteEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/templates/{id}", Verbs="GET")
open class GetEmailTemplate : CodeMashRequestBase(), IReturn<GetEmailTemplateResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplate.responseType
}

@Route(Path="/{version}/notifications/email/templates", Verbs="GET")
open class GetEmailTemplates : CodeMashListPaginationRequestBase(), IReturn<GetEmailTemplatesResponse>
{
    open var showArchived:Boolean? = null
    open var templateId:String? = null
    companion object { private val responseType = GetEmailTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplates.responseType
}

@Route(Path="/{version}/notifications/email/templates/mjml", Verbs="POST")
open class GetMjml : CodeMashRequestBase(), IReturn<GetHtmlFromMjmlResponse>
{
    open var code:String? = null
    open var tokens:ArrayList<TokenMappingDto>? = null
    open var isForPreview:Boolean? = null
    companion object { private val responseType = GetHtmlFromMjmlResponse::class.java }
    override fun getResponseType(): Any? = GetMjml.responseType
}

@Route(Path="/{version}/notifications/email/system-templates/{id}", Verbs="GET")
open class GetSystemEmailTemplate : CodeMashRequestBase(), IReturn<GetSystemEmailTemplateResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetSystemEmailTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetSystemEmailTemplate.responseType
}

@Route(Path="/{version}/notifications/email/system-templates", Verbs="GET")
open class GetSystemEmailTemplates : CodeMashListPaginationRequestBase(), IReturn<GetSystemEmailTemplatesResponse>
{
    open var groupTags:ArrayList<String>? = null
    open var themes:ArrayList<String>? = null
    open var communicationChannel:CommunicationChannel? = null
    open var forTrigger:TriggerType? = null
    companion object { private val responseType = GetSystemEmailTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetSystemEmailTemplates.responseType
}

@Route(Path="/{version}/notifications/email/templates/{id}/tokens", Verbs="GET")
open class GetEmailTemplateAvailableTokens : CodeMashRequestBase(), IReturn<GetEmailTemplateAvailableTokensResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailTemplateAvailableTokensResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplateAvailableTokens.responseType
}

@Route(Path="/{version}/notifications/email/templates", Verbs="PUT")
open class UpdateEmailTemplateRequest : SaveEmailTemplate(), IReturn<EmptyResponse>
{
    open var viewId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/signatures/{id}", Verbs="DELETE")
open class DeleteEmailSignature : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailSignature.responseType
}

@Route(Path="/{version}/notifications/email/signatures/{id}", Verbs="GET")
open class GetEmailSignature : CodeMashRequestBase(), IReturn<GetEmailSignatureResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailSignatureResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSignature.responseType
}

@Route(Path="/{version}/notifications/email/signatures", Verbs="GET")
open class GetEmailSignatures : CodeMashListPaginationRequestBase(), IReturn<GetEmailSignaturesResponse>
{
    companion object { private val responseType = GetEmailSignaturesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSignatures.responseType
}

@Route(Path="/{version}/notifications/email/signatures", Verbs="POST")
open class SaveEmailSignatureRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var viewId:String? = null
    open var displayName:String? = null
    open var translations:ArrayList<TranslationDto> = ArrayList<TranslationDto>()
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailSignatureRequest.responseType
}

@Route(Path="/{version}/notifications/email/settings", Verbs="GET")
open class GetEmailSettings : CodeMashRequestBase(), IReturn<GetEmailSettingsResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSettings.responseType
}

@Route(Path="/{version}/notifications/email/integrations/confirm-human-delivery", Verbs="POST")
@DataContract
open class ConfirmEmailIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmEmailIntegrationHumanDeliveryRequest.responseType
}

@Route(Path="/{version}/notifications/email/integrations/{Id}", Verbs="DELETE")
open class DeleteEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/integrations/{Id}/disable", Verbs="PUT")
open class DisableEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/integrations/{Id}/enable", Verbs="PUT")
open class EnableEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/integrations/{id}", Verbs="GET")
open class GetEmailIntegration : CodeMashRequestBase(), IReturn<GetEmailIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/integrations", Verbs="GET")
open class GetEmailIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetEmailIntegrationsResponse>
{
    companion object { private val responseType = GetEmailIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailIntegrations.responseType
}

@Route(Path="/{version}/notifications/email/integrations", Verbs="POST")
@DataContract
open class SaveEmailIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:EmailIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/integrations/{Id}/default", Verbs="PUT")
open class SetEmailsIntegrationAsDefault : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetEmailsIntegrationAsDefault.responseType
}

@Route(Path="/{version}/notifications/email/integrations/test", Verbs="POST")
open class TestEmailIntegration : CodeMashRequestBase(), IReturn<TestEmailIntegrationResponse>
{
    open var integrationId:String? = null
    open var to:String? = null
    companion object { private val responseType = TestEmailIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestEmailIntegration.responseType
}

@Route(Path="/{version}/notifications/email/templates/{Id}/archive", Verbs="PUT")
open class ArchiveEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchiveEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/templates/{Id}/clone", Verbs="POST")
open class CloneEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CloneEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/templates/{Id}/unarchive", Verbs="PUT")
open class UnArchiveEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnArchiveEmailTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/email/footers/{id}", Verbs="DELETE")
open class DeleteEmailFooter : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailFooter.responseType
}

@Route(Path="/{version}/notifications/email/footers/{id}", Verbs="GET")
open class GetEmailFooter : CodeMashRequestBase(), IReturn<GetEmailFooterResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetEmailFooterResponse::class.java }
    override fun getResponseType(): Any? = GetEmailFooter.responseType
}

@Route(Path="/{version}/notifications/email/footers", Verbs="GET")
open class GetEmailFooters : CodeMashListPaginationRequestBase(), IReturn<GetEmailFootersResponse>
{
    companion object { private val responseType = GetEmailFootersResponse::class.java }
    override fun getResponseType(): Any? = GetEmailFooters.responseType
}

@Route(Path="/{version}/notifications/email/footers", Verbs="POST")
open class SaveEmailFooterRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var viewId:String? = null
    open var displayName:String? = null
    open var translations:ArrayList<TranslationDto> = ArrayList<TranslationDto>()
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailFooterRequest.responseType
}

/**
* This endpoint implements the RFC 8058 one-click unsubscribe flow used by mailbox providers.
*/
@Route(Path="/{version}/email/one-click-unsubscribe", Verbs="POST")
@Api(Description="This endpoint implements the RFC 8058 one-click unsubscribe flow used by mailbox providers.")
@DataContract
open class OneClickUnsubscribeRequest : RequestBase(), IReturn<EmptyResponse>
{
    /**
    * Encrypted unsubscribe token. The campaign batcher embedded this value in the List-Unsubscribe header.
    */
    @DataMember
    @ApiMember(Description="Encrypted unsubscribe token. The campaign batcher embedded this value in the List-Unsubscribe header.", IsRequired=true, Name="token", ParameterType="query")
    open var token:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = OneClickUnsubscribeRequest.responseType
}

/**
* Create email campaign
*/
@Route(Path="/{version}/notifications/email/campaigns", Verbs="POST")
@Api(Description="Create email campaign")
@DataContract
open class CreateEmailCampaignRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var campaign:EmailCampaignRequest? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateEmailCampaignRequest.responseType
}

/**
* Deletes emails campaign from queue
*/
@Route(Path="/{version}/notifications/email/campaigns/{Id}", Verbs="DELETE")
@Api(Description="Deletes emails campaign from queue")
@DataContract
open class DeleteEmailCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailCampaignRequest.responseType
}

@Route(Path="/{version}/notifications/email/campaigns/{id}", Verbs="GET")
open class GetEmailCampaign : CodeMashRequestBase(), IReturn<GetEmailCampaignResponse>
{
    open var id:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaign.responseType
}

@Route(Path="/{version}/notifications/email/campaigns", Verbs="GET")
open class GetEmailCampaigns : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignsResponse>
{
    open var databaseIntegrationId:String? = null
    open var campaignId:String? = null
    open var emailAddress:String? = null
    open var templateId:String? = null
    open var from:Long? = null
    open var to:Long? = null
    companion object { private val responseType = GetEmailCampaignsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaigns.responseType
}

@Route(Path="/{version}/notifications/email/campaigns/{id}/batches", Verbs="GET")
open class GetEmailCampaignBatches : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchesResponse>
{
    open var id:String? = null
    open var databaseIntegrationId:String? = null
    open var batchId:String? = null
    open var emailAddress:String? = null
    companion object { private val responseType = GetEmailCampaignBatchesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatches.responseType
}

@Route(Path="/{version}/notifications/email/campaigns/{id}/batches/{batchId}/{notificationId}", Verbs="GET")
open class GetEmailCampaignBatchNotification : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchNotificationResponse>
{
    open var id:String? = null
    open var batchId:String? = null
    open var notificationId:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignBatchNotificationResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatchNotification.responseType
}

@Route(Path="/{version}/notifications/email/campaigns/{id}/batches/{batchId}", Verbs="GET")
open class GetEmailCampaignBatchNotifications : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchNotificationsResponse>
{
    open var id:String? = null
    open var batchId:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignBatchNotificationsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatchNotifications.responseType
}

@Route(Path="/{version}/notifications/email/campaigns/{id}/stats", Verbs="GET")
open class GetEmailCampaignStatistics : CodeMashRequestBase(), IReturn<GetEmailCampaignStatisticsResponse>
{
    open var id:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignStatisticsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignStatistics.responseType
}

@Route(Path="/{version}/notifications/email/preview", Verbs="GET")
open class PreviewEmailNotification : RequestBase(), IReturn<PreviewEmailNotificationResponse>
{
    open var hash:String? = null
    companion object { private val responseType = PreviewEmailNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewEmailNotification.responseType
}

@Route(Path="/{version}/notifications/emails/campaigns/{campaignId}/messages/{id}", Verbs="GET")
open class GetEmailCampaignMessage : CodeMashRequestBase(), IReturn<GetEmailCampaignMessageResponse>
{
    open var campaignId:String? = null
    open var campaignBatchId:String? = null
    open var notificationId:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignMessageResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignMessage.responseType
}

@Route(Path="/{version}/notifications/emails/campaigns/{campaignId}/messages", Verbs="GET")
open class GetEmailCampaignMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignMessagesResponse>
{
    open var campaignId:String? = null
    open var campaignBatchId:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignMessagesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignMessagesRequest.responseType
}

open class EmailServiceEstablished
{
}

open class EmailServiceEnabled
{
}

open class EmailServiceDisabled
{
}

open class EmailFooterSaved
{
    open var id:EmailFooterId? = null
    open var name:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<TemplateCode>> = ArrayList<MessageTranslation<TemplateCode>>()
}

open class EmailFooterDeleted
{
    open var id:EmailFooterId? = null
}

open class EmailIntegrationSaved
{
    open var integration:EmailIntegration? = null
}

open class EmailIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class EmailIntegrationHumanDeliveryConfirmed
{
    open var id:IntegrationId? = null
    open var confirmedAtUtc:Date? = null
}

open class EmailIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class EmailIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class EmailIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class EmailIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class EmailIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class EmailSignatureSaved
{
    open var id:EmailSignatureId? = null
    open var name:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<TemplateCode>> = ArrayList<MessageTranslation<TemplateCode>>()
}

open class EmailSignatureDeleted
{
    open var id:EmailSignatureId? = null
}

open class EmailTemplateCreated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<EmailMessageContent>> = ArrayList<MessageTranslation<EmailMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
    open var languageAgnosticAttachments:ArrayList<FileResourceRef>? = null
}

open class EmailTemplateUpdated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<EmailMessageContent>> = ArrayList<MessageTranslation<EmailMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
    open var languageAgnosticAttachments:ArrayList<FileResourceRef>? = null
    open var attachmentsToBeDeleted:ArrayList<FileResourceRef>? = null
}

open class EmailTemplateDeleted
{
    open var templateId:TemplateId? = null
    open var filesToBeDeleted:ArrayList<FileResourceRef>? = null
    open var fileIntegrationId:IntegrationId? = null
}

open class EmailTemplateArchived
{
    open var templateId:TemplateId? = null
}

open class EmailTemplateUnArchived
{
    open var templateId:TemplateId? = null
}

open class CodeIntegrationSaved
{
    open var integration:CodeIntegration? = null
}

open class CodeIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class CodeIntegrationHumanDeliveryConfirmed
{
    open var id:IntegrationId? = null
    open var confirmedAtUtc:Date? = null
}

open class CodeIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class CodeIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class CodeIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class CodeIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class CodeIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class MarketplaceIntegrationSaved
{
    open var integration:MarketplaceIntegration? = null
}

open class MarketplaceIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class MarketplaceIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class MarketplaceIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class MarketplaceIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
}

open class MarketplaceIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
}

open class MarketplaceFunctionBindingSaved
{
    open var binding:MarketplaceFunctionBinding? = null
}

open class MarketplaceFunctionBindingDeleted
{
    open var integrationId:IntegrationId? = null
    open var bindingId:UUID? = null
}

open class MarketplaceFunctionBindingEnabled
{
    open var integrationId:IntegrationId? = null
    open var bindingId:UUID? = null
}

open class MarketplaceFunctionBindingDisabled
{
    open var integrationId:IntegrationId? = null
    open var bindingId:UUID? = null
}

@Route(Path="/{version}/notifications/push/disable", Verbs="GET")
open class DisablePush : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePush.responseType
}

@Route(Path="/{version}/notifications/push/enable", Verbs="GET")
open class EnablePush : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePush.responseType
}

@Route(Path="/{version}/notifications/push/templates/{Id}/archive", Verbs="PUT")
open class ArchivePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchivePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/templates/{Id}/clone", Verbs="POST")
open class ClonePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ClonePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/templates", Verbs="POST")
open class CreatePushTemplateRequest : SavePushTemplate(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreatePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/templates/{Id}", Verbs="DELETE")
open class DeletePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/templates/{id}", Verbs="GET")
open class GetPushTemplate : CodeMashRequestBase(), IReturn<GetPushTemplateResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetPushTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetPushTemplate.responseType
}

@Route(Path="/{version}/notifications/push/templates", Verbs="GET")
open class GetPushTemplates : CodeMashListPaginationRequestBase(), IReturn<GetPushTemplatesResponse>
{
    open var showArchived:Boolean? = null
    open var templateId:String? = null
    companion object { private val responseType = GetPushTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetPushTemplates.responseType
}

@Route(Path="/{version}/notifications/push/templates/{id}/tokens", Verbs="GET")
open class GetPushMessageContentTokens : CodeMashRequestBase(), IReturn<GetPushMessageContentTokensResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetPushMessageContentTokensResponse::class.java }
    override fun getResponseType(): Any? = GetPushMessageContentTokens.responseType
}

@Route(Path="/{version}/notifications/push/templates/{Id}/unarchive", Verbs="PUT")
open class UnArchivePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnArchivePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/templates", Verbs="PUT")
open class UpdatePushTemplateRequest : SavePushTemplate(), IReturn<EmptyResponse>
{
    open var viewId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdatePushTemplateRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/confirm-human-delivery", Verbs="POST")
@DataContract
open class ConfirmPushIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmPushIntegrationHumanDeliveryRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/{Id}", Verbs="DELETE")
open class DeletePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePushIntegrationRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/{Id}/disable", Verbs="PUT")
open class DisablePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePushIntegrationRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/{Id}/enable", Verbs="PUT")
open class EnablePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePushIntegrationRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/{id}", Verbs="GET")
open class GetPushIntegration : CodeMashRequestBase(), IReturn<GetPushIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetPushIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetPushIntegration.responseType
}

@Route(Path="/{version}/notifications/push/integrations", Verbs="GET")
open class GetPushIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetPushIntegrationsResponse>
{
    companion object { private val responseType = GetPushIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetPushIntegrations.responseType
}

@Route(Path="/{version}/notifications/push/integrations", Verbs="POST")
@DataContract
open class SavePushIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:PushIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePushIntegration.responseType
}

@Route(Path="/{version}/notifications/push/integrations/{Id}/default", Verbs="PUT")
open class SetPushIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetPushIntegrationAsDefaultRequest.responseType
}

@Route(Path="/{version}/notifications/push/integrations/test", Verbs="POST")
open class TestPushIntegration : CodeMashRequestBase(), IReturn<TestEmailIntegrationResponse>
{
    @DataMember
    open var integrationId:String? = null

    @DataMember
    open var testToken:String? = null

    @DataMember
    open var deliveryFamily:String? = null
    companion object { private val responseType = TestEmailIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestPushIntegration.responseType
}

@Route(Path="/{version}/notifications/push/integrations/app/request", Verbs="POST")
open class RegisterCodeMashAppPushIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>, IHasAccountId
{
    override var accountId:String? = null
    open var userId:String? = null
    open var requestId:String? = null
    open var pin:Int? = null
    open var validTill:Date? = null
    open var publicKey:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RegisterCodeMashAppPushIntegration.responseType
}

@Route(Path="/{version}/notifications/push/devices", Verbs="POST")
@DataContract
open class RegisterDevice : RequestBase(), IReturn<IdResponse>, IHasProjectId
{
    @DataMember
    open var pushDeviceDto:PushDeviceDto? = null

    @DataMember
    open var userId:String? = null

    @DataMember
    override var projectId:String? = null

    @DataMember
    open var accountId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = RegisterDevice.responseType
}

open class PushIntegrationSaved
{
    open var integration:PushIntegration? = null
}

open class PushIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class PushIntegrationHumanDeliveryConfirmed
{
    open var id:IntegrationId? = null
    open var confirmedAtUtc:Date? = null
}

open class PushIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class PushIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class PushIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class PushIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class PushIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class PushServiceEstablished
{
    open var defaultTemplates:ArrayList<PushTemplate>? = null
}

open class PushServiceEnabled
{
}

open class PushServiceDisabled
{
}

open class PushModuleTagSaved
{
    open var tag:TagDefinition? = null
    open var communicationChannel:CommunicationChannel? = null
}

open class PushModuleTagDeleted
{
    open var tag:Tag? = null
    open var communicationChannel:CommunicationChannel? = null
}

open class PushTemplateCreated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<PushMessageContent>> = ArrayList<MessageTranslation<PushMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
}

open class PushTemplateUpdated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<PushMessageContent>> = ArrayList<MessageTranslation<PushMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
}

open class PushTemplateDeleted
{
    open var templateId:TemplateId? = null
}

open class PushTemplateArchived
{
    open var templateId:TemplateId? = null
}

open class PushTemplateUnArchived
{
    open var templateId:TemplateId? = null
}

@Route(Path="/{version}/payments/disable", Verbs="GET")
open class DisablePayments : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePayments.responseType
}

@Route(Path="/{version}/payments/enable", Verbs="GET")
open class EnablePayments : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePayments.responseType
}

@Route(Path="/{version}/payments/triggers/{triggerId}", Verbs="DELETE")
// @Route(Path="/{version}/triggers", Verbs="DELETE")
@DataContract
open class DeletePaymentsTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePaymentsTrigger.responseType
}

@Route(Path="/{version}/payments/triggers/{triggerId}/disable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/disable", Verbs="PUT")
@DataContract
open class DisablePaymentsTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePaymentsTrigger.responseType
}

@Route(Path="/{version}/payments/triggers/{triggerId}/enable", Verbs="PATCH")
// @Route(Path="/{version}/triggers/enable", Verbs="PUT")
@DataContract
open class EnablePaymentsTrigger : EnableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePaymentsTrigger.responseType
}

/**
* Gets payments trigger by specified Id
*/
@Route(Path="/{version}/payments/triggers/{id}", Verbs="GET")
@Api(Description="Gets payments trigger by specified Id")
open class GetPaymentsTrigger : GetTrigger(), IReturn<GetPaymentsTriggerResponse>
{
    companion object { private val responseType = GetPaymentsTriggerResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsTrigger.responseType
}

/**
* Gets payments triggers
*/
@Route(Path="/{version}/payments/triggers", Verbs="GET")
@Api(Description="Gets payments triggers")
open class GetPaymentsTriggers : GetTriggers(), IReturn<GetPaymentsTriggersResponse>
{
    companion object { private val responseType = GetPaymentsTriggersResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsTriggers.responseType
}

@Route(Path="/{version}/payments/triggers", Verbs="POST")
// @Route(Path="/{version}/triggers", Verbs="POST")
@DataContract
open class SavePaymentsTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePaymentsTrigger.responseType
}

@Route(Path="/{version}/payments/integrations/confirm-human-delivery", Verbs="POST")
@DataContract
open class ConfirmPaymentsIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmPaymentsIntegrationHumanDeliveryRequest.responseType
}

@Route(Path="/{version}/payments/integrations/{Id}", Verbs="DELETE")
open class DeletePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePaymentsIntegrationRequest.responseType
}

@Route(Path="/{version}/payments/integrations/{Id}/disable", Verbs="PUT")
open class DisablePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePaymentsIntegrationRequest.responseType
}

@Route(Path="/{version}/payments/integrations/{Id}/enable", Verbs="PUT")
open class EnablePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePaymentsIntegrationRequest.responseType
}

@Route(Path="/{version}/payments/integrations/{id}", Verbs="GET")
open class GetPaymentsIntegration : CodeMashRequestBase(), IReturn<GetPaymentsIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetPaymentsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsIntegration.responseType
}

@Route(Path="/{version}/payments/integrations", Verbs="GET")
open class GetPaymentsIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetPaymentsIntegrationsResponse>
{
    companion object { private val responseType = GetPaymentsIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsIntegrations.responseType
}

@Route(Path="/{version}/payments/integrations", Verbs="POST")
@DataContract
open class SavePaymentsIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:PaymentIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePaymentsIntegration.responseType
}

@Route(Path="/{version}/payments/integrations/test", Verbs="POST")
open class TestPaymentsIntegration : CodeMashRequestBase(), IReturn<TestPaymentsIntegrationResponse>
{
    open var integrationId:String? = null
    companion object { private val responseType = TestPaymentsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestPaymentsIntegration.responseType
}

@Route(Path="/{version}/logs/disable", Verbs="GET")
open class DisableLogging : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLogging.responseType
}

@Route(Path="/{version}/logs/enable", Verbs="GET")
open class EnableLogging : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLogging.responseType
}

@Route(Path="/{version}/logs/integrations/{Id}", Verbs="DELETE")
open class DeleteLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteLoggingIntegrationRequest.responseType
}

@Route(Path="/{version}/logs/integrations/{Id}/disable", Verbs="PUT")
open class DisableLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLoggingIntegrationRequest.responseType
}

@Route(Path="/{version}/logs/integrations/{Id}/enable", Verbs="PUT")
open class EnableLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLoggingIntegrationRequest.responseType
}

@Route(Path="/{version}/logs/integrations/{id}", Verbs="GET")
open class GetLoggingIntegration : CodeMashRequestBase(), IReturn<GetLoggingIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetLoggingIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetLoggingIntegration.responseType
}

@Route(Path="/{version}/logs/integrations", Verbs="GET")
open class GetLoggingIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetLoggingIntegrationsResponse>
{
    companion object { private val responseType = GetLoggingIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetLoggingIntegrations.responseType
}

@Route(Path="/{version}/logs/integrations", Verbs="POST")
@DataContract
open class SaveLoggingIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:LoggingIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveLoggingIntegration.responseType
}

@Route(Path="/{version}/logs/integrations/test", Verbs="POST")
open class TestLoggingIntegration : CodeMashRequestBase(), IReturn<TestLoggingIntegrationResponse>
{
    open var integrationId:String? = null
    companion object { private val responseType = TestLoggingIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestLoggingIntegration.responseType
}

open class LoggingIntegrationSaved
{
    open var integration:LoggingIntegration? = null
}

open class LoggingIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
}

open class LoggingIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
}

open class LoggingIntegrationDeleted
{
    open var id:IntegrationId? = null
}

open class LoggingIntegrationEnabled
{
    open var id:IntegrationId? = null
}

open class LoggingIntegrationDisabled
{
    open var id:IntegrationId? = null
}

open class LoggingEstablished
{
}

open class LoggingEnabled
{
}

open class LoggingDisabled
{
}

/**
* Gets account info.
*/
@Route(Path="/{version}/account/chat/complete", Verbs="POST")
@Api(Description="Gets account info.")
open class AskChatRequest : RequestBase(), IReturn<AskChatResponse>
{
    open var prompt:String? = null
    companion object { private val responseType = AskChatResponse::class.java }
    override fun getResponseType(): Any? = AskChatRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}", Verbs="DELETE")
open class DeleteLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}/disable", Verbs="PUT")
open class DisableLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}/enable", Verbs="PUT")
open class EnableLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{id}", Verbs="GET")
open class GetLlmIntegration : CodeMashRequestBase(), IReturn<GetLlmIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetLlmIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetLlmIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/llms/integrations", Verbs="GET")
open class GetLlmIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetLlmIntegrationsResponse>
{
    companion object { private val responseType = GetLlmIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetLlmIntegrations.responseType
}

@Route(Path="/{version}/ai/integrations/llms/", Verbs="POST")
@DataContract
open class SaveLlmIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:LlmIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveLlmIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/llms/test", Verbs="POST")
open class TestLlmIntegration : CodeMashRequestBase(), IReturn<TestLlmIntegrationResponse>
{
    open var integrationId:String? = null
    companion object { private val responseType = TestLlmIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestLlmIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}", Verbs="DELETE")
open class DeleteMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}/disable", Verbs="PUT")
open class DisableMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}/enable", Verbs="PUT")
open class EnableMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{id}", Verbs="GET")
open class GetMcpIntegration : CodeMashRequestBase(), IReturn<GetMcpIntegrationResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetMcpIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetMcpIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/integrations", Verbs="GET")
open class GetMcpIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetMcpIntegrationsResponse>
{
    companion object { private val responseType = GetMcpIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetMcpIntegrations.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/", Verbs="POST")
@DataContract
open class SaveMcpIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var integration:McpIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMcpIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/test", Verbs="POST")
open class TestMcpIntegration : CodeMashRequestBase(), IReturn<TestLlmIntegrationResponse>
{
    open var integrationId:String? = null
    companion object { private val responseType = TestLlmIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestMcpIntegration.responseType
}

open class WebhookIntegrationSaved
{
    open var integration:WebhookIntegration? = null
}

open class WebhookIntegrationExtraHeadersChanged
{
    open var id:IntegrationId? = null
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null
}

open class WebhookIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
}

open class WebhookIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
}

open class WebhookIntegrationSecretsCleared
{
    open var id:IntegrationId? = null
}

open class WebhookDestinationSaved
{
    open var integrationId:IntegrationId? = null
    open var destination:WebhookDestination? = null
}

open class WebhookDestinationRemoved
{
    open var integrationId:IntegrationId? = null
    open var destinationId:WebhookDestinationId? = null
}

open class WebhookDestinationEnabled
{
    open var integrationId:IntegrationId? = null
    open var destinationId:WebhookDestinationId? = null
}

open class WebhookDestinationDisabled
{
    open var integrationId:IntegrationId? = null
    open var destinationId:WebhookDestinationId? = null
}

@Route(Path="/{version}/webhooks/integration", Verbs="GET")
open class GetWebhookIntegration : CodeMashRequestBase(), IReturn<GetWebhookIntegrationResponse>
{
    companion object { private val responseType = GetWebhookIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetWebhookIntegration.responseType
}

@Route(Path="/{version}/webhooks/integration/secret", Verbs="GET")
open class RevealWebhookIntegrationSecretRequest : CodeMashRequestBase(), IReturn<RevealWebhookIntegrationSecretResponse>
{
    companion object { private val responseType = RevealWebhookIntegrationSecretResponse::class.java }
    override fun getResponseType(): Any? = RevealWebhookIntegrationSecretRequest.responseType
}

@Route(Path="/{version}/webhooks/integration/secret/rotate", Verbs="POST")
open class RotateWebhookIntegrationSecretRequest : CodeMashRequestBase(), IReturn<RotateWebhookIntegrationSecretResponse>
{
    companion object { private val responseType = RotateWebhookIntegrationSecretResponse::class.java }
    override fun getResponseType(): Any? = RotateWebhookIntegrationSecretRequest.responseType
}

@Route(Path="/{version}/webhooks/integration/extra-headers", Verbs="PUT")
open class UpdateWebhookIntegrationExtraHeadersRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var extraHeaders:HashMap<String,String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateWebhookIntegrationExtraHeadersRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}/disable", Verbs="PUT")
open class DisableWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}/enable", Verbs="PUT")
open class EnableWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}", Verbs="DELETE")
open class RemoveWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations", Verbs="POST")
open class SaveWebhookDestinationRequest : CodeMashRequestBase(), IReturn<SaveWebhookDestinationResponse>
{
    open var destinationId:String? = null
    open var destinationName:String? = null
    open var endpointUrl:String? = null
    open var selectedEvents:ArrayList<String> = ArrayList<String>()
    open var extraHeaders:HashMap<String,String>? = null
    open var isEnabled:Boolean? = null
    companion object { private val responseType = SaveWebhookDestinationResponse::class.java }
    override fun getResponseType(): Any? = SaveWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/scheduler/disable", Verbs="GET")
open class DisableScheduler : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableScheduler.responseType
}

@Route(Path="/{version}/scheduler/enable", Verbs="GET")
open class EnableScheduler : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableScheduler.responseType
}

@Route(Path="/{version}/scheduler/tasks/{Id}", Verbs="DELETE")
open class DeleteSchedulerTask : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSchedulerTask.responseType
}

@Route(Path="/{version}/scheduler/tasks/{Id}/disable", Verbs="PUT")
open class DisableSchedulerTask : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableSchedulerTask.responseType
}

@Route(Path="/{version}/scheduler/tasks/{Id}/enable", Verbs="PUT")
open class EnableSchedulerTask : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableSchedulerTask.responseType
}

@Route(Path="/{version}/scheduler/tasks/{id}", Verbs="GET")
open class GetSchedulerTask : CodeMashRequestBase(), IReturn<GetSchedulerTaskResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetSchedulerTaskResponse::class.java }
    override fun getResponseType(): Any? = GetSchedulerTask.responseType
}

@Route(Path="/{version}/scheduler/tasks", Verbs="GET")
open class GetSchedulerTasks : CodeMashListPaginationRequestBase(), IReturn<GetSchedulerTasksResponse>
{
    @SerializedName("type") open var Type:SchedulerTaskType? = null
    open var enabled:Boolean? = null
    companion object { private val responseType = GetSchedulerTasksResponse::class.java }
    override fun getResponseType(): Any? = GetSchedulerTasks.responseType
}

/**
* Save scheduled task
*/
@Route(Path="/{version}/scheduler/tasks", Verbs="POST")
@Api(Description="Save scheduled task")
@DataContract
open class SaveSchedulerTaskRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var taskId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var cron:String? = null

    @DataMember
    open var initiatorUserId:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var stopOnError:Boolean? = null

    @DataMember
    open var task:SchedulerTaskRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveSchedulerTaskRequest.responseType
}

open class SchedulerEnabled
{
}

open class SchedulerDisabled
{
}

open class SchedulerTaskSaved
{
    open var task:SchedulerTask? = null
}

open class SchedulerTaskEnabled
{
    open var taskId:TaskId? = null
}

open class SchedulerTaskDisabled
{
    open var taskId:TaskId? = null
}

open class SchedulerTaskDeleted
{
    open var taskId:TaskId? = null
}

/**
* Sign In
*/
@Route(Path="/auth", Verbs="GET,POST")
// @Route(Path="/auth/{provider}", Verbs="GET,POST")
// @Route(Path="/v3/auth", Verbs="POST,GET,OPTIONS")
// @Route(Path="/v3/auth/{provider}", Verbs="POST,GET,OPTIONS")
@Api(Description="Sign In")
@DataContract
open class Authenticate : IReturn<AuthenticateResponse>, IPost
{
    /**
    * AuthProvider, e.g. credentials
    */
    @DataMember(Order=1)
    open var provider:String? = null

    @DataMember(Order=2)
    open var userName:String? = null

    @DataMember(Order=3)
    open var password:String? = null

    @DataMember(Order=4)
    open var rememberMe:Boolean? = null

    @DataMember(Order=5)
    open var accessToken:String? = null

    @DataMember(Order=6)
    open var accessTokenSecret:String? = null

    @DataMember(Order=7)
    open var returnUrl:String? = null

    @DataMember(Order=8)
    open var errorView:String? = null

    @DataMember(Order=9)
    open var meta:HashMap<String,String>? = null
    companion object { private val responseType = AuthenticateResponse::class.java }
    override fun getResponseType(): Any? = Authenticate.responseType
}

@Route(Path="/access-token")
@DataContract
open class GetAccessToken : IReturn<GetAccessTokenResponse>, IPost
{
    @DataMember(Order=1)
    open var refreshToken:String? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null
    companion object { private val responseType = GetAccessTokenResponse::class.java }
    override fun getResponseType(): Any? = GetAccessToken.responseType
}

@Route(Path="/apikeys")
// @Route(Path="/apikeys/{Environment}")
@DataContract
open class GetApiKeys : IReturn<GetApiKeysResponse>, IGet
{
    @DataMember(Order=1)
    open var environment:String? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null
    companion object { private val responseType = GetApiKeysResponse::class.java }
    override fun getResponseType(): Any? = GetApiKeys.responseType
}

@Route(Path="/apikeys/regenerate")
// @Route(Path="/apikeys/regenerate/{Environment}")
@DataContract
open class RegenerateApiKeys : IReturn<RegenerateApiKeysResponse>, IPost
{
    @DataMember(Order=1)
    open var environment:String? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null
    companion object { private val responseType = RegenerateApiKeysResponse::class.java }
    override fun getResponseType(): Any? = RegenerateApiKeys.responseType
}

open class EchoResponse
{
    open var containerName:String? = null
    open var ip:String? = null
    open var release:CodeMashRelease? = null
    open var runtime:CodeMashRuntime? = null
    open var managedServiceHubUrl:String? = null
    open var managedServiceApiUrl:String? = null
    open var hubUrl:String? = null
    open var apiUrl:String? = null
    open var apiVersion:String? = null
    open var hubVersion:String? = null
    open var mjmlUrl:String? = null
    open var license:CodeMashLicenseFromEndpointDto? = null
    open var askForEnterpriseLicenseEmail:String? = null
}

open class GetAccountProfileResponse : ResponseBase()
{
    open var item:AccountOwnerDto? = null
}

open class EmptyResponse : ResponseBase()
{
}

open class GetAccountStatusResponse : ResponseBase()
{
    open var item:AccountStatusDto? = null
}

@DataContract
open class CreateStripeCheckoutSessionResponse : IdResponse()
{
}

@DataContract
open class GetStripeBillingPortalUrlResponse : IdResponse()
{
}

@DataContract
open class CreateTeamMemberFromInvitationResponse : IdResponse()
{
    @DataMember
    open var token:String? = null
}

@DataContract
open class IdResponse : ResponseBase()
{
    @DataMember
    open var id:String? = null
}

open class GetProjectResponse : ResponseBase()
{
    open var item:ProjectDto? = null
}

open class GetProjectsResponse : ResponseBase()
{
    open var list:ArrayList<ProjectListItemDto>? = null
}

open class GetAccountRegionsResponse : ResponseBase()
{
    open var items:ArrayList<ProjectRegionDto>? = null
}

open class GetProjectTokensResponse : ResponseBase()
{
    open var tokens:ArrayList<TokenMappingDto>? = null
}

@DataContract
open class CreateAccountResponse : IdResponse()
{
    @DataMember
    open var token:String? = null
}

open class GetAccountCollaboratorsResponse : ResponseBase()
{
    open var list:PaginatedResponse<UserDto>? = null
}

open class GetLicensesResponse : ResponseBase()
{
    open var list:ArrayList<LicenseDto>? = null
}

open class GetUserEmailPreferencesResponse : ResponseBase()
{
    open var defaultLanguage:String? = null
    open var projectLanguages:ArrayList<String> = ArrayList<String>()
    open var blockAllMarketingMessages:Boolean? = null
    open var subscribedTags:HashMap<DeliveryChannel,HashSet<String>>? = null
}

open class GetMembershipTriggerResponse : GetTriggerResponse()
{
}

@DataContract
open class GetMembershipTriggersResponse : GetTriggersResponse()
{
    @DataMember
    open var list:PaginatedResponse<MembershipTriggerProjectionList>? = null
}

open class GetRoleResponse : ResponseBase()
{
    open var role:RoleItemDto? = null
}

open class GetRolesResponse : ResponseBase()
{
    open var roles:ArrayList<RoleListProjectionDto> = ArrayList<RoleListProjectionDto>()
}

open class GetPolicyResponse : ResponseBase()
{
    open var policy:PolicyItemDto? = null
}

open class GetPoliciesResponse : ResponseBase()
{
    open var policies:ArrayList<PolicyItemDto> = ArrayList<PolicyItemDto>()
}

open class GetMembershipIntegrationResponse : ResponseBase()
{
    open var item:MembershipIntegrationDto? = null
}

open class GetMembershipIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<MembershipIntegrationListProjection>? = null
}

open class GetSchemaTriggerResponse : GetTriggerResponse()
{
}

open class GetSchemaTriggersResponse : GetTriggersResponse()
{
    open var list:PaginatedResponse<SchemaTriggerProjectionList>? = null
}

open class GetDatabaseTaxonomyResponse : ResponseBase()
{
    open var item:TaxonomyDto? = null
}

open class GetDatabaseTaxonomiesResponse : ResponseBase()
{
    open var list:PaginatedResponse<TaxonomyListProjection>? = null
}

open class GetDatabaseTaxonomyTermResponse : ResponseBase()
{
    open var item:TermDto? = null
}

open class GetDatabaseSchemaResponse : ResponseBase()
{
    open var item:SchemaDto? = null
}

open class GetDatabaseSchemasResponse : ResponseBase()
{
    open var list:PaginatedResponse<SchemaListProjection>? = null
}

open class GetDatabaseSchemaDraftResponse : ResponseBase()
{
    open var item:SchemaDraftDto? = null
}

open class GetDatabaseSchemaVersionDiffResponse : ResponseBase()
{
    open var item:SchemaDiffDto? = null
}

open class GetDatabaseSchemaVersionsResponse : ResponseBase()
{
    open var items:ArrayList<SchemaVersionSummaryDto>? = null
}

open class GetDatabaseIntegrationResponse : ResponseBase()
{
    open var item:DatabaseIntegrationDto? = null
}

open class GetDatabaseIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<DatabaseIntegrationListProjection>? = null
}

open class GetDatabaseAggregateResponse : ResponseBase()
{
    open var item:MongoDbAggregateDto? = null
}

open class GetDatabaseAggregatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<MongoDbAggregateListProjection>? = null
}

open class TestDatabaseAggregateResponse : ResponseBase()
{
    open var result:ArrayList<Object>? = null
}

open class GetFilesTriggerResponse : GetTriggerResponse()
{
}

open class GetFilesTriggersResponse : GetTriggersResponse()
{
    open var list:PaginatedResponse<FilesTriggerProjectionList>? = null
}

open class GetFilesIntegrationResponse : ResponseBase()
{
    open var item:FilesIntegrationDto? = null
}

open class GetFilesIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<FilesIntegrationListProjection>? = null
}

open class GetEmailTemplateResponse : ResponseBase()
{
    open var item:EmailTemplateDto? = null
}

open class GetEmailTemplatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<TemplateListProjection>? = null
}

open class GetHtmlFromMjmlResponse : ResponseBase()
{
    open var variables:ArrayList<String>? = null
    open var htmlFromMjmlResponse:HtmlFromMjmlResponse? = null
}

open class GetSystemEmailTemplateResponse : ResponseBase()
{
    open var item:SystemEmailTemplateDto? = null
}

open class GetSystemEmailTemplatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SystemEmailTemplateListProjection>? = null
}

open class GetEmailTemplateAvailableTokensResponse : ResponseBase()
{
    open var tokens:HashMap<String,ArrayList<String>>? = null
}

open class GetEmailSignatureResponse : ResponseBase()
{
    open var item:EmailSignatureDto? = null
}

open class GetEmailSignaturesResponse : ResponseBase()
{
    open var list:PaginatedResponse<ListItemWithTranslationsProjection>? = null
}

open class GetEmailSettingsResponse : ResponseBase()
{
    open var settings:EmailSettings? = null
    open var systemTags:ArrayList<GroupDefinitionDto>? = null
}

open class GetEmailIntegrationResponse : ResponseBase()
{
    open var item:EmailIntegrationDto? = null
}

open class GetEmailIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<EmailIntegrationListProjection>? = null
}

@DataContract
open class TestEmailIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetEmailFooterResponse : ResponseBase()
{
    open var item:EmailFooterDto? = null
}

open class GetEmailFootersResponse : ResponseBase()
{
    open var list:PaginatedResponse<ListItemWithTranslationsProjection>? = null
}

open class GetEmailCampaignResponse : ResponseBase()
{
    open var item:EmailCampaignDto? = null
}

open class GetEmailCampaignsResponse : ResponseBase()
{
    open var list:PaginatedResponse<EmailCampaignListProjection>? = null
}

open class GetEmailCampaignBatchesResponse : ResponseBase()
{
    open var list:PaginatedResponse<EmailCampaignBatchDto>? = null
}

open class GetEmailCampaignBatchNotificationResponse : ResponseBase()
{
    open var campaignNotification:EmailCampaignBatchNotificationDto? = null
}

open class GetEmailCampaignBatchNotificationsResponse : ResponseBase()
{
    open var batchStatusHistory:ArrayList<BatchStatusChangeEntryDto>? = null
    open var list:PaginatedResponse<EmailCampaignBatchNotificationDto>? = null
}

open class GetEmailCampaignStatisticsResponse : ResponseBase()
{
    open var stats:CampaignStatsDto? = null
}

open class PreviewEmailNotificationResponse : ResponseBase()
{
    open var subject:String? = null
    open var body:String? = null
}

open class GetEmailCampaignMessageResponse : ResponseBase()
{
    open var emailMessageEntity:EmailCampaignBatchNotificationDto? = null
}

open class GetEmailCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<EmailCampaignBatchNotificationDto>? = null
}

open class GetPushTemplateResponse : ResponseBase()
{
    open var item:PushTemplateDto? = null
}

open class GetPushTemplatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<PushTemplateListProjection>? = null
}

open class GetPushMessageContentTokensResponse : ResponseBase()
{
    open var tokens:HashMap<String,ArrayList<String>>? = null
}

open class GetPushIntegrationResponse : ResponseBase()
{
    open var item:PushIntegrationDto? = null
}

open class GetPushIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<PushIntegrationListProjection>? = null
}

open class GetPaymentsTriggerResponse : GetTriggerResponse()
{
}

open class GetPaymentsTriggersResponse : GetTriggersResponse()
{
    open var list:PaginatedResponse<PaymentTriggerProjectionList>? = null
}

open class GetPaymentsIntegrationResponse : ResponseBase()
{
    open var item:PaymentsIntegrationDto? = null
}

open class GetPaymentsIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<PaymentsIntegrationListProjection>? = null
}

@DataContract
open class TestPaymentsIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetLoggingIntegrationResponse : ResponseBase()
{
    open var item:LoggingIntegrationDto? = null
}

open class GetLoggingIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<LoggingIntegrationListProjection>? = null
}

@DataContract
open class TestLoggingIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class AskChatResponse : ResponseBase()
{
    open var result:String? = null
}

open class GetLlmIntegrationResponse : ResponseBase()
{
    open var item:LlmIntegrationDto? = null
}

open class GetLlmIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<LlmIntegrationListProjection>? = null
}

@DataContract
open class TestLlmIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetMcpIntegrationResponse : ResponseBase()
{
    open var item:McpIntegrationDto? = null
}

open class GetMcpIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<McpIntegrationListProjection>? = null
}

open class GetWebhookIntegrationResponse : ResponseBase()
{
    open var item:WebhookIntegrationDto? = null
}

open class RevealWebhookIntegrationSecretResponse : ResponseBase()
{
    open var signingSecret:String? = null
}

open class RotateWebhookIntegrationSecretResponse : ResponseBase()
{
    open var signingSecret:String? = null
}

open class SaveWebhookDestinationResponse : ResponseBase()
{
    open var destinationId:String? = null
}

open class GetSchedulerTaskResponse : ResponseBase()
{
    open var item:SchedulerTaskDto? = null
}

open class GetSchedulerTasksResponse : ResponseBase()
{
    open var list:PaginatedResponse<SchedulerTaskListProjection>? = null
}

@DataContract
open class AuthenticateResponse : IHasSessionId, IHasBearerToken
{
    @DataMember(Order=1)
    open var userId:String? = null

    @DataMember(Order=2)
    open var sessionId:String? = null

    @DataMember(Order=3)
    open var userName:String? = null

    @DataMember(Order=4)
    open var displayName:String? = null

    @DataMember(Order=5)
    open var referrerUrl:String? = null

    @DataMember(Order=6)
    open var bearerToken:String? = null

    @DataMember(Order=7)
    open var refreshToken:String? = null

    @DataMember(Order=8)
    open var refreshTokenExpiry:Date? = null

    @DataMember(Order=9)
    open var profileUrl:String? = null

    @DataMember(Order=10)
    open var roles:ArrayList<String>? = null

    @DataMember(Order=11)
    open var permissions:ArrayList<String>? = null

    @DataMember(Order=12)
    open var authProvider:String? = null

    @DataMember(Order=13)
    open var responseStatus:ResponseStatus? = null

    @DataMember(Order=14)
    open var meta:HashMap<String,String>? = null
}

@DataContract
open class GetAccessTokenResponse
{
    @DataMember(Order=1)
    open var accessToken:String? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null

    @DataMember(Order=3)
    open var responseStatus:ResponseStatus? = null
}

@DataContract
open class GetApiKeysResponse
{
    @DataMember(Order=1)
    open var results:ArrayList<UserApiKey>? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null

    @DataMember(Order=3)
    open var responseStatus:ResponseStatus? = null
}

@DataContract
open class RegenerateApiKeysResponse
{
    @DataMember(Order=1)
    open var results:ArrayList<UserApiKey>? = null

    @DataMember(Order=2)
    open var meta:HashMap<String,String>? = null

    @DataMember(Order=3)
    open var responseStatus:ResponseStatus? = null
}

open class SmtpEmailIntegrationRequest : EmailIntegrationRequest()
{
    open var domain:String? = null
    open var port:SmtpPorts? = null
    open var userName:String? = null
    open var password:String? = null
}

open class AwsSesEmailIntegrationRequest : EmailIntegrationRequest()
{
    open var integrationType:AwsIntegrationType? = null
    open var awsRegion:String? = null
    open var emailIdentityArn:String? = null
    open var configurationSet:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class SendGridEmailIntegrationRequest : EmailIntegrationRequest()
{
    open var apiKey:String? = null
}

open class MailGunEmailIntegrationRequest : EmailIntegrationRequest()
{
    open var domain:String? = null
    open var apiKey:String? = null
    open var webhookSigningKey:String? = null
}

open class EmailToAllUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    open var rolesNames:ArrayList<String>? = null
    open var userTags:ArrayList<String>? = null
}

open class EmailToAccountUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    open var userRecipients:ArrayList<String> = ArrayList<String>()
    open var userCc:ArrayList<String>? = null
    open var userBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class EmailToCollectionRecordsDeliverySettingsRequest : EmailCampaignRequest()
{
    open var fields:ArrayList<String> = ArrayList<String>()
    open var schemaName:String? = null
    open var fieldType:CollectionEmailCampaignRecipientField? = null
    open var roleNames:ArrayList<String>? = null
    open var languages:ArrayList<String>? = null
}

open class EmailToEmailsDeliverySettingsRequest : EmailCampaignRequest()
{
    open var recipients:ArrayList<String> = ArrayList<String>()
    open var recipientsCc:ArrayList<String>? = null
    open var recipientsBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class EmailToUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    open var userRecipients:ArrayList<String> = ArrayList<String>()
    open var userCc:ArrayList<String>? = null
    open var userBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class MembershipTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

open class SchemaTriggerRequest : SaveTriggerRequest()
{
    open var schemaId:String? = null
    @SerializedName("when") open var When:SchemaTriggerType? = null
    open var configurationCode:String? = null
}

open class FilesTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("when") open var When:FilesTriggerType? = null
    open var fileRef:FileResourceRefDto? = null
}

open class PaymentTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("when") open var When:PaymentTriggerType? = null
}

open class MongoDbAtlasServerlessDatabaseIntegrationRequest : DatabaseIntegrationRequest()
{
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class MongoDbAtlasClusterDatabaseIntegrationRequest : DatabaseIntegrationRequest()
{
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class MongoDbConnectionStringDatabaseIntegrationRequest : DatabaseIntegrationRequest()
{
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class GoogleDriveFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var rootFolderId:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class FtpFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var host:String? = null
    open var port:Int? = null
    open var rootPath:String? = null
    open var useSsl:Boolean? = null
    open var username:String? = null
    open var password:String? = null
}

open class DropBoxFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var rootPath:String? = null
    open var accessToken:String? = null
}

open class AppleICloudFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var containerIdentifier:String? = null
    open var relativePath:String? = null
    open var keyId:String? = null
    open var teamId:String? = null
    open var bundleId:String? = null
    open var p8PrivateKey:String? = null
}

open class AwsS3FilesIntegrationRequest : FilesIntegrationRequest()
{
    open var integrationType:AwsS3IntegrationType? = null
    open var bucketName:String? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class GoogleCloudFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var bucketName:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class AzureBlobFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var blobName:String? = null
    open var connectionString:String? = null
}

open class LocalFilesIntegrationRequest : FilesIntegrationRequest()
{
    open var rootPath:String? = null
}

open class AmqpLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var host:String? = null
    open var port:Int? = null
    open var virtualHost:String? = null
    open var exchange:String? = null
    open var routingKey:String? = null
    open var username:String? = null
    open var password:String? = null
}

open class AwsKinesisLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var streamName:String? = null
    open var region:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class AwsS3LoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var integrationType:AwsS3LoggingIntegrationType? = null
    open var bucketName:String? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class TelegramLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var chatId:String? = null
    open var botToken:String? = null
}

open class NewRelicLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var region:String? = null
    open var serviceName:String? = null
    open var apiKey:String? = null
}

open class MicrosoftTeamsLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var channelName:String? = null
    open var webhookUrl:String? = null
}

open class MongoDbLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class KafkaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
    open var saslUsername:String? = null
    open var saslPassword:String? = null
}

open class PrometheusLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var endpointUrl:String? = null
    open var jobName:String? = null
    open var bearerToken:String? = null
}

open class DataDogLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var site:String? = null
    open var serviceName:String? = null
    open var environment:String? = null
    open var apiKey:String? = null
}

open class InternalKafkaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
    open var saslUsername:String? = null
    open var saslPassword:String? = null
}

open class ElasticSearchLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var uri:String? = null
    open var index:String? = null
    open var username:String? = null
    open var password:String? = null
}

open class ZabbixLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var apiUrl:String? = null
    open var hostName:String? = null
    open var apiToken:String? = null
}

open class SplunkLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var hecEndpointUrl:String? = null
    open var index:String? = null
    open var hecToken:String? = null
}

open class AzureOtelLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var endpointUrl:String? = null
    open var resourceName:String? = null
    open var connectionString:String? = null
}

open class KibanaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var uri:String? = null
    open var spaceId:String? = null
    open var apiKey:String? = null
}

open class LocalFileLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    open var rootPath:String? = null
}

open class OktaMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var domain:String? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class XMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var apiKey:String? = null
    open var apiSecretKey:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class GoogleMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class MicrosoftMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var tenantId:String? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class GitHubMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class MetaMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var appId:String? = null
    open var appSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class AppleMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    open var teamId:String? = null
    open var appBundleId:String? = null
    open var serviceId:String? = null
    open var keyId:String? = null
    open var privateKey:String? = null
    open var isProduction:Boolean? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class LemonSqueezyPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var storeId:String? = null
    open var apiKey:String? = null
    open var webhookSigningSecret:String? = null
    open var isTestMode:Boolean? = null
}

open class AdyenPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var merchantAccount:String? = null
    open var apiKey:String? = null
    open var environment:String? = null
    open var webhookId:String? = null
    open var webhookHmacKey:String? = null
}

open class MolliePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var profileId:String? = null
    open var apiKey:String? = null
    open var isTestMode:Boolean? = null
}

open class PaddlePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var apiKey:String? = null
    open var webhookEndpointSecretKey:String? = null
    open var environment:String? = null
    open var clientSideToken:String? = null
}

open class PayPalPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var environment:String? = null
    open var brandName:String? = null
}

open class StripePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var publishableKey:String? = null
    open var secretKey:String? = null
    open var webhookSigningSecret:String? = null
    open var webhookEndpointId:String? = null
    open var defaultCurrency:String? = null
}

open class AppleInAppPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var merchantIdentifier:String? = null
    open var merchantDomain:String? = null
    open var displayName:String? = null
    open var merchantIdentityCertificateP12Base64:String? = null
    open var merchantIdentityCertificatePassword:String? = null
    open var paymentProcessingCertificateP12Base64:String? = null
    open var paymentProcessingCertificatePassword:String? = null
}

open class GoogleInAppPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    open var merchantId:String? = null
    open var merchantName:String? = null
    open var gateway:String? = null
    open var privateKeyOrToken:String? = null
    open var gatewayMerchantId:String? = null
}

open class EdgeWebPushIntegrationRequest : PushIntegrationRequest()
{
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class ChromePluginPushIntegrationRequest : PushIntegrationRequest()
{
    open var extensionId:String? = null
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class SafariPushIntegrationRequest : PushIntegrationRequest()
{
    open var websitePushId:String? = null
    open var certificateP12Base64:String? = null
    open var certificatePassword:String? = null
}

open class ChromeWebPushIntegrationRequest : PushIntegrationRequest()
{
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class FirefoxWebPushIntegrationRequest : PushIntegrationRequest()
{
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class AndroidFirebasePushIntegrationRequest : PushIntegrationRequest()
{
    open var projectId:String? = null
    open var clientEmail:String? = null
    open var serviceAccountJson:String? = null
}

open class AppleApnsPushIntegrationRequest : PushIntegrationRequest()
{
    open var teamId:String? = null
    open var appBundleId:String? = null
    open var keyId:String? = null
    open var privateKey:String? = null
    open var isProduction:Boolean? = null
}

open class AwsLambdaCodeIntegrationRequest : CodeIntegrationRequest()
{
    open var integrationType:AwsLambdaIntegrationType? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class AzureFunctionsCodeIntegrationRequest : CodeIntegrationRequest()
{
    open var functionAppName:String? = null
    open var resourceGroup:String? = null
    open var connectionStringOrKey:String? = null
}

open class GoogleCloudFunctionsCodeIntegrationRequest : CodeIntegrationRequest()
{
    open var projectId:String? = null
    open var region:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class OllamaLlmIntegrationRequest : LlmIntegrationRequest()
{
}

open class OpenRouterLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class MistralLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class GrokLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class GroqLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class GoogleLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class AnthropicLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class OpenAiLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var apiKey:String? = null
}

open class PlaywrightMcpIntegrationRequest : McpIntegrationRequest()
{
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var headless:String? = null
}

open class MongoDbMcpIntegrationRequest : McpIntegrationRequest()
{
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var connectionString:String? = null
}

open class GitHubMcpIntegrationRequest : McpIntegrationRequest()
{
    open var serverUrl:String? = null
    open var accessToken:String? = null
}

open class StripeMcpIntegrationRequest : McpIntegrationRequest()
{
    open var serverUrl:String? = null
    open var apiKey:String? = null
}

open class BraveSearchMcpIntegrationRequest : McpIntegrationRequest()
{
    open var serverUrl:String? = null
    open var apiKey:String? = null
}

open class ObsidianMcpIntegrationRequest : McpIntegrationRequest()
{
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var environmentVariables:HashMap<String,String>? = null
}

@DataContract
open class EmailTemplateDto : TemplateDto(), IBindableContract
{
    @DataMember
    open var translations:IReadOnlySet<EmailMessageTranslationDto>? = null

    @DataMember
    open var staticAttachments:IReadOnlySet<FileResourceRefDto>? = null
}

@DataContract
open class PushTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:IReadOnlySet<PushMessageTranslationDto>? = null
}

@DataContract
open class SmsTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:IReadOnlySet<SmsMessageTranslationDto>? = null
}

@DataContract
open class SystemEmailTemplateDto : EmailTemplateDto(), IHasDatabaseId
{
    @DataMember
    open var imagePreview:String? = null

    @DataMember
    open var theme:SystemEmailTemplateTheme? = null

    @DataMember
    open var systemGroup:String? = null

    @DataMember
    open var systemTags:ArrayList<String>? = null

    @DataMember
    open var forTrigger:TriggerType? = null

    @DataMember
    open var hiddenSystemEmailTemplate:Boolean? = null

    @DataMember
    override var id:String? = null
}

@DataContract
open class TriggerActionEmailDto : TriggerActionDto()
{
    @DataMember
    open var templateId:String? = null

    @DataMember
    open var deliverySettings:EmailCampaignDeliverySettingsDto? = null
}

@DataContract
open class TriggerActionPushDto : TriggerActionDto()
{
    @DataMember
    open var templateId:String? = null

    @DataMember
    open var deliverySettings:PushCampaignDeliverySettingsDto? = null
}

@DataContract
open class TriggerActionCodeDto : TriggerActionDto()
{
    @DataMember
    open var functionId:String? = null

    @DataMember
    open var deliverySettings:CodeDeliverySettingsDto? = null
}

@DataContract
open class TriggerActionWebhookDto : TriggerActionDto()
{
    @DataMember
    open var deliverySettings:WebhookDeliverySettingsDto? = null
}

@DataContract
open class EmailToAllUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var rolesNames:IReadOnlySet<String>? = null

    @DataMember
    open var userTags:IReadOnlySet<String>? = null
}

@DataContract
open class EmailToAccountUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var userRecipients:IReadOnlySet<String>? = null

    @DataMember
    open var userCc:IReadOnlySet<String>? = null

    @DataMember
    open var userBcc:IReadOnlySet<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var userRecipients:IReadOnlySet<String>? = null

    @DataMember
    open var userCc:IReadOnlySet<String>? = null

    @DataMember
    open var userBcc:IReadOnlySet<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToEmailAddressesDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var recipients:IReadOnlySet<String>? = null

    @DataMember
    open var recipientsCc:IReadOnlySet<String>? = null

    @DataMember
    open var recipientsBcc:IReadOnlySet<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToCollectionRecordsDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var fields:IReadOnlySet<String>? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var fieldType:CollectionEmailCampaignRecipientField? = null

    @DataMember
    open var roleNames:IReadOnlySet<String>? = null

    @DataMember
    open var languages:IReadOnlySet<String>? = null
}

@DataContract
open class PushToAllUsersDeliverySettingsDto : PushCampaignDeliverySettingsDto()
{
    @DataMember
    open var rolesNames:ArrayList<String>? = null

    @DataMember
    open var userTags:ArrayList<String>? = null
}

@DataContract
open class PushToUsersDeliverySettingsDto : PushCampaignDeliverySettingsDto()
{
    @DataMember
    open var recipients:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class PushToCollectionRecordsDeliverySettingsDto : PushCampaignDeliverySettingsDto()
{
    @DataMember
    open var fields:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var fieldType:CollectionEmailCampaignRecipientField? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var roleNames:ArrayList<String>? = null

    @DataMember
    open var languages:ArrayList<String>? = null
}

@DataContract
open class PushToDevicesDeliverySettingsDto : PushCampaignDeliverySettingsDto()
{
    @DataMember
    open var devices:ArrayList<PushDeviceDeliveryTokenDto> = ArrayList<PushDeviceDeliveryTokenDto>()
}

@DataContract
open class SmsToAllUsersDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
{
    @DataMember
    open var rolesNames:ArrayList<String>? = null

    @DataMember
    open var userTags:ArrayList<String>? = null
}

@DataContract
open class SmsToUsersDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
{
    @DataMember
    open var recipients:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class SmsToCollectionRecordsDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
{
    @DataMember
    open var fields:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var fieldType:CollectionEmailCampaignRecipientField? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var roleNames:ArrayList<String>? = null

    @DataMember
    open var languages:ArrayList<String>? = null
}

@DataContract
open class SmsToPhoneNumbersDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
{
    @DataMember
    open var phoneNumbers:ArrayList<String> = ArrayList<String>()
}

open class OpenAiLlmIntegrationDto : LlmIntegrationDto()
{
}

open class AnthropicLlmIntegrationDto : LlmIntegrationDto()
{
}

open class OllamaLlmIntegrationDto : LlmIntegrationDto()
{
}

open class GroqLlmIntegrationDto : LlmIntegrationDto()
{
}

open class GoogleLlmIntegrationDto : LlmIntegrationDto()
{
}

open class MistralLlmIntegrationDto : LlmIntegrationDto()
{
}

open class OpenRouterLlmIntegrationDto : LlmIntegrationDto()
{
}

open class GrokLlmIntegrationDto : LlmIntegrationDto()
{
}

open class DockerMcpIntegrationDto : McpIntegrationDto()
{
}

open class GoogleCalendarMcpIntegrationDto : McpIntegrationDto()
{
}

open class ObsidianMcpIntegrationDto : McpIntegrationDto()
{
}

open class AwsLambdaCrossAccountRoleCodeIntegrationDto : CodeIntegrationDto()
{
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
}

open class AwsLambdaIamCodeIntegrationDto : CodeIntegrationDto()
{
    open var region:String? = null
}

open class AzureFunctionsCodeIntegrationDto : CodeIntegrationDto()
{
    open var functionAppName:String? = null
    open var resourceGroup:String? = null
}

open class GoogleCloudFunctionsCodeIntegrationDto : CodeIntegrationDto()
{
    open var projectId:String? = null
    open var region:String? = null
}

open class AdyenPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantAccount:String? = null
    open var environment:String? = null
    open var webhookId:String? = null
}

open class AppleInAppPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantIdentifier:String? = null
    open var merchantDomain:String? = null
    open var displayName:String? = null
}

open class GoogleInAppPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantId:String? = null
    open var merchantName:String? = null
    open var gateway:String? = null
    open var gatewayMerchantId:String? = null
}

open class LemonSqueezyPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var storeId:String? = null
    open var isTestMode:Boolean? = null
}

open class MolliePaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var profileId:String? = null
    open var isTestMode:Boolean? = null
}

open class PaddlePaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var environment:String? = null
    open var clientSideToken:String? = null
}

open class PayPalPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var clientId:String? = null
    open var environment:String? = null
    open var brandName:String? = null
}

open class StripePaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var publishableKey:String? = null
    open var webhookEndpointId:String? = null
    open var defaultCurrency:String? = null
}

open class ShopifyPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var shopDomain:String? = null
    open var webhookSecret:String? = null
}

open class WooCommercePaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var storeUrl:String? = null
    open var webhookSecret:String? = null
}

open class MagentoPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var storeUrl:String? = null
    open var webhookSecret:String? = null
}

open class BraintreePaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantId:String? = null
    open var environment:String? = null
    open var webhookSecret:String? = null
}

open class AuthorizeNetPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantLoginId:String? = null
    open var environment:String? = null
    open var webhookSignatureKey:String? = null
}

open class CheckOutComPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantAccount:String? = null
    open var environment:String? = null
    open var webhookSecret:String? = null
}

open class WorldpayPaymentIntegrationDto : PaymentsIntegrationDto()
{
    open var merchantCode:String? = null
    open var environment:String? = null
    open var webhookSecret:String? = null
}

open class AppleSignInMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var teamId:String? = null
    open var appBundleId:String? = null
    open var serviceId:String? = null
}

open class GitHubMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var clientId:String? = null
}

open class GoogleMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var clientId:String? = null
}

open class MetaMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var appId:String? = null
}

open class MicrosoftMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var tenantId:String? = null
    open var clientId:String? = null
}

open class OktaMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var domain:String? = null
    open var clientId:String? = null
}

open class XMembershipIntegrationDto : MembershipIntegrationDto()
{
    open var apiKey:String? = null
}

open class AmqpLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var host:String? = null
    open var port:Int? = null
    open var virtualHost:String? = null
    open var exchange:String? = null
    open var routingKey:String? = null
}

open class AwsKinesisLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var streamName:String? = null
    open var region:String? = null
}

open class AwsS3CrossAccountRoleLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var bucketName:String? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
}

open class AwsS3IamLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var bucketName:String? = null
    open var region:String? = null
}

open class AzureOtelLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var endpointUrl:String? = null
    open var resourceName:String? = null
}

open class DataDogLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var site:String? = null
    open var serviceName:String? = null
    open var environment:String? = null
}

open class ElasticSearchLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var uri:String? = null
    open var index:String? = null
}

open class InternalKafkaLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
}

open class KafkaLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
}

open class KibanaLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var uri:String? = null
    open var spaceId:String? = null
}

open class LocalFileLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var rootPath:String? = null
}

open class MicrosoftTeamsLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var channelName:String? = null
}

open class MongoDbLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var databaseName:String? = null
}

open class NewRelicLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var region:String? = null
    open var serviceName:String? = null
}

open class PrometheusLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var endpointUrl:String? = null
    open var jobName:String? = null
}

open class SplunkLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var hecEndpointUrl:String? = null
    open var index:String? = null
}

open class TelegramLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var chatId:String? = null
}

open class ZabbixLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var apiUrl:String? = null
    open var hostName:String? = null
}

open class SlackLoggingIntegrationDto : LoggingIntegrationDto()
{
    open var channelName:String? = null
}

open class AppleICloudFilesIntegrationDto : FilesIntegrationDto()
{
    open var containerIdentifier:String? = null
    open var relativePath:String? = null
}

open class AwsS3CrossAccountRoleFilesIntegrationDto : FilesIntegrationDto()
{
    open var bucketName:String? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
}

open class AwsS3IamFilesIntegrationDto : FilesIntegrationDto()
{
    open var bucketName:String? = null
    open var region:String? = null
}

open class AzureBlobFilesIntegrationDto : FilesIntegrationDto()
{
    open var blobName:String? = null
}

open class DropBoxFilesIntegrationDto : FilesIntegrationDto()
{
    open var rootPath:String? = null
}

open class FtpFilesIntegrationDto : FilesIntegrationDto()
{
    open var host:String? = null
    open var port:Int? = null
    open var rootPath:String? = null
    open var useSsl:Boolean? = null
}

open class GoogleCloudFilesIntegrationDto : FilesIntegrationDto()
{
    open var bucketName:String? = null
}

open class GoogleDriveFilesIntegrationDto : FilesIntegrationDto()
{
    open var rootFolderId:String? = null
}

open class LocalFilesIntegrationDto : FilesIntegrationDto()
{
    open var rootPath:String? = null
}

open class MongoDbAtlasClusterIntegrationDto : DatabaseIntegrationDto()
{
    open var databaseName:String? = null
}

open class MongoDbAtlasServerlessIntegrationDto : DatabaseIntegrationDto()
{
    open var databaseName:String? = null
}

open class MongoDbConnectionStringIntegrationDto : DatabaseIntegrationDto()
{
    open var databaseName:String? = null
}

open class BirdSmsIntegrationDto : SmsIntegrationDto()
{
    open var originator:String? = null
    open var region:String? = null
}

open class PlivoSmsIntegrationDto : SmsIntegrationDto()
{
    open var authId:String? = null
    open var fromPhoneNumber:String? = null
}

open class SinchSmsIntegrationDto : SmsIntegrationDto()
{
    open var servicePlanId:String? = null
    open var fromPhoneNumber:String? = null
}

open class TelesignSmsIntegrationDto : SmsIntegrationDto()
{
    open var customerId:String? = null
    open var fromSender:String? = null
}

open class TelnyxSmsIntegrationDto : SmsIntegrationDto()
{
    open var messagingProfileId:String? = null
    open var fromPhoneNumber:String? = null
}

open class TwilioSmsIntegrationDto : SmsIntegrationDto()
{
    open var accountSid:String? = null
    open var fromPhoneNumber:String? = null
}

open class VonageSmsIntegrationDto : SmsIntegrationDto()
{
    open var apiKey:String? = null
    open var fromSender:String? = null
}

open class AndroidFirebasePushIntegrationDto : PushIntegrationDto()
{
    open var projectId:String? = null
    open var clientEmail:String? = null
}

open class AppleApnsPushIntegrationDto : PushIntegrationDto()
{
    open var teamId:String? = null
    open var appBundleId:String? = null
}

open class ChromePluginPushIntegrationDto : PushIntegrationDto()
{
    open var extensionId:String? = null
    open var vapidPublicKey:String? = null
    open var subject:String? = null
}

open class ChromeWebPushIntegrationDto : PushIntegrationDto()
{
    open var vapidPublicKey:String? = null
    open var subject:String? = null
}

open class EdgeWebPushIntegrationDto : PushIntegrationDto()
{
    open var vapidPublicKey:String? = null
    open var subject:String? = null
}

open class FirefoxWebPushIntegrationDto : PushIntegrationDto()
{
    open var vapidPublicKey:String? = null
    open var subject:String? = null
}

open class SafariPushIntegrationDto : PushIntegrationDto()
{
    open var websitePushId:String? = null
}

open class AwsCrossAccountRoleEmailIntegrationDto : AwsSesEmailIntegrationDto()
{
    open var roleArn:String? = null
    open var externalId:String? = null
}

open class AwsIamEmailIntegrationDto : AwsSesEmailIntegrationDto()
{
}

open class MailGunEmailIntegrationDto : EmailIntegrationDto()
{
    open var domain:String? = null
}

open class SendGridEmailIntegrationDto : EmailIntegrationDto()
{
}

open class SmtpEmailIntegrationDto : EmailIntegrationDto()
{
    open var hostName:String? = null
    open var port:Int? = null
}

open class WebhookIntegrationDto : IntegrationDto()
{
    open var destinations:IReadOnlyList<WebhookDestinationDto>? = null
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null
}

@DataContract
open class WebhookDestinationDto
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var destinationName:String? = null

    @DataMember
    open var endpointUrl:String? = null

    @DataMember
    open var selectedEvents:IReadOnlyList<String>? = null

    @DataMember
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null

    @DataMember
    open var isEnabled:Boolean? = null
}

@DataContract
open class SchedulerTaskDto
{
    @DataMember
    open var projectId:String? = null

    @DataMember
    open var taskId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var cron:String? = null

    @DataMember
    @SerializedName("type") open var Type:SchedulerTaskType? = null

    @DataMember
    open var payloadJson:String? = null

    @DataMember
    open var initiatorId:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var stopOnError:Boolean? = null

    @DataMember
    open var createdAtUnix:Long? = null

    @DataMember
    open var updatedAtUnix:Long? = null
}

open class MongoDbAggregateDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var schemaViewId:String? = null

    @DataMember
    open var pipeline:String? = null
}

@DataContract
open class MarketplaceIntegrationDto : IntegrationDto()
{
    @DataMember
    open var listingViewId:String? = null

    @DataMember
    open var transport:MarketplaceTransport? = null

    @DataMember
    open var vendor:String? = null

    @DataMember
    open var category:MarketplaceCategory? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var config:IReadOnlyDictionary<String, String>? = null
}

@DataContract
open class MarketplaceFunctionBindingDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var integrationViewId:String? = null

    @DataMember
    open var functionKey:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var mappings:IReadOnlyList<MarketplaceMappingDto>? = null
}

@DataContract
open class MarketplaceListingDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var slug:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var vendor:String? = null

    @DataMember
    open var category:MarketplaceCategory? = null

    @DataMember
    open var transport:MarketplaceTransport? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var iconUrl:String? = null

    @DataMember
    open var documentationUrl:String? = null

    @DataMember
    open var isOfficial:Boolean? = null

    @DataMember
    open var functions:IReadOnlyList<MarketplaceFunctionDefinitionDto>? = null
}

@DataContract
open class MarketplaceFunctionDefinitionDto
{
    @DataMember
    open var functionKey:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var group:String? = null

    @DataMember
    open var parameters:IReadOnlyList<MarketplaceFunctionParameterDto>? = null
}

@DataContract
open class MarketplaceFunctionParameterDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    @SerializedName("type") open var Type:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var isRequired:Boolean? = null

    @DataMember
    open var defaultValue:String? = null
}

@DataContract
open class MarketplaceMappingDto
{
    @DataMember
    open var parameterName:String? = null

    @DataMember
    open var source:MarketplaceMappingSource? = null

    @DataMember
    open var defaultValue:String? = null

    @DataMember
    open var resolver:TokenMappingResolverType? = null

    @DataMember
    open var tokenKey:String? = null

    @DataMember
    open var fromRequestPath:String? = null

    @DataMember
    open var isRequired:Boolean? = null
}

@DataContract(Namespace="http://codemash.io/types/")
open class RequestBase : ICultureBasedRequest, IVersionBasedRequest, IHasCorrelationIdRequest
{
    /**
    * Specify culture code when your response from the API should be localised. E.g.: en
    */
    @DataMember
    @ApiMember(DataType="string", Description="Specify culture code when your response from the API should be localised. E.g.: en", Name="CultureCode", ParameterType="header")
    override var cultureCode:String? = null

    /**
    * TimeZone
    */
    @DataMember
    @ApiMember(DataType="string", Description="TimeZone", Name="TimeZoneId", ParameterType="header")
    open var timeZoneId:String? = null

    /**
    * The CodeMash API version used to fetch data from the API. If not specified, the last version will be used.  E.g.: v3
    */
    @DataMember
    @ApiMember(DataType="string", Description="The CodeMash API version used to fetch data from the API. If not specified, the last version will be used.  E.g.: v3", IsRequired=true, Name="version", ParameterType="path")
    override var version:String? = null

    /**
    * CorrelationId for each request
    */
    @DataMember
    @ApiMember(DataType="string", Description="CorrelationId for each request", Name="CorrelationId", ParameterType="header")
    override var correlationId:UUID? = null
}

interface ICultureBasedRequest
{
    var cultureCode:String?
}

interface IVersionBasedRequest
{
    var version:String?
}

interface IHasCorrelationIdRequest
{
    var correlationId:UUID?
}

enum class SubscriptionType
{
    ManagedService,
    License,
}

interface IHasAccountId
{
    var accountId:String?
}

open class CodeMashRequestBase : RequestBase(), IHasProjectId
{
    /**
    * ID of your project. Can be passed in a header as norbix-project-id.
    */
    @ApiMember(DataType="string", Description="ID of your project. Can be passed in a header as norbix-project-id.", IsRequired=true, Name="norbix-project-id", ParameterType="header")
    override var projectId:String? = null
}

interface IHasProjectId
{
    var projectId:String?
}

@DataContract
open class GroupDefinitionDto : TagDefinitionBaseDto()
{
}

enum class CommunicationChannel
{
    Transactional,
    Marketing,
    System,
}

@DataContract
open class TagDefinitionDto : TagDefinitionBaseDto()
{
    @DataMember
    open var defaultDelivery:HashMap<DeliveryChannel,Boolean> = HashMap<DeliveryChannel,Boolean>()
}

open class DatabaseIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:DatabaseProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

@DataContract
open class FileResourceDto
{
    @DataMember(Order=1)
    open var id:String? = null

    @DataMember(Order=2)
    open var originalFileName:String? = null

    @DataMember(Order=3)
    open var extension:String? = null

    @DataMember(Order=4)
    open var storedFileName:String? = null

    @DataMember(Order=5)
    open var sizeBytes:Long? = null

    @DataMember(Order=6)
    open var checksum:FileChecksumDto? = null
}

open class PagingArgs
{
    open var cursorArgs:CursorArgs? = null
    open var pageSize:Int? = null
    open var startingAfter:String? = null
    open var endingBefore:String? = null
}

open class EmailAddress
{
    open var address:String? = null
}

open class DisplayName
{
    open var value:String? = null
}

open class AccountId : AggregateId(), IHasDomainEntityId
{
}

open class UtcDateTime
{
}

open class ExpirationToken
{
    open var items:Long? = null
    open var unit:TimeUnit? = null
    open var value:Long? = null
}

open class CodeMashLicense : CodeMashManagedServiceSubscription()
{
    open var domain:DomainUrl? = null
    open var accountId:AccountId? = null
    open var isEnterprise:Boolean? = null
}

open class ProjectId : AggregateId(), IHasDomainEntityId
{
}

@DataContract
open class ProjectName
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var uniqueName:String? = null
}

open class IntegrationId : AggregateId(), IHasDomainEntityId
{
}

@DataContract
open class ProjectRegion
{
    @DataMember
    open var id:ProjectRegionId? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var continent:Continent? = null
}

open class DomainUrl
{
    open var value:Uri? = null
}

open class Language
{
    open var code:String? = null
    open var name:String? = null
}

open class ProjectLogo
{
    open var fileResource:FileResource? = null
    open var publicUrl:String? = null
}

open class ProjectIcon
{
    open var fileResource:FileResource? = null
    open var publicUrl:String? = null
}

@DataContract
open class BrandColor
{
    @DataMember
    open var value:String? = null
}

@DataContract
open class ProjectCommunication
{
    @DataMember
    open var channels:ArrayList<ProjectCommunicationChannel> = ArrayList<ProjectCommunicationChannel>()

    @DataMember
    open var groups:ArrayList<GroupDefinition> = ArrayList<GroupDefinition>()

    @DataMember
    open var tags:ArrayList<TagDefinition> = ArrayList<TagDefinition>()
}

@DataContract
open class TimeZone
{
    @DataMember
    open var zoneId:String? = null
}

open class GroupDefinition : BaseTagDefinition()
{
}

open class Tag
{
}

open class TagDefinition : BaseTagDefinition()
{
    open var defaultDelivery:HashMap<DeliveryChannel,Boolean> = HashMap<DeliveryChannel,Boolean>()
}

open class ExternalCustomerId
{
    open var id:String? = null
}

open class CodeMashManagedServiceSubscription
{
    open var subscriptionId:CodeMashSubscriptionId? = null
    open var refCustomerId:ExternalCustomerId? = null
    open var refSubscriptionId:String? = null
    open var issuedOn:UtcDateTime? = null
    open var willExpireOn:UtcDateTime? = null
    open var projectCap:Quantity? = null
    open var isTrial:Boolean? = null
}

enum class DeliveryChannel
{
    Email,
    Push,
    Sms,
    WebPush,
    InApp,
    ChatBot,
    ChatPlatform,
}

enum class TriggerType
{
    Membership,
    Schema,
    Files,
    Payments,
}

@DataContract
open class DeleteTrigger : CodeMashRequestBase()
{
    @DataMember
    open var triggerId:String? = null

    @DataMember
    open var triggerType:TriggerType? = null

    @DataMember
    open var schemaId:String? = null
}

@DataContract
open class DisableTrigger : CodeMashRequestBase()
{
    @DataMember
    open var triggerId:String? = null

    @DataMember
    open var triggerType:TriggerType? = null

    @DataMember
    open var schemaId:String? = null
}

@DataContract
open class EnableTrigger : CodeMashRequestBase()
{
    @DataMember
    open var triggerId:String? = null

    @DataMember
    open var triggerType:TriggerType? = null

    @DataMember
    open var schemaId:String? = null
}

open class GetTrigger : CodeMashRequestBase()
{
    open var id:String? = null
}

@DataContract
open class GetTriggers : CodeMashListPaginationRequestBase()
{
}

open class SaveTriggerRequest
{
    @SerializedName("type") open var Type:TriggerType? = null
    open var triggerId:String? = null
    open var name:String? = null
    open var description:String? = null
    open var isEnabled:Boolean? = null
    open var preExecuteCode:String? = null
    open var action:TriggerActionDto? = null
}

@DataContract
open class SaveTrigger : CodeMashRequestBase()
{
    @DataMember
    open var trigger:SaveTriggerRequest? = null
}

open class CodeMashListPaginationRequestBase : RequestBase(), IHasProjectId
{
    /**
    * ID of your project. Can be passed in a header as norbix-project-id.
    */
    @DataMember
    @ApiMember(DataType="string", Description="ID of your project. Can be passed in a header as norbix-project-id.", IsRequired=true, Name="norbix-project-id", ParameterType="header")
    override var projectId:String? = null

    /**
    * Paging
    */
    @DataMember
    @ApiMember(DataType="object", Description="Paging", IsRequired=true, Name="paging", ParameterType="body")
    open var paging:PagingArgs? = null
}

open class MembershipIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:MembershipProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class MembershipIntegration : Integration()
{
    open var provider:MembershipProvider? = null
}

open class RoleName
{
    open var name:String? = null
    open var displayName:String? = null
    @Ignore()
    open var isAdministrator:Boolean? = null

    @Ignore()
    open var isAuthenticated:Boolean? = null

    @Ignore()
    open var isGuest:Boolean? = null

    @Ignore()
    open var isRootRole:Boolean? = null

    @Ignore()
    open var isCollaboratorRole:Boolean? = null

    @Ignore()
    open var isSystemRole:Boolean? = null
}

open class MembershipPolicy
{
    open var id:PolicyId? = null
    open var name:DisplayName? = null
    open var description:String? = null
    open var statements:ArrayList<PolicyStatement> = ArrayList<PolicyStatement>()
    open var disabled:Boolean? = null
    open var isSystem:Boolean? = null
}

open class PolicyId
{
    open var template:UUID? = null
    open var tenancyScopeViewId:String? = null
    open var viewId:String? = null
    open var isSystem:Boolean? = null
}

open class MembershipRole
{
    open var id:RoleId? = null
    open var name:DisplayName? = null
    open var description:String? = null
    open var attachedPolicies:ArrayList<PolicyId> = ArrayList<PolicyId>()
    open var disabled:Boolean? = null
    open var isSystem:Boolean? = null
}

open class RoleId
{
    open var template:UUID? = null
    open var tenancyScopeViewId:String? = null
    open var viewId:String? = null
    open var isSystem:Boolean? = null
}

open class MembershipTrigger : Trigger()
{
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

open class TriggerId : AggregateId(), IHasDomainEntityId
{
}

open class TriggerByIdEventBase
{
    open var triggerId:TriggerId? = null
}

open class SchemaSettingsDto
{
    @DataMember
    open var softDelete:Boolean? = null
}

open class MongoDbAggregate
{
    open var id:MongoDbAggregateId? = null
    open var displayName:DisplayName? = null
    open var description:String? = null
    open var query:MongoDbAggregateQuery? = null
    open var schemaId:SchemaId? = null
}

open class SchemaId : AggregateId(), IHasDomainEntityId
{
}

open class MongoDbAggregateId : AggregateId(), IHasDomainEntityId
{
}

open class DatabaseIntegration : Integration()
{
    open var provider:DatabaseProvider? = null
}

open class Schema : IHasDomainEntityId
{
    open var schemaName:SchemaName? = null
    open var id:SchemaId? = null
    open var draft:SchemaDraft? = null
    open var publishedVersions:IReadOnlyList<PublishedSchemaVersion>? = null
    open var triggers:ArrayList<Trigger>? = null
    open var settings:SchemaSettings? = null
}

open class SchemaDraft
{
    open var dataSchema:DataSchema? = null
    open var visualSchema:VisualSchema? = null
    open var updatedAt:Date? = null
}

open class PublishedSchemaVersion
{
    open var version:SchemaVersion? = null
    open var dataSchema:DataSchema? = null
    open var visualSchema:VisualSchema? = null
    open var metaSchemaVersion:MetaSchemaVersion? = null
    open var publishedAt:Date? = null
}

open class SchemaDiff
{
    open var addedFields:IReadOnlyList<String>? = null
    open var removedFields:IReadOnlyList<String>? = null
    open var typeChangedFields:IReadOnlyList<String>? = null
    open var validatorTightenedFields:IReadOnlyList<String>? = null
    open var isEmpty:Boolean? = null
}

open class SchemaSettings
{
    open var softDelete:Boolean? = null
}

open class SchemaName
{
    open var value:String? = null
    open var title:String? = null
}

open class Taxonomy : IHasDomainEntityId
{
    open var parentId:TaxonomyId? = null
    open var id:TaxonomyId? = null
    open var name:TaxonomyName? = null
    open var description:String? = null
    open var termsMetaVisualSchema:VisualSchema? = null
    open var termsMetaDataSchema:DataSchema? = null
    open var dependencies:ArrayList<TaxonomyId>? = null
    open var recordId:RecordId? = null
}

open class TaxonomyId : AggregateId(), IHasDomainEntityId
{
}

open class SchemaTrigger : Trigger()
{
    open var schemaId:SchemaId? = null
    @SerializedName("when") open var When:SchemaTriggerType? = null
    open var configuration:TemplateCode? = null
}

open class FilesIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:FileProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

@DataContract
open class FileResourceRefDto
{
    @DataMember(Order=1)
    open var resource:FileResourceDto? = null

    @DataMember(Order=2)
    open var integrationId:String? = null

    @DataMember(Order=3)
    open var provider:FileProvider? = null

    @DataMember(Order=4)
    open var path:String? = null
}

@DataContract
open class EmailMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:EmailMessageContentDto? = null

    @DataMember
    open var staticAttachments:IReadOnlySet<FileResourceRefDto>? = null
}

open class SaveEmailTemplate : CodeMashRequestBase()
{
    open var templateName:String? = null
    open var description:String? = null
    open var communicationChannel:CommunicationChannel? = null
    open var tags:ArrayList<String>? = null
    @DataMember
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null

    open var translations:ArrayList<EmailMessageTranslationDto> = ArrayList<EmailMessageTranslationDto>()
}

@DataContract
open class TokenMappingDto
{
    @DataMember
    open var key:String? = null

    @DataMember
    open var value:String? = null

    @DataMember
    open var resolver:TokenMappingResolverType? = null
}

@DataContract
open class TranslationDto
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:String? = null
}

open class EmailIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:EmailProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
    open var emailAddress:String? = null
    open var emailSenderName:String? = null
}

open class EmailCampaignRequest
{
    open var source:EmailCampaignRecipientsSourceTypes? = null
    open var templateId:String? = null
    open var integrationId:String? = null
    open var language:String? = null
    open var initiatorId:String? = null
    open var notes:String? = null
    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null

    @DataMember
    open var campaignTime:Long? = null
}

open class EmailFooterId
{
    open var value:UUID? = null
}

@DataContract
open class MessageTranslation<TContent>
{
}

open class EmailIntegration : Integration()
{
    open var provider:EmailProvider? = null
    open var emailAddress:EmailAddress? = null
    open var emailSenderName:EmailSenderName? = null
}

open class EmailSignatureId
{
    open var value:UUID? = null
}

open class TemplateId
{
    open var value:UUID? = null
}

@DataContract
open class FileResourceRef
{
    @DataMember(Order=1)
    open var resource:FileResource? = null

    @DataMember(Order=2)
    open var integrationId:IntegrationId? = null

    @DataMember(Order=3)
    open var provider:FileProvider? = null

    @DataMember(Order=4)
    open var path:String? = null
}

open class CodeIntegration : Integration()
{
    open var provider:CodeProvider? = null
}

open class MarketplaceIntegration : Integration()
{
    override var capability:String? = null
    open var listingViewId:String? = null
    open var transport:MarketplaceIntegrationTransport? = null
    open var vendor:String? = null
    open var category:MarketplaceIntegrationCategory? = null
    open var description:String? = null
    open var config:IReadOnlyDictionary<String, String>? = null
}

open class MarketplaceFunctionBinding : IHasDomainEntityId
{
    open var bindingId:UUID? = null
    open var integrationId:IntegrationId? = null
    open var functionKey:String? = null
    open var displayName:DisplayName? = null
    open var description:String? = null
    open var isEnabled:Boolean? = null
    open var mappings:IReadOnlyList<MarketplaceFunctionMapping>? = null
    override var viewId:String? = null
}

@DataContract
open class PushMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:PushMessageContentDto? = null
}

open class SavePushTemplate : CodeMashRequestBase()
{
    open var templateName:String? = null
    open var description:String? = null
    open var communicationChannel:CommunicationChannel? = null
    open var tags:ArrayList<String>? = null
    open var translations:ArrayList<PushMessageTranslationDto> = ArrayList<PushMessageTranslationDto>()
}

open class PushIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:PushProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

interface IHasAccountId
{
    var accountId:String?
}

@DataContract
open class PushDeviceDto
{
    @DataMember
    open var deviceId:String? = null

    @DataMember
    open var deviceOs:String? = null

    @DataMember
    open var token:String? = null

    @DataMember
    open var brand:String? = null

    @DataMember
    open var manufacturer:String? = null

    @DataMember
    open var modelName:String? = null

    @DataMember
    open var deviceName:String? = null

    @DataMember
    open var deviceType:DeviceType? = null

    @DataMember
    open var osName:String? = null

    @DataMember
    open var osVersion:String? = null

    @DataMember
    open var platformApiLevel:Int? = null
}

open class PushIntegration : Integration()
{
    open var provider:PushProvider? = null
}

@DataContract
open class PushTemplate : Template<PushMessageContent>()
{
}

open class PaymentIntegrationRequest
{
    open var integrationId:String? = null
    open var gatewayPlatform:PaymentGatewayPlatform? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class LoggingIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:LoggingProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class LoggingIntegration : Integration()
{
    open var provider:LoggingProvider? = null
}

open class LlmIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:LlmProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
    open var endpoint:String? = null
    open var defaultModel:String? = null
}

open class McpIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:McpProvider? = null
    open var transport:McpTransport? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
    open var name:String? = null
    open var category:String? = null
    open var description:String? = null
    open var icon:String? = null
}

open class WebhookIntegration : Integration()
{
    override var capability:String? = null
    open var destinations:IReadOnlySet<WebhookDestination>? = null
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null
}

open class WebhookDestination
{
    open var destinationId:WebhookDestinationId? = null
    open var destinationName:DisplayName? = null
    open var endpointUrl:DomainUrl? = null
    open var selectedEvents:IReadOnlySet<TriggerEventName>? = null
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null
    open var isEnabled:Boolean? = null
}

open class WebhookDestinationId : AggregateId(), IHasDomainEntityId
{
}

enum class SchedulerTaskType
{
    EmailCampaign,
    PushCampaign,
    SmsCampaign,
    CodeFunctionalCall,
    WebhookCall,
}

open class SchedulerTaskRequest
{
    @SerializedName("type") open var Type:SchedulerTaskType? = null
}

open class SchedulerTask : IHasDomainEntityId
{
    open var id:TaskId? = null
    @SerializedName("type") open var Type:SchedulerTaskType? = null
    open var name:DisplayName? = null
    open var description:String? = null
    open var cron:CronExpression? = null
    open var payloadJson:String? = null
    open var initiatorId:UserId? = null
    open var isEnabled:Boolean? = null
    open var stopOnError:Boolean? = null
}

open class TaskId : AggregateId()
{
}

@DataContract
enum class CodeMashRelease
{
    NotSet,
    Community,
    ManagedService,
    Enterprise,
}

enum class CodeMashRuntime
{
    Development,
    Ci,
    Production,
}

@DataContract
open class CodeMashLicenseFromEndpointDto
{
    @DataMember(Name="domain")
    @SerializedName("domain")
    open var domainFromLicense:String? = null

    @DataMember(Name="accountId")
    @SerializedName("accountId")
    open var accountIdFromLicense:String? = null

    @DataMember(Name="refCustomerId")
    @SerializedName("refCustomerId")
    open var refCustomerId:String? = null

    @DataMember(Name="refSubscriptionId")
    @SerializedName("refSubscriptionId")
    open var refSubscriptionId:String? = null

    @DataMember(Name="issued")
    @SerializedName("issued")
    open var issued:Long? = null

    @DataMember(Name="expire")
    @SerializedName("expire")
    open var expire:Long? = null

    @DataMember(Name="cap")
    @SerializedName("cap")
    open var projectsCapFromLicense:Int? = null

    @DataMember(Name="isTrial")
    @SerializedName("isTrial")
    open var isTrial:Boolean? = null

    @DataMember(Name="release")
    @SerializedName("release")
    open var codeMashRelease:String? = null
}

@DataContract
open class AccountOwnerDto
{
    @DataMember
    open var email:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var billingEmail:String? = null

    @DataMember
    open var operationsEmail:String? = null

    @DataMember
    open var securityEmail:String? = null
}

open class CodeMashResponseStatus
{
    open var isSuccess:Boolean? = null
    open var errors:ArrayList<ErrorDto>? = null
}

open class ResponseBase
{
    open var responseStatus:CodeMashResponseStatus? = null
}

@DataContract
open class AccountStatusDto
{
    @DataMember
    open var accountId:String? = null

    @DataMember
    open var accountIdAsGuid:UUID? = null

    @DataMember
    open var userId:String? = null

    @DataMember
    open var loggedInUserId:String? = null

    @DataMember
    open var loggedInUserEmail:String? = null

    @DataMember
    open var status:AccountStatus? = null

    @DataMember
    open var projectCap:Int? = null

    @DataMember
    open var permissions:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var roles:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var allowedProjects:ArrayList<String>? = null

    @DataMember
    open var trialWasIssued:Boolean? = null
}

@DataContract
open class ProjectDto : IHasViewId, IBindableContract
{
    @DataMember
    open var accountViewId:String? = null

    @DataMember
    open var projectStatus:ProjectStatus? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    override var viewId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var uniqueName:String? = null

    @DataMember
    open var hostLabel:String? = null

    @DataMember
    open var apiHost:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var marketingUrl:String? = null

    @DataMember
    open var defaultLanguage:String? = null

    @DataMember
    open var languages:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var regions:ArrayList<ProjectRegionDto>? = null

    @DataMember
    open var brand:ProjectBrandDto? = null

    @DataMember
    open var notificationSettings:NotificationSettingsDto? = null

    @DataMember
    open var allowedOrigins:ArrayList<String>? = null

    @DataMember
    open var database:DatabaseDto? = null

    @DataMember
    open var email:EmailDto? = null

    @DataMember
    open var ai:AiDto? = null

    @DataMember
    open var membership:MembershipDto? = null

    @DataMember
    open var logging:LoggingDto? = null

    @DataMember
    open var serverEvents:ServerEventsDto? = null

    @DataMember
    open var push:PushDto? = null

    @DataMember
    open var scheduler:SchedulerDto? = null

    @DataMember
    open var code:CodeDto? = null

    @DataMember
    open var files:FilesDto? = null

    @DataMember
    open var payments:PaymentsDto? = null

    @DataMember
    open var sms:SmsDto? = null

    @DataMember
    open var databaseEnabled:Boolean? = null

    @DataMember
    open var emailEnabled:Boolean? = null

    @DataMember
    open var membershipEnabled:Boolean? = null

    @DataMember
    open var loggingEnabled:Boolean? = null

    @DataMember
    open var serverEventsEnabled:Boolean? = null

    @DataMember
    open var pushEnabled:Boolean? = null

    @DataMember
    open var schedulerEnabled:Boolean? = null

    @DataMember
    open var codeEnabled:Boolean? = null

    @DataMember
    open var filesEnabled:Boolean? = null

    @DataMember
    open var paymentsEnabled:Boolean? = null

    @DataMember
    open var smsEnabled:Boolean? = null

    @DataMember
    open var defaultFilesIntegrationViewId:String? = null

    @DataMember
    open var defaultDatabaseIntegrationViewId:String? = null

    @DataMember
    open var defaultEmailIntegrationViewId:String? = null

    @DataMember
    open var defaultLlmIntegrationViewId:String? = null

    @DataMember
    open var defaultPushIntegrationViewId:String? = null

    @DataMember
    open var defaultSmsIntegrationViewId:String? = null

    @DataMember
    open var connections:Int? = null
}

@DataContract
open class ProjectListItemDto
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var uniqueName:String? = null

    @DataMember
    open var regions:ArrayList<ProjectRegionDto>? = null
}

open class ProjectRegionDto
{
    open var id:String? = null
    open var continent:Continent? = null
    open var name:String? = null
}

open class PaginatedResponse<TViewModelProjection>
{
    open var items:IList<TViewModelProjection>? = null
    open var hasMore:Boolean? = null
    open var hasPrevious:Boolean? = null
    open var startingAfter:String? = null
    open var endingBefore:String? = null
}

open class UserDto : IBindableContract
{
    open var id:String? = null
    @SerializedName("type") open var Type:UserType? = null
    open var email:String? = null
    open var userName:String? = null
    open var registration:RegistrationDto? = null
    open var login:LoginDto? = null
    open var generalInfo:UserGeneralInfoDto? = null
    open var roles:IReadOnlySet<String>? = null
    open var pushDevices:IReadOnlySet<String>? = null
    open var tags:IReadOnlySet<String>? = null
    open var status:UserStatus? = null
    open var createdOn:Date? = null
    open var modifiedOn:Date? = null
}

open class LicenseDto : CodeMashSubscriptionDto()
{
    open var isEnterprise:Boolean? = null
    open var projectCap:Int? = null
}

@DataContract
open class TriggerDto : IHasViewId
{
    @DataMember
    @SerializedName("type") open var Type:TriggerType? = null

    @DataMember
    override var viewId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var thenAction:TriggerActionDto? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var activationCode:String? = null
}

open class GetTriggerResponse : ResponseBase()
{
    open var trigger:TriggerDto? = null
}

@DataContract
open class MembershipTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:MembershipTriggerType? = null
}

@DataContract
open class GetTriggersResponse : ResponseBase()
{
}

open class RoleItemDto
{
    open var id:String? = null
    open var name:String? = null
    open var displayName:String? = null
    open var description:String? = null
    open var isSystem:Boolean? = null
    open var attachedPolicies:ArrayList<String>? = null
}

open class RoleListProjectionDto
{
    open var viewId:String? = null
    open var name:String? = null
    open var displayName:String? = null
    open var isSystem:Boolean? = null
    open var policyCount:Int? = null
}

open class PolicyItemDto
{
    open var id:String? = null
    open var name:String? = null
    open var description:String? = null
    open var isSystem:Boolean? = null
    open var statements:ArrayList<PolicyStatementDto>? = null
}

open class MembershipIntegrationDto : IntegrationDto()
{
    open var provider:MembershipProvider? = null
}

open class MembershipIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:MembershipProvider? = null
}

@DataContract
open class SchemaTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:SchemaTriggerType? = null
}

open class TaxonomyDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var slug:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var termsMetaDataSchema:DataSchemaDto? = null

    @DataMember
    open var termsMetaVisualSchema:VisualSchemaDto? = null

    @DataMember
    open var dependencies:ArrayList<String>? = null
}

open class TaxonomyListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var taxonomyName:String? = null

    @DataMember
    open var taxonomySlug:String? = null

    @DataMember
    open var parentId:String? = null
}

open class TermDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var taxonomyName:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var order:Int? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var names:HashMap<String,String>? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var descriptions:HashMap<String,String>? = null

    @DataMember
    open var multiParents:ArrayList<TermMultiParentDto>? = null

    @DataMember
    open var meta:Object? = null
}

open class SchemaDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var schemaSlug:String? = null

    @DataMember
    open var version:Int? = null

    @DataMember
    open var metaSchemaVersion:Int? = null

    @DataMember
    open var dataSchema:DataSchemaDto? = null

    @DataMember
    open var visualSchema:VisualSchemaDto? = null

    @DataMember
    open var publishedAt:Date? = null

    @DataMember
    open var settings:SchemaSettingsDto? = null

    @DataMember
    open var triggers:ArrayList<TriggerDto>? = null
}

open class SchemaListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var schemaTitle:String? = null

    @DataMember
    open var latestVersion:Int? = null

    @DataMember
    open var hasDraft:Boolean? = null

    @DataMember
    open var metaSchemaVersion:Int? = null
}

open class SchemaDraftDto
{
    @DataMember
    open var dataSchema:DataSchemaDto? = null

    @DataMember
    open var visualSchema:VisualSchemaDto? = null

    @DataMember
    open var updatedAt:Date? = null
}

open class SchemaDiffDto
{
    @DataMember
    open var fromVersion:Int? = null

    @DataMember
    open var toVersion:Int? = null

    @DataMember
    open var added:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var removed:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var typeChanged:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var validatorTightened:ArrayList<String> = ArrayList<String>()
}

open class SchemaVersionSummaryDto
{
    @DataMember
    open var version:Int? = null

    @DataMember
    open var metaSchemaVersion:Int? = null

    @DataMember
    open var publishedAt:Date? = null
}

open class DatabaseIntegrationDto : IntegrationDto()
{
    open var provider:DatabaseProvider? = null
}

open class DatabaseIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:DatabaseProvider? = null
}

open class MongoDbAggregateListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var schemaViewId:String? = null
}

@DataContract
open class FilesTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:FilesTriggerType? = null
}

open class FilesIntegrationDto : IntegrationDto()
{
    open var provider:FileProvider? = null
}

open class FilesIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:FileProvider? = null
}

@DataContract
open class TemplateListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var templateName:String? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    @SerializedName("type") open var Type:CommunicationChannel? = null

    @DataMember
    open var tags:ArrayList<String>? = null
}

@DataContract
open class HtmlFromMjmlResponse
{
    @DataMember(Name="html")
    @SerializedName("html")
    open var html:String? = null

    @DataMember(Name="errors")
    @SerializedName("errors")
    open var errors:ArrayList<MjmlParseError> = ArrayList<MjmlParseError>()
}

open class SystemEmailTemplateListProjection : EmailTemplateListProjection()
{
}

@DataContract
open class EmailSignatureDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var translations:ArrayList<TranslationDto> = ArrayList<TranslationDto>()
}

@DataContract
open class ListItemWithTranslationsProjection : ListItemProjection()
{
    @DataMember
    open var translations:ArrayList<String> = ArrayList<String>()
}

open class EmailSettings : IBindableContract
{
    open var signatures:IList<ListItemWithTranslationsProjection>? = null
    open var footers:IList<ListItemWithTranslationsProjection>? = null
}

open class EmailIntegrationDto : IntegrationDto()
{
    open var provider:EmailProvider? = null
    open var emailAddress:String? = null
    open var emailSenderName:String? = null
}

open class EmailIntegrationListProjection : IntegrationListProjection()
{
    open var emailProvider:EmailProvider? = null
    open var senderEmailAddress:String? = null
    open var senderDisplayName:String? = null
}

@DataContract
open class IntegrationTestResultItemDto
{
    @DataMember
    open var operation:String? = null

    @DataMember
    open var result:String? = null

    @DataMember
    open var errors:IReadOnlyList<String>? = null
}

@DataContract
open class EmailFooterDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var translations:ArrayList<TranslationDto> = ArrayList<TranslationDto>()
}

@DataContract
open class EmailCampaignDto : CampaignDto()
{
    @DataMember
    open var deliverySettings:EmailCampaignDeliverySettingsDto? = null

    @DataMember
    open var template:EmailTemplateDto? = null

    @DataMember
    open var templateIsSystem:Boolean? = null
}

@DataContract
open class EmailCampaignListProjection
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var templateName:String? = null

    @DataMember
    open var templateId:String? = null

    @DataMember
    open var integrationId:String? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var strategy:String? = null

    @DataMember
    open var latestStatus:CampaignStatus? = null

    @DataMember
    open var createdOn:Date? = null
}

@DataContract
open class EmailCampaignBatchDto : CampaignBatchDto()
{
    @DataMember
    open var recipients:EmailRecipientsDto? = null
}

@DataContract
open class EmailCampaignBatchNotificationDto : CampaignBatchNotificationDto()
{
    @DataMember
    open var recipients:EmailRecipientsDto? = null

    @DataMember
    open var content:EmailMessageContentDto? = null
}

open class BatchStatusChangeEntryDto
{
    open var time:Date? = null
    open var status:CampaignBatchStatus? = null
    open var errors:IReadOnlySet<ErrorDto>? = null
}

@DataContract
open class CampaignStatsDto
{
    @DataMember
    open var batches:Int? = null

    @DataMember
    open var sent:Int? = null

    @DataMember
    open var failed:Int? = null

    @DataMember
    open var successRate:BigDecimal? = null
}

@DataContract
open class PushTemplateListProjection : TemplateListProjection()
{
}

open class PushIntegrationDto : IntegrationDto()
{
    open var provider:PushProvider? = null
}

open class PushIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:PushProvider? = null
}

@DataContract
open class PaymentTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:PaymentTriggerType? = null
}

open class PaymentsIntegrationDto : IntegrationDto()
{
    open var gatewayPlatform:PaymentGatewayPlatform? = null
}

open class PaymentsIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var gatewayPlatform:PaymentGatewayPlatform? = null
}

open class LoggingIntegrationDto : IntegrationDto()
{
    open var provider:LoggingProvider? = null
}

open class LoggingIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:LoggingProvider? = null
}

open class LlmIntegrationDto : IntegrationDto()
{
    open var provider:LlmProvider? = null
    open var baseUrl:String? = null
    open var defaultModel:String? = null
    open var isConfigured:Boolean? = null
    open var isSystemOwned:Boolean? = null
}

open class LlmIntegrationListProjection : IntegrationListProjection()
{
    open var llmProvider:LlmProvider? = null
    open var baseUrl:String? = null
    open var defaultModel:String? = null
}

open class McpIntegrationDto : IntegrationDto()
{
    open var provider:McpProvider? = null
    open var transport:McpTransport? = null
    open var metadata:McpMetadata? = null
    open var isConfigured:Boolean? = null
    open var isSystemOwned:Boolean? = null
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var serverUrl:String? = null
    open var auth:McpAuth? = null
}

open class McpIntegrationListProjection : IntegrationListProjection()
{
    open var mcpProvider:McpProvider? = null
    open var transport:McpTransport? = null
    open var category:String? = null
    open var description:String? = null
    open var icon:String? = null
}

@DataContract
open class SchedulerTaskListProjection : IHasViewId
{
    @DataMember
    open var taskId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var cron:String? = null

    @DataMember
    @SerializedName("type") open var Type:SchedulerTaskType? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    override var viewId:String? = null
}

@DataContract
open class UserApiKey
{
    @DataMember(Order=1)
    open var key:String? = null

    @DataMember(Order=2)
    open var keyType:String? = null

    @DataMember(Order=3)
    open var expiryDate:Date? = null

    @DataMember(Order=4)
    open var meta:HashMap<String,String>? = null
}

enum class SmtpPorts(val value:Int)
{
    Default(25),
    Ssl(465),
    Tls(587),
    Fallback(2525),
}

enum class AwsIntegrationType
{
    Iam,
    CrossAccountRole,
}

enum class CollectionEmailCampaignRecipientField
{
    User,
    Email,
}

enum class MembershipTriggerType
{
    OnRegistered,
    OnInvited,
    OnVerified,
    OnUpdated,
    OnDeleted,
    OnBlocked,
    OnReactivated,
}

@DataContract
open class TriggerActionDto
{
    @DataMember
    @SerializedName("type") open var Type:TriggerActionType? = null

    @DataMember
    open var integrationId:String? = null
}

enum class SchemaTriggerType
{
    OnInserted,
    OnDeleted,
    OnUpdated,
}

enum class FilesTriggerType
{
    OnFileUploaded,
    OnFileDeleted,
}

enum class PaymentTriggerType
{
    OnOrderCreated,
    OnOrderPaid,
    OnWebhookCallReceived,
}

enum class AwsS3IntegrationType
{
    Iam,
    CrossAccountRole,
}

enum class AwsS3LoggingIntegrationType
{
    Iam,
    CrossAccountRole,
}

open class OAuthModeConfig
{
    open var name:DisplayName? = null
    open var callbackUrl:Uri? = null
    open var logoutUrl:Uri? = null
    open var failureRedirectUrl:Uri? = null
    open var roleName:RoleName? = null
}

enum class AwsLambdaIntegrationType
{
    Iam,
    CrossAccountRole,
}

open class CodeIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:CodeProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

interface ILlmApiKeyRequest
{
    var apiKey:String?
}

@DataContract
open class TemplateDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var templateName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var communicationChannel:CommunicationChannel? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    open var tags:ArrayList<String>? = null
}

interface IHasViewId
{
    var viewId:String?
}

interface IBindableContract
{
}

interface IHasRazorTemplateCode
{
}

@DataContract
open class SmsMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:SmsMessageContentDto? = null
}

enum class SystemEmailTemplateTheme
{
    Text,
    Branded,
    Creative,
}

interface IHasDatabaseId
{
    var id:String?
}

open class EmailCampaignDeliverySettingsDto
{
    @DataMember
    open var recipientsSourceType:EmailCampaignRecipientsSourceTypes? = null

    @DataMember
    open var mappedTokens:IReadOnlySet<TokenMappingDto>? = null

    @DataMember
    open var campaignTime:Long? = null

    @DataMember
    open var respectTimeZoneSettings:RespectTimeZoneSettings? = null
}

enum class TriggerActionType
{
    Code,
    Push,
    Sms,
    Email,
    WebhookCall,
}

@DataContract
open class PushCampaignDeliverySettingsDto
{
    @DataMember
    open var recipientsSourceType:PushCampaignRecipientsSourceTypes? = null

    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null

    @DataMember
    open var campaignTime:Long? = null

    @DataMember
    open var respectTimeZoneSettings:RespectTimeZoneSettings? = null
}

@DataContract
open class CodeDeliverySettingsDto
{
    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null
}

@DataContract
open class WebhookDeliverySettingsDto
{
    @DataMember
    open var eventName:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var includeRawPayload:Boolean? = null

    @DataMember
    open var mappedTokens:IReadOnlySet<TokenMappingDto>? = null
}

enum class EmailCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    Email,
    Collection,
}

@Flags()
enum class RespectTimeZoneSettings(val value:Int)
{
    @SerializedName("1") RespectToLastLoginZone(1),
    @SerializedName("2") RespectToRegistrationZone(2),
    @SerializedName("4") RespectToRegistrationProjectZone(4),
}

enum class PushCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    Collection,
    Devices,
}

@DataContract
open class PushDeviceDeliveryTokenDto
{
}

enum class SmsCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    PhoneNumbers,
    Collection,
}

@DataContract
open class SmsCampaignDeliverySettingsDto
{
    @DataMember
    open var recipientsSourceType:SmsCampaignRecipientsSourceTypes? = null

    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null

    @DataMember
    open var campaignTime:Long? = null

    @DataMember
    open var respectTimeZoneSettings:RespectTimeZoneSettings? = null
}

enum class LlmProvider
{
    OpenAI,
    Anthropic,
    Ollama,
    Groq,
    Google,
    Mistral,
    OpenRouter,
    Grok,
}

enum class McpProvider
{
    Docker,
    Obsidian,
    GoogleCalendar,
}

enum class McpTransport
{
    Sse,
    HttpStream,
    Stdio,
}

open class McpMetadata
{
    open var name:String? = null
    open var category:String? = null
    open var description:String? = null
    open var icon:String? = null
}

enum class McpAuth
{
    OAuth2,
    ApiKey,
    None,
}

enum class CodeProvider
{
    AwsLambda,
    AzureFunctions,
    GoogleCloudFunctions,
    Pipedream,
    Zapier,
    CloudflareWorkers,
    Vercel,
    Netlify,
    SupabaseEdge,
    Modal,
}

open class CodeIntegrationDto : IntegrationDto()
{
    open var provider:CodeProvider? = null
}

enum class PaymentGatewayPlatform
{
    Stripe,
    Adyen,
    Paddle,
    LemonSqueezy,
    AppleInApp,
    GoogleInApp,
    Shopify,
    WooCommerce,
    Magento,
    PayPal,
    Braintree,
    AuthorizeNet,
    CheckOutCom,
    Mollie,
    Worldpay,
}

enum class MembershipProvider
{
    AppleSignIn,
    GoogleSignIn,
    Google,
    Facebook,
    X,
    GitHub,
    LinkedIn,
    Okta,
    Microsoft,
}

enum class LoggingProvider
{
    Console,
    DataDog,
    Kafka,
    Zabbix,
    MicrosoftTeams,
    Slack,
    Telegram,
    Amqp,
    NewRelic,
    Prometheus,
    AzureOTel,
    Splunk,
    ElasticSearch,
    Kibana,
    LocalFile,
    AwsS3,
    AwsKinesis,
    MongoDB,
    InternalKafka,
}

enum class FileProvider
{
    Local,
    AwsS3,
    AzureBlobStorage,
    GoogleCloudStorage,
    Ftp,
    AppleICloud,
    DropBox,
    GoogleDrive,
}

enum class DatabaseProvider
{
    CodeMashMongoDbAtlasCluster,
    CodeMashMongoDbAtlasServerless,
    MongoDbConnectionString,
}

enum class SmsProvider
{
    Twilio,
    Vonage,
    Plivo,
    Telnyx,
    Bird,
    Telesign,
    Sinch,
}

open class SmsIntegrationDto : IntegrationDto()
{
    open var provider:SmsProvider? = null
}

@DataContract
enum class PushProvider
{
    AppleApns,
    SafariWeb,
    SafariPush,
    AndroidFirebase,
    ChromeWeb,
    FirefoxWeb,
    EdgeWeb,
    ChromePush,
    CodeMashIosApp,
    CodeMashAndroidApp,
    CodeMashSafariPlugin,
    CodeMashSafariWeb,
    CodeMashChromePlugin,
    CodeMashChromeWeb,
    Expo,
}

@DataContract
enum class EmailProvider
{
    Smtp,
    SendGrid,
    MailGun,
    AwsSes,
}

open class AwsSesEmailIntegrationDto : EmailIntegrationDto()
{
    open var region:String? = null
    open var identityArn:String? = null
    open var configurationSetName:String? = null
}

open class IntegrationDto : IHasViewId
{
    override var viewId:String? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
    open var lastIntegrationTestAtUtc:Date? = null
    open var lastIntegrationTestSucceeded:Boolean? = null
    open var lastIntegrationTestErrors:IReadOnlyList<String>? = null
    open var humanDeliveryConfirmedAtUtc:Date? = null
    open var requiresHumanDeliveryConfirmation:Boolean? = null
}

enum class MarketplaceTransport
{
    Mcp,
    Rest,
    Code,
}

enum class MarketplaceCategory
{
    Other,
    Crm,
    Erp,
    Marketing,
    Communication,
    Productivity,
    Storage,
    Analytics,
    Identity,
    Payments,
    DevTools,
    Ai,
    Files,
    Database,
    Calendar,
}

enum class MarketplaceMappingSource
{
    Default,
    Resolver,
    FromRequest,
}

enum class TokenMappingResolverType
{
    NotSet,
    Custom,
    Project,
    ProjectSocials,
    Initiator,
    Recipient,
    SchemaRecord,
    TargetUser,
    TagDefinitions,
    EmailSignatures,
    Campaign,
    Template,
    EmailFooters,
    Old,
    New,
}

@DataContract
open class TagTranslationDto
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:TagDescriptionDto? = null
}

@DataContract
open class TagDefinitionBaseDto
{
    @DataMember
    open var tag:String? = null

    @DataMember
    open var translations:ArrayList<TagTranslationDto> = ArrayList<TagTranslationDto>()
}

@DataContract
open class FileChecksumDto
{
    @DataMember(Order=1)
    open var algorithm:String? = null

    @DataMember(Order=2)
    open var hash:String? = null
}

open class CursorArgs : ICursorArgs
{
    override var field:String? = null
    override var order:Int? = null
}

open class AggregateId
{
    open var value:UUID? = null
}

interface IHasDomainEntityId
{
    var viewId:String?
}

enum class TimeUnit
{
    Ticks,
    Milliseconds,
    Seconds,
    Minutes,
    Hours,
}

open class CodeMashSubscriptionId : AggregateId()
{
}

open class Quantity
{
    open var value:Int? = null
}

open class ProjectRegionId
{
    open var value:String? = null
}

enum class Continent
{
    Africa,
    Antarctica,
    Asia,
    Europe,
    NorthAmerica,
    Oceania,
    SouthAmerica,
}

@DataContract
open class FileResource
{
    @DataMember
    open var id:FileResourceId? = null

    @DataMember
    open var originalFileName:String? = null

    @DataMember
    open var extension:String? = null

    @DataMember
    open var sizeBytes:Long? = null

    @DataMember
    open var checksum:FileChecksum? = null

    @DataMember
    open var storedFileName:String? = null
}

@DataContract
open class ProjectCommunicationChannel
{
    @DataMember
    open var channel:CommunicationChannel? = null

    @DataMember
    open var groups:ArrayList<GroupTags> = ArrayList<GroupTags>()
}

open class TagTranslation : MessageTranslation<TagDescription>()
{
}

open class BaseTagDefinition
{
    open var tag:Tag? = null
    open var translations:ArrayList<TagTranslation> = ArrayList<TagTranslation>()
}

open class Integration : IIntegrationIdentification, IHasDomainEntityId
{
    override var integrationId:IntegrationId? = null
    override var capability:String? = null
    override var isSystemOwned:Boolean? = null
    open var integrationName:DisplayName? = null
    open var isEnabled:Boolean? = null
    open var isConfigured:Boolean? = null
    open var lastIntegrationTestAtUtc:Date? = null
    open var lastIntegrationTestSucceeded:Boolean? = null
    open var lastIntegrationTestErrorMessages:IReadOnlyList<String>? = null
    open var humanDeliveryConfirmedAtUtc:Date? = null
    open var isApprovedThatItWorks:Boolean? = null
}

interface IIntegrationIdentification
{
    var integrationId:IntegrationId?
    var capability:String?
    var isSystemOwned:Boolean?
}

open class PolicyStatement
{
    open var sid:String? = null
    open var effect:PermissionEffect? = null
    open var actions:ArrayList<PermissionAction> = ArrayList<PermissionAction>()
    open var resources:ArrayList<ResourcePattern> = ArrayList<ResourcePattern>()
}

open class TriggerAction
{
    @SerializedName("type") open var Type:TriggerActionType? = null
    open var integrationId:IntegrationId? = null
    open var templateId:TemplateId? = null
}

@DataContract
open class TemplateCode
{
}

open class Trigger : IHasDomainEntityId
{
    open var triggerId:TriggerId? = null
    open var name:DisplayName? = null
    open var triggerAction:TriggerAction? = null
    open var activationCode:TemplateCode? = null
    open var description:String? = null
    open var isEnabled:Boolean? = null
    open var integrationId:IntegrationId? = null
    @SerializedName("type") open var Type:TriggerType? = null
}

open class MongoDbAggregateQuery
{
    open var value:String? = null
}

open class DataSchema
{
    open var rawJson:String? = null
    open var fields:ArrayList<JsonSchemaField> = ArrayList<JsonSchemaField>()
}

open class VisualSchema
{
    open var rawJson:String? = null
}

open class SchemaVersion
{
    open var value:Int? = null
}

open class MetaSchemaVersion
{
    open var value:Int? = null
}

open class TaxonomyName
{
    open var value:String? = null
    open var title:String? = null
}

open class RecordId
{
    open var id:String? = null
}

@DataContract
open class EmailMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var subject:String? = null

    @DataMember
    open var body:EmailBodyDto? = null

    @DataMember
    open var staticAttachments:IReadOnlySet<FileResourceRefDto>? = null
}

@DataContract
open class EmailSenderName
{
}

@DataContract
open class EmailMessageContent
{
    @DataMember(Order=1)
    open var subject:EmailSubject? = null

    @DataMember(Order=2)
    open var body:EmailBody? = null

    @DataMember(Order=3)
    open var staticAttachments:ArrayList<FileResourceRef>? = null
}

enum class MarketplaceIntegrationTransport
{
    Mcp,
    Rest,
    Code,
}

enum class MarketplaceIntegrationCategory
{
    Other,
    Crm,
    Erp,
    Marketing,
    Communication,
    Productivity,
    Storage,
    Analytics,
    Identity,
    Payments,
    DevTools,
    Ai,
    Files,
    Database,
    Calendar,
}

open class MarketplaceFunctionMapping
{
    open var parameterName:String? = null
    open var source:MarketplaceMappingSourceKind? = null
    open var defaultValue:String? = null
    open var resolver:TokenMappingResolverType? = null
    open var tokenKey:String? = null
    open var fromRequestPath:String? = null
    open var isRequired:Boolean? = null
}

@DataContract
open class PushMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var title:String? = null

    @DataMember
    open var body:String? = null
}

enum class DeviceType
{
    Unknown,
    Phone,
    Tablet,
    Desktop,
    Tv,
}

@DataContract
open class Template<TMessageContent> : IBindableContract
{
    @DataMember
    open var templateId:TemplateId? = null

    @DataMember
    open var templateName:DisplayName? = null

    @DataMember
    open var translations:ArrayList<MessageTranslation<TMessageContent>> = ArrayList<MessageTranslation<TMessageContent>>()

    @DataMember
    open var communicationChannel:CommunicationChannel? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var tags:ArrayList<Tag>? = null

    @DataMember
    open var fileIntegrationId:IntegrationId? = null
}

@DataContract
open class PushMessageContent
{
    @DataMember(Order=1)
    open var title:PushTitle? = null

    @DataMember(Order=1)
    open var subTitle:PushTitle? = null

    @DataMember(Order=2)
    open var body:PushBody? = null
}

open class TriggerEventName
{
    open var value:String? = null
}

open class CronExpression
{
    open var value:String? = null
    open var parsed:CronExpression? = null
}

open class UserId : IHasDomainEntityId
{
    open var value:UUID? = null
}

open class ErrorDto
{
    open var message:String? = null
    open var errorCode:String? = null
    open var context:HashMap<String,String>? = null
    open var stackTrace:IReadOnlySet<ErrorDto>? = null
}

@Flags()
enum class AccountStatus(val value:Int)
{
    @SerializedName("1") Registered(1),
    @SerializedName("2") PendingValidation(2),
    @SerializedName("8") Active(8),
    @SerializedName("16") InActive(16),
    @SerializedName("32") Blocked(32),
    @SerializedName("64") Unregistered(64),
}

enum class ProjectStatus
{
    Active,
    Disabled,
    Removed,
}

@DataContract
open class ProjectBrandDto
{
    @DataMember
    open var mainColor:String? = null

    @DataMember
    open var accentColor:String? = null

    @DataMember
    open var logo:FileResourceRefDto? = null

    @DataMember
    open var icon:FileResourceRefDto? = null
}

open class NotificationSettingsDto
{
    open var channels:ArrayList<NotificationSettingsChannelDto> = ArrayList<NotificationSettingsChannelDto>()
    open var allGroups:ArrayList<GroupDefinitionDto> = ArrayList<GroupDefinitionDto>()
    open var allTags:ArrayList<TagDefinitionDto> = ArrayList<TagDefinitionDto>()
}

@DataContract
open class DatabaseDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var triggers:ArrayList<SchemaTriggerDto>? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null
}

@DataContract
open class EmailDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null

    @DataMember
    open var signatures:ArrayList<EmailSignatureDto>? = null

    @DataMember
    open var footers:ArrayList<EmailFooterDto>? = null
}

@DataContract
open class AiDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null
}

@DataContract
open class MembershipDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var triggers:ArrayList<MembershipTriggerDto>? = null

    @DataMember
    open var customRoles:ArrayList<RoleItemDto>? = null

    @DataMember
    open var customPolicies:ArrayList<PolicyItemDto>? = null

    @DataMember
    open var authorization:AuthorizationDto? = null
}

@DataContract
open class LoggingDto
{
    @DataMember
    open var isEnabled:Boolean? = null
}

@DataContract
open class ServerEventsDto
{
    @DataMember
    open var isEnabled:Boolean? = null
}

@DataContract
open class PushDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null

    @DataMember
    open var marketingTags:ArrayList<TagDefinitionDto>? = null

    @DataMember
    open var transactionalTags:ArrayList<TagDefinitionDto>? = null
}

@DataContract
open class SchedulerDto
{
    @DataMember
    open var isEnabled:Boolean? = null
}

@DataContract
open class CodeDto
{
    @DataMember
    open var isEnabled:Boolean? = null
}

@DataContract
open class FilesDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var triggers:ArrayList<FilesTriggerDto>? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null
}

@DataContract
open class PaymentsDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var triggers:ArrayList<PaymentTriggerDto>? = null
}

@DataContract
open class SmsDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var defaultIntegrationViewId:String? = null
}

enum class UserType
{
    Service,
    Email,
    UserName,
    Phone,
    Guest,
    Social,
}

open class RegistrationDto
{
    open var registrationInformation:AccessInformationDto? = null
}

open class LoginDto
{
    open var needChangePasswordOnNextLogin:Boolean? = null
    open var lastAccessInformation:AccessInformationDto? = null
}

open class UserGeneralInfoDto
{
    open var phone:String? = null
    open var primaryEmail:String? = null
    open var displayName:String? = null
    open var firstName:String? = null
    open var lastName:String? = null
    open var fullName:String? = null
    open var addressLine1:String? = null
    open var addressLine2:String? = null
    open var country:String? = null
    open var city:String? = null
    open var state:String? = null
    open var postalCode:String? = null
    open var company:String? = null
    open var gender:Gender? = null
    open var birthDate:Long? = null
    open var timeZone:String? = null
    open var language:String? = null
    open var blockAllMarketingMessages:Boolean? = null
    open var blockedTags:HashMap<String,IReadOnlySet<String>>? = null
    open var extraMetadata:String? = null
    open var notes:String? = null
}

enum class UserStatus(val value:Int)
{
    Registered(0),
    PendingValidation(2),
    Active(8),
    Unregistered(16),
    Suspended(32),
    InActive(64),
    Blocked(128),
}

open class CodeMashSubscriptionDto
{
    open var viewId:String? = null
    open var domain:String? = null
    open var willExpireOn:Date? = null
    open var issuedOn:Date? = null
    open var isTrial:Boolean? = null
    open var subscriptionRefId:String? = null
}

@DataContract
open class TriggerProjectionList : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var actionType:TriggerActionType? = null

    @DataMember
    open var hasPreExecuteCode:Boolean? = null

    @DataMember
    open var isEnabled:Boolean? = null
}

open class PolicyStatementDto
{
    open var sid:String? = null
    open var effect:PermissionEffect? = null
    open var actions:ArrayList<String> = ArrayList<String>()
    open var resources:ArrayList<String> = ArrayList<String>()
}

open class IntegrationListProjection : IHasViewId
{
    override var viewId:String? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
    open var lastIntegrationTestAtUtc:Date? = null
    open var lastIntegrationTestSucceeded:Boolean? = null
    open var lastIntegrationTestErrors:IReadOnlyList<String>? = null
    open var humanDeliveryConfirmedAtUtc:Date? = null
    open var requiresHumanDeliveryConfirmation:Boolean? = null
}

open class DataSchemaDto
{
    @DataMember
    open var json:String? = null

    @DataMember
    open var fields:ArrayList<JsonSchemaFieldDto> = ArrayList<JsonSchemaFieldDto>()
}

open class VisualSchemaDto
{
    @DataMember
    open var json:String? = null
}

open class TermMultiParentDto
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var names:HashMap<String,String>? = null
}

@DataContract
open class MjmlParseError
{
    @DataMember(Name="line")
    @SerializedName("line")
    open var line:Int? = null

    @DataMember(Name="message")
    @SerializedName("message")
    open var message:String? = null

    @DataMember(Name="tagName")
    @SerializedName("tagName")
    open var tagName:String? = null

    @DataMember(Name="formattedMessage")
    @SerializedName("formattedMessage")
    open var formattedMessage:String? = null
}

open class EmailTemplateListProjection : TemplateListProjection()
{
    open var hasAttachments:Boolean? = null
    open var languages:IReadOnlySet<String>? = null
}

@DataContract
open class ListItemProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var displayName:String? = null
}

open class CampaignStatusChangeEntryDto
{
    open var time:Date? = null
    open var status:CampaignStatus? = null
    open var errors:IReadOnlySet<ErrorDto>? = null
}

@DataContract
open class CampaignDto : IHasResponsibleUserId, IHasDatabaseId
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var createdOn:Date? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var forceCampaignLanguage:Boolean? = null

    @DataMember
    open var campaignProcessingIntegrationId:String? = null

    @DataMember
    open var statusHistory:IReadOnlySet<CampaignStatusChangeEntryDto>? = null

    @DataMember
    open var status:CampaignStatusChangeEntryDto? = null

    @DataMember
    open var tokenMappingValues:IReadOnlySet<TokenMappingDto>? = null

    @DataMember
    open var notes:String? = null

    @DataMember
    override var userId:String? = null

    @DataMember
    override var id:String? = null
}

interface IHasResponsibleUserId
{
    var userId:String?
}

enum class CampaignStatus
{
    Pending,
    Registered,
    Scheduled,
    Started,
    Stopped,
    Processing,
    Completed,
    Failed,
}

@DataContract
open class EmailRecipientsDto
{
    @DataMember
    open var to:IReadOnlySet<EmailRecipientDto>? = null

    @DataMember
    open var cc:IReadOnlySet<EmailRecipientDto>? = null

    @DataMember
    open var bcc:IReadOnlySet<EmailRecipientDto>? = null

    @DataMember
    open var startingAfter:String? = null

    @DataMember
    open var hasMore:Boolean? = null
}

@DataContract
open class CampaignBatchDto : IHasDatabaseId
{
    @DataMember
    open var campaignId:String? = null

    @DataMember
    open var batchId:String? = null

    @DataMember
    open var startAfter:String? = null

    @DataMember
    open var statusHistory:ArrayList<BatchStatusChangeEntryDto> = ArrayList<BatchStatusChangeEntryDto>()

    @DataMember
    override var id:String? = null
}

open class NotificationStatusChangeEntryDto
{
    open var time:Date? = null
    open var status:CampaignNotificationStatus? = null
    open var sourceId:String? = null
    open var errors:IReadOnlySet<ErrorDto>? = null
    open var tags:IReadOnlySet<String>? = null
}

@DataContract
open class CampaignBatchNotificationDto : IHasDatabaseId
{
    @DataMember
    open var campaignId:String? = null

    @DataMember
    open var batchId:String? = null

    @DataMember
    open var notificationId:String? = null

    @DataMember
    open var refNotificationId:String? = null

    @DataMember
    open var subject:String? = null

    @DataMember
    open var body:String? = null

    @DataMember
    open var model:HashMap<String,String>? = null

    @DataMember
    open var statusHistory:IReadOnlySet<NotificationStatusChangeEntryDto>? = null

    @DataMember
    override var id:String? = null
}

enum class CampaignBatchStatus
{
    Registered,
    Processing,
    Completed,
    Failed,
}

@DataContract
open class SmsMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var subject:String? = null

    @DataMember
    open var body:String? = null
}

@DataContract
open class TagDescriptionDto
{
    @DataMember
    open var title:String? = null

    @DataMember
    open var description:String? = null
}

interface ICursorArgs
{
    var field:String?
    var order:Int?
}

open class FileResourceId
{
    open var value:UUID? = null
}

open class FileChecksum
{
    open var algorithm:String? = null
    open var hash:String? = null
}

@DataContract
open class GroupTags
{
    @DataMember
    open var group:Tag? = null

    @DataMember
    open var tags:ArrayList<Tag> = ArrayList<Tag>()
}

open class TagDescription
{
    open var displayName:DisplayName? = null
    open var description:String? = null
}

enum class PermissionEffect
{
    Allow,
    Deny,
}

open class PermissionAction
{
    open var module:ApplicationModule? = null
    open var operation:String? = null
    open var isModuleWildcard:Boolean? = null
    open var isOperationWildcard:Boolean? = null
    open var isConcrete:Boolean? = null
    open var specificity:Int? = null
}

open class ResourcePattern
{
    open var account:AccountId? = null
    open var project:ProjectId? = null
    open var module:ApplicationModule? = null
    open var kind:ResourceKind? = null
    open var id:ResourceIdentifier? = null
    open var isAccountWildcard:Boolean? = null
    open var isProjectWildcard:Boolean? = null
    open var isModuleWildcard:Boolean? = null
    open var isKindWildcard:Boolean? = null
    open var isIdWildcard:Boolean? = null
    open var isConcrete:Boolean? = null
    open var isFullWildcard:Boolean? = null
    open var specificity:Int? = null
}

open class FileTrigger : Trigger()
{
    @SerializedName("when") open var When:FilesTriggerType? = null
    open var fileResourceRef:FileResourceRef? = null
}

open class PaymentTrigger : Trigger()
{
    @SerializedName("when") open var When:PaymentTriggerType? = null
}

open class JsonSchemaField
{
    open var fieldName:JsonSchemaFieldName? = null
}

@DataContract
open class EmailBodyDto : IHasRazorTemplateCode
{
    @DataMember
    open var structure:String? = null

    @DataMember
    open var code:String? = null

    @DataMember
    open var templateEngine:EmailTemplateEngine? = null
}

@DataContract
open class EmailSubject
{
}

@DataContract
open class EmailBody
{
    @DataMember
    open var code:TemplateCode? = null

    @DataMember
    open var structure:String? = null

    @DataMember
    open var emailTemplateEngine:EmailTemplateEngine? = null
}

enum class MarketplaceMappingSourceKind
{
    Default,
    Resolver,
    FromRequest,
}

@DataContract
open class PushTitle
{
    @DataMember
    open var value:TemplateCode? = null
}

open class PushBody
{
    open var value:TemplateCode? = null
}

open class CronExpression
{
}

open class NotificationSettingsChannelDto
{
    open var channel:CommunicationChannel? = null
    open var groups:ArrayList<NotificationsSettingsGroupDto> = ArrayList<NotificationsSettingsGroupDto>()
}

@DataContract
open class SchemaTriggerDto : TriggerDto()
{
    @DataMember
    open var schemaId:String? = null

    @DataMember
    @SerializedName("when") open var When:SchemaTriggerType? = null

    @DataMember
    open var configurationCode:String? = null
}

@DataContract
open class MembershipTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

@DataContract
open class AuthorizationDto
{
    @DataMember
    open var userRegistersAsRole:String? = null

    @DataMember
    open var allowedRegisterRoles:ArrayList<String>? = null

    @DataMember
    open var allowedProviderRegisterRoles:ArrayList<String>? = null
}

@DataContract
open class FilesTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:FilesTriggerType? = null
}

@DataContract
open class PaymentTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:PaymentTriggerType? = null
}

open class AccessInformationDto
{
    open var ip:String? = null
    open var date:Date? = null
    open var timeZone:String? = null
}

enum class Gender
{
    Male,
    Female,
    Other,
}

open class JsonSchemaFieldDto
{
    @DataMember
    open var fieldName:String? = null
}

@DataContract
open class EmailRecipientDto
{
    @DataMember
    open var emailAddress:String? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var timeZoneId:String? = null

    @DataMember
    open var userTokenMappings:IReadOnlySet<TokenMappingDto>? = null
}

enum class CampaignNotificationStatus
{
    Completed,
    BlockedByUserPreferenceBlockAll,
    BlockedByUserPreferenceBlockByTag,
    Failed,
    Viewed,
    Clicked,
}

@Flags()
enum class ApplicationModule(val value:Int)
{
    @SerializedName("0") Account(0),
    @SerializedName("1") Membership(1),
    @SerializedName("2") Database(2),
    @SerializedName("4") Files(4),
    @SerializedName("8") Code(8),
    @SerializedName("16") Email(16),
    @SerializedName("32") Push(32),
    @SerializedName("64") Payment(64),
    @SerializedName("128") Scheduler(128),
    @SerializedName("256") Logging(256),
    @SerializedName("512") ServerEvents(512),
    @SerializedName("1024") Ai(1024),
    @SerializedName("2048") Sms(2048),
}

open class ResourceKind
{
    open var name:String? = null
}

open class ResourceIdentifier
{
    open var value:String? = null
}

open class JsonSchemaFieldName
{
    open var fieldName:String? = null
}

open class StringField : JsonSchemaField()
{
    open var format:String? = null
    open var pattern:String? = null
    open var minLength:Int? = null
    open var maxLength:Int? = null
    open var translateOptions:IReadOnlyDictionary<String, String>? = null
}

open class DecimalField : JsonSchemaField()
{
    open var minimum:BigDecimal? = null
    open var maximum:BigDecimal? = null
    open var multipleOf:BigDecimal? = null
}

open class CurrencyField : JsonSchemaField()
{
    open var allowedCurrencies:IReadOnlyList<String>? = null
}

open class BooleanField : JsonSchemaField()
{
}

open class DateField : JsonSchemaField()
{
    open var minimum:Long? = null
    open var maximum:Long? = null
}

open class IntegerField : JsonSchemaField()
{
    open var minimum:Long? = null
    open var maximum:Long? = null
}

open class GeolocationField : JsonSchemaField()
{
    open var allowedTypes:IReadOnlyList<String>? = null
}

open class TagsField : JsonSchemaField()
{
}

open class FileField : JsonSchemaField()
{
    open var storages:IReadOnlyList<String>? = null
}

open class TaxonomySelectionField : JsonSchemaField()
{
    open var taxonomyId:String? = null
    open var multiple:Boolean? = null
}

open class CollectionSelectionField : JsonSchemaField()
{
    open var collectionId:String? = null
    open var displayField:String? = null
    open var multiple:Boolean? = null
}

open class UserSelectionField : JsonSchemaField()
{
    open var multiple:Boolean? = null
}

open class RoleSelectionField : JsonSchemaField()
{
    open var multiple:Boolean? = null
}

open class EnumSelectionField : JsonSchemaField()
{
    open var values:IReadOnlyList<String>? = null
    open var multiple:Boolean? = null
}

enum class EmailTemplateEngine
{
    NotSet,
    Handlebars,
    Mjml,
    Liquid,
    Razor,
    Mustache,
}

open class NotificationsSettingsGroupDto
{
    open var tag:String? = null
    open var tags:ArrayList<String> = ArrayList<String>()
}

open class StringFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var format:String? = null

    @DataMember
    open var pattern:String? = null

    @DataMember
    open var minLength:Int? = null

    @DataMember
    open var maxLength:Int? = null

    @DataMember
    open var translateOptions:IReadOnlyDictionary<String, String>? = null
}

open class DecimalFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:BigDecimal? = null

    @DataMember
    open var maximum:BigDecimal? = null

    @DataMember
    open var multipleOf:BigDecimal? = null
}

open class CurrencyFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var allowedCurrencies:IReadOnlyList<String>? = null
}

open class BooleanFieldDto : JsonSchemaFieldDto()
{
}

open class DateFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:Long? = null

    @DataMember
    open var maximum:Long? = null
}

open class IntegerFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:Long? = null

    @DataMember
    open var maximum:Long? = null
}

open class GeolocationFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var allowedTypes:IReadOnlyList<String>? = null
}

open class TagsFieldDto : JsonSchemaFieldDto()
{
}

open class FileFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var storages:IReadOnlyList<String>? = null
}

open class TaxonomySelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var multiple:Boolean? = null
}

open class CollectionSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var collectionId:String? = null

    @DataMember
    open var displayField:String? = null

    @DataMember
    open var multiple:Boolean? = null
}

open class UserSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var multiple:Boolean? = null
}

open class RoleSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var multiple:Boolean? = null
}

open class EnumSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var values:IReadOnlyList<String>? = null

    @DataMember
    open var multiple:Boolean? = null
}
