package com.sdk.platform.cart

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
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCoupons(pageNo: Int?=null, pageSize: Int?=null, isArchived: Boolean?=null, title: String?=null, isPublic: Boolean?=null, isDisplay: Boolean?=null, typeSlug: String?=null, code: String?=null)
    : Response<CouponsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code )
        } else {
            null
        }
    }
    
    
    suspend fun createCoupon(body: CouponAdd)
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCoupon(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponById(id: String)
    : Response<CouponUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCoupon(id: String,body: CouponUpdate)
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCoupon(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCouponPartially(id: String,body: CouponPartialUpdate)
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCouponPartially(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotions(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, isActive: Boolean?=null, promoGroup: String?=null, promotionType: String?=null, fpPanel: String?=null, promotionId: String?=null)
    : Response<PromotionsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, isActive = isActive, promoGroup = promoGroup, promotionType = promotionType, fpPanel = fpPanel, promotionId = promotionId )
        } else {
            null
        }
    }
    
    
    suspend fun createPromotion(body: PromotionAdd)
    : Response<PromotionAdd>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createPromotion(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionById(id: String)
    : Response<PromotionUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotion(id: String,body: PromotionUpdate)
    : Response<PromotionUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotion(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotionPartially(id: String,body: PromotionPartialUpdate)
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotionPartially(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPromosCouponConfig(entityType: String?=null, isHidden: Boolean?=null)
    : Response<ActivePromosResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromosCouponConfig(companyId = config.companyId , applicationId = applicationId , entityType = entityType, isHidden = isHidden )
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMetaConfig(cartMetaId: String,body: CartMetaConfigUpdate)
    : Response<CartMetaConfigUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMetaConfig(companyId = config.companyId , applicationId = applicationId , cartMetaId = cartMetaId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun fetchCartMetaConfig()
    : Response<CartMetaConfigAdd>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchCartMetaConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCartMetaConfig(body: CartMetaConfigAdd)
    : Response<CartMetaConfigAdd>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCartMetaConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePriceAdjustment(id: String,body: PriceAdjustmentUpdate)
    : Response<PriceAdjustmentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePriceAdjustment(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removePriceAdjustment(id: String)
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removePriceAdjustment(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addPriceAdjustment(body: PriceAdjustmentAdd)
    : Response<PriceAdjustmentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addPriceAdjustment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPriceAdjustments(cartId: String)
    : Response<PriceAdjustmentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPriceAdjustments(companyId = config.companyId , applicationId = applicationId , cartId = cartId )
        } else {
            null
        }
    }
    
    
    suspend fun fetchAndvalidateCartItems(body: OpenapiCartDetailsRequest)
    : Response<OpenapiCartDetailsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchAndvalidateCartItems(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkCartServiceability(body: OpenApiCartServiceabilityRequest)
    : Response<OpenApiCartServiceabilityResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkCartServiceability(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(body: OpenApiPlatformCheckoutReq)
    : Response<OpenApiCheckoutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCart(pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, anonymousCart: Boolean?=null, lastId: String?=null, sortOn: String?=null)
    : Response<AbandonedCartResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCart(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, anonymousCart = anonymousCart, lastId = lastId, sortOn = sortOn )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCartDetails(id: String?=null, i: Boolean?=null, b: Boolean?=null, c: Boolean?=null)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCartDetails(companyId = config.companyId , applicationId = applicationId , id = id, i = i, b = b, c = c )
        } else {
            null
        }
    }
    
    
    suspend fun addItems(cartId: String, b: Boolean?=null,body: AddCartRequest)
    : Response<AddCartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addItems(companyId = config.companyId , applicationId = applicationId , cartId = cartId, b = b, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCart(cartId: String, b: Boolean?=null,body: UpdateCartRequest)
    : Response<UpdateCartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCart(companyId = config.companyId , applicationId = applicationId , cartId = cartId, b = b, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponOptionValues()
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponOptionValues(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCouponCodeExists(code: String?=null)
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponCodeExists(companyId = config.companyId , applicationId = applicationId , code = code )
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionCodeExists(code: String?=null)
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionCodeExists(companyId = config.companyId , applicationId = applicationId , code = code )
        } else {
            null
        }
    }
    
    
    suspend fun overrideCart(body: OverrideCheckoutReq)
    : Response<OverrideCheckoutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.overrideCart(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCartShareLink(body: GetShareCartLinkRequest)
    : Response<GetShareCartLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartShareLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCartSharedItems(token: String)
    : Response<SharedCartResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartSharedItems(companyId = config.companyId , applicationId = applicationId , token = token )
        } else {
            null
        }
    }
    
    
    suspend fun updateCartWithSharedItems(token: String, action: String, cartId: String?=null)
    : Response<SharedCartResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartWithSharedItems(companyId = config.companyId , applicationId = applicationId , token = token, action = action, cartId = cartId )
        } else {
            null
        }
    }
    
    
    suspend fun getCartList(fromDate: String?=null, toDate: String?=null, filterOn: String?=null)
    : Response<MultiCartResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartList(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate, filterOn = filterOn )
        } else {
            null
        }
    }
    
    
    suspend fun updateCartUser(id: String?=null,body: UpdateUserCartMapping)
    : Response<UserCartMappingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartUser(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCart(id: String?=null, userId: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null, buyNow: Boolean?=null)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCart(companyId = config.companyId , applicationId = applicationId , id = id, userId = userId, i = i, b = b, assignCardId = assignCardId, buyNow = buyNow )
        } else {
            null
        }
    }
    
    
    suspend fun platformAddItems(i: Boolean?=null, b: Boolean?=null, buyNow: Boolean?=null, id: String?=null,body: PlatformAddCartRequest)
    : Response<AddCartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformAddItems(companyId = config.companyId , applicationId = applicationId , i = i, b = b, buyNow = buyNow, id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun platformUpdateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, buyNow: Boolean?=null,body: PlatformUpdateCartRequest)
    : Response<UpdateCartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformUpdateCart(companyId = config.companyId , applicationId = applicationId , id = id, i = i, b = b, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCart(id: String?=null,body: DeleteCartRequest)
    : Response<DeleteCartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deleteCart(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getItemCount(id: String?=null, buyNow: Boolean?=null)
    : Response<CartItemCountResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getItemCount(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow )
        } else {
            null
        }
    }
    
    
    suspend fun getAppCoupons(id: String?=null, buyNow: Boolean?=null, slug: String?=null, storeId: String?=null)
    : Response<GetCouponResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAppCoupons(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, slug = slug, storeId = storeId )
        } else {
            null
        }
    }
    
    
    suspend fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, buyNow: Boolean?=null,body: ApplyCouponRequest)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.applyCoupon(companyId = config.companyId , applicationId = applicationId , i = i, b = b, p = p, id = id, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeCoupon(uid: String?=null, buyNow: Boolean?=null)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeCoupon(companyId = config.companyId , applicationId = applicationId , uid = uid, buyNow = buyNow )
        } else {
            null
        }
    }
    
    
    suspend fun getAddresses(cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null, userId: String?=null)
    : Response<PlatformGetAddressesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddresses(companyId = config.companyId , applicationId = applicationId , cartId = cartId, buyNow = buyNow, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault, userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun addAddress(body: PlatformAddress)
    : Response<SaveAddressResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addAddress(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAddressById(id: String, cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null, userId: String?=null)
    : Response<PlatformAddress>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddressById(companyId = config.companyId , applicationId = applicationId , id = id, cartId = cartId, buyNow = buyNow, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault, userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun updateAddress(id: String,body: PlatformAddress)
    : Response<UpdateAddressResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateAddress(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeAddress(id: String, userId: String?=null)
    : Response<DeleteAddressResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeAddress(companyId = config.companyId , applicationId = applicationId , id = id, userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun selectAddress(cartId: String?=null, buyNow: Boolean?=null, i: Boolean?=null, b: Boolean?=null,body: PlatformSelectCartAddressRequest)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectAddress(companyId = config.companyId , applicationId = applicationId , cartId = cartId, buyNow = buyNow, i = i, b = b, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null)
    : Response<PlatformCartShipmentsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getShipments(companyId = config.companyId , applicationId = applicationId , pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, i = i, p = p, id = id, addressId = addressId, areaCode = areaCode, orderType = orderType )
        } else {
            null
        }
    }
    
    
    suspend fun updateShipments(i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null,body: UpdateCartShipmentRequest)
    : Response<PlatformCartShipmentsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateShipments(companyId = config.companyId , applicationId = applicationId , i = i, p = p, id = id, addressId = addressId, areaCode = areaCode, orderType = orderType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMeta(id: String?=null, buyNow: Boolean?=null,body: PlatformCartMetaRequest)
    : Response<CartMetaResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMeta(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCart(id: String?=null,body: PlatformCartCheckoutDetailRequest)
    : Response<CartCheckoutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCart(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAvailableDeliveryModes(areaCode: String, id: String?=null)
    : Response<CartDeliveryModesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAvailableDeliveryModes(companyId = config.companyId , applicationId = applicationId , areaCode = areaCode, id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getStoreAddressByUid(storeUid: Int)
    : Response<StoreDetailsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getStoreAddressByUid(companyId = config.companyId , applicationId = applicationId , storeUid = storeUid )
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentMode(id: String?=null, buyNow: Boolean?=null, orderType: String?=null,body: UpdateCartPaymentRequest)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentMode(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, orderType = orderType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun validateCouponForPayment(id: String?=null, buyNow: Boolean?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null)
    : Response<PaymentCouponValidate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.validateCouponForPayment(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode )
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCartV2(id: String?=null,body: PlatformCartCheckoutDetailV2Request)
    : Response<CartCheckoutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCartV2(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentModeV2(id: String?=null, buyNow: Boolean?=null, orderType: String?=null,body: UpdateCartPaymentRequestV2)
    : Response<CartDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentModeV2(companyId = config.companyId , applicationId = applicationId , id = id, buyNow = buyNow, orderType = orderType, body = body)
        } else {
            null
        }
    }
    
}
}