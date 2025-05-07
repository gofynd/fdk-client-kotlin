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
    suspend fun getCart(@Url url1: String?    ,          @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @HEAD
    suspend fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Void>
    
    
    @POST
    suspend fun addItems(@Url url1: String?    ,        @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Query("cart_type") cartType: String?, @Query("order_type") orderType: String?, @Body body: AddCartRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResponseObject>
    
    
    @PUT
    suspend fun updateCart(@Url url1: String?    ,        @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResponseObject>
    
    
    @PUT
    suspend fun deleteCart(@Url url1: String?    ,   @Query("id") id: String?, @Query("cart_type") cartType: String?, @Body body: DeleteCartRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCartDetail>
    
    
    @GET
    suspend fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCount>
    
    
    @GET
    suspend fun getItemCountV2(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCountResponseV2>
    
    
    @GET
    suspend fun getCoupons(@Url url1: String?    ,     @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("slug") slug: String?, @Query("store_id") storeId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCouponResponseObject>
    
    
    @POST
    suspend fun applyCoupon(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: ApplyCouponRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @DELETE
    suspend fun removeCoupon(@Url url1: String?    ,    @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @GET
    suspend fun getBulkDiscountOffers(@Url url1: String?    ,      @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkPriceResponseObject>
    
    
    @POST
    suspend fun applyRewardPoints(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: RewardPointRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @GET
    suspend fun getAddresses(@Url url1: String?    ,        @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAddressesResponseObject>
    
    
    @POST
    suspend fun addAddress(@Url url1: String?   ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveAddressResponseObject>
    
    
    @GET
    suspend fun getAddressById(@Url url1: String?     ,        @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Address>
    
    
    @PUT
    suspend fun updateAddress(@Url url1: String?    ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAddress>
    
    
    @DELETE
    suspend fun removeAddress(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteAddressResponseObject>
    
    
    @POST
    suspend fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @PUT
    suspend fun selectPaymentMode(@Url url1: String?    ,    @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?, @Body body: UpdateCartPaymentRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponseObject>
    
    
    @GET
    suspend fun validateCouponForPayment(@Url url1: String?    ,             @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCouponValidate>
    
    
    @PUT
    suspend fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaResponseObject>
    
    
    @POST
    suspend fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetShareCartLinkResponseObject>
    
    
    @GET
    suspend fun getCartSharedItems(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponseObject>
    
    
    @POST
    suspend fun updateCartWithSharedItems(@Url url1: String?      ,  @Query("cart_id") cartId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponseObject>
    
    
    @GET
    suspend fun getPromotionOffers(@Url url1: String?    ,     @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?, @Query("store_id") storeId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionOffersResponseObject>
    
    
    @GET
    suspend fun getLadderOffers(@Url url1: String?    ,     @Query("slug") slug: String, @Query("store_id") storeId: String?, @Query("promotion_id") promotionId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LadderPriceOffers>
    
    
    @GET
    suspend fun getShipments(@Url url1: String?    ,          @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartShipments>
    
    
    @POST
    suspend fun checkoutCart(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailRequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponseObject>
    
    
    @POST
    suspend fun checkoutCartV2(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailV2RequestObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponseObject>
    
    
    @GET
    suspend fun getPaymentPromotionOffers(@Url url1: String?    ,   @Query("id") id: String?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionPaymentOffersResponseObject>
    
    
    @GET
    suspend fun getCartMetaConfigs(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigListResponseObject>
    
    
    @GET
    suspend fun getCartMetaConfig(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CartConfigDetailResponseObject>
    
}
