package com.sdk.application.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface ThemeApiList {
    
    
    @GET
    suspend fun getAllPages(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<AllAvailablePageSchema>
    
    
    @GET
    suspend fun getPage(@Url url1: String?      ,     @Query("filters") filters: String?, @Query("section_preview_hash") sectionPreviewHash: String?, @Query("company") company: Int?, @Query("url_params") urlParams: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailablePageSchema>
    
    
    @GET
    suspend fun getAppliedTheme(@Url url1: String?    ,  @Query("filters") filters: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
    
    @GET
    suspend fun getThemeForPreview(@Url url1: String?     ,  @Query("filters") filters: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ThemesSchema>
    
}
