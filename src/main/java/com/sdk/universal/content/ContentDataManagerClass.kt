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
            
                    _relativeUrls["getBasicDetails"] = "/service/public/content/basic-details".substring(1)
            
                    _relativeUrls["getMenuContent"] = "/service/public/content/menu".substring(1)
            
                    _relativeUrls["getMenuContentByType"] = "/service/public/content/menu/{type}".substring(1)
            
                    _relativeUrls["getAnalyticsTags"] = "/service/public/content/analytics-tags".substring(1)
            
                    _relativeUrls["getCustomPage"] = "/service/public/content/custom-pages/{slug}".substring(1)
            
                    _relativeUrls["getFooterContent"] = "/service/public/content/footer".substring(1)
            
                    _relativeUrls["getHomePageContent"] = "/service/public/content/home-page".substring(1)
            
                    _relativeUrls["getNavbar"] = "/service/public/content/navbar".substring(1)
            
                    _relativeUrls["getPricingBanner"] = "/service/public/content/pricing-banner".substring(1)
            
                    _relativeUrls["getAllTags"] = "/service/public/content/tags".substring(1)
            
                    _relativeUrls["getCredentialsByEntity"] = "/service/public/content/credentials/{entity_type}".substring(1)
            
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
    
    suspend fun getBasicDetails( headers: Map<String, String> = emptyMap()): Response<BasicDetailsPayloadSchema>? {
        var fullUrl : String? = _relativeUrls["getBasicDetails"]
        
        return contentApiList?.getBasicDetails(fullUrl, headers = headers)}

    
    
    suspend fun getMenuContent( headers: Map<String, String> = emptyMap()): Response<MenusSchema>? {
        var fullUrl : String? = _relativeUrls["getMenuContent"]
        
        return contentApiList?.getMenuContent(fullUrl, headers = headers)}

    
    
    suspend fun getMenuContentByType(type: String, headers: Map<String, String> = emptyMap()): Response<MenuTypeSchema>? {
        var fullUrl : String? = _relativeUrls["getMenuContentByType"]
        
        fullUrl = fullUrl?.replace("{" + "type" +"}",type.toString())
        
        return contentApiList?.getMenuContentByType(fullUrl,  headers = headers)}

    
    
    suspend fun getAnalyticsTags( headers: Map<String, String> = emptyMap()): Response<AnalyticsTagsSchema>? {
        var fullUrl : String? = _relativeUrls["getAnalyticsTags"]
        
        return contentApiList?.getAnalyticsTags(fullUrl, headers = headers)}

    
    
    suspend fun getCustomPage(slug: String, headers: Map<String, String> = emptyMap()): Response<CustomPageBySlugSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomPage"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getCustomPage(fullUrl,  headers = headers)}

    
    
    suspend fun getFooterContent( headers: Map<String, String> = emptyMap()): Response<FooterSchema>? {
        var fullUrl : String? = _relativeUrls["getFooterContent"]
        
        return contentApiList?.getFooterContent(fullUrl, headers = headers)}

    
    
    suspend fun getHomePageContent(pageType: String, headers: Map<String, String> = emptyMap()): Response<HomePageContentSchema>? {
        var fullUrl : String? = _relativeUrls["getHomePageContent"]
        
        return contentApiList?.getHomePageContent(fullUrl,   pageType = pageType,headers = headers)}

    
    
    suspend fun getNavbar( headers: Map<String, String> = emptyMap()): Response<NavbarSchema>? {
        var fullUrl : String? = _relativeUrls["getNavbar"]
        
        return contentApiList?.getNavbar(fullUrl, headers = headers)}

    
    
    suspend fun getPricingBanner( headers: Map<String, String> = emptyMap()): Response<PricingBannerSchema>? {
        var fullUrl : String? = _relativeUrls["getPricingBanner"]
        
        return contentApiList?.getPricingBanner(fullUrl, headers = headers)}

    
    
    suspend fun getAllTags( headers: Map<String, String> = emptyMap()): Response<TagsSchema>? {
        var fullUrl : String? = _relativeUrls["getAllTags"]
        
        return contentApiList?.getAllTags(fullUrl, headers = headers)}

    
    
    suspend fun getCredentialsByEntity(entityType: String, headers: Map<String, String> = emptyMap()): Response<CredentialsSchema>? {
        var fullUrl : String? = _relativeUrls["getCredentialsByEntity"]
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        return contentApiList?.getCredentialsByEntity(fullUrl,  headers = headers)}

    
    
}
