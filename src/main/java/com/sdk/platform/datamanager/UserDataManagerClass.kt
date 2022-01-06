package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class UserDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCustomers(q: String?=null, pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<CustomerListResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getCustomers(companyId = config.companyId , applicationId = applicationId , q = q, pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun searchUsers(q: HashMap<String,Any>?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , q = q )
        } else {
            null
        }
    }
    
    
    suspend fun createUser(body: CreateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUser(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateUser(userId: String,body: UpdateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUser(companyId = config.companyId , applicationId = applicationId , userId = userId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createUserSession(body: CreateUserSessionRequestSchema)
    : Deferred<Response<CreateUserSessionResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUserSession(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformConfig()
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getPlatformConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updatePlatformConfig(body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updatePlatformConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}