package com.sdk.platform.user

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class UserDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val userApiList by lazy {
        generateuserApiList()
    }

    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
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
            namespace = "PlatformUser",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCustomers(q: String?=null,pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomerListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getCustomers(companyId = config.companyId ,applicationId = applicationId ,q = q,pageSize = pageSize,pageNo = pageNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun searchUsers(q: String?=null,query: ArrayList<String>?=null, headers: Map<String, String> = emptyMap())
    : Response<UserSearchResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId ,applicationId = applicationId ,q = q,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createUser(body: CreateUserRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateUserResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUser(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun blockOrUnblockUsers(body: BlockUserRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<BlockUserSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.blockOrUnblockUsers(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun unDeleteUser(body: UnDeleteUserRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UnDeleteUserSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.unDeleteUser(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUser(userId: String,body: UpdateUserRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateUserResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUser(companyId = config.companyId ,applicationId = applicationId ,userId = userId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createUserSession(body: CreateUserSessionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateUserSessionResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUserSession(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSession(id: String,sessionId: String,reason: String, headers: Map<String, String> = emptyMap())
    : Response<SessionDeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.deleteSession(companyId = config.companyId ,applicationId = applicationId ,id = id,sessionId = sessionId,reason = reason, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getActiveSessions(id: String, headers: Map<String, String> = emptyMap())
    : Response<SessionListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getActiveSessions(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteActiveSessions(id: String,reason: String, headers: Map<String, String> = emptyMap())
    : Response<SessionsDeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.deleteActiveSessions(companyId = config.companyId ,applicationId = applicationId ,id = id,reason = reason, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun archiveUser(body: ArchiveUserRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ArchiveUserSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.archiveUser(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformConfig( headers: Map<String, String> = emptyMap())
    : Response<PlatformSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getPlatformConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePlatformConfig(body: PlatformSchema, headers: Map<String, String> = emptyMap())
    : Response<PlatformSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updatePlatformConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createUserGroup(body: CreateUserGroup, headers: Map<String, String> = emptyMap())
    : Response<UserGroupResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUserGroup(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserGroups(pageNo: String?=null,pageSize: String?=null,name: String?=null,type: String?=null,status: String?=null,groupUid: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<UserGroupListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserGroups(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,name = name,type = type,status = status,groupUid = groupUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserGroup(groupId: String,body: UpdateUserGroupSchema, headers: Map<String, String> = emptyMap())
    : Response<UserGroupResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUserGroup(companyId = config.companyId ,applicationId = applicationId ,groupId = groupId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserGroupById(groupId: String, headers: Map<String, String> = emptyMap())
    : Response<UserGroupResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserGroupById(companyId = config.companyId ,applicationId = applicationId ,groupId = groupId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserGroupPartially(groupId: String,body: PartialUserGroupUpdateSchema, headers: Map<String, String> = emptyMap())
    : Response<UserGroupResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUserGroupPartially(companyId = config.companyId ,applicationId = applicationId ,groupId = groupId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUsersByByGroupId(groupId: String, headers: Map<String, String> = emptyMap())
    : Response<CustomerListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUsersByByGroupId(companyId = config.companyId ,applicationId = applicationId ,groupId = groupId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createUserAttributeDefinition(body: CreateUserAttributeDefinition, headers: Map<String, String> = emptyMap())
    : Response<UserAttributeDefinitionResp>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUserAttributeDefinition(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAttributeDefinitions(excludingIds: String?=null,slug: String?=null,type: String?=null,customerEditable: Boolean?=null,encrypted: Boolean?=null,pinned: Boolean?=null,pinOrder: Int?=null,isLocked: Boolean?=null,name: String?=null,pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserAttributeDefinitions(excludingIds = excludingIds,slug = slug,type = type,customerEditable = customerEditable,encrypted = encrypted,pinned = pinned,pinOrder = pinOrder,isLocked = isLocked,name = name,companyId = config.companyId ,applicationId = applicationId ,pageSize = pageSize,pageNo = pageNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserAttributeDefinition(attributeDefId: String,body: CreateUserAttributeDefinition, headers: Map<String, String> = emptyMap())
    : Response<UserAttributeDefinition>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUserAttributeDefinition(attributeDefId = attributeDefId,applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteUserAttributeDefinitionById(attributeDefId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.deleteUserAttributeDefinitionById(attributeDefId = attributeDefId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAttributeDefinitionById(attributeDefId: String, headers: Map<String, String> = emptyMap())
    : Response<UserAttributeDefinition>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserAttributeDefinitionById(attributeDefId = attributeDefId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserAttribute(attributeDefId: String,userId: String,body: CreateUserAttributePayload, headers: Map<String, String> = emptyMap())
    : Response<UserAttribute>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUserAttribute(attributeDefId = attributeDefId,userId = userId,applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAttribute(attributeDefId: String,userId: String, headers: Map<String, String> = emptyMap())
    : Response<UserAttribute>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserAttribute(attributeDefId = attributeDefId,userId = userId,applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteUserAttribute(attributeDefId: String,userId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.deleteUserAttribute(attributeDefId = attributeDefId,userId = userId,applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAttributesForUser(userId: String,pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserAttributesForUser(userId = userId,applicationId = applicationId ,companyId = config.companyId ,pageSize = pageSize,pageNo = pageNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAttributeById(attributeId: String, headers: Map<String, String> = emptyMap())
    : Response<UserAttribute>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getUserAttributeById(attributeId = attributeId,applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun bulkUpdateUserAttributes(body: BulkUpdateUserAttributesBody, headers: Map<String, String> = emptyMap())
    : Response<BulkOperation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.bulkUpdateUserAttributes(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun bulkUpdatePerUserAttributes(body: BulkUpdatePerUserAttributesBody, headers: Map<String, String> = emptyMap())
    : Response<BulkOperation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.bulkUpdatePerUserAttributes(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}