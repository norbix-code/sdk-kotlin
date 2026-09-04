/* Options:
Date: 2026-09-04 14:55:40
Version: 10.08
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
    open var typegen_15_MongoDbConnectionStringDatabaseIntegrationRequest:MongoDbConnectionStringDatabaseIntegrationRequest? = null
    open var typegen_16_MongoDbAtlasFlexManagedDatabaseIntegrationRequest:MongoDbAtlasFlexManagedDatabaseIntegrationRequest? = null
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
    open var typegen_28_NewRelicLoggingIntegrationRequest:NewRelicLoggingIntegrationRequest? = null
    open var typegen_30_MongoDbLoggingIntegrationRequest:MongoDbLoggingIntegrationRequest? = null
    open var typegen_31_KafkaLoggingIntegrationRequest:KafkaLoggingIntegrationRequest? = null
    open var typegen_32_PrometheusLoggingIntegrationRequest:PrometheusLoggingIntegrationRequest? = null
    open var typegen_33_DataDogLoggingIntegrationRequest:DataDogLoggingIntegrationRequest? = null
    open var typegen_34_InternalKafkaLoggingIntegrationRequest:InternalKafkaLoggingIntegrationRequest? = null
    open var typegen_35_ElasticSearchLoggingIntegrationRequest:ElasticSearchLoggingIntegrationRequest? = null
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
    open var typegen_236_TriggerActionSmsDto:TriggerActionSmsDto? = null
    open var typegen_237_TriggerActionSseDto:TriggerActionSseDto? = null
    open var typegen_238_TriggerActionMarketplaceDto:TriggerActionMarketplaceDto? = null
    open var typegen_239_SseDeliverySettingsDto:SseDeliverySettingsDto? = null
    open var typegen_240_GetTriggers:GetTriggers? = null
    open var typegen_241_GetTriggersResponse:GetTriggersResponse? = null
    open var typegen_90_EmailToAllUsersDeliverySettingsDto:EmailToAllUsersDeliverySettingsDto? = null
    open var typegen_91_EmailToAccountUsersDeliverySettingsDto:EmailToAccountUsersDeliverySettingsDto? = null
    open var typegen_92_EmailToUsersDeliverySettingsDto:EmailToUsersDeliverySettingsDto? = null
    open var typegen_93_EmailToEmailAddressesDeliverySettingsDto:EmailToEmailAddressesDeliverySettingsDto? = null
    open var typegen_94_EmailToCollectionRecordsDeliverySettingsDto:EmailToCollectionRecordsDeliverySettingsDto? = null
    open var typegen_95_PushToAllUsersDeliverySettingsDto:PushToAllUsersDeliverySettingsDto? = null
    open var typegen_96_PushToUsersDeliverySettingsDto:PushToUsersDeliverySettingsDto? = null
    open var typegen_229_PushToAccountUsersDeliverySettingsDto:PushToAccountUsersDeliverySettingsDto? = null
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
    open var typegen_147_MongoDbLoggingIntegrationDto:MongoDbLoggingIntegrationDto? = null
    open var typegen_148_NewRelicLoggingIntegrationDto:NewRelicLoggingIntegrationDto? = null
    open var typegen_149_PrometheusLoggingIntegrationDto:PrometheusLoggingIntegrationDto? = null
    open var typegen_150_SplunkLoggingIntegrationDto:SplunkLoggingIntegrationDto? = null
    open var typegen_153_AppleICloudFilesIntegrationDto:AppleICloudFilesIntegrationDto? = null
    open var typegen_154_AwsS3CrossAccountRoleFilesIntegrationDto:AwsS3CrossAccountRoleFilesIntegrationDto? = null
    open var typegen_155_AwsS3IamFilesIntegrationDto:AwsS3IamFilesIntegrationDto? = null
    open var typegen_156_AzureBlobFilesIntegrationDto:AzureBlobFilesIntegrationDto? = null
    open var typegen_157_DropBoxFilesIntegrationDto:DropBoxFilesIntegrationDto? = null
    open var typegen_158_FtpFilesIntegrationDto:FtpFilesIntegrationDto? = null
    open var typegen_159_GoogleCloudFilesIntegrationDto:GoogleCloudFilesIntegrationDto? = null
    open var typegen_160_GoogleDriveFilesIntegrationDto:GoogleDriveFilesIntegrationDto? = null
    open var typegen_161_LocalFilesIntegrationDto:LocalFilesIntegrationDto? = null
    open var typegen_164_MongoDbConnectionStringIntegrationDto:MongoDbConnectionStringIntegrationDto? = null
    open var typegen_165_MongoDbAtlasFlexManagedIntegrationDto:MongoDbAtlasFlexManagedIntegrationDto? = null
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
    open var typegen_197_MarketplaceFunctionDto:MarketplaceFunctionDto? = null
    open var typegen_198_MarketplaceListingDto:MarketplaceListingDto? = null
    open var typegen_199_MarketplaceFunctionDefinitionDto:MarketplaceFunctionDefinitionDto? = null
    open var typegen_200_MarketplaceFunctionParameterDto:MarketplaceFunctionParameterDto? = null
    open var typegen_201_EnableCode:EnableCode? = null
    open var typegen_202_DisableCode:DisableCode? = null
    open var typegen_203_GetCodeIntegrations:GetCodeIntegrations? = null
    open var typegen_204_GetCodeIntegration:GetCodeIntegration? = null
    open var typegen_205_SaveCodeIntegration:SaveCodeIntegration? = null
    open var typegen_206_TestCodeIntegration:TestCodeIntegration? = null
    open var typegen_207_ConfirmCodeIntegrationHumanDeliveryRequest:ConfirmCodeIntegrationHumanDeliveryRequest? = null
    open var typegen_208_SetCodeIntegrationAsDefault:SetCodeIntegrationAsDefault? = null
    open var typegen_209_DeleteCodeIntegrationRequest:DeleteCodeIntegrationRequest? = null
    open var typegen_210_EnableCodeIntegrationRequest:EnableCodeIntegrationRequest? = null
    open var typegen_211_DisableCodeIntegrationRequest:DisableCodeIntegrationRequest? = null
    open var typegen_212_GetMarketplaceListings:GetMarketplaceListings? = null
    open var typegen_213_GetMarketplaceListingFunctionTokens:GetMarketplaceListingFunctionTokens? = null
    open var typegen_214_GetMarketplaceIntegrations:GetMarketplaceIntegrations? = null
    open var typegen_215_GetMarketplaceIntegration:GetMarketplaceIntegration? = null
    open var typegen_216_SaveMarketplaceIntegration:SaveMarketplaceIntegration? = null
    open var typegen_217_DeleteMarketplaceIntegration:DeleteMarketplaceIntegration? = null
    open var typegen_218_EnableMarketplaceIntegration:EnableMarketplaceIntegration? = null
    open var typegen_219_DisableMarketplaceIntegration:DisableMarketplaceIntegration? = null
    open var typegen_221_GetMarketplaceFunctions:GetMarketplaceFunctions? = null
    open var typegen_222_GetMarketplaceFunction:GetMarketplaceFunction? = null
    open var typegen_223_SaveMarketplaceFunction:SaveMarketplaceFunction? = null
    open var typegen_224_DeleteMarketplaceFunction:DeleteMarketplaceFunction? = null
    open var typegen_225_EnableMarketplaceFunction:EnableMarketplaceFunction? = null
    open var typegen_226_DisableMarketplaceFunction:DisableMarketplaceFunction? = null
    open var typegen_227_GetMarketplaceFunctionTokens:GetMarketplaceFunctionTokens? = null
    open var typegen_228_InvokeMarketplaceFunction:InvokeMarketplaceFunction? = null
    open var typegen_232_GetMarketplaceListing:GetMarketplaceListing? = null
    open var typegen_233_TestMarketplaceIntegration:TestMarketplaceIntegration? = null
    open var typegen_234_TestMarketplaceIntegrationResponse:TestMarketplaceIntegrationResponse? = null
    open var typegen_235_GetMarketplaceListingResponse:GetMarketplaceListingResponse? = null
    open var typegen_230_AdminPortalStructureDto:AdminPortalStructureDto? = null
    open var typegen_231_AdminPortalModuleDto:AdminPortalModuleDto? = null
    open var typegen_236_UserMessageEntryWireDto:UserMessageEntryWireDto? = null
    open var typegen_237_AssistantTextEntryWireDto:AssistantTextEntryWireDto? = null
    open var typegen_238_AssistantQuestionEntryWireDto:AssistantQuestionEntryWireDto? = null
    open var typegen_239_UserAnswerEntryWireDto:UserAnswerEntryWireDto? = null
    open var typegen_240_PlanEntryWireDto:PlanEntryWireDto? = null
    open var typegen_241_UserDecisionEntryWireDto:UserDecisionEntryWireDto? = null
    open var typegen_242_RunStepEntryWireDto:RunStepEntryWireDto? = null
    open var typegen_243_ActionPendingEntryWireDto:ActionPendingEntryWireDto? = null
    open var typegen_244_NoticeEntryWireDto:NoticeEntryWireDto? = null
    open var typegen_245_ConversationSnapshotEntryWireDto:ConversationSnapshotEntryWireDto? = null
}

@Route(Path="/{version}/echo", Verbs="GET")
open class Echo : RequestBase(), IReturn<EchoResponse>
{
    companion object { private val responseType = EchoResponse::class.java }
    override fun getResponseType(): Any? = Echo.responseType
}

@Route(Path="/{version}/public/projects/{ProjectId}/config", Verbs="GET")
open class GetPublicProjectConfig : RequestBase(), IReturn<PublicProjectConfigDto>
{
    open var projectId:String? = null
    companion object { private val responseType = PublicProjectConfigDto::class.java }
    override fun getResponseType(): Any? = GetPublicProjectConfig.responseType
}

@Route(Path="/{version}/public/projects/{ProjectId}/legal/{Kind}", Verbs="GET")
open class GetPublicProjectLegal : RequestBase(), IReturn<PublicLegalDocumentDto>
{
    open var projectId:String? = null
    open var kind:String? = null
    companion object { private val responseType = PublicLegalDocumentDto::class.java }
    override fun getResponseType(): Any? = GetPublicProjectLegal.responseType
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
    /**
    * Account owner's display name.
    */
    @DataMember
    @ApiMember(Description="Account owner's display name.", IsRequired=true)
    open var displayName:String? = null

    /**
    * Email address used for billing communications.
    */
    @DataMember
    @ApiMember(Description="Email address used for billing communications.")
    open var billingEmail:String? = null

    /**
    * Email address used for operations communications.
    */
    @DataMember
    @ApiMember(Description="Email address used for operations communications.")
    open var operationsEmail:String? = null

    /**
    * Email address used for security-related communications.
    */
    @DataMember
    @ApiMember(Description="Email address used for security-related communications.")
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
    /**
    * Which subscription (e.g. main account plan) to open the billing portal for.
    */
    @DataMember
    @ApiMember(Description="Which subscription (e.g. main account plan) to open the billing portal for.")
    open var subscriptionType:SubscriptionType? = null

    /**
    * URL to return to after the customer leaves the billing portal.
    */
    @DataMember
    @ApiMember(Description="URL to return to after the customer leaves the billing portal.")
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

/**
* Get Account Usage Billing.
*/
@Route(Path="/{version}/account/usage-billing", Verbs="GET")
@Api(Description="Get Account Usage Billing.")
open class GetAccountUsageBilling : RequestBase(), IReturn<GetAccountUsageBillingResponse>
{
    companion object { private val responseType = GetAccountUsageBillingResponse::class.java }
    override fun getResponseType(): Any? = GetAccountUsageBilling.responseType
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
    /**
    * Tag identifying the notification group to remove.
    */
    @ApiMember(Description="Tag identifying the notification group to remove.", IsRequired=true)
    open var groupTag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/tag", Verbs="DELETE")
open class DeleteNotificationsTag : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Tag identifying the notification tag to delete.
    */
    @ApiMember(Description="Tag identifying the notification tag to delete.", IsRequired=true)
    open var tag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteNotificationsTag.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/group/tag", Verbs="DELETE")
open class RemoveTagFromNotificationsGroup : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Tag identifying the notification group.
    */
    @ApiMember(Description="Tag identifying the notification group.", IsRequired=true)
    open var groupTag:String? = null

    /**
    * Tag identifying the notification tag to remove from the group.
    */
    @ApiMember(Description="Tag identifying the notification tag to remove from the group.", IsRequired=true)
    open var tag:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveTagFromNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/group", Verbs="POST")
open class SaveNotificationsGroup : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The group's tag and translations to save. The tag identifies the group; translations provide its display name per locale.
    */
    @ApiMember(Description="The group's tag and translations to save. The tag identifies the group; translations provide its display name per locale.", IsRequired=true)
    open var groupDefinition:GroupDefinitionDto? = null

    /**
    * Communication channel (e.g. Email, Push) this group belongs to.
    */
    @ApiMember(Description="Communication channel (e.g. Email, Push) this group belongs to.")
    open var channel:CommunicationChannel? = null

    /**
    * If moving the group to a different channel, the channel it currently belongs to.
    */
    @ApiMember(Description="If moving the group to a different channel, the channel it currently belongs to.")
    open var originChannel:CommunicationChannel? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveNotificationsGroup.responseType
}

@Route(Path="/{version}/account/projects/{projectId}/notifications/settings/tag", Verbs="POST")
open class SaveNotificationsTag : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The tag's identifier, translations, and default per-delivery-channel enabled/disabled settings.
    */
    @ApiMember(Description="The tag's identifier, translations, and default per-delivery-channel enabled/disabled settings.", IsRequired=true)
    open var tagDefinition:TagDefinitionDto? = null

    /**
    * Communication channel (e.g. Email, Push) this tag belongs to.
    */
    @ApiMember(Description="Communication channel (e.g. Email, Push) this tag belongs to.")
    open var channel:CommunicationChannel? = null

    /**
    * Tag of the group this notification tag should be placed under, if any.
    */
    @ApiMember(Description="Tag of the group this notification tag should be placed under, if any.")
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

    /**
    * Project name, unique per account.
    */
    @DataMember
    @ApiMember(Description="Project name, unique per account.")
    open var projectName:String? = null

    /**
    * Region code for the primary region, e.g. 'nb-eu-germany'. Use a code from get_account_regions.
    */
    @DataMember
    @ApiMember(Description="Region code for the primary region, e.g. 'nb-eu-germany'. Use a code from get_account_regions.")
    open var primaryRegion:String? = null

    @DataMember
    open var additionalRegions:ArrayList<String>? = null

    @DataMember
    open var description:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateProjectRequest.responseType
}

/**
* Deletes project
*/
@Route(Path="/{version}/account/projects/{projectId}", Verbs="DELETE")
@Api(Description="Deletes project")
open class DeleteProject : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteProject.responseType
}

@Route(Path="/{version}/account/projects/environments", Verbs="POST")
@DataContract
open class CreateProjectEnvironmentRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Name for the new environment (e.g. 'TEST', 'STAGING'). A-Z/0-9/space, up to 15 chars, cannot be PROD.
    */
    @DataMember
    @ApiMember(Description="Name for the new environment (e.g. 'TEST', 'STAGING'). A-Z/0-9/space, up to 15 chars, cannot be PROD.", IsRequired=true)
    open var environmentName:String? = null

    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:DatabaseIntegrationRequest? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CreateProjectEnvironmentRequest.responseType
}

@Route(Path="/{version}/account/projects/environments/{environmentName}", Verbs="DELETE")
@DataContract
open class DeleteProjectEnvironmentRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Name of the environment to delete (from get_project_environments), e.g. 'TEST'. PROD is rejected.
    */
    @DataMember
    @ApiMember(Description="Name of the environment to delete (from get_project_environments), e.g. 'TEST'. PROD is rejected.", IsRequired=true)
    open var environmentName:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteProjectEnvironmentRequest.responseType
}

@Route(Path="/{version}/account/projects/environments/{environmentName}/rank", Verbs="PATCH")
@DataContract
open class SetEnvironmentRankRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Name of the environment to re-rank (from get_project_environments).
    */
    @DataMember
    @ApiMember(Description="Name of the environment to re-rank (from get_project_environments).", IsRequired=true)
    open var environmentName:String? = null

    /**
    * New promotion-ladder rank. Out-of-range values are clamped and ranks re-normalized.
    */
    @DataMember
    @ApiMember(Description="New promotion-ladder rank. Out-of-range values are clamped and ranks re-normalized.")
    open var rank:Int? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetEnvironmentRankRequest.responseType
}

@Route(Path="/{version}/account/projects/environments/promote", Verbs="POST")
@DataContract
open class PromoteEnvironmentRequest : CodeMashRequestBase(), IReturn<PromoteEnvironmentResponse>
{
    /**
    * Environment to promote FROM (source of truth for this promotion).
    */
    @DataMember
    @ApiMember(Description="Environment to promote FROM (source of truth for this promotion).", IsRequired=true)
    open var sourceEnv:String? = null

    /**
    * Environment to promote INTO. Must be higher on the promotion ladder than SourceEnv.
    */
    @DataMember
    @ApiMember(Description="Environment to promote INTO. Must be higher on the promotion ladder than SourceEnv.", IsRequired=true)
    open var targetEnv:String? = null

    /**
    * When true, only returns the promotion plan (including deletions) without applying it or copying secrets. Use this to preview before a real run.
    */
    @DataMember
    @ApiMember(Description="When true, only returns the promotion plan (including deletions) without applying it or copying secrets. Use this to preview before a real run.")
    open var dryRun:Boolean? = null
    companion object { private val responseType = PromoteEnvironmentResponse::class.java }
    override fun getResponseType(): Any? = PromoteEnvironmentRequest.responseType
}

@Route(Path="/{version}/account/projects/environments/promote/rollback", Verbs="POST")
@DataContract
open class RollbackPromotionRequest : CodeMashRequestBase(), IReturn<PromoteEnvironmentResponse>
{
    /**
    * Environment whose content should be rolled back.
    */
    @DataMember
    @ApiMember(Description="Environment whose content should be rolled back.", IsRequired=true)
    open var targetEnv:String? = null

    /**
    * The fromVersion anchor returned by the promote_environment call being rolled back.
    */
    @DataMember
    @ApiMember(Description="The fromVersion anchor returned by the promote_environment call being rolled back.", IsRequired=true)
    open var fromVersion:Long? = null
    companion object { private val responseType = PromoteEnvironmentResponse::class.java }
    override fun getResponseType(): Any? = RollbackPromotionRequest.responseType
}

@Route(Path="/{version}/account/projects/environments", Verbs="GET")
@DataContract
open class GetProjectEnvironments : CodeMashRequestBase(), IReturn<GetProjectEnvironmentsResponse>
{
    companion object { private val responseType = GetProjectEnvironmentsResponse::class.java }
    override fun getResponseType(): Any? = GetProjectEnvironments.responseType
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
* Waits (bounded, server-side) for a project to finish provisioning and become active.
*/
@Route(Path="/{version}/account/projects/{projectId}/wait-active", Verbs="GET")
@Api(Description="Waits (bounded, server-side) for a project to finish provisioning and become active.")
open class WaitForProjectActiveRequest : CodeMashRequestBase(), IReturn<WaitForProjectActiveResponse>
{
    /**
    * Max seconds to wait before returning 'not active yet' (default 30, capped at 90).
    */
    @ApiMember(Description="Max seconds to wait before returning 'not active yet' (default 30, capped at 90).")
    open var timeoutSeconds:Int? = null
    companion object { private val responseType = WaitForProjectActiveResponse::class.java }
    override fun getResponseType(): Any? = WaitForProjectActiveRequest.responseType
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
* Assigns the project's Admin Portal service user
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/admin-portal/service-user", Verbs="PUT")
@Api(Description="Assigns the project's Admin Portal service user")
open class AssignAdminPortalServiceUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the existing AuthType.Service user to assign as the project's Admin Portal service user.
    */
    @ApiMember(Description="Id of the existing AuthType.Service user to assign as the project's Admin Portal service user.", IsRequired=true)
    open var serviceUserId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AssignAdminPortalServiceUserRequest.responseType
}

/**
* Reads the Admin Portal layout/structure (service user only)
*/
@Route(Path="/{version}/account/projects/{projectId}/admin-portal/structure", Verbs="GET")
@Api(Description="Reads the Admin Portal layout/structure (service user only)")
open class GetAdminPortalStructure : CodeMashRequestBase(), IReturn<AdminPortalStructureDto>
{
    companion object { private val responseType = AdminPortalStructureDto::class.java }
    override fun getResponseType(): Any? = GetAdminPortalStructure.responseType
}

/**
* Updates the project's admin-portal URL override
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/admin-url", Verbs="PATCH")
@Api(Description="Updates the project's admin-portal URL override")
open class UpdateProjectAdminUrl : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Custom admin-portal URL to use instead of the canonical address. Null/empty restores the canonical pr_{id}.admin.{host} address.
    */
    @ApiMember(Description="Custom admin-portal URL to use instead of the canonical address. Null/empty restores the canonical pr_{id}.admin.{host} address.")
    open var url:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectAdminUrl.responseType
}

/**
* Updates project accent color
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/accent-color", Verbs="PATCH")
@Api(Description="Updates project accent color")
open class UpdateProjectAccentColor : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Hex color code, e.g. '#FF6D00'.
    */
    @ApiMember(Description="Hex color code, e.g. '#FF6D00'.", IsRequired=true)
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
    open var fileResource:FileResourceRefDto? = null
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
    open var fileResource:FileResourceRefDto? = null
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
    /**
    * Hex color code, e.g. '#1A73E8'.
    */
    @ApiMember(Description="Hex color code, e.g. '#1A73E8'.", IsRequired=true)
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
    /**
    * The complete new list of allowed origin URLs, e.g. ["https://app.example.com", "https://example.com"]. An entry with no scheme (e.g. "example.com") defaults to https. Whatever is not in this list stops being allowed.
    */
    @ApiMember(Description="The complete new list of allowed origin URLs, e.g. [\"https://app.example.com\", \"https://example.com\"]. An entry with no scheme (e.g. \"example.com\") defaults to https. Whatever is not in this list stops being allowed.")
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
    /**
    * Language code, e.g. 'en' or 'de'.
    */
    @ApiMember(Description="Language code, e.g. 'en' or 'de'.", IsRequired=true)
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
    /**
    * The new description text. Omit (null) to clear the description.
    */
    @ApiMember(Description="The new description text. Omit (null) to clear the description.")
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
    /**
    * The complete new list of language codes, e.g. ["en", "de", "lt"].
    */
    @ApiMember(Description="The complete new list of language codes, e.g. [\"en\", \"de\", \"lt\"].", IsRequired=true)
    open var languages:ArrayList<String> = ArrayList<String>()
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectLanguages.responseType
}

/**
* Updates the project's public legal documents (Terms & Conditions, Privacy Policy)
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/legal", Verbs="PATCH")
@Api(Description="Updates the project's public legal documents (Terms & Conditions, Privacy Policy)")
open class UpdateProjectLegalDocuments : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Terms & Conditions document, Markdown. Null/empty clears it.
    */
    @ApiMember(Description="Terms & Conditions document, Markdown. Null/empty clears it.")
    open var termsMarkdown:String? = null

    /**
    * Privacy Policy document, Markdown. Null/empty clears it.
    */
    @ApiMember(Description="Privacy Policy document, Markdown. Null/empty clears it.")
    open var privacyMarkdown:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectLegalDocuments.responseType
}

/**
* Sets whether the project's legal documents are publicly readable via the Admin Portal
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/legal/expose", Verbs="PATCH")
@Api(Description="Sets whether the project's legal documents are publicly readable via the Admin Portal")
open class UpdateProjectExposeLegal : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * True to make the legal documents publicly readable via the Admin Portal, false to hide them.
    */
    @ApiMember(Description="True to make the legal documents publicly readable via the Admin Portal, false to hide them.")
    open var exposed:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateProjectExposeLegal.responseType
}

/**
* Updates project marketing url
*/
@Route(Path="/{version}/account/projects/{projectId}/settings/url", Verbs="PATCH")
@Api(Description="Updates project marketing url")
open class UpdateProjectUrl : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The marketing site URL, e.g. 'https://example.com'. Omit (null) to clear.
    */
    @ApiMember(Description="The marketing site URL, e.g. 'https://example.com'. Omit (null) to clear.")
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
    /**
    * The new project name, unique per account.
    */
    @ApiMember(Description="The new project name, unique per account.", IsRequired=true)
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
    /**
    * Primary region code, e.g. 'nb-eu-germany'. Immutable once set — omit to keep the current one; only set it on a project that has none.
    */
    @ApiMember(Description="Primary region code, e.g. 'nb-eu-germany'. Immutable once set — omit to keep the current one; only set it on a project that has none.")
    open var primaryRegion:String? = null

    /**
    * The complete new list of additional region codes (full replacement). A region that still hosts a provisioned database cluster cannot be removed.
    */
    @ApiMember(Description="The complete new list of additional region codes (full replacement). A region that still hosts a provisioned database cluster cannot be removed.")
    open var additionalRegions:ArrayList<String>? = null
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

@Route(Path="/{version}/account/team/member/password", Verbs="POST")
open class ChangeTeamMemberPassword : RequestBase(), IReturn<IdResponse>
{
    open var email:String? = null
    open var currentPassword:String? = null
    open var newPassword:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = ChangeTeamMemberPassword.responseType
}

@Route(Path="/{version}/account/team/member/create", Verbs="POST")
open class CreateTeamMember : RequestBase(), IReturn<IdResponse>
{
    open var email:String? = null
    open var displayName:String? = null
    open var password:String? = null
    open var roles:ArrayList<String>? = null
    open var sendInvitation:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateTeamMember.responseType
}

@Route(Path="/{version}/account/team/policies", Verbs="POST")
open class CreateAccountPolicy : RequestBase(), IReturn<IdResponse>
{
    /**
    * Name for the new custom account policy.
    */
    @ApiMember(Description="Name for the new custom account policy.", IsRequired=true)
    open var policyName:String? = null

    /**
    * Optional human-readable description of the policy's purpose.
    */
    @ApiMember(Description="Optional human-readable description of the policy's purpose.")
    open var description:String? = null

    /**
    * Raw JSON policy document, AWS-IAM style (Statement array of Effect/Action/Resource entries), matching PolicyDocument.schema.json. This defines which permissions the policy grants.
    */
    @ApiMember(Description="Raw JSON policy document, AWS-IAM style (Statement array of Effect/Action/Resource entries), matching PolicyDocument.schema.json. This defines which permissions the policy grants.")
    open var policyDocumentJson:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateAccountPolicy.responseType
}

@Route(Path="/{version}/account/team/roles", Verbs="POST")
open class CreateAccountRole : RequestBase(), IReturn<IdResponse>
{
    /**
    * Name for the new custom account team role.
    */
    @ApiMember(Description="Name for the new custom account team role.", IsRequired=true)
    open var roleName:String? = null

    /**
    * Optional human-readable description of the role's purpose.
    */
    @ApiMember(Description="Optional human-readable description of the role's purpose.")
    open var description:String? = null

    /**
    * Public policy ids (from get_account_team_policies) to attach to this role.
    */
    @ApiMember(Description="Public policy ids (from get_account_team_policies) to attach to this role.")
    open var policies:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateAccountRole.responseType
}

@Route(Path="/{version}/account/team/policies/{Id}", Verbs="DELETE")
open class DeleteAccountPolicy : RequestBase(), IReturn<IdResponse>
{
    /**
    * Public policy id (from get_account_team_policies) to delete.
    */
    @ApiMember(Description="Public policy id (from get_account_team_policies) to delete.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DeleteAccountPolicy.responseType
}

@Route(Path="/{version}/account/team/roles/{Id}", Verbs="DELETE")
open class DeleteAccountRole : RequestBase(), IReturn<IdResponse>
{
    /**
    * Role template id (from get_account_team_roles) to delete.
    */
    @ApiMember(Description="Role template id (from get_account_team_roles) to delete.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DeleteAccountRole.responseType
}

/**
* Gets account team members (collaborators)
*/
@Route(Path="/{version}/account/collaborators", Verbs="GET")
@Api(Description="Gets account team members (collaborators)")
open class GetAccountCollaborators : RequestBase(), IReturn<GetAccountCollaboratorsResponse>
{
    /**
    * Set true to also include the account owner in the list.
    */
    @ApiMember(Description="Set true to also include the account owner in the list.")
    open var includeAccountOwner:Boolean? = null

    /**
    * Set true to only return members that have a registered push device.
    */
    @ApiMember(Description="Set true to only return members that have a registered push device.")
    open var userShouldHavePushDevice:Boolean? = null

    /**
    * Optional project id — only members with access to that project.
    */
    @ApiMember(Description="Optional project id — only members with access to that project.")
    open var projectId:String? = null

    /**
    * Optional filter: only these user ids.
    */
    @ApiMember(Description="Optional filter: only these user ids.")
    open var userIds:ArrayList<String>? = null

    /**
    * Optional filter: only members having one of these role names.
    */
    @ApiMember(Description="Optional filter: only members having one of these role names.")
    open var roleNames:ArrayList<String>? = null

    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetAccountCollaboratorsResponse::class.java }
    override fun getResponseType(): Any? = GetAccountCollaborators.responseType
}

@Route(Path="/{version}/account/team/password-policy", Verbs="GET")
open class GetAccountPasswordPolicy : RequestBase(), IReturn<GetAccountPasswordPolicyResponse>
{
    companion object { private val responseType = GetAccountPasswordPolicyResponse::class.java }
    override fun getResponseType(): Any? = GetAccountPasswordPolicy.responseType
}

@Route(Path="/{version}/account/team/policies", Verbs="GET")
open class GetAccountTeamPolicies : RequestBase(), IReturn<GetAccountTeamPoliciesResponse>
{
    companion object { private val responseType = GetAccountTeamPoliciesResponse::class.java }
    override fun getResponseType(): Any? = GetAccountTeamPolicies.responseType
}

@Route(Path="/{version}/account/team/roles", Verbs="GET")
open class GetAccountTeamRoles : RequestBase(), IReturn<GetAccountTeamRolesResponse>
{
    companion object { private val responseType = GetAccountTeamRolesResponse::class.java }
    override fun getResponseType(): Any? = GetAccountTeamRoles.responseType
}

/**
* Send invite to team member
*/
@Route(Path="/{version}/account/team/member/invite", Verbs="POST")
@Api(Description="Send invite to team member")
open class SendInviteToTeamMember : RequestBase(), IReturn<EmptyResponse>
{
    /**
    * Email address the invitation is sent to.
    */
    @ApiMember(Description="Email address the invitation is sent to.", IsRequired=true)
    open var email:String? = null

    /**
    * Account role ids (GUIDs from get_account_team_roles) the member gets on accepting. Omit for the default member role.
    */
    @ApiMember(Description="Account role ids (GUIDs from get_account_team_roles) the member gets on accepting. Omit for the default member role.")
    open var roles:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SendInviteToTeamMember.responseType
}

@Route(Path="/{version}/account/team/policies", Verbs="PUT")
open class UpdateAccountPolicy : RequestBase(), IReturn<IdResponse>
{
    /**
    * Public policy id (from get_account_team_policies) to update.
    */
    @ApiMember(Description="Public policy id (from get_account_team_policies) to update.", IsRequired=true)
    open var id:String? = null

    /**
    * New name for the policy.
    */
    @ApiMember(Description="New name for the policy.", IsRequired=true)
    open var policyName:String? = null

    /**
    * Optional human-readable description of the policy's purpose.
    */
    @ApiMember(Description="Optional human-readable description of the policy's purpose.")
    open var description:String? = null

    /**
    * Raw JSON policy document, AWS-IAM style (Statement array of Effect/Action/Resource entries) — replaces the policy's current statement set.
    */
    @ApiMember(Description="Raw JSON policy document, AWS-IAM style (Statement array of Effect/Action/Resource entries) — replaces the policy's current statement set.")
    open var policyDocumentJson:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdateAccountPolicy.responseType
}

@Route(Path="/{version}/account/team/roles", Verbs="PUT")
open class UpdateAccountRole : RequestBase(), IReturn<IdResponse>
{
    /**
    * Role template id (from get_account_team_roles) to update.
    */
    @ApiMember(Description="Role template id (from get_account_team_roles) to update.", IsRequired=true)
    open var id:String? = null

    /**
    * New name for the role.
    */
    @ApiMember(Description="New name for the role.", IsRequired=true)
    open var roleName:String? = null

    /**
    * Optional human-readable description of the role's purpose.
    */
    @ApiMember(Description="Optional human-readable description of the role's purpose.")
    open var description:String? = null

    /**
    * Public policy ids (from get_account_team_policies) to attach — replaces the current set.
    */
    @ApiMember(Description="Public policy ids (from get_account_team_policies) to attach — replaces the current set.")
    open var policies:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdateAccountRole.responseType
}

@Route(Path="/{version}/account/userauth/has-passkey", Verbs="POST")
@DataContract
open class AccountHasPasskeyRequest : RequestBase(), IReturn<AccountPasskeyOkResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = AccountPasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = AccountHasPasskeyRequest.responseType
}

@Route(Path="/{version}/account/userauth/email/start-verification", Verbs="POST")
@DataContract
open class AccountStartEmailVerificationRequest : RequestBase(), IReturn<AccountPasskeyOkResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = AccountPasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = AccountStartEmailVerificationRequest.responseType
}

@Route(Path="/{version}/account/userauth/email/confirm-verification", Verbs="POST")
@DataContract
open class AccountConfirmEmailVerificationRequest : RequestBase(), IReturn<AccountPasskeyVerificationTokenResponse>
{
    @DataMember
    open var email:String? = null

    @DataMember
    open var code:String? = null
    companion object { private val responseType = AccountPasskeyVerificationTokenResponse::class.java }
    override fun getResponseType(): Any? = AccountConfirmEmailVerificationRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/registration-options", Verbs="POST")
@DataContract
open class AccountPasskeyRegistrationOptionsRequest : RequestBase(), IReturn<AccountPasskeyCeremonyOptionsResponse>
{
    @DataMember
    open var verificationToken:String? = null
    companion object { private val responseType = AccountPasskeyCeremonyOptionsResponse::class.java }
    override fun getResponseType(): Any? = AccountPasskeyRegistrationOptionsRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/verify-registration", Verbs="POST")
@DataContract
open class AccountVerifyPasskeyRegistrationRequest : RequestBase(), IReturn<AccountPasskeyAuthTokensResponse>
{
    @DataMember
    open var verificationToken:String? = null

    @DataMember
    open var ceremonyId:String? = null

    @DataMember
    open var attestationResponse:String? = null

    @DataMember
    open var friendlyName:String? = null
    companion object { private val responseType = AccountPasskeyAuthTokensResponse::class.java }
    override fun getResponseType(): Any? = AccountVerifyPasskeyRegistrationRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/authentication-options", Verbs="POST")
@DataContract
open class AccountPasskeyAuthenticationOptionsRequest : RequestBase(), IReturn<AccountPasskeyCeremonyOptionsResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = AccountPasskeyCeremonyOptionsResponse::class.java }
    override fun getResponseType(): Any? = AccountPasskeyAuthenticationOptionsRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/verify-authentication", Verbs="POST")
@DataContract
open class AccountVerifyPasskeyAuthenticationRequest : RequestBase(), IReturn<AccountPasskeyAuthTokensResponse>
{
    @DataMember
    open var ceremonyId:String? = null

    @DataMember
    open var assertionResponse:String? = null
    companion object { private val responseType = AccountPasskeyAuthTokensResponse::class.java }
    override fun getResponseType(): Any? = AccountVerifyPasskeyAuthenticationRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkeys", Verbs="GET")
@DataContract
open class ListAccountPasskeysRequest : RequestBase(), IReturn<AccountPasskeyListResponse>
{
    companion object { private val responseType = AccountPasskeyListResponse::class.java }
    override fun getResponseType(): Any? = ListAccountPasskeysRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkeys/{CredentialId}/rename", Verbs="POST")
@DataContract
open class RenameAccountPasskeyRequest : RequestBase(), IReturn<AccountPasskeyOkResponse>
{
    @DataMember
    open var credentialId:String? = null

    @DataMember
    open var friendlyName:String? = null
    companion object { private val responseType = AccountPasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RenameAccountPasskeyRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkeys/{CredentialId}/revoke", Verbs="POST")
@DataContract
open class RevokeAccountPasskeyRequest : RequestBase(), IReturn<AccountPasskeyOkResponse>
{
    @DataMember
    open var credentialId:String? = null
    companion object { private val responseType = AccountPasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RevokeAccountPasskeyRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/enrollment-options", Verbs="POST")
@DataContract
open class AccountPasskeyEnrollmentOptionsRequest : RequestBase(), IReturn<AccountPasskeyCeremonyOptionsResponse>
{
    companion object { private val responseType = AccountPasskeyCeremonyOptionsResponse::class.java }
    override fun getResponseType(): Any? = AccountPasskeyEnrollmentOptionsRequest.responseType
}

@Route(Path="/{version}/account/userauth/passkey/verify-enrollment", Verbs="POST")
@DataContract
open class AccountVerifyPasskeyEnrollmentRequest : RequestBase(), IReturn<AccountPasskeyEnrollmentResponse>
{
    @DataMember
    open var ceremonyId:String? = null

    @DataMember
    open var attestationResponse:String? = null

    @DataMember
    open var friendlyName:String? = null
    companion object { private val responseType = AccountPasskeyEnrollmentResponse::class.java }
    override fun getResponseType(): Any? = AccountVerifyPasskeyEnrollmentRequest.responseType
}

@Route(Path="/{version}/account/licensing/dns-status", Verbs="GET")
open class GetLicenseDomainDnsStatus : RequestBase(), IReturn<GetLicenseDomainDnsStatusResponse>
{
    open var domain:String? = null
    companion object { private val responseType = GetLicenseDomainDnsStatusResponse::class.java }
    override fun getResponseType(): Any? = GetLicenseDomainDnsStatus.responseType
}

@Route(Path="/{version}/licensing/domain-verification/start", Verbs="POST")
open class StartLicenseDomainVerificationRequest : RequestBase(), IReturn<StartLicenseDomainVerificationResponse>
{
    open var domain:String? = null
    companion object { private val responseType = StartLicenseDomainVerificationResponse::class.java }
    override fun getResponseType(): Any? = StartLicenseDomainVerificationRequest.responseType
}

@Route(Path="/{version}/licensing/domain-verification/status", Verbs="GET")
open class GetLicenseDomainVerificationStatus : RequestBase(), IReturn<GetLicenseDomainVerificationStatusResponse>
{
    open var domain:String? = null
    companion object { private val responseType = GetLicenseDomainVerificationStatusResponse::class.java }
    override fun getResponseType(): Any? = GetLicenseDomainVerificationStatus.responseType
}

@Route(Path="/{version}/account/licenses", Verbs="GET")
open class GetLicenses : RequestBase(), IReturn<GetLicensesResponse>
{
    companion object { private val responseType = GetLicensesResponse::class.java }
    override fun getResponseType(): Any? = GetLicenses.responseType
}

@Route(Path="/{version}/licensing/heartbeat", Verbs="POST")
open class PostLicenseHeartbeat : RequestBase(), IReturn<PostLicenseHeartbeatResponse>
{
    open var license:String? = null
    open var licenseAccountId:String? = null
    open var installationId:UUID? = null
    open var domain:String? = null
    open var hostKind:String? = null
    open var release:String? = null
    open var instanceVersion:String? = null
    companion object { private val responseType = PostLicenseHeartbeatResponse::class.java }
    override fun getResponseType(): Any? = PostLicenseHeartbeat.responseType
}

@Route(Path="/{version}/account/licensing/status", Verbs="GET")
open class GetInstallationLicenseStatus : RequestBase(), IReturn<GetInstallationLicenseStatusResponse>
{
    companion object { private val responseType = GetInstallationLicenseStatusResponse::class.java }
    override fun getResponseType(): Any? = GetInstallationLicenseStatus.responseType
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
    open var primaryRegion:ProjectRegion? = null
    open var additionalRegions:ArrayList<ProjectRegion>? = null
    open var description:String? = null
    open var isProvisioning:Boolean? = null
}

open class ProjectActivated
{
}

open class ProjectSuspendedByLicense
{
}

open class ProjectResumedFromLicenseSuspension
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

open class ProjectAdminUrlChanged
{
    open var url:DomainUrl? = null
}

open class ProjectLegalDocumentsChanged
{
    open var documents:ProjectLegalDocuments? = null
}

open class ProjectExposeLegalToAdminPortalChanged
{
    open var exposed:Boolean? = null
}

open class ProjectAdminPortalServiceUserAssigned
{
    open var serviceUserId:AuthId? = null
}

open class ProjectAllowedOriginsChanged
{
    open var origins:ArrayList<DomainUrl>? = null
}

open class ProjectEnvironmentCreated
{
    open var env:Env? = null
    open var ranks:HashMap<String,Int> = HashMap<String,Int>()
}

open class ProjectEnvironmentDeleted
{
    open var env:Env? = null
    open var ranks:HashMap<String,Int> = HashMap<String,Int>()
}

open class ProjectEnvironmentRanksChanged
{
    open var ranks:HashMap<String,Int> = HashMap<String,Int>()
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
    open var primaryRegion:ProjectRegion? = null
    open var additionalRegions:ArrayList<ProjectRegion>? = null
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
    open var paymentCustomerRef:PaymentCustomerRef? = null
}

open class SubscriptionChanged
{
    open var subscription:CodeMashManagedServiceSubscription? = null
}

open class SubscriptionCanceled
{
    open var paymentCustomerRef:PaymentCustomerRef? = null
    open var subscriptionId:String? = null
}

open class AccountTeamPolicyCreated
{
    open var policy:MembershipPolicy? = null
}

open class AccountTeamPolicyUpdated
{
    open var policy:MembershipPolicy? = null
}

open class AccountTeamPolicyDeleted
{
    open var policyId:PolicyId? = null
}

open class AccountTeamRoleCreated
{
    open var role:MembershipRole? = null
}

open class AccountTeamRoleUpdated
{
    open var role:MembershipRole? = null
}

open class AccountTeamRoleDeleted
{
    open var roleId:RoleId? = null
}

open class AtlasUsageRecorded
{
    open var record:AtlasUsageRecord? = null
}

open class UsageBillingIngestionFailed
{
    open var failure:UsageIngestionFailure? = null
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

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{Id}/api-keys", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class IssueServiceUserApiKeyRequest : CodeMashRequestBase(), IReturn<IssueServiceUserApiKeyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var scopes:ArrayList<String>? = null

    @DataMember
    open var expiresInDays:Int? = null

    @DataMember
    open var notes:String? = null
    companion object { private val responseType = IssueServiceUserApiKeyResponse::class.java }
    override fun getResponseType(): Any? = IssueServiceUserApiKeyRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{Id}/api-keys", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class ListServiceUserApiKeysRequest : CodeMashRequestBase(), IReturn<ListServiceUserApiKeysResponse>
{
    /**
    * The service user's auth id.
    */
    @DataMember
    @ApiMember(Description="The service user's auth id.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = ListServiceUserApiKeysResponse::class.java }
    override fun getResponseType(): Any? = ListServiceUserApiKeysRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{Id}/api-keys/{KeyId}", Verbs="DELETE")
@Api(Description="Membership")
@DataContract
open class DeleteServiceUserApiKeyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The service user's auth id.
    */
    @DataMember
    @ApiMember(Description="The service user's auth id.", IsRequired=true)
    open var id:String? = null

    /**
    * The key id to delete, from list_service_user_api_keys.
    */
    @DataMember
    @ApiMember(Description="The key id to delete, from list_service_user_api_keys.", IsRequired=true)
    open var keyId:Int? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteServiceUserApiKeyRequest.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}", Verbs="DELETE")
@DataContract
open class DeleteMembershipTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMembershipTrigger.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}/disable", Verbs="PATCH")
@DataContract
open class DisableMembershipTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMembershipTrigger.responseType
}

@Route(Path="/{version}/membership/triggers/{triggerId}/enable", Verbs="PATCH")
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
    /**
    * Display name of the new role, unique within the project.
    */
    @ApiMember(Description="Display name of the new role, unique within the project.", IsRequired=true)
    open var roleName:String? = null

    open var description:String? = null
    /**
    * Policy ids to attach. These are OPAQUE ids from get_policies (e.g. 'pol_3kJ9xJ2mQ0aBcDeFgHiJk') — NEVER invent them or guess from a policy name. Omit this to create a role with no policies and attach them later.
    */
    @ApiMember(Description="Policy ids to attach. These are OPAQUE ids from get_policies (e.g. 'pol_3kJ9xJ2mQ0aBcDeFgHiJk') — NEVER invent them or guess from a policy name. Omit this to create a role with no policies and attach them later.")
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
    /**
    * Id of the role to delete, from get_roles.
    */
    @ApiMember(Description="Id of the role to delete, from get_roles.", IsRequired=true)
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
    /**
    * Role id from get_roles.
    */
    @ApiMember(Description="Role id from get_roles.", IsRequired=true)
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
    /**
    * Id of the role to update, from get_roles.
    */
    @ApiMember(Description="Id of the role to update, from get_roles.", IsRequired=true)
    open var id:String? = null

    /**
    * The role's name — required; resend the current name to keep it.
    */
    @ApiMember(Description="The role's name — required; resend the current name to keep it.", IsRequired=true)
    open var roleName:String? = null

    open var description:String? = null
    /**
    * The complete new list of attached policy ids (full replacement), opaque ids from get_policies (e.g. 'pol_3kJ9xJ2mQ0aBcDeFgHiJk') — never invent or guess them.
    */
    @ApiMember(Description="The complete new list of attached policy ids (full replacement), opaque ids from get_policies (e.g. 'pol_3kJ9xJ2mQ0aBcDeFgHiJk') — never invent or guess them.")
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
    /**
    * Display name of the new policy, unique within the project.
    */
    @ApiMember(Description="Display name of the new policy, unique within the project.", IsRequired=true)
    open var policyName:String? = null

    /**
    * Optional human-readable description of what the policy grants.
    */
    @ApiMember(Description="Optional human-readable description of what the policy grants.")
    open var description:String? = null

    /**
    * AWS-IAM-style policy document as a raw JSON string (an object with a permission statement list) matching PolicyDocument.schema.json. Malformed or invalid documents are rejected before any change is made.
    */
    @ApiMember(Description="AWS-IAM-style policy document as a raw JSON string (an object with a permission statement list) matching PolicyDocument.schema.json. Malformed or invalid documents are rejected before any change is made.")
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
    /**
    * Public policy id, e.g. 'pol_database-read', from get_policies.
    */
    @ApiMember(Description="Public policy id, e.g. 'pol_database-read', from get_policies.", IsRequired=true)
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
    /**
    * Public policy id, e.g. 'pol_database-read', from get_policies.
    */
    @ApiMember(Description="Public policy id, e.g. 'pol_database-read', from get_policies.", IsRequired=true)
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
    /**
    * Public policy id, e.g. 'pol_database-read', from get_policies.
    */
    @ApiMember(Description="Public policy id, e.g. 'pol_database-read', from get_policies.", IsRequired=true)
    open var id:String? = null

    /**
    * The policy's name — required; resend the current name to keep it.
    */
    @ApiMember(Description="The policy's name — required; resend the current name to keep it.", IsRequired=true)
    open var policyName:String? = null

    /**
    * Optional human-readable description of what the policy grants.
    */
    @ApiMember(Description="Optional human-readable description of what the policy grants.")
    open var description:String? = null

    /**
    * AWS-IAM-style policy document as a raw JSON string (an object with a permission statement list) matching PolicyDocument.schema.json — this is a FULL replacement of the policy's current permissions.
    */
    @ApiMember(Description="AWS-IAM-style policy document as a raw JSON string (an object with a permission statement list) matching PolicyDocument.schema.json — this is a FULL replacement of the policy's current permissions.")
    open var policyDocumentJson:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdatePolicy.responseType
}

/**
* Gets the project's passkey authentication settings.
*/
@Route(Path="/{version}/membership/passkey/settings", Verbs="GET")
@Api(Description="Gets the project's passkey authentication settings.")
open class GetPasskeySettings : CodeMashRequestBase(), IReturn<GetPasskeySettingsResponse>
{
    companion object { private val responseType = GetPasskeySettingsResponse::class.java }
    override fun getResponseType(): Any? = GetPasskeySettings.responseType
}

/**
* Saves the project's passkey authentication settings.
*/
@Route(Path="/{version}/membership/passkey/settings", Verbs="POST")
@Api(Description="Saves the project's passkey authentication settings.")
open class SavePasskeySettings : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Whether the email + passkey sign-in flow is enabled for the project.
    */
    @ApiMember(Description="Whether the email + passkey sign-in flow is enabled for the project.")
    open var enabled:Boolean? = null

    /**
    * Email verification code lifetime, in minutes. Allowed range: 3-15.
    */
    @ApiMember(Description="Email verification code lifetime, in minutes. Allowed range: 3-15.")
    open var codeTtlMinutes:Int? = null

    /**
    * Maximum passkeys a single user may register. Allowed range: 1-20.
    */
    @ApiMember(Description="Maximum passkeys a single user may register. Allowed range: 1-20.")
    open var maxCredentialsPerUser:Int? = null

    /**
    * Number of recovery codes generated at signup. Allowed range: 5-20.
    */
    @ApiMember(Description="Number of recovery codes generated at signup. Allowed range: 5-20.")
    open var recoveryCodeCount:Int? = null

    /**
    * Whether recovery codes are generated automatically at signup.
    */
    @ApiMember(Description="Whether recovery codes are generated automatically at signup.")
    open var generateRecoveryCodesAtSignup:Boolean? = null

    /**
    * Accepted authenticator types: 'Any', 'Platform', or 'CrossPlatform'.
    */
    @ApiMember(Description="Accepted authenticator types: 'Any', 'Platform', or 'CrossPlatform'.")
    open var authenticatorAttachment:String? = null

    /**
    * Per-project opt-in for magic-link account recovery (off by default).
    */
    @ApiMember(Description="Per-project opt-in for magic-link account recovery (off by default).")
    open var allowMagicLinkRecovery:Boolean? = null

    /**
    * Absolute refresh-token lifetime, in days. Allowed range: 7-90.
    */
    @ApiMember(Description="Absolute refresh-token lifetime, in days. Allowed range: 7-90.")
    open var refreshTokenTtlDays:Int? = null

    /**
    * Optional explicit WebAuthn RP-ID — a bare DNS host (e.g. 'app.example.com', no scheme/port/path). Leave null/empty to derive it from the project's CORS origins. WARNING: changing this value invalidates every existing passkey on the project — set it once before going live and avoid changing it afterward.
    */
    @ApiMember(Description="Optional explicit WebAuthn RP-ID — a bare DNS host (e.g. 'app.example.com', no scheme/port/path). Leave null/empty to derive it from the project's CORS origins. WARNING: changing this value invalidates every existing passkey on the project — set it once before going live and avoid changing it afterward.")
    open var rpId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SavePasskeySettings.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}", Verbs="DELETE")
open class DeleteMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_membership_integrations.
    */
    @ApiMember(Description="Integration id, from get_membership_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/disable", Verbs="PUT")
open class DisableMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_membership_integrations.
    */
    @ApiMember(Description="Integration id, from get_membership_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/enable", Verbs="PUT")
open class EnableMembershipIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_membership_integrations.
    */
    @ApiMember(Description="Integration id, from get_membership_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMembershipIntegrationRequest.responseType
}

@Route(Path="/{version}/membership/integrations/{id}", Verbs="GET")
open class GetMembershipIntegration : CodeMashRequestBase(), IReturn<GetMembershipIntegrationResponse>
{
    /**
    * Integration id, from get_membership_integrations.
    */
    @ApiMember(Description="Integration id, from get_membership_integrations.", IsRequired=true)
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
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:MembershipIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMembershipIntegration.responseType
}

@Route(Path="/{version}/membership/integrations/{Id}/default", Verbs="PUT")
open class SetMembershipIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_membership_integrations.
    */
    @ApiMember(Description="Integration id, from get_membership_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetMembershipIntegrationAsDefaultRequest.responseType
}

/**
* Gets the project's membership authorization (role-assignment) settings.
*/
@Route(Path="/{version}/membership/authorization", Verbs="GET")
@Api(Description="Gets the project's membership authorization (role-assignment) settings.")
open class GetAuthorizationSettings : CodeMashRequestBase(), IReturn<GetAuthorizationSettingsResponse>
{
    companion object { private val responseType = GetAuthorizationSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetAuthorizationSettings.responseType
}

/**
* Updates the project's membership authorization settings.
*/
@Route(Path="/{version}/membership/authorization", Verbs="PUT")
@Api(Description="Updates the project's membership authorization settings.")
open class UpdateAuthorizationSettings : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var setting:String? = null
    open var defaultRoles:ArrayList<String>? = null
    open var allowedRegistrationRoles:ArrayList<String>? = null
    open var allowGuestUsers:Boolean? = null
    open var guestCleanupPeriodDays:Int? = null
    open var userRegistersAsRole:String? = null
    open var guestRegistersAsRole:String? = null
    open var allowedRegisterRoles:ArrayList<String>? = null
    open var needVerification:Boolean? = null
    open var verificationEmailTemplate:String? = null
    open var deactivationEmailTemplate:String? = null
    open var allowInviteUsers:Boolean? = null
    open var allowDeactivateUsers:Boolean? = null
    open var inviteUserEmailTemplate:String? = null
    open var invitationExpiration:Int? = null
    open var emailVerificationExpiration:Int? = null
    open var deactivationExpiration:Int? = null
    open var defaultSubscribeToNews:Boolean? = null
    open var minLength:Int? = null
    open var maxLength:Int? = null
    open var minNumbers:Int? = null
    open var maxNumbers:Int? = null
    open var minUpper:Int? = null
    open var maxUpper:Int? = null
    open var minLower:Int? = null
    open var maxLower:Int? = null
    open var minSpecial:Int? = null
    open var maxSpecial:Int? = null
    open var allowedSpecial:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateAuthorizationSettings.responseType
}

/**
* Updates the project's membership password complexity policy.
*/
@Route(Path="/{version}/membership/authorization/password-complexity", Verbs="PUT")
@Api(Description="Updates the project's membership password complexity policy.")
open class UpdatePasswordComplexity : CodeMashRequestBase(), IReturn<UpdatePasswordComplexityResponse>
{
    /**
    * Minimum password length.
    */
    @ApiMember(Description="Minimum password length.")
    open var minLength:Int? = null

    /**
    * Maximum password length, if capped.
    */
    @ApiMember(Description="Maximum password length, if capped.")
    open var maxLength:Int? = null

    /**
    * Minimum number of numeric characters required.
    */
    @ApiMember(Description="Minimum number of numeric characters required.")
    open var minNumbers:Int? = null

    /**
    * Maximum number of numeric characters allowed.
    */
    @ApiMember(Description="Maximum number of numeric characters allowed.")
    open var maxNumbers:Int? = null

    /**
    * Minimum number of uppercase characters required.
    */
    @ApiMember(Description="Minimum number of uppercase characters required.")
    open var minUpper:Int? = null

    /**
    * Maximum number of uppercase characters allowed.
    */
    @ApiMember(Description="Maximum number of uppercase characters allowed.")
    open var maxUpper:Int? = null

    /**
    * Minimum number of lowercase characters required.
    */
    @ApiMember(Description="Minimum number of lowercase characters required.")
    open var minLower:Int? = null

    /**
    * Maximum number of lowercase characters allowed.
    */
    @ApiMember(Description="Maximum number of lowercase characters allowed.")
    open var maxLower:Int? = null

    /**
    * Minimum number of special characters required.
    */
    @ApiMember(Description="Minimum number of special characters required.")
    open var minSpecial:Int? = null

    /**
    * Maximum number of special characters allowed.
    */
    @ApiMember(Description="Maximum number of special characters allowed.")
    open var maxSpecial:Int? = null

    /**
    * The set of characters counted as 'special', if restricted.
    */
    @ApiMember(Description="The set of characters counted as 'special', if restricted.")
    open var allowedSpecial:String? = null
    companion object { private val responseType = UpdatePasswordComplexityResponse::class.java }
    override fun getResponseType(): Any? = UpdatePasswordComplexity.responseType
}

/**
* Gets the project's configured membership authentication sign-in flows.
*/
@Route(Path="/{version}/membership/authentication", Verbs="GET")
@Api(Description="Gets the project's configured membership authentication sign-in flows.")
open class GetAuthenticationSettings : CodeMashRequestBase(), IReturn<GetAuthenticationSettingsResponse>
{
    companion object { private val responseType = GetAuthenticationSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetAuthenticationSettings.responseType
}

/**
* Updates the project's membership authentication preferences.
*/
@Route(Path="/{version}/membership/authentication", Verbs="PUT")
@Api(Description="Updates the project's membership authentication preferences.")
open class UpdateAuthenticationSettings : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Default URL to redirect end users to after logout.
    */
    @ApiMember(Description="Default URL to redirect end users to after logout.")
    open var logoutUrl:String? = null

    /**
    * Whether end users may sign in with a username in addition to email.
    */
    @ApiMember(Description="Whether end users may sign in with a username in addition to email.")
    open var allowUsernames:Boolean? = null

    /**
    * Per-authentication-mode logout URL overrides.
    */
    @ApiMember(Description="Per-authentication-mode logout URL overrides.")
    open var modes:ArrayList<CredentialsSettingsModeDto>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateAuthenticationSettings.responseType
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
    open var env:Env? = null
}

open class MembershipIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class MembershipIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MembershipIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class MembershipIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MembershipIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
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

open class MembershipTriggerMirrored
{
    open var trigger:Trigger? = null
}

open class MembershipTriggerEnabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class MembershipTriggerDisabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class MembershipTriggerDeleted : TriggerByIdEventBase()
{
    open var env:Env? = null
}

/**
* Disable database service
*/
@Route(Path="/{version}/database/disable", Verbs="GET")
@Api(Description="Disable database service")
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

/**
* Delete database trigger
*/
@Route(Path="/{version}/database/schemas/triggers/{triggerId}", Verbs="DELETE")
@Api(Description="Delete database trigger")
@DataContract
open class DeleteSchemaTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSchemaTrigger.responseType
}

/**
* Disable database trigger
*/
@Route(Path="/{version}/database/schemas/triggers/{triggerId}/disable", Verbs="PATCH")
@Api(Description="Disable database trigger")
@DataContract
open class DisableSchemaTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableSchemaTrigger.responseType
}

/**
* Enable database trigger
*/
@Route(Path="/{version}/database/schemas/triggers/{triggerId}/enable", Verbs="PATCH")
@Api(Description="Enable database trigger")
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
    companion object { private val responseType = GetSchemaTriggersResponse::class.java }
    override fun getResponseType(): Any? = GetSchemaTriggers.responseType
}

@Route(Path="/{version}/database/schemas/triggers", Verbs="POST")
@DataContract
open class SaveSchemaTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveSchemaTrigger.responseType
}

/**
* Delete database taxonomy
*/
@Route(Path="/{version}/database/taxonomies/{Id}", Verbs="DELETE")
@Api(Description="Delete database taxonomy")
open class DeleteDatabaseTaxonomyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Taxonomy id to delete, from get_database_taxonomies.
    */
    @ApiMember(Description="Taxonomy id to delete, from get_database_taxonomies.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseTaxonomyRequest.responseType
}

/**
* Gets database taxonomy by id
*/
@Route(Path="/{version}/database/taxonomies/{id}", Verbs="GET")
@Api(Description="Gets database taxonomy by id")
open class GetDatabaseTaxonomy : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyResponse>
{
    /**
    * Taxonomy id from get_database_taxonomies.
    */
    @ApiMember(Description="Taxonomy id from get_database_taxonomies.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomy.responseType
}

/**
* Gets database taxonomies
*/
@Route(Path="/{version}/database/taxonomies", Verbs="GET")
@Api(Description="Gets database taxonomies")
open class GetDatabaseTaxonomies : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseTaxonomiesResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseTaxonomiesResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomies.responseType
}

/**
* Returns the single-parent taxonomy structure tree
*/
@Route(Path="/{version}/database/taxonomies/tree", Verbs="GET")
@Api(Description="Returns the single-parent taxonomy structure tree")
@DataContract
open class GetDatabaseTaxonomyTreeRequest : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyTreeResponse>
{
    /**
    * When true, each taxonomy node also carries its own term tree (heavier response).
    */
    @DataMember
    @ApiMember(Description="When true, each taxonomy node also carries its own term tree (heavier response).")
    open var includeTerms:Boolean? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyTreeResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomyTreeRequest.responseType
}

/**
* Creates or updates a database taxonomy
*/
@Route(Path="/{version}/database/taxonomies", Verbs="POST")
@Api(Description="Creates or updates a database taxonomy")
@DataContract
open class SaveDatabaseTaxonomyRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Empty to create a new taxonomy; set to an existing taxonomy id (from get_database_taxonomies) to update it.
    */
    @DataMember
    @ApiMember(Description="Empty to create a new taxonomy; set to an existing taxonomy id (from get_database_taxonomies) to update it.")
    open var viewId:String? = null

    /**
    * Human-entered taxonomy title (e.g. "Countries"); a slug is derived server-side.
    */
    @DataMember
    @ApiMember(Description="Human-entered taxonomy title (e.g. \"Countries\"); a slug is derived server-side.", IsRequired=true)
    open var taxonomyName:String? = null

    /**
    * Optional free-text description of the taxonomy.
    */
    @DataMember
    @ApiMember(Description="Optional free-text description of the taxonomy.")
    open var description:String? = null

    /**
    * Optional raw JSON string (Norbix data meta-schema) describing custom meta fields for terms in this taxonomy. Omit to leave the taxonomy structural-only.
    */
    @DataMember
    @ApiMember(Description="Optional raw JSON string (Norbix data meta-schema) describing custom meta fields for terms in this taxonomy. Omit to leave the taxonomy structural-only.")
    open var termsMetaDataSchema:String? = null

    /**
    * Optional raw JSON string (Norbix UI/visual meta-schema) describing the term meta edit form.
    */
    @DataMember
    @ApiMember(Description="Optional raw JSON string (Norbix UI/visual meta-schema) describing the term meta edit form.")
    open var termsMetaVisualSchema:String? = null

    /**
    * Optional parent taxonomy id. The child taxonomy points to its parent — e.g. set the Countries taxonomy's parentId to the Regions taxonomy id so each country term can be parented by a region term. Omit for a root taxonomy.
    */
    @DataMember
    @ApiMember(Description="Optional parent taxonomy id. The child taxonomy points to its parent — e.g. set the Countries taxonomy's parentId to the Regions taxonomy id so each country term can be parented by a region term. Omit for a root taxonomy.")
    open var parentId:String? = null

    /**
    * Optional list of other taxonomy ids this taxonomy depends on for multi-parent terms. Omit for a self-contained taxonomy.
    */
    @DataMember
    @ApiMember(Description="Optional list of other taxonomy ids this taxonomy depends on for multi-parent terms. Omit for a self-contained taxonomy.")
    open var dependencies:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseTaxonomyRequest.responseType
}

/**
* Delete a single term from a taxonomy by id
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="DELETE")
@Api(Description="Delete a single term from a taxonomy by id")
@DataContract
open class DeleteDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Taxonomy id that owns the term, from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy id that owns the term, from get_database_taxonomies.", IsRequired=true)
    open var taxonomyId:String? = null

    /**
    * Term id to delete, from get_database_taxonomy_term_tree.
    */
    @DataMember
    @ApiMember(Description="Term id to delete, from get_database_taxonomy_term_tree.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseTaxonomyTermRequest.responseType
}

/**
* Delete many terms in a taxonomy matching the given filter
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/many", Verbs="DELETE")
@Api(Description="Delete many terms in a taxonomy matching the given filter")
@DataContract
open class DeleteManyDatabaseTaxonomyTermsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Taxonomy id whose terms to delete, from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy id whose terms to delete, from get_database_taxonomies.", IsRequired=true)
    open var taxonomyId:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null

    /**
    * MongoDB extended-JSON match filter (a raw JSON object, e.g. {"active":false}) selecting which terms to delete. Automatically ANDed server-side with the taxonomyId, so it cannot affect other taxonomies.
    */
    @DataMember
    @ApiMember(Description="MongoDB extended-JSON match filter (a raw JSON object, e.g. {\"active\":false}) selecting which terms to delete. Automatically ANDed server-side with the taxonomyId, so it cannot affect other taxonomies.", IsRequired=true)
    open var filter:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteManyDatabaseTaxonomyTermsRequest.responseType
}

/**
* Get a single term from a taxonomy by id
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="GET")
@Api(Description="Get a single term from a taxonomy by id")
@DataContract
open class GetDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyTermResponse>
{
    /**
    * Taxonomy id from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy id from get_database_taxonomies.", IsRequired=true)
    open var taxonomyId:String? = null

    /**
    * Term id from get_database_taxonomy_term_tree.
    */
    @DataMember
    @ApiMember(Description="Term id from get_database_taxonomy_term_tree.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyTermResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomyTermRequest.responseType
}

/**
* Returns a merged term tree across a taxonomy and its child taxonomies
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyName}/merged-tree", Verbs="GET")
@Api(Description="Returns a merged term tree across a taxonomy and its child taxonomies")
@DataContract
open class GetDatabaseMergedTermTreeRequest : CodeMashRequestBase(), IReturn<GetDatabaseMergedTermTreeResponse>
{
    /**
    * Root taxonomy slug/name (from get_database_taxonomies). Its terms are the roots; child-taxonomy terms nest under them.
    */
    @DataMember
    @ApiMember(Description="Root taxonomy slug/name (from get_database_taxonomies). Its terms are the roots; child-taxonomy terms nest under them.", IsRequired=true)
    open var taxonomyName:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetDatabaseMergedTermTreeResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseMergedTermTreeRequest.responseType
}

/**
* Returns the whole term tree of a taxonomy (or a sub-tree) in one call
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyName}/terms/tree", Verbs="GET")
@Api(Description="Returns the whole term tree of a taxonomy (or a sub-tree) in one call")
@DataContract
open class GetDatabaseTaxonomyTermTreeRequest : CodeMashRequestBase(), IReturn<GetDatabaseTaxonomyTermTreeResponse>
{
    /**
    * Taxonomy slug/name to fetch the term tree for, from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy slug/name to fetch the term tree for, from get_database_taxonomies.", IsRequired=true)
    open var taxonomyName:String? = null

    /**
    * Optional term id to root the returned tree at a sub-tree instead of the whole taxonomy.
    */
    @DataMember
    @ApiMember(Description="Optional term id to root the returned tree at a sub-tree instead of the whole taxonomy.")
    open var rootTermId:String? = null

    /**
    * Optional maximum depth to return below the root.
    */
    @DataMember
    @ApiMember(DataType="integer", Description="Optional maximum depth to return below the root.")
    open var depth:Int? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetDatabaseTaxonomyTermTreeResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseTaxonomyTermTreeRequest.responseType
}

/**
* Insert a single term into a taxonomy
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms", Verbs="POST")
@Api(Description="Insert a single term into a taxonomy")
@DataContract
open class SaveDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Taxonomy id to insert the term into, from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy id to insert the term into, from get_database_taxonomies.", IsRequired=true)
    open var taxonomyId:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null

    /**
    * The term to insert, as a MongoDB extended-JSON document string (a raw JSON object). Supported term fields: name (string, or a {lang:value} map — required); description; order (integer sort position, lower shows first — omit for unordered); parentId (id of the single parent term); multiParents ("additional categories": array of {taxonomyId, parentId}). The server stamps taxonomyId/taxonomyName automatically — do not include them. Example: {"name":"France","order":1}.
    */
    @DataMember
    @ApiMember(Description="The term to insert, as a MongoDB extended-JSON document string (a raw JSON object). Supported term fields: name (string, or a {lang:value} map — required); description; order (integer sort position, lower shows first — omit for unordered); parentId (id of the single parent term); multiParents (\"additional categories\": array of {taxonomyId, parentId}). The server stamps taxonomyId/taxonomyName automatically — do not include them. Example: {\"name\":\"France\",\"order\":1}.", IsRequired=true)
    open var document:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseTaxonomyTermRequest.responseType
}

/**
* Update a single term in a taxonomy by id
*/
@Route(Path="/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}", Verbs="PUT")
@Api(Description="Update a single term in a taxonomy by id")
@DataContract
open class UpdateDatabaseTaxonomyTermRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Taxonomy id that owns the term, from get_database_taxonomies.
    */
    @DataMember
    @ApiMember(Description="Taxonomy id that owns the term, from get_database_taxonomies.", IsRequired=true)
    open var taxonomyId:String? = null

    /**
    * Term id to update, from get_database_taxonomy_term_tree.
    */
    @DataMember
    @ApiMember(Description="Term id to update, from get_database_taxonomy_term_tree.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null

    /**
    * Partial update document as MongoDB extended-JSON (a raw JSON object of fields to change), applied with $set — only the given fields change. Updatable term fields: name (string or {lang:value} map); description; order (integer sort position, lower shows first — use this to numerate/rank terms; set null to clear); parentId (single parent term id — a term from THIS taxonomy's parent taxonomy; e.g. link a country to its region by setting the country term's parentId to the region term id); multiParents ("additional categories": array of {taxonomyId, parentId}). Example to rank a term: {"order":1}.
    */
    @DataMember
    @ApiMember(Description="Partial update document as MongoDB extended-JSON (a raw JSON object of fields to change), applied with $set — only the given fields change. Updatable term fields: name (string or {lang:value} map); description; order (integer sort position, lower shows first — use this to numerate/rank terms; set null to clear); parentId (single parent term id — a term from THIS taxonomy's parent taxonomy; e.g. link a country to its region by setting the country term's parentId to the region term id); multiParents (\"additional categories\": array of {taxonomyId, parentId}). Example to rank a term: {\"order\":1}.", IsRequired=true)
    open var update:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseTaxonomyTermRequest.responseType
}

/**
* Creates every collection and taxonomy of a compiled IF bundle, linked and published
*/
@Route(Path="/{version}/database/schemas/apply-bundle", Verbs="POST")
@Api(Description="Creates every collection and taxonomy of a compiled IF bundle, linked and published")
@DataContract
open class ApplyDatabaseSchemaBundleRequest : CodeMashRequestBase(), IReturn<ApplyDatabaseSchemaBundleResponse>
{
    /**
    * Comma-separated catalog entity ids to create from the reviewed catalog (e.g. "blog_posts,comments"). The usual input.
    */
    @DataMember
    @ApiMember(Description="Comma-separated catalog entity ids to create from the reviewed catalog (e.g. \"blog_posts,comments\"). The usual input.")
    open var entities:String? = null

    /**
    * Only for entities the catalog lacks: one IF entity object or an array of IF objects (JSON string). May also hold catalog refs with add_fields / remove_fields.
    */
    @DataMember
    @ApiMember(Description="Only for entities the catalog lacks: one IF entity object or an array of IF objects (JSON string). May also hold catalog refs with add_fields / remove_fields.")
    open var bundleJson:String? = null

    /**
    * Field tier to compile: minimal | standard (default) | extended.
    */
    @DataMember
    @ApiMember(Description="Field tier to compile: minimal | standard (default) | extended.")
    open var tier:String? = null

    /**
    * true = mark free-text fields (title, body, excerpt …) translatable for multilingual content. Default false.
    */
    @DataMember
    @ApiMember(Description="true = mark free-text fields (title, body, excerpt …) translatable for multilingual content. Default false.")
    open var translatable:Boolean? = null

    /**
    * false = leave every collection as a draft instead of publishing v1. Default true.
    */
    @DataMember
    @ApiMember(Description="false = leave every collection as a draft instead of publishing v1. Default true.")
    open var publish:Boolean? = null
    companion object { private val responseType = ApplyDatabaseSchemaBundleResponse::class.java }
    override fun getResponseType(): Any? = ApplyDatabaseSchemaBundleRequest.responseType
}

/**
* Delete database schema (collection)
*/
@Route(Path="/{version}/database/schemas/{Id}", Verbs="DELETE")
@Api(Description="Delete database schema (collection)")
open class DeleteDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id to delete, from get_database_schemas.
    */
    @ApiMember(Description="Schema id to delete, from get_database_schemas.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseSchemaRequest.responseType
}

/**
* Discards the working-copy draft of a database schema without publishing
*/
@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="DELETE")
@Api(Description="Discards the working-copy draft of a database schema without publishing")
@DataContract
open class DiscardDatabaseSchemaDraftRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id whose draft to discard, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id whose draft to discard, from get_database_schemas.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DiscardDatabaseSchemaDraftRequest.responseType
}

/**
* Gets database schema by id
*/
@Route(Path="/{version}/database/schemas/{id}", Verbs="GET")
@Api(Description="Gets database schema by id")
@DataContract
open class GetDatabaseSchema : CodeMashRequestBase(), IReturn<GetDatabaseSchemaResponse>
{
    /**
    * Schema id from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional published version number to pin; omit for the latest published version.
    */
    @DataMember(Name="version")
    @SerializedName("version")
    @ApiMember(DataType="integer", Description="Optional published version number to pin; omit for the latest published version.", Name="version", ParameterType="query")
    open var schemaVersion:Int? = null
    companion object { private val responseType = GetDatabaseSchemaResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchema.responseType
}

/**
* Gets database schemas (collections)
*/
@Route(Path="/{version}/database/schemas", Verbs="GET")
@Api(Description="Gets database schemas (collections)")
open class GetDatabaseSchemas : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseSchemasResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseSchemasResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemas.responseType
}

/**
* Gets the current draft of a database schema
*/
@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="GET")
@Api(Description="Gets the current draft of a database schema")
@DataContract
open class GetDatabaseSchemaDraft : CodeMashRequestBase(), IReturn<GetDatabaseSchemaDraftResponse>
{
    /**
    * Schema id from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id from get_database_schemas.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetDatabaseSchemaDraftResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaDraft.responseType
}

/**
* Gets database schema records-list display settings
*/
@Route(Path="/{version}/database/schemas/{Id}/list-settings", Verbs="GET")
@Api(Description="Gets database schema records-list display settings")
@DataContract
open class GetDatabaseSchemaListSettings : CodeMashRequestBase(), IReturn<GetDatabaseSchemaListSettingsResponse>
{
    /**
    * Schema id from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id from get_database_schemas.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetDatabaseSchemaListSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaListSettings.responseType
}

/**
* Structural diff between two published versions of a database schema
*/
@Route(Path="/{version}/database/schemas/{Id}/versions/diff", Verbs="GET")
@Api(Description="Structural diff between two published versions of a database schema")
@DataContract
open class GetDatabaseSchemaVersionDiff : CodeMashRequestBase(), IReturn<GetDatabaseSchemaVersionDiffResponse>
{
    /**
    * Schema id from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * Earlier published version number to diff from. Get valid values from get_database_schema_versions.
    */
    @DataMember
    @ApiMember(DataType="integer", Description="Earlier published version number to diff from. Get valid values from get_database_schema_versions.", IsRequired=true)
    open var fromVersion:Int? = null

    /**
    * Later published version number to diff to. Get valid values from get_database_schema_versions.
    */
    @DataMember
    @ApiMember(DataType="integer", Description="Later published version number to diff to. Get valid values from get_database_schema_versions.", IsRequired=true)
    open var toVersion:Int? = null
    companion object { private val responseType = GetDatabaseSchemaVersionDiffResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaVersionDiff.responseType
}

/**
* Lists published version summaries for a database schema
*/
@Route(Path="/{version}/database/schemas/{Id}/versions", Verbs="GET")
@Api(Description="Lists published version summaries for a database schema")
@DataContract
open class GetDatabaseSchemaVersions : CodeMashRequestBase(), IReturn<GetDatabaseSchemaVersionsResponse>
{
    /**
    * Schema id from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id from get_database_schemas.", IsRequired=true)
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

    @DataMember
    open var confirmed:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PublishDatabaseSchemaRequest.responseType
}

/**
* Renames a database schema (collection)
*/
@Route(Path="/{version}/database/schemas/{Id}/rename", Verbs="PUT")
@Api(Description="Renames a database schema (collection)")
@DataContract
open class RenameDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id to rename, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id to rename, from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * New human-entered title (e.g. "Company Employees"); the slug is derived server-side.
    */
    @DataMember
    @ApiMember(Description="New human-entered title (e.g. \"Company Employees\"); the slug is derived server-side.", IsRequired=true)
    open var title:String? = null

    /**
    * When true (default), rejects the rename if another schema already owns the derived slug. Leave true unless explicitly asked to bypass the uniqueness check.
    */
    @DataMember
    @ApiMember(Description="When true (default), rejects the rename if another schema already owns the derived slug. Leave true unless explicitly asked to bypass the uniqueness check.")
    open var renameUniqueName:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RenameDatabaseSchemaRequest.responseType
}

@Route(Path="/{version}/database/schemas", Verbs="POST")
@DataContract
open class SaveDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Empty to create a new schema; set to an existing schema id (from get_database_schemas) to update its draft.
    */
    @DataMember
    @ApiMember(Description="Empty to create a new schema; set to an existing schema id (from get_database_schemas) to update its draft.")
    open var viewId:String? = null

    /**
    * Human-entered schema title (e.g. "Company Employees"); a slug is derived server-side.
    */
    @DataMember
    @ApiMember(Description="Human-entered schema title (e.g. \"Company Employees\"); a slug is derived server-side.", IsRequired=true)
    open var schemaName:String? = null

    /**
    * Raw JSON string matching the Norbix data meta-schema (https://norbix.ai/schemas/meta/v1.json). When unsure of the shape, read an existing schema with get_database_schema first.
    */
    @DataMember
    @ApiMember(Description="Raw JSON string matching the Norbix data meta-schema (https://norbix.ai/schemas/meta/v1.json). When unsure of the shape, read an existing schema with get_database_schema first.")
    open var dataSchema:String? = null

    /**
    * OPTIONAL raw JSON string matching the Norbix UI/visual meta-schema (https://norbix.ai/schemas/ui/v1.json), describing the record form layout. If omitted or invalid, the backend auto-generates a flat-list form from the data schema; provide it to control the layout.
    */
    @DataMember
    @ApiMember(Description="OPTIONAL raw JSON string matching the Norbix UI/visual meta-schema (https://norbix.ai/schemas/ui/v1.json), describing the record form layout. If omitted or invalid, the backend auto-generates a flat-list form from the data schema; provide it to control the layout.")
    open var visualSchema:String? = null

    /**
    * Optional schema-level settings (e.g. record validation behavior).
    */
    @DataMember
    @ApiMember(Description="Optional schema-level settings (e.g. record validation behavior).")
    open var settings:SchemaSettingsDto? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseSchemaRequest.responseType
}

/**
* Saves the working-copy draft of a database schema
*/
@Route(Path="/{version}/database/schemas/{Id}/draft", Verbs="PUT")
@Api(Description="Saves the working-copy draft of a database schema")
@DataContract
open class UpdateDatabaseSchemaDraftRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id whose draft to replace, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id whose draft to replace, from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * Raw JSON string matching the Norbix data meta-schema (https://norbix.ai/schemas/meta/v1.json) for the draft's data schema.
    */
    @DataMember
    @ApiMember(Description="Raw JSON string matching the Norbix data meta-schema (https://norbix.ai/schemas/meta/v1.json) for the draft's data schema.")
    open var dataSchema:String? = null

    /**
    * Raw JSON string matching the Norbix UI/visual meta-schema (https://norbix.ai/schemas/ui/v1.json) for the draft's record form.
    */
    @DataMember
    @ApiMember(Description="Raw JSON string matching the Norbix UI/visual meta-schema (https://norbix.ai/schemas/ui/v1.json) for the draft's record form.")
    open var visualSchema:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseSchemaDraftRequest.responseType
}

/**
* Updates database schema records-list display settings
*/
@Route(Path="/{version}/database/schemas/{Id}/list-settings", Verbs="PUT")
@Api(Description="Updates database schema records-list display settings")
@DataContract
open class UpdateDatabaseSchemaListSettingsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id whose list settings to update, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id whose list settings to update, from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * The complete new list settings object (full replace).
    */
    @DataMember
    @ApiMember(Description="The complete new list settings object (full replace).", IsRequired=true)
    open var settings:SchemaListSettingsDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseSchemaListSettingsRequest.responseType
}

/**
* Updates database schema settings
*/
@Route(Path="/{version}/database/schemas/{Id}/settings", Verbs="PUT")
@Api(Description="Updates database schema settings")
@DataContract
open class UpdateDatabaseSchemaSettingsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Schema id whose settings to update, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id whose settings to update, from get_database_schemas.", IsRequired=true)
    open var id:String? = null

    /**
    * The new schema settings object.
    */
    @DataMember
    @ApiMember(Description="The new schema settings object.", IsRequired=true)
    open var settings:SchemaSettingsDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateDatabaseSchemaSettingsRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/aggregate", Verbs="POST")
@Api(Description="Database")
open class AggregateRecords : CodeMashRequestBase(), IReturn<AggregateRecordsResponse>
{
    /**
    * The collection (schema) name to run the aggregation against.
    */
    @ApiMember(Description="The collection (schema) name to run the aggregation against.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The aggregation pipeline as a MongoDB extended-JSON array of stages.
    */
    @ApiMember(Description="The aggregation pipeline as a MongoDB extended-JSON array of stages.", IsRequired=true)
    open var pipeline:String? = null
    companion object { private val responseType = AggregateRecordsResponse::class.java }
    override fun getResponseType(): Any? = AggregateRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}/responsibility", Verbs="PUT")
@Api(Description="Database")
open class ChangeRecordResponsibility : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the record lives in.
    */
    @ApiMember(Description="The collection (schema) name the record lives in.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The id of the record whose responsibility changes.
    */
    @ApiMember(Description="The id of the record whose responsibility changes.", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The new responsible user (owner) id.
    */
    @ApiMember(Description="The new responsible user (owner) id.", IsRequired=true)
    open var newResponsibleUserId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ChangeRecordResponsibility.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/count", Verbs="GET")
@Api(Description="Database")
open class CountRecords : CodeMashRequestBase(), IReturn<CountRecordsResponse>
{
    /**
    * The collection (schema) name to count records in.
    */
    @ApiMember(Description="The collection (schema) name to count records in.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * Optional MongoDB extended-JSON filter. Empty means count all records.
    */
    @ApiMember(Description="Optional MongoDB extended-JSON filter. Empty means count all records.")
    open var filter:String? = null

    open var schemaVersion:Int? = null
    companion object { private val responseType = CountRecordsResponse::class.java }
    override fun getResponseType(): Any? = CountRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="DELETE")
@Api(Description="Database")
open class DeleteManyRecords : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the records live in.
    */
    @ApiMember(Description="The collection (schema) name the records live in.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The match filter as a MongoDB extended-JSON document. Required.
    */
    @ApiMember(Description="The match filter as a MongoDB extended-JSON document. Required.", IsRequired=true)
    open var filter:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteManyRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="DELETE")
@Api(Description="Database")
open class DeleteRecord : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the record lives in.
    */
    @ApiMember(Description="The collection (schema) name the record lives in.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The id of the record to delete.
    */
    @ApiMember(Description="The id of the record to delete.", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteRecord.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/distinct", Verbs="GET")
@Api(Description="Database")
open class DistinctRecordValues : CodeMashRequestBase(), IReturn<DistinctRecordValuesResponse>
{
    /**
    * The collection (schema) name to read from.
    */
    @ApiMember(Description="The collection (schema) name to read from.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The document field (dotted path allowed) to get distinct values for, e.g. 'status'.
    */
    @ApiMember(Description="The document field (dotted path allowed) to get distinct values for, e.g. 'status'.", IsRequired=true)
    open var field:String? = null

    /**
    * Optional MongoDB extended-JSON filter. Empty means consider all records.
    */
    @ApiMember(Description="Optional MongoDB extended-JSON filter. Empty means consider all records.")
    open var filter:String? = null

    open var schemaVersion:Int? = null
    companion object { private val responseType = DistinctRecordValuesResponse::class.java }
    override fun getResponseType(): Any? = DistinctRecordValues.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute", Verbs="POST")
@Api(Description="Database")
open class ExecuteRecordsAggregate : CodeMashRequestBase(), IReturn<ExecuteRecordsAggregateResponse>
{
    /**
    * The collection (schema) name to run the saved aggregation against.
    */
    @ApiMember(Description="The collection (schema) name to run the saved aggregation against.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The saved aggregate id (maggr_…) to execute.
    */
    @ApiMember(Description="The saved aggregate id (maggr_…) to execute.", IsRequired=true)
    open var aggregateId:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * Optional key/value substitutions for {TokenKey} placeholders in the saved pipeline.
    */
    @ApiMember(Description="Optional key/value substitutions for {TokenKey} placeholders in the saved pipeline.")
    open var tokens:HashMap<String,String>? = null
    companion object { private val responseType = ExecuteRecordsAggregateResponse::class.java }
    override fun getResponseType(): Any? = ExecuteRecordsAggregate.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}", Verbs="GET")
@Api(Description="Database")
open class FindRecords : CodeMashListPaginationRequestBase(), IReturn<FindRecordsResponse>
{
    /**
    * The collection (schema) name to read from.
    */
    @ApiMember(Description="The collection (schema) name to read from.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * Optional MongoDB extended-JSON filter. Empty means match all records.
    */
    @ApiMember(Description="Optional MongoDB extended-JSON filter. Empty means match all records.")
    open var filter:String? = null

    /**
    * Optional contact id (ct_…) — only that contact's records are returned.
    */
    @ApiMember(Description="Optional contact id (ct_…) — only that contact's records are returned.")
    open var contactId:String? = null

    open var schemaVersion:Int? = null
    open var pagingArgs:PagingArgs? = null
    open var sortBy:String? = null
    open var sortOrder:Int? = null
    companion object { private val responseType = FindRecordsResponse::class.java }
    override fun getResponseType(): Any? = FindRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="GET")
@Api(Description="Database")
open class FindOneRecord : CodeMashRequestBase(), IReturn<FindOneRecordResponse>
{
    /**
    * The collection (schema) name to read from.
    */
    @ApiMember(Description="The collection (schema) name to read from.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The id of the record to fetch.
    */
    @ApiMember(Description="The id of the record to fetch.", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    companion object { private val responseType = FindOneRecordResponse::class.java }
    override fun getResponseType(): Any? = FindOneRecord.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/indexes", Verbs="GET")
@Api(Description="Database")
@DataContract
open class GetCollectionIndexes : CodeMashRequestBase(), IReturn<GetCollectionIndexesResponse>
{
    /**
    * The collection (schema) name to inspect.
    */
    @DataMember
    @ApiMember(Description="The collection (schema) name to inspect.", IsRequired=true)
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetCollectionIndexesResponse::class.java }
    override fun getResponseType(): Any? = GetCollectionIndexes.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="POST")
@Api(Description="Database")
open class InsertManyRecords : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name to insert into.
    */
    @ApiMember(Description="The collection (schema) name to insert into.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The records to insert as a MongoDB extended-JSON array of documents.
    */
    @ApiMember(Description="The records to insert as a MongoDB extended-JSON array of documents.", IsRequired=true)
    open var documents:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = InsertManyRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}", Verbs="POST")
@Api(Description="Database")
open class InsertRecord : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The collection (schema) name to insert into.
    */
    @ApiMember(Description="The collection (schema) name to insert into.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The record to insert, as a MongoDB extended-JSON document string.
    */
    @ApiMember(Description="The record to insert, as a MongoDB extended-JSON document string.", IsRequired=true)
    open var document:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = InsertRecord.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}/replace", Verbs="PUT")
@Api(Description="Database")
open class ReplaceRecord : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the record lives in.
    */
    @ApiMember(Description="The collection (schema) name the record lives in.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The id of the record to replace.
    */
    @ApiMember(Description="The id of the record to replace.", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The replacement document as MongoDB extended-JSON.
    */
    @ApiMember(Description="The replacement document as MongoDB extended-JSON.", IsRequired=true)
    open var replacement:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ReplaceRecord.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/seed", Verbs="POST")
@Api(Description="Database")
open class SeedCollectionRecords : CodeMashRequestBase(), IReturn<SeedCollectionRecordsResponse>
{
    /**
    * Seeding mode: 'dummy' (server-generated sample data, default) or 'realistic' (caller-supplied documents).
    */
    @ApiMember(Description="Seeding mode: 'dummy' (server-generated sample data, default) or 'realistic' (caller-supplied documents).")
    open var mode:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * JSON array of {collectionName, count?, documents?}. count applies to dummy mode (max 100 per collection); documents (extended-JSON objects, may contain $seedRef placeholders) apply to realistic mode.
    */
    @ApiMember(Description="JSON array of {collectionName, count?, documents?}. count applies to dummy mode (max 100 per collection); documents (extended-JSON objects, may contain $seedRef placeholders) apply to realistic mode.", IsRequired=true)
    open var collections:String? = null
    companion object { private val responseType = SeedCollectionRecordsResponse::class.java }
    override fun getResponseType(): Any? = SeedCollectionRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="PUT")
@Api(Description="Database")
open class UpdateManyRecords : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the records live in.
    */
    @ApiMember(Description="The collection (schema) name the records live in.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The match filter as a MongoDB extended-JSON document. Empty object means match all.
    */
    @ApiMember(Description="The match filter as a MongoDB extended-JSON document. Empty object means match all.", IsRequired=true)
    open var filter:String? = null

    /**
    * The partial update document (applied with $set), as MongoDB extended-JSON.
    */
    @ApiMember(Description="The partial update document (applied with $set), as MongoDB extended-JSON.", IsRequired=true)
    open var update:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateManyRecords.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="PUT")
@Api(Description="Database")
open class UpdateOneRecord : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The collection (schema) name the record lives in.
    */
    @ApiMember(Description="The collection (schema) name the record lives in.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * The id of the record to update.
    */
    @ApiMember(Description="The id of the record to update.", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The partial update document (applied with $set), as MongoDB extended-JSON.
    */
    @ApiMember(Description="The partial update document (applied with $set), as MongoDB extended-JSON.", IsRequired=true)
    open var update:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateOneRecord.responseType
}

/**
* Delete integration for particular project
*/
@Route(Path="/{version}/database/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete integration for particular project")
open class DeleteDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Database integration id to delete, from get_database_integrations.
    */
    @ApiMember(Description="Database integration id to delete, from get_database_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseIntegrationRequest.responseType
}

/**
* Disable integration for particular project
*/
@Route(Path="/{version}/database/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable integration for particular project")
open class DisableDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Database integration id to disable, from get_database_integrations.
    */
    @ApiMember(Description="Database integration id to disable, from get_database_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableDatabaseIntegrationRequest.responseType
}

/**
* Enable integration for particular project
*/
@Route(Path="/{version}/database/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable integration for particular project")
open class EnableDatabaseIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Database integration id to enable, from get_database_integrations.
    */
    @ApiMember(Description="Database integration id to enable, from get_database_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableDatabaseIntegrationRequest.responseType
}

/**
* Gets integration by specified Id
*/
@Route(Path="/{version}/database/integrations/{id}", Verbs="GET")
@Api(Description="Gets integration by specified Id")
open class GetDatabaseIntegration : CodeMashRequestBase(), IReturn<GetDatabaseIntegrationResponse>
{
    /**
    * Database integration id from get_database_integrations.
    */
    @ApiMember(Description="Database integration id from get_database_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetDatabaseIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseIntegration.responseType
}

/**
* Gets database integrations
*/
@Route(Path="/{version}/database/integrations", Verbs="GET")
@Api(Description="Gets database integrations")
open class GetDatabaseIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseIntegrationsResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseIntegrations.responseType
}

/**
* Returns the Flex tiers this account is entitled to pick
*/
@Route(Path="/{version}/database/integrations/flex-tiers", Verbs="GET")
@Api(Description="Returns the Flex tiers this account is entitled to pick")
open class GetAllowedFlexTiers : CodeMashRequestBase(), IReturn<GetAllowedFlexTiersResponse>
{
    companion object { private val responseType = GetAllowedFlexTiersResponse::class.java }
    override fun getResponseType(): Any? = GetAllowedFlexTiers.responseType
}

@Route(Path="/{version}/database/integrations/{Id}/connection-string", Verbs="GET")
open class RevealManagedFlexConnectionString : CodeMashRequestBase(), IReturn<RevealManagedFlexConnectionStringResponse>
{
    open var id:String? = null
    companion object { private val responseType = RevealManagedFlexConnectionStringResponse::class.java }
    override fun getResponseType(): Any? = RevealManagedFlexConnectionString.responseType
}

/**
* Saves database integration
*/
@Route(Path="/{version}/database/integrations", Verbs="POST")
@Api(Description="Saves database integration")
@DataContract
open class SaveDatabaseIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:DatabaseIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseIntegration.responseType
}

/**
* Sets integration as default
*/
@Route(Path="/{version}/database/integrations/{Id}/default", Verbs="PUT")
@Api(Description="Sets integration as default")
open class SetDatabaseIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Database integration id to set as default, from get_database_integrations.
    */
    @ApiMember(Description="Database integration id to set as default, from get_database_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetDatabaseIntegrationAsDefaultRequest.responseType
}

/**
* Test database integration
*/
@Route(Path="/{version}/database/integrations/test", Verbs="POST")
@Api(Description="Test database integration")
open class TestDatabaseIntegration : CodeMashRequestBase(), IReturn<TestDatabaseIntegrationResponse>
{
    /**
    * Database integration id to test, from get_database_integrations.
    */
    @ApiMember(Description="Database integration id to test, from get_database_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = TestDatabaseIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestDatabaseIntegration.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports", Verbs="POST")
@Api(Description="Database")
open class CreateCollectionImport : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The uploaded CSV's file ref, from the upload call.
    */
    @ApiMember(Description="The uploaded CSV's file ref, from the upload call.", IsRequired=true)
    open var file:FileResourceRefDto? = null

    /**
    * The target schema id.
    */
    @ApiMember(Description="The target schema id.", IsRequired=true)
    open var schemaId:String? = null

    /**
    * The target collection (schema) name.
    */
    @ApiMember(Description="The target collection (schema) name.", IsRequired=true)
    open var collectionName:String? = null

    open var databaseIntegrationId:String? = null
    /**
    * The CSV delimiter used at upload time.
    */
    @ApiMember(Description="The CSV delimiter used at upload time.", IsRequired=true)
    open var delimiter:String? = null

    open var hasHeader:Boolean? = null
    /**
    * Column → property mapping, frozen for this import.
    */
    @ApiMember(Description="Column → property mapping, frozen for this import.", IsRequired=true)
    open var mapping:ArrayList<ImportColumnMappingDto> = ArrayList<ImportColumnMappingDto>()
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateCollectionImport.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports/{Id}", Verbs="DELETE")
@Api(Description="Database")
open class DeleteCollectionImportRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The import id (imp_…).
    */
    @ApiMember(Description="The import id (imp_…).", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteCollectionImportRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports/{Id}", Verbs="GET")
@Api(Description="Database")
open class GetCollectionImport : CodeMashRequestBase(), IReturn<GetCollectionImportResponse>
{
    /**
    * The import id (imp_…).
    */
    @ApiMember(Description="The import id (imp_…).", IsRequired=true)
    open var id:String? = null

    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetCollectionImportResponse::class.java }
    override fun getResponseType(): Any? = GetCollectionImport.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports", Verbs="GET")
@Api(Description="Database")
open class GetCollectionImports : CodeMashListPaginationRequestBase(), IReturn<GetCollectionImportsResponse>
{
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetCollectionImportsResponse::class.java }
    override fun getResponseType(): Any? = GetCollectionImports.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports/upload-url", Verbs="POST")
@Api(Description="Database")
open class RequestImportUploadUrlRequest : CodeMashRequestBase(), IReturn<RequestImportUploadUrlResponse>
{
    open var fileAccountId:String? = null
    /**
    * The original CSV file name, e.g. people.csv.
    */
    @ApiMember(Description="The original CSV file name, e.g. people.csv.", IsRequired=true)
    open var fileName:String? = null
    companion object { private val responseType = RequestImportUploadUrlResponse::class.java }
    override fun getResponseType(): Any? = RequestImportUploadUrlRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/imports/analyze", Verbs="POST")
@Api(Description="Database")
open class AnalyzeImportFileRequest : CodeMashRequestBase(), IReturn<AnalyzeImportFileResponse>
{
    /**
    * The uploaded CSV's file ref, from the upload-url call.
    */
    @ApiMember(Description="The uploaded CSV's file ref, from the upload-url call.", IsRequired=true)
    open var file:FileResourceRefDto? = null

    /**
    * The CSV delimiter, e.g. "," or ";".
    */
    @ApiMember(Description="The CSV delimiter, e.g. \",\" or \";\".", IsRequired=true)
    open var delimiter:String? = null

    /**
    * Whether the first row is a header row.
    */
    @ApiMember(Description="Whether the first row is a header row.")
    open var hasHeader:Boolean? = null
    companion object { private val responseType = AnalyzeImportFileResponse::class.java }
    override fun getResponseType(): Any? = AnalyzeImportFileRequest.responseType
}

/**
* Delete saved Mongo aggregation
*/
@Route(Path="/{version}/database/aggregates/{Id}", Verbs="DELETE")
@Api(Description="Delete saved Mongo aggregation")
@DataContract
open class DeleteDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Aggregate id to delete, from get_database_aggregates.
    */
    @DataMember
    @ApiMember(Description="Aggregate id to delete, from get_database_aggregates.", IsRequired=true)
    open var id:String? = null

    /**
    * Schema id that owns this aggregate, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id that owns this aggregate, from get_database_schemas.", IsRequired=true)
    open var schemaId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteDatabaseAggregateRequest.responseType
}

/**
* Get saved Mongo aggregation by id
*/
@Route(Path="/{version}/database/aggregates/{Id}", Verbs="GET")
@Api(Description="Get saved Mongo aggregation by id")
open class GetDatabaseAggregate : CodeMashRequestBase(), IReturn<GetDatabaseAggregateResponse>
{
    /**
    * Aggregate id from get_database_aggregates.
    */
    @ApiMember(Description="Aggregate id from get_database_aggregates.", IsRequired=true)
    open var id:String? = null

    /**
    * Schema id that owns this aggregate, from get_database_schemas.
    */
    @ApiMember(Description="Schema id that owns this aggregate, from get_database_schemas.", IsRequired=true)
    open var schemaId:String? = null
    companion object { private val responseType = GetDatabaseAggregateResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseAggregate.responseType
}

/**
* Lists saved Mongo aggregations for a schema
*/
@Route(Path="/{version}/database/aggregates", Verbs="GET")
@Api(Description="Lists saved Mongo aggregations for a schema")
open class GetDatabaseAggregates : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseAggregatesResponse>
{
    /**
    * Schema id whose saved aggregates to list, from get_database_schemas.
    */
    @ApiMember(Description="Schema id whose saved aggregates to list, from get_database_schemas.", IsRequired=true)
    open var schemaId:String? = null

    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseAggregatesResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseAggregates.responseType
}

/**
* Creates or updates a saved Mongo aggregation
*/
@Route(Path="/{version}/database/aggregates", Verbs="POST")
@Api(Description="Creates or updates a saved Mongo aggregation")
@DataContract
open class SaveDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Empty to create a new saved aggregate; set to an existing aggregate id (from get_database_aggregates) to update it.
    */
    @DataMember
    @ApiMember(Description="Empty to create a new saved aggregate; set to an existing aggregate id (from get_database_aggregates) to update it.")
    open var viewId:String? = null

    /**
    * Schema id that owns this aggregate, from get_database_schemas.
    */
    @DataMember
    @ApiMember(Description="Schema id that owns this aggregate, from get_database_schemas.", IsRequired=true)
    open var schemaId:String? = null

    /**
    * Human-readable display name for the saved aggregate.
    */
    @DataMember
    @ApiMember(Description="Human-readable display name for the saved aggregate.", IsRequired=true)
    open var displayName:String? = null

    /**
    * Optional free-text description of what the aggregate does.
    */
    @DataMember
    @ApiMember(Description="Optional free-text description of what the aggregate does.")
    open var description:String? = null

    /**
    * MongoDB aggregation pipeline JSON, optionally containing {TokenKey} placeholders substituted at execute time.
    */
    @DataMember
    @ApiMember(Description="MongoDB aggregation pipeline JSON, optionally containing {TokenKey} placeholders substituted at execute time.", IsRequired=true)
    open var pipeline:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveDatabaseAggregateRequest.responseType
}

/**
* Test-run an aggregation pipeline with caller-supplied tokens
*/
@Route(Path="/{version}/database/aggregates/test", Verbs="POST")
@Api(Description="Test-run an aggregation pipeline with caller-supplied tokens")
@DataContract
open class TestDatabaseAggregateRequest : CodeMashRequestBase(), IReturn<TestDatabaseAggregateResponse>
{
    /**
    * Optional database integration id. When omitted, the project's default database integration is used.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id. When omitted, the project's default database integration is used.")
    open var databaseIntegrationId:String? = null

    /**
    * Name of the collection (schema) to run the aggregation against.
    */
    @DataMember
    @ApiMember(Description="Name of the collection (schema) to run the aggregation against.", IsRequired=true)
    open var collectionName:String? = null

    /**
    * MongoDB aggregation pipeline JSON, optionally containing {TokenKey} placeholders to be substituted from tokens.
    */
    @DataMember
    @ApiMember(Description="MongoDB aggregation pipeline JSON, optionally containing {TokenKey} placeholders to be substituted from tokens.", IsRequired=true)
    open var pipeline:String? = null

    /**
    * Optional key/value substitutions for {TokenKey} placeholders in the pipeline.
    */
    @DataMember
    @ApiMember(Description="Optional key/value substitutions for {TokenKey} placeholders in the pipeline.")
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
    open var env:Env? = null
}

open class DatabaseIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class DatabaseIntegrationSetAsDefault
{
    open var env:Env? = null
    open var id:IntegrationId? = null
}

open class DatabaseIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class DatabaseIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class DatabaseIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class DatabaseIntegrationProvisioningStarted
{
    open var integrationId:IntegrationId? = null
    open var atlasProjectId:String? = null
    open var atlasClusterName:String? = null
}

open class DatabaseIntegrationProvisioningCompleted
{
    open var integrationId:IntegrationId? = null
    open var connectionStringTemplate:String? = null
}

open class DatabaseIntegrationProvisioningFailed
{
    open var integrationId:IntegrationId? = null
    open var reason:String? = null
    open var retryable:Boolean? = null
}

open class DatabaseIntegrationDeprovisioned
{
    open var integrationId:IntegrationId? = null
    open var atlasProjectId:String? = null
    open var atlasClusterName:String? = null
}

open class ProjectStatusChanged
{
    open var status:ProjectStatus? = null
}

open class SchemaCreated
{
    open var schema:Schema? = null
}

open class SchemaMirrored
{
    open var schema:Schema? = null
}

open class SchemaDraftUpdated
{
    open var id:SchemaId? = null
    open var draft:SchemaDraft? = null
    open var env:Env? = null
}

open class SchemaDraftDiscarded
{
    open var id:SchemaId? = null
    open var env:Env? = null
}

open class SchemaVersionPublished
{
    open var id:SchemaId? = null
    open var version:PublishedSchemaVersion? = null
    open var diff:SchemaDiff? = null
    open var env:Env? = null
}

open class SchemaSettingsUpdated
{
    open var id:SchemaId? = null
    open var settings:SchemaSettings? = null
    open var env:Env? = null
}

open class SchemaDeleted
{
    open var id:SchemaId? = null
    open var env:Env? = null
}

open class SchemaRenamed
{
    open var schemaId:SchemaId? = null
    open var newName:SchemaName? = null
    open var renameUniqueName:Boolean? = null
    open var env:Env? = null
}

open class SchemaDataCleared
{
    open var id:SchemaId? = null
    open var integrations:ArrayList<IntegrationId> = ArrayList<IntegrationId>()
    open var env:Env? = null
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

open class DatabaseTriggerMirrored
{
    open var trigger:Trigger? = null
}

open class SchemaTriggerEnabled : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
    open var env:Env? = null
}

open class SchemaTriggerDisabled : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
    open var env:Env? = null
}

open class SchemaTriggerDeleted : TriggerByIdEventBase()
{
    open var schemaId:SchemaId? = null
    open var env:Env? = null
}

open class ProcessCollectionImport
{
    open var importId:String? = null
    open var projectId:String? = null
    open var accountId:String? = null
    open var databaseIntegrationId:String? = null
    open var env:String? = null
}

open class RecordInserted
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var id:String? = null
    open var document:Object? = null
}

open class RecordUpdated
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var id:String? = null
    open var from:Object? = null
    open var to:Object? = null
}

open class RecordDeleted
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var id:String? = null
    open var document:Object? = null
}

open class RecordReplaced
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var id:String? = null
    open var from:Object? = null
    open var to:Object? = null
}

open class RecordResponsibilityChanged
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var id:String? = null
    open var fromOwner:AuthId? = null
    open var toOwner:AuthId? = null
}

open class RecordsInserted
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var ids:IReadOnlyList<String>? = null
    open var documents:IReadOnlyList<Object>? = null
}

open class RecordsUpdated
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var matchedCount:Long? = null
    open var modifiedCount:Long? = null
    open var update:Object? = null
}

open class RecordsDeleted
{
    open var projectId:ProjectId? = null
    open var databaseIntegrationId:IntegrationId? = null
    open var schemaName:SchemaName? = null
    open var deletedCount:Long? = null
    open var filter:Object? = null
}

open class EmailVerificationCodeRequested : IPasskeyMessage
{
    open var email:String? = null
    open var projectId:UUID? = null
    open var code:String? = null
    open var expiresAtUtc:Date? = null
}

open class MagicLinkRequested : IPasskeyMessage
{
    open var email:String? = null
    open var projectId:UUID? = null
    open var token:String? = null
    open var expiresAtUtc:Date? = null
}

open class PasswordResetRequested : IPasskeyMessage
{
    open var email:String? = null
    open var projectId:UUID? = null
    open var token:String? = null
    open var expiresAtUtc:Date? = null
}

open class PasswordChanged : IPasskeyMessage
{
    open var email:String? = null
    open var projectId:UUID? = null
}

open class SseCallTriggered
{
    open var projectId:ProjectId? = null
    open var accountId:AccountId? = null
    open var triggerId:TriggerId? = null
    open var triggerType:TriggerType? = null
    open var sourceEvent:String? = null
    open var targetUserAuthId:String? = null
    open var schemaId:String? = null
    open var tokenMappings:IReadOnlyDictionary<String, String>? = null
    open var correlationId:String? = null
}

open class UserRegistered
{
    open var auth:Auth? = null
    open var linkToUser:UserId? = null
}

open class UserCreated
{
    open var userId:UserId? = null
    open var projectId:ProjectId? = null
    open var authId:AuthId? = null
}

open class UserUpdated
{
    open var authId:AuthId? = null
    open var from:UserGeneralInfo? = null
    open var to:UserGeneralInfo? = null
}

open class UserBlocked
{
    open var user:UserGeneralInfo? = null
    open var authId:AuthId? = null
}

open class UserUnblocked
{
    open var user:UserGeneralInfo? = null
    open var authId:AuthId? = null
}

open class UserInvited
{
    open var emailAddress:EmailAddress? = null
}

open class UserVerified
{
    open var authId:AuthId? = null
    open var user:UserGeneralInfo? = null
}

open class UserDeleted
{
    open var user:UserGeneralInfo? = null
    open var authId:AuthId? = null
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
@DataContract
open class DeleteFilesTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteFilesTrigger.responseType
}

@Route(Path="/{version}/files/triggers/{triggerId}/disable", Verbs="PATCH")
@DataContract
open class DisableFilesTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableFilesTrigger.responseType
}

@Route(Path="/{version}/files/triggers/{triggerId}/enable", Verbs="PATCH")
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
@DataContract
open class SaveFilesTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveFilesTrigger.responseType
}

@Route(Path="/{version}/files/integrations/{Id}", Verbs="DELETE")
open class DeleteFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Files integration id to delete, from get_files_integrations.
    */
    @ApiMember(Description="Files integration id to delete, from get_files_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteFilesIntegrationRequest.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/disable", Verbs="PUT")
open class DisableFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Files integration id to disable, from get_files_integrations.
    */
    @ApiMember(Description="Files integration id to disable, from get_files_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableFilesIntegrationRequest.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/enable", Verbs="PUT")
open class EnableFilesIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Files integration id to enable, from get_files_integrations.
    */
    @ApiMember(Description="Files integration id to enable, from get_files_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableFilesIntegrationRequest.responseType
}

/**
* Gets integration by specified Id
*/
@Route(Path="/{version}/files/integrations/{id}", Verbs="GET")
@Api(Description="Gets integration by specified Id")
open class GetFilesIntegration : CodeMashRequestBase(), IReturn<GetFilesIntegrationResponse>
{
    /**
    * Files integration id to fetch, from get_files_integrations.
    */
    @ApiMember(Description="Files integration id to fetch, from get_files_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetFilesIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetFilesIntegration.responseType
}

/**
* Gets integrations
*/
@Route(Path="/{version}/files/integrations", Verbs="GET")
@Api(Description="Gets integrations")
open class GetFilesIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetFilesIntegrationsResponse>
{
    companion object { private val responseType = GetFilesIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetFilesIntegrations.responseType
}

@Route(Path="/{version}/files/integrations", Verbs="POST")
@DataContract
open class SaveFilesIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:FilesIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveFilesIntegration.responseType
}

@Route(Path="/{version}/files/integrations/{Id}/default", Verbs="PUT")
open class SetFilesIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Files integration id to set as default, from get_files_integrations.
    */
    @ApiMember(Description="Files integration id to set as default, from get_files_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetFilesIntegrationAsDefaultRequest.responseType
}

@Route(Path="/{version}/files/integrations/test", Verbs="POST")
open class TestFilesIntegration : CodeMashRequestBase(), IReturn<TestFilesIntegrationResponse>
{
    /**
    * Integration id, from get_files_integrations.
    */
    @ApiMember(Description="Integration id, from get_files_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = TestFilesIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestFilesIntegration.responseType
}

@Route(Path="/{version}/files/item", Verbs="GET")
open class GetFile : CodeMashRequestBase(), IReturn<GetFileResponse>
{
    /**
    * The files integration id to read from, from get_files_integrations.
    */
    @ApiMember(Description="The files integration id to read from, from get_files_integrations.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * The path of the file to fetch metadata for.
    */
    @ApiMember(Description="The path of the file to fetch metadata for.", IsRequired=true)
    open var path:String? = null
    companion object { private val responseType = GetFileResponse::class.java }
    override fun getResponseType(): Any? = GetFile.responseType
}

@Route(Path="/{version}/files/folder", Verbs="GET")
open class GetFolderFiles : CodeMashListPaginationRequestBase(), IReturn<GetFolderFilesResponse>
{
    /**
    * The files integration id to list from, from get_files_integrations.
    */
    @ApiMember(Description="The files integration id to list from, from get_files_integrations.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * Path prefix to list. Empty / null lists the root.
    */
    @ApiMember(Description="Path prefix to list. Empty / null lists the root.")
    open var path:String? = null
    companion object { private val responseType = GetFolderFilesResponse::class.java }
    override fun getResponseType(): Any? = GetFolderFiles.responseType
}

open class FilesEstablished
{
}

open class FilesEnabled
{
}

open class FilesDisabled
{
}

open class FilesIntegrationSaved
{
    open var integration:FileIntegration? = null
}

open class FilesIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class FilesIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class FilesIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class FilesIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class FilesIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class FilesIntegrationSetAsDefault
{
    open var env:Env? = null
    open var id:IntegrationId? = null
}

open class FilesTriggerSaved
{
    open var trigger:FileTrigger? = null
}

open class FilesTriggerMirrored
{
    open var trigger:Trigger? = null
}

open class FilesTriggerEnabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class FilesTriggerDisabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class FilesTriggerDeleted : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class FileUploaded
{
    open var projectId:ProjectId? = null
    open var integrationId:IntegrationId? = null
    open var fileRef:FileResourceRef? = null
}

open class FileDeleted
{
    open var projectId:ProjectId? = null
    open var integrationId:IntegrationId? = null
    open var path:String? = null
}

/**
* Disable email service
*/
@Route(Path="/{version}/notifications/email/disable", Verbs="GET")
@Api(Description="Disable email service")
open class DisableEmail : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableEmail.responseType
}

/**
* Get email disable dependencies
*/
@Route(Path="/{version}/notifications/email/disable-dependencies", Verbs="GET")
@Api(Description="Get email disable dependencies")
open class GetEmailDisableDependencies : CodeMashRequestBase(), IReturn<GetNotificationModuleDisableDependenciesResponse>
{
    companion object { private val responseType = GetNotificationModuleDisableDependenciesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailDisableDependencies.responseType
}

/**
* Enable email service
*/
@Route(Path="/{version}/notifications/email/enable", Verbs="GET")
@Api(Description="Enable email service")
open class EnableEmail : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableEmail.responseType
}

@Route(Path="/{version}/notifications/email/validation/integrations", Verbs="POST")
@DataContract
open class SaveEmailValidationIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:EmailValidationIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailValidationIntegration.responseType
}

@Route(Path="/{version}/notifications/email/validation/integrations/test", Verbs="POST")
open class TestEmailValidationIntegration : CodeMashRequestBase(), IReturn<TestEmailValidationIntegrationResponse>
{
    open var integrationId:String? = null
    companion object { private val responseType = TestEmailValidationIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestEmailValidationIntegration.responseType
}

/**
* Attach a file to an email template
*/
@Route(Path="/{version}/notifications/email/templates/attachments", Verbs="POST")
@Api(Description="Attach a file to an email template")
open class AttachFileToTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Optional language code to scope the attachment to a single translation. Omit to attach at the template level.
    */
    @ApiMember(Description="Optional language code to scope the attachment to a single translation. Omit to attach at the template level.")
    open var language:String? = null

    /**
    * The email template id to attach the file to. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to attach the file to. Get it from get_email_templates.", IsRequired=true)
    open var templateId:String? = null

    /**
    * The file resource reference to attach (from a prior file upload).
    */
    @ApiMember(Description="The file resource reference to attach (from a prior file upload).", IsRequired=true)
    open var fileRef:FileResourceRefDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AttachFileToTemplateRequest.responseType
}

/**
* Create an email template
*/
@Route(Path="/{version}/notifications/email/templates", Verbs="POST")
@Api(Description="Create an email template")
open class CreateEmailTemplateRequest : SaveEmailTemplate(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateEmailTemplateRequest.responseType
}

/**
* Delete an email template
*/
@Route(Path="/{version}/notifications/email/templates/{Id}", Verbs="DELETE")
@Api(Description="Delete an email template")
open class DeleteEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email template id to delete. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to delete. Get it from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailTemplateRequest.responseType
}

/**
* Get an email template
*/
@Route(Path="/{version}/notifications/email/templates/{id}", Verbs="GET")
@Api(Description="Get an email template")
open class GetEmailTemplate : CodeMashRequestBase(), IReturn<GetEmailTemplateResponse>
{
    /**
    * The email template id to fetch. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to fetch. Get it from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetEmailTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplate.responseType
}

/**
* Gets email templates
*/
@Route(Path="/{version}/notifications/email/templates", Verbs="GET")
@Api(Description="Gets email templates")
open class GetEmailTemplates : CodeMashListPaginationRequestBase(), IReturn<GetEmailTemplatesResponse>
{
    /**
    * Set true to include archived templates.
    */
    @ApiMember(Description="Set true to include archived templates.")
    open var showArchived:Boolean? = null

    /**
    * Optional: return only the template with this id.
    */
    @ApiMember(Description="Optional: return only the template with this id.")
    open var templateId:String? = null
    companion object { private val responseType = GetEmailTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplates.responseType
}

/**
* Render MJML email template
*/
@Route(Path="/{version}/notifications/email/templates/mjml", Verbs="POST")
@Api(Description="Render MJML email template")
open class GetMjml : CodeMashRequestBase(), IReturn<GetHtmlFromMjmlResponse>
{
    /**
    * The MJML/Razor template source code to render.
    */
    @ApiMember(Description="The MJML/Razor template source code to render.", IsRequired=true)
    open var code:String? = null

    /**
    * Optional token values to bind into the template while rendering.
    */
    @ApiMember(Description="Optional token values to bind into the template while rendering.")
    open var tokens:ArrayList<TokenMappingDto>? = null

    /**
    * Set true when rendering for a preview (vs. a final save), to affect how missing tokens are handled.
    */
    @ApiMember(Description="Set true when rendering for a preview (vs. a final save), to affect how missing tokens are handled.")
    open var isForPreview:Boolean? = null
    companion object { private val responseType = GetHtmlFromMjmlResponse::class.java }
    override fun getResponseType(): Any? = GetMjml.responseType
}

/**
* Get a system email template
*/
@Route(Path="/{version}/notifications/email/system-templates/{id}", Verbs="GET")
@Api(Description="Get a system email template")
open class GetSystemEmailTemplate : CodeMashRequestBase(), IReturn<GetSystemEmailTemplateResponse>
{
    /**
    * The system email template id to fetch. Get it from get_system_email_templates.
    */
    @ApiMember(Description="The system email template id to fetch. Get it from get_system_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetSystemEmailTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetSystemEmailTemplate.responseType
}

/**
* Get system email templates
*/
@Route(Path="/{version}/notifications/email/system-templates", Verbs="GET")
@Api(Description="Get system email templates")
open class GetSystemEmailTemplates : CodeMashListPaginationRequestBase(), IReturn<GetSystemEmailTemplatesResponse>
{
    /**
    * Optional group tags to filter templates by (e.g. newsletter, onboarding).
    */
    @ApiMember(Description="Optional group tags to filter templates by (e.g. newsletter, onboarding).")
    open var groupTags:ArrayList<String>? = null

    /**
    * Optional visual themes to filter templates by.
    */
    @ApiMember(Description="Optional visual themes to filter templates by.")
    open var themes:ArrayList<String>? = null

    /**
    * Optional communication channel to filter templates by (e.g. Transactional, Marketing).
    */
    @ApiMember(Description="Optional communication channel to filter templates by (e.g. Transactional, Marketing).")
    open var communicationChannel:CommunicationChannel? = null

    /**
    * Optional trigger type to filter templates that are designed for a specific automated trigger.
    */
    @ApiMember(Description="Optional trigger type to filter templates that are designed for a specific automated trigger.")
    open var forTrigger:TriggerType? = null
    companion object { private val responseType = GetSystemEmailTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetSystemEmailTemplates.responseType
}

/**
* Gets the tokens used by an email template
*/
@Route(Path="/{version}/notifications/email/templates/{id}/tokens", Verbs="GET")
@Api(Description="Gets the tokens used by an email template")
open class GetEmailTemplateAvailableTokens : CodeMashRequestBase(), IReturn<GetEmailTemplateAvailableTokensResponse>
{
    /**
    * Template id from get_email_templates.
    */
    @ApiMember(Description="Template id from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetEmailTemplateAvailableTokensResponse::class.java }
    override fun getResponseType(): Any? = GetEmailTemplateAvailableTokens.responseType
}

/**
* Update an email template
*/
@Route(Path="/{version}/notifications/email/templates", Verbs="PUT")
@Api(Description="Update an email template")
open class UpdateEmailTemplateRequest : SaveEmailTemplate(), IReturn<EmptyResponse>
{
    /**
    * The email template id to update. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to update. Get it from get_email_templates.", IsRequired=true)
    open var viewId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateEmailTemplateRequest.responseType
}

/**
* Delete an email signature
*/
@Route(Path="/{version}/notifications/email/signatures/{id}", Verbs="DELETE")
@Api(Description="Delete an email signature")
open class DeleteEmailSignature : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email signature id to delete. Get it from get_email_signatures.
    */
    @ApiMember(Description="The email signature id to delete. Get it from get_email_signatures.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailSignature.responseType
}

/**
* Get an email signature
*/
@Route(Path="/{version}/notifications/email/signatures/{id}", Verbs="GET")
@Api(Description="Get an email signature")
open class GetEmailSignature : CodeMashRequestBase(), IReturn<GetEmailSignatureResponse>
{
    /**
    * The email signature id to fetch. Get it from get_email_signatures.
    */
    @ApiMember(Description="The email signature id to fetch. Get it from get_email_signatures.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetEmailSignatureResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSignature.responseType
}

/**
* Get email signatures
*/
@Route(Path="/{version}/notifications/email/signatures", Verbs="GET")
@Api(Description="Get email signatures")
open class GetEmailSignatures : CodeMashListPaginationRequestBase(), IReturn<GetEmailSignaturesResponse>
{
    companion object { private val responseType = GetEmailSignaturesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSignatures.responseType
}

/**
* Save an email signature
*/
@Route(Path="/{version}/notifications/email/signatures", Verbs="POST")
@Api(Description="Save an email signature")
open class SaveEmailSignatureRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The signature id to update. Omit to create a new signature. Get it from get_email_signatures.
    */
    @ApiMember(Description="The signature id to update. Omit to create a new signature. Get it from get_email_signatures.")
    open var viewId:String? = null

    /**
    * The display name of the signature.
    */
    @ApiMember(Description="The display name of the signature.", IsRequired=true)
    open var displayName:String? = null

    /**
    * The per-language content translations for this signature.
    */
    @ApiMember(Description="The per-language content translations for this signature.", IsRequired=true)
    open var translations:ArrayList<TranslationDto> = ArrayList<TranslationDto>()
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailSignatureRequest.responseType
}

/**
* Get email settings
*/
@Route(Path="/{version}/notifications/email/settings", Verbs="GET")
@Api(Description="Get email settings")
open class GetEmailSettings : CodeMashRequestBase(), IReturn<GetEmailSettingsResponse>
{
    /**
    * Unused legacy field; leave empty.
    */
    @ApiMember(Description="Unused legacy field; leave empty.")
    open var id:String? = null
    companion object { private val responseType = GetEmailSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailSettings.responseType
}

/**
* Confirm human delivery of a test email
*/
@Route(Path="/{version}/notifications/email/integrations/confirm-human-delivery", Verbs="POST")
@Api(Description="Confirm human delivery of a test email")
@DataContract
open class ConfirmEmailIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email integration id the test delivery was confirmed for. Get it from get_email_integrations.
    */
    @DataMember
    @ApiMember(Description="The email integration id the test delivery was confirmed for. Get it from get_email_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmEmailIntegrationHumanDeliveryRequest.responseType
}

/**
* Delete an email integration
*/
@Route(Path="/{version}/notifications/email/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete an email integration")
open class DeleteEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email integration id to delete. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to delete. Get it from get_email_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailIntegration.responseType
}

/**
* Disable an email integration
*/
@Route(Path="/{version}/notifications/email/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable an email integration")
open class DisableEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email integration id to disable. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to disable. Get it from get_email_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableEmailIntegration.responseType
}

/**
* Check email integration domain health
*/
@Route(Path="/{version}/notifications/email/integrations/domain-health", Verbs="POST")
@Api(Description="Check email integration domain health")
@DataContract
open class CheckEmailIntegrationDomainHealthRequest : CodeMashRequestBase(), IReturn<CheckEmailIntegrationDomainHealthResponse>
{
    /**
    * The email integration id to check DNS health for. Get it from get_email_integrations.
    */
    @DataMember
    @ApiMember(Description="The email integration id to check DNS health for. Get it from get_email_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = CheckEmailIntegrationDomainHealthResponse::class.java }
    override fun getResponseType(): Any? = CheckEmailIntegrationDomainHealthRequest.responseType
}

/**
* Enable an email integration
*/
@Route(Path="/{version}/notifications/email/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable an email integration")
open class EnableEmailIntegration : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email integration id to enable. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to enable. Get it from get_email_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableEmailIntegration.responseType
}

/**
* Get an email integration
*/
@Route(Path="/{version}/notifications/email/integrations/{id}", Verbs="GET")
@Api(Description="Get an email integration")
open class GetEmailIntegration : CodeMashRequestBase(), IReturn<GetEmailIntegrationResponse>
{
    /**
    * The email integration id to fetch. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to fetch. Get it from get_email_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetEmailIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetEmailIntegration.responseType
}

/**
* Gets email integrations
*/
@Route(Path="/{version}/notifications/email/integrations", Verbs="GET")
@Api(Description="Gets email integrations")
open class GetEmailIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetEmailIntegrationsResponse>
{
    companion object { private val responseType = GetEmailIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailIntegrations.responseType
}

@Route(Path="/{version}/notifications/email/integrations", Verbs="POST")
@DataContract
open class SaveEmailIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:EmailIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailIntegration.responseType
}

/**
* Set an email integration as default
*/
@Route(Path="/{version}/notifications/email/integrations/{Id}/default", Verbs="PUT")
@Api(Description="Set an email integration as default")
open class SetEmailsIntegrationAsDefault : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email integration id to set as default. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to set as default. Get it from get_email_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetEmailsIntegrationAsDefault.responseType
}

/**
* Test an email integration
*/
@Route(Path="/{version}/notifications/email/integrations/test", Verbs="POST")
@Api(Description="Test an email integration")
open class TestEmailIntegration : CodeMashRequestBase(), IReturn<TestEmailIntegrationResponse>
{
    /**
    * The email integration id to test. Get it from get_email_integrations.
    */
    @ApiMember(Description="The email integration id to test. Get it from get_email_integrations.", IsRequired=true)
    open var integrationId:String? = null

    /**
    * The recipient email address to send the test email to.
    */
    @ApiMember(Description="The recipient email address to send the test email to.", IsRequired=true)
    open var to:String? = null
    companion object { private val responseType = TestEmailIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestEmailIntegration.responseType
}

/**
* Archive an email template
*/
@Route(Path="/{version}/notifications/email/templates/{Id}/archive", Verbs="PUT")
@Api(Description="Archive an email template")
open class ArchiveEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email template id to archive. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to archive. Get it from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchiveEmailTemplateRequest.responseType
}

/**
* Clone an email template
*/
@Route(Path="/{version}/notifications/email/templates/{Id}/clone", Verbs="POST")
@Api(Description="Clone an email template")
open class CloneEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email template id to clone. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to clone. Get it from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CloneEmailTemplateRequest.responseType
}

/**
* Un-archive an email template
*/
@Route(Path="/{version}/notifications/email/templates/{Id}/unarchive", Verbs="PUT")
@Api(Description="Un-archive an email template")
open class UnArchiveEmailTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email template id to unarchive. Get it from get_email_templates.
    */
    @ApiMember(Description="The email template id to unarchive. Get it from get_email_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnArchiveEmailTemplateRequest.responseType
}

/**
* Delete an email footer
*/
@Route(Path="/{version}/notifications/email/footers/{id}", Verbs="DELETE")
@Api(Description="Delete an email footer")
open class DeleteEmailFooter : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The email footer id to delete. Get it from get_email_footers.
    */
    @ApiMember(Description="The email footer id to delete. Get it from get_email_footers.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEmailFooter.responseType
}

/**
* Get an email footer
*/
@Route(Path="/{version}/notifications/email/footers/{id}", Verbs="GET")
@Api(Description="Get an email footer")
open class GetEmailFooter : CodeMashRequestBase(), IReturn<GetEmailFooterResponse>
{
    /**
    * The email footer id to fetch. Get it from get_email_footers.
    */
    @ApiMember(Description="The email footer id to fetch. Get it from get_email_footers.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetEmailFooterResponse::class.java }
    override fun getResponseType(): Any? = GetEmailFooter.responseType
}

/**
* Get email footers
*/
@Route(Path="/{version}/notifications/email/footers", Verbs="GET")
@Api(Description="Get email footers")
open class GetEmailFooters : CodeMashListPaginationRequestBase(), IReturn<GetEmailFootersResponse>
{
    companion object { private val responseType = GetEmailFootersResponse::class.java }
    override fun getResponseType(): Any? = GetEmailFooters.responseType
}

/**
* Save an email footer
*/
@Route(Path="/{version}/notifications/email/footers", Verbs="POST")
@Api(Description="Save an email footer")
open class SaveEmailFooterRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The footer id to update. Omit to create a new footer. Get it from get_email_footers.
    */
    @ApiMember(Description="The footer id to update. Omit to create a new footer. Get it from get_email_footers.")
    open var viewId:String? = null

    /**
    * The display name of the footer.
    */
    @ApiMember(Description="The display name of the footer.", IsRequired=true)
    open var displayName:String? = null

    /**
    * The per-language content translations for this footer.
    */
    @ApiMember(Description="The per-language content translations for this footer.", IsRequired=true)
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

/**
* Gets email campaign by id
*/
@Route(Path="/{version}/notifications/email/campaigns/{id}", Verbs="GET")
@Api(Description="Gets email campaign by id")
open class GetEmailCampaign : CodeMashRequestBase(), IReturn<GetEmailCampaignResponse>
{
    /**
    * The campaign id.
    */
    @ApiMember(Description="The campaign id.")
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaign.responseType
}

/**
* Gets email campaigns
*/
@Route(Path="/{version}/notifications/email/campaigns", Verbs="GET")
@Api(Description="Gets email campaigns")
open class GetEmailCampaigns : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignsResponse>
{
    /**
    * Optional. When omitted, the project's default database integration is used (resolved server-side from the project state).
    */
    @ApiMember(Description="Optional. When omitted, the project's default database integration is used (resolved server-side from the project state).")
    open var databaseIntegrationId:String? = null

    /**
    * Optional: return only the campaign with this id.
    */
    @ApiMember(Description="Optional: return only the campaign with this id.")
    open var campaignId:String? = null

    /**
    * Optional: only campaigns that targeted this email address.
    */
    @ApiMember(Description="Optional: only campaigns that targeted this email address.")
    open var emailAddress:String? = null

    /**
    * Optional: only campaigns built on this email template id.
    */
    @ApiMember(Description="Optional: only campaigns built on this email template id.")
    open var templateId:String? = null

    /**
    * Optional lower bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional lower bound for the campaign time, unix timestamp in seconds (UTC).")
    open var from:Long? = null

    /**
    * Optional upper bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional upper bound for the campaign time, unix timestamp in seconds (UTC).")
    open var to:Long? = null
    companion object { private val responseType = GetEmailCampaignsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaigns.responseType
}

/**
* Get email campaign batches
*/
@Route(Path="/{version}/notifications/email/campaigns/{id}/batches", Verbs="GET")
@Api(Description="Get email campaign batches")
open class GetEmailCampaignBatches : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchesResponse>
{
    /**
    * The email campaign id to list batches for. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id to list batches for. Get it from get_all_email_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Optional batch id to filter to a single batch. Get it from a prior call to this tool.
    */
    @ApiMember(Description="Optional batch id to filter to a single batch. Get it from a prior call to this tool.")
    open var batchId:String? = null

    /**
    * Optional recipient email address to filter batches by.
    */
    @ApiMember(Description="Optional recipient email address to filter batches by.")
    open var emailAddress:String? = null
    companion object { private val responseType = GetEmailCampaignBatchesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatches.responseType
}

/**
* Get an email campaign batch notification
*/
@Route(Path="/{version}/notifications/email/campaigns/{id}/batches/{batchId}/{notificationId}", Verbs="GET")
@Api(Description="Get an email campaign batch notification")
open class GetEmailCampaignBatchNotification : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchNotificationResponse>
{
    /**
    * The email campaign id. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_all_email_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * The campaign batch id. Get it from get_email_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_email_campaign_batches.", IsRequired=true)
    open var batchId:String? = null

    /**
    * The notification id within the batch. Get it from get_email_campaign_batch_notifications.
    */
    @ApiMember(Description="The notification id within the batch. Get it from get_email_campaign_batch_notifications.", IsRequired=true)
    open var notificationId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignBatchNotificationResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatchNotification.responseType
}

/**
* Get email campaign batch notifications
*/
@Route(Path="/{version}/notifications/email/campaigns/{id}/batches/{batchId}", Verbs="GET")
@Api(Description="Get email campaign batch notifications")
open class GetEmailCampaignBatchNotifications : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignBatchNotificationsResponse>
{
    /**
    * The email campaign id. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_all_email_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * The campaign batch id to list notifications for. Get it from get_email_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id to list notifications for. Get it from get_email_campaign_batches.", IsRequired=true)
    open var batchId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignBatchNotificationsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignBatchNotifications.responseType
}

/**
* Get email campaign statistics
*/
@Route(Path="/{version}/notifications/email/campaigns/{id}/stats", Verbs="GET")
@Api(Description="Get email campaign statistics")
open class GetEmailCampaignStatistics : CodeMashRequestBase(), IReturn<GetEmailCampaignStatisticsResponse>
{
    /**
    * The email campaign id to get statistics for. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id to get statistics for. Get it from get_all_email_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignStatisticsResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignStatistics.responseType
}

/**
* Preview an email notification
*/
@Route(Path="/{version}/notifications/email/preview", Verbs="GET")
@Api(Description="Preview an email notification")
open class PreviewEmailNotification : RequestBase(), IReturn<PreviewEmailNotificationResponse>
{
    /**
    * The opaque, pre-signed preview hash identifying the project and notification to preview.
    */
    @ApiMember(Description="The opaque, pre-signed preview hash identifying the project and notification to preview.", IsRequired=true)
    open var hash:String? = null
    companion object { private val responseType = PreviewEmailNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewEmailNotification.responseType
}

/**
* Stops a running email campaign
*/
@Route(Path="/{version}/notifications/email/campaigns/{Id}/stop", Verbs="POST")
@Api(Description="Stops a running email campaign")
@DataContract
open class StopEmailCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The campaign id to stop.
    */
    @DataMember
    @ApiMember(Description="The campaign id to stop.")
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @DataMember
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = StopEmailCampaignRequest.responseType
}

/**
* Get an email campaign message
*/
@Route(Path="/{version}/notifications/emails/campaigns/{campaignId}/messages/{id}", Verbs="GET")
@Api(Description="Get an email campaign message")
open class GetEmailCampaignMessage : CodeMashRequestBase(), IReturn<GetEmailCampaignMessageResponse>
{
    /**
    * The email campaign id. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_all_email_campaigns.", IsRequired=true)
    open var campaignId:String? = null

    /**
    * The campaign batch id. Get it from get_email_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_email_campaign_batches.", IsRequired=true)
    open var campaignBatchId:String? = null

    /**
    * The notification (message) id to fetch. Get it from get_email_campaign_messages.
    */
    @ApiMember(Description="The notification (message) id to fetch. Get it from get_email_campaign_messages.", IsRequired=true)
    open var notificationId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignMessageResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignMessage.responseType
}

/**
* Get email campaign messages
*/
@Route(Path="/{version}/notifications/emails/campaigns/{campaignId}/messages", Verbs="GET")
@Api(Description="Get email campaign messages")
open class GetEmailCampaignMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignMessagesResponse>
{
    /**
    * The email campaign id. Get it from get_all_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_all_email_campaigns.", IsRequired=true)
    open var campaignId:String? = null

    /**
    * The campaign batch id to list messages for. Get it from get_email_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id to list messages for. Get it from get_email_campaign_batches.", IsRequired=true)
    open var campaignBatchId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetEmailCampaignMessagesResponse::class.java }
    override fun getResponseType(): Any? = GetEmailCampaignMessagesRequest.responseType
}

open class EmailServiceEstablished
{
}

open class ProjectDatabaseConnected
{
    open var env:Env? = null
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
    open var env:Env? = null
}

open class EmailFooterMirrored
{
    open var footer:EmailFooter? = null
}

open class EmailFooterDeleted
{
    open var id:EmailFooterId? = null
    open var env:Env? = null
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
    open var env:Env? = null
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
    open var env:Env? = null
}

open class EmailIntegrationSetAsDefault
{
    open var env:Env? = null
    open var id:IntegrationId? = null
}

open class EmailIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailSignatureSaved
{
    open var id:EmailSignatureId? = null
    open var name:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<TemplateCode>> = ArrayList<MessageTranslation<TemplateCode>>()
    open var env:Env? = null
}

open class EmailSignatureMirrored
{
    open var signature:EmailSignature? = null
}

open class EmailSignatureDeleted
{
    open var id:EmailSignatureId? = null
    open var env:Env? = null
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
    open var env:Env? = null
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
    open var env:Env? = null
}

open class EmailTemplateMirrored
{
    open var template:EmailTemplate? = null
}

open class EmailTemplateBackfilled
{
    open var template:EmailTemplate? = null
}

open class EmailTemplateDeleted
{
    open var templateId:TemplateId? = null
    open var filesToBeDeleted:ArrayList<FileResourceRef>? = null
    open var fileIntegrationId:IntegrationId? = null
    open var env:Env? = null
}

open class EmailTemplateArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class EmailTemplateUnArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class EmailValidationIntegrationSaved
{
    open var integration:EmailValidationIntegration? = null
}

open class EmailValidationIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailValidationIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailValidationIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class EmailValidationIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class EmailBatchRegistered
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var startingAfter:String? = null
}

open class EmailNotificationRead
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var notificationId:NotificationId? = null
}

open class EmailNotificationClicked
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var notificationId:NotificationId? = null
    open var sourceId:String? = null
}

open class EmailCampaignStarted
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
}

open class EmailCampaignStopped
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var reason:CampaignStopReason? = null
}

open class EmailCampaignCompleted
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var errors:ArrayList<ErrorDto>? = null
}

open class EmailCampaignFailed
{
    open var projectId:ProjectId? = null
    open var campaignId:CampaignId? = null
    open var errors:ArrayList<ErrorDto> = ArrayList<ErrorDto>()
}

open class EmailCampaignTriggered
{
    open var projectId:ProjectId? = null
    open var triggerId:TriggerId? = null
    open var triggerType:TriggerType? = null
    open var sourceEvent:String? = null
    open var schemaId:String? = null
    open var tokenMappings:IReadOnlyDictionary<String, String>? = null
}

open class EmailDeliveryEventReceived
{
    open var projectId:ProjectId? = null
    open var integrationId:IntegrationId? = null
    open var recipient:EmailAddress? = null
    @SerializedName("type") open var Type:EmailDeliveryEventType? = null
    open var occurredAt:Date? = null
    open var providerMessageId:String? = null
    open var reason:String? = null
}

/**
* Disable SMS service
*/
@Route(Path="/{version}/notifications/sms/disable", Verbs="GET")
@Api(Description="Disable SMS service")
open class DisableSms : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableSms.responseType
}

/**
* Lists SMS-module dependencies shown before disable
*/
@Route(Path="/{version}/notifications/sms/disable-dependencies", Verbs="GET")
@Api(Description="Lists SMS-module dependencies shown before disable")
open class GetSmsDisableDependencies : CodeMashRequestBase(), IReturn<GetNotificationModuleDisableDependenciesResponse>
{
    companion object { private val responseType = GetNotificationModuleDisableDependenciesResponse::class.java }
    override fun getResponseType(): Any? = GetSmsDisableDependencies.responseType
}

/**
* Enable SMS service
*/
@Route(Path="/{version}/notifications/sms/enable", Verbs="GET")
@Api(Description="Enable SMS service")
open class EnableSms : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableSms.responseType
}

/**
* Archives sms template
*/
@Route(Path="/{version}/notifications/sms/templates/{Id}/archive", Verbs="PUT")
@Api(Description="Archives sms template")
open class ArchiveSmsTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS template id to archive. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id to archive. Get it from get_sms_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchiveSmsTemplateRequest.responseType
}

/**
* Clones sms template
*/
@Route(Path="/{version}/notifications/sms/templates/{Id}/clone", Verbs="POST")
@Api(Description="Clones sms template")
open class CloneSmsTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS template id to clone. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id to clone. Get it from get_sms_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CloneSmsTemplateRequest.responseType
}

/**
* Create SMS template
*/
@Route(Path="/{version}/notifications/sms/templates", Verbs="POST")
@Api(Description="Create SMS template")
open class CreateSmsTemplateRequest : SaveSmsTemplate(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateSmsTemplateRequest.responseType
}

/**
* Delete Sms Template for particular project
*/
@Route(Path="/{version}/notifications/sms/templates/{Id}", Verbs="DELETE")
@Api(Description="Delete Sms Template for particular project")
open class DeleteSmsTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS template id to delete. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id to delete. Get it from get_sms_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSmsTemplateRequest.responseType
}

/**
* Gets sms template by id
*/
@Route(Path="/{version}/notifications/sms/templates/{id}", Verbs="GET")
@Api(Description="Gets sms template by id")
open class GetSmsTemplate : CodeMashRequestBase(), IReturn<GetSmsTemplateResponse>
{
    /**
    * The SMS template id to fetch. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id to fetch. Get it from get_sms_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetSmsTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetSmsTemplate.responseType
}

/**
* Gets sms templates
*/
@Route(Path="/{version}/notifications/sms/templates", Verbs="GET")
@Api(Description="Gets sms templates")
open class GetSmsTemplates : CodeMashListPaginationRequestBase(), IReturn<GetSmsTemplatesResponse>
{
    /**
    * Set true to include archived templates.
    */
    @ApiMember(Description="Set true to include archived templates.")
    open var showArchived:Boolean? = null

    /**
    * Optional: return only the template with this id.
    */
    @ApiMember(Description="Optional: return only the template with this id.")
    open var templateId:String? = null
    companion object { private val responseType = GetSmsTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetSmsTemplates.responseType
}

/**
* Goes through the Sms template and returns all the tokens that are used in the template translations
*/
@Route(Path="/{version}/notifications/sms/templates/{id}/tokens", Verbs="GET")
@Api(Description="Goes through the Sms template and returns all the tokens that are used in the template translations")
open class GetSmsMessageContentTokens : CodeMashRequestBase(), IReturn<GetSmsMessageContentTokensResponse>
{
    /**
    * The SMS template id. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id. Get it from get_sms_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetSmsMessageContentTokensResponse::class.java }
    override fun getResponseType(): Any? = GetSmsMessageContentTokens.responseType
}

/**
* Runs the SMS Razor template, returns the bound text or the list of unresolved tokens.
*/
@Route(Path="/{version}/notifications/sms/templates/render", Verbs="POST")
@Api(Description="Runs the SMS Razor template, returns the bound text or the list of unresolved tokens.")
open class RenderSms : CodeMashRequestBase(), IReturn<RenderSmsTextResponse>
{
    /**
    * The Razor SMS template code to render.
    */
    @ApiMember(Description="The Razor SMS template code to render.")
    open var code:String? = null

    /**
    * Token name/value pairs to bind into the template.
    */
    @ApiMember(Description="Token name/value pairs to bind into the template.")
    open var tokens:ArrayList<TokenMappingDto>? = null

    /**
    * Set true when rendering for a preview (relaxes some validation).
    */
    @ApiMember(Description="Set true when rendering for a preview (relaxes some validation).")
    open var isForPreview:Boolean? = null
    companion object { private val responseType = RenderSmsTextResponse::class.java }
    override fun getResponseType(): Any? = RenderSms.responseType
}

/**
* Un-archives sms template
*/
@Route(Path="/{version}/notifications/sms/templates/{Id}/unarchive", Verbs="PUT")
@Api(Description="Un-archives sms template")
open class UnArchiveSmsTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS template id to unarchive.
    */
    @ApiMember(Description="The SMS template id to unarchive.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnArchiveSmsTemplateRequest.responseType
}

/**
* Edit sms template
*/
@Route(Path="/{version}/notifications/sms/templates", Verbs="PUT")
@Api(Description="Edit sms template")
open class UpdateSmsTemplateRequest : SaveSmsTemplate(), IReturn<EmptyResponse>
{
    /**
    * The SMS template id to update. Get it from get_sms_templates.
    */
    @ApiMember(Description="The SMS template id to update. Get it from get_sms_templates.", IsRequired=true)
    open var viewId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateSmsTemplateRequest.responseType
}

/**
* Gets SMS settings
*/
@Route(Path="/{version}/notifications/sms/settings", Verbs="GET")
@Api(Description="Gets SMS settings")
open class GetSmsSettings : CodeMashRequestBase(), IReturn<GetSmsSettingsResponse>
{
    /**
    * Unused legacy parameter; leave empty.
    */
    @ApiMember(Description="Unused legacy parameter; leave empty.")
    open var id:String? = null
    companion object { private val responseType = GetSmsSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetSmsSettings.responseType
}

/**
* Confirm that you received the test SMS delivery.
*/
@Route(Path="/{version}/notifications/sms/integrations/confirm-human-delivery", Verbs="POST")
@Api(Description="Confirm that you received the test SMS delivery.")
@DataContract
open class ConfirmSmsIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS integration id being verified. Get it from get_sms_integrations.
    */
    @DataMember
    @ApiMember(Description="The SMS integration id being verified. Get it from get_sms_integrations.")
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmSmsIntegrationHumanDeliveryRequest.responseType
}

/**
* Delete integration for particular project
*/
@Route(Path="/{version}/notifications/sms/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete integration for particular project")
open class DeleteSmsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS integration id to delete. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to delete. Get it from get_sms_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSmsIntegrationRequest.responseType
}

/**
* Disable integration for particular project
*/
@Route(Path="/{version}/notifications/sms/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable integration for particular project")
open class DisableSmsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS integration id to disable. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to disable. Get it from get_sms_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableSmsIntegrationRequest.responseType
}

/**
* Enable integration for particular project
*/
@Route(Path="/{version}/notifications/sms/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable integration for particular project")
open class EnableSmsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS integration id to enable. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to enable. Get it from get_sms_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableSmsIntegrationRequest.responseType
}

/**
* Gets integration by specified Id
*/
@Route(Path="/{version}/notifications/sms/integrations/{id}", Verbs="GET")
@Api(Description="Gets integration by specified Id")
open class GetSmsIntegration : CodeMashRequestBase(), IReturn<GetSmsIntegrationResponse>
{
    /**
    * The SMS integration id to fetch. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to fetch. Get it from get_sms_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetSmsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetSmsIntegration.responseType
}

/**
* Gets sms integrations
*/
@Route(Path="/{version}/notifications/sms/integrations", Verbs="GET")
@Api(Description="Gets sms integrations")
open class GetSmsIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetSmsIntegrationsResponse>
{
    companion object { private val responseType = GetSmsIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetSmsIntegrations.responseType
}

@Route(Path="/{version}/notifications/sms/integrations", Verbs="POST")
@DataContract
open class SaveSmsIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:SmsIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveSmsIntegration.responseType
}

/**
* Sets integration as default
*/
@Route(Path="/{version}/notifications/sms/integrations/{Id}/default", Verbs="PUT")
@Api(Description="Sets integration as default")
open class SetSmsIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The SMS integration id to set as default. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to set as default. Get it from get_sms_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetSmsIntegrationAsDefaultRequest.responseType
}

/**
* Test SMS integration
*/
@Route(Path="/{version}/notifications/sms/integrations/test", Verbs="POST")
@Api(Description="Test SMS integration")
open class TestSmsIntegration : CodeMashRequestBase(), IReturn<TestSmsIntegrationResponse>
{
    /**
    * The SMS integration id to test. Get it from get_sms_integrations.
    */
    @ApiMember(Description="The SMS integration id to test. Get it from get_sms_integrations.")
    open var integrationId:String? = null

    /**
    * Optional phone number (international format) to send the test SMS to.
    */
    @ApiMember(Description="Optional phone number (international format) to send the test SMS to.")
    open var to:String? = null
    companion object { private val responseType = TestSmsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestSmsIntegration.responseType
}

/**
* Create SMS campaign
*/
@Route(Path="/{version}/notifications/sms/campaigns", Verbs="POST")
@Api(Description="Create SMS campaign")
@DataContract
open class CreateSmsCampaignRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * SMS template id to send — pick one with get_sms_templates. Never invent it.
    */
    @DataMember
    @ApiMember(Description="SMS template id to send — pick one with get_sms_templates. Never invent it.")
    open var templateId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @DataMember
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Optional language code forcing one template translation for every recipient.
    */
    @DataMember
    @ApiMember(Description="Optional language code forcing one template translation for every recipient.")
    open var language:String? = null

    @DataMember
    open var initiatorId:String? = null

    /**
    * Audience type: 'AllUsers' (every project member subscribed to the SMS channel — role-based delivery can address MILLIONS of contacts), 'SpecifiedUsers' (exact member ids), or 'PhoneNumbers' (raw phone numbers). Fill EXACTLY the settings object matching this value. 'Collection' delivery is not available from chat.
    */
    @DataMember
    @ApiMember(Description="Audience type: 'AllUsers' (every project member subscribed to the SMS channel — role-based delivery can address MILLIONS of contacts), 'SpecifiedUsers' (exact member ids), or 'PhoneNumbers' (raw phone numbers). Fill EXACTLY the settings object matching this value. 'Collection' delivery is not available from chat.")
    open var deliveryType:SmsCampaignRecipientsSourceTypes? = null

    /**
    * For deliveryType 'AllUsers'. JSON object: {"recipientsSourceType":"AllUsers","rolesNames":["authenticated"],"userTags":[],"campaignTime":<unix seconds UTC>}. rolesNames/userTags are optional narrowing filters — verify exact role names with get_roles.
    */
    @DataMember
    @ApiMember(Description="For deliveryType 'AllUsers'. JSON object: {\"recipientsSourceType\":\"AllUsers\",\"rolesNames\":[\"authenticated\"],\"userTags\":[],\"campaignTime\":<unix seconds UTC>}. rolesNames/userTags are optional narrowing filters — verify exact role names with get_roles.")
    open var allUsers:SmsToAllUsersDeliverySettingsDto? = null

    /**
    * For deliveryType 'SpecifiedUsers'. JSON object: {"recipientsSourceType":"SpecifiedUsers","recipients":[<member ids>],"campaignTime":<unix seconds UTC>}.
    */
    @DataMember
    @ApiMember(Description="For deliveryType 'SpecifiedUsers'. JSON object: {\"recipientsSourceType\":\"SpecifiedUsers\",\"recipients\":[<member ids>],\"campaignTime\":<unix seconds UTC>}.")
    open var specifiedUsers:SmsToUsersDeliverySettingsDto? = null

    @DataMember
    open var collection:SmsToCollectionRecordsDeliverySettingsDto? = null

    /**
    * For deliveryType 'PhoneNumbers'. JSON object: {"recipientsSourceType":"PhoneNumbers","phoneNumbers":["+37060000000"],"campaignTime":<unix seconds UTC>}. Numbers in international format.
    */
    @DataMember
    @ApiMember(Description="For deliveryType 'PhoneNumbers'. JSON object: {\"recipientsSourceType\":\"PhoneNumbers\",\"phoneNumbers\":[\"+37060000000\"],\"campaignTime\":<unix seconds UTC>}. Numbers in international format.")
    open var phoneNumbers:SmsToPhoneNumbersDeliverySettingsDto? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateSmsCampaignRequest.responseType
}

/**
* Deletes sms campaign from queue
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}", Verbs="DELETE")
@Api(Description="Deletes sms campaign from queue")
open class DeleteSmsCampaign : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The campaign id to delete. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id to delete. Get it from get_sms_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteSmsCampaign.responseType
}

/**
* Get sms campaign by id
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}", Verbs="GET")
@Api(Description="Get sms campaign by id")
open class GetSmsCampaign : CodeMashRequestBase(), IReturn<GetSmsCampaignResponse>
{
    /**
    * The campaign id.
    */
    @ApiMember(Description="The campaign id.")
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaign.responseType
}

/**
* Gets sms campaigns
*/
@Route(Path="/{version}/notifications/sms/campaigns", Verbs="GET")
@Api(Description="Gets sms campaigns")
open class GetSmsCampaigns : CodeMashListPaginationRequestBase(), IReturn<GetSmsCampaignsResponse>
{
    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Optional: only campaigns built on this SMS template id.
    */
    @ApiMember(Description="Optional: only campaigns built on this SMS template id.")
    open var templateId:String? = null

    /**
    * Optional lower bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional lower bound for the campaign time, unix timestamp in seconds (UTC).")
    open var from:Long? = null

    /**
    * Optional upper bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional upper bound for the campaign time, unix timestamp in seconds (UTC).")
    open var to:Long? = null
    companion object { private val responseType = GetSmsCampaignsResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaigns.responseType
}

/**
* Gets sms campaign batches
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}/batches", Verbs="GET")
@Api(Description="Gets sms campaign batches")
open class GetSmsCampaignBatches : CodeMashListPaginationRequestBase(), IReturn<GetSmsCampaignBatchesResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.")
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignBatchesResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignBatches.responseType
}

/**
* Gets sms campaign batch notification
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}/batches/{batchId}/{notificationId}", Verbs="GET")
@Api(Description="Gets sms campaign batch notification")
open class GetSmsCampaignBatchNotification : CodeMashListPaginationRequestBase(), IReturn<GetSmsCampaignBatchNotificationResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * The campaign batch id. Get it from get_sms_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_sms_campaign_batches.", IsRequired=true)
    open var batchId:String? = null

    /**
    * The notification id. Get it from get_sms_campaign_batch_notifications.
    */
    @ApiMember(Description="The notification id. Get it from get_sms_campaign_batch_notifications.", IsRequired=true)
    open var notificationId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignBatchNotificationResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignBatchNotification.responseType
}

/**
* Gets sms campaign batch notifications
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}/batches/{batchId}", Verbs="GET")
@Api(Description="Gets sms campaign batch notifications")
open class GetSmsCampaignBatchNotifications : CodeMashListPaginationRequestBase(), IReturn<GetSmsCampaignBatchNotificationsResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * The campaign batch id. Get it from get_sms_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_sms_campaign_batches.", IsRequired=true)
    open var batchId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignBatchNotificationsResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignBatchNotifications.responseType
}

/**
* Get sms campaign statistics
*/
@Route(Path="/{version}/notifications/sms/campaigns/{id}/stats", Verbs="GET")
@Api(Description="Get sms campaign statistics")
open class GetSmsCampaignStatistics : CodeMashRequestBase(), IReturn<GetSmsCampaignStatisticsResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignStatisticsResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignStatistics.responseType
}

/**
* Returns SMS preview notification body
*/
@Route(Path="/{version}/notifications/sms/preview", Verbs="GET")
@Api(Description="Returns SMS preview notification body")
open class PreviewSmsNotification : RequestBase(), IReturn<PreviewSmsNotificationResponse>
{
    /**
    * Signed preview hash identifying the notification to render.
    */
    @ApiMember(Description="Signed preview hash identifying the notification to render.")
    open var hash:String? = null
    companion object { private val responseType = PreviewSmsNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewSmsNotification.responseType
}

/**
* Stops a running SMS campaign
*/
@Route(Path="/{version}/notifications/sms/campaigns/{Id}/stop", Verbs="POST")
@Api(Description="Stops a running SMS campaign")
open class StopSmsCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The campaign id to stop.
    */
    @ApiMember(Description="The campaign id to stop.")
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = StopSmsCampaignRequest.responseType
}

/**
* Gets campaign sms message details
*/
@Route(Path="/{version}/notifications/sms/campaigns/{campaignId}/messages/{id}", Verbs="GET")
@Api(Description="Gets campaign sms message details")
open class GetSmsCampaignMessage : CodeMashRequestBase(), IReturn<GetSmsCampaignMessageResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var campaignId:String? = null

    /**
    * The campaign batch id. Get it from get_sms_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_sms_campaign_batches.", IsRequired=true)
    open var campaignBatchId:String? = null

    /**
    * The notification (message) id. Get it from get_sms_campaign_messages.
    */
    @ApiMember(Description="The notification (message) id. Get it from get_sms_campaign_messages.", IsRequired=true)
    open var notificationId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignMessageResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignMessage.responseType
}

/**
* Gets the sms notifications
*/
@Route(Path="/{version}/notifications/sms/campaigns/{campaignId}/messages", Verbs="GET")
@Api(Description="Gets the sms notifications")
open class GetSmsCampaignMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetSmsCampaignMessagesResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var campaignId:String? = null

    /**
    * The campaign batch id. Get it from get_sms_campaign_batches.
    */
    @ApiMember(Description="The campaign batch id. Get it from get_sms_campaign_batches.", IsRequired=true)
    open var campaignBatchId:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetSmsCampaignMessagesResponse::class.java }
    override fun getResponseType(): Any? = GetSmsCampaignMessagesRequest.responseType
}

open class SmsIntegrationSaved
{
    open var integration:SmsIntegration? = null
}

open class SmsIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class SmsIntegrationHumanDeliveryConfirmed
{
    open var id:IntegrationId? = null
    open var confirmedAtUtc:Date? = null
}

open class SmsIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class SmsIntegrationSetAsDefault
{
    open var env:Env? = null
    open var id:IntegrationId? = null
}

open class SmsIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class SmsIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class SmsIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class SmsServiceEstablished
{
    open var defaultTemplates:ArrayList<SmsTemplate>? = null
}

open class SmsServiceEnabled
{
}

open class SmsServiceDisabled
{
}

open class SmsTemplateCreated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<SmsMessageContent>> = ArrayList<MessageTranslation<SmsMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
    open var env:Env? = null
}

open class SmsTemplateUpdated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<SmsMessageContent>> = ArrayList<MessageTranslation<SmsMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
    open var env:Env? = null
}

open class SmsTemplateMirrored
{
    open var template:SmsTemplate? = null
}

open class SmsTemplateDeleted
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class SmsTemplateArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class SmsTemplateUnArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class SmsBatchRegistered
{
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var startingAfter:String? = null
}

open class SmsNotificationRead
{
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var notificationId:NotificationId? = null
}

open class SmsNotificationClicked
{
    open var campaignId:CampaignId? = null
    open var campaignBatchId:CampaignBatchId? = null
    open var notificationId:NotificationId? = null
    open var sourceId:String? = null
}

open class SmsCampaignStarted
{
    open var campaignId:CampaignId? = null
}

open class SmsCampaignStopped
{
    open var campaignId:CampaignId? = null
    open var reason:CampaignStopReason? = null
}

open class SmsCampaignCompleted
{
    open var campaignId:CampaignId? = null
    open var errors:ArrayList<ErrorDto>? = null
}

open class SmsCampaignFailed
{
    open var campaignId:CampaignId? = null
    open var errors:ArrayList<ErrorDto> = ArrayList<ErrorDto>()
}

open class SmsCampaignTriggered
{
    open var projectId:ProjectId? = null
    open var triggerId:TriggerId? = null
    open var triggerType:TriggerType? = null
    open var sourceEvent:String? = null
    open var schemaId:String? = null
    open var tokenMappings:IReadOnlyDictionary<String, String>? = null
}

@Route(Path="/{version}/code/disable", Verbs="GET")
open class DisableCode : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableCode.responseType
}

@Route(Path="/{version}/code/enable", Verbs="GET")
open class EnableCode : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableCode.responseType
}

@Route(Path="/{version}/code/marketplace/listings/{ListingViewId}", Verbs="GET")
open class GetMarketplaceListing : CodeMashRequestBase(), IReturn<GetMarketplaceListingResponse>
{
    /**
    * Listing view id (ml_…), from get_marketplace_listings.
    */
    @ApiMember(Description="Listing view id (ml_…), from get_marketplace_listings.", IsRequired=true)
    open var listingViewId:String? = null
    companion object { private val responseType = GetMarketplaceListingResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceListing.responseType
}

@Route(Path="/{version}/code/marketplace/listings/{ListingViewId}/functions/{FunctionKey}/tokens", Verbs="GET")
open class GetMarketplaceListingFunctionTokens : CodeMashRequestBase(), IReturn<GetMarketplaceTokensResponse>
{
    /**
    * Marketplace listing view id, from get_marketplace_listings.
    */
    @ApiMember(Description="Marketplace listing view id, from get_marketplace_listings.", IsRequired=true)
    open var listingViewId:String? = null

    /**
    * Function key on the listing, from get_marketplace_listings.
    */
    @ApiMember(Description="Function key on the listing, from get_marketplace_listings.", IsRequired=true)
    open var functionKey:String? = null
    companion object { private val responseType = GetMarketplaceTokensResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceListingFunctionTokens.responseType
}

@Route(Path="/{version}/code/marketplace/listings", Verbs="GET")
open class GetMarketplaceListings : CodeMashListPaginationRequestBase(), IReturn<GetMarketplaceListingsResponse>
{
    /**
    * Filter by one or more categories (Crm, Erp, Communication, etc.).
    */
    @ApiMember(Description="Filter by one or more categories (Crm, Erp, Communication, etc.).")
    open var categories:ArrayList<MarketplaceCategory>? = null

    /**
    * Filter by transport (Mcp, Rest, Code).
    */
    @ApiMember(Description="Filter by transport (Mcp, Rest, Code).")
    open var transports:ArrayList<MarketplaceTransport>? = null

    /**
    * Free-text search over the listing's display name, vendor, and description.
    */
    @ApiMember(Description="Free-text search over the listing's display name, vendor, and description.")
    open var search:String? = null

    /**
    * If true, return only listings curated and verified by Norbix.
    */
    @ApiMember(Description="If true, return only listings curated and verified by Norbix.")
    open var officialOnly:Boolean? = null

    /**
    * Filter by curated tag slugs (e.g. ai-llm, messaging, crm). Matches listings carrying any of the given tags.
    */
    @ApiMember(Description="Filter by curated tag slugs (e.g. ai-llm, messaging, crm). Matches listings carrying any of the given tags.")
    open var tags:ArrayList<String>? = null
    companion object { private val responseType = GetMarketplaceListingsResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceListings.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}", Verbs="DELETE")
open class DeleteMarketplaceIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DeleteMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/disable", Verbs="POST")
open class DisableMarketplaceIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DisableMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/enable", Verbs="POST")
open class EnableMarketplaceIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = EnableMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}", Verbs="GET")
open class GetMarketplaceIntegration : CodeMashRequestBase(), IReturn<GetMarketplaceIntegrationResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = GetMarketplaceIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations", Verbs="GET")
open class GetMarketplaceIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetMarketplaceIntegrationsResponse>
{
    companion object { private val responseType = GetMarketplaceIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceIntegrations.responseType
}

@Route(Path="/{version}/code/marketplace/integrations", Verbs="POST")
@DataContract
open class SaveMarketplaceIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The marketplace integration to install, from a get_marketplace_listings entry.
    */
    @DataMember
    @ApiMember(Description="The marketplace integration to install, from a get_marketplace_listings entry.", IsRequired=true)
    open var integration:MarketplaceIntegrationDto? = null

    @DataMember
    open var secrets:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets", Verbs="PUT")
@DataContract
open class ReplaceMarketplaceIntegrationSecretsRequest : CodeMashRequestBase(), IReturn<EmptyMarketplaceSecretsResponse>
{
    /**
    * Integration view id (int_…).
    */
    @DataMember
    @ApiMember(Description="Integration view id (int_…).", IsRequired=true)
    open var integrationViewId:String? = null

    @DataMember
    open var secrets:HashMap<String,String> = HashMap<String,String>()
    companion object { private val responseType = EmptyMarketplaceSecretsResponse::class.java }
    override fun getResponseType(): Any? = ReplaceMarketplaceIntegrationSecretsRequest.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/secrets/reveal", Verbs="POST")
@DataContract
open class RevealMarketplaceIntegrationSecretsRequest : CodeMashRequestBase(), IReturn<RevealMarketplaceIntegrationSecretsResponse>
{
    /**
    * Integration view id (int_…).
    */
    @DataMember
    @ApiMember(Description="Integration view id (int_…).", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = RevealMarketplaceIntegrationSecretsResponse::class.java }
    override fun getResponseType(): Any? = RevealMarketplaceIntegrationSecretsRequest.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/test", Verbs="POST")
open class TestMarketplaceIntegration : CodeMashRequestBase(), IReturn<TestMarketplaceIntegrationResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = TestMarketplaceIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestMarketplaceIntegration.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/token-mappings", Verbs="PUT")
@DataContract
open class SetMarketplaceIntegrationTokenMappingsRequest : CodeMashRequestBase(), IReturn<SetMarketplaceIntegrationTokenMappingsResponse>
{
    /**
    * Integration view id (int_…).
    */
    @DataMember
    @ApiMember(Description="Integration view id (int_…).", IsRequired=true)
    open var integrationViewId:String? = null

    @DataMember
    open var tokenMappings:ArrayList<MarketplaceTokenMappingDto> = ArrayList<MarketplaceTokenMappingDto>()
    companion object { private val responseType = SetMarketplaceIntegrationTokenMappingsResponse::class.java }
    override fun getResponseType(): Any? = SetMarketplaceIntegrationTokenMappingsRequest.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}", Verbs="DELETE")
open class DeleteMarketplaceFunction : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * Function view id, from get_marketplace_functions.
    */
    @ApiMember(Description="Function view id, from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DeleteMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/disable", Verbs="POST")
open class DisableMarketplaceFunction : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * Function view id, from get_marketplace_functions.
    */
    @ApiMember(Description="Function view id, from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DisableMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/enable", Verbs="POST")
open class EnableMarketplaceFunction : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * Function view id, from get_marketplace_functions.
    */
    @ApiMember(Description="Function view id, from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = EnableMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}", Verbs="GET")
open class GetMarketplaceFunction : CodeMashRequestBase(), IReturn<GetMarketplaceFunctionResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * Function view id, from get_marketplace_functions.
    */
    @ApiMember(Description="Function view id, from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null
    companion object { private val responseType = GetMarketplaceFunctionResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions", Verbs="GET")
open class GetMarketplaceFunctions : CodeMashListPaginationRequestBase(), IReturn<GetMarketplaceFunctionsResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = GetMarketplaceFunctionsResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceFunctions.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/catalog", Verbs="GET")
open class GetMarketplaceFunctionCatalog : CodeMashRequestBase(), IReturn<GetMarketplaceFunctionCatalogResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null
    companion object { private val responseType = GetMarketplaceFunctionCatalogResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceFunctionCatalog.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions/{FunctionViewId}/tokens", Verbs="GET")
open class GetMarketplaceFunctionTokens : CodeMashRequestBase(), IReturn<GetMarketplaceTokensResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * Function view id, from get_marketplace_functions.
    */
    @ApiMember(Description="Function view id, from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null
    companion object { private val responseType = GetMarketplaceTokensResponse::class.java }
    override fun getResponseType(): Any? = GetMarketplaceFunctionTokens.responseType
}

@Route(Path="/{version}/code/marketplace/functions/{FunctionViewId}/invoke", Verbs="POST")
@DataContract
open class InvokeMarketplaceFunction : CodeMashRequestBase(), IReturn<InvokeMarketplaceFunctionResponse>
{
    /**
    * Function view id (func_…), from get_marketplace_functions.
    */
    @DataMember
    @ApiMember(Description="Function view id (func_…), from get_marketplace_functions.", IsRequired=true)
    open var functionViewId:String? = null

    @DataMember
    open var payload:HashMap<String,Object> = HashMap<String,Object>()
    companion object { private val responseType = InvokeMarketplaceFunctionResponse::class.java }
    override fun getResponseType(): Any? = InvokeMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/marketplace/integrations/{IntegrationViewId}/functions", Verbs="POST")
@DataContract
open class SaveMarketplaceFunction : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Integration view id, from get_marketplace_integrations.
    */
    @DataMember
    @ApiMember(Description="Integration view id, from get_marketplace_integrations.", IsRequired=true)
    open var integrationViewId:String? = null

    /**
    * The function to create: functionKey, displayName, description, and one mapping per vendor function parameter.
    */
    @DataMember
    @ApiMember(Description="The function to create: functionKey, displayName, description, and one mapping per vendor function parameter.", IsRequired=true)
    open var function:MarketplaceFunctionDto? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMarketplaceFunction.responseType
}

@Route(Path="/{version}/code/integrations/confirm-human-delivery", Verbs="POST")
@DataContract
open class ConfirmCodeIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @DataMember
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmCodeIntegrationHumanDeliveryRequest.responseType
}

@Route(Path="/{version}/code/integrations/{Id}", Verbs="DELETE")
open class DeleteCodeIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteCodeIntegrationRequest.responseType
}

@Route(Path="/{version}/code/integrations/{Id}/disable", Verbs="PUT")
open class DisableCodeIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableCodeIntegrationRequest.responseType
}

@Route(Path="/{version}/code/integrations/{Id}/enable", Verbs="PUT")
open class EnableCodeIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableCodeIntegrationRequest.responseType
}

@Route(Path="/{version}/code/integrations/{id}", Verbs="GET")
open class GetCodeIntegration : CodeMashRequestBase(), IReturn<GetCodeIntegrationResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetCodeIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetCodeIntegration.responseType
}

@Route(Path="/{version}/code/integrations", Verbs="GET")
open class GetCodeIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetCodeIntegrationsResponse>
{
    companion object { private val responseType = GetCodeIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetCodeIntegrations.responseType
}

@Route(Path="/{version}/code/integrations", Verbs="POST")
@DataContract
open class SaveCodeIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:CodeIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveCodeIntegration.responseType
}

@Route(Path="/{version}/code/integrations/{Id}/default", Verbs="PUT")
open class SetCodeIntegrationAsDefault : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetCodeIntegrationAsDefault.responseType
}

@Route(Path="/{version}/code/integrations/test", Verbs="POST")
open class TestCodeIntegration : CodeMashRequestBase(), IReturn<TestCodeIntegrationResponse>
{
    /**
    * Integration id, from get_code_integrations.
    */
    @ApiMember(Description="Integration id, from get_code_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = TestCodeIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestCodeIntegration.responseType
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
    open var env:Env? = null
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
    open var env:Env? = null
}

open class CodeIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class CodeIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class CodeIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class CodeIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationSaved
{
    open var integration:MarketplaceIntegration? = null
}

open class MarketplaceIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class MarketplaceFunctionSaved
{
    open var function:MarketplaceFunction? = null
}

open class MarketplaceFunctionDeleted
{
    open var integrationId:IntegrationId? = null
    open var functionId:MarketplaceFunctionId? = null
}

open class MarketplaceFunctionEnabled
{
    open var integrationId:IntegrationId? = null
    open var functionId:MarketplaceFunctionId? = null
}

open class MarketplaceFunctionDisabled
{
    open var integrationId:IntegrationId? = null
    open var functionId:MarketplaceFunctionId? = null
}

open class ServerlessEnabled
{
}

open class ServerlessDisabled
{
}

/**
* Disable push service
*/
@Route(Path="/{version}/notifications/push/disable", Verbs="GET")
@Api(Description="Disable push service")
open class DisablePush : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePush.responseType
}

/**
* Lists push disable dependencies
*/
@Route(Path="/{version}/notifications/push/disable-dependencies", Verbs="GET")
@Api(Description="Lists push disable dependencies")
open class GetPushDisableDependencies : CodeMashRequestBase(), IReturn<GetNotificationModuleDisableDependenciesResponse>
{
    companion object { private val responseType = GetNotificationModuleDisableDependenciesResponse::class.java }
    override fun getResponseType(): Any? = GetPushDisableDependencies.responseType
}

/**
* Enable push service
*/
@Route(Path="/{version}/notifications/push/enable", Verbs="GET")
@Api(Description="Enable push service")
open class EnablePush : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePush.responseType
}

/**
* Archives push template
*/
@Route(Path="/{version}/notifications/push/templates/{Id}/archive", Verbs="PUT")
@Api(Description="Archives push template")
open class ArchivePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push template id to archive. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to archive. Get it from get_push_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchivePushTemplateRequest.responseType
}

/**
* Clones push template
*/
@Route(Path="/{version}/notifications/push/templates/{Id}/clone", Verbs="POST")
@Api(Description="Clones push template")
open class ClonePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push template id to clone. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to clone. Get it from get_push_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ClonePushTemplateRequest.responseType
}

/**
* Create push template
*/
@Route(Path="/{version}/notifications/push/templates", Verbs="POST")
@Api(Description="Create push template")
open class CreatePushTemplateRequest : SavePushTemplate(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreatePushTemplateRequest.responseType
}

/**
* Delete push template
*/
@Route(Path="/{version}/notifications/push/templates/{Id}", Verbs="DELETE")
@Api(Description="Delete push template")
open class DeletePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push template id to delete. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to delete. Get it from get_push_templates.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePushTemplateRequest.responseType
}

/**
* Gets a push template
*/
@Route(Path="/{version}/notifications/push/templates/{id}", Verbs="GET")
@Api(Description="Gets a push template")
open class GetPushTemplate : CodeMashRequestBase(), IReturn<GetPushTemplateResponse>
{
    /**
    * The push template id to fetch. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to fetch. Get it from get_push_templates.")
    open var id:String? = null
    companion object { private val responseType = GetPushTemplateResponse::class.java }
    override fun getResponseType(): Any? = GetPushTemplate.responseType
}

/**
* Gets push templates
*/
@Route(Path="/{version}/notifications/push/templates", Verbs="GET")
@Api(Description="Gets push templates")
open class GetPushTemplates : CodeMashListPaginationRequestBase(), IReturn<GetPushTemplatesResponse>
{
    /**
    * Set true to include archived templates.
    */
    @ApiMember(Description="Set true to include archived templates.")
    open var showArchived:Boolean? = null

    /**
    * Optional: return only the template with this id.
    */
    @ApiMember(Description="Optional: return only the template with this id.")
    open var templateId:String? = null
    companion object { private val responseType = GetPushTemplatesResponse::class.java }
    override fun getResponseType(): Any? = GetPushTemplates.responseType
}

/**
* Gets push template content tokens
*/
@Route(Path="/{version}/notifications/push/templates/{id}/tokens", Verbs="GET")
@Api(Description="Gets push template content tokens")
open class GetPushMessageContentTokens : CodeMashRequestBase(), IReturn<GetPushMessageContentTokensResponse>
{
    /**
    * The push template id to scan for tokens. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to scan for tokens. Get it from get_push_templates.")
    open var id:String? = null
    companion object { private val responseType = GetPushMessageContentTokensResponse::class.java }
    override fun getResponseType(): Any? = GetPushMessageContentTokens.responseType
}

/**
* Renders a push template field
*/
@Route(Path="/{version}/notifications/push/templates/render", Verbs="POST")
@Api(Description="Renders a push template field")
open class RenderPush : CodeMashRequestBase(), IReturn<RenderPushResponse>
{
    /**
    * The Razor template source for the field being rendered (Title, Body, or Subtitle).
    */
    @ApiMember(Description="The Razor template source for the field being rendered (Title, Body, or Subtitle).", IsRequired=true)
    open var code:String? = null

    /**
    * Optional token values already bound for this render pass.
    */
    @ApiMember(Description="Optional token values already bound for this render pass.")
    open var tokens:ArrayList<TokenMappingDto>? = null

    /**
    * Set true when rendering for a preview (relaxes strict validation).
    */
    @ApiMember(Description="Set true when rendering for a preview (relaxes strict validation).")
    open var isForPreview:Boolean? = null
    companion object { private val responseType = RenderPushResponse::class.java }
    override fun getResponseType(): Any? = RenderPush.responseType
}

/**
* Un-archives push template
*/
@Route(Path="/{version}/notifications/push/templates/{Id}/unarchive", Verbs="PUT")
@Api(Description="Un-archives push template")
open class UnArchivePushTemplateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push template id to unarchive.
    */
    @ApiMember(Description="The push template id to unarchive.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnArchivePushTemplateRequest.responseType
}

/**
* Edit push template
*/
@Route(Path="/{version}/notifications/push/templates", Verbs="PUT")
@Api(Description="Edit push template")
open class UpdatePushTemplateRequest : SavePushTemplate(), IReturn<EmptyResponse>
{
    /**
    * The push template id to update. Get it from get_push_templates.
    */
    @ApiMember(Description="The push template id to update. Get it from get_push_templates.", IsRequired=true)
    open var viewId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdatePushTemplateRequest.responseType
}

/**
* Gets push settings
*/
@Route(Path="/{version}/notifications/push/settings", Verbs="GET")
@Api(Description="Gets push settings")
open class GetPushSettings : CodeMashRequestBase(), IReturn<GetPushSettingsResponse>
{
    /**
    * The push settings id to fetch.
    */
    @ApiMember(Description="The push settings id to fetch.")
    open var id:String? = null
    companion object { private val responseType = GetPushSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetPushSettings.responseType
}

/**
* Confirm human delivery of a test push
*/
@Route(Path="/{version}/notifications/push/integrations/confirm-human-delivery", Verbs="POST")
@Api(Description="Confirm human delivery of a test push")
@DataContract
open class ConfirmPushIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push integration id being verified. Get it from get_push_integrations.
    */
    @DataMember
    @ApiMember(Description="The push integration id being verified. Get it from get_push_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmPushIntegrationHumanDeliveryRequest.responseType
}

/**
* Delete push integration
*/
@Route(Path="/{version}/notifications/push/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete push integration")
open class DeletePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push integration id to delete. Get it from get_push_integrations.
    */
    @ApiMember(Description="The push integration id to delete. Get it from get_push_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePushIntegrationRequest.responseType
}

/**
* Disable push integration
*/
@Route(Path="/{version}/notifications/push/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable push integration")
open class DisablePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push integration id to disable. Get it from get_push_integrations.
    */
    @ApiMember(Description="The push integration id to disable. Get it from get_push_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePushIntegrationRequest.responseType
}

/**
* Enable push integration
*/
@Route(Path="/{version}/notifications/push/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable push integration")
open class EnablePushIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push integration id to enable. Get it from get_push_integrations.
    */
    @ApiMember(Description="The push integration id to enable. Get it from get_push_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePushIntegrationRequest.responseType
}

/**
* Gets a push integration
*/
@Route(Path="/{version}/notifications/push/integrations/{id}", Verbs="GET")
@Api(Description="Gets a push integration")
open class GetPushIntegration : CodeMashRequestBase(), IReturn<GetPushIntegrationResponse>
{
    /**
    * The push integration id to fetch. Get it from get_push_integrations.
    */
    @ApiMember(Description="The push integration id to fetch. Get it from get_push_integrations.")
    open var id:String? = null
    companion object { private val responseType = GetPushIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetPushIntegration.responseType
}

/**
* Gets push integrations
*/
@Route(Path="/{version}/notifications/push/integrations", Verbs="GET")
@Api(Description="Gets push integrations")
open class GetPushIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetPushIntegrationsResponse>
{
    companion object { private val responseType = GetPushIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetPushIntegrations.responseType
}

@Route(Path="/{version}/notifications/push/integrations", Verbs="POST")
@DataContract
open class SavePushIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:PushIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePushIntegration.responseType
}

/**
* Sets push integration as default
*/
@Route(Path="/{version}/notifications/push/integrations/{Id}/default", Verbs="PUT")
@Api(Description="Sets push integration as default")
open class SetPushIntegrationAsDefaultRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push integration id to set as default. Get it from get_push_integrations.
    */
    @ApiMember(Description="The push integration id to set as default. Get it from get_push_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetPushIntegrationAsDefaultRequest.responseType
}

/**
* Test push integration
*/
@Route(Path="/{version}/notifications/push/integrations/test", Verbs="POST")
@Api(Description="Test push integration")
open class TestPushIntegration : CodeMashRequestBase(), IReturn<TestEmailIntegrationResponse>
{
    /**
    * The push integration id to test. Get it from get_push_integrations.
    */
    @DataMember
    @ApiMember(Description="The push integration id to test. Get it from get_push_integrations.", IsRequired=true)
    open var integrationId:String? = null

    /**
    * Optional device token to send the test notification to. Requires DeliveryFamily when set.
    */
    @DataMember
    @ApiMember(Description="Optional device token to send the test notification to. Requires DeliveryFamily when set.")
    open var testToken:String? = null

    /**
    * Optional delivery family for the test token (e.g. Ios, Android, Chrome, Safari, Expo). Requires TestToken when set.
    */
    @DataMember
    @ApiMember(Description="Optional delivery family for the test token (e.g. Ios, Android, Chrome, Safari, Expo). Requires TestToken when set.")
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

/**
* Registers a device for push notifications
*/
@Route(Path="/{version}/notifications/push/devices", Verbs="POST")
@Api(Description="Registers a device for push notifications")
@DataContract
open class RegisterDevice : RequestBase(), IReturn<IdResponse>, IHasProjectId
{
    /**
    * The device details: OS, token, model, and delivery family.
    */
    @DataMember
    @ApiMember(Description="The device details: OS, token, model, and delivery family.", IsRequired=true)
    open var pushDeviceDto:PushDeviceDto? = null

    /**
    * The id of the user this device belongs to.
    */
    @DataMember
    @ApiMember(Description="The id of the user this device belongs to.", IsRequired=true)
    open var userId:String? = null

    @DataMember
    override var projectId:String? = null

    /**
    * Optional account id to associate with the device.
    */
    @DataMember
    @ApiMember(Description="Optional account id to associate with the device.")
    open var accountId:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = RegisterDevice.responseType
}

/**
* Create push campaign
*/
@Route(Path="/{version}/notifications/push/campaigns", Verbs="POST")
@Api(Description="Create push campaign")
@DataContract
open class CreatePushCampaignRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var campaign:PushCampaignRequest? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreatePushCampaignRequest.responseType
}

/**
* Deletes push campaign from queue
*/
@Route(Path="/{version}/notifications/push/campaigns/{Id}", Verbs="DELETE")
@Api(Description="Deletes push campaign from queue")
@DataContract
open class DeletePushCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePushCampaignRequest.responseType
}

/**
* Gets push campaign by id
*/
@Route(Path="/{version}/notifications/push/campaigns/{id}", Verbs="GET")
@Api(Description="Gets push campaign by id")
open class GetPushCampaign : CodeMashRequestBase(), IReturn<GetPushCampaignResponse>
{
    /**
    * The campaign id.
    */
    @ApiMember(Description="The campaign id.")
    open var id:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaign.responseType
}

/**
* Gets push campaigns
*/
@Route(Path="/{version}/notifications/push/campaigns", Verbs="GET")
@Api(Description="Gets push campaigns")
open class GetPushCampaigns : CodeMashListPaginationRequestBase(), IReturn<GetPushCampaignsResponse>
{
    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null

    /**
    * Optional: only campaigns built on this push template id.
    */
    @ApiMember(Description="Optional: only campaigns built on this push template id.")
    open var templateId:String? = null

    /**
    * Optional lower bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional lower bound for the campaign time, unix timestamp in seconds (UTC).")
    open var from:Long? = null

    /**
    * Optional upper bound for the campaign time, unix timestamp in seconds (UTC).
    */
    @ApiMember(Description="Optional upper bound for the campaign time, unix timestamp in seconds (UTC).")
    open var to:Long? = null
    companion object { private val responseType = GetPushCampaignsResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaigns.responseType
}

/**
* Gets push campaign batches
*/
@Route(Path="/{version}/notifications/push/campaigns/{id}/batches", Verbs="GET")
@Api(Description="Gets push campaign batches")
open class GetPushCampaignBatches : CodeMashListPaginationRequestBase(), IReturn<GetPushCampaignBatchesResponse>
{
    /**
    * The push campaign id to list batches for. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id to list batches for. Get it from get_push_campaigns.")
    open var id:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null

    /**
    * Optional: only return the batch with this id.
    */
    @ApiMember(Description="Optional: only return the batch with this id.")
    open var batchId:String? = null
    companion object { private val responseType = GetPushCampaignBatchesResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignBatches.responseType
}

/**
* Gets a push campaign batch notification
*/
@Route(Path="/{version}/notifications/push/campaigns/{id}/batches/{batchId}/{notificationId}", Verbs="GET")
@Api(Description="Gets a push campaign batch notification")
open class GetPushCampaignBatchNotification : CodeMashListPaginationRequestBase(), IReturn<GetPushCampaignBatchNotificationResponse>
{
    /**
    * The push campaign id. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id. Get it from get_push_campaigns.")
    open var id:String? = null

    /**
    * The batch id. Get it from get_push_campaign_batches.
    */
    @ApiMember(Description="The batch id. Get it from get_push_campaign_batches.")
    open var batchId:String? = null

    /**
    * The notification id within the batch.
    */
    @ApiMember(Description="The notification id within the batch.")
    open var notificationId:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignBatchNotificationResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignBatchNotification.responseType
}

/**
* Gets push campaign batch notifications
*/
@Route(Path="/{version}/notifications/push/campaigns/{id}/batches/{batchId}", Verbs="GET")
@Api(Description="Gets push campaign batch notifications")
open class GetPushCampaignBatchNotifications : CodeMashListPaginationRequestBase(), IReturn<GetPushCampaignBatchNotificationsResponse>
{
    /**
    * The push campaign id. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id. Get it from get_push_campaigns.")
    open var id:String? = null

    /**
    * The batch id to list notifications for. Get it from get_push_campaign_batches.
    */
    @ApiMember(Description="The batch id to list notifications for. Get it from get_push_campaign_batches.")
    open var batchId:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignBatchNotificationsResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignBatchNotifications.responseType
}

/**
* Get push campaign statistics
*/
@Route(Path="/{version}/notifications/push/campaigns/{id}/stats", Verbs="GET")
@Api(Description="Get push campaign statistics")
open class GetPushCampaignStatistics : CodeMashRequestBase(), IReturn<GetPushCampaignStatisticsResponse>
{
    /**
    * The push campaign id to get statistics for. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id to get statistics for. Get it from get_push_campaigns.")
    open var id:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignStatisticsResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignStatistics.responseType
}

/**
* Returns push preview notification
*/
@Route(Path="/{version}/notifications/push/preview", Verbs="GET")
@Api(Description="Returns push preview notification")
open class PreviewPushNotification : RequestBase(), IReturn<PreviewPushNotificationResponse>
{
    /**
    * The encrypted preview hash identifying the project and notification.
    */
    @ApiMember(Description="The encrypted preview hash identifying the project and notification.")
    open var hash:String? = null
    companion object { private val responseType = PreviewPushNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewPushNotification.responseType
}

/**
* Stops a running push campaign
*/
@Route(Path="/{version}/notifications/push/campaigns/{Id}/stop", Verbs="POST")
@Api(Description="Stops a running push campaign")
@DataContract
open class StopPushCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = StopPushCampaignRequest.responseType
}

/**
* Gets campaign push notification details
*/
@Route(Path="/{version}/notifications/push/campaigns/{campaignId}/messages/{id}", Verbs="GET")
@Api(Description="Gets campaign push notification details")
open class GetPushCampaignMessage : CodeMashRequestBase(), IReturn<GetPushCampaignMessageResponse>
{
    /**
    * The push campaign id. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id. Get it from get_push_campaigns.")
    open var campaignId:String? = null

    /**
    * The batch id. Get it from get_push_campaign_batches.
    */
    @ApiMember(Description="The batch id. Get it from get_push_campaign_batches.")
    open var campaignBatchId:String? = null

    /**
    * The notification id within the batch.
    */
    @ApiMember(Description="The notification id within the batch.")
    open var notificationId:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignMessageResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignMessage.responseType
}

/**
* Gets push campaign messages
*/
@Route(Path="/{version}/notifications/push/campaigns/{campaignId}/messages", Verbs="GET")
@Api(Description="Gets push campaign messages")
open class GetPushCampaignMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetPushCampaignMessagesResponse>
{
    /**
    * The push campaign id. Get it from get_push_campaigns.
    */
    @ApiMember(Description="The push campaign id. Get it from get_push_campaigns.")
    open var campaignId:String? = null

    /**
    * Optional: restrict results to this batch id. Get it from get_push_campaign_batches.
    */
    @ApiMember(Description="Optional: restrict results to this batch id. Get it from get_push_campaign_batches.")
    open var campaignBatchId:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignMessagesResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignMessagesRequest.responseType
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
    open var env:Env? = null
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
    open var env:Env? = null
}

open class PushIntegrationSetAsDefault
{
    open var env:Env? = null
    open var id:IntegrationId? = null
}

open class PushIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class PushIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class PushIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
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
    open var env:Env? = null
}

open class PushTemplateUpdated
{
    open var templateId:TemplateId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<PushMessageContent>> = ArrayList<MessageTranslation<PushMessageContent>>()
    open var channel:CommunicationChannel? = null
    open var description:String? = null
    open var tags:ArrayList<Tag>? = null
    open var env:Env? = null
}

open class PushTemplateMirrored
{
    open var template:PushTemplate? = null
}

open class PushTemplateDeleted
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class PushTemplateArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

open class PushTemplateUnArchived
{
    open var templateId:TemplateId? = null
    open var env:Env? = null
}

/**
* Disable payments service
*/
@Route(Path="/{version}/payments/disable", Verbs="GET")
@Api(Description="Disable payments service")
open class DisablePayments : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePayments.responseType
}

/**
* Enable payments service
*/
@Route(Path="/{version}/payments/enable", Verbs="GET")
@Api(Description="Enable payments service")
open class EnablePayments : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePayments.responseType
}

/**
* Gets the received payment webhooks log
*/
@Route(Path="/{version}/payments/webhooks/log", Verbs="GET")
@Api(Description="Gets the received payment webhooks log")
open class GetPaymentsWebhookLog : CodeMashRequestBase(), IReturn<GetPaymentsWebhookLogResponse>
{
    /**
    * Only rows for this payments integration (view id). Omit for the whole project.
    */
    @ApiMember(DataType="string", Description="Only rows for this payments integration (view id). Omit for the whole project.")
    open var integrationId:String? = null

    /**
    * Max rows to return, newest first. Default 50, ceiling 200.
    */
    @ApiMember(DataType="int", Description="Max rows to return, newest first. Default 50, ceiling 200.")
    open var limit:Int? = null
    companion object { private val responseType = GetPaymentsWebhookLogResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsWebhookLog.responseType
}

/**
* Delete payments trigger
*/
@Route(Path="/{version}/payments/triggers/{triggerId}", Verbs="DELETE")
@Api(Description="Delete payments trigger")
@DataContract
open class DeletePaymentsTrigger : DeleteTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePaymentsTrigger.responseType
}

/**
* Disable payments trigger
*/
@Route(Path="/{version}/payments/triggers/{triggerId}/disable", Verbs="PATCH")
@Api(Description="Disable payments trigger")
@DataContract
open class DisablePaymentsTrigger : DisableTrigger(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePaymentsTrigger.responseType
}

/**
* Enable payments trigger
*/
@Route(Path="/{version}/payments/triggers/{triggerId}/enable", Verbs="PATCH")
@Api(Description="Enable payments trigger")
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
@DataContract
open class SavePaymentsTrigger : SaveTrigger(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePaymentsTrigger.responseType
}

/**
* Confirm that you received or verified the test payment integration outcome.
*/
@Route(Path="/{version}/payments/integrations/confirm-human-delivery", Verbs="POST")
@Api(Description="Confirm that you received or verified the test payment integration outcome.")
@DataContract
open class ConfirmPaymentsIntegrationHumanDeliveryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The id of the payments integration whose test outcome is being confirmed.
    */
    @DataMember
    @ApiMember(Description="The id of the payments integration whose test outcome is being confirmed.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ConfirmPaymentsIntegrationHumanDeliveryRequest.responseType
}

/**
* Delete integration for particular project
*/
@Route(Path="/{version}/payments/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete integration for particular project")
open class DeletePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Payments integration id to delete, from get_payments_integrations.
    */
    @ApiMember(Description="Payments integration id to delete, from get_payments_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeletePaymentsIntegrationRequest.responseType
}

/**
* Disable integration for particular project
*/
@Route(Path="/{version}/payments/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable integration for particular project")
open class DisablePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Payments integration id to disable, from get_payments_integrations.
    */
    @ApiMember(Description="Payments integration id to disable, from get_payments_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisablePaymentsIntegrationRequest.responseType
}

/**
* Enable integration for particular project
*/
@Route(Path="/{version}/payments/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable integration for particular project")
open class EnablePaymentsIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Payments integration id to enable, from get_payments_integrations.
    */
    @ApiMember(Description="Payments integration id to enable, from get_payments_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnablePaymentsIntegrationRequest.responseType
}

/**
* Gets integration by specified Id
*/
@Route(Path="/{version}/payments/integrations/{id}", Verbs="GET")
@Api(Description="Gets integration by specified Id")
open class GetPaymentsIntegration : CodeMashRequestBase(), IReturn<GetPaymentsIntegrationResponse>
{
    /**
    * Payments integration id to fetch, from get_payments_integrations.
    */
    @ApiMember(Description="Payments integration id to fetch, from get_payments_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetPaymentsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsIntegration.responseType
}

/**
* Gets integrations
*/
@Route(Path="/{version}/payments/integrations", Verbs="GET")
@Api(Description="Gets integrations")
open class GetPaymentsIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetPaymentsIntegrationsResponse>
{
    companion object { private val responseType = GetPaymentsIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentsIntegrations.responseType
}

/**
* Saves payments integration
*/
@Route(Path="/{version}/payments/integrations", Verbs="POST")
@Api(Description="Saves payments integration")
@DataContract
open class SavePaymentsIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:PaymentIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePaymentsIntegration.responseType
}

/**
* Test payments integration
*/
@Route(Path="/{version}/payments/integrations/test", Verbs="POST")
@Api(Description="Test payments integration")
open class TestPaymentsIntegration : CodeMashRequestBase(), IReturn<TestPaymentsIntegrationResponse>
{
    /**
    * The id of the payments integration to test.
    */
    @ApiMember(Description="The id of the payments integration to test.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = TestPaymentsIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestPaymentsIntegration.responseType
}

open class PaymentsIntegrationSaved
{
    open var integration:PaymentIntegration? = null
}

open class PaymentsIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class PaymentsIntegrationHumanDeliveryConfirmed
{
    open var id:IntegrationId? = null
    open var confirmedAtUtc:Date? = null
}

open class PaymentsIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class PaymentsIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class PaymentsIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class PaymentsIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class PaymentsEstablished
{
}

open class PaymentsEnabled
{
}

open class PaymentsDisabled
{
}

open class PaymentsTriggerSaved
{
    open var trigger:PaymentTrigger? = null
}

open class PaymentTriggerMirrored
{
    open var trigger:Trigger? = null
}

open class PaymentsTriggerEnabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class PaymentsTriggerDisabled : TriggerByIdEventBase()
{
    open var env:Env? = null
}

open class PaymentsTriggerDeleted : TriggerByIdEventBase()
{
    open var env:Env? = null
}

/**
* Disable logging service
*/
@Route(Path="/{version}/logs/disable", Verbs="GET")
@Api(Description="Disable logging service")
open class DisableLogging : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLogging.responseType
}

@Route(Path="/{version}/logs/enable", Verbs="GET")
open class EnableLogging : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * When true, also create a Norbix Logging integration backed by the project's default database.
    */
    @ApiMember(DataType="boolean", Description="When true, also create a Norbix Logging integration backed by the project's default database.", Name="createNorbixLogging", ParameterType="query")
    open var createNorbixLogging:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLogging.responseType
}

/**
* Delete integration for particular project
*/
@Route(Path="/{version}/logs/integrations/{Id}", Verbs="DELETE")
@Api(Description="Delete integration for particular project")
open class DeleteLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Logging integration id to delete, from get_logging_integrations.
    */
    @ApiMember(Description="Logging integration id to delete, from get_logging_integrations.", IsRequired=true)
    open var id:String? = null

    /**
    * When true and this is a Norbix Logging integration, also permanently wipes the stored log entries in its backing database. Ignored for other providers.
    */
    @ApiMember(Description="When true and this is a Norbix Logging integration, also permanently wipes the stored log entries in its backing database. Ignored for other providers.")
    open var wipeLogs:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteLoggingIntegrationRequest.responseType
}

/**
* Disable integration for particular project
*/
@Route(Path="/{version}/logs/integrations/{Id}/disable", Verbs="PUT")
@Api(Description="Disable integration for particular project")
open class DisableLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Logging integration id to disable, from get_logging_integrations.
    */
    @ApiMember(Description="Logging integration id to disable, from get_logging_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLoggingIntegrationRequest.responseType
}

/**
* Enable integration for particular project
*/
@Route(Path="/{version}/logs/integrations/{Id}/enable", Verbs="PUT")
@Api(Description="Enable integration for particular project")
open class EnableLoggingIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Logging integration id to enable, from get_logging_integrations.
    */
    @ApiMember(Description="Logging integration id to enable, from get_logging_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLoggingIntegrationRequest.responseType
}

/**
* Gets integration by specified Id
*/
@Route(Path="/{version}/logs/integrations/{id}", Verbs="GET")
@Api(Description="Gets integration by specified Id")
open class GetLoggingIntegration : CodeMashRequestBase(), IReturn<GetLoggingIntegrationResponse>
{
    /**
    * Logging integration id to fetch, from get_logging_integrations.
    */
    @ApiMember(Description="Logging integration id to fetch, from get_logging_integrations.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetLoggingIntegrationResponse::class.java }
    override fun getResponseType(): Any? = GetLoggingIntegration.responseType
}

/**
* Gets integrations
*/
@Route(Path="/{version}/logs/integrations", Verbs="GET")
@Api(Description="Gets integrations")
open class GetLoggingIntegrations : CodeMashListPaginationRequestBase(), IReturn<GetLoggingIntegrationsResponse>
{
    companion object { private val responseType = GetLoggingIntegrationsResponse::class.java }
    override fun getResponseType(): Any? = GetLoggingIntegrations.responseType
}

/**
* Saves logging integration
*/
@Route(Path="/{version}/logs/integrations", Verbs="POST")
@Api(Description="Saves logging integration")
@DataContract
open class SaveLoggingIntegration : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:LoggingIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveLoggingIntegration.responseType
}

/**
* Test logging integration
*/
@Route(Path="/{version}/logs/integrations/test", Verbs="POST")
@Api(Description="Test logging integration")
open class TestLoggingIntegration : CodeMashRequestBase(), IReturn<TestLoggingIntegrationResponse>
{
    /**
    * Logging integration id to test, from get_logging_integrations.
    */
    @ApiMember(Description="Logging integration id to test, from get_logging_integrations.", IsRequired=true)
    open var integrationId:String? = null
    companion object { private val responseType = TestLoggingIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestLoggingIntegration.responseType
}

/**
* Delete every log entry stored in the project's Norbix Logging integration
*/
@Route(Path="/{version}/logs/clean", Verbs="POST")
@Api(Description="Delete every log entry stored in the project's Norbix Logging integration")
open class CleanLogs : CodeMashRequestBase(), IReturn<CleanLogsResponse>
{
    companion object { private val responseType = CleanLogsResponse::class.java }
    override fun getResponseType(): Any? = CleanLogs.responseType
}

/**
* Fetch the audit trail for a correlation id
*/
@Route(Path="/{version}/logs/audit", Verbs="GET")
@Api(Description="Fetch the audit trail for a correlation id")
open class GetLogsByCorrelationId : CodeMashRequestBase(), IReturn<GetLogsByCorrelationIdResponse>
{
    /**
    * The correlation id whose full request trail you want.
    */
    @ApiMember(DataType="string", Description="The correlation id whose full request trail you want.", IsRequired=true, Name="correlationId", ParameterType="query")
    open var targetCorrelationId:String? = null
    companion object { private val responseType = GetLogsByCorrelationIdResponse::class.java }
    override fun getResponseType(): Any? = GetLogsByCorrelationId.responseType
}

/**
* Fetch a filtered, cursor-paged list of tenant log entries
*/
@Route(Path="/{version}/logs", Verbs="GET")
@Api(Description="Fetch a filtered, cursor-paged list of tenant log entries")
open class GetLogs : CodeMashListPaginationRequestBase(), IReturn<GetLogsResponse>
{
    /**
    * Severity filter: Information, Warning or Error.
    */
    @ApiMember(DataType="string", Description="Severity filter: Information, Warning or Error.", Name="level", ParameterType="query")
    open var level:String? = null

    /**
    * Module filter: Database, Email, Membership, etc.
    */
    @ApiMember(DataType="string", Description="Module filter: Database, Email, Membership, etc.", Name="module", ParameterType="query")
    open var module:String? = null

    /**
    * Correlation id filter. Empty = no filter (show all).
    */
    @ApiMember(DataType="string", Description="Correlation id filter. Empty = no filter (show all).", Name="logCorrelationId", ParameterType="query")
    open var logCorrelationId:String? = null

    /**
    * Exact event code filter (e.g. db:record:insert).
    */
    @ApiMember(DataType="string", Description="Exact event code filter (e.g. db:record:insert).", Name="eventCode", ParameterType="query")
    open var eventCode:String? = null

    /**
    * Free-text search over title and message.
    */
    @ApiMember(DataType="string", Description="Free-text search over title and message.", Name="search", ParameterType="query")
    open var search:String? = null

    /**
    * Start of the timestamp range (inclusive, UTC). Optional.
    */
    @ApiMember(Description="Start of the timestamp range (inclusive, UTC). Optional.")
    open var fromUtc:Date? = null

    /**
    * End of the timestamp range (inclusive, UTC). Optional.
    */
    @ApiMember(Description="End of the timestamp range (inclusive, UTC). Optional.")
    open var toUtc:Date? = null
    companion object { private val responseType = GetLogsResponse::class.java }
    override fun getResponseType(): Any? = GetLogs.responseType
}

/**
* Fetch the per-project log settings (flags)
*/
@Route(Path="/{version}/logs/settings", Verbs="GET")
@Api(Description="Fetch the per-project log settings (flags)")
open class GetLogSettings : CodeMashRequestBase(), IReturn<GetLogSettingsResponse>
{
    companion object { private val responseType = GetLogSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetLogSettings.responseType
}

/**
* Update the per-project log settings (flags)
*/
@Route(Path="/{version}/logs/settings", Verbs="POST")
@Api(Description="Update the per-project log settings (flags)")
open class SaveLogSettings : CodeMashRequestBase(), IReturn<SaveLogSettingsResponse>
{
    /**
    * Drop log entries from requests originating from the Norbix studio (cloud dashboard).
    */
    @ApiMember(Description="Drop log entries from requests originating from the Norbix studio (cloud dashboard).")
    open var skipCloudDashboardLogs:Boolean? = null

    /**
    * Strip request/response body meta off http:request / http:response log entries.
    */
    @ApiMember(Description="Strip request/response body meta off http:request / http:response log entries.")
    open var skipHttpBodyMeta:Boolean? = null

    /**
    * Turn on tenant-visible log entries for AI chat turns. Default false.
    */
    @ApiMember(Description="Turn on tenant-visible log entries for AI chat turns. Default false.")
    open var aiChatLoggingEnabled:Boolean? = null
    companion object { private val responseType = SaveLogSettingsResponse::class.java }
    override fun getResponseType(): Any? = SaveLogSettings.responseType
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
    open var env:Env? = null
}

open class LoggingIntegrationRenamed
{
    open var id:IntegrationId? = null
    open var name:DisplayName? = null
    open var env:Env? = null
}

open class LoggingIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationSecretsCleared
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationSecretsClearingFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LoggingIntegrationSetAsDefault
{
    open var id:IntegrationId? = null
}

open class NorbixLoggingLogsWipeRequested
{
    open var deletedIntegrationId:IntegrationId? = null
    open var databaseIntegrationId:IntegrationId? = null
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
* Lists the AI tools this host exposes (external-agent bridge).
*/
@Route(Path="/{version}/account/ai/tools", Verbs="GET")
@Api(Description="Lists the AI tools this host exposes (external-agent bridge).")
open class GetAiToolsRequest : RequestBase(), IReturn<GetAiToolsResponse>
{
    open var toolset:String? = null
    companion object { private val responseType = GetAiToolsResponse::class.java }
    override fun getResponseType(): Any? = GetAiToolsRequest.responseType
}

/**
* Invokes one AI tool directly (external-agent bridge).
*/
@Route(Path="/{version}/account/ai/tools/{ToolName}", Verbs="POST")
@Api(Description="Invokes one AI tool directly (external-agent bridge).")
open class InvokeAiToolRequest : RequestBase(), IReturn<InvokeAiToolResponse>
{
    open var toolName:String? = null
    open var argumentsJson:String? = null
    companion object { private val responseType = InvokeAiToolResponse::class.java }
    override fun getResponseType(): Any? = InvokeAiToolRequest.responseType
}

/**
* Gets account info.
*/
@Route(Path="/{version}/account/chat/complete", Verbs="POST")
@Api(Description="Gets account info.")
open class AskChatRequest : RequestBase(), IReturn<AskChatResponse>
{
    open var prompt:String? = null
    open var profile:String? = null
    companion object { private val responseType = AskChatResponse::class.java }
    override fun getResponseType(): Any? = AskChatRequest.responseType
}

/**
* Uploads a file into an AI chat session.
*/
@Route(Path="/{version}/account/chat/attachments", Verbs="POST")
@Api(Description="Uploads a file into an AI chat session.")
open class UploadChatAttachmentRequest : RequestBase(), IReturn<UploadChatAttachmentResponse>
{
    open var sessionId:String? = null
    open var fileName:String? = null
    open var contentType:String? = null
    open var base64Content:String? = null
    open var profile:String? = null
    open var topic:String? = null
    open var projectId:String? = null
    open var env:String? = null
    companion object { private val responseType = UploadChatAttachmentResponse::class.java }
    override fun getResponseType(): Any? = UploadChatAttachmentRequest.responseType
}

/**
* Reports AI chat availability and the model-picker menu.
*/
@Route(Path="/{version}/account/chat/availability", Verbs="GET")
@Api(Description="Reports AI chat availability and the model-picker menu.")
open class ChatAvailabilityRequest : RequestBase(), IReturn<ChatAvailabilityResponse>
{
    open var projectId:String? = null
    open var env:String? = null
    companion object { private val responseType = ChatAvailabilityResponse::class.java }
    override fun getResponseType(): Any? = ChatAvailabilityRequest.responseType
}

/**
* Lists what the AI assistant remembers about this account.
*/
@Route(Path="/{version}/account/chat/memory", Verbs="GET")
@Api(Description="Lists what the AI assistant remembers about this account.")
open class GetChatMemoryRequest : RequestBase(), IReturn<GetChatMemoryResponse>
{
    open var projectId:String? = null
    companion object { private val responseType = GetChatMemoryResponse::class.java }
    override fun getResponseType(): Any? = GetChatMemoryRequest.responseType
}

/**
* Deletes one AI memory note ('forget this').
*/
@Route(Path="/{version}/account/chat/memory/{NoteId}", Verbs="DELETE")
@Api(Description="Deletes one AI memory note ('forget this').")
open class ForgetChatMemoryRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var noteId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ForgetChatMemoryRequest.responseType
}

/**
* Deletes an AI chat session (soft delete).
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}", Verbs="DELETE")
@Api(Description="Deletes an AI chat session (soft delete).")
open class DeleteChatSessionRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DeleteChatSessionRequest.responseType
}

/**
* Archives or unarchives an AI chat session.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/archive", Verbs="PATCH")
@Api(Description="Archives or unarchives an AI chat session.")
open class SetChatSessionArchivedRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var archived:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SetChatSessionArchivedRequest.responseType
}

/**
* Pins or unpins an AI chat session.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/pin", Verbs="PATCH")
@Api(Description="Pins or unpins an AI chat session.")
open class SetChatSessionPinnedRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var pinned:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SetChatSessionPinnedRequest.responseType
}

/**
* Marks or unmarks an AI chat session as "do not share".
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/sharing", Verbs="PATCH")
@Api(Description="Marks or unmarks an AI chat session as \"do not share\".")
open class SetChatSessionSharingRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var doNotShare:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SetChatSessionSharingRequest.responseType
}

/**
* Lists the account's recent AI chat sessions.
*/
@Route(Path="/{version}/account/chat/sessions", Verbs="GET")
@Api(Description="Lists the account's recent AI chat sessions.")
open class GetChatSessionsRequest : RequestBase(), IReturn<GetChatSessionsResponse>
{
    open var take:Int? = null
    open var includeArchived:Boolean? = null
    companion object { private val responseType = GetChatSessionsResponse::class.java }
    override fun getResponseType(): Any? = GetChatSessionsRequest.responseType
}

/**
* Returns one AI chat session's conversation entries — the transcript.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/entries", Verbs="GET")
@Api(Description="Returns one AI chat session's conversation entries — the transcript.")
open class GetChatSessionEntriesRequest : RequestBase(), IReturn<GetChatSessionEntriesResponse>
{
    open var sessionId:String? = null
    open var sinceSeq:Long? = null
    companion object { private val responseType = GetChatSessionEntriesResponse::class.java }
    override fun getResponseType(): Any? = GetChatSessionEntriesRequest.responseType
}

/**
* Records like / dislike feedback on one AI chat entry, or clears it.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/entries/{EntryId}/feedback", Verbs="POST")
@Api(Description="Records like / dislike feedback on one AI chat entry, or clears it.")
open class SetChatEntryFeedbackRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var entryId:String? = null
    open var feedback:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SetChatEntryFeedbackRequest.responseType
}

/**
* Answers one open AI chat question — or a prepared change's Apply / Skip — and continues the conversation.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/questions/{EntryId}/answer", Verbs="POST")
@Api(Description="Answers one open AI chat question — or a prepared change's Apply / Skip — and continues the conversation.")
open class AnswerChatQuestionRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var entryId:String? = null
    open var answers:HashMap<String,String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = AnswerChatQuestionRequest.responseType
}

/**
* Approves or rejects a proposed AI chat plan.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/plans/{EntryId}/decision", Verbs="POST")
@Api(Description="Approves or rejects a proposed AI chat plan.")
open class DecideChatPlanRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var entryId:String? = null
    open var decision:String? = null
    open var comment:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = DecideChatPlanRequest.responseType
}

/**
* Stops one running step of an AI chat plan run.
*/
@Route(Path="/{version}/account/chat/sessions/{SessionId}/steps/{EntryId}/stop", Verbs="POST")
@Api(Description="Stops one running step of an AI chat plan run.")
open class StopChatRunStepRequest : RequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var entryId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = StopChatRunStepRequest.responseType
}

/**
* Runs one AI chat conversation turn.
*/
@Route(Path="/{version}/account/chat/turn", Verbs="POST")
@Api(Description="Runs one AI chat conversation turn.")
open class ChatTurnRequest : RequestBase(), IReturn<ChatTurnResponse>
{
    open var sessionId:String? = null
    open var message:String? = null
    open var profile:String? = null
    open var topic:String? = null
    open var llmIntegrationId:String? = null
    open var model:String? = null
    open var projectId:String? = null
    open var env:String? = null
    open var screenContext:ChatScreenContextDto? = null
    companion object { private val responseType = ChatTurnResponse::class.java }
    override fun getResponseType(): Any? = ChatTurnRequest.responseType
}

/**
* MCP server endpoint — JSON-RPC 2.0 over HTTP POST exposing the AI tool catalog.
*/
@Route(Path="/{version}/account/mcp", Verbs="POST")
@Api(Description="MCP server endpoint — JSON-RPC 2.0 over HTTP POST exposing the AI tool catalog.")
open class McpRequest : IReturn<String>
{
    open var version:String? = null
    open var requestStream:InputStream? = null
    companion object { private val responseType = String::class.java }
    override fun getResponseType(): Any? = McpRequest.responseType
}

/**
* Reads a project's AI Brief: the requirements, decisions and assumptions the assistant recorded from conversations, each with the chat turn, user and time it came from.
*/
@Route(Path="/{version}/projects/{projectId}/ai/brief", Verbs="GET")
@Api(Description="Reads a project's AI Brief: the requirements, decisions and assumptions the assistant recorded from conversations, each with the chat turn, user and time it came from.")
open class GetProjectBriefRequest : CodeMashRequestBase(), IReturn<GetProjectBriefResponse>
{
    /**
    * Return the Brief events after this sequence number as well (0 = all). Omit for the snapshot only.
    */
    @ApiMember(Description="Return the Brief events after this sequence number as well (0 = all). Omit for the snapshot only.")
    open var sinceSeq:Long? = null
    companion object { private val responseType = GetProjectBriefResponse::class.java }
    override fun getResponseType(): Any? = GetProjectBriefRequest.responseType
}

/**
* Lists a project's AI work items: one serious ask each, with its goal, plans, changes, moved-out items, needs-you list and open questions.
*/
@Route(Path="/{version}/projects/{projectId}/ai/work-items", Verbs="GET")
@Api(Description="Lists a project's AI work items: one serious ask each, with its goal, plans, changes, moved-out items, needs-you list and open questions.")
open class GetWorkItemsRequest : CodeMashRequestBase(), IReturn<GetWorkItemsResponse>
{
    /**
    * Filter by status: proposed, active, waiting, done, partly-done or dropped. Omit for all.
    */
    @ApiMember(Description="Filter by status: proposed, active, waiting, done, partly-done or dropped. Omit for all.")
    open var status:String? = null
    companion object { private val responseType = GetWorkItemsResponse::class.java }
    override fun getResponseType(): Any? = GetWorkItemsRequest.responseType
}

/**
* Reads one AI work item: the six long-task sections and the definition-of-done verdict.
*/
@Route(Path="/{version}/projects/{projectId}/ai/work-items/{WorkItemId}", Verbs="GET")
@Api(Description="Reads one AI work item: the six long-task sections and the definition-of-done verdict.")
open class GetWorkItemRequest : CodeMashRequestBase(), IReturn<GetWorkItemResponse>
{
    open var workItemId:String? = null
    companion object { private val responseType = GetWorkItemResponse::class.java }
    override fun getResponseType(): Any? = GetWorkItemRequest.responseType
}

/**
* Exports one AI work item as markdown in the long-task shape: Goal, Plan, Changes, Rejected / moved out, Needs you, Open questions.
*/
@Route(Path="/{version}/projects/{projectId}/ai/work-items/{WorkItemId}/export.md", Verbs="GET")
@Api(Description="Exports one AI work item as markdown in the long-task shape: Goal, Plan, Changes, Rejected / moved out, Needs you, Open questions.")
open class ExportWorkItemRequest : CodeMashRequestBase(), IReturn<ExportWorkItemResponse>
{
    open var workItemId:String? = null
    companion object { private val responseType = ExportWorkItemResponse::class.java }
    override fun getResponseType(): Any? = ExportWorkItemRequest.responseType
}

/**
* Ticks one manual line of a work item's "Needs you" checklist — the one write a human makes to a work item directly.
*/
@Route(Path="/{version}/projects/{projectId}/ai/work-items/{WorkItemId}/needs-you/{Index}/done", Verbs="POST")
@Api(Description="Ticks one manual line of a work item's \"Needs you\" checklist — the one write a human makes to a work item directly.")
open class MarkNeedsYouDoneRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var workItemId:String? = null
    open var index:Int? = null
    /**
    * Set false to un-tick the line. Default true.
    */
    @ApiMember(Description="Set false to un-tick the line. Default true.")
    open var done:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = MarkNeedsYouDoneRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}", Verbs="DELETE")
open class DeleteLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the LLM integration to delete.
    */
    @ApiMember(Description="Id of the LLM integration to delete.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}/disable", Verbs="PUT")
open class DisableLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the LLM integration to disable.
    */
    @ApiMember(Description="Id of the LLM integration to disable.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{Id}/enable", Verbs="PUT")
open class EnableLlmIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the LLM integration to enable.
    */
    @ApiMember(Description="Id of the LLM integration to enable.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableLlmIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/llms/{id}", Verbs="GET")
open class GetLlmIntegration : CodeMashRequestBase(), IReturn<GetLlmIntegrationResponse>
{
    /**
    * Id of the LLM integration to fetch.
    */
    @ApiMember(Description="Id of the LLM integration to fetch.")
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
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:LlmIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveLlmIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/llms/test", Verbs="POST")
open class TestLlmIntegration : CodeMashRequestBase(), IReturn<TestLlmIntegrationResponse>
{
    /**
    * Id of the LLM integration to test.
    */
    @ApiMember(Description="Id of the LLM integration to test.")
    open var integrationId:String? = null
    companion object { private val responseType = TestLlmIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestLlmIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}", Verbs="DELETE")
open class DeleteMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the MCP integration to delete.
    */
    @ApiMember(Description="Id of the MCP integration to delete.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}/disable", Verbs="PUT")
open class DisableMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the MCP integration to disable.
    */
    @ApiMember(Description="Id of the MCP integration to disable.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{Id}/enable", Verbs="PUT")
open class EnableMcpIntegrationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the MCP integration to enable.
    */
    @ApiMember(Description="Id of the MCP integration to enable.")
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableMcpIntegrationRequest.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/{id}", Verbs="GET")
open class GetMcpIntegration : CodeMashRequestBase(), IReturn<GetMcpIntegrationResponse>
{
    /**
    * Id of the MCP integration to fetch.
    */
    @ApiMember(Description="Id of the MCP integration to fetch.")
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
    @DataMember(Name="integration")
    @SerializedName("integration")
    open var integration:McpIntegrationRequest? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveMcpIntegration.responseType
}

@Route(Path="/{version}/ai/integrations/mcp/test", Verbs="POST")
open class TestMcpIntegration : CodeMashRequestBase(), IReturn<TestLlmIntegrationResponse>
{
    /**
    * Id of the MCP integration to test.
    */
    @ApiMember(Description="Id of the MCP integration to test.")
    open var integrationId:String? = null
    companion object { private val responseType = TestLlmIntegrationResponse::class.java }
    override fun getResponseType(): Any? = TestMcpIntegration.responseType
}

open class LlmIntegrationSaved
{
    open var llmIntegration:LlmIntegration? = null
}

open class LlmIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LlmIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LlmIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LlmIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LlmIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class LlmIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
}

open class McpIntegrationSaved
{
    open var mcpIntegration:McpIntegration? = null
}

open class McpIntegrationDeleted
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class McpIntegrationEnabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class McpIntegrationDisabled
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class McpIntegrationSecretsConfigured
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class McpIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class McpIntegrationTested
{
    open var id:IntegrationId? = null
    open var succeeded:Boolean? = null
    open var errorMessages:IReadOnlyList<String>? = null
    open var testedAtUtc:Date? = null
    open var env:Env? = null
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
    open var env:Env? = null
}

open class WebhookIntegrationSecretsConfigurationFailed
{
    open var id:IntegrationId? = null
    open var env:Env? = null
}

open class WebhookIntegrationSecretsCleared
{
    open var id:IntegrationId? = null
    open var env:Env? = null
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

/**
* Gets the project's webhook integration
*/
@Route(Path="/{version}/webhooks/integration", Verbs="GET")
@Api(Description="Gets the project's webhook integration")
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
    /**
    * The integration-wide static headers to send with every delivery. Pass an empty dictionary to clear all extra headers.
    */
    @ApiMember(Description="The integration-wide static headers to send with every delivery. Pass an empty dictionary to clear all extra headers.")
    open var extraHeaders:HashMap<String,String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateWebhookIntegrationExtraHeadersRequest.responseType
}

@Route(Path="/{version}/webhooks/{source}/{integrationInstanceId}", Verbs="POST")
open class ReceiveWebhook : IReturn<HttpResult>
{
    open var source:String? = null
    open var integrationInstanceId:String? = null
    open var requestStream:InputStream? = null
    companion object { private val responseType = HttpResult::class.java }
    override fun getResponseType(): Any? = ReceiveWebhook.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}/disable", Verbs="PUT")
open class DisableWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The webhook destination id to disable, from get_webhook_integration.
    */
    @ApiMember(Description="The webhook destination id to disable, from get_webhook_integration.", IsRequired=true)
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DisableWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}/enable", Verbs="PUT")
open class EnableWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The webhook destination id to enable, from get_webhook_integration.
    */
    @ApiMember(Description="The webhook destination id to enable, from get_webhook_integration.", IsRequired=true)
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = EnableWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations/{DestinationId}", Verbs="DELETE")
open class RemoveWebhookDestinationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The webhook destination id to remove, from get_webhook_integration.
    */
    @ApiMember(Description="The webhook destination id to remove, from get_webhook_integration.", IsRequired=true)
    open var destinationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveWebhookDestinationRequest.responseType
}

@Route(Path="/{version}/webhooks/destinations", Verbs="POST")
open class SaveWebhookDestinationRequest : CodeMashRequestBase(), IReturn<SaveWebhookDestinationResponse>
{
    /**
    * Existing destination id to overwrite, from get_webhook_integration. Omit to create a new destination.
    */
    @ApiMember(Description="Existing destination id to overwrite, from get_webhook_integration. Omit to create a new destination.")
    open var destinationId:String? = null

    /**
    * Display name for the destination.
    */
    @ApiMember(Description="Display name for the destination.", IsRequired=true)
    open var destinationName:String? = null

    /**
    * The HTTPS endpoint URL that will receive the webhook deliveries.
    */
    @ApiMember(Description="The HTTPS endpoint URL that will receive the webhook deliveries.", IsRequired=true)
    open var endpointUrl:String? = null

    /**
    * The event names this destination subscribes to. Empty subscribes to none.
    */
    @ApiMember(Description="The event names this destination subscribes to. Empty subscribes to none.")
    open var selectedEvents:ArrayList<String> = ArrayList<String>()

    /**
    * Destination-specific static headers sent with every delivery to this destination. These win over the integration-wide extra headers on duplicate keys.
    */
    @ApiMember(Description="Destination-specific static headers sent with every delivery to this destination. These win over the integration-wide extra headers on duplicate keys.")
    open var extraHeaders:HashMap<String,String>? = null

    /**
    * Whether this destination is enabled for delivery. Defaults to true.
    */
    @ApiMember(Description="Whether this destination is enabled for delivery. Defaults to true.")
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

/**
* Gets a scheduled task by id
*/
@Route(Path="/{version}/scheduler/tasks/{id}", Verbs="GET")
@Api(Description="Gets a scheduled task by id")
open class GetSchedulerTask : CodeMashRequestBase(), IReturn<GetSchedulerTaskResponse>
{
    open var id:String? = null
    companion object { private val responseType = GetSchedulerTaskResponse::class.java }
    override fun getResponseType(): Any? = GetSchedulerTask.responseType
}

/**
* Gets scheduled tasks
*/
@Route(Path="/{version}/scheduler/tasks", Verbs="GET")
@Api(Description="Gets scheduled tasks")
open class GetSchedulerTasks : CodeMashListPaginationRequestBase(), IReturn<GetSchedulerTasksResponse>
{
    /**
    * Optional filter — only return tasks of this type.
    */
    @ApiMember(Description="Optional filter — only return tasks of this type.")
    @SerializedName("type") open var Type:SchedulerTaskType? = null

    /**
    * Optional filter — only return tasks whose enabled state matches this value.
    */
    @ApiMember(Description="Optional filter — only return tasks whose enabled state matches this value.")
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

@Route(Path="/{version}/resources/resolve", Verbs="POST")
open class ResolveResources : CodeMashRequestBase(), IReturn<ResolveResourcesResponse>
{
    open var refs:IReadOnlyList<ResourceRefDto>? = null
    companion object { private val responseType = ResolveResourcesResponse::class.java }
    override fun getResponseType(): Any? = ResolveResources.responseType
}

/**
* Create a contact
*/
@Route(Path="/{version}/membership/users", Verbs="POST")
@Api(Description="Create a contact")
open class CreateContactRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Primary email address of the contact (optional if a phone is given).
    */
    @ApiMember(Description="Primary email address of the contact (optional if a phone is given).")
    open var primaryEmail:String? = null

    /**
    * Primary phone number in international format, e.g. +14155550123 (optional if an email is given).
    */
    @ApiMember(Description="Primary phone number in international format, e.g. +14155550123 (optional if an email is given).")
    open var primaryPhone:String? = null

    /**
    * Display name shown in the dashboard (optional).
    */
    @ApiMember(Description="Display name shown in the dashboard (optional).")
    open var displayName:String? = null

    /**
    * Contact's first name (optional).
    */
    @ApiMember(Description="Contact's first name (optional).")
    open var firstName:String? = null

    /**
    * Contact's last name (optional).
    */
    @ApiMember(Description="Contact's last name (optional).")
    open var lastName:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CreateContactRequest.responseType
}

/**
* Archive a contact
*/
@Route(Path="/{version}/membership/users/{contactId}", Verbs="DELETE")
@Api(Description="Archive a contact")
open class DeleteContact : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) to archive. Get it from get_all_contacts.
    */
    @ApiMember(Description="The contact id (ct_…) to archive. Get it from get_all_contacts.", IsRequired=true)
    open var contactId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteContact.responseType
}

/**
* Get a contact
*/
@Route(Path="/{version}/membership/users/{contactId}", Verbs="GET")
@Api(Description="Get a contact")
open class GetContact : CodeMashRequestBase(), IReturn<GetContactResponse>
{
    /**
    * The contact id (ct_…) to fetch. Get it from get_all_contacts.
    */
    @ApiMember(Description="The contact id (ct_…) to fetch. Get it from get_all_contacts.", IsRequired=true)
    open var contactId:String? = null
    companion object { private val responseType = GetContactResponse::class.java }
    override fun getResponseType(): Any? = GetContact.responseType
}

/**
* List contacts
*/
@Route(Path="/{version}/membership/users", Verbs="GET")
@Api(Description="List contacts")
open class GetAllContacts : CodeMashRequestBase(), IReturn<GetAllContactsResponse>
{
    /**
    * Cursor for the next page: pass the nextCursor from the previous call. Omit for the first page.
    */
    @ApiMember(Description="Cursor for the next page: pass the nextCursor from the previous call. Omit for the first page.")
    open var startingAfter:String? = null

    /**
    * How many contacts to return per page (default 50).
    */
    @ApiMember(Description="How many contacts to return per page (default 50).")
    open var pageSize:Int? = null
    companion object { private val responseType = GetAllContactsResponse::class.java }
    override fun getResponseType(): Any? = GetAllContacts.responseType
}

/**
* Merge contacts
*/
@Route(Path="/{version}/membership/users/merge", Verbs="POST")
@Api(Description="Merge contacts")
open class MergeContactsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) that will remain after the merge (the survivor).
    */
    @ApiMember(Description="The contact id (ct_…) that will remain after the merge (the survivor).", IsRequired=true)
    open var survivorId:String? = null

    /**
    * The contact ids (ct_…) to merge into the survivor and archive. At least one.
    */
    @ApiMember(Description="The contact ids (ct_…) to merge into the survivor and archive. At least one.", IsRequired=true)
    open var mergedIds:ArrayList<String> = ArrayList<String>()
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MergeContactsRequest.responseType
}

/**
* Update a contact
*/
@Route(Path="/{version}/membership/users/{contactId}", Verbs="PATCH")
@Api(Description="Update a contact")
open class UpdateContactRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) to update. Get it from get_all_contacts.
    */
    @ApiMember(Description="The contact id (ct_…) to update. Get it from get_all_contacts.", IsRequired=true)
    open var contactId:String? = null

    /**
    * Display name shown in the dashboard.
    */
    @ApiMember(Description="Display name shown in the dashboard.")
    open var displayName:String? = null

    /**
    * First name.
    */
    @ApiMember(Description="First name.")
    open var firstName:String? = null

    /**
    * Last name.
    */
    @ApiMember(Description="Last name.")
    open var lastName:String? = null

    /**
    * Full name (overrides first/last when set).
    */
    @ApiMember(Description="Full name (overrides first/last when set).")
    open var fullName:String? = null

    /**
    * Company or organisation name.
    */
    @ApiMember(Description="Company or organisation name.")
    open var company:String? = null

    /**
    * Free-text internal notes about the contact.
    */
    @ApiMember(Description="Free-text internal notes about the contact.")
    open var notes:String? = null

    /**
    * Gender: Male, Female or Other.
    */
    @ApiMember(Description="Gender: Male, Female or Other.")
    open var gender:String? = null

    /**
    * Birth date as a unix timestamp in MILLISECONDS (UTC).
    */
    @ApiMember(Description="Birth date as a unix timestamp in MILLISECONDS (UTC).")
    open var birthDate:Long? = null

    /**
    * IANA time zone id, e.g. Europe/Vilnius.
    */
    @ApiMember(Description="IANA time zone id, e.g. Europe/Vilnius.")
    open var timeZone:String? = null

    /**
    * Preferred language/locale code, e.g. en or en-US.
    */
    @ApiMember(Description="Preferred language/locale code, e.g. en or en-US.")
    open var language:String? = null

    /**
    * Address line 1 (street).
    */
    @ApiMember(Description="Address line 1 (street).")
    open var addressLine1:String? = null

    /**
    * Address line 2 (apartment, suite, etc.).
    */
    @ApiMember(Description="Address line 2 (apartment, suite, etc.).")
    open var addressLine2:String? = null

    /**
    * Country name or code.
    */
    @ApiMember(Description="Country name or code.")
    open var country:String? = null

    /**
    * City.
    */
    @ApiMember(Description="City.")
    open var city:String? = null

    /**
    * State, region or province.
    */
    @ApiMember(Description="State, region or province.")
    open var state:String? = null

    /**
    * Postal or ZIP code.
    */
    @ApiMember(Description="Postal or ZIP code.")
    open var postalCode:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateContactRequest.responseType
}

/**
* Link a login to a contact
*/
@Route(Path="/{version}/membership/users/{contactId}/identities", Verbs="POST")
@Api(Description="Link a login to a contact")
open class AddContactIdentityRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) to link the login to.
    */
    @ApiMember(Description="The contact id (ct_…) to link the login to.", IsRequired=true)
    open var contactId:String? = null

    /**
    * The login (identity) id (usr_…) to link to the contact.
    */
    @ApiMember(Description="The login (identity) id (usr_…) to link to the contact.", IsRequired=true)
    open var authId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AddContactIdentityRequest.responseType
}

/**
* Make a login the contact's primary
*/
@Route(Path="/{version}/membership/users/{contactId}/identities/{authId}/promote", Verbs="POST")
@Api(Description="Make a login the contact's primary")
open class PromoteContactIdentityRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) whose login is being promoted.
    */
    @ApiMember(Description="The contact id (ct_…) whose login is being promoted.", IsRequired=true)
    open var contactId:String? = null

    /**
    * The linked login (identity) id (usr_…) to make primary.
    */
    @ApiMember(Description="The linked login (identity) id (usr_…) to make primary.", IsRequired=true)
    open var authId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PromoteContactIdentityRequest.responseType
}

/**
* Unlink a login from a contact
*/
@Route(Path="/{version}/membership/users/{contactId}/identities/{authId}", Verbs="DELETE")
@Api(Description="Unlink a login from a contact")
open class RemoveContactIdentityRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The contact id (ct_…) to unlink the login from.
    */
    @ApiMember(Description="The contact id (ct_…) to unlink the login from.", IsRequired=true)
    open var contactId:String? = null

    /**
    * The login (identity) id (usr_…) to unlink from the contact.
    */
    @ApiMember(Description="The login (identity) id (usr_…) to unlink from the contact.", IsRequired=true)
    open var authId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveContactIdentityRequest.responseType
}

@Route(Path="/{version}/compliance/settings", Verbs="GET")
open class GetComplianceSettings : CodeMashRequestBase(), IReturn<GetComplianceSettingsResponse>
{
    companion object { private val responseType = GetComplianceSettingsResponse::class.java }
    override fun getResponseType(): Any? = GetComplianceSettings.responseType
}

@Route(Path="/{version}/compliance/retention", Verbs="DELETE")
open class RemoveRetentionWindowRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var dataKind:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RemoveRetentionWindowRequest.responseType
}

@Route(Path="/{version}/compliance/retention", Verbs="POST")
open class SaveRetentionWindowRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var dataKind:String? = null
    open var days:Int? = null
    open var action:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveRetentionWindowRequest.responseType
}

@Route(Path="/{version}/compliance/regimes", Verbs="POST")
open class AssignRegimeRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var regime:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AssignRegimeRequest.responseType
}

@Route(Path="/{version}/compliance/regimes", Verbs="DELETE")
open class ClearRegimeRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var regime:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ClearRegimeRequest.responseType
}

@Route(Path="/{version}/compliance/purposes", Verbs="POST")
open class DefineConsentPurposeRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var key:String? = null
    open var name:String? = null
    open var channel:String? = null
    open var mappedTags:ArrayList<String> = ArrayList<String>()
    open var regulatoryBasis:ArrayList<String> = ArrayList<String>()
    open var description:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DefineConsentPurposeRequest.responseType
}

@Route(Path="/{version}/compliance/purposes/deprecate", Verbs="POST")
open class DeprecateConsentPurposeRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var key:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeprecateConsentPurposeRequest.responseType
}

@Route(Path="/{version}/compliance/holds", Verbs="GET")
open class GetLegalHolds : CodeMashRequestBase(), IReturn<GetLegalHoldsResponse>
{
    companion object { private val responseType = GetLegalHoldsResponse::class.java }
    override fun getResponseType(): Any? = GetLegalHolds.responseType
}

@Route(Path="/{version}/compliance/holds", Verbs="POST")
open class PlaceLegalHoldRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var subjectKind:String? = null
    open var subjectId:String? = null
    open var reason:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PlaceLegalHoldRequest.responseType
}

@Route(Path="/{version}/compliance/holds/release", Verbs="POST")
open class ReleaseLegalHoldRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var holdId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ReleaseLegalHoldRequest.responseType
}

@Route(Path="/{version}/compliance/dsar/approve", Verbs="POST")
open class ApproveDsarRequestRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var requestId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ApproveDsarRequestRequest.responseType
}

@Route(Path="/{version}/compliance/dsar/reject", Verbs="POST")
open class RejectDsarRequestRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var requestId:String? = null
    open var reason:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RejectDsarRequestRequest.responseType
}

@Route(Path="/{version}/compliance/dsar", Verbs="GET")
open class GetDsarRequests : CodeMashRequestBase(), IReturn<GetDsarRequestsResponse>
{
    companion object { private val responseType = GetDsarRequestsResponse::class.java }
    override fun getResponseType(): Any? = GetDsarRequests.responseType
}

@Route(Path="/{version}/compliance/dsar", Verbs="POST")
open class OpenDsarRequestRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var subjectKind:String? = null
    open var subjectId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = OpenDsarRequestRequest.responseType
}

@Route(Path="/{version}/compliance/audit", Verbs="GET")
open class GetComplianceAuditLog : CodeMashRequestBase(), IReturn<GetComplianceAuditLogResponse>
{
    open var from:Date? = null
    open var to:Date? = null
    open var subjectKind:String? = null
    open var subjectId:String? = null
    open var limit:Int? = null
    companion object { private val responseType = GetComplianceAuditLogResponse::class.java }
    override fun getResponseType(): Any? = GetComplianceAuditLog.responseType
}

@Route(Path="/{version}/compliance/account", Verbs="GET")
open class GetAccountCompliance : RequestBase(), IReturn<GetAccountComplianceResponse>
{
    companion object { private val responseType = GetAccountComplianceResponse::class.java }
    override fun getResponseType(): Any? = GetAccountCompliance.responseType
}

@Route(Path="/{version}/compliance/account/dsar-policy", Verbs="POST")
open class SaveDsarPolicyRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var mode:String? = null
    open var delayDays:Int? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveDsarPolicyRequest.responseType
}

@Route(Path="/{version}/compliance/account/incident-routing", Verbs="POST")
open class SaveIncidentRoutingRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var autoForwardAdvisories:Boolean? = null
    open var securityContact:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SaveIncidentRoutingRequest.responseType
}

@Route(Path="/{version}/support/cases/{CaseId}/close", Verbs="POST")
open class CloseSupportCaseRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var caseId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CloseSupportCaseRequest.responseType
}

@Route(Path="/{version}/support/cases/{CaseId}/reopen", Verbs="POST")
open class ReopenSupportCaseRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var caseId:String? = null
    open var reason:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ReopenSupportCaseRequest.responseType
}

@Route(Path="/{version}/support/cases/{CaseId}/resolve", Verbs="POST")
open class ResolveSupportCaseRequest : RequestBase(), IReturn<EmptyResponse>
{
    open var caseId:String? = null
    open var resolution:CaseResolutionDto? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ResolveSupportCaseRequest.responseType
}

@Route(Path="/{version}/support/cases/{CaseId}/messages", Verbs="POST")
open class AppendSupportCaseMessageRequest : RequestBase(), IReturn<IdResponse>
{
    open var caseId:String? = null
    open var message:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = AppendSupportCaseMessageRequest.responseType
}

@Route(Path="/{version}/support/cases/{CaseId}", Verbs="GET")
open class GetSupportCase : RequestBase(), IReturn<GetSupportCaseResponse>
{
    open var caseId:String? = null
    companion object { private val responseType = GetSupportCaseResponse::class.java }
    override fun getResponseType(): Any? = GetSupportCase.responseType
}

@Route(Path="/{version}/support/cases", Verbs="GET")
open class GetSupportCases : RequestBase(), IReturn<GetSupportCasesResponse>
{
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetSupportCasesResponse::class.java }
    override fun getResponseType(): Any? = GetSupportCases.responseType
}

@Route(Path="/{version}/support/cases", Verbs="POST")
open class OpenSupportCaseRequest : RequestBase(), IReturn<IdResponse>
{
    open var kind:String? = null
    open var severity:String? = null
    open var subject:String? = null
    open var message:String? = null
    open var projectId:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = OpenSupportCaseRequest.responseType
}

open class SupportCaseOpened
{
    open var caseId:SupportCaseId? = null
    open var accountId:AccountId? = null
    open var projectId:ProjectId? = null
    open var reporterId:String? = null
    open var kind:SupportCaseKind? = null
    open var severity:SupportCaseSeverity? = null
    open var subject:String? = null
    open var deploymentMode:DeploymentMode? = null
    open var gatewayVersion:String? = null
    open var region:String? = null
    open var planTier:String? = null
    open var openedOn:UtcDateTime? = null
}

open class SupportCaseTriaged
{
    open var caseId:SupportCaseId? = null
    open var kind:SupportCaseKind? = null
    open var severity:SupportCaseSeverity? = null
    open var affectedModule:String? = null
    open var triagedBy:String? = null
    open var triagedOn:UtcDateTime? = null
}

open class SupportCaseMessageAppended
{
    open var caseId:SupportCaseId? = null
    open var message:SupportMessageRef? = null
}

open class SupportCaseStatusChanged
{
    open var caseId:SupportCaseId? = null
    open var from:SupportCaseStatus? = null
    open var to:SupportCaseStatus? = null
    open var changedOn:UtcDateTime? = null
}

open class SupportCaseResolved
{
    open var caseId:SupportCaseId? = null
    open var resolution:CaseResolution? = null
    open var resolvedOn:UtcDateTime? = null
}

open class SupportCaseClosed
{
    open var caseId:SupportCaseId? = null
    open var closedBy:String? = null
    open var closedOn:UtcDateTime? = null
    open var reason:SupportCaseCloseReason? = null
}

open class SupportCaseReopened
{
    open var caseId:SupportCaseId? = null
    open var reason:String? = null
    open var reopenedOn:UtcDateTime? = null
}

open class SupportCaseWaitingReminderSent
{
    open var caseId:SupportCaseId? = null
    open var tierDays:Int? = null
    open var sentOn:UtcDateTime? = null
}

open class SupportCaseAttachmentLinked
{
    open var caseId:SupportCaseId? = null
    open var attachmentRef:String? = null
    open var fileName:String? = null
    open var linkedOn:UtcDateTime? = null
}

@Route(Path="/{version}/diagnostics/packs", Verbs="GET")
open class GetDiagnosticPacks : CodeMashRequestBase(), IReturn<GetDiagnosticPacksResponse>
{
    companion object { private val responseType = GetDiagnosticPacksResponse::class.java }
    override fun getResponseType(): Any? = GetDiagnosticPacks.responseType
}

@Route(Path="/{version}/diagnostics/packs/{PackName}/run", Verbs="POST")
open class RunDiagnosticPackRequest : CodeMashRequestBase(), IReturn<RunDiagnosticPackResponse>
{
    open var packName:String? = null
    open var packVersion:Int? = null
    open var caseId:String? = null
    companion object { private val responseType = RunDiagnosticPackResponse::class.java }
    override fun getResponseType(): Any? = RunDiagnosticPackRequest.responseType
}

@Route(Path="/{version}/diagnostics/echo", Verbs="GET")
open class GetDiagnosticEcho : CodeMashRequestBase(), IReturn<GetDiagnosticEchoResponse>
{
    open var caseId:String? = null
    companion object { private val responseType = GetDiagnosticEchoResponse::class.java }
    override fun getResponseType(): Any? = GetDiagnosticEcho.responseType
}

@Route(Path="/{version}/diagnostics/events", Verbs="GET")
open class ReadDiagnosticEventsRequest : CodeMashRequestBase(), IReturn<ReadDiagnosticEventsResponse>
{
    open var stream:String? = null
    open var from:Long? = null
    open var count:Int? = null
    open var caseId:String? = null
    companion object { private val responseType = ReadDiagnosticEventsResponse::class.java }
    override fun getResponseType(): Any? = ReadDiagnosticEventsRequest.responseType
}

@Route(Path="/{version}/diagnostics/logs", Verbs="GET")
open class QueryDiagnosticLogsRequest : CodeMashListPaginationRequestBase(), IReturn<QueryDiagnosticLogsResponse>
{
    open var level:String? = null
    open var module:String? = null
    open var logCorrelationId:String? = null
    open var eventCode:String? = null
    open var search:String? = null
    open var fromUtc:Date? = null
    open var toUtc:Date? = null
    open var caseId:String? = null
    companion object { private val responseType = QueryDiagnosticLogsResponse::class.java }
    override fun getResponseType(): Any? = QueryDiagnosticLogsRequest.responseType
}

@Route(Path="/{version}/diagnostics/redis", Verbs="GET")
open class InspectDiagnosticRedisRequest : CodeMashRequestBase(), IReturn<InspectDiagnosticRedisResponse>
{
    open var keyPattern:String? = null
    open var caseId:String? = null
    companion object { private val responseType = InspectDiagnosticRedisResponse::class.java }
    override fun getResponseType(): Any? = InspectDiagnosticRedisRequest.responseType
}

@Route(Path="/{version}/diagnostics/health/{CheckId}", Verbs="POST")
open class RunDiagnosticHealthCheckRequest : CodeMashRequestBase(), IReturn<RunDiagnosticHealthCheckResponse>
{
    open var checkId:String? = null
    open var caseId:String? = null
    companion object { private val responseType = RunDiagnosticHealthCheckResponse::class.java }
    override fun getResponseType(): Any? = RunDiagnosticHealthCheckRequest.responseType
}

/**
* Sign In
*/
@Route(Path="/auth", Verbs="GET,POST")
// @Route(Path="/auth/{provider}", Verbs="GET,POST")
// @Route(Path="/v3/auth", Verbs="POST,GET,OPTIONS")
// @Route(Path="/v3/auth/{provider}", Verbs="POST,GET,OPTIONS")
// @Route(Path="/v3/staff/auth", Verbs="POST,GET,OPTIONS")
// @Route(Path="/v3/staff/auth/{provider}", Verbs="POST,GET,OPTIONS")
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
    open var adminUrlTemplate:String? = null
    open var license:EchoLicenseDto? = null
    open var askForEnterpriseLicenseEmail:String? = null
    open var emailServiceConfigured:Boolean? = null
    open var rootBootstrapPasswordSource:String? = null
    open var regions:ArrayList<EchoRegionDto>? = null
    open var isProductionInstallation:Boolean? = null
    open var licensingMode:String? = null
    open var graceDaysLeft:Int? = null
    open var installationDomain:String? = null
    open var licensingDocsUrl:String? = null
}

open class PublicProjectConfigDto
{
    open var displayName:String? = null
    open var adminPortalEnabled:Boolean? = null
    open var branding:PublicBrandDto? = null
    open var auth:PublicAuthDto? = null
}

open class PublicLegalDocumentDto
{
    open var kind:String? = null
    open var title:String? = null
    open var body:String? = null
    open var available:Boolean? = null
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

open class GetAccountUsageBillingResponse : ResponseBase()
{
    open var item:UsageBillingDto? = null
}

@DataContract
open class IdResponse : ResponseBase()
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var status:String? = null
}

open class PromoteEnvironmentResponse : ResponseBase()
{
    open var item:PromotionResultDto? = null
}

open class GetProjectEnvironmentsResponse : ResponseBase()
{
    open var item:ProjectEnvironmentsDto? = null
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

open class WaitForProjectActiveResponse : ResponseBase()
{
    open var status:String? = null
    open var isActive:Boolean? = null
    open var waitedSeconds:Int? = null
    open var message:String? = null
}

open class GetProjectTokensResponse : ResponseBase()
{
    open var tokens:ArrayList<TokenMappingDto>? = null
}

open class AdminPortalStructureDto
{
    open var projectId:String? = null
    open var adminPortalEnabled:Boolean? = null
    open var displayName:String? = null
    open var modules:ArrayList<AdminPortalModuleDto> = ArrayList<AdminPortalModuleDto>()
}

@DataContract
open class CreateAccountResponse : IdResponse()
{
    @DataMember
    open var token:String? = null
}

open class GetAccountCollaboratorsResponse : ResponseBase()
{
    open var list:PaginatedResponse<AuthDto>? = null
}

open class GetAccountPasswordPolicyResponse : ResponseBase()
{
    open var policy:AccountPasswordPolicyDto? = null
}

open class GetAccountTeamPoliciesResponse : ResponseBase()
{
    open var policies:ArrayList<PolicyItemDto>? = null
}

open class GetAccountTeamRolesResponse : ResponseBase()
{
    open var roles:ArrayList<AccountTeamRoleDto>? = null
}

open class AccountPasskeyOkResponse : ResponseBase()
{
}

open class AccountPasskeyVerificationTokenResponse : ResponseBase()
{
    open var verificationToken:String? = null
}

open class AccountPasskeyCeremonyOptionsResponse : ResponseBase()
{
    open var ceremonyId:String? = null
    open var optionsJson:String? = null
}

open class AccountPasskeyAuthTokensResponse : ResponseBase()
{
    open var accessToken:String? = null
    open var refreshToken:String? = null
    open var expiresInSeconds:Int? = null
    open var recoveryCodes:ArrayList<String>? = null
}

open class AccountPasskeyListResponse : ResponseBase()
{
    open var passkeys:ArrayList<AccountPasskeyListItemDto> = ArrayList<AccountPasskeyListItemDto>()
}

open class AccountPasskeyEnrollmentResponse : ResponseBase()
{
    open var recoveryCodes:ArrayList<String>? = null
}

open class GetLicenseDomainDnsStatusResponse : ResponseBase()
{
    open var status:LicenseDomainDnsStatusDto? = null
}

open class StartLicenseDomainVerificationResponse : ResponseBase()
{
    open var challenge:LicenseDomainVerificationChallengeDto? = null
}

open class GetLicenseDomainVerificationStatusResponse : ResponseBase()
{
    open var status:LicenseDomainVerificationStatusDto? = null
}

open class GetLicensesResponse : ResponseBase()
{
    open var list:ArrayList<LicenseDto>? = null
}

open class PostLicenseHeartbeatResponse : ResponseBase()
{
    open var verdict:LicenseHeartbeatVerdictDto? = null
}

open class GetInstallationLicenseStatusResponse : ResponseBase()
{
    open var status:InstallationLicenseStatusDto? = null
}

open class IssueServiceUserApiKeyResponse
{
    open var id:Int? = null
    open var name:String? = null
    open var key:String? = null
}

open class ListServiceUserApiKeysResponse
{
    open var keys:ArrayList<ServiceUserApiKeyDto> = ArrayList<ServiceUserApiKeyDto>()
}

open class GetMembershipTriggerResponse : GetTriggerResponse()
{
    open var trigger:MembershipTriggerDto? = null
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

open class GetPasskeySettingsResponse : ResponseBase()
{
    open var result:PasskeySettingsDto? = null
}

open class GetMembershipIntegrationResponse : ResponseBase()
{
    open var item:MembershipIntegrationDto? = null
}

open class GetMembershipIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<MembershipIntegrationListProjection>? = null
}

open class GetAuthorizationSettingsResponse : ResponseBase()
{
    open var result:MembershipAuthorizationViewDto? = null
}

open class UpdatePasswordComplexityResponse : ResponseBase()
{
    open var result:Boolean? = null
}

open class GetAuthenticationSettingsResponse : ResponseBase()
{
    open var result:MembershipAuthenticationViewDto? = null
}

open class GetSchemaTriggerResponse : GetTriggerResponse()
{
    open var trigger:SchemaTriggerDto? = null
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

open class GetDatabaseTaxonomyTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TaxonomyTreeDto>? = null
}

open class GetDatabaseTaxonomyTermResponse : ResponseBase()
{
    open var item:TermDto? = null
}

open class GetDatabaseMergedTermTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TermTreeDto>? = null
}

open class GetDatabaseTaxonomyTermTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TermTreeDto>? = null
}

@DataContract
open class ApplyDatabaseSchemaBundleResponse : ResponseBase()
{
    @DataMember
    open var tier:String? = null

    @DataMember
    open var taxonomies:ArrayList<AppliedTaxonomyDto> = ArrayList<AppliedTaxonomyDto>()

    @DataMember
    open var collections:ArrayList<AppliedCollectionDto> = ArrayList<AppliedCollectionDto>()

    @DataMember
    open var decisions:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var errors:ArrayList<String> = ArrayList<String>()
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

open class GetDatabaseSchemaListSettingsResponse : ResponseBase()
{
    open var settings:SchemaListSettingsDto? = null
}

open class GetDatabaseSchemaVersionDiffResponse : ResponseBase()
{
    open var item:SchemaDiffDto? = null
}

open class GetDatabaseSchemaVersionsResponse : ResponseBase()
{
    open var items:ArrayList<SchemaVersionSummaryDto>? = null
}

open class AggregateRecordsResponse : ResponseBase()
{
    open var result:ArrayList<Object>? = null
}

open class CountRecordsResponse : ResponseBase()
{
    open var count:Long? = null
}

open class DistinctRecordValuesResponse : ResponseBase()
{
    open var values:ArrayList<Object>? = null
}

open class ExecuteRecordsAggregateResponse : ResponseBase()
{
    open var result:ArrayList<Object>? = null
}

open class FindRecordsResponse : ResponseBase()
{
    open var list:PaginatedResponse<Object>? = null
}

open class FindOneRecordResponse : ResponseBase()
{
    open var result:Object? = null
}

open class GetCollectionIndexesResponse : ResponseBase()
{
    open var indexes:ArrayList<CollectionIndexDto>? = null
}

@DataContract
open class SeedCollectionRecordsResponse : ResponseBase()
{
    @DataMember
    open var result:SeedCollectionRecordsResultDto? = null
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

open class GetAllowedFlexTiersResponse : ResponseBase()
{
    open var tiers:ArrayList<FlexTierDto>? = null
}

open class RevealManagedFlexConnectionStringResponse : ResponseBase()
{
    open var connectionString:String? = null
}

@DataContract
open class TestDatabaseIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetCollectionImportResponse : ResponseBase()
{
    open var result:CollectionImportDto? = null
}

open class GetCollectionImportsResponse : ResponseBase()
{
    open var result:PaginatedResponse<CollectionImportDto>? = null
}

open class RequestImportUploadUrlResponse : ResponseBase()
{
    open var result:ImportUploadTargetDto? = null
}

open class AnalyzeImportFileResponse : ResponseBase()
{
    open var result:ImportFileAnalysisDto? = null
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
    open var trigger:FilesTriggerDto? = null
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

@DataContract
open class TestFilesIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetFileResponse : ResponseBase()
{
    open var file:FileResourceRefDto? = null
    open var isPublic:Boolean? = null
    open var publicUrl:String? = null
}

open class GetFolderFilesResponse : ResponseBase()
{
    open var list:PaginatedResponse<FileResourceRefDto>? = null
    open var folders:IList<String>? = null
}

open class GetNotificationModuleDisableDependenciesResponse : ResponseBase()
{
    open var dependencies:NotificationModuleDisableDependenciesDto? = null
}

@DataContract
open class TestEmailValidationIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:ArrayList<TestEmailValidationItemDto> = ArrayList<TestEmailValidationItemDto>()
}

open class GetEmailTemplateResponse : ResponseBase()
{
    open var item:EmailTemplateDto? = null
}

open class GetEmailTemplatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<EmailTemplateListProjection>? = null
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

@DataContract
open class CheckEmailIntegrationDomainHealthResponse : ResponseBase()
{
    @DataMember
    open var domain:String? = null

    @DataMember
    open var items:IReadOnlyList<DomainHealthRecordItemDto>? = null
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

open class GetSmsTemplateResponse : ResponseBase()
{
    open var item:SmsTemplateDto? = null
}

open class GetSmsTemplatesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SmsTemplateListProjection>? = null
}

open class GetSmsMessageContentTokensResponse : ResponseBase()
{
    open var tokens:HashMap<String,ArrayList<String>>? = null
}

open class RenderSmsTextResponse : ResponseBase()
{
    open var variables:ArrayList<String>? = null
    open var text:String? = null
}

open class GetSmsSettingsResponse : ResponseBase()
{
    open var settings:SmsSettings? = null
}

open class GetSmsIntegrationResponse : ResponseBase()
{
    open var item:SmsIntegrationDto? = null
}

open class GetSmsIntegrationsResponse : ResponseBase()
{
    open var defaultIntegrationId:String? = null
    open var list:PaginatedResponse<SmsIntegrationListProjection>? = null
}

@DataContract
open class TestSmsIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class GetSmsCampaignResponse : ResponseBase()
{
    open var smsCampaign:SmsCampaignDto? = null
}

open class GetSmsCampaignsResponse : ResponseBase()
{
    open var list:PaginatedResponse<SmsCampaignDto>? = null
}

open class GetSmsCampaignBatchesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SmsCampaignBatchDto>? = null
}

open class GetSmsCampaignBatchNotificationResponse : ResponseBase()
{
    open var campaignNotification:SmsCampaignBatchNotificationDto? = null
}

open class GetSmsCampaignBatchNotificationsResponse : ResponseBase()
{
    open var batchStatusHistory:ArrayList<BatchStatusChangeEntryDto>? = null
    open var list:PaginatedResponse<SmsCampaignBatchNotificationDto>? = null
}

open class GetSmsCampaignStatisticsResponse : ResponseBase()
{
    open var stats:CampaignStatsDto? = null
}

open class PreviewSmsNotificationResponse : ResponseBase()
{
    open var body:String? = null
}

open class GetSmsCampaignMessageResponse : ResponseBase()
{
    open var smsMessageEntity:SmsCampaignBatchNotificationDto? = null
}

open class GetSmsCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SmsCampaignBatchNotificationDto>? = null
}

open class GetMarketplaceListingResponse : ResponseBase()
{
    open var listing:MarketplaceListingDto? = null
}

open class GetMarketplaceTokensResponse : ResponseBase()
{
    open var tokens:ArrayList<String>? = null
}

open class GetMarketplaceListingsResponse : ResponseBase()
{
    open var list:PaginatedResponse<MarketplaceListingProjection>? = null
}

open class GetMarketplaceIntegrationResponse : ResponseBase()
{
    open var integration:MarketplaceIntegrationDto? = null
}

open class GetMarketplaceIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<MarketplaceIntegrationListProjection>? = null
}

open class EmptyMarketplaceSecretsResponse : ResponseBase()
{
}

open class RevealMarketplaceIntegrationSecretsResponse : ResponseBase()
{
    open var secrets:IReadOnlyDictionary<String, String>? = null
}

@DataContract
open class TestMarketplaceIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
}

open class SetMarketplaceIntegrationTokenMappingsResponse : ResponseBase()
{
}

open class GetMarketplaceFunctionResponse : ResponseBase()
{
    open var function:MarketplaceFunctionDto? = null
}

open class GetMarketplaceFunctionsResponse : ResponseBase()
{
    open var list:PaginatedResponse<MarketplaceFunctionProjection>? = null
}

open class GetMarketplaceFunctionCatalogResponse : ResponseBase()
{
    open var functions:IReadOnlyList<MarketplaceFunctionDefinitionDto>? = null
}

open class InvokeMarketplaceFunctionResponse : ResponseBase()
{
    open var isSuccess:Boolean? = null
    open var output:Object? = null
    open var vendorRequestId:String? = null
}

open class GetCodeIntegrationResponse : ResponseBase()
{
    open var item:CodeIntegrationDto? = null
}

open class GetCodeIntegrationsResponse : ResponseBase()
{
    open var list:PaginatedResponse<CodeIntegrationListProjection>? = null
}

@DataContract
open class TestCodeIntegrationResponse : ResponseBase()
{
    @DataMember
    open var items:IReadOnlyList<IntegrationTestResultItemDto>? = null
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

open class RenderPushResponse : ResponseBase()
{
    open var variables:ArrayList<String>? = null
    open var title:String? = null
    open var body:String? = null
    open var subtitle:String? = null
}

open class GetPushSettingsResponse : ResponseBase()
{
    open var settings:PushSettings? = null
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

open class GetPushCampaignResponse : ResponseBase()
{
    open var item:PushCampaignDto? = null
}

open class GetPushCampaignsResponse : ResponseBase()
{
    open var list:PaginatedResponse<PushCampaignDto>? = null
}

open class GetPushCampaignBatchesResponse : ResponseBase()
{
    open var list:PaginatedResponse<PushCampaignBatchDto>? = null
}

open class GetPushCampaignBatchNotificationResponse : ResponseBase()
{
    open var campaignNotification:PushCampaignBatchNotificationDto? = null
}

open class GetPushCampaignBatchNotificationsResponse : ResponseBase()
{
    open var batchStatusHistory:ArrayList<BatchStatusChangeEntryDto>? = null
    open var list:PaginatedResponse<PushCampaignBatchNotificationDto>? = null
}

open class GetPushCampaignStatisticsResponse : ResponseBase()
{
    open var stats:CampaignStatsDto? = null
}

open class PreviewPushNotificationResponse : ResponseBase()
{
    open var title:String? = null
    open var body:String? = null
    open var subtitle:String? = null
}

open class GetPushCampaignMessageResponse : ResponseBase()
{
    open var pushMessageEntity:PushCampaignBatchNotificationDto? = null
}

open class GetPushCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<PushCampaignBatchNotificationDto>? = null
}

open class GetPaymentsWebhookLogResponse : ResponseBase()
{
    open var list:IReadOnlyList<PaymentsWebhookLogEntry>? = null
}

open class GetPaymentsTriggerResponse : GetTriggerResponse()
{
    open var trigger:PaymentTriggerDto? = null
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

open class CleanLogsResponse : ResponseBase()
{
}

open class GetLogsByCorrelationIdResponse : ResponseBase()
{
    open var items:IReadOnlyList<TenantLogEntryDto>? = null
}

open class GetLogsResponse : ResponseBase()
{
    open var list:PaginatedResponse<TenantLogEntryDto>? = null
}

open class GetLogSettingsResponse : ResponseBase()
{
    open var skipCloudDashboardLogs:Boolean? = null
    open var skipHttpBodyMeta:Boolean? = null
    open var aiChatLoggingEnabled:Boolean? = null
    open var hasNorbixLogging:Boolean? = null
}

open class SaveLogSettingsResponse : ResponseBase()
{
}

open class GetAiToolsResponse : ResponseBase()
{
    open var tools:ArrayList<AiToolManifestItem>? = null
}

open class InvokeAiToolResponse : ResponseBase()
{
    open var result:String? = null
}

open class AskChatResponse : ResponseBase()
{
    open var result:String? = null
}

open class UploadChatAttachmentResponse : ResponseBase()
{
    open var id:String? = null
    open var sessionId:String? = null
}

open class ChatAvailabilityResponse : ResponseBase()
{
    open var available:Boolean? = null
    open var reason:String? = null
    open var profiles:ArrayList<String>? = null
    open var models:ArrayList<ChatModelOption>? = null
}

open class GetChatMemoryResponse : ResponseBase()
{
    open var notes:ArrayList<ChatMemoryNote>? = null
}

open class GetChatSessionsResponse : ResponseBase()
{
    open var sessions:ArrayList<ChatSessionListItem>? = null
}

open class GetChatSessionEntriesResponse : ResponseBase()
{
    open var sessionId:String? = null
    open var profile:String? = null
    open var projectId:String? = null
    open var env:String? = null
    open var entries:ArrayList<AiChatEntryWireDto>? = null
    open var lastSeq:Long? = null
    open var activeWorkItemIds:ArrayList<String>? = null
}

open class ChatTurnResponse : ResponseBase()
{
    open var sessionId:String? = null
    open var reply:String? = null
    open var screenPatch:ChatScreenContextDto? = null
    open var toolTrace:ArrayList<String>? = null
}

open class GetProjectBriefResponse : ResponseBase()
{
    open var projectId:String? = null
    open var snapshot:ProjectBriefSnapshotWireDto? = null
    open var events:ArrayList<ProjectBriefEventWireDto>? = null
    open var lastSeq:Long? = null
}

open class GetWorkItemsResponse : ResponseBase()
{
    open var projectId:String? = null
    open var workItems:ArrayList<WorkItemWireDto>? = null
}

open class GetWorkItemResponse : ResponseBase()
{
    open var workItem:WorkItemWireDto? = null
    open var plans:ArrayList<AiChatEntryWireDto>? = null
    open var steps:ArrayList<AiChatEntryWireDto>? = null
}

open class ExportWorkItemResponse : ResponseBase()
{
    open var workItemId:String? = null
    open var markdown:String? = null
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

open class HttpResult
{
    open var responseText:String? = null
    open var responseStream:InputStream? = null
    open var fileInfo:FileInfo? = null
    open var virtualFile:IVirtualFile? = null
    open var contentType:String? = null
    open var headers:HashMap<String,String>? = null
    open var cookies:ArrayList<Cookie>? = null
    open var eTag:String? = null
    open var age:TimeSpan? = null
    open var maxAge:TimeSpan? = null
    open var expires:Date? = null
    open var lastModified:Date? = null
    open var cacheControl:CacheControl? = null
    open var resultScope:Func<IDisposable>? = null
    open var allowsPartialResponse:Boolean? = null
    open var options:HashMap<String,String>? = null
    open var status:Int? = null
    open var statusCode:HttpStatusCode? = null
    open var statusDescription:String? = null
    open var response:Object? = null
    open var responseFilter:IContentTypeWriter? = null
    open var requestContext:IRequest? = null
    open var view:String? = null
    open var template:String? = null
    open var paddingLength:Int? = null
    open var isPartialRequest:Boolean? = null
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

open class ResolveResourcesResponse : ResponseBase()
{
    open var resolved:IReadOnlyList<ResolvedResourceEntry>? = null
}

open class GetContactResponse : ResponseBase()
{
    open var item:UserDto? = null
}

open class GetAllContactsResponse : ResponseBase()
{
    open var items:IReadOnlyList<UserDto>? = null
    open var nextCursor:String? = null
}

open class GetComplianceSettingsResponse : ResponseBase()
{
    open var settings:ProjectComplianceDto? = null
}

open class GetLegalHoldsResponse : ResponseBase()
{
    open var holds:ArrayList<LegalHoldDto> = ArrayList<LegalHoldDto>()
}

open class GetDsarRequestsResponse : ResponseBase()
{
    open var requests:ArrayList<DsarRequestDto> = ArrayList<DsarRequestDto>()
}

open class GetComplianceAuditLogResponse : ResponseBase()
{
    open var entries:ArrayList<ComplianceAuditEntryDto> = ArrayList<ComplianceAuditEntryDto>()
}

open class GetAccountComplianceResponse : ResponseBase()
{
    open var settings:AccountComplianceDto? = null
}

open class GetSupportCaseResponse : ResponseBase()
{
    open var result:SupportCaseDetailDto? = null
}

open class GetSupportCasesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SupportCaseListProjection>? = null
}

open class GetDiagnosticPacksResponse : ResponseBase()
{
    open var packs:ArrayList<DiagnosticPackDescriptorDto>? = null
}

open class RunDiagnosticPackResponse : ResponseBase()
{
    open var result:DiagnosticPackRunResultDto? = null
}

open class GetDiagnosticEchoResponse : ResponseBase()
{
    open var result:DiagnosticEchoDto? = null
}

open class ReadDiagnosticEventsResponse : ResponseBase()
{
    open var result:DiagnosticEventsPageDto? = null
}

open class QueryDiagnosticLogsResponse : ResponseBase()
{
    open var result:DiagnosticLogsResponse? = null
}

open class InspectDiagnosticRedisResponse : ResponseBase()
{
    open var result:DiagnosticRedisInspectDto? = null
}

open class RunDiagnosticHealthCheckResponse : ResponseBase()
{
    open var result:DiagnosticHealthCheckDto? = null
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

open class SmtpEmailIntegrationRequest : EmailIntegrationRequest()
{
    override var provider:EmailProvider? = null
    open var domain:String? = null
    open var port:SmtpPorts? = null
    open var userName:String? = null
    open var password:String? = null
}

open class AwsSesEmailIntegrationRequest : EmailIntegrationRequest()
{
    override var provider:EmailProvider? = null
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
    override var provider:EmailProvider? = null
    open var apiKey:String? = null
}

open class MailGunEmailIntegrationRequest : EmailIntegrationRequest()
{
    override var provider:EmailProvider? = null
    open var domain:String? = null
    open var apiKey:String? = null
    open var webhookSigningKey:String? = null
    open var region:MailGunRegion? = null
}

open class EmailToAllUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    override var source:EmailCampaignRecipientsSourceTypes? = null
    open var rolesNames:ArrayList<String>? = null
    open var userTags:ArrayList<String>? = null
}

open class EmailToAccountUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    override var source:EmailCampaignRecipientsSourceTypes? = null
    open var userRecipients:ArrayList<String> = ArrayList<String>()
    open var userCc:ArrayList<String>? = null
    open var userBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class EmailToCollectionRecordsDeliverySettingsRequest : EmailCampaignRequest()
{
    override var source:EmailCampaignRecipientsSourceTypes? = null
    open var fields:ArrayList<String> = ArrayList<String>()
    open var schemaName:String? = null
    open var fieldType:CollectionEmailCampaignRecipientField? = null
    open var roleNames:ArrayList<String>? = null
    open var languages:ArrayList<String>? = null
}

open class EmailToEmailsDeliverySettingsRequest : EmailCampaignRequest()
{
    override var source:EmailCampaignRecipientsSourceTypes? = null
    open var recipients:ArrayList<String> = ArrayList<String>()
    open var recipientsCc:ArrayList<String>? = null
    open var recipientsBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class EmailToUsersDeliverySettingsRequest : EmailCampaignRequest()
{
    override var source:EmailCampaignRecipientsSourceTypes? = null
    open var userRecipients:ArrayList<String> = ArrayList<String>()
    open var userCc:ArrayList<String>? = null
    open var userBcc:ArrayList<String>? = null
    open var singleEmailStrategy:Boolean? = null
}

open class MembershipTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("type") override var Type:TriggerType? = null
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

open class SchemaTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("type") override var Type:TriggerType? = null
    open var schemaId:String? = null
    @SerializedName("when") open var When:SchemaTriggerType? = null
    open var configurationCode:String? = null
}

open class FilesTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("type") override var Type:TriggerType? = null
    @SerializedName("when") open var When:FilesTriggerType? = null
    open var fileRef:FileResourceRefDto? = null
}

open class PaymentTriggerRequest : SaveTriggerRequest()
{
    @SerializedName("type") override var Type:TriggerType? = null
    @SerializedName("when") open var When:PaymentTriggerType? = null
    open var integrations:ArrayList<String>? = null
    open var events:ArrayList<String>? = null
}

open class MongoDbConnectionStringDatabaseIntegrationRequest : DatabaseIntegrationRequest()
{
    override var provider:DatabaseProvider? = null
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class MongoDbAtlasFlexManagedDatabaseIntegrationRequest : DatabaseIntegrationRequest()
{
    override var provider:DatabaseProvider? = null
    open var norbixRegionCode:String? = null
}

open class GoogleDriveFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var rootFolderId:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class FtpFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var host:String? = null
    open var port:Int? = null
    open var rootPath:String? = null
    open var useSsl:Boolean? = null
    open var username:String? = null
    open var password:String? = null
}

open class DropBoxFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var rootPath:String? = null
    open var accessToken:String? = null
}

open class AppleICloudFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var containerIdentifier:String? = null
    open var relativePath:String? = null
    open var keyId:String? = null
    open var teamId:String? = null
    open var bundleId:String? = null
    open var p8PrivateKey:String? = null
}

open class AwsS3FilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
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
    override var provider:FileProvider? = null
    open var bucketName:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class AzureBlobFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var blobName:String? = null
    open var connectionString:String? = null
}

open class LocalFilesIntegrationRequest : FilesIntegrationRequest()
{
    override var provider:FileProvider? = null
    open var rootPath:String? = null
}

open class AmqpLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
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
    override var provider:LoggingProvider? = null
    open var streamName:String? = null
    open var region:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class AwsS3LoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var integrationType:AwsS3LoggingIntegrationType? = null
    open var bucketName:String? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class NewRelicLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var region:String? = null
    open var serviceName:String? = null
    open var apiKey:String? = null
}

open class MongoDbLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var databaseName:String? = null
    open var connectionString:String? = null
}

open class KafkaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
    open var saslUsername:String? = null
    open var saslPassword:String? = null
}

open class PrometheusLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var endpointUrl:String? = null
    open var jobName:String? = null
    open var bearerToken:String? = null
}

open class DataDogLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var site:String? = null
    open var serviceName:String? = null
    open var environment:String? = null
    open var apiKey:String? = null
}

open class InternalKafkaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var bootstrapServers:String? = null
    open var topic:String? = null
    open var securityProtocol:String? = null
    open var saslUsername:String? = null
    open var saslPassword:String? = null
}

open class ElasticSearchLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var uri:String? = null
    open var index:String? = null
    open var username:String? = null
    open var password:String? = null
}

open class SplunkLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var hecEndpointUrl:String? = null
    open var index:String? = null
    open var hecToken:String? = null
}

open class AzureOtelLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var endpointUrl:String? = null
    open var resourceName:String? = null
    open var connectionString:String? = null
}

open class KibanaLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var uri:String? = null
    open var spaceId:String? = null
    open var apiKey:String? = null
}

open class LocalFileLoggingIntegrationRequest : LoggingIntegrationRequest()
{
    override var provider:LoggingProvider? = null
    open var rootPath:String? = null
}

open class OktaMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var domain:String? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class XMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var apiKey:String? = null
    open var apiSecretKey:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class GoogleMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class MicrosoftMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var tenantId:String? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class GitHubMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class MetaMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
    open var appId:String? = null
    open var appSecret:String? = null
    open var oAuthModes:ArrayList<OAuthModeConfig>? = null
}

open class AppleMembershipIntegrationRequest : MembershipIntegrationRequest()
{
    override var provider:MembershipProvider? = null
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
    override var provider:PaymentGatewayPlatform? = null
    open var storeId:String? = null
    open var apiKey:String? = null
    open var webhookSigningSecret:String? = null
    open var isTestMode:Boolean? = null
}

open class AdyenPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var merchantAccount:String? = null
    open var apiKey:String? = null
    open var environment:String? = null
    open var webhookId:String? = null
    open var webhookHmacKey:String? = null
}

open class MolliePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var profileId:String? = null
    open var apiKey:String? = null
    open var isTestMode:Boolean? = null
    open var webhookSigningSecret:String? = null
}

open class PaddlePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var apiKey:String? = null
    open var webhookEndpointSecretKey:String? = null
    open var environment:String? = null
    open var clientSideToken:String? = null
}

open class PayPalPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var clientId:String? = null
    open var clientSecret:String? = null
    open var environment:String? = null
    open var brandName:String? = null
    open var webhookId:String? = null
}

open class StripePaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var publishableKey:String? = null
    open var secretKey:String? = null
    open var webhookSigningSecret:String? = null
    open var webhookEndpointId:String? = null
    open var defaultCurrency:String? = null
}

open class AppleInAppPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var merchantIdentifier:String? = null
    open var merchantDomain:String? = null
    open var displayName:String? = null
    open var merchantIdentityCertificateP12Base64:String? = null
    open var merchantIdentityCertificatePassword:String? = null
    open var paymentProcessingCertificateP12Base64:String? = null
    open var paymentProcessingCertificatePassword:String? = null
    open var webhookBundleId:String? = null
}

open class GoogleInAppPaymentIntegrationRequest : PaymentIntegrationRequest()
{
    override var provider:PaymentGatewayPlatform? = null
    open var merchantId:String? = null
    open var merchantName:String? = null
    open var gateway:String? = null
    open var privateKeyOrToken:String? = null
    open var gatewayMerchantId:String? = null
    open var webhookPackageName:String? = null
}

open class EdgeWebPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class ChromePluginPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var extensionId:String? = null
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class SafariPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var websitePushId:String? = null
    open var certificateP12Base64:String? = null
    open var certificatePassword:String? = null
}

open class ChromeWebPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class FirefoxWebPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var vapidPublicKey:String? = null
    open var vapidPrivateKey:String? = null
    open var subject:String? = null
}

open class AndroidFirebasePushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var projectId:String? = null
    open var clientEmail:String? = null
    open var serviceAccountJson:String? = null
}

open class AppleApnsPushIntegrationRequest : PushIntegrationRequest()
{
    override var provider:PushProvider? = null
    open var teamId:String? = null
    open var appBundleId:String? = null
    open var keyId:String? = null
    open var privateKey:String? = null
    open var isProduction:Boolean? = null
}

open class AwsLambdaCodeIntegrationRequest : CodeIntegrationRequest()
{
    override var provider:CodeProvider? = null
    open var integrationType:AwsLambdaIntegrationType? = null
    open var region:String? = null
    open var roleArn:String? = null
    open var externalId:String? = null
    open var accessKey:String? = null
    open var secretKey:String? = null
}

open class AzureFunctionsCodeIntegrationRequest : CodeIntegrationRequest()
{
    override var provider:CodeProvider? = null
    open var functionAppName:String? = null
    open var resourceGroup:String? = null
    open var connectionStringOrKey:String? = null
}

open class GoogleCloudFunctionsCodeIntegrationRequest : CodeIntegrationRequest()
{
    override var provider:CodeProvider? = null
    open var projectId:String? = null
    open var region:String? = null
    open var serviceAccountJsonKey:String? = null
}

open class OllamaLlmIntegrationRequest : LlmIntegrationRequest()
{
    override var provider:LlmProvider? = null
}

open class OpenRouterLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class MistralLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class GrokLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class GroqLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class GoogleLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class AnthropicLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class OpenAiLlmIntegrationRequest : LlmIntegrationRequest(), ILlmApiKeyRequest
{
    override var provider:LlmProvider? = null
    override var apiKey:String? = null
}

open class PlaywrightMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var headless:String? = null
}

open class MongoDbMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var connectionString:String? = null
}

open class GitHubMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var serverUrl:String? = null
    open var accessToken:String? = null
}

open class StripeMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var serverUrl:String? = null
    open var apiKey:String? = null
}

open class BraveSearchMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var serverUrl:String? = null
    open var apiKey:String? = null
}

open class ObsidianMcpIntegrationRequest : McpIntegrationRequest()
{
    override var provider:McpProvider? = null
    override var transport:McpTransport? = null
    open var command:String? = null
    open var args:ArrayList<String>? = null
    open var environmentVariables:HashMap<String,String>? = null
}

@DataContract
open class EmailTemplateDto : TemplateDto(), IBindableContract
{
    @DataMember
    open var translations:ArrayList<EmailMessageTranslationDto> = ArrayList<EmailMessageTranslationDto>()

    @DataMember
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null
}

@DataContract
open class PushTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:ArrayList<PushMessageTranslationDto> = ArrayList<PushMessageTranslationDto>()
}

@DataContract
open class SmsTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:ArrayList<SmsMessageTranslationDto> = ArrayList<SmsMessageTranslationDto>()
}

@DataContract
open class SystemEmailTemplateDto : EmailTemplateDto()
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
open class TriggerActionSmsDto : TriggerActionDto()
{
    @DataMember
    open var templateId:String? = null

    @DataMember
    open var deliverySettings:SmsCampaignDeliverySettingsDto? = null
}

@DataContract
open class TriggerActionSseDto : TriggerActionDto()
{
    @DataMember
    open var deliverySettings:SseDeliverySettingsDto? = null
}

@DataContract
open class TriggerActionMarketplaceDto : TriggerActionDto()
{
    @DataMember
    open var functionId:String? = null

    @DataMember
    open var payload:HashMap<String,String>? = null
}

@DataContract
open class SseDeliverySettingsDto
{
    @DataMember
    open var audience:String? = null

    @DataMember
    open var userAuthIds:ArrayList<String>? = null

    @DataMember
    open var eventName:String? = null

    @DataMember
    open var payloadType:String? = null

    @DataMember
    open var payloadTemplate:String? = null

    @DataMember
    open var persist:Boolean? = null

    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null
}

@DataContract
open class GetTriggers : CodeMashListPaginationRequestBase()
{
    @DataMember
    open var schemaId:String? = null
}

@DataContract
open class GetTriggersResponse : ResponseBase()
{
}

@DataContract
open class EmailToAllUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var rolesNames:ArrayList<String>? = null

    @DataMember
    open var userTags:ArrayList<String>? = null
}

@DataContract
open class EmailToAccountUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var userRecipients:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var userCc:ArrayList<String>? = null

    @DataMember
    open var userBcc:ArrayList<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToUsersDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var userRecipients:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var userCc:ArrayList<String>? = null

    @DataMember
    open var userBcc:ArrayList<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToEmailAddressesDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var recipients:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var recipientsCc:ArrayList<String>? = null

    @DataMember
    open var recipientsBcc:ArrayList<String>? = null

    @DataMember
    open var singleEmailStrategy:Boolean? = null
}

@DataContract
open class EmailToCollectionRecordsDeliverySettingsDto : EmailCampaignDeliverySettingsDto()
{
    @DataMember
    open var fields:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var schemaName:String? = null

    @DataMember
    open var fieldType:CollectionEmailCampaignRecipientField? = null

    @DataMember
    open var roleNames:ArrayList<String>? = null

    @DataMember
    open var languages:ArrayList<String>? = null
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
open class PushToAccountUsersDeliverySettingsDto : PushCampaignDeliverySettingsDto()
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

open class MongoDbConnectionStringIntegrationDto : DatabaseIntegrationDto()
{
    open var databaseName:String? = null
}

open class MongoDbAtlasFlexManagedIntegrationDto : DatabaseIntegrationDto()
{
    open var databaseName:String? = null
    open var norbixRegionCode:String? = null
    open var flexTierCode:String? = null
    open var status:IntegrationStatus? = null
    open var atlasProjectId:String? = null
    open var atlasClusterName:String? = null
    open var failureReason:String? = null
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
    open var region:MailGunRegion? = null
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
    open var isConfigured:Boolean? = null
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
open class MarketplaceFunctionDto : IHasViewId
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
    open var requestTemplate:String? = null

    @DataMember
    open var mappedTokens:ArrayList<MarketplaceTokenMappingDto> = ArrayList<MarketplaceTokenMappingDto>()
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
    open var tags:IReadOnlyList<String>? = null

    @DataMember
    open var specVersion:Int? = null

    @DataMember
    open var configFields:IReadOnlyList<MarketplaceFieldDefinitionDto>? = null

    @DataMember
    open var secretFields:IReadOnlyList<MarketplaceFieldDefinitionDto>? = null

    @DataMember
    open var functions:IReadOnlyList<MarketplaceFunctionDefinitionDto>? = null
}

@DataContract
open class MarketplaceFunctionDefinitionDto
{
    @DataMember
    open var definitionId:String? = null

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

    @DataMember
    open var requestSchema:String? = null

    @DataMember
    open var requestTemplate:String? = null

    @DataMember
    open var request:MarketplaceHttpRequestSpecDto? = null

    @DataMember
    open var defaultTokenMappings:ArrayList<MarketplaceTokenMappingDto> = ArrayList<MarketplaceTokenMappingDto>()
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

open class AdminPortalModuleDto
{
    open var key:String? = null
    open var displayName:String? = null
    open var enabled:Boolean? = null
}

open class UserMessageEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var text:String? = null
    open var attachments:ArrayList<AiChatEntryAttachmentWireDto> = ArrayList<AiChatEntryAttachmentWireDto>()
}

open class AssistantTextEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var text:String? = null
    open var isStreaming:Boolean? = null
    open var sources:ArrayList<AiChatEntrySourceWireDto> = ArrayList<AiChatEntrySourceWireDto>()
}

open class AssistantQuestionEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var questions:ArrayList<AiChatQuestionWireDto> = ArrayList<AiChatQuestionWireDto>()
    open var status:String? = null
    open var scope:String? = null
    open var gate:AiChatGateResultWireDto? = null
}

open class UserAnswerEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var answers:HashMap<String,String> = HashMap<String,String>()
}

open class PlanEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var goal:String? = null
    open var steps:ArrayList<AiChatPlanStepWireDto> = ArrayList<AiChatPlanStepWireDto>()
    open var status:String? = null
    open var gate:AiChatGateResultWireDto? = null
    open var difficulty:Int? = null
    open var difficultyReason:String? = null
    open var deltaOf:String? = null
}

open class UserDecisionEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var decision:String? = null
    open var comment:String? = null
}

open class RunStepEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var n:Int? = null
    open var tool:String? = null
    open var title:String? = null
    open var status:String? = null
    open var resultSummary:String? = null
    open var error:String? = null
    open var log:ArrayList<AiChatStepLogLineWireDto> = ArrayList<AiChatStepLogLineWireDto>()
}

open class ActionPendingEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var tool:String? = null
    open var argumentsJson:String? = null
    open var status:String? = null
}

open class NoticeEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var text:String? = null
    open var level:String? = null
}

open class ConversationSnapshotEntryWireDto : AiChatEntryWireDto()
{
    override var kind:String? = null
    open var snapshotId:String? = null
    open var coversUpToSeq:Long? = null
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

open class Env
{
    open var value:String? = null
    open var isProd:Boolean? = null
}

@DataContract(Namespace="http://codemash.io/types/")
open class CodeMashRequestBase : RequestBase(), IHasProjectId, IHasEnv
{
    /**
    * ID of your project. Can be passed in a header as norbix-project-id.
    */
    @DataMember
    @ApiMember(DataType="string", Description="ID of your project. Can be passed in a header as norbix-project-id.", IsRequired=true, Name="norbix-project-id", ParameterType="header")
    override var projectId:String? = null

    /**
    * Target environment for this request (e.g. TEST, STAGING). Optional — when omitted the request runs against PROD. Can be passed in a header as norbix-env.
    */
    @DataMember
    @ApiMember(DataType="string", Description="Target environment for this request (e.g. TEST, STAGING). Optional — when omitted the request runs against PROD. Can be passed in a header as norbix-env.", Name="norbix-env", ParameterType="header")
    override var env:String? = null
}

interface IHasProjectId
{
    var projectId:String?
}

interface IHasEnv
{
    var env:String?
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
    open var region:NorbixRegion? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var continent:Continent? = null
}

open class DomainUrl
{
    open var value:Uri? = null
}

open class ProjectLegalDocuments
{
    open var termsMarkdown:String? = null
    open var privacyMarkdown:String? = null
}

open class AuthId : IHasDomainEntityId
{
    open var value:UUID? = null
}

open class Language
{
    open var code:String? = null
    open var name:String? = null
}

open class ProjectLogo
{
    open var fileResource:FileResourceRef? = null
    open var publicUrl:String? = null
}

open class ProjectIcon
{
    open var fileResource:FileResourceRef? = null
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

open class PaymentCustomerRef : ResourceRef()
{
    override var kind:ResourceRefKind? = null
    open var source:ResourceSource? = null
    open var externalId:String? = null
}

open class CodeMashManagedServiceSubscription
{
    open var subscriptionId:CodeMashSubscriptionId? = null
    open var paymentCustomerRef:PaymentCustomerRef? = null
    open var refSubscriptionId:String? = null
    open var issuedOn:UtcDateTime? = null
    open var willExpireOn:UtcDateTime? = null
    open var projectCap:Quantity? = null
    open var isTrial:Boolean? = null
}

open class MembershipPolicy
{
    open var id:PolicyId? = null
    open var name:DisplayName? = null
    open var description:String? = null
    open var permissions:ArrayList<Permission> = ArrayList<Permission>()
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

open class AtlasUsageRecord
{
    open var period:BillingPeriod? = null
    open var totalCents:Long? = null
    open var perCluster:IReadOnlyList<AtlasClusterChargeRecord>? = null
    open var recordedAtUtc:UtcDateTime? = null
}

open class UsageIngestionFailure
{
    open var reason:UsageIngestionFailureReason? = null
    open var period:BillingPeriod? = null
    open var stripeEventId:String? = null
    open var message:String? = null
    open var reportedAtUtc:UtcDateTime? = null
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
    open var schemaId:String? = null
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

open class CodeMashListPaginationRequestBase : RequestBase(), IHasProjectId, IHasEnv
{
    /**
    * ID of your project. Can be passed in a header as norbix-project-id.
    */
    @DataMember
    @ApiMember(DataType="string", Description="ID of your project. Can be passed in a header as norbix-project-id.", IsRequired=true, Name="norbix-project-id", ParameterType="header")
    override var projectId:String? = null

    /**
    * Target environment for this request (e.g. TEST, STAGING). Optional — when omitted the request runs against PROD. Can be passed in a header as norbix-env.
    */
    @DataMember
    @ApiMember(DataType="string", Description="Target environment for this request (e.g. TEST, STAGING). Optional — when omitted the request runs against PROD. Can be passed in a header as norbix-env.", Name="norbix-env", ParameterType="header")
    override var env:String? = null

    open var resolvedEnv:Env? = null
    /**
    * Cursor token — fetch the page AFTER this item.
    */
    @DataMember
    @ApiMember(DataType="string", Description="Cursor token — fetch the page AFTER this item.", Name="startingAfter", ParameterType="query")
    open var startingAfter:String? = null

    /**
    * Cursor token — fetch the page BEFORE this item.
    */
    @DataMember
    @ApiMember(DataType="string", Description="Cursor token — fetch the page BEFORE this item.", Name="endingBefore", ParameterType="query")
    open var endingBefore:String? = null

    /**
    * Amount of records to return.
    */
    @DataMember
    @ApiMember(DataType="integer", Description="Amount of records to return.", Format="int32", Name="pageSize", ParameterType="query")
    open var pageSize:Int? = null

    /**
    * Paging
    */
    @ApiMember(DataType="object", Description="Paging", Name="paging", ParameterType="body")
    open var paging:PagingArgs? = null
}

open class MembershipIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:MembershipProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class CredentialsSettingsModeDto
{
    open var name:String? = null
    open var logoutUrl:String? = null
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
    open var isProjectSystemRole:Boolean? = null

    @Ignore()
    open var isAccountSystemRole:Boolean? = null

    @Ignore()
    open var isSystemRole:Boolean? = null
}

open class MembershipTrigger : Trigger()
{
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

open class Trigger : IHasDomainEntityId
{
    open var triggerId:TriggerId? = null
    open var name:DisplayName? = null
    open var triggerAction:TriggerAction? = null
    open var activationCode:TemplateCode? = null
    open var description:String? = null
    open var isEnabled:Boolean? = null
    open var env:Env? = null
    open var integrationId:IntegrationId? = null
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

    @DataMember
    open var hasRecordOwner:Boolean? = null

    @DataMember
    open var description:String? = null
}

open class SchemaListSettingsDto
{
    @DataMember
    open var columns:ArrayList<SchemaListColumnDto> = ArrayList<SchemaListColumnDto>()

    @DataMember
    open var defaultSort:SchemaListSortDto? = null
}

open class ImportColumnMappingDto
{
    @DataMember
    open var csvColumnIndex:Int? = null

    @DataMember
    open var csvHeader:String? = null

    @DataMember
    open var propertyName:String? = null

    @DataMember
    open var dontImportOnError:Boolean? = null
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
    open var status:IntegrationStatus? = null
    open var atlasProjectId:String? = null
    open var atlasClusterName:String? = null
    open var failureReason:String? = null
}

enum class ProjectStatus
{
    Active,
    Provisioning,
    ProvisioningFailed,
    NoDatabase,
    Disabled,
    Suspended,
    Removed,
}

open class Schema : IHasDomainEntityId
{
    open var schemaName:SchemaName? = null
    open var id:SchemaId? = null
    open var env:Env? = null
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
    open var hasRecordOwner:Boolean? = null
    open var description:String? = null
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

interface IPasskeyMessage
{
}

open class Auth : IBindableContract
{
    open var id:AuthId? = null
    open var roles:ArrayList<RoleName>? = null
    open var email:EmailAddress? = null
    open var userName:AuthUserName? = null
    @SerializedName("type") open var Type:AuthType? = null
    open var registration:Registration? = null
    open var login:Login? = null
    open var generalInfo:UserGeneralInfo? = null
    open var status:AuthStatus? = null
    open var createdOn:UtcDateTime? = null
    open var modifiedOn:UtcDateTime? = null
    open var pushDevices:PushDevices? = null
    open var tags:ArrayList<Tag>? = null
    open var userRef:UserRef? = null
}

open class UserId : IHasDomainEntityId
{
    open var value:UUID? = null
}

open class UserGeneralInfo : IBindableContract
{
    open var phone:Phone? = null
    open var primaryEmail:EmailAddress? = null
    open var displayName:DisplayName? = null
    open var firstName:FirstName? = null
    open var lastName:LastName? = null
    open var fullName:FullName? = null
    open var address:Address? = null
    open var company:String? = null
    open var gender:Gender? = null
    open var birthDate:UtcDateTime? = null
    open var timeZone:TimeZone? = null
    open var language:Language? = null
    open var marketingPreferences:UserMarketingPreferences? = null
    open var notes:String? = null
    open var extraMetadata:String? = null
}

open class FilesIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:FileProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class FileIntegration : Integration()
{
    open var provider:FileProvider? = null
}

open class FileTrigger : Trigger()
{
    @SerializedName("when") open var When:FilesTriggerType? = null
    open var fileResourceRef:FileResourceRef? = null
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

open class EmailValidationIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:EmailValidationProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

@DataContract
open class EmailMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:EmailMessageContentDto? = null

    @DataMember
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null
}

open class SaveEmailTemplate : CodeMashRequestBase()
{
    /**
    * The display name of the email template.
    */
    @ApiMember(Description="The display name of the email template.", IsRequired=true)
    open var templateName:String? = null

    /**
    * Optional free-text description of what the template is used for.
    */
    @ApiMember(Description="Optional free-text description of what the template is used for.")
    open var description:String? = null

    /**
    * The communication channel the template is intended for (e.g. Transactional, Marketing).
    */
    @ApiMember(Description="The communication channel the template is intended for (e.g. Transactional, Marketing).")
    open var communicationChannel:CommunicationChannel? = null

    /**
    * Optional tags to organize/filter the template by.
    */
    @ApiMember(Description="Optional tags to organize/filter the template by.")
    open var tags:ArrayList<String>? = null

    /**
    * Optional static file attachments to send with every email using this template.
    */
    @DataMember
    @ApiMember(Description="Optional static file attachments to send with every email using this template.")
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null

    /**
    * The per-language content translations (subject/body) for this template.
    */
    @ApiMember(Description="The per-language content translations (subject/body) for this template.", IsRequired=true)
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
    open var validationIntegrationId:String? = null
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

open class EmailFooter
{
    open var id:EmailFooterId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<TemplateCode>> = ArrayList<MessageTranslation<TemplateCode>>()
    open var env:Env? = null
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

open class EmailSignature
{
    open var id:EmailSignatureId? = null
    open var displayName:DisplayName? = null
    open var translations:ArrayList<MessageTranslation<TemplateCode>> = ArrayList<MessageTranslation<TemplateCode>>()
    open var env:Env? = null
}

open class TemplateId
{
    open var value:UUID? = null
}

@DataContract
open class EmailTemplate : Template<EmailMessageContent>()
{
    @DataMember
    open var staticAttachments:ArrayList<FileResourceRef>? = null
}

open class EmailValidationIntegration : Integration()
{
    open var provider:EmailValidationProvider? = null
}

open class CampaignId
{
    open var id:UUID? = null
}

open class CampaignBatchId
{
    open var id:UUID? = null
}

open class NotificationId : AggregateId(), IHasDomainEntityId
{
}

enum class CampaignStopReason
{
    UserRequested,
    ModuleDisabled,
}

open class ErrorDto
{
    open var message:String? = null
    open var errorCode:String? = null
    open var context:HashMap<String,String>? = null
    open var stackTrace:ArrayList<ErrorDto>? = null
}

enum class EmailDeliveryEventType
{
    Unknown,
    Delivered,
    Open,
    Click,
    SoftBounce,
    HardBounce,
    Complaint,
    Unsubscribed,
}

@DataContract
open class SmsMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:SmsMessageContentDto? = null
}

open class SaveSmsTemplate : CodeMashRequestBase()
{
    /**
    * Display name for the SMS template.
    */
    @ApiMember(Description="Display name for the SMS template.", IsRequired=true)
    open var templateName:String? = null

    /**
    * Optional free-text description of the template's purpose.
    */
    @ApiMember(Description="Optional free-text description of the template's purpose.")
    open var description:String? = null

    /**
    * Whether this template is Transactional or Marketing SMS.
    */
    @ApiMember(Description="Whether this template is Transactional or Marketing SMS.", IsRequired=true)
    open var communicationChannel:CommunicationChannel? = null

    /**
    * Optional tags to organize/filter templates.
    */
    @ApiMember(Description="Optional tags to organize/filter templates.")
    open var tags:ArrayList<String>? = null

    /**
    * The template's per-language translations (each with its own SMS body).
    */
    @ApiMember(Description="The template's per-language translations (each with its own SMS body).", IsRequired=true)
    open var translations:ArrayList<SmsMessageTranslationDto> = ArrayList<SmsMessageTranslationDto>()
}

open class SmsIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:SmsProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

enum class SmsCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    PhoneNumbers,
    Collection,
}

open class SmsIntegration : Integration()
{
    open var provider:SmsProvider? = null
}

@DataContract
open class SmsTemplate : Template<SmsMessageContent>()
{
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

enum class MarketplaceTransport
{
    Mcp,
    Rest,
    Code,
    Internal,
    Sdk,
}

@DataContract
open class MarketplaceTokenMappingDto
{
    @DataMember
    open var token:String? = null

    @DataMember
    open var resolver:MarketplaceTokenResolverKind? = null

    @DataMember
    open var value:String? = null

    @DataMember
    open var secretKeys:ArrayList<String>? = null

    @DataMember
    open var format:MarketplaceSecretValueFormat? = null
}

open class CodeIntegrationRequest
{
    open var integrationId:String? = null
    open var provider:CodeProvider? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
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
    open var tokenMappings:IReadOnlyList<MarketplaceTokenMapping>? = null
}

open class MarketplaceFunction : IHasDomainEntityId
{
    open var functionId:MarketplaceFunctionId? = null
    open var integrationId:IntegrationId? = null
    open var env:Env? = null
    open var functionKey:String? = null
    open var displayName:DisplayName? = null
    open var description:String? = null
    open var isEnabled:Boolean? = null
    open var requestTemplate:String? = null
    open var mappedTokens:IReadOnlyList<MarketplaceTokenMapping>? = null
    override var viewId:String? = null
}

open class MarketplaceFunctionId : IHasDomainEntityId
{
    open var value:UUID? = null
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
    /**
    * The template's display name.
    */
    @ApiMember(Description="The template's display name.", IsRequired=true)
    open var templateName:String? = null

    /**
    * Optional free-text description of the template's purpose.
    */
    @ApiMember(Description="Optional free-text description of the template's purpose.")
    open var description:String? = null

    /**
    * Whether the template is Transactional or Marketing.
    */
    @ApiMember(Description="Whether the template is Transactional or Marketing.")
    open var communicationChannel:CommunicationChannel? = null

    /**
    * Optional tags for organizing/filtering templates.
    */
    @ApiMember(Description="Optional tags for organizing/filtering templates.")
    open var tags:ArrayList<String>? = null

    /**
    * The per-locale translations (title/body/subtitle) that make up the template content.
    */
    @ApiMember(Description="The per-locale translations (title/body/subtitle) that make up the template content.", IsRequired=true)
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

open class PushCampaignRequest
{
    open var source:PushCampaignRecipientsSourceTypes? = null
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
    open var provider:PaymentGatewayPlatform? = null
    open var integrationName:String? = null
    open var isEnabled:Boolean? = null
}

open class PaymentIntegration : Integration()
{
    open var provider:PaymentGatewayPlatform? = null
}

open class PaymentTrigger : Trigger()
{
    @SerializedName("when") open var When:PaymentTriggerType? = null
    open var integrations:ArrayList<IntegrationId>? = null
    open var events:ArrayList<String>? = null
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

open class ChatScreenContextDto
{
    open var kind:String? = null
    open var viewId:String? = null
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

open class LlmIntegration : Integration()
{
    open var provider:LlmProvider? = null
    open var defaultModel:String? = null
}

open class McpIntegration : Integration()
{
    open var provider:McpProvider? = null
    open var transport:McpTransport? = null
    open var metadata:McpMetadata? = null
}

open class WebhookIntegration : Integration()
{
    override var capability:String? = null
    open var destinations:ArrayList<WebhookDestination> = ArrayList<WebhookDestination>()
    open var extraHeaders:IReadOnlyDictionary<String, String>? = null
}

open class WebhookDestination
{
    open var destinationId:WebhookDestinationId? = null
    open var destinationName:DisplayName? = null
    open var endpointUrl:DomainUrl? = null
    open var selectedEvents:ArrayList<TriggerEventName> = ArrayList<TriggerEventName>()
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
    open var initiatorId:AuthId? = null
    open var isEnabled:Boolean? = null
    open var stopOnError:Boolean? = null
}

open class TaskId : AggregateId()
{
}

open class ResourceRefDto
{
    open var projectId:String? = null
    open var integrationId:String? = null
    open var kind:ResourceKindDto? = null
}

@DataContract
open class CaseResolutionDto
{
    @DataMember
    open var problem:String? = null

    @DataMember
    open var symptoms:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var rootCause:String? = null

    @DataMember
    open var fix:CaseResolutionFixKind? = null

    @DataMember
    open var fixDetail:String? = null

    @DataMember
    open var affectedVersions:ArrayList<String>? = null
}

open class SupportCaseId : AggregateId()
{
    open var viewId:String? = null
}

enum class SupportCaseKind
{
    Question,
    Bug,
    Incident,
    Billing,
    Security,
    FeatureRequest,
}

enum class SupportCaseSeverity(val value:Int)
{
    S1(1),
    S2(2),
    S3(3),
    S4(4),
}

enum class DeploymentMode
{
    Managed,
    SelfHosted,
    Enterprise,
}

open class SupportMessageRef
{
    open var messageId:String? = null
    open var authorKind:SupportMessageAuthorKind? = null
    open var authorId:String? = null
    open var sentOn:UtcDateTime? = null
}

enum class SupportCaseStatus
{
    Open,
    Triaged,
    InProgress,
    WaitingOnCustomer,
    Resolved,
    Closed,
}

open class CaseResolution
{
    open var problem:String? = null
    open var symptoms:IReadOnlyList<String>? = null
    open var rootCause:String? = null
    open var fix:CaseResolutionFixKind? = null
    open var fixDetail:String? = null
    open var module:String? = null
    open var kind:SupportCaseKind? = null
    open var severity:SupportCaseSeverity? = null
    open var affectedVersions:IReadOnlyList<String>? = null
    open var resolvedBy:String? = null
}

enum class SupportCaseCloseReason
{
    Manual,
    AutoClosedAfterResolve,
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
    Staging,
    Production,
}

@DataContract
open class EchoLicenseDto
{
    @DataMember(Name="domain")
    @SerializedName("domain")
    open var domain:String? = null

    @DataMember(Name="accountId")
    @SerializedName("accountId")
    open var accountId:String? = null

    @DataMember(Name="email")
    @SerializedName("email")
    open var email:String? = null

    @DataMember(Name="release")
    @SerializedName("release")
    open var release:String? = null

    @DataMember(Name="expire")
    @SerializedName("expire")
    open var expire:Long? = null

    @DataMember(Name="isTrial")
    @SerializedName("isTrial")
    open var isTrial:Boolean? = null

    @DataMember(Name="cap")
    @SerializedName("cap")
    open var projectsCap:Int? = null
}

open class EchoRegionDto
{
    open var code:String? = null
    open var displayName:String? = null
    open var apiUrl:String? = null
    open var hubUrl:String? = null
}

open class PublicBrandDto
{
    open var displayName:String? = null
    open var mainColor:String? = null
    open var accentColor:String? = null
    open var logoUrl:String? = null
    open var iconUrl:String? = null
}

open class PublicAuthDto
{
    open var socialProviders:ArrayList<String> = ArrayList<String>()
    open var passkey:Boolean? = null
    open var methods:ArrayList<String>? = null
    open var passwordPolicy:PublicPasswordPolicyDto? = null
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

@DataContract
open class ResponseBase
{
    @DataMember
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
open class UsageBillingDto
{
    @DataMember
    open var accountId:String? = null

    @DataMember
    open var atlas:HashMap<String,UsageBillingPeriodDto> = HashMap<String,UsageBillingPeriodDto>()

    @DataMember
    open var ingestionFailures:ArrayList<UsageBillingIngestionFailureDto> = ArrayList<UsageBillingIngestionFailureDto>()
}

@DataContract
open class PromotionResultDto
{
    @DataMember
    open var contentMirrored:ArrayList<PromotionItemDto> = ArrayList<PromotionItemDto>()

    @DataMember
    open var contentDeleted:ArrayList<PromotionItemDto> = ArrayList<PromotionItemDto>()

    @DataMember
    open var integrationsSeeded:ArrayList<PromotionItemDto> = ArrayList<PromotionItemDto>()

    @DataMember
    open var integrationsSkipped:ArrayList<PromotionItemDto> = ArrayList<PromotionItemDto>()

    @DataMember
    open var blockers:ArrayList<PromotionBlockerDto> = ArrayList<PromotionBlockerDto>()

    @DataMember
    open var fromVersion:Long? = null

    @DataMember
    open var wasDryRun:Boolean? = null
}

@DataContract
open class ProjectEnvironmentsDto
{
    @DataMember
    open var environments:ArrayList<String> = ArrayList<String>()
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
    open var canonicalAdminUrl:String? = null

    @DataMember
    open var adminUrl:String? = null

    @DataMember
    open var effectiveAdminUrl:String? = null

    @DataMember
    open var defaultLanguage:String? = null

    @DataMember
    open var languages:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var primaryRegion:ProjectRegionDto? = null

    @DataMember
    open var additionalRegions:ArrayList<ProjectRegionDto>? = null

    @DataMember
    open var isMultiRegionEligible:Boolean? = null

    @DataMember
    open var brand:ProjectBrandDto? = null

    @DataMember
    open var notificationSettings:NotificationSettingsDto? = null

    @DataMember
    open var allowedOrigins:ArrayList<String>? = null

    @DataMember
    open var exposeBrandToAdminPortal:Boolean? = null

    @DataMember
    open var exposeAuthToAdminPortal:Boolean? = null

    @DataMember
    open var adminPortalEnabled:Boolean? = null

    @DataMember
    open var adminPortalServiceUserId:String? = null

    @DataMember
    open var membershipAuthenticationFlows:ArrayList<AuthenticationFlowSummaryDto>? = null

    @DataMember
    open var exposeLegalToAdminPortal:Boolean? = null

    @DataMember
    open var legalTermsMarkdown:String? = null

    @DataMember
    open var legalPrivacyMarkdown:String? = null

    @DataMember
    open var environments:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var environmentRanks:HashMap<String,Int> = HashMap<String,Int>()

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
    open var defaultLlmIntegrationViewId:String? = null

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
    open var projectStatus:ProjectStatus? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var uniqueName:String? = null

    @DataMember
    open var primaryRegion:ProjectRegionDto? = null

    @DataMember
    open var additionalRegions:ArrayList<ProjectRegionDto>? = null
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

open class AuthDto : IBindableContract
{
    open var id:String? = null
    @SerializedName("type") open var Type:AuthType? = null
    open var email:String? = null
    open var userName:String? = null
    open var registration:RegistrationDto? = null
    open var login:LoginDto? = null
    open var generalInfo:UserGeneralInfoDto? = null
    open var roles:ArrayList<String>? = null
    open var pushDevices:ArrayList<String>? = null
    open var tags:ArrayList<String>? = null
    open var status:AuthStatus? = null
    open var createdOn:Date? = null
    open var modifiedOn:Date? = null
}

open class AccountPasswordPolicyDto
{
    open var minLength:Int? = null
    open var maxLength:Int? = null
    open var minNumbers:Int? = null
    open var maxNumbers:Int? = null
    open var minUpper:Int? = null
    open var maxUpper:Int? = null
    open var minLower:Int? = null
    open var maxLower:Int? = null
    open var minSpecial:Int? = null
    open var maxSpecial:Int? = null
    open var allowedSpecial:String? = null
}

open class PolicyItemDto
{
    open var id:String? = null
    open var name:String? = null
    open var description:String? = null
    open var isSystem:Boolean? = null
    open var permissions:ArrayList<PermissionDto>? = null
}

open class AccountTeamRoleDto
{
    open var id:String? = null
    open var name:String? = null
    open var description:String? = null
    open var isSystem:Boolean? = null
    open var policies:ArrayList<String>? = null
}

open class AccountPasskeyListItemDto
{
    open var credentialId:String? = null
    open var friendlyName:String? = null
    open var registeredOnUtc:Date? = null
    open var lastUsedOnUtc:Date? = null
    open var isRevoked:Boolean? = null
}

@DataContract
open class LicenseDomainDnsStatusDto
{
    @DataMember
    open var domain:String? = null

    @DataMember
    open var allRequiredResolved:Boolean? = null

    @DataMember
    open var records:ArrayList<LicenseDomainDnsRecordDto> = ArrayList<LicenseDomainDnsRecordDto>()
}

@DataContract
open class LicenseDomainVerificationChallengeDto
{
    @DataMember
    open var domain:String? = null

    @DataMember
    open var txtHost:String? = null

    @DataMember
    open var txtValue:String? = null

    @DataMember
    open var expiresAtUtc:Date? = null

    @DataMember
    open var verified:Boolean? = null

    @DataMember
    open var verifiedAtUtc:Date? = null

    @DataMember
    open var skipped:Boolean? = null
}

@DataContract
open class LicenseDomainVerificationStatusDto
{
    @DataMember
    open var domain:String? = null

    @DataMember
    open var verified:Boolean? = null

    @DataMember
    open var skipped:Boolean? = null

    @DataMember
    open var txtHost:String? = null

    @DataMember
    open var expectedTxtValue:String? = null

    @DataMember
    open var observedTxtValue:String? = null

    @DataMember
    open var expiresAtUtc:Date? = null

    @DataMember
    open var verifiedAtUtc:Date? = null

    @DataMember
    open var message:String? = null
}

open class LicenseDto : CodeMashSubscriptionDto()
{
    open var isEnterprise:Boolean? = null
    open var projectCap:Int? = null
}

@DataContract
open class LicenseHeartbeatVerdictDto
{
    @DataMember(Name="status")
    @SerializedName("status")
    open var status:String? = null

    @DataMember(Name="proofToken")
    @SerializedName("proofToken")
    open var proofToken:String? = null

    @DataMember(Name="serverTimeUtc")
    @SerializedName("serverTimeUtc")
    open var serverTimeUtc:Date? = null

    @DataMember(Name="graceUntilUtc")
    @SerializedName("graceUntilUtc")
    open var graceUntilUtc:Date? = null

    @DataMember(Name="installationId")
    @SerializedName("installationId")
    open var installationId:UUID? = null

    @DataMember(Name="licenseAccountId")
    @SerializedName("licenseAccountId")
    open var licenseAccountId:String? = null

    @DataMember(Name="domain")
    @SerializedName("domain")
    open var domain:String? = null

    @DataMember(Name="signature")
    @SerializedName("signature")
    open var signature:String? = null

    @DataMember(Name="message")
    @SerializedName("message")
    open var message:String? = null
}

@DataContract
open class InstallationLicenseStatusDto
{
    @DataMember(Name="storedMode")
    @SerializedName("storedMode")
    open var storedMode:String? = null

    @DataMember(Name="effectiveMode")
    @SerializedName("effectiveMode")
    open var effectiveMode:String? = null

    @DataMember(Name="isProduction")
    @SerializedName("isProduction")
    open var isProduction:Boolean? = null

    @DataMember(Name="graceDaysLeft")
    @SerializedName("graceDaysLeft")
    open var graceDaysLeft:Int? = null

    @DataMember(Name="graceUntilUtc")
    @SerializedName("graceUntilUtc")
    open var graceUntilUtc:Date? = null

    @DataMember(Name="lastProvenAtUtc")
    @SerializedName("lastProvenAtUtc")
    open var lastProvenAtUtc:Date? = null

    @DataMember(Name="lastHeartbeatAtUtc")
    @SerializedName("lastHeartbeatAtUtc")
    open var lastHeartbeatAtUtc:Date? = null

    @DataMember(Name="installationDomain")
    @SerializedName("installationDomain")
    open var installationDomain:String? = null

    @DataMember(Name="licensedDomain")
    @SerializedName("licensedDomain")
    open var licensedDomain:String? = null

    @DataMember(Name="hostKind")
    @SerializedName("hostKind")
    open var hostKind:String? = null

    @DataMember(Name="isTrialLicense")
    @SerializedName("isTrialLicense")
    open var isTrialLicense:Boolean? = null

    @DataMember(Name="licenseExpireUtc")
    @SerializedName("licenseExpireUtc")
    open var licenseExpireUtc:Date? = null

    @DataMember(Name="message")
    @SerializedName("message")
    open var message:String? = null
}

open class ServiceUserApiKeyDto
{
    open var id:Int? = null
    open var name:String? = null
    open var visibleKey:String? = null
    open var scopes:ArrayList<String> = ArrayList<String>()
    open var createdDate:Date? = null
    open var expiryDate:Date? = null
    open var cancelledDate:Date? = null
    open var active:Boolean? = null
}

@DataContract
open class MembershipTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:MembershipTriggerType? = null
}

open class GetTriggerResponse : ResponseBase()
{
}

@DataContract
open class MembershipTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:MembershipTriggerType? = null

    @DataMember
    open var destinationIds:ArrayList<String>? = null
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

open class PasskeySettingsDto
{
    open var enabled:Boolean? = null
    open var codeTtlMinutes:Int? = null
    open var maxCredentialsPerUser:Int? = null
    open var recoveryCodeCount:Int? = null
    open var generateRecoveryCodesAtSignup:Boolean? = null
    open var authenticatorAttachment:String? = null
    open var allowMagicLinkRecovery:Boolean? = null
    open var refreshTokenTtlDays:Int? = null
    open var rpId:String? = null
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
open class MembershipAuthorizationViewDto
{
    @DataMember
    open var emailPreferences:MembershipEmailPreferencesDto? = null

    @DataMember
    open var userRegistersAsRole:String? = null

    @DataMember
    open var guestRegistersAsRole:String? = null

    @DataMember
    open var allowedRegisterRoles:ArrayList<String>? = null

    @DataMember
    open var allowedProviderRegisterRoles:ArrayList<String>? = null

    @DataMember
    open var resetPasswordTokenExpiration:Int? = null

    @DataMember
    open var invitationExpiration:Int? = null

    @DataMember
    open var emailVerificationExpiration:Int? = null

    @DataMember
    open var deactivationExpiration:Int? = null

    @DataMember
    open var defaultSubscribeToNews:Boolean? = null

    @DataMember
    open var passwordComplexity:PasswordComplexityDto? = null
}

@DataContract
open class MembershipAuthenticationViewDto
{
    @DataMember
    open var credentialsSettings:MembershipCredentialsSettingsDto? = null

    @DataMember
    open var flows:ArrayList<String> = ArrayList<String>()
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

open class TaxonomyTreeDto
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var taxonomyName:String? = null

    @DataMember
    open var taxonomySlug:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var children:ArrayList<TaxonomyTreeDto>? = null

    @DataMember
    open var terms:ArrayList<TermTreeDto>? = null
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

open class TermTreeDto
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

    @DataMember
    open var children:ArrayList<TermTreeDto>? = null
}

@DataContract
open class AppliedTaxonomyDto
{
    @DataMember
    open var catalogId:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var slug:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var action:String? = null

    @DataMember
    open var termsCreated:Int? = null
}

@DataContract
open class AppliedCollectionDto
{
    @DataMember
    open var entity:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var action:String? = null

    @DataMember
    open var published:Boolean? = null

    @DataMember
    open var linkedFields:ArrayList<String> = ArrayList<String>()
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

    @DataMember
    open var description:String? = null
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

open class CollectionIndexDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var keys:ArrayList<CollectionIndexKeyDto> = ArrayList<CollectionIndexKeyDto>()
}

@DataContract
open class SeedCollectionRecordsResultDto
{
    @DataMember
    open var insertOrder:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var report:ArrayList<SeedCollectionReportItemDto> = ArrayList<SeedCollectionReportItemDto>()
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

@DataContract
open class FlexTierDto
{
    @DataMember
    open var code:String? = null

    @DataMember
    open var step:Int? = null

    @DataMember
    open var displayName:String? = null
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

open class CollectionImportDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var schema:SchemaRefDto? = null

    @DataMember
    open var file:FileResourceRefDto? = null

    @DataMember
    open var errorFile:FileResourceRefDto? = null

    @DataMember
    open var delimiter:String? = null

    @DataMember
    open var hasHeader:Boolean? = null

    @DataMember
    open var status:String? = null

    @DataMember
    open var totalRows:Long? = null

    @DataMember
    open var totalImported:Long? = null

    @DataMember
    open var totalErrors:Long? = null

    @DataMember
    open var failureReason:String? = null

    @DataMember
    open var mapping:ArrayList<ImportColumnMappingDto>? = null

    @DataMember
    open var createdOn:Date? = null

    @DataMember
    open var startedOn:Date? = null

    @DataMember
    open var completedOn:Date? = null
}

open class ImportUploadTargetDto
{
    @DataMember
    open var url:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var file:FileResourceRefDto? = null
}

open class ImportFileAnalysisDto
{
    @DataMember
    open var file:FileResourceRefDto? = null

    @DataMember
    open var columns:ArrayList<ImportFileColumnDto> = ArrayList<ImportFileColumnDto>()

    @DataMember
    open var sampleRowCount:Int? = null
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
open class FilesTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:FilesTriggerType? = null
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
open class NotificationModuleDisableDependenciesDto
{
    @DataMember
    open var triggers:ArrayList<NotificationModuleDependencyItemDto> = ArrayList<NotificationModuleDependencyItemDto>()

    @DataMember
    open var schedulerTasks:ArrayList<NotificationModuleDependencyItemDto> = ArrayList<NotificationModuleDependencyItemDto>()

    @DataMember
    open var inFlightCampaigns:ArrayList<NotificationModuleDependencyItemDto> = ArrayList<NotificationModuleDependencyItemDto>()

    @DataMember
    open var membershipSettings:ArrayList<NotificationModuleDependencyItemDto> = ArrayList<NotificationModuleDependencyItemDto>()
}

@DataContract
open class TestEmailValidationItemDto
{
    @DataMember
    open var address:String? = null

    @DataMember
    open var verdict:String? = null

    @DataMember
    open var reason:String? = null

    @DataMember
    open var score:BigDecimal? = null
}

open class EmailTemplateListProjection : TemplateListProjection()
{
    open var hasAttachments:Boolean? = null
    open var languages:IReadOnlyList<String>? = null
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
    open var signatures:IList<EmailSignatureDto>? = null
    open var footers:IList<EmailFooterDto>? = null
}

@DataContract
open class DomainHealthRecordItemDto
{
    @DataMember
    open var record:String? = null

    @DataMember
    open var value:String? = null
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
    open var validationIntegrationId:String? = null

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
    open var errors:ArrayList<ErrorDto>? = null
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
open class SmsTemplateListProjection : TemplateListProjection()
{
}

open class SmsSettings : IBindableContract
{
}

open class SmsIntegrationDto : IntegrationDto()
{
    open var provider:SmsProvider? = null
}

open class SmsIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:SmsProvider? = null
}

@DataContract
open class SmsCampaignDto : CampaignDto()
{
    @DataMember
    open var recipients:SmsCampaignDeliverySettingsDto? = null

    @DataMember
    open var template:SmsTemplateDto? = null
}

@DataContract
open class SmsCampaignBatchDto : CampaignBatchDto()
{
    @DataMember
    open var recipients:SmsRecipientsDto? = null
}

@DataContract
open class SmsCampaignBatchNotificationDto : CampaignBatchNotificationDto()
{
    @DataMember
    open var recipients:SmsRecipientsDto? = null

    @DataMember
    open var content:SmsMessageContentDto? = null
}

@DataContract
open class MarketplaceListingProjection : IHasViewId
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
    open var iconUrl:String? = null

    @DataMember
    open var isOfficial:Boolean? = null

    @DataMember
    open var tags:IReadOnlyList<String>? = null

    @DataMember
    open var functionCount:Int? = null
}

@DataContract
open class MarketplaceIntegrationListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var integrationName:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var listingViewId:String? = null

    @DataMember
    open var vendor:String? = null

    @DataMember
    open var category:MarketplaceCategory? = null

    @DataMember
    open var transport:MarketplaceTransport? = null

    @DataMember
    open var lastIntegrationTestAtUtc:Date? = null

    @DataMember
    open var lastIntegrationTestSucceeded:Boolean? = null

    @DataMember
    open var lastIntegrationTestErrors:IReadOnlyList<String>? = null

    @DataMember
    open var humanDeliveryConfirmedAtUtc:Date? = null

    @DataMember
    open var requiresHumanDeliveryConfirmation:Boolean? = null
}

@DataContract
open class MarketplaceFunctionProjection : IHasViewId
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
    open var isEnabled:Boolean? = null

    @DataMember
    open var mappingCount:Int? = null
}

open class CodeIntegrationDto : IntegrationDto()
{
    open var provider:CodeProvider? = null
}

open class CodeIntegrationListProjection : IntegrationListProjection()
{
    @DataMember
    open var provider:CodeProvider? = null
}

@DataContract
open class PushTemplateListProjection : TemplateListProjection()
{
}

open class PushSettings
{
    open var marketingTags:ArrayList<TagDefinitionDto>? = null
    open var transactionalTags:ArrayList<TagDefinitionDto>? = null
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
open class PushCampaignDto : CampaignDto()
{
    @DataMember
    open var recipients:PushCampaignDeliverySettingsDto? = null

    @DataMember
    open var template:PushTemplateDto? = null
}

@DataContract
open class PushCampaignBatchDto : CampaignBatchDto()
{
    @DataMember
    open var recipients:PushRecipientsDto? = null
}

@DataContract
open class PushCampaignBatchNotificationDto : CampaignBatchNotificationDto()
{
    @DataMember
    open var recipients:PushRecipientsDto? = null

    @DataMember
    open var content:PushMessageContentDto? = null
}

open class PaymentsWebhookLogEntry
{
    open var integrationId:String? = null
    open var source:String? = null
    open var eventName:String? = null
    open var providerEventId:String? = null
    open var statusCode:Int? = null
    open var description:String? = null
    open var receivedOn:Date? = null
}

@DataContract
open class PaymentTriggerDto : TriggerDto()
{
    @DataMember
    @SerializedName("when") open var When:PaymentTriggerType? = null

    @DataMember
    open var integrations:ArrayList<String>? = null

    @DataMember
    open var events:ArrayList<String>? = null
}

@DataContract
open class PaymentTriggerProjectionList : TriggerProjectionList()
{
    @DataMember
    @SerializedName("type") open var Type:PaymentTriggerType? = null

    @DataMember
    open var integrations:ArrayList<String>? = null

    @DataMember
    open var events:ArrayList<String>? = null
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

@DataContract
open class TenantLogEntryDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var timestamp:Date? = null

    @DataMember
    open var module:String? = null

    @DataMember
    open var level:String? = null

    @DataMember
    open var eventCode:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var message:String? = null

    @DataMember
    open var correlationId:String? = null

    @DataMember
    open var traceId:String? = null

    @DataMember
    open var spanId:String? = null

    @DataMember
    open var meta:IReadOnlyDictionary<String, String>? = null
}

open class AiToolManifestItem
{
    open var name:String? = null
    open var description:String? = null
    open var toolsets:ArrayList<String> = ArrayList<String>()
    open var requiresConfirmation:Boolean? = null
    open var parameters:ArrayList<AiToolManifestParameter> = ArrayList<AiToolManifestParameter>()
}

open class ChatModelOption
{
    open var llmIntegrationId:String? = null
    open var kind:String? = null
    open var provider:String? = null
    open var model:String? = null
    open var label:String? = null
    open var isDefault:Boolean? = null
    open var isAuto:Boolean? = null
    open var contextWindow:Int? = null
}

open class ChatMemoryNote
{
    open var id:String? = null
    open var kind:String? = null
    open var text:String? = null
    open var projectId:String? = null
    open var createdAtUtc:Date? = null
}

open class ChatSessionListItem
{
    open var sessionId:String? = null
    open var profile:String? = null
    open var projectId:String? = null
    open var env:String? = null
    open var title:String? = null
    open var updatedAtUtc:Date? = null
    open var isArchived:Boolean? = null
    open var isPinned:Boolean? = null
}

open class AiChatEntryWireDto
{
    open var kind:String? = null
    open var id:String? = null
    open var seq:Long? = null
    open var atUtc:Date? = null
    open var refEntryId:String? = null
    open var workItemId:String? = null
    open var feedback:String? = null
    open var feedbackAtUtc:Date? = null
    open var feedbackByUserAuthId:String? = null
}

open class ProjectBriefSnapshotWireDto
{
    open var projectId:String? = null
    open var upToSeq:Long? = null
    open var atUtc:Date? = null
    open var requirements:ArrayList<ProjectBriefRequirementWireDto> = ArrayList<ProjectBriefRequirementWireDto>()
    open var decisions:ArrayList<ProjectBriefDecisionWireDto> = ArrayList<ProjectBriefDecisionWireDto>()
    open var openAssumptions:ArrayList<ProjectBriefAssumptionWireDto> = ArrayList<ProjectBriefAssumptionWireDto>()
    open var summary:String? = null
}

open class ProjectBriefEventWireDto
{
    open var id:String? = null
    open var projectId:String? = null
    open var seq:Long? = null
    open var atUtc:Date? = null
    open var kind:String? = null
    open var requirementId:String? = null
    open var supersedesEventId:String? = null
    open var text:String? = null
    open var confidence:Double? = null
    open var sources:ArrayList<ProjectBriefSourceWireDto> = ArrayList<ProjectBriefSourceWireDto>()
    open var origin:String? = null
    open var satisfiedBy:ArrayList<ProjectBriefSatisfiedByWireDto> = ArrayList<ProjectBriefSatisfiedByWireDto>()
}

open class WorkItemWireDto
{
    open var id:String? = null
    open var projectId:String? = null
    open var status:String? = null
    open var goal:String? = null
    open var notInScope:ArrayList<String> = ArrayList<String>()
    open var scopeRequirementIds:ArrayList<String> = ArrayList<String>()
    open var difficulty:Int? = null
    open var difficultyReason:String? = null
    open var planEntryRefs:ArrayList<WorkItemEntryRefWireDto> = ArrayList<WorkItemEntryRefWireDto>()
    open var runRefs:ArrayList<WorkItemRunRefWireDto> = ArrayList<WorkItemRunRefWireDto>()
    open var artifacts:ArrayList<WorkItemArtifactWireDto> = ArrayList<WorkItemArtifactWireDto>()
    open var movedOut:ArrayList<WorkItemMovedOutWireDto> = ArrayList<WorkItemMovedOutWireDto>()
    open var needsYou:ArrayList<WorkItemNeedsYouWireDto> = ArrayList<WorkItemNeedsYouWireDto>()
    open var openQuestions:ArrayList<WorkItemOpenQuestionWireDto> = ArrayList<WorkItemOpenQuestionWireDto>()
    open var sessionIds:ArrayList<String> = ArrayList<String>()
    open var parentId:String? = null
    open var children:ArrayList<String> = ArrayList<String>()
    open var summaryEntryRef:WorkItemEntryRefWireDto? = null
    open var createdBy:String? = null
    open var createdAtUtc:Date? = null
    open var updatedAtUtc:Date? = null
    open var doneVerdict:String? = null
    open var doneConditions:ArrayList<WorkItemDoneConditionWireDto> = ArrayList<WorkItemDoneConditionWireDto>()
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

interface IVirtualFile
{
    var virtualPathProvider:IVirtualPathProvider?
    var extension:String?
    var length:Long?
}

@Flags()
enum class CacheControl(val value:Int)
{
    @SerializedName("0") None(0),
    @SerializedName("1") Public(1),
    @SerializedName("2") Private(2),
    @SerializedName("4") MustRevalidate(4),
    @SerializedName("8") NoCache(8),
    @SerializedName("16") NoStore(16),
    @SerializedName("32") NoTransform(32),
    @SerializedName("64") ProxyRevalidate(64),
}

interface IContentTypeWriter
{
}

interface IRequest
{
    var originalRequest:Object?
    var response:IResponse?
    var operationName:String?
    var verb:String?
    var requestAttributes:RequestAttributes?
    var requestPreferences:IRequestPreferences?
    var dto:Object?
    var contentType:String?
    var isLocal:Boolean?
    var userAgent:String?
    var cookies:HashMap<String,Cookie>?
    var responseContentType:String?
    var hasExplicitResponseContentType:Boolean?
    var items:HashMap<String,Object>?
    var headers:NameValueCollection?
    var queryString:NameValueCollection?
    var formData:NameValueCollection?
    var useBufferedStream:Boolean?
    var rawUrl:String?
    var absoluteUri:String?
    var userHostAddress:String?
    var remoteIp:String?
    var authorization:String?
    var isSecureConnection:Boolean?
    var acceptTypes:ArrayList<String>?
    var pathInfo:String?
    var originalPathInfo:String?
    var inputStream:InputStream?
    var contentLength:Long?
    var files:ArrayList<IHttpFile>?
    var urlReferrer:Uri?
    var requestAborted:CancellationToken?
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

open class ResolvedResourceEntry
{
    open var ref:ResourceRefDto? = null
    open var status:ResolvedRefStatus? = null
    open var resolved:Object? = null
    open var diagnostic:String? = null
}

@DataContract
open class UserDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var projectId:String? = null

    @DataMember
    open var primaryEmail:String? = null

    @DataMember
    open var primaryPhone:String? = null

    @DataMember
    open var displayName:String? = null

    @DataMember
    open var firstName:String? = null

    @DataMember
    open var lastName:String? = null

    @DataMember
    open var fullName:String? = null

    @DataMember
    open var company:String? = null

    @DataMember
    open var locale:String? = null

    @DataMember
    open var timeZone:String? = null

    @DataMember
    open var gender:String? = null

    @DataMember
    open var birthDate:Long? = null

    @DataMember
    open var addressLine1:String? = null

    @DataMember
    open var addressLine2:String? = null

    @DataMember
    open var country:String? = null

    @DataMember
    open var city:String? = null

    @DataMember
    open var state:String? = null

    @DataMember
    open var postalCode:String? = null

    @DataMember
    open var tags:ArrayList<String>? = null

    @DataMember
    open var roles:ArrayList<String>? = null

    @DataMember
    open var lifecycle:String? = null

    @DataMember
    open var sourceOfCreation:String? = null

    @DataMember
    open var mergedIntoContactId:String? = null

    @DataMember
    open var createdOn:Date? = null

    @DataMember
    open var modifiedOn:Date? = null

    @DataMember
    open var auths:ArrayList<AuthDto>? = null

    @DataMember
    open var marketingPreferences:HashMap<String,ChannelSubscriptionStateDto>? = null
}

open class ProjectComplianceDto
{
    open var regimes:ArrayList<String> = ArrayList<String>()
    open var consentPurposes:ArrayList<ConsentPurposeDto> = ArrayList<ConsentPurposeDto>()
    open var retentionWindows:ArrayList<RetentionWindowDto> = ArrayList<RetentionWindowDto>()
}

open class LegalHoldDto
{
    open var id:String? = null
    open var subjectKind:String? = null
    open var subjectId:String? = null
    open var reason:String? = null
    open var placedAt:Date? = null
    open var placedBy:String? = null
    open var releasedAt:Date? = null
    open var releasedBy:String? = null
}

open class DsarRequestDto
{
    open var id:String? = null
    open var subjectKind:String? = null
    open var subjectId:String? = null
    open var status:String? = null
    open var receivedAt:Date? = null
    open var slaDeadline:Date? = null
    open var autoApproveAt:Date? = null
    open var decidedAt:Date? = null
    open var decidedBy:String? = null
    open var rejectionReason:String? = null
}

open class ComplianceAuditEntryDto
{
    open var id:String? = null
    open var timestamp:Date? = null
    open var action:String? = null
    open var subjectKind:String? = null
    open var subjectId:String? = null
    open var reason:String? = null
    open var metadata:HashMap<String,String>? = null
}

open class AccountComplianceDto
{
    open var dsarMode:String? = null
    open var dsarDelayDays:Int? = null
    open var autoForwardAdvisories:Boolean? = null
    open var securityContact:String? = null
}

@DataContract
open class SupportCaseDetailDto
{
    @DataMember
    @SerializedName("case") open var Case:SupportCaseDto? = null

    @DataMember
    open var messages:ArrayList<SupportCaseMessageDto> = ArrayList<SupportCaseMessageDto>()
}

@DataContract
open class SupportCaseListProjection : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var projectId:String? = null

    @DataMember
    open var kind:SupportCaseKind? = null

    @DataMember
    open var severity:SupportCaseSeverity? = null

    @DataMember
    open var status:SupportCaseStatus? = null

    @DataMember
    open var customerStatus:SupportCustomerStatus? = null

    @DataMember
    open var subject:String? = null

    @DataMember
    open var openedOn:Long? = null

    @DataMember
    open var messageCount:Int? = null

    @DataMember
    open var lastMessageOn:Long? = null
}

@DataContract
open class DiagnosticPackDescriptorDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var version:Int? = null

    @DataMember
    open var summary:String? = null

    @DataMember
    open var steps:ArrayList<DiagnosticPackStepDescriptorDto> = ArrayList<DiagnosticPackStepDescriptorDto>()
}

@DataContract
open class DiagnosticPackRunResultDto
{
    @DataMember
    open var packName:String? = null

    @DataMember
    open var packVersion:Int? = null

    @DataMember
    open var caseId:String? = null

    @DataMember
    open var steps:ArrayList<DiagnosticPackStepResultDto> = ArrayList<DiagnosticPackStepResultDto>()
}

@DataContract
open class DiagnosticEchoDto
{
    @DataMember
    open var containerName:String? = null

    @DataMember
    open var isManagedService:Boolean? = null

    @DataMember
    open var apiVersion:String? = null

    @DataMember
    open var hubVersion:String? = null

    @DataMember
    open var release:String? = null

    @DataMember
    open var runtime:String? = null

    @DataMember
    open var hubUrl:String? = null

    @DataMember
    open var apiUrl:String? = null

    @DataMember
    open var licensePresent:Boolean? = null

    @DataMember
    open var regions:ArrayList<DiagnosticEchoRegionDto>? = null
}

@DataContract
open class DiagnosticEventsPageDto
{
    @DataMember
    open var stream:String? = null

    @DataMember
    open var from:Long? = null

    @DataMember
    open var count:Int? = null

    @DataMember
    open var hasMore:Boolean? = null

    @DataMember
    open var nextFrom:Long? = null

    @DataMember
    open var items:ArrayList<DiagnosticEventItemDto> = ArrayList<DiagnosticEventItemDto>()
}

@DataContract
open class DiagnosticLogsResponse
{
    @DataMember
    open var list:PaginatedResponse<TenantLogEntryDto>? = null
}

@DataContract
open class DiagnosticRedisInspectDto
{
    @DataMember
    open var keyPattern:String? = null

    @DataMember
    open var cacheKey:String? = null

    @DataMember
    open var isList:Boolean? = null

    @DataMember
    open var item:HashMap<String,Object>? = null

    @DataMember
    open var listItems:ArrayList<DiagnosticRedisListItemDto>? = null

    @DataMember
    open var hasMore:Boolean? = null

    @DataMember
    open var startingAfter:String? = null
}

@DataContract
open class DiagnosticHealthCheckDto
{
    @DataMember
    open var checkId:String? = null

    @DataMember
    open var isHealthy:Boolean? = null

    @DataMember
    open var statusCode:Int? = null

    @DataMember
    open var detail:String? = null
}

@DataContract
enum class EmailProvider
{
    Smtp,
    SendGrid,
    MailGun,
    AwsSes,
    Fake,
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

enum class MailGunRegion
{
    Us,
    Eu,
}

enum class EmailCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    Email,
    Collection,
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
    OnUserCreated,
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

enum class DatabaseProvider
{
    MongoDbConnectionString,
    CodeMashMongoDbAtlasFlexManaged,
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

enum class AwsS3IntegrationType
{
    Iam,
    CrossAccountRole,
}

enum class LoggingProvider
{
    Console,
    NorbixLogging,
    DataDog,
    NewRelic,
    Sentry,
    GrafanaLoki,
    Axiom,
    ElasticCloud,
    AwsCloudWatch,
    GcpCloudLogging,
    AzureMonitorLogs,
    GenericHttp,
    Kafka,
    Amqp,
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

enum class AwsS3LoggingIntegrationType
{
    Iam,
    CrossAccountRole,
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

open class OAuthModeConfig
{
    open var name:DisplayName? = null
    open var callbackUrl:Uri? = null
    open var logoutUrl:Uri? = null
    open var failureRedirectUrl:Uri? = null
    open var roleName:RoleName? = null
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
    Fake,
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

enum class AwsLambdaIntegrationType
{
    Iam,
    CrossAccountRole,
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
    NorbixHosted,
}

interface ILlmApiKeyRequest
{
    var apiKey:String?
}

enum class McpProvider
{
    Docker,
    Obsidian,
    GoogleCalendar,
    Stripe,
    GitHub,
    MongoDb,
    Playwright,
    BraveSearch,
}

enum class McpTransport
{
    Sse,
    HttpStream,
    Stdio,
}

enum class NotificationMedium
{
    Email,
    Sms,
    Push,
}

@DataContract
open class TemplateDto : IHasViewId, IHasDatabaseId
{
    @DataMember
    override var id:String? = null

    @DataMember
    override var viewId:String? = null

    @DataMember
    open var templateName:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var communicationChannel:CommunicationChannel? = null

    @DataMember
    open var medium:NotificationMedium? = null

    @DataMember
    open var isActive:Boolean? = null

    @DataMember
    open var tags:ArrayList<String>? = null
}

interface IHasViewId
{
    var viewId:String?
}

interface IHasDatabaseId
{
    var id:String?
}

interface IBindableContract
{
}

interface IHasRazorTemplateCode
{
}

enum class SystemEmailTemplateTheme
{
    Text,
    Branded,
    Creative,
}

open class EmailCampaignDeliverySettingsDto
{
    @DataMember
    open var recipientsSourceType:EmailCampaignRecipientsSourceTypes? = null

    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null

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
    SseCall,
    Marketplace,
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
    open var destinationIds:ArrayList<String>? = null

    @DataMember
    open var eventName:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var includeRawPayload:Boolean? = null

    @DataMember
    open var mappedTokens:ArrayList<TokenMappingDto>? = null
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
    AccountUsers,
}

@DataContract
open class PushDeviceDeliveryTokenDto
{
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

enum class IntegrationStatus
{
    Unknown,
    Pending,
    Provisioning,
    Active,
    Failed,
    Deprovisioning,
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
    Fake,
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
    open var env:String? = null
    open var lastIntegrationTestAtUtc:Date? = null
    open var lastIntegrationTestSucceeded:Boolean? = null
    open var lastIntegrationTestErrors:IReadOnlyList<String>? = null
    open var humanDeliveryConfirmedAtUtc:Date? = null
    open var requiresHumanDeliveryConfirmation:Boolean? = null
}

@DataContract
open class MarketplaceFieldDefinitionDto
{
    @DataMember
    open var key:String? = null

    @DataMember
    open var label:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var documentationUrl:String? = null

    @DataMember
    @SerializedName("type") open var Type:MarketplaceFieldType? = null

    @DataMember
    open var isRequired:Boolean? = null

    @DataMember
    open var defaultValue:String? = null

    @DataMember
    open var placeholder:String? = null

    @DataMember
    open var validationPattern:String? = null

    @DataMember
    open var allowedValues:IReadOnlyList<String>? = null
}

@DataContract
open class MarketplaceHttpRequestSpecDto
{
    @DataMember
    open var method:String? = null

    @DataMember
    open var pathTemplate:String? = null

    @DataMember
    open var parameters:IReadOnlyList<MarketplaceParameterSpecDto>? = null

    @DataMember
    open var contentType:String? = null
}

open class AiChatEntryAttachmentWireDto
{
    open var id:String? = null
    open var name:String? = null
}

open class AiChatEntrySourceWireDto
{
    open var kind:String? = null
    open var requirementId:String? = null
    open var sessionId:String? = null
    open var entryId:String? = null
    open var entrySeq:Long? = null
    open var artifactId:String? = null
    open var label:String? = null
    open var step:Int? = null
}

open class AiChatQuestionWireDto
{
    open var id:String? = null
    open var text:String? = null
    open var options:ArrayList<AiChatQuestionOptionWireDto> = ArrayList<AiChatQuestionOptionWireDto>()
    @SerializedName("default") open var Default:String? = null
    open var allowFreeText:Boolean? = null
}

open class AiChatGateResultWireDto
{
    @SerializedName("class") open var Class:String? = null
    open var reason:String? = null
    open var affectedRequirementIds:ArrayList<String> = ArrayList<String>()
}

open class AiChatPlanStepWireDto
{
    open var n:Int? = null
    open var tool:String? = null
    open var title:String? = null
    open var goal:String? = null
    open var inputs:AiChatPlanStepInputsWireDto? = null
    open var dependsOn:ArrayList<Int> = ArrayList<Int>()
    open var replaces:Int? = null
    open var done:ArrayList<AiChatPlanStepDoneCheckWireDto> = ArrayList<AiChatPlanStepDoneCheckWireDto>()
    open var loop:AiChatPlanStepLoopWireDto? = null
    open var difficulty:Int? = null
}

open class AiChatStepLogLineWireDto
{
    open var seq:Int? = null
    open var tool:String? = null
    open var agent:String? = null
    open var status:String? = null
    open var detail:String? = null
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

open class NorbixRegion
{
    open var code:String? = null
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

enum class ResourceRefKind
{
    Contact,
    Document,
    File,
    PaymentCustomer,
    Order,
    Payment,
    Product,
    Integration,
}

enum class ResourceSource
{
    Norbix,
    Stripe,
    Shopify,
    PayPal,
    Adyen,
    Mollie,
    Paddle,
    LemonSqueezy,
    AppleInApp,
    GoogleInApp,
    AuthorizeNet,
    Braintree,
    CheckOutCom,
    WooCommerce,
    Magento,
    Worldpay,
}

open class ResourceRef
{
    open var projectId:ProjectId? = null
    open var integrationId:IntegrationId? = null
    open var kind:ResourceRefKind? = null
}

open class Permission
{
    open var sid:String? = null
    open var effect:PermissionEffect? = null
    open var actions:ArrayList<PermissionAction> = ArrayList<PermissionAction>()
    open var resources:ArrayList<ResourcePattern> = ArrayList<ResourcePattern>()
}

open class BillingPeriod
{
    open var year:Int? = null
    open var month:Int? = null
    open var startUtc:Date? = null
    open var endExclusiveUtc:Date? = null
    open var lastInstantUtc:Date? = null
}

open class AtlasClusterChargeRecord
{
    open var atlasProjectId:String? = null
    open var atlasClusterName:String? = null
    open var cents:Long? = null
}

enum class UsageIngestionFailureReason(val value:Int)
{
    UnknownCustomer(1),
    MeterNotFound(2),
    ValidationFailed(3),
    ImportSetFailed(4),
}

open class Integration : IIntegrationIdentification, IHasDomainEntityId
{
    override var integrationId:IntegrationId? = null
    open var env:Env? = null
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

open class TriggerAction
{
    @SerializedName("type") open var Type:TriggerActionType? = null
    open var integrationId:IntegrationId? = null
}

@DataContract
open class TemplateCode
{
}

open class SchemaListColumnDto
{
    @DataMember
    open var field:String? = null
}

open class SchemaListSortDto
{
    @DataMember
    open var field:String? = null

    @DataMember
    open var order:Int? = null
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

open class AuthUserName
{
    open var value:String? = null
}

enum class AuthType
{
    Service,
    Email,
    UserName,
    Phone,
    Guest,
    Social,
}

open class Registration
{
    open var registrationInformation:AccessInformation? = null
}

open class Login
{
    open var needChangePasswordOnNextLogin:Boolean? = null
    open var lastAccessInformation:AccessInformation? = null
}

enum class AuthStatus(val value:Int)
{
    Registered(0),
    PendingValidation(2),
    Active(8),
    Unregistered(16),
    Suspended(32),
    InActive(64),
    Blocked(128),
}

open class PushDevices : ArrayList<PushDevice>()
{
}

open class UserRef : ResourceRef()
{
    override var kind:ResourceRefKind? = null
    open var userId:UserId? = null
}

open class Phone
{
    open var value:String? = null
}

@DataContract
open class FirstName
{
    @DataMember
    open var value:String? = null
}

@DataContract
open class LastName
{
    @DataMember
    open var value:String? = null
}

open class FullName
{
    open var firstName:FirstName? = null
    open var midName:MidName? = null
    open var lastName:LastName? = null
    open var title:String? = null
}

open class Address
{
    open var city:City? = null
    open var country:Country? = null
    open var addressLine1:AddressLine? = null
    open var addressLine2:AddressLine? = null
    open var postalCode:PostalCode? = null
    open var state:CountryState? = null
}

enum class Gender
{
    Male,
    Female,
    Other,
}

open class UserMarketingPreferences
{
    open var blockAllMarketingMessages:Boolean? = null
    open var blockedTags:HashMap<DeliveryChannel,HashSet<Tag>>? = null
    open var blockReasons:ArrayList<MarketingBlockReason>? = null
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
enum class EmailValidationProvider(val value:Int)
{
    ZeroBounce(1),
    NeverBounce(2),
    Bouncer(3),
    MailgunValidate(4),
}

@DataContract
open class EmailMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var subject:String? = null

    @DataMember
    open var body:EmailBodyDto? = null

    @DataMember
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null
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

    @DataMember
    open var env:Env? = null
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
open class SmsMessageContent
{
    @DataMember(Order=1)
    open var title:SmsTitle? = null

    @DataMember(Order=2)
    open var body:SmsBody? = null
}

enum class MarketplaceTokenResolverKind
{
    Static,
    Request,
    Project,
    Initiator,
    Custom,
    IntegrationConfig,
    IntegrationSecret,
}

enum class MarketplaceSecretValueFormat
{
    Raw,
    Bearer,
    Basic,
    Prefixed,
}

enum class MarketplaceIntegrationTransport
{
    Mcp,
    Rest,
    Code,
    Internal,
    Sdk,
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

open class MarketplaceTokenMapping
{
    open var token:String? = null
    open var resolver:MarketplaceTokenResolver? = null
    open var value:String? = null
    open var secretKeys:IReadOnlyList<String>? = null
    open var format:SecretValueFormat? = null
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

enum class ResourceKindDto
{
    Contact,
    Document,
    File,
    PaymentCustomer,
    Order,
    Payment,
    Product,
    Integration,
}

enum class CaseResolutionFixKind
{
    CodeFix,
    ConfigChange,
    CustomerInstruction,
    KnownLimitation,
    Duplicate,
}

enum class SupportMessageAuthorKind
{
    Customer,
    Staff,
    Ai,
    System,
}

open class PublicPasswordPolicyDto
{
    open var minLength:Int? = null
    open var maxLength:Int? = null
    open var minNumbers:Int? = null
    open var minUpper:Int? = null
    open var minLower:Int? = null
    open var minSpecial:Int? = null
    open var allowedSpecial:String? = null
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

@DataContract
open class UsageBillingPeriodDto
{
    @DataMember
    open var period:String? = null

    @DataMember
    open var totalCents:Long? = null

    @DataMember
    open var perCluster:ArrayList<UsageBillingClusterChargeDto> = ArrayList<UsageBillingClusterChargeDto>()

    @DataMember
    open var recordedAtUtc:Date? = null
}

@DataContract
open class UsageBillingIngestionFailureDto
{
    @DataMember
    open var reason:String? = null

    @DataMember
    open var period:String? = null

    @DataMember
    open var stripeEventId:String? = null

    @DataMember
    open var message:String? = null

    @DataMember
    open var reportedAtUtc:Date? = null
}

@DataContract
open class PromotionItemDto
{
    @DataMember
    @SerializedName("type") open var Type:String? = null

    @DataMember
    open var id:String? = null
}

@DataContract
open class PromotionBlockerDto
{
    @DataMember
    open var contentType:String? = null

    @DataMember
    open var contentId:String? = null

    @DataMember
    open var refKind:String? = null

    @DataMember
    open var unresolvedRef:String? = null
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
open class AuthenticationFlowSummaryDto
{
    @DataMember
    @SerializedName("type") open var Type:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var passwordComplexity:AuthenticationFlowPasswordPolicyDto? = null
}

@DataContract
open class DatabaseDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var triggers:ArrayList<SchemaTriggerDto>? = null

    @DataMember
    open var defaultIntegrationViewIds:HashMap<String,String> = HashMap<String,String>()
}

@DataContract
open class EmailDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var defaultIntegrationViewIds:HashMap<String,String> = HashMap<String,String>()
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

    @DataMember
    open var requireEmailValidation:Boolean? = null
}

@DataContract
open class LoggingDto
{
    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var isEstablished:Boolean? = null
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
    open var defaultIntegrationViewIds:HashMap<String,String> = HashMap<String,String>()

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
    open var defaultIntegrationViewIds:HashMap<String,String> = HashMap<String,String>()
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
    open var defaultIntegrationViewIds:HashMap<String,String> = HashMap<String,String>()
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
    open var blockedTags:HashMap<String,HashSet<String>>? = null
    open var blockReasons:ArrayList<MarketingBlockReason>? = null
    open var extraMetadata:String? = null
    open var notes:String? = null
}

open class PermissionDto
{
    open var sid:String? = null
    open var effect:PermissionEffect? = null
    open var actions:ArrayList<String> = ArrayList<String>()
    open var resources:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class LicenseDomainDnsRecordDto
{
    @DataMember
    open var host:String? = null

    @DataMember
    open var recordType:String? = null

    @DataMember
    open var resolved:Boolean? = null

    @DataMember
    open var required:Boolean? = null
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

@DataContract
open class MembershipEmailPreferencesDto
{
    @DataMember
    open var registrationViaEmail:MembershipEmailActionSettingsDto? = null

    @DataMember
    open var verificationViaEmail:MembershipEmailActionSettingsDto? = null

    @DataMember
    open var passwordResetViaEmail:MembershipEmailActionSettingsDto? = null

    @DataMember
    open var invitationViaEmail:MembershipEmailActionSettingsDto? = null

    @DataMember
    open var deactivationViaEmail:MembershipEmailActionSettingsDto? = null
}

@DataContract
open class PasswordComplexityDto
{
    @DataMember
    open var minLength:Int? = null

    @DataMember
    open var maxLength:Int? = null

    @DataMember
    open var minNumbers:Int? = null

    @DataMember
    open var maxNumbers:Int? = null

    @DataMember
    open var minUpper:Int? = null

    @DataMember
    open var maxUpper:Int? = null

    @DataMember
    open var minLower:Int? = null

    @DataMember
    open var maxLower:Int? = null

    @DataMember
    open var minSpecial:Int? = null

    @DataMember
    open var maxSpecial:Int? = null

    @DataMember
    open var allowedSpecial:String? = null
}

@DataContract
open class MembershipCredentialsSettingsDto
{
    @DataMember
    open var logoutUrl:String? = null

    @DataMember
    open var allowUsernames:Boolean? = null

    @DataMember
    open var modes:ArrayList<MembershipCredentialsSettingsModeDto>? = null
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

open class CollectionIndexKeyDto
{
    @DataMember
    open var field:String? = null

    @DataMember
    open var order:Int? = null
}

@DataContract
open class SeedCollectionReportItemDto
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var requested:Int? = null

    @DataMember
    open var inserted:Int? = null

    @DataMember
    open var ids:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var errors:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class SchemaRefDto
{
    @DataMember(Order=1)
    open var schemaId:String? = null

    @DataMember(Order=2)
    open var schemaName:String? = null

    @DataMember(Order=3)
    open var databaseIntegrationId:String? = null
}

open class ImportFileColumnDto
{
    @DataMember
    open var index:Int? = null

    @DataMember
    open var header:String? = null

    @DataMember
    open var samples:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var detectedType:String? = null
}

@DataContract
open class NotificationModuleDependencyItemDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var viewId:String? = null

    @DataMember
    open var category:String? = null
}

@DataContract
open class TemplateListProjection : IHasViewId, IHasDatabaseId
{
    @DataMember
    override var id:String? = null

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
    open var errors:ArrayList<ErrorDto>? = null
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
    open var statusHistory:ArrayList<CampaignStatusChangeEntryDto> = ArrayList<CampaignStatusChangeEntryDto>()

    @DataMember
    open var status:CampaignStatusChangeEntryDto? = null

    @DataMember
    open var tokenMappingValues:ArrayList<TokenMappingDto>? = null

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
    open var to:ArrayList<EmailRecipientDto>? = null

    @DataMember
    open var cc:ArrayList<EmailRecipientDto>? = null

    @DataMember
    open var bcc:ArrayList<EmailRecipientDto>? = null

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
    open var errors:ArrayList<ErrorDto>? = null
    open var tags:ArrayList<String>? = null
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
    open var statusHistory:ArrayList<NotificationStatusChangeEntryDto> = ArrayList<NotificationStatusChangeEntryDto>()

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
open class SmsRecipientsDto
{
    @DataMember
    open var to:ArrayList<SmsRecipientDto>? = null

    @DataMember
    open var startingAfter:String? = null

    @DataMember
    open var hasMore:Boolean? = null
}

@DataContract
open class PushRecipientsDto
{
    @DataMember
    open var to:ArrayList<PushRecipientDto>? = null

    @DataMember
    open var startingAfter:String? = null

    @DataMember
    open var hasMore:Boolean? = null
}

open class AiToolManifestParameter
{
    open var name:String? = null
    @SerializedName("type") open var Type:String? = null
    open var required:Boolean? = null
    open var description:String? = null
}

open class ProjectBriefRequirementWireDto
{
    open var id:String? = null
    open var text:String? = null
    open var status:String? = null
    open var confidence:Double? = null
    open var isAssumption:Boolean? = null
    open var sources:ArrayList<ProjectBriefSourceWireDto> = ArrayList<ProjectBriefSourceWireDto>()
    open var satisfiedBy:ArrayList<ProjectBriefSatisfiedByWireDto> = ArrayList<ProjectBriefSatisfiedByWireDto>()
    open var sinceEventId:String? = null
}

open class ProjectBriefDecisionWireDto
{
    open var eventId:String? = null
    open var text:String? = null
    open var confidence:Double? = null
    open var atUtc:Date? = null
    open var sources:ArrayList<ProjectBriefSourceWireDto> = ArrayList<ProjectBriefSourceWireDto>()
}

open class ProjectBriefAssumptionWireDto
{
    open var requirementId:String? = null
    open var eventId:String? = null
    open var text:String? = null
    open var confidence:Double? = null
    open var atUtc:Date? = null
}

open class ProjectBriefSourceWireDto
{
    open var kind:String? = null
    open var sessionId:String? = null
    open var entryId:String? = null
    open var entrySeq:Long? = null
    open var eventId:String? = null
    open var userAuthId:String? = null
    open var atUtc:Date? = null
    open var surface:String? = null
    open var quote:String? = null
    open var workItemId:String? = null
}

open class ProjectBriefSatisfiedByWireDto
{
    open var artifactId:String? = null
    open var tool:String? = null
    open var orphaned:Boolean? = null
}

open class WorkItemEntryRefWireDto
{
    open var sessionId:String? = null
    open var entryId:String? = null
}

open class WorkItemRunRefWireDto
{
    open var sessionId:String? = null
    open var planEntryId:String? = null
    open var runId:String? = null
}

open class WorkItemArtifactWireDto
{
    open var artifactId:String? = null
    open var what:String? = null
    open var step:Int? = null
    open var planEntryId:String? = null
    open var kind:String? = null
    open var name:String? = null
}

open class WorkItemMovedOutWireDto
{
    open var text:String? = null
    open var reason:String? = null
    open var movedTo:String? = null
    open var source:String? = null
    open var entryRef:WorkItemEntryRefWireDto? = null
    open var atUtc:Date? = null
}

open class WorkItemNeedsYouWireDto
{
    open var text:String? = null
    open var kind:String? = null
    open var entryRef:WorkItemEntryRefWireDto? = null
    open var done:Boolean? = null
    open var doneAtUtc:Date? = null
    open var doneByUserAuthId:String? = null
}

open class WorkItemOpenQuestionWireDto
{
    open var entryRef:WorkItemEntryRefWireDto? = null
    open var blocking:Boolean? = null
    open var text:String? = null
    open var atUtc:Date? = null
}

open class WorkItemDoneConditionWireDto
{
    open var condition:Int? = null
    open var holds:Boolean? = null
    open var reason:String? = null
}

interface IVirtualDirectory
{
}

interface IVirtualPathProvider
{
    var rootDirectory:IVirtualDirectory?
    var virtualPathSeparator:String?
    var realPathSeparator:String?
}

interface IResponse
{
    var originalResponse:Object?
    var request:IRequest?
    var statusCode:Int?
    var statusDescription:String?
    var contentType:String?
    var outputStream:InputStream?
    var dto:Object?
    var useBufferedStream:Boolean?
    var isClosed:Boolean?
    var keepAlive:Boolean?
    var hasStarted:Boolean?
    var items:HashMap<String,Object>?
}

@Flags()
enum class RequestAttributes(val value:Int)
{
    @SerializedName("0") None(0),
    @SerializedName("1") Localhost(1),
    @SerializedName("2") LocalSubnet(2),
    @SerializedName("4") External(4),
    @SerializedName("8") Secure(8),
    @SerializedName("16") InSecure(16),
    @SerializedName("24") AnySecurityMode(24),
    @SerializedName("32") HttpHead(32),
    @SerializedName("64") HttpGet(64),
    @SerializedName("128") HttpPost(128),
    @SerializedName("256") HttpPut(256),
    @SerializedName("512") HttpDelete(512),
    @SerializedName("1024") HttpPatch(1024),
    @SerializedName("2048") HttpOptions(2048),
    @SerializedName("4096") HttpOther(4096),
    @SerializedName("8160") AnyHttpMethod(8160),
    @SerializedName("8192") OneWay(8192),
    @SerializedName("16384") Reply(16384),
    @SerializedName("24576") AnyCallStyle(24576),
    @SerializedName("32768") Soap11(32768),
    @SerializedName("65536") Soap12(65536),
    @SerializedName("131072") Xml(131072),
    @SerializedName("262144") Json(262144),
    @SerializedName("524288") Jsv(524288),
    @SerializedName("1048576") ProtoBuf(1048576),
    @SerializedName("2097152") Csv(2097152),
    @SerializedName("4194304") Html(4194304),
    @SerializedName("8388608") Jsonl(8388608),
    @SerializedName("16777216") MsgPack(16777216),
    @SerializedName("33554432") FormatOther(33554432),
    @SerializedName("67076096") AnyFormat(67076096),
    @SerializedName("67108864") Http(67108864),
    @SerializedName("134217728") MessageQueue(134217728),
    @SerializedName("268435456") Tcp(268435456),
    @SerializedName("536870912") Grpc(536870912),
    @SerializedName("1073741824") EndpointOther(1073741824),
    @SerializedName("2080374784") AnyEndpoint(2080374784),
    @SerializedName("-2147483648") InProcess(-2147483648),
    @SerializedName("-2147483645") InternalNetworkAccess(-2147483645),
    @SerializedName("-2147483641") AnyNetworkAccessType(-2147483641),
    @SerializedName("-1") Any(-1),
}

interface IRequestPreferences
{
    var acceptsBrotli:Boolean?
    var acceptsDeflate:Boolean?
    var acceptsGzip:Boolean?
}

interface IHttpFile
{
    var name:String?
    var fileName:String?
    var contentLength:Long?
    var contentType:String?
    var inputStream:InputStream?
}

enum class ResolvedRefStatus
{
    Ok,
    NotFound,
    Unauthorized,
    SourceError,
    Erased,
}

@DataContract
open class ChannelSubscriptionStateDto
{
    @DataMember
    open var unsubscribed:Boolean? = null

    @DataMember
    open var blockedTags:HashMap<String,ArrayList<String>> = HashMap<String,ArrayList<String>>()
}

open class ConsentPurposeDto
{
    open var key:String? = null
    open var name:String? = null
    open var channel:String? = null
    open var mappedTags:ArrayList<String> = ArrayList<String>()
    open var regulatoryBasis:ArrayList<String> = ArrayList<String>()
    open var description:String? = null
    open var isDeprecated:Boolean? = null
}

open class RetentionWindowDto
{
    open var dataKind:String? = null
    open var days:Int? = null
    open var action:String? = null
}

@DataContract
open class SupportCaseDto : IHasViewId
{
    @DataMember
    override var viewId:String? = null

    @DataMember
    open var accountId:String? = null

    @DataMember
    open var projectId:String? = null

    @DataMember
    open var reporterId:String? = null

    @DataMember
    open var kind:SupportCaseKind? = null

    @DataMember
    open var severity:SupportCaseSeverity? = null

    @DataMember
    open var status:SupportCaseStatus? = null

    @DataMember
    open var customerStatus:SupportCustomerStatus? = null

    @DataMember
    open var subject:String? = null

    @DataMember
    open var affectedModule:String? = null

    @DataMember
    open var deploymentMode:DeploymentMode? = null

    @DataMember
    open var gatewayVersion:String? = null

    @DataMember
    open var region:String? = null

    @DataMember
    open var planTier:String? = null

    @DataMember
    open var openedOn:Long? = null

    @DataMember
    open var firstResponseOn:Long? = null

    @DataMember
    open var resolvedOn:Long? = null

    @DataMember
    open var closedOn:Long? = null

    @DataMember
    open var resolution:String? = null

    @DataMember
    open var messageCount:Int? = null

    @DataMember
    open var lastMessageOn:Long? = null
}

@DataContract
open class SupportCaseMessageDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var caseId:String? = null

    @DataMember
    open var authorKind:SupportMessageAuthorKind? = null

    @DataMember
    open var authorId:String? = null

    @DataMember
    open var authorDisplayName:String? = null

    @DataMember
    open var body:String? = null

    @DataMember
    open var sentOn:Long? = null
}

enum class SupportCustomerStatus
{
    Pending,
    Open,
    Solved,
    Closed,
}

@DataContract
open class DiagnosticPackStepDescriptorDto
{
    @DataMember
    open var stepId:String? = null

    @DataMember
    open var kind:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var parameters:HashMap<String,String> = HashMap<String,String>()
}

@DataContract
open class DiagnosticPackStepResultDto
{
    @DataMember
    open var stepId:String? = null

    @DataMember
    open var kind:String? = null

    @DataMember
    open var isSuccess:Boolean? = null

    @DataMember
    open var result:Object? = null

    @DataMember
    open var errorMessage:String? = null
}

@DataContract
open class DiagnosticEchoRegionDto
{
}

@DataContract
open class DiagnosticEventItemDto
{
    @DataMember
    open var position:Long? = null

    @DataMember
    open var eventType:String? = null

    @DataMember
    open var payload:HashMap<String,String>? = null
}

@DataContract
open class DiagnosticRedisListItemDto
{
    @DataMember
    open var viewId:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var status:String? = null
}

enum class MarketplaceFieldType
{
    String,
    Number,
    Boolean,
    Url,
    Email,
    Json,
    MultilineText,
}

@DataContract
open class MarketplaceParameterSpecDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var location:MarketplaceParameterLocation? = null

    @DataMember
    open var valueTemplate:String? = null

    @DataMember
    open var label:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var documentationUrl:String? = null

    @DataMember
    @SerializedName("type") open var Type:String? = null

    @DataMember
    open var isRequired:Boolean? = null
}

open class AiChatQuestionOptionWireDto
{
    open var value:String? = null
    open var label:String? = null
}

open class AiChatPlanStepInputsWireDto
{
    open var artifacts:ArrayList<String> = ArrayList<String>()
    open var requirements:ArrayList<String> = ArrayList<String>()
}

open class AiChatPlanStepDoneCheckWireDto
{
    open var check:String? = null
    open var argsJson:String? = null
}

open class AiChatPlanStepLoopWireDto
{
    open var maxIterations:Int? = null
    open var maxToolCalls:Int? = null
}

@DataContract
open class TagDescriptionDto
{
    @DataMember
    open var title:String? = null

    @DataMember
    open var description:String? = null
}

@DataContract
open class FileChecksumDto
{
    @DataMember(Order=1)
    open var algorithm:String? = null

    @DataMember(Order=2)
    open var hash:String? = null
}

interface ICursorArgs
{
    var field:String?
    var order:Int?
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

open class JsonSchemaField
{
    open var fieldName:JsonSchemaFieldName? = null
}

open class AccessInformation
{
    open var ip:IpAddress? = null
    open var date:UtcDateTime? = null
    open var zone:TimeZone? = null
}

@DataContract
open class PushDevice
{
    @DataMember
    open var id:DeviceId? = null

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

    @DataMember
    open var token:PushDeviceDeliveryToken? = null
}

open class MidName
{
    open var value:String? = null
}

open class City
{
    open var value:String? = null
}

open class Country
{
    open var code:String? = null
    open var name:String? = null
}

open class AddressLine
{
    open var value:String? = null
}

open class PostalCode
{
    open var value:String? = null
}

open class CountryState
{
    open var value:String? = null
}

enum class MarketingBlockReason
{
    Unspecified,
    Unsubscribed,
    Complaint,
    HardBounce,
    InvalidEmail,
    AdminBlock,
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

open class SmsTitle
{
    open var value:TemplateCode? = null
}

open class SmsBody
{
    open var value:TemplateCode? = null
}

enum class MarketplaceTokenResolver
{
    Static,
    Request,
    Project,
    Initiator,
    Custom,
    IntegrationConfig,
    IntegrationSecret,
}

enum class SecretValueFormat
{
    Raw,
    Bearer,
    Basic,
    Prefixed,
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

@DataContract
open class UsageBillingClusterChargeDto
{
    @DataMember
    open var atlasProjectId:String? = null

    @DataMember
    open var atlasClusterName:String? = null

    @DataMember
    open var cents:Long? = null
}

open class NotificationSettingsChannelDto
{
    open var channel:CommunicationChannel? = null
    open var groups:ArrayList<NotificationsSettingsGroupDto> = ArrayList<NotificationsSettingsGroupDto>()
}

@DataContract
open class AuthenticationFlowPasswordPolicyDto
{
    @DataMember
    open var minLength:Int? = null

    @DataMember
    open var maxLength:Int? = null

    @DataMember
    open var minNumbers:Int? = null

    @DataMember
    open var minUpper:Int? = null

    @DataMember
    open var minLower:Int? = null

    @DataMember
    open var minSpecial:Int? = null

    @DataMember
    open var allowedSpecial:String? = null
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

open class AccessInformationDto
{
    open var ip:String? = null
    open var date:Date? = null
    open var timeZone:String? = null
}

@DataContract
open class MembershipEmailActionSettingsDto
{
    @DataMember
    open var sendEmail:Boolean? = null

    @DataMember
    open var template:MembershipMessageTemplateDto? = null

    @DataMember
    open var callback:String? = null
}

@DataContract
open class MembershipCredentialsSettingsModeDto
{
    @DataMember
    open var name:String? = null

    @DataMember
    open var logoutUrl:String? = null
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
    open var userTokenMappings:ArrayList<TokenMappingDto>? = null
}

enum class CampaignNotificationStatus
{
    Completed,
    BlockedByUserPreferenceBlockAll,
    BlockedByUserPreferenceBlockByTag,
    Failed,
    Viewed,
    Clicked,
    BlockedByValidation,
}

@DataContract
open class SmsRecipientDto
{
    @DataMember
    open var phoneNumber:String? = null

    @DataMember
    open var userId:String? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var userTokenMappings:ArrayList<TokenMappingDto>? = null

    @DataMember
    open var timeZoneId:String? = null

    @DataMember
    open var record:String? = null
}

@DataContract
open class PushRecipientDto
{
    @DataMember
    open var deviceTokens:ArrayList<PushDeviceDeliveryTokenDto> = ArrayList<PushDeviceDeliveryTokenDto>()

    @DataMember
    open var userId:String? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var userTokenMappings:ArrayList<TokenMappingDto>? = null

    @DataMember
    open var timeZoneId:String? = null

    @DataMember
    open var record:String? = null
}

enum class MarketplaceParameterLocation
{
    Body,
    Header,
    Query,
    Path,
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
    @SerializedName("4096") Project(4096),
    @SerializedName("8192") Compliance(8192),
    @SerializedName("16384") Contacts(16384),
    @SerializedName("32768") Marketplace(32768),
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

open class IpAddress
{
    open var ip:String? = null
}

open class DeviceId
{
    open var id:UUID? = null
}

@DataContract
open class PushDeviceDeliveryToken
{
    @DataMember
    open var pushDeviceToken:PushDeviceToken? = null

    @DataMember
    open var deliveryFamily:PushDeviceDeliveryFamily? = null
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

@DataContract
open class MembershipMessageTemplateDto
{
    @DataMember
    open var id:String? = null
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

open class PushDeviceToken
{
    open var token:String? = null
}

enum class PushDeviceDeliveryFamily
{
    Ios,
    Android,
    Chrome,
    Safari,
    Expo,
}
