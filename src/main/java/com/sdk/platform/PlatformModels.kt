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
    var priorities: ArrayList<Priority>?=null,
    @SerializedName("categories")
    var categories: ArrayList<TicketCategory>?=null,
    @SerializedName("statuses")
    var statuses: ArrayList<Status>?=null,
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
    var response: ArrayList<KeyValue>?=null
    
): Parcelable

/*
    Model: KeyValue
*/
@Parcelize
data class KeyValue(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null
    
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
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("identity")
    var identity: String?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("platform")
    var platform: String?=null
    
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
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
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
    var id: String?=null
    
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
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
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
    var category: TicketCategory?=null,
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
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
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
    @SerializedName("android_hash")
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
    @SerializedName("android_hash")
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
    var phone: FormRegisterRequestSchemaPhone?=null,
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
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
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
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
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
    var oauth2: OAuthRequestSchemaOauth2?=null,
    @SerializedName("profile")
    var profile: OAuthRequestSchemaProfile?=null
    
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
    var user: AuthSuccessUser?=null
    
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
    @SerializedName("user_exists")
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
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable

/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: ProfileEditSuccessSchema
*/
@Parcelize
data class ProfileEditSuccessSchema(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    @SerializedName("user")
    var user: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable

/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable

/*
    Model: OAuthRequestSchemaOauth2
*/
@Parcelize
data class OAuthRequestSchemaOauth2(
    
    
    @SerializedName("access_token")
    var accessToken: String?=null,
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("refresh_token")
    var refreshToken: String?=null
    
): Parcelable

/*
    Model: OAuthRequestSchemaProfile
*/
@Parcelize
data class OAuthRequestSchemaProfile(
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable

/*
    Model: AuthSuccessUser
*/
@Parcelize
data class AuthSuccessUser(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("debug")
    var debug: AuthSuccessUserDebug?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("emails")
    var emails: AuthSuccessUserEmails?=null
    
): Parcelable

/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable

/*
    Model: AuthSuccessUserEmails
*/
@Parcelize
data class AuthSuccessUserEmails(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: CreateUserResponseSchema
*/
@Parcelize
data class CreateUserResponseSchema(
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

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
    var desktopImage: String?=null
    
): Parcelable

/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable

/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable

/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable

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
    var google: Boolean?=null
    
): Parcelable

/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    @SerializedName("email")
    var email: Email?=null,
    @SerializedName("mobile")
    var mobile: Mobile?=null
    
): Parcelable

/*
    Model: Mobile
*/
@Parcelize
data class Mobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable

/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

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
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
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
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("debug")
    var debug: Debug?=null,
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
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("description")
    var description: String?=null
    
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
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
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
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null
    
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null
    
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
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("created")
    var created: Boolean?=null
    
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
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
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
    
    
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
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
    var activityHistory: ActivityHistory?=null
    
): Parcelable

/*
    Model: ActivityHistory
*/
@Parcelize
data class ActivityHistory(
    
    
    @SerializedName("createdat")
    var createdat: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("user")
    var user: String?=null
    
): Parcelable

/*
    Model: FailedOrders
*/
@Parcelize
data class FailedOrders(
    
    
    @SerializedName("orders")
    var orders: FailOrder?=null
    
): Parcelable

/*
    Model: FailOrder
*/
@Parcelize
data class FailOrder(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("marketplace_order")
    var marketplaceOrder: MarketplaceOrder?=null,
    @SerializedName("marketplace_order_id")
    var marketplaceOrderId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("marketplace")
    var marketplace: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable

/*
    Model: MarketplaceOrder
*/
@Parcelize
data class MarketplaceOrder(
    
    
    @SerializedName("order_status_url")
    var orderStatusUrl: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("test")
    var test: Boolean?=null,
    @SerializedName("note")
    var note: String?=null,
    @SerializedName("total_price")
    var totalPrice: String?=null,
    @SerializedName("app_id")
    var appId: Int?=null,
    @SerializedName("total_discounts_set")
    var totalDiscountsSet: TotalDiscountsSet?=null,
    @SerializedName("total_price_set")
    var totalPriceSet: TotalPriceSet?=null,
    @SerializedName("total_tax_set")
    var totalTaxSet: TotalTaxSet?=null,
    @SerializedName("gateway")
    var gateway: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("subtotal_price_set")
    var subtotalPriceSet: SubtotalPriceSet?=null,
    @SerializedName("number")
    var number: Int?=null,
    @SerializedName("buyer_accepts_marketing")
    var buyerAcceptsMarketing: Boolean?=null,
    @SerializedName("contact_email")
    var contactEmail: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("source_name")
    var sourceName: String?=null,
    @SerializedName("payment_gateway_names")
    var paymentGatewayNames: @RawValue ArrayList<Any>?=null,
    @SerializedName("presentment_currency")
    var presentmentCurrency: String?=null,
    @SerializedName("subtotal_price")
    var subtotalPrice: String?=null,
    @SerializedName("processed_at")
    var processedAt: String?=null,
    @SerializedName("order_number")
    var orderNumber: Int?=null,
    @SerializedName("total_tip_received")
    var totalTipReceived: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("confirmed")
    var confirmed: Boolean?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("total_line_items_price")
    var totalLineItemsPrice: String?=null,
    @SerializedName("line_items")
    var lineItems: LineItems?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("total_weight")
    var totalWeight: Int?=null,
    @SerializedName("billing_address")
    var billingAddress: BillingAddress?=null,
    @SerializedName("total_shipping_price_set")
    var totalShippingPriceSet: TotalShippingPriceSet?=null,
    @SerializedName("customer")
    var customer: Customer?=null,
    @SerializedName("total_discounts")
    var totalDiscounts: String?=null,
    @SerializedName("total_line_items_price_set")
    var totalLineItemsPriceSet: TotalLineItemsPriceSet?=null,
    @SerializedName("tags")
    var tags: String?=null,
    @SerializedName("total_price_usd")
    var totalPriceUsd: String?=null,
    @SerializedName("user_id")
    var userId: Int?=null,
    @SerializedName("total_tax")
    var totalTax: String?=null,
    @SerializedName("processing_method")
    var processingMethod: String?=null,
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    @SerializedName("taxes_included")
    var taxesIncluded: Boolean?=null,
    @SerializedName("financial_status")
    var financialStatus: String?=null
    
): Parcelable

/*
    Model: TotalDiscountsSet
*/
@Parcelize
data class TotalDiscountsSet(
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: PresentmentMoney?=null,
    @SerializedName("shop_money")
    var shopMoney: ShopMoney?=null
    
): Parcelable

/*
    Model: PresentmentMoney
*/
@Parcelize
data class PresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: ShopMoney
*/
@Parcelize
data class ShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalPriceSet
*/
@Parcelize
data class TotalPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalPriceSetShopMoney
*/
@Parcelize
data class TotalPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalPriceSetPresentmentMoney
*/
@Parcelize
data class TotalPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalTaxSet
*/
@Parcelize
data class TotalTaxSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalTaxSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalTaxSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalTaxSetShopMoney
*/
@Parcelize
data class TotalTaxSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalTaxSetPresentmentMoney
*/
@Parcelize
data class TotalTaxSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: SubtotalPriceSet
*/
@Parcelize
data class SubtotalPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: SubtotalPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: SubtotalPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: SubtotalPriceSetShopMoney
*/
@Parcelize
data class SubtotalPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: SubtotalPriceSetPresentmentMoney
*/
@Parcelize
data class SubtotalPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: LineItems
*/
@Parcelize
data class LineItems(
    
    
    @SerializedName("sku")
    var sku: String?=null,
    @SerializedName("fulfillable_quantity")
    var fulfillableQuantity: Int?=null,
    @SerializedName("grams")
    var grams: Int?=null,
    @SerializedName("total_discount")
    var totalDiscount: String?=null,
    @SerializedName("article")
    var article: LineItemsArticle?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("variant_inventory_management")
    var variantInventoryManagement: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("variant_id")
    var variantId: Int?=null,
    @SerializedName("variant_title")
    var variantTitle: String?=null,
    @SerializedName("product_exists")
    var productExists: Boolean?=null,
    @SerializedName("price")
    var price: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("vendor")
    var vendor: String?=null,
    @SerializedName("fulfillment_service")
    var fulfillmentService: String?=null,
    @SerializedName("taxable")
    var taxable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("product_id")
    var productId: Int?=null,
    @SerializedName("price_set")
    var priceSet: PriceSet?=null,
    @SerializedName("tax_lines")
    var taxLines: TaxLines?=null,
    @SerializedName("requires_shipping")
    var requiresShipping: Boolean?=null,
    @SerializedName("gift_card")
    var giftCard: Boolean?=null,
    @SerializedName("total_discount_set")
    var totalDiscountSet: TotalDiscountSet?=null
    
): Parcelable

/*
    Model: LineItemsArticle
*/
@Parcelize
data class LineItemsArticle(
    
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    @SerializedName("old_article_uid")
    var oldArticleUid: String?=null,
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    @SerializedName("manufacturer")
    var manufacturer: Manufacturer?=null,
    @SerializedName("price")
    var price: ArticlePrice?=null,
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    @SerializedName("company")
    var company: Company?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("date_meta")
    var dateMeta: FailOrderDateMeta?=null,
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    @SerializedName("marketplace_identifiers")
    var marketplaceIdentifiers: MarketplaceIdentifiers?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    @SerializedName("weight")
    var weight: Weight?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("meta")
    var meta: ArticleMeta?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("brand")
    var brand: ArticleBrand?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("identifier")
    var identifier: LineItemsArticleIdentifier?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable

/*
    Model: Quantities
*/
@Parcelize
data class Quantities(
    
    
    @SerializedName("not_available")
    var notAvailable: NotAvailable?=null,
    @SerializedName("sellable")
    var sellable: Sellable?=null,
    @SerializedName("order_committed")
    var orderCommitted: OrderCommitted?=null,
    @SerializedName("damaged")
    var damaged: Damaged?=null
    
): Parcelable

/*
    Model: NotAvailable
*/
@Parcelize
data class NotAvailable(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: Sellable
*/
@Parcelize
data class Sellable(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: OrderCommitted
*/
@Parcelize
data class OrderCommitted(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: Damaged
*/
@Parcelize
data class Damaged(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: Manufacturer
*/
@Parcelize
data class Manufacturer(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: ArticlePrice
*/
@Parcelize
data class ArticlePrice(
    
    
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("effective")
    var effective: Int?=null,
    @SerializedName("transfer")
    var transfer: Int?=null
    
): Parcelable

/*
    Model: Company
*/
@Parcelize
data class Company(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("pan_no")
    var panNo: String?=null,
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    @SerializedName("meta")
    var meta: String?=null,
    @SerializedName("exchange_allowed")
    var exchangeAllowed: Boolean?=null,
    @SerializedName("agreement_start_date")
    var agreementStartDate: String?=null,
    @SerializedName("exchange_within_days")
    var exchangeWithinDays: Int?=null,
    @SerializedName("payment_procesing_charge")
    var paymentProcesingCharge: Int?=null,
    @SerializedName("fynd_a_fit_available")
    var fyndAFitAvailable: Boolean?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("return_within_days")
    var returnWithinDays: Int?=null
    
): Parcelable

/*
    Model: FailOrderDateMeta
*/
@Parcelize
data class FailOrderDateMeta(
    
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: MarketplaceIdentifiers
*/
@Parcelize
data class MarketplaceIdentifiers(
    
    
    @SerializedName("tatacliq_luxury")
    var tatacliqLuxury: TatacliqLuxury?=null
    
): Parcelable

/*
    Model: TatacliqLuxury
*/
@Parcelize
data class TatacliqLuxury(
    
    
    @SerializedName("sku")
    var sku: String?=null
    
): Parcelable

/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    @SerializedName("height")
    var height: Int?=null,
    @SerializedName("width")
    var width: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("length")
    var length: Int?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("shipping")
    var shipping: Int?=null
    
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable

/*
    Model: ArticleMeta
*/
@Parcelize
data class ArticleMeta(
    
    
    @SerializedName("service")
    var service: String?=null
    
): Parcelable

/*
    Model: ArticleBrand
*/
@Parcelize
data class ArticleBrand(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable

/*
    Model: LineItemsArticleIdentifier
*/
@Parcelize
data class LineItemsArticleIdentifier(
    
    
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable

/*
    Model: PriceSet
*/
@Parcelize
data class PriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: PriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: PriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: PriceSetShopMoney
*/
@Parcelize
data class PriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: PriceSetPresentmentMoney
*/
@Parcelize
data class PriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TaxLines
*/
@Parcelize
data class TaxLines(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("price")
    var price: String?=null,
    @SerializedName("rate")
    var rate: Int?=null,
    @SerializedName("price_set")
    var priceSet: TaxLinesPriceSet?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSet
*/
@Parcelize
data class TaxLinesPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TaxLinesPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TaxLinesPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSetShopMoney
*/
@Parcelize
data class TaxLinesPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSetPresentmentMoney
*/
@Parcelize
data class TaxLinesPriceSetPresentmentMoney(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("amount")
    var amount: String?=null
    
): Parcelable

/*
    Model: TotalDiscountSet
*/
@Parcelize
data class TotalDiscountSet(
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalDiscountSetPresentmentMoney?=null,
    @SerializedName("shop_money")
    var shopMoney: TotalDiscountSetShopMoney?=null
    
): Parcelable

/*
    Model: TotalDiscountSetPresentmentMoney
*/
@Parcelize
data class TotalDiscountSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalDiscountSetShopMoney
*/
@Parcelize
data class TotalDiscountSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: BillingAddress
*/
@Parcelize
data class BillingAddress(
    
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("zip")
    var zip: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("province")
    var province: String?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSet
*/
@Parcelize
data class TotalShippingPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalShippingPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalShippingPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSetShopMoney
*/
@Parcelize
data class TotalShippingPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSetPresentmentMoney
*/
@Parcelize
data class TotalShippingPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: Customer
*/
@Parcelize
data class Customer(
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("last_order_id")
    var lastOrderId: Int?=null,
    @SerializedName("note")
    var note: String?=null,
    @SerializedName("verified_email")
    var verifiedEmail: Boolean?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("accepts_marketing")
    var acceptsMarketing: Boolean?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("tags")
    var tags: String?=null,
    @SerializedName("last_order_name")
    var lastOrderName: String?=null,
    @SerializedName("orders_count")
    var ordersCount: Int?=null,
    @SerializedName("total_spent")
    var totalSpent: String?=null,
    @SerializedName("tax_exempt")
    var taxExempt: Boolean?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("accepts_marketing_updated_at")
    var acceptsMarketingUpdatedAt: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("default_address")
    var defaultAddress: DefaultAddress?=null
    
): Parcelable

/*
    Model: DefaultAddress
*/
@Parcelize
data class DefaultAddress(
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("customer_id")
    var customerId: Int?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("country_name")
    var countryName: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("province")
    var province: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("zip")
    var zip: String?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSet
*/
@Parcelize
data class TotalLineItemsPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalLineItemsPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalLineItemsPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSetShopMoney
*/
@Parcelize
data class TotalLineItemsPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSetPresentmentMoney
*/
@Parcelize
data class TotalLineItemsPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("zip")
    var zip: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("province")
    var province: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: OrderListing
*/
@Parcelize
data class OrderListing(
    
    
    @SerializedName("items")
    var items: ArrayList<OrderItems>?=null,
    @SerializedName("filters")
    var filters: Filters?=null,
    @SerializedName("next_order_status")
    var nextOrderStatus: NextOrderStatus?=null,
    @SerializedName("page")
    var page: PlatformOrderPage?=null,
    @SerializedName("applied_filters")
    var appliedFilters: AppliedFilters?=null
    
): Parcelable

/*
    Model: OrderItems
*/
@Parcelize
data class OrderItems(
    
    
    @SerializedName("user")
    var user: PlatformOrderUserInfo?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    @SerializedName("channel")
    var channel: Channel?=null,
    @SerializedName("breakup_values")
    var breakupValues: PlatformBreakupValues?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("application")
    var application: PlatformApplication?=null,
    @SerializedName("shipments")
    var shipments: PlatformShipment?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    @SerializedName("payments")
    var payments: ItemsPayments?=null
    
): Parcelable

/*
    Model: PlatformOrderUserInfo
*/
@Parcelize
data class PlatformOrderUserInfo(
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("avis_user_id")
    var avisUserId: String?=null
    
): Parcelable

/*
    Model: PlatformDeliveryAddress
*/
@Parcelize
data class PlatformDeliveryAddress(
    
    
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null
    
): Parcelable

/*
    Model: Channel
*/
@Parcelize
data class Channel(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: PlatformBreakupValues
*/
@Parcelize
data class PlatformBreakupValues(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: PlatformApplication
*/
@Parcelize
data class PlatformApplication(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("owner")
    var owner: String?=null,
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable

/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: PlatformShipment
*/
@Parcelize
data class PlatformShipment(
    
    
    @SerializedName("status")
    var status: PlatformShipmentStatus?=null,
    @SerializedName("bags")
    var bags: Bags?=null,
    @SerializedName("prices")
    var prices: ShipmentPrices?=null,
    @SerializedName("breakup_values")
    var breakupValues: ShipmentBreakupValues?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("dp_details")
    var dpDetails: DpDetails?=null,
    @SerializedName("invoice")
    var invoice: ShipmentInvoice?=null,
    @SerializedName("fulfilling_store")
    var fulfillingStore: PlatformFulfillingStore?=null,
    @SerializedName("payments")
    var payments: Payments?=null,
    @SerializedName("gst")
    var gst: ShipmentGst?=null,
    @SerializedName("company")
    var company: Company?=null,
    @SerializedName("brand")
    var brand: PlatformShipmentBrand?=null,
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_source")
    var orderSource: String?=null,
    @SerializedName("is_not_fynd_source")
    var isNotFyndSource: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("promise")
    var promise: Promise?=null,
    @SerializedName("tracking_details")
    var trackingDetails: ShipmentTrackingDetails?=null,
    @SerializedName("is_fynd_coupon")
    var isFyndCoupon: Boolean?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("user")
    var user: ShipmentUser?=null
    
): Parcelable

/*
    Model: PlatformShipmentStatus
*/
@Parcelize
data class PlatformShipmentStatus(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("progress")
    var progress: Int?=null,
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    @SerializedName("color_code")
    var colorCode: String?=null
    
): Parcelable

/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<BagFinancialBreakup>?=null,
    @SerializedName("status")
    var status: BagCurrStatus?=null,
    @SerializedName("item")
    var item: BagItem?=null,
    @SerializedName("article")
    var article: BagArticle?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("prices")
    var prices: BagPrices?=null,
    @SerializedName("gst_details")
    var gstDetails: GstDetails?=null,
    @SerializedName("breakup_values")
    var breakupValues: BagBreakupValues?=null,
    @SerializedName("update_time")
    var updateTime: Int?=null,
    @SerializedName("current_status")
    var currentStatus: BagCurrentStatus?=null,
    @SerializedName("bag_status")
    var bagStatus: BagStatus?=null
    
): Parcelable

/*
    Model: BagFinancialBreakup
*/
@Parcelize
data class BagFinancialBreakup(
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    @SerializedName("item_name")
    var itemName: String?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable

/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable

/*
    Model: BagCurrStatus
*/
@Parcelize
data class BagCurrStatus(
    
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null
    
): Parcelable

/*
    Model: BagItem
*/
@Parcelize
data class BagItem(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("attributes")
    var attributes: BagItemAttributes?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null
    
): Parcelable

/*
    Model: BagItemAttributes
*/
@Parcelize
data class BagItemAttributes(
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable

/*
    Model: BagArticle
*/
@Parcelize
data class BagArticle(
    
    
    @SerializedName("identifiers")
    var identifiers: ArticleIdentifiers?=null,
    @SerializedName("esp_modified")
    var espModified: Boolean?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("set")
    var set: Set?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("return_config")
    var returnConfig: BagArticleReturnConfig?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ArticleIdentifiers
*/
@Parcelize
data class ArticleIdentifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable

/*
    Model: Set
*/
@Parcelize
data class Set(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size_distribution")
    var sizeDistribution: SetSizeDistribution?=null
    
): Parcelable

/*
    Model: SetSizeDistribution
*/
@Parcelize
data class SetSizeDistribution(
    
    
    @SerializedName("sizes")
    var sizes: Sizes?=null
    
): Parcelable

/*
    Model: Sizes
*/
@Parcelize
data class Sizes(
    
    
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable

/*
    Model: BagArticleReturnConfig
*/
@Parcelize
data class BagArticleReturnConfig(
    
    
    @SerializedName("time")
    var time: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable

/*
    Model: ShipmentPrices
*/
@Parcelize
data class ShipmentPrices(
    
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null
    
): Parcelable

/*
    Model: GstDetails
*/
@Parcelize
data class GstDetails(
    
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null
    
): Parcelable

/*
    Model: BagBreakupValues
*/
@Parcelize
data class BagBreakupValues(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable

/*
    Model: BagCurrentStatus
*/
@Parcelize
data class BagCurrentStatus(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null
    
): Parcelable

/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null
    
): Parcelable

/*
    Model: BagStatus
*/
@Parcelize
data class BagStatus(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStatusBagStateMapper?=null
    
): Parcelable

/*
    Model: BagStatusBagStateMapper
*/
@Parcelize
data class BagStatusBagStateMapper(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null
    
): Parcelable

/*
    Model: BagPrices
*/
@Parcelize
data class BagPrices(
    
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null
    
): Parcelable

/*
    Model: ShipmentBreakupValues
*/
@Parcelize
data class ShipmentBreakupValues(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable

/*
    Model: DpDetails
*/
@Parcelize
data class DpDetails(
    
    
    @SerializedName("gst_tag")
    var gstTag: String?=null
    
): Parcelable

/*
    Model: ShipmentInvoice
*/
@Parcelize
data class ShipmentInvoice(
    
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    @SerializedName("label_url")
    var labelUrl: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("amount_to_collect")
    var amountToCollect: Double?=null,
    @SerializedName("rto_address")
    var rtoAddress: RtoAddress?=null
    
): Parcelable

/*
    Model: RtoAddress
*/
@Parcelize
data class RtoAddress(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddressJson?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("address2")
    var address2: String?=null
    
): Parcelable

/*
    Model: StoreAddressJson
*/
@Parcelize
data class StoreAddressJson(
    
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable

/*
    Model: PlatformFulfillingStore
*/
@Parcelize
data class PlatformFulfillingStore(
    
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("meta")
    var meta: FulfillingStoreMeta?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: FulfillingStoreStoreAddressJson?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("login_username")
    var loginUsername: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: FulfillingStoreMeta
*/
@Parcelize
data class FulfillingStoreMeta(
    
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: AdditionalContactDetails?=null,
    @SerializedName("documents")
    var documents: Documents?=null,
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfig?=null,
    @SerializedName("allow_dp_assignment_from_fynd")
    var allowDpAssignmentFromFynd: Boolean?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("timing")
    var timing: Timing?=null
    
): Parcelable

/*
    Model: AdditionalContactDetails
*/
@Parcelize
data class AdditionalContactDetails(
    
    
    @SerializedName("number")
    var number: ArrayList<String>?=null
    
): Parcelable

/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    
    @SerializedName("gst")
    var gst: Gst?=null
    
): Parcelable

/*
    Model: Gst
*/
@Parcelize
data class Gst(
    
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable

/*
    Model: ProductReturnConfig
*/
@Parcelize
data class ProductReturnConfig(
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable

/*
    Model: Timing
*/
@Parcelize
data class Timing(
    
    
    @SerializedName("opening")
    var opening: Opening?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: Closing?=null
    
): Parcelable

/*
    Model: Opening
*/
@Parcelize
data class Opening(
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable

/*
    Model: Closing
*/
@Parcelize
data class Closing(
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable

/*
    Model: FulfillingStoreStoreAddressJson
*/
@Parcelize
data class FulfillingStoreStoreAddressJson(
    
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null
    
): Parcelable

/*
    Model: Payments
*/
@Parcelize
data class Payments(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("source_nickname")
    var sourceNickname: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("mode")
    var mode: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable

/*
    Model: ShipmentGst
*/
@Parcelize
data class ShipmentGst(
    
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: Double?=null
    
): Parcelable

/*
    Model: PlatformShipmentBrand
*/
@Parcelize
data class PlatformShipmentBrand(
    
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null
    
): Parcelable

/*
    Model: Timestamp
*/
@Parcelize
data class Timestamp(
    
    
    @SerializedName("min")
    var min: String?=null,
    @SerializedName("max")
    var max: String?=null
    
): Parcelable

/*
    Model: ShipmentTrackingDetails
*/
@Parcelize
data class ShipmentTrackingDetails(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("time")
    var time: String?=null,
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    @SerializedName("is_current")
    var isCurrent: Boolean?=null
    
): Parcelable

/*
    Model: ShipmentUser
*/
@Parcelize
data class ShipmentUser(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    @SerializedName("mongo_user_id")
    var mongoUserId: String?=null
    
): Parcelable

/*
    Model: ItemsPayments
*/
@Parcelize
data class ItemsPayments(
    
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("source_nickname")
    var sourceNickname: String?=null,
    @SerializedName("mode")
    var mode: String?=null,
    @SerializedName("source")
    var source: String?=null
    
): Parcelable

/*
    Model: Filters
*/
@Parcelize
data class Filters(
    
    
    @SerializedName("stages")
    var stages: Stages?=null
    
): Parcelable

/*
    Model: Stages
*/
@Parcelize
data class Stages(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("filters")
    var filters: StagesFilters?=null
    
): Parcelable

/*
    Model: StagesFilters
*/
@Parcelize
data class StagesFilters(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("options")
    var options: Options?=null
    
): Parcelable

/*
    Model: Options
*/
@Parcelize
data class Options(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: NextOrderStatus
*/
@Parcelize
data class NextOrderStatus(
    
    
    @SerializedName("bag_confirmed")
    var bagConfirmed: BagConfirmed?=null,
    @SerializedName("dp_assigned")
    var dpAssigned: DpAssigned?=null,
    @SerializedName("return_bag_delivered")
    var returnBagDelivered: ReturnBagDelivered?=null,
    @SerializedName("placed")
    var placed: Placed?=null,
    @SerializedName("delivery_done")
    var deliveryDone: DeliveryDone?=null,
    @SerializedName("pending")
    var pending: Pending?=null,
    @SerializedName("bag_packed")
    var bagPacked: BagPacked?=null
    
): Parcelable

/*
    Model: BagConfirmed
*/
@Parcelize
data class BagConfirmed(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: DpAssigned
*/
@Parcelize
data class DpAssigned(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: ReturnBagDelivered
*/
@Parcelize
data class ReturnBagDelivered(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: Placed
*/
@Parcelize
data class Placed(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: DeliveryDone
*/
@Parcelize
data class DeliveryDone(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: Pending
*/
@Parcelize
data class Pending(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: BagPacked
*/
@Parcelize
data class BagPacked(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: PlatformOrderPage
*/
@Parcelize
data class PlatformOrderPage(
    
    
    @SerializedName("next")
    var next: String?=null,
    @SerializedName("previous")
    var previous: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: ItemTotal?=null
    
): Parcelable

/*
    Model: ItemTotal
*/
@Parcelize
data class ItemTotal(
    
    
    @SerializedName("new")
    var new: Int?=null,
    @SerializedName("processing")
    var processing: Int?=null,
    @SerializedName("returns")
    var returns: Int?=null,
    @SerializedName("all")
    var all: Int?=null
    
): Parcelable

/*
    Model: AppliedFilters
*/
@Parcelize
data class AppliedFilters(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("stores")
    var stores: ArrayList<String>?=null,
    @SerializedName("from_date")
    var fromDate: String?=null,
    @SerializedName("to_date")
    var toDate: String?=null
    
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
    @SerializedName("resend_token")
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
    var results: Results?=null
    
): Parcelable

/*
    Model: Results
*/
@Parcelize
data class Results(
    
    
    @SerializedName("awb")
    var awb: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    @SerializedName("account_name")
    var accountName: String?=null
    
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
    Model: DeleteResponse
*/
@Parcelize
data class DeleteResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: GetSearchWordsData?=null
    
): Parcelable

/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable

/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null
    
): Parcelable

/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null
    
): Parcelable

/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: AutocompletePageAction?=null
    
): Parcelable

/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("action")
    var action: AutocompleteAction?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable

/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null
    
): Parcelable

/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable

/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null
    
): Parcelable

/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable

/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("max_marked")
    var maxMarked: Double?=null
    
): Parcelable

/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    @SerializedName("price")
    var price: Price?=null
    
): Parcelable

/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable

/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: Guide
*/
@Parcelize
data class Guide(
    
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable

/*
    Model: ValidateSizeGuide
*/
@Parcelize
data class ValidateSizeGuide(
    
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("guide")
    var guide: Guide?=null,
    @SerializedName("image")
    var image: String?=null
    
): Parcelable

/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null,
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: MetaDataListingFilterResponse
*/
@Parcelize
data class MetaDataListingFilterResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingFilterMetaResponse>?=null
    
): Parcelable

/*
    Model: MetaDataListingSortMetaResponse
*/
@Parcelize
data class MetaDataListingSortMetaResponse(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable

/*
    Model: MetaDataListingSortResponse
*/
@Parcelize
data class MetaDataListingSortResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingSortMetaResponse>?=null
    
): Parcelable

/*
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null,
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null,
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null,
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null
    
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable

/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable

/*
    Model: ConfigurationProductVariant
*/
@Parcelize
data class ConfigurationProductVariant(
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductVariantConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationProductSimilar
*/
@Parcelize
data class ConfigurationProductSimilar(
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null,
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null
    
): Parcelable

/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    @SerializedName("end")
    var end: Double?=null,
    @SerializedName("start")
    var start: Double?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sort")
    var sort: String?=null,
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("condition")
    var condition: String?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null,
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null,
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null
    
): Parcelable

/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null
    
): Parcelable

/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("data")
    var data: EntityConfiguration?=null
    
): Parcelable

/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable

/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable

/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    @SerializedName("portrait")
    var portrait: BannerImage?=null,
    @SerializedName("landscape")
    var landscape: BannerImage?=null
    
): Parcelable

/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: ProductListingActionPage?=null
    
): Parcelable

/*
    Model: Media1
*/
@Parcelize
data class Media1(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media1?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    
    @SerializedName("portrait")
    var portrait: CollectionImage?=null,
    @SerializedName("landscape")
    var landscape: CollectionImage?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("duration")
    var duration: Int?=null,
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("end")
    var end: String?=null
    
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("email")
    var email: String?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("sort_on")
    var sortOn: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable

/*
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: BannerImage?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media1?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable

/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    @SerializedName("effective")
    var effective: Price1?=null,
    @SerializedName("marked")
    var marked: Price1?=null
    
): Parcelable

/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null
    
): Parcelable

/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable

/*
    Model: CollectionItemRequest
*/
@Parcelize
data class CollectionItemRequest(
    
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null
    
): Parcelable

/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null
    
): Parcelable

/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null,
    @SerializedName("total_sizes")
    var totalSizes: Int?=null,
    @SerializedName("available_articles")
    var availableArticles: Int?=null
    
): Parcelable

/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    @SerializedName("item")
    var item: CatalogInsightItem?=null,
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable

/*
    Model: CrossSellingData
*/
@Parcelize
data class CrossSellingData(
    
    
    @SerializedName("articles")
    var articles: Int?=null,
    @SerializedName("products")
    var products: Int?=null
    
): Parcelable

/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    @SerializedName("data")
    var data: CrossSellingData?=null
    
): Parcelable

/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    @SerializedName("opt_level")
    var optLevel: String?=null,
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: Int?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    @SerializedName("opt_level")
    var optLevel: String?=null
    
): Parcelable

/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null
    
): Parcelable

/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("total_article")
    var totalArticle: Int?=null,
    @SerializedName("brand_name")
    var brandName: String?=null
    
): Parcelable

/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null
    
): Parcelable

/*
    Model: OptinCompanyMetrics
*/
@Parcelize
data class OptinCompanyMetrics(
    
    
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("store")
    var store: Int?=null,
    @SerializedName("brand")
    var brand: Int?=null
    
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
    
): Parcelable

/*
    Model: BasePage
*/
@Parcelize
data class BasePage(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable

/*
    Model: MultipleCommon
*/
@Parcelize
data class MultipleCommon(
    
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable

/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    @SerializedName("page")
    var page: BasePage?=null,
    @SerializedName("items")
    var items: MultipleCommon?=null
    
): Parcelable

/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: BasePage1
*/
@Parcelize
data class BasePage1(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable

/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null
    
): Parcelable

/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    @SerializedName("page")
    var page: BasePage1?=null,
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null
    
): Parcelable

/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable

/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    @SerializedName("page")
    var page: BasePage?=null,
    @SerializedName("items")
    var items: ProductTemplate?=null
    
): Parcelable

/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    @SerializedName("data")
    var data: MultipleCommon?=null
    
): Parcelable

/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: MultipleCommon?=null
    
): Parcelable

/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null
    
): Parcelable

/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: HSNData?=null
    
): Parcelable

/*
    Model: ProductConfligurationDownloads
*/
@Parcelize
data class ProductConfligurationDownloads(
    
    
    @SerializedName("data")
    var data: ArrayList<MultipleCommon>?=null,
    @SerializedName("multivalue")
    var multivalue: Boolean?=null
    
): Parcelable

/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("catalog_id")
    var catalogId: Int?=null
    
): Parcelable

/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null,
    @SerializedName("google")
    var google: CategoryMappingValues?=null,
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null
    
): Parcelable

/*
    Model: Media2
*/
@Parcelize
data class Media2(
    
    
    @SerializedName("portrait")
    var portrait: String?=null,
    @SerializedName("landscape")
    var landscape: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    @SerializedName("l2")
    var l2: Int?=null,
    @SerializedName("department")
    var department: Int?=null,
    @SerializedName("l1")
    var l1: Int?=null
    
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null
    
): Parcelable

/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    @SerializedName("page")
    var page: BasePage1?=null,
    @SerializedName("items")
    var items: ArrayList<Category>?=null
    
): Parcelable

/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null
    
): Parcelable

/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: PageData
*/
@Parcelize
data class PageData(
    
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: String?=null
    
): Parcelable

/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    @SerializedName("material")
    var material: String?=null,
    @SerializedName("meta_nature")
    var metaNature: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("product_fit")
    var productFit: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("gender")
    var gender: ArrayList<String>?=null,
    @SerializedName("sleeve_length")
    var sleeveLength: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("neck_type")
    var neckType: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("pattern")
    var pattern: String?=null,
    @SerializedName("essential")
    var essential: String?=null,
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("primary_material")
    var primaryMaterial: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null
    
): Parcelable

/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Logo?=null
    
): Parcelable

/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("brand")
    var brand: Brand?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("all_sizes")
    var allSizes: ArrayList<String>?=null,
    @SerializedName("highlights")
    var highlights: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null
    
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ArrayList<Product>?=null
    
): Parcelable

/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("time")
    var time: Int?=null
    
): Parcelable

/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
): Parcelable

/*
    Model: OrderQuantity
*/
@Parcelize
data class OrderQuantity(
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    @SerializedName("minimum")
    var minimum: Int?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable

/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable

/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null
    
): Parcelable

/*
    Model: TeaserTag
*/
@Parcelize
data class TeaserTag(
    
    
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: ProductCreateUpdate
*/
@Parcelize
data class ProductCreateUpdate(
    
    
    @SerializedName("requester")
    var requester: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("change_request_id")
    var changeRequestId: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    @SerializedName("moq")
    var moq: OrderQuantity?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("trader")
    var trader: Trader?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("trader_type")
    var traderType: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null
    
): Parcelable

/*
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    
    @SerializedName("valid")
    var valid: Boolean?=null
    
): Parcelable

/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    @SerializedName("template")
    var template: ProductTemplate?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null
    
): Parcelable

/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ProductBulkRequest?=null
    
): Parcelable

/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("email")
    var email: String?=null
    
): Parcelable

/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null
    
): Parcelable

/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("batch_id")
    var batchId: String?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null
    
): Parcelable

/*
    Model: NestedTags
*/
@Parcelize
data class NestedTags(
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ProductTagsViewResponse
*/
@Parcelize
data class ProductTagsViewResponse(
    
    
    @SerializedName("items")
    var items: NestedTags?=null
    
): Parcelable

/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("retry")
    var retry: Int?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable

/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ArrayList<Items>?=null
    
): Parcelable

/*
    Model: ProductBulkAssets
*/
@Parcelize
data class ProductBulkAssets(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null
    
): Parcelable

/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("brand_uid")
    var brandUid: Int?=null
    
): Parcelable

/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    @SerializedName("size")
    var size: String?=null
    
): Parcelable

/*
    Model: SizeDistribution
*/
@Parcelize
data class SizeDistribution(
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable

/*
    Model: InventorySet
*/
@Parcelize
data class InventorySet(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null
    
): Parcelable

/*
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    @SerializedName("gtin_type")
    var gtinType: String?=null
    
): Parcelable

/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable

/*
    Model: InventoryRequest1
*/
@Parcelize
data class InventoryRequest1(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("item")
    var item: ItemQuery?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null
    
): Parcelable

/*
    Model: BulkRequestGet
*/
@Parcelize
data class BulkRequestGet(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("start_date")
    var startDate: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    @SerializedName("end_date")
    var endDate: String?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null
    
): Parcelable

/*
    Model: CommonResponse
*/
@Parcelize
data class CommonResponse(
    
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable

/*
    Model: Size1
*/
@Parcelize
data class Size1(
    
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("identifiers")
    var identifiers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable

/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<Size1>?=null,
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable

/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    @SerializedName("task_id")
    var taskId: String?=null,
    @SerializedName("completed_on")
    var completedOn: String?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: InventoryExportRequest
*/
@Parcelize
data class InventoryExportRequest(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    @SerializedName("brand")
    var brand: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null
    
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
    Model: DbRecord
*/
@Parcelize
data class DbRecord(
    
    
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
    var items: ArrayList<DbRecord>?=null,
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
    Model: WebRedirect
*/
@Parcelize
data class WebRedirect(
    
    
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
    var web: WebRedirect?=null,
    @SerializedName("force_web")
    var forceWeb: Boolean?=null
    
): Parcelable

/*
    Model: CampaignShortLink
*/
@Parcelize
data class CampaignShortLink(
    
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("medium")
    var medium: String?=null
    
): Parcelable

/*
    Model: Attribution
*/
@Parcelize
data class Attribution(
    
    
    @SerializedName("campaign_cookie_expiry")
    var campaignCookieExpiry: String?=null
    
): Parcelable

/*
    Model: SocialMediaTags
*/
@Parcelize
data class SocialMediaTags(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("image")
    var image: String?=null
    
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
    var active: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    @SerializedName("campaign")
    var campaign: CampaignShortLink?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: UrlInfo
*/
@Parcelize
data class UrlInfo(
    
    
    @SerializedName("original")
    var original: String?=null,
    @SerializedName("short")
    var short: String?=null,
    @SerializedName("hash")
    var hash: String?=null
    
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: UrlInfo?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("app_redirect")
    var appRedirect: Boolean?=null,
    @SerializedName("fallback")
    var fallback: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    @SerializedName("campaign")
    var campaign: CampaignShortLink?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: ErrorRes
*/
@Parcelize
data class ErrorRes(
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    
    
    @SerializedName("pl")
    var pl: PaymentModeConfig?=null,
    @SerializedName("card")
    var card: PaymentModeConfig?=null,
    @SerializedName("nb")
    var nb: PaymentModeConfig?=null,
    @SerializedName("wl")
    var wl: PaymentModeConfig?=null,
    @SerializedName("ps")
    var ps: PaymentModeConfig?=null,
    @SerializedName("upi")
    var upi: PaymentModeConfig?=null,
    @SerializedName("qr")
    var qr: PaymentModeConfig?=null,
    @SerializedName("cod")
    var cod: PaymentModeConfig?=null,
    @SerializedName("pp")
    var pp: PaymentModeConfig?=null,
    @SerializedName("jp")
    var jp: PaymentModeConfig?=null,
    @SerializedName("pac")
    var pac: PaymentModeConfig?=null,
    @SerializedName("fc")
    var fc: PaymentModeConfig?=null,
    @SerializedName("jiopp")
    var jiopp: PaymentModeConfig?=null,
    @SerializedName("stripepg")
    var stripepg: PaymentModeConfig?=null,
    @SerializedName("juspaypg")
    var juspaypg: PaymentModeConfig?=null,
    @SerializedName("payubizpg")
    var payubizpg: PaymentModeConfig?=null,
    @SerializedName("payumoneypg")
    var payumoneypg: PaymentModeConfig?=null,
    @SerializedName("rupifipg")
    var rupifipg: PaymentModeConfig?=null,
    @SerializedName("simpl")
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
    @SerializedName("search_text")
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
    var page: Page?=null
    
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
    @SerializedName("search_text")
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
    var page: Page?=null
    
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
    var page: Page?=null
    
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    var page: Page?=null
    
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
    @SerializedName("description_html")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    
    
    @SerializedName("json_schema")
    var jsonSchema: JsonSchema?=null,
    @SerializedName("browser_script")
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
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

/*
    Model: InventoryValidator
*/
@Parcelize
data class InventoryValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

/*
    Model: OrderValidator
*/
@Parcelize
data class OrderValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
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
    @SerializedName("description_html")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("last_patch")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    
    
    @SerializedName("other_opted")
    var otherOpted: Boolean?=null,
    @SerializedName("other_integration")
    var otherIntegration: IntegrationOptIn?=null,
    @SerializedName("other_entity")
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
    @SerializedName("last_patch")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    var auth: ApplicationAuth?=null,
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
    var page: Page?=null
    
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
    var page: Page?=null
    
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
    var q: String?=null
    
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
    var page: Page?=null
    
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
    var homePage: HomePageFeature?=null,
    @SerializedName("common")
    var common: CommonFeature?=null,
    @SerializedName("cart")
    var cart: CartFeature?=null,
    @SerializedName("qr")
    var qr: QrFeature?=null,
    @SerializedName("pcr")
    var pcr: PcrFeature?=null,
    @SerializedName("order")
    var order: OrderFeature?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable

/*
    Model: CommonFeature
*/
@Parcelize
data class CommonFeature(
    
    
    @SerializedName("communication_optin_dialog")
    var communicationOptinDialog: CommunicationOptinDialogFeature?=null,
    @SerializedName("deployment_store_selection")
    var deploymentStoreSelection: DeploymentStoreSelectionFeature?=null,
    @SerializedName("listing_price")
    var listingPrice: ListingPriceFeature?=null,
    @SerializedName("listing_page")
    var listingPage: ListingPageFeature?=null,
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null
    
): Parcelable

/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable

/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable

/*
    Model: ListingPageFeature
*/
@Parcelize
data class ListingPageFeature(
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable

/*
    Model: CurrencyFeature
*/
@Parcelize
data class CurrencyFeature(
    
    
    @SerializedName("value")
    var value: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("default_currency")
    var defaultCurrency: String?=null
    
): Parcelable

/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: CartFeature
*/
@Parcelize
data class CartFeature(
    
    
    @SerializedName("gst_input")
    var gstInput: Boolean?=null,
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null,
    @SerializedName("placing_for_customer")
    var placingForCustomer: Boolean?=null,
    @SerializedName("google_map")
    var googleMap: Boolean?=null
    
): Parcelable

/*
    Model: QrFeature
*/
@Parcelize
data class QrFeature(
    
    
    @SerializedName("application")
    var application: Boolean?=null,
    @SerializedName("products")
    var products: Boolean?=null,
    @SerializedName("collections")
    var collections: Boolean?=null
    
): Parcelable

/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable

/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("redirect_to")
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    @SerializedName("mobile_logo")
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
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
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
    Model: CompanyAboutAddress
*/
@Parcelize
data class CompanyAboutAddress(
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null
    
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
    @SerializedName("country_code")
    var countryCode: Int?=null,
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable

/*
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    
    @SerializedName("address")
    var address: InformationAddress?=null,
    @SerializedName("support")
    var support: InformationSupport?=null,
    @SerializedName("social_links")
    var socialLinks: SocialLinks?=null,
    @SerializedName("links")
    var links: Links?=null,
    @SerializedName("copyright_text")
    var copyrightText: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("business_highlights")
    var businessHighlights: BusinessHighlights?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: InformationAddress
*/
@Parcelize
data class InformationAddress(
    
    
    @SerializedName("loc")
    var loc: String?=null,
    @SerializedName("address_line")
    var addressLine: ArrayList<String>?=null,
    @SerializedName("phone")
    var phone: InformationPhone?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable

/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("number")
    var number: String?=null
    
): Parcelable

/*
    Model: InformationSupport
*/
@Parcelize
data class InformationSupport(
    
    
    @SerializedName("phone")
    var phone: ArrayList<String>?=null,
    @SerializedName("email")
    var email: ArrayList<String>?=null,
    @SerializedName("timing")
    var timing: String?=null
    
): Parcelable

/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("instagram")
    var instagram: Instagram?=null,
    @SerializedName("twitter")
    var twitter: Twitter?=null,
    @SerializedName("pinterest")
    var pinterest: Pinterest?=null,
    @SerializedName("google_plus")
    var googlePlus: GooglePlus?=null,
    @SerializedName("youtube")
    var youtube: Youtube?=null,
    @SerializedName("linked_in")
    var linkedIn: LinkedIn?=null,
    @SerializedName("vimeo")
    var vimeo: Vimeo?=null,
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable

/*
    Model: Instagram
*/
@Parcelize
data class Instagram(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Twitter
*/
@Parcelize
data class Twitter(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Pinterest
*/
@Parcelize
data class Pinterest(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: GooglePlus
*/
@Parcelize
data class GooglePlus(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Youtube
*/
@Parcelize
data class Youtube(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: LinkedIn
*/
@Parcelize
data class LinkedIn(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Vimeo
*/
@Parcelize
data class Vimeo(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: BlogLink
*/
@Parcelize
data class BlogLink(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: BusinessHighlights
*/
@Parcelize
data class BusinessHighlights(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null
    
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
    @SerializedName("mobile_logo")
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
    Model: StoreLatLong
*/
@Parcelize
data class StoreLatLong(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
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
    var latLong: StoreLatLong?=null,
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
    Model: OrderingStore
*/
@Parcelize
data class OrderingStore(
    
    
    @SerializedName("address")
    var address: OptedStoreAddress?=null,
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
    var page: Page?=null,
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
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
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
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null
    
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
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
): Parcelable

/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    @SerializedName("user")
    var user: Int?=null,
    @SerializedName("app")
    var app: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable

/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null,
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null
    
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
    
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null
    
): Parcelable

/*
    Model: PaymentCodes
*/
@Parcelize
data class PaymentCodes(
    
    
    @SerializedName("pl")
    var pl: PaymentModes?=null,
    @SerializedName("card")
    var card: PaymentModes?=null,
    @SerializedName("wl")
    var wl: PaymentModes?=null,
    @SerializedName("ps")
    var ps: PaymentModes?=null,
    @SerializedName("qr")
    var qr: PaymentModes?=null,
    @SerializedName("upi")
    var upi: PaymentModes?=null,
    @SerializedName("nb")
    var nb: PaymentModes?=null
    
): Parcelable

/*
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    @SerializedName("payments")
    var payments: PaymentCodes?=null
    
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
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: CouponAction
*/
@Parcelize
data class CouponAction(
    
    
    @SerializedName("txn_mode")
    var txnMode: String?=null,
    @SerializedName("action_date")
    var actionDate: String?=null
    
): Parcelable

/*
    Model: CouponAuthor
*/
@Parcelize
data class CouponAuthor(
    
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable

/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("key")
    var key: Double?=null,
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable

/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("start")
    var start: String?=null
    
): Parcelable

/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    @SerializedName("value_type")
    var valueType: String?=null
    
): Parcelable

/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null
    
): Parcelable

/*
    Model: State
*/
@Parcelize
data class State(
    
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null
    
): Parcelable

/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null
    
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
    
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable

/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("action")
    var action: CouponAction?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null
    
): Parcelable

/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: CouponAdd?=null
    
): Parcelable

/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("action")
    var action: CouponAction?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null
    
): Parcelable

/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("schedule")
    var schedule: CouponSchedule?=null
    
): Parcelable

