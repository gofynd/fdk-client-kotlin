package com.sdk.application.content

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

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getAnnouncements"] = "/service/application/content/v1.0/announcements".substring(1)
            
                    _relativeUrls["getBlog"] = "/service/application/content/v1.0/blogs/{slug}".substring(1)
            
                    _relativeUrls["getBlogs"] = "/service/application/content/v1.0/blogs/".substring(1)
            
                    _relativeUrls["getDataLoaders"] = "/service/application/content/v1.0/data-loader".substring(1)
            
                    _relativeUrls["getFaqs"] = "/service/application/content/v1.0/faq".substring(1)
            
                    _relativeUrls["getFaqCategories"] = "/service/application/content/v1.0/faq/categories".substring(1)
            
                    _relativeUrls["getFaqBySlug"] = "/service/application/content/v1.0/faq/{slug}".substring(1)
            
                    _relativeUrls["getFaqCategoryBySlug"] = "/service/application/content/v1.0/faq/category/{slug}".substring(1)
            
                    _relativeUrls["getFaqsByCategorySlug"] = "/service/application/content/v1.0/faq/category/{slug}/faqs".substring(1)
            
                    _relativeUrls["getLandingPage"] = "/service/application/content/v1.0/landing-page".substring(1)
            
                    _relativeUrls["getLegalInformation"] = "/service/application/content/v1.0/legal".substring(1)
            
                    _relativeUrls["getNavigations"] = "/service/application/content/v1.0/navigations/".substring(1)
            
                    _relativeUrls["getSEOConfiguration"] = "/service/application/content/v1.0/seo".substring(1)
            
                    _relativeUrls["getSlideshows"] = "/service/application/content/v1.0/slideshow/".substring(1)
            
                    _relativeUrls["getSlideshow"] = "/service/application/content/v1.0/slideshow/{slug}".substring(1)
            
                    _relativeUrls["getSupportInformation"] = "/service/application/content/v1.0/support".substring(1)
            
                    _relativeUrls["getTags"] = "/service/application/content/v1.0/tags".substring(1)
            
                    _relativeUrls["getPage"] = "/service/application/content/v2.0/pages/{slug}".substring(1)
            
                    _relativeUrls["getPages"] = "/service/application/content/v2.0/pages/".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
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
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationContent",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    suspend fun getAnnouncements(): Response<AnnouncementsResponseSchema>? {
        var fullUrl : String? = _relativeUrls["getAnnouncements"] 
        
        return contentApiList?.getAnnouncements(fullUrl  )}

    
    
    suspend fun getBlog(slug: String, rootId: String?=null): Response<BlogSchema>? {
        var fullUrl : String? = _relativeUrls["getBlog"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getBlog(fullUrl     ,  rootId = rootId)}

    
    
    suspend fun getBlogs(pageNo: Int?=null, pageSize: Int?=null): Response<BlogGetResponse>? {
        var fullUrl : String? = _relativeUrls["getBlogs"] 
        
        return contentApiList?.getBlogs(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getBlogs"] 
                
                contentApiList?.getBlogs(fullUrl , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getDataLoaders(): Response<DataLoadersSchema>? {
        var fullUrl : String? = _relativeUrls["getDataLoaders"] 
        
        return contentApiList?.getDataLoaders(fullUrl  )}

    
    
    suspend fun getFaqs(): Response<FaqResponseSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqs"] 
        
        return contentApiList?.getFaqs(fullUrl  )}

    
    
    suspend fun getFaqCategories(): Response<GetFaqCategoriesSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqCategories"] 
        
        return contentApiList?.getFaqCategories(fullUrl  )}

    
    
    suspend fun getFaqBySlug(slug: String): Response<FaqSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqBySlug"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqBySlug(fullUrl   )}

    
    
    suspend fun getFaqCategoryBySlug(slug: String): Response<GetFaqCategoryBySlugSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqCategoryBySlug"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqCategoryBySlug(fullUrl   )}

    
    
    suspend fun getFaqsByCategorySlug(slug: String): Response<GetFaqSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqsByCategorySlug"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqsByCategorySlug(fullUrl   )}

    
    
    suspend fun getLandingPage(): Response<LandingPageSchema>? {
        var fullUrl : String? = _relativeUrls["getLandingPage"] 
        
        return contentApiList?.getLandingPage(fullUrl  )}

    
    
    suspend fun getLegalInformation(): Response<ApplicationLegal>? {
        var fullUrl : String? = _relativeUrls["getLegalInformation"] 
        
        return contentApiList?.getLegalInformation(fullUrl  )}

    
    
    suspend fun getNavigations(pageNo: Int?=null, pageSize: Int?=null): Response<NavigationGetResponse>? {
        var fullUrl : String? = _relativeUrls["getNavigations"] 
        
        return contentApiList?.getNavigations(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getNavigations"] 
                
                contentApiList?.getNavigations(fullUrl , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getSEOConfiguration(): Response<SeoComponent>? {
        var fullUrl : String? = _relativeUrls["getSEOConfiguration"] 
        
        return contentApiList?.getSEOConfiguration(fullUrl  )}

    
    
    suspend fun getSlideshows(pageNo: Int?=null, pageSize: Int?=null): Response<SlideshowGetResponse>? {
        var fullUrl : String? = _relativeUrls["getSlideshows"] 
        
        return contentApiList?.getSlideshows(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getSlideshows"] 
                
                contentApiList?.getSlideshows(fullUrl , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getSlideshow(slug: String): Response<SlideshowSchema>? {
        var fullUrl : String? = _relativeUrls["getSlideshow"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getSlideshow(fullUrl   )}

    
    
    suspend fun getSupportInformation(): Response<Support>? {
        var fullUrl : String? = _relativeUrls["getSupportInformation"] 
        
        return contentApiList?.getSupportInformation(fullUrl  )}

    
    
    suspend fun getTags(): Response<TagsSchema>? {
        var fullUrl : String? = _relativeUrls["getTags"] 
        
        return contentApiList?.getTags(fullUrl  )}

    
    
    suspend fun getPage(slug: String, rootId: String?=null): Response<PageSchema>? {
        var fullUrl : String? = _relativeUrls["getPage"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getPage(fullUrl     ,  rootId = rootId)}

    
    
    suspend fun getPages(pageNo: Int?=null, pageSize: Int?=null): Response<PageGetResponse>? {
        var fullUrl : String? = _relativeUrls["getPages"] 
        
        return contentApiList?.getPages(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getPages"] 
                
                contentApiList?.getPages(fullUrl , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
