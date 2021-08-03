package com.sdk.application

import com.sdk.common.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
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
        return catalogApiList?.getProductDetailBySlug(slug = slug)}

    
    
    fun getProductSizesBySlug(slug: String, storeId: Int?=null): Deferred<Response<ProductSizes>>? {
        return catalogApiList?.getProductSizesBySlug(slug = slug, storeId = storeId)}

    
    
    fun getProductPriceBySlug(slug: String, size: String, pincode: String, storeId: Int?=null): Deferred<Response<ProductSizePriceResponse>>? {
        return catalogApiList?.getProductPriceBySlug(slug = slug, size = size, pincode = pincode, storeId = storeId)}

    
    
    fun getProductSellersBySlug(slug: String, size: String, pincode: String, strategy: String?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<ProductSizeSellersResponse>>? {
        return catalogApiList?.getProductSellersBySlug(slug = slug, size = size, pincode = pincode, strategy = strategy, pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductSellersBySlug
    **/
    fun getProductSellersBySlugPaginator(slug: String, size: String, pincode: String, strategy: String?=null, pageSize: Int?=null) : Paginator<ProductSizeSellersResponse>{

    val paginator = Paginator<ProductSizeSellersResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductSizeSellersResponse> {

            override suspend fun onNext(
                onResponse: (Event<ProductSizeSellersResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getProductSellersBySlug(slug = slug, size = size, pincode = pincode, strategy = strategy, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getProductComparisonBySlugs(slug: ArrayList<String>): Deferred<Response<ProductsComparisonResponse>>? {
        return catalogApiList?.getProductComparisonBySlugs(slug = slug)}

    
    
    fun getSimilarComparisonProductBySlug(slug: String): Deferred<Response<ProductCompareResponse>>? {
        return catalogApiList?.getSimilarComparisonProductBySlug(slug = slug)}

    
    
    fun getComparedFrequentlyProductBySlug(slug: String): Deferred<Response<ProductFrequentlyComparedSimilarResponse>>? {
        return catalogApiList?.getComparedFrequentlyProductBySlug(slug = slug)}

    
    
    fun getProductSimilarByIdentifier(slug: String, similarType: String): Deferred<Response<SimilarProductByTypeResponse>>? {
        return catalogApiList?.getProductSimilarByIdentifier(slug = slug, similarType = similarType)}

    
    
    fun getProductVariantsBySlug(slug: String): Deferred<Response<ProductVariantsResponse>>? {
        return catalogApiList?.getProductVariantsBySlug(slug = slug)}

    
    
    fun getProductStockByIds(itemId: String?=null, alu: String?=null, skuCode: String?=null, ean: String?=null, upc: String?=null): Deferred<Response<ProductStockStatusResponse>>? {
        return catalogApiList?.getProductStockByIds(itemId = itemId, alu = alu, skuCode = skuCode, ean = ean, upc = upc)}

    
    
    fun getProductStockForTimeByIds(timestamp: String, pageSize: Int?=null, pageId: String?=null): Deferred<Response<ProductStockPolling>>? {
        return catalogApiList?.getProductStockForTimeByIds(timestamp = timestamp, pageSize = pageSize, pageId = pageId)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
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
                catalogApiList?.getProductStockForTimeByIds(timestamp = timestamp, pageSize = pageSize, pageId = pageId)?.safeAwait{ response, error ->
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
    
    fun getProducts(q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null, pageNo: Int?=null, pageType: String?=null): Deferred<Response<ProductListingResponse>>? {
        return catalogApiList?.getProducts(q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
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
                catalogApiList?.getProducts(q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType)?.safeAwait{ response, error ->
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
    
    fun getBrands(department: String?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<BrandListingResponse>>? {
        return catalogApiList?.getBrands(department = department, pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
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
                catalogApiList?.getBrands(department = department, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getBrandDetailBySlug(slug: String): Deferred<Response<BrandDetailResponse>>? {
        return catalogApiList?.getBrandDetailBySlug(slug = slug)}

    
    
    fun getCategories(department: String?=null): Deferred<Response<CategoryListingResponse>>? {
        return catalogApiList?.getCategories(department = department)}

    
    
    fun getCategoryDetailBySlug(slug: String): Deferred<Response<CategoryMetaResponse>>? {
        return catalogApiList?.getCategoryDetailBySlug(slug = slug)}

    
    
    fun getHomeProducts(sortOn: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<HomeListingResponse>>? {
        return catalogApiList?.getHomeProducts(sortOn = sortOn, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                catalogApiList?.getHomeProducts(sortOn = sortOn, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getDepartments(): Deferred<Response<DepartmentResponse>>? {
        return catalogApiList?.getDepartments()}

    
    
    fun getSearchResults(q: String): Deferred<Response<AutoCompleteResponse>>? {
        return catalogApiList?.getSearchResults(q = q)}

    
    
    fun getCollections(pageNo: Int?=null, pageSize: Int?=null, tag: ArrayList<String>?=null): Deferred<Response<GetCollectionListingResponse>>? {
        return catalogApiList?.getCollections(pageNo = pageNo, pageSize = pageSize, tag = tag)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCollections
    **/
    fun getCollectionsPaginator(pageSize: Int?=null, tag: ArrayList<String>?=null) : Paginator<GetCollectionListingResponse>{

    val paginator = Paginator<GetCollectionListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<GetCollectionListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<GetCollectionListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getCollections(pageNo = pageNo, pageSize = pageSize, tag = tag)?.safeAwait{ response, error ->
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
    
    fun getCollectionItemsBySlug(slug: String, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ProductListingResponse>>? {
        return catalogApiList?.getCollectionItemsBySlug(slug = slug, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCollectionItemsBySlug
    **/
    fun getCollectionItemsBySlugPaginator(slug: String, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null) : Paginator<ProductListingResponse>{

    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<ProductListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList?.getCollectionItemsBySlug(slug = slug, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getCollectionDetailBySlug(slug: String): Deferred<Response<CollectionDetailResponse>>? {
        return catalogApiList?.getCollectionDetailBySlug(slug = slug)}

    
    
    fun getFollowedListing(collectionType: String, pageId: String?=null, pageSize: Int?=null): Deferred<Response<GetFollowListingResponse>>? {
        return catalogApiList?.getFollowedListing(collectionType = collectionType, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                catalogApiList?.getFollowedListing(collectionType = collectionType, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun unfollowById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.unfollowById(collectionType = collectionType, collectionId = collectionId)}

    
    
    fun followById(collectionType: String, collectionId: String): Deferred<Response<FollowPostResponse>>? {
        return catalogApiList?.followById(collectionType = collectionType, collectionId = collectionId)}

    
    
    fun getFollowerCountById(collectionType: String, collectionId: String): Deferred<Response<FollowerCountResponse>>? {
        return catalogApiList?.getFollowerCountById(collectionType = collectionType, collectionId = collectionId)}

    
    
    fun getFollowIds(collectionType: String?=null): Deferred<Response<FollowIdsResponse>>? {
        return catalogApiList?.getFollowIds(collectionType = collectionType)}

    
    
    fun getStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, city: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null): Deferred<Response<StoreListingResponse>>? {
        return catalogApiList?.getStores(pageNo = pageNo, pageSize = pageSize, q = q, city = city, range = range, latitude = latitude, longitude = longitude)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStores
    **/
    fun getStoresPaginator(pageSize: Int?=null, q: String?=null, city: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null) : Paginator<StoreListingResponse>{

    val paginator = Paginator<StoreListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<StoreListingResponse> {

            override suspend fun onNext(
                onResponse: (Event<StoreListingResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                catalogApiList?.getStores(pageNo = pageNo, pageSize = pageSize, q = q, city = city, range = range, latitude = latitude, longitude = longitude)?.safeAwait{ response, error ->
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
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.getCart(id = id, i = i, b = b, assignCardId = assignCardId)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        return cartApiList?.getCartLastModified(id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        return cartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        return cartApiList?.updateCart(id = id, i = i, b = b, body = body)}

    
    
    fun getItemCount(id: String?=null): Deferred<Response<CartItemCountResponse>>? {
        return cartApiList?.getItemCount(id = id)}

    
    
    fun getCoupons(id: String?=null): Deferred<Response<GetCouponResponse>>? {
        return cartApiList?.getCoupons(id = id)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.applyCoupon(i = i, b = b, p = p, id = id, body = body)}

    
    
    fun removeCoupon(id: String?=null): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.removeCoupon(id = id)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return cartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: RewardPointRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.applyRewardPoints(id = id, i = i, b = b, body = body)}

    
    
    fun getAddresses(cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return cartApiList?.getAddresses(cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return cartApiList?.addAddress(body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return cartApiList?.getAddressById(id = id, cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return cartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return cartApiList?.removeAddress(id = id)}

    
    
    fun selectAddress(cartId: String?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.selectAddress(cartId = cartId, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.selectPaymentMode(id = id, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidate>>? {
        return cartApiList?.validateCouponForPayment(id = id, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode)}

    
    
    fun getShipments(p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return cartApiList?.getShipments(p = p, id = id, addressId = addressId, areaCode = areaCode)}

    
    
    fun checkoutCart(body: CartCheckoutDetailRequest): Deferred<Response<CartCheckoutResponse>>? {
        return cartApiList?.checkoutCart(body = body)}

    
    
    fun updateCartMeta(id: String?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return cartApiList?.updateCartMeta(id = id, body = body)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return cartApiList?.getCartShareLink(body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.getCartSharedItems(token = token)}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.updateCartWithSharedItems(token = token, action = action)}

    
    
}


class CommonDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val commonApiList by lazy {
        generatecommonApiList()
    }

    private fun generatecommonApiList(): CommonApiList? {
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
            namespace = "ApplicationCommon",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CommonApiList::class.java) as? CommonApiList
    }
    
    fun getLocations(locationType: String?=null, id: String?=null): Deferred<Response<Locations>>? {
        return commonApiList?.getLocations(locationType = locationType, id = id)}

    
    
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
        return leadApiList?.getTicket(id = id)}

    
    
    fun createHistory(id: String, body: TicketHistoryPayload): Deferred<Response<TicketHistory>>? {
        return leadApiList?.createHistory(id = id, body = body)}

    
    
    fun createTicket(body: AddTicketPayload): Deferred<Response<Ticket>>? {
        return leadApiList?.createTicket(body = body)}

    
    
    fun getCustomForm(slug: String): Deferred<Response<CustomForm>>? {
        return leadApiList?.getCustomForm(slug = slug)}

    
    
    fun submitCustomForm(slug: String, body: CustomFormSubmissionPayload): Deferred<Response<SubmitCustomFormResponse>>? {
        return leadApiList?.submitCustomForm(slug = slug, body = body)}

    
    
    fun getParticipantsInsideVideoRoom(uniqueName: String): Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        return leadApiList?.getParticipantsInsideVideoRoom(uniqueName = uniqueName)}

    
    
    fun getTokenForVideoRoom(uniqueName: String): Deferred<Response<GetTokenForVideoRoomResponse>>? {
        return leadApiList?.getTokenForVideoRoom(uniqueName = uniqueName)}

    
    
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
    
    fun getAllPages(themeId: String): Deferred<Response<AllAvailablePageSchema>>? {
        return themeApiList?.getAllPages(themeId = themeId)}

    
    
    fun getPage(themeId: String, pageValue: String): Deferred<Response<AvailablePageSchema>>? {
        return themeApiList?.getPage(themeId = themeId, pageValue = pageValue)}

    
    
    fun getAppliedTheme(): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getAppliedTheme()}

    
    
    fun getThemeForPreview(themeId: String): Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getThemeForPreview(themeId = themeId)}

    
    
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
    
    fun loginWithFacebook(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithFacebook(platform = platform, body = body)}

    
    
    fun loginWithGoogle(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogle(platform = platform, body = body)}

    
    
    fun loginWithGoogleAndroid(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleAndroid(platform = platform, body = body)}

    
    
    fun loginWithGoogleIOS(platform: String?=null, body: OAuthRequestSchema): Deferred<Response<AuthSuccess>>? {
        return userApiList?.loginWithGoogleIOS(platform = platform, body = body)}

    
    
    fun loginWithOTP(platform: String?=null, body: SendOtpRequestSchema): Deferred<Response<SendOtpResponse>>? {
        return userApiList?.loginWithOTP(platform = platform, body = body)}

    
    
    fun loginWithEmailAndPassword(body: PasswordLoginRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithEmailAndPassword(body = body)}

    
    
    fun sendResetPasswordEmail(platform: String?=null, body: SendResetPasswordEmailRequestSchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetPasswordEmail(platform = platform, body = body)}

    
    
    fun forgotPassword(body: ForgotPasswordRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.forgotPassword(body = body)}

    
    
    fun sendResetToken(body: CodeRequestBodySchema): Deferred<Response<ResetPasswordSuccess>>? {
        return userApiList?.sendResetToken(body = body)}

    
    
    fun loginWithToken(body: TokenRequestBodySchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.loginWithToken(body = body)}

    
    
    fun registerWithForm(platform: String?=null, body: FormRegisterRequestSchema): Deferred<Response<RegisterFormSuccess>>? {
        return userApiList?.registerWithForm(platform = platform, body = body)}

    
    
    fun verifyEmail(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyEmail(body = body)}

    
    
    fun verifyMobile(body: CodeRequestBodySchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.verifyMobile(body = body)}

    
    
    fun hasPassword(): Deferred<Response<HasPasswordSuccess>>? {
        return userApiList?.hasPassword()}

    
    
    fun updatePassword(body: UpdatePasswordRequestSchema): Deferred<Response<VerifyEmailSuccess>>? {
        return userApiList?.updatePassword(body = body)}

    
    
    fun logout(): Deferred<Response<LogoutSuccess>>? {
        return userApiList?.logout()}

    
    
    fun sendOTPOnMobile(platform: String?=null, body: SendMobileOtpRequestSchema): Deferred<Response<OtpSuccess>>? {
        return userApiList?.sendOTPOnMobile(platform = platform, body = body)}

    
    
    fun verifyMobileOTP(platform: String?=null, body: VerifyOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyMobileOTP(platform = platform, body = body)}

    
    
    fun sendOTPOnEmail(platform: String?=null, body: SendEmailOtpRequestSchema): Deferred<Response<EmailOtpSuccess>>? {
        return userApiList?.sendOTPOnEmail(platform = platform, body = body)}

    
    
    fun verifyEmailOTP(platform: String?=null, body: VerifyEmailOtpRequestSchema): Deferred<Response<VerifyOtpSuccess>>? {
        return userApiList?.verifyEmailOTP(platform = platform, body = body)}

    
    
    fun getLoggedInUser(): Deferred<Response<UserObjectSchema>>? {
        return userApiList?.getLoggedInUser()}

    
    
    fun getListOfActiveSessions(): Deferred<Response<SessionListSuccess>>? {
        return userApiList?.getListOfActiveSessions()}

    
    
    fun getPlatformConfig(name: String?=null): Deferred<Response<PlatformSchema>>? {
        return userApiList?.getPlatformConfig(name = name)}

    
    
    fun updateProfile(platform: String?=null, body: EditProfileRequestSchema): Deferred<Response<ProfileEditSuccess>>? {
        return userApiList?.updateProfile(platform = platform, body = body)}

    
    
    fun addMobileNumber(platform: String?=null, body: EditMobileRequestSchema): Deferred<Response<VerifyMobileOTPSuccess>>? {
        return userApiList?.addMobileNumber(platform = platform, body = body)}

    
    
    fun deleteMobileNumber(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteMobileNumber(platform = platform, active = active, primary = primary, verified = verified, countryCode = countryCode, phone = phone)}

    
    
    fun setMobileNumberAsPrimary(body: SendVerificationLinkMobileRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setMobileNumberAsPrimary(body = body)}

    
    
    fun sendVerificationLinkToMobile(platform: String?=null, body: SendVerificationLinkMobileRequestSchema): Deferred<Response<SendMobileVerifyLinkSuccess>>? {
        return userApiList?.sendVerificationLinkToMobile(platform = platform, body = body)}

    
    
    fun addEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<VerifyEmailOTPSuccess>>? {
        return userApiList?.addEmail(platform = platform, body = body)}

    
    
    fun deleteEmail(platform: String?=null, active: Boolean, primary: Boolean, verified: Boolean, email: String): Deferred<Response<LoginSuccess>>? {
        return userApiList?.deleteEmail(platform = platform, active = active, primary = primary, verified = verified, email = email)}

    
    
    fun setEmailAsPrimary(body: EditEmailRequestSchema): Deferred<Response<LoginSuccess>>? {
        return userApiList?.setEmailAsPrimary(body = body)}

    
    
    fun sendVerificationLinkToEmail(platform: String?=null, body: EditEmailRequestSchema): Deferred<Response<SendEmailVerifyLinkSuccess>>? {
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
        return communicationApiList?.getCommunicationConsent()}

    
    
    fun upsertCommunicationConsent(body: CommunicationConsentReq): Deferred<Response<CommunicationConsentRes>>? {
        return communicationApiList?.upsertCommunicationConsent(body = body)}

    
    
    fun upsertAppPushtoken(body: PushtokenReq): Deferred<Response<PushtokenRes>>? {
        return communicationApiList?.upsertAppPushtoken(body = body)}

    
    
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
        return shareApiList?.getApplicationQRCode()}

    
    
    fun getProductQRCodeBySlug(slug: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getProductQRCodeBySlug(slug = slug)}

    
    
    fun getCollectionQRCodeBySlug(slug: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getCollectionQRCodeBySlug(slug = slug)}

    
    
    fun getUrlQRCode(url: String): Deferred<Response<QRCodeResp>>? {
        return shareApiList?.getUrlQRCode(url = url)}

    
    
    fun createShortLink(body: ShortLinkReq): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.createShortLink(body = body)}

    
    
    fun getShortLinkByHash(hash: String): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.getShortLinkByHash(hash = hash)}

    
    
    fun getOriginalShortLinkByHash(hash: String): Deferred<Response<ShortLinkRes>>? {
        return shareApiList?.getOriginalShortLinkByHash(hash = hash)}

    
    
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
    
    fun startUpload(namespace: String, body: StartRequest): Deferred<Response<StartResponse>>? {
        return fileStorageApiList?.startUpload(namespace = namespace, body = body)}

    
    
    fun completeUpload(namespace: String, body: StartResponse): Deferred<Response<CompleteResponse>>? {
        return fileStorageApiList?.completeUpload(namespace = namespace, body = body)}

    
    
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
        return configurationApiList?.getApplication()}

    
    
    fun getOwnerInfo(): Deferred<Response<ApplicationAboutResponse>>? {
        return configurationApiList?.getOwnerInfo()}

    
    
    fun getBasicDetails(): Deferred<Response<ApplicationDetail>>? {
        return configurationApiList?.getBasicDetails()}

    
    
    fun getIntegrationTokens(): Deferred<Response<AppTokenResponse>>? {
        return configurationApiList?.getIntegrationTokens()}

    
    
    fun getOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null): Deferred<Response<OrderingStores>>? {
        return configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStores
    **/
    fun getOrderingStoresPaginator(pageSize: Int?=null, q: String?=null) : Paginator<OrderingStores>{

    val paginator = Paginator<OrderingStores>()

    paginator.setCallBack(object : PaginatorCallback<OrderingStores> {

            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
    
    fun getFeatures(): Deferred<Response<AppFeatureResponse>>? {
        return configurationApiList?.getFeatures()}

    
    
    fun getContactInfo(): Deferred<Response<ApplicationInformation>>? {
        return configurationApiList?.getContactInfo()}

    
    
    fun getCurrencies(): Deferred<Response<CurrenciesResponse>>? {
        return configurationApiList?.getCurrencies()}

    
    
    fun getCurrencyById(id: String): Deferred<Response<Currency>>? {
        return configurationApiList?.getCurrencyById(id = id)}

    
    
    fun getLanguages(): Deferred<Response<LanguageResponse>>? {
        return configurationApiList?.getLanguages()}

    
    
    fun getOrderingStoreCookie(body: OrderingStoreSelectRequest): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.getOrderingStoreCookie(body = body)}

    
    
    fun removeOrderingStoreCookie(): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.removeOrderingStoreCookie()}

    
    
    fun getAppStaffs(orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null): Deferred<Response<AppStaffResponse>>? {
        return configurationApiList?.getAppStaffs(orderIncent = orderIncent, orderingStore = orderingStore, user = user)}

    
    
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
    
    fun getAggregatorsConfig(xApiToken: String?=null, refresh: Boolean?=null): Deferred<Response<AggregatorsConfigDetailResponse>>? {
        return paymentApiList?.getAggregatorsConfig(xApiToken = xApiToken, refresh = refresh)}

    
    
    fun attachCardToCustomer(body: AttachCardRequest): Deferred<Response<AttachCardsResponse>>? {
        return paymentApiList?.attachCardToCustomer(body = body)}

    
    
    fun getActiveCardAggregator(refresh: Boolean?=null): Deferred<Response<ActiveCardPaymentGatewayResponse>>? {
        return paymentApiList?.getActiveCardAggregator(refresh = refresh)}

    
    
    fun getActiveUserCards(forceRefresh: Boolean?=null): Deferred<Response<ListCardsResponse>>? {
        return paymentApiList?.getActiveUserCards(forceRefresh = forceRefresh)}

    
    
    fun deleteUserCard(body: DeletehCardRequest): Deferred<Response<DeleteCardsResponse>>? {
        return paymentApiList?.deleteUserCard(body = body)}

    
    
    fun verifyCustomerForPayment(body: ValidateCustomerRequest): Deferred<Response<ValidateCustomerResponse>>? {
        return paymentApiList?.verifyCustomerForPayment(body = body)}

    
    
    fun verifyAndChargePayment(body: ChargeCustomerRequest): Deferred<Response<ChargeCustomerResponse>>? {
        return paymentApiList?.verifyAndChargePayment(body = body)}

    
    
    fun initialisePayment(body: PaymentInitializationRequest): Deferred<Response<PaymentInitializationResponse>>? {
        return paymentApiList?.initialisePayment(body = body)}

    
    
    fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest): Deferred<Response<PaymentStatusUpdateResponse>>? {
        return paymentApiList?.checkAndUpdatePaymentStatus(body = body)}

    
    
    fun getPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, cardReference = cardReference, userDetails = userDetails)}

    
    
    fun getPosPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, orderType: String, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPosPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, cardReference = cardReference, orderType = orderType, userDetails = userDetails)}

    
    
    fun getRupifiBannerDetails(): Deferred<Response<RupifiBannerResponse>>? {
        return paymentApiList?.getRupifiBannerDetails()}

    
    
    fun getActiveRefundTransferModes(): Deferred<Response<TransferModeResponse>>? {
        return paymentApiList?.getActiveRefundTransferModes()}

    
    
    fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferModeRequest): Deferred<Response<UpdateRefundTransferModeResponse>>? {
        return paymentApiList?.enableOrDisableRefundTransferMode(body = body)}

    
    
    fun getUserBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getUserBeneficiariesDetail(orderId = orderId)}

    
    
    fun verifyIfscCode(ifscCode: String?=null): Deferred<Response<IfscCodeResponse>>? {
        return paymentApiList?.verifyIfscCode(ifscCode = ifscCode)}

    
    
    fun getOrderBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getOrderBeneficiariesDetail(orderId = orderId)}

    
    
    fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest): Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(body = body)}

    
    
    fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest): Deferred<Response<RefundAccountResponse>>? {
        return paymentApiList?.addBeneficiaryDetails(body = body)}

    
    
    fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest): Deferred<Response<WalletOtpResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(body = body)}

    
    
    fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest): Deferred<Response<SetDefaultBeneficiaryResponse>>? {
        return paymentApiList?.updateDefaultBeneficiary(body = body)}

    
    
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
    
    fun getOrders(pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, status: Int?=null): Deferred<Response<OrderList>>? {
        return orderApiList?.getOrders(pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, status = status)}

    
    
    fun getOrderById(orderId: String): Deferred<Response<OrderById>>? {
        return orderApiList?.getOrderById(orderId = orderId)}

    
    
    fun getShipmentById(shipmentId: String): Deferred<Response<ShipmentById>>? {
        return orderApiList?.getShipmentById(shipmentId = shipmentId)}

    
    
    fun getShipmentReasons(shipmentId: String): Deferred<Response<ShipmentReasons>>? {
        return orderApiList?.getShipmentReasons(shipmentId = shipmentId)}

    
    
    fun updateShipmentStatus(shipmentId: String, body: ShipmentStatusUpdateBody): Deferred<Response<ShipmentStatusUpdate>>? {
        return orderApiList?.updateShipmentStatus(shipmentId = shipmentId, body = body)}

    
    
    fun trackShipment(shipmentId: String): Deferred<Response<ShipmentTrack>>? {
        return orderApiList?.trackShipment(shipmentId = shipmentId)}

    
    
    fun getPosOrderById(orderId: String): Deferred<Response<PosOrderById>>? {
        return orderApiList?.getPosOrderById(orderId = orderId)}

    
    
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
        return rewardsApiList?.getPointsOnProduct(body = body)}

    
    
    fun getOfferByName(name: String): Deferred<Response<Offer>>? {
        return rewardsApiList?.getOfferByName(name = name)}

    
    
    fun getOrderDiscount(body: OrderDiscountRequest): Deferred<Response<OrderDiscountResponse>>? {
        return rewardsApiList?.getOrderDiscount(body = body)}

    
    
    fun getUserPoints(): Deferred<Response<PointsResponse>>? {
        return rewardsApiList?.getUserPoints()}

    
    
    fun getUserPointsHistory(pageId: String?=null, pageSize: Int?=null): Deferred<Response<PointsHistoryResponse>>? {
        return rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(pageSize: Int?=null) : Paginator<PointsHistoryResponse>{

    val paginator = Paginator<PointsHistoryResponse>()

    paginator.setCallBack(object : PaginatorCallback<PointsHistoryResponse> {

            override suspend fun onNext(
                onResponse: (Event<PointsHistoryResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getUserReferralDetails(): Deferred<Response<ReferralDetailsResponse>>? {
        return rewardsApiList?.getUserReferralDetails()}

    
    
    fun redeemReferralCode(body: RedeemReferralCodeRequest): Deferred<Response<RedeemReferralCodeResponse>>? {
        return rewardsApiList?.redeemReferralCode(body = body)}

    
    
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
    
    fun createAbuseReport(body: ReportAbuseRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createAbuseReport(body = body)}

    
    
    fun updateAbuseReport(body: UpdateAbuseStatusRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateAbuseReport(body = body)}

    
    
    fun getAbuseReports(entityId: String, entityType: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReportAbuseGetResponse>>? {
        return feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbuseReports
    **/
    fun getAbuseReportsPaginator(entityId: String, entityType: String, id: String?=null, pageSize: Int?=null) : Paginator<ReportAbuseGetResponse>{

    val paginator = Paginator<ReportAbuseGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReportAbuseGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReportAbuseGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getAttributes(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<AttributeResponse>>? {
        return feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAttributes
    **/
    fun getAttributesPaginator(pageSize: Int?=null) : Paginator<AttributeResponse>{

    val paginator = Paginator<AttributeResponse>()

    paginator.setCallBack(object : PaginatorCallback<AttributeResponse> {

            override suspend fun onNext(
                onResponse: (Event<AttributeResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun createAttribute(body: SaveAttributeRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createAttribute(body = body)}

    
    
    fun getAttribute(slug: String): Deferred<Response<Attribute>>? {
        return feedbackApiList?.getAttribute(slug = slug)}

    
    
    fun updateAttribute(slug: String, body: UpdateAttributeRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateAttribute(slug = slug, body = body)}

    
    
    fun createComment(body: CommentRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createComment(body = body)}

    
    
    fun updateComment(body: UpdateCommentRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateComment(body = body)}

    
    
    fun getComments(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<CommentGetResponse>>? {
        return feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getComments
    **/
    fun getCommentsPaginator(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageSize: Int?=null) : Paginator<CommentGetResponse>{

    val paginator = Paginator<CommentGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<CommentGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<CommentGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun checkEligibility(entityType: String, entityId: String): Deferred<Response<CheckEligibilityResponse>>? {
        return feedbackApiList?.checkEligibility(entityType = entityType, entityId = entityId)}

    
    
    fun deleteMedia(ids: ArrayList<String>): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.deleteMedia(ids = ids)}

    
    
    fun createMedia(body: AddMediaListRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createMedia(body = body)}

    
    
    fun updateMedia(body: UpdateMediaListRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateMedia(body = body)}

    
    
    fun getMedias(entityType: String, entityId: String, id: String?=null, type: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<MediaGetResponse>>? {
        return feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, type = type, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getMedias
    **/
    fun getMediasPaginator(entityType: String, entityId: String, id: String?=null, type: String?=null, pageSize: Int?=null) : Paginator<MediaGetResponse>{

    val paginator = Paginator<MediaGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<MediaGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<MediaGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, type = type, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getReviewSummaries(entityType: String, entityId: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReviewMetricGetResponse>>? {
        return feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviewSummaries
    **/
    fun getReviewSummariesPaginator(entityType: String, entityId: String, id: String?=null, pageSize: Int?=null) : Paginator<ReviewMetricGetResponse>{

    val paginator = Paginator<ReviewMetricGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReviewMetricGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReviewMetricGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun createReview(body: UpdateReviewRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.createReview(body = body)}

    
    
    fun updateReview(body: UpdateReviewRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateReview(body = body)}

    
    
    fun getReviews(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, active: Boolean?=null, approve: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReviewGetResponse>>? {
        return feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, active = active, approve = approve, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviews
    **/
    fun getReviewsPaginator(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, active: Boolean?=null, approve: Boolean?=null, pageSize: Int?=null) : Paginator<ReviewGetResponse>{

    val paginator = Paginator<ReviewGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReviewGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReviewGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, active = active, approve = approve, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getTemplates(templateId: String?=null, entityId: String?=null, entityType: String?=null): Deferred<Response<TemplateGetResponse>>? {
        return feedbackApiList?.getTemplates(templateId = templateId, entityId = entityId, entityType = entityType)}

    
    
    fun createQuestion(body: CreateQNARequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createQuestion(body = body)}

    
    
    fun updateQuestion(body: UpdateQNARequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateQuestion(body = body)}

    
    
    fun getQuestionAndAnswers(entityType: String, entityId: String, id: String?=null, userId: String?=null, showAnswer: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<QNAGetResponse>>? {
        return feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, userId = userId, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getQuestionAndAnswers
    **/
    fun getQuestionAndAnswersPaginator(entityType: String, entityId: String, id: String?=null, userId: String?=null, showAnswer: Boolean?=null, pageSize: Int?=null) : Paginator<QNAGetResponse>{

    val paginator = Paginator<QNAGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<QNAGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<QNAGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, userId = userId, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getVotes(id: String?=null, refType: String?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<VoteResponse>>? {
        return feedbackApiList?.getVotes(id = id, refType = refType, pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getVotes
    **/
    fun getVotesPaginator(id: String?=null, refType: String?=null, pageSize: Int?=null) : Paginator<VoteResponse>{

    val paginator = Paginator<VoteResponse>()

    paginator.setCallBack(object : PaginatorCallback<VoteResponse> {

            override suspend fun onNext(
                onResponse: (Event<VoteResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                feedbackApiList?.getVotes(id = id, refType = refType, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun createVote(body: VoteRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createVote(body = body)}

    
    
    fun updateVote(body: UpdateVoteRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateVote(body = body)}

    
    
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
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.getCart(id = id, i = i, b = b, assignCardId = assignCardId)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        return posCartApiList?.getCartLastModified(id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        return posCartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        return posCartApiList?.updateCart(id = id, i = i, b = b, body = body)}

    
    
    fun getItemCount(id: String?=null): Deferred<Response<CartItemCountResponse>>? {
        return posCartApiList?.getItemCount(id = id)}

    
    
    fun getCoupons(id: String?=null): Deferred<Response<GetCouponResponse>>? {
        return posCartApiList?.getCoupons(id = id)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.applyCoupon(i = i, b = b, p = p, id = id, body = body)}

    
    
    fun removeCoupon(id: String?=null): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.removeCoupon(id = id)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return posCartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: RewardPointRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.applyRewardPoints(id = id, i = i, b = b, body = body)}

    
    
    fun getAddresses(cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return posCartApiList?.getAddresses(cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return posCartApiList?.addAddress(body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return posCartApiList?.getAddressById(id = id, cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return posCartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return posCartApiList?.removeAddress(id = id)}

    
    
    fun selectAddress(cartId: String?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.selectAddress(cartId = cartId, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.selectPaymentMode(id = id, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidate>>? {
        return posCartApiList?.validateCouponForPayment(id = id, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode)}

    
    
    fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.getShipments(pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, p = p, id = id, addressId = addressId, areaCode = areaCode, orderType = orderType)}

    
    
    fun updateShipments(i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, orderType: String?=null, body: UpdateCartShipmentRequest): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.updateShipments(i = i, p = p, id = id, addressId = addressId, orderType = orderType, body = body)}

    
    
    fun checkoutCart(id: String?=null, body: CartPosCheckoutDetailRequest): Deferred<Response<CartCheckoutResponse>>? {
        return posCartApiList?.checkoutCart(id = id, body = body)}

    
    
    fun updateCartMeta(id: String?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return posCartApiList?.updateCartMeta(id = id, body = body)}

    
    
    fun getAvailableDeliveryModes(areaCode: String, id: String?=null): Deferred<Response<CartDeliveryModesResponse>>? {
        return posCartApiList?.getAvailableDeliveryModes(areaCode = areaCode, id = id)}

    
    
    fun getStoreAddressByUid(storeUid: Int): Deferred<Response<StoreDetailsResponse>>? {
        return posCartApiList?.getStoreAddressByUid(storeUid = storeUid)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return posCartApiList?.getCartShareLink(body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.getCartSharedItems(token = token)}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.updateCartWithSharedItems(token = token, action = action)}

    
    
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
        return logisticApiList?.getTatProduct(body = body)}

    
    
    fun getPincodeCity(pincode: String): Deferred<Response<GetPincodeCityResponse>>? {
        return logisticApiList?.getPincodeCity(pincode = pincode)}

    
    
}

