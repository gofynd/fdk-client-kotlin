package com.sdk.platform.user

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserAttributeDefinitionList
*/
@Parcelize
data class UserAttributeDefinitionList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserAttributeDefinition>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeDefinition
*/
@Parcelize
data class UserAttributeDefinition(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("ordering_channels")
    var orderingChannels: ArrayList<String>?=null,
    
    @SerializedName("masking")
    var masking: AttributeMaskingProperties?=null,
    
    @SerializedName("registration")
    var registration: AttributeRegistrationProperties?=null,
    
    @SerializedName("is_multi_value")
    var isMultiValue: Boolean?=null,
    
    @SerializedName("customer_editable")
    var customerEditable: Boolean?=null,
    
    @SerializedName("encrypted")
    var encrypted: Boolean?=null,
    
    @SerializedName("pinned")
    var pinned: Boolean?=null,
    
    @SerializedName("pin_order")
    var pinOrder: Int?=null,
    
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeDefinitionDetails
*/
@Parcelize
data class UserAttributeDefinitionDetails(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("ordering_channels")
    var orderingChannels: ArrayList<String>?=null,
    
    @SerializedName("masking")
    var masking: AttributeMaskingProperties?=null,
    
    @SerializedName("registration")
    var registration: AttributeRegistrationProperties?=null,
    
    @SerializedName("is_multi_value")
    var isMultiValue: Boolean?=null,
    
    @SerializedName("customer_editable")
    var customerEditable: Boolean?=null,
    
    @SerializedName("encrypted")
    var encrypted: Boolean?=null,
    
    @SerializedName("pinned")
    var pinned: Boolean?=null,
    
    @SerializedName("pin_order")
    var pinOrder: Int?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<UserAttributeDefinitionValidation>?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMaskingProperties
*/
@Parcelize
data class AttributeMaskingProperties(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeRegistrationProperties
*/
@Parcelize
data class AttributeRegistrationProperties(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeDefinitionValidation
*/
@Parcelize
data class UserAttributeDefinitionValidation(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUserAttribute
*/
@Parcelize
data class BulkUserAttribute(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<UserAttribute>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttribute
*/
@Parcelize
data class UserAttribute(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_attribute_definition_id")
    var userAttributeDefinitionId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("customer_overridden")
    var customerOverridden: Boolean?=null,
    
    @SerializedName("attribute")
    var attribute: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateBulkUserAttribute
*/
@Parcelize
data class CreateBulkUserAttribute(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<BulkUserAttributeRequestBody>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkUserAttributeRequestBody
*/
@Parcelize
data class BulkUserAttributeRequestBody(
    
    
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserAttribute
*/
@Parcelize
data class CreateUserAttribute(
    
    
    
    @SerializedName("customer_overridden")
    var customerOverridden: Boolean?=null,
    
    @SerializedName("attribute")
    var attribute: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserAttributeDefinition
*/
@Parcelize
data class CreateUserAttributeDefinition(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("ordering_channels")
    var orderingChannels: ArrayList<String>?=null,
    
    @SerializedName("masking")
    var masking: AttributeMaskingProperties?=null,
    
    @SerializedName("registration")
    var registration: AttributeRegistrationProperties?=null,
    
    @SerializedName("is_multi_value")
    var isMultiValue: Boolean?=null,
    
    @SerializedName("customer_editable")
    var customerEditable: Boolean?=null,
    
    @SerializedName("encrypted")
    var encrypted: Boolean?=null,
    
    @SerializedName("pinned")
    var pinned: Boolean?=null,
    
    @SerializedName("pin_order")
    var pinOrder: Double?=null,
    
    @SerializedName("default_value")
    var defaultValue: String?=null,
    
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateStoreFrontUsersPayload
*/
@Parcelize
data class CreateStoreFrontUsersPayload(
    
    
    
    @SerializedName("absolute_url")
    var absoluteUrl: String?=null,
    
    @SerializedName("file_format")
    var fileFormat: String?=null,
    
    @SerializedName("relative_url")
    var relativeUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUserExportSchema
*/
@Parcelize
data class BulkUserExportSchema(
    
    
    
    @SerializedName("file_format")
    var fileFormat: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkActionModel
*/
@Parcelize
data class BulkActionModel(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("file_format")
    var fileFormat: String?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("count")
    var count: BulkActionCountSchema?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("links")
    var links: BulkActionLinkSchema?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedBySchema
*/
@Parcelize
data class CreatedBySchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionLinkSchema
*/
@Parcelize
data class BulkActionLinkSchema(
    
    
    
    @SerializedName("file")
    var file: FileLinks?=null,
    
    @SerializedName("error")
    var error: FileLinks?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FileLinks
*/
@Parcelize
data class FileLinks(
    
    
    
    @SerializedName("absolute_url")
    var absoluteUrl: String?=null,
    
    @SerializedName("relative_url")
    var relativeUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionCountSchema
*/
@Parcelize
data class BulkActionCountSchema(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("error")
    var error: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlockUserRequestSchema
*/
@Parcelize
data class BlockUserRequestSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArchiveUserRequestSchema
*/
@Parcelize
data class ArchiveUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UnDeleteUserRequestSchema
*/
@Parcelize
data class UnDeleteUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlockUserSuccess
*/
@Parcelize
data class BlockUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ArchiveUserSuccess
*/
@Parcelize
data class ArchiveUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UnDeleteUserSuccess
*/
@Parcelize
data class UnDeleteUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    
    
    @SerializedName("users")
    var users: ArrayList<UserSearchSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserSearchSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionPaginationSchema
*/
@Parcelize
data class BulkActionPaginationSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkActionModel>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaginationSchema
*/
@Parcelize
data class PaginationSchema(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SessionListResponseSchema
*/
@Parcelize
data class SessionListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SessionListResponseInfo>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SessionDeleteResponseSchema
*/
@Parcelize
data class SessionDeleteResponseSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("session_id")
    var sessionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SessionsDeleteResponseSchema
*/
@Parcelize
data class SessionsDeleteResponseSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("session_ids")
    var sessionIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SessionListResponseInfo
*/
@Parcelize
data class SessionListResponseInfo(
    
    
    
    @SerializedName("session_id")
    var sessionId: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("ip")
    var ip: String?=null,
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("expire_in")
    var expireIn: String?=null,
    
    @SerializedName("location")
    var location: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Conditions
*/
@Parcelize
data class Conditions(
    
    
    
    @SerializedName("user_attribute_definition_id")
    var userAttributeDefinitionId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserResponseErrorSchema
*/
@Parcelize
data class UserResponseErrorSchema(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserGroupResponseSchema
*/
@Parcelize
data class UserGroupResponseSchema(
    
    
    
    @SerializedName("conditions")
    var conditions: ArrayList<Conditions>?=null,
    
    @SerializedName("error")
    var error: UserResponseErrorSchema?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserGroupListResponseSchema
*/
@Parcelize
data class UserGroupListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserGroupResponseSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConditionsSchema
*/
@Parcelize
data class ConditionsSchema(
    
    
    
    @SerializedName("user_attribute_definition_id")
    var userAttributeDefinitionId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ignore_year")
    var ignoreYear: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteBulkUserAttribute
*/
@Parcelize
data class DeleteBulkUserAttribute(
    
    
    
    @SerializedName("definition_ids")
    var definitionIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserAttributeFilter
*/
@Parcelize
data class UserAttributeFilter(
    
    
    
    @SerializedName("query")
    var query: UserAttributeFilterQuery?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserAttributeFilterQuery
*/
@Parcelize
data class UserAttributeFilterQuery(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("has_email")
    var hasEmail: Boolean?=null,
    
    @SerializedName("has_phone")
    var hasPhone: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("definition_ids")
    var definitionIds: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: ArrayList<UserAttributeFilterRequestConditions>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeFilterRequestConditions
*/
@Parcelize
data class UserAttributeFilterRequestConditions(
    
    
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeFiltered
*/
@Parcelize
data class UserAttributeFiltered(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserAttributeFilteredList>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAttributeFilteredList
*/
@Parcelize
data class UserAttributeFilteredList(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<UserPhoneNumbers>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<UserEmails>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<UserAttribute>?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("has_old_password_hash")
    var hasOldPasswordHash: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_encrypted")
    var isEncrypted: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserGroup
*/
@Parcelize
data class CreateUserGroup(
    
    
    
    @SerializedName("conditions")
    var conditions: ArrayList<ConditionsSchema>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserRequestSchema
*/
@Parcelize
data class CreateUserRequestSchema(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("rr_id")
    var rrId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserResponseSchema
*/
@Parcelize
data class CreateUserResponseSchema(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateUserSessionRequestSchema
*/
@Parcelize
data class CreateUserSessionRequestSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUserSessionResponseSchema
*/
@Parcelize
data class CreateUserSessionResponseSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
    @SerializedName("secure")
    var secure: Boolean?=null,
    
    @SerializedName("http_only")
    var httpOnly: Boolean?=null,
    
    @SerializedName("cookie")
    var cookie: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("look_and_feel")
    var lookAndFeel: LookAndFeel?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    
    @SerializedName("login")
    var login: Login?=null,
    
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: MetaSchema?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("social")
    var social: Social?=null,
    
    @SerializedName("required_fields")
    var requiredFields: RequiredFields?=null,
    
    @SerializedName("register_required_fields")
    var registerRequiredFields: RegisterRequiredFields?=null,
    
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    
    @SerializedName("flash_card")
    var flashCard: FlashCard?=null,
    
    @SerializedName("subtext")
    var subtext: String?=null,
    
    @SerializedName("social_tokens")
    var socialTokens: SocialTokens?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("register")
    var register: Boolean?=null,
    
    @SerializedName("mobile_image")
    var mobileImage: String?=null,
    
    @SerializedName("desktop_image")
    var desktopImage: String?=null,
    
    @SerializedName("delete_account_day")
    var deleteAccountDay: Int?=null,
    
    @SerializedName("delete_account_reasons")
    var deleteAccountReasons: ArrayList<DeleteAccountReasons>?=null,
    
    @SerializedName("delete_account_consent")
    var deleteAccountConsent: DeleteAccountConsent?=null,
    
    @SerializedName("session_config")
    var sessionConfig: SessionExpiry?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Social
*/
@Parcelize
data class Social(
    
    
    
    @SerializedName("account_kit")
    var accountKit: Boolean?=null,
    
    @SerializedName("facebook")
    var facebook: Boolean?=null,
    
    @SerializedName("google")
    var google: Boolean?=null,
    
    @SerializedName("apple")
    var apple: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    
    @SerializedName("email")
    var email: PlatformEmail?=null,
    
    @SerializedName("mobile")
    var mobile: PlatformMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformEmail
*/
@Parcelize
data class PlatformEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformMobile
*/
@Parcelize
data class PlatformMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FlashCard
*/
@Parcelize
data class FlashCard(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("text_color")
    var textColor: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SocialTokens
*/
@Parcelize
data class SocialTokens(
    
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    
    @SerializedName("account_kit")
    var accountKit: Accountkit?=null,
    
    @SerializedName("google")
    var google: Google?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAccountReasons
*/
@Parcelize
data class DeleteAccountReasons(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAccountConsent
*/
@Parcelize
data class DeleteAccountConsent(
    
    
    
    @SerializedName("consent_text")
    var consentText: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetUserTimeline
*/
@Parcelize
data class GetUserTimeline(
    
    
    
    @SerializedName("delete_on")
    var deleteOn: String?=null,
    
    @SerializedName("timeline")
    var timeline: ArrayList<UserTimeline>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserTimeline
*/
@Parcelize
data class UserTimeline(
    
    
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("visible")
    var visible: Boolean?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("app_secret")
    var appSecret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("app_secret")
    var appSecret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("app_secret")
    var appSecret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SessionExpiry
*/
@Parcelize
data class SessionExpiry(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_rolling")
    var isRolling: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateUserGroupSchema
*/
@Parcelize
data class UpdateUserGroupSchema(
    
    
    
    @SerializedName("conditions")
    var conditions: ArrayList<ConditionsSchema>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PartialUserGroupUpdateSchema
*/
@Parcelize
data class PartialUserGroupUpdateSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("user_data")
    var userData: ArrayList<UserGroupUpdateData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserGroupUpdateData
*/
@Parcelize
data class UserGroupUpdateData(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateUserRequestSchema
*/
@Parcelize
data class UpdateUserRequestSchema(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("rr_id")
    var rrId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<UserPhoneNumbers>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<UserEmails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserEmails
*/
@Parcelize
data class UserEmails(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserPhoneNumbers
*/
@Parcelize
data class UserPhoneNumbers(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("rr_id")
    var rrId: String?=null,
    
    @SerializedName("consent")
    var consent: UserConsent?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSearchSchema
*/
@Parcelize
data class UserSearchSchema(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("rr_id")
    var rrId: String?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("deleted_on")
    var deletedOn: String?=null,
    
    @SerializedName("consent")
    var consent: UserConsent?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserConsent
*/
@Parcelize
data class UserConsent(
    
    
    
    @SerializedName("privacy_policy")
    var privacyPolicy: PrivacyPolicyConsentSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteUserGroupSuccess
*/
@Parcelize
data class DeleteUserGroupSuccess(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PrivacyPolicyConsentSchema
*/
@Parcelize
data class PrivacyPolicyConsentSchema(
    
    
    
    @SerializedName("value")
    var value: Boolean?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





