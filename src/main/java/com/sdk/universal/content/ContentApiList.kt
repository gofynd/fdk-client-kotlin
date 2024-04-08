package com.sdk.universal.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*

interface ContentApiList {
    
    
    @GET 
    suspend fun getBasicDetails(@Url url1: String?   )
    : Response<BasicDetailsPayloadSchema>
    
    
    @GET 
    suspend fun getMenuContent(@Url url1: String?   )
    : Response<MenusSchema>
    
    
    @GET 
    suspend fun getMenuContentByType(@Url url1: String?    )
    : Response<MenuTypeSchema>
    
    
    @GET 
    suspend fun getAnalyticsTags(@Url url1: String?   )
    : Response<AnalyticsTagsSchema>
    
    
    @GET 
    suspend fun getCustomPage(@Url url1: String?    )
    : Response<CustomPageBySlugSchema>
    
    
    @GET 
    suspend fun getFooterContent(@Url url1: String?   )
    : Response<FooterSchema>
    
    
    @GET 
    suspend fun getHomePageContent(@Url url1: String?    ,  @Query("page_type") pageType: String)
    : Response<HomePageContentSchema>
    
    
    @GET 
    suspend fun getNavbar(@Url url1: String?   )
    : Response<NavbarSchema>
    
    
    @GET 
    suspend fun getPricingBanner(@Url url1: String?   )
    : Response<PricingBannerSchema>
    
    
    @GET 
    suspend fun getAllTags(@Url url1: String?   )
    : Response<TagsSchema>
    
    
    @GET 
    suspend fun getCredentialsByEntity(@Url url1: String?    )
    : Response<CredentialsSchema>
    
}
