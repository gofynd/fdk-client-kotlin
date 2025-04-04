package com.sdk.application.share

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ShareDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val shareApiList by lazy {
        generateshareApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getApplicationQRCode"] = "/service/application/share/v1.0/qr".substring(1)
            
                    _relativeUrls["getProductQRCodeBySlug"] = "/service/application/share/v1.0/qr/products/{slug}".substring(1)
            
                    _relativeUrls["getCollectionQRCodeBySlug"] = "/service/application/share/v1.0/qr/collection/{slug}".substring(1)
            
                    _relativeUrls["getUrlQRCode"] = "/service/application/share/v1.0/qr/url".substring(1)
            
                    _relativeUrls["createShortLink"] = "/service/application/share/v1.0/links/short-link".substring(1)
            
                    _relativeUrls["getShortLinkByHash"] = "/service/application/share/v1.0/links/short-link/{hash}".substring(1)
            
                    _relativeUrls["getOriginalShortLinkByHash"] = "/service/application/share/v1.0/links/short-link/{hash}/original".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generateshareApiList(): ShareApiList? {
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
            namespace = "ApplicationShare",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    suspend fun getApplicationQRCode( headers: Map<String, String> = emptyMap()): Response<QRCodeResp>? {
        var fullUrl : String? = _relativeUrls["getApplicationQRCode"]
        
        return shareApiList?.getApplicationQRCode(fullUrl, headers = headers)}

    
    
    suspend fun getProductQRCodeBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<QRCodeResp>? {
        var fullUrl : String? = _relativeUrls["getProductQRCodeBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return shareApiList?.getProductQRCodeBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getCollectionQRCodeBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<QRCodeResp>? {
        var fullUrl : String? = _relativeUrls["getCollectionQRCodeBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return shareApiList?.getCollectionQRCodeBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getUrlQRCode(url: String, headers: Map<String, String> = emptyMap()): Response<QRCodeResp>? {
        var fullUrl : String? = _relativeUrls["getUrlQRCode"]
        
        return shareApiList?.getUrlQRCode(fullUrl,   url = url,headers = headers)}

    
    
    suspend fun createShortLink(body: ShortLinkReq, headers: Map<String, String> = emptyMap()): Response<ShortLinkRes>? {
        var fullUrl : String? = _relativeUrls["createShortLink"]
        
        return shareApiList?.createShortLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getShortLinkByHash(hash: String, headers: Map<String, String> = emptyMap()): Response<ShortLinkRes>? {
        var fullUrl : String? = _relativeUrls["getShortLinkByHash"]
        
        fullUrl = fullUrl?.replace("{" + "hash" +"}",hash.toString())
        
        return shareApiList?.getShortLinkByHash(fullUrl,  headers = headers)}

    
    
    suspend fun getOriginalShortLinkByHash(hash: String, headers: Map<String, String> = emptyMap()): Response<ShortLinkRes>? {
        var fullUrl : String? = _relativeUrls["getOriginalShortLinkByHash"]
        
        fullUrl = fullUrl?.replace("{" + "hash" +"}",hash.toString())
        
        return shareApiList?.getOriginalShortLinkByHash(fullUrl,  headers = headers)}

    
    
}
