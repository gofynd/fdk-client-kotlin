package com.sdk.application.catalog

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CatalogDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val catalogApiList by lazy {
        generatecatalogApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getProductDetailBySlug"] = "/service/application/catalog/v1.0/products/{slug}/".substring(1)
            
                    _relativeUrls["getProductSizesBySlug"] = "/service/application/catalog/v1.0/products/{slug}/sizes/".substring(1)
            
                    _relativeUrls["getProductComparisonBySlugs"] = "/service/application/catalog/v1.0/products/compare/".substring(1)
            
                    _relativeUrls["getSimilarComparisonProductBySlug"] = "/service/application/catalog/v1.0/products/{slug}/similar/compare/".substring(1)
            
                    _relativeUrls["getComparedFrequentlyProductBySlug"] = "/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/".substring(1)
            
                    _relativeUrls["getProductVariantsBySlug"] = "/service/application/catalog/v1.0/products/{slug}/variants/".substring(1)
            
                    _relativeUrls["getProductStockByIds"] = "/service/application/catalog/v1.0/products/stock-status/".substring(1)
            
                    _relativeUrls["getProductStockForTimeByIds"] = "/service/application/catalog/v1.0/products/stock-status/poll/".substring(1)
            
                    _relativeUrls["getProducts"] = "/service/application/catalog/v1.0/products/".substring(1)
            
                    _relativeUrls["getBrands"] = "/service/application/catalog/v1.0/brands/".substring(1)
            
                    _relativeUrls["getBrandDetailBySlug"] = "/service/application/catalog/v1.0/brands/{slug}/".substring(1)
            
                    _relativeUrls["getCategories"] = "/service/application/catalog/v1.0/categories/".substring(1)
            
                    _relativeUrls["getCategoryDetailBySlug"] = "/service/application/catalog/v1.0/categories/{slug}/".substring(1)
            
                    _relativeUrls["getHomeProducts"] = "/service/application/catalog/v1.0/home/listing/".substring(1)
            
                    _relativeUrls["getDepartments"] = "/service/application/catalog/v1.0/departments/".substring(1)
            
                    _relativeUrls["getSearchResults"] = "/service/application/catalog/v1.0/auto-complete/".substring(1)
            
                    _relativeUrls["getCollections"] = "/service/application/catalog/v1.0/collections/".substring(1)
            
                    _relativeUrls["getCollectionItemsBySlug"] = "/service/application/catalog/v1.0/collections/{slug}/items/".substring(1)
            
                    _relativeUrls["getCollectionDetailBySlug"] = "/service/application/catalog/v1.0/collections/{slug}/".substring(1)
            
                    _relativeUrls["getFollowedListing"] = "/service/application/catalog/v1.0/follow/{collection_type}/".substring(1)
            
                    _relativeUrls["unfollowById"] = "/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/".substring(1)
            
                    _relativeUrls["followById"] = "/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/".substring(1)
            
                    _relativeUrls["getFollowerCountById"] = "/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/".substring(1)
            
                    _relativeUrls["getFollowIds"] = "/service/application/catalog/v1.0/follow/ids/".substring(1)
            
                    _relativeUrls["getStores"] = "/service/application/catalog/v1.0/locations/".substring(1)
            
                    _relativeUrls["getInStockLocations"] = "/service/application/catalog/v1.0/in-stock/locations/".substring(1)
            
                    _relativeUrls["getLocationDetailsById"] = "/service/application/catalog/v1.0/locations/{location_id}/".substring(1)
            
                    _relativeUrls["getProductBundlesBySlug"] = "/service/application/catalog/v1.0/product-grouping/".substring(1)
            
                    _relativeUrls["getProductPriceBySlug"] = "/service/application/catalog/v3.0/products/{slug}/sizes/{size}/price/".substring(1)
            
                    _relativeUrls["getProductsServiceability"] = "/service/application/catalog/v1.0/products/serviceability".substring(1)
            
                    _relativeUrls["getProductSellersBySlug"] = "/service/application/catalog/v3.0/products/{slug}/sizes/{size}/sellers/".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatecatalogApiList(): CatalogApiList? {
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
            namespace = "ApplicationCatalog",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    suspend fun getProductDetailBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<ProductDetail>? {
        var fullUrl : String? = _relativeUrls["getProductDetailBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getProductDetailBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getProductSizesBySlug(slug: String,storeId: Int?=null, headers: Map<String, String> = emptyMap()): Response<ProductSizes>? {
        var fullUrl : String? = _relativeUrls["getProductSizesBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getProductSizesBySlug(fullUrl,    storeId = storeId,headers = headers)}

    
    
    suspend fun getProductComparisonBySlugs(slug: ArrayList<String>, headers: Map<String, String> = emptyMap()): Response<ProductsComparisonResponse>? {
        var fullUrl : String? = _relativeUrls["getProductComparisonBySlugs"]
        
        return catalogApiList?.getProductComparisonBySlugs(fullUrl,   slug = slug,headers = headers)}

    
    
    suspend fun getSimilarComparisonProductBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<ProductCompareResponse>? {
        var fullUrl : String? = _relativeUrls["getSimilarComparisonProductBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getSimilarComparisonProductBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getComparedFrequentlyProductBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<ProductFrequentlyComparedSimilarResponse>? {
        var fullUrl : String? = _relativeUrls["getComparedFrequentlyProductBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getComparedFrequentlyProductBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getProductVariantsBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<ProductVariantsResponse>? {
        var fullUrl : String? = _relativeUrls["getProductVariantsBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getProductVariantsBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getProductStockByIds(itemId: String?=null,alu: String?=null,skuCode: String?=null,ean: String?=null,upc: String?=null, headers: Map<String, String> = emptyMap()): Response<ProductStockStatusResponse>? {
        var fullUrl : String? = _relativeUrls["getProductStockByIds"]
        
        return catalogApiList?.getProductStockByIds(fullUrl,   itemId = itemId,  alu = alu,  skuCode = skuCode,  ean = ean,  upc = upc,headers = headers)}

    
    
    suspend fun getProductStockForTimeByIds(timestamp: String,pageSize: Int?=null,pageId: String?=null, headers: Map<String, String> = emptyMap()): Response<ProductStockPolling>? {
        var fullUrl : String? = _relativeUrls["getProductStockForTimeByIds"]
        
        return catalogApiList?.getProductStockForTimeByIds(fullUrl,   timestamp = timestamp,  pageSize = pageSize,  pageId = pageId,headers = headers)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
    /**
    *
    * Summary: Paginator for getProductStockForTimeByIds
    **/
    fun getProductStockForTimeByIdsPaginator(timestamp: String, pageSize: Int?=null) : Paginator<ProductStockPolling>{

    val paginator = Paginator<ProductStockPolling>()

    paginator.setCallBack(object : PaginatorCallback<ProductStockPolling> {

            override suspend fun onNext(
                onResponse: (Event<ProductStockPolling>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getProductStockForTimeByIds"]
                
                catalogApiList?.getProductStockForTimeByIds(fullUrl , timestamp = timestamp, pageSize = pageSize, pageId = pageId)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
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
    
    suspend fun getProducts(q: String?=null,f: String?=null,filters: Boolean?=null,sortOn: String?=null,pageId: String?=null,pageSize: Int?=null,pageNo: Int?=null,pageType: String?=null, headers: Map<String, String> = emptyMap()): Response<ProductListingResponse>? {
        var fullUrl : String? = _relativeUrls["getProducts"]
        
        return catalogApiList?.getProducts(fullUrl,   q = q,  f = f,  filters = filters,  sortOn = sortOn,  pageId = pageId,  pageSize = pageSize,  pageNo = pageNo,  pageType = pageType,headers = headers)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
    /**
    *
    * Summary: Paginator for getProducts
    **/
    fun getProductsPaginator(q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null) : Paginator<ProductListingResponse>{

    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<ProductListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getProducts"]
                
                catalogApiList?.getProducts(fullUrl , q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
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
    
    suspend fun getBrands(department: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<BrandListingResponse>? {
        var fullUrl : String? = _relativeUrls["getBrands"]
        
        return catalogApiList?.getBrands(fullUrl,   department = department,  pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBrands
    **/
    fun getBrandsPaginator(department: String?=null, pageSize: Int?=null) : Paginator<BrandListingResponse>{

    val paginator = Paginator<BrandListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<BrandListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getBrands"]
                
                catalogApiList?.getBrands(fullUrl , department = department, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getBrandDetailBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<BrandDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getBrandDetailBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getBrandDetailBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getCategories(department: String?=null, headers: Map<String, String> = emptyMap()): Response<CategoryListingResponse>? {
        var fullUrl : String? = _relativeUrls["getCategories"]
        
        return catalogApiList?.getCategories(fullUrl,   department = department,headers = headers)}

    
    
    suspend fun getCategoryDetailBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<CategoryMetaResponse>? {
        var fullUrl : String? = _relativeUrls["getCategoryDetailBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getCategoryDetailBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getHomeProducts(sortOn: String?=null,pageId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<HomeListingResponse>? {
        var fullUrl : String? = _relativeUrls["getHomeProducts"]
        
        return catalogApiList?.getHomeProducts(fullUrl,   sortOn = sortOn,  pageId = pageId,  pageSize = pageSize,headers = headers)}

    
    
    
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getHomeProducts
    **/
    fun getHomeProductsPaginator(sortOn: String?=null, pageSize: Int?=null) : Paginator<HomeListingResponse>{

    val paginator = Paginator<HomeListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<HomeListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<HomeListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getHomeProducts"]
                
                catalogApiList?.getHomeProducts(fullUrl , sortOn = sortOn, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
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
    
    suspend fun getDepartments( headers: Map<String, String> = emptyMap()): Response<DepartmentResponse>? {
        var fullUrl : String? = _relativeUrls["getDepartments"]
        
        return catalogApiList?.getDepartments(fullUrl, headers = headers)}

    
    
    suspend fun getSearchResults(q: String, headers: Map<String, String> = emptyMap()): Response<AutoCompleteResponse>? {
        var fullUrl : String? = _relativeUrls["getSearchResults"]
        
        return catalogApiList?.getSearchResults(fullUrl,   q = q,headers = headers)}

    
    
    suspend fun getCollections(pageNo: Int?=null,pageSize: Int?=null,tag: ArrayList<String>?=null,q: String?=null, headers: Map<String, String> = emptyMap()): Response<GetCollectionListingResponse>? {
        var fullUrl : String? = _relativeUrls["getCollections"]
        
        return catalogApiList?.getCollections(fullUrl,   pageNo = pageNo,  pageSize = pageSize,  tag = tag,  q = q,headers = headers)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCollections
    **/
    fun getCollectionsPaginator(pageSize: Int?=null, tag: ArrayList<String>?=null, q: String?=null) : Paginator<GetCollectionListingResponse>{

    val paginator = Paginator<GetCollectionListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<GetCollectionListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<GetCollectionListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getCollections"]
                
                catalogApiList?.getCollections(fullUrl , pageNo = pageNo, pageSize = pageSize, tag = tag, q = q)?.safeAwait{ response, error ->
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
    
    suspend fun getCollectionItemsBySlug(slug: String,f: String?=null,q: String?=null,filters: Boolean?=null,sortOn: String?=null,pageId: String?=null,pageSize: Int?=null,pageNo: Int?=null,pageType: String?=null, headers: Map<String, String> = emptyMap()): Response<ProductListingResponse>? {
        var fullUrl : String? = _relativeUrls["getCollectionItemsBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getCollectionItemsBySlug(fullUrl,    f = f,  q = q,  filters = filters,  sortOn = sortOn,  pageId = pageId,  pageSize = pageSize,  pageNo = pageNo,  pageType = pageType,headers = headers)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
    /**
    *
    * Summary: Paginator for getCollectionItemsBySlug
    **/
    fun getCollectionItemsBySlugPaginator(slug: String, f: String?=null, q: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null) : Paginator<ProductListingResponse>{

    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<ProductListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getCollectionItemsBySlug"]
                
                fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
                
                catalogApiList?.getCollectionItemsBySlug(fullUrl , f = f, q = q, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
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
    
    suspend fun getCollectionDetailBySlug(slug: String, headers: Map<String, String> = emptyMap()): Response<CollectionDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getCollectionDetailBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return catalogApiList?.getCollectionDetailBySlug(fullUrl,  headers = headers)}

    
    
    suspend fun getFollowedListing(collectionType: String,pageId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<GetFollowListingResponse>? {
        var fullUrl : String? = _relativeUrls["getFollowedListing"]
        
        fullUrl = fullUrl?.replace("{" + "collection_type" +"}",collectionType.toString())
        
        return catalogApiList?.getFollowedListing(fullUrl,    pageId = pageId,  pageSize = pageSize,headers = headers)}

    
    
    
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getFollowedListing
    **/
    fun getFollowedListingPaginator(collectionType: String, pageSize: Int?=null) : Paginator<GetFollowListingResponse>{

    val paginator = Paginator<GetFollowListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<GetFollowListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<GetFollowListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getFollowedListing"]
                
                fullUrl = fullUrl?.replace("{" + "collection_type" +"}",collectionType.toString())
                
                catalogApiList?.getFollowedListing(fullUrl , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
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
    
    suspend fun unfollowById(collectionType: String,collectionId: String, headers: Map<String, String> = emptyMap()): Response<FollowPostResponse>? {
        var fullUrl : String? = _relativeUrls["unfollowById"]
        
        fullUrl = fullUrl?.replace("{" + "collection_type" +"}",collectionType.toString())
        
        fullUrl = fullUrl?.replace("{" + "collection_id" +"}",collectionId.toString())
        
        return catalogApiList?.unfollowById(fullUrl,   headers = headers)}

    
    
    suspend fun followById(collectionType: String,collectionId: String, headers: Map<String, String> = emptyMap()): Response<FollowPostResponse>? {
        var fullUrl : String? = _relativeUrls["followById"]
        
        fullUrl = fullUrl?.replace("{" + "collection_type" +"}",collectionType.toString())
        
        fullUrl = fullUrl?.replace("{" + "collection_id" +"}",collectionId.toString())
        
        return catalogApiList?.followById(fullUrl,   headers = headers)}

    
    
    suspend fun getFollowerCountById(collectionType: String,collectionId: String, headers: Map<String, String> = emptyMap()): Response<FollowerCountResponse>? {
        var fullUrl : String? = _relativeUrls["getFollowerCountById"]
        
        fullUrl = fullUrl?.replace("{" + "collection_type" +"}",collectionType.toString())
        
        fullUrl = fullUrl?.replace("{" + "collection_id" +"}",collectionId.toString())
        
        return catalogApiList?.getFollowerCountById(fullUrl,   headers = headers)}

    
    
    suspend fun getFollowIds(collectionType: String?=null, headers: Map<String, String> = emptyMap()): Response<FollowIdsResponse>? {
        var fullUrl : String? = _relativeUrls["getFollowIds"]
        
        return catalogApiList?.getFollowIds(fullUrl,   collectionType = collectionType,headers = headers)}

    
    
    suspend fun getStores(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,city: String?=null,range: Int?=null,latitude: Double?=null,longitude: Double?=null,tags: String?=null, headers: Map<String, String> = emptyMap()): Response<StoreListingResponse>? {
        var fullUrl : String? = _relativeUrls["getStores"]
        
        return catalogApiList?.getStores(fullUrl,   pageNo = pageNo,  pageSize = pageSize,  q = q,  city = city,  range = range,  latitude = latitude,  longitude = longitude,  tags = tags,headers = headers)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStores
    **/
    fun getStoresPaginator(pageSize: Int?=null, q: String?=null, city: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null, tags: String?=null) : Paginator<StoreListingResponse>{

    val paginator = Paginator<StoreListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<StoreListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<StoreListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getStores"]
                
                catalogApiList?.getStores(fullUrl , pageNo = pageNo, pageSize = pageSize, q = q, city = city, range = range, latitude = latitude, longitude = longitude, tags = tags)?.safeAwait{ response, error ->
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
    
    suspend fun getInStockLocations(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,city: String?=null,range: Int?=null,latitude: Double?=null,longitude: Double?=null, headers: Map<String, String> = emptyMap()): Response<ApplicationStoreListing>? {
        var fullUrl : String? = _relativeUrls["getInStockLocations"]
        
        return catalogApiList?.getInStockLocations(fullUrl,   pageNo = pageNo,  pageSize = pageSize,  q = q,  city = city,  range = range,  latitude = latitude,  longitude = longitude,headers = headers)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getInStockLocations
    **/
    fun getInStockLocationsPaginator(pageSize: Int?=null, q: String?=null, city: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null) : Paginator<ApplicationStoreListing>{

    val paginator = Paginator<ApplicationStoreListing>()

    paginator.setCallBack(object : PaginatorCallback<ApplicationStoreListing> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationStoreListing>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getInStockLocations"]
                
                catalogApiList?.getInStockLocations(fullUrl , pageNo = pageNo, pageSize = pageSize, q = q, city = city, range = range, latitude = latitude, longitude = longitude)?.safeAwait{ response, error ->
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
    
    suspend fun getLocationDetailsById(locationId: Int, headers: Map<String, String> = emptyMap()): Response<StoreDetails>? {
        var fullUrl : String? = _relativeUrls["getLocationDetailsById"]
        
        fullUrl = fullUrl?.replace("{" + "location_id" +"}",locationId.toString())
        
        return catalogApiList?.getLocationDetailsById(fullUrl,  headers = headers)}

    
    
    suspend fun getProductBundlesBySlug(slug: String?=null,id: String?=null, headers: Map<String, String> = emptyMap()): Response<ProductBundle>? {
        var fullUrl : String? = _relativeUrls["getProductBundlesBySlug"]
        
        return catalogApiList?.getProductBundlesBySlug(fullUrl,   slug = slug,  id = id,headers = headers)}

    
    
    suspend fun getProductPriceBySlug(slug: String,size: String,storeId: Int?=null,moq: Int?=null, headers: Map<String, String> = emptyMap()): Response<ProductSizePriceResponseV3>? {
        var fullUrl : String? = _relativeUrls["getProductPriceBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        fullUrl = fullUrl?.replace("{" + "size" +"}",size.toString())
        
        return catalogApiList?.getProductPriceBySlug(fullUrl,     storeId = storeId,  moq = moq,headers = headers)}

    
    
    suspend fun getProductsServiceability(body: ProductSizePriceServiceabilityRequest, headers: Map<String, String> = emptyMap()): Response<ProductSizePriceServiceabilityResponse>? {
        var fullUrl : String? = _relativeUrls["getProductsServiceability"]
        
        return catalogApiList?.getProductsServiceability(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getProductSellersBySlug(slug: String,size: String,strategy: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<ProductSizeSellersResponseV3>? {
        var fullUrl : String? = _relativeUrls["getProductSellersBySlug"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        fullUrl = fullUrl?.replace("{" + "size" +"}",size.toString())
        
        return catalogApiList?.getProductSellersBySlug(fullUrl,     strategy = strategy,  pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductSellersBySlug
    **/
    fun getProductSellersBySlugPaginator(slug: String, size: String, strategy: String?=null, pageSize: Int?=null) : Paginator<ProductSizeSellersResponseV3>{

    val paginator = Paginator<ProductSizeSellersResponseV3>()

    paginator.setCallBack(object : PaginatorCallback<ProductSizeSellersResponseV3> {

            override suspend fun onNext(
                onResponse: (Event<ProductSizeSellersResponseV3>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getProductSellersBySlug"]
                
                fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
                
                fullUrl = fullUrl?.replace("{" + "size" +"}",size.toString())
                
                catalogApiList?.getProductSellersBySlug(fullUrl , strategy = strategy, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
