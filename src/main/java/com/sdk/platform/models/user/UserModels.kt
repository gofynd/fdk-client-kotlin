package com.sdk.platform.models.user

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    var users: ArrayList<UserSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    
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
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    var expireIn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserGroupResponseSchema
*/
@Parcelize
data class UserGroupResponseSchema(
    
    
    
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
    Model: CreateUserGroupSchema
*/
@Parcelize
data class CreateUserGroupSchema(
    
    
    
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
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
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
    var deleteAccountConsent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("session_config")
    var sessionConfig: @RawValue HashMap<String,Any>?=null
    
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
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
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
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



