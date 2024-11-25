package com.sdk.application.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface ContentApiList {
    
    
    @GET
    suspend fun getAnnouncements(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AnnouncementsResponseSchema>
    
    
    @GET
    suspend fun getBlog(@Url url1: String?     ,   @Query("root_id") rootId: String?, @Query("preview") preview: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogSchema>
    
    
    @GET
    suspend fun getBlogs(@Url url1: String?    ,     @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tags") tags: String?, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogGetDetails>
    
    
    @GET
    suspend fun getDataLoaders(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoadersSchema>
    
    
    @GET
    suspend fun getFaqs(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<FaqResponseSchema>
    
    
    @GET
    suspend fun getFaqCategories(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqCategoriesSchema>
    
    
    @GET
    suspend fun getFaqBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<FaqSchema>
    
    
    @GET
    suspend fun getFaqCategoryBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqCategoryBySlugSchema>
    
    
    @GET
    suspend fun getFaqsByCategorySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqSchema>
    
    
    @GET
    suspend fun getLandingPage(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<LandingPageSchema>
    
    
    @GET
    suspend fun getLegalInformation(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationLegal>
    
    
    @GET
    suspend fun getNavigations(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationGetDetails>
    
    
    @GET
    suspend fun getSEOConfiguration(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<SeoComponent>
    
    
    @GET
    suspend fun getSEOMarkupSchemas(@Url url1: String?    ,   @Query("page_type") pageType: String?, @Query("active") active: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SeoSchemaComponent>
    
    
    @GET
    suspend fun getSupportInformation(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<Support>
    
    
    @GET
    suspend fun getTags(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    
    @GET
    suspend fun getPage(@Url url1: String?     ,  @Query("root_id") rootId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    
    @GET
    suspend fun getPages(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageGetDetails>
    
    
    @GET
    suspend fun getCustomObjectBySlug(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectByIdSchema>
    
    
    @GET
    suspend fun getCustomFieldsByResourceId(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
}
