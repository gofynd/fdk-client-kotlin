package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ContentDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val contentApiList by lazy {
        generatecontentApiList()
    }

    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationContent",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    fun getAnnouncements(): Deferred<Response<AnnouncementsResponseSchema>>? {
        return contentApiList?.getAnnouncements()}

    
    
    fun getBlog(slug: String, rootId: String?=null): Deferred<Response<BlogSchema>>? {
        return contentApiList?.getBlog(slug = slug, rootId = rootId)}

    
    
    fun getBlogs(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<BlogGetResponse>>? {
        return contentApiList?.getBlogs(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBlogs
    **/
    fun getBlogsPaginator(pageSize: Int?=null) : Paginator<BlogGetResponse>{

    val paginator = Paginator<BlogGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<BlogGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<BlogGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                contentApiList?.getBlogs(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
    fun getDataLoaders(): Deferred<Response<DataLoadersSchema>>? {
        return contentApiList?.getDataLoaders()}

    
    
    fun getFaqs(): Deferred<Response<FaqResponseSchema>>? {
        return contentApiList?.getFaqs()}

    
    
    fun getFaqCategories(): Deferred<Response<GetFaqCategoriesSchema>>? {
        return contentApiList?.getFaqCategories()}

    
    
    fun getFaqBySlug(slug: String): Deferred<Response<FaqSchema>>? {
        return contentApiList?.getFaqBySlug(slug = slug)}

    
    
    fun getFaqCategoryBySlug(slug: String): Deferred<Response<GetFaqCategoryBySlugSchema>>? {
        return contentApiList?.getFaqCategoryBySlug(slug = slug)}

    
    
    fun getFaqsByCategorySlug(slug: String): Deferred<Response<GetFaqSchema>>? {
        return contentApiList?.getFaqsByCategorySlug(slug = slug)}

    
    
    fun getLandingPage(): Deferred<Response<LandingPageSchema>>? {
        return contentApiList?.getLandingPage()}

    
    
    fun getLegalInformation(): Deferred<Response<ApplicationLegal>>? {
        return contentApiList?.getLegalInformation()}

    
    
    fun getNavigations(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<NavigationGetResponse>>? {
        return contentApiList?.getNavigations(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getNavigations
    **/
    fun getNavigationsPaginator(pageSize: Int?=null) : Paginator<NavigationGetResponse>{

    val paginator = Paginator<NavigationGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<NavigationGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<NavigationGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                contentApiList?.getNavigations(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
    fun getSEOConfiguration(): Deferred<Response<SeoComponent>>? {
        return contentApiList?.getSEOConfiguration()}

    
    
    fun getSlideshows(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<SlideshowGetResponse>>? {
        return contentApiList?.getSlideshows(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSlideshows
    **/
    fun getSlideshowsPaginator(pageSize: Int?=null) : Paginator<SlideshowGetResponse>{

    val paginator = Paginator<SlideshowGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<SlideshowGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<SlideshowGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                contentApiList?.getSlideshows(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
    fun getSlideshow(slug: String): Deferred<Response<SlideshowSchema>>? {
        return contentApiList?.getSlideshow(slug = slug)}

    
    
    fun getSupportInformation(): Deferred<Response<Support>>? {
        return contentApiList?.getSupportInformation()}

    
    
    fun getTags(): Deferred<Response<TagsSchema>>? {
        return contentApiList?.getTags()}

    
    
    fun getPage(slug: String, rootId: String?=null): Deferred<Response<PageSchema>>? {
        return contentApiList?.getPage(slug = slug, rootId = rootId)}

    
    
    fun getPages(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<PageGetResponse>>? {
        return contentApiList?.getPages(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPages
    **/
    fun getPagesPaginator(pageSize: Int?=null) : Paginator<PageGetResponse>{

    val paginator = Paginator<PageGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<PageGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<PageGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                contentApiList?.getPages(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
}
