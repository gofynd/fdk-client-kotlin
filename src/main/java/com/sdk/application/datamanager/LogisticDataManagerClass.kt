package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class LogisticDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val logisticApiList by lazy {
        generatelogisticApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getTatProduct"] = "/service/application/logistics/v1.0"?.substring(1)
            
                    _relativeUrls["getPincodeCity"] = "/service/application/logistics/v1.0/pincode/{pincode}"?.substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatelogisticApiList(): LogisticApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationLogistic",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LogisticApiList::class.java) as? LogisticApiList
    }
    
    fun getTatProduct(body: GetTatProductReqBody): Deferred<Response<GetTatProductResponse>>? {
        var fullUrl : String? = _relativeUrls["getTatProduct"] 
        
        return logisticApiList?.getTatProduct(fullUrl  ,body = body)}

    
    
    fun getPincodeCity(pincode: String): Deferred<Response<GetPincodeCityResponse>>? {
        var fullUrl : String? = _relativeUrls["getPincodeCity"] 
        
        fullUrl = fullUrl?.replace("{" + "pincode" +"}",pincode.toString())
        
        return logisticApiList?.getPincodeCity(fullUrl   )}

    
    
}
