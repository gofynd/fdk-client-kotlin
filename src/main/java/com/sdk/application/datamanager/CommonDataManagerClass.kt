package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import com.sdk.application.models.common.*
import com.sdk.application.apis.common.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CommonDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val commonApiList by lazy {
        generatecommonApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["searchApplication"] = "/service/common/configuration/v1.0/application/search-application".substring(1)
            
                    _relativeUrls["getLocations"] = "/service/common/configuration/v1.0/location".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatecommonApiList(): CommonApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationCommon",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CommonApiList::class.java) as? CommonApiList
    }
    
    fun searchApplication(authorization: String?=null, query: String?=null): Deferred<Response<ApplicationResponse>>? {
        var fullUrl : String? = _relativeUrls["searchApplication"] 
        
        return commonApiList?.searchApplication(fullUrl    ,  authorization = authorization,    query = query)}

    
    
    fun getLocations(locationType: String?=null, id: String?=null): Deferred<Response<Locations>>? {
        var fullUrl : String? = _relativeUrls["getLocations"] 
        
        return commonApiList?.getLocations(fullUrl    ,  locationType = locationType,    id = id)}

    
    
}
