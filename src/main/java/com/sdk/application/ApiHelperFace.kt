package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*


interface CatalogApiHelperFace {
    
    fun getProductDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductDetail>>
    
    fun getProductSizesBySlug( slug: String,
         store_id: String?=null
        
    )
    :Deferred<Response<ProductSizes>>
    
    fun getProductPriceBySlug( slug: String, size: String,
         pincode: Int?=null, store_id: String?=null
        
    )
    :Deferred<Response<ProductSizePriceResponse>>
    
    fun getProductSellersBySlug( slug: String, size: String,
         pincode: Int?=null, page_no: Int?=null, page_size: Int?=null
        
    )
    :Deferred<Response<ProductSizeSellersResponse>>
    
    fun getProductComparisonBySlugs( slug: String
        
        
    )
    :Deferred<Response<ProductsComparisonResponse>>
    
    fun getSimilarComparisonProductBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductCompareResponse>>
    
    fun getComparedFrequentlyProductBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    fun getProductSimilarByIdentifier( slug: String, similar_type: String
        
        
    )
    :Deferred<Response<SimilarProductByTypeResponse>>
    
    fun getProductVariantsBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductVariantsResponse>>
    
    fun getProductStockByIds(
         item_id: String?=null, alu: String?=null, sku_code: String?=null, ean: String?=null, upc: String?=null
        
    )
    :Deferred<Response<ProductStockStatusResponse>>
    
    fun getProductStockForTimeByIds( timestamp: String,
         page_size: Int?=null, page_id: String?=null
        
    )
    :Deferred<Response<ProductStockPolling>>
    
    fun getProducts(
         q: String?=null, f: String?=null, filters: Boolean?=null, sort_on: String?=null, page_id: String?=null, page_size: Int?=null, page_no: Int?=null, page_type: String?=null
        
    )
    :Deferred<Response<ProductListingResponse>>
    
    fun getBrands(
         department: String?=null, page_no: Int?=null, page_size: Int?=null
        
    )
    :Deferred<Response<BrandListingResponse>>
    
    fun getBrandDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<BrandDetailResponse>>
    
    fun getCategories(
         department: String?=null
        
    )
    :Deferred<Response<CategoryListingResponse>>
    
    fun getCategoryDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CategoryMetaResponse>>
    
    fun getHomeProducts(
         sort_on: String?=null, page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<HomeListingResponse>>
    
    fun getDepartments(
        
        
    )
    :Deferred<Response<DepartmentResponse>>
    
    fun getSearchResults( q: String
        
        
    )
    :Deferred<Response<AutoCompleteResponse>>
    
    fun addCollection(
        
        body: CreateCollection
    )
    :Deferred<Response<CollectionDetailResponse>>
    
    fun getCollections(
         page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<GetCollectionListingResponse>>
    
    fun addCollectionItemsBySlug( slug: String,
        
        body: CollectionItemsRequest
    )
    :Deferred<Response<CollectionItemsResponse>>
    
    fun getCollectionItemsBySlug( slug: String,
         f: String?=null, filters: Boolean?=null, sort_on: String?=null, page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<ProductListingResponse>>
    
    fun updateCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionsUpdateDetailResponse>>
    
    fun deleteCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionDetailViewDeleteResponse>>
    
    fun getCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionDetailResponse>>
    
    fun getFollowedListing( collection_type: String
        
        
    )
    :Deferred<Response<GetFollowListingResponse>>
    
    fun unfollowById( collection_type: String, collection_id: Int
        
        
    )
    :Deferred<Response<FollowPostResponse>>
    
    fun followById( collection_type: String, collection_id: Int
        
        
    )
    :Deferred<Response<FollowPostResponse>>
    
    fun getFollowerCountById( collection_type: String, collection_id: String
        
        
    )
    :Deferred<Response<FollowerCountResponse>>
    
    fun getFollowIds(
         collection_type: String?=null
        
    )
    :Deferred<Response<FollowIdsResponse>>
    
    fun getStores(
         page_no: Int?=null, page_size: Int?=null, q: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null
        
    )
    :Deferred<Response<StoreListingResponse>>
    
}

interface LeadApiHelperFace {
    
    fun getTicket( id: String
        
        
    )
    :Deferred<Response<Ticket>>
    
    fun createHistoryForTicket( ticket_id: String,
        
        body: TicketHistoryPayload
    )
    :Deferred<Response<TicketHistory>>
    
    fun createTicket(
        
        body: AddTicketPayload
    )
    :Deferred<Response<Ticket>>
    
    fun getCustomForm( slug: String
        
        
    )
    :Deferred<Response<CustomForm>>
    
    fun submitCustomForm( slug: String,
        
        body: CustomFormSubmissionPayload
    )
    :Deferred<Response<SubmitCustomFormResponse>>
    
    fun getParticipantsInsideVideoRoom( unique_name: String
        
        
    )
    :Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    fun getTokenForVideoRoom( unique_name: String
        
        
    )
    :Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface PaymentApiHelperFace {
    
    fun getAggregatorsConfig( x-api-token: String,
         refresh: Boolean?=null
        
    )
    :Deferred<Response<AggregatorsConfigDetailResponse>>
    
    fun attachCardToCustomer(
        
        body: AttachCardRequest
    )
    :Deferred<Response<AttachCardsResponse>>
    
    fun getActiveCardAggregator(
         refresh: Boolean?=null
        
    )
    :Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    fun getActiveUserCards(
         force_refresh: Boolean?=null
        
    )
    :Deferred<Response<ListCardsResponse>>
    
    fun deleteUserCard(
        
        body: DeletehCardRequest
    )
    :Deferred<Response<DeleteCardsResponse>>
    
    fun verifyCustomerForPayment(
        
        body: ValidateCustomerRequest
    )
    :Deferred<Response<ValidateCustomerResponse>>
    
    fun verifyAndChargePayment(
        
        body: ChargeCustomerRequest
    )
    :Deferred<Response<ChargeCustomerResponse>>
    
    fun initialisePayment(
        
        body: PaymentInitializationRequest
    )
    :Deferred<Response<PaymentInitializationResponse>>
    
    fun checkAndUpdatePaymentStatus(
        
        body: PaymentStatusUpdateRequest
    )
    :Deferred<Response<PaymentStatusUpdateResponse>>
    
    fun getPaymentModeRoutes( amount: Int, cart_id: String, pincode: Int, checkout_mode: String,
         refresh: Boolean?=null, assign_card_id: String?=null, delivery_address: String?=null
        
    )
    :Deferred<Response<PaymentOptionsResponse>>
    
    fun getPosPaymentModeRoutes( amount: Int, cart_id: String, pincode: Int, checkout_mode: String, order_type: String,
         refresh: Boolean?=null, assign_card_id: String?=null, delivery_address: String?=null
        
    )
    :Deferred<Response<PaymentOptionsResponse>>
    
    fun getUserBeneficiariesDetail( order_id: String
        
        
    )
    :Deferred<Response<OrderBeneficiaryResponse>>
    
    fun verifyIfscCode(
         ifsc_code: String?=null
        
    )
    :Deferred<Response<IfscCodeResponse>>
    
    fun getOrderBeneficiariesDetail( order_id: String
        
        
    )
    :Deferred<Response<OrderBeneficiaryResponse>>
    
    fun verifyOtpAndAddBeneficiaryForBank(
        
        body: AddBeneficiaryViaOtpVerificationRequest
    )
    :Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    fun addBeneficiaryDetails(
        
        body: AddBeneficiaryDetailsRequest
    )
    :Deferred<Response<RefundAccountResponse>>
    
    fun verifyOtpAndAddBeneficiaryForWallet(
        
        body: WalletOtpRequest
    )
    :Deferred<Response<WalletOtpResponse>>
    
    fun updateDefaultBeneficiary(
        
        body: SetDefaultBeneficiaryRequest
    )
    :Deferred<Response<SetDefaultBeneficiaryResponse>>
    
}

interface OrderApiHelperFace {
    
    fun getOrders(
         page_no: String?=null, page_size: String?=null, from_date: String?=null, to_date: String?=null
        
    )
    :Deferred<Response<OrderList>>
    
    fun getOrderById( order_id: String
        
        
    )
    :Deferred<Response<OrderById>>
    
    fun getShipmentById( shipment_id: String
        
        
    )
    :Deferred<Response<ShipmentById>>
    
    fun getShipmentReasons( shipment_id: String
        
        
    )
    :Deferred<Response<ShipmentReasons>>
    
    fun updateShipmentStatus( shipment_id: String,
        
        body: ShipmentStatusUpdateBody
    )
    :Deferred<Response<ShipmentStatusUpdate>>
    
    fun trackShipment( shipment_id: String
        
        
    )
    :Deferred<Response<ShipmentTrack>>
    
}

interface PosCartApiHelperFace {
    
    fun getCart(
         uid: Int?=null, assign_card_id: Int?=null
        
    )
    :Deferred<Response<GetCartResponse>>
    
    fun getCartLastModified(
         uid: Int?=null
        
    )
    :Deferred<Response<Any>>
    
    fun addItems(
        
        body: AddCartRequest
    )
    :Deferred<Response<CartResponse>>
    
    fun updateCart(
        
        body: UpdateCartRequest
    )
    :Deferred<Response<CartResponse>>
    
    fun getItemCount(
         uid: Int?=null
        
    )
    :Deferred<Response<HashMap<String,Any>>>
    
    fun getCoupons(
         uid: Int?=null
        
    )
    :Deferred<Response<GetCouponResponse>>
    
    fun applyCoupon(
         i: Boolean?=null, b: Boolean?=null, p: Boolean?=null,
        body: HashMap<String,Any>
    )
    :Deferred<Response<SaveCouponResponse>>
    
    fun removeCoupon(
         uid: Int?=null
        
    )
    :Deferred<Response<CartResponse>>
    
    fun getBulkDiscountOffers(
         item_id: Int?=null, article_id: String?=null, uid: Int?=null, slug: String?=null
        
    )
    :Deferred<Response<BulkPriceResponse>>
    
    fun getAddresses(
         uid: Int?=null, mobile_no: Int?=null, checkout_mode: String?=null, tags: Int?=null, default: Int?=null
        
    )
    :Deferred<Response<GetAddressResponse>>
    
    fun addAddress(
        
        body: SaveAddressRequest
    )
    :Deferred<Response<SaveAddressResponse>>
    
    fun getAddressById( id: Int,
         uid: Int?=null, mobile_no: Int?=null, checkout_mode: String?=null, tags: Int?=null, default: Int?=null
        
    )
    :Deferred<Response<GetAddressResponse>>
    
    fun updateAddress( id: Int,
        
        body: UpdateAddressRequest
    )
    :Deferred<Response<UpdateAddressResponse>>
    
    fun removeAddress( id: Int
        
        
    )
    :Deferred<Response<DeleteAddressResponse>>
    
    fun selectAddress(
        
        body: SelectCartAddressRequest
    )
    :Deferred<Response<CartResponse>>
    
    fun getPaymentModes(
         uid: String?=null, address_id: String?=null, payment_mode: String?=null, payment_identifier: String?=null, aggregator_name: String?=null, merchant_code: String?=null
        
    )
    :Deferred<Response<PaymentOptions>>
    
    fun selectPaymentMode(
         uid: String?=null,
        body: UpdateCartPaymentRequest
    )
    :Deferred<Response<PaymentOptions>>
    
    fun getShipments(
         pick_at_store_uid: Int?=null, ordering_store_id: Int?=null, p: Boolean?=null, uid: Int?=null, address_id: Int?=null
        
    )
    :Deferred<Response<CartShipmentsResponse>>
    
    fun updateShipments(
         i: Boolean?=null, p: Boolean?=null, uid: Int?=null, address_id: Int?=null, order_type: String?=null,
        body: UpdateCartShipmentRequest
    )
    :Deferred<Response<CartShipmentsResponse>>
    
    fun checkoutCart(
         uid: Boolean?=null,
        body: CartCheckoutRequest
    )
    :Deferred<Response<CartCheckoutResponse>>
    
    fun updateCartMeta(
         uid: Int?=null,
        body: HashMap<String,Any>
    )
    :Deferred<Response<HashMap<String,Any>>>
    
    fun getCartShareLink(
        
        body: HashMap<String,Any>
    )
    :Deferred<Response<HashMap<String,Any>>>
    
    fun getCartSharedItems( token: String
        
        
    )
    :Deferred<Response<HashMap<String,Any>>>
    
    fun updateCartWithSharedItems( token: String, action: String
        
        
    )
    :Deferred<Response<HashMap<String,Any>>>
    
}

