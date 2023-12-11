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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAnnouncementsList(pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetAnnouncementListSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementsList(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAnnouncementsList
    **/
    fun getAnnouncementsListPaginator(
    pageSize: Int?=null
    
    ) : Paginator<GetAnnouncementListSchema>{
        val paginator = Paginator<GetAnnouncementListSchema>()
        paginator.setCallBack(object : PaginatorCallback<GetAnnouncementListSchema> {
            
            override suspend fun onNext(
                onResponse: (Event<GetAnnouncementListSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getAnnouncementsList(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createAnnouncement(body: AdminAnnouncementSchema)
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAnnouncement(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAnnouncementById(announcementId: String)
    : Response<AdminAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementById(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncement(announcementId: String,body: AdminAnnouncementSchema)
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncementSchedule(announcementId: String,body: ScheduleSchema)
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncementSchedule(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAnnouncement(announcementId: String)
    : Response<CreateAnnouncementSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
        } else {
            null
        }
    }
    
    
    suspend fun createBlog(body: BlogRequest)
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createBlog(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogs(pageNo: Int?=null, pageSize: Int?=null)
    : Response<BlogGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBlogs
    **/
    fun getBlogsPaginator(
    pageSize: Int?=null
    
    ) : Paginator<BlogGetResponse>{
        val paginator = Paginator<BlogGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<BlogGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BlogGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getBlogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun updateBlog(id: String,body: BlogRequest)
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateBlog(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteBlog(id: String)
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteBlog(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentById(slug: String)
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getComponentById(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun addDataLoader(body: DataLoaderSchema)
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addDataLoader(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDataLoaders()
    : Response<DataLoadersSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDataLoaders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun deleteDataLoader(dataLoaderId: String)
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteDataLoader(companyId = config.companyId , applicationId = applicationId , dataLoaderId = dataLoaderId )
        } else {
            null
        }
    }
    
    
    suspend fun editDataLoader(dataLoaderId: String,body: DataLoaderSchema)
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editDataLoader(companyId = config.companyId , applicationId = applicationId , dataLoaderId = dataLoaderId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun selectDataLoader(dataLoaderId: String)
    : Response<DataLoaderResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.selectDataLoader(companyId = config.companyId , applicationId = applicationId , dataLoaderId = dataLoaderId )
        } else {
            null
        }
    }
    
    
    suspend fun resetDataLoader(service: String, operationId: String)
    : Response<DataLoaderResetResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.resetDataLoader(companyId = config.companyId , applicationId = applicationId , service = service, operationId = operationId )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategories()
    : Response<GetFaqCategoriesSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategories(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategoryBySlugOrId(idOrSlug: String)
    : Response<GetFaqCategoryBySlugSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategoryBySlugOrId(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun createFaqCategory(body: CreateFaqCategoryRequestSchema)
    : Response<CreateFaqCategorySchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createFaqCategory(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaqCategory(id: String,body: UpdateFaqCategoryRequestSchema)
    : Response<CreateFaqCategorySchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaqCategory(id: String)
    : Response<FaqSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqsByCategoryIdOrSlug(idOrSlug: String)
    : Response<GetFaqSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqsByCategoryIdOrSlug(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun addFaq(categoryId: String,body: CreateFaqSchema)
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaq(categoryId: String, faqId: String,body: CreateFaqSchema)
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaq(categoryId: String, faqId: String)
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqByIdOrSlug(idOrSlug: String)
    : Response<CreateFaqResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqByIdOrSlug(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun generateSEOTitle(type: String,body: GenerateSEOContent)
    : Response<GeneratedSEOContent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.generateSEOTitle(companyId = config.companyId , applicationId = applicationId , type = type, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getLandingPages(pageNo: Int?=null, pageSize: Int?=null)
    : Response<LandingPageGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLandingPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getLandingPages
    **/
    fun getLandingPagesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<LandingPageGetResponse>{
        val paginator = Paginator<LandingPageGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<LandingPageGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<LandingPageGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getLandingPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createLandingPage(body: LandingPageSchema)
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createLandingPage(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateLandingPage(id: String,body: LandingPageSchema)
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLandingPage(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteLandingPage(id: String)
    : Response<LandingPageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteLandingPage(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getLegalInformation()
    : Response<ApplicationLegal>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLegalInformation(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateLegalInformation(body: ApplicationLegal)
    : Response<ApplicationLegal>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLegalInformation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getNavigations(devicePlatform: String, pageNo: Int?=null, pageSize: Int?=null)
    : Response<NavigationGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigations(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getNavigations
    **/
    fun getNavigationsPaginator(
    devicePlatform: String, pageSize: Int?=null
    
    ) : Paginator<NavigationGetResponse>{
        val paginator = Paginator<NavigationGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<NavigationGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<NavigationGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getNavigations(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createNavigation(body: NavigationRequest)
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createNavigation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultNavigations()
    : Response<DefaultNavigationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDefaultNavigations(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getNavigationBySlug(slug: String, devicePlatform: String)
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigationBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug, devicePlatform = devicePlatform )
        } else {
            null
        }
    }
    
    
    suspend fun updateNavigation(id: String,body: NavigationRequest)
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateNavigation(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteNavigation(id: String)
    : Response<NavigationSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteNavigation(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getPageMeta()
    : Response<PageMetaSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageMeta(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getPageSpec()
    : Response<PageSpec>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageSpec(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createPagePreview(body: PageRequest)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPagePreview(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePagePreview(slug: String,body: PagePublishRequest)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePagePreview(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(id: String)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deletePage(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addPathRedirectionRules(body: PathMappingSchema)
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addPathRedirectionRules(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRules(pageSize: Int?=null, pageNo: Int?=null)
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRules(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRule(pathId: String)
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRule(companyId = config.companyId , applicationId = applicationId , pathId = pathId )
        } else {
            null
        }
    }
    
    
    suspend fun updatePathRedirectionRules(pathId: String,body: PathMappingSchema)
    : Response<PathMappingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePathRedirectionRules(companyId = config.companyId , applicationId = applicationId , pathId = pathId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePathRedirectionRules(pathId: String)
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deletePathRedirectionRules(companyId = config.companyId , applicationId = applicationId , pathId = pathId )
        } else {
            null
        }
    }
    
    
    suspend fun getSEOConfiguration()
    : Response<SeoComponent>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateSEOConfiguration(body: SeoComponent)
    : Response<SeoSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSEOConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSlideshows(devicePlatform: String, pageNo: Int?=null, pageSize: Int?=null)
    : Response<SlideshowGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSlideshows(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSlideshows
    **/
    fun getSlideshowsPaginator(
    devicePlatform: String, pageSize: Int?=null
    
    ) : Paginator<SlideshowGetResponse>{
        val paginator = Paginator<SlideshowGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<SlideshowGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<SlideshowGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getSlideshows(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createSlideshow(body: SlideshowRequest)
    : Response<SlideshowSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createSlideshow(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSlideshowBySlug(slug: String, devicePlatform: String)
    : Response<SlideshowSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSlideshowBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug, devicePlatform = devicePlatform )
        } else {
            null
        }
    }
    
    
    suspend fun updateSlideshow(id: String,body: SlideshowRequest)
    : Response<SlideshowSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSlideshow(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSlideshow(id: String)
    : Response<SlideshowSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteSlideshow(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getSupportInformation()
    : Response<Support>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSupportInformation(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateSupportInformation(body: Support)
    : Response<Support>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSupportInformation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateInjectableTag(body: CreateTagRequestSchema)
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getInjectableTags(all: Boolean?=null)
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getInjectableTags(companyId = config.companyId , applicationId = applicationId , all = all )
        } else {
            null
        }
    }
    
    
    suspend fun addInjectableTag(body: CreateTagRequestSchema)
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeInjectableTag(body: RemoveHandpickedSchema)
    : Response<TagDeleteSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.removeInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun editInjectableTag(tagId: String,body: UpdateHandpickedSchema)
    : Response<TagsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editInjectableTag(companyId = config.companyId , applicationId = applicationId , tagId = tagId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogBySlug(slug: String)
    : Response<BlogSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun createPage(body: PageRequest)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPage(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPages(pageNo: Int?=null, pageSize: Int?=null)
    : Response<PageGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
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
    
    suspend fun updatePage(id: String,body: PageSchema)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePage(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPageBySlug(slug: String)
    : Response<PageSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
}
}