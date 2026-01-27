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
            
                    _relativeUrls["getPage"] = "/service/application/content/v2.0/pages/{slug}".substring(1)
            
                    _relativeUrls["getPages"] = "/service/application/content/v2.0/pages".substring(1)
            
                    _relativeUrls["getCustomObjectBySlug"] = "/service/application/content/v2.0/customobjects/definition/{definition_slug}/entries/{slug}".substring(1)
            
                    _relativeUrls["getCustomFieldsByResourceId"] = "/service/application/content/v2.0/customfields/resource/{resource}/{resource_slug}".substring(1)
            
                    _relativeUrls["getBulkCustomFieldsByResource"] = "/service/application/content/v2.0/customfields/resource/{resource}".substring(1)
            
                    _relativeUrls["getTranslateUILabels"] = "/service/application/content/v1.0/translate-ui-labels".substring(1)
            
                    _relativeUrls["fetchResourceTranslations"] = "/service/application/content/v1.0/resource/translations/{type}/{locale}".substring(1)
            
                    _relativeUrls["fetchResourceTranslationsWithPayload"] = "/service/application/content/v1.0/resource/translations/{type}/{locale}".substring(1)
            
                    _relativeUrls["getSupportedLanguages"] = "/service/application/content/v1.0/languages".substring(1)
            
                    _relativeUrls["getOrderTranslation"] = "/service/application/content/v1.0/resource/translations/orders".substring(1)
            
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

    
    
    suspend fun getBlog(slug: String,rootId: String?=null,preview: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<BlogSchema>? {
        var fullUrl : String? = _relativeUrls["getBlog"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getBlog(fullUrl,    rootId = rootId,  preview = preview,headers = headers)}

    
    
    suspend fun getBlogs(pageNo: Int?=null,pageSize: Int?=null,tags: String?=null,search: String?=null, headers: Map<String, String> = emptyMap()): Response<BlogGetDetails>? {
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

    
    
    suspend fun getNavigations(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<NavigationGetDetails>? {
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

    
    
    suspend fun getPage(slug: String,rootId: String?=null, headers: Map<String, String> = emptyMap()): Response<PageSchema>? {
        var fullUrl : String? = _relativeUrls["getPage"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getPage(fullUrl,    rootId = rootId,headers = headers)}

    
    
    suspend fun getPages(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<PageGetDetails>? {
        var fullUrl : String? = _relativeUrls["getPages"]
        
        return contentApiList?.getPages(fullUrl,   pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getCustomObjectBySlug(definitionSlug: String,slug: String, headers: Map<String, String> = emptyMap()): Response<CustomObjectByIdSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomObjectBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "definition_slug" +"}",definitionSlug.toString())
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return contentApiList?.getCustomObjectBySlug(fullUrl,   headers = headers)}

    
    
    suspend fun getCustomFieldsByResourceId(resource: String,resourceSlug: String, headers: Map<String, String> = emptyMap()): Response<CustomFieldsResponseByResourceIdSchema>? {
        var fullUrl : String? = _relativeUrls["getCustomFieldsByResourceId"]
        
        fullUrl = fullUrl?.replace("{" + "resource" +"}",resource.toString())
        
        fullUrl = fullUrl?.replace("{" + "resource_slug" +"}",resourceSlug.toString())
        
        return contentApiList?.getCustomFieldsByResourceId(fullUrl,   headers = headers)}

    
    
    suspend fun getBulkCustomFieldsByResource(resource: String,resourceIds: String,keys: String?=null,namespaces: String?=null, headers: Map<String, String> = emptyMap()): Response<BulkCustomFieldsResponseByResourceSchema>? {
        var fullUrl : String? = _relativeUrls["getBulkCustomFieldsByResource"]
        
        fullUrl = fullUrl?.replace("{" + "resource" +"}",resource.toString())
        
        return contentApiList?.getBulkCustomFieldsByResource(fullUrl,    resourceIds = resourceIds,  keys = keys,  namespaces = namespaces,headers = headers)}

    
    
    suspend fun getTranslateUILabels(template: Boolean?=null,templateThemeId: String?=null,themeId: String?=null,locale: String?=null,type: String?=null, headers: Map<String, String> = emptyMap()): Response<TranslateUiLabelsPage>? {
        var fullUrl : String? = _relativeUrls["getTranslateUILabels"]
        
        return contentApiList?.getTranslateUILabels(fullUrl,   template = template,  templateThemeId = templateThemeId,  themeId = themeId,  locale = locale,  type = type,headers = headers)}

    
    
    suspend fun fetchResourceTranslations(type: String,locale: String,resourceId: String, headers: Map<String, String> = emptyMap()): Response<ResourceTranslations>? {
        var fullUrl : String? = _relativeUrls["fetchResourceTranslations"]
        
        fullUrl = fullUrl?.replace("{" + "type" +"}",type.toString())
        
        fullUrl = fullUrl?.replace("{" + "locale" +"}",locale.toString())
        
        return contentApiList?.fetchResourceTranslations(fullUrl,     resourceId = resourceId,headers = headers)}

    
    
    suspend fun fetchResourceTranslationsWithPayload(type: String,locale: String,body: ResourcePayload, headers: Map<String, String> = emptyMap()): Response<ResourceTranslations>? {
        var fullUrl : String? = _relativeUrls["fetchResourceTranslationsWithPayload"]
        
        fullUrl = fullUrl?.replace("{" + "type" +"}",type.toString())
        
        fullUrl = fullUrl?.replace("{" + "locale" +"}",locale.toString())
        
        return contentApiList?.fetchResourceTranslationsWithPayload(fullUrl,   body = body,headers = headers)}

    
    
    suspend fun getSupportedLanguages( headers: Map<String, String> = emptyMap()): Response<HashMap<String,Any>>? {
        var fullUrl : String? = _relativeUrls["getSupportedLanguages"]
        
        return contentApiList?.getSupportedLanguages(fullUrl, headers = headers)}

    
    
    suspend fun getOrderTranslation(body: OrderTranslationRequestSchema, headers: Map<String, String> = emptyMap()): Response<TranslationResult>? {
        var fullUrl : String? = _relativeUrls["getOrderTranslation"]
        
        return contentApiList?.getOrderTranslation(fullUrl, body = body,headers = headers)}

    
    
}
