package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.cart.*
import com.sdk.platform.apis.cart.*




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
    
    
    suspend fun getPromotions(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, isActive: Boolean?=null, promoGroup: String?=null, promotionType: String?=null, fpPanel: String?=null, promotionId: String?=null)
    : Deferred<Response<PromotionsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, isActive = isActive, promoGroup = promoGroup, promotionType = promotionType, fpPanel = fpPanel, promotionId = promotionId )
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
    
    ) : Paginator<PromotionsResponse>{
        val paginator = Paginator<PromotionsResponse>()
        paginator.setCallBack(object : PaginatorCallback<PromotionsResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<PromotionsResponse>?,FdkError?) -> Unit){

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
    
    
    suspend fun getCouponOptionValues()
    : Deferred<Response<HashMap<String,Any>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponOptionValues(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCouponCodeExists(code: String?=null)
    : Deferred<Response<HashMap<String,Any>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponCodeExists(companyId = config.companyId , applicationId = applicationId , code = code )
        } else {
            null
        }
    }
    
    
    suspend fun getPromotionCodeExists(code: String?=null)
    : Deferred<Response<HashMap<String,Any>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getPromotionCodeExists(companyId = config.companyId , applicationId = applicationId , code = code )
        } else {
            null
        }
    }
    
}
}