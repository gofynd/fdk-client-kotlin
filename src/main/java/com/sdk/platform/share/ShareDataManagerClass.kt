package com.sdk.platform.share

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class ShareDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val shareApiList by lazy {
        generateshareApiList()
    }

    private fun generateshareApiList(): ShareApiList? {
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
            namespace = "PlatformShare",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createShortLink(body: ShortLinkReq, headers: Map<String, String> = emptyMap())
    : Response<ShortLinkRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.createShortLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinks(pageNo: Int?=null,pageSize: Int?=null,createdBy: String?=null,active: String?=null,shortUrl: String?=null,originalUrl: String?=null,title: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ShortLinkList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinks(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,createdBy = createdBy,active = active,shortUrl = shortUrl,originalUrl = originalUrl,title = title, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinkByHash(hash: String, headers: Map<String, String> = emptyMap())
    : Response<ShortLinkRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkByHash(companyId = config.companyId ,applicationId = applicationId ,hash = hash, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShortLinkById(id: String,body: ShortLinkReq, headers: Map<String, String> = emptyMap())
    : Response<ShortLinkRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.updateShortLinkById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinkClickStats(surlId: String, headers: Map<String, String> = emptyMap())
    : Response<ClickStatsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkClickStats(surlId = surlId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
}
}