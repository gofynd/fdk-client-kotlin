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

    
    
    suspend fun createCoupon(body: CouponAdd, headers: Map<String, String> = emptyMap())
    : Response<CouponDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCoupon(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCoupons(pageNo: Int?=null,pageSize: Int?=null,isArchived: Boolean?=null,title: String?=null,isPublic: Boolean?=null,isDisplay: Boolean?=null,typeSlug: String?=null,code: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CouponsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCoupons(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,isArchived = isArchived,title = title,isPublic = isPublic,isDisplay = isDisplay,typeSlug = typeSlug,code = code, headers = headers)
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
    
    ) : Paginator<CouponsResponseObject>{
        val paginator = Paginator<CouponsResponseObject>()
        paginator.setCallBack(object : PaginatorCallback<CouponsResponseObject> {

            override suspend fun onNext(
                onResponse: (Event<CouponsResponseObject>?,FdkError?) -> Unit){

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
    
    suspend fun getCouponTags( headers: Map<String, String> = emptyMap())
    : Response<TagsViewResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponTags(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionTags( headers: Map<String, String> = emptyMap())
    : Response<TagsViewResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionTags(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    : Response<CouponDetailResponseObject>? {
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
    
    
    suspend fun getPromotions(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,isActive: Boolean?=null,promoGroup: String?=null,promotionType: String?=null,fpPanel: String?=null,promotionId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PromotionsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q,isActive = isActive,promoGroup = promoGroup,promotionType = promotionType,fpPanel = fpPanel,promotionId = promotionId, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPromotions
    **/
    fun getPromotionsPaginator(
    pageSize: Int?=null, q: String?=null, isActive: Boolean?=null, promoGroup: String?=null, promotionType: String?=null, fpPanel: String?=null, promotionId: String?=null
    
    ) : Paginator<PromotionsResponseObject>{
        val paginator = Paginator<PromotionsResponseObject>()
        paginator.setCallBack(object : PaginatorCallback<PromotionsResponseObject> {

            override suspend fun onNext(
                onResponse: (Event<PromotionsResponseObject>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getPromotions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, isActive = isActive, promoGroup = promoGroup, promotionType = promotionType, fpPanel = fpPanel, promotionId = promotionId)?.safeAwait{ response, error ->
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
    
    
    suspend fun getPromosCouponConfig(entityType: String?=null,isHidden: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<ActivePromosResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromosCouponConfig(companyId = config.companyId ,applicationId = applicationId ,entityType = entityType,isHidden = isHidden, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartMetaConfig(cartMetaId: String, headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigDetailObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartMetaConfig(companyId = config.companyId ,applicationId = applicationId ,cartMetaId = cartMetaId, headers = headers)
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
    
    
    suspend fun deleteCartMetaConfig(cartMetaId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deleteCartMetaConfig(companyId = config.companyId ,applicationId = applicationId ,cartMetaId = cartMetaId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartMetaConfigs( headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigListResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartMetaConfigs(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCartMetaConfig(body: CartMetaConfigAdd, headers: Map<String, String> = emptyMap())
    : Response<CartMetaConfigAddResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCartMetaConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addPriceAdjustment(body: PriceAdjustmentAdd, headers: Map<String, String> = emptyMap())
    : Response<AddPriceAdjustmentResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addPriceAdjustment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPriceAdjustments(cartId: String, headers: Map<String, String> = emptyMap())
    : Response<PriceAdjustmentResponsObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPriceAdjustments(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePriceAdjustment(id: String,body: PriceAdjustmentUpdate, headers: Map<String, String> = emptyMap())
    : Response<UpdatePriceAdjustmentResponseObject>? {
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
    
    
    suspend fun fetchAndvalidateCartItems(body: OpenapiCartDetailsRequestObject, headers: Map<String, String> = emptyMap())
    : Response<OpenapiCartDetailsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchAndvalidateCartItems(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkCartServiceability(body: OpenApiCartServiceabilityRequestObject, headers: Map<String, String> = emptyMap())
    : Response<OpenApiCartServiceabilityResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkCartServiceability(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(body: OpenApiPlatformCheckoutReq, headers: Map<String, String> = emptyMap())
    : Response<OpenApiCheckoutResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonedCart(pageNo: Int?=null,pageSize: Int?=null,fromDate: String?=null,toDate: String?=null,anonymousCart: Boolean?=null,lastId: String?=null,sortOn: String?=null, headers: Map<String, String> = emptyMap())
    : Response<AbandonedCartResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCart(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,fromDate = fromDate,toDate = toDate,anonymousCart = anonymousCart,lastId = lastId,sortOn = sortOn, headers = headers)
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
    
    ) : Paginator<AbandonedCartResponseObject>{
        val paginator = Paginator<AbandonedCartResponseObject>()
        paginator.setCallBack(object : PaginatorCallback<AbandonedCartResponseObject> {

            override suspend fun onNext(
                onResponse: (Event<AbandonedCartResponseObject>?,FdkError?) -> Unit){

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
    
    suspend fun getAbandonedCartDetails(id: String?=null,i: Boolean?=null,b: Boolean?=null,c: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAbandonedCartDetails(companyId = config.companyId ,applicationId = applicationId ,id = id,i = i,b = b,c = c, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addItems(cartId: String,b: Boolean?=null,body: AddCartRequestObject, headers: Map<String, String> = emptyMap())
    : Response<AddCartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addItems(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCart(cartId: String,b: Boolean?=null,body: UpdateCartRequestObject, headers: Map<String, String> = emptyMap())
    : Response<UpdateCartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCart(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponOptionValues( headers: Map<String, String> = emptyMap())
    : Response<CouponOptions>? {
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
    
    
    suspend fun overrideCart(body: OverrideCheckoutReq, headers: Map<String, String> = emptyMap())
    : Response<OverrideCheckoutResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.overrideCart(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartShareLink(body: GetShareCartLinkRequestObject, headers: Map<String, String> = emptyMap())
    : Response<GetShareCartLinkResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartShareLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartSharedItems(token: String, headers: Map<String, String> = emptyMap())
    : Response<SharedCartResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartSharedItems(companyId = config.companyId ,applicationId = applicationId ,token = token, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartWithSharedItems(token: String,action: String,cartId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SharedCartResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartWithSharedItems(companyId = config.companyId ,applicationId = applicationId ,token = token,action = action,cartId = cartId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCartList(fromDate: String?=null,toDate: String?=null,filterOn: String?=null, headers: Map<String, String> = emptyMap())
    : Response<MultiCartResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCartList(companyId = config.companyId ,applicationId = applicationId ,fromDate = fromDate,toDate = toDate,filterOn = filterOn, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartUser(id: String?=null,body: UpdateUserCartMapping, headers: Map<String, String> = emptyMap())
    : Response<UserCartMappingResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartUser(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getItemCount(id: String?=null,buyNow: Boolean?=null,cartType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CartItemCountResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getItemCount(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,cartType = cartType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformAddItems(i: Boolean?=null,b: Boolean?=null,buyNow: Boolean?=null,id: String?=null,cartType: String?=null,body: PlatformAddCartRequestObject, headers: Map<String, String> = emptyMap())
    : Response<AddCartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformAddItems(companyId = config.companyId ,applicationId = applicationId ,i = i,b = b,buyNow = buyNow,id = id,cartType = cartType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCart(id: String?=null,userId: String?=null,i: Boolean?=null,b: Boolean?=null,assignCardId: Double?=null,buyNow: Boolean?=null,cartType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCart(companyId = config.companyId ,applicationId = applicationId ,id = id,userId = userId,i = i,b = b,assignCardId = assignCardId,buyNow = buyNow,cartType = cartType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformUpdateCart(id: String?=null,i: Boolean?=null,orderType: String?=null,b: Boolean?=null,buyNow: Boolean?=null,cartType: String?=null,body: PlatformUpdateCartRequestObject, headers: Map<String, String> = emptyMap())
    : Response<UpdateCartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformUpdateCart(companyId = config.companyId ,applicationId = applicationId ,id = id,i = i,orderType = orderType,b = b,buyNow = buyNow,cartType = cartType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCart(id: String?=null,cartType: String?=null,body: DeleteCartRequestObject, headers: Map<String, String> = emptyMap())
    : Response<DeleteCartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.deleteCart(companyId = config.companyId ,applicationId = applicationId ,id = id,cartType = cartType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCoupons(id: String?=null,buyNow: Boolean?=null,slug: String?=null,storeId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCouponResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAppCoupons(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,slug = slug,storeId = storeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun applyCoupon(i: Boolean?=null,b: Boolean?=null,p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,body: ApplyCouponRequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.applyCoupon(companyId = config.companyId ,applicationId = applicationId ,i = i,b = b,p = p,id = id,buyNow = buyNow, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeCoupon(uid: String?=null,buyNow: Boolean?=null,cartType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeCoupon(companyId = config.companyId ,applicationId = applicationId ,uid = uid,buyNow = buyNow,cartType = cartType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addAddress(body: PlatformAddress, headers: Map<String, String> = emptyMap())
    : Response<SaveAddressResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.addAddress(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAddresses(cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null,userId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlatformGetAddressesResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAddresses(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,buyNow = buyNow,mobileNo = mobileNo,checkoutMode = checkoutMode,tags = tags,isDefault = isDefault,userId = userId, headers = headers)
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
    : Response<UpdateAddressResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateAddress(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeAddress(id: String,userId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<DeleteAddressResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.removeAddress(companyId = config.companyId ,applicationId = applicationId ,id = id,userId = userId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectAddress(cartId: String?=null,buyNow: Boolean?=null,i: Boolean?=null,b: Boolean?=null,body: PlatformSelectCartAddressRequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectAddress(companyId = config.companyId ,applicationId = applicationId ,cartId = cartId,buyNow = buyNow,i = i,b = b, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShipments(pickAtStoreUid: Int?=null,orderingStoreId: Int?=null,i: Boolean?=null,p: Boolean?=null,id: String?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlatformCartShipmentsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getShipments(companyId = config.companyId ,applicationId = applicationId ,pickAtStoreUid = pickAtStoreUid,orderingStoreId = orderingStoreId,i = i,p = p,id = id,addressId = addressId,areaCode = areaCode,orderType = orderType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShipments(i: Boolean?=null,p: Boolean?=null,id: String?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null,body: UpdateCartShipmentRequestObject, headers: Map<String, String> = emptyMap())
    : Response<PlatformCartShipmentsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateShipments(companyId = config.companyId ,applicationId = applicationId ,i = i,p = p,id = id,addressId = addressId,areaCode = areaCode,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCartMeta(id: String?=null,buyNow: Boolean?=null,userId: String?=null,body: PlatformCartMetaRequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartMetaResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCartMeta(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,userId = userId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCart(id: String?=null,cartType: String?=null,body: PlatformCartCheckoutDetailRequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartCheckoutResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCart(companyId = config.companyId ,applicationId = applicationId ,id = id,cartType = cartType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAvailableDeliveryModes(areaCode: String,id: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CartDeliveryModesResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getAvailableDeliveryModes(companyId = config.companyId ,applicationId = applicationId ,areaCode = areaCode,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreAddressByUid(storeUid: Int, headers: Map<String, String> = emptyMap())
    : Response<StoreDetailsResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getStoreAddressByUid(companyId = config.companyId ,applicationId = applicationId ,storeUid = storeUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentMode(id: String?=null,buyNow: Boolean?=null,orderType: String?=null,body: UpdateCartPaymentRequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentMode(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateCouponForPayment(id: String?=null,buyNow: Boolean?=null,addressId: String?=null,paymentMode: String?=null,paymentIdentifier: String?=null,aggregatorName: String?=null,merchantCode: String?=null,iin: String?=null,network: String?=null,type: String?=null,cardId: String?=null,cartType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentCouponValidate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.validateCouponForPayment(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,addressId = addressId,paymentMode = paymentMode,paymentIdentifier = paymentIdentifier,aggregatorName = aggregatorName,merchantCode = merchantCode,iin = iin,network = network,type = type,cardId = cardId,cartType = cartType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun platformCheckoutCartV2(id: String?=null,cartType: String?=null,body: PlatformCartCheckoutDetailV2RequestObject, headers: Map<String, String> = emptyMap())
    : Response<CartCheckoutResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.platformCheckoutCartV2(companyId = config.companyId ,applicationId = applicationId ,id = id,cartType = cartType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun selectPaymentModeV2(id: String?=null,buyNow: Boolean?=null,orderType: String?=null,body: UpdateCartPaymentRequestV2, headers: Map<String, String> = emptyMap())
    : Response<CartDetailResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.selectPaymentModeV2(companyId = config.companyId ,applicationId = applicationId ,id = id,buyNow = buyNow,orderType = orderType, body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}