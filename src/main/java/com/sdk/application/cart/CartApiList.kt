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
    suspend fun getCart(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,         @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @HEAD
    suspend fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Void>
    
    
    @POST
    suspend fun addItems(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Query("order_type") orderType: String?, @Body body: AddCartCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResult>
    
    
    @PUT
    suspend fun updateCart(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,        @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResult>
    
    
    @PATCH
    suspend fun updateCartBreakup(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: UpdateCartBreakup, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResult>
    
    
    @PUT
    suspend fun deleteCart(@Url url1: String?    ,  @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCartDetailResult>
    
    
    @GET
    suspend fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCountResult>
    
    
    @GET
    suspend fun getCoupons(@Url url1: String?    ,     @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("product_slug") productSlug: String?, @Query("store_id") storeId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCouponResult>
    
    
    @POST
    suspend fun applyCoupon(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,       @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: ApplyCoupon, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @DELETE
    suspend fun removeCoupon(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @GET
    suspend fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkPriceResult>
    
    
    @POST
    suspend fun applyLoyaltyPoints(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RedeemLoyaltyPoints, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @GET
    suspend fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAddressesResult>
    
    
    @POST
    suspend fun addAddress(@Url url1: String?   ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveAddressResult>
    
    
    @GET
    suspend fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Address>
    
    
    @PUT
    suspend fun updateAddress(@Url url1: String?    ,@Body body: Address, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAddressResult>
    
    
    @DELETE
    suspend fun removeAddress(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteAddressResult>
    
    
    @POST
    suspend fun selectAddress(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @PUT
    suspend fun selectPaymentMode(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    
    @GET
    suspend fun validateCouponForPayment(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,             @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCouponValidate>
    
    
    @GET
    suspend fun getShipments(@Url url1: String?    ,       @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartShipmentsResult>
    
    
    @POST
    suspend fun checkoutCart(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResult>
    
    
    @PUT
    suspend fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaResult>
    
    
    @POST
    suspend fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetShareCartLinkResult>
    
    
    @GET
    suspend fun getCartSharedItems(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResult>
    
    
    @POST
    suspend fun updateCartWithSharedItems(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResult>
    
    
    @GET
    suspend fun getPromotionOffers(@Url url1: String?    ,         @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?, @Query("store_id") storeId: Int?, @Query("cart_type") cartType: String?, @Query("promotion_type") promotionType: String?, @Query("cart_id") cartId: String?, @Query("auto_apply") autoApply: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionOffersResult>
    
    
    @GET
    suspend fun getLadderOffers(@Url url1: String?    ,     @Query("slug") slug: String, @Query("store_id") storeId: String?, @Query("promotion_id") promotionId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LadderPriceOffers>
    
    
    @GET
    suspend fun getPromotionPaymentOffers(@Url url1: String?    ,   @Query("id") id: String?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionPaymentOffersResult>
    
    
    @POST
    suspend fun checkoutCartV2(@Url url1: String?    ,  @Header("x-ordering-source") xOrderingSource: String?,   @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @Body body: CartCheckoutDetailV2Creation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResult>
    
    
    @GET
    suspend fun getOffers(@Url url1: String?    ,        @Query("mode") mode: String?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("product_slug") productSlug: String?, @Query("store_id") storeId: String?, @Query("type") type: Boolean?, @Query("product_size") productSize: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetOfferResult>
    
    
    @POST
    suspend fun applyOffer(@Url url1: String?    ,   @Query("id") id: String, @Query("buy_now") buyNow: Boolean?, @Body body: ApplyOfferSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<OfferListItem>
    
    
    @DELETE
    suspend fun removeOffer(@Url url1: String?    ,   @Query("id") id: String, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OfferListItem>
    
    
    @GET
    suspend fun getProductsByOfferId(@Url url1: String?    ,    @Query("offer_id") offerId: String, @Query("page") page: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<EligibleProductsResult>
    
}
