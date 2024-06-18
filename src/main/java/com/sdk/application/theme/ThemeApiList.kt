package com.sdk.application.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface ThemeApiList {
    
    
    @GET 
    suspend fun getAllPages(@Url url1: String?    )
    : Response<AllAvailablePageSchema>
    
    
    @GET 
    suspend fun getPage(@Url url1: String?      ,   @Query("filters") filters: String?, @Query("company") company: Int?)
    : Response<AvailablePageSchema>
    
    
    @GET 
    suspend fun getAppliedTheme(@Url url1: String?   )
    : Response<ThemesSchema>
    
    
    @GET 
    suspend fun getThemeForPreview(@Url url1: String?    )
    : Response<ThemesSchema>
    
}