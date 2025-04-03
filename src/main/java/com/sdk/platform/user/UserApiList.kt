package com.sdk.platform.user

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    suspend fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerListResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    suspend fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("query") query: ArrayList<String>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserSearchResponseSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    suspend fun createUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUserResponseSchema>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    suspend fun blockOrUnblockUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlockUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlockUserSuccess>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    suspend fun unDeleteUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UnDeleteUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<UnDeleteUserSuccess>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    suspend fun updateUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: UpdateUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUserResponseSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    suspend fun createUserSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserSessionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUserSessionResponseSchema>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    suspend fun deleteSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @Query("session_id") sessionId: String, @Query("reason") reason: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SessionDeleteResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    suspend fun getActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SessionListResponseSchema>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    suspend fun deleteActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @Query("reason") reason: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SessionsDeleteResponseSchema>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    suspend fun archiveUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ArchiveUserRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArchiveUserSuccess>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    suspend fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    suspend fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    suspend fun createUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserGroup, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserGroupResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    suspend fun getUserGroups(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("name") name: String?, @Query("type") type: String?, @Query("status") status: String?, @Query("group_uid") groupUid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserGroupListResponseSchema>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun updateUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String,@Body body: UpdateUserGroupSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserGroupResponseSchema>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun getUserGroupById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserGroupResponseSchema>
    
    @PATCH ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    suspend fun updateUserGroupPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String,@Body body: PartialUserGroupUpdateSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserGroupResponseSchema>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition")
    suspend fun createUserAttributeDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserAttributeDefinition, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeDefinitionResponse>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition")
    suspend fun getUserAttributeDefinitions(@Query("excluding_ids") excludingIds: String?, @Query("slug") slug: String?, @Query("type") type: String?, @Query("customer_editable") customerEditable: Boolean?, @Query("encrypted") encrypted: Boolean?, @Query("pinned") pinned: Boolean?, @Query("pin_order") pinOrder: Int?, @Query("is_locked") isLocked: Boolean?, @Query("name") name: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    suspend fun updateUserAttributeDefinition(@Path("attribute_def_id") attributeDefId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: CreateUserAttributeDefinition, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeDefinition>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    suspend fun deleteUserAttributeDefinitionById(@Path("attribute_def_id") attributeDefId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    suspend fun getUserAttributeDefinitionById(@Path("attribute_def_id") attributeDefId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeDefinition>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    suspend fun updateUserAttribute(@Path("attribute_def_id") attributeDefId: String, @Path("user_id") userId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: CreateUserAttributeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeResponse>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    suspend fun getUserAttribute(@Path("attribute_def_id") attributeDefId: String, @Path("user_id") userId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeResponse>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    suspend fun deleteUserAttribute(@Path("attribute_def_id") attributeDefId: String, @Path("user_id") userId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/user/{user_id}")
    suspend fun getUserAttributesForUser(@Path("user_id") userId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/attribute/{attribute_id}")
    suspend fun getUserAttributeById(@Path("attribute_id") attributeId: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserAttributeResponse>
    
}
