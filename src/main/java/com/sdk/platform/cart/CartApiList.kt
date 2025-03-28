package com.sdk.platform.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface CartApiList {
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun createCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CouponAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun getCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_archived") isArchived: Boolean?, @Query("title") title: String?, @Query("is_public") isPublic: Boolean?, @Query("is_display") isDisplay: Boolean?, @Query("type_slug") typeSlug: String?, @Query("code") code: String?, @Query("created_by") createdBy: String?, @Query("reviewed_by") reviewedBy: String?, @Query("approved_start_time") approvedStartTime: String?, @Query("approved_end_time") approvedEndTime: String?, @Query("review_start_time") reviewStartTime: String?, @Query("review_end_time") reviewEndTime: String?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponsResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon-tags")
    suspend fun getCouponTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsViewResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-tags")
    suspend fun getPromotionTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TagsViewResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun getCouponById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponUpdate>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponDetailResult>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCouponPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun deleteCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun getPromotions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @Query("promo_group") promoGroup: String?, @Query("promotion_type") promotionType: String?, @Query("fp_panel") fpPanel: String?, @Query("promotion_id") promotionId: String?, @Query("created_by") createdBy: String?, @Query("reviewed_by") reviewedBy: String?, @Query("approved_start_time") approvedStartTime: String?, @Query("approved_end_time") approvedEndTime: String?, @Query("review_start_time") reviewStartTime: String?, @Query("review_end_time") reviewEndTime: String?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionsResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun createPromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PromotionAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionAddResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun getPromotionById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionUpdateResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionUpdateResult>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotionPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun deletePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    suspend fun getPromosCouponConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("entity_type") entityType: String?, @Query("is_hidden") isHidden: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ActivePromosResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-payment-offers")
    suspend fun getPromotionPaymentOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PromotionPaymentOffersDetails>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    suspend fun getCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_meta_id") cartMetaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigDetailResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    suspend fun updateCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_meta_id") cartMetaId: String,@Body body: CartMetaConfigUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigUpdate>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    suspend fun deleteCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_meta_id") cartMetaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun getCartMetaConfigs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigListResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun createCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CartMetaConfigAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaConfigAddResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    suspend fun addPriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PriceAdjustmentAdd, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddPriceAdjustmentResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    suspend fun getPriceAdjustments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PriceAdjustmentResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    suspend fun updatePriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PriceAdjustmentUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePriceAdjustmentResult>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    suspend fun removePriceAdjustment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessage>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    suspend fun fetchAndvalidateCartItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenapiCartDetailsPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenapiCartDetailsResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    suspend fun checkCartServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiCartServiceabilityPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenApiCartServiceabilityResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    suspend fun checkoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiPlatformCheckoutReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<OpenApiCheckoutResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    suspend fun getAbandonedCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("anonymous_cart") anonymousCart: Boolean?, @Query("last_id") lastId: String?, @Query("sort_on") sortOn: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AbandonedCartResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    suspend fun getAbandonedCartDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("c") c: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun addItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: AddCartPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun updateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: UpdateCartPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    suspend fun getCouponOptionValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CouponOptions>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    suspend fun getCouponCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    suspend fun getPromotionCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    suspend fun overrideCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OverrideCheckoutReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<OverrideCheckoutResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    suspend fun getCartShareLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetShareCartLinkPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetShareCartLinkResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    suspend fun getCartSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    suspend fun updateCartWithSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @Path("action") action: String, @Query("cart_id") cartId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SharedCartResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    suspend fun getCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("filter_on") filterOn: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<MultiCartResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    suspend fun updateCartUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: UpdateUserCartMapping, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserCartMappingResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    suspend fun getItemCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartItemCountResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformAddItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?, @Query("cart_type") cartType: String?,@Body body: PlatformAddCartPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddCartDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun getCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Double?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformUpdateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("order_type") orderType: String?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?,@Body body: PlatformUpdateCartPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCartDetailResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    suspend fun deleteCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("cart_type") cartType: String?,@Body body: DeleteCartPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCartDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun getAppCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("slug") slug: String?, @Query("store_id") storeId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCouponResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun applyCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: ApplyCouponPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun removeCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: String?, @Query("buy_now") buyNow: Boolean?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun addAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveAddressResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun getAddresses(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformGetAddressesResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun getAddressById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformAddress>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun updateAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PlatformAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAddressResult>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun removeAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("user_id") userId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteAddressResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    suspend fun selectAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: PlatformSelectCartAddressPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun getShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformCartShipmentsResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun updateShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformCartShipmentsResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    suspend fun updateCartMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("user_id") userId: String?,@Body body: PlatformCartMetaPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartMetaResult>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("cart_type") cartType: String?,@Body body: PlatformCartCheckoutDetailPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    suspend fun getAvailableDeliveryModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("area_code") areaCode: String, @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDeliveryModesResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    suspend fun getStoreAddressByUid(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_uid") storeUid: Int, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreDetailsResult>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentMode(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    suspend fun validateCouponForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?, @Query("iin") iin: String?, @Query("network") network: String?, @Query("type") type: String?, @Query("card_id") cardId: String?, @Query("cart_type") cartType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCouponValidate>
    
    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCartV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("cart_type") cartType: String?,@Body body: PlatformCartCheckoutDetailV2Payload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartCheckoutResult>
    
    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentModeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentPayloadV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<CartDetailResult>
    
}
