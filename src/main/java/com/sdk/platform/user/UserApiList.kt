package com.sdk.platform.user

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    suspend fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: HashMap<String,Any>?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Response<CustomerListResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    suspend fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("query") query: ArrayList<String>?)
    : Response<UserSearchResponseSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    suspend fun createUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserRequestSchema)
    : Response<CreateUserResponseSchema>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    suspend fun blockOrUnblockUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlockUserRequestSchema)
    : Response<BlockUserSuccess>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    suspend fun archiveUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ArchiveUserRequestSchema)
    : Response<ArchiveUserSuccess>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    suspend fun unDeleteUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UnDeleteUserRequestSchema)
    : Response<UnDeleteUserSuccess>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    suspend fun updateUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: UpdateUserRequestSchema)
    : Response<CreateUserResponseSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    suspend fun createUserSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserSessionRequestSchema)
    : Response<CreateUserSessionResponseSchema>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    suspend fun deleteSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @Query("session_id") sessionId: String, @Query("reason") reason: String)
    : Response<SessionDeleteResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    suspend fun getActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Response<SessionListResponseSchema>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    suspend fun deleteActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @Query("reason") reason: String)
    : Response<SessionDeleteResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    suspend fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<PlatformSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    suspend fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema)
    : Response<PlatformSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    suspend fun createUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserGroupSchema)
    : Response<UserGroupResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    suspend fun getUserGroups(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("name") name: String?, @Query("status") status: String?, @Query("group_uid") groupUid: Int?)
    : Response<UserGroupListResponseSchema>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun updateUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String,@Body body: UpdateUserGroupSchema)
    : Response<UserGroupResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun getUserGroupById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String)
    : Response<UserGroupResponseSchema>
    
    @PATCH ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun updateUserGroupPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String,@Body body: PartialUserGroupUpdateSchema)
    : Response<UserGroupResponseSchema>
    
}