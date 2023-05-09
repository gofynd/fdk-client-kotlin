package com.sdk.platform.apis.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.content.*

interface ContentApiList {
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    fun getAnnouncementsList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetAnnouncementListSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    fun createAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun getAnnouncementById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Deferred<Response<AdminAnnouncementSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun updateAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun updateAnnouncementSchedule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: ScheduleSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun deleteAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    fun createBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlogRequest)
    : Deferred<Response<BlogSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    fun getBlogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BlogGetResponse>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    fun updateBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: BlogRequest)
    : Deferred<Response<BlogSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    fun deleteBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<BlogSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    fun getComponentById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<BlogSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    fun addDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DataLoaderSchema)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    fun getDataLoaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DataLoadersSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    fun deleteDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    fun editDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String,@Body body: DataLoaderSchema)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    fun selectDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    fun resetDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service") service: String, @Path("operation_id") operationId: String)
    : Deferred<Response<DataLoaderResetResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    fun getFaqCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetFaqCategoriesSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    fun getFaqCategoryBySlugOrId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<GetFaqCategoryBySlugSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    fun createFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    fun updateFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    fun deleteFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<FaqSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    fun getFaqsByCategoryIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<GetFaqSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faqs")
    fun addFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String,@Body body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    fun updateFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String,@Body body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    fun deleteFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    fun getFaqByIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/generate-seo/{type}")
    fun generateSEOTitle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: GenerateSEOContent)
    : Deferred<Response<GeneratedSEOContent>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    fun getLandingPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LandingPageGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    fun createLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    fun updateLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    fun deleteLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<LandingPageSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    fun getLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationLegal>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    fun updateLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationLegal)
    : Deferred<Response<ApplicationLegal>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    fun getNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<NavigationGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    fun createNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    fun getDefaultNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DefaultNavigationResponse>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    fun getNavigationBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Deferred<Response<NavigationSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    fun updateNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    fun deleteNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<NavigationSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    fun getPageMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PageMetaSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    fun getPageSpec(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PageSpec>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/preview/")
    fun createPagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PageRequest)
    : Deferred<Response<PageSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    fun updatePagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: PagePublishRequest)
    : Deferred<Response<PageSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<PageSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    fun addPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PathMappingSchema)
    : Deferred<Response<PathMappingSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    fun getPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<PathMappingSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun getPathRedirectionRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Deferred<Response<PathMappingSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun updatePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String,@Body body: PathMappingSchema)
    : Deferred<Response<PathMappingSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun deletePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    fun getSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<SeoComponent>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    fun updateSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SeoComponent)
    : Deferred<Response<SeoSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    fun getSlideshows(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SlideshowGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    fun createSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    fun getSlideshowBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Deferred<Response<SlideshowSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    fun updateSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    fun deleteSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SlideshowSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    fun getSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<Support>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    fun updateSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Support)
    : Deferred<Response<Support>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun updateInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun deleteAllInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TagsSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun getInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TagsSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    fun addInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    fun removeInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RemoveHandpickedSchema)
    : Deferred<Response<TagDeleteSuccessResponse>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    fun editInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("tag_id") tagId: String,@Body body: UpdateHandpickedSchema)
    : Deferred<Response<TagsSchema>>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PageRequest)
    : Deferred<Response<PageSchema>>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    fun getPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PageGetResponse>>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PageSchema)
    : Deferred<Response<PageSchema>>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    fun getPageBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<PageSchema>>
    
}