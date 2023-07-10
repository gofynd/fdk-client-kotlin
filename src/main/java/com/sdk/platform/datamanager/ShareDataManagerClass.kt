package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.share.*
import com.sdk.platform.apis.share.*




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
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createShortLink(body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.createShortLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinks(pageNo: Int?=null, pageSize: Int?=null, createdBy: String?=null, active: String?=null, q: String?=null)
    : Deferred<Response<ShortLinkList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getShortLinks
    **/
    fun getShortLinksPaginator(
    pageSize: Int?=null, createdBy: String?=null, active: String?=null, q: String?=null
    
    ) : Paginator<ShortLinkList>{
        val paginator = Paginator<ShortLinkList>()
        paginator.setCallBack(object : PaginatorCallback<ShortLinkList> {
            
            override suspend fun onNext(
                onResponse: (Event<ShortLinkList>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getShortLinkByHash(hash: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkByHash(companyId = config.companyId , applicationId = applicationId , hash = hash )
        } else {
            null
        }
    }
    
    
    suspend fun updateShortLinkById(id: String,body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.updateShortLinkById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinkClickStats(surlId: String)
    : Deferred<Response<ClickStatsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkClickStats(surlId = surlId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
}
}