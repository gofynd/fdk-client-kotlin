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
    
    @SerializedName("items")
    var items: ArrayList<Ticket>?=null,
    @SerializedName("filters")
    var filters: Filter?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null
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
    var participants: ArrayList<Participant>?=null
): Parcelable

/*
    Model: Participant
*/
@Parcelize
data class Participant(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone")
    var phone: Phone?=null
): Parcelable

/*
    Model: Phone
*/
@Parcelize
data class Phone(
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
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
    Model: TicketAsset
*/
@Parcelize
data class TicketAsset(
    
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
    var attachments: ArrayList<TicketAsset>?=null
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
    Model: Asset
*/
@Parcelize
data class Asset(
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
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
    Model: APIError
*/
@Parcelize
data class APIError(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("status")
    var status: Double?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("info")
    var info: String?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
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
    Model: UnauthenticatedUser
*/
@Parcelize
data class UnauthenticatedUser(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UnauthenticatedApplication
*/
@Parcelize
data class UnauthenticatedApplication(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: BadRequest
*/
@Parcelize
data class BadRequest(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: ResourceNotFound
*/
@Parcelize
data class ResourceNotFound(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: InternalServerError
*/
@Parcelize
data class InternalServerError(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: Plan
*/
@Parcelize
data class Plan(
    
    @SerializedName("recurring")
    var recurring: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    @SerializedName("plan_group")
    var planGroup: String?=null,
    @SerializedName("tagLines")
    var tagLines: ArrayList<String>?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    @SerializedName("trial_period")
    var trialPeriod: Double?=null,
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("amount")
    var amount: Double?=null,
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null
): Parcelable

/*
    Model: DetailedPlan
*/
@Parcelize
data class DetailedPlan(
    
    @SerializedName("recurring")
    var recurring: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    @SerializedName("plan_group")
    var planGroup: String?=null,
    @SerializedName("tagLines")
    var tagLines: ArrayList<String>?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    @SerializedName("trial_period")
    var trialPeriod: Double?=null,
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("amount")
    var amount: Double?=null,
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    @SerializedName("components")
    var components: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    @SerializedName("invoice_items")
    var invoiceItems: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: Invoices
*/
@Parcelize
data class Invoices(
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("start")
    var start: Int?=null,
    @SerializedName("end")
    var end: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("total")
    var total: Int?=null
): Parcelable

/*
    Model: BillingAddress
*/
@Parcelize
data class BillingAddress(
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("line1")
    var line1: String?=null,
    @SerializedName("line2")
    var line2: String?=null,
    @SerializedName("postal_code")
    var postalCode: String?=null
): Parcelable

/*
    Model: SubscriptionCustomer
*/
@Parcelize
data class SubscriptionCustomer(
    
    @SerializedName("phone")
    var phone: Phone?=null,
    @SerializedName("billing_address")
    var billingAddress: BillingAddress?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SubscriptionCustomerCreate
*/
@Parcelize
data class SubscriptionCustomerCreate(
    
    @SerializedName("phone")
    var phone: Phone?=null,
    @SerializedName("billing_address")
    var billingAddress: BillingAddress?=null,
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: Subscription
*/
@Parcelize
data class Subscription(
    
    @SerializedName("current_period")
    var currentPeriod: @RawValue HashMap<String,Any>?=null,
    @SerializedName("pause_collection")
    var pauseCollection: @RawValue HashMap<String,Any>?=null,
    @SerializedName("trial")
    var trial: @RawValue HashMap<String,Any>?=null,
    @SerializedName("invoice_settings")
    var invoiceSettings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("cancel_at_period_end")
    var cancelAtPeriodEnd: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    @SerializedName("plan_id")
    var planId: String?=null,
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    @SerializedName("plan_data")
    var planData: Plan?=null,
    @SerializedName("current_status")
    var currentStatus: String?=null,
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    @SerializedName("latest_invoice")
    var latestInvoice: String?=null
): Parcelable

/*
    Model: SubscriptionStatus
*/
@Parcelize
data class SubscriptionStatus(
    
    @SerializedName("is_enabled")
    var isEnabled: Boolean?=null,
    @SerializedName("subscription")
    var subscription: Subscription?=null
): Parcelable

/*
    Model: SubscriptionLimit
*/
@Parcelize
data class SubscriptionLimit(
    
    @SerializedName("application")
    var application: @RawValue HashMap<String,Any>?=null,
    @SerializedName("marketplace")
    var marketplace: @RawValue HashMap<String,Any>?=null,
    @SerializedName("other_platform")
    var otherPlatform: @RawValue HashMap<String,Any>?=null,
    @SerializedName("team")
    var team: @RawValue HashMap<String,Any>?=null,
    @SerializedName("products")
    var products: @RawValue HashMap<String,Any>?=null,
    @SerializedName("extensions")
    var extensions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("integrations")
    var integrations: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null
): Parcelable

/*
    Model: SubscriptionActivateReq
*/
@Parcelize
data class SubscriptionActivateReq(
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("product_suite")
    var productSuite: String?=null,
    @SerializedName("plan_id")
    var planId: String?=null,
    @SerializedName("payment_method")
    var paymentMethod: String?=null
): Parcelable

/*
    Model: SubscriptionActivateRes
*/
@Parcelize
data class SubscriptionActivateRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: Subscription?=null
): Parcelable

/*
    Model: CancelSubscriptionReq
*/
@Parcelize
data class CancelSubscriptionReq(
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("product_suite")
    var productSuite: String?=null,
    @SerializedName("subscription_id")
    var subscriptionId: String?=null
): Parcelable

/*
    Model: CancelSubscriptionRes
*/
@Parcelize
data class CancelSubscriptionRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: Subscription?=null
): Parcelable



/*
    Model: GetStats
*/
@Parcelize
data class GetStats(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: CampaignReq
*/
@Parcelize
data class CampaignReq(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null
): Parcelable

/*
    Model: Campaign
*/
@Parcelize
data class Campaign(
    
    @SerializedName("recipientHeaders")
    var recipientHeaders: @RawValue HashMap<String,Any>?=null,
    @SerializedName("email")
    var email: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("datasource")
    var datasource: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: Campaigns
*/
@Parcelize
data class Campaigns(
    
    @SerializedName("docs")
    var docs: ArrayList<Campaign>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: BigqueryHeadersReq
*/
@Parcelize
data class BigqueryHeadersReq(
    
    @SerializedName("query")
    var query: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: BigqueryHeadersRes
*/
@Parcelize
data class BigqueryHeadersRes(
    
    @SerializedName("headers")
    var headers: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetNRecordsCsvReq
*/
@Parcelize
data class GetNRecordsCsvReq(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("header")
    var header: Boolean?=null,
    @SerializedName("count")
    var count: Int?=null
): Parcelable

/*
    Model: GetNRecordsCsvRes
*/
@Parcelize
data class GetNRecordsCsvRes(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: AudienceReq
*/
@Parcelize
data class AudienceReq(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null
): Parcelable

/*
    Model: Audience
*/
@Parcelize
data class Audience(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: Audiences
*/
@Parcelize
data class Audiences(
    
    @SerializedName("docs")
    var docs: ArrayList<Audience>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: EmailProviderReq
*/
@Parcelize
data class EmailProviderReq(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("apiKey")
    var apiKey: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("from")
    var from: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: EmailProvider
*/
@Parcelize
data class EmailProvider(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("from")
    var from: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("apiKey")
    var apiKey: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: EmailProviders
*/
@Parcelize
data class EmailProviders(
    
    @SerializedName("docs")
    var docs: ArrayList<EmailProvider>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: EmailTemplateDeleteSuccessRes
*/
@Parcelize
data class EmailTemplateDeleteSuccessRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: EmailTemplateDeleteFailureRes
*/
@Parcelize
data class EmailTemplateDeleteFailureRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: EmailTemplateReq
*/
@Parcelize
data class EmailTemplateReq(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("keys")
    var keys: @RawValue HashMap<String,Any>?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("staticTo")
    var staticTo: ArrayList<String>?=null,
    @SerializedName("staticCc")
    var staticCc: ArrayList<String>?=null,
    @SerializedName("staticBcc")
    var staticBcc: ArrayList<String>?=null,
    @SerializedName("replyTo")
    var replyTo: String?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("subject")
    var subject: @RawValue HashMap<String,Any>?=null,
    @SerializedName("html")
    var html: @RawValue HashMap<String,Any>?=null,
    @SerializedName("text")
    var text: @RawValue HashMap<String,Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null
): Parcelable

/*
    Model: EmailTemplateRes
*/
@Parcelize
data class EmailTemplateRes(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("staticTo")
    var staticTo: ArrayList<String>?=null,
    @SerializedName("staticCc")
    var staticCc: ArrayList<String>?=null,
    @SerializedName("staticBcc")
    var staticBcc: ArrayList<String>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("keys")
    var keys: @RawValue HashMap<String,Any>?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("replyTo")
    var replyTo: String?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("subject")
    var subject: @RawValue HashMap<String,Any>?=null,
    @SerializedName("html")
    var html: @RawValue HashMap<String,Any>?=null,
    @SerializedName("text")
    var text: @RawValue HashMap<String,Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: EmailTemplate
*/
@Parcelize
data class EmailTemplate(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("staticTo")
    var staticTo: @RawValue ArrayList<Any>?=null,
    @SerializedName("staticCc")
    var staticCc: @RawValue ArrayList<Any>?=null,
    @SerializedName("staticBcc")
    var staticBcc: @RawValue ArrayList<Any>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("fromName")
    var fromName: String?=null,
    @SerializedName("subject")
    var subject: @RawValue HashMap<String,Any>?=null,
    @SerializedName("html")
    var html: @RawValue HashMap<String,Any>?=null,
    @SerializedName("text")
    var text: @RawValue HashMap<String,Any>?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: SystemEmailTemplate
*/
@Parcelize
data class SystemEmailTemplate(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("staticTo")
    var staticTo: @RawValue ArrayList<Any>?=null,
    @SerializedName("staticCc")
    var staticCc: @RawValue ArrayList<Any>?=null,
    @SerializedName("staticBcc")
    var staticBcc: @RawValue ArrayList<Any>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("fromName")
    var fromName: String?=null,
    @SerializedName("subject")
    var subject: @RawValue HashMap<String,Any>?=null,
    @SerializedName("html")
    var html: @RawValue HashMap<String,Any>?=null,
    @SerializedName("text")
    var text: @RawValue HashMap<String,Any>?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: EmailTemplates
*/
@Parcelize
data class EmailTemplates(
    
    @SerializedName("docs")
    var docs: ArrayList<EmailTemplate>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: SystemEmailTemplates
*/
@Parcelize
data class SystemEmailTemplates(
    
    @SerializedName("docs")
    var docs: ArrayList<SystemEmailTemplate>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: EventSubscriptions
*/
@Parcelize
data class EventSubscriptions(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: TriggerJobResponse
*/
@Parcelize
data class TriggerJobResponse(
    
    @SerializedName("status")
    var status: Int?=null
): Parcelable

/*
    Model: TriggerJobRequest
*/
@Parcelize
data class TriggerJobRequest(
    
    @SerializedName("jobId")
    var jobId: String?=null
): Parcelable

/*
    Model: Jobs
*/
@Parcelize
data class Jobs(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: JobLogs
*/
@Parcelize
data class JobLogs(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: Log
*/
@Parcelize
data class Log(
    
    @SerializedName("email")
    var email: @RawValue HashMap<String,Any>?=null,
    @SerializedName("pushnotification")
    var pushnotification: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("service")
    var service: String?=null,
    @SerializedName("step")
    var step: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
): Parcelable

/*
    Model: Logs
*/
@Parcelize
data class Logs(
    
    @SerializedName("docs")
    var docs: ArrayList<Log>?=null
): Parcelable

/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    @SerializedName("push_token")
    var pushToken: String?=null,
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null
): Parcelable

/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    @SerializedName("push_token")
    var pushToken: String?=null,
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("expired_at")
    var expiredAt: String?=null
): Parcelable

/*
    Model: SmsProviderReq
*/
@Parcelize
data class SmsProviderReq(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("authkey")
    var authkey: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null
): Parcelable

/*
    Model: SmsProvider
*/
@Parcelize
data class SmsProvider(
    
    @SerializedName("rpt")
    var rpt: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("authkey")
    var authkey: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: SmsProviders
*/
@Parcelize
data class SmsProviders(
    
    @SerializedName("docs")
    var docs: ArrayList<SmsProvider>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: SmsTemplateDeleteSuccessRes
*/
@Parcelize
data class SmsTemplateDeleteSuccessRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: SmsTemplateDeleteFailureRes
*/
@Parcelize
data class SmsTemplateDeleteFailureRes(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: SmsTemplateReq
*/
@Parcelize
data class SmsTemplateReq(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("message")
    var message: @RawValue HashMap<String,Any>?=null,
    @SerializedName("templateVariables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null
): Parcelable

/*
    Model: SmsTemplateRes
*/
@Parcelize
data class SmsTemplateRes(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: @RawValue HashMap<String,Any>?=null,
    @SerializedName("templateVariables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: SmsTemplate
*/
@Parcelize
data class SmsTemplate(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: @RawValue HashMap<String,Any>?=null,
    @SerializedName("templateVariables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: SystemSmsTemplate
*/
@Parcelize
data class SystemSmsTemplate(
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: @RawValue HashMap<String,Any>?=null,
    @SerializedName("templateVariables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: SmsTemplates
*/
@Parcelize
data class SmsTemplates(
    
    @SerializedName("docs")
    var docs: ArrayList<SmsTemplate>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable

/*
    Model: SystemSmsTemplates
*/
@Parcelize
data class SystemSmsTemplates(
    
    @SerializedName("docs")
    var docs: ArrayList<SystemSmsTemplate>?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("offset")
    var offset: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null
): Parcelable



/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("config_type")
    var configType: String?=null
): Parcelable

/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null,
    @SerializedName("app_id")
    var appId: String?=null
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
): Parcelable

/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    @SerializedName("large")
    var large: String?=null,
    @SerializedName("small")
    var small: String?=null
): Parcelable

/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
): Parcelable

/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null
): Parcelable

/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null
): Parcelable

/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
): Parcelable

/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
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
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
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
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null
): Parcelable

/*
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null
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
    Model: Document
*/
@Parcelize
data class Document(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("address")
    var address: CompanyAddress?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("document")
    var document: Document?=null
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
    
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: BusinessCountryInfo1
*/
@Parcelize
data class BusinessCountryInfo1(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null
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
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null
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
    
    @SerializedName("phone")
    var phone: ArrayList<PhoneNumber>?=null,
    @SerializedName("emails")
    var emails: ArrayList<String>?=null
): Parcelable

/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null
): Parcelable

/*
    Model: DocumentsObj
*/
@Parcelize
data class DocumentsObj(
    
    @SerializedName("verified")
    var verified: Int?=null,
    @SerializedName("pending")
    var pending: Int?=null
): Parcelable

/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null,
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("product")
    var product: DocumentsObj?=null
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
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
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
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
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
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("username")
    var username: String?=null
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
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null
): Parcelable

/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    @SerializedName("minute")
    var minute: Int?=null,
    @SerializedName("hour")
    var hour: Int?=null
): Parcelable

/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null
): Parcelable

/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("mobile_no")
    var mobileNo: PhoneNumber?=null
): Parcelable

/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
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
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null
): Parcelable



/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: StartResponse
*/
@Parcelize
data class StartResponse(
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null
): Parcelable

/*
    Model: StartRequest
*/
@Parcelize
data class StartRequest(
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: CompleteResponse
*/
@Parcelize
data class CompleteResponse(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null,
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable

/*
    Model: Opts
*/
@Parcelize
data class Opts(
    
    @SerializedName("attempts")
    var attempts: Int?=null,
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    @SerializedName("delay")
    var delay: Int?=null
): Parcelable

/*
    Model: CopyFileTask
*/
@Parcelize
data class CopyFileTask(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("data")
    var data: BulkRequest?=null,
    @SerializedName("opts")
    var opts: Opts?=null,
    @SerializedName("progress")
    var progress: Int?=null,
    @SerializedName("delay")
    var delay: Int?=null,
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    @SerializedName("attempts_made")
    var attemptsMade: Int?=null,
    @SerializedName("stacktrace")
    var stacktrace: ArrayList<String>?=null,
    @SerializedName("finished_on")
    var finishedOn: Int?=null,
    @SerializedName("processed_on")
    var processedOn: Int?=null
): Parcelable

/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("task")
    var task: CopyFileTask?=null
): Parcelable

/*
    Model: ReqConfiguration
*/
@Parcelize
data class ReqConfiguration(
    
    @SerializedName("concurrency")
    var concurrency: Int?=null
): Parcelable

/*
    Model: Destination
*/
@Parcelize
data class Destination(
    
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("rewrite")
    var rewrite: String?=null,
    @SerializedName("basepath")
    var basepath: String?=null
): Parcelable

/*
    Model: BulkRequest
*/
@Parcelize
data class BulkRequest(
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    @SerializedName("destination")
    var destination: Destination?=null,
    @SerializedName("configuration")
    var configuration: ReqConfiguration?=null
): Parcelable

/*
    Model: Urls
*/
@Parcelize
data class Urls(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("signed_url")
    var signedUrl: String?=null,
    @SerializedName("expiry")
    var expiry: Int?=null
): Parcelable

/*
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
): Parcelable

/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
): Parcelable

/*
    Model: Item
*/
@Parcelize
data class Item(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable

/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    @SerializedName("items")
    var items: ArrayList<Item>?=null,
    @SerializedName("page")
    var page: Page?=null
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
    Model: ApplicationInventory
*/
@Parcelize
data class ApplicationInventory(
    
    @SerializedName("inventory")
    var inventory: AppInventoryConfig?=null,
    @SerializedName("authentication")
    var authentication: AuthenticationConfig?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignmentConfig?=null,
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null,
    @SerializedName("cart")
    var cart: AppCartConfig?=null,
    @SerializedName("payment")
    var payment: AppPaymentConfig?=null,
    @SerializedName("order")
    var order: AppOrderConfig?=null,
    @SerializedName("logistics")
    var logistics: AppLogisticsConfig?=null,
    @SerializedName("business")
    var business: String?=null,
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null,
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null
): Parcelable

/*
    Model: AppInventoryConfig
*/
@Parcelize
data class AppInventoryConfig(
    
    @SerializedName("brand")
    var brand: InventoryBrand?=null,
    @SerializedName("store")
    var store: InventoryStore?=null,
    @SerializedName("category")
    var category: InventoryCategory?=null,
    @SerializedName("price")
    var price: InventoryPrice?=null,
    @SerializedName("discount")
    var discount: InventoryDiscount?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("exclude_category")
    var excludeCategory: @RawValue ArrayList<Any>?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("company_store")
    var companyStore: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: InventoryBrand
*/
@Parcelize
data class InventoryBrand(
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: InventoryStore
*/
@Parcelize
data class InventoryStore(
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("stores")
    var stores: @RawValue ArrayList<Any>?=null,
    @SerializedName("rules")
    var rules: AppStoreRules?=null
): Parcelable

/*
    Model: AppStoreRules
*/
@Parcelize
data class AppStoreRules(
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: InventoryCategory
*/
@Parcelize
data class InventoryCategory(
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("categories")
    var categories: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: InventoryPrice
*/
@Parcelize
data class InventoryPrice(
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("max")
    var max: Double?=null
): Parcelable

/*
    Model: InventoryDiscount
*/
@Parcelize
data class InventoryDiscount(
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("max")
    var max: Double?=null
): Parcelable

/*
    Model: AuthenticationConfig
*/
@Parcelize
data class AuthenticationConfig(
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("provider")
    var provider: String?=null
): Parcelable

/*
    Model: ArticleAssignmentConfig
*/
@Parcelize
data class ArticleAssignmentConfig(
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRules?=null,
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("enforced_stores")
    var enforcedStores: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: ArticleAssignmentRules
*/
@Parcelize
data class ArticleAssignmentRules(
    
    @SerializedName("store_priority")
    var storePriority: StorePriority?=null
): Parcelable

/*
    Model: StorePriority
*/
@Parcelize
data class StorePriority(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("storetype_order")
    var storetypeOrder: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: RewardPointsConfig
*/
@Parcelize
data class RewardPointsConfig(
    
    @SerializedName("credit")
    var credit: Credit?=null,
    @SerializedName("debit")
    var debit: Debit?=null
): Parcelable

/*
    Model: Credit
*/
@Parcelize
data class Credit(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: Debit
*/
@Parcelize
data class Debit(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    @SerializedName("strategy_channel")
    var strategyChannel: String?=null
): Parcelable

/*
    Model: AppCartConfig
*/
@Parcelize
data class AppCartConfig(
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null,
    @SerializedName("min_cart_value")
    var minCartValue: Double?=null,
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null
): Parcelable

/*
    Model: DeliveryCharges
*/
@Parcelize
data class DeliveryCharges(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("charges")
    var charges: Charges?=null
): Parcelable

/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    @SerializedName("charges")
    var charges: Double?=null
): Parcelable

/*
    Model: AppPaymentConfig
*/
@Parcelize
data class AppPaymentConfig(
    
    @SerializedName("callback_url")
    var callbackUrl: CallbackUrl?=null,
    @SerializedName("methods")
    var methods: Methods?=null,
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("cod_amount_limit")
    var codAmountLimit: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null
): Parcelable

/*
    Model: CallbackUrl
*/
@Parcelize
data class CallbackUrl(
    
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("web")
    var web: String?=null
): Parcelable

/*
    Model: Methods
*/
@Parcelize
data class Methods(
    
    @SerializedName("PL")
    var pl: PaymentModeConfig?=null,
    @SerializedName("CARD")
    var card: PaymentModeConfig?=null,
    @SerializedName("NB")
    var nb: PaymentModeConfig?=null,
    @SerializedName("WL")
    var wl: PaymentModeConfig?=null,
    @SerializedName("PS")
    var ps: PaymentModeConfig?=null,
    @SerializedName("UPI")
    var upi: PaymentModeConfig?=null,
    @SerializedName("QR")
    var qr: PaymentModeConfig?=null,
    @SerializedName("COD")
    var cod: PaymentModeConfig?=null,
    @SerializedName("PP")
    var pp: PaymentModeConfig?=null,
    @SerializedName("JP")
    var jp: PaymentModeConfig?=null,
    @SerializedName("PAC")
    var pac: PaymentModeConfig?=null,
    @SerializedName("FC")
    var fc: PaymentModeConfig?=null,
    @SerializedName("JIOPP")
    var jiopp: PaymentModeConfig?=null,
    @SerializedName("STRIPEPG")
    var stripepg: PaymentModeConfig?=null,
    @SerializedName("JUSPAYPG")
    var juspaypg: PaymentModeConfig?=null,
    @SerializedName("PAYUBIZPG")
    var payubizpg: PaymentModeConfig?=null,
    @SerializedName("PAYUMONEYPG")
    var payumoneypg: PaymentModeConfig?=null,
    @SerializedName("RUPIFIPG")
    var rupifipg: PaymentModeConfig?=null,
    @SerializedName("SIMPL")
    var simpl: PaymentModeConfig?=null
): Parcelable

/*
    Model: PaymentModeConfig
*/
@Parcelize
data class PaymentModeConfig(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("default_options")
    var defaultOptions: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
): Parcelable

/*
    Model: AppOrderConfig
*/
@Parcelize
data class AppOrderConfig(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null
): Parcelable

/*
    Model: AppLogisticsConfig
*/
@Parcelize
data class AppLogisticsConfig(
    
    @SerializedName("logistics_by_seller")
    var logisticsBySeller: Boolean?=null,
    @SerializedName("serviceability_check")
    var serviceabilityCheck: Boolean?=null,
    @SerializedName("same_day_delivery")
    var sameDayDelivery: Boolean?=null,
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null
): Parcelable

/*
    Model: AppInventoryPartialUpdate
*/
@Parcelize
data class AppInventoryPartialUpdate(
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null,
    @SerializedName("cart")
    var cart: AppCartConfig?=null,
    @SerializedName("payment")
    var payment: AppPaymentConfig?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null
): Parcelable

/*
    Model: BrandCompanyInfo
*/
@Parcelize
data class BrandCompanyInfo(
    
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
): Parcelable

/*
    Model: CompanyByBrandsRequest
*/
@Parcelize
data class CompanyByBrandsRequest(
    
    @SerializedName("brands")
    var brands: Int?=null,
    @SerializedName("searchText")
    var searchText: String?=null
): Parcelable

/*
    Model: CompanyByBrandsResponse
*/
@Parcelize
data class CompanyByBrandsResponse(
    
    @SerializedName("items")
    var items: ArrayList<BrandCompanyInfo>?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: StoreByBrandsRequest
*/
@Parcelize
data class StoreByBrandsRequest(
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("brands")
    var brands: Int?=null,
    @SerializedName("searchText")
    var searchText: String?=null
): Parcelable

/*
    Model: StoreByBrandsResponse
*/
@Parcelize
data class StoreByBrandsResponse(
    
    @SerializedName("items")
    var items: ArrayList<BrandStoreInfo>?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: BrandStoreInfo
*/
@Parcelize
data class BrandStoreInfo(
    
    @SerializedName("store_name")
    var storeName: String?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("store_address")
    var storeAddress: OptedStoreAddress?=null,
    @SerializedName("company")
    var company: OptedCompany?=null
): Parcelable

/*
    Model: CompanyBrandInfo
*/
@Parcelize
data class CompanyBrandInfo(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: Int?=null,
    @SerializedName("brand_logo_url")
    var brandLogoUrl: String?=null,
    @SerializedName("brand_banner_url")
    var brandBannerUrl: String?=null,
    @SerializedName("brand_banner_portrait_url")
    var brandBannerPortraitUrl: String?=null
): Parcelable

/*
    Model: BrandsByCompanyResponse
*/
@Parcelize
data class BrandsByCompanyResponse(
    
    @SerializedName("brands")
    var brands: CompanyBrandInfo?=null
): Parcelable

/*
    Model: CreateApplicationRequest
*/
@Parcelize
data class CreateApplicationRequest(
    
    @SerializedName("app")
    var app: App?=null,
    @SerializedName("configuration")
    var configuration: AppInventory?=null,
    @SerializedName("domain")
    var domain: AppDomain?=null
): Parcelable

/*
    Model: CreateAppResponse
*/
@Parcelize
data class CreateAppResponse(
    
    @SerializedName("app")
    var app: Application?=null,
    @SerializedName("configuration")
    var configuration: ApplicationInventory?=null
): Parcelable

/*
    Model: ApplicationsResponse
*/
@Parcelize
data class ApplicationsResponse(
    
    @SerializedName("items")
    var items: ArrayList<Application>?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: MobileAppConfiguration
*/
@Parcelize
data class MobileAppConfiguration(
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app_name")
    var appName: String?=null,
    @SerializedName("landing_image")
    var landingImage: LandingImage?=null,
    @SerializedName("splash_image")
    var splashImage: SplashImage?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform_type")
    var platformType: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("package_name")
    var packageName: String?=null
): Parcelable

/*
    Model: LandingImage
*/
@Parcelize
data class LandingImage(
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
): Parcelable

/*
    Model: SplashImage
*/
@Parcelize
data class SplashImage(
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
): Parcelable

/*
    Model: MobileAppConfigRequest
*/
@Parcelize
data class MobileAppConfigRequest(
    
    @SerializedName("app_name")
    var appName: String?=null,
    @SerializedName("landing_image")
    var landingImage: LandingImage?=null,
    @SerializedName("splash_image")
    var splashImage: SplashImage?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: BuildVersionHistory
*/
@Parcelize
data class BuildVersionHistory(
    
    @SerializedName("versions")
    var versions: BuildVersion?=null,
    @SerializedName("latest_available_version_name")
    var latestAvailableVersionName: String?=null
): Parcelable

/*
    Model: BuildVersion
*/
@Parcelize
data class BuildVersion(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform_type")
    var platformType: String?=null,
    @SerializedName("build_status")
    var buildStatus: String?=null,
    @SerializedName("version_name")
    var versionName: String?=null,
    @SerializedName("version_code")
    var versionCode: Int?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: AppSupportedCurrency
*/
@Parcelize
data class AppSupportedCurrency(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("supported_currency")
    var supportedCurrency: ArrayList<String>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("default_currency")
    var defaultCurrency: DefaultCurrency?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null
): Parcelable

/*
    Model: DefaultCurrency
*/
@Parcelize
data class DefaultCurrency(
    
    @SerializedName("ref")
    var ref: String?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: CurrencyConfig
*/
@Parcelize
data class CurrencyConfig(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("decimal_digits")
    var decimalDigits: Int?=null,
    @SerializedName("symbol")
    var symbol: String?=null
): Parcelable

/*
    Model: DomainAdd
*/
@Parcelize
data class DomainAdd(
    
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: DomainAddRequest
*/
@Parcelize
data class DomainAddRequest(
    
    @SerializedName("domain")
    var domain: DomainAdd?=null
): Parcelable

/*
    Model: DomainsResponse
*/
@Parcelize
data class DomainsResponse(
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null
): Parcelable

/*
    Model: UpdateDomain
*/
@Parcelize
data class UpdateDomain(
    
    @SerializedName("_id")
    var id: String?=null
): Parcelable

/*
    Model: UpdateDomainTypeRequest
*/
@Parcelize
data class UpdateDomainTypeRequest(
    
    @SerializedName("domain")
    var domain: UpdateDomain?=null,
    @SerializedName("action")
    var action: String?=null
): Parcelable

/*
    Model: DomainStatusRequest
*/
@Parcelize
data class DomainStatusRequest(
    
    @SerializedName("domain_url")
    var domainUrl: String?=null
): Parcelable

/*
    Model: DomainStatus
*/
@Parcelize
data class DomainStatus(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("status")
    var status: Boolean?=null
): Parcelable

/*
    Model: DomainStatusResponse
*/
@Parcelize
data class DomainStatusResponse(
    
    @SerializedName("connected")
    var connected: Boolean?=null,
    @SerializedName("status")
    var status: ArrayList<DomainStatus>?=null
): Parcelable

/*
    Model: DomainSuggestionsRequest
*/
@Parcelize
data class DomainSuggestionsRequest(
    
    @SerializedName("domain_url")
    var domainUrl: String?=null,
    @SerializedName("custom")
    var custom: Boolean?=null
): Parcelable

/*
    Model: DomainSuggestion
*/
@Parcelize
data class DomainSuggestion(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("unsupported")
    var unsupported: Boolean?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("price")
    var price: Double?=null,
    @SerializedName("currency")
    var currency: String?=null
): Parcelable

/*
    Model: DomainSuggestionsResponse
*/
@Parcelize
data class DomainSuggestionsResponse(
    
    @SerializedName("domains")
    var domains: ArrayList<DomainSuggestion>?=null
): Parcelable

/*
    Model: GetIntegrationsOptInsResponse
*/
@Parcelize
data class GetIntegrationsOptInsResponse(
    
    @SerializedName("items")
    var items: IntegrationOptIn?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: IntegrationOptIn
*/
@Parcelize
data class IntegrationOptIn(
    
    @SerializedName("validators")
    var validators: Validators?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("descriptionHTML")
    var descriptionHtml: String?=null,
    @SerializedName("constants")
    var constants: String?=null,
    @SerializedName("companies")
    var companies: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("support")
    var support: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: IntegrationMeta?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("owner")
    var owner: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: Validators
*/
@Parcelize
data class Validators(
    
    @SerializedName("company")
    var company: CompanyValidator?=null,
    @SerializedName("store")
    var store: StoreValidator?=null,
    @SerializedName("inventory")
    var inventory: InventoryValidator?=null,
    @SerializedName("order")
    var order: OrderValidator?=null
): Parcelable

/*
    Model: CompanyValidator
*/
@Parcelize
data class CompanyValidator(
    
    @SerializedName("jsonSchema")
    var jsonSchema: JsonSchema?=null,
    @SerializedName("browserScript")
    var browserScript: String?=null
): Parcelable

/*
    Model: JsonSchema
*/
@Parcelize
data class JsonSchema(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("tooltip")
    var tooltip: String?=null
): Parcelable

/*
    Model: StoreValidator
*/
@Parcelize
data class StoreValidator(
    
    @SerializedName("jsonSchema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browserScript")
    var browserScript: String?=null
): Parcelable

/*
    Model: InventoryValidator
*/
@Parcelize
data class InventoryValidator(
    
    @SerializedName("jsonSchema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browserScript")
    var browserScript: String?=null
): Parcelable

/*
    Model: OrderValidator
*/
@Parcelize
data class OrderValidator(
    
    @SerializedName("jsonSchema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browserScript")
    var browserScript: String?=null
): Parcelable

/*
    Model: IntegrationMeta
*/
@Parcelize
data class IntegrationMeta(
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: Integration
*/
@Parcelize
data class Integration(
    
    @SerializedName("validators")
    var validators: Validators?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("descriptionHTML")
    var descriptionHtml: String?=null,
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("companies")
    var companies: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("support")
    var support: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: IntegrationMeta?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("owner")
    var owner: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: IntegrationConfigResponse
*/
@Parcelize
data class IntegrationConfigResponse(
    
    @SerializedName("items")
    var items: IntegrationLevel?=null
): Parcelable

/*
    Model: IntegrationLevel
*/
@Parcelize
data class IntegrationLevel(
    
    @SerializedName("opted")
    var opted: Boolean?=null,
    @SerializedName("permissions")
    var permissions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("lastPatch")
    var lastPatch: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("level")
    var level: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue ArrayList<Any>?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: OptedStoreIntegration
*/
@Parcelize
data class OptedStoreIntegration(
    
    @SerializedName("otherOpted")
    var otherOpted: Boolean?=null,
    @SerializedName("otherIntegration")
    var otherIntegration: IntegrationOptIn?=null,
    @SerializedName("otherEntity")
    var otherEntity: OtherEntity?=null
): Parcelable

/*
    Model: OtherEntity
*/
@Parcelize
data class OtherEntity(
    
    @SerializedName("opted")
    var opted: Boolean?=null,
    @SerializedName("permissions")
    var permissions: ArrayList<String>?=null,
    @SerializedName("lastPatch")
    var lastPatch: LastPatch?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("level")
    var level: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("data")
    var data: OtherEntityData?=null,
    @SerializedName("meta")
    var meta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: LastPatch
*/
@Parcelize
data class LastPatch(
    
    @SerializedName("op")
    var op: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: OtherEntityData
*/
@Parcelize
data class OtherEntityData(
    
    @SerializedName("article_identifier")
    var articleIdentifier: String?=null
): Parcelable

/*
    Model: App
*/
@Parcelize
data class App(
    
    @SerializedName("company_id")
    var companyId: String?=null,
    @SerializedName("channel_type")
    var channelType: String?=null,
    @SerializedName("auth")
    var auth: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("desc")
    var desc: String?=null
): Parcelable

/*
    Model: AppInventory
*/
@Parcelize
data class AppInventory(
    
    @SerializedName("brand")
    var brand: InventoryBrandRule?=null,
    @SerializedName("store")
    var store: InventoryStoreRule?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("payment")
    var payment: InventoryPaymentConfig?=null,
    @SerializedName("article_assignment")
    var articleAssignment: InventoryArticleAssignment?=null
): Parcelable

/*
    Model: AppDomain
*/
@Parcelize
data class AppDomain(
    
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: CompaniesResponse
*/
@Parcelize
data class CompaniesResponse(
    
    @SerializedName("items")
    var items: AppInventoryCompanies?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: AppInventoryCompanies
*/
@Parcelize
data class AppInventoryCompanies(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null
): Parcelable

/*
    Model: StoresResponse
*/
@Parcelize
data class StoresResponse(
    
    @SerializedName("items")
    var items: AppInventoryStores?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: AppInventoryStores
*/
@Parcelize
data class AppInventoryStores(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
): Parcelable

/*
    Model: FilterOrderingStoreRequest
*/
@Parcelize
data class FilterOrderingStoreRequest(
    
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    @SerializedName("q")
    var q: String?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null
): Parcelable

/*
    Model: DeploymentMeta
*/
@Parcelize
data class DeploymentMeta(
    
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: OrderingStoreConfig
*/
@Parcelize
data class OrderingStoreConfig(
    
    @SerializedName("deployment_meta")
    var deploymentMeta: DeploymentMeta?=null
): Parcelable

/*
    Model: OtherSellerCompany
*/
@Parcelize
data class OtherSellerCompany(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: OtherSellerApplication
*/
@Parcelize
data class OtherSellerApplication(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("domain")
    var domain: String?=null,
    @SerializedName("company")
    var company: OtherSellerCompany?=null,
    @SerializedName("opt_type")
    var optType: String?=null
): Parcelable

/*
    Model: OtherSellerApplications
*/
@Parcelize
data class OtherSellerApplications(
    
    @SerializedName("items")
    var items: ArrayList<OtherSellerApplication>?=null,
    @SerializedName("page")
    var page: Pagination?=null
): Parcelable

/*
    Model: OptedApplicationResponse
*/
@Parcelize
data class OptedApplicationResponse(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("domain")
    var domain: String?=null,
    @SerializedName("company")
    var company: OptedCompany?=null,
    @SerializedName("opted_inventory")
    var optedInventory: OptedInventory?=null,
    @SerializedName("opt_out_inventory")
    var optOutInventory: OptOutInventory?=null
): Parcelable

/*
    Model: OptedCompany
*/
@Parcelize
data class OptedCompany(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: OptedInventory
*/
@Parcelize
data class OptedInventory(
    
    @SerializedName("opt_type")
    var optType: OptType?=null,
    @SerializedName("items")
    var items: @RawValue Any?=null
): Parcelable

/*
    Model: OptType
*/
@Parcelize
data class OptType(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null
): Parcelable

/*
    Model: OptedStore
*/
@Parcelize
data class OptedStore(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("address")
    var address: OptedStoreAddress?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
): Parcelable

/*
    Model: OptedStoreAddress
*/
@Parcelize
data class OptedStoreAddress(
    
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("city")
    var city: String?=null
): Parcelable

/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
): Parcelable

/*
    Model: OptOutInventory
*/
@Parcelize
data class OptOutInventory(
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    @SerializedName("company")
    var company: ArrayList<Int>?=null
): Parcelable

/*
    Model: TokenResponse
*/
@Parcelize
data class TokenResponse(
    
    @SerializedName("tokens")
    var tokens: Tokens?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: Tokens
*/
@Parcelize
data class Tokens(
    
    @SerializedName("firebase")
    var firebase: Firebase?=null,
    @SerializedName("moengage")
    var moengage: Moengage?=null,
    @SerializedName("segment")
    var segment: Segment?=null,
    @SerializedName("gtm")
    var gtm: Gtm?=null,
    @SerializedName("freshchat")
    var freshchat: Freshchat?=null,
    @SerializedName("safetynet")
    var safetynet: Safetynet?=null,
    @SerializedName("fynd_rewards")
    var fyndRewards: FyndRewards?=null,
    @SerializedName("auth")
    var auth: Auth?=null,
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
): Parcelable

/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: Credentials
*/
@Parcelize
data class Credentials(
    
    @SerializedName("ios")
    var ios: Ios?=null,
    @SerializedName("android")
    var android: Android?=null,
    @SerializedName("project_id")
    var projectId: String?=null,
    @SerializedName("gcm_sender_id")
    var gcmSenderId: String?=null,
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: Android
*/
@Parcelize
data class Android(
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    @SerializedName("app_id")
    var appId: String?=null
): Parcelable

/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    @SerializedName("write_key")
    var writeKey: String?=null
): Parcelable

/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: FreshchatCredentials
*/
@Parcelize
data class FreshchatCredentials(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("app_key")
    var appKey: String?=null,
    @SerializedName("web_token")
    var webToken: String?=null
): Parcelable

/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
): Parcelable

/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    @SerializedName("public_key")
    var publicKey: String?=null
): Parcelable

/*
    Model: Auth
*/
@Parcelize
data class Auth(
    
    @SerializedName("google")
    var google: Google?=null,
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("accountkit")
    var accountkit: Accountkit?=null
): Parcelable

/*
    Model: Google
*/
@Parcelize
data class Google(
    
    @SerializedName("appId")
    var appId: String?=null
): Parcelable

/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    @SerializedName("appId")
    var appId: String?=null
): Parcelable

/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    @SerializedName("appId")
    var appId: String?=null
): Parcelable

/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
): Parcelable

/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    @SerializedName("api_key")
    var apiKey: String?=null
): Parcelable

/*
    Model: ProductDetailFeature
*/
@Parcelize
data class ProductDetailFeature(
    
    @SerializedName("similar")
    var similar: ArrayList<String>?=null,
    @SerializedName("seller_selection")
    var sellerSelection: Boolean?=null,
    @SerializedName("update_product_meta")
    var updateProductMeta: Boolean?=null,
    @SerializedName("request_product")
    var requestProduct: Boolean?=null
): Parcelable

/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    @SerializedName("page_type")
    var pageType: String?=null,
    @SerializedName("params")
    var params: String?=null,
    @SerializedName("query")
    var query: String?=null
): Parcelable

/*
    Model: LandingPageFeature
*/
@Parcelize
data class LandingPageFeature(
    
    @SerializedName("launch_page")
    var launchPage: LaunchPage?=null,
    @SerializedName("continue_as_guest")
    var continueAsGuest: Boolean?=null,
    @SerializedName("login_btn_text")
    var loginBtnText: String?=null,
    @SerializedName("show_domain_textbox")
    var showDomainTextbox: Boolean?=null,
    @SerializedName("show_register_btn")
    var showRegisterBtn: Boolean?=null
): Parcelable

/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
): Parcelable

/*
    Model: AppFeature
*/
@Parcelize
data class AppFeature(
    
    @SerializedName("product_detail")
    var productDetail: ProductDetailFeature?=null,
    @SerializedName("landing_page")
    var landingPage: LandingPageFeature?=null,
    @SerializedName("registration_page")
    var registrationPage: RegistrationPageFeature?=null,
    @SerializedName("home_page")
    var homePage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("common")
    var common: @RawValue HashMap<String,Any>?=null,
    @SerializedName("cart")
    var cart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("qr")
    var qr: @RawValue HashMap<String,Any>?=null,
    @SerializedName("pcr")
    var pcr: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order")
    var order: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    @SerializedName("feature")
    var feature: AppFeature?=null
): Parcelable

/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    @SerializedName("feature")
    var feature: AppFeature?=null
): Parcelable

/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("decimal_digits")
    var decimalDigits: Int?=null,
    @SerializedName("symbol")
    var symbol: String?=null
): Parcelable

/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("basepath")
    var basepath: String?=null
): Parcelable

/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
): Parcelable

/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
): Parcelable

/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("redirectTo")
    var redirectTo: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
): Parcelable

/*
    Model: Application
*/
@Parcelize
data class Application(
    
    @SerializedName("website")
    var website: ApplicationWebsite?=null,
    @SerializedName("cors")
    var cors: ApplicationCors?=null,
    @SerializedName("auth")
    var auth: ApplicationAuth?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("channel_type")
    var channelType: String?=null,
    @SerializedName("cache_ttl")
    var cacheTtl: Int?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("owner")
    var owner: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("redirections")
    var redirections: ArrayList<ApplicationRedirections>?=null,
    @SerializedName("meta")
    var meta: ArrayList<ApplicationMeta>?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    @SerializedName("app_type")
    var appType: String?=null,
    @SerializedName("mobileLogo")
    var mobileLogo: SecureUrl?=null,
    @SerializedName("domain")
    var domain: Domain?=null
): Parcelable

/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
): Parcelable

/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
): Parcelable

/*
    Model: InventoryStoreRule
*/
@Parcelize
data class InventoryStoreRule(
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("rules")
    var rules: ArrayList<StoreCriteriaRule>?=null,
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null
): Parcelable

/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    @SerializedName("source")
    var source: String?=null
): Parcelable

/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
): Parcelable

/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
): Parcelable

/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("enforced_stores")
    var enforcedStores: ArrayList<Int>?=null,
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
): Parcelable

/*
    Model: UserEmail
*/
@Parcelize
data class UserEmail(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: UserPhoneNumber
*/
@Parcelize
data class UserPhoneNumber(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("countryCode")
    var countryCode: Int?=null,
    @SerializedName("phone")
    var phone: String?=null
): Parcelable

/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
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
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    @SerializedName("support")
    var support: @RawValue HashMap<String,Any>?=null,
    @SerializedName("social_links")
    var socialLinks: @RawValue HashMap<String,Any>?=null,
    @SerializedName("links")
    var links: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("copyright_text")
    var copyrightText: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("business_highlights")
    var businessHighlights: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: ApplicationDetail
*/
@Parcelize
data class ApplicationDetail(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    @SerializedName("mobileLogo")
    var mobileLogo: SecureUrl?=null,
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    @SerializedName("domain")
    var domain: Domain?=null,
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    @SerializedName("_id")
    var id: String?=null
): Parcelable

/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
): Parcelable

/*
    Model: OrderingStore
*/
@Parcelize
data class OrderingStore(
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    @SerializedName("page")
    var page: Pagination?=null,
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null,
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

