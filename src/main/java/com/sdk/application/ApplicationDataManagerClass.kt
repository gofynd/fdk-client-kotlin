package com.sdk.application

import com.sdk.common.*
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response



class CatalogDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val catalogApiList by lazy {
        generatecatalogApiList()
    }

    private fun generatecatalogApiList(): CatalogApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationCatalog",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    fun getProductDetailBySlug(slug: String): Deferred<Response<ProductDetail>>? {
        return catalogApiList?.getProductDetailBySlug(slug = slug )}

    
    
    fun getProductSizesBySlug(slug: String, storeId: String?=null): Deferred<Response<ProductSizes>>? {
        return catalogApiList?.getProductSizesBySlug(slug = slug, storeId = storeId )}

    
    
    fun getProductPriceBySlug(slug: String, size: String, pincode: String, storeId: String?=null): Deferred<Response<ProductSizePriceResponse>>? {
        return catalogApiList?.getProductPriceBySlug(slug = slug, size = size, pincode = pincode, storeId = storeId )}

    
    
    fun getProductSellersBySlug(slug: String, size: String, pincode: String, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<ProductSizeSellersResponse>>? {
        return catalogApiList?.getProductSellersBySlug(slug = slug, size = size, pincode = pincode, pageNo = pageNo, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductSellersBySlug
    **/
    fun getProductSellersBySlugPaginator(slug: String, size: String, pincode: String, pageSize: Int?=null) : Paginator<ProductSizeSellersResponse>{

    val paginator = Paginator<ProductSizeSellersResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductSizeSellersResponse> {
            override suspend fun onNext(
                onSuccess: (Event<ProductSizeSellersResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getProductSellersBySlug(slug = slug, size = size, pincode = pincode, pageNo = pageNo, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getProductComparisonBySlugs(slug: String): Deferred<Response<ProductsComparisonResponse>>? {
        return catalogApiList?.getProductComparisonBySlugs(slug = slug )}

    
    
    fun getSimilarComparisonProductBySlug(slug: String): Deferred<Response<ProductCompareResponse>>? {
        return catalogApiList?.getSimilarComparisonProductBySlug(slug = slug )}

    
    
    fun getComparedFrequentlyProductBySlug(slug: String): Deferred<Response<ProductFrequentlyComparedSimilarResponse>>? {
        return catalogApiList?.getComparedFrequentlyProductBySlug(slug = slug )}

    
    
    fun getProductSimilarByIdentifier(slug: String, similarType: String): Deferred<Response<SimilarProductByTypeResponse>>? {
        return catalogApiList?.getProductSimilarByIdentifier(slug = slug, similarType = similarType )}

    
    
    fun getProductVariantsBySlug(slug: String): Deferred<Response<ProductVariantsResponse>>? {
        return catalogApiList?.getProductVariantsBySlug(slug = slug )}

    
    
    fun getProductStockByIds(itemId: String?=null, alu: String?=null, skuCode: String?=null, ean: String?=null, upc: String?=null): Deferred<Response<ProductStockStatusResponse>>? {
        return catalogApiList?.getProductStockByIds(itemId = itemId, alu = alu, skuCode = skuCode, ean = ean, upc = upc )}

    
    
    fun getProductStockForTimeByIds(timestamp: String, pageSize: Int?=null, pageId: String?=null): Deferred<Response<ProductStockPolling>>? {
        return catalogApiList?.getProductStockForTimeByIds(timestamp = timestamp, pageSize = pageSize, pageId = pageId )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
    /**
    *
    * Summary: Paginator for getProductStockForTimeByIds
    **/
    fun getProductStockForTimeByIdsPaginator(timestamp: String, pageSize: Int?=null) : Paginator<ProductStockPolling>{

    val paginator = Paginator<ProductStockPolling>()

    paginator.setCallBack(object : PaginatorCallback<ProductStockPolling> {
            override suspend fun onNext(
                onSuccess: (Event<ProductStockPolling>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getProductStockForTimeByIds(timestamp = timestamp, pageSize = pageSize, pageId = pageId)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getProducts(q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null, pageNo: Int?=null, pageType: String?=null): Deferred<Response<ProductListingResponse>>? {
        return catalogApiList?.getProducts(q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
    /**
    *
    * Summary: Paginator for getProducts
    **/
    fun getProductsPaginator(q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null) : Paginator<ProductListingResponse>{

    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<ProductListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getProducts(q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getBrands(department: String?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<BrandListingResponse>>? {
        return catalogApiList?.getBrands(department = department, pageNo = pageNo, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBrands
    **/
    fun getBrandsPaginator(department: String?=null, pageSize: Int?=null) : Paginator<BrandListingResponse>{

    val paginator = Paginator<BrandListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<BrandListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getBrands(department = department, pageNo = pageNo, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getBrandDetailBySlug(slug: String): Deferred<Response<BrandDetailResponse>>? {
        return catalogApiList?.getBrandDetailBySlug(slug = slug )}

    
    
    fun getCategories(department: String?=null): Deferred<Response<CategoryListingResponse>>? {
        return catalogApiList?.getCategories(department = department )}

    
    
    fun getCategoryDetailBySlug(slug: String): Deferred<Response<CategoryMetaResponse>>? {
        return catalogApiList?.getCategoryDetailBySlug(slug = slug )}

    
    
    fun getHomeProducts(sortOn: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<HomeListingResponse>>? {
        return catalogApiList?.getHomeProducts(sortOn = sortOn, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getHomeProducts
    **/
    fun getHomeProductsPaginator(sortOn: String?=null, pageSize: Int?=null) : Paginator<HomeListingResponse>{

    val paginator = Paginator<HomeListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<HomeListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<HomeListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getHomeProducts(sortOn = sortOn, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getDepartments(): Deferred<Response<DepartmentResponse>>? {
        return catalogApiList?.getDepartments( )}

    
    
    fun getSearchResults(q: String): Deferred<Response<AutoCompleteResponse>>? {
        return catalogApiList?.getSearchResults(q = q )}

    
    
    fun getCollections(pageId: String?=null, pageSize: Int?=null): Deferred<Response<GetCollectionListingResponse>>? {
        return catalogApiList?.getCollections(pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCollections
    **/
    fun getCollectionsPaginator(pageSize: Int?=null) : Paginator<GetCollectionListingResponse>{

    val paginator = Paginator<GetCollectionListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<GetCollectionListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<GetCollectionListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getCollections(pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getCollectionItemsBySlug(slug: String, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ProductListingResponse>>? {
        return catalogApiList?.getCollectionItemsBySlug(slug = slug, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCollectionItemsBySlug
    **/
    fun getCollectionItemsBySlugPaginator(slug: String, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null) : Paginator<ProductListingResponse>{

    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<ProductListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getCollectionItemsBySlug(slug = slug, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getCollectionDetailBySlug(slug: String): Deferred<Response<CollectionDetailResponse>>? {
        return catalogApiList?.getCollectionDetailBySlug(slug = slug )}

    
    
    fun getFollowedListing(collectionType: String): Deferred<Response<GetFollowListingResponse>>? {
        return catalogApiList?.getFollowedListing(collectionType = collectionType )}

    
    
    
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getFollowedListing
    **/
    fun getFollowedListingPaginator(collectionType: String) : Paginator<GetFollowListingResponse>{

    val paginator = Paginator<GetFollowListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<GetFollowListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<GetFollowListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getFollowedListing(collectionType = collectionType)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun unfollowById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.unfollowById(collectionType = collectionType, collectionId = collectionId )}

    
    
    fun followById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.followById(collectionType = collectionType, collectionId = collectionId )}

    
    
    fun getFollowerCountById(collectionType: String, collectionId: String): Deferred<Response<FollowerCountResponse>>? {
        return catalogApiList?.getFollowerCountById(collectionType = collectionType, collectionId = collectionId )}

    
    
    fun getFollowIds(collectionType: String?=null): Deferred<Response<FollowIdsResponse>>? {
        return catalogApiList?.getFollowIds(collectionType = collectionType )}

    
    
    fun getStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null): Deferred<Response<StoreListingResponse>>? {
        return catalogApiList?.getStores(pageNo = pageNo, pageSize = pageSize, q = q, range = range, latitude = latitude, longitude = longitude )}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStores
    **/
    fun getStoresPaginator(pageSize: Int?=null, q: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null) : Paginator<StoreListingResponse>{

    val paginator = Paginator<StoreListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<StoreListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<StoreListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getStores(pageNo = pageNo, pageSize = pageSize, q = q, range = range, latitude = latitude, longitude = longitude)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
}


class CartDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val cartApiList by lazy {
        generatecartApiList()
    }

    private fun generatecartApiList(): CartApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    fun getCart(uid: Int?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartResponse>>? {
        return cartApiList?.getCart(uid = uid, i = i, b = b, assignCardId = assignCardId )}

    
    
    fun getCartLastModified(uid: Int?=null): Deferred<Response<Any>>? {
        return cartApiList?.getCartLastModified(uid = uid )}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null,body: AddCartRequest): Deferred<Response<AddCartResponse>>? {
        return cartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(uid: Int?=null, i: Boolean?=null, b: Boolean?=null,body: UpdateCartRequest): Deferred<Response<UpdateCartResponse>>? {
        return cartApiList?.updateCart(uid = uid, i = i, b = b, body = body)}

    
    
    fun getItemCount(uid: Int?=null): Deferred<Response<CartItemCountResponse>>? {
        return cartApiList?.getItemCount(uid = uid )}

    
    
    fun getCoupons(uid: Int?=null): Deferred<Response<GetCouponResponse>>? {
        return cartApiList?.getCoupons(uid = uid )}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, uid: Int?=null,body: ApplyCouponRequest): Deferred<Response<CartResponse>>? {
        return cartApiList?.applyCoupon(i = i, b = b, p = p, uid = uid, body = body)}

    
    
    fun removeCoupon(uid: Int?=null): Deferred<Response<CartResponse>>? {
        return cartApiList?.removeCoupon(uid = uid )}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return cartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug )}

    
    
    fun getAddresses(uid: Int?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: Int?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return cartApiList?.getAddresses(uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault )}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return cartApiList?.addAddress( body = body)}

    
    
    fun getAddressById(id: String, uid: Int?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: Int?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return cartApiList?.getAddressById(id = id, uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault )}

    
    
    fun updateAddress(id: String,body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return cartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return cartApiList?.removeAddress(id = id )}

    
    
    fun selectAddress(uid: Int?=null, i: Boolean?=null, b: Boolean?=null,body: SelectCartAddressRequest): Deferred<Response<CartResponse>>? {
        return cartApiList?.selectAddress(uid = uid, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(uid: String?=null,body: UpdateCartPaymentRequest): Deferred<Response<CartResponse>>? {
        return cartApiList?.selectPaymentMode(uid = uid, body = body)}

    
    
    fun validateCouponForPayment(uid: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentUpdate>>? {
        return cartApiList?.validateCouponForPayment(uid = uid, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode )}

    
    
    fun getShipments(p: Boolean?=null, uid: Int?=null, addressId: Int?=null, areaCode: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return cartApiList?.getShipments(p = p, uid = uid, addressId = addressId, areaCode = areaCode )}

    
    
    fun checkoutCart(body: CartCheckoutRequest): Deferred<Response<CartCheckoutResponse>>? {
        return cartApiList?.checkoutCart( body = body)}

    
    
    fun updateCartMeta(uid: Int?=null,body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return cartApiList?.updateCartMeta(uid = uid, body = body)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return cartApiList?.getCartShareLink( body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.getCartSharedItems(token = token )}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.updateCartWithSharedItems(token = token, action = action )}

    
    
}


class FileStorageDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val fileStorageApiList by lazy {
        generatefileStorageApiList()
    }

    private fun generatefileStorageApiList(): FileStorageApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationFileStorage",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as? FileStorageApiList
    }
    
    fun startUpload(namespace: String,body: StartRequest): Deferred<Response<StartResponse>>? {
        return fileStorageApiList?.startUpload(namespace = namespace, body = body)}

    
    
    fun completeUpload(namespace: String,body: StartResponse): Deferred<Response<CompleteResponse>>? {
        return fileStorageApiList?.completeUpload(namespace = namespace, body = body)}

    
    
}


class FeedbackDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val feedbackApiList by lazy {
        generatefeedbackApiList()
    }

    private fun generatefeedbackApiList(): FeedbackApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationFeedback",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FeedbackApiList::class.java) as? FeedbackApiList
    }
    
    fun createAbuseReport(body: ReportAbuseRequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createAbuseReport( body = body)}

    
    
    fun updateAbuseReport(body: UpdateAbuseStatusRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateAbuseReport( body = body)}

    
    
    fun getAbuseReports(entityId: String, entityType: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbuseReports
    **/
    fun getAbuseReportsPaginator(entityId: String, entityType: String, id: String?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getAttributes(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<XNumberGetResponse>>? {
        return feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize )}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAttributes
    **/
    fun getAttributesPaginator(pageSize: Int?=null) : Paginator<XNumberGetResponse>{

    val paginator = Paginator<XNumberGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XNumberGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XNumberGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun createAttribute(body: SaveAttributeRequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createAttribute( body = body)}

    
    
    fun getAttribute(slug: String): Deferred<Response<Attribute>>? {
        return feedbackApiList?.getAttribute(slug = slug )}

    
    
    fun updateAttribute(slug: String,body: UpdateAttributeRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateAttribute(slug = slug, body = body)}

    
    
    fun createComment(body: CommentRequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createComment( body = body)}

    
    
    fun updateComment(body: UpdateCommentRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateComment( body = body)}

    
    
    fun getComments(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getComments
    **/
    fun getCommentsPaginator(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun checkEligibility(entityType: String, entityId: String): Deferred<Response<CheckEligibilityResponse>>? {
        return feedbackApiList?.checkEligibility(entityType = entityType, entityId = entityId )}

    
    
    fun deleteMedia(): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.deleteMedia( )}

    
    
    fun createMedia(body: AddMediaListRequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createMedia( body = body)}

    
    
    fun updateMedia(body: UpdateMediaListRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateMedia( body = body)}

    
    
    fun getMedias(entityType: String, entityId: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getMedias
    **/
    fun getMediasPaginator(entityType: String, entityId: String, id: String?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getReviewSummaries(entityType: String, entityId: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviewSummaries
    **/
    fun getReviewSummariesPaginator(entityType: String, entityId: String, id: String?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun createReview(body: UpdateReviewRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.createReview( body = body)}

    
    
    fun updateReview(body: UpdateReviewRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateReview( body = body)}

    
    
    fun getReviews(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviews
    **/
    fun getReviewsPaginator(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getTemplates(templateId: String?=null, entityId: String?=null, entityType: String?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getTemplates(templateId = templateId, entityId = entityId, entityType = entityType )}

    
    
    fun createQuestion(body: CreateQNARequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createQuestion( body = body)}

    
    
    fun updateQuestion(body: UpdateQNARequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateQuestion( body = body)}

    
    
    fun getQuestionAndAnswers(entityType: String, entityId: String, id: String?=null, showAnswer: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<XCursorGetResponse>>? {
        return feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getQuestionAndAnswers
    **/
    fun getQuestionAndAnswersPaginator(entityType: String, entityId: String, id: String?=null, showAnswer: Boolean?=null, pageSize: Int?=null) : Paginator<XCursorGetResponse>{

    val paginator = Paginator<XCursorGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<XCursorGetResponse> {
            override suspend fun onNext(
                onSuccess: (Event<XCursorGetResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

    })
    return paginator
    }
    
    fun getVotes(id: String?=null, refType: String?=null): Deferred<Response<XNumberGetResponse>>? {
        return feedbackApiList?.getVotes(id = id, refType = refType )}

    
    
    fun createVote(body: VoteRequest): Deferred<Response<XInsertResponse>>? {
        return feedbackApiList?.createVote( body = body)}

    
    
    fun updateVote(body: UpdateVoteRequest): Deferred<Response<XUpdateResponse>>? {
        return feedbackApiList?.updateVote( body = body)}

    
    
}


class PosCartDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val posCartApiList by lazy {
        generateposCartApiList()
    }

    private fun generateposCartApiList(): PosCartApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationPosCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PosCartApiList::class.java) as? PosCartApiList
    }
    
    fun getCart(uid: Int?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartResponse>>? {
        return posCartApiList?.getCart(uid = uid, i = i, b = b, assignCardId = assignCardId )}

    
    
    fun getCartLastModified(uid: Int?=null): Deferred<Response<Any>>? {
        return posCartApiList?.getCartLastModified(uid = uid )}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null,body: AddCartRequest): Deferred<Response<AddCartResponse>>? {
        return posCartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(uid: Int?=null, i: Boolean?=null, b: Boolean?=null,body: UpdateCartRequest): Deferred<Response<UpdateCartResponse>>? {
        return posCartApiList?.updateCart(uid = uid, i = i, b = b, body = body)}

    
    
    fun getItemCount(uid: Int?=null): Deferred<Response<CartItemCountResponse>>? {
        return posCartApiList?.getItemCount(uid = uid )}

    
    
    fun getCoupons(uid: Int?=null): Deferred<Response<GetCouponResponse>>? {
        return posCartApiList?.getCoupons(uid = uid )}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, uid: Int?=null,body: ApplyCouponRequest): Deferred<Response<CartResponse>>? {
        return posCartApiList?.applyCoupon(i = i, b = b, p = p, uid = uid, body = body)}

    
    
    fun removeCoupon(uid: Int?=null): Deferred<Response<CartResponse>>? {
        return posCartApiList?.removeCoupon(uid = uid )}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return posCartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug )}

    
    
    fun getAddresses(uid: Int?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: Int?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return posCartApiList?.getAddresses(uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault )}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return posCartApiList?.addAddress( body = body)}

    
    
    fun getAddressById(id: String, uid: Int?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: Int?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return posCartApiList?.getAddressById(id = id, uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault )}

    
    
    fun updateAddress(id: String,body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return posCartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return posCartApiList?.removeAddress(id = id )}

    
    
    fun selectAddress(uid: Int?=null, i: Boolean?=null, b: Boolean?=null,body: SelectCartAddressRequest): Deferred<Response<CartResponse>>? {
        return posCartApiList?.selectAddress(uid = uid, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(uid: String?=null,body: UpdateCartPaymentRequest): Deferred<Response<CartResponse>>? {
        return posCartApiList?.selectPaymentMode(uid = uid, body = body)}

    
    
    fun validateCouponForPayment(uid: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentUpdate>>? {
        return posCartApiList?.validateCouponForPayment(uid = uid, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode )}

    
    
    fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, p: Boolean?=null, uid: Int?=null, addressId: Int?=null, areaCode: String?=null, orderType: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.getShipments(pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, p = p, uid = uid, addressId = addressId, areaCode = areaCode, orderType = orderType )}

    
    
    fun updateShipments(i: Boolean?=null, p: Boolean?=null, uid: Int?=null, addressId: Int?=null, orderType: String?=null,body: UpdateCartShipmentRequest): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.updateShipments(i = i, p = p, uid = uid, addressId = addressId, orderType = orderType, body = body)}

    
    
    fun checkoutCart(uid: Int?=null,body: CartPosCheckoutRequest): Deferred<Response<CartCheckoutResponse>>? {
        return posCartApiList?.checkoutCart(uid = uid, body = body)}

    
    
    fun updateCartMeta(uid: Int?=null,body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return posCartApiList?.updateCartMeta(uid = uid, body = body)}

    
    
    fun getAvailableDeliveryModes(areaCode: String, uid: Int?=null): Deferred<Response<CartDeliveryModesResponse>>? {
        return posCartApiList?.getAvailableDeliveryModes(areaCode = areaCode, uid = uid )}

    
    
    fun getStoreAddressByUid(storeUid: Int): Deferred<Response<StoreDetailsResponse>>? {
        return posCartApiList?.getStoreAddressByUid(storeUid = storeUid )}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return posCartApiList?.getCartShareLink( body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.getCartSharedItems(token = token )}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.updateCartWithSharedItems(token = token, action = action )}

    
    
}

