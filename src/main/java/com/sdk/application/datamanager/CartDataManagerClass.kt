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
            
                    _relativeUrls["checkoutCartV2"] = "/service/application/cart/v2.0/checkout".substring(1)
            
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
    
   suspend fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, assignCardId: Int?=null, areaCode: String?=null, buyNow: Boolean?=null): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getCart"] 
        
        return cartApiList?.getCart(fullUrl    ,  id = id,    i = i,    b = b,    p = p,    assignCardId = assignCardId,    areaCode = areaCode,    buyNow = buyNow)}

    
    
   suspend fun getCartLastModified(id: String?=null): Response<Void>? {
        var fullUrl : String? = _relativeUrls["getCartLastModified"] 
        
        return cartApiList?.getCartLastModified(fullUrl    ,  id = id)}

    
    
   suspend fun addItems(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, id: String?=null, body: AddCartRequest): Response<AddCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["addItems"] 
        
        return cartApiList?.addItems(fullUrl    ,  i = i,    b = b,    p = p,    areaCode = areaCode,    buyNow = buyNow,    id = id, body = body)}

    
    
   suspend fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, body: UpdateCartRequest): Response<UpdateCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["updateCart"] 
        
        return cartApiList?.updateCart(fullUrl    ,  id = id,    i = i,    b = b,    p = p,    areaCode = areaCode,    buyNow = buyNow, body = body)}

    
    
   suspend fun deleteCart(id: String?=null): Response<DeleteCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["deleteCart"] 
        
        return cartApiList?.deleteCart(fullUrl    ,  id = id)}

    
    
   suspend fun getItemCount(id: String?=null, buyNow: Boolean?=null): Response<CartItemCountResponse>? {
        var fullUrl : String? = _relativeUrls["getItemCount"] 
        
        return cartApiList?.getItemCount(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
   suspend fun getCoupons(id: String?=null, buyNow: Boolean?=null): Response<GetCouponResponse>? {
        var fullUrl : String? = _relativeUrls["getCoupons"] 
        
        return cartApiList?.getCoupons(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
   suspend fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, buyNow: Boolean?=null, body: ApplyCouponRequest): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["applyCoupon"] 
        
        return cartApiList?.applyCoupon(fullUrl    ,  i = i,    b = b,    p = p,    id = id,    buyNow = buyNow, body = body)}

    
    
   suspend fun removeCoupon(id: String?=null, buyNow: Boolean?=null): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["removeCoupon"] 
        
        return cartApiList?.removeCoupon(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
   suspend fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Response<BulkPriceResponse>? {
        var fullUrl : String? = _relativeUrls["getBulkDiscountOffers"] 
        
        return cartApiList?.getBulkDiscountOffers(fullUrl    ,  itemId = itemId,    articleId = articleId,    uid = uid,    slug = slug)}

    
    
   suspend fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, buyNow: Boolean?=null, body: RewardPointRequest): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["applyRewardPoints"] 
        
        return cartApiList?.applyRewardPoints(fullUrl    ,  id = id,    i = i,    b = b,    buyNow = buyNow, body = body)}

    
    
   suspend fun getAddresses(cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Response<GetAddressesResponse>? {
        var fullUrl : String? = _relativeUrls["getAddresses"] 
        
        return cartApiList?.getAddresses(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
   suspend fun addAddress(body: Address): Response<SaveAddressResponse>? {
        var fullUrl : String? = _relativeUrls["addAddress"] 
        
        return cartApiList?.addAddress(fullUrl  ,body = body)}

    
    
   suspend fun getAddressById(id: String, cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Response<Address>? {
        var fullUrl : String? = _relativeUrls["getAddressById"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.getAddressById(fullUrl     ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
   suspend fun updateAddress(id: String, body: Address): Response<UpdateAddressResponse>? {
        var fullUrl : String? = _relativeUrls["updateAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.updateAddress(fullUrl   ,body = body)}

    
    
   suspend fun removeAddress(id: String): Response<DeleteAddressResponse>? {
        var fullUrl : String? = _relativeUrls["removeAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.removeAddress(fullUrl   )}

    
    
   suspend fun selectAddress(cartId: String?=null, buyNow: Boolean?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["selectAddress"] 
        
        return cartApiList?.selectAddress(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    i = i,    b = b, body = body)}

    
    
   suspend fun selectPaymentMode(id: String?=null, buyNow: Boolean?=null, body: UpdateCartPaymentRequest): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["selectPaymentMode"] 
        
        return cartApiList?.selectPaymentMode(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
   suspend fun validateCouponForPayment(id: String?=null, buyNow: Boolean?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null, iin: String?=null, network: String?=null, type: String?=null, cardId: String?=null): Response<PaymentCouponValidate>? {
        var fullUrl : String? = _relativeUrls["validateCouponForPayment"] 
        
        return cartApiList?.validateCouponForPayment(fullUrl    ,  id = id,    buyNow = buyNow,    addressId = addressId,    paymentMode = paymentMode,    paymentIdentifier = paymentIdentifier,    aggregatorName = aggregatorName,    merchantCode = merchantCode,    iin = iin,    network = network,    type = type,    cardId = cardId)}

    
    
   suspend fun getShipments(p: Boolean?=null, id: String?=null, buyNow: Boolean?=null, addressId: String?=null, areaCode: String?=null): Response<CartShipmentsResponse>? {
        var fullUrl : String? = _relativeUrls["getShipments"] 
        
        return cartApiList?.getShipments(fullUrl    ,  p = p,    id = id,    buyNow = buyNow,    addressId = addressId,    areaCode = areaCode)}

    
    
   suspend fun checkoutCart(buyNow: Boolean?=null, body: CartCheckoutDetailRequest): Response<CartCheckoutResponse>? {
        var fullUrl : String? = _relativeUrls["checkoutCart"] 
        
        return cartApiList?.checkoutCart(fullUrl    ,  buyNow = buyNow, body = body)}

    
    
   suspend fun updateCartMeta(id: String?=null, buyNow: Boolean?=null, body: CartMetaRequest): Response<CartMetaResponse>? {
        var fullUrl : String? = _relativeUrls["updateCartMeta"] 
        
        return cartApiList?.updateCartMeta(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
   suspend fun getCartShareLink(body: GetShareCartLinkRequest): Response<GetShareCartLinkResponse>? {
        var fullUrl : String? = _relativeUrls["getCartShareLink"] 
        
        return cartApiList?.getCartShareLink(fullUrl  ,body = body)}

    
    
   suspend fun getCartSharedItems(token: String): Response<SharedCartResponse>? {
        var fullUrl : String? = _relativeUrls["getCartSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        return cartApiList?.getCartSharedItems(fullUrl   )}

    
    
   suspend fun updateCartWithSharedItems(token: String, action: String): Response<SharedCartResponse>? {
        var fullUrl : String? = _relativeUrls["updateCartWithSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        fullUrl = fullUrl?.replace("{" + "action" +"}",action.toString())
        
        return cartApiList?.updateCartWithSharedItems(fullUrl    )}

    
    
   suspend fun getPromotionOffers(slug: String?=null, pageSize: Int?=null, promotionGroup: String?=null, storeId: Int?=null): Response<PromotionOffersResponse>? {
        var fullUrl : String? = _relativeUrls["getPromotionOffers"] 
        
        return cartApiList?.getPromotionOffers(fullUrl    ,  slug = slug,    pageSize = pageSize,    promotionGroup = promotionGroup,    storeId = storeId)}

    
    
   suspend fun getLadderOffers(slug: String, storeId: String?=null, promotionId: String?=null, pageSize: Int?=null): Response<LadderPriceOffers>? {
        var fullUrl : String? = _relativeUrls["getLadderOffers"] 
        
        return cartApiList?.getLadderOffers(fullUrl    ,  slug = slug,    storeId = storeId,    promotionId = promotionId,    pageSize = pageSize)}

    
    
   suspend fun checkoutCartV2(buyNow: Boolean?=null, body: CartCheckoutDetailV2Request): Response<CartCheckoutResponse>? {
        var fullUrl : String? = _relativeUrls["checkoutCartV2"] 
        
        return cartApiList?.checkoutCartV2(fullUrl    ,  buyNow = buyNow, body = body)}

    
    
}
