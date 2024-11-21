package com.sdk.platform.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ContentApiList {
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    suspend fun getAnnouncementsList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAnnouncementListSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    suspend fun createAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AdminAnnouncementSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAnnouncementSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun getAnnouncementById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AdminAnnouncementSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun updateAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: AdminAnnouncementSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAnnouncementSchema>
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun updateAnnouncementSchedule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: ScheduleSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAnnouncementSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun deleteAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAnnouncementSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    suspend fun createBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlogPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    suspend fun getBlogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tags") tags: String?, @Query("q") q: String?, @Query("slug") slug: String?, @Query("title") title: String?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogGetDetails>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    suspend fun updateBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: BlogPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    suspend fun deleteBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    suspend fun addDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DataLoaderSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    suspend fun getDataLoaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoadersSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    suspend fun deleteDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    suspend fun editDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String,@Body body: DataLoaderSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/service/{service_name}")
    suspend fun getDataLoadersByService(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service_name") serviceName: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    suspend fun selectDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    suspend fun resetDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service") service: String, @Path("operation_id") operationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DataLoaderResetResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    suspend fun getFaqCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqCategoriesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    suspend fun getFaqCategoryBySlugOrId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqCategoryBySlugSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    suspend fun createFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateFaqCategoryRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqCategorySchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    suspend fun updateFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateFaqCategoryRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqCategorySchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    suspend fun deleteFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FaqSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    suspend fun getFaqsByCategoryIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFaqSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq")
    suspend fun addFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String,@Body body: CreateFaqSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    suspend fun updateFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String,@Body body: CreateFaqSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqResponseSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    suspend fun deleteFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    suspend fun getFaqByIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateFaqResponseSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/generate-seo/{type}")
    suspend fun generateSEOTitle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: GenerateSEOContent, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeneratedSEOContent>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    suspend fun getLandingPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LandingPageGetDetails>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    suspend fun createLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: LandingPageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LandingPageSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    suspend fun updateLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: LandingPageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LandingPageSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    suspend fun deleteLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<LandingPageSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    suspend fun getLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationLegal>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    suspend fun updateLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationLegal, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationLegal>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    suspend fun getNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationGetDetails>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    suspend fun createNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: NavigationPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    suspend fun getDefaultNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DefaultNavigationDetails>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    suspend fun getNavigationBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    suspend fun updateNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: NavigationPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    suspend fun deleteNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<NavigationSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    suspend fun getPageMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageMetaSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    suspend fun getPageSpec(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSpec>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/preview/")
    suspend fun createPagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PagePayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    suspend fun updatePagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: PagePublishPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    suspend fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    suspend fun addPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PathMappingSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PathMappingSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    suspend fun getPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PathMappingSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun getPathRedirectionRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PathMappingSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun updatePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String,@Body body: PathMappingSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PathMappingSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun deletePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    suspend fun getSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SeoComponent>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    suspend fun updateSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SeoComponent, @HeaderMap headers: Map<String, String>? = null)
    : Response<SeoSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/default")
    suspend fun getDefaultSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_type") pageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DefaultSchemaComponent>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    suspend fun getSEOMarkupSchemas(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("title") title: String?, @Query("active") active: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SeoSchemaComponent>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    suspend fun createSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SEOSchemaMarkupTemplateRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<SEOSchemaMarkupTemplate>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun getSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SEOSchemaMarkupTemplate>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun editSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SEOSchemaMarkupTemplateRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<SEOSchemaMarkupTemplate>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun deleteSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SEOSchemaMarkupTemplate>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows")
    suspend fun getSlideshows(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SlideshowGetDetails>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows")
    suspend fun createSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SlideshowPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<SlideshowSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    suspend fun getSlideshowBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SlideshowSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    suspend fun updateSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SlideshowPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<SlideshowSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    suspend fun deleteSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SlideshowSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    suspend fun getSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Support>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    suspend fun updateSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Support, @HeaderMap headers: Map<String, String>? = null)
    : Response<Support>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    suspend fun updateInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    suspend fun getInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("all") all: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    suspend fun addInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    suspend fun removeInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RemoveHandpickedSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagDeleteSuccessDetails>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    suspend fun editInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("tag_id") tagId: String,@Body body: UpdateHandpickedSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    suspend fun getBlogBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BlogSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    suspend fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PagePayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    suspend fun getPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageGetDetails>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    suspend fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PageSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    suspend fun getPageBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/types")
    suspend fun getCustomFieldTypes(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<MetafieldTypesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/resources")
    suspend fun getResources(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResourcesSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/definition")
    suspend fun getCustomFieldDefinitions(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("resources") resources: String?, @Query("types") types: String?, @Query("search") search: String?, @Query("slugs") slugs: String?, @Query("namespaces") namespaces: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/definition")
    suspend fun getCustomFieldDefinitionByResource(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Path("resource") resource: String, @Query("types") types: String?, @Query("search") search: String?, @Query("slugs") slugs: String?, @Query("namespaces") namespaces: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionsSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/definition")
    suspend fun createCustomFieldDefinition(@Path("company_id") companyId: String, @Path("resource") resource: String,@Body body: CustomFieldDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun getCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<MetaFieldDefinitionDetailResSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun updateCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String,@Body body: CustomFieldDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun deleteCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomDataDeleteSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    suspend fun getCustomFieldsByResourceSlug(@Path("company_id") companyId: String, @Path("resource") resource: String, @Path("resource_slug") resourceSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    suspend fun updateCustomFieldByResourceSlug(@Path("company_id") companyId: String, @Path("resource") resource: String, @Path("resource_slug") resourceSlug: String,@Body body: CustomFieldRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    suspend fun deleteCustomFieldsByResourceSlug(@Path("company_id") companyId: String, @Path("resource") resource: String, @Path("resource_slug") resourceSlug: String, @Query("ids") ids: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsDeleteSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition")
    suspend fun createCustomObjectDefinition(@Path("company_id") companyId: String,@Body body: CustomObjectDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition")
    suspend fun getCustomObjectDefinitions(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    suspend fun getCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    suspend fun updateCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String,@Body body: CustomObjectDefinitionUpdateRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    suspend fun deleteCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionDeleteResponseSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries")
    suspend fun getCustomObjectsBySlug(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Path("definition_slug") definitionSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectsSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries")
    suspend fun createCustomObjectBySlug(@Path("company_id") companyId: String, @Path("definition_slug") definitionSlug: String,@Body body: CustomObjectRequestSchemaWithoutId, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun getCustomObjectBySlug(@Path("company_id") companyId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBySlugSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun deleteCustomObjectBySlug(@Path("company_id") companyId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomDataDeleteSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun updateCustomObjectBySlug(@Path("company_id") companyId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String,@Body body: CustomObjectRequestSchemaWithoutId, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBySlugSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/jobs")
    suspend fun getJobs(@Path("company_id") companyId: String, @Query("page") page: String, @Query("page_size") pageSize: String, @Query("action_type") actionType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBulkEntry>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/upload")
    suspend fun importCustomObjectEntriesBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String,@Body body: CustomObjectBulkSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectEntryBulkUploadDetails>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/download")
    suspend fun exportCustomObjectEntriesBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBulkEntryInitiateDownload>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/sample")
    suspend fun sampleCustomObjectBulkEntryBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<String>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/types")
    suspend fun getAppCustomFieldTypes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<MetafieldTypesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/resources")
    suspend fun getAppResources(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResourcesSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/definition")
    suspend fun getAppCustomFieldDefinitions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("resources") resources: String?, @Query("types") types: String?, @Query("search") search: String?, @Query("slugs") slugs: String?, @Query("namespaces") namespaces: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/definition")
    suspend fun getAppCustomFieldDefinitionByResource(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Path("resource") resource: String, @Query("types") types: String?, @Query("search") search: String?, @Query("slugs") slugs: String?, @Query("namespaces") namespaces: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionsSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/definition")
    suspend fun createAppCustomFieldDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String,@Body body: CustomFieldDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun getAppCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<MetaFieldDefinitionDetailResSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun updateAppCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String,@Body body: CustomFieldDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    suspend fun deleteAppCustomFieldDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Path("resource") resource: String, @Path("namespace") namespace: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomDataDeleteSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/{resource_slug}")
    suspend fun getAppCustomFieldsByResourceSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String, @Path("resource_slug") resourceSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/{resource_slug}")
    suspend fun updateAppCustomFieldByResourceSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String, @Path("resource_slug") resourceSlug: String,@Body body: CustomFieldRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition")
    suspend fun createAppCustomObjectDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CustomObjectDefinitionRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition")
    suspend fun getAppCustomObjectDefinitions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    suspend fun getAppCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    suspend fun updateAppCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: CustomObjectDefinitionUpdateRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionSlugSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    suspend fun deleteAppCustomObjectDefinitionBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectDefinitionDeleteResponseSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries")
    suspend fun getAppCustomObjectsBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Path("definition_slug") definitionSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectsSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries")
    suspend fun createAppCustomObjectBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_slug") definitionSlug: String,@Body body: CustomObjectRequestSchemaWithoutId, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun getAppCustomObjectBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBySlugSchema>
    
    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun deleteAppCustomObjectBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomDataDeleteSchema>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    suspend fun updateAppCustomObjectBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_slug") definitionSlug: String, @Path("slug") slug: String,@Body body: CustomObjectRequestSchemaWithoutId, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBySlugSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/jobs")
    suspend fun getAppJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: String, @Query("page_size") pageSize: String, @Query("action_type") actionType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBulkEntry>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/upload")
    suspend fun importAppCustomObjectEntriesBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: CustomObjectBulkSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectEntryBulkUploadDetails>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/download")
    suspend fun exportAppCustomObjectEntriesBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomObjectBulkEntryInitiateDownload>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/sample")
    suspend fun sampleAppCustomObjectBulkEntryBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<String>
    
}
