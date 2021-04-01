package com.sdk.platform

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


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
    var meta: Meta?=null,
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
    var register: Boolean?=null
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
    Model: Meta
*/
@Parcelize
data class Meta(
    
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
    Model: Email
*/
@Parcelize
data class Email(
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
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
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone_numbers")
    var phoneNumbers: PhoneNumbers?=null,
    @SerializedName("emails")
    var emails: Emails?=null,
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
    Model: PhoneNumbers
*/
@Parcelize
data class PhoneNumbers(
    
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
    Model: Emails
*/
@Parcelize
data class Emails(
    
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
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
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
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
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
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("display_name")
    var displayName: String?=null
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
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
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null
): Parcelable

/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null
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
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null
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
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: String?=null
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("next_page_id")
    var nextPageId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
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
    Model: Media
*/
@Parcelize
data class Media(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    @SerializedName("page")
    var page: AutocompletePageAction?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("action")
    var action: AutocompleteAction?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: String?=null
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
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null
): Parcelable

/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: Size
*/
@Parcelize
data class Size(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    @SerializedName("max_marked")
    var maxMarked: Double?=null
): Parcelable

/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    @SerializedName("price")
    var price: Price?=null,
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null
): Parcelable

/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("guide")
    var guide: Guide?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
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
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null
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
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null
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
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null,
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null,
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null,
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null
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
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    @SerializedName("sort")
    var sort: String?=null,
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null,
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
    
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null,
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
): Parcelable

/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null,
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null
): Parcelable

/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("display_type")
    var displayType: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("config_id")
    var configId: String?=null
): Parcelable

/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("config_id")
    var configId: String?=null
): Parcelable

/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null,
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    @SerializedName("config_id")
    var configId: String?=null
): Parcelable

/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    @SerializedName("data")
    var data: EntityConfiguration?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("kind")
    var kind: String?=null
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
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
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("duration")
    var duration: Int?=null,
    @SerializedName("start")
    var start: String?=null
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
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("uid")
    var uid: String?=null
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("sort_on")
    var sortOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
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
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: BannerImage?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("name")
    var name: String?=null,
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
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    @SerializedName("page")
    var page: ProductListingActionPage?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Media1
*/
@Parcelize
data class Media1(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media1?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media1?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    Model: Price1
*/
@Parcelize
data class Price1(
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("min")
    var min: Double?=null
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    @SerializedName("marked")
    var marked: Price1?=null,
    @SerializedName("effective")
    var effective: Price1?=null
): Parcelable

/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
): Parcelable

/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null,
    @SerializedName("sellable_count")
    var sellableCount: Int?=null,
    @SerializedName("count")
    var count: Int?=null
): Parcelable

/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null,
    @SerializedName("total_sizes")
    var totalSizes: Int?=null
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
    
    @SerializedName("products")
    var products: Int?=null,
    @SerializedName("articles")
    var articles: Int?=null
): Parcelable

/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    @SerializedName("data")
    var data: CrossSellingData?=null,
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
): Parcelable

/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("opt_level")
    var optLevel: String?=null
): Parcelable

/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    @SerializedName("opt_level")
    var optLevel: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
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
    
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
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
    
    @SerializedName("brand")
    var brand: Int?=null,
    @SerializedName("store")
    var store: Int?=null,
    @SerializedName("company")
    var company: String?=null
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("size")
    var size: Int?=null
): Parcelable

/*
    Model: MultipleCommon
*/
@Parcelize
data class MultipleCommon(
    
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
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: BasePage1
*/
@Parcelize
data class BasePage1(
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("next_page_id")
    var nextPageId: String?=null
): Parcelable

/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("user_id")
    var userId: String?=null
): Parcelable

/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null,
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null
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
    
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("portrait")
    var portrait: String?=null,
    @SerializedName("landscape")
    var landscape: String?=null
): Parcelable

/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    @SerializedName("l2")
    var l2: Int?=null,
    @SerializedName("l1")
    var l1: Int?=null,
    @SerializedName("department")
    var department: Int?=null
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
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("priority")
    var priority: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null
): Parcelable

/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
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
    Model: OrderQuantity
*/
@Parcelize
data class OrderQuantity(
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("maximum")
    var maximum: Int?=null,
    @SerializedName("minimum")
    var minimum: Int?=null
): Parcelable

/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("time")
    var time: Int?=null,
    @SerializedName("returnable")
    var returnable: Boolean?=null
): Parcelable

/*
    Model: ProductCreateUpdate
*/
@Parcelize
data class ProductCreateUpdate(
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("trader_type")
    var traderType: String?=null,
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    @SerializedName("change_request_id")
    var changeRequestId: String?=null,
    @SerializedName("trader")
    var trader: Trader?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("requester")
    var requester: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("moq")
    var moq: OrderQuantity?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageData
*/
@Parcelize
data class PageData(
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("current")
    var current: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null
): Parcelable

/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null
): Parcelable

/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null
): Parcelable

/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    @SerializedName("meta_nature")
    var metaNature: String?=null,
    @SerializedName("primary_material")
    var primaryMaterial: String?=null,
    @SerializedName("product_fit")
    var productFit: String?=null,
    @SerializedName("sleeve_length")
    var sleeveLength: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("pattern")
    var pattern: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("essential")
    var essential: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    @SerializedName("neck_type")
    var neckType: String?=null,
    @SerializedName("gender")
    var gender: ArrayList<String>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    @SerializedName("material")
    var material: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null
): Parcelable

/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null
): Parcelable

/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
): Parcelable

/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    @SerializedName("logo")
    var logo: Logo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    @SerializedName("highlights")
    var highlights: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("all_sizes")
    var allSizes: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("brand")
    var brand: Brand?=null,
    @SerializedName("slug")
    var slug: String?=null
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
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    @SerializedName("valid")
    var valid: Boolean?=null
): Parcelable

/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("uid")
    var uid: String?=null
): Parcelable

/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null
): Parcelable

/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("template")
    var template: ProductTemplate?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("batch_id")
    var batchId: String?=null,
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
    Model: Items
*/
@Parcelize
data class Items(
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("retry")
    var retry: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
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
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    @SerializedName("primary")
    var primary: Boolean?=null
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
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    @SerializedName("price")
    var price: Double?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("size")
    var size: String?=null
): Parcelable

/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("item")
    var item: ItemQuery?=null
): Parcelable

/*
    Model: InventoryRequest1
*/
@Parcelize
data class InventoryRequest1(
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("size")
    var size: String?=null
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
    Model: BulkRequestGet
*/
@Parcelize
data class BulkRequestGet(
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("start_date")
    var startDate: String?=null,
    @SerializedName("end_date")
    var endDate: String?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null
): Parcelable

/*
    Model: Size1
*/
@Parcelize
data class Size1(
    
    @SerializedName("price")
    var price: Double?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("identifiers")
    var identifiers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("size")
    var size: String?=null
): Parcelable

/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size1>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("batch_id")
    var batchId: String?=null
): Parcelable

/*
    Model: InventoryExportRequest
*/
@Parcelize
data class InventoryExportRequest(
    
    @SerializedName("brand")
    var brand: ArrayList<Int>?=null,
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    @SerializedName("task_id")
    var taskId: String?=null
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
    
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null,
    @SerializedName("multivalues")
    var multivalues: Boolean?=null
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
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("state")
    var state: String?=null
): Parcelable

/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    @SerializedName("number")
    var number: String?=null,
    @SerializedName("country_code")
    var countryCode: Int?=null
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
    Model: Document
*/
@Parcelize
data class Document(
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("business_type")
    var businessType: String?=null
): Parcelable

/*
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("state")
    var state: String?=null
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
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("address")
    var address: CompanyAddress?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("document")
    var document: Document?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
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
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("stage")
    var stage: String?=null
): Parcelable

/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("contact")
    var contact: String?=null
): Parcelable

/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    @SerializedName("landscape")
    var landscape: String?=null,
    @SerializedName("portrait")
    var portrait: String?=null
): Parcelable

/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null
): Parcelable

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null
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
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company")
    var company: Int?=null
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
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null,
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null
): Parcelable

/*
    Model: GetAddressSerializer1
*/
@Parcelize
data class GetAddressSerializer1(
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("state")
    var state: String?=null
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
    
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    @SerializedName("open")
    var open: Boolean?=null
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
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null
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
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("code")
    var code: String?=null
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

