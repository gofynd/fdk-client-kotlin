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
    fun getAllPages(@Url url1: String?    )
    : Deferred<Response<AllAvailablePageSchema>>
    
    
    @GET 
    fun getPage(@Url url1: String?     )
    : Deferred<Response<AvailablePageSchema>>
    
    
    @GET 
    fun getAppliedTheme(@Url url1: String?   )
    : Deferred<Response<ThemesSchema>>
    
    
    @GET 
    fun getThemeForPreview(@Url url1: String?    )
    : Deferred<Response<ThemesSchema>>
    
    
    @GET 
    fun getAppliedThemeV2(@Url url1: String?   )
    : Deferred<Response<ThemesSchema>>
    
    
    @GET 
    fun getThemeForPreviewV2(@Url url1: String?    )
    : Deferred<Response<ThemesSchema>>
    
}