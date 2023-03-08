package com.sdk.platform.apis.user

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.user.*

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<CustomerListResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: HashMap<String,Any>?)
    : Deferred<Response<UserSearchResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    fun createUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    fun blockOrUnblockUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlockUserRequestSchema)
    : Deferred<Response<BlockUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    fun archiveUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ArchiveUserRequestSchema)
    : Deferred<Response<ArchiveUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    fun unDeleteUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UnDeleteUserRequestSchema)
    : Deferred<Response<UnDeleteUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    fun updateUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: UpdateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    fun createUserSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserSessionRequestSchema)
    : Deferred<Response<CreateUserSessionResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sesions")
    fun getActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Deferred<Response<SessionListResponseSchema>>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sesions")
    fun deleteActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Deferred<Response<SessionDeleteResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>
    
}