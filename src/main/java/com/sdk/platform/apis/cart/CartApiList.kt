package com.sdk.platform.apis.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.cart.*

interface CartApiList {
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun getCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_archived") isArchived: Boolean?, @Query("title") title: String?, @Query("is_public") isPublic: Boolean?, @Query("is_display") isDisplay: Boolean?, @Query("type_slug") typeSlug: String?, @Query("code") code: String?)
    : Response<CouponsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    suspend fun createCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CouponAdd)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun getCouponById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<CouponUpdate>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponUpdate)
    : Response<SuccessMessage>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    suspend fun updateCouponPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponPartialUpdate)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun getPromotions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @Query("promo_group") promoGroup: String?, @Query("promotion_type") promotionType: String?, @Query("fp_panel") fpPanel: String?, @Query("promotion_id") promotionId: String?)
    : Response<PromotionsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    suspend fun createPromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PromotionAdd)
    : Response<PromotionAdd>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun getPromotionById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<PromotionUpdate>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionUpdate)
    : Response<PromotionUpdate>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    suspend fun updatePromotionPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionPartialUpdate)
    : Response<SuccessMessage>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    suspend fun getPromosCouponConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("entity_type") entityType: String?, @Query("is_hidden") isHidden: Boolean?)
    : Response<ActivePromosResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    suspend fun updateCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_meta_id") cartMetaId: String,@Body body: CartMetaConfigUpdate)
    : Response<CartMetaConfigUpdate>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun fetchCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<CartMetaConfigAdd>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    suspend fun createCartMetaConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CartMetaConfigAdd)
    : Response<CartMetaConfigAdd>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount/{id}")
    suspend fun updateCartDynamicInjection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CartDynamicInjectionUpdate)
    : Response<CartDynamicInjectionResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount/{id}")
    suspend fun removeCartDynamicInjection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SuccessMessage>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount")
    suspend fun createCartDynamicInjection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CartDynamicInjectionAdd)
    : Response<CartDynamicInjectionResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    suspend fun fetchAndvalidateCartItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenapiCartDetailsRequest)
    : Response<OpenapiCartDetailsResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    suspend fun checkCartServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiCartServiceabilityRequest)
    : Response<OpenApiCartServiceabilityResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    suspend fun checkoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiPlatformCheckoutReq)
    : Response<OpenApiCheckoutResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    suspend fun getAbandonedCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("user_id") userId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("anonymous_cart") anonymousCart: Boolean?, @Query("last_id") lastId: String?, @Query("sort_on") sortOn: String?)
    : Response<AbandonedCartResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    suspend fun getAbandonedCartDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("user_id") userId: String?, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?)
    : Response<CartDetailResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun addItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?, @Query("user_id") userId: String?,@Body body: AddCartRequest)
    : Response<AddCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    suspend fun updateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?, @Query("user_id") userId: String?,@Body body: UpdateCartRequest)
    : Response<UpdateCartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    suspend fun getCouponOptionValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    suspend fun getCouponCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    suspend fun getPromotionCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    suspend fun overrideCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OverrideCheckoutReq)
    : Response<OverrideCheckoutResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    suspend fun getCartShareLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetShareCartLinkRequest)
    : Response<GetShareCartLinkResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    suspend fun getCartSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String)
    : Response<SharedCartResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    suspend fun updateCartWithSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @Path("action") action: String, @Query("cart_id") cartId: String?)
    : Response<SharedCartResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    suspend fun getCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("filter_on") filterOn: String?)
    : Response<MultiCartResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    suspend fun updateCartUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: UpdateUserCartMapping)
    : Response<UserCartMappingResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun getCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartDetailResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformAddItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?,@Body body: PlatformAddCartRequest)
    : Response<AddCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun platformUpdateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?,@Body body: PlatformUpdateCartRequest)
    : Response<UpdateCartDetailResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    suspend fun deleteCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: DeleteCartRequest)
    : Response<DeleteCartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    suspend fun getItemCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartItemCountResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun getAppCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<GetCouponResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun applyCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: ApplyCouponRequest)
    : Response<CartDetailResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    suspend fun removeCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: String?, @Query("buy_now") buyNow: Boolean?)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun getAddresses(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
    : Response<PlatformGetAddressesResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    suspend fun addAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformAddress)
    : Response<SaveAddressResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun getAddressById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
    : Response<PlatformAddress>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun updateAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PlatformAddress)
    : Response<UpdateAddressResponse>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    suspend fun removeAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("user_id") userId: String?)
    : Response<DeleteAddressResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    suspend fun selectAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: PlatformSelectCartAddressRequest)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun getShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Response<PlatformCartShipmentsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    suspend fun updateShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentRequest)
    : Response<PlatformCartShipmentsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    suspend fun updateCartMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: PlatformCartMetaRequest)
    : Response<CartMetaResponse>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: PlatformCartCheckoutDetailRequest)
    : Response<CartCheckoutResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    suspend fun getAvailableDeliveryModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("area_code") areaCode: String, @Query("id") id: String?)
    : Response<CartDeliveryModesResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    suspend fun getStoreAddressByUid(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_uid") storeUid: Int)
    : Response<StoreDetailsResponse>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentMode(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentRequest)
    : Response<CartDetailResponse>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    suspend fun validateCouponForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Response<PaymentCouponValidate>
    
    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    suspend fun platformCheckoutCartV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: PlatformCartCheckoutDetailV2Request)
    : Response<CartCheckoutResponse>
    
    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    suspend fun selectPaymentModeV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("order_type") orderType: String?,@Body body: UpdateCartPaymentRequestV2)
    : Response<CartDetailResponse>
    
}