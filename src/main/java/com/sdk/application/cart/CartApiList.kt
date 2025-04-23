package com.sdk.application.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface CartApiList {
    
    
    @GET
    suspend fun getCart(@Url url1: String?    ,         @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @HEAD
    suspend fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Void>
    
    
    @POST
    suspend fun addItems(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Query("order_type") orderType: String?, @Body body: AddCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResponse>
    
    
    @PUT
    suspend fun updateCart(@Url url1: String?    ,        @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResponse>
    
    
    @PUT
    suspend fun deleteCart(@Url url1: String?    ,  @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCartDetailResponse>
    
    
    @GET
    suspend fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCountResponse>
    
    
    @GET
    suspend fun getCoupons(@Url url1: String?    ,     @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("slug") slug: String?, @Query("store_id") storeId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCouponResponse>
    
    
    @POST
    suspend fun applyCoupon(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: ApplyCouponRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @DELETE
    suspend fun removeCoupon(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @GET
    suspend fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkPriceResponse>
    
    
    @POST
    suspend fun applyRewardPoints(@Url url1: String?    ,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RewardPointRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @GET
    suspend fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAddressesResponse>
    
    
    @POST
    suspend fun addAddress(@Url url1: String?   ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveAddressResponse>
    
    
    @GET
    suspend fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Address>
    
    
    @PUT
    suspend fun updateAddress(@Url url1: String?    ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAddressResponse>
    
    
    @DELETE
    suspend fun removeAddress(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteAddressResponse>
    
    
    @POST
    suspend fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @PUT
    suspend fun selectPaymentMode(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    
    @GET
    suspend fun validateCouponForPayment(@Url url1: String?    ,             @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCouponValidate>
    
    
    @GET
    suspend fun getShipments(@Url url1: String?    ,       @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartShipmentsResponse>
    
    
    @POST
    suspend fun checkoutCart(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponse>
    
    
    @PUT
    suspend fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaResponse>
    
    
    @POST
    suspend fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetShareCartLinkResponse>
    
    
    @GET
    suspend fun getCartSharedItems(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponse>
    
    
    @POST
    suspend fun updateCartWithSharedItems(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponse>
    
    
    @GET
    suspend fun getPromotionOffers(@Url url1: String?    ,      @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?, @Query("store_id") storeId: Int?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionOffersResponse>
    
    
    @GET
    suspend fun getLadderOffers(@Url url1: String?    ,     @Query("slug") slug: String, @Query("store_id") storeId: String?, @Query("promotion_id") promotionId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LadderPriceOffers>
    
    
    @GET
    suspend fun getPromotionPaymentOffers(@Url url1: String?    ,   @Query("id") id: String?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionPaymentOffersResponse>
    
    
    @POST
    suspend fun checkoutCartV2(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailV2Request, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponse>
    
}
