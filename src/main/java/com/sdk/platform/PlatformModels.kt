package com.sdk.platform

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: TicketList
*/
@Parcelize
data class TicketList(
    
    @SerializedName("docs")
    var docs: ArrayList<Ticket>?=null,
    @SerializedName("filters")
    var filters: Filter?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
): Parcelable

/*
    Model: TicketHistoryList
*/
@Parcelize
data class TicketHistoryList(
    
    @SerializedName("docs")
    var docs: ArrayList<TicketHistory>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
): Parcelable

/*
    Model: CustomFormList
*/
@Parcelize
data class CustomFormList(
    
    @SerializedName("docs")
    var docs: ArrayList<CustomForm>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
): Parcelable

/*
    Model: CreateCustomFormPayload
*/
@Parcelize
data class CreateCustomFormPayload(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
): Parcelable

/*
    Model: EditCustomFormPayload
*/
@Parcelize
data class EditCustomFormPayload(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
): Parcelable

/*
    Model: EditTicketPayload
*/
@Parcelize
data class EditTicketPayload(
    
    @SerializedName("content")
    var content: TicketContent?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("assigned_to")
    var assignedTo: AgentChangePayload?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: AgentChangePayload
*/
@Parcelize
data class AgentChangePayload(
    
    @SerializedName("agent_id")
    var agentId: String?=null
): Parcelable

/*
    Model: CreateVideoRoomResponse
*/
@Parcelize
data class CreateVideoRoomResponse(
    
    @SerializedName("unique_name")
    var uniqueName: String?=null
): Parcelable

/*
    Model: CloseVideoRoomResponse
*/
@Parcelize
data class CloseVideoRoomResponse(
    
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: CreateVideoRoomPayload
*/
@Parcelize
data class CreateVideoRoomPayload(
    
    @SerializedName("unique_name")
    var uniqueName: String?=null,
    @SerializedName("notify")
    var notify: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: Filter
*/
@Parcelize
data class Filter(
    
    @SerializedName("priorities")
    var priorities: Priority?=null,
    @SerializedName("categories")
    var categories: Category?=null,
    @SerializedName("statuses")
    var statuses: Status?=null,
    @SerializedName("assignees")
    var assignees: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    @SerializedName("response")
    var response: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    @SerializedName("access_token")
    var accessToken: String?=null
): Parcelable

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    @SerializedName("participants")
    var participants: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    @SerializedName("ticket")
    var ticket: Ticket?=null
): Parcelable

/*
    Model: TicketContext
*/
@Parcelize
data class TicketContext(
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("company_id")
    var companyId: String?=null
): Parcelable

/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    @SerializedName("user_agent")
    var userAgent: String?=null
): Parcelable

/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: TicketContent
*/
@Parcelize
data class TicketContent(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("attachments")
    var attachments: ArrayList<Asset>?=null
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    @SerializedName("code")
    var code: Double?=null,
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("content")
    var content: TicketContent?=null
): Parcelable

/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("color")
    var color: String?=null
): Parcelable

/*
    Model: Status
*/
@Parcelize
data class Status(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("color")
    var color: String?=null
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("form")
    var form: CustomForm?=null
): Parcelable

/*
    Model: SubmitButton
*/
@Parcelize
data class SubmitButton(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("title_color")
    var titleColor: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
): Parcelable

/*
    Model: PollForAssignment
*/
@Parcelize
data class PollForAssignment(
    
    @SerializedName("duration")
    var duration: Double?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("failure_message")
    var failureMessage: String?=null
): Parcelable

/*
    Model: CustomForm
*/
@Parcelize
data class CustomForm(
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("submit_button")
    var submitButton: SubmitButton?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null
): Parcelable

/*
    Model: TicketHistory
*/
@Parcelize
data class TicketHistory(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null
): Parcelable

/*
    Model: Ticket
*/
@Parcelize
data class Ticket(
    
    @SerializedName("context")
    var context: TicketContext?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("response_id")
    var responseId: String?=null,
    @SerializedName("content")
    var content: TicketContent?=null,
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    @SerializedName("category")
    var category: Category?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("status")
    var status: Status?=null,
    @SerializedName("priority")
    var priority: Priority?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("assigned_to")
    var assignedTo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null
): Parcelable



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
): Parcelable

/*
    Model: ThemesListingResponseSchema
*/
@Parcelize
data class ThemesListingResponseSchema(
    
    @SerializedName("items")
    var items: ArrayList<ThemesSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
): Parcelable

/*
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    @SerializedName("theme_id")
    var themeId: String?=null
): Parcelable

/*
    Model: UpgradableThemeSchema
*/
@Parcelize
data class UpgradableThemeSchema(
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    @SerializedName("applied_theme")
    var appliedTheme: String?=null,
    @SerializedName("upgrade")
    var upgrade: Boolean?=null
): Parcelable

/*
    Model: FontsSchema
*/
@Parcelize
data class FontsSchema(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("kind")
    var kind: String?=null
): Parcelable

/*
    Model: ThemesSchema
*/
@Parcelize
data class ThemesSchema(
    
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("applied")
    var applied: Boolean?=null,
    @SerializedName("customized")
    var customized: Boolean?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("parentThemeVersion")
    var parentThemeVersion: String?=null,
    @SerializedName("parentTheme")
    var parentTheme: String?=null,
    @SerializedName("information")
    var information: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("src")
    var src: @RawValue HashMap<String,Any>?=null,
    @SerializedName("assets")
    var assets: @RawValue HashMap<String,Any>?=null,
    @SerializedName("available_pages")
    var availablePages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("pages")
    var pages: @RawValue HashMap<String,Any>?=null,
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    @SerializedName("sections")
    var sections: ArrayList<sectionSchema>?=null,
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("font")
    var font: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("colors")
    var colors: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: pagesSchema
*/
@Parcelize
data class pagesSchema(
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sections")
    var sections: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    @SerializedName("blocks")
    var blocks: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: sectionSchema
*/
@Parcelize
data class sectionSchema(
    
    @SerializedName("page_key")
    var pageKey: String?=null,
    @SerializedName("page_sections")
    var pageSections: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable



/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@Parcelize
data class SendVerificationLinkMobileRequestSchema(
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("primary")
    var primary: Boolean?=null
): Parcelable

/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null
): Parcelable

/*
    Model: EditProfileRequestSchema
*/
@Parcelize
data class EditProfileRequestSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("dob")
    var dob: String?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("androidHash")
    var androidHash: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: SendEmailOtpRequestSchema
*/
@Parcelize
data class SendEmailOtpRequestSchema(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: VerifyOtpRequestSchema
*/
@Parcelize
data class VerifyOtpRequestSchema(
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("otp")
    var otp: String?=null
): Parcelable

/*
    Model: SendMobileOtpRequestSchema
*/
@Parcelize
data class SendMobileOtpRequestSchema(
    
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("androidHash")
    var androidHash: String?=null,
    @SerializedName("force")
    var force: String?=null
): Parcelable

/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    @SerializedName("new_password")
    var newPassword: String?=null
): Parcelable

/*
    Model: FormRegisterRequestSchema
*/
@Parcelize
data class FormRegisterRequestSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("phone")
    var phone: @RawValue HashMap<String,Any>?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    @SerializedName("token")
    var token: String?=null
): Parcelable

/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("password")
    var password: String?=null
): Parcelable

/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("username")
    var username: String?=null
): Parcelable

/*
    Model: SendOtpRequestSchema
*/
@Parcelize
data class SendOtpRequestSchema(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
): Parcelable

/*
    Model: OAuthRequestSchema
*/
@Parcelize
data class OAuthRequestSchema(
    
    @SerializedName("is_signed_in")
    var isSignedIn: Boolean?=null,
    @SerializedName("oauth2")
    var oauth2: @RawValue HashMap<String,Any>?=null,
    @SerializedName("profile")
    var profile: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: AuthSuccess
*/
@Parcelize
data class AuthSuccess(
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SendOtpResponse
*/
@Parcelize
data class SendOtpResponse(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null
): Parcelable

/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("userExists")
    var userExists: Boolean?=null
): Parcelable

/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    @SerializedName("result")
    var result: Boolean?=null
): Parcelable

/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    @SerializedName("logout")
    var logout: Boolean?=null
): Parcelable

/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    @SerializedName("resend_token")
    var resendToken: String?=null
): Parcelable

/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
): Parcelable

/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
): Parcelable

/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
): Parcelable

/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
): Parcelable

/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
): Parcelable

/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
): Parcelable

/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
): Parcelable

/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("look_and_feel")
    var lookAndFeel: @RawValue HashMap<String,Any>?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    @SerializedName("login")
    var login: @RawValue HashMap<String,Any>?=null,
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("social")
    var social: @RawValue HashMap<String,Any>?=null,
    @SerializedName("required_fields")
    var requiredFields: @RawValue HashMap<String,Any>?=null,
    @SerializedName("register_required_fields")
    var registerRequiredFields: @RawValue HashMap<String,Any>?=null,
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    @SerializedName("flash_card")
    var flashCard: @RawValue HashMap<String,Any>?=null,
    @SerializedName("subtext")
    var subtext: String?=null,
    @SerializedName("social_tokens")
    var socialTokens: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("register")
    var register: Boolean?=null
): Parcelable

/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone_numbers")
    var phoneNumbers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("emails")
    var emails: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("account_type")
    var accountType: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("debug")
    var debug: @RawValue HashMap<String,Any>?=null,
    @SerializedName("has_old_password_hash")
    var hasOldPasswordHash: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
): Parcelable



/*
    Model: ApplicationLegal
*/
@Parcelize
data class ApplicationLegal(
    
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("tnc")
    var tnc: String?=null,
    @SerializedName("policy")
    var policy: String?=null,
    @SerializedName("faq")
    var faq: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("__v")
    var v: Double?=null
): Parcelable

/*
    Model: Seo
*/
@Parcelize
data class Seo(
    
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("robots_txt")
    var robotsTxt: String?=null,
    @SerializedName("sitemap_enabled")
    var sitemapEnabled: Boolean?=null,
    @SerializedName("custom_meta_tags")
    var customMetaTags: @RawValue ArrayList<Any>?=null,
    @SerializedName("details")
    var details: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: StorefrontAnnouncement
*/
@Parcelize
data class StorefrontAnnouncement(
    
    @SerializedName("announcements")
    var announcements: @RawValue HashMap<String,Any>?=null,
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
): Parcelable

/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("announcement")
    var announcement: String?=null,
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("editor_meta")
    var editorMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    @SerializedName("schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null
): Parcelable

/*
    Model: BlogGetResponse
*/
@Parcelize
data class BlogGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ResourceContent
*/
@Parcelize
data class ResourceContent(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: Author
*/
@Parcelize
data class Author(
    
    @SerializedName("designation")
    var designation: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: BlogSchema
*/
@Parcelize
data class BlogSchema(
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("DateMeta")
    var dateMeta: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: BlogRequest
*/
@Parcelize
data class BlogRequest(
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null
): Parcelable

/*
    Model: CreateAnnouncementSchema
*/
@Parcelize
data class CreateAnnouncementSchema(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: AdminAnnouncementSchema?=null
): Parcelable

/*
    Model: FaqSchema
*/
@Parcelize
data class FaqSchema(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null
): Parcelable

/*
    Model: CreateFaqResponseSchema
*/
@Parcelize
data class CreateFaqResponseSchema(
    
    @SerializedName("faq")
    var faq: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqSchema
*/
@Parcelize
data class CreateFaqSchema(
    
    @SerializedName("faq")
    var faq: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFaqSchema
*/
@Parcelize
data class GetFaqSchema(
    
    @SerializedName("faqs")
    var faqs: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: UpdateFaqCategoryRequestSchema
*/
@Parcelize
data class UpdateFaqCategoryRequestSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqCategoryRequestSchema
*/
@Parcelize
data class CreateFaqCategoryRequestSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqCategorySchema
*/
@Parcelize
data class CreateFaqCategorySchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFaqCategoriesSchema
*/
@Parcelize
data class GetFaqCategoriesSchema(
    
    @SerializedName("categories")
    var categories: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetFaqCategoryByIdOrSlugSchema
*/
@Parcelize
data class GetFaqCategoryByIdOrSlugSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: Navigation
*/
@Parcelize
data class Navigation(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("orientation")
    var orientation: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("position")
    var position: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("navigation")
    var navigation: NavigationRef?=null
): Parcelable

/*
    Model: NavigationRef
*/
@Parcelize
data class NavigationRef(
    
    @SerializedName("acl")
    var acl: @RawValue ArrayList<Any>?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("sort_order")
    var sortOrder: Int?=null,
    @SerializedName("sub_navigation")
    var subNavigation: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null
): Parcelable

/*
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    @SerializedName("announcements")
    var announcements: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: FaqResponseSchema
*/
@Parcelize
data class FaqResponseSchema(
    
    @SerializedName("faqs")
    var faqs: ArrayList<Faq>?=null
): Parcelable

/*
    Model: UpdateHandpickedSchema
*/
@Parcelize
data class UpdateHandpickedSchema(
    
    @SerializedName("tag")
    var tag: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: RemoveHandpickedSchema
*/
@Parcelize
data class RemoveHandpickedSchema(
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: CreateTagRequestSchema
*/
@Parcelize
data class CreateTagRequestSchema(
    
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: Faq
*/
@Parcelize
data class Faq(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: LandingPageGetResponse
*/
@Parcelize
data class LandingPageGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: LandingPageSchema
*/
@Parcelize
data class LandingPageSchema(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
): Parcelable

/*
    Model: LandingPageRequest
*/
@Parcelize
data class LandingPageRequest(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null
): Parcelable

/*
    Model: DefaultNavigationResponse
*/
@Parcelize
data class DefaultNavigationResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: NavigationGetResponse
*/
@Parcelize
data class NavigationGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: NavigationSchema
*/
@Parcelize
data class NavigationSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("orientation")
    var orientation: @RawValue HashMap<String,Any>?=null,
    @SerializedName("navigation")
    var navigation: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: NavigationRequest
*/
@Parcelize
data class NavigationRequest(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("orientation")
    var orientation: @RawValue HashMap<String,Any>?=null,
    @SerializedName("navigation")
    var navigation: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CustomBlog
*/
@Parcelize
data class CustomBlog(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageGetResponse
*/
@Parcelize
data class PageGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageSpec
*/
@Parcelize
data class PageSpec(
    
    @SerializedName("specifications")
    var specifications: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: PageSpecItem
*/
@Parcelize
data class PageSpecItem(
    
    @SerializedName("page_type")
    var pageType: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("params")
    var params: ArrayList<String>?=null,
    @SerializedName("query")
    var query: ArrayList<String>?=null
): Parcelable

/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: @RawValue ArrayList<Any>?=null,
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    @SerializedName("content")
    var content: ArrayList<PageContent>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page_meta")
    var pageMeta: ArrayList<PageMeta>?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("visibility")
    var visibility: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable

/*
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageRequest
*/
@Parcelize
data class PageRequest(
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: PagePublishRequest
*/
@Parcelize
data class PagePublishRequest(
    
    @SerializedName("publish")
    var publish: Boolean?=null
): Parcelable

/*
    Model: PageMetaSchema
*/
@Parcelize
data class PageMetaSchema(
    
    @SerializedName("system_pages")
    var systemPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("custom_pages")
    var customPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application_id")
    var applicationId: String?=null
): Parcelable

/*
    Model: SlideshowGetResponse
*/
@Parcelize
data class SlideshowGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SlideshowSchema
*/
@Parcelize
data class SlideshowSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
): Parcelable

/*
    Model: SlideshowRequest
*/
@Parcelize
data class SlideshowRequest(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

/*
    Model: Support
*/
@Parcelize
data class Support(
    
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("contact")
    var contact: @RawValue HashMap<String,Any>?=null
): Parcelable



/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("secret")
    var secret: String?=null
): Parcelable

/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null
): Parcelable

/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null
): Parcelable

/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
): Parcelable

/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    @SerializedName("small")
    var small: String?=null,
    @SerializedName("large")
    var large: String?=null
): Parcelable

/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
): Parcelable

/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("payment_options")
    var paymentOptions: ArrayList<RootPaymentMode>?=null
): Parcelable

/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: DeletePayoutResponse
*/
@Parcelize
data class DeletePayoutResponse(
    
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: SubscriptionPaymentMethodResponse
*/
@Parcelize
data class SubscriptionPaymentMethodResponse(
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@Parcelize
data class DeleteSubscriptionPaymentMethodResponse(
    
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: SubscriptionConfigResponse
*/
@Parcelize
data class SubscriptionConfigResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null
): Parcelable

/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@Parcelize
data class SaveSubscriptionSetupIntentRequest(
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
): Parcelable

/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@Parcelize
data class SaveSubscriptionSetupIntentResponse(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable



/*
    Model: GetActivityStatus
*/
@Parcelize
data class GetActivityStatus(
    
    @SerializedName("activity_history")
    var activityHistory: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: FailedOrders
*/
@Parcelize
data class FailedOrders(
    
    @SerializedName("orders")
    var orders: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: OrderListing
*/
@Parcelize
data class OrderListing(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    @SerializedName("next_order_status")
    var nextOrderStatus: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("applied_filters")
    var appliedFilters: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: UpdateOrderReprocessResponse
*/
@Parcelize
data class UpdateOrderReprocessResponse(
    
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: PlatformOrderTrack
*/
@Parcelize
data class PlatformOrderTrack(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resendToken")
    var resendToken: String?=null
): Parcelable

/*
    Model: GetPingResponse
*/
@Parcelize
data class GetPingResponse(
    
    @SerializedName("ping")
    var ping: String?=null
): Parcelable

/*
    Model: UpdateShipmentStatusResponse
*/
@Parcelize
data class UpdateShipmentStatusResponse(
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    @SerializedName("error_shipments")
    var errorShipments: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: UpdateShipmentStatusBody
*/
@Parcelize
data class UpdateShipmentStatusBody(
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    @SerializedName("task")
    var task: Boolean?=null
): Parcelable

/*
    Model: PlatformShipmentTrack
*/
@Parcelize
data class PlatformShipmentTrack(
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: UpdateProcessShipmenstRequestBody
*/
@Parcelize
data class UpdateProcessShipmenstRequestBody(
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    @SerializedName("expected_status")
    var expectedStatus: String?=null
): Parcelable

/*
    Model: UpdateProcessShipmenstRequestResponse
*/
@Parcelize
data class UpdateProcessShipmenstRequestResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: GetVoiceCallbackResponse
*/
@Parcelize
data class GetVoiceCallbackResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: GetClickToCallResponse
*/
@Parcelize
data class GetClickToCallResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable



/*
    Model: Document
*/
@Parcelize
data class Document(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: ReferralInfo
*/
@Parcelize
data class ReferralInfo(
    
    @SerializedName("referral_code")
    var referralCode: String?=null
): Parcelable

/*
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("city")
    var city: String?=null
): Parcelable

/*
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    @SerializedName("document")
    var document: Document?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    @SerializedName("address")
    var address: CompanyAddress?=null
): Parcelable

/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("contact")
    var contact: String?=null
): Parcelable

/*
    Model: BusinessCountryInfo1
*/
@Parcelize
data class BusinessCountryInfo1(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: Website
*/
@Parcelize
data class Website(
    
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    @SerializedName("website")
    var website: Website?=null
): Parcelable

/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    @SerializedName("number")
    var number: String?=null
): Parcelable

/*
    Model: ContactDetails
*/
@Parcelize
data class ContactDetails(
    
    @SerializedName("emails")
    var emails: ArrayList<String>?=null,
    @SerializedName("phone")
    var phone: ArrayList<PhoneNumber>?=null
): Parcelable

/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("city")
    var city: String?=null
): Parcelable

/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null
): Parcelable

/*
    Model: DocumentsObj
*/
@Parcelize
data class DocumentsObj(
    
    @SerializedName("pending")
    var pending: Int?=null,
    @SerializedName("verified")
    var verified: Int?=null
): Parcelable

/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("product")
    var product: DocumentsObj?=null,
    @SerializedName("brand")
    var brand: DocumentsObj?=null
): Parcelable

/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    @SerializedName("portrait")
    var portrait: String?=null,
    @SerializedName("landscape")
    var landscape: String?=null
): Parcelable

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("contact")
    var contact: String?=null
): Parcelable

/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company")
    var company: Int?=null
): Parcelable

/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    @SerializedName("mobile_no")
    var mobileNo: PhoneNumber?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
): Parcelable

/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null
): Parcelable

/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null
): Parcelable

/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null,
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null
): Parcelable

/*
    Model: GetAddressSerializer1
*/
@Parcelize
data class GetAddressSerializer1(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("city")
    var city: String?=null
): Parcelable

/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    @SerializedName("store_uid")
    var storeUid: Int?=null,
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
): Parcelable

/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null
): Parcelable

/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null
): Parcelable

/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    @SerializedName("inventory")
    var inventory: String?=null,
    @SerializedName("order")
    var order: String?=null
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null
): Parcelable



/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    @SerializedName("ios")
    var ios: RedirectDevice?=null,
    @SerializedName("android")
    var android: RedirectDevice?=null,
    @SerializedName("web")
    var web: @RawValue HashMap<String,Any>?=null,
    @SerializedName("force_web")
    var forceWeb: Boolean?=null
): Parcelable

/*
    Model: ShortLinkReq
*/
@Parcelize
data class ShortLinkReq(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("hash")
    var hash: String?=null,
    @SerializedName("active")
    var active: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("personalized")
    var personalized: String?=null,
    @SerializedName("app_redirect")
    var appRedirect: String?=null,
    @SerializedName("fallback")
    var fallback: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: Boolean?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("user_id")
    var userId: Boolean?=null,
    @SerializedName("created_at")
    var createdAt: Boolean?=null,
    @SerializedName("updated_at")
    var updatedAt: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
): Parcelable

/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable



/*
    Model: DataTresholdDTO
*/
@Parcelize
data class DataTresholdDTO(
    
    @SerializedName("min_price")
    var minPrice: Double?=null,
    @SerializedName("safe_stock")
    var safeStock: Int?=null,
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    @SerializedName("period_type_list")
    var periodTypeList: ArrayList<GenericDTO>?=null
): Parcelable

/*
    Model: GenericDTO
*/
@Parcelize
data class GenericDTO(
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: JobConfigDTO
*/
@Parcelize
data class JobConfigDTO(
    
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("integration_data")
    var integrationData: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("task_details")
    var taskDetails: TaskDTO?=null,
    @SerializedName("threshold_details")
    var thresholdDetails: DataTresholdDTO?=null,
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("alias")
    var alias: String?=null
): Parcelable

/*
    Model: TaskDTO
*/
@Parcelize
data class TaskDTO(
    
    @SerializedName("type")
    var type: Int?=null,
    @SerializedName("group_list")
    var groupList: ArrayList<GenericDTO>?=null
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null
): Parcelable

/*
    Model: ResponseEnvelopeString
*/
@Parcelize
data class ResponseEnvelopeString(
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: String?=null,
    @SerializedName("payload")
    var payload: String?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: AWSS3config
*/
@Parcelize
data class AWSS3config(
    
    @SerializedName("bucket")
    var bucket: String?=null,
    @SerializedName("region")
    var region: String?=null,
    @SerializedName("dir")
    var dir: String?=null,
    @SerializedName("access_key")
    var accessKey: String?=null,
    @SerializedName("secret_key")
    var secretKey: String?=null,
    @SerializedName("local_file_path")
    var localFilePath: String?=null,
    @SerializedName("archive_path")
    var archivePath: String?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("delete")
    var delete: Boolean?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
): Parcelable

/*
    Model: ArchiveConfig
*/
@Parcelize
data class ArchiveConfig(
    
    @SerializedName("delete")
    var delete: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("archive_dir")
    var archiveDir: String?=null
): Parcelable

/*
    Model: Audit
*/
@Parcelize
data class Audit(
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable

/*
    Model: CatalogMasterConfig
*/
@Parcelize
data class CatalogMasterConfig(
    
    @SerializedName("source_slug")
    var sourceSlug: String?=null
): Parcelable

/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("exclude_steps")
    var excludeSteps: ArrayList<Int>?=null,
    @SerializedName("hidden_closet_keys")
    var hiddenClosetKeys: ArrayList<String>?=null,
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null
): Parcelable

/*
    Model: DBConfig
*/
@Parcelize
data class DBConfig(
    
    @SerializedName("vendor")
    var vendor: String?=null,
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("dbname")
    var dbname: String?=null,
    @SerializedName("query")
    var query: String?=null,
    @SerializedName("procedure")
    var procedure: Boolean?=null,
    @SerializedName("driver_class")
    var driverClass: String?=null,
    @SerializedName("jdbc_url")
    var jdbcUrl: String?=null,
    @SerializedName("optional_properties")
    var optionalProperties: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: DBConnectionProfile
*/
@Parcelize
data class DBConnectionProfile(
    
    @SerializedName("inventory")
    var inventory: String?=null
): Parcelable

/*
    Model: DBParamConfig
*/
@Parcelize
data class DBParamConfig(
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: DefaultHeadersDTO
*/
@Parcelize
data class DefaultHeadersDTO(
    
    @SerializedName("store")
    var store: PropBeanDTO?=null,
    @SerializedName("intf_article_id")
    var intfArticleId: PropBeanDTO?=null,
    @SerializedName("price_effective")
    var priceEffective: PropBeanDTO?=null,
    @SerializedName("quantity")
    var quantity: PropBeanDTO?=null
): Parcelable

/*
    Model: DocMappingConfig
*/
@Parcelize
data class DocMappingConfig(
    
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("unwind_field")
    var unwindField: String?=null,
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
): Parcelable

/*
    Model: EmailConfig
*/
@Parcelize
data class EmailConfig(
    
    @SerializedName("recepient")
    var recepient: String?=null,
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("read_from_content")
    var readFromContent: Boolean?=null,
    @SerializedName("filter_based_on_recepients")
    var filterBasedOnRecepients: Boolean?=null,
    @SerializedName("pcol")
    var pcol: String?=null,
    @SerializedName("subject_line_regex")
    var subjectLineRegex: String?=null,
    @SerializedName("sender_address")
    var senderAddress: String?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("folder_name_hierarchies")
    var folderNameHierarchies: ArrayList<String>?=null,
    @SerializedName("attachment_regex")
    var attachmentRegex: String?=null,
    @SerializedName("body_content_regex")
    var bodyContentRegex: String?=null,
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("attachment_mandate")
    var attachmentMandate: Boolean?=null,
    @SerializedName("filter_files_after_extraction")
    var filterFilesAfterExtraction: Boolean?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_unread_mails")
    var readAllUnreadMails: Boolean?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("downloadable_link")
    var downloadableLink: Boolean?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: FTPConfig
*/
@Parcelize
data class FTPConfig(
    
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
): Parcelable

/*
    Model: FileConfig
*/
@Parcelize
data class FileConfig(
    
    @SerializedName("delimiter")
    var delimiter: String?=null,
    @SerializedName("charset")
    var charset: String?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("file_has_header")
    var fileHasHeader: Boolean?=null,
    @SerializedName("header_index")
    var headerIndex: Int?=null,
    @SerializedName("header_array")
    var headerArray: ArrayList<String>?=null,
    @SerializedName("data_start_index")
    var dataStartIndex: Int?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    @SerializedName("file_type")
    var fileType: String?=null,
    @SerializedName("line_validity_check")
    var lineValidityCheck: Boolean?=null,
    @SerializedName("sheet_names")
    var sheetNames: ArrayList<String>?=null,
    @SerializedName("read_all_sheets")
    var readAllSheets: Boolean?=null,
    @SerializedName("quote_char")
    var quoteChar: String?=null,
    @SerializedName("escape_char")
    var escapeChar: String?=null,
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
): Parcelable

/*
    Model: GoogleSpreadSheetConfig
*/
@Parcelize
data class GoogleSpreadSheetConfig(
    
    @SerializedName("range")
    var range: String?=null,
    @SerializedName("sheet_id")
    var sheetId: String?=null,
    @SerializedName("client_secret_location")
    var clientSecretLocation: String?=null,
    @SerializedName("cred_storage_directory")
    var credStorageDirectory: String?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
): Parcelable

/*
    Model: HttpConfig
*/
@Parcelize
data class HttpConfig(
    
    @SerializedName("hosturl")
    var hosturl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("http_method")
    var httpMethod: String?=null,
    @SerializedName("request_payload")
    var requestPayload: String?=null,
    @SerializedName("local_path")
    var localPath: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
): Parcelable

/*
    Model: JobConfig
*/
@Parcelize
data class JobConfig(
    
    @SerializedName("_id")
    var id: Int?=null,
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("task_type")
    var taskType: String?=null,
    @SerializedName("sync_delay")
    var syncDelay: Int?=null,
    @SerializedName("cron_expression")
    var cronExpression: String?=null,
    @SerializedName("store_filter")
    var storeFilter: StoreFilter?=null,
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    @SerializedName("store_config")
    var storeConfig: ArrayList<StoreConfig>?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("immediate_first_run")
    var immediateFirstRun: Boolean?=null,
    @SerializedName("disable")
    var disable: Boolean?=null,
    @SerializedName("dependent_job_codes")
    var dependentJobCodes: ArrayList<String>?=null,
    @SerializedName("company_config")
    var companyConfig: ArrayList<CompanyConfig>?=null,
    @SerializedName("company_ids")
    var companyIds: ArrayList<Int>?=null,
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    @SerializedName("db_connection_profile")
    var dbConnectionProfile: DBConnectionProfile?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null,
    @SerializedName("catalog_master_config")
    var catalogMasterConfig: CatalogMasterConfig?=null,
    @SerializedName("aggregator_types")
    var aggregatorTypes: ArrayList<String>?=null,
    @SerializedName("integration_type")
    var integrationType: String?=null,
    @SerializedName("min_price")
    var minPrice: Double?=null,
    @SerializedName("audit")
    var audit: Audit?=null,
    @SerializedName("version")
    var version: Int?=null,
    @SerializedName("alias")
    var alias: String?=null
): Parcelable

/*
    Model: JobConfigRawDTO
*/
@Parcelize
data class JobConfigRawDTO(
    
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("data")
    var data: JobConfig?=null
): Parcelable

/*
    Model: JsonDocConfig
*/
@Parcelize
data class JsonDocConfig(
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null
): Parcelable

/*
    Model: LocalFileConfig
*/
@Parcelize
data class LocalFileConfig(
    
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("working_dir")
    var workingDir: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
): Parcelable

/*
    Model: MongoDocConfig
*/
@Parcelize
data class MongoDocConfig(
    
    @SerializedName("collection_name")
    var collectionName: String?=null,
    @SerializedName("find_query")
    var findQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("aggregate_pipeline")
    var aggregatePipeline: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("skip_save")
    var skipSave: Boolean?=null
): Parcelable

/*
    Model: OAuthConfig
*/
@Parcelize
data class OAuthConfig(
    
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("consumer_key")
    var consumerKey: String?=null,
    @SerializedName("consumer_secret")
    var consumerSecret: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("token_secret")
    var tokenSecret: String?=null,
    @SerializedName("rest_url")
    var restUrl: String?=null,
    @SerializedName("rest_base_url")
    var restBaseUrl: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null
): Parcelable

/*
    Model: ProcessConfig
*/
@Parcelize
data class ProcessConfig(
    
    @SerializedName("db_config")
    var dbConfig: DBConfig?=null,
    @SerializedName("db_param_config")
    var dbParamConfig: DBParamConfig?=null,
    @SerializedName("sftp_config")
    var sftpConfig: SFTPConfig?=null,
    @SerializedName("aws_s3_config")
    var awsS3Config: AWSS3config?=null,
    @SerializedName("mongo_doc_config")
    var mongoDocConfig: MongoDocConfig?=null,
    @SerializedName("ftp_config")
    var ftpConfig: FTPConfig?=null,
    @SerializedName("email_config")
    var emailConfig: EmailConfig?=null,
    @SerializedName("file_config")
    var fileConfig: FileConfig?=null,
    @SerializedName("json_doc_config")
    var jsonDocConfig: JsonDocConfig?=null,
    @SerializedName("doc_mapping_config")
    var docMappingConfig: DocMappingConfig?=null,
    @SerializedName("task_step_config")
    var taskStepConfig: TaskStepConfig?=null,
    @SerializedName("http_config")
    var httpConfig: HttpConfig?=null,
    @SerializedName("local_file_config")
    var localFileConfig: LocalFileConfig?=null,
    @SerializedName("oauth_config")
    var oauthConfig: OAuthConfig?=null,
    @SerializedName("google_spreadsheet_config")
    var googleSpreadsheetConfig: GoogleSpreadSheetConfig?=null
): Parcelable

/*
    Model: PropBeanConfig
*/
@Parcelize
data class PropBeanConfig(
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("mapping")
    var mapping: @RawValue HashMap<String,Any>?=null,
    @SerializedName("optional")
    var optional: Boolean?=null,
    @SerializedName("send")
    var send: Send?=null,
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    @SerializedName("include")
    var include: Boolean?=null,
    @SerializedName("source_field")
    var sourceField: String?=null,
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    @SerializedName("destination_field")
    var destinationField: String?=null,
    @SerializedName("data_type")
    var dataType: String?=null,
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("concat_str")
    var concatStr: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null,
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    @SerializedName("index_field")
    var indexField: String?=null,
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
): Parcelable

/*
    Model: PropBeanDTO
*/
@Parcelize
data class PropBeanDTO(
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("optional")
    var optional: Boolean?=null,
    @SerializedName("include")
    var include: Boolean?=null,
    @SerializedName("source_field")
    var sourceField: String?=null,
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    @SerializedName("destination_field")
    var destinationField: String?=null,
    @SerializedName("data_type")
    var dataType: String?=null,
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("concat_str")
    var concatStr: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null,
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    @SerializedName("index_field")
    var indexField: String?=null,
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigRawDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigRawDTO(
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigRawDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigRawDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: SFTPConfig
*/
@Parcelize
data class SFTPConfig(
    
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("private_key_path")
    var privateKeyPath: String?=null,
    @SerializedName("strict_host_key_checking")
    var strictHostKeyChecking: Boolean?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
): Parcelable

/*
    Model: Send
*/
@Parcelize
data class Send(
    
    @SerializedName("raw")
    var raw: Boolean?=null,
    @SerializedName("processed")
    var processed: Boolean?=null
): Parcelable

/*
    Model: StoreConfig
*/
@Parcelize
data class StoreConfig(
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("storeid")
    var storeid: String?=null,
    @SerializedName("store_alias")
    var storeAlias: String?=null,
    @SerializedName("store_file_regex")
    var storeFileRegex: String?=null,
    @SerializedName("store_file_name")
    var storeFileName: String?=null,
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: StoreFilter
*/
@Parcelize
data class StoreFilter(
    
    @SerializedName("include_tags")
    var includeTags: ArrayList<String>?=null,
    @SerializedName("exclude_tags")
    var excludeTags: ArrayList<String>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: TaskConfig
*/
@Parcelize
data class TaskConfig(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("task_config_id")
    var taskConfigId: Int?=null,
    @SerializedName("task_params")
    var taskParams: ArrayList<TaskParam>?=null
): Parcelable

/*
    Model: TaskParam
*/
@Parcelize
data class TaskParam(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: TaskStepConfig
*/
@Parcelize
data class TaskStepConfig(
    
    @SerializedName("task_configs")
    var taskConfigs: ArrayList<TaskConfig>?=null,
    @SerializedName("task_config_ids")
    var taskConfigIds: ArrayList<Int>?=null,
    @SerializedName("task_config_group_ids")
    var taskConfigGroupIds: ArrayList<Int>?=null
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigDTO(
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: ResponseEnvelopeJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeJobConfigDTO(
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: JobConfigDTO?=null,
    @SerializedName("payload")
    var payload: JobConfigDTO?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: JobConfigListDTO
*/
@Parcelize
data class JobConfigListDTO(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("alias")
    var alias: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigListDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigListDTO(
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigListDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigListDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable



/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("duration")
    var duration: Int?=null
): Parcelable

/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null,
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
): Parcelable

/*
    Model: State
*/
@Parcelize
data class State(
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    @SerializedName("is_public")
    var isPublic: Boolean?=null
): Parcelable

/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    @SerializedName("payable_category")
    var payableCategory: String?=null
): Parcelable

/*
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
): Parcelable

/*
    Model: PaymentAllowValue
*/
@Parcelize
data class PaymentAllowValue(
    
    @SerializedName("max")
    var max: Int?=null
): Parcelable

/*
    Model: PaymentModes
*/
@Parcelize
data class PaymentModes(
    
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null
): Parcelable

/*
    Model: PaymentCodes
*/
@Parcelize
data class PaymentCodes(
    
    @SerializedName("PL")
    var pl: PaymentModes?=null,
    @SerializedName("NB")
    var nb: PaymentModes?=null,
    @SerializedName("UPI")
    var upi: PaymentModes?=null,
    @SerializedName("WL")
    var wl: PaymentModes?=null,
    @SerializedName("CARD")
    var card: PaymentModes?=null,
    @SerializedName("PS")
    var ps: PaymentModes?=null,
    @SerializedName("QR")
    var qr: PaymentModes?=null
): Parcelable

/*
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
): Parcelable

/*
    Model: PostOrder
*/
@Parcelize
data class PostOrder(
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null
): Parcelable

/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    @SerializedName("app")
    var app: Int?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("user")
    var user: Int?=null
): Parcelable

/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null,
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null
): Parcelable

/*
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    @SerializedName("payments")
    var payments: PaymentCodes?=null,
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null
): Parcelable

/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null
): Parcelable

/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("key")
    var key: Double?=null,
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("max")
    var max: Double?=null
): Parcelable

/*
    Model: Validity
*/
@Parcelize
data class Validity(
    
    @SerializedName("priority")
    var priority: Int?=null
): Parcelable

/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("value_type")
    var valueType: String?=null,
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("is_exact")
    var isExact: Boolean?=null
): Parcelable

/*
    Model: DisplayMetaDict
*/
@Parcelize
data class DisplayMetaDict(
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: DisplayMeta
*/
@Parcelize
data class DisplayMeta(
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    @SerializedName("when")
    var when: String?=null,
    @SerializedName("txn_mode")
    var txnMode: String?=null
): Parcelable

/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("author")
    var author: Author?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("action")
    var action: Action?=null
): Parcelable

/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    @SerializedName("page")
    var page: Pagination?=null,
    @SerializedName("items")
    var items: CouponAdd?=null
): Parcelable

/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("author")
    var author: Author?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("action")
    var action: Action?=null
): Parcelable

/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("schedule")
    var schedule: Schedule?=null
): Parcelable

