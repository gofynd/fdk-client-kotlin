package com.sdk.platform.theme

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




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
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun getCompanyLevelThemes(searchText: String?=null)
    : Response<ArrayList<CompanyThemeSchema>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            themeApiList?.getCompanyLevelThemes(
        companyId = config.companyId, searchText = searchText )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyLevelPrivateThemes(searchText: String?=null)
    : Response<ArrayList<CompanyThemeResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            themeApiList?.getCompanyLevelPrivateThemes(
        companyId = config.companyId, searchText = searchText )
        } else {
            null
        } 
    }
    
    
    suspend fun addMarketplaceThemeToCompany(body: CompanyThemeReqSchema)
    : Response<CompanyThemeResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            themeApiList?.addMarketplaceThemeToCompany(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteCompanyTheme(themeId: String)
    : Response<CompanyThemeResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            themeApiList?.deleteCompanyTheme(
        companyId = config.companyId, themeId = themeId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getDefaultMarketplaceTheme()
    : Response<MarketplaceTheme>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            themeApiList?.getDefaultMarketplaceTheme(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAllPages(themeId: String)
    : Response<AllAvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAllPages(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun createPage(themeId: String,body: AvailablePageSchema)
    : Response<AvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMultiplePages(themeId: String,body: AllAvailablePageSchema)
    : Response<AllAvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateMultiplePages(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPage(themeId: String, pageValue: String)
    : Response<AvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
    suspend fun updatePage(themeId: String, pageValue: String,body: AvailablePageSchema)
    : Response<AvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updatePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(themeId: String, pageValue: String)
    : Response<AvailablePageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deletePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
    suspend fun getFonts()
    : Response<FontsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getFonts(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFontsV2()
    : Response<FontsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getFontsV2(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun getApplicationThemes()
    : Response<ArrayList<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getApplicationThemes(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationThemesCount()
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getApplicationThemesCount(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeById(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeById(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun updateTheme(themeId: String,body: ThemesSchema)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteTheme(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deleteTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun updateThemeName(themeId: String,body: UpdateThemeNameRequestBody)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateThemeName(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun applyTheme(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.applyTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun duplicateTheme(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.duplicateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getAppliedTheme()
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAppliedTheme(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun addThemeToApplication(body: ThemesSchema)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.addThemeToApplication(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getThemeForPreview(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeForPreview(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeLastModified(themeId: String)
    : Response<Void>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeLastModified(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun isUpgradable(themeId: String)
    : Response<ThemeUpgradableResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.isUpgradable(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun upgradeTheme(themeId: String)
    : Response<ThemesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.upgradeTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getLatestVersionOfThemeBySlug(slugName: String)
    : Response<ArrayList<MarketplaceTheme>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getLatestVersionOfThemeBySlug(applicationId = applicationId , companyId = config.companyId , slugName = slugName )
        } else {
            null
        }
    }
    
    
}
}