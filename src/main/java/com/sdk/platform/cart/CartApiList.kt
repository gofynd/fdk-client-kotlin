package com.sdk.platform.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface CartApiList {
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun getCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_archived") isArchived: Boolean?, @Query("title") title: String?, @Query("is_public") isPublic: Boolean?, @Query("is_display") isDisplay: Boolean?, @Query("type_slug") typeSlug: String?, @Query("code") code: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun createCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CouponAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun getCouponById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponUpdate>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCouponPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun getPromotions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @Query("promo_group") promoGroup: String?, @Query("promotion_type") promotionType: String?, @Query("fp_panel") fpPanel: String?, @Query("promotion_id") promotionId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun createPromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PromotionAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionAdd>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun getPromotionById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionUpdate>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionUpdate>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotionPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    suspend fun getPromosCouponConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("entity_type") entityType: String?, @Query("is_hidden") isHidden: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ActivePromosResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-promotions")
    suspend fun getPromotionOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?, @Query("store_id") storeId: Int?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionOffersResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-payment-offers")
    suspend fun getPromotionPaymentOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionPaymentOffersResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    suspend fun updateCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_meta_id") cartMetaId: String,@Body body: CartMetaConfigUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigUpdate>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun fetchCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigAdd>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun createCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CartMetaConfigAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigAdd>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    suspend fun updatePriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PriceAdjustmentUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<PriceAdjustmentResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    suspend fun removePriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    suspend fun addPriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PriceAdjustmentAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<PriceAdjustmentResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    suspend fun getPriceAdjustments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPriceAdjustmentResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    suspend fun fetchAndvalidateCartItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenapiCartDetailsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenapiCartDetailsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    suspend fun checkCartServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiCartServiceabilityRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenApiCartServiceabilityResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    suspend fun checkoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiPlatformCheckoutReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenApiCheckoutResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    suspend fun getAbandonedCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("anonymous_cart") anonymousCart: Boolean?, @Query("last_id") lastId: String?, @Query("sort_on") sortOn: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AbandonedCartResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    suspend fun getAbandonedCartDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun addItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: AddCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun updateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: UpdateCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    suspend fun getCouponOptionValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    suspend fun getCouponCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    suspend fun getPromotionCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    suspend fun overrideCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OverrideCheckoutReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<OverrideCheckoutResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    suspend fun getCartShareLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetShareCartLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetShareCartLinkResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    suspend fun getCartSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    suspend fun updateCartWithSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @Path("action") action: String, @Query("cart_id") cartId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    suspend fun getCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("filter_on") filterOn: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<MultiCartResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    suspend fun updateCartUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: UpdateUserCartMapping, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserCartMappingResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun getCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("order_type") orderType: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformAddItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?, @Query("id") id: String?,@Body body: PlatformAddCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformUpdateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("order_type") orderType: String?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?,@Body body: PlatformUpdateCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    suspend fun deleteCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: DeleteCartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    suspend fun getItemCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCountResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun getAppCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("slug") slug: String?, @Query("store_id") storeId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCouponResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun applyCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: ApplyCouponRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun removeCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: String?, @Query("buy_now") buyNow: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun getAddresses(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformGetAddressesResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun addAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveAddressResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun getAddressById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformAddress>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun updateAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PlatformAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAddressResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun removeAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteAddressResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    suspend fun selectAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: PlatformSelectCartAddressRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun getShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformCartShipmentsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun updateShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformCartShipmentsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    suspend fun updateCartMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: PlatformCartMetaRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: PlatformCartCheckoutDetailRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    suspend fun getAvailableDeliveryModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("area_code") areaCode: String, @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDeliveryModesResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    suspend fun getStoreAddressByUid(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_uid") storeUid: Int, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreDetailsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentMode(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    suspend fun validateCouponForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCouponValidate>
    
    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCartV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: PlatformCartCheckoutDetailV2Request, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResponse>
    
    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentModeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentRequestV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResponse>
    
}
