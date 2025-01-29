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
            
                    _relativeUrls["getBlogs"] = "/service/application/content/v1.0/blogs".substring(1)
            
                    _relativeUrls["getDataLoaders"] = "/service/application/content/v1.0/data-loader".substring(1)
            
                    _relativeUrls["getFaqs"] = "/service/application/content/v1.0/faq".substring(1)
            
                    _relativeUrls["getFaqCategories"] = "/service/application/content/v1.0/faq/categories".substring(1)
            
                    _relativeUrls["getFaqBySlug"] = "/service/application/content/v1.0/faq/{slug}".substring(1)
            
                    _relativeUrls["getFaqCategoryBySlug"] = "/service/application/content/v1.0/faq/category/{slug}".substring(1)
            
                    _relativeUrls["getFaqsByCategorySlug"] = "/service/application/content/v1.0/faq/category/{slug}/faqs".substring(1)
            
                    _relativeUrls["getLandingPage"] = "/service/application/content/v1.0/landing-page".substring(1)
            
                    _relativeUrls["getLegalInformation"] = "/service/application/content/v1.0/legal".substring(1)
            
                    _relativeUrls["getNavigations"] = "/service/application/content/v1.0/navigations".substring(1)
            
                    _relativeUrls["getSEOConfiguration"] = "/service/application/content/v1.0/seo".substring(1)
            
                    _relativeUrls["getSEOMarkupSchemas"] = "/service/application/content/v1.0/seo/schema".substring(1)
            
                    _relativeUrls["getSupportInformation"] = "/service/application/content/v1.0/support".substring(1)
            
                    _relativeUrls["getTags"] = "/service/application/content/v1.0/tags".substring(1)
            
                    _relativeUrls["getPages"] = "/service/application/content/v2.0/pages".substring(1)
            
                    _relativeUrls["getPage"] = "/service/application/content/v2.0/pages/{slug}".substring(1)
            
                    _relativeUrls["getWellKnownUrl"] = "/service/application/content/v1.0/well-known/{slug}".substring(1)
            
                    _relativeUrls["getCustomObject"] = "/service/application/content/v1.0/metaobjects/{id}".substring(1)
            
                    _relativeUrls["getCustomObjects"] = "/service/application/content/v1.0/metaobjects".substring(1)
            
                    _relativeUrls["getCustomFieldDefinitions"] = "/service/application/content/v1.0/metafields/definitions".substring(1)
            
                    _relativeUrls["getCustomFieldDefinition"] = "/service/application/content/v1.0/metafields/definitions/{id}".substring(1)
            
                    _relativeUrls["getCustomFields"] = "/service/application/content/v1.0/metafields/{resource}".substring(1)
            
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
    
    suspend fun getAnnouncements( headers: Map<String, String> = emptyMap()): Response<AnnouncementsResponseSchema>? {
        var fullUrl : String? = _relativeUrls["getAnnouncements"]
        
        return contentApiList?.getAnnouncements(fullUrl, headers = headers)}

    
    
    suspend fun getBlog(slug: String,rootId: String?=null, headers: Map<String, String> = emptyMap()): Response<BlogSchema>? {
        var fullUrl : String? = _relativeUrls["getBlog"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getBlog(fullUrl,    rootId = rootId,headers = headers)}

    
    
    suspend fun getBlogs(pageNo: Int?=null,pageSize: Int?=null,tags: String?=null,search: String?=null, headers: Map<String, String> = emptyMap()): Response<BlogGetResponse>? {
        var fullUrl : String? = _relativeUrls["getBlogs"]
        
        return contentApiList?.getBlogs(fullUrl,   pageNo = pageNo,  pageSize = pageSize,  tags = tags,  search = search,headers = headers)}

    
    
    suspend fun getDataLoaders( headers: Map<String, String> = emptyMap()): Response<DataLoadersSchema>? {
        var fullUrl : String? = _relativeUrls["getDataLoaders"]
        
        return contentApiList?.getDataLoaders(fullUrl, headers = headers)}

    
    
    suspend fun getFaqs( headers: Map<String, String> = emptyMap()): Response<FaqResponseSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqs"]
        
        return contentApiList?.getFaqs(fullUrl, headers = headers)}

    
    
    suspend fun getFaqCategories( headers: Map<String, String> = emptyMap()): Response<GetFaqCategoriesSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqCategories"]
        
        return contentApiList?.getFaqCategories(fullUrl, headers = headers)}

    
    
    suspend fun getFaqBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<FaqSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getFaqCategoryBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<GetFaqCategoryBySlugSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqCategoryBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqCategoryBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getFaqsByCategorySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<GetFaqSchema>? {
        var fullUrl : String? = _relativeUrls["getFaqsByCategorySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getFaqsByCategorySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getLandingPage( headers: Map<String, String> = emptyMap()): Response<LandingPageSchema>? {
        var fullUrl : String? = _relativeUrls["getLandingPage"]
        
        return contentApiList?.getLandingPage(fullUrl, headers = headers)}

    
    
    suspend fun getLegalInformation( headers: Map<String, String> = emptyMap()): Response<ApplicationLegal>? {
        var fullUrl : String? = _relativeUrls["getLegalInformation"]
        
        return contentApiList?.getLegalInformation(fullUrl, headers = headers)}

    
    
    suspend fun getNavigations(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<NavigationGetResponse>? {
        var fullUrl : String? = _relativeUrls["getNavigations"]
        
        return contentApiList?.getNavigations(fullUrl,   pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getSEOConfiguration( headers: Map<String, String> = emptyMap()): Response<SeoComponent>? {
        var fullUrl : String? = _relativeUrls["getSEOConfiguration"]
        
        return contentApiList?.getSEOConfiguration(fullUrl, headers = headers)}

    
    
    suspend fun getSEOMarkupSchemas(pageType: String?=null,active: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<SeoSchemaComponent>? {
        var fullUrl : String? = _relativeUrls["getSEOMarkupSchemas"]
        
        return contentApiList?.getSEOMarkupSchemas(fullUrl,   pageType = pageType,  active = active,headers = headers)}

    
    
    suspend fun getSupportInformation( headers: Map<String, String> = emptyMap()): Response<Support>? {
        var fullUrl : String? = _relativeUrls["getSupportInformation"]
        
        return contentApiList?.getSupportInformation(fullUrl, headers = headers)}

    
    
    suspend fun getTags( headers: Map<String, String> = emptyMap()): Response<TagsSchema>? {
        var fullUrl : String? = _relativeUrls["getTags"]
        
        return contentApiList?.getTags(fullUrl, headers = headers)}

    
    
    suspend fun getPages(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<PageGetResponse>? {
        var fullUrl : String? = _relativeUrls["getPages"]
        
        return contentApiList?.getPages(fullUrl,   pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getPage(slug: String,rootId: String?=null, headers: Map<String, String> = emptyMap()): Response<PageSchema>? {
        var fullUrl : String? = _relativeUrls["getPage"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getPage(fullUrl,    rootId = rootId,headers = headers)}

    
    
    suspend fun getWellKnownUrl(slug: String, headers: Map<String, String> = emptyMap()): Response<WellKnownResponse>? {
        var fullUrl : String? = _relativeUrls["getWellKnownUrl"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getWellKnownUrl(fullUrl,  headers = headers)}

    
    
    suspend fun getCustomObject(id: String, headers: Map<String, String> = emptyMap()): Response<CustomObjectByIdSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomObject"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return contentApiList?.getCustomObject(fullUrl,  headers = headers)}

    
    
    suspend fun getCustomObjects(definitionId: String?=null,pageNo: String,pageSize: String,type: String?=null,ids: String?=null,search: String?=null, headers: Map<String, String> = emptyMap()): Response<CustomObjectsSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomObjects"]
        
        return contentApiList?.getCustomObjects(fullUrl,   definitionId = definitionId,  pageNo = pageNo,  pageSize = pageSize,  type = type,  ids = ids,  search = search,headers = headers)}

    
    
    suspend fun getCustomFieldDefinitions( headers: Map<String, String> = emptyMap()): Response<CustomFieldDefinitionsSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomFieldDefinitions"]
        
        return contentApiList?.getCustomFieldDefinitions(fullUrl, headers = headers)}

    
    
    suspend fun getCustomFieldDefinition(id: String, headers: Map<String, String> = emptyMap()): Response<CustomFieldDefinitionDetailResSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomFieldDefinition"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return contentApiList?.getCustomFieldDefinition(fullUrl,  headers = headers)}

    
    
    suspend fun getCustomFields(resource: String,resourceIds: String, headers: Map<String, String> = emptyMap()): Response<CustomFieldsResponseByResourceIdSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomFields"]
        
        fullUrl = fullUrl?.replace("{" + "resource" +"}",resource.toString())
        
        return contentApiList?.getCustomFields(fullUrl,    resourceIds = resourceIds,headers = headers)}

    
    
}
