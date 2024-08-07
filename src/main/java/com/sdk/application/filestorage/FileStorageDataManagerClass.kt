package com.sdk.application.filestorage

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class FileStorageDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val fileStorageApiList by lazy {
        generatefileStorageApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["startUpload"] = "/service/application/assets/v1.0/namespaces/{namespace}/upload/start".substring(1)
            
                    _relativeUrls["completeUpload"] = "/service/application/assets/v1.0/namespaces/{namespace}/upload/complete".substring(1)
            
                    _relativeUrls["signUrls"] = "/service/application/assets/v1.0/sign-urls".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatefileStorageApiList(): FileStorageApiList? {
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
            namespace = "ApplicationFileStorage",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as? FileStorageApiList
    }
    
    suspend fun startUpload(namespace: String,body: StartRequest, headers: Map<String, String> = emptyMap()): Response<StartResponse>? {
        var fullUrl : String? = _relativeUrls["startUpload"]
        
        fullUrl = fullUrl?.replace("{" + "namespace" +"}",namespace.toString())
        
        return fileStorageApiList?.startUpload(fullUrl,  body = body,headers = headers)}

    
    
    suspend fun completeUpload(namespace: String,body: StartResponse, headers: Map<String, String> = emptyMap()): Response<CompleteResponse>? {
        var fullUrl : String? = _relativeUrls["completeUpload"]
        
        fullUrl = fullUrl?.replace("{" + "namespace" +"}",namespace.toString())
        
        return fileStorageApiList?.completeUpload(fullUrl,  body = body,headers = headers)}

    
    
    suspend fun signUrls(body: SignUrlRequest, headers: Map<String, String> = emptyMap()): Response<SignUrlResponse>? {
        var fullUrl : String? = _relativeUrls["signUrls"]
        
        return fileStorageApiList?.signUrls(fullUrl, body = body,headers = headers)}

    
    
}
