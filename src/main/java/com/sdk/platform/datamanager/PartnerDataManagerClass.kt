package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class PartnerDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val partnerApiList by lazy {
        generatepartnerApiList()
    }
    
    private fun generatepartnerApiList(): PartnerApiList? {
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
            namespace = "PlatformPartner",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PartnerApiList::class.java) as? PartnerApiList
    }
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun addProxyPath(extensionId: String,body: AddProxyReq)
    : Deferred<Response<AddProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.addProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeProxyPath(extensionId: String, attachedPath: String)
    : Deferred<Response<RemoveProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.removeProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, attachedPath = attachedPath )
        } else {
            null
        }
    }
    
}
}