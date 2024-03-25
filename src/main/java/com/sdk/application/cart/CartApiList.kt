package com.sdk.application.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface CartApiList {
    
    
    @GET 
    suspend fun getCart(@Url url1: String?    ,         @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?)
    : Response<CartDetailResponse>
    
    
    @HEAD 
    suspend fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?)
    : Response<Void>
    
    
    @POST 
    suspend fun addItems(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Query("cart_type") cartType: String?, @Body body: AddCartRequest)
    : Response<AddCartDetailResponse>
    
    
    @PUT 
    suspend fun updateCart(@Url url1: String?    ,       @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: UpdateCartRequest)
    : Response<UpdateCartDetailResponse>
    
    
    @PUT 
    suspend fun deleteCart(@Url url1: String?    ,   @Query("id") id: String?, @Query("cart_type") cartType: String?, @Body body: DeleteCartRequest)
    : Response<DeleteCartDetailResponse>
    
    
    @GET 
    suspend fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartItemCountResponse>
    
    
    @GET 
    suspend fun getItemCountV2(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartItemCountResponseV2>
    
    
    @GET 
    suspend fun getCoupons(@Url url1: String?    ,     @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("slug") slug: String?, @Query("store_id") storeId: String?)
    : Response<GetCouponResponse>
    
    
    @POST 
    suspend fun applyCoupon(@Url url1: String?    ,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: ApplyCouponRequest)
    : Response<CartDetailResponse>
    
    
    @DELETE 
    suspend fun removeCoupon(@Url url1: String?    ,    @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun getBulkDiscountOffers(@Url url1: String?    ,      @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?, @Query("cart_type") cartType: String?)
    : Response<BulkPriceResponse>
    
    
    @POST 
    suspend fun applyRewardPoints(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: RewardPointRequest)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun getAddresses(@Url url1: String?    ,        @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
    : Response<GetAddressesResponse>
    
    
    @POST 
    suspend fun addAddress(@Url url1: String?   ,@Body body: Address)
    : Response<SaveAddressResponse>
    
    
    @GET 
    suspend fun getAddressById(@Url url1: String?     ,        @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
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
    suspend fun selectPaymentMode(@Url url1: String?    ,    @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?, @Body body: UpdateCartPaymentRequest)
    : Response<CartDetailResponse>
    
    
    @GET 
    suspend fun validateCouponForPayment(@Url url1: String?    ,             @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?, @Query("cart_type") cartType: String?)
    : Response<PaymentCouponValidate>
    
    
    @PUT 
    suspend fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest)
    : Response<CartMetaResponse>
    
    
    @POST 
    suspend fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest)
    : Response<GetShareCartLinkResponse>
    
    
    @GET 
    suspend fun getCartSharedItems(@Url url1: String?    )
    : Response<SharedCartResponse>
    
    
    @POST 
    suspend fun updateCartWithSharedItems(@Url url1: String?      ,  @Query("cart_id") cartId: String?)
    : Response<SharedCartResponse>
    
    
    @GET 
    suspend fun getPromotionOffers(@Url url1: String?    ,      @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?, @Query("store_id") storeId: Int?, @Query("cart_type") cartType: String?)
    : Response<PromotionOffersResponse>
    
    
    @GET 
    suspend fun getLadderOffers(@Url url1: String?    ,     @Query("slug") slug: String, @Query("store_id") storeId: String?, @Query("promotion_id") promotionId: String?, @Query("page_size") pageSize: Int?)
    : Response<LadderPriceOffers>
    
    
    @GET 
    suspend fun getShipments(@Url url1: String?    ,         @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Response<CartShipmentsResponse>
    
    
    @POST 
    suspend fun checkoutCart(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailRequest)
    : Response<CartCheckoutResponse>
    
    
    @POST 
    suspend fun checkoutCartV2(@Url url1: String?    ,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailV2Request)
    : Response<CartCheckoutResponse>
    
    
    @GET 
    suspend fun getCartMetaConfigs(@Url url1: String?   )
    : Response<CartMetaConfigListResponse>
    
    
    @GET 
    suspend fun getCartMetaConfig(@Url url1: String?    )
    : Response<CartConfigDetailResponse>
    
}