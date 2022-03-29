package com.sdk.public.datamanager

import com.sdk.common.*
import com.sdk.public.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ConfigurationDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val configurationApiList by lazy {
        generateconfigurationApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["searchApplication"] = "/service/common/configuration/v1.0/application/search-application"?.substring(1)
            
                    _relativeUrls["getLocations"] = "/service/common/configuration/v1.0/location"?.substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generateconfigurationApiList(): ConfigurationApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PublicConfiguration",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    fun searchApplication(authorization: String?=null, query: String?=null): Deferred<Response<ApplicationResponse>>? {
        var fullUrl : String? = _relativeUrls["searchApplication"] 
        
        return configurationApiList?.searchApplication(fullUrl    ,  authorization = authorization,    query = query)}

    
    
    fun getLocations(locationType: String?=null, id: String?=null): Deferred<Response<Locations>>? {
        var fullUrl : String? = _relativeUrls["getLocations"] 
        
        return configurationApiList?.getLocations(fullUrl    ,  locationType = locationType,    id = id)}

    
    
}
