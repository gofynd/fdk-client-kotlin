package com.sdk.application.datamanager

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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.getCart(id = id, i = i, b = b, assignCardId = assignCardId)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        return cartApiList?.getCartLastModified(id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        return cartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        return cartApiList?.updateCart(id = id, i = i, b = b, body = body)}

    
    
    fun getItemCount(id: String?=null): Deferred<Response<CartItemCountResponse>>? {
        return cartApiList?.getItemCount(id = id)}

    
    
    fun getCoupons(id: String?=null): Deferred<Response<GetCouponResponse>>? {
        return cartApiList?.getCoupons(id = id)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.applyCoupon(i = i, b = b, p = p, id = id, body = body)}

    
    
    fun removeCoupon(id: String?=null): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.removeCoupon(id = id)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return cartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: RewardPointRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.applyRewardPoints(id = id, i = i, b = b, body = body)}

    
    
    fun getAddresses(cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return cartApiList?.getAddresses(cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return cartApiList?.addAddress(body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return cartApiList?.getAddressById(id = id, cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return cartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return cartApiList?.removeAddress(id = id)}

    
    
    fun selectAddress(cartId: String?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.selectAddress(cartId = cartId, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        return cartApiList?.selectPaymentMode(id = id, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidate>>? {
        return cartApiList?.validateCouponForPayment(id = id, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode)}

    
    
    fun getShipments(p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return cartApiList?.getShipments(p = p, id = id, addressId = addressId, areaCode = areaCode)}

    
    
    fun checkoutCart(body: CartCheckoutDetailRequest): Deferred<Response<CartCheckoutResponse>>? {
        return cartApiList?.checkoutCart(body = body)}

    
    
    fun updateCartMeta(id: String?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return cartApiList?.updateCartMeta(id = id, body = body)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return cartApiList?.getCartShareLink(body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.getCartSharedItems(token = token)}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return cartApiList?.updateCartWithSharedItems(token = token, action = action)}

    
    
    fun getPromotionOffers(slug: String?=null, pageSize: Int?=null): Deferred<Response<PromotionOffersResponse>>? {
        return cartApiList?.getPromotionOffers(slug = slug, pageSize = pageSize)}

    
    
    fun getLadderOffers(slug: String, promotionId: String?=null, pageSize: Int?=null): Deferred<Response<LadderPriceOffers>>? {
        return cartApiList?.getLadderOffers(slug = slug, promotionId = promotionId, pageSize = pageSize)}

    
    
}
