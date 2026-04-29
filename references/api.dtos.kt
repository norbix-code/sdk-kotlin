/* Options:
Date: 2026-04-27 20:33:13
Version: 10.06
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
    open var regions:ArrayList<ProjectRegion>? = null
    open var description:String? = null
}

open class ProjectDeleted
{
}

open class ProjectActivated
{
}

open class ProjectEnabled
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
    open var regions:ArrayList<ProjectRegion>? = null
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
    open var userId:UserId? = null
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
@Route(Path="/{version}/membership/users/block", Verbs="PATCH")
@Api(Description="Membership")
@DataContract
open class BlockUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = BlockUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/register/service", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/guest", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/user-name", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/email", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/phone", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class SavePhoneUser : SaveUser(), IReturn<IdResponse>
{
    @DataMember
    open var phone:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = SavePhoneUser.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/register/phone-with-permissions", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/email-with-permissions", Verbs="POST")
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
@Route(Path="/{version}/membership/users/register/user-name-with-permissions", Verbs="POST")
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
@Route(Path="/{version}/membership/users", Verbs="DELETE")
@Api(Description="Membership")
@DataContract
open class DeleteUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = DeleteUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{id}", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUserRequest : CodeMashRequestBase(), IReturn<GetUserResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetUserResponse::class.java }
    override fun getResponseType(): Any? = GetUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUsersRequest : CodeMashListPaginationRequestBase(), IReturn<GetUsersResponse>
{
    @DataMember
    open var databaseIntegrationId:String? = null

    @DataMember
    open var includePermissions:Boolean? = null

    @DataMember
    open var userShouldHavePushDevice:Boolean? = null

    @DataMember
    open var userShouldHaveEmail:Boolean? = null

    @DataMember
    open var includeMeta:Boolean? = null

    @DataMember
    open var roleNames:ArrayList<String>? = null

    @DataMember
    open var userIds:ArrayList<String>? = null
    companion object { private val responseType = GetUsersResponse::class.java }
    override fun getResponseType(): Any? = GetUsersRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{id}/preferences", Verbs="GET")
@Api(Description="Membership")
@DataContract
open class GetUserPreferencesRequest : CodeMashRequestBase(), IReturn<GetUserPreferencesResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = GetUserPreferencesResponse::class.java }
    override fun getResponseType(): Any? = GetUserPreferencesRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/invite", Verbs="POST")
@Api(Description="Membership")
@DataContract
open class InviteUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var email:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = InviteUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/assign-roles", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class AssignRolePermissionsRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    /**
    * Database integration id
    */
    @DataMember
    @ApiMember(Description="Database integration id", IsRequired=true)
    open var databaseIntegrationId:String? = null

    @DataMember
    open var roles:ArrayList<String>? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = AssignRolePermissionsRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/unblock", Verbs="PATCH")
@Api(Description="Membership")
@DataContract
open class UnblockUserRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UnblockUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class UpdateUserRequest : SaveUser(), IReturn<IdResponse>
{
    @DataMember
    open var id:String? = null
    companion object { private val responseType = IdResponse::class.java }
    override fun getResponseType(): Any? = UpdateUserRequest.responseType
}

/**
* Membership
*/
@Route(Path="/{version}/membership/users/{id}/preferences", Verbs="PUT")
@Api(Description="Membership")
@DataContract
open class UpdateUserPreferencesRequest : CodeMashRequestBase(), IReturn<EmptyResponse>
{
    @DataMember
    open var id:String? = null

    @DataMember
    open var blockAllMarketingMessages:Boolean? = null

    @DataMember
    open var blockedTags:HashMap<String,IReadOnlySet<String>>? = null

    @DataMember
    open var databaseIntegrationId:String? = null
    companion object { private val responseType = EmptyResponse::class.java }
    override fun getResponseType(): Any? = UpdateUserPreferencesRequest.responseType
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
}

open class GetUserResponse : ResponseBase()
{
    open var user:UserDto? = null
}

open class GetUsersResponse : ResponseBase()
{
    open var list:PaginatedResponse<UserDto>? = null
}

open class GetUserPreferencesResponse : ResponseBase()
{
    open var preferences:UserMarketingPreferencesDto? = null
}

open class FindTermsResponse : ResponseBase()
{
    open var list:PaginatedResponse<TermDto>? = null
}

open class FindTermsChildrenResponse : ResponseBase()
{
    open var list:PaginatedResponse<TermDto>? = null
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

open class UserId : IHasDomainEntityId
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
    * Database integration id
    */
    @DataMember
    @ApiMember(Description="Database integration id", IsRequired=true)
    open var databaseIntegrationId:String? = null

    /**
    * User Info
    */
    @DataMember
    @ApiMember(DataType="object", Description="User Info", Name="UserGeneralInfo", ParameterType="body")
    open var userGeneralInfo:UserGeneralInfoDto? = null

    /**
    * Ignore UserRegistersAsRole from Membership Settings
    */
    @DataMember
    @ApiMember(DataType="boolean", Description="Ignore UserRegistersAsRole from Membership Settings", Name="IgnoreUserRegistersAsRole", ParameterType="body")
    open var ignoreUserRegistersAsRole:Boolean? = null
}

open class PagingArgs
{
    open var cursorArgs:CursorArgs? = null
    open var pageSize:Int? = null
    open var startingAfter:String? = null
    open var endingBefore:String? = null
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

open class CodeMashResponseStatus
{
    open var isSuccess:Boolean? = null
    open var errors:ArrayList<ErrorDto>? = null
}

open class ResponseBase
{
    open var responseStatus:CodeMashResponseStatus? = null
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
    open var blockedTags:HashMap<String,IReadOnlySet<String>>? = null
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

open class CursorArgs : ICursorArgs
{
    override var field:String? = null
    override var order:Int? = null
}

open class ErrorDto
{
    open var message:String? = null
    open var errorCode:String? = null
    open var context:HashMap<String,String>? = null
    open var stackTrace:IReadOnlySet<ErrorDto>? = null
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

open class TagDescription
{
    open var displayName:DisplayName? = null
    open var description:String? = null
}

@DataContract
open class MessageTranslation<TContent>
{
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
}
