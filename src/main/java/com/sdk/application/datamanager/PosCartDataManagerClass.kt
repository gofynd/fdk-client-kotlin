package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import com.sdk.application.models.poscart.*
import com.sdk.application.apis.poscart.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class PosCartDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val posCartApiList by lazy {
        generateposCartApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getCart"] = "/service/application/pos/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["getCartLastModified"] = "/service/application/pos/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["addItems"] = "/service/application/pos/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["updateCart"] = "/service/application/pos/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["getItemCount"] = "/service/application/pos/cart/v1.0/basic".substring(1)
            
                    _relativeUrls["getCoupons"] = "/service/application/pos/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["applyCoupon"] = "/service/application/pos/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["removeCoupon"] = "/service/application/pos/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["getBulkDiscountOffers"] = "/service/application/pos/cart/v1.0/bulk-price".substring(1)
            
                    _relativeUrls["applyRewardPoints"] = "/service/application/pos/cart/v1.0/redeem/points/".substring(1)
            
                    _relativeUrls["getAddresses"] = "/service/application/pos/cart/v1.0/address".substring(1)
            
                    _relativeUrls["addAddress"] = "/service/application/pos/cart/v1.0/address".substring(1)
            
                    _relativeUrls["getAddressById"] = "/service/application/pos/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["updateAddress"] = "/service/application/pos/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["removeAddress"] = "/service/application/pos/cart/v1.0/address/{id}".substring(1)
            
                    _relativeUrls["selectAddress"] = "/service/application/pos/cart/v1.0/select-address".substring(1)
            
                    _relativeUrls["selectPaymentMode"] = "/service/application/pos/cart/v1.0/payment".substring(1)
            
                    _relativeUrls["validateCouponForPayment"] = "/service/application/pos/cart/v1.0/payment/validate/".substring(1)
            
                    _relativeUrls["getShipments"] = "/service/application/pos/cart/v1.0/shipment".substring(1)
            
                    _relativeUrls["updateShipments"] = "/service/application/pos/cart/v1.0/shipment".substring(1)
            
                    _relativeUrls["checkoutCart"] = "/service/application/pos/cart/v1.0/checkout".substring(1)
            
                    _relativeUrls["updateCartMeta"] = "/service/application/pos/cart/v1.0/meta".substring(1)
            
                    _relativeUrls["getAvailableDeliveryModes"] = "/service/application/pos/cart/v1.0/available-delivery-mode".substring(1)
            
                    _relativeUrls["getStoreAddressByUid"] = "/service/application/pos/cart/v1.0/store-address".substring(1)
            
                    _relativeUrls["getCartShareLink"] = "/service/application/pos/cart/v1.0/share-cart".substring(1)
            
                    _relativeUrls["getCartSharedItems"] = "/service/application/pos/cart/v1.0/share-cart/{token}".substring(1)
            
                    _relativeUrls["updateCartWithSharedItems"] = "/service/application/pos/cart/v1.0/share-cart/{token}/{action}".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generateposCartApiList(): PosCartApiList? {
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
            namespace = "ApplicationPosCart",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(PosCartApiList::class.java) as? PosCartApiList
    }
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null, areaCode: String?=null, buyNow: Boolean?=null): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["getCart"] 
        
        return posCartApiList?.getCart(fullUrl    ,  id = id,    i = i,    b = b,    assignCardId = assignCardId,    areaCode = areaCode,    buyNow = buyNow)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        var fullUrl : String? = _relativeUrls["getCartLastModified"] 
        
        return posCartApiList?.getCartLastModified(fullUrl    ,  id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["addItems"] 
        
        return posCartApiList?.addItems(fullUrl    ,  i = i,    b = b,    areaCode = areaCode,    buyNow = buyNow, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, areaCode: String?=null, buyNow: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCart"] 
        
        return posCartApiList?.updateCart(fullUrl    ,  id = id,    i = i,    b = b,    areaCode = areaCode,    buyNow = buyNow, body = body)}

    
    
    fun getItemCount(id: String?=null, buyNow: Boolean?=null): Deferred<Response<CartItemCountResponse>>? {
        var fullUrl : String? = _relativeUrls["getItemCount"] 
        
        return posCartApiList?.getItemCount(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun getCoupons(id: String?=null, buyNow: Boolean?=null): Deferred<Response<GetCouponResponse>>? {
        var fullUrl : String? = _relativeUrls["getCoupons"] 
        
        return posCartApiList?.getCoupons(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, buyNow: Boolean?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["applyCoupon"] 
        
        return posCartApiList?.applyCoupon(fullUrl    ,  i = i,    b = b,    p = p,    id = id,    buyNow = buyNow, body = body)}

    
    
    fun removeCoupon(id: String?=null, buyNow: Boolean?=null): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["removeCoupon"] 
        
        return posCartApiList?.removeCoupon(fullUrl    ,  id = id,    buyNow = buyNow)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        var fullUrl : String? = _relativeUrls["getBulkDiscountOffers"] 
        
        return posCartApiList?.getBulkDiscountOffers(fullUrl    ,  itemId = itemId,    articleId = articleId,    uid = uid,    slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, buyNow: Boolean?=null, body: RewardPointRequestSchema): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["applyRewardPoints"] 
        
        return posCartApiList?.applyRewardPoints(fullUrl    ,  id = id,    i = i,    b = b,    buyNow = buyNow, body = body)}

    
    
    fun getAddresses(cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        var fullUrl : String? = _relativeUrls["getAddresses"] 
        
        return posCartApiList?.getAddresses(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["addAddress"] 
        
        return posCartApiList?.addAddress(fullUrl  ,body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, buyNow: Boolean?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        var fullUrl : String? = _relativeUrls["getAddressById"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return posCartApiList?.getAddressById(fullUrl     ,  cartId = cartId,    buyNow = buyNow,    mobileNo = mobileNo,    checkoutMode = checkoutMode,    tags = tags,    isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["updateAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return posCartApiList?.updateAddress(fullUrl   ,body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        var fullUrl : String? = _relativeUrls["removeAddress"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return posCartApiList?.removeAddress(fullUrl   )}

    
    
    fun selectAddress(cartId: String?=null, buyNow: Boolean?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["selectAddress"] 
        
        return posCartApiList?.selectAddress(fullUrl    ,  cartId = cartId,    buyNow = buyNow,    i = i,    b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, buyNow: Boolean?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["selectPaymentMode"] 
        
        return posCartApiList?.selectPaymentMode(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, buyNow: Boolean?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidateSchema>>? {
        var fullUrl : String? = _relativeUrls["validateCouponForPayment"] 
        
        return posCartApiList?.validateCouponForPayment(fullUrl    ,  id = id,    buyNow = buyNow,    addressId = addressId,    paymentMode = paymentMode,    paymentIdentifier = paymentIdentifier,    aggregatorName = aggregatorName,    merchantCode = merchantCode)}

    
    
    fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        var fullUrl : String? = _relativeUrls["getShipments"] 
        
        return posCartApiList?.getShipments(fullUrl    ,  pickAtStoreUid = pickAtStoreUid,    orderingStoreId = orderingStoreId,    p = p,    id = id,    addressId = addressId,    areaCode = areaCode,    orderType = orderType)}

    
    
    fun updateShipments(i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null, body: UpdateCartShipmentRequest): Deferred<Response<CartShipmentsResponse>>? {
        var fullUrl : String? = _relativeUrls["updateShipments"] 
        
        return posCartApiList?.updateShipments(fullUrl    ,  i = i,    p = p,    id = id,    addressId = addressId,    areaCode = areaCode,    orderType = orderType, body = body)}

    
    
    fun checkoutCart(id: String?=null, body: CartPosCheckoutDetailRequest): Deferred<Response<CartCheckoutResponseSchema>>? {
        var fullUrl : String? = _relativeUrls["checkoutCart"] 
        
        return posCartApiList?.checkoutCart(fullUrl    ,  id = id, body = body)}

    
    
    fun updateCartMeta(id: String?=null, buyNow: Boolean?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCartMeta"] 
        
        return posCartApiList?.updateCartMeta(fullUrl    ,  id = id,    buyNow = buyNow, body = body)}

    
    
    fun getAvailableDeliveryModes(areaCode: String, id: String?=null): Deferred<Response<CartDeliveryModesResponse>>? {
        var fullUrl : String? = _relativeUrls["getAvailableDeliveryModes"] 
        
        return posCartApiList?.getAvailableDeliveryModes(fullUrl    ,  areaCode = areaCode,    id = id)}

    
    
    fun getStoreAddressByUid(storeUid: Int): Deferred<Response<StoreDetailsResponse>>? {
        var fullUrl : String? = _relativeUrls["getStoreAddressByUid"] 
        
        return posCartApiList?.getStoreAddressByUid(fullUrl    ,  storeUid = storeUid)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        var fullUrl : String? = _relativeUrls["getCartShareLink"] 
        
        return posCartApiList?.getCartShareLink(fullUrl  ,body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        var fullUrl : String? = _relativeUrls["getCartSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        return posCartApiList?.getCartSharedItems(fullUrl   )}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        var fullUrl : String? = _relativeUrls["updateCartWithSharedItems"] 
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        fullUrl = fullUrl?.replace("{" + "action" +"}",action.toString())
        
        return posCartApiList?.updateCartWithSharedItems(fullUrl    )}

    
    
}
