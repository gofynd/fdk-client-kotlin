package com.sdk.universal.catalog

import com.sdk.common.*
import com.sdk.universal.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CatalogDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val catalogApiList by lazy {
        generatecatalogApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getTaxonomyByLevel"] = "/service/public/catalog/v1.0/taxonomy/level/{level}".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatecatalogApiList(): CatalogApiList? {
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
            namespace = "PublicCatalog",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    suspend fun getTaxonomyByLevel(level: Int,l0Slug: String?=null,l1Slug: String?=null,l2Slug: String?=null,l3Slug: String?=null,limit: Double?=null, headers: Map<String, String> = emptyMap()): Response<TaxonomyResponseSchema>? {
        var fullUrl : String? = _relativeUrls["getTaxonomyByLevel"]
        
        fullUrl = fullUrl?.replace("{" + "level" +"}",level.toString())
        
        return catalogApiList?.getTaxonomyByLevel(fullUrl,    l0Slug = l0Slug,  l1Slug = l1Slug,  l2Slug = l2Slug,  l3Slug = l3Slug,  limit = limit,headers = headers)}

    
    
}
