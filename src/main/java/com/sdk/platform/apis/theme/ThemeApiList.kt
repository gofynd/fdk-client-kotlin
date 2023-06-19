package com.sdk.platform.apis.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.theme.*

interface ThemeApiList {
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun getAllPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllAvailablePageSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun updateMultiplePages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AllAvailablePageSchema)
    : Deferred<Response<AllAvailablePageSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun getPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Deferred<Response<AvailablePageSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String,@Body body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Deferred<Response<AvailablePageSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    fun getThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<ThemesListingResponseSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    fun addToThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/apply")
    fun applyTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    fun isUpgradable(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    fun upgradeTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    fun getPublicThemes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<ThemesListingResponseSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    fun createTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    fun getAppliedTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    fun getFonts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<FontsSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun getThemeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun updateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun deleteTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    fun getThemeForPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    fun publishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    fun unpublishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    fun archiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    fun unarchiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @HEAD ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    fun getThemeLastModified(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<Void>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    fun getCompanyLevelThemes(@Path("company_id") companyId: String)
    : Deferred<Response<ArrayList<ThemeSchema>>>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    fun addMarketplaceThemeToCompany(@Path("company_id") companyId: String,@Body body: ThemeReq)
    : Deferred<Response<ThemeSchema>>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    fun deleteCompanyTheme(@Path("company_id") companyId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemeSchema>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    fun getApplicationThemesV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ArrayList<AllThemesApplicationResponseV2>>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    fun getApplicationThemesCountV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun getApplicationThemeByIdV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun updateThemeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeRequestBodyV2)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun deleteThemeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    fun addThemeToApplicationV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplyThemeRequestV2)
    : Deferred<Response<ApplyThemeResponseV2>>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    fun updateThemeNameV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: UpdateThemeNameRequestBodyV2)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    fun applyThemeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    fun duplicateThemeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllThemesApplicationResponseV2>>
    
}