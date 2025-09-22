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
            
                    _relativeUrls["updateCartBreakup"] = "/service/application/cart/v1.0/detail".substring(1)
            
                    _relativeUrls["deleteCart"] = "/service/application/cart/v1.0/cart_archive".substring(1)
            
                    _relativeUrls["getItemCount"] = "/service/application/cart/v1.0/basic".substring(1)
            
                    _relativeUrls["getCoupons"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["applyCoupon"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["removeCoupon"] = "/service/application/cart/v1.0/coupon".substring(1)
            
                    _relativeUrls["getBulkDiscountOffers"] = "/service/application/cart/v1.0/bulk-price".substring(1)
            
                    _relativeUrls["applyLoyaltyPoints"] = "/service/application/cart/v1.0/redeem".substring(1)
            
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
    
    suspend fun getCart(xOrderingSource: OrderingSource?=null,id: String?=null,i: Boolean?=null,b: Boolean?=null,c: Boolean?=null,assignCardId: Int?=null,areaCode: String?=null,buyNow: Boolean?=null,orderType: String?=null, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["getCart"]
        
        return cartApiList?.getCart(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  i = i,  b = b,  c = c,  assignCardId = assignCardId,  areaCode = areaCode,  buyNow = buyNow,  orderType = orderType,headers = headers)}

    
    
    suspend fun getCartLastModified(id: String?=null, headers: Map<String, String> = emptyMap()): Response<Void>? {
        var fullUrl : String? = _relativeUrls["getCartLastModified"]
        
        return cartApiList?.getCartLastModified(fullUrl,   id = id,headers = headers)}

    
    
    suspend fun addItems(xOrderingSource: OrderingSource?=null,i: Boolean?=null,b: Boolean?=null,areaCode: String?=null,buyNow: Boolean?=null,id: String?=null,orderType: String?=null,body: AddCartCreation, headers: Map<String, String> = emptyMap()): Response<AddCartDetailResult>? {
        var fullUrl : String? = _relativeUrls["addItems"]
        
        return cartApiList?.addItems(fullUrl,   xOrderingSource = xOrderingSource,  i = i,  b = b,  areaCode = areaCode,  buyNow = buyNow,  id = id,  orderType = orderType,body = body,headers = headers)}

    
    
    suspend fun updateCart(xOrderingSource: OrderingSource?=null,id: String?=null,i: Boolean?=null,b: Boolean?=null,areaCode: String?=null,buyNow: Boolean?=null,cartType: String?=null,orderType: String?=null,body: UpdateCartCreation, headers: Map<String, String> = emptyMap()): Response<UpdateCartDetailResult>? {
        var fullUrl : String? = _relativeUrls["updateCart"]
        
        return cartApiList?.updateCart(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  i = i,  b = b,  areaCode = areaCode,  buyNow = buyNow,  cartType = cartType,  orderType = orderType,body = body,headers = headers)}

    
    
    suspend fun updateCartBreakup(xOrderingSource: OrderingSource?=null,id: String?=null,i: Boolean?=null,b: Boolean?=null,buyNow: Boolean?=null,cartType: String?=null,body: UpdateCartBreakup, headers: Map<String, String> = emptyMap()): Response<UpdateCartDetailResult>? {
        var fullUrl : String? = _relativeUrls["updateCartBreakup"]
        
        return cartApiList?.updateCartBreakup(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  i = i,  b = b,  buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
    suspend fun deleteCart(id: String?=null, headers: Map<String, String> = emptyMap()): Response<DeleteCartDetailResult>? {
        var fullUrl : String? = _relativeUrls["deleteCart"]
        
        return cartApiList?.deleteCart(fullUrl,   id = id,headers = headers)}

    
    
    suspend fun getItemCount(id: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<CartItemCountResult>? {
        var fullUrl : String? = _relativeUrls["getItemCount"]
        
        return cartApiList?.getItemCount(fullUrl,   id = id,  buyNow = buyNow,headers = headers)}

    
    
    suspend fun getCoupons(id: String?=null,buyNow: Boolean?=null,productSlug: String?=null,storeId: String?=null, headers: Map<String, String> = emptyMap()): Response<GetCouponResult>? {
        var fullUrl : String? = _relativeUrls["getCoupons"]
        
        return cartApiList?.getCoupons(fullUrl,   id = id,  buyNow = buyNow,  productSlug = productSlug,  storeId = storeId,headers = headers)}

    
    
    suspend fun applyCoupon(xOrderingSource: OrderingSource?=null,i: Boolean?=null,b: Boolean?=null,p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,cartType: String?=null,body: ApplyCoupon, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["applyCoupon"]
        
        return cartApiList?.applyCoupon(fullUrl,   xOrderingSource = xOrderingSource,  i = i,  b = b,  p = p,  id = id,  buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
    suspend fun removeCoupon(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["removeCoupon"]
        
        return cartApiList?.removeCoupon(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  buyNow = buyNow,headers = headers)}

    
    
    suspend fun getBulkDiscountOffers(itemId: Int?=null,articleId: String?=null,uid: Int?=null,slug: String?=null, headers: Map<String, String> = emptyMap()): Response<BulkPriceResult>? {
        var fullUrl : String? = _relativeUrls["getBulkDiscountOffers"]
        
        return cartApiList?.getBulkDiscountOffers(fullUrl,   itemId = itemId,  articleId = articleId,  uid = uid,  slug = slug,headers = headers)}

    
    
    suspend fun applyLoyaltyPoints(xOrderingSource: OrderingSource?=null,id: String?=null,i: Boolean?=null,b: Boolean?=null,buyNow: Boolean?=null,body: RedeemLoyaltyPoints, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["applyLoyaltyPoints"]
        
        return cartApiList?.applyLoyaltyPoints(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  i = i,  b = b,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun getAddresses(cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<GetAddressesResult>? {
        var fullUrl : String? = _relativeUrls["getAddresses"]
        
        return cartApiList?.getAddresses(fullUrl,   cartId = cartId,  buyNow = buyNow,  mobileNo = mobileNo,  checkoutMode = checkoutMode,  tags = tags,  isDefault = isDefault,headers = headers)}

    
    
    suspend fun addAddress(body: Address, headers: Map<String, String> = emptyMap()): Response<SaveAddressResult>? {
        var fullUrl : String? = _relativeUrls["addAddress"]
        
        return cartApiList?.addAddress(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getAddressById(id: String,cartId: String?=null,buyNow: Boolean?=null,mobileNo: String?=null,checkoutMode: String?=null,tags: String?=null,isDefault: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<Address>? {
        var fullUrl : String? = _relativeUrls["getAddressById"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.getAddressById(fullUrl,    cartId = cartId,  buyNow = buyNow,  mobileNo = mobileNo,  checkoutMode = checkoutMode,  tags = tags,  isDefault = isDefault,headers = headers)}

    
    
    suspend fun updateAddress(id: String,body: Address, headers: Map<String, String> = emptyMap()): Response<UpdateAddressResult>? {
        var fullUrl : String? = _relativeUrls["updateAddress"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.updateAddress(fullUrl,  body = body,headers = headers)}

    
    
    suspend fun removeAddress(id: String, headers: Map<String, String> = emptyMap()): Response<DeleteAddressResult>? {
        var fullUrl : String? = _relativeUrls["removeAddress"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return cartApiList?.removeAddress(fullUrl,  headers = headers)}

    
    
    suspend fun selectAddress(xOrderingSource: OrderingSource?=null,cartId: String?=null,buyNow: Boolean?=null,i: Boolean?=null,b: Boolean?=null,body: SelectCartAddressCreation, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["selectAddress"]
        
        return cartApiList?.selectAddress(fullUrl,   xOrderingSource = xOrderingSource,  cartId = cartId,  buyNow = buyNow,  i = i,  b = b,body = body,headers = headers)}

    
    
    suspend fun selectPaymentMode(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null,body: UpdateCartPaymentCreation, headers: Map<String, String> = emptyMap()): Response<CartDetailResult>? {
        var fullUrl : String? = _relativeUrls["selectPaymentMode"]
        
        return cartApiList?.selectPaymentMode(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun validateCouponForPayment(xOrderingSource: OrderingSource?=null,id: String?=null,buyNow: Boolean?=null,addressId: String?=null,paymentMode: String?=null,paymentIdentifier: String?=null,aggregatorName: String?=null,merchantCode: String?=null,iin: String?=null,network: String?=null,type: String?=null,cardId: String?=null,cartType: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentCouponValidate>? {
        var fullUrl : String? = _relativeUrls["validateCouponForPayment"]
        
        return cartApiList?.validateCouponForPayment(fullUrl,   xOrderingSource = xOrderingSource,  id = id,  buyNow = buyNow,  addressId = addressId,  paymentMode = paymentMode,  paymentIdentifier = paymentIdentifier,  aggregatorName = aggregatorName,  merchantCode = merchantCode,  iin = iin,  network = network,  type = type,  cardId = cardId,  cartType = cartType,headers = headers)}

    
    
    suspend fun getShipments(p: Boolean?=null,id: String?=null,buyNow: Boolean?=null,addressId: String?=null,areaCode: String?=null,orderType: String?=null, headers: Map<String, String> = emptyMap()): Response<CartShipmentsResult>? {
        var fullUrl : String? = _relativeUrls["getShipments"]
        
        return cartApiList?.getShipments(fullUrl,   p = p,  id = id,  buyNow = buyNow,  addressId = addressId,  areaCode = areaCode,  orderType = orderType,headers = headers)}

    
    
    suspend fun checkoutCart(xOrderingSource: OrderingSource?=null,buyNow: Boolean?=null,cartType: String?=null,body: CartCheckoutDetailCreation, headers: Map<String, String> = emptyMap()): Response<CartCheckoutResult>? {
        var fullUrl : String? = _relativeUrls["checkoutCart"]
        
        return cartApiList?.checkoutCart(fullUrl,   xOrderingSource = xOrderingSource,  buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
    suspend fun updateCartMeta(id: String?=null,buyNow: Boolean?=null,body: CartMetaCreation, headers: Map<String, String> = emptyMap()): Response<CartMetaResult>? {
        var fullUrl : String? = _relativeUrls["updateCartMeta"]
        
        return cartApiList?.updateCartMeta(fullUrl,   id = id,  buyNow = buyNow,body = body,headers = headers)}

    
    
    suspend fun getCartShareLink(body: GetShareCartLinkCreation, headers: Map<String, String> = emptyMap()): Response<GetShareCartLinkResult>? {
        var fullUrl : String? = _relativeUrls["getCartShareLink"]
        
        return cartApiList?.getCartShareLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getCartSharedItems(token: String, headers: Map<String, String> = emptyMap()): Response<SharedCartResult>? {
        var fullUrl : String? = _relativeUrls["getCartSharedItems"]
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        return cartApiList?.getCartSharedItems(fullUrl,  headers = headers)}

    
    
    suspend fun updateCartWithSharedItems(token: String,action: String, headers: Map<String, String> = emptyMap()): Response<SharedCartResult>? {
        var fullUrl : String? = _relativeUrls["updateCartWithSharedItems"]
        
        fullUrl = fullUrl?.replace("{" + "token" +"}",token.toString())
        
        fullUrl = fullUrl?.replace("{" + "action" +"}",action.toString())
        
        return cartApiList?.updateCartWithSharedItems(fullUrl,   headers = headers)}

    
    
    suspend fun getPromotionOffers(slug: String?=null,pageSize: Int?=null,promotionGroup: String?=null,storeId: Int?=null,cartType: String?=null,promotionType: String?=null,cartId: String?=null,autoApply: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<PromotionOffersResult>? {
        var fullUrl : String? = _relativeUrls["getPromotionOffers"]
        
        return cartApiList?.getPromotionOffers(fullUrl,   slug = slug,  pageSize = pageSize,  promotionGroup = promotionGroup,  storeId = storeId,  cartType = cartType,  promotionType = promotionType,  cartId = cartId,  autoApply = autoApply,headers = headers)}

    
    
    suspend fun getLadderOffers(slug: String,storeId: String?=null,promotionId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<LadderPriceOffers>? {
        var fullUrl : String? = _relativeUrls["getLadderOffers"]
        
        return cartApiList?.getLadderOffers(fullUrl,   slug = slug,  storeId = storeId,  promotionId = promotionId,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getPromotionPaymentOffers(id: String?=null,uid: Int?=null, headers: Map<String, String> = emptyMap()): Response<PromotionPaymentOffersResult>? {
        var fullUrl : String? = _relativeUrls["getPromotionPaymentOffers"]
        
        return cartApiList?.getPromotionPaymentOffers(fullUrl,   id = id,  uid = uid,headers = headers)}

    
    
    suspend fun checkoutCartV2(xOrderingSource: OrderingSource?=null,buyNow: Boolean?=null,cartType: String?=null,body: CartCheckoutDetailV2Creation, headers: Map<String, String> = emptyMap()): Response<CartCheckoutResult>? {
        var fullUrl : String? = _relativeUrls["checkoutCartV2"]
        
        return cartApiList?.checkoutCartV2(fullUrl,   xOrderingSource = xOrderingSource,  buyNow = buyNow,  cartType = cartType,body = body,headers = headers)}

    
    
}
