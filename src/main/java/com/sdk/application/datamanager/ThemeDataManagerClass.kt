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
        return themeApiList?.getAllPages(themeId = themeId)}

    
    
    fun getPage(themeId: String, pageValue: String): Deferred<Response<AvailablePageSchema>>? {
        return themeApiList?.getPage(themeId = themeId, pageValue = pageValue)}

    
    
    fun getAppliedTheme(): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getAppliedTheme()}

    
    
    fun getThemeForPreview(themeId: String): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getThemeForPreview(themeId = themeId)}

    
    
}
