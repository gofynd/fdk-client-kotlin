package com.sdk.application.apis.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.content.*

interface ContentApiList {
    
    
    @GET 
    fun getAnnouncements(@Url url1: String?   )
    : Deferred<Response<AnnouncementsResponseSchema>>
    
    
    @GET 
    fun getBlog(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Deferred<Response<BlogSchema>>
    
    
    @GET 
    fun getBlogs(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BlogGetResponse>>
    
    
    @GET 
    fun getDataLoaders(@Url url1: String?   )
    : Deferred<Response<DataLoadersSchema>>
    
    
    @GET 
    fun getFaqs(@Url url1: String?   )
    : Deferred<Response<FaqResponseSchema>>
    
    
    @GET 
    fun getFaqCategories(@Url url1: String?   )
    : Deferred<Response<GetFaqCategoriesSchema>>
    
    
    @GET 
    fun getFaqBySlug(@Url url1: String?    )
    : Deferred<Response<FaqSchema>>
    
    
    @GET 
    fun getFaqCategoryBySlug(@Url url1: String?    )
    : Deferred<Response<GetFaqCategoryBySlugSchema>>
    
    
    @GET 
    fun getFaqsByCategorySlug(@Url url1: String?    )
    : Deferred<Response<GetFaqSchema>>
    
    
    @GET 
    fun getLandingPage(@Url url1: String?   )
    : Deferred<Response<LandingPageSchema>>
    
    
    @GET 
    fun getLegalInformation(@Url url1: String?   )
    : Deferred<Response<ApplicationLegal>>
    
    
    @GET 
    fun getNavigations(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<NavigationGetResponse>>
    
    
    @GET 
    fun getSEOConfiguration(@Url url1: String?   )
    : Deferred<Response<SeoComponent>>
    
    
    @GET 
    fun getSlideshows(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SlideshowGetResponse>>
    
    
    @GET 
    fun getSlideshow(@Url url1: String?    )
    : Deferred<Response<SlideshowSchema>>
    
    
    @GET 
    fun getSupportInformation(@Url url1: String?   )
    : Deferred<Response<Support>>
    
    
    @GET 
    fun getTags(@Url url1: String?   )
    : Deferred<Response<TagsSchema>>
    
    
    @GET 
    fun getPage(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Deferred<Response<PageSchema>>
    
    
    @GET 
    fun getPages(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PageGetResponse>>
    
}