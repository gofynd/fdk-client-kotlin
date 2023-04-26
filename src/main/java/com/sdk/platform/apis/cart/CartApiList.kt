package com.sdk.platform.apis.cart

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.cart.*

interface CartApiList {
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    fun getCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_archived") isArchived: Boolean?, @Query("title") title: String?, @Query("is_public") isPublic: Boolean?, @Query("is_display") isDisplay: Boolean?, @Query("type_slug") typeSlug: String?, @Query("code") code: String?)
    : Deferred<Response<CouponsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    fun createCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CouponAdd)
    : Deferred<Response<SuccessMessage>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun getCouponById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<CouponUpdate>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun updateCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponUpdate)
    : Deferred<Response<SuccessMessage>>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun updateCouponPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponPartialUpdate)
    : Deferred<Response<SuccessMessage>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    fun getPromotions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("status") status: String?, @Query("promo_group") promoGroup: String?, @Query("promotion_type") promotionType: String?, @Query("fp_panel") fpPanel: String?, @Query("promotion_id") promotionId: String?)
    : Deferred<Response<PromotionsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    fun createPromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PromotionAdd)
    : Deferred<Response<PromotionAdd>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun getPromotionById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<PromotionUpdate>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun updatePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionUpdate)
    : Deferred<Response<PromotionUpdate>>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun updatePromotionPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionPartialUpdate)
    : Deferred<Response<SuccessMessage>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    fun getPromosCouponConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ActivePromosResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    fun fetchAndvalidateCartItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenapiCartDetailsRequest)
    : Deferred<Response<OpenapiCartDetailsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    fun checkCartServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiCartServiceabilityRequest)
    : Deferred<Response<OpenApiCartServiceabilityResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    fun checkoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiPlatformCheckoutReq)
    : Deferred<Response<OpenApiCheckoutResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    fun getAbandonedCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("anonymous_cart") anonymousCart: Boolean?, @Query("last_id") lastId: String?, @Query("sort_on") sortOn: String?)
    : Deferred<Response<AbandonedCartResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    fun getAbandonedCartDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    fun addItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    fun updateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    fun getCartShareLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    fun getCartSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @Path("action") action: String, @Query("cart_id") cartId: String?)
    : Deferred<Response<SharedCartResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    fun getCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("filter_on") filterOn: String?)
    : Deferred<Response<MultiCartResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    fun updateCartUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: UpdateUserCartMapping)
    : Deferred<Response<UserCartMappingResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    fun getCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    fun platformAddItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Query("id") id: String?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    fun platformUpdateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    fun deleteCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: DeleteCartRequest)
    : Deferred<Response<DeleteCartDetailResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    fun getItemCount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    fun getAppCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    fun applyCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    fun removeCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    fun getAddresses(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
    : Deferred<Response<PlatformGetAddressesResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    fun addAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformAddress)
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    fun getAddressById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?, @Query("user_id") userId: String?)
    : Deferred<Response<PlatformAddress>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    fun updateAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PlatformAddress)
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    fun removeAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("user_id") userId: String?)
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    fun selectAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: PlatformSelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    fun getShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    fun updateShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    fun updateCartMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: PlatformCartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    fun platformCheckoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?,@Body body: PlatformCartCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    fun getAvailableDeliveryModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("area_code") areaCode: String, @Query("id") id: String?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    fun getStoreAddressByUid(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    fun selectPaymentMode(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?,@Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    fun validateCouponForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    fun getCouponOptionValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    fun getCouponCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?)
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    fun getPromotionCodeExists(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("code") code: String?)
    : Deferred<Response<HashMap<String,Any>>>
    
}