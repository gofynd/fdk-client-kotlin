package com.sdk.platform.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface ContentApiList {
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    suspend fun getAnnouncementsList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<GetAnnouncementListSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    suspend fun createAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AdminAnnouncementSchema)
    : Response<CreateAnnouncementSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun getAnnouncementById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Response<AdminAnnouncementSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun updateAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: AdminAnnouncementSchema)
    : Response<CreateAnnouncementSchema>
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun updateAnnouncementSchedule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: ScheduleSchema)
    : Response<CreateAnnouncementSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    suspend fun deleteAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Response<CreateAnnouncementSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    suspend fun createBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlogRequest)
    : Response<BlogSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    suspend fun getBlogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<BlogGetResponse>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    suspend fun updateBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: BlogRequest)
    : Response<BlogSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    suspend fun deleteBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<BlogSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    suspend fun getComponentById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<BlogSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    suspend fun addDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DataLoaderSchema)
    : Response<DataLoaderResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    suspend fun getDataLoaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<DataLoadersSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    suspend fun deleteDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    suspend fun editDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String,@Body body: DataLoaderSchema)
    : Response<DataLoaderResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/service/{service_name}")
    suspend fun getDataLoadersByService(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service_name") serviceName: String)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    suspend fun selectDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Response<DataLoaderResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    suspend fun resetDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service") service: String, @Path("operation_id") operationId: String)
    : Response<DataLoaderResetResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    suspend fun getFaqCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetFaqCategoriesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    suspend fun getFaqCategoryBySlugOrId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Response<GetFaqCategoryBySlugSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    suspend fun createFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateFaqCategoryRequestSchema)
    : Response<CreateFaqCategorySchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    suspend fun updateFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateFaqCategoryRequestSchema)
    : Response<CreateFaqCategorySchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    suspend fun deleteFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<FaqSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    suspend fun getFaqsByCategoryIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Response<GetFaqSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq")
    suspend fun addFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String,@Body body: CreateFaqSchema)
    : Response<CreateFaqResponseSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    suspend fun updateFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String,@Body body: CreateFaqSchema)
    : Response<CreateFaqResponseSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    suspend fun deleteFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String)
    : Response<CreateFaqResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    suspend fun getFaqByIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Response<CreateFaqResponseSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/generate-seo/{type}")
    suspend fun generateSEOTitle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: GenerateSEOContent)
    : Response<GeneratedSEOContent>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    suspend fun getLandingPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<LandingPageGetResponse>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    suspend fun createLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: LandingPageSchema)
    : Response<LandingPageSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    suspend fun updateLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: LandingPageSchema)
    : Response<LandingPageSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    suspend fun deleteLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<LandingPageSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    suspend fun getLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationLegal>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    suspend fun updateLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationLegal)
    : Response<ApplicationLegal>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    suspend fun getNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<NavigationGetResponse>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    suspend fun createNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: NavigationRequest)
    : Response<NavigationSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    suspend fun getDefaultNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<DefaultNavigationResponse>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    suspend fun getNavigationBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Response<NavigationSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    suspend fun updateNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: NavigationRequest)
    : Response<NavigationSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    suspend fun deleteNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<NavigationSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    suspend fun getPageMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<PageMetaSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    suspend fun getPageSpec(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<PageSpec>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/preview/")
    suspend fun createPagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PageRequest)
    : Response<PageSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    suspend fun updatePagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: PagePublishRequest)
    : Response<PageSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    suspend fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<PageSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    suspend fun addPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PathMappingSchema)
    : Response<PathMappingSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    suspend fun getPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Response<PathMappingSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun getPathRedirectionRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Response<PathMappingSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun updatePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String,@Body body: PathMappingSchema)
    : Response<PathMappingSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    suspend fun deletePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    suspend fun getSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<SeoComponent>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    suspend fun updateSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SeoComponent)
    : Response<SeoSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/default")
    suspend fun getDefaultSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_type") pageType: String?)
    : Response<DefaultSchemaComponent>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    suspend fun getSEOMarkupSchemas(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("title") title: String?, @Query("active") active: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<SeoSchemaComponent>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    suspend fun createSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SEOSchemaMarkupTemplateRequestBody)
    : Response<SEOSchemaMarkupTemplate>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun getSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SEOSchemaMarkupTemplate>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun editSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SEOSchemaMarkupTemplate)
    : Response<SEOSchemaMarkupTemplate>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    suspend fun deleteSEOMarkupSchema(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SEOSchemaMarkupTemplate>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows")
    suspend fun getSlideshows(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<SlideshowGetResponse>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows")
    suspend fun createSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SlideshowRequest)
    : Response<SlideshowSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    suspend fun getSlideshowBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Response<SlideshowSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    suspend fun updateSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SlideshowRequest)
    : Response<SlideshowSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    suspend fun deleteSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SlideshowSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    suspend fun getSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<Support>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    suspend fun updateSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Support)
    : Response<Support>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    suspend fun updateInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Response<TagsSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    suspend fun getInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("all") all: Boolean?)
    : Response<TagsSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    suspend fun addInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Response<TagsSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    suspend fun removeInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RemoveHandpickedSchema)
    : Response<TagDeleteSuccessResponse>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    suspend fun editInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("tag_id") tagId: String,@Body body: UpdateHandpickedSchema)
    : Response<TagsSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    suspend fun getBlogBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<BlogSchema>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    suspend fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PageRequest)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    suspend fun getPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<PageGetResponse>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    suspend fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PageSchema)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    suspend fun getPageBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<PageSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/types")
    suspend fun getCustomFieldTypes(@Path("company_id") companyId: String)
    : Response<CustomObjectByIdSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/resources")
    suspend fun getResources(@Path("company_id") companyId: String)
    : Response<ResourcesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/definitions")
    suspend fun getCustomFieldDefinitions(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("resource") resource: String?, @Query("type") type: String?, @Query("search") search: String?)
    : Response<CustomFieldDefinitionsSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/metafields/definitions")
    suspend fun createCustomFieldDefinition(@Path("company_id") companyId: String,@Body body: CustomFieldDefinitionRequestSchema)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/definitions/{definition_id}")
    suspend fun getCustomFieldDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/metafields/definitions/{definition_id}")
    suspend fun updateCustomFieldDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String,@Body body: CustomFieldDefinitionRequestSchema)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/metafields/definitions/{definition_id}")
    suspend fun deleteCustomFieldDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<CustomDataDeleteSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/{resource}")
    suspend fun getCustomFields(@Path("company_id") companyId: String, @Path("resource") resource: String)
    : Response<CustomFieldsResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/{resource}/{resource_id}")
    suspend fun getCustomFieldsByResourceId(@Path("company_id") companyId: String, @Path("resource") resource: String, @Path("resource_id") resourceId: String)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/metafields/{resource}/{resource_id}")
    suspend fun createCustomFieldByResourceId(@Path("company_id") companyId: String, @Path("resource") resource: String, @Path("resource_id") resourceId: String,@Body body: CustomFieldRequestSchema)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/metaobjects/definitions")
    suspend fun createCustomObjectDefinition(@Path("company_id") companyId: String,@Body body: CustomObjectDefinitionRequestSchema)
    : Response<CustomObjectDefinitionSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/definitions")
    suspend fun getCustomObjectDefinitions(@Path("company_id") companyId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("search") search: String?)
    : Response<CustomObjectDefinitionsSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/definitions/{definition_id}")
    suspend fun getCustomObjectDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectDefinitionSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/metaobjects/definitions/{definition_id}")
    suspend fun updateCustomObjectDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String,@Body body: CustomObjectDefinitionUpdateRequestSchema)
    : Response<CustomObjectDefinitionSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/metaobjects/definitions/{definition_id}")
    suspend fun deleteCustomObjectDefinition(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectDefinitionDeleteResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects")
    suspend fun getCustomObjects(@Path("company_id") companyId: String)
    : Response<CustomObjectsSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/metaobjects")
    suspend fun createCustomObject(@Path("company_id") companyId: String,@Body body: CustomObjectRequestSchema)
    : Response<CustomObjectSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/{metaobject_id}")
    suspend fun getCustomObject(@Path("company_id") companyId: String, @Path("metaobject_id") metaobjectId: String)
    : Response<CustomObjectByIdSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/metaobjects/{metaobject_id}")
    suspend fun deleteCustomObject(@Path("company_id") companyId: String, @Path("metaobject_id") metaobjectId: String)
    : Response<CustomDataDeleteSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/metaobjects/{metaobject_id}")
    suspend fun updateCustomObject(@Path("company_id") companyId: String, @Path("metaobject_id") metaobjectId: String,@Body body: CustomObjectRequestSchema)
    : Response<CustomObjectByIdSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/jobs")
    suspend fun getJobs(@Path("company_id") companyId: String, @Query("page") page: String, @Query("page_size") pageSize: String, @Query("action_type") actionType: String)
    : Response<CustomObjectBulkEntry>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/metaobjects/bulk/{definition_id}/upload")
    suspend fun importCustomObjectEntries(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String,@Body body: CustomObjectBulkSchema)
    : Response<CustomObjectEntryBulkUploadResponse>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/bulk/{definition_id}/download")
    suspend fun exportCustomObjectEntries(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectBulkEntryInitiateDownload>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/bulk/{definition_id}/sample")
    suspend fun sampleCustomObjectBulkEntry(@Path("company_id") companyId: String, @Path("definition_id") definitionId: String)
    : Response<String>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/types")
    suspend fun getAppCustomFieldTypes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<CustomObjectByIdSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/resources")
    suspend fun getAppResources(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ResourcesSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/definitions")
    suspend fun getAppCustomFieldDefinitions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("resource") resource: String?, @Query("type") type: String?, @Query("search") search: String?)
    : Response<CustomFieldDefinitionsSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/definitions")
    suspend fun createAppCustomFieldDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CustomFieldDefinitionRequestSchema)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/definitions/{definition_id}")
    suspend fun getAppCustomFieldDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/definitions/{definition_id}")
    suspend fun updateAppCustomFieldDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String,@Body body: CustomFieldDefinitionRequestSchema)
    : Response<CustomFieldDefinitionDetailResSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/definitions/{definition_id}")
    suspend fun deleteAppCustomFieldDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<CustomDataDeleteSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/{resource}")
    suspend fun getAppCustomFields(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String)
    : Response<CustomFieldsResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/{resource}/{resource_id}")
    suspend fun getAppCustomFieldsByResourceId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String, @Path("resource_id") resourceId: String)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/{resource}/{resource_id}")
    suspend fun createAppCustomFieldByResourceId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("resource") resource: String, @Path("resource_id") resourceId: String,@Body body: CustomFieldRequestSchema)
    : Response<CustomFieldsResponseByResourceIdSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/definitions")
    suspend fun createAppCustomObjectDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CustomObjectDefinitionRequestSchema)
    : Response<CustomObjectDefinitionSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/definitions")
    suspend fun getAppCustomObjectDefinitions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String, @Query("page_size") pageSize: String, @Query("search") search: String?)
    : Response<CustomObjectDefinitionsSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/definitions/{definition_id}")
    suspend fun getAppCustomObjectDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectDefinitionSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/definitions/{definition_id}")
    suspend fun updateAppCustomObjectDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String,@Body body: CustomObjectDefinitionUpdateRequestSchema)
    : Response<CustomObjectDefinitionSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/definitions/{definition_id}")
    suspend fun deleteAppCustomObjectDefinition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectDefinitionDeleteResponseSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects")
    suspend fun getAppCustomObjects(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<CustomObjectsSchema>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects")
    suspend fun createAppCustomObject(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CustomObjectRequestSchema)
    : Response<CustomObjectSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/{metaobject_id}")
    suspend fun getAppCustomObject(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("metaobject_id") metaobjectId: String)
    : Response<CustomObjectByIdSchema>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/{metaobject_id}")
    suspend fun deleteAppCustomObject(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("metaobject_id") metaobjectId: String)
    : Response<CustomDataDeleteSchema>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/{metaobject_id}")
    suspend fun updateAppCustomObject(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("metaobject_id") metaobjectId: String,@Body body: CustomObjectRequestSchema)
    : Response<CustomObjectByIdSchema>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/jobs")
    suspend fun getAppJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: String, @Query("page_size") pageSize: String, @Query("action_type") actionType: String)
    : Response<CustomObjectBulkEntry>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/bulk/{definition_id}/upload")
    suspend fun importAppCustomObjectEntries(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String,@Body body: CustomObjectBulkSchema)
    : Response<CustomObjectEntryBulkUploadResponse>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/bulk/{definition_id}/download")
    suspend fun exportAppCustomObjectEntries(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<CustomObjectBulkEntryInitiateDownload>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/bulk/{definition_id}/sample")
    suspend fun sampleAppCustomObjectBulkEntry(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("definition_id") definitionId: String)
    : Response<String>
    
}