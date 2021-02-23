package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

class CatalogDataManagerClass(val config: ApplicationConfig) : CatalogDataManager {
    
    val catalogApiHelperClass by lazy {
        CatalogApiHelperClass(config)
    }
    
    override fun getProductDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductDetail>> {
        return catalogApiHelperClass.getProductDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductSizesBySlug( slug: String,
         store_id: String?
        
    )
    : Deferred<Response<ProductSizes>> {
        return catalogApiHelperClass.getProductSizesBySlug(
        slug = slug,
        store_id = store_id
        
        )
    }
    
    override fun getProductPriceBySlug( slug: String, size: String,
         pincode: Int?, store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiHelperClass.getProductPriceBySlug(
        slug = slug,size = size,
        pincode = pincode,store_id = store_id
        
        )
    }
    
    override fun getProductSellersBySlug( slug: String, size: String,
         pincode: Int?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiHelperClass.getProductSellersBySlug(
        slug = slug,size = size,
        pincode = pincode,page_no = page_no,page_size = page_size
        
        )
    }
    
    override fun getProductComparisonBySlugs( slug: String
        
        
    )
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogApiHelperClass.getProductComparisonBySlugs(
        slug = slug
        
        
        )
    }
    
    override fun getSimilarComparisonProductBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductCompareResponse>> {
        return catalogApiHelperClass.getSimilarComparisonProductBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getComparedFrequentlyProductBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogApiHelperClass.getComparedFrequentlyProductBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductSimilarByIdentifier( slug: String, similar_type: String
        
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiHelperClass.getProductSimilarByIdentifier(
        slug = slug,similar_type = similar_type
        
        
        )
    }
    
    override fun getProductVariantsBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogApiHelperClass.getProductVariantsBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductStockByIds(
         item_id: String?, alu: String?, sku_code: String?, ean: String?, upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiHelperClass.getProductStockByIds(
        
        item_id = item_id,alu = alu,sku_code = sku_code,ean = ean,upc = upc
        
        )
    }
    
    override fun getProductStockForTimeByIds( timestamp: String,
         page_size: Int?, page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiHelperClass.getProductStockForTimeByIds(
        timestamp = timestamp,
        page_size = page_size,page_id = page_id
        
        )
    }
    
    override fun getProducts(
         q: String?, f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?, page_no: Int?, page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiHelperClass.getProducts(
        
        q = q,f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size,page_no = page_no,page_type = page_type
        
        )
    }
    
    override fun getBrands(
         department: String?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiHelperClass.getBrands(
        
        department = department,page_no = page_no,page_size = page_size
        
        )
    }
    
    override fun getBrandDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<BrandDetailResponse>> {
        return catalogApiHelperClass.getBrandDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getCategories(
         department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>> {
        return catalogApiHelperClass.getCategories(
        
        department = department
        
        )
    }
    
    override fun getCategoryDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogApiHelperClass.getCategoryDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getHomeProducts(
         sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiHelperClass.getHomeProducts(
        
        sort_on = sort_on,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getDepartments(
        
        
    )
    : Deferred<Response<DepartmentResponse>> {
        return catalogApiHelperClass.getDepartments(
        
        
        
        )
    }
    
    override fun getSearchResults( q: String
        
        
    )
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogApiHelperClass.getSearchResults(
        q = q
        
        
        )
    }
    
    override fun getCollections(
         page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiHelperClass.getCollections(
        
        page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun addCollection(
        
        body: CreateCollection
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.addCollection(
        
        
        body = body
        )
    }
    
    override fun getCollectionItemsBySlug( slug: String,
         f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return catalogApiHelperClass.getCollectionItemsBySlug(
        slug = slug,
        f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun addCollectionItemsBySlug( slug: String,
        
        body: CollectionItemsRequest
    )
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogApiHelperClass.addCollectionItemsBySlug(
        slug = slug,
        
        body = body
        )
    }
    
    override fun getCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.getCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun updateCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return catalogApiHelperClass.updateCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun deleteCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return catalogApiHelperClass.deleteCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getFollowedListing( collection_type: String
        
        
    )
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiHelperClass.getFollowedListing(
        collection_type = collection_type
        
        
        )
    }
    
    override fun followById( collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.followById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun unfollowById( collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.unfollowById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun getFollowerCountById( collection_type: String, collection_id: String
        
        
    )
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiHelperClass.getFollowerCountById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun getFollowIds(
         collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiHelperClass.getFollowIds(
        
        collection_type = collection_type
        
        )
    }
    
    override fun getStores(
         page_no: Int?, page_size: Int?, q: String?, range: Int?, latitude: Double?, longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiHelperClass.getStores(
        
        page_no = page_no,page_size = page_size,q = q,range = range,latitude = latitude,longitude = longitude
        
        )
    }
    
}

class CartDataManagerClass(val config: ApplicationConfig) : CartDataManager {
    
    val cartApiHelperClass by lazy {
        CartApiHelperClass(config)
    }
    
    override fun getCart(
         uid: Int?, assign_card_id: Int?
        
    )
    : Deferred<Response<GetCartResponse>> {
        return cartApiHelperClass.getCart(
        
        uid = uid,assign_card_id = assign_card_id
        
        )
    }
    
    override fun getCartLastModified(
         uid: Int?
        
    )
    : Deferred<Response<Any>> {
        return cartApiHelperClass.getCartLastModified(
        
        uid = uid
        
        )
    }
    
    override fun addItems(
        
        body: AddCartRequest
    )
    : Deferred<Response<CartResponse>> {
        return cartApiHelperClass.addItems(
        
        
        body = body
        )
    }
    
    override fun updateCart(
        
        body: UpdateCartRequest
    )
    : Deferred<Response<CartResponse>> {
        return cartApiHelperClass.updateCart(
        
        
        body = body
        )
    }
    
    override fun getItemCount(
         uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>> {
        return cartApiHelperClass.getItemCount(
        
        uid = uid
        
        )
    }
    
    override fun getCoupons(
         uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>> {
        return cartApiHelperClass.getCoupons(
        
        uid = uid
        
        )
    }
    
    override fun applyCoupon(
         i: Boolean?, b: Boolean?, p: Boolean?,
        body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>> {
        return cartApiHelperClass.applyCoupon(
        
        i = i,b = b,p = p,
        body = body
        )
    }
    
    override fun removeCoupon(
         uid: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return cartApiHelperClass.removeCoupon(
        
        uid = uid
        
        )
    }
    
    override fun getBulkDiscountOffers(
         item_id: Int?, article_id: String?, uid: Int?, slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return cartApiHelperClass.getBulkDiscountOffers(
        
        item_id = item_id,article_id = article_id,uid = uid,slug = slug
        
        )
    }
    
    override fun getAddresses(
         uid: Int?, mobile_no: Int?, checkout_mode: String?, tags: Int?, is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiHelperClass.getAddresses(
        
        uid = uid,mobile_no = mobile_no,checkout_mode = checkout_mode,tags = tags,is_default = is_default
        
        )
    }
    
    override fun addAddress(
        
        body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>> {
        return cartApiHelperClass.addAddress(
        
        
        body = body
        )
    }
    
    override fun getAddressById( id: Int,
         uid: Int?, mobile_no: Int?, checkout_mode: String?, tags: Int?, is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiHelperClass.getAddressById(
        id = id,
        uid = uid,mobile_no = mobile_no,checkout_mode = checkout_mode,tags = tags,is_default = is_default
        
        )
    }
    
    override fun updateAddress( id: Int,
        
        body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>> {
        return cartApiHelperClass.updateAddress(
        id = id,
        
        body = body
        )
    }
    
    override fun removeAddress( id: Int
        
        
    )
    : Deferred<Response<DeleteAddressResponse>> {
        return cartApiHelperClass.removeAddress(
        id = id
        
        
        )
    }
    
    override fun selectAddress(
        
        body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>> {
        return cartApiHelperClass.selectAddress(
        
        
        body = body
        )
    }
    
    override fun getPaymentModes(
         uid: String?, address_id: String?, payment_mode: String?, payment_identifier: String?, aggregator_name: String?, merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return cartApiHelperClass.getPaymentModes(
        
        uid = uid,address_id = address_id,payment_mode = payment_mode,payment_identifier = payment_identifier,aggregator_name = aggregator_name,merchant_code = merchant_code
        
        )
    }
    
    override fun selectPaymentMode(
         uid: String?,
        body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>> {
        return cartApiHelperClass.selectPaymentMode(
        
        uid = uid,
        body = body
        )
    }
    
    override fun getShipments(
         p: Boolean?, uid: Int?, address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return cartApiHelperClass.getShipments(
        
        p = p,uid = uid,address_id = address_id
        
        )
    }
    
    override fun checkoutCart(
        
        body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>> {
        return cartApiHelperClass.checkoutCart(
        
        
        body = body
        )
    }
    
    override fun updateCartMeta(
         uid: Int?,
        body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>> {
        return cartApiHelperClass.updateCartMeta(
        
        uid = uid,
        body = body
        )
    }
    
    override fun getCartShareLink(
        
        body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>> {
        return cartApiHelperClass.getCartShareLink(
        
        
        body = body
        )
    }
    
    override fun getCartSharedItems( token: String
        
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return cartApiHelperClass.getCartSharedItems(
        token = token
        
        
        )
    }
    
    override fun updateCartWithSharedItems( token: String, action: String
        
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return cartApiHelperClass.updateCartWithSharedItems(
        token = token,action = action
        
        
        )
    }
    
}

class LeadDataManagerClass(val config: ApplicationConfig) : LeadDataManager {
    
    val leadApiHelperClass by lazy {
        LeadApiHelperClass(config)
    }
    
    override fun getTicket( id: String
        
        
    )
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.getTicket(
        id = id
        
        
        )
    }
    
    override fun createHistoryForTicket( ticket_id: String,
        
        body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>> {
        return leadApiHelperClass.createHistoryForTicket(
        ticket_id = ticket_id,
        
        body = body
        )
    }
    
    override fun createTicket(
        
        body: AddTicketPayload
    )
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.createTicket(
        
        
        body = body
        )
    }
    
    override fun getCustomForm( slug: String
        
        
    )
    : Deferred<Response<CustomForm>> {
        return leadApiHelperClass.getCustomForm(
        slug = slug
        
        
        )
    }
    
    override fun submitCustomForm( slug: String,
        
        body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadApiHelperClass.submitCustomForm(
        slug = slug,
        
        body = body
        )
    }
    
    override fun getParticipantsInsideVideoRoom( unique_name: String
        
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiHelperClass.getParticipantsInsideVideoRoom(
        unique_name = unique_name
        
        
        )
    }
    
    override fun getTokenForVideoRoom( unique_name: String
        
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiHelperClass.getTokenForVideoRoom(
        unique_name = unique_name
        
        
        )
    }
    
}

class PaymentDataManagerClass(val config: ApplicationConfig) : PaymentDataManager {
    
    val paymentApiHelperClass by lazy {
        PaymentApiHelperClass(config)
    }
    
    override fun getAggregatorsConfig(
        
        
    )
    : Deferred<Response<AggregatorsConfigDetailResponse>> {
        return paymentApiHelperClass.getAggregatorsConfig(
        
        
        
        )
    }
    
    override fun attachCardToCustomer(
        
        body: AttachCardRequest
    )
    : Deferred<Response<AttachCardsResponse>> {
        return paymentApiHelperClass.attachCardToCustomer(
        
        
        body = body
        )
    }
    
    override fun getActiveCardAggregator(
         refresh: Boolean?
        
    )
    : Deferred<Response<ActiveCardPaymentGatewayResponse>> {
        return paymentApiHelperClass.getActiveCardAggregator(
        
        refresh = refresh
        
        )
    }
    
    override fun getActiveUserCards(
         force_refresh: Boolean?
        
    )
    : Deferred<Response<ListCardsResponse>> {
        return paymentApiHelperClass.getActiveUserCards(
        
        force_refresh = force_refresh
        
        )
    }
    
    override fun deleteUserCard(
        
        body: DeletehCardRequest
    )
    : Deferred<Response<DeleteCardsResponse>> {
        return paymentApiHelperClass.deleteUserCard(
        
        
        body = body
        )
    }
    
    override fun verifyCustomerForPayment(
        
        body: ValidateCustomerRequest
    )
    : Deferred<Response<ValidateCustomerResponse>> {
        return paymentApiHelperClass.verifyCustomerForPayment(
        
        
        body = body
        )
    }
    
    override fun verifyAndChargePayment(
        
        body: ChargeCustomerRequest
    )
    : Deferred<Response<ChargeCustomerResponse>> {
        return paymentApiHelperClass.verifyAndChargePayment(
        
        
        body = body
        )
    }
    
    override fun initialisePayment(
        
        body: PaymentInitializationRequest
    )
    : Deferred<Response<PaymentInitializationResponse>> {
        return paymentApiHelperClass.initialisePayment(
        
        
        body = body
        )
    }
    
    override fun checkAndUpdatePaymentStatus(
        
        body: PaymentStatusUpdateRequest
    )
    : Deferred<Response<PaymentStatusUpdateResponse>> {
        return paymentApiHelperClass.checkAndUpdatePaymentStatus(
        
        
        body = body
        )
    }
    
    override fun getUserBeneficiariesDetail( order_id: String
        
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiHelperClass.getUserBeneficiariesDetail(
        order_id = order_id
        
        
        )
    }
    
    override fun verifyIfscCode(
         ifsc_code: String?
        
    )
    : Deferred<Response<IfscCodeResponse>> {
        return paymentApiHelperClass.verifyIfscCode(
        
        ifsc_code = ifsc_code
        
        )
    }
    
    override fun getOrderBeneficiariesDetail( order_id: String
        
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiHelperClass.getOrderBeneficiariesDetail(
        order_id = order_id
        
        
        )
    }
    
    override fun verifyOtpAndAddBeneficiaryForBank(
        
        body: AddBeneficiaryViaOtpVerificationRequest
    )
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>> {
        return paymentApiHelperClass.verifyOtpAndAddBeneficiaryForBank(
        
        
        body = body
        )
    }
    
    override fun addBeneficiaryDetails(
        
        body: AddBeneficiaryDetailsRequest
    )
    : Deferred<Response<Any>> {
        return paymentApiHelperClass.addBeneficiaryDetails(
        
        
        body = body
        )
    }
    
    override fun verifyOtpAndAddBeneficiaryForWallet(
        
        body: WalletOtpRequest
    )
    : Deferred<Response<WalletOtpResponse>> {
        return paymentApiHelperClass.verifyOtpAndAddBeneficiaryForWallet(
        
        
        body = body
        )
    }
    
    override fun updateDefaultBeneficiary(
        
        body: SetDefaultBeneficiaryRequest
    )
    : Deferred<Response<SetDefaultBeneficiaryResponse>> {
        return paymentApiHelperClass.updateDefaultBeneficiary(
        
        
        body = body
        )
    }
    
}

class PosCartDataManagerClass(val config: ApplicationConfig) : PosCartDataManager {
    
    val posCartApiHelperClass by lazy {
        PosCartApiHelperClass(config)
    }
    
    override fun getCart(
         uid: Int?, assign_card_id: Int?
        
    )
    : Deferred<Response<GetCartResponse>> {
        return posCartApiHelperClass.getCart(
        
        uid = uid,assign_card_id = assign_card_id
        
        )
    }
    
    override fun getCartLastModified(
         uid: Int?
        
    )
    : Deferred<Response<Any>> {
        return posCartApiHelperClass.getCartLastModified(
        
        uid = uid
        
        )
    }
    
    override fun addItems(
        
        body: AddCartRequest
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiHelperClass.addItems(
        
        
        body = body
        )
    }
    
    override fun updateCart(
        
        body: UpdateCartRequest
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiHelperClass.updateCart(
        
        
        body = body
        )
    }
    
    override fun getItemCount(
         uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>> {
        return posCartApiHelperClass.getItemCount(
        
        uid = uid
        
        )
    }
    
    override fun getCoupons(
         uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>> {
        return posCartApiHelperClass.getCoupons(
        
        uid = uid
        
        )
    }
    
    override fun applyCoupon(
         i: Boolean?, b: Boolean?, p: Boolean?,
        body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>> {
        return posCartApiHelperClass.applyCoupon(
        
        i = i,b = b,p = p,
        body = body
        )
    }
    
    override fun removeCoupon(
         uid: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiHelperClass.removeCoupon(
        
        uid = uid
        
        )
    }
    
    override fun getBulkDiscountOffers(
         item_id: Int?, article_id: String?, uid: Int?, slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return posCartApiHelperClass.getBulkDiscountOffers(
        
        item_id = item_id,article_id = article_id,uid = uid,slug = slug
        
        )
    }
    
    override fun getAddresses(
         uid: Int?, mobile_no: Int?, checkout_mode: String?, tags: Int?, is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiHelperClass.getAddresses(
        
        uid = uid,mobile_no = mobile_no,checkout_mode = checkout_mode,tags = tags,is_default = is_default
        
        )
    }
    
    override fun addAddress(
        
        body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>> {
        return posCartApiHelperClass.addAddress(
        
        
        body = body
        )
    }
    
    override fun getAddressById( id: Int,
         uid: Int?, mobile_no: Int?, checkout_mode: String?, tags: Int?, is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiHelperClass.getAddressById(
        id = id,
        uid = uid,mobile_no = mobile_no,checkout_mode = checkout_mode,tags = tags,is_default = is_default
        
        )
    }
    
    override fun updateAddress( id: Int,
        
        body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>> {
        return posCartApiHelperClass.updateAddress(
        id = id,
        
        body = body
        )
    }
    
    override fun removeAddress( id: Int
        
        
    )
    : Deferred<Response<DeleteAddressResponse>> {
        return posCartApiHelperClass.removeAddress(
        id = id
        
        
        )
    }
    
    override fun selectAddress(
        
        body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiHelperClass.selectAddress(
        
        
        body = body
        )
    }
    
    override fun getPaymentModes(
         uid: String?, address_id: String?, payment_mode: String?, payment_identifier: String?, aggregator_name: String?, merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return posCartApiHelperClass.getPaymentModes(
        
        uid = uid,address_id = address_id,payment_mode = payment_mode,payment_identifier = payment_identifier,aggregator_name = aggregator_name,merchant_code = merchant_code
        
        )
    }
    
    override fun selectPaymentMode(
         uid: String?,
        body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>> {
        return posCartApiHelperClass.selectPaymentMode(
        
        uid = uid,
        body = body
        )
    }
    
    override fun getShipments(
         pick_at_store_uid: Int?, ordering_store_id: Int?, p: Boolean?, uid: Int?, address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return posCartApiHelperClass.getShipments(
        
        pick_at_store_uid = pick_at_store_uid,ordering_store_id = ordering_store_id,p = p,uid = uid,address_id = address_id
        
        )
    }
    
    override fun updateShipments(
         i: Boolean?, p: Boolean?, uid: Int?, address_id: Int?, order_type: String?,
        body: UpdateCartShipmentRequest
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return posCartApiHelperClass.updateShipments(
        
        i = i,p = p,uid = uid,address_id = address_id,order_type = order_type,
        body = body
        )
    }
    
    override fun checkoutCart(
         uid: Boolean?,
        body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>> {
        return posCartApiHelperClass.checkoutCart(
        
        uid = uid,
        body = body
        )
    }
    
    override fun updateCartMeta(
         uid: Int?,
        body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>> {
        return posCartApiHelperClass.updateCartMeta(
        
        uid = uid,
        body = body
        )
    }
    
    override fun getCartShareLink(
        
        body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>> {
        return posCartApiHelperClass.getCartShareLink(
        
        
        body = body
        )
    }
    
    override fun getCartSharedItems( token: String
        
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return posCartApiHelperClass.getCartSharedItems(
        token = token
        
        
        )
    }
    
    override fun updateCartWithSharedItems( token: String, action: String
        
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return posCartApiHelperClass.updateCartWithSharedItems(
        token = token,action = action
        
        
        )
    }
    
}

