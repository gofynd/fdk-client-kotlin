package com.sdk.application.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface ContentApiList {
    
    
    @GET 
    suspend fun getAnnouncements(@Url url1: String?   )
    : Response<AnnouncementsResponseSchema>
    
    
    @GET 
    suspend fun getBlog(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Response<BlogSchema>
    
    
    @GET 
    suspend fun getBlogs(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<BlogGetResponse>
    
    
    @GET 
    suspend fun getDataLoaders(@Url url1: String?   )
    : Response<DataLoadersSchema>
    
    
    @GET 
    suspend fun getFaqs(@Url url1: String?   )
    : Response<FaqResponseSchema>
    
    
    @GET 
    suspend fun getFaqCategories(@Url url1: String?   )
    : Response<GetFaqCategoriesSchema>
    
    
    @GET 
    suspend fun getFaqBySlug(@Url url1: String?    )
    : Response<FaqSchema>
    
    
    @GET 
    suspend fun getFaqCategoryBySlug(@Url url1: String?    )
    : Response<GetFaqCategoryBySlugSchema>
    
    
    @GET 
    suspend fun getFaqsByCategorySlug(@Url url1: String?    )
    : Response<GetFaqSchema>
    
    
    @GET 
    suspend fun getLandingPage(@Url url1: String?   )
    : Response<LandingPageSchema>
    
    
    @GET 
    suspend fun getLegalInformation(@Url url1: String?   )
    : Response<ApplicationLegal>
    
    
    @GET 
    suspend fun getNavigations(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<NavigationGetResponse>
    
    
    @GET 
    suspend fun getSEOConfiguration(@Url url1: String?   )
    : Response<SeoComponent>
    
    
    @GET 
    suspend fun getSlideshows(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<SlideshowGetResponse>
    
    
    @GET 
    suspend fun getSlideshow(@Url url1: String?    )
    : Response<SlideshowSchema>
    
    
    @GET 
    suspend fun getSupportInformation(@Url url1: String?   )
    : Response<Support>
    
    
    @GET 
    suspend fun getTags(@Url url1: String?   )
    : Response<TagsSchema>
    
    
    @GET 
    suspend fun getPage(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Response<PageSchema>
    
    
    @GET 
    suspend fun getPages(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<PageGetResponse>
    
}