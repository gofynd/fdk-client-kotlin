package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import com.sdk.application.models.cart.*
import com.sdk.application.apis.cart.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CartDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val cartApiList by lazy {
        generatecartApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getCart"] = "/service/application/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["getCartLastModified"] = "/service/application/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["addItems"] = "/service/application/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["updateCart"] = "/service/application/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["deleteCart"] = "/service/application/cart/v1.0/cart_archive".substring(1)
            
                    _relativeUrls["getItemCount"] = "/service/application/cart/v1.0/basic".substring(1)
            
                    _relativeUrls["getCoupons"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["applyCoupon"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["removeCoupon"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["getBulkDiscountOffers"] = "/service/application/cart/v1.0/bulk-price".substring(1)
            
                    _relativeUrls["applyRewardPoints"] = "/service/application/cart/v1.0/redeem/points/".substring(1)
            
                    _relativeUrls["getAddresses"] = "/service/application/cart/v1.0/address".substring(1)
            
                    _relativeUrls["addAddress"] = "/service/application/cart/v1.0/address".substring(1)
            
                    _relativeUrls["getAddressById"] = "/service/application/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["updateAddress"] = "/service/application/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["removeAddress"] = "/service/application/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["selectAddress"] = "/service/application/cart/v1.0/select-address".substring(1)
            
                    _relativeUrls["selectPaymentMode"] = "/service/application/cart/v1.0/payment".substring(1)
            
                    _relativeUrls["validateCouponForPayment"] = "/service/application/cart/v1.0/payment/validate/".substring(1)
            
                    _relativeUrls["getShipments"] = "/service/application/cart/v1.0/shipment".substring(1)
            
                    _relativeUrls["checkoutCart"] = "/service/application/cart/v1.0/checkout".substring(1)
            
                    _relativeUrls["updateCartMeta"] = "/service/application/cart/v1.0/meta".substring(1)
            
                    _relativeUrls["getCartShareLink"] = "/service/application/cart/v1.0/share-cart".substring(1)
            
                    _relativeUrls["getCartSharedItems"] = "/service/application/cart/v1.0/share-cart/{token}".substring(1)
            
                    _relativeUrls["updateCartWithSharedItems"] = "/service/application/cart/v1.0/share-cart/{token}/{action}".substring(1)
            
                    _relativeUrls["getPromotionOffers"] = "/service/application/cart/v1.0/available-promotions".substring(1)
            
                    _relativeUrls["getLadderOffers"] = "/service/application/cart/v1.0/available-ladder-prices".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatecartApiList(): CartApiList? {
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
            namespace = "ApplicationCart",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null, areaCode: String?=null, buyNow: Boolean?=null): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["getCart"] 
        
        return cartApiList?.getCart(fullUrl    ,  id = id,    i = i,    b = b,    assignCardId = assignCardId,    areaCode = areaCode,    buyNow = buyNow)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        var fullUrl : String? = _relativeUrls["getCartLastModified"] 
        
        return cartApiList?.getCartLastModified(fullUrl    ,  id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["addItems"] 
        
        return cartApiList?.addItems(fullUrl    ,  i = i,    b = b,    areaCode = areaCode,    buyNow = buyNow, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCart"] 
        
        return cartApiList?.updateCart(fullUrl    ,  id = id,    i = i,    b = b,    areaCode = areaCode,    buyNow = buyNow, body = body)}

    
    
    fun deleteCart(id: String?=null): Deferred<Response<DeleteCartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["deleteCart"] 
        
        return cartApiList?.deleteCart(fullUrl    ,  id = id)}

    
    
    fun getItemCount(id: String?=null, buyNow: Boolean?=null): Deferred<Response<CartItemCountResponse>>? {
        var fullUrl : String? = _relativeUrls["getItemCount"] 
        
        return cartApiList?.getItemCount(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun getCoupons(id: String?=null, buyNow: Boolean?=null): Deferred<Response<GetCouponResponse>>? {
        var fullUrl : String? = _relativeUrls["getCoupons"] 
        
        return cartApiList?.getCoupons(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, buyNow: Boolean?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["applyCoupon"] 
        
        return cartApiList?.applyCoupon(fullUrl    ,  i = i,    b = b,    p = p,    id = id,    buyNow = buyNow, body = body)}

    
    
    fun removeCoupon(id: String?=null, buyNow: Boolean?=null): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["removeCoupon"] 
        
        return cartApiList?.removeCoupon(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        var fullUrl : String? = _relativeUrls["getBulkDiscountOffers"] 
        
        return cartApiList?.getBulkDiscountOffers(fullUrl    ,  itemId = itemId,    articleId = articleId,    uid = uid,    slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, buyNow: Boolean?=null, body: RewardPointRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["applyRewardPoints"] 
        
        return cartApiList?.applyRewardPoints(fullUrl    ,  id = id,    i = i,    b = b,    buyNow = buyNow, body = body)}

    
    
    fun getAddresses(cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        var fullUrl : String? = _relativeUrls["getAddresses"] 
        
        return cartApiList?.getAddresses(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["addAddress"] 
        
        return cartApiList?.addAddress(fullUrl  ,body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        var fullUrl : String? = _relativeUrls["getAddressById"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.getAddressById(fullUrl     ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["updateAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.updateAddress(fullUrl   ,body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["removeAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.removeAddress(fullUrl   )}

    
    
    fun selectAddress(cartId: String?=null, buyNow: Boolean?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["selectAddress"] 
        
        return cartApiList?.selectAddress(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    i = i,    b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, buyNow: Boolean?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["selectPaymentMode"] 
        
        return cartApiList?.selectPaymentMode(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, buyNow: Boolean?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidate>>? {
        var fullUrl : String? = _relativeUrls["validateCouponForPayment"] 
        
        return cartApiList?.validateCouponForPayment(fullUrl    ,  id = id,    buyNow = buyNow,    addressId = addressId,    paymentMode = paymentMode,    paymentIdentifier = paymentIdentifier,    aggregatorName = aggregatorName,    merchantCode = merchantCode)}

    
    
    fun getShipments(p: Boolean?=null, id: String?=null, buyNow: Boolean?=null, addressId: String?=null, areaCode: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        var fullUrl : String? = _relativeUrls["getShipments"] 
        
        return cartApiList?.getShipments(fullUrl    ,  p = p,    id = id,    buyNow = buyNow,    addressId = addressId,    areaCode = areaCode)}

    
    
    fun checkoutCart(buyNow: Boolean?=null, body: CartCheckoutDetailRequest): Deferred<Response<CartCheckoutResponse>>? {
        var fullUrl : String? = _relativeUrls["checkoutCart"] 
        
        return cartApiList?.checkoutCart(fullUrl    ,  buyNow = buyNow, body = body)}

    
    
    fun updateCartMeta(id: String?=null, buyNow: Boolean?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCartMeta"] 
        
        return cartApiList?.updateCartMeta(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        var fullUrl : String? = _relativeUrls["getCartShareLink"] 
        
        return cartApiList?.getCartShareLink(fullUrl  ,body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        var fullUrl : String? = _relativeUrls["getCartSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        return cartApiList?.getCartSharedItems(fullUrl   )}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCartWithSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        fullUrl = fullUrl?.replace("{" + "action" +"}",action.toString())
        
        return cartApiList?.updateCartWithSharedItems(fullUrl    )}

    
    
    fun getPromotionOffers(slug: String?=null, pageSize: Int?=null, promotionGroup: String?=null): Deferred<Response<PromotionOffersResponse>>? {
        var fullUrl : String? = _relativeUrls["getPromotionOffers"] 
        
        return cartApiList?.getPromotionOffers(fullUrl    ,  slug = slug,    pageSize = pageSize,    promotionGroup = promotionGroup)}

    
    
    fun getLadderOffers(slug: String, storeId: String?=null, promotionId: String?=null, pageSize: Int?=null): Deferred<Response<LadderPriceOffers>>? {
        var fullUrl : String? = _relativeUrls["getLadderOffers"] 
        
        return cartApiList?.getLadderOffers(fullUrl    ,  slug = slug,    storeId = storeId,    promotionId = promotionId,    pageSize = pageSize)}

    
    
}
