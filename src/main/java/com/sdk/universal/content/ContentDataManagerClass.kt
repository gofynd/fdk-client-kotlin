package com.sdk.universal.content

import com.sdk.common.*
import com.sdk.universal.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ContentDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val contentApiList by lazy {
        generatecontentApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getCredentialsByEntity"] = "/service/public/content/credentials/{entity}".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = PublicHeaderInterceptor(config)
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
            namespace = "PublicContent",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    suspend fun getCredentialsByEntity(entity: String?=null): Response<CredentialsSchema>? {
        var fullUrl : String? = _relativeUrls["getCredentialsByEntity"] 
        
        fullUrl = fullUrl?.replace("{" + "entity" +"}",entity.toString())
        
        return contentApiList?.getCredentialsByEntity(fullUrl   )}

    
    
}
