package com.sdk.application.user

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class UserDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val userApiList by lazy {
        generateuserApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["loginWithFacebook"] = "/service/application/user/authentication/v1.0/login/facebook-token".substring(1)
            
                    _relativeUrls["loginWithGoogle"] = "/service/application/user/authentication/v1.0/login/google-token".substring(1)
            
                    _relativeUrls["loginWithGoogleAndroid"] = "/service/application/user/authentication/v1.0/login/google-android".substring(1)
            
                    _relativeUrls["loginWithGoogleIOS"] = "/service/application/user/authentication/v1.0/login/google-ios".substring(1)
            
                    _relativeUrls["loginWithAppleIOS"] = "/service/application/user/authentication/v1.0/login/apple-ios".substring(1)
            
                    _relativeUrls["loginWithOTP"] = "/service/application/user/authentication/v1.0/login/otp".substring(1)
            
                    _relativeUrls["loginWithEmailAndPassword"] = "/service/application/user/authentication/v1.0/login/password".substring(1)
            
                    _relativeUrls["sendResetPasswordEmail"] = "/service/application/user/authentication/v1.0/login/password/reset".substring(1)
            
                    _relativeUrls["sendResetPasswordMobile"] = "/service/application/user/authentication/v1.0/login/password/mobile/reset".substring(1)
            
                    _relativeUrls["forgotPassword"] = "/service/application/user/authentication/v1.0/login/password/reset/forgot".substring(1)
            
                    _relativeUrls["resetForgotPassword"] = "/service/application/user/authentication/v1.0/login/password/forgot".substring(1)
            
                    _relativeUrls["sendResetToken"] = "/service/application/user/authentication/v1.0/login/password/reset/token".substring(1)
            
                    _relativeUrls["loginWithToken"] = "/service/application/user/authentication/v1.0/login/token".substring(1)
            
                    _relativeUrls["registerWithForm"] = "/service/application/user/authentication/v1.0/register/form".substring(1)
            
                    _relativeUrls["verifyEmail"] = "/service/application/user/authentication/v1.0/verify/email".substring(1)
            
                    _relativeUrls["verifyMobile"] = "/service/application/user/authentication/v1.0/verify/mobile".substring(1)
            
                    _relativeUrls["hasPassword"] = "/service/application/user/authentication/v1.0/has-password".substring(1)
            
                    _relativeUrls["updatePassword"] = "/service/application/user/authentication/v1.0/password".substring(1)
            
                    _relativeUrls["deleteUser"] = "/service/application/user/authentication/v1.0/delete".substring(1)
            
                    _relativeUrls["logout"] = "/service/application/user/authentication/v1.0/logout".substring(1)
            
                    _relativeUrls["sendOTPOnMobile"] = "/service/application/user/authentication/v1.0/otp/mobile/send".substring(1)
            
                    _relativeUrls["sendForgotOTPOnMobile"] = "/service/application/user/authentication/v1.0/otp/forgot/mobile/send".substring(1)
            
                    _relativeUrls["verifyMobileOTP"] = "/service/application/user/authentication/v1.0/otp/mobile/verify".substring(1)
            
                    _relativeUrls["verifyMobileForgotOTP"] = "/service/application/user/authentication/v1.0/otp/forgot/mobile/verify".substring(1)
            
                    _relativeUrls["sendOTPOnEmail"] = "/service/application/user/authentication/v1.0/otp/email/send".substring(1)
            
                    _relativeUrls["sendForgotOTPOnEmail"] = "/service/application/user/authentication/v1.0/otp/forgot/email/send".substring(1)
            
                    _relativeUrls["verifyEmailOTP"] = "/service/application/user/authentication/v1.0/otp/email/verify".substring(1)
            
                    _relativeUrls["verifyEmailForgotOTP"] = "/service/application/user/authentication/v1.0/otp/forgot/email/verify".substring(1)
            
                    _relativeUrls["getLoggedInUser"] = "/service/application/user/authentication/v1.0/session".substring(1)
            
                    _relativeUrls["getListOfActiveSessions"] = "/service/application/user/authentication/v1.0/sessions".substring(1)
            
                    _relativeUrls["getPlatformConfig"] = "/service/application/user/platform/v1.0/config".substring(1)
            
                    _relativeUrls["updateProfile"] = "/service/application/user/profile/v1.0/detail".substring(1)
            
                    _relativeUrls["addMobileNumber"] = "/service/application/user/profile/v1.0/mobile".substring(1)
            
                    _relativeUrls["deleteMobileNumber"] = "/service/application/user/profile/v1.0/mobile".substring(1)
            
                    _relativeUrls["setMobileNumberAsPrimary"] = "/service/application/user/profile/v1.0/mobile/primary".substring(1)
            
                    _relativeUrls["sendVerificationLinkToMobile"] = "/service/application/user/profile/v1.0/mobile/link/send".substring(1)
            
                    _relativeUrls["addEmail"] = "/service/application/user/profile/v1.0/email".substring(1)
            
                    _relativeUrls["deleteEmail"] = "/service/application/user/profile/v1.0/email".substring(1)
            
                    _relativeUrls["setEmailAsPrimary"] = "/service/application/user/profile/v1.0/email/primary".substring(1)
            
                    _relativeUrls["sendVerificationLinkToEmail"] = "/service/application/user/profile/v1.0/email/link/send".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationUser",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    suspend fun loginWithFacebook(platform: String?=null, body: OAuthRequestSchema): Response<AuthSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithFacebook"] 
        
        return userApiList?.loginWithFacebook(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithGoogle(platform: String?=null, body: OAuthRequestSchema): Response<AuthSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogle"] 
        
        return userApiList?.loginWithGoogle(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithGoogleAndroid(platform: String?=null, body: OAuthRequestSchema): Response<AuthSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogleAndroid"] 
        
        return userApiList?.loginWithGoogleAndroid(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithGoogleIOS(platform: String?=null, body: OAuthRequestSchema): Response<AuthSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogleIOS"] 
        
        return userApiList?.loginWithGoogleIOS(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithAppleIOS(platform: String?=null, body: OAuthRequestAppleSchema): Response<AuthSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithAppleIOS"] 
        
        return userApiList?.loginWithAppleIOS(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithOTP(platform: String?=null, body: SendOtpRequestSchema): Response<SendOtpResponse>? {
        var fullUrl : String? = _relativeUrls["loginWithOTP"] 
        
        return userApiList?.loginWithOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun loginWithEmailAndPassword(body: PasswordLoginRequestSchema): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithEmailAndPassword"] 
        
        return userApiList?.loginWithEmailAndPassword(fullUrl  ,body = body)}

    
    
    suspend fun sendResetPasswordEmail(platform: String?=null, body: SendResetPasswordEmailRequestSchema): Response<ResetPasswordSuccess>? {
        var fullUrl : String? = _relativeUrls["sendResetPasswordEmail"] 
        
        return userApiList?.sendResetPasswordEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun sendResetPasswordMobile(platform: String?=null, body: SendResetPasswordMobileRequestSchema): Response<ResetPasswordSuccess>? {
        var fullUrl : String? = _relativeUrls["sendResetPasswordMobile"] 
        
        return userApiList?.sendResetPasswordMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun forgotPassword(body: ForgotPasswordRequestSchema): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["forgotPassword"] 
        
        return userApiList?.forgotPassword(fullUrl  ,body = body)}

    
    
    suspend fun resetForgotPassword(body: ForgotPasswordRequestSchema): Response<ResetForgotPasswordSuccess>? {
        var fullUrl : String? = _relativeUrls["resetForgotPassword"] 
        
        return userApiList?.resetForgotPassword(fullUrl  ,body = body)}

    
    
    suspend fun sendResetToken(body: CodeRequestBodySchema): Response<ResetPasswordSuccess>? {
        var fullUrl : String? = _relativeUrls["sendResetToken"] 
        
        return userApiList?.sendResetToken(fullUrl  ,body = body)}

    
    
    suspend fun loginWithToken(body: TokenRequestBodySchema): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["loginWithToken"] 
        
        return userApiList?.loginWithToken(fullUrl  ,body = body)}

    
    
    suspend fun registerWithForm(platform: String?=null, body: FormRegisterRequestSchema): Response<RegisterFormSuccess>? {
        var fullUrl : String? = _relativeUrls["registerWithForm"] 
        
        return userApiList?.registerWithForm(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun verifyEmail(body: CodeRequestBodySchema): Response<VerifyEmailSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyEmail"] 
        
        return userApiList?.verifyEmail(fullUrl  ,body = body)}

    
    
    suspend fun verifyMobile(body: CodeRequestBodySchema): Response<VerifyEmailSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyMobile"] 
        
        return userApiList?.verifyMobile(fullUrl  ,body = body)}

    
    
    suspend fun hasPassword(): Response<HasPasswordSuccess>? {
        var fullUrl : String? = _relativeUrls["hasPassword"] 
        
        return userApiList?.hasPassword(fullUrl  )}

    
    
    suspend fun updatePassword(body: UpdatePasswordRequestSchema): Response<VerifyEmailSuccess>? {
        var fullUrl : String? = _relativeUrls["updatePassword"] 
        
        return userApiList?.updatePassword(fullUrl  ,body = body)}

    
    
    suspend fun deleteUser(body: DeleteApplicationUserRequestSchema): Response<DeleteUserSuccess>? {
        var fullUrl : String? = _relativeUrls["deleteUser"] 
        
        return userApiList?.deleteUser(fullUrl  ,body = body)}

    
    
    suspend fun logout(): Response<LogoutSuccess>? {
        var fullUrl : String? = _relativeUrls["logout"] 
        
        return userApiList?.logout(fullUrl  )}

    
    
    suspend fun sendOTPOnMobile(platform: String?=null, body: SendMobileOtpRequestSchema): Response<OtpSuccess>? {
        var fullUrl : String? = _relativeUrls["sendOTPOnMobile"] 
        
        return userApiList?.sendOTPOnMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun sendForgotOTPOnMobile(platform: String?=null, body: SendMobileForgotOtpRequestSchema): Response<OtpSuccess>? {
        var fullUrl : String? = _relativeUrls["sendForgotOTPOnMobile"] 
        
        return userApiList?.sendForgotOTPOnMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun verifyMobileOTP(platform: String?=null, body: VerifyOtpRequestSchema): Response<VerifyOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyMobileOTP"] 
        
        return userApiList?.verifyMobileOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun verifyMobileForgotOTP(platform: String?=null, body: VerifyMobileForgotOtpRequestSchema): Response<VerifyForgotOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyMobileForgotOTP"] 
        
        return userApiList?.verifyMobileForgotOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun sendOTPOnEmail(platform: String?=null, body: SendEmailOtpRequestSchema): Response<EmailOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["sendOTPOnEmail"] 
        
        return userApiList?.sendOTPOnEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun sendForgotOTPOnEmail(platform: String?=null, body: SendEmailForgotOtpRequestSchema): Response<EmailOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["sendForgotOTPOnEmail"] 
        
        return userApiList?.sendForgotOTPOnEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun verifyEmailOTP(platform: String?=null, body: VerifyEmailOtpRequestSchema): Response<VerifyOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyEmailOTP"] 
        
        return userApiList?.verifyEmailOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun verifyEmailForgotOTP(platform: String?=null, body: VerifyEmailForgotOtpRequestSchema): Response<VerifyForgotOtpSuccess>? {
        var fullUrl : String? = _relativeUrls["verifyEmailForgotOTP"] 
        
        return userApiList?.verifyEmailForgotOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun getLoggedInUser(): Response<UserObjectSchema>? {
        var fullUrl : String? = _relativeUrls["getLoggedInUser"] 
        
        return userApiList?.getLoggedInUser(fullUrl  )}

    
    
    suspend fun getListOfActiveSessions(): Response<SessionListSuccess>? {
        var fullUrl : String? = _relativeUrls["getListOfActiveSessions"] 
        
        return userApiList?.getListOfActiveSessions(fullUrl  )}

    
    
    suspend fun getPlatformConfig(name: String?=null): Response<PlatformSchema>? {
        var fullUrl : String? = _relativeUrls["getPlatformConfig"] 
        
        return userApiList?.getPlatformConfig(fullUrl    ,  name = name)}

    
    
    suspend fun updateProfile(platform: String?=null, body: EditProfileRequestSchema): Response<ProfileEditSuccess>? {
        var fullUrl : String? = _relativeUrls["updateProfile"] 
        
        return userApiList?.updateProfile(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun addMobileNumber(platform: String?=null, body: EditMobileRequestSchema): Response<VerifyMobileOTPSuccess>? {
        var fullUrl : String? = _relativeUrls["addMobileNumber"] 
        
        return userApiList?.addMobileNumber(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun deleteMobileNumber(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["deleteMobileNumber"] 
        
        return userApiList?.deleteMobileNumber(fullUrl    ,  platform = platform,    active = active,    primary = primary,    verified = verified,    countryCode = countryCode,    phone = phone)}

    
    
    suspend fun setMobileNumberAsPrimary(body: SendVerificationLinkMobileRequestSchema): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["setMobileNumberAsPrimary"] 
        
        return userApiList?.setMobileNumberAsPrimary(fullUrl  ,body = body)}

    
    
    suspend fun sendVerificationLinkToMobile(platform: String?=null, body: SendVerificationLinkMobileRequestSchema): Response<SendMobileVerifyLinkSuccess>? {
        var fullUrl : String? = _relativeUrls["sendVerificationLinkToMobile"] 
        
        return userApiList?.sendVerificationLinkToMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun addEmail(platform: String?=null, body: EditEmailRequestSchema): Response<VerifyEmailOTPSuccess>? {
        var fullUrl : String? = _relativeUrls["addEmail"] 
        
        return userApiList?.addEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    suspend fun deleteEmail(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, email: String): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["deleteEmail"] 
        
        return userApiList?.deleteEmail(fullUrl    ,  platform = platform,    active = active,    primary = primary,    verified = verified,    email = email)}

    
    
    suspend fun setEmailAsPrimary(body: EditEmailRequestSchema): Response<LoginSuccess>? {
        var fullUrl : String? = _relativeUrls["setEmailAsPrimary"] 
        
        return userApiList?.setEmailAsPrimary(fullUrl  ,body = body)}

    
    
    suspend fun sendVerificationLinkToEmail(platform: String?=null, body: EditEmailRequestSchema): Response<SendEmailVerifyLinkSuccess>? {
        var fullUrl : String? = _relativeUrls["sendVerificationLinkToEmail"] 
        
        return userApiList?.sendVerificationLinkToEmail(fullUrl    ,  platform = platform, body = body)}

    
    
}
