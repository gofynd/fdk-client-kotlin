package com.sdk.application.apis.user

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.user.*

interface UserApiList {
    
    
    @POST 
    fun loginWithFacebook(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogle(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogleAndroid(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithAppleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestAppleSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendOtpRequestSchema)
    : Deferred<Response<SendOtpResponse>>
    
    
    @POST 
    fun loginWithEmailAndPassword(@Url url1: String?   ,@Body body: PasswordLoginRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendResetPasswordEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordEmailRequestSchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun sendResetPasswordMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordMobileRequestSchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun forgotPassword(@Url url1: String?   ,@Body body: ForgotPasswordRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendResetToken(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun loginWithToken(@Url url1: String?   ,@Body body: TokenRequestBodySchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun registerWithForm(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: FormRegisterRequestSchema)
    : Deferred<Response<RegisterFormSuccess>>
    
    
    @POST 
    fun verifyEmail(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @POST 
    fun verifyMobile(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @GET 
    fun hasPassword(@Url url1: String?   )
    : Deferred<Response<HasPasswordSuccess>>
    
    
    @POST 
    fun updatePassword(@Url url1: String?   ,@Body body: UpdatePasswordRequestSchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @POST 
    fun deleteUser(@Url url1: String?   ,@Body body: DeleteApplicationUserRequestSchema)
    : Deferred<Response<DeleteUserSuccess>>
    
    
    @GET 
    fun logout(@Url url1: String?   )
    : Deferred<Response<LogoutSuccess>>
    
    
    @POST 
    fun sendOTPOnMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendMobileOtpRequestSchema)
    : Deferred<Response<OtpSuccess>>
    
    
    @POST 
    fun verifyMobileOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @POST 
    fun sendOTPOnEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendEmailOtpRequestSchema)
    : Deferred<Response<EmailOtpSuccess>>
    
    
    @POST 
    fun verifyEmailOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyEmailOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @GET 
    fun getLoggedInUser(@Url url1: String?   )
    : Deferred<Response<UserObjectSchema>>
    
    
    @GET 
    fun getListOfActiveSessions(@Url url1: String?   )
    : Deferred<Response<SessionListSuccess>>
    
    
    @GET 
    fun getPlatformConfig(@Url url1: String?    ,  @Query("name") name: String?)
    : Deferred<Response<PlatformSchema>>
    
    
    @POST 
    fun updateProfile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditProfileRequestSchema)
    : Deferred<Response<ProfileEditSuccess>>
    
    
    @PUT 
    fun addMobileNumber(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditMobileRequestSchema)
    : Deferred<Response<VerifyMobileOTPSuccess>>
    
    
    @DELETE 
    fun deleteMobileNumber(@Url url1: String?    ,       @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun setMobileNumberAsPrimary(@Url url1: String?   ,@Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendVerificationLinkToMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    
    @PUT 
    fun addEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<VerifyEmailOTPSuccess>>
    
    
    @DELETE 
    fun deleteEmail(@Url url1: String?    ,      @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun setEmailAsPrimary(@Url url1: String?   ,@Body body: EditEmailRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendVerificationLinkToEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<SendEmailVerifyLinkSuccess>>
    
}