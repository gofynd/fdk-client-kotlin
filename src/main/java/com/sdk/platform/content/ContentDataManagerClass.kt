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
    
    
    suspend fun getCustomFieldDefinitions(pageNo: String,pageSize: String,resources: String?=null,types: String?=null,search: String?=null,slugs: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldDefinitions(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,resources = resources,types = types,search = search,slugs = slugs, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomFieldDefinition(body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomFieldDefinition(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldDefinition(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomFieldDefinition(id: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomFieldDefinition(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomFieldDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomFieldDefinition(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFields(resource: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFields(
        companyId = config.companyId,resource = resource, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldsByResourceId(resource: String,resourceId: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldsByResourceId(
        companyId = config.companyId,resource = resource,resourceId = resourceId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomFieldByResourceId(resource: String,resourceId: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomFieldByResourceId(
        companyId = config.companyId,resource = resource,resourceId = resourceId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomFieldByResourceId(resource: String,resourceId: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomFieldByResourceId(
        companyId = config.companyId,resource = resource,resourceId = resourceId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomFieldsByResourceId(resource: String,resourceId: String,ids: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomFieldsByResourceId(
        companyId = config.companyId,resource = resource,resourceId = resourceId,ids = ids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomFieldJobs(page: String,pageSize: String,actionType: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldBulkEntry>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomFieldJobs(
        companyId = config.companyId,page = page,pageSize = pageSize,actionType = actionType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomObjectDefinition(body: CustomObjectDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {

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
    
    
    suspend fun getCustomObjectDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjectDefinition(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomObjectDefinition(id: String,body: CustomObjectDefinitionUpdateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomObjectDefinition(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomObjectDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionDeleteResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomObjectDefinition(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObjects(definitionId: String?=null,pageNo: String,pageSize: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObjects(
        companyId = config.companyId,definitionId = definitionId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomObject(body: CustomObjectRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.createCustomObject(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomObject(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectByIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.getCustomObject(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCustomObject(id: String,body: CustomObjectRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.updateCustomObject(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomObject(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.deleteCustomObject(
        companyId = config.companyId,id = id, headers = headers)
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
    
    
    suspend fun importCustomObjectEntries(definitionId: String,body: CustomObjectBulkSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectEntryBulkUploadResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.importCustomObjectEntries(
        companyId = config.companyId,definitionId = definitionId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportCustomObjectEntries(definitionId: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntryInitiateDownload>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.exportCustomObjectEntries(
        companyId = config.companyId,definitionId = definitionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleCustomObjectBulkEntry(definitionId: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            contentApiList?.sampleCustomObjectBulkEntry(
        companyId = config.companyId,definitionId = definitionId, headers = headers)
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
    
    
    suspend fun createBlog(body: BlogRequest, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createBlog(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogs(pageNo: Int?=null,pageSize: Int?=null,tags: String?=null,q: String?=null,slug: String?=null,title: String?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BlogGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,tags = tags,q = q,slug = slug,title = title,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateBlog(id: String,body: BlogRequest, headers: Map<String, String> = emptyMap())
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
    
    
    suspend fun getComponentById(slug: String, headers: Map<String, String> = emptyMap())
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getComponentById(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
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
    
    
    suspend fun getDataLoaderApiSpecs(dataLoader: String, headers: Map<String, String> = emptyMap())
    : Response<DataLoadersApiSpecSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDataLoaderApiSpecs(companyId = config.companyId ,applicationId = applicationId ,dataLoader = dataLoader, headers = headers)
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
    : Response<DataLoaderItemsResponseSchema>? {
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
    : Response<CreateFaqCategorySchema>? {
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
    : Response<LandingPageGetResponse>? {
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
    : Response<NavigationGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigations(companyId = config.companyId ,applicationId = applicationId ,devicePlatform = devicePlatform,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createNavigation(body: NavigationRequest, headers: Map<String, String> = emptyMap())
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createNavigation(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultNavigations( headers: Map<String, String> = emptyMap())
    : Response<DefaultNavigationResponse>? {
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
    
    
    suspend fun updateNavigation(id: String,body: NavigationRequest, headers: Map<String, String> = emptyMap())
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
    
    
    suspend fun createPagePreview(body: PageRequest, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPagePreview(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePagePreview(slug: String,body: PagePublishRequest, headers: Map<String, String> = emptyMap())
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
    : Response<CreatePathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addPathRedirectionRules(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRules(pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetAllPathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRules(companyId = config.companyId ,applicationId = applicationId ,pageSize = pageSize,pageNo = pageNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRule(pathId: String, headers: Map<String, String> = emptyMap())
    : Response<DeletPathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRule(companyId = config.companyId ,applicationId = applicationId ,pathId = pathId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePathRedirectionRules(pathId: String,body: PathMappingSchema, headers: Map<String, String> = emptyMap())
    : Response<CreatePathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePathRedirectionRules(companyId = config.companyId ,applicationId = applicationId ,pathId = pathId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deletePathRedirectionRules(pathId: String, headers: Map<String, String> = emptyMap())
    : Response<DeletPathMappingSchema>? {
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
    
    
    suspend fun getSEOMarkupSchema(schemaId: String, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,schemaId = schemaId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editSEOMarkupSchema(schemaId: String,body: SEOSchemaMarkupTemplateRequestBody, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,schemaId = schemaId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSEOMarkupSchema(schemaId: String, headers: Map<String, String> = emptyMap())
    : Response<SEOSchemaMarkupTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteSEOMarkupSchema(companyId = config.companyId ,applicationId = applicationId ,schemaId = schemaId, headers = headers)
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
    
    
    suspend fun removeInjectableTag(body: RemoveHandpickedSchema, headers: Map<String, String> = emptyMap())
    : Response<TagDeleteSuccessResponse>? {
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
    
    
    suspend fun createInjectableTag(body: CreateTagRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createInjectableTag(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    
    suspend fun deleteAllInjectableTags( headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAllInjectableTags(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInjectableTags( headers: Map<String, String> = emptyMap())
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getInjectableTags(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun createPage(body: PageRequest, headers: Map<String, String> = emptyMap())
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPage(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPages(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<PageGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPages(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPages
    **/
    fun getPagesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<PageGetResponse>{
        val paginator = Paginator<PageGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<PageGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<PageGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }

                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }

    })
    return paginator
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
    
    
    suspend fun getAppCustomFieldDefinitions(pageNo: String,pageSize: String,resources: String?=null,types: String?=null,search: String?=null,slugs: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationCustomFieldDefinitionsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldDefinitions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,resources = resources,types = types,search = search,slugs = slugs, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomFieldDefinition(body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomFieldDefinition(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomFieldDefinition(id: String,body: CustomFieldDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldDefinitionDetailResSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomFieldDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomFieldDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomFieldDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFields(resource: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFields(companyId = config.companyId ,applicationId = applicationId ,resource = resource, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldsByResourceId(resource: String,resourceId: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldsByResourceId(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceId = resourceId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomFieldByResourceId(resource: String,resourceId: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomFieldByResourceId(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceId = resourceId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomFieldByResourceId(resource: String,resourceId: String,body: CustomFieldRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsResponseByResourceIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomFieldByResourceId(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceId = resourceId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomFieldsByResourceId(resource: String,resourceId: String,ids: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldsDeleteSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomFieldsByResourceId(companyId = config.companyId ,applicationId = applicationId ,resource = resource,resourceId = resourceId,ids = ids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomFieldJobs(page: String,pageSize: String,actionType: String, headers: Map<String, String> = emptyMap())
    : Response<CustomFieldBulkEntry>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomFieldJobs(companyId = config.companyId ,applicationId = applicationId ,page = page,pageSize = pageSize,actionType = actionType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomObjectDefinition(body: CustomObjectDefinitionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {
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
    
    
    suspend fun getAppCustomObjectDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjectDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomObjectDefinition(id: String,body: CustomObjectDefinitionUpdateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomObjectDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomObjectDefinition(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectDefinitionDeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomObjectDefinition(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObjects(definitionId: String?=null,pageNo: String,pageSize: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObjects(companyId = config.companyId ,applicationId = applicationId ,definitionId = definitionId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCustomObject(body: CustomObjectRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAppCustomObject(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCustomObject(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectByIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAppCustomObject(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCustomObject(id: String,body: CustomObjectRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAppCustomObject(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCustomObject(id: String, headers: Map<String, String> = emptyMap())
    : Response<CustomDataDeleteSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAppCustomObject(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    suspend fun importAppCustomObjectEntries(definitionId: String,body: CustomObjectBulkSchema, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectEntryBulkUploadResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.importAppCustomObjectEntries(companyId = config.companyId ,applicationId = applicationId ,definitionId = definitionId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportAppCustomObjectEntries(definitionId: String, headers: Map<String, String> = emptyMap())
    : Response<CustomObjectBulkEntryInitiateDownload>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.exportAppCustomObjectEntries(companyId = config.companyId ,applicationId = applicationId ,definitionId = definitionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleAppCustomObjectBulkEntry(definitionId: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.sampleAppCustomObjectBulkEntry(companyId = config.companyId ,applicationId = applicationId ,definitionId = definitionId, headers = headers)
        } else {
            null
        }
    }
    
}
}