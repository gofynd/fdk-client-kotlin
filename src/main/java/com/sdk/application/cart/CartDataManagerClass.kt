package com.sdk.application.cart

import com.sdk.common.*
import com.sdk.application.*
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
            
                    _relativeUrls["updateCartMeta"] = "/service/application/cart/v1.0/meta".substring(1)
            
                    _relativeUrls["getCartShareLink"] = "/service/application/cart/v1.0/share-cart".substring(1)
            
                    _relativeUrls["getCartSharedItems"] = "/service/application/cart/v1.0/share-cart/{token}".substring(1)
            
                    _relativeUrls["updateCartWithSharedItems"] = "/service/application/cart/v1.0/share-cart/{token}/{action}".substring(1)
            
                    _relativeUrls["getPromotionOffers"] = "/service/application/cart/v1.0/available-promotions".substring(1)
            
                    _relativeUrls["getLadderOffers"] = "/service/application/cart/v1.0/available-ladder-prices".substring(1)
            
                    _relativeUrls["getPromotionPaymentOffers"] = "/service/application/cart/v1.0/available-payment-offers".substring(1)
            
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
    
    suspend fun getCart(id: String?=null,i: Boolean?=null,b: Boolean?=null,c: Boolean?=null,assignCardId: Int?=null,areaCode: String?=null,buyNow: Boolean?=null,orderType: String?=null, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getCart"]
        
        return cartApiList?.getCart(fullUrl,   id = id,  i = i,  b = b,  c = c,  assignCardId = assignCardId,  areaCode = areaCode,  buyNow = buyNow,  orderType = orderType,headers = headers)}

    
    
    suspend fun getCartLastModified(id: String?=null, headers: Map<String, String> = emptyMap()): Response<Void>? {
        var fullUrl : String? = _relativeUrls["getCartLastModified"]
        
        return cartApiList?.getCartLastModified(fullUrl,   id = id,headers = headers)}

    
    
    suspend fun addItems(i: Boolean?=null,b: Boolean?=null,areaCode: String?=null,buyNow: Boolean?=null,id: String?=null,orderType: String?=null,body: AddCartRequest, headers: Map<String, String> = emptyMap()): Response<AddCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["addItems"]
        
        return cartApiList?.addItems(fullUrl,   i = i,  b = b,  areaCode = areaCode,  buyNow = buyNow,  id = id,  orderType = orderType,body = body,headers = headers)}

    
    
    suspend fun updateCart(id: String?=null,i: Boolean?=null,b: Boolean?=null,areaCode: String?=null,buyNow: Boolean?=null,cartType: String?=null,orderType: String?=null,body: UpdateCartRequest, headers: Map<String, String> = emptyMap()): Response<UpdateCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["updateCart"]
        
        return cartApiList?.updateCart(fullUrl,   id = id,  i = i,  b = b,  areaCode = areaCode,  buyNow = buyNow,  cartType = cartType,  orderType = orderType,body = body,headers = headers)}

    
    
    suspend fun deleteCart(id: String?=null, headers: Map<String, String> = emptyMap()): Response<DeleteCartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["deleteCart"]
        
        return cartApiList?.deleteCart(fullUrl,   id = id,headers = headers)}

    
    
    suspend fun getItemCount(id: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<CartItemCountResponse>? {
        var fullUrl : String? = _relativeUrls["getItemCount"]
        
        return cartApiList?.getItemCount(fullUrl,   id = id,  buyNow = buyNow,headers = headers)}

    
    
    suspend fun getCoupons(id: String?=null,buyNow: Boolean?=null,slug: String?=null,storeId: String?=null, headers: Map<String, String> = emptyMap()): Response<GetCouponResponse>? {
        var fullUrl : String? = _relativeUrls["getCoupons"]
        
        return cartApiList?.getCoupons(fullUrl,   id = id,  buyNow = buyNow,  slug = slug,  storeId = storeId,headers = headers)}

    
    
    suspend fun applyCoupon(i: Boolean?=null,b: Boolean?=null,p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,cartType: String?=null,body: ApplyCouponRequest, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["applyCoupon"]
        
        return cartApiList?.applyCoupon(fullUrl,   i = i,  b = b,  p = p,  id = id,  buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
    suspend fun removeCoupon(id: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["removeCoupon"]
        
        return cartApiList?.removeCoupon(fullUrl,   id = id,  buyNow = buyNow,headers = headers)}

    
    
    suspend fun getBulkDiscountOffers(itemId: Int?=null,articleId: String?=null,uid: Int?=null,slug: String?=null, headers: Map<String, String> = emptyMap()): Response<BulkPriceResponse>? {
        var fullUrl : String? = _relativeUrls["getBulkDiscountOffers"]
        
        return cartApiList?.getBulkDiscountOffers(fullUrl,   itemId = itemId,  articleId = articleId,  uid = uid,  slug = slug,headers = headers)}

    
    
    suspend fun applyRewardPoints(id: String?=null,i: Boolean?=null,b: Boolean?=null,buyNow: Boolean?=null,body: RewardPointRequest, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["applyRewardPoints"]
        
        return cartApiList?.applyRewardPoints(fullUrl,   id = id,  i = i,  b = b,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun getAddresses(cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<GetAddressesResponse>? {
        var fullUrl : String? = _relativeUrls["getAddresses"]
        
        return cartApiList?.getAddresses(fullUrl,   cartId = cartId,  buyNow = buyNow,  mobileNo = mobileNo,  checkoutMode = checkoutMode,  tags = tags,  isDefault = isDefault,headers = headers)}

    
    
    suspend fun addAddress(body: Address, headers: Map<String, String> = emptyMap()): Response<SaveAddressResponse>? {
        var fullUrl : String? = _relativeUrls["addAddress"]
        
        return cartApiList?.addAddress(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getAddressById(id: String,cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<Address>? {
        var fullUrl : String? = _relativeUrls["getAddressById"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.getAddressById(fullUrl,    cartId = cartId,  buyNow = buyNow,  mobileNo = mobileNo,  checkoutMode = checkoutMode,  tags = tags,  isDefault = isDefault,headers = headers)}

    
    
    suspend fun updateAddress(id: String,body: Address, headers: Map<String, String> = emptyMap()): Response<UpdateAddressResponse>? {
        var fullUrl : String? = _relativeUrls["updateAddress"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.updateAddress(fullUrl,  body = body,headers = headers)}

    
    
    suspend fun removeAddress(id: String, headers: Map<String, String> = emptyMap()): Response<DeleteAddressResponse>? {
        var fullUrl : String? = _relativeUrls["removeAddress"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.removeAddress(fullUrl,  headers = headers)}

    
    
    suspend fun selectAddress(cartId: String?=null,buyNow: Boolean?=null,i: Boolean?=null,b: Boolean?=null,body: SelectCartAddressRequest, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["selectAddress"]
        
        return cartApiList?.selectAddress(fullUrl,   cartId = cartId,  buyNow = buyNow,  i = i,  b = b,body = body,headers = headers)}

    
    
    suspend fun selectPaymentMode(id: String?=null,buyNow: Boolean?=null,body: UpdateCartPaymentRequest, headers: Map<String, String> = emptyMap()): Response<CartDetailResponse>? {
        var fullUrl : String? = _relativeUrls["selectPaymentMode"]
        
        return cartApiList?.selectPaymentMode(fullUrl,   id = id,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun validateCouponForPayment(id: String?=null,buyNow: Boolean?=null,addressId: String?=null,paymentMode: String?=null,paymentIdentifier: String?=null,aggregatorName: String?=null,merchantCode: String?=null,iin: String?=null,network: String?=null,type: String?=null,cardId: String?=null,cartType: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentCouponValidate>? {
        var fullUrl : String? = _relativeUrls["validateCouponForPayment"]
        
        return cartApiList?.validateCouponForPayment(fullUrl,   id = id,  buyNow = buyNow,  addressId = addressId,  paymentMode = paymentMode,  paymentIdentifier = paymentIdentifier,  aggregatorName = aggregatorName,  merchantCode = merchantCode,  iin = iin,  network = network,  type = type,  cardId = cardId,  cartType = cartType,headers = headers)}

    
    
    suspend fun getShipments(p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null, headers: Map<String, String> = emptyMap()): Response<CartShipmentsResponse>? {
        var fullUrl : String? = _relativeUrls["getShipments"]
        
        return cartApiList?.getShipments(fullUrl,   p = p,  id = id,  buyNow = buyNow,  addressId = addressId,  areaCode = areaCode,  orderType = orderType,headers = headers)}

    
    
    suspend fun updateCartMeta(id: String?=null,buyNow: Boolean?=null,body: CartMetaRequest, headers: Map<String, String> = emptyMap()): Response<CartMetaResponse>? {
        var fullUrl : String? = _relativeUrls["updateCartMeta"]
        
        return cartApiList?.updateCartMeta(fullUrl,   id = id,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun getCartShareLink(body: GetShareCartLinkRequest, headers: Map<String, String> = emptyMap()): Response<GetShareCartLinkResponse>? {
        var fullUrl : String? = _relativeUrls["getCartShareLink"]
        
        return cartApiList?.getCartShareLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getCartSharedItems(token: String, headers: Map<String, String> = emptyMap()): Response<SharedCartResponse>? {
        var fullUrl : String? = _relativeUrls["getCartSharedItems"]
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        return cartApiList?.getCartSharedItems(fullUrl,  headers = headers)}

    
    
    suspend fun updateCartWithSharedItems(token: String,action: String, headers: Map<String, String> = emptyMap()): Response<SharedCartResponse>? {
        var fullUrl : String? = _relativeUrls["updateCartWithSharedItems"]
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        fullUrl = fullUrl?.replace("{" + "action" +"}",action.toString())
        
        return cartApiList?.updateCartWithSharedItems(fullUrl,   headers = headers)}

    
    
    suspend fun getPromotionOffers(slug: String?=null,pageSize: Int?=null,promotionGroup: String?=null,storeId: Int?=null,cartType: String?=null, headers: Map<String, String> = emptyMap()): Response<PromotionOffersResponse>? {
        var fullUrl : String? = _relativeUrls["getPromotionOffers"]
        
        return cartApiList?.getPromotionOffers(fullUrl,   slug = slug,  pageSize = pageSize,  promotionGroup = promotionGroup,  storeId = storeId,  cartType = cartType,headers = headers)}

    
    
    suspend fun getLadderOffers(slug: String,storeId: String?=null,promotionId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<LadderPriceOffers>? {
        var fullUrl : String? = _relativeUrls["getLadderOffers"]
        
        return cartApiList?.getLadderOffers(fullUrl,   slug = slug,  storeId = storeId,  promotionId = promotionId,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getPromotionPaymentOffers(id: String?=null,uid: Int?=null, headers: Map<String, String> = emptyMap()): Response<PromotionPaymentOffersResponse>? {
        var fullUrl : String? = _relativeUrls["getPromotionPaymentOffers"]
        
        return cartApiList?.getPromotionPaymentOffers(fullUrl,   id = id,  uid = uid,headers = headers)}

    
    
    suspend fun checkoutCartV2(buyNow: Boolean?=null,cartType: String?=null,body: CartCheckoutDetailV2Request, headers: Map<String, String> = emptyMap()): Response<CartCheckoutResponse>? {
        var fullUrl : String? = _relativeUrls["checkoutCartV2"]
        
        return cartApiList?.checkoutCartV2(fullUrl,   buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
}
