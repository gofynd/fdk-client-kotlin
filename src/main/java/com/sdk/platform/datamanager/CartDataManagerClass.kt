package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class CartDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val cartApiList by lazy {
        generatecartApiList()
    }
    
    private fun generatecartApiList(): CartApiList? {
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
            namespace = "PlatformCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCoupons(pageNo: Int?=null, pageSize: Int?=null, isArchived: Boolean?=null, title: String?=null, isPublic: Boolean?=null, isDisplay: Boolean?=null, typeSlug: String?=null, code: String?=null)
    : Deferred<Response<CouponsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCoupons
    **/
    fun getCouponsPaginator(
    pageSize: Int?=null, isArchived: Boolean?=null, title: String?=null, isPublic: Boolean?=null, isDisplay: Boolean?=null, typeSlug: String?=null, code: String?=null
    
    ) : Paginator<CouponsResponse>{
        val paginator = Paginator<CouponsResponse>()
        paginator.setCallBack(object : PaginatorCallback<CouponsResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<CouponsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code)?.safeAwait{ response, error ->
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
    
    suspend fun createCoupon(body: CouponAdd)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCoupon(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponById(id: String)
    : Deferred<Response<CouponUpdate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCoupon(id: String,body: CouponUpdate)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCoupon(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCouponPartially(id: String,body: CouponPartialUpdate)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCouponPartially(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotions(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, status: String?=null, promoGroup: String?=null, promotionType: String?=null, fpPanel: String?=null, promotionId: String?=null)
    : Deferred<Response<PromotionsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, status = status, promoGroup = promoGroup, promotionType = promotionType, fpPanel = fpPanel, promotionId = promotionId )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPromotions
    **/
    fun getPromotionsPaginator(
    pageSize: Int?=null, q: String?=null, status: String?=null, promoGroup: String?=null, promotionType: String?=null, fpPanel: String?=null, promotionId: String?=null
    
    ) : Paginator<PromotionsResponse>{
        val paginator = Paginator<PromotionsResponse>()
        paginator.setCallBack(object : PaginatorCallback<PromotionsResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<PromotionsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getPromotions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, status = status, promoGroup = promoGroup, promotionType = promotionType, fpPanel = fpPanel, promotionId = promotionId)?.safeAwait{ response, error ->
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
    
    suspend fun createPromotion(body: PromotionAdd)
    : Deferred<Response<PromotionAdd>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createPromotion(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionById(id: String)
    : Deferred<Response<PromotionUpdate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotion(id: String,body: PromotionUpdate)
    : Deferred<Response<PromotionUpdate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotion(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotionPartially(id: String,body: PromotionPartialUpdate)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotionPartially(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromosCouponConfig()
    : Deferred<Response<ActivePromosResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromosCouponConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun fetchAndvalidateCartItems(body: OpenapiCartDetailsRequest)
    : Deferred<Response<OpenapiCartDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchAndvalidateCartItems(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkCartServiceability(body: OpenApiCartServiceabilityRequest)
    : Deferred<Response<OpenApiCartServiceabilityResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkCartServiceability(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(body: OpenApiPlatformCheckoutReq)
    : Deferred<Response<OpenApiCheckoutResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCart(pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, anonymousCart: Boolean?=null, lastId: String?=null, sortOn: String?=null)
    : Deferred<Response<AbandonedCartResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCart(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, anonymousCart = anonymousCart, lastId = lastId, sortOn = sortOn )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbandonedCart
    **/
    fun getAbandonedCartPaginator(
    pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, anonymousCart: Boolean?=null, lastId: String?=null, sortOn: String?=null
    
    ) : Paginator<AbandonedCartResponse>{
        val paginator = Paginator<AbandonedCartResponse>()
        paginator.setCallBack(object : PaginatorCallback<AbandonedCartResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<AbandonedCartResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getAbandonedCart(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, anonymousCart = anonymousCart, lastId = lastId, sortOn = sortOn)?.safeAwait{ response, error ->
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
    
    suspend fun getAbandonedCartDetails(id: String?=null, i: Boolean?=null, b: Boolean?=null)
    : Deferred<Response<CartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCartDetails(companyId = config.companyId , applicationId = applicationId , id = id, i = i, b = b )
        } else {
            null
        }
    }
    
    
    suspend fun addItems(cartId: String, b: Boolean?=null,body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addItems(companyId = config.companyId , applicationId = applicationId , cartId = cartId, b = b, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCart(cartId: String, b: Boolean?=null,body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCart(companyId = config.companyId , applicationId = applicationId , cartId = cartId, b = b, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCartList()
    : Deferred<Response<CartList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartList(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateCartUser(id: String?=null)
    : Deferred<Response<UserCartMappingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartUser(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null, buyNow: Boolean?=null)
    : Deferred<Response<CartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCart(companyId = config.companyId , applicationId = applicationId , id = id, i = i, b = b, assignCardId = assignCardId, buyNow = buyNow )
        } else {
            null
        }
    }
    
    
    suspend fun getCartLastModified(id: String?=null)
    : Deferred<Response<Void>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartLastModified(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addItems(i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null,body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addItems(companyId = config.companyId , applicationId = applicationId , i = i, b = b, areaCode = areaCode, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null,body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCart(companyId = config.companyId , applicationId = applicationId , id = id, i = i, b = b, areaCode = areaCode, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getItemCount(id: String?=null, buyNow: Boolean?=null)
    : Deferred<Response<CartItemCountResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getItemCount(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow )
        } else {
            null
        }
    }
    
    
    suspend fun getAddresses(cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null, userId: String?=null)
    : Deferred<Response<GetAddressesResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddresses(companyId = config.companyId , applicationId = applicationId , cartId = cartId, buyNow = buyNow, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault, userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun addAddress(body: Address)
    : Deferred<Response<SaveAddressResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addAddress(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAddressById(id: String, cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null)
    : Deferred<Response<Address>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddressById(companyId = config.companyId , applicationId = applicationId , id = id, cartId = cartId, buyNow = buyNow, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault )
        } else {
            null
        }
    }
    
    
    suspend fun updateAddress(id: String,body: Address)
    : Deferred<Response<UpdateAddressResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateAddress(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeAddress(id: String, userId: String?=null)
    : Deferred<Response<DeleteAddressResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeAddress(companyId = config.companyId , applicationId = applicationId , id = id, userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun selectAddress(cartId: String?=null, buyNow: Boolean?=null, i: Boolean?=null, b: Boolean?=null, userId: String?=null,body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectAddress(companyId = config.companyId , applicationId = applicationId , cartId = cartId, buyNow = buyNow, i = i, b = b, userId = userId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null)
    : Deferred<Response<CartShipmentsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getShipments(companyId = config.companyId , applicationId = applicationId , pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, p = p, id = id, addressId = addressId, areaCode = areaCode, orderType = orderType )
        } else {
            null
        }
    }
    
    
    suspend fun updateShipments(i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, orderType: String?=null,body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateShipments(companyId = config.companyId , applicationId = applicationId , i = i, p = p, id = id, addressId = addressId, orderType = orderType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(id: String?=null,body: CartPosCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMeta(id: String?=null, buyNow: Boolean?=null,body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMeta(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAvailableDeliveryModes(areaCode: String, id: String?=null)
    : Deferred<Response<CartDeliveryModesResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAvailableDeliveryModes(companyId = config.companyId , applicationId = applicationId , areaCode = areaCode, id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getStoreAddressByUid(storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getStoreAddressByUid(companyId = config.companyId , applicationId = applicationId , storeUid = storeUid )
        } else {
            null
        }
    }
    
}
}