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

    
    
    fun getProductPriceBySlug(slug: String, size: String, pincode: Int?=null, storeId: String?=null): Deferred<Response<ProductSizePriceResponse>>? {
        return catalogApiList?.getProductPriceBySlug(slug = slug, size = size, pincode = pincode, storeId = storeId )}

    
    
    fun getProductSellersBySlug(slug: String, size: String, pincode: Int?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<ProductSizeSellersResponse>>? {
        return catalogApiList?.getProductSellersBySlug(slug = slug, size = size, pincode = pincode, pageNo = pageNo, pageSize = pageSize )}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductSellersBySlug
    **/
    fun getProductSellersBySlugPaginator(slug: String, size: String, pincode: Int?=null, pageSize: Int?=null) : Paginator<ProductSizeSellersResponse>{

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
    
    fun followById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.followById(collectionType = collectionType, collectionId = collectionId )}

    
    
    fun unfollowById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.unfollowById(collectionType = collectionType, collectionId = collectionId )}

    
    
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


class LeadDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val leadApiList by lazy {
        generateleadApiList()
    }

    private fun generateleadApiList(): LeadApiList? {
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
            namespace = "ApplicationLead",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    fun getTicket(id: String): Deferred<Response<Ticket>>? {
        return leadApiList?.getTicket(id = id )}

    
    
    fun createHistoryForTicket(ticketId: String,body: TicketHistoryPayload): Deferred<Response<TicketHistory>>? {
        return leadApiList?.createHistoryForTicket(ticketId = ticketId, body = body)}

    
    
    fun createTicket(body: AddTicketPayload): Deferred<Response<Ticket>>? {
        return leadApiList?.createTicket( body = body)}

    
    
    fun getCustomForm(slug: String): Deferred<Response<CustomForm>>? {
        return leadApiList?.getCustomForm(slug = slug )}

    
    
    fun submitCustomForm(slug: String,body: CustomFormSubmissionPayload): Deferred<Response<SubmitCustomFormResponse>>? {
        return leadApiList?.submitCustomForm(slug = slug, body = body)}

    
    
    fun getParticipantsInsideVideoRoom(uniqueName: String): Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        return leadApiList?.getParticipantsInsideVideoRoom(uniqueName = uniqueName )}

    
    
    fun getTokenForVideoRoom(uniqueName: String): Deferred<Response<GetTokenForVideoRoomResponse>>? {
        return leadApiList?.getTokenForVideoRoom(uniqueName = uniqueName )}

    
    
}


class ThemeDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val themeApiList by lazy {
        generatethemeApiList()
    }

    private fun generatethemeApiList(): ThemeApiList? {
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
            namespace = "ApplicationTheme",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    fun getAppliedTheme(): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getAppliedTheme( )}

    
    
    fun getThemeForPreview(themeId: String): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getThemeForPreview(themeId = themeId )}

    
    
}


class UserDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val userApiList by lazy {
        generateuserApiList()
    }

    private fun generateuserApiList(): UserApiList? {
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
            namespace = "ApplicationUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    fun loginWithFacebook(body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithFacebook( body = body)}

    
    
    fun loginWithGoogle(body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogle( body = body)}

    
    
    fun loginWithGoogleAndroid(body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleAndroid( body = body)}

    
    
    fun loginWithGoogleIOS(body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleIOS( body = body)}

    
    
    fun loginWithOTP(platform: String?=null,body: SendOtpRequestSchema): Deferred<Response<SendOtpResponse>>? {
        return userApiList?.loginWithOTP(platform = platform, body = body)}

    
    
    fun loginWithEmailAndPassword(body: PasswordLoginRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithEmailAndPassword( body = body)}

    
    
    fun sendResetPasswordEmail(platform: String?=null,body: SendResetPasswordEmailRequestSchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetPasswordEmail(platform = platform, body = body)}

    
    
    fun forgotPassword(body: ForgotPasswordRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.forgotPassword( body = body)}

    
    
    fun sendResetToken(body: CodeRequestBodySchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetToken( body = body)}

    
    
    fun loginWithToken(body: TokenRequestBodySchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithToken( body = body)}

    
    
    fun registerWithForm(platform: String?=null,body: FormRegisterRequestSchema): Deferred<Response<RegisterFormSuccess>>? {
        return userApiList?.registerWithForm(platform = platform, body = body)}

    
    
    fun verifyEmail(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyEmail( body = body)}

    
    
    fun verifyMobile(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyMobile( body = body)}

    
    
    fun hasPassword(): Deferred<Response<HasPasswordSuccess>>? {
        return userApiList?.hasPassword( )}

    
    
    fun updatePassword(body: UpdatePasswordRequestSchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.updatePassword( body = body)}

    
    
    fun logout(): Deferred<Response<LogoutSuccess>>? {
        return userApiList?.logout( )}

    
    
    fun sendOTPOnMobile(platform: String?=null,body: SendMobileOtpRequestSchema): Deferred<Response<OtpSuccess>>? {
        return userApiList?.sendOTPOnMobile(platform = platform, body = body)}

    
    
    fun verifyMobileOTP(platform: String?=null,body: VerifyOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyMobileOTP(platform = platform, body = body)}

    
    
    fun sendOTPOnEmail(platform: String?=null,body: SendEmailOtpRequestSchema): Deferred<Response<EmailOtpSuccess>>? {
        return userApiList?.sendOTPOnEmail(platform = platform, body = body)}

    
    
    fun verifyEmailOTP(platform: String?=null,body: VerifyOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyEmailOTP(platform = platform, body = body)}

    
    
    fun getLoggedInUser(): Deferred<Response<UserSchema>>? {
        return userApiList?.getLoggedInUser( )}

    
    
    fun getListOfActiveSessions(): Deferred<Response<SessionListSuccess>>? {
        return userApiList?.getListOfActiveSessions( )}

    
    
    fun getPlatformConfig(name: String?=null): Deferred<Response<PlatformSchema>>? {
        return userApiList?.getPlatformConfig(name = name )}

    
    
    fun updateProfile(platform: String?=null,body: EditProfileRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.updateProfile(platform = platform, body = body)}

    
    
    fun addMobileNumber(platform: String?=null,body: EditMobileRequestSchema): Deferred<Response<VerifyMobileOTPSuccess>>? {
        return userApiList?.addMobileNumber(platform = platform, body = body)}

    
    
    fun deleteMobileNumber(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteMobileNumber(platform = platform, active = active, primary = primary, verified = verified, countryCode = countryCode, phone = phone )}

    
    
    fun setMobileNumberAsPrimary(body: SendVerificationLinkMobileRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setMobileNumberAsPrimary( body = body)}

    
    
    fun sendVerificationLinkToMobile(platform: String?=null,body: SendVerificationLinkMobileRequestSchema): Deferred<Response<SendMobileVerifyLinkSuccess>>? {
        return userApiList?.sendVerificationLinkToMobile(platform = platform, body = body)}

    
    
    fun addEmail(platform: String?=null,body: EditEmailRequestSchema): Deferred<Response<VerifyEmailOTPSuccess>>? {
        return userApiList?.addEmail(platform = platform, body = body)}

    
    
    fun deleteEmail(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, email: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteEmail(platform = platform, active = active, primary = primary, verified = verified, email = email )}

    
    
    fun setEmailAsPrimary(body: EditEmailRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setEmailAsPrimary( body = body)}

    
    
    fun sendVerificationLinkToEmail(platform: String?=null,body: EditEmailRequestSchema): Deferred<Response<SendEmailVerifyLinkSuccess>>? {
        return userApiList?.sendVerificationLinkToEmail(platform = platform, body = body)}

    
    
}


class ContentDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationContent",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    fun getAnnouncements(): Deferred<Response<AnnouncementsResponseSchema>>? {
        return contentApiList?.getAnnouncements( )}

    
    
    fun getBlog(slug: String): Deferred<Response<CustomBlog>>? {
        return contentApiList?.getBlog(slug = slug )}

    
    
    fun getFaqs(): Deferred<Response<FaqResponseSchema>>? {
        return contentApiList?.getFaqs( )}

    
    
    fun getFaqCategories(): Deferred<Response<GetFaqCategoriesSchema>>? {
        return contentApiList?.getFaqCategories( )}

    
    
    fun getFaqByIdOrSlug(idOrSlug: String): Deferred<Response<FaqSchema>>? {
        return contentApiList?.getFaqByIdOrSlug(idOrSlug = idOrSlug )}

    
    
    fun getFaqCategoryBySlugOrId(idOrSlug: String): Deferred<Response<GetFaqCategoryByIdOrSlugSchema>>? {
        return contentApiList?.getFaqCategoryBySlugOrId(idOrSlug = idOrSlug )}

    
    
    fun getFaqsByCategoryIdOrSlug(idOrSlug: String): Deferred<Response<GetFaqSchema>>? {
        return contentApiList?.getFaqsByCategoryIdOrSlug(idOrSlug = idOrSlug )}

    
    
    fun getLandingPage(): Deferred<Response<LandingPage>>? {
        return contentApiList?.getLandingPage( )}

    
    
    fun getLegalInformation(): Deferred<Response<ApplicationLegal>>? {
        return contentApiList?.getLegalInformation( )}

    
    
    fun getNavigations(): Deferred<Response<Navigation>>? {
        return contentApiList?.getNavigations( )}

    
    
    fun getPage(slug: String): Deferred<Response<CustomPage>>? {
        return contentApiList?.getPage(slug = slug )}

    
    
    fun getSeoConfiguration(): Deferred<Response<Seo>>? {
        return contentApiList?.getSeoConfiguration( )}

    
    
    fun getSlideshow(slug: String): Deferred<Response<Slideshow>>? {
        return contentApiList?.getSlideshow(slug = slug )}

    
    
    fun getSupportInformation(): Deferred<Response<Support>>? {
        return contentApiList?.getSupportInformation( )}

    
    
    fun getTags(): Deferred<Response<TagsSchema>>? {
        return contentApiList?.getTags( )}

    
    
}


class CommunicationDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }

    private fun generatecommunicationApiList(): CommunicationApiList? {
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
            namespace = "ApplicationCommunication",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    fun getCommunicationConsent(): Deferred<Response<CommunicationConsent>>? {
        return communicationApiList?.getCommunicationConsent( )}

    
    
    fun upsertCommunicationConsent(body: CommunicationConsentReq): Deferred<Response<CommunicationConsentRes>>? {
        return communicationApiList?.upsertCommunicationConsent( body = body)}

    
    
    fun upsertAppPushtoken(body: PushtokenReq): Deferred<Response<PushtokenRes>>? {
        return communicationApiList?.upsertAppPushtoken( body = body)}

    
    
}


class ShareDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val shareApiList by lazy {
        generateshareApiList()
    }

    private fun generateshareApiList(): ShareApiList? {
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
            namespace = "ApplicationShare",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    fun getApplicationQRCode(): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getApplicationQRCode( )}

    
    
    fun getProductQRCodeBySlug(slug: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getProductQRCodeBySlug(slug = slug )}

    
    
    fun getCollectionQRCodeBySlug(slug: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getCollectionQRCodeBySlug(slug = slug )}

    
    
    fun getUrlQRCode(url: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getUrlQRCode(url = url )}

    
    
    fun createShortLink(body: ShortLinkReq): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.createShortLink( body = body)}

    
    
    fun getShortLinkByHash(hash: String): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.getShortLinkByHash(hash = hash )}

    
    
    fun getOriginalShortLinkByHash(hash: String): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.getOriginalShortLinkByHash(hash = hash )}

    
    
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
    
    fun completeUpload(namespace: String, companyId: String,body: StartResponse): Deferred<Response<CompleteResponse>>? {
        return fileStorageApiList?.completeUpload(namespace = namespace, companyId = companyId, body = body)}

    
    
    fun startUpload(namespace: String, companyId: String,body: StartRequest): Deferred<Response<StartResponse>>? {
        return fileStorageApiList?.startUpload(namespace = namespace, companyId = companyId, body = body)}

    
    
}


class ConfigurationDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val configurationApiList by lazy {
        generateconfigurationApiList()
    }

    private fun generateconfigurationApiList(): ConfigurationApiList? {
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
            namespace = "ApplicationConfiguration",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    fun getApplication(): Deferred<Response<Application>>? {
        return configurationApiList?.getApplication( )}

    
    
    fun getOwnerInfo(): Deferred<Response<ApplicationAboutResponse>>? {
        return configurationApiList?.getOwnerInfo( )}

    
    
    fun getBasicDetails(): Deferred<Response<ApplicationDetail>>? {
        return configurationApiList?.getBasicDetails( )}

    
    
    fun getIntegrationTokens(): Deferred<Response<TokensResponse>>? {
        return configurationApiList?.getIntegrationTokens( )}

    
    
    fun getOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null): Deferred<Response<OrderingStores>>? {
        return configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q )}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStores
    **/
    fun getOrderingStoresPaginator(pageSize: Int?=null, q: String?=null) : Paginator<OrderingStores>{

    val paginator = Paginator<OrderingStores>()

    paginator.setCallBack(object : PaginatorCallback<OrderingStores> {
            override suspend fun onNext(
                onSuccess: (Event<OrderingStores>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait(
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
    
    fun getFeatures(): Deferred<Response<AppFeatureResponse>>? {
        return configurationApiList?.getFeatures( )}

    
    
    fun getContactInfo(): Deferred<Response<ApplicationInformation>>? {
        return configurationApiList?.getContactInfo( )}

    
    
    fun getCurrencies(): Deferred<Response<CurrenciesResponse>>? {
        return configurationApiList?.getCurrencies( )}

    
    
    fun getCurrencyById(id: String): Deferred<Response<Currency>>? {
        return configurationApiList?.getCurrencyById(id = id )}

    
    
    fun getLanguages(): Deferred<Response<LanguageResponse>>? {
        return configurationApiList?.getLanguages( )}

    
    
    fun getOrderingStoreCookie(body: OrderingStoreSelectRequest): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.getOrderingStoreCookie( body = body)}

    
    
    fun removeOrderingStoreCookie(): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.removeOrderingStoreCookie( )}

    
    
    fun getAppStaffs(orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null): Deferred<Response<AppStaffResponse>>? {
        return configurationApiList?.getAppStaffs(orderIncent = orderIncent, orderingStore = orderingStore, user = user )}

    
    
}


class PaymentDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }

    private fun generatepaymentApiList(): PaymentApiList? {
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
            namespace = "ApplicationPayment",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    fun getAggregatorsConfig(xApiToken: String, refresh: Boolean?=null): Deferred<Response<AggregatorsConfigDetailResponse>>? {
        return paymentApiList?.getAggregatorsConfig(xApiToken = xApiToken, refresh = refresh )}

    
    
    fun attachCardToCustomer(body: AttachCardRequest): Deferred<Response<AttachCardsResponse>>? {
        return paymentApiList?.attachCardToCustomer( body = body)}

    
    
    fun getActiveCardAggregator(refresh: Boolean?=null): Deferred<Response<ActiveCardPaymentGatewayResponse>>? {
        return paymentApiList?.getActiveCardAggregator(refresh = refresh )}

    
    
    fun getActiveUserCards(forceRefresh: Boolean?=null): Deferred<Response<ListCardsResponse>>? {
        return paymentApiList?.getActiveUserCards(forceRefresh = forceRefresh )}

    
    
    fun deleteUserCard(body: DeletehCardRequest): Deferred<Response<DeleteCardsResponse>>? {
        return paymentApiList?.deleteUserCard( body = body)}

    
    
    fun verifyCustomerForPayment(body: ValidateCustomerRequest): Deferred<Response<ValidateCustomerResponse>>? {
        return paymentApiList?.verifyCustomerForPayment( body = body)}

    
    
    fun verifyAndChargePayment(body: ChargeCustomerRequest): Deferred<Response<ChargeCustomerResponse>>? {
        return paymentApiList?.verifyAndChargePayment( body = body)}

    
    
    fun initialisePayment(body: PaymentInitializationRequest): Deferred<Response<PaymentInitializationResponse>>? {
        return paymentApiList?.initialisePayment( body = body)}

    
    
    fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest): Deferred<Response<PaymentStatusUpdateResponse>>? {
        return paymentApiList?.checkAndUpdatePaymentStatus( body = body)}

    
    
    fun getPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, assignCardId: String?=null, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, assignCardId = assignCardId, userDetails = userDetails )}

    
    
    fun getPosPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, assignCardId: String?=null, orderType: String, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPosPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, assignCardId = assignCardId, orderType = orderType, userDetails = userDetails )}

    
    
    fun getUserBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getUserBeneficiariesDetail(orderId = orderId )}

    
    
    fun verifyIfscCode(ifscCode: String?=null): Deferred<Response<IfscCodeResponse>>? {
        return paymentApiList?.verifyIfscCode(ifscCode = ifscCode )}

    
    
    fun getOrderBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getOrderBeneficiariesDetail(orderId = orderId )}

    
    
    fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest): Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank( body = body)}

    
    
    fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest): Deferred<Response<RefundAccountResponse>>? {
        return paymentApiList?.addBeneficiaryDetails( body = body)}

    
    
    fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest): Deferred<Response<WalletOtpResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet( body = body)}

    
    
    fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest): Deferred<Response<SetDefaultBeneficiaryResponse>>? {
        return paymentApiList?.updateDefaultBeneficiary( body = body)}

    
    
}


class OrderDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val orderApiList by lazy {
        generateorderApiList()
    }

    private fun generateorderApiList(): OrderApiList? {
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
            namespace = "ApplicationOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    fun getOrders(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null): Deferred<Response<OrderList>>? {
        return orderApiList?.getOrders(pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate )}

    
    
    fun getOrderById(orderId: String): Deferred<Response<OrderById>>? {
        return orderApiList?.getOrderById(orderId = orderId )}

    
    
    fun getShipmentById(shipmentId: String): Deferred<Response<ShipmentById>>? {
        return orderApiList?.getShipmentById(shipmentId = shipmentId )}

    
    
    fun getShipmentReasons(shipmentId: String): Deferred<Response<ShipmentReasons>>? {
        return orderApiList?.getShipmentReasons(shipmentId = shipmentId )}

    
    
    fun updateShipmentStatus(shipmentId: String,body: ShipmentStatusUpdateBody): Deferred<Response<ShipmentStatusUpdate>>? {
        return orderApiList?.updateShipmentStatus(shipmentId = shipmentId, body = body)}

    
    
    fun trackShipment(shipmentId: String): Deferred<Response<ShipmentTrack>>? {
        return orderApiList?.trackShipment(shipmentId = shipmentId )}

    
    
}


class RewardsDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val rewardsApiList by lazy {
        generaterewardsApiList()
    }

    private fun generaterewardsApiList(): RewardsApiList? {
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
            namespace = "ApplicationRewards",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    fun getPointsOnProduct(body: CatalogueOrderRequest): Deferred<Response<CatalogueOrderResponse>>? {
        return rewardsApiList?.getPointsOnProduct( body = body)}

    
    
    fun getOrderDiscount(body: OrderDiscountRequest): Deferred<Response<OrderDiscountResponse>>? {
        return rewardsApiList?.getOrderDiscount( body = body)}

    
    
    fun getUserPoints(): Deferred<Response<PointsResponse>>? {
        return rewardsApiList?.getUserPoints( )}

    
    
    fun getUserPointsHistory(pageId: String?=null, pageSize: Int?=null): Deferred<Response<PointsHistoryResponse>>? {
        return rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize )}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(pageSize: Int?=null) : Paginator<PointsHistoryResponse>{

    val paginator = Paginator<PointsHistoryResponse>()

    paginator.setCallBack(object : PaginatorCallback<PointsHistoryResponse> {
            override suspend fun onNext(
                onSuccess: (Event<PointsHistoryResponse>) -> Unit,
                onFailure: (FdkError) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize)?.safeAwait(
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
    
    fun getUserReferralDetails(): Deferred<Response<ReferralDetailsResponse>>? {
        return rewardsApiList?.getUserReferralDetails( )}

    
    
    fun redeemReferralCode(body: RedeemReferralCodeRequest): Deferred<Response<RedeemReferralCodeResponse>>? {
        return rewardsApiList?.redeemReferralCode( body = body)}

    
    
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


class LogisticDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val logisticApiList by lazy {
        generatelogisticApiList()
    }

    private fun generatelogisticApiList(): LogisticApiList? {
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
            namespace = "ApplicationLogistic",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LogisticApiList::class.java) as? LogisticApiList
    }
    
    fun getTatProduct(body: GetTatProductReqBody): Deferred<Response<GetTatProductResponse>>? {
        return logisticApiList?.getTatProduct( body = body)}

    
    
    fun getPincodeCity(pincode: String): Deferred<Response<GetPincodeCityResponse>>? {
        return logisticApiList?.getPincodeCity(pincode = pincode )}

    
    
}

