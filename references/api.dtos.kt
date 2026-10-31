/* Options:
Date: 2026-10-31 09:57:14
Version: 10.20
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://localhost:5002

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


open class SharedTypeGen
{
    open var typegen_StringFieldDto:StringFieldDto? = null
    open var typegen_DecimalFieldDto:DecimalFieldDto? = null
    open var typegen_CurrencyFieldDto:CurrencyFieldDto? = null
    open var typegen_BooleanFieldDto:BooleanFieldDto? = null
    open var typegen_DateFieldDto:DateFieldDto? = null
    open var typegen_IntegerFieldDto:IntegerFieldDto? = null
    open var typegen_GeolocationFieldDto:GeolocationFieldDto? = null
    open var typegen_TagsFieldDto:TagsFieldDto? = null
    open var typegen_FileFieldDto:FileFieldDto? = null
    open var typegen_TaxonomySelectionFieldDto:TaxonomySelectionFieldDto? = null
    open var typegen_CollectionSelectionFieldDto:CollectionSelectionFieldDto? = null
    open var typegen_UserSelectionFieldDto:UserSelectionFieldDto? = null
    open var typegen_RoleSelectionFieldDto:RoleSelectionFieldDto? = null
    open var typegen_EnumSelectionFieldDto:EnumSelectionFieldDto? = null
    open var typegen_ObjectFieldDto:ObjectFieldDto? = null
    open var typegen_ArrayFieldDto:ArrayFieldDto? = null
    open var typegen_JsonFieldDto:JsonFieldDto? = null
}

@Route(Path="/{version}/echo", Verbs="GET")
open class Echo : RequestBase(), IReturn<EchoResponse>
{
    companion object { private val responseType = EchoResponse::class.java }
    override fun getResponseType(): Any? = Echo.responseType
}

@Route(Path="/{version}/public/projects/{ProjectId}/brand/{Kind}", Verbs="GET")
open class GetPublicProjectBrandAsset : RequestBase(), IReturn<ByteArray>
{
    open var projectId:String? = null
    open var kind:String? = null
    open var v:String? = null
    companion object { private val responseType = ByteArray::class.java }
    override fun getResponseType(): Any? = GetPublicProjectBrandAsset.responseType
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

/**
* Adds a file to one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/attachments", Verbs="POST")
@Api(Description="Adds a file to one of the caller's own AI chats.")
open class UploadEndUserChatAttachmentRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var sessionId:String? = null
    open var fileName:String? = null
    open var contentType:String? = null
    open var base64Content:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UploadEndUserChatAttachmentRequest.responseType
}

/**
* Lists the files in one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/attachments", Verbs="GET")
@Api(Description="Lists the files in one of the caller's own AI chats.")
open class ListEndUserChatAttachmentsRequest : CodeMashRequestBase(), IReturn<ListEndUserChatAttachmentsResponse>
{
    open var sessionId:String? = null
    companion object { private val responseType = ListEndUserChatAttachmentsResponse::class.java }
    override fun getResponseType(): Any? = ListEndUserChatAttachmentsRequest.responseType
}

/**
* Removes a file from one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/attachments/{AttachmentId}", Verbs="DELETE")
@Api(Description="Removes a file from one of the caller's own AI chats.")
open class DeleteEndUserChatAttachmentRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var attachmentId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEndUserChatAttachmentRequest.responseType
}

/**
* Likes, dislikes or clears one message of the caller's own AI chat.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/entries/{EntryId}/feedback", Verbs="PUT")
@Api(Description="Likes, dislikes or clears one message of the caller's own AI chat.")
open class SetEndUserChatEntryFeedbackRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var sessionId:String? = null
    open var entryId:String? = null
    open var feedback:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetEndUserChatEntryFeedbackRequest.responseType
}

/**
* Lists what the AI chat remembers about the caller.
*/
@Route(Path="/{version}/ai/chat/memory", Verbs="GET")
@Api(Description="Lists what the AI chat remembers about the caller.")
open class ListEndUserChatMemoryRequest : CodeMashRequestBase(), IReturn<ListEndUserChatMemoryResponse>
{
    open var take:Int? = null
    companion object { private val responseType = ListEndUserChatMemoryResponse::class.java }
    override fun getResponseType(): Any? = ListEndUserChatMemoryRequest.responseType
}

/**
* Forgets one thing the AI chat remembers about the caller.
*/
@Route(Path="/{version}/ai/chat/memory/{NoteId}", Verbs="DELETE")
@Api(Description="Forgets one thing the AI chat remembers about the caller.")
open class ForgetEndUserChatMemoryRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var noteId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ForgetEndUserChatMemoryRequest.responseType
}

/**
* Whether the AI chat can run for the caller, and which assistants it offers.
*/
@Route(Path="/{version}/ai/chat/availability", Verbs="GET")
@Api(Description="Whether the AI chat can run for the caller, and which assistants it offers.")
open class GetEndUserChatAvailabilityRequest : CodeMashRequestBase(), IReturn<GetEndUserChatAvailabilityResponse>
{
    companion object { private val responseType = GetEndUserChatAvailabilityResponse::class.java }
    override fun getResponseType(): Any? = GetEndUserChatAvailabilityRequest.responseType
}

/**
* Lists the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions", Verbs="GET")
@Api(Description="Lists the caller's own AI chats.")
open class ListEndUserChatSessionsRequest : CodeMashRequestBase(), IReturn<ListEndUserChatSessionsResponse>
{
    open var take:Int? = null
    open var includeArchived:Boolean? = null
    companion object { private val responseType = ListEndUserChatSessionsResponse::class.java }
    override fun getResponseType(): Any? = ListEndUserChatSessionsRequest.responseType
}

/**
* Opens a new AI chat for the caller.
*/
@Route(Path="/{version}/ai/chat/sessions", Verbs="POST")
@Api(Description="Opens a new AI chat for the caller.")
open class CreateEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    open var assistantId:String? = null
    open var title:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreateEndUserChatSessionRequest.responseType
}

/**
* Returns one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}", Verbs="GET")
@Api(Description="Returns one of the caller's own AI chats.")
open class GetEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<GetEndUserChatSessionResponse>
{
    open var sessionId:String? = null
    companion object { private val responseType = GetEndUserChatSessionResponse::class.java }
    override fun getResponseType(): Any? = GetEndUserChatSessionRequest.responseType
}

/**
* Renames one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}", Verbs="PATCH")
@Api(Description="Renames one of the caller's own AI chats.")
open class RenameEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var sessionId:String? = null
    open var title:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = RenameEndUserChatSessionRequest.responseType
}

/**
* Pins or unpins one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/pin", Verbs="PUT")
@Api(Description="Pins or unpins one of the caller's own AI chats.")
open class PinEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var sessionId:String? = null
    open var pinned:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PinEndUserChatSessionRequest.responseType
}

/**
* Archives or unarchives one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/archive", Verbs="PUT")
@Api(Description="Archives or unarchives one of the caller's own AI chats.")
open class ArchiveEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var sessionId:String? = null
    open var archived:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ArchiveEndUserChatSessionRequest.responseType
}

/**
* Deletes one of the caller's own AI chats.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}", Verbs="DELETE")
@Api(Description="Deletes one of the caller's own AI chats.")
open class DeleteEndUserChatSessionRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var sessionId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteEndUserChatSessionRequest.responseType
}

/**
* Returns a page of one of the caller's own AI chat transcripts.
*/
@Route(Path="/{version}/ai/chat/sessions/{SessionId}/entries", Verbs="GET")
@Api(Description="Returns a page of one of the caller's own AI chat transcripts.")
open class GetEndUserChatEntriesRequest : CodeMashRequestBase(), IReturn<GetEndUserChatEntriesResponse>
{
    open var sessionId:String? = null
    open var afterSeq:Long? = null
    open var take:Int? = null
    companion object { private val responseType = GetEndUserChatEntriesResponse::class.java }
    override fun getResponseType(): Any? = GetEndUserChatEntriesRequest.responseType
}

/**
* Sends a message to the AI chat; the answer streams on the caller's channel.
*/
@Route(Path="/{version}/ai/chat/turn", Verbs="POST")
@Api(Description="Sends a message to the AI chat; the answer streams on the caller's channel.")
open class StartEndUserChatTurnRequest : CodeMashRequestBase(), IReturn<StartEndUserChatTurnResponse>
{
    open var sessionId:String? = null
    open var assistantId:String? = null
    open var message:String? = null
    companion object { private val responseType = StartEndUserChatTurnResponse::class.java }
    override fun getResponseType(): Any? = StartEndUserChatTurnRequest.responseType
}

/**
* Lists the AI tools a project user may use: only their own data (own:* toolsets).
*/
@Route(Path="/{version}/ai/tools", Verbs="GET")
@Api(Description="Lists the AI tools a project user may use: only their own data (own:* toolsets).")
open class GetEndUserAiToolsRequest : RequestBase(), IReturn<GetEndUserAiToolsResponse>
{
    companion object { private val responseType = GetEndUserAiToolsResponse::class.java }
    override fun getResponseType(): Any? = GetEndUserAiToolsRequest.responseType
}

/**
* Invokes one own-scope AI tool as the calling project user.
*/
@Route(Path="/{version}/ai/tools/{ToolName}", Verbs="POST")
@Api(Description="Invokes one own-scope AI tool as the calling project user.")
open class InvokeEndUserAiToolRequest : RequestBase(), IReturn<InvokeEndUserAiToolResponse>
{
    open var toolName:String? = null
    open var argumentsJson:String? = null
    companion object { private val responseType = InvokeEndUserAiToolResponse::class.java }
    override fun getResponseType(): Any? = InvokeEndUserAiToolRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/block", Verbs="PATCH")
@Api(Description="Membership")
@DataContract
open class BlockUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user to block, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to block, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = BlockUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/service", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveSystemUserWithPermissions : SaveUserWithRolesBase(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveSystemUserWithPermissions.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/guest", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveGuestUser : SaveUser(), IReturn<SaveGuestUserResponse>
{
    companion object { private val responseType = SaveGuestUserResponse::class.java }
    override fun getResponseType(): Any? = SaveGuestUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/phone", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SavePhoneUser : SaveUser(), IReturn<IdResponse>
{
    /**
    * Phone number for the new user, in E.164 format.
    */
    @DataMember
    @ApiMember(Description="Phone number for the new user, in E.164 format.", IsRequired=true)
    open var phone:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePhoneUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/user-name", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveUserNameUser : SaveUser(), IReturn<IdResponse>, IPublicRegistrationRequest
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var userName:String? = null

    /**
    * Optional roles from the project's "Permitted user registration roles". Empty = the default registration role.
    */
    @DataMember
    @ApiMember(Description="Optional roles from the project's \"Permitted user registration roles\". Empty = the default registration role.")
    override var roles:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveUserNameUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/email", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveEmailUser : SaveUser(), IReturn<IdResponse>, IPublicRegistrationRequest
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var email:String? = null

    /**
    * Optional roles from the project's "Permitted user registration roles". Empty = the default registration role.
    */
    @DataMember
    @ApiMember(Description="Optional roles from the project's \"Permitted user registration roles\". Empty = the default registration role.")
    override var roles:ArrayList<String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/phone-with-permissions", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SavePhoneUserNameWithPermissions : SaveUserWithRolesBase(), IReturn<IdResponse>
{
    @DataMember
    open var phone:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePhoneUserNameWithPermissions.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/email-with-permissions", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveEmailUserNameWithPermissions : SaveUserWithRolesBase(), IReturn<IdResponse>
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var email:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailUserNameWithPermissions.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/user-name-with-permissions", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveUserNameWithPermissions : SaveUserWithRolesBase(), IReturn<IdResponse>
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var userName:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveUserNameWithPermissions.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth", Verbs="DELETE")
@Api(Description="Membership")
@DataContract
open class DeleteUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user to delete, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to delete, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/{id}", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUserRequest : CodeMashRequestBase(), IReturn<GetUserResponse>
{
    /**
    * Id of the user to fetch, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to fetch, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetUserResponse::class.java }
    override fun getResponseType(): Any? = GetUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUsersRequest : CodeMashListPaginationRequestBase(), IReturn<GetUsersResponse>
{
    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null

    /**
    * Include each user's effective permissions in the result.
    */
    @DataMember
    @ApiMember(Description="Include each user's effective permissions in the result.")
    open var includePermissions:Boolean? = null

    /**
    * Only return users that have a registered push device.
    */
    @DataMember
    @ApiMember(Description="Only return users that have a registered push device.")
    open var userShouldHavePushDevice:Boolean? = null

    /**
    * Only return users that have an email address.
    */
    @DataMember
    @ApiMember(Description="Only return users that have an email address.")
    open var userShouldHaveEmail:Boolean? = null

    /**
    * Include each user's metadata in the result.
    */
    @DataMember
    @ApiMember(Description="Include each user's metadata in the result.")
    open var includeMeta:Boolean? = null

    /**
    * Filter to users that have any of these role names.
    */
    @DataMember
    @ApiMember(Description="Filter to users that have any of these role names.")
    open var roleNames:ArrayList<String>? = null

    /**
    * Filter to these specific user ids.
    */
    @DataMember
    @ApiMember(Description="Filter to these specific user ids.")
    open var userIds:ArrayList<String>? = null

    /**
    * Free text, case-insensitive: matches email, user name, display / first / last name or phone.
    */
    @DataMember
    @ApiMember(Description="Free text, case-insensitive: matches email, user name, display / first / last name or phone.")
    open var search:String? = null

    /**
    * Case-insensitive part of the email.
    */
    @DataMember
    @ApiMember(Description="Case-insensitive part of the email.")
    open var email:String? = null

    /**
    * Case-insensitive part of the user name.
    */
    @DataMember
    @ApiMember(Description="Case-insensitive part of the user name.")
    open var userName:String? = null

    /**
    * Status names, any of: Registered, PendingValidation, Active, Unregistered, Suspended, InActive, Blocked.
    */
    @DataMember
    @ApiMember(Description="Status names, any of: Registered, PendingValidation, Active, Unregistered, Suspended, InActive, Blocked.")
    open var statuses:ArrayList<String>? = null

    /**
    * Login type names, any of: Service, Email, UserName, Phone, Guest, Social.
    */
    @DataMember
    @ApiMember(Description="Login type names, any of: Service, Email, UserName, Phone, Guest, Social.")
    open var types:ArrayList<String>? = null
    companion object { private val responseType = GetUsersResponse::class.java }
    override fun getResponseType(): Any? = GetUsersRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/{id}/preferences", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUserPreferencesRequest : CodeMashRequestBase(), IReturn<GetUserPreferencesResponse>
{
    /**
    * Id of the user whose preferences to fetch, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user whose preferences to fetch, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the project's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the project's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetUserPreferencesResponse::class.java }
    override fun getResponseType(): Any? = GetUserPreferencesRequest.responseType
}

@Route(Path="/{version}/membership/users/{contactId}/marketing-state/{channel}/consent", Verbs="POST")
open class GrantContactConsentRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user (contact) to grant consent for.
    */
    @ApiMember(Description="Id of the user (contact) to grant consent for.", IsRequired=true)
    open var contactId:String? = null

    /**
    * Delivery channel to grant consent on: Email, Sms, or Push.
    */
    @ApiMember(Description="Delivery channel to grant consent on: Email, Sms, or Push.", IsRequired=true)
    open var channel:String? = null

    /**
    * Lawful basis for the consent, e.g. Consent. Defaults to Consent.
    */
    @ApiMember(Description="Lawful basis for the consent, e.g. Consent. Defaults to Consent.")
    open var lawfulBasis:String? = null

    /**
    * Source of the consent, e.g. UserOptIn. Defaults to UserOptIn.
    */
    @ApiMember(Description="Source of the consent, e.g. UserOptIn. Defaults to UserOptIn.")
    open var source:String? = null

    /**
    * Optional free-text reference to evidence of consent (e.g. a form submission id).
    */
    @ApiMember(Description="Optional free-text reference to evidence of consent (e.g. a form submission id).")
    open var evidenceRef:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = GrantContactConsentRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/invite", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class InviteUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Email address the invitation is sent to. It cannot be changed later.
    */
    @DataMember
    @ApiMember(Description="Email address the invitation is sent to. It cannot be changed later.", IsRequired=true)
    open var email:String? = null

    /**
    * The invited person's full name, e.g. "Rūta Petraitė". Stored as the full name, first name (first word) and last name (the rest). The user may change it when finishing.
    */
    @DataMember
    @ApiMember(Description="The invited person's full name, e.g. \"Rūta Petraitė\". Stored as the full name, first name (first word) and last name (the rest). The user may change it when finishing.")
    open var fullName:String? = null

    /**
    * Optional. How e-mails greet the person ("Hi {salutation},"), e.g. "Rūta". Stored as the display name. When empty the full name is used. The user may change it when finishing.
    */
    @DataMember
    @ApiMember(Description="Optional. How e-mails greet the person (\"Hi {salutation},\"), e.g. \"Rūta\". Stored as the display name. When empty the full name is used. The user may change it when finishing.")
    open var salutation:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = InviteUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/invitation/finish", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class FinishInvitationRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * One-time invitation token from the e-mail link (the #token= fragment).
    */
    @DataMember
    @ApiMember(Description="One-time invitation token from the e-mail link (the #token= fragment).", IsRequired=true)
    open var token:String? = null

    /**
    * The user's password. Validated against the project's complexity policy.
    */
    @DataMember
    @ApiMember(Description="The user's password. Validated against the project's complexity policy.", IsRequired=true)
    open var password:String? = null

    /**
    * Optional. The user's full name; replaces the one the admin entered (full name, first name = first word, last name = the rest). Empty = keep the admin's.
    */
    @DataMember
    @ApiMember(Description="Optional. The user's full name; replaces the one the admin entered (full name, first name = first word, last name = the rest). Empty = keep the admin's.")
    open var fullName:String? = null

    /**
    * Optional. How e-mails greet the user (stored as the display name). Empty = keep the admin's, or the full name when the admin gave none.
    */
    @DataMember
    @ApiMember(Description="Optional. How e-mails greet the user (stored as the display name). Empty = keep the admin's, or the full name when the admin gave none.")
    open var salutation:String? = null

    /**
    * Optional. Older form of Salutation (the display name); Salutation wins when both are sent.
    */
    @DataMember
    @ApiMember(Description="Optional. Older form of Salutation (the display name); Salutation wins when both are sent.")
    open var displayName:String? = null

    /**
    * Optional first name; wins over the one taken from FullName.
    */
    @DataMember
    @ApiMember(Description="Optional first name; wins over the one taken from FullName.")
    open var firstName:String? = null

    /**
    * Optional last name; wins over the one taken from FullName.
    */
    @DataMember
    @ApiMember(Description="Optional last name; wins over the one taken from FullName.")
    open var lastName:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = FinishInvitationRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/{userId}/link-identity", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class LinkIdentityRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var userId:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var providerToken:String? = null

    @DataMember
    open var emailToVerify:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = LinkIdentityRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{userId}/map-auth", Verbs="POST")
@Api(Description="Membership")
open class MapAuthToUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    open var userId:String? = null
    open var authId:String? = null
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MapAuthToUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/assign-roles", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class AssignRolePermissionsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user login to assign roles to, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user login to assign roles to, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null

    /**
    * The complete new list of role names (full replacement), from get_roles.
    */
    @DataMember
    @ApiMember(Description="The complete new list of role names (full replacement), from get_roles.")
    open var roles:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AssignRolePermissionsRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{userId}/roles", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class SetContactRolesRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the human user to assign roles to.
    */
    @DataMember
    @ApiMember(Description="Id of the human user to assign roles to.", IsRequired=true)
    open var userId:String? = null

    /**
    * The complete new list of role ids (full replacement), from get_roles. Empty/omitted clears all roles.
    */
    @DataMember
    @ApiMember(Description="The complete new list of role ids (full replacement), from get_roles. Empty/omitted clears all roles.")
    open var roles:ArrayList<String>? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetContactRolesRequest.responseType
}

@Route(Path="/{version}/membership/users/{contactId}/marketing-state/{commChannel}/{channel}/tags/{tag}", Verbs="PUT")
open class SetContactTagSubscriptionRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user (contact) to update.
    */
    @ApiMember(Description="Id of the user (contact) to update.", IsRequired=true)
    open var contactId:String? = null

    /**
    * Communication channel type: Marketing or Transactional.
    */
    @ApiMember(Description="Communication channel type: Marketing or Transactional.", IsRequired=true)
    open var commChannel:String? = null

    /**
    * Delivery channel: Email, Sms, or Push.
    */
    @ApiMember(Description="Delivery channel: Email, Sms, or Push.", IsRequired=true)
    open var channel:String? = null

    /**
    * The tag name; must already exist for the communication channel.
    */
    @ApiMember(Description="The tag name; must already exist for the communication channel.", IsRequired=true)
    open var tag:String? = null

    /**
    * True to subscribe (unblock) the tag, false to block it.
    */
    @ApiMember(Description="True to subscribe (unblock) the tag, false to block it.")
    open var subscribed:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetContactTagSubscriptionRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/unblock", Verbs="PATCH")
@Api(Description="Membership")
@DataContract
open class UnblockUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user to unblock, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to unblock, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnblockUserRequest.responseType
}

@Route(Path="/{version}/membership/users/{contactId}/marketing-state/{channel}/unsubscribe", Verbs="POST")
open class UnsubscribeContactRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user (contact) to unsubscribe.
    */
    @ApiMember(Description="Id of the user (contact) to unsubscribe.", IsRequired=true)
    open var contactId:String? = null

    /**
    * Delivery channel to unsubscribe from: Email, Sms, or Push.
    */
    @ApiMember(Description="Delivery channel to unsubscribe from: Email, Sms, or Push.", IsRequired=true)
    open var channel:String? = null

    /**
    * Optional suppression reason name explaining why consent was revoked.
    */
    @ApiMember(Description="Optional suppression reason name explaining why consent was revoked.")
    open var reason:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnsubscribeContactRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class UpdateUserRequest : SaveUser(), IReturn<IdResponse>
{
    /**
    * Id of the user to update, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to update, from get_users.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdateUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/{id}/preferences", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class UpdateUserPreferencesRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * Id of the user to update, from get_users.
    */
    @DataMember
    @ApiMember(Description="Id of the user to update, from get_users.", IsRequired=true)
    open var id:String? = null

    /**
    * When true, blocks all marketing messages to this user.
    */
    @DataMember
    @ApiMember(Description="When true, blocks all marketing messages to this user.")
    open var blockAllMarketingMessages:Boolean? = null

    /**
    * Per communication channel, the set of tags blocked for this user. Full replacement.
    */
    @DataMember
    @ApiMember(Description="Per communication channel, the set of tags blocked for this user. Full replacement.")
    open var blockedTags:HashMap<String,HashSet<String>>? = null

    /**
    * Database integration id. Optional — defaults to the project's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the project's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateUserPreferencesRequest.responseType
}

/**
* Membership · Password
*/
@Route(Path="/{version}/membership/userauth/password/change", Verbs="POST")
@Api(Description="Membership · Password")
@DataContract
open class ChangePasswordRequest : CodeMashRequestBase(), IReturn<CredentialChangedResponse>
{
    /**
    * The member's current password.
    */
    @DataMember
    @ApiMember(Description="The member's current password.", IsRequired=true)
    open var currentPassword:String? = null

    /**
    * The new password. Validated against the project's complexity policy.
    */
    @DataMember
    @ApiMember(Description="The new password. Validated against the project's complexity policy.", IsRequired=true)
    open var newPassword:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = CredentialChangedResponse::class.java }
    override fun getResponseType(): Any? = ChangePasswordRequest.responseType
}

/**
* Membership · Password
*/
@Route(Path="/{version}/membership/userauth/password/reset/request", Verbs="POST")
@Api(Description="Membership · Password")
@DataContract
open class RequestPasswordResetRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    /**
    * Email address to send the reset link to.
    */
    @DataMember
    @ApiMember(Description="Email address to send the reset link to.", IsRequired=true)
    open var email:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RequestPasswordResetRequest.responseType
}

/**
* Membership · Password
*/
@Route(Path="/{version}/membership/userauth/password/reset/confirm", Verbs="POST")
@Api(Description="Membership · Password")
@DataContract
open class ConfirmPasswordResetRequest : CodeMashRequestBase(), IReturn<CredentialChangedResponse>
{
    /**
    * One-time reset token from the email link.
    */
    @DataMember
    @ApiMember(Description="One-time reset token from the email link.", IsRequired=true)
    open var token:String? = null

    /**
    * The new password. Validated against the project's complexity policy.
    */
    @DataMember
    @ApiMember(Description="The new password. Validated against the project's complexity policy.", IsRequired=true)
    open var newPassword:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = CredentialChangedResponse::class.java }
    override fun getResponseType(): Any? = ConfirmPasswordResetRequest.responseType
}

/**
* Membership · Password
*/
@Route(Path="/{version}/membership/userauth/password/reset/test", Verbs="POST")
@Api(Description="Membership · Password")
@DataContract
open class SendTestPasswordResetRequest : CodeMashRequestBase(), IReturn<SendTestPasswordResetResponse>
{
    /**
    * Email address of the project user (a login in the request environment).
    */
    @DataMember
    @ApiMember(Description="Email address of the project user (a login in the request environment).", IsRequired=true)
    open var email:String? = null
    companion object { private val responseType = SendTestPasswordResetResponse::class.java }
    override fun getResponseType(): Any? = SendTestPasswordResetRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkey/authentication-options", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class PasskeyAuthenticationOptionsRequest : CodeMashRequestBase(), IReturn<PasskeyCeremonyOptionsResponse>, IPasskeyCeremonyRequest
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = PasskeyCeremonyOptionsResponse::class.java }
    override fun getResponseType(): Any? = PasskeyAuthenticationOptionsRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkey/verify-authentication", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class VerifyPasskeyAuthenticationRequest : CodeMashRequestBase(), IReturn<PasskeyAuthTokensResponse>, IPasskeyCeremonyRequest
{
    @DataMember
    open var ceremonyId:String? = null

    @DataMember
    open var assertionResponse:String? = null
    companion object { private val responseType = PasskeyAuthTokensResponse::class.java }
    override fun getResponseType(): Any? = VerifyPasskeyAuthenticationRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkeys", Verbs="GET")
@Api(Description="Membership · Passkey")
@DataContract
open class ListPasskeysRequest : CodeMashRequestBase(), IReturn<PasskeyListResponse>
{
    companion object { private val responseType = PasskeyListResponse::class.java }
    override fun getResponseType(): Any? = ListPasskeysRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkeys/{CredentialId}/rename", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class RenamePasskeyRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    /**
    * Base64 credential id of the passkey to rename, from list_passkeys.
    */
    @DataMember
    @ApiMember(Description="Base64 credential id of the passkey to rename, from list_passkeys.", IsRequired=true)
    open var credentialId:String? = null

    /**
    * The new friendly name for the passkey.
    */
    @DataMember
    @ApiMember(Description="The new friendly name for the passkey.", IsRequired=true)
    open var friendlyName:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RenamePasskeyRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkeys/{CredentialId}/revoke", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class RevokePasskeyRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    /**
    * Base64 credential id of the passkey to revoke, from list_passkeys.
    */
    @DataMember
    @ApiMember(Description="Base64 credential id of the passkey to revoke, from list_passkeys.", IsRequired=true)
    open var credentialId:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RevokePasskeyRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/recovery/use-code", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class UseRecoveryCodeRequest : CodeMashRequestBase(), IReturn<PasskeyRecoveryResponse>
{
    @DataMember
    open var email:String? = null

    @DataMember
    open var recoveryCode:String? = null
    companion object { private val responseType = PasskeyRecoveryResponse::class.java }
    override fun getResponseType(): Any? = UseRecoveryCodeRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/recovery/magic-link/request", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class RequestMagicLinkRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = RequestMagicLinkRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/recovery/magic-link/consume", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class ConsumeMagicLinkRequest : CodeMashRequestBase(), IReturn<PasskeyRecoveryResponse>
{
    @DataMember
    open var token:String? = null
    companion object { private val responseType = PasskeyRecoveryResponse::class.java }
    override fun getResponseType(): Any? = ConsumeMagicLinkRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/has-passkey", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class HasPasskeyRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = HasPasskeyRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/email/start-verification", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class StartEmailVerificationRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    @DataMember
    open var email:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = StartEmailVerificationRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/email/confirm-verification", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class ConfirmEmailVerificationRequest : CodeMashRequestBase(), IReturn<PasskeyVerificationTokenResponse>
{
    @DataMember
    open var email:String? = null

    @DataMember
    open var code:String? = null
    companion object { private val responseType = PasskeyVerificationTokenResponse::class.java }
    override fun getResponseType(): Any? = ConfirmEmailVerificationRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkey/registration-options", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class PasskeyRegistrationOptionsRequest : CodeMashRequestBase(), IReturn<PasskeyCeremonyOptionsResponse>, IPasskeyCeremonyRequest
{
    @DataMember
    open var verificationToken:String? = null
    companion object { private val responseType = PasskeyCeremonyOptionsResponse::class.java }
    override fun getResponseType(): Any? = PasskeyRegistrationOptionsRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/passkey/verify-registration", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class VerifyPasskeyRegistrationRequest : CodeMashRequestBase(), IReturn<PasskeyAuthTokensResponse>, IPasskeyCeremonyRequest
{
    @DataMember
    open var verificationToken:String? = null

    @DataMember
    open var ceremonyId:String? = null

    @DataMember
    open var attestationResponse:String? = null

    @DataMember
    open var friendlyName:String? = null
    companion object { private val responseType = PasskeyAuthTokensResponse::class.java }
    override fun getResponseType(): Any? = VerifyPasskeyRegistrationRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/token/refresh", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class RefreshPasskeyTokenRequest : CodeMashRequestBase(), IReturn<PasskeyAuthTokensResponse>
{
    @DataMember
    open var refreshToken:String? = null
    companion object { private val responseType = PasskeyAuthTokensResponse::class.java }
    override fun getResponseType(): Any? = RefreshPasskeyTokenRequest.responseType
}

/**
* Membership · Passkey
*/
@Route(Path="/{version}/membership/userauth/logout", Verbs="POST")
@Api(Description="Membership · Passkey")
@DataContract
open class PasskeyLogoutRequest : CodeMashRequestBase(), IReturn<PasskeyOkResponse>
{
    @DataMember
    open var refreshToken:String? = null
    companion object { private val responseType = PasskeyOkResponse::class.java }
    override fun getResponseType(): Any? = PasskeyLogoutRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/taxonomies/{taxonomyName}/merged-tree", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindMergedTermTreeRequest : CodeMashRequestBase(), IReturn<FindMergedTermTreeResponse>
{
    /**
    * Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.
    */
    @DataMember
    @ApiMember(Description="Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.")
    open var allLanguages:Boolean? = null

    /**
    * The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).
    */
    @DataMember
    @ApiMember(Description="The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).", IsRequired=true)
    open var taxonomyName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = FindMergedTermTreeResponse::class.java }
    override fun getResponseType(): Any? = FindMergedTermTreeRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/taxonomies/tree", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindTaxonomyTreeRequest : CodeMashRequestBase(), IReturn<FindTaxonomyTreeResponse>
{
    /**
    * Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.
    */
    @DataMember
    @ApiMember(Description="Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.")
    open var allLanguages:Boolean? = null

    @DataMember
    open var includeTerms:Boolean? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = FindTaxonomyTreeResponse::class.java }
    override fun getResponseType(): Any? = FindTaxonomyTreeRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/taxonomies/{taxonomyName}/terms", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindTermsRequest : CodeMashListPaginationRequestBase(), IReturn<FindTermsResponse>
{
    /**
    * Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.
    */
    @DataMember
    @ApiMember(Description="Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.")
    open var allLanguages:Boolean? = null

    /**
    * The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).
    */
    @DataMember
    @ApiMember(Description="The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).", IsRequired=true)
    open var taxonomyName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var sortDescending:Boolean? = null

    @DataMember
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = FindTermsResponse::class.java }
    override fun getResponseType(): Any? = FindTermsRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/taxonomies/{taxonomyName}/terms/{parentId}/children", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindTermsChildrenRequest : CodeMashListPaginationRequestBase(), IReturn<FindTermsChildrenResponse>
{
    /**
    * Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.
    */
    @DataMember
    @ApiMember(Description="Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.")
    open var allLanguages:Boolean? = null

    /**
    * The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).
    */
    @DataMember
    @ApiMember(Description="The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).", IsRequired=true)
    open var taxonomyName:String? = null

    @DataMember
    open var parentId:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = FindTermsChildrenResponse::class.java }
    override fun getResponseType(): Any? = FindTermsChildrenRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/taxonomies/{taxonomyName}/terms/tree", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindTermTreeRequest : CodeMashRequestBase(), IReturn<FindTermTreeResponse>
{
    /**
    * Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.
    */
    @DataMember
    @ApiMember(Description="Set true to keep name / description as stored even when Accept-Language is sent (editors). The full translations are always in names / descriptions.")
    open var allLanguages:Boolean? = null

    /**
    * The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).
    */
    @DataMember
    @ApiMember(Description="The taxonomy: its name (slug or title; URL-encode spaces) or its id (txn_…).", IsRequired=true)
    open var taxonomyName:String? = null

    @DataMember
    open var rootTermId:String? = null

    @DataMember
    open var depth:Int? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = FindTermTreeResponse::class.java }
    override fun getResponseType(): Any? = FindTermTreeRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/schemas/{id}", Verbs="GET")
@Api(Description="Database")
@DataContract
open class GetDatabaseSchemaRequest : CodeMashRequestBase(), IReturn<GetDatabaseSchemaResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = GetDatabaseSchemaResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemaRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/schemas", Verbs="GET")
@Api(Description="Database")
@DataContract
open class GetDatabaseSchemasRequest : CodeMashListPaginationRequestBase(), IReturn<GetDatabaseSchemasResponse>
{
    @DataMember
    open var pagingArgs:PagingArgs? = null
    companion object { private val responseType = GetDatabaseSchemasResponse::class.java }
    override fun getResponseType(): Any? = GetDatabaseSchemasRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/aggregate", Verbs="POST")
@Api(Description="Database")
@DataContract
open class AggregateRequest : CodeMashRequestBase(), IReturn<AggregateResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var pipeline:String? = null
    companion object { private val responseType = AggregateResponse::class.java }
    override fun getResponseType(): Any? = AggregateRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}/responsibility", Verbs="PUT")
@Api(Description="Database")
@DataContract
open class ChangeResponsibilityRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var newResponsibleUserId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ChangeResponsibilityRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/count", Verbs="GET")
@Api(Description="Database")
@DataContract
open class CountRequest : CodeMashRequestBase(), IReturn<CountResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var schemaVersion:Int? = null
    companion object { private val responseType = CountResponse::class.java }
    override fun getResponseType(): Any? = CountRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="DELETE")
@Api(Description="Database")
@DataContract
open class DeleteManyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var allRecords:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteManyRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="DELETE")
@Api(Description="Database")
@DataContract
open class DeleteOneRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteOneRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/distinct", Verbs="GET")
@Api(Description="Database")
@DataContract
open class DistinctRequest : CodeMashRequestBase(), IReturn<DistinctResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var field:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var schemaVersion:Int? = null
    companion object { private val responseType = DistinctResponse::class.java }
    override fun getResponseType(): Any? = DistinctRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute", Verbs="POST")
@Api(Description="Database")
@DataContract
open class ExecuteAggregateRequest : CodeMashRequestBase(), IReturn<ExecuteAggregateResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var aggregateId:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var tokens:HashMap<String,String>? = null
    companion object { private val responseType = ExecuteAggregateResponse::class.java }
    override fun getResponseType(): Any? = ExecuteAggregateRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindRequest : CodeMashListPaginationRequestBase(), IReturn<FindResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var schemaVersion:Int? = null

    @DataMember
    open var pagingArgs:PagingArgs? = null

    @DataMember
    open var sortBy:String? = null

    @DataMember
    open var sortOrder:Int? = null

    @DataMember
    open var expandReferences:Boolean? = null

    @DataMember
    open var allLanguages:Boolean? = null
    companion object { private val responseType = FindResponse::class.java }
    override fun getResponseType(): Any? = FindRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindOneRequest : CodeMashRequestBase(), IReturn<FindOneResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var expandReferences:Boolean? = null

    @DataMember
    open var allLanguages:Boolean? = null
    companion object { private val responseType = FindOneResponse::class.java }
    override fun getResponseType(): Any? = FindOneRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/own", Verbs="GET")
@Api(Description="Database")
@DataContract
open class FindOwnRequest : CodeMashListPaginationRequestBase(), IReturn<FindResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var schemaVersion:Int? = null

    @DataMember
    open var pagingArgs:PagingArgs? = null

    /**
    * Set true to get every reference value as { id, display } (display = the target's displayField per the schema; null when the target is gone). Needs read permission on every source the schema links to (users, roles, taxonomy, collection, files) — otherwise the read is refused with CM-ERRORS-DATABASE-056 naming the source. Default false returns the stored ids.
    */
    @DataMember
    @ApiMember(Description="Set true to get every reference value as { id, display } (display = the target's displayField per the schema; null when the target is gone). Needs read permission on every source the schema links to (users, roles, taxonomy, collection, files) — otherwise the read is refused with CM-ERRORS-DATABASE-056 naming the source. Default false returns the stored ids.")
    open var expandReferences:Boolean? = null

    @DataMember
    open var allLanguages:Boolean? = null
    companion object { private val responseType = FindResponse::class.java }
    override fun getResponseType(): Any? = FindOwnRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="POST")
@Api(Description="Database")
@DataContract
open class InsertManyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var documents:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = InsertManyRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}", Verbs="POST")
@Api(Description="Database")
@DataContract
open class InsertOneRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var document:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = InsertOneRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}/replace", Verbs="PUT")
@Api(Description="Database")
@DataContract
open class ReplaceOneRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var replacement:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = ReplaceOneRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/many", Verbs="PUT")
@Api(Description="Database")
@DataContract
open class UpdateManyRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var filter:String? = null

    @DataMember
    open var allRecords:Boolean? = null

    @DataMember
    open var update:String? = null

    @DataMember
    open var arrayFilters:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateManyRequest.responseType
}

/**
* Database
*/
@Route(Path="/{version}/database/collections/{collectionName}/{id}", Verbs="PUT")
@Api(Description="Database")
@DataContract
open class UpdateOneRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var collectionName:String? = null

    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var update:String? = null

    @DataMember
    open var arrayFilters:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateOneRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/commit", Verbs="POST")
@Api(Description="Files")
@DataContract
open class CommitUploadRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var sizeBytes:Long? = null

    @DataMember
    open var fileName:String? = null

    @DataMember
    open var ownerUserId:String? = null

    @DataMember
    open var reassignOwner:Boolean? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CommitUploadRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/content", Verbs="GET")
@Api(Description="Files")
@DataContract
open class GetFileContentRequest : RequestBase(), IReturn<ByteArray>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var token:String? = null
    companion object { private val responseType = ByteArray::class.java }
    override fun getResponseType(): Any? = GetFileContentRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/content", Verbs="PUT")
@Api(Description="Files")
@DataContract
open class PutFileContentRequest : RequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var token:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = PutFileContentRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}", Verbs="DELETE")
@Api(Description="Files")
@DataContract
open class DeleteFileApiRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteFileApiRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/bulk", Verbs="DELETE")
@Api(Description="Files")
@DataContract
open class DeleteManyFilesApiRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember(Name="paths[]")
    @SerializedName("paths[]")
    open var paths:ArrayList<String> = ArrayList<String>()
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteManyFilesApiRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/download", Verbs="GET")
@Api(Description="Files")
@DataContract
open class DownloadFileApiRequest : CodeMashRequestBase(), IReturn<ByteArray>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null
    companion object { private val responseType = ByteArray::class.java }
    override fun getResponseType(): Any? = DownloadFileApiRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/by-id/{id}", Verbs="GET")
@Api(Description="Files")
@DataContract
open class GetFileByIdRequest : CodeMashRequestBase(), IReturn<GetFileByIdResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var id:String? = null
    companion object { private val responseType = GetFileByIdResponse::class.java }
    override fun getResponseType(): Any? = GetFileByIdRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/info", Verbs="GET")
@Api(Description="Files")
@DataContract
open class GetFileInfoRequest : CodeMashRequestBase(), IReturn<GetFileInfoResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null
    companion object { private val responseType = GetFileInfoResponse::class.java }
    override fun getResponseType(): Any? = GetFileInfoRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/sign", Verbs="GET")
@Api(Description="Files")
@DataContract
open class GetSignedUrlRequest : CodeMashRequestBase(), IReturn<GetSignedUrlResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var expirationSeconds:Int? = null
    companion object { private val responseType = GetSignedUrlResponse::class.java }
    override fun getResponseType(): Any? = GetSignedUrlRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}", Verbs="GET")
@Api(Description="Files")
@DataContract
open class ListFilesRequest : CodeMashListPaginationRequestBase(), IReturn<ListFilesResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null
    companion object { private val responseType = ListFilesResponse::class.java }
    override fun getResponseType(): Any? = ListFilesRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/public/{PublicId}/{Name*}", Verbs="GET")
@Api(Description="Files")
@DataContract
open class GetPublicFileRequest : RequestBase(), IReturn<ByteArray>
{
    @DataMember
    open var publicId:String? = null

    @DataMember
    open var name:String? = null
    companion object { private val responseType = ByteArray::class.java }
    override fun getResponseType(): Any? = GetPublicFileRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/register", Verbs="POST")
@Api(Description="Files")
@DataContract
open class RegisterFilesRequest : CodeMashRequestBase(), IReturn<RegisterFilesResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var items:ArrayList<RegisterFileItem>? = null

    @DataMember
    open var reassignOwner:Boolean? = null

    @DataMember
    open var dryRun:Boolean? = null
    companion object { private val responseType = RegisterFilesResponse::class.java }
    override fun getResponseType(): Any? = RegisterFilesRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/upload-url", Verbs="POST")
@Api(Description="Files")
@DataContract
open class RequestUploadUrlRequest : CodeMashRequestBase(), IReturn<RequestUploadUrlResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var expirationSeconds:Int? = null

    @DataMember
    open var ownerUserId:String? = null

    @DataMember
    open var reassignOwner:Boolean? = null
    companion object { private val responseType = RequestUploadUrlResponse::class.java }
    override fun getResponseType(): Any? = RequestUploadUrlRequest.responseType
}

/**
* Files
*/
@Route(Path="/{version}/files/{filesIntegrationId}/use", Verbs="POST")
@Api(Description="Files")
@DataContract
open class UseFileRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    @DataMember
    open var filesIntegrationId:String? = null

    @DataMember
    open var path:String? = null

    @DataMember
    open var ownerUserId:String? = null

    @DataMember
    open var reassignOwner:Boolean? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UseFileRequest.responseType
}

/**
* Registers or refreshes a push device for the signed-in user.
*/
@Route(Path="/{version}/notifications/push/devices", Verbs="POST")
@Api(Description="Registers or refreshes a push device for the signed-in user.")
open class RegisterOwnPushDeviceRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * Who issued the token: fcm (Android / Firebase) or apns (iOS). The NATIVE device token — in an Expo app use getDevicePushTokenAsync(). Expo push tokens (provider 'expo') are refused.
    */
    @ApiMember(Description="Who issued the token: fcm (Android / Firebase) or apns (iOS). The NATIVE device token — in an Expo app use getDevicePushTokenAsync(). Expo push tokens (provider 'expo') are refused.", IsRequired=true)
    open var provider:String? = null

    /**
    * The push token, exactly as the provider gave it.
    */
    @ApiMember(Description="The push token, exactly as the provider gave it.", IsRequired=true)
    open var token:String? = null

    /**
    * The app's platform: ios, android or web.
    */
    @ApiMember(Description="The app's platform: ios, android or web.")
    open var platform:String? = null

    /**
    * Operating system name, e.g. iOS.
    */
    @ApiMember(Description="Operating system name, e.g. iOS.")
    open var osName:String? = null

    /**
    * Operating system version, e.g. 18.1.
    */
    @ApiMember(Description="Operating system version, e.g. 18.1.")
    open var osVersion:String? = null

    /**
    * The app version, e.g. 2.4.1.
    */
    @ApiMember(Description="The app version, e.g. 2.4.1.")
    open var appVersion:String? = null

    /**
    * The device name the user sees, e.g. Anna's iPhone.
    */
    @ApiMember(Description="The device name the user sees, e.g. Anna's iPhone.")
    open var deviceName:String? = null

    /**
    * The device model, e.g. iPhone 15.
    */
    @ApiMember(Description="The device model, e.g. iPhone 15.")
    open var modelName:String? = null

    open var brand:String? = null
    open var manufacturer:String? = null
    /**
    * A stable id the app keeps for this installation (not the token).
    */
    @ApiMember(Description="A stable id the app keeps for this installation (not the token).")
    open var installationId:String? = null

    /**
    * The device locale, e.g. lt-LT.
    */
    @ApiMember(Description="The device locale, e.g. lt-LT.")
    open var locale:String? = null

    /**
    * The device time zone (IANA), e.g. Europe/Vilnius.
    */
    @ApiMember(Description="The device time zone (IANA), e.g. Europe/Vilnius.")
    open var timeZone:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = RegisterOwnPushDeviceRequest.responseType
}

/**
* Lists the signed-in user's own push devices.
*/
@Route(Path="/{version}/notifications/push/devices", Verbs="GET")
@Api(Description="Lists the signed-in user's own push devices.")
open class GetOwnPushDevicesRequest : CodeMashRequestBase(), IReturn<GetOwnPushDevicesResponse>
{
    companion object { private val responseType = GetOwnPushDevicesResponse::class.java }
    override fun getResponseType(): Any? = GetOwnPushDevicesRequest.responseType
}

/**
* Removes one of the signed-in user's own push devices by id.
*/
@Route(Path="/{version}/notifications/push/devices/{Id}", Verbs="DELETE")
@Api(Description="Removes one of the signed-in user's own push devices by id.")
open class DeleteOwnPushDeviceRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The device id (pnd_…) from the devices list or the register answer.
    */
    @ApiMember(Description="The device id (pnd_…) from the devices list or the register answer.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteOwnPushDeviceRequest.responseType
}

/**
* Removes the signed-in user's push device registered with a token (sign-out).
*/
@Route(Path="/{version}/notifications/push/devices", Verbs="DELETE")
@Api(Description="Removes the signed-in user's push device registered with a token (sign-out).")
open class DeleteOwnPushDeviceByTokenRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The push token the device was registered with.
    */
    @ApiMember(Description="The push token the device was registered with.", IsRequired=true)
    open var token:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteOwnPushDeviceByTokenRequest.responseType
}

/**
* Lists the push messages sent to the signed-in user.
*/
@Route(Path="/{version}/notifications/push/messages", Verbs="GET")
@Api(Description="Lists the push messages sent to the signed-in user.")
open class GetOwnPushMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetOwnPushMessagesResponse>
{
    /**
    * Only messages the caller has not marked read.
    */
    @ApiMember(Description="Only messages the caller has not marked read.")
    open var unreadOnly:Boolean? = null
    companion object { private val responseType = GetOwnPushMessagesResponse::class.java }
    override fun getResponseType(): Any? = GetOwnPushMessagesRequest.responseType
}

/**
* Marks one push message sent to the signed-in user read.
*/
@Route(Path="/{version}/notifications/push/messages/{Id}/read", Verbs="POST")
@Api(Description="Marks one push message sent to the signed-in user read.")
open class MarkOwnPushMessageReadRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The message id (ntf_…) from the messages list.
    */
    @ApiMember(Description="The message id (ntf_…) from the messages list.", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MarkOwnPushMessageReadRequest.responseType
}

/**
* Marks every push message sent to the signed-in user read.
*/
@Route(Path="/{version}/notifications/push/messages/read", Verbs="POST")
@Api(Description="Marks every push message sent to the signed-in user read.")
open class MarkAllOwnPushMessagesReadRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MarkAllOwnPushMessagesReadRequest.responseType
}

/**
* Send your app's own log entries to the project's logs.
*/
@Route(Path="/{version}/logs", Verbs="POST")
@Api(Description="Send your app's own log entries to the project's logs.")
open class WriteLogs : CodeMashRequestBase(), IReturn<WriteLogsResponse>
{
    /**
    * 1–100 entries.
    */
    @ApiMember(Description="1–100 entries.", IsRequired=true)
    open var entries:ArrayList<WriteLogEntry> = ArrayList<WriteLogEntry>()
    companion object { private val responseType = WriteLogsResponse::class.java }
    override fun getResponseType(): Any? = WriteLogs.responseType
}

/**
* Stores a payment order with a fixed price for one of the project's users. Server only (service user API key).
*/
@Route(Path="/{version}/payments/orders", Verbs="POST")
@Api(Description="Stores a payment order with a fixed price for one of the project's users. Server only (service user API key).")
open class CreatePaymentOrderRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The user the order is for (usr_…).
    */
    @ApiMember(Description="The user the order is for (usr_…).", IsRequired=true)
    open var buyerUserId:String? = null

    /**
    * The project's own order reference, unique per project and environment (1–64 of A–Z a–z 0–9 . _ : -).
    */
    @ApiMember(Description="The project's own order reference, unique per project and environment (1–64 of A–Z a–z 0–9 . _ : -).", IsRequired=true)
    open var merchantReference:String? = null

    /**
    * 8–128 characters. Same key + same body = the stored order; same key + other body = 409. May be sent as the Idempotency-Key header instead.
    */
    @ApiMember(Description="8–128 characters. Same key + same body = the stored order; same key + other body = 409. May be sent as the Idempotency-Key header instead.")
    open var idempotencyKey:String? = null

    /**
    * EUR.
    */
    @ApiMember(Description="EUR.", IsRequired=true)
    open var currency:String? = null

    /**
    * The version of the price list the server priced the lines with.
    */
    @ApiMember(Description="The version of the price list the server priced the lines with.", IsRequired=true)
    open var priceVersion:String? = null

    /**
    * 1–50 lines: sku, title, quantity, unitAmountMinor (cents). Norbix computes the amounts and the total.
    */
    @ApiMember(Description="1–50 lines: sku, title, quantity, unitAmountMinor (cents). Norbix computes the amounts and the total.", IsRequired=true)
    open var lines:ArrayList<PaymentOrderLineInput> = ArrayList<PaymentOrderLineInput>()

    /**
    * Up to 20 project values (e.g. adId). No personal or billing data.
    */
    @ApiMember(Description="Up to 20 project values (e.g. adId). No personal or billing data.")
    open var metadata:HashMap<String,String>? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = CreatePaymentOrderRequest.responseType
}

/**
* Reads one payment order. A buyer reads only their own orders.
*/
@Route(Path="/{version}/payments/orders/{Id}", Verbs="GET")
@Api(Description="Reads one payment order. A buyer reads only their own orders.")
open class GetPaymentOrderRequest : CodeMashRequestBase(), IReturn<GetPaymentOrderResponse>
{
    /**
    * The order id (ord_…).
    */
    @ApiMember(Description="The order id (ord_…).", IsRequired=true)
    open var id:String? = null
    companion object { private val responseType = GetPaymentOrderResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentOrderRequest.responseType
}

/**
* Lists payment orders, newest first. A buyer gets only their own orders.
*/
@Route(Path="/{version}/payments/orders", Verbs="GET")
@Api(Description="Lists payment orders, newest first. A buyer gets only their own orders.")
open class GetPaymentOrdersRequest : CodeMashListPaginationRequestBase(), IReturn<GetPaymentOrdersResponse>
{
    /**
    * Server only: one buyer's orders (usr_…). A buyer always gets their own.
    */
    @ApiMember(Description="Server only: one buyer's orders (usr_…). A buyer always gets their own.")
    open var buyerUserId:String? = null

    /**
    * Only the order with this merchant reference.
    */
    @ApiMember(Description="Only the order with this merchant reference.")
    open var merchantReference:String? = null

    /**
    * Only orders in this status (Created, CheckoutStarted, Paid, …).
    */
    @ApiMember(Description="Only orders in this status (Created, CheckoutStarted, Paid, …).")
    open var status:String? = null
    companion object { private val responseType = GetPaymentOrdersResponse::class.java }
    override fun getResponseType(): Any? = GetPaymentOrdersRequest.responseType
}

/**
* Opens a provider checkout (Montonio or Neopay) for a stored order and answers where the buyer pays. The buyer (own order) or the server.
*/
@Route(Path="/{version}/payments/orders/{Id}/checkout", Verbs="POST")
@Api(Description="Opens a provider checkout (Montonio or Neopay) for a stored order and answers where the buyer pays. The buyer (own order) or the server.")
open class StartPaymentCheckoutRequest : CodeMashRequestBase(), IReturn<StartPaymentCheckoutResponse>
{
    /**
    * The order id (ord_…).
    */
    @ApiMember(Description="The order id (ord_…).", IsRequired=true)
    open var id:String? = null

    /**
    * The checkout integration (int_…, Montonio or Neopay) of the project in the request's environment.
    */
    @ApiMember(Description="The checkout integration (int_…, Montonio or Neopay) of the project in the request's environment.", IsRequired=true)
    open var integrationId:String? = null

    /**
    * bankLink (default), card, applePay or googlePay (the wallets: Montonio only).
    */
    @ApiMember(Description="bankLink (default), card, applePay or googlePay (the wallets: Montonio only).")
    open var method:String? = null

    /**
    * Where the buyer comes back after paying; its origin must be one of the project's allowed origins.
    */
    @ApiMember(Description="Where the buyer comes back after paying; its origin must be one of the project's allowed origins.", IsRequired=true)
    open var returnUrl:String? = null

    /**
    * Bank links only: the country whose banks are shown first (default LT).
    */
    @ApiMember(Description="Bank links only: the country whose banks are shown first (default LT).")
    open var preferredCountry:String? = null

    /**
    * Bank links only: one bank to open directly (the provider's bank code).
    */
    @ApiMember(Description="Bank links only: one bank to open directly (the provider's bank code).")
    open var preferredProvider:String? = null
    companion object { private val responseType = StartPaymentCheckoutResponse::class.java }
    override fun getResponseType(): Any? = StartPaymentCheckoutRequest.responseType
}

@Route(Path="/{version}/code/workflows/runs", Verbs="GET")
@DataContract
open class GetCodeWorkflowWaitingRuns : CodeMashListPaginationRequestBase(), IReturn<WorkflowRunsResponse>
{
    /**
    * running | waiting (default) | succeeded | failed | cancelled
    */
    @DataMember
    @ApiMember(Description="running | waiting (default) | succeeded | failed | cancelled")
    open var status:String? = null

    /**
    * approval | event | delay
    */
    @DataMember
    @ApiMember(Description="approval | event | delay")
    open var waitingKind:String? = null

    /**
    * "me" or a usr_… id: only approvals assigned to that user. Without code:read only "me" (the default then).
    */
    @DataMember
    @ApiMember(Description="\"me\" or a usr_… id: only approvals assigned to that user. Without code:read only \"me\" (the default then).")
    open var assignee:String? = null

    /**
    * Only runs of this workflow (wf_…).
    */
    @DataMember
    @ApiMember(Description="Only runs of this workflow (wf_…).")
    open var workflowId:String? = null

    /**
    * The wait's rendered key, exact match.
    */
    @DataMember
    @ApiMember(Description="The wait's rendered key, exact match.")
    open var key:String? = null
    companion object { private val responseType = WorkflowRunsResponse::class.java }
    override fun getResponseType(): Any? = GetCodeWorkflowWaitingRuns.responseType
}

@Route(Path="/{version}/code/workflows/runs/{RunId}/resume", Verbs="POST")
@DataContract
open class ResumeCodeWorkflowRun : CodeMashRequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * wfr_…
    */
    @DataMember
    @ApiMember(Description="wfr_…", IsRequired=true)
    open var runId:String? = null

    /**
    * Required when several steps wait.
    */
    @DataMember
    @ApiMember(Description="Required when several steps wait.")
    open var stepId:String? = null

    /**
    * approved | rejected — required for an approval wait.
    */
    @DataMember
    @ApiMember(Description="approved | rejected — required for an approval wait.")
    open var decision:String? = null

    @DataMember
    open var payload:HashMap<String,Object>? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = ResumeCodeWorkflowRun.responseType
}

/**
* Beta: what a workflow's one-click link will do — no sign-in, nothing changes. POST the same URL to answer.
*/
@Route(Path="/{version}/code/workflows/resume/{Token}", Verbs="GET")
@Api(Description="Beta: what a workflow's one-click link will do — no sign-in, nothing changes. POST the same URL to answer.")
@DataContract
open class OpenCodeWorkflowResumeLink : RequestBase(), IReturn<CodeWorkflowResumeLinkResponse>
{
    /**
    * The signed link token from the wait's notification (@Model.Wait.ApproveUrl / RejectUrl / ResumeUrl).
    */
    @DataMember
    @ApiMember(Description="The signed link token from the wait's notification (@Model.Wait.ApproveUrl / RejectUrl / ResumeUrl).", IsRequired=true)
    open var token:String? = null
    companion object { private val responseType = CodeWorkflowResumeLinkResponse::class.java }
    override fun getResponseType(): Any? = OpenCodeWorkflowResumeLink.responseType
}

/**
* Beta: answers a workflow's waiting step with a one-click link — no sign-in; the run goes on as the workflow's execution identity.
*/
@Route(Path="/{version}/code/workflows/resume/{Token}", Verbs="POST")
@Api(Description="Beta: answers a workflow's waiting step with a one-click link — no sign-in; the run goes on as the workflow's execution identity.")
@DataContract
open class UseCodeWorkflowResumeLink : RequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * The signed link token.
    */
    @DataMember
    @ApiMember(Description="The signed link token.", IsRequired=true)
    open var token:String? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = UseCodeWorkflowResumeLink.responseType
}

@Route(Path="/{version}/code/workflows/{Id}/runs", Verbs="GET")
@DataContract
open class GetCodeWorkflowRuns : CodeMashListPaginationRequestBase(), IReturn<WorkflowRunsResponse>
{
    /**
    * wf_…
    */
    @DataMember
    @ApiMember(Description="wf_…", IsRequired=true)
    open var id:String? = null

    /**
    * running | waiting | succeeded | failed | cancelled
    */
    @DataMember
    @ApiMember(Description="running | waiting | succeeded | failed | cancelled")
    open var status:String? = null

    @DataMember
    open var from:Date? = null

    @DataMember
    open var to:Date? = null
    companion object { private val responseType = WorkflowRunsResponse::class.java }
    override fun getResponseType(): Any? = GetCodeWorkflowRuns.responseType
}

@Route(Path="/{version}/code/workflows/runs/{RunId}", Verbs="GET")
@DataContract
open class GetCodeWorkflowRun : CodeMashRequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * wfr_…
    */
    @DataMember
    @ApiMember(Description="wfr_…", IsRequired=true)
    open var runId:String? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = GetCodeWorkflowRun.responseType
}

@Route(Path="/{version}/code/workflows/runs/{RunId}/logs", Verbs="GET")
@DataContract
open class GetCodeWorkflowRunLogs : CodeMashListPaginationRequestBase(), IReturn<WorkflowRunLogsResponse>
{
    /**
    * wfr_…
    */
    @DataMember
    @ApiMember(Description="wfr_…", IsRequired=true)
    open var runId:String? = null

    /**
    * Only this step's lines.
    */
    @DataMember
    @ApiMember(Description="Only this step's lines.")
    open var stepId:String? = null

    /**
    * Information | Warning | Error
    */
    @DataMember
    @ApiMember(Description="Information | Warning | Error")
    open var level:String? = null
    companion object { private val responseType = WorkflowRunLogsResponse::class.java }
    override fun getResponseType(): Any? = GetCodeWorkflowRunLogs.responseType
}

@Route(Path="/{version}/code/workflows/{Id}/resume", Verbs="POST")
@DataContract
open class ResumeCodeWorkflowRunByKey : CodeMashRequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * wf_…
    */
    @DataMember
    @ApiMember(Description="wf_…", IsRequired=true)
    open var id:String? = null

    /**
    * The wait's rendered key.
    */
    @DataMember
    @ApiMember(Description="The wait's rendered key.", IsRequired=true)
    open var key:String? = null

    @DataMember
    open var stepId:String? = null

    /**
    * approved | rejected — required for an approval wait.
    */
    @DataMember
    @ApiMember(Description="approved | rejected — required for an approval wait.")
    open var decision:String? = null

    @DataMember
    open var payload:HashMap<String,Object>? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = ResumeCodeWorkflowRunByKey.responseType
}

@Route(Path="/{version}/code/workflows/runs/{RunId}/retry", Verbs="POST")
@DataContract
open class RetryCodeWorkflowRunStep : CodeMashRequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * wfr_…
    */
    @DataMember
    @ApiMember(Description="wfr_…", IsRequired=true)
    open var runId:String? = null

    /**
    * The failed step; default = the step named in the run's error.
    */
    @DataMember
    @ApiMember(Description="The failed step; default = the step named in the run's error.")
    open var stepId:String? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = RetryCodeWorkflowRunStep.responseType
}

@Route(Path="/{version}/code/workflows/runs/{RunId}/cancel", Verbs="POST")
@DataContract
open class CancelCodeWorkflowRun : CodeMashRequestBase(), IReturn<WorkflowRunResponse>
{
    /**
    * wfr_…
    */
    @DataMember
    @ApiMember(Description="wfr_…", IsRequired=true)
    open var runId:String? = null

    @DataMember
    open var reason:String? = null
    companion object { private val responseType = WorkflowRunResponse::class.java }
    override fun getResponseType(): Any? = CancelCodeWorkflowRun.responseType
}

@Route(Path="/{version}/notifications/inbox", Verbs="GET")
open class GetNotificationInboxRequest : CodeMashListPaginationRequestBase(), IReturn<GetNotificationInboxResponse>
{
    open var unreadOnly:Boolean? = null
    open var channel:String? = null
    companion object { private val responseType = GetNotificationInboxResponse::class.java }
    override fun getResponseType(): Any? = GetNotificationInboxRequest.responseType
}

@Route(Path="/{version}/notifications/inbox/unread-count", Verbs="GET")
open class GetUnreadCountRequest : CodeMashRequestBase(), IReturn<GetUnreadCountResponse>
{
    companion object { private val responseType = GetUnreadCountResponse::class.java }
    override fun getResponseType(): Any? = GetUnreadCountRequest.responseType
}

@Route(Path="/{version}/notifications/inbox/{notificationId}/read", Verbs="POST")
open class MarkNotificationReadRequest : CodeMashRequestBase(), IReturn<MarkNotificationReadResponse>
{
    open var notificationId:String? = null
    companion object { private val responseType = MarkNotificationReadResponse::class.java }
    override fun getResponseType(): Any? = MarkNotificationReadRequest.responseType
}

@Route(Path="/{version}/notifications/inbox/read-all", Verbs="POST")
open class MarkAllNotificationsReadRequest : CodeMashRequestBase(), IReturn<MarkAllNotificationsReadResponse>
{
    companion object { private val responseType = MarkAllNotificationsReadResponse::class.java }
    override fun getResponseType(): Any? = MarkAllNotificationsReadRequest.responseType
}

/**
* Sets or removes one user's own end-user AI plan
*/
@Route(Path="/{version}/membership/users/{userId}/ai-plan", Verbs="PUT")
@Api(Description="Sets or removes one user's own end-user AI plan")
open class SetUserAiPlan : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The human user id (ct_…).
    */
    @ApiMember(Description="The human user id (ct_…).", IsRequired=true)
    open var userId:String? = null

    /**
    * The plan id (aip_…). Empty removes the user's own plan.
    */
    @ApiMember(Description="The plan id (aip_…). Empty removes the user's own plan.")
    open var planId:String? = null

    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = SetUserAiPlan.responseType
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

    /**
    * Tags to put on the new contact — free labels campaigns and segments select by, normalised like any tag.
    */
    @ApiMember(Description="Tags to put on the new contact — free labels campaigns and segments select by, normalised like any tag.")
    open var tags:ArrayList<String>? = null
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
    * The contact id (ct_…) to fetch, or a login id (usr_…) — then the contact that owns that login is returned. Get it from get_all_contacts.
    */
    @ApiMember(Description="The contact id (ct_…) to fetch, or a login id (usr_…) — then the contact that owns that login is returned. Get it from get_all_contacts.", IsRequired=true)
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

    /**
    * Free text, case-insensitive: matches the email, phone, display / first / last / full name, or any login's user name or email.
    */
    @ApiMember(Description="Free text, case-insensitive: matches the email, phone, display / first / last / full name, or any login's user name or email.")
    open var search:String? = null

    /**
    * Case-insensitive part of the email (primary email or any login's email).
    */
    @ApiMember(Description="Case-insensitive part of the email (primary email or any login's email).")
    open var email:String? = null

    /**
    * Case-insensitive part of any login's user name.
    */
    @ApiMember(Description="Case-insensitive part of any login's user name.")
    open var userName:String? = null

    /**
    * Login status names, any of: Registered, PendingValidation, Active, Unregistered, Suspended, InActive, Blocked.
    */
    @ApiMember(Description="Login status names, any of: Registered, PendingValidation, Active, Unregistered, Suspended, InActive, Blocked.")
    open var statuses:ArrayList<String>? = null

    /**
    * Login type names, any of: Service, Email, UserName, Phone, Guest, Social.
    */
    @ApiMember(Description="Login type names, any of: Service, Email, UserName, Phone, Guest, Social.")
    open var types:ArrayList<String>? = null

    /**
    * Composite project-role ids (pr_{project}_nr_{role}); the contact holds any of them.
    */
    @ApiMember(Description="Composite project-role ids (pr_{project}_nr_{role}); the contact holds any of them.")
    open var roleNames:ArrayList<String>? = null
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
* Repair contact roles from their logins
*/
@Route(Path="/{version}/membership/users/repair-roles", Verbs="POST")
@Api(Description="Repair contact roles from their logins")
open class RepairContactRolesRequest : CodeMashRequestBase(), IReturn<RepairContactRolesResponse>
{
    /**
    * True = only count what would change. False = write. Empty = true (only count).
    */
    @ApiMember(Description="True = only count what would change. False = write. Empty = true (only count).")
    open var dryRun:Boolean? = null
    companion object { private val responseType = RepairContactRolesResponse::class.java }
    override fun getResponseType(): Any? = RepairContactRolesRequest.responseType
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

@Route(Path="/{version}/files/item/private", Verbs="POST")
open class MakeFilePrivateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The files integration the file lives on.
    */
    @ApiMember(Description="The files integration the file lives on.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * Path of the file, relative to the integration.
    */
    @ApiMember(Description="Path of the file, relative to the integration.", IsRequired=true)
    open var path:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MakeFilePrivateRequest.responseType
}

@Route(Path="/{version}/files/item/public", Verbs="POST")
open class MakeFilePublicRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The files integration the file lives on.
    */
    @ApiMember(Description="The files integration the file lives on.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * Path of the file to publish, relative to the integration.
    */
    @ApiMember(Description="Path of the file to publish, relative to the integration.", IsRequired=true)
    open var path:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = MakeFilePublicRequest.responseType
}

@Route(Path="/{version}/files/folder/private", Verbs="POST")
open class MakeFolderPrivateRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The files integration the folder lives on.
    */
    @ApiMember(Description="The files integration the folder lives on.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * Folder prefix, relative to the integration.
    */
    @ApiMember(Description="Folder prefix, relative to the integration.", IsRequired=true)
    open var path:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = MakeFolderPrivateRequest.responseType
}

@Route(Path="/{version}/files/folder/public", Verbs="POST")
open class MakeFolderPublicRequest : CodeMashRequestBase(), IReturn<IdResponse>
{
    /**
    * The files integration the folder lives on.
    */
    @ApiMember(Description="The files integration the folder lives on.", IsRequired=true)
    open var filesIntegrationId:String? = null

    /**
    * Folder prefix to publish, relative to the integration.
    */
    @ApiMember(Description="Folder prefix to publish, relative to the integration.", IsRequired=true)
    open var path:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = MakeFolderPublicRequest.responseType
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

    /**
    * Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.
    */
    @DataMember
    @ApiMember(Description="Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.")
    open var sendNow:Boolean? = null
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
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
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
    * The email campaign id to list batches for. Get it from get_email_campaigns.
    */
    @ApiMember(Description="The email campaign id to list batches for. Get it from get_email_campaigns.", IsRequired=true)
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
    * The email campaign id. Get it from get_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_email_campaigns.", IsRequired=true)
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
    * The email campaign id. Get it from get_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_email_campaigns.", IsRequired=true)
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
    * The email campaign id to get statistics for. Get it from get_email_campaigns.
    */
    @ApiMember(Description="The email campaign id to get statistics for. Get it from get_email_campaigns.", IsRequired=true)
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
    * The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).
    */
    @ApiMember(Description="The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).")
    open var hash:String? = null

    /**
    * Signed-in preview by id: the project id. With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the project id. With a hash it must match the hash.")
    open var projectId:String? = null

    /**
    * Signed-in preview by id: the notification id (needs email:read). With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the notification id (needs email:read). With a hash it must match the hash.")
    open var notificationId:String? = null
    companion object { private val responseType = PreviewEmailNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewEmailNotification.responseType
}

/**
* Retries the failed recipients of an email campaign
*/
@Route(Path="/{version}/notifications/email/campaigns/{Id}/retry-failed", Verbs="POST")
@Api(Description="Retries the failed recipients of an email campaign")
@DataContract
open class RetryFailedEmailNotificationsRequest : CodeMashRequestBase(), IReturn<RetryFailedEmailNotificationsResponse>
{
    /**
    * The campaign id. Get it from get_email_campaigns.
    */
    @DataMember
    @ApiMember(Description="The campaign id. Get it from get_email_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @DataMember
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).
    */
    @DataMember
    @ApiMember(Description="Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).", IsRequired=true)
    open var idempotencyKey:String? = null

    /**
    * Optional. Only these notification ids. Default: every failed recipient of the campaign.
    */
    @DataMember
    @ApiMember(Description="Optional. Only these notification ids. Default: every failed recipient of the campaign.")
    open var notificationIds:ArrayList<String>? = null

    /**
    * Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.
    */
    @DataMember
    @ApiMember(Description="Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.")
    open var includeAmbiguous:Boolean? = null

    /**
    * Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).
    */
    @DataMember
    @ApiMember(Description="Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).")
    open var categories:ArrayList<String>? = null
    companion object { private val responseType = RetryFailedEmailNotificationsResponse::class.java }
    override fun getResponseType(): Any? = RetryFailedEmailNotificationsRequest.responseType
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
* Get email campaign messages
*/
@Route(Path="/{version}/notifications/emails/campaigns/{campaignId}/messages", Verbs="GET")
@Api(Description="Get email campaign messages")
open class GetEmailCampaignMessagesRequest : CodeMashListPaginationRequestBase(), IReturn<GetEmailCampaignMessagesResponse>
{
    /**
    * The email campaign id. Get it from get_email_campaigns.
    */
    @ApiMember(Description="The email campaign id. Get it from get_email_campaigns.", IsRequired=true)
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
    * SMS provider integration id the campaign sends through — pick one with get_sms_integrations (the project default unless the user named another). Required; never invent it.
    */
    @DataMember
    @ApiMember(Description="SMS provider integration id the campaign sends through — pick one with get_sms_integrations (the project default unless the user named another). Required; never invent it.", IsRequired=true)
    open var integrationId:String? = null

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

    /**
    * For deliveryType 'AccountUsers'. JSON object: {"recipientsSourceType":"AccountUsers","recipients":[<account owner / team member ids>],"campaignTime":<unix seconds UTC>}. Members without a phone number are skipped.
    */
    @DataMember
    @ApiMember(Description="For deliveryType 'AccountUsers'. JSON object: {\"recipientsSourceType\":\"AccountUsers\",\"recipients\":[<account owner / team member ids>],\"campaignTime\":<unix seconds UTC>}. Members without a phone number are skipped.")
    open var accountUsers:SmsToAccountUsersDeliverySettingsDto? = null

    @DataMember
    open var collection:SmsToCollectionRecordsDeliverySettingsDto? = null

    /**
    * For deliveryType 'PhoneNumbers'. JSON object: {"recipientsSourceType":"PhoneNumbers","phoneNumbers":["+37060000000"],"campaignTime":<unix seconds UTC>}. Numbers in international format.
    */
    @DataMember
    @ApiMember(Description="For deliveryType 'PhoneNumbers'. JSON object: {\"recipientsSourceType\":\"PhoneNumbers\",\"phoneNumbers\":[\"+37060000000\"],\"campaignTime\":<unix seconds UTC>}. Numbers in international format.")
    open var phoneNumbers:SmsToPhoneNumbersDeliverySettingsDto? = null

    /**
    * Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.
    */
    @DataMember
    @ApiMember(Description="Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.")
    open var sendNow:Boolean? = null
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
    * Optional: return only the campaign with this id.
    */
    @ApiMember(Description="Optional: return only the campaign with this id.")
    open var campaignId:String? = null

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
    * The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).
    */
    @ApiMember(Description="The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).")
    open var hash:String? = null

    /**
    * Signed-in preview by id: the project id. With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the project id. With a hash it must match the hash.")
    open var projectId:String? = null

    /**
    * Signed-in preview by id: the notification id (needs sms:read). With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the notification id (needs sms:read). With a hash it must match the hash.")
    open var notificationId:String? = null
    companion object { private val responseType = PreviewSmsNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewSmsNotification.responseType
}

/**
* Retries the failed recipients of an SMS campaign
*/
@Route(Path="/{version}/notifications/sms/campaigns/{Id}/retry-failed", Verbs="POST")
@Api(Description="Retries the failed recipients of an SMS campaign")
@DataContract
open class RetryFailedSmsNotificationsRequest : CodeMashRequestBase(), IReturn<RetryFailedSmsNotificationsResponse>
{
    /**
    * The campaign id. Get it from get_sms_campaigns.
    */
    @DataMember
    @ApiMember(Description="The campaign id. Get it from get_sms_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @DataMember
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).
    */
    @DataMember
    @ApiMember(Description="Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).", IsRequired=true)
    open var idempotencyKey:String? = null

    /**
    * Optional. Only these notification ids. Default: every failed recipient of the campaign.
    */
    @DataMember
    @ApiMember(Description="Optional. Only these notification ids. Default: every failed recipient of the campaign.")
    open var notificationIds:ArrayList<String>? = null

    /**
    * Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.
    */
    @DataMember
    @ApiMember(Description="Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.")
    open var includeAmbiguous:Boolean? = null

    /**
    * Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).
    */
    @DataMember
    @ApiMember(Description="Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).")
    open var categories:ArrayList<String>? = null
    companion object { private val responseType = RetryFailedSmsNotificationsResponse::class.java }
    override fun getResponseType(): Any? = RetryFailedSmsNotificationsRequest.responseType
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

/**
* Count the devices a push campaign audience would reach
*/
@Route(Path="/{version}/notifications/push/campaigns/audience-count", Verbs="POST")
@Api(Description="Count the devices a push campaign audience would reach")
@DataContract
open class GetPushCampaignAudienceCountRequest : CodeMashRequestBase(), IReturn<GetPushCampaignAudienceCountResponse>
{
    /**
    * The audience, in the same shape as CreatePushCampaignRequest.campaign. Template and send options are ignored.
    */
    @DataMember
    @ApiMember(Description="The audience, in the same shape as CreatePushCampaignRequest.campaign. Template and send options are ignored.")
    open var campaign:PushCampaignRequest? = null

    /**
    * Optional. When omitted, the default database integration for the request's environment is used.
    */
    @DataMember
    @ApiMember(Description="Optional. When omitted, the default database integration for the request's environment is used.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetPushCampaignAudienceCountResponse::class.java }
    override fun getResponseType(): Any? = GetPushCampaignAudienceCountRequest.responseType
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

    /**
    * Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.
    */
    @DataMember
    @ApiMember(Description="Optional. true sends the campaign now (or at a campaignTime sooner than the review window). Without it, a campaign created by an AI tool must be scheduled at least 24 hours ahead for role-based / all-users / collection audiences and at least 1 hour ahead for direct recipient lists, or it is rejected with CM-ERRORS-CAMPAIGNS-017. Set it only when the user explicitly asked to send now.")
    open var sendNow:Boolean? = null
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
    /**
    * The push campaign id to delete. Get it from get_push_campaigns.
    */
    @DataMember
    @ApiMember(Description="The push campaign id to delete. Get it from get_push_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
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
    * The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).
    */
    @ApiMember(Description="The signed preview link hash. With it the preview opens without sign-in: exactly one notification, until the link expires (30 days after sending).")
    open var hash:String? = null

    /**
    * Signed-in preview by id: the project id. With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the project id. With a hash it must match the hash.")
    open var projectId:String? = null

    /**
    * Signed-in preview by id: the notification id (needs push:read). With a hash it must match the hash.
    */
    @ApiMember(Description="Signed-in preview by id: the notification id (needs push:read). With a hash it must match the hash.")
    open var notificationId:String? = null
    companion object { private val responseType = PreviewPushNotificationResponse::class.java }
    override fun getResponseType(): Any? = PreviewPushNotification.responseType
}

/**
* Retries the failed recipients of a push campaign
*/
@Route(Path="/{version}/notifications/push/campaigns/{Id}/retry-failed", Verbs="POST")
@Api(Description="Retries the failed recipients of a push campaign")
@DataContract
open class RetryFailedPushNotificationsRequest : CodeMashRequestBase(), IReturn<RetryFailedPushNotificationsResponse>
{
    /**
    * The campaign id. Get it from get_push_campaigns.
    */
    @DataMember
    @ApiMember(Description="The campaign id. Get it from get_push_campaigns.", IsRequired=true)
    open var id:String? = null

    /**
    * Optional. Omit to use the project default database integration (resolved per environment).
    */
    @DataMember
    @ApiMember(Description="Optional. Omit to use the project default database integration (resolved per environment).")
    open var databaseIntegrationId:String? = null

    /**
    * Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).
    */
    @DataMember
    @ApiMember(Description="Your key for this request, at most 64 characters. The same key again returns the first answer and sends nothing; the same key with another body is refused (409).", IsRequired=true)
    open var idempotencyKey:String? = null

    /**
    * Optional. Only these notification ids. Default: every failed recipient of the campaign.
    */
    @DataMember
    @ApiMember(Description="Optional. Only these notification ids. Default: every failed recipient of the campaign.")
    open var notificationIds:ArrayList<String>? = null

    /**
    * Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.
    */
    @DataMember
    @ApiMember(Description="Optional, default false. Also retry recipients whose failure is Ambiguous (a timeout after the request was sent) — this MAY SEND A DUPLICATE.")
    open var includeAmbiguous:Boolean? = null

    /**
    * Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).
    */
    @DataMember
    @ApiMember(Description="Optional. Only these failure classes: Transient, Permanent, Unknown. Default: all three (Ambiguous only through includeAmbiguous).")
    open var categories:ArrayList<String>? = null
    companion object { private val responseType = RetryFailedPushNotificationsResponse::class.java }
    override fun getResponseType(): Any? = RetryFailedPushNotificationsRequest.responseType
}

/**
* Stops a running push campaign
*/
@Route(Path="/{version}/notifications/push/campaigns/{Id}/stop", Verbs="POST")
@Api(Description="Stops a running push campaign")
@DataContract
open class StopPushCampaignRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    /**
    * The campaign id to stop.
    */
    @DataMember
    @ApiMember(Description="The campaign id to stop.")
    open var id:String? = null

    /**
    * Optional database integration id; omit to use the project's default.
    */
    @DataMember
    @ApiMember(Description="Optional database integration id; omit to use the project's default.")
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = StopPushCampaignRequest.responseType
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

open class EchoResponse
{
    open var release:CodeMashRelease? = null
    open var runtime:CodeMashRuntime? = null
    open var managedServiceHubUrl:String? = null
    open var managedServiceApiUrl:String? = null
    open var hubUrl:String? = null
    open var apiUrl:String? = null
    open var apiVersion:String? = null
    open var hubVersion:String? = null
    open var adminUrlTemplate:String? = null
    open var emailServiceConfigured:Boolean? = null
    open var rootBootstrapPasswordSource:String? = null
    open var regions:ArrayList<EchoRegionDto>? = null
    open var agent:EchoAgentDto? = null
    open var hostingPlatform:EchoHostingPlatformDto? = null
    open var connect:EchoConnectDto? = null
    open var keyless:EchoKeylessDto? = null
}

open class PublicProjectConfigDto
{
    open var displayName:String? = null
    open var adminPortalEnabled:Boolean? = null
    open var branding:PublicBrandDto? = null
    open var auth:PublicAuthDto? = null
    open var aiChat:PublicAiChatDto? = null
}

open class PublicLegalDocumentDto
{
    open var kind:String? = null
    open var title:String? = null
    open var body:String? = null
    open var available:Boolean? = null
}

@DataContract
open class IdResponse : ResponseBase()
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var status:String? = null

    @DataMember
    open var warnings:ArrayList<String>? = null
}

open class ListEndUserChatAttachmentsResponse : ResponseBase()
{
    open var attachments:ArrayList<EndUserChatAttachment> = ArrayList<EndUserChatAttachment>()
}

open class EmptyResponse : ResponseBase()
{
}

open class ListEndUserChatMemoryResponse : ResponseBase()
{
    open var notes:ArrayList<EndUserChatMemoryNote> = ArrayList<EndUserChatMemoryNote>()
}

open class GetEndUserChatAvailabilityResponse : ResponseBase()
{
    open var enabled:Boolean? = null
    open var available:Boolean? = null
    open var reason:String? = null
    open var defaultAssistantId:String? = null
    open var assistants:ArrayList<EndUserChatAssistant> = ArrayList<EndUserChatAssistant>()
    open var plan:EndUserChatPlan? = null
}

open class ListEndUserChatSessionsResponse : ResponseBase()
{
    open var sessions:ArrayList<EndUserChatSession> = ArrayList<EndUserChatSession>()
}

open class GetEndUserChatSessionResponse : ResponseBase()
{
    open var session:EndUserChatSession? = null
}

open class GetEndUserChatEntriesResponse : ResponseBase()
{
    open var sessionId:String? = null
    open var entries:ArrayList<AiChatEntryWireDto> = ArrayList<AiChatEntryWireDto>()
    open var lastSeq:Long? = null
    open var hasMore:Boolean? = null
}

open class StartEndUserChatTurnResponse : ResponseBase()
{
    open var turnId:String? = null
    open var sessionId:String? = null
    open var channel:String? = null
}

open class GetEndUserAiToolsResponse : ResponseBase()
{
    open var tools:ArrayList<EndUserAiTool>? = null
}

open class InvokeEndUserAiToolResponse : ResponseBase()
{
    open var result:String? = null
}

@DataContract
open class SaveGuestUserResponse : IdResponse()
{
    @DataMember
    open var userName:String? = null

    @DataMember
    open var password:String? = null
}

open class GetUserResponse : ResponseBase()
{
    open var user:AuthDto? = null
}

open class GetUsersResponse : ResponseBase()
{
    open var list:PaginatedResponse<AuthDto>? = null
}

open class GetUserPreferencesResponse : ResponseBase()
{
    open var preferences:UserMarketingPreferencesDto? = null
}

@DataContract
open class CredentialChangedResponse : ResponseBase()
{
    @DataMember
    open var authId:String? = null

    @DataMember
    open var credentialVersion:String? = null
}

open class PasskeyOkResponse : ResponseBase()
{
}

@DataContract
open class SendTestPasswordResetResponse : ResponseBase()
{
    @DataMember
    open var queued:Boolean? = null

    @DataMember
    open var reason:String? = null

    @DataMember
    open var env:String? = null

    @DataMember
    open var correlationId:String? = null

    @DataMember
    open var expiresAtUtc:Date? = null

    @DataMember
    open var integrationId:String? = null

    @DataMember
    open var integrationName:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var integrationProblem:String? = null

    @DataMember
    open var templateId:String? = null

    @DataMember
    open var templateName:String? = null

    @DataMember
    open var templateSource:String? = null

    @DataMember
    open var language:String? = null

    @DataMember
    open var languageRule:String? = null

    @DataMember
    open var templateLanguages:ArrayList<String>? = null

    @DataMember
    open var fallback:String? = null

    @DataMember
    open var mjmlRenderer:String? = null
}

open class PasskeyCeremonyOptionsResponse : ResponseBase()
{
    open var ceremonyId:String? = null
    open var optionsJson:String? = null
}

open class PasskeyAuthTokensResponse : ResponseBase()
{
    open var accessToken:String? = null
    open var refreshToken:String? = null
    open var expiresInSeconds:Int? = null
    open var recoveryCodes:ArrayList<String>? = null
}

open class PasskeyListResponse : ResponseBase()
{
    open var passkeys:ArrayList<PasskeyListItemDto> = ArrayList<PasskeyListItemDto>()
}

open class PasskeyRecoveryResponse : ResponseBase()
{
    open var accessToken:String? = null
    open var refreshToken:String? = null
    open var expiresInSeconds:Int? = null
    open var remainingCodes:Int? = null
}

open class PasskeyVerificationTokenResponse : ResponseBase()
{
    open var verificationToken:String? = null
}

open class FindMergedTermTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TermTreeDto>? = null
}

open class FindTaxonomyTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TaxonomyTreeDto>? = null
}

open class FindTermsResponse : ResponseBase()
{
    open var list:PaginatedResponse<TermDto>? = null
}

open class FindTermsChildrenResponse : ResponseBase()
{
    open var list:PaginatedResponse<TermDto>? = null
}

open class FindTermTreeResponse : ResponseBase()
{
    open var tree:ArrayList<TermTreeDto>? = null
}

open class GetDatabaseSchemaResponse : ResponseBase()
{
    open var item:SchemaDto? = null
}

open class GetDatabaseSchemasResponse : ResponseBase()
{
    open var list:PaginatedResponse<SchemaListProjection>? = null
}

open class AggregateResponse : ResponseBase()
{
    open var result:ArrayList<Object>? = null
}

open class CountResponse : ResponseBase()
{
    open var count:Long? = null
}

open class DistinctResponse : ResponseBase()
{
    open var values:ArrayList<Object>? = null
}

open class ExecuteAggregateResponse : ResponseBase()
{
    open var result:ArrayList<Object>? = null
}

open class FindResponse : ResponseBase()
{
    open var list:PaginatedResponse<Object>? = null
}

open class FindOneResponse : ResponseBase()
{
    open var result:Object? = null
}

open class GetFileByIdResponse : ResponseBase()
{
    open var file:FileResourceRefDto? = null
    open var isPublic:Boolean? = null
    open var publicUrl:String? = null
}

open class GetFileInfoResponse : ResponseBase()
{
    open var file:FileResourceRefDto? = null
    open var isPublic:Boolean? = null
    open var publicUrl:String? = null
}

open class GetSignedUrlResponse : ResponseBase()
{
    open var url:String? = null
}

open class ListFilesResponse : ResponseBase()
{
    open var list:PaginatedResponse<FileResourceRefDto>? = null
    open var folders:IList<String>? = null
    open var publicFolders:IList<PublicFolderDto>? = null
}

open class RegisterFilesResponse : ResponseBase()
{
    open var dryRun:Boolean? = null
    open var registered:Int? = null
    open var unchanged:Int? = null
    open var failed:Int? = null
    open var items:ArrayList<RegisterFileResult>? = null
}

open class RequestUploadUrlResponse : ResponseBase()
{
    open var url:String? = null
}

open class GetOwnPushDevicesResponse : ResponseBase()
{
    open var items:ArrayList<OwnPushDeviceDto> = ArrayList<OwnPushDeviceDto>()
}

open class GetOwnPushMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<OwnPushMessageDto>? = null
}

open class WriteLogsResponse : ResponseBase()
{
    open var accepted:Int? = null
}

open class GetPaymentOrderResponse : ResponseBase()
{
    open var item:PaymentOrderDto? = null
}

open class GetPaymentOrdersResponse : ResponseBase()
{
    open var list:PaginatedResponse<PaymentOrderDto>? = null
}

open class StartPaymentCheckoutResponse : ResponseBase()
{
    open var checkout:PaymentOrderCheckoutDto? = null
    open var reused:Boolean? = null
    open var order:PaymentOrderDto? = null
}

@DataContract
open class WorkflowRunsResponse : ResponseBase()
{
    @DataMember
    open var list:PaginatedResponse<WorkflowRunListProjection>? = null
}

@DataContract
open class WorkflowRunResponse : ResponseBase()
{
    @DataMember
    open var run:WorkflowRunDto? = null
}

@DataContract
open class CodeWorkflowResumeLinkResponse : ResponseBase()
{
    @DataMember
    open var runId:String? = null

    @DataMember
    open var workflowId:String? = null

    @DataMember
    open var workflowName:String? = null

    @DataMember
    open var stepId:String? = null

    @DataMember
    open var stepName:String? = null

    @DataMember
    open var mode:String? = null

    @DataMember
    open var decision:String? = null

    @DataMember
    open var key:String? = null

    @DataMember
    open var assigneeUserId:String? = null

    @DataMember
    open var expiresAt:Date? = null
}

@DataContract
open class WorkflowRunLogsResponse : ResponseBase()
{
    @DataMember
    open var list:PaginatedResponse<TenantLogEntryDto>? = null
}

open class GetNotificationInboxResponse : ResponseBase()
{
    open var list:PaginatedResponse<InAppNotificationDto>? = null
}

open class GetUnreadCountResponse : ResponseBase()
{
    open var count:Long? = null
}

open class MarkNotificationReadResponse : ResponseBase()
{
}

open class MarkAllNotificationsReadResponse : ResponseBase()
{
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

open class RepairContactRolesResponse : ResponseBase()
{
    open var result:ContactRolesRepairDto? = null
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
    open var publicFolders:IList<PublicFolderDto>? = null
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

@DataContract
open class RetryFailedEmailNotificationsResponse : ResponseBase()
{
    @DataMember
    open var retryRequestId:String? = null

    @DataMember
    open var selected:Int? = null

    @DataMember
    open var skipped:HashMap<String,Int>? = null

    @DataMember
    open var replayed:Boolean? = null

    @DataMember
    open var warning:String? = null
}

open class GetEmailCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<EmailCampaignBatchNotificationDto>? = null
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

@DataContract
open class RetryFailedSmsNotificationsResponse : ResponseBase()
{
    @DataMember
    open var retryRequestId:String? = null

    @DataMember
    open var selected:Int? = null

    @DataMember
    open var skipped:HashMap<String,Int>? = null

    @DataMember
    open var replayed:Boolean? = null

    @DataMember
    open var warning:String? = null
}

open class GetSmsCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<SmsCampaignBatchNotificationDto>? = null
}

open class GetPushCampaignAudienceCountResponse : ResponseBase()
{
    open var result:PushAudienceCountDto? = null
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

@DataContract
open class RetryFailedPushNotificationsResponse : ResponseBase()
{
    @DataMember
    open var retryRequestId:String? = null

    @DataMember
    open var selected:Int? = null

    @DataMember
    open var skipped:HashMap<String,Int>? = null

    @DataMember
    open var replayed:Boolean? = null

    @DataMember
    open var warning:String? = null
}

open class GetPushCampaignMessagesResponse : ResponseBase()
{
    open var list:PaginatedResponse<PushCampaignBatchNotificationDto>? = null
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

    @DataMember
    @SerializedName("default") open var Default:String? = null

    @DataMember
    open var unique:Boolean? = null
}

open class DecimalFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:BigDecimal? = null

    @DataMember
    open var maximum:BigDecimal? = null

    @DataMember
    open var multipleOf:BigDecimal? = null

    @DataMember
    @SerializedName("default") open var Default:BigDecimal? = null

    @DataMember
    open var unique:Boolean? = null
}

open class CurrencyFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var allowedCurrencies:IReadOnlyList<String>? = null

    @DataMember
    open var multipleOf:BigDecimal? = null

    @DataMember
    open var minimum:BigDecimal? = null

    @DataMember
    open var maximum:BigDecimal? = null

    @DataMember
    @SerializedName("default") open var Default:CurrencyDefaultDto? = null
}

open class BooleanFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    @SerializedName("default") open var Default:Boolean? = null
}

open class DateFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:Long? = null

    @DataMember
    open var maximum:Long? = null

    @DataMember
    @SerializedName("default") open var Default:Long? = null
}

open class IntegerFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minimum:Long? = null

    @DataMember
    open var maximum:Long? = null

    @DataMember
    @SerializedName("default") open var Default:Long? = null

    @DataMember
    open var unique:Boolean? = null
}

open class GeolocationFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var allowedTypes:IReadOnlyList<String>? = null
}

open class TagsFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var minItems:Int? = null

    @DataMember
    open var maxItems:Int? = null

    @DataMember
    @SerializedName("default") open var Default:IReadOnlyList<String>? = null
}

open class FileFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var storages:IReadOnlyList<String>? = null

    @DataMember
    open var minItems:Int? = null

    @DataMember
    open var maxItems:Int? = null

    @DataMember
    open var allowedFileType:String? = null

    @DataMember
    open var maxSizeMb:BigDecimal? = null
}

open class TaxonomySelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var taxonomyId:String? = null

    @DataMember
    open var multiple:Boolean? = null

    @DataMember
    open var displayField:String? = null
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

    @DataMember
    open var displayField:String? = null
}

open class RoleSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var multiple:Boolean? = null

    @DataMember
    open var displayField:String? = null
}

open class EnumSelectionFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var values:IReadOnlyList<String>? = null

    @DataMember
    open var multiple:Boolean? = null

    @DataMember
    @SerializedName("default") open var Default:IReadOnlyList<String>? = null
}

open class ObjectFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var properties:IReadOnlyList<JsonSchemaFieldDto>? = null

    @DataMember
    open var required:IReadOnlyList<String>? = null
}

open class ArrayFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var items:JsonSchemaFieldDto? = null

    @DataMember
    open var minItems:Int? = null

    @DataMember
    open var maxItems:Int? = null

    @DataMember
    open var uniqueItems:Boolean? = null
}

open class JsonFieldDto : JsonSchemaFieldDto()
{
    @DataMember
    open var maxBytes:Int? = null
}

@DataContract(Namespace="http://codemash.io/types/")
open class RequestBase : IVersionBasedRequest, IHasCorrelationIdRequest
{
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

interface IVersionBasedRequest
{
    var version:String?
}

interface IHasCorrelationIdRequest
{
    var correlationId:UUID?
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

@DataContract
open class SaveUserWithRolesBase : SaveUser()
{
    @DataMember
    open var roles:ArrayList<String> = ArrayList<String>()

    /**
    * Tags to put on the new user's contact (free labels campaigns and segments select by, normalised like any tag). Only here, on the routes that need membership:create — a public self sign-up cannot tag itself. Ignored for a service user (no contact).
    */
    @DataMember
    @ApiMember(Description="Tags to put on the new user's contact (free labels campaigns and segments select by, normalised like any tag). Only here, on the routes that need membership:create — a public self sign-up cannot tag itself. Ignored for a service user (no contact).")
    open var tags:ArrayList<String>? = null
}

@DataContract
open class SaveUser : CodeMashRequestBase()
{
    /**
    * Database integration id. Optional — defaults to the request environment's default integration.
    */
    @DataMember
    @ApiMember(Description="Database integration id. Optional — defaults to the request environment's default integration.")
    open var databaseIntegrationId:String? = null

    /**
    * User Info
    */
    @DataMember
    @ApiMember(DataType="object", Description="User Info", Name="UserGeneralInfo", ParameterType="body")
    open var userGeneralInfo:UserGeneralInfoDto? = null

    /**
    * Attach this login to an existing user id. Optional.
    */
    @DataMember
    @ApiMember(Description="Attach this login to an existing user id. Optional.")
    open var userId:String? = null

    /**
    * Ignore UserRegistersAsRole from Membership Settings
    */
    @DataMember
    @ApiMember(DataType="boolean", Description="Ignore UserRegistersAsRole from Membership Settings", Name="IgnoreUserRegistersAsRole", ParameterType="body")
    open var ignoreUserRegistersAsRole:Boolean? = null
}

interface IPublicRegistrationRequest
{
    var roles:ArrayList<String>?
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
}

interface IPasskeyCeremonyRequest
{
}

open class PagingArgs
{
    open var cursorArgs:CursorArgs? = null
    open var pageSize:Int? = null
    open var startingAfter:String? = null
    open var endingBefore:String? = null
}

@DataContract
open class RegisterFileItem
{
    @DataMember
    open var path:String? = null

    @DataMember
    open var ownerUserId:String? = null

    @DataMember
    open var contentType:String? = null

    @DataMember
    open var sizeBytes:Long? = null

    @DataMember
    open var fileName:String? = null
}

open class WriteLogEntry
{
    /**
    * information (default), warning or error.
    */
    @ApiMember(Description="information (default), warning or error.")
    open var level:String? = null

    /**
    * A short line, 1–200 characters — what the Logs list shows.
    */
    @ApiMember(Description="A short line, 1–200 characters — what the Logs list shows.", IsRequired=true)
    open var title:String? = null

    /**
    * Details, at most 8 000 characters.
    */
    @ApiMember(Description="Details, at most 8 000 characters.")
    open var message:String? = null

    /**
    * Your own code for this kind of line, e.g. order:paid — lower case letters, digits and _ . : -, at most 64. Stored as app:<code>; app:log when empty.
    */
    @ApiMember(Description="Your own code for this kind of line, e.g. order:paid — lower case letters, digits and _ . : -, at most 64. Stored as app:<code>; app:log when empty.")
    open var eventCode:String? = null

    /**
    * Groups your lines into one flow in the Logs details view: at most 64 letters, digits, _ or -. Empty = the id of this request.
    */
    @ApiMember(Description="Groups your lines into one flow in the Logs details view: at most 64 letters, digits, _ or -. Empty = the id of this request.")
    open var correlationId:String? = null

    /**
    * When it happened (UTC). Empty = when Norbix received it. At most 7 days old and at most 5 minutes ahead.
    */
    @ApiMember(Description="When it happened (UTC). Empty = when Norbix received it. At most 7 days old and at most 5 minutes ahead.")
    open var timestamp:Date? = null

    /**
    * Extra fields, at most 20; key at most 64, value at most 2 000 characters. Values under secret-looking keys (password, token, apiKey …) are masked.
    */
    @ApiMember(Description="Extra fields, at most 20; key at most 64, value at most 2 000 characters. Values under secret-looking keys (password, token, apiKey …) are masked.")
    open var meta:HashMap<String,String>? = null
}

@DataContract
open class PaymentOrderLineInput
{
    @DataMember
    open var sku:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var quantity:Int? = null

    @DataMember
    open var unitAmountMinor:Long? = null
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

    @DataMember(Order=5)
    open var publicUrl:String? = null

    @DataMember(Order=6)
    open var isPublic:Boolean? = null
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

enum class SmsCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    PhoneNumbers,
    Collection,
    TriggerSubject,
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
open class SmsToAccountUsersDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
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

    @DataMember
    open var recordIds:ArrayList<String>? = null
}

@DataContract
open class SmsToPhoneNumbersDeliverySettingsDto : SmsCampaignDeliverySettingsDto()
{
    @DataMember
    open var phoneNumbers:ArrayList<String> = ArrayList<String>()
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

open class EchoRegionDto
{
    open var code:String? = null
    open var displayName:String? = null
    open var apiUrl:String? = null
    open var hubUrl:String? = null
}

open class EchoAgentDto
{
    open var mcpUrl:String? = null
    open var oAuthMetadataUrl:String? = null
    open var installationType:String? = null
    open var onboardingDocsUrl:String? = null
    open var toolsUrl:String? = null
    open var cliPackage:String? = null
    open var cliInstallCommand:String? = null
    open var deviceAuthorizationUrl:String? = null
    open var deviceTokenUrl:String? = null
    open var snippets:ArrayList<EchoAgentSnippetDto> = ArrayList<EchoAgentSnippetDto>()
}

open class EchoHostingPlatformDto
{
    open var provider:String? = null
    open var isAws:Boolean? = null
}

open class EchoConnectDto
{
    open var providers:ArrayList<QuickConnectProviderDto> = ArrayList<QuickConnectProviderDto>()
}

open class EchoKeylessDto
{
    open var issuer:String? = null
    open var available:Boolean? = null
    open var unavailableReason:String? = null
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

open class PublicAiChatDto
{
    open var enabled:Boolean? = null
    open var assistants:ArrayList<PublicAiAssistantDto> = ArrayList<PublicAiAssistantDto>()
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

open class EndUserChatAttachment
{
    open var id:String? = null
    open var sessionId:String? = null
    open var fileName:String? = null
    open var contentType:String? = null
    open var kind:String? = null
    open var size:Long? = null
    open var summary:String? = null
    open var createdAtUtc:Date? = null
}

open class EndUserChatMemoryNote
{
    open var id:String? = null
    open var sessionId:String? = null
    open var kind:String? = null
    open var text:String? = null
    open var createdAtUtc:Date? = null
}

open class EndUserChatAssistant
{
    open var id:String? = null
    open var name:String? = null
    open var welcomeMessage:String? = null
    open var isDefault:Boolean? = null
    open var memoryEnabled:Boolean? = null
}

open class EndUserChatPlan
{
    open var id:String? = null
    open var name:String? = null
    open var quotaUnit:String? = null
    open var monthlyQuota:Long? = null
    open var used:Long? = null
    open var remaining:Long? = null
    open var attachments:Boolean? = null
    open var rag:Boolean? = null
    open var memory:Boolean? = null
}

open class EndUserChatSession
{
    open var id:String? = null
    open var assistantId:String? = null
    open var title:String? = null
    open var isPinned:Boolean? = null
    open var isArchived:Boolean? = null
    open var lastSeq:Long? = null
    open var createdAtUtc:Date? = null
    open var updatedAtUtc:Date? = null
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

open class EndUserAiTool
{
    open var name:String? = null
    open var description:String? = null
    open var toolsets:ArrayList<String> = ArrayList<String>()
    open var requiresConfirmation:Boolean? = null
    open var parameters:ArrayList<EndUserAiToolParameter> = ArrayList<EndUserAiToolParameter>()
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
    open var credentialVersion:String? = null
}

open class PaginatedResponse<TViewModelProjection>
{
    open var items:IList<TViewModelProjection>? = null
    open var hasMore:Boolean? = null
    open var hasPrevious:Boolean? = null
    open var startingAfter:String? = null
    open var endingBefore:String? = null
}

open class UserMarketingPreferencesDto
{
    open var blockAllMarketingMessages:Boolean? = null
    open var blockedTags:HashMap<String,HashSet<String>>? = null
    open var blockReasons:ArrayList<MarketingBlockReason>? = null
}

open class PasskeyListItemDto
{
    open var credentialId:String? = null
    open var friendlyName:String? = null
    open var registeredOnUtc:Date? = null
    open var lastUsedOnUtc:Date? = null
    open var isRevoked:Boolean? = null
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
    open var slug:String? = null

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
    open var slug:String? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var descriptions:HashMap<String,String>? = null

    @DataMember
    open var multiParents:ArrayList<TermMultiParentDto>? = null

    @DataMember
    open var meta:Object? = null

    @DataMember
    open var origin:String? = null
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
    open var embed:SchemaEmbedSettingsDto? = null

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

    @DataMember
    open var env:String? = null
}

@DataContract
open class PublicFolderDto
{
    @DataMember(Order=1)
    open var path:String? = null

    @DataMember(Order=2)
    open var publicId:String? = null

    @DataMember(Order=3)
    open var publicUrl:String? = null

    @DataMember(Order=4)
    open var inherited:Boolean? = null
}

open class RegisterFileResult
{
    open var index:Int? = null
    open var path:String? = null
    open var ownerUserId:String? = null
    open var status:String? = null
    open var fileId:String? = null
    open var verified:Boolean? = null
    open var warning:String? = null
    open var errorCode:String? = null
    open var errorStatus:Int? = null
    open var error:String? = null
}

@DataContract
open class OwnPushDeviceDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var token:String? = null

    @DataMember
    open var platform:String? = null

    @DataMember
    open var osName:String? = null

    @DataMember
    open var osVersion:String? = null

    @DataMember
    open var appVersion:String? = null

    @DataMember
    open var deviceName:String? = null

    @DataMember
    open var modelName:String? = null

    @DataMember
    open var brand:String? = null

    @DataMember
    open var installationId:String? = null

    @DataMember
    open var locale:String? = null

    @DataMember
    open var timeZone:String? = null

    @DataMember
    open var updatedAtUtc:Date? = null
}

@DataContract
open class OwnPushMessageDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var campaignId:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var body:String? = null

    @DataMember
    open var sentAtUtc:Date? = null

    @DataMember
    open var isRead:Boolean? = null

    @DataMember
    open var readAtUtc:Date? = null
}

@DataContract
open class PaymentOrderDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var env:String? = null

    @DataMember
    open var buyerUserId:String? = null

    @DataMember
    open var merchantReference:String? = null

    @DataMember
    open var currency:String? = null

    @DataMember
    open var priceVersion:String? = null

    @DataMember
    open var lines:ArrayList<PaymentOrderLineDto> = ArrayList<PaymentOrderLineDto>()

    @DataMember
    open var totalMinor:Long? = null

    @DataMember
    open var metadata:HashMap<String,String> = HashMap<String,String>()

    @DataMember
    open var status:String? = null

    @DataMember
    open var createdOnUtc:Date? = null

    @DataMember
    open var updatedOnUtc:Date? = null

    @DataMember
    open var checkouts:ArrayList<PaymentOrderCheckoutDto> = ArrayList<PaymentOrderCheckoutDto>()

    @DataMember
    open var settledMinor:Long? = null

    @DataMember
    open var refundedMinor:Long? = null

    @DataMember
    open var paidOnUtc:Date? = null

    @DataMember
    open var providerPaymentId:String? = null

    @DataMember
    open var mismatches:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class PaymentOrderCheckoutDto
{
    @DataMember
    open var attempt:Int? = null

    @DataMember
    open var integrationId:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var providerOrderId:String? = null

    @DataMember
    open var providerReference:String? = null

    @DataMember
    open var paymentUrl:String? = null

    @DataMember
    open var method:String? = null

    @DataMember
    open var startedOnUtc:Date? = null

    @DataMember
    open var expiresAtUtc:Date? = null
}

@DataContract
open class WorkflowRunListProjection
{
    @DataMember
    open var runId:String? = null

    @DataMember
    open var workflowId:String? = null

    @DataMember
    open var version:Int? = null

    @DataMember
    open var isDraft:Boolean? = null

    @DataMember
    open var status:String? = null

    @DataMember
    open var source:String? = null

    @DataMember
    open var startedAt:Date? = null

    @DataMember
    open var finishedAt:Date? = null

    @DataMember
    open var durationMs:Long? = null

    @DataMember
    open var startedBy:WorkflowRunActorDto? = null

    @DataMember
    open var executionIdentityId:String? = null

    @DataMember
    open var executionIdentityName:String? = null

    @DataMember
    open var executionIdentityIsDefault:Boolean? = null

    @DataMember
    open var currentStepIds:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var waitingOn:ArrayList<WorkflowWaitingOnDto> = ArrayList<WorkflowWaitingOnDto>()

    @DataMember
    open var error:WorkflowRunErrorDto? = null
}

@DataContract
open class WorkflowRunDto
{
    @DataMember
    open var runId:String? = null

    @DataMember
    open var workflowId:String? = null

    @DataMember
    open var version:Int? = null

    @DataMember
    open var isDraft:Boolean? = null

    @DataMember
    open var status:String? = null

    @DataMember
    open var source:String? = null

    @DataMember
    open var startedBy:WorkflowRunActorDto? = null

    @DataMember
    open var triggerId:String? = null

    @DataMember
    open var taskId:String? = null

    @DataMember
    open var parentRunId:String? = null

    @DataMember
    open var depth:Int? = null

    @DataMember
    open var env:String? = null

    @DataMember
    open var correlationId:String? = null

    @DataMember
    open var executionIdentityId:String? = null

    @DataMember
    open var executionIdentityName:String? = null

    @DataMember
    open var executionIdentityIsDefault:Boolean? = null

    @DataMember
    open var startedAt:Date? = null

    @DataMember
    open var finishedAt:Date? = null

    @DataMember
    open var durationMs:Long? = null

    @DataMember
    open var waitingOn:ArrayList<WorkflowWaitingOnDto> = ArrayList<WorkflowWaitingOnDto>()

    @DataMember
    open var error:WorkflowRunErrorDto? = null

    @DataMember
    open var output:Object? = null

    @DataMember
    open var stepRuns:Int? = null

    @DataMember
    open var steps:ArrayList<WorkflowRunStepDto> = ArrayList<WorkflowRunStepDto>()

    @DataMember
    open var request:HashMap<String,Object>? = null

    @DataMember
    open var trigger:HashMap<String,Object>? = null
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
    open var env:String? = null

    @DataMember
    open var origin:String? = null

    @DataMember
    open var meta:IReadOnlyDictionary<String, String>? = null
}

open class InAppNotificationDto
{
    open var id:String? = null
    open var projectId:String? = null
    open var userId:String? = null
    open var channel:String? = null
    open var eventName:String? = null
    open var payloadJson:String? = null
    open var isRead:Boolean? = null
    open var seenAtUtc:Date? = null
    open var readAtUtc:Date? = null
    open var createdAtUtc:Date? = null
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

@DataContract
open class ContactRolesRepairDto
{
    @DataMember(Name="dryRun")
    @SerializedName("dryRun")
    open var dryRun:Boolean? = null

    @DataMember(Name="contactsWithoutRoles")
    @SerializedName("contactsWithoutRoles")
    open var contactsWithoutRoles:Int? = null

    @DataMember(Name="contactsToRepair")
    @SerializedName("contactsToRepair")
    open var contactsToRepair:Int? = null

    @DataMember(Name="contactsRepaired")
    @SerializedName("contactsRepaired")
    open var contactsRepaired:Int? = null

    @DataMember(Name="contactsWithoutLoginRoleIds")
    @SerializedName("contactsWithoutLoginRoleIds")
    open var contactsWithoutLoginRoleIds:Int? = null

    @DataMember(Name="legacyRoleNamesIgnored")
    @SerializedName("legacyRoleNamesIgnored")
    open var legacyRoleNamesIgnored:Int? = null
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

    @DataMember
    open var outcome:CampaignOutcomeDto? = null
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
    open var subject:String? = null

    @DataMember
    open var recipients:EmailRecipientsDto? = null

    @DataMember
    open var removedRecipients:ArrayList<RemovedRecipientDto>? = null

    @DataMember
    open var content:EmailMessageContentDto? = null

    @DataMember
    open var transactionalKind:String? = null
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
    open var failedRetryable:Int? = null

    @DataMember
    open var cancelled:Int? = null

    @DataMember
    open var blocked:Int? = null

    @DataMember
    open var inProgress:Int? = null

    @DataMember
    open var removedRecipients:Int? = null

    @DataMember
    open var successRate:BigDecimal? = null
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
open class PushAudienceCountDto
{
    @DataMember
    open var devices:Int? = null

    @DataMember
    open var recipients:Int? = null

    @DataMember
    open var skippedUserIds:Int? = null

    @DataMember
    open var isCapped:Boolean? = null
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
    open var subject:String? = null

    @DataMember
    open var recipients:PushRecipientsDto? = null

    @DataMember
    open var content:PushMessageContentDto? = null

    @DataMember
    open var readBy:ArrayList<NotificationReadMarkDto>? = null
}

open class JsonSchemaFieldDto
{
    @DataMember
    open var fieldName:String? = null
}

open class CurrencyDefaultDto
{
    @DataMember
    open var value:BigDecimal? = null

    @DataMember
    open var currency:String? = null
}

enum class Gender
{
    Male,
    Female,
    Other,
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

open class CursorArgs : ICursorArgs
{
    override var field:String? = null
    override var order:Int? = null
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

enum class EmailCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    AccountUsers,
    Email,
    Collection,
    TriggerSubject,
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

    @DataMember
    open var secretKeys:ArrayList<String>? = null

    @DataMember
    open var secretFormat:SecretValueFormat? = null
}

@Flags()
enum class RespectTimeZoneSettings(val value:Int)
{
    @SerializedName("1") RespectToLastLoginZone(1),
    @SerializedName("2") RespectToRegistrationZone(2),
    @SerializedName("4") RespectToRegistrationProjectZone(4),
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

enum class CollectionEmailCampaignRecipientField
{
    User,
    Email,
}

enum class PushCampaignRecipientsSourceTypes
{
    AllUsers,
    SpecifiedUsers,
    Collection,
    Devices,
    AccountUsers,
    TriggerSubject,
}

open class EchoAgentSnippetDto
{
    open var client:String? = null
    open var kind:String? = null
    open var recommended:Boolean? = null
    open var auth:String? = null
    open var config:String? = null
}

@DataContract
open class QuickConnectProviderDto
{
    @DataMember
    open var module:String? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var available:Boolean? = null

    @DataMember
    open var callbackKind:String? = null

    @DataMember
    open var requiredInputs:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var modes:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var redirectUrl:String? = null

    @DataMember
    open var platformWebhookUrls:ArrayList<String> = ArrayList<String>()
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

open class PublicAiAssistantDto
{
    open var id:String? = null
    open var name:String? = null
    open var welcome:String? = null
}

open class ErrorDto
{
    open var message:String? = null
    open var errorCode:String? = null
    open var context:HashMap<String,String>? = null
    open var stackTrace:ArrayList<ErrorDto>? = null
}

open class EndUserAiToolParameter
{
    open var name:String? = null
    @SerializedName("type") open var Type:String? = null
    open var required:Boolean? = null
    open var description:String? = null
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

open class RegistrationDto
{
    open var registrationInformation:AccessInformationDto? = null
}

open class LoginDto
{
    open var needChangePasswordOnNextLogin:Boolean? = null
    open var lastAccessInformation:AccessInformationDto? = null
}

enum class AuthStatus(val value:Int)
{
    Registered(0),
    PendingValidation(2),
    Invited(4),
    Active(8),
    Unregistered(16),
    Suspended(32),
    InActive(64),
    Blocked(128),
}

interface IBindableContract
{
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

open class SchemaSettingsDto
{
    @DataMember
    open var softDelete:Boolean? = null

    @DataMember
    open var hasRecordOwner:Boolean? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var uniqueIndexes:ArrayList<SchemaUniqueIndexDto>? = null

    @DataMember
    open var endUserOwnRecords:Boolean? = null
}

open class SchemaEmbedSettingsDto
{
    @DataMember
    open var enabled:Boolean? = null

    @DataMember
    open var fields:ArrayList<String> = ArrayList<String>()

    @DataMember
    open var embeddingIntegrationId:String? = null

    @DataMember
    open var perUser:Boolean? = null
}

@DataContract
open class TriggerDto : IHasViewId, IQueuedTrigger
{
    @DataMember
    @SerializedName("type") open var Type:TriggerType? = null

    @DataMember
    override var viewId:String? = null

    @DataMember
    override var name:String? = null

    @DataMember
    open var thenAction:TriggerActionDto? = null

    @DataMember
    open var description:String? = null

    @DataMember
    open var isEnabled:Boolean? = null

    @DataMember
    open var activationCode:String? = null

    @DataMember
    override var order:Int? = null

    @DataMember
    override var breakOnError:Boolean? = null

    @DataMember
    open var savedByAuthId:String? = null

    @DataMember
    open var executionIdentityId:String? = null

    @DataMember
    open var executionIdentity:ExecutionIdentitySummaryDto? = null
}

interface IHasViewId
{
    var viewId:String?
}

@DataContract
open class PaymentOrderLineDto
{
    @DataMember
    open var sku:String? = null

    @DataMember
    open var title:String? = null

    @DataMember
    open var quantity:Int? = null

    @DataMember
    open var unitAmountMinor:Long? = null

    @DataMember
    open var amountMinor:Long? = null
}

@DataContract
open class WorkflowRunActorDto
{
    @DataMember
    open var userId:String? = null

    @DataMember
    open var kind:String? = null
}

@DataContract
open class WorkflowWaitingOnDto
{
    @DataMember
    open var stepId:String? = null

    @DataMember
    open var kind:String? = null

    @DataMember
    open var until:Date? = null

    @DataMember
    open var key:String? = null

    @DataMember
    open var assignees:ArrayList<String>? = null
}

@DataContract
open class WorkflowRunErrorDto
{
    @DataMember
    open var code:String? = null

    @DataMember
    open var stepId:String? = null

    @DataMember
    open var reason:String? = null

    @DataMember
    open var message:String? = null
}

@DataContract
open class WorkflowRunStepDto
{
    @DataMember
    open var stepId:String? = null

    @DataMember
    open var kind:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var status:String? = null

    @DataMember
    open var attempt:Int? = null

    @DataMember
    open var pass:Int? = null

    @DataMember
    open var startedAt:Date? = null

    @DataMember
    open var finishedAt:Date? = null

    @DataMember
    open var durationMs:Long? = null

    @DataMember
    open var input:Object? = null

    @DataMember
    open var inputTruncated:Boolean? = null

    @DataMember
    open var output:Object? = null

    @DataMember
    open var outputTruncated:Boolean? = null

    @DataMember
    open var error:WorkflowRunErrorDto? = null

    @DataMember
    open var resumedBy:WorkflowRunActorDto? = null

    @DataMember
    open var decision:String? = null
}

@DataContract
open class ChannelSubscriptionStateDto
{
    @DataMember
    open var unsubscribed:Boolean? = null

    @DataMember
    open var blockedTags:HashMap<String,ArrayList<String>> = HashMap<String,ArrayList<String>>()
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

@DataContract
open class EmailTemplateDto : TemplateDto(), IBindableContract
{
    @DataMember
    open var translations:ArrayList<EmailMessageTranslationDto> = ArrayList<EmailMessageTranslationDto>()

    @DataMember
    open var staticAttachments:ArrayList<FileResourceRefDto>? = null
}

open class CampaignStatusChangeEntryDto
{
    open var time:Date? = null
    open var status:CampaignStatus? = null
    open var errors:ArrayList<ErrorDto>? = null
}

enum class TriggerType
{
    Membership,
    Schema,
    Files,
    Payments,
    Ai,
}

@DataContract
open class CampaignOutcomeDto
{
    @DataMember
    open var sent:Int? = null

    @DataMember
    open var failed:Int? = null

    @DataMember
    open var blocked:Int? = null

    @DataMember
    open var cancelled:Int? = null

    @DataMember
    open var removedRecipients:Int? = null

    @DataMember
    open var blockedReason:String? = null
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
    open var createdById:String? = null

    @DataMember
    open var timeZoneId:String? = null

    @DataMember
    override var userId:String? = null

    @DataMember
    open var triggerId:String? = null

    @DataMember
    open var triggerType:TriggerType? = null

    @DataMember
    open var outcome:CampaignOutcomeDto? = null

    @DataMember
    override var id:String? = null
}

interface IHasResponsibleUserId
{
    var userId:String?
}

interface IHasDatabaseId
{
    var id:String?
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

@DataContract
open class RemovedRecipientDto
{
    @DataMember
    open var address:String? = null

    @DataMember
    open var field:EmailRecipientField? = null

    @DataMember
    open var reason:RecipientRemovalReason? = null

    @DataMember
    open var tag:String? = null
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

open class NotificationStatusChangeEntryDto
{
    open var time:Date? = null
    open var status:CampaignNotificationStatus? = null
    open var sourceId:String? = null
    open var errors:ArrayList<ErrorDto>? = null
    open var tags:ArrayList<String>? = null
}

enum class NotificationDeliveryState
{
    Pending,
    Sending,
    Retrying,
    Accepted,
    Failed,
    Blocked,
    Cancelled,
}

@DataContract
open class NotificationAttemptDto
{
    @DataMember
    open var attemptId:String? = null

    @DataMember
    open var number:Int? = null

    @DataMember
    open var startedAt:Date? = null

    @DataMember
    open var finishedAt:Date? = null

    @DataMember
    open var outcome:NotificationAttemptOutcome? = null

    @DataMember
    open var category:SendErrorCategory? = null

    @DataMember
    open var statusCode:Int? = null

    @DataMember
    open var errorCode:String? = null

    @DataMember
    open var message:String? = null

    @DataMember
    open var providerRef:String? = null

    @DataMember
    open var retryAfterSeconds:Int? = null

    @DataMember
    open var exhausted:Boolean? = null

    @DataMember
    open var nextRetryAt:Date? = null

    @DataMember
    open var correlationId:String? = null

    @DataMember
    open var trigger:NotificationAttemptTrigger? = null

    @DataMember
    open var retryRequestId:String? = null
}

@DataContract
open class NotificationDeliveryEventDto
{
    @DataMember
    open var eventId:String? = null

    @DataMember
    open var outcome:DeliveryEventOutcome? = null

    @DataMember
    open var at:Date? = null

    @DataMember
    open var provider:String? = null

    @DataMember
    open var providerRef:String? = null

    @DataMember
    open var reason:String? = null
}

enum class DeliveryEventOutcome
{
    Delivered,
    Bounced,
    Complained,
    Rejected,
    Deferred,
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
    open var body:String? = null

    @DataMember
    open var model:HashMap<String,String>? = null

    @DataMember
    open var statusHistory:ArrayList<NotificationStatusChangeEntryDto> = ArrayList<NotificationStatusChangeEntryDto>()

    @DataMember
    open var state:NotificationDeliveryState? = null

    @DataMember
    open var stateChangedAt:Date? = null

    @DataMember
    open var attempts:ArrayList<NotificationAttemptDto>? = null

    @DataMember
    open var deliveryEvents:ArrayList<NotificationDeliveryEventDto>? = null

    @DataMember
    open var deliveryOutcome:DeliveryEventOutcome? = null

    @DataMember
    open var deliveryOutcomeRank:Int? = null

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
open class SmsTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:ArrayList<SmsMessageTranslationDto> = ArrayList<SmsMessageTranslationDto>()
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
open class SmsMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var body:String? = null
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
open class PushTemplateDto : TemplateDto(), IHasRazorTemplateCode, IBindableContract
{
    @DataMember
    open var translations:ArrayList<PushMessageTranslationDto> = ArrayList<PushMessageTranslationDto>()
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

@DataContract
open class PushMessageContentDto : IHasRazorTemplateCode
{
    @DataMember
    open var title:String? = null

    @DataMember
    open var body:String? = null
}

@DataContract
open class NotificationReadMarkDto
{
    @DataMember
    open var userId:String? = null

    @DataMember
    open var readAtUtc:Date? = null
}

interface ICursorArgs
{
    var field:String?
    var order:Int?
}

@DataContract
open class FileChecksumDto
{
    @DataMember(Order=1)
    open var algorithm:String? = null

    @DataMember(Order=2)
    open var hash:String? = null
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
    RequestInput,
    IntegrationConfig,
    IntegrationSecret,
    StepOutput,
}

enum class SecretValueFormat
{
    Raw,
    Bearer,
    Basic,
    Prefixed,
}

open class AccessInformationDto
{
    open var ip:String? = null
    open var date:Date? = null
    open var timeZone:String? = null
}

open class SchemaUniqueIndexDto
{
    @DataMember
    open var fields:ArrayList<String> = ArrayList<String>()
}

@DataContract
open class TriggerActionDto
{
    @DataMember
    @SerializedName("type") open var Type:TriggerActionType? = null

    @DataMember
    open var integrationId:String? = null
}

@DataContract
open class ExecutionIdentitySummaryDto
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var name:String? = null

    @DataMember
    open var isDefault:Boolean? = null

    @DataMember
    open var status:String? = null
}

interface IQueuedTrigger
{
    var viewId:String?
    var name:String?
    var order:Int?
    var breakOnError:Boolean?
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

enum class CommunicationChannel
{
    Transactional,
    Marketing,
    System,
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

    @DataMember
    open var env:String? = null
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

enum class EmailRecipientField(val value:Int)
{
    To(1),
    Cc(2),
    Bcc(3),
}

enum class RecipientRemovalReason(val value:Int)
{
    OptedOut(1),
    Compliance(2),
    Undeliverable(3),
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

interface IHasRazorTemplateCode
{
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

enum class NotificationAttemptOutcome
{
    Accepted,
    Failed,
}

enum class SendErrorCategory
{
    Unknown,
    Transient,
    Permanent,
    Ambiguous,
}

enum class NotificationAttemptTrigger
{
    Initial,
    AutoRetry,
    ManualRetry,
}

@DataContract
open class SmsMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:SmsMessageContentDto? = null
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
open class PushMessageTranslationDto : IHasRazorTemplateCode
{
    @DataMember
    open var language:String? = null

    @DataMember
    open var content:PushMessageContentDto? = null
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

enum class TriggerActionType
{
    Code,
    Push,
    Sms,
    Email,
    WebhookCall,
    SseCall,
    Marketplace,
    Workflow,
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

@DataContract
open class PushDeviceDeliveryTokenDto
{
    @DataMember
    open var pushDeviceToken:String? = null

    @DataMember
    open var deliveryFamily:PushDeviceDeliveryFamily? = null
}

enum class PushDeviceDeliveryFamily
{
    Ios,
    Android,
    Chrome,
    Safari,
    Expo,
}
