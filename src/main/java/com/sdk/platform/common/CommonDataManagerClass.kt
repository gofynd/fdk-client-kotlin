package com.sdk.platform.common

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class CommonDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val commonApiList by lazy {
        generatecommonApiList()
    }

    private fun generatecommonApiList(): CommonApiList? {
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
            namespace = "PlatformCommon",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CommonApiList::class.java) as? CommonApiList
    }
    
    
    suspend fun searchApplication(authorization: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            commonApiList?.searchApplication(
        authorization = authorization,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocations(locationType: String?=null,id: String?=null, headers: Map<String, String> = emptyMap())
    : Response<Locations>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            commonApiList?.getLocations(
        locationType = locationType,id = id, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
}
}