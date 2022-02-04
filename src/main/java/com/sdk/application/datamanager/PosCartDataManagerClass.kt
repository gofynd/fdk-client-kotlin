package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class PosCartDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val posCartApiList by lazy {
        generateposCartApiList()
    }

    private fun generateposCartApiList(): PosCartApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationPosCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PosCartApiList::class.java) as? PosCartApiList
    }
    
    fun getCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, assignCardId: Int?=null): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.getCart(id = id, i = i, b = b, assignCardId = assignCardId)}

    
    
    fun getCartLastModified(id: String?=null): Deferred<Response<Void>>? {
        return posCartApiList?.getCartLastModified(id = id)}

    
    
    fun addItems(i: Boolean?=null, b: Boolean?=null, body: AddCartRequest): Deferred<Response<AddCartDetailResponse>>? {
        return posCartApiList?.addItems(i = i, b = b, body = body)}

    
    
    fun updateCart(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: UpdateCartRequest): Deferred<Response<UpdateCartDetailResponse>>? {
        return posCartApiList?.updateCart(id = id, i = i, b = b, body = body)}

    
    
    fun getItemCount(id: String?=null): Deferred<Response<CartItemCountResponse>>? {
        return posCartApiList?.getItemCount(id = id)}

    
    
    fun getCoupons(id: String?=null): Deferred<Response<GetCouponResponse>>? {
        return posCartApiList?.getCoupons(id = id)}

    
    
    fun applyCoupon(i: Boolean?=null, b: Boolean?=null, p: Boolean?=null, id: String?=null, body: ApplyCouponRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.applyCoupon(i = i, b = b, p = p, id = id, body = body)}

    
    
    fun removeCoupon(id: String?=null): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.removeCoupon(id = id)}

    
    
    fun getBulkDiscountOffers(itemId: Int?=null, articleId: String?=null, uid: Int?=null, slug: String?=null): Deferred<Response<BulkPriceResponse>>? {
        return posCartApiList?.getBulkDiscountOffers(itemId = itemId, articleId = articleId, uid = uid, slug = slug)}

    
    
    fun applyRewardPoints(id: String?=null, i: Boolean?=null, b: Boolean?=null, body: RewardPointRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.applyRewardPoints(id = id, i = i, b = b, body = body)}

    
    
    fun getAddresses(cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<GetAddressesResponse>>? {
        return posCartApiList?.getAddresses(cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun addAddress(body: Address): Deferred<Response<SaveAddressResponse>>? {
        return posCartApiList?.addAddress(body = body)}

    
    
    fun getAddressById(id: String, cartId: String?=null, mobileNo: String?=null, checkoutMode: String?=null, tags: String?=null, isDefault: Boolean?=null): Deferred<Response<Address>>? {
        return posCartApiList?.getAddressById(id = id, cartId = cartId, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault)}

    
    
    fun updateAddress(id: String, body: Address): Deferred<Response<UpdateAddressResponse>>? {
        return posCartApiList?.updateAddress(id = id, body = body)}

    
    
    fun removeAddress(id: String): Deferred<Response<DeleteAddressResponse>>? {
        return posCartApiList?.removeAddress(id = id)}

    
    
    fun selectAddress(cartId: String?=null, i: Boolean?=null, b: Boolean?=null, body: SelectCartAddressRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.selectAddress(cartId = cartId, i = i, b = b, body = body)}

    
    
    fun selectPaymentMode(id: String?=null, body: UpdateCartPaymentRequest): Deferred<Response<CartDetailResponse>>? {
        return posCartApiList?.selectPaymentMode(id = id, body = body)}

    
    
    fun validateCouponForPayment(id: String?=null, addressId: String?=null, paymentMode: String?=null, paymentIdentifier: String?=null, aggregatorName: String?=null, merchantCode: String?=null): Deferred<Response<PaymentCouponValidate>>? {
        return posCartApiList?.validateCouponForPayment(id = id, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode)}

    
    
    fun getShipments(pickAtStoreUid: Int?=null, orderingStoreId: Int?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, areaCode: String?=null, orderType: String?=null): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.getShipments(pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, p = p, id = id, addressId = addressId, areaCode = areaCode, orderType = orderType)}

    
    
    fun updateShipments(i: Boolean?=null, p: Boolean?=null, id: String?=null, addressId: String?=null, orderType: String?=null, body: UpdateCartShipmentRequest): Deferred<Response<CartShipmentsResponse>>? {
        return posCartApiList?.updateShipments(i = i, p = p, id = id, addressId = addressId, orderType = orderType, body = body)}

    
    
    fun checkoutCart(id: String?=null, body: CartPosCheckoutDetailRequest): Deferred<Response<CartCheckoutResponse>>? {
        return posCartApiList?.checkoutCart(id = id, body = body)}

    
    
    fun updateCartMeta(id: String?=null, body: CartMetaRequest): Deferred<Response<CartMetaResponse>>? {
        return posCartApiList?.updateCartMeta(id = id, body = body)}

    
    
    fun getAvailableDeliveryModes(areaCode: String, id: String?=null): Deferred<Response<CartDeliveryModesResponse>>? {
        return posCartApiList?.getAvailableDeliveryModes(areaCode = areaCode, id = id)}

    
    
    fun getStoreAddressByUid(storeUid: Int): Deferred<Response<StoreDetailsResponse>>? {
        return posCartApiList?.getStoreAddressByUid(storeUid = storeUid)}

    
    
    fun getCartShareLink(body: GetShareCartLinkRequest): Deferred<Response<GetShareCartLinkResponse>>? {
        return posCartApiList?.getCartShareLink(body = body)}

    
    
    fun getCartSharedItems(token: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.getCartSharedItems(token = token)}

    
    
    fun updateCartWithSharedItems(token: String, action: String): Deferred<Response<SharedCartResponse>>? {
        return posCartApiList?.updateCartWithSharedItems(token = token, action = action)}

    
    
}
