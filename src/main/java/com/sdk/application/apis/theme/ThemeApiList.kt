package com.sdk.application.apis.theme

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.theme.*

interface ThemeApiList {
    
    
    @GET 
    suspend fun getAllPages(@Url url1: String?    )
    : Response<AllAvailablePageSchema>
    
    
    @GET 
    suspend fun getPage(@Url url1: String?     )
    : Response<AvailablePageSchema>
    
    
    @GET 
    suspend fun getAppliedTheme(@Url url1: String?   )
    : Response<ThemesSchema>
    
    
    @GET 
    suspend fun getThemeForPreview(@Url url1: String?    )
    : Response<ThemesSchema>
    
    
    @GET 
    suspend fun getAppliedThemeV2(@Url url1: String?   )
    : Response<ThemesSchema>
    
    
    @GET 
    suspend fun getThemeForPreviewV2(@Url url1: String?    )
    : Response<ThemesSchema>
    
}