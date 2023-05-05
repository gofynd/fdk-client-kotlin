package com.sdk.application.apis.poscart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.poscart.*

interface PosCartApiList {
    
    
    @GET 
    fun getCart(@Url url1: String?    ,       @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @HEAD 
    fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?)
    : Deferred<Response<Void>>
    
    
    @POST 
    fun addItems(@Url url1: String?    ,     @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    
    @PUT 
    fun updateCart(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    
    @GET 
    fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartItemCountResponse>>
    
    
    @GET 
    fun getCoupons(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<GetCouponResponse>>
    
    
    @POST 
    fun applyCoupon(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @DELETE 
    fun removeCoupon(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    
    @POST 
    fun applyRewardPoints(@Url url1: String?    ,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RewardPointRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    
    @POST 
    fun addAddress(@Url url1: String?   ,@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    
    @GET 
    fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    
    @PUT 
    fun updateAddress(@Url url1: String?    ,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    
    @DELETE 
    fun removeAddress(@Url url1: String?    )
    : Deferred<Response<DeleteAddressResponse>>
    
    
    @POST 
    fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @PUT 
    fun selectPaymentMode(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun validateCouponForPayment(@Url url1: String?    ,        @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    
    @GET 
    fun getShipments(@Url url1: String?    ,        @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @PUT 
    fun updateShipments(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @POST 
    fun checkoutCart(@Url url1: String?    ,  @Query("id") id: String?, @Body body: CartPosCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    
    @PUT 
    fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    
    @GET 
    fun getAvailableDeliveryModes(@Url url1: String?    ,   @Query("area_code") areaCode: String, @Query("id") id: String?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    
    @GET 
    fun getStoreAddressByUid(@Url url1: String?    ,  @Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    
    @POST 
    fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    
    @GET 
    fun getCartSharedItems(@Url url1: String?    )
    : Deferred<Response<SharedCartResponse>>
    
    
    @POST 
    fun updateCartWithSharedItems(@Url url1: String?     )
    : Deferred<Response<SharedCartResponse>>
    
}