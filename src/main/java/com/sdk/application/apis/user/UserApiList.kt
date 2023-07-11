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
    suspend fun loginWithFacebook(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Response<AuthSuccess>
    
    
    @POST 
    suspend fun loginWithGoogle(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Response<AuthSuccess>
    
    
    @POST 
    suspend fun loginWithGoogleAndroid(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Response<AuthSuccess>
    
    
    @POST 
    suspend fun loginWithGoogleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Response<AuthSuccess>
    
    
    @POST 
    suspend fun loginWithAppleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestAppleSchema)
    : Response<AuthSuccess>
    
    
    @POST 
    suspend fun loginWithOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendOtpRequestSchema)
    : Response<SendOtpResponse>
    
    
    @POST 
    suspend fun loginWithEmailAndPassword(@Url url1: String?   ,@Body body: PasswordLoginRequestSchema)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun sendResetPasswordEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordEmailRequestSchema)
    : Response<ResetPasswordSuccess>
    
    
    @POST 
    suspend fun sendResetPasswordMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordMobileRequestSchema)
    : Response<ResetPasswordSuccess>
    
    
    @POST 
    suspend fun forgotPassword(@Url url1: String?   ,@Body body: ForgotPasswordRequestSchema)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun sendResetToken(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Response<ResetPasswordSuccess>
    
    
    @POST 
    suspend fun loginWithToken(@Url url1: String?   ,@Body body: TokenRequestBodySchema)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun registerWithForm(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: FormRegisterRequestSchema)
    : Response<RegisterFormSuccess>
    
    
    @POST 
    suspend fun verifyEmail(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Response<VerifyEmailSuccess>
    
    
    @POST 
    suspend fun verifyMobile(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Response<VerifyEmailSuccess>
    
    
    @GET 
    suspend fun hasPassword(@Url url1: String?   )
    : Response<HasPasswordSuccess>
    
    
    @POST 
    suspend fun updatePassword(@Url url1: String?   ,@Body body: UpdatePasswordRequestSchema)
    : Response<VerifyEmailSuccess>
    
    
    @POST 
    suspend fun deleteUser(@Url url1: String?   ,@Body body: DeleteApplicationUserRequestSchema)
    : Response<DeleteUserSuccess>
    
    
    @GET 
    suspend fun logout(@Url url1: String?   )
    : Response<LogoutSuccess>
    
    
    @POST 
    suspend fun sendOTPOnMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendMobileOtpRequestSchema)
    : Response<OtpSuccess>
    
    
    @POST 
    suspend fun verifyMobileOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyOtpRequestSchema)
    : Response<VerifyOtpSuccess>
    
    
    @POST 
    suspend fun sendOTPOnEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendEmailOtpRequestSchema)
    : Response<EmailOtpSuccess>
    
    
    @POST 
    suspend fun verifyEmailOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyEmailOtpRequestSchema)
    : Response<VerifyOtpSuccess>
    
    
    @GET 
    suspend fun getLoggedInUser(@Url url1: String?   )
    : Response<UserObjectSchema>
    
    
    @GET 
    suspend fun getListOfActiveSessions(@Url url1: String?   )
    : Response<SessionListSuccess>
    
    
    @GET 
    suspend fun getPlatformConfig(@Url url1: String?    ,  @Query("name") name: String?)
    : Response<PlatformSchema>
    
    
    @POST 
    suspend fun updateProfile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditProfileRequestSchema)
    : Response<ProfileEditSuccess>
    
    
    @PUT 
    suspend fun addMobileNumber(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditMobileRequestSchema)
    : Response<VerifyMobileOTPSuccess>
    
    
    @DELETE 
    suspend fun deleteMobileNumber(@Url url1: String?    ,       @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun setMobileNumberAsPrimary(@Url url1: String?   ,@Body body: SendVerificationLinkMobileRequestSchema)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun sendVerificationLinkToMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendVerificationLinkMobileRequestSchema)
    : Response<SendMobileVerifyLinkSuccess>
    
    
    @PUT 
    suspend fun addEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Response<VerifyEmailOTPSuccess>
    
    
    @DELETE 
    suspend fun deleteEmail(@Url url1: String?    ,      @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun setEmailAsPrimary(@Url url1: String?   ,@Body body: EditEmailRequestSchema)
    : Response<LoginSuccess>
    
    
    @POST 
    suspend fun sendVerificationLinkToEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Response<SendEmailVerifyLinkSuccess>
    
}