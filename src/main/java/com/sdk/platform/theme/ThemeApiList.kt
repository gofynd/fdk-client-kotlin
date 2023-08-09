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
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    suspend fun getThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Response<ThemesListingResponseSchema>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    suspend fun addToThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Response<ThemesSchema>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/apply")
    suspend fun applyTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    suspend fun isUpgradable(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<UpgradableThemeSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    suspend fun upgradeTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    suspend fun getPublicThemes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Response<ThemesListingResponseSchema>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    suspend fun createTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ThemesSchema)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    suspend fun getAppliedTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    suspend fun getFonts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<FontsSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun getThemeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun updateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: ThemesSchema)
    : Response<ThemesSchema>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    suspend fun deleteTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    suspend fun getThemeForPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    suspend fun publishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    suspend fun unpublishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    suspend fun archiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    suspend fun unarchiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<ThemesSchema>
    
    @HEAD ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    suspend fun getThemeLastModified(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Response<Void>
    
}