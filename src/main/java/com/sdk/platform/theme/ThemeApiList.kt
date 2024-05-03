package com.sdk.platform.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface ThemeApiList {
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun getAllPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<AllAvailablePageSchema>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AvailablePageSchema)
    : Response<AvailablePageSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun updateMultiplePages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AllAvailablePageSchema)
    : Response<AllAvailablePageSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    suspend fun getPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Response<AvailablePageSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    suspend fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String,@Body body: AvailablePageSchema)
    : Response<AvailablePageSchema>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    suspend fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Response<AvailablePageSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    suspend fun getFonts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<FontsSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    suspend fun getCompanyLevelThemes(@Path("company_id") companyId: String, @Query("search_text") searchText: String?)
    : Response<ArrayList<CompanyThemeSchema>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/private_themes")
    suspend fun getCompanyLevelPrivateThemes(@Path("company_id") companyId: String, @Query("search_text") searchText: String?)
    : Response<ArrayList<CompanyPrivateTheme>>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    suspend fun addMarketplaceThemeToCompany(@Path("company_id") companyId: String,@Body body: ThemeReq)
    : Response<CompanyThemeSchema>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    suspend fun deleteCompanyTheme(@Path("company_id") companyId: String, @Path("theme_id") themeId: String)
    : Response<CompanyThemeSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    suspend fun getApplicationThemes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<ThemesSchema>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    suspend fun getApplicationThemesCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun getThemeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun updateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeRequestBody)
    : Response<ThemesSchema>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun deleteTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/")
    suspend fun addThemeToApplication(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ThemeReq)
    : Response<ThemesSchema>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    suspend fun updateThemeName(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeNameRequestBody)
    : Response<ThemesSchema>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    suspend fun applyTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    suspend fun duplicateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    suspend fun getAppliedTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    suspend fun getThemeForPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @HEAD ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    suspend fun getThemeLastModified(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<Void>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    suspend fun isUpgradable(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemeUpgradableResponse>
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    suspend fun upgradeTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
}