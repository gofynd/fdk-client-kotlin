package com.sdk.platform.content

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class ContentDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val contentApiList by lazy {
        generatecontentApiList()
    }

    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformContent",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getCustomFieldTypes( headers: Map<String, String> = emptyMap())
    : Response<MetafieldTypesSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldTypes(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getResources( headers: Map<String, String> = emptyMap())
    : Response<ResourcesSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getResources(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldDefinitions(pageNo: String,pageSize: String,resources: String?=null,types: String?=null,search: String?=null,slugs: String?=null,namespaces: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldDefinitions(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,resources = resources,types = types,search = search,slugs = slugs,namespaces = namespaces, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldDefinitionByResource(pageNo: String,pageSize: String,resource: String,types: String?=null,search: String?=null,slugs: String?=null,namespaces: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldDefinitionByResource(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,resource = resource,types = types,search = search,slugs = slugs,namespaces = namespaces, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomFieldDefinition(resource: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomFieldDefinition(
        companyId = config.companyId,resource = resource, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String, headers: Map<String, String> = emptyMap())
    : Response<MetaFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldDefinitionBySlug(
        companyId = config.companyId,slug = slug,resource = resource,namespace = namespace, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomFieldDefinitionBySlug(
        companyId = config.companyId,slug = slug,resource = resource,namespace = namespace, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomFieldDefinitionBySlug(
        companyId = config.companyId,slug = slug,resource = resource,namespace = namespace, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldsByResourceSlug(resource: String,resourceSlug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldsByResourceSlug(
        companyId = config.companyId,resource = resource,resourceSlug = resourceSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomFieldByResourceSlug(resource: String,resourceSlug: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomFieldByResourceSlug(
        companyId = config.companyId,resource = resource,resourceSlug = resourceSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomFieldsByResourceSlug(resource: String,resourceSlug: String,ids: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomFieldsByResourceSlug(
        companyId = config.companyId,resource = resource,resourceSlug = resourceSlug,ids = ids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomObjectDefinition(body: CustomObjectDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomObjectDefinition(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObjectDefinitions(pageNo: String,pageSize: String,search: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjectDefinitions(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,search = search, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObjectDefinitionBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjectDefinitionBySlug(
        companyId = config.companyId,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomObjectDefinitionBySlug(slug: String,body: CustomObjectDefinitionUpdateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomObjectDefinitionBySlug(
        companyId = config.companyId,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomObjectDefinitionBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionDeleteResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomObjectDefinitionBySlug(
        companyId = config.companyId,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObjectsBySlug(pageNo: String,pageSize: String,definitionSlug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjectsBySlug(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,definitionSlug = definitionSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomObjectBySlug(definitionSlug: String,body: CustomObjectRequestSchemaWithoutId, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomObjectBySlug(
        companyId = config.companyId,definitionSlug = definitionSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObjectBySlug(definitionSlug: String,slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBySlugSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjectBySlug(
        companyId = config.companyId,definitionSlug = definitionSlug,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomObjectBySlug(definitionSlug: String,slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomObjectBySlug(
        companyId = config.companyId,definitionSlug = definitionSlug,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomObjectBySlug(definitionSlug: String,slug: String,body: CustomObjectRequestSchemaWithoutId, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBySlugSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomObjectBySlug(
        companyId = config.companyId,definitionSlug = definitionSlug,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getJobs(page: String,pageSize: String,actionType: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntry>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getJobs(
        companyId = config.companyId,page = page,pageSize = pageSize,actionType = actionType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun importCustomObjectEntriesBySlug(slug: String,body: CustomObjectBulkSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectEntryBulkUploadDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.importCustomObjectEntriesBySlug(
        companyId = config.companyId,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportCustomObjectEntriesBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntryInitiateDownload>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.exportCustomObjectEntriesBySlug(
        companyId = config.companyId,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleCustomObjectBulkEntryBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<String>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.sampleCustomObjectBulkEntryBySlug(
        companyId = config.companyId,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAnnouncementsList(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetAnnouncementListSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementsList(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAnnouncement(body: AdminAnnouncementSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAnnouncement(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAnnouncementById(announcementId: String, headers: Map<String, String> = emptyMap())
    : Response<AdminAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementById(companyId = config.companyId ,applicationId = applicationId ,announcementId = announcementId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncement(announcementId: String,body: AdminAnnouncementSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncement(companyId = config.companyId ,applicationId = applicationId ,announcementId = announcementId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncementSchedule(announcementId: String,body: ScheduleSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncementSchedule(companyId = config.companyId ,applicationId = applicationId ,announcementId = announcementId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAnnouncement(announcementId: String, headers: Map<String, String> = emptyMap())
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAnnouncement(companyId = config.companyId ,applicationId = applicationId ,announcementId = announcementId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBlog(body: BlogPayload, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createBlog(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogs(pageNo: Int?=null,pageSize: Int?=null,tags: String?=null,q: String?=null,slug: String?=null,title: String?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BlogGetDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,tags = tags,q = q,slug = slug,title = title,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateBlog(id: String,body: BlogPayload, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateBlog(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteBlog(id: String, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteBlog(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addDataLoader(body: DataLoaderSchema, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addDataLoader(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDataLoaders( headers: Map<String, String> = emptyMap())
    : Response<DataLoadersSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDataLoaders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteDataLoader(dataLoaderId: String, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteDataLoader(companyId = config.companyId ,applicationId = applicationId ,dataLoaderId = dataLoaderId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editDataLoader(dataLoaderId: String,body: DataLoaderSchema, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editDataLoader(companyId = config.companyId ,applicationId = applicationId ,dataLoaderId = dataLoaderId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDataLoadersByService(serviceName: String, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDataLoadersByService(companyId = config.companyId ,applicationId = applicationId ,serviceName = serviceName, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectDataLoader(dataLoaderId: String, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.selectDataLoader(companyId = config.companyId ,applicationId = applicationId ,dataLoaderId = dataLoaderId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun resetDataLoader(service: String,operationId: String, headers: Map<String, String> = emptyMap())
    : Response<DataLoaderResetResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.resetDataLoader(companyId = config.companyId ,applicationId = applicationId ,service = service,operationId = operationId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategories( headers: Map<String, String> = emptyMap())
    : Response<GetFaqCategoriesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategories(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategoryBySlugOrId(idOrSlug: String, headers: Map<String, String> = emptyMap())
    : Response<GetFaqCategoryBySlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategoryBySlugOrId(companyId = config.companyId ,applicationId = applicationId ,idOrSlug = idOrSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createFaqCategory(body: CreateFaqCategoryRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqCategorySchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createFaqCategory(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaqCategory(id: String,body: UpdateFaqCategoryRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqCategorySchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaqCategory(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaqCategory(id: String, headers: Map<String, String> = emptyMap())
    : Response<FaqSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaqCategory(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFaqsByCategoryIdOrSlug(idOrSlug: String, headers: Map<String, String> = emptyMap())
    : Response<GetFaqSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqsByCategoryIdOrSlug(companyId = config.companyId ,applicationId = applicationId ,idOrSlug = idOrSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addFaq(categoryId: String,body: CreateFaqSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addFaq(companyId = config.companyId ,applicationId = applicationId ,categoryId = categoryId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaq(categoryId: String,faqId: String,body: CreateFaqSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaq(companyId = config.companyId ,applicationId = applicationId ,categoryId = categoryId,faqId = faqId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaq(categoryId: String,faqId: String, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaq(companyId = config.companyId ,applicationId = applicationId ,categoryId = categoryId,faqId = faqId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFaqByIdOrSlug(idOrSlug: String, headers: Map<String, String> = emptyMap())
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqByIdOrSlug(companyId = config.companyId ,applicationId = applicationId ,idOrSlug = idOrSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generateSEOTitle(type: String,body: GenerateSEOContent, headers: Map<String, String> = emptyMap())
    : Response<GeneratedSEOContent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.generateSEOTitle(companyId = config.companyId ,applicationId = applicationId ,type = type, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLandingPages(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<LandingPageGetDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLandingPages(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createLandingPage(body: LandingPageSchema, headers: Map<String, String> = emptyMap())
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createLandingPage(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateLandingPage(id: String,body: LandingPageSchema, headers: Map<String, String> = emptyMap())
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLandingPage(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteLandingPage(id: String, headers: Map<String, String> = emptyMap())
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteLandingPage(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLegalInformation( headers: Map<String, String> = emptyMap())
    : Response<ApplicationLegal>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLegalInformation(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateLegalInformation(body: ApplicationLegal, headers: Map<String, String> = emptyMap())
    : Response<ApplicationLegal>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLegalInformation(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getNavigations(devicePlatform: String,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<NavigationGetDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigations(companyId = config.companyId ,applicationId = applicationId ,devicePlatform = devicePlatform,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createNavigation(body: NavigationPayload, headers: Map<String, String> = emptyMap())
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createNavigation(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultNavigations( headers: Map<String, String> = emptyMap())
    : Response<DefaultNavigationDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDefaultNavigations(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getNavigationBySlug(slug: String,devicePlatform: String?=null, headers: Map<String, String> = emptyMap())
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigationBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug,devicePlatform = devicePlatform, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateNavigation(id: String,body: NavigationPayload, headers: Map<String, String> = emptyMap())
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateNavigation(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteNavigation(id: String, headers: Map<String, String> = emptyMap())
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteNavigation(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPageMeta( headers: Map<String, String> = emptyMap())
    : Response<PageMetaSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageMeta(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPageSpec( headers: Map<String, String> = emptyMap())
    : Response<PageSpec>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageSpec(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePagePreview(slug: String,body: PagePublishPayload, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePagePreview(companyId = config.companyId ,applicationId = applicationId ,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(id: String, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deletePage(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addPathRedirectionRules(body: PathMappingSchema, headers: Map<String, String> = emptyMap())
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addPathRedirectionRules(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRules(pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRules(companyId = config.companyId ,applicationId = applicationId ,pageSize = pageSize,pageNo = pageNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRule(pathId: String, headers: Map<String, String> = emptyMap())
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRule(companyId = config.companyId ,applicationId = applicationId ,pathId = pathId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePathRedirectionRules(pathId: String,body: PathMappingSchema, headers: Map<String, String> = emptyMap())
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePathRedirectionRules(companyId = config.companyId ,applicationId = applicationId ,pathId = pathId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deletePathRedirectionRules(pathId: String, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deletePathRedirectionRules(companyId = config.companyId ,applicationId = applicationId ,pathId = pathId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSEOConfiguration( headers: Map<String, String> = emptyMap())
    : Response<SeoComponent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSEOConfiguration(body: SeoComponent, headers: Map<String, String> = emptyMap())
    : Response<SeoSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSEOConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultSEOMarkupSchema(pageType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<DefaultSchemaComponent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDefaultSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,pageType = pageType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSEOMarkupSchemas(title: String?=null,active: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<SeoSchemaComponent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOMarkupSchemas(companyId = config.companyId ,applicationId = applicationId ,title = title,active = active,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSEOMarkupSchema(body: SEOSchemaMarkupTemplateRequestBody, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSEOMarkupSchema(id: String, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editSEOMarkupSchema(id: String,body: SEOSchemaMarkupTemplateRequestBody, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSEOMarkupSchema(id: String, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSupportInformation( headers: Map<String, String> = emptyMap())
    : Response<Support>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSupportInformation(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSupportInformation(body: Support, headers: Map<String, String> = emptyMap())
    : Response<Support>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSupportInformation(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateInjectableTag(body: CreateTagRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateInjectableTag(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInjectableTags(all: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getInjectableTags(companyId = config.companyId ,applicationId = applicationId ,all = all, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addInjectableTag(body: CreateTagRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addInjectableTag(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeInjectableTag(body: RemoveHandpickedSchema, headers: Map<String, String> = emptyMap())
    : Response<TagDeleteSuccessDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.removeInjectableTag(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editInjectableTag(tagId: String,body: UpdateHandpickedSchema, headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editInjectableTag(companyId = config.companyId ,applicationId = applicationId ,tagId = tagId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPage(body: PagePayload, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPage(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPages(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<PageGetDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPages(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePage(id: String,body: PageSchema, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePage(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPageBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getAppCustomFieldTypes( headers: Map<String, String> = emptyMap())
    : Response<MetafieldTypesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldTypes(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppResources( headers: Map<String, String> = emptyMap())
    : Response<ResourcesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppResources(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldDefinitions(pageNo: String,pageSize: String,resources: String?=null,types: String?=null,search: String?=null,slugs: String?=null,namespaces: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldDefinitions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,resources = resources,types = types,search = search,slugs = slugs,namespaces = namespaces, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldDefinitionByResource(pageNo: String,pageSize: String,resource: String,types: String?=null,search: String?=null,slugs: String?=null,namespaces: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldDefinitionByResource(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,resource = resource,types = types,search = search,slugs = slugs,namespaces = namespaces, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomFieldDefinition(resource: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomFieldDefinition(companyId = config.companyId ,applicationId = applicationId ,resource = resource, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String, headers: Map<String, String> = emptyMap())
    : Response<MetaFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug,resource = resource,namespace = namespace, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomFieldDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug,resource = resource,namespace = namespace, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomFieldDefinitionBySlug(slug: String,resource: String,namespace: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomFieldDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug,resource = resource,namespace = namespace, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldsByResourceSlug(resource: String,resourceSlug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldsByResourceSlug(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceSlug = resourceSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomFieldByResourceSlug(resource: String,resourceSlug: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomFieldByResourceSlug(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceSlug = resourceSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomObjectDefinition(body: CustomObjectDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomObjectDefinition(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObjectDefinitions(pageNo: String,pageSize: String,search: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjectDefinitions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,search = search, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObjectDefinitionBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjectDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomObjectDefinitionBySlug(slug: String,body: CustomObjectDefinitionUpdateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomObjectDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomObjectDefinitionBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionDeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomObjectDefinitionBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObjectsBySlug(pageNo: String,pageSize: String,definitionSlug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjectsBySlug(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,definitionSlug = definitionSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomObjectBySlug(definitionSlug: String,body: CustomObjectRequestSchemaWithoutId, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomObjectBySlug(companyId = config.companyId ,applicationId = applicationId ,definitionSlug = definitionSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObjectBySlug(definitionSlug: String,slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBySlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjectBySlug(companyId = config.companyId ,applicationId = applicationId ,definitionSlug = definitionSlug,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomObjectBySlug(definitionSlug: String,slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomObjectBySlug(companyId = config.companyId ,applicationId = applicationId ,definitionSlug = definitionSlug,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomObjectBySlug(definitionSlug: String,slug: String,body: CustomObjectRequestSchemaWithoutId, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBySlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomObjectBySlug(companyId = config.companyId ,applicationId = applicationId ,definitionSlug = definitionSlug,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppJobs(page: String,pageSize: String,actionType: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntry>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppJobs(companyId = config.companyId ,applicationId = applicationId ,page = page,pageSize = pageSize,actionType = actionType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun importAppCustomObjectEntriesBySlug(slug: String,body: CustomObjectBulkSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectEntryBulkUploadDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.importAppCustomObjectEntriesBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportAppCustomObjectEntriesBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntryInitiateDownload>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.exportAppCustomObjectEntriesBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleAppCustomObjectBulkEntryBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<String>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.sampleAppCustomObjectBulkEntryBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
}
}