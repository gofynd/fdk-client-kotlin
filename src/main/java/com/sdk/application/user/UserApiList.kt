package com.sdk.application.user

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface UserApiList {
    
    
    @POST
    suspend fun loginWithFacebook(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AuthSuccess>
    
    
    @POST
    suspend fun loginWithGoogle(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AuthSuccess>
    
    
    @POST
    suspend fun loginWithGoogleAndroid(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AuthSuccess>
    
    
    @POST
    suspend fun loginWithGoogleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AuthSuccess>
    
    
    @POST
    suspend fun loginWithAppleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestAppleSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AuthSuccess>
    
    
    @POST
    suspend fun loginWithOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendOtp>
    
    
    @POST
    suspend fun loginWithEmailAndPassword(@Url url1: String?   ,@Body body: PasswordLoginRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun sendResetPasswordEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordEmailRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResetPasswordSuccess>
    
    
    @POST
    suspend fun sendResetPasswordMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordMobileRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<Any>
    
    
    @POST
    suspend fun sendResetToken(@Url url1: String?   ,@Body body: CodeRequestBodySchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResetPasswordSuccess>
    
    
    @POST
    suspend fun forgotPassword(@Url url1: String?   ,@Body body: ForgotPasswordRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun resetForgotPassword(@Url url1: String?   ,@Body body: ForgotPasswordRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResetForgotPasswordSuccess>
    
    
    @POST
    suspend fun loginWithToken(@Url url1: String?   ,@Body body: TokenRequestBodySchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun registerWithForm(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: FormRegisterRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<RegisterFormSuccess>
    
    
    @POST
    suspend fun verifyEmail(@Url url1: String?   ,@Body body: CodeRequestBodySchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyEmailSuccess>
    
    
    @POST
    suspend fun verifyMobile(@Url url1: String?   ,@Body body: CodeRequestBodySchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyEmailSuccess>
    
    
    @GET
    suspend fun hasPassword(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<HasPasswordSuccess>
    
    
    @POST
    suspend fun updatePassword(@Url url1: String?   ,@Body body: UpdatePasswordRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyEmailSuccess>
    
    
    @POST
    suspend fun sendOTPOnMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendMobileOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendOtpSuccess>
    
    
    @POST
    suspend fun sendForgotOTPOnMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendMobileForgotOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendOtpSuccess>
    
    
    @POST
    suspend fun verifyMobileOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyOtpSuccess>
    
    
    @POST
    suspend fun verifyMobileForgotOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyMobileForgotOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyForgotOtpSuccess>
    
    
    @POST
    suspend fun sendOTPOnEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendEmailOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailOtpSuccess>
    
    
    @POST
    suspend fun sendForgotOTPOnEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendEmailForgotOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailOtpSuccess>
    
    
    @POST
    suspend fun verifyEmailOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyEmailOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyOtpSuccess>
    
    
    @POST
    suspend fun verifyEmailForgotOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyEmailForgotOtpRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyForgotOtpSuccess>
    
    
    @GET
    suspend fun getLoggedInUser(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<UserObjectSchema>
    
    
    @GET
    suspend fun getListOfActiveSessions(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<SessionListSuccess>
    
    
    @GET
    suspend fun getPlatformConfig(@Url url1: String?    ,  @Query("name") name: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformSchema>
    
    
    @POST
    suspend fun updateProfile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditProfileRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProfileEditSuccess>
    
    
    @PUT
    suspend fun addMobileNumber(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditMobileRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyMobileOTPSuccess>
    
    
    @DELETE
    suspend fun deleteMobileNumber(@Url url1: String?    ,       @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun setMobileNumberAsPrimary(@Url url1: String?   ,@Body body: SendVerificationLinkMobileRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun sendVerificationLinkToMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendVerificationLinkMobileRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendMobileVerifyLinkSuccess>
    
    
    @PUT
    suspend fun addEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyEmailOTPSuccess>
    
    
    @DELETE
    suspend fun deleteEmail(@Url url1: String?    ,      @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun setEmailAsPrimary(@Url url1: String?   ,@Body body: EditEmailRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LoginSuccess>
    
    
    @POST
    suspend fun sendVerificationLinkToEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendEmailVerifyLinkSuccess>
    
    
    @GET
    suspend fun userExists(@Url url1: String?    ,  @Query("q") q: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserExistsDetails>
    
    
    @POST
    suspend fun deleteUser(@Url url1: String?   ,@Body body: DeleteApplicationUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteUserSuccess>
    
    
    @GET
    suspend fun logout(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<LogoutSuccess>
    
    
    @GET
    suspend fun getUserAttributes(@Url url1: String?    ,  @Query("slug") slug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributes>
    
    
    @PATCH
    suspend fun updateUserAttributes(@Url url1: String?   ,@Body body: UpdateUserAttributes, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributes>
    
}
