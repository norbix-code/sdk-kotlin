/* Options:
Date: 2026-09-04 14:55:40
Version: 10.08
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

open class AccountCreated
{
    open var email:EmailAddress? = null
    open var displayName:DisplayName? = null
    open var accountId:AccountId? = null
    open var createdOn:UtcDateTime? = null
}

open class AccountVerified
{
}

open class AccountSetAsActive
{
}

open class AccountValidationTokenIssued
{
    open var expiration:ExpirationToken? = null
}

open class AccountBlocked
{
}

open class AccountProfileUpdated
{
    open var displayName:DisplayName? = null
    open var billingEmail:EmailAddress? = null
    open var operationsEmail:EmailAddress? = null
    open var securityEmail:EmailAddress? = null
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

open class ProjectDeleted
{
}

open class ProjectActivated
{
}

open class ProjectDisabled
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
    open var primaryRegion:ProjectRegion? = null
    open var additionalRegions:ArrayList<ProjectRegion>? = null
}

open class ProjectTimeZoneChanged
{
    open var timeZone:TimeZone? = null
}

open class ProjectPaymentZonesChanged
{
    open var paymentZones:ArrayList<TimeZone>? = null
}

open class ProjectCommunicationSet
{
    open var projectCommunication:ProjectCommunication? = null
}

open class AccountUserPushDeviceCreated
{
    open var authId:AuthId? = null
    open var pushDevice:PushDevice? = null
}

/**
* AI
*/
@Route(Path="/{version}/chat/complete", Verbs="POST")
@Api(Description="AI")
@DataContract
open class AskChatRequest : CodeMashRequestBase(), IReturn<AskChatResponse>
{
    @DataMember
    open var prompt:String? = null
    companion object { private val responseType = AskChatResponse::class.java }
    override fun getResponseType(): Any? = AskChatRequest.responseType
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
open class SaveGuestUser : SaveUser(), IReturn<IdResponse>
{
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveGuestUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/user-name", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveUserNameUser : SaveUser(), IReturn<IdResponse>
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var userName:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveUserNameUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/auth/register/email", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SaveEmailUser : SaveUser(), IReturn<IdResponse>
{
    @DataMember
    open var password:String? = null

    @DataMember
    open var email:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SaveEmailUser.responseType
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
    * Email address the invitation is sent to.
    */
    @DataMember
    @ApiMember(Description="Email address the invitation is sent to.", IsRequired=true)
    open var email:String? = null

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
    @DataMember
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
    @DataMember
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
    @DataMember
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
    @DataMember
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
    open var update:String? = null
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
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = CommitUploadRequest.responseType
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
    companion object { private val responseType = RequestUploadUrlResponse::class.java }
    override fun getResponseType(): Any? = RequestUploadUrlRequest.responseType
}

open class PushIntegrationSaved
{
    open var integration:PushIntegration? = null
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

open class PushTemplateMirrored
{
    open var template:PushTemplate? = null
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

open class AskChatResponse : ResponseBase()
{
    open var result:String? = null
}

open class EmptyResponse : ResponseBase()
{
}

@DataContract
open class IdResponse : ResponseBase()
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var status:String? = null
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

open class PasskeyOkResponse : ResponseBase()
{
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
}

open class RequestUploadUrlResponse : ResponseBase()
{
    open var url:String? = null
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

open class GroupDefinition : BaseTagDefinition()
{
}

enum class CommunicationChannel
{
    Transactional,
    Marketing,
    System,
}

open class Tag
{
}

open class TagDefinition : BaseTagDefinition()
{
    open var defaultDelivery:HashMap<DeliveryChannel,Boolean> = HashMap<DeliveryChannel,Boolean>()
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
open class TimeZone
{
    @DataMember
    open var zoneId:String? = null
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

open class AuthId : IHasDomainEntityId
{
    open var value:UUID? = null
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

open class Env
{
    open var value:String? = null
    open var isProd:Boolean? = null
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

open class PushIntegration : Integration()
{
    open var provider:PushProvider? = null
}

@DataContract
open class PushTemplate : Template<PushMessageContent>()
{
}

open class TemplateId
{
    open var value:UUID? = null
}

@DataContract
open class MessageTranslation<TContent>
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

    @DataMember
    open var description:String? = null
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

open class TagTranslation : MessageTranslation<TagDescription>()
{
}

open class BaseTagDefinition
{
    open var tag:Tag? = null
    open var translations:ArrayList<TagTranslation> = ArrayList<TagTranslation>()
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

@DataContract
open class ProjectCommunicationChannel
{
    @DataMember
    open var channel:CommunicationChannel? = null

    @DataMember
    open var groups:ArrayList<GroupTags> = ArrayList<GroupTags>()
}

open class DeviceId
{
    open var id:UUID? = null
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
open class PushDeviceDeliveryToken
{
    @DataMember
    open var pushDeviceToken:PushDeviceToken? = null

    @DataMember
    open var deliveryFamily:PushDeviceDeliveryFamily? = null
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
open class PushMessageContent
{
    @DataMember(Order=1)
    open var title:PushTitle? = null

    @DataMember(Order=1)
    open var subTitle:PushTitle? = null

    @DataMember(Order=2)
    open var body:PushBody? = null
}

interface IBindableContract
{
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

open class ErrorDto
{
    open var message:String? = null
    open var errorCode:String? = null
    open var context:HashMap<String,String>? = null
    open var stackTrace:ArrayList<ErrorDto>? = null
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
    Active(8),
    Unregistered(16),
    Suspended(32),
    InActive(64),
    Blocked(128),
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

interface IHasViewId
{
    var viewId:String?
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

open class TagDescription
{
    open var displayName:DisplayName? = null
    open var description:String? = null
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
open class GroupTags
{
    @DataMember
    open var group:Tag? = null

    @DataMember
    open var tags:ArrayList<Tag> = ArrayList<Tag>()
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

interface ICursorArgs
{
    var field:String?
    var order:Int?
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

open class AccessInformationDto
{
    open var ip:String? = null
    open var date:Date? = null
    open var timeZone:String? = null
}

open class JsonSchemaFieldDto
{
    @DataMember
    open var fieldName:String? = null
}

enum class TriggerType
{
    Membership,
    Schema,
    Files,
    Payments,
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
open class FileChecksumDto
{
    @DataMember(Order=1)
    open var algorithm:String? = null

    @DataMember(Order=2)
    open var hash:String? = null
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
open class TemplateCode
{
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
