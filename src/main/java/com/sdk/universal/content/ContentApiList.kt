package com.sdk.universal.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface ContentApiList {
    
    
    @GET
    suspend fun getBasicDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDetailsPayloadSchema>
    
    
    @GET
    suspend fun getMenuContent(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<MenusSchema>
    
    
    @GET
    suspend fun getMenuContentByType(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<MenuTypeSchema>
    
    
    @GET
    suspend fun getAnalyticsTags(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AnalyticsTagsSchema>
    
    
    @GET
    suspend fun getCustomPage(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomPageBySlugSchema>
    
    
    @GET
    suspend fun getFooterContent(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<FooterSchema>
    
    
    @GET
    suspend fun getHomePageContent(@Url url1: String?    ,  @Query("page_type") pageType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HomePageContentSchema>
    
    
    @GET
    suspend fun getNavbar(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<NavbarSchema>
    
    
    @GET
    suspend fun getPricingBanner(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<PricingBannerSchema>
    
    
    @GET
    suspend fun getAllTags(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    
    @GET
    suspend fun getCredentialsByEntity(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CredentialsSchema>
    
}
