package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class UserDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val userApiList by lazy {
        generateuserApiList()
    }

    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    fun loginWithFacebook(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithFacebook(platform = platform, body = body)}

    
    
    fun loginWithGoogle(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogle(platform = platform, body = body)}

    
    
    fun loginWithGoogleAndroid(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleAndroid(platform = platform, body = body)}

    
    
    fun loginWithGoogleIOS(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleIOS(platform = platform, body = body)}

    
    
    fun loginWithAppleIOS(platform: String?=null, body: OAuthRequestAppleSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithAppleIOS(platform = platform, body = body)}

    
    
    fun loginWithOTP(platform: String?=null, body: SendOtpRequestSchema): Deferred<Response<SendOtpResponse>>? {
        return userApiList?.loginWithOTP(platform = platform, body = body)}

    
    
    fun loginWithEmailAndPassword(body: PasswordLoginRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithEmailAndPassword(body = body)}

    
    
    fun sendResetPasswordEmail(platform: String?=null, body: SendResetPasswordEmailRequestSchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetPasswordEmail(platform = platform, body = body)}

    
    
    fun forgotPassword(body: ForgotPasswordRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.forgotPassword(body = body)}

    
    
    fun sendResetToken(body: CodeRequestBodySchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetToken(body = body)}

    
    
    fun loginWithToken(body: TokenRequestBodySchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithToken(body = body)}

    
    
    fun registerWithForm(platform: String?=null, body: FormRegisterRequestSchema): Deferred<Response<RegisterFormSuccess>>? {
        return userApiList?.registerWithForm(platform = platform, body = body)}

    
    
    fun verifyEmail(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyEmail(body = body)}

    
    
    fun verifyMobile(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyMobile(body = body)}

    
    
    fun hasPassword(): Deferred<Response<HasPasswordSuccess>>? {
        return userApiList?.hasPassword()}

    
    
    fun updatePassword(body: UpdatePasswordRequestSchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.updatePassword(body = body)}

    
    
    fun logout(): Deferred<Response<LogoutSuccess>>? {
        return userApiList?.logout()}

    
    
    fun sendOTPOnMobile(platform: String?=null, body: SendMobileOtpRequestSchema): Deferred<Response<OtpSuccess>>? {
        return userApiList?.sendOTPOnMobile(platform = platform, body = body)}

    
    
    fun verifyMobileOTP(platform: String?=null, body: VerifyOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyMobileOTP(platform = platform, body = body)}

    
    
    fun sendOTPOnEmail(platform: String?=null, body: SendEmailOtpRequestSchema): Deferred<Response<EmailOtpSuccess>>? {
        return userApiList?.sendOTPOnEmail(platform = platform, body = body)}

    
    
    fun verifyEmailOTP(platform: String?=null, body: VerifyEmailOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyEmailOTP(platform = platform, body = body)}

    
    
    fun getLoggedInUser(): Deferred<Response<UserObjectSchema>>? {
        return userApiList?.getLoggedInUser()}

    
    
    fun getListOfActiveSessions(): Deferred<Response<SessionListSuccess>>? {
        return userApiList?.getListOfActiveSessions()}

    
    
    fun setFreshchatRestoreId(body: FreshchatRestoreIdRequestSchema): Deferred<Response<UserStoreSchema>>? {
        return userApiList?.setFreshchatRestoreId(body = body)}

    
    
    fun getUserStore(): Deferred<Response<UserStoreSchema>>? {
        return userApiList?.getUserStore()}

    
    
    fun getPlatformConfig(name: String?=null): Deferred<Response<PlatformSchema>>? {
        return userApiList?.getPlatformConfig(name = name)}

    
    
    fun updateProfile(platform: String?=null, body: EditProfileRequestSchema): Deferred<Response<ProfileEditSuccess>>? {
        return userApiList?.updateProfile(platform = platform, body = body)}

    
    
    fun addMobileNumber(platform: String?=null, body: EditMobileRequestSchema): Deferred<Response<VerifyMobileOTPSuccess>>? {
        return userApiList?.addMobileNumber(platform = platform, body = body)}

    
    
    fun deleteMobileNumber(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteMobileNumber(platform = platform, active = active, primary = primary, verified = verified, countryCode = countryCode, phone = phone)}

    
    
    fun setMobileNumberAsPrimary(body: SendVerificationLinkMobileRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setMobileNumberAsPrimary(body = body)}

    
    
    fun sendVerificationLinkToMobile(platform: String?=null, body: SendVerificationLinkMobileRequestSchema): Deferred<Response<SendMobileVerifyLinkSuccess>>? {
        return userApiList?.sendVerificationLinkToMobile(platform = platform, body = body)}

    
    
    fun addEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<VerifyEmailOTPSuccess>>? {
        return userApiList?.addEmail(platform = platform, body = body)}

    
    
    fun deleteEmail(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, email: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteEmail(platform = platform, active = active, primary = primary, verified = verified, email = email)}

    
    
    fun setEmailAsPrimary(body: EditEmailRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setEmailAsPrimary(body = body)}

    
    
    fun sendVerificationLinkToEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<SendEmailVerifyLinkSuccess>>? {
        return userApiList?.sendVerificationLinkToEmail(platform = platform, body = body)}

    
    
}
