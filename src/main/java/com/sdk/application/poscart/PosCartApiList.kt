package com.sdk.application.poscart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface PosCartApiList {
    
    
    @GET 
    suspend fun getCart(@Url url1: String?    ,        @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartDetailResponse>
    
    
    @HEAD 
    suspend fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?)
    : Response<Void>
    
    
    @POST 
    suspend fun addItems(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Body body: AddCartRequest)
    : Response<AddCartDetailResponse>
    
    
    @PUT 
    suspend fun updateCart(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartRequest)
    : Response<UpdateCartDetailResponse>
    
    
    @GET 
    suspend fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartItemCountResponse>
    
    
    @GET 
    suspend fun getCoupons(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<GetCouponResponse>
    
    
    @POST 
    suspend fun applyCoupon(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: ApplyCouponRequest)
    : Response<CartDetailResponse>
    
    
    @DELETE 
    suspend fun removeCoupon(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Response<BulkPriceResponse>
    
    
    @POST 
    suspend fun applyRewardPoints(@Url url1: String?    ,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RewardPointRequest)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Response<GetAddressesResponse>
    
    
    @POST 
    suspend fun addAddress(@Url url1: String?   ,@Body body: Address)
    : Response<SaveAddressResponse>
    
    
    @GET 
    suspend fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Response<Address>
    
    
    @PUT 
    suspend fun updateAddress(@Url url1: String?    ,@Body body: Address)
    : Response<UpdateAddressResponse>
    
    
    @DELETE 
    suspend fun removeAddress(@Url url1: String?    )
    : Response<DeleteAddressResponse>
    
    
    @POST 
    suspend fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Response<CartDetailResponse>
    
    
    @PUT 
    suspend fun selectPaymentMode(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentRequest)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun validateCouponForPayment(@Url url1: String?    ,            @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?)
    : Response<PaymentCouponValidate>
    
    
    @GET 
    suspend fun getShipments(@Url url1: String?    ,        @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Response<CartShipmentsResponse>
    
    
    @PUT 
    suspend fun updateShipments(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartShipmentRequest)
    : Response<CartShipmentsResponse>
    
    
    @POST 
    suspend fun checkoutCart(@Url url1: String?    ,  @Query("id") id: String?, @Body body: CartPosCheckoutDetailRequest)
    : Response<CartCheckoutResponse>
    
    
    @PUT 
    suspend fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest)
    : Response<CartMetaResponse>
    
    
    @GET 
    suspend fun getAvailableDeliveryModes(@Url url1: String?    ,   @Query("area_code") areaCode: String, @Query("id") id: String?)
    : Response<CartDeliveryModesResponse>
    
    
    @GET 
    suspend fun getStoreAddressByUid(@Url url1: String?    ,  @Query("store_uid") storeUid: Int)
    : Response<StoreDetailsResponse>
    
    
    @POST 
    suspend fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest)
    : Response<GetShareCartLinkResponse>
    
    
    @GET 
    suspend fun getCartSharedItems(@Url url1: String?    )
    : Response<SharedCartResponse>
    
    
    @POST 
    suspend fun updateCartWithSharedItems(@Url url1: String?     )
    : Response<SharedCartResponse>
    
}