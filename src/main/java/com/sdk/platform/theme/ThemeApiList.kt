package com.sdk.platform.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ThemeApiList {
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun getAllPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AllAvailablePageSchema>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AvailablePageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailablePageSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    suspend fun updateMultiplePages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AllAvailablePageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AllAvailablePageSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    suspend fun getPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailablePageSchema>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    suspend fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailablePageSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}/{socket_id}")
    suspend fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String, @Path("socket_id") socketId: String,@Body body: AvailablePageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailablePageSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    suspend fun getFonts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("capability") capability: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FontsSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    suspend fun getCompanyLevelThemes(@Path("company_id") companyId: String, @Query("search_text") searchText: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<CompanyThemeSchema>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/private_themes")
    suspend fun getCompanyLevelPrivateThemes(@Path("company_id") companyId: String, @Query("search_text") searchText: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<CompanyPrivateTheme>>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    suspend fun addMarketplaceThemeToCompany(@Path("company_id") companyId: String,@Body body: ThemeReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyThemeSchema>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    suspend fun deleteCompanyTheme(@Path("company_id") companyId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyThemeSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    suspend fun getApplicationThemes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<ThemesSchema>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    suspend fun getApplicationThemesCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun getThemeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun updateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun deleteTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/")
    suspend fun addThemeToApplication(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ThemeReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    suspend fun updateThemeName(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeNameRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    suspend fun applyTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    suspend fun duplicateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    suspend fun getAppliedTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    suspend fun getThemeForPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @HEAD ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    suspend fun getThemeLastModified(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Void>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    suspend fun isUpgradable(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemeUpgradable>
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    suspend fun upgradeTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/extension-section")
    suspend fun getExtensionSections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("type") type: String?, @Query("company_mode") companyMode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<GetExtensionSectionRes>>
    
}
