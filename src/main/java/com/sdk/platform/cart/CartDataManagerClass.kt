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

    
    
    suspend fun getCoupons(pageNo: Int?=null,pageSize: Int?=null,isArchived: Boolean?=null,title: String?=null,isPublic: Boolean?=null,isDisplay: Boolean?=null,typeSlug: String?=null,code: String?=null,createdBy: String?=null,reviewedBy: String?=null,approvedStartTime: String?=null,approvedEndTime: String?=null,reviewStartTime: String?=null,reviewEndTime: String?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CouponsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCoupons(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,isArchived = isArchived,title = title,isPublic = isPublic,isDisplay = isDisplay,typeSlug = typeSlug,code = code,createdBy = createdBy,reviewedBy = reviewedBy,approvedStartTime = approvedStartTime,approvedEndTime = approvedEndTime,reviewStartTime = reviewStartTime,reviewEndTime = reviewEndTime,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCoupon(body: CouponAdd, headers: Map<String, String> = emptyMap())
    : Response<CouponCreateResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCoupon(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponById(id: String, headers: Map<String, String> = emptyMap())
    : Response<CouponUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCoupon(id: String,body: CouponUpdate, headers: Map<String, String> = emptyMap())
    : Response<CouponCreateResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCoupon(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCouponPartially(id: String,body: CouponPartialUpdate, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCouponPartially(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCoupon(id: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deleteCoupon(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotions(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,isActive: Boolean?=null,promoGroup: String?=null,promotionType: String?=null,fpPanel: String?=null,promotionId: String?=null,createdBy: String?=null,reviewedBy: String?=null,approvedStartTime: String?=null,approvedEndTime: String?=null,reviewStartTime: String?=null,reviewEndTime: String?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PromotionsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q,isActive = isActive,promoGroup = promoGroup,promotionType = promotionType,fpPanel = fpPanel,promotionId = promotionId,createdBy = createdBy,reviewedBy = reviewedBy,approvedStartTime = approvedStartTime,approvedEndTime = approvedEndTime,reviewStartTime = reviewStartTime,reviewEndTime = reviewEndTime,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPromotion(body: PromotionAdd, headers: Map<String, String> = emptyMap())
    : Response<PromotionAddResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createPromotion(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionById(id: String, headers: Map<String, String> = emptyMap())
    : Response<PromotionUpdateResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotion(id: String,body: PromotionUpdate, headers: Map<String, String> = emptyMap())
    : Response<PromotionUpdateResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotion(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePromotionPartially(id: String,body: PromotionPartialUpdate, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePromotionPartially(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deletePromotion(id: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deletePromotion(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromosCouponConfig(entityType: String?=null,isHidden: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<ActivePromosResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromosCouponConfig(companyId = config.companyId ,applicationId = applicationId ,entityType = entityType,isHidden = isHidden, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionOffers(slug: String?=null,pageSize: Int?=null,promotionGroup: String?=null,storeId: Int?=null,cartType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PromotionOffersDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionOffers(companyId = config.companyId ,applicationId = applicationId ,slug = slug,pageSize = pageSize,promotionGroup = promotionGroup,storeId = storeId,cartType = cartType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionPaymentOffers(id: String?=null,uid: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<PromotionPaymentOffersDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionPaymentOffers(companyId = config.companyId ,applicationId = applicationId ,id = id,uid = uid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMetaConfig(cartMetaId: String,body: CartMetaConfigUpdate, headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigUpdate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMetaConfig(companyId = config.companyId ,applicationId = applicationId ,cartMetaId = cartMetaId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun fetchCartMetaConfig( headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigAdd>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchCartMetaConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCartMetaConfig(body: CartMetaConfigAdd, headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigAdd>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCartMetaConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePriceAdjustment(id: String,body: PriceAdjustmentUpdate, headers: Map<String, String> = emptyMap())
    : Response<GetPriceAdjustmentResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updatePriceAdjustment(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removePriceAdjustment(id: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removePriceAdjustment(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addPriceAdjustment(body: PriceAdjustmentAdd, headers: Map<String, String> = emptyMap())
    : Response<GetPriceAdjustmentResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addPriceAdjustment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPriceAdjustments(cartId: String, headers: Map<String, String> = emptyMap())
    : Response<GetPriceAdjustmentResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPriceAdjustments(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun fetchAndvalidateCartItems(xOrderingSource: OrderingSource?=null,body: OpenapiCartDetailsCreation, headers: Map<String, String> = emptyMap())
    : Response<OpenapiCartDetailsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchAndvalidateCartItems(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkCartServiceability(xOrderingSource: OrderingSource?=null,body: OpenApiCartServiceabilityCreation, headers: Map<String, String> = emptyMap())
    : Response<OpenApiCartServiceabilityResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkCartServiceability(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(xOrderingSource: OrderingSource?=null,body: OpenApiPlatformCheckoutReq, headers: Map<String, String> = emptyMap())
    : Response<OpenApiCheckoutResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCart(pageNo: Int?=null,pageSize: Int?=null,fromDate: String?=null,toDate: String?=null,anonymousCart: Boolean?=null,lastId: String?=null,sortOn: String?=null, headers: Map<String, String> = emptyMap())
    : Response<AbandonedCartResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCart(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,fromDate = fromDate,toDate = toDate,anonymousCart = anonymousCart,lastId = lastId,sortOn = sortOn, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCartDetails(id: String?=null,i: Boolean?=null,b: Boolean?=null,c: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCartDetails(companyId = config.companyId ,applicationId = applicationId ,id = id,i = i,b = b,c = c, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addItems(cartId: String,b: Boolean?=null,body: AddCartCreation, headers: Map<String, String> = emptyMap())
    : Response<AddCartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addItems(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCart(cartId: String,b: Boolean?=null,body: UpdateCartCreation, headers: Map<String, String> = emptyMap())
    : Response<UpdateCartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCart(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponOptionValues( headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponOptionValues(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponCodeExists(code: String?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponCodeExists(companyId = config.companyId ,applicationId = applicationId ,code = code, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionCodeExists(code: String?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionCodeExists(companyId = config.companyId ,applicationId = applicationId ,code = code, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun overrideCart(xOrderingSource: OrderingSource?=null,body: OverrideCheckoutReq, headers: Map<String, String> = emptyMap())
    : Response<OverrideCheckoutResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.overrideCart(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartShareLink(body: GetShareCartLinkCreation, headers: Map<String, String> = emptyMap())
    : Response<GetShareCartLinkResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartShareLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartSharedItems(token: String, headers: Map<String, String> = emptyMap())
    : Response<SharedCartResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartSharedItems(companyId = config.companyId ,applicationId = applicationId ,token = token, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartWithSharedItems(token: String,action: String,cartId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SharedCartResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartWithSharedItems(companyId = config.companyId ,applicationId = applicationId ,token = token,action = action,cartId = cartId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartList(fromDate: String?=null,toDate: String?=null,filterOn: String?=null, headers: Map<String, String> = emptyMap())
    : Response<MultiCartResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartList(companyId = config.companyId ,applicationId = applicationId ,fromDate = fromDate,toDate = toDate,filterOn = filterOn, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartUser(id: String?=null,body: UpdateUserCartMapping, headers: Map<String, String> = emptyMap())
    : Response<UserCartMappingResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartUser(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCart(xOrderingSource: OrderingSource?=null,id: String?=null,userId: String?=null,orderType: String?=null,i: Boolean?=null,b: Boolean?=null,assignCardId: Int?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCart(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id,userId = userId,orderType = orderType,i = i,b = b,assignCardId = assignCardId,buyNow = buyNow, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformAddItems(xOrderingSource: OrderingSource?=null,i: Boolean?=null,b: Boolean?=null,buyNow: Boolean?=null,orderType: String?=null,id: String?=null,body: PlatformAddCartDetails, headers: Map<String, String> = emptyMap())
    : Response<AddCartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformAddItems(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,i = i,b = b,buyNow = buyNow,orderType = orderType,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformUpdateCart(xOrderingSource: OrderingSource?=null,id: String?=null,i: Boolean?=null,orderType: String?=null,b: Boolean?=null,buyNow: Boolean?=null,body: PlatformUpdateCartDetails, headers: Map<String, String> = emptyMap())
    : Response<UpdateCartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformUpdateCart(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id,i = i,orderType = orderType,b = b,buyNow = buyNow, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCart(id: String?=null,body: DeleteCartDetails, headers: Map<String, String> = emptyMap())
    : Response<DeleteCartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deleteCart(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getItemCount(id: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<CartItemCountResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getItemCount(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCoupons(id: String?=null,buyNow: Boolean?=null,slug: String?=null,storeId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCouponResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAppCoupons(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,slug = slug,storeId = storeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun applyCoupon(xOrderingSource: OrderingSource?=null,i: Boolean?=null,b: Boolean?=null,p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,body: ApplyCouponDetails, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.applyCoupon(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,i = i,b = b,p = p,id = id,buyNow = buyNow, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeCoupon(xOrderingSource: OrderingSource?=null,uid: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeCoupon(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,uid = uid,buyNow = buyNow, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAddresses(cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null,userId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlatformGetAddressesDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddresses(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,buyNow = buyNow,mobileNo = mobileNo,checkoutMode = checkoutMode,tags = tags,isDefault = isDefault,userId = userId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addAddress(body: PlatformAddress, headers: Map<String, String> = emptyMap())
    : Response<SaveAddressDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addAddress(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAddressById(id: String,cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null,userId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlatformAddress>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddressById(companyId = config.companyId ,applicationId = applicationId ,id = id,cartId = cartId,buyNow = buyNow,mobileNo = mobileNo,checkoutMode = checkoutMode,tags = tags,isDefault = isDefault,userId = userId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAddress(id: String,body: PlatformAddress, headers: Map<String, String> = emptyMap())
    : Response<UpdateAddressDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateAddress(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeAddress(id: String,userId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<DeleteAddressResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeAddress(companyId = config.companyId ,applicationId = applicationId ,id = id,userId = userId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectAddress(xOrderingSource: OrderingSource?=null,cartId: String?=null,buyNow: Boolean?=null,i: Boolean?=null,b: Boolean?=null,body: PlatformSelectCartAddress, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectAddress(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,buyNow = buyNow,i = i,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShipments(pickAtStoreUid: Int?=null,orderingStoreId: Int?=null,i: Boolean?=null,p: Boolean?=null,id: String?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlatformCartShipmentsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getShipments(companyId = config.companyId ,applicationId = applicationId ,pickAtStoreUid = pickAtStoreUid,orderingStoreId = orderingStoreId,i = i,p = p,id = id,addressId = addressId,areaCode = areaCode,orderType = orderType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShipments(i: Boolean?=null,p: Boolean?=null,id: String?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null,body: UpdateCartShipmentCreation, headers: Map<String, String> = emptyMap())
    : Response<PlatformCartShipmentsResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateShipments(companyId = config.companyId ,applicationId = applicationId ,i = i,p = p,id = id,addressId = addressId,areaCode = areaCode,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMeta(id: String?=null,buyNow: Boolean?=null,body: PlatformCartMetaCreation, headers: Map<String, String> = emptyMap())
    : Response<CartMetaDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMeta(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCart(xOrderingSource: OrderingSource?=null,id: String?=null,body: PlatformCartCheckoutDetailCreation, headers: Map<String, String> = emptyMap())
    : Response<CartCheckoutResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCart(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAvailableDeliveryModes(areaCode: String,id: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDeliveryModesDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAvailableDeliveryModes(companyId = config.companyId ,applicationId = applicationId ,areaCode = areaCode,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreAddressByUid(storeUid: Int, headers: Map<String, String> = emptyMap())
    : Response<StoreDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getStoreAddressByUid(companyId = config.companyId ,applicationId = applicationId ,storeUid = storeUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentMode(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null,orderType: String?=null,body: CartPaymentUpdate, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentMode(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateCouponForPayment(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null,addressId: String?=null,paymentMode: String?=null,paymentIdentifier: String?=null,aggregatorName: String?=null,merchantCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentCouponValidate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.validateCouponForPayment(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,addressId = addressId,paymentMode = paymentMode,paymentIdentifier = paymentIdentifier,aggregatorName = aggregatorName,merchantCode = merchantCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCartV2(xOrderingSource: OrderingSource?=null,id: String?=null,body: PlatformCartCheckoutDetailV2Creation, headers: Map<String, String> = emptyMap())
    : Response<CartCheckoutDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCartV2(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentModeV2(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null,orderType: String?=null,body: UpdateCartPaymentRequestV2, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentModeV2(xOrderingSource = xOrderingSource,companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}