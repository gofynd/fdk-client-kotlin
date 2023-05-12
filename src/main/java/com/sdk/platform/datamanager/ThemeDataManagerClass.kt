package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.theme.*
import com.sdk.platform.apis.theme.*




class ThemeDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val themeApiList by lazy {
        generatethemeApiList()
    }
    
    private fun generatethemeApiList(): ThemeApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
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
            namespace = "PlatformTheme",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAllPages(themeId: String)
    : Deferred<Response<AllAvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAllPages(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun createPage(themeId: String,body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMultiplePages(themeId: String,body: AllAvailablePageSchema)
    : Deferred<Response<AllAvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateMultiplePages(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPage(themeId: String, pageValue: String)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
    suspend fun updatePage(themeId: String, pageValue: String,body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updatePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(themeId: String, pageValue: String)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deletePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeLibrary(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeLibrary(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun addToThemeLibrary(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.addToThemeLibrary(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun applyTheme(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.applyTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun isUpgradable(themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.isUpgradable(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun upgradeTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.upgradeTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getPublicThemes(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPublicThemes(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun createTheme(body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAppliedTheme(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFonts()
    : Deferred<Response<FontsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getFonts(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeById(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeById(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun updateTheme(themeId: String,body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deleteTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeForPreview(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeForPreview(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun publishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.publishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unpublishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unpublishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun archiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.archiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unarchiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unarchiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeLastModified(themeId: String)
    : Deferred<Response<Void>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeLastModified(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
}
}