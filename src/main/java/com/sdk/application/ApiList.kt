package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String,
        @Query("store_id") store_id: String?
        
    )
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String,@Path("size") size: String,
        @Query("pincode") pincode: Int?,@Query("store_id") store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String,@Path("size") size: String,
        @Query("pincode") pincode: Int?,@Query("page_no") page_no: Int?,@Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: String
        
        
    )
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String,@Path("similar_type") similar_type: String
        
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds(
        @Query("item_id") item_id: String?,@Query("alu") alu: String?,@Query("sku_code") sku_code: String?,@Query("ean") ean: String?,@Query("upc") upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String,
        @Query("page_size") page_size: Int?,@Query("page_id") page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>>
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts(
        @Query("q") q: String?,@Query("f") f: String?,@Query("filters") filters: Boolean?,@Query("sort_on") sort_on: String?,@Query("page_id") page_id: String?,@Query("page_size") page_size: Int?,@Query("page_no") page_no: Int?,@Query("page_type") page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands(
        @Query("department") department: String?,@Query("page_no") page_no: Int?,@Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(
        @Query("department") department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<CategoryMetaResponse>>
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts(
        @Query("sort_on") sort_on: String?,@Query("page_id") page_id: String?,@Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments(
        
        
    )
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(@Query("q") q: String
        
        
    )
    : Deferred<Response<AutoCompleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections(
        @Query("page_id") page_id: String?,@Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/")
    fun addCollection(
        
        @Body body: CreateCollection
    )
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String,
        @Query("f") f: String?,@Query("filters") filters: Boolean?,@Query("sort_on") sort_on: String?,@Query("page_id") page_id: String?,@Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingItemsResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun addCollectionItemsBySlug(@Path("slug") slug: String,
        
        @Body body: CollectionItemsRequest
    )
    : Deferred<Response<CollectionItemsResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<CollectionDetailResponse>>
    
    @PUT ("/service/application/catalog/v1.0/collections/{slug}/")
    fun updateCollectionDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<CollectionsUpdateDetailResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/collections/{slug}/")
    fun deleteCollectionDetailBySlug(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<CollectionDetailViewDeleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(@Path("collection_type") collection_type: String
        
        
    )
    : Deferred<Response<GetFollowListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(@Path("collection_type") collection_type: String,@Path("collection_id") collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(@Path("collection_type") collection_type: String,@Path("collection_id") collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(@Path("collection_type") collection_type: String,@Path("collection_id") collection_id: String
        
        
    )
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(
        @Query("collection_type") collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>>
    
    @GET ("/service/application/catalog/v1.0/analytics/store-list/")
    fun getStores(
        @Query("page_no") page_no: Int?,@Query("page_size") page_size: Int?,@Query("q") q: String?,@Query("range") range: Int?,@Query("latitude") latitude: Double?,@Query("longitude") longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>>
    
}

interface CartApiList {
    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart(
        @Query("uid") uid: Int?,@Query("assign_card_id") assign_card_id: Int?
        
    )
    : Deferred<Response<GetCartResponse>>
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems(
        
        @Body body: AddCartRequest
    )
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart(
        
        @Body body: UpdateCartRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/basic")
    fun getItemCount(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/cart/v1.0/coupon")
    fun getCoupons(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/cart/v1.0/coupon")
    fun applyCoupon(
        @Query("i") i: Boolean?,@Query("b") b: Boolean?,@Query("p") p: Boolean?,
        @Body body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>>
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    fun removeCoupon(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(
        @Query("item_id") item_id: Int?,@Query("article_id") article_id: String?,@Query("uid") uid: Int?,@Query("slug") slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses(
        @Query("uid") uid: Int?,@Query("mobile_no") mobile_no: Int?,@Query("checkout_mode") checkout_mode: String?,@Query("tags") tags: Int?,@Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress(
        
        @Body body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: Int,
        @Query("uid") uid: Int?,@Query("mobile_no") mobile_no: Int?,@Query("checkout_mode") checkout_mode: String?,@Query("tags") tags: Int?,@Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: Int,
        
        @Body body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: Int
        
        
    )
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress(
        
        @Body body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/payment")
    fun getPaymentModes(
        @Query("uid") uid: String?,@Query("address_id") address_id: String?,@Query("payment_mode") payment_mode: String?,@Query("payment_identifier") payment_identifier: String?,@Query("aggregator_name") aggregator_name: String?,@Query("merchant_code") merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>>
    
    @PUT ("/service/application/cart/v1.0/payment")
    fun selectPaymentMode(
        @Query("uid") uid: String?,
        @Body body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>>
    
    @GET ("/service/application/cart/v1.0/shipment")
    fun getShipments(
        @Query("p") p: Boolean?,@Query("uid") uid: Int?,@Query("address_id") address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/cart/v1.0/checkout")
    fun checkoutCart(
        
        @Body body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/cart/v1.0/meta")
    fun updateCartMeta(
        @Query("uid") uid: Int?,
        @Body body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart")
    fun getCartShareLink(
        
        @Body body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String
        
        
    )
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String,@Path("action") action: String
        
        
    )
    : Deferred<Response<SharedCartResponse>>
    
}

interface LeadApiList {
    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    fun getTicket(@Path("id") id: String
        
        
    )
    : Deferred<Response<Ticket>>
    
    @POST ("/service/application/lead/v1.0/ticket/{ticket_id}/history")
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String,
        
        @Body body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>>
    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket(
        
        @Body body: AddTicketPayload
    )
    : Deferred<Response<Ticket>>
    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(@Path("slug") slug: String
        
        
    )
    : Deferred<Response<CustomForm>>
    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(@Path("slug") slug: String,
        
        @Body body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String
        
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String
        
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface PaymentApiList {
    
    @GET ("/service/application/payment/v1.0/config/aggregators/key")
    fun getAggregatorsConfig(
        
        
    )
    : Deferred<Response<AggregatorsConfigDetailResponse>>
    
    @POST ("/service/application/payment/v1.0/card/attach")
    fun attachCardToCustomer(
        
        @Body body: AttachCardRequest
    )
    : Deferred<Response<AttachCardsResponse>>
    
    @GET ("/service/application/payment/v1.0/card/aggregator")
    fun getActiveCardAggregator(
        @Query("refresh") refresh: Boolean?
        
    )
    : Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    @GET ("/service/application/payment/v1.0/cards")
    fun getActiveUserCards(
        @Query("force_refresh") force_refresh: Boolean?
        
    )
    : Deferred<Response<ListCardsResponse>>
    
    @POST ("/service/application/payment/v1.0/card/remove")
    fun deleteUserCard(
        
        @Body body: DeletehCardRequest
    )
    : Deferred<Response<DeleteCardsResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/customer/validation")
    fun verifyCustomerForPayment(
        
        @Body body: ValidateCustomerRequest
    )
    : Deferred<Response<ValidateCustomerResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/confirm/charge")
    fun verifyAndChargePayment(
        
        @Body body: ChargeCustomerRequest
    )
    : Deferred<Response<ChargeCustomerResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/request")
    fun initialisePayment(
        
        @Body body: PaymentInitializationRequest
    )
    : Deferred<Response<PaymentInitializationResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/confirm/polling")
    fun checkAndUpdatePaymentStatus(
        
        @Body body: PaymentStatusUpdateRequest
    )
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiary/user")
    fun getUserBeneficiariesDetail(@Query("order_id") order_id: String
        
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @GET ("/service/application/payment/v1.0/ifsc-code/verify")
    fun verifyIfscCode(
        @Query("ifsc_code") ifsc_code: String?
        
    )
    : Deferred<Response<IfscCodeResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiaries/order")
    fun getOrderBeneficiariesDetail(@Query("order_id") order_id: String
        
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/verification/bank")
    fun verifyOtpAndAddBeneficiaryForBank(
        
        @Body body: AddBeneficiaryViaOtpVerificationRequest
    )
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/account")
    fun addBeneficiaryDetails(
        
        @Body body: AddBeneficiaryDetailsRequest
    )
    : Deferred<Response<Any>>
    
    @POST ("/service/application/payment/v1.0/refund/verification/wallet")
    fun verifyOtpAndAddBeneficiaryForWallet(
        
        @Body body: WalletOtpRequest
    )
    : Deferred<Response<WalletOtpResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/beneficiary/default")
    fun updateDefaultBeneficiary(
        
        @Body body: SetDefaultBeneficiaryRequest
    )
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    
}

interface PosCartApiList {
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart(
        @Query("uid") uid: Int?,@Query("assign_card_id") assign_card_id: Int?
        
    )
    : Deferred<Response<GetCartResponse>>
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems(
        
        @Body body: AddCartRequest
    )
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart(
        
        @Body body: UpdateCartRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    fun getItemCount(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    fun getCoupons(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    fun applyCoupon(
        @Query("i") i: Boolean?,@Query("b") b: Boolean?,@Query("p") p: Boolean?,
        @Body body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    fun removeCoupon(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(
        @Query("item_id") item_id: Int?,@Query("article_id") article_id: String?,@Query("uid") uid: Int?,@Query("slug") slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses(
        @Query("uid") uid: Int?,@Query("mobile_no") mobile_no: Int?,@Query("checkout_mode") checkout_mode: String?,@Query("tags") tags: Int?,@Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress(
        
        @Body body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: Int,
        @Query("uid") uid: Int?,@Query("mobile_no") mobile_no: Int?,@Query("checkout_mode") checkout_mode: String?,@Query("tags") tags: Int?,@Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: Int,
        
        @Body body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: Int
        
        
    )
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress(
        
        @Body body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/payment")
    fun getPaymentModes(
        @Query("uid") uid: String?,@Query("address_id") address_id: String?,@Query("payment_mode") payment_mode: String?,@Query("payment_identifier") payment_identifier: String?,@Query("aggregator_name") aggregator_name: String?,@Query("merchant_code") merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>>
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    fun selectPaymentMode(
        @Query("uid") uid: String?,
        @Body body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>>
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    fun getShipments(
        @Query("pick_at_store_uid") pick_at_store_uid: Int?,@Query("ordering_store_id") ordering_store_id: Int?,@Query("p") p: Boolean?,@Query("uid") uid: Int?,@Query("address_id") address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    fun updateShipments(
        @Query("i") i: Boolean?,@Query("p") p: Boolean?,@Query("uid") uid: Int?,@Query("address_id") address_id: Int?,@Query("order_type") order_type: String?,
        @Body body: UpdateCartShipmentRequest
    )
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    fun checkoutCart(
        @Query("uid") uid: Boolean?,
        @Body body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    fun updateCartMeta(
        @Query("uid") uid: Int?,
        @Body body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink(
        
        @Body body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String
        
        
    )
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String,@Path("action") action: String
        
        
    )
    : Deferred<Response<SharedCartResponse>>
    
}

