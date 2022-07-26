package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ThemeDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val themeApiList by lazy {
        generatethemeApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getAllPages"] = "/service/application/theme/v1.0/{theme_id}/page"?.substring(1)
            
                    _relativeUrls["getPage"] = "/service/application/theme/v1.0/{theme_id}/{page_value}"?.substring(1)
            
                    _relativeUrls["getAppliedTheme"] = "/service/application/theme/v1.0/applied-theme"?.substring(1)
            
                    _relativeUrls["getThemeForPreview"] = "/service/application/theme/v1.0/{theme_id}/preview"?.substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatethemeApiList(): ThemeApiList? {
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
            namespace = "ApplicationTheme",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    fun getAllPages(themeId: String): Deferred<Response<AllAvailablePageSchema>>? {
        var fullUrl : String? = _relativeUrls["getAllPages"] 
        
        fullUrl = fullUrl?.replace("{" + "theme_id" +"}",themeId.toString())
        
        return themeApiList?.getAllPages(fullUrl   )}

    
    
    fun getPage(themeId: String, pageValue: String): Deferred<Response<AvailablePageSchema>>? {
        var fullUrl : String? = _relativeUrls["getPage"] 
        
        fullUrl = fullUrl?.replace("{" + "theme_id" +"}",themeId.toString())
        
        fullUrl = fullUrl?.replace("{" + "page_value" +"}",pageValue.toString())
        
        return themeApiList?.getPage(fullUrl    )}

    
    
    fun getAppliedTheme(): Deferred<Response<ThemesSchema>>? {
        var fullUrl : String? = _relativeUrls["getAppliedTheme"] 
        
        return themeApiList?.getAppliedTheme(fullUrl  )}

    
    
    fun getThemeForPreview(themeId: String): Deferred<Response<ThemesSchema>>? {
        var fullUrl : String? = _relativeUrls["getThemeForPreview"] 
        
        fullUrl = fullUrl?.replace("{" + "theme_id" +"}",themeId.toString())
        
        return themeApiList?.getThemeForPreview(fullUrl   )}

    
    
}
