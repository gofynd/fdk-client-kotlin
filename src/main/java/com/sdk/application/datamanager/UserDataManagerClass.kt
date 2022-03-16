package com.sdk.application.datamanager

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
            
                    _relativeUrls["loginWithFacebook"] = "/service/application/user/authentication/v1.0/login/facebook-token"?.substring(1)
            
                    _relativeUrls["loginWithGoogle"] = "/service/application/user/authentication/v1.0/login/google-token"?.substring(1)
            
                    _relativeUrls["loginWithGoogleAndroid"] = "/service/application/user/authentication/v1.0/login/google-android"?.substring(1)
            
                    _relativeUrls["loginWithGoogleIOS"] = "/service/application/user/authentication/v1.0/login/google-ios"?.substring(1)
            
                    _relativeUrls["loginWithAppleIOS"] = "/service/application/user/authentication/v1.0/login/apple-ios"?.substring(1)
            
                    _relativeUrls["loginWithOTP"] = "/service/application/user/authentication/v1.0/login/otp"?.substring(1)
            
                    _relativeUrls["loginWithEmailAndPassword"] = "/service/application/user/authentication/v1.0/login/password"?.substring(1)
            
                    _relativeUrls["sendResetPasswordEmail"] = "/service/application/user/authentication/v1.0/login/password/reset"?.substring(1)
            
                    _relativeUrls["forgotPassword"] = "/service/application/user/authentication/v1.0/login/password/reset/forgot"?.substring(1)
            
                    _relativeUrls["sendResetToken"] = "/service/application/user/authentication/v1.0/login/password/reset/token"?.substring(1)
            
                    _relativeUrls["loginWithToken"] = "/service/application/user/authentication/v1.0/login/token"?.substring(1)
            
                    _relativeUrls["registerWithForm"] = "/service/application/user/authentication/v1.0/register/form"?.substring(1)
            
                    _relativeUrls["verifyEmail"] = "/service/application/user/authentication/v1.0/verify/email"?.substring(1)
            
                    _relativeUrls["verifyMobile"] = "/service/application/user/authentication/v1.0/verify/mobile"?.substring(1)
            
                    _relativeUrls["hasPassword"] = "/service/application/user/authentication/v1.0/has-password"?.substring(1)
            
                    _relativeUrls["updatePassword"] = "/service/application/user/authentication/v1.0/password"?.substring(1)
            
                    _relativeUrls["logout"] = "/service/application/user/authentication/v1.0/logout"?.substring(1)
            
                    _relativeUrls["sendOTPOnMobile"] = "/service/application/user/authentication/v1.0/otp/mobile/send"?.substring(1)
            
                    _relativeUrls["verifyMobileOTP"] = "/service/application/user/authentication/v1.0/otp/mobile/verify"?.substring(1)
            
                    _relativeUrls["sendOTPOnEmail"] = "/service/application/user/authentication/v1.0/otp/email/send"?.substring(1)
            
                    _relativeUrls["verifyEmailOTP"] = "/service/application/user/authentication/v1.0/otp/email/verify"?.substring(1)
            
                    _relativeUrls["getLoggedInUser"] = "/service/application/user/authentication/v1.0/session"?.substring(1)
            
                    _relativeUrls["getListOfActiveSessions"] = "/service/application/user/authentication/v1.0/sessions"?.substring(1)
            
                    _relativeUrls["getPlatformConfig"] = "/service/application/user/platform/v1.0/config"?.substring(1)
            
                    _relativeUrls["updateProfile"] = "/service/application/user/profile/v1.0/detail"?.substring(1)
            
                    _relativeUrls["addMobileNumber"] = "/service/application/user/profile/v1.0/mobile"?.substring(1)
            
                    _relativeUrls["deleteMobileNumber"] = "/service/application/user/profile/v1.0/mobile"?.substring(1)
            
                    _relativeUrls["setMobileNumberAsPrimary"] = "/service/application/user/profile/v1.0/mobile/primary"?.substring(1)
            
                    _relativeUrls["sendVerificationLinkToMobile"] = "/service/application/user/profile/v1.0/mobile/link/send"?.substring(1)
            
                    _relativeUrls["addEmail"] = "/service/application/user/profile/v1.0/email"?.substring(1)
            
                    _relativeUrls["deleteEmail"] = "/service/application/user/profile/v1.0/email"?.substring(1)
            
                    _relativeUrls["setEmailAsPrimary"] = "/service/application/user/profile/v1.0/email/primary"?.substring(1)
            
                    _relativeUrls["sendVerificationLinkToEmail"] = "/service/application/user/profile/v1.0/email/link/send"?.substring(1)
            
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
        var fullUrl : String? = _relativeUrls["loginWithFacebook"] 
        
        return userApiList?.loginWithFacebook(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithGoogle(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogle"] 
        
        return userApiList?.loginWithGoogle(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithGoogleAndroid(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogleAndroid"] 
        
        return userApiList?.loginWithGoogleAndroid(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithGoogleIOS(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithGoogleIOS"] 
        
        return userApiList?.loginWithGoogleIOS(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithAppleIOS(platform: String?=null, body: OAuthRequestAppleSchema): Deferred<Response<AuthSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithAppleIOS"] 
        
        return userApiList?.loginWithAppleIOS(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithOTP(platform: String?=null, body: SendOtpRequestSchema): Deferred<Response<SendOtpResponse>>? {
        var fullUrl : String? = _relativeUrls["loginWithOTP"] 
        
        return userApiList?.loginWithOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    fun loginWithEmailAndPassword(body: PasswordLoginRequestSchema): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithEmailAndPassword"] 
        
        return userApiList?.loginWithEmailAndPassword(fullUrl  ,body = body)}

    
    
    fun sendResetPasswordEmail(platform: String?=null, body: SendResetPasswordEmailRequestSchema): Deferred<Response<ResetPasswordSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendResetPasswordEmail"] 
        
        return userApiList?.sendResetPasswordEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    fun forgotPassword(body: ForgotPasswordRequestSchema): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["forgotPassword"] 
        
        return userApiList?.forgotPassword(fullUrl  ,body = body)}

    
    
    fun sendResetToken(body: CodeRequestBodySchema): Deferred<Response<ResetPasswordSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendResetToken"] 
        
        return userApiList?.sendResetToken(fullUrl  ,body = body)}

    
    
    fun loginWithToken(body: TokenRequestBodySchema): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["loginWithToken"] 
        
        return userApiList?.loginWithToken(fullUrl  ,body = body)}

    
    
    fun registerWithForm(platform: String?=null, body: FormRegisterRequestSchema): Deferred<Response<RegisterFormSuccess>>? {
        var fullUrl : String? = _relativeUrls["registerWithForm"] 
        
        return userApiList?.registerWithForm(fullUrl    ,  platform = platform, body = body)}

    
    
    fun verifyEmail(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        var fullUrl : String? = _relativeUrls["verifyEmail"] 
        
        return userApiList?.verifyEmail(fullUrl  ,body = body)}

    
    
    fun verifyMobile(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        var fullUrl : String? = _relativeUrls["verifyMobile"] 
        
        return userApiList?.verifyMobile(fullUrl  ,body = body)}

    
    
    fun hasPassword(): Deferred<Response<HasPasswordSuccess>>? {
        var fullUrl : String? = _relativeUrls["hasPassword"] 
        
        return userApiList?.hasPassword(fullUrl  )}

    
    
    fun updatePassword(body: UpdatePasswordRequestSchema): Deferred<Response<VerifyEmailSuccess>>? {
        var fullUrl : String? = _relativeUrls["updatePassword"] 
        
        return userApiList?.updatePassword(fullUrl  ,body = body)}

    
    
    fun logout(): Deferred<Response<LogoutSuccess>>? {
        var fullUrl : String? = _relativeUrls["logout"] 
        
        return userApiList?.logout(fullUrl  )}

    
    
    fun sendOTPOnMobile(platform: String?=null, body: SendMobileOtpRequestSchema): Deferred<Response<OtpSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendOTPOnMobile"] 
        
        return userApiList?.sendOTPOnMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    fun verifyMobileOTP(platform: String?=null, body: VerifyOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        var fullUrl : String? = _relativeUrls["verifyMobileOTP"] 
        
        return userApiList?.verifyMobileOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    fun sendOTPOnEmail(platform: String?=null, body: SendEmailOtpRequestSchema): Deferred<Response<EmailOtpSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendOTPOnEmail"] 
        
        return userApiList?.sendOTPOnEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    fun verifyEmailOTP(platform: String?=null, body: VerifyEmailOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        var fullUrl : String? = _relativeUrls["verifyEmailOTP"] 
        
        return userApiList?.verifyEmailOTP(fullUrl    ,  platform = platform, body = body)}

    
    
    fun getLoggedInUser(): Deferred<Response<UserObjectSchema>>? {
        var fullUrl : String? = _relativeUrls["getLoggedInUser"] 
        
        return userApiList?.getLoggedInUser(fullUrl  )}

    
    
    fun getListOfActiveSessions(): Deferred<Response<SessionListSuccess>>? {
        var fullUrl : String? = _relativeUrls["getListOfActiveSessions"] 
        
        return userApiList?.getListOfActiveSessions(fullUrl  )}

    
    
    fun getPlatformConfig(name: String?=null): Deferred<Response<PlatformSchema>>? {
        var fullUrl : String? = _relativeUrls["getPlatformConfig"] 
        
        return userApiList?.getPlatformConfig(fullUrl    ,  name = name)}

    
    
    fun updateProfile(platform: String?=null, body: EditProfileRequestSchema): Deferred<Response<ProfileEditSuccess>>? {
        var fullUrl : String? = _relativeUrls["updateProfile"] 
        
        return userApiList?.updateProfile(fullUrl    ,  platform = platform, body = body)}

    
    
    fun addMobileNumber(platform: String?=null, body: EditMobileRequestSchema): Deferred<Response<VerifyMobileOTPSuccess>>? {
        var fullUrl : String? = _relativeUrls["addMobileNumber"] 
        
        return userApiList?.addMobileNumber(fullUrl    ,  platform = platform, body = body)}

    
    
    fun deleteMobileNumber(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["deleteMobileNumber"] 
        
        return userApiList?.deleteMobileNumber(fullUrl    ,  platform = platform,    active = active,    primary = primary,    verified = verified,    countryCode = countryCode,    phone = phone)}

    
    
    fun setMobileNumberAsPrimary(body: SendVerificationLinkMobileRequestSchema): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["setMobileNumberAsPrimary"] 
        
        return userApiList?.setMobileNumberAsPrimary(fullUrl  ,body = body)}

    
    
    fun sendVerificationLinkToMobile(platform: String?=null, body: SendVerificationLinkMobileRequestSchema): Deferred<Response<SendMobileVerifyLinkSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendVerificationLinkToMobile"] 
        
        return userApiList?.sendVerificationLinkToMobile(fullUrl    ,  platform = platform, body = body)}

    
    
    fun addEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<VerifyEmailOTPSuccess>>? {
        var fullUrl : String? = _relativeUrls["addEmail"] 
        
        return userApiList?.addEmail(fullUrl    ,  platform = platform, body = body)}

    
    
    fun deleteEmail(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, email: String): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["deleteEmail"] 
        
        return userApiList?.deleteEmail(fullUrl    ,  platform = platform,    active = active,    primary = primary,    verified = verified,    email = email)}

    
    
    fun setEmailAsPrimary(body: EditEmailRequestSchema): Deferred<Response<LoginSuccess>>? {
        var fullUrl : String? = _relativeUrls["setEmailAsPrimary"] 
        
        return userApiList?.setEmailAsPrimary(fullUrl  ,body = body)}

    
    
    fun sendVerificationLinkToEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<SendEmailVerifyLinkSuccess>>? {
        var fullUrl : String? = _relativeUrls["sendVerificationLinkToEmail"] 
        
        return userApiList?.sendVerificationLinkToEmail(fullUrl    ,  platform = platform, body = body)}

    
    
}
