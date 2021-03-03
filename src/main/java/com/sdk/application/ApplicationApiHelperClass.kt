package com.sdk.application

import com.sdk.common.HeaderInterceptor
import com.sdk.common.HttpClient
import com.sdk.common.NetworkUtils
import com.sdk.common.RequestSignerInterceptor
import kotlinx.coroutines.Deferred
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CatalogApiHelperClass(val config: ApplicationConfig) : CatalogApiHelperFace  {
    
   private val catalogApiList: CatalogApiList by lazy {
        generatecatalogApiList()
    }

    
    override fun getProductDetailBySlug(
         slug: String
        
    )
    : Deferred<Response<ProductDetail>> {
        return catalogApiList.getProductDetailBySlug(
            slug = slug
            
        )
    }
    
    override fun getProductSizesBySlug(
         slug: String,  store_id: String?
        
    )
    : Deferred<Response<ProductSizes>> {
        return catalogApiList.getProductSizesBySlug(
            slug = slug, store_id = store_id
            
        )
    }
    
    override fun getProductPriceBySlug(
         slug: String,  size: String,  pincode: Int?,  store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiList.getProductPriceBySlug(
            slug = slug, size = size, pincode = pincode, store_id = store_id
            
        )
    }
    
    override fun getProductSellersBySlug(
         slug: String,  size: String,  pincode: Int?,  page_no: Int?,  page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiList.getProductSellersBySlug(
            slug = slug, size = size, pincode = pincode, page_no = page_no, page_size = page_size
            
        )
    }
    
    override fun getProductComparisonBySlugs(
         slug: String
        
    )
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogApiList.getProductComparisonBySlugs(
            slug = slug
            
        )
    }
    
    override fun getSimilarComparisonProductBySlug(
         slug: String
        
    )
    : Deferred<Response<ProductCompareResponse>> {
        return catalogApiList.getSimilarComparisonProductBySlug(
            slug = slug
            
        )
    }
    
    override fun getComparedFrequentlyProductBySlug(
         slug: String
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogApiList.getComparedFrequentlyProductBySlug(
            slug = slug
            
        )
    }
    
    override fun getProductSimilarByIdentifier(
         slug: String,  similar_type: String
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiList.getProductSimilarByIdentifier(
            slug = slug, similar_type = similar_type
            
        )
    }
    
    override fun getProductVariantsBySlug(
         slug: String
        
    )
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogApiList.getProductVariantsBySlug(
            slug = slug
            
        )
    }
    
    override fun getProductStockByIds(
         item_id: String?,  alu: String?,  sku_code: String?,  ean: String?,  upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiList.getProductStockByIds(
            item_id = item_id, alu = alu, sku_code = sku_code, ean = ean, upc = upc
            
        )
    }
    
    override fun getProductStockForTimeByIds(
         timestamp: String,  page_size: Int?,  page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiList.getProductStockForTimeByIds(
            timestamp = timestamp, page_size = page_size, page_id = page_id
            
        )
    }
    
    override fun getProducts(
         q: String?,  f: String?,  filters: Boolean?,  sort_on: String?,  page_id: String?,  page_size: Int?,  page_no: Int?,  page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiList.getProducts(
            q = q, f = f, filters = filters, sort_on = sort_on, page_id = page_id, page_size = page_size, page_no = page_no, page_type = page_type
            
        )
    }
    
    override fun getBrands(
         department: String?,  page_no: Int?,  page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiList.getBrands(
            department = department, page_no = page_no, page_size = page_size
            
        )
    }
    
    override fun getBrandDetailBySlug(
         slug: String
        
    )
    : Deferred<Response<BrandDetailResponse>> {
        return catalogApiList.getBrandDetailBySlug(
            slug = slug
            
        )
    }
    
    override fun getCategories(
         department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>> {
        return catalogApiList.getCategories(
            department = department
            
        )
    }
    
    override fun getCategoryDetailBySlug(
         slug: String
        
    )
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogApiList.getCategoryDetailBySlug(
            slug = slug
            
        )
    }
    
    override fun getHomeProducts(
         sort_on: String?,  page_id: String?,  page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiList.getHomeProducts(
            sort_on = sort_on, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getDepartments(
        
        
    )
    : Deferred<Response<DepartmentResponse>> {
        return catalogApiList.getDepartments(
            
            
        )
    }
    
    override fun getSearchResults(
         q: String
        
    )
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogApiList.getSearchResults(
            q = q
            
        )
    }
    
    override fun getCollections(
         page_id: String?,  page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiList.getCollections(
            page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getCollectionItemsBySlug(
         slug: String,  f: String?,  filters: Boolean?,  sort_on: String?,  page_id: String?,  page_size: Int?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiList.getCollectionItemsBySlug(
            slug = slug, f = f, filters = filters, sort_on = sort_on, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getCollectionDetailBySlug(
         slug: String
        
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiList.getCollectionDetailBySlug(
            slug = slug
            
        )
    }
    
    override fun getFollowedListing(
         collection_type: String
        
    )
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiList.getFollowedListing(
            collection_type = collection_type
            
        )
    }
    
    override fun followById(
         collection_type: String,  collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.followById(
            collection_type = collection_type, collection_id = collection_id
            
        )
    }
    
    override fun unfollowById(
         collection_type: String,  collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.unfollowById(
            collection_type = collection_type, collection_id = collection_id
            
        )
    }
    
    override fun getFollowerCountById(
         collection_type: String,  collection_id: String
        
    )
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiList.getFollowerCountById(
            collection_type = collection_type, collection_id = collection_id
            
        )
    }
    
    override fun getFollowIds(
         collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiList.getFollowIds(
            collection_type = collection_type
            
        )
    }
    
    override fun getStores(
         page_no: Int?,  page_size: Int?,  q: String?,  range: Int?,  latitude: Double?,  longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiList.getStores(
            page_no = page_no, page_size = page_size, q = q, range = range, latitude = latitude, longitude = longitude
            
        )
    }
    

    private fun generatecatalogApiList(): CatalogApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Catalog"
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as CatalogApiList
    }
}

class CartApiHelperClass(val config: ApplicationConfig) : CartApiHelperFace  {
    
   private val cartApiList: CartApiList by lazy {
        generatecartApiList()
    }

    
    override fun getCart(
         uid: Int?,  assign_card_id: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return cartApiList.getCart(
            uid = uid, assign_card_id = assign_card_id
            
        )
    }
    
    override fun getCartLastModified(
         uid: Int?
        
    )
    : Deferred<Response<Any>> {
        return cartApiList.getCartLastModified(
            uid = uid
            
        )
    }
    
    override fun addItems(
        
        body: AddCartRequest
    )
    : Deferred<Response<AddCartResponse>> {
        return cartApiList.addItems(
            
            body = body
        )
    }
    
    override fun updateCart(
        
        body: UpdateCartRequest
    )
    : Deferred<Response<UpdateCartResponse>> {
        return cartApiList.updateCart(
            
            body = body
        )
    }
    
    override fun getItemCount(
         uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>> {
        return cartApiList.getItemCount(
            uid = uid
            
        )
    }
    
    override fun getCoupons(
         uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>> {
        return cartApiList.getCoupons(
            uid = uid
            
        )
    }
    
    override fun applyCoupon(
         i: Boolean?,  b: Boolean?,  p: Boolean?,
        body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>> {
        return cartApiList.applyCoupon(
            i = i, b = b, p = p,
            body = body
        )
    }
    
    override fun removeCoupon(
         uid: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return cartApiList.removeCoupon(
            uid = uid
            
        )
    }
    
    override fun getBulkDiscountOffers(
         item_id: Int?,  article_id: String?,  uid: Int?,  slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return cartApiList.getBulkDiscountOffers(
            item_id = item_id, article_id = article_id, uid = uid, slug = slug
            
        )
    }
    
    override fun getAddresses(
         uid: Int?,  mobile_no: Int?,  checkout_mode: String?,  tags: Int?,  is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiList.getAddresses(
            uid = uid, mobile_no = mobile_no, checkout_mode = checkout_mode, tags = tags, is_default = is_default
            
        )
    }
    
    override fun addAddress(
        
        body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>> {
        return cartApiList.addAddress(
            
            body = body
        )
    }
    
    override fun getAddressById(
         id: Int,  uid: Int?,  mobile_no: Int?,  checkout_mode: String?,  tags: Int?,  is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiList.getAddressById(
            id = id, uid = uid, mobile_no = mobile_no, checkout_mode = checkout_mode, tags = tags, is_default = is_default
            
        )
    }
    
    override fun updateAddress(
         id: Int,
        body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>> {
        return cartApiList.updateAddress(
            id = id,
            body = body
        )
    }
    
    override fun removeAddress(
         id: Int
        
    )
    : Deferred<Response<DeleteAddressResponse>> {
        return cartApiList.removeAddress(
            id = id
            
        )
    }
    
    override fun selectAddress(
        
        body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>> {
        return cartApiList.selectAddress(
            
            body = body
        )
    }
    
    override fun getPaymentModes(
         uid: String?,  address_id: String?,  payment_mode: String?,  payment_identifier: String?,  aggregator_name: String?,  merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return cartApiList.getPaymentModes(
            uid = uid, address_id = address_id, payment_mode = payment_mode, payment_identifier = payment_identifier, aggregator_name = aggregator_name, merchant_code = merchant_code
            
        )
    }
    
    override fun selectPaymentMode(
         uid: String?,
        body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>> {
        return cartApiList.selectPaymentMode(
            uid = uid,
            body = body
        )
    }
    
    override fun getShipments(
         p: Boolean?,  uid: Int?,  address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return cartApiList.getShipments(
            p = p, uid = uid, address_id = address_id
            
        )
    }
    
    override fun checkoutCart(
        
        body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>> {
        return cartApiList.checkoutCart(
            
            body = body
        )
    }
    
    override fun updateCartMeta(
         uid: Int?,
        body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>> {
        return cartApiList.updateCartMeta(
            uid = uid,
            body = body
        )
    }
    
    override fun getCartShareLink(
        
        body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>> {
        return cartApiList.getCartShareLink(
            
            body = body
        )
    }
    
    override fun getCartSharedItems(
         token: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return cartApiList.getCartSharedItems(
            token = token
            
        )
    }
    
    override fun updateCartWithSharedItems(
         token: String,  action: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return cartApiList.updateCartWithSharedItems(
            token = token, action = action
            
        )
    }
    

    private fun generatecartApiList(): CartApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Cart"
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as CartApiList
    }
}

class LeadApiHelperClass(val config: ApplicationConfig) : LeadApiHelperFace  {
    
   private val leadApiList: LeadApiList by lazy {
        generateleadApiList()
    }

    
    override fun getTicket(
         id: String
        
    )
    : Deferred<Response<Ticket>> {
        return leadApiList.getTicket(
            id = id
            
        )
    }
    
    override fun createHistoryForTicket(
         ticket_id: String,
        body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>> {
        return leadApiList.createHistoryForTicket(
            ticket_id = ticket_id,
            body = body
        )
    }
    
    override fun createTicket(
        
        body: AddTicketPayload
    )
    : Deferred<Response<Ticket>> {
        return leadApiList.createTicket(
            
            body = body
        )
    }
    
    override fun getCustomForm(
         slug: String
        
    )
    : Deferred<Response<CustomForm>> {
        return leadApiList.getCustomForm(
            slug = slug
            
        )
    }
    
    override fun submitCustomForm(
         slug: String,
        body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadApiList.submitCustomForm(
            slug = slug,
            body = body
        )
    }
    
    override fun getParticipantsInsideVideoRoom(
         unique_name: String
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiList.getParticipantsInsideVideoRoom(
            unique_name = unique_name
            
        )
    }
    
    override fun getTokenForVideoRoom(
         unique_name: String
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiList.getTokenForVideoRoom(
            unique_name = unique_name
            
        )
    }
    

    private fun generateleadApiList(): LeadApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Lead"
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as LeadApiList
    }
}

class ThemeApiHelperClass(val config: ApplicationConfig) : ThemeApiHelperFace  {
    
   private val themeApiList: ThemeApiList by lazy {
        generatethemeApiList()
    }

    
    override fun getAppliedTheme(
        
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiList.getAppliedTheme(
            
            
        )
    }
    
    override fun getThemeForPreview(
         theme_id: String
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiList.getThemeForPreview(
            theme_id = theme_id
            
        )
    }
    

    private fun generatethemeApiList(): ThemeApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Theme"
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as ThemeApiList
    }
}

class ContentApiHelperClass(val config: ApplicationConfig) : ContentApiHelperFace  {
    
   private val contentApiList: ContentApiList by lazy {
        generatecontentApiList()
    }

    
    override fun getAnnouncements(
        
        
    )
    : Deferred<Response<AnnouncementsResponseSchema>> {
        return contentApiList.getAnnouncements(
            
            
        )
    }
    
    override fun getBlog(
         slug: String
        
    )
    : Deferred<Response<CustomBlog>> {
        return contentApiList.getBlog(
            slug = slug
            
        )
    }
    
    override fun getFaqs(
        
        
    )
    : Deferred<Response<FaqResponseSchema>> {
        return contentApiList.getFaqs(
            
            
        )
    }
    
    override fun getLandingPage(
         x-device-platform: String
        
    )
    : Deferred<Response<LandingPage>> {
        return contentApiList.getLandingPage(
            x-device-platform = x-device-platform
            
        )
    }
    
    override fun getLegalInformation(
        
        
    )
    : Deferred<Response<ApplicationLegal>> {
        return contentApiList.getLegalInformation(
            
            
        )
    }
    
    override fun getNavigations(
         x-device-platform: String
        
    )
    : Deferred<Response<Navigation>> {
        return contentApiList.getNavigations(
            x-device-platform = x-device-platform
            
        )
    }
    
    override fun getPage(
         slug: String
        
    )
    : Deferred<Response<CustomPage>> {
        return contentApiList.getPage(
            slug = slug
            
        )
    }
    
    override fun getSeoConfiguration(
        
        
    )
    : Deferred<Response<Seo>> {
        return contentApiList.getSeoConfiguration(
            
            
        )
    }
    
    override fun getSlideshow(
         slug: String,  x-device-platform: String
        
    )
    : Deferred<Response<Slideshow>> {
        return contentApiList.getSlideshow(
            slug = slug, x-device-platform = x-device-platform
            
        )
    }
    
    override fun getSupportInformation(
        
        
    )
    : Deferred<Response<Support>> {
        return contentApiList.getSupportInformation(
            
            
        )
    }
    
    override fun getTags(
        
        
    )
    : Deferred<Response<TagsSchema>> {
        return contentApiList.getTags(
            
            
        )
    }
    

    private fun generatecontentApiList(): ContentApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Content"
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as ContentApiList
    }
}

class CommunicationApiHelperClass(val config: ApplicationConfig) : CommunicationApiHelperFace  {
    
   private val communicationApiList: CommunicationApiList by lazy {
        generatecommunicationApiList()
    }

    
    override fun getCommunicationConsent(
        
        
    )
    : Deferred<Response<CommunicationConsent>> {
        return communicationApiList.getCommunicationConsent(
            
            
        )
    }
    
    override fun upsertCommunicationConsent(
        
        body: CommunicationConsentReq
    )
    : Deferred<Response<CommunicationConsentRes>> {
        return communicationApiList.upsertCommunicationConsent(
            
            body = body
        )
    }
    
    override fun upsertPushtoken(
        
        body: PushtokenReq
    )
    : Deferred<Response<PushtokenRes>> {
        return communicationApiList.upsertPushtoken(
            
            body = body
        )
    }
    

    private fun generatecommunicationApiList(): CommunicationApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Communication"
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as CommunicationApiList
    }
}

class ShareApiHelperClass(val config: ApplicationConfig) : ShareApiHelperFace  {
    
   private val shareApiList: ShareApiList by lazy {
        generateshareApiList()
    }

    
    override fun getApplicationQRCode(
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getApplicationQRCode(
            
            
        )
    }
    
    override fun getProductQRCodeBySlug(
         slug: String
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getProductQRCodeBySlug(
            slug = slug
            
        )
    }
    
    override fun getCollectionQRCodeBySlug(
         slug: String
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getCollectionQRCodeBySlug(
            slug = slug
            
        )
    }
    
    override fun getUrlQRCode(
         url: String
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getUrlQRCode(
            url = url
            
        )
    }
    
    override fun createShortLink(
        
        body: ShortLinkReq
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.createShortLink(
            
            body = body
        )
    }
    
    override fun getShortLinkByHash(
         hash: String
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.getShortLinkByHash(
            hash = hash
            
        )
    }
    
    override fun getOriginalShortLinkByHash(
         hash: String
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.getOriginalShortLinkByHash(
            hash = hash
            
        )
    }
    

    private fun generateshareApiList(): ShareApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Share"
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as ShareApiList
    }
}

class FileStorageApiHelperClass(val config: ApplicationConfig) : FileStorageApiHelperFace  {
    
   private val fileStorageApiList: FileStorageApiList by lazy {
        generatefileStorageApiList()
    }

    
    override fun completeUpload(
         namespace: String,  company_id: Int,
        body: StartResponse
    )
    : Deferred<Response<CompleteResponse>> {
        return fileStorageApiList.completeUpload(
            namespace = namespace, company_id = company_id,
            body = body
        )
    }
    
    override fun startUpload(
         namespace: String,  company_id: Int,
        body: StartRequest
    )
    : Deferred<Response<StartResponse>> {
        return fileStorageApiList.startUpload(
            namespace = namespace, company_id = company_id,
            body = body
        )
    }
    

    private fun generatefileStorageApiList(): FileStorageApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "FileStorage"
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as FileStorageApiList
    }
}

class PaymentApiHelperClass(val config: ApplicationConfig) : PaymentApiHelperFace  {
    
   private val paymentApiList: PaymentApiList by lazy {
        generatepaymentApiList()
    }

    
    override fun getAggregatorsConfig(
         x-api-token: String,  refresh: Boolean?
        
    )
    : Deferred<Response<AggregatorsConfigDetailResponse>> {
        return paymentApiList.getAggregatorsConfig(
            x-api-token = x-api-token, refresh = refresh
            
        )
    }
    
    override fun attachCardToCustomer(
        
        body: AttachCardRequest
    )
    : Deferred<Response<AttachCardsResponse>> {
        return paymentApiList.attachCardToCustomer(
            
            body = body
        )
    }
    
    override fun getActiveCardAggregator(
         refresh: Boolean?
        
    )
    : Deferred<Response<ActiveCardPaymentGatewayResponse>> {
        return paymentApiList.getActiveCardAggregator(
            refresh = refresh
            
        )
    }
    
    override fun getActiveUserCards(
         force_refresh: Boolean?
        
    )
    : Deferred<Response<ListCardsResponse>> {
        return paymentApiList.getActiveUserCards(
            force_refresh = force_refresh
            
        )
    }
    
    override fun deleteUserCard(
        
        body: DeletehCardRequest
    )
    : Deferred<Response<DeleteCardsResponse>> {
        return paymentApiList.deleteUserCard(
            
            body = body
        )
    }
    
    override fun verifyCustomerForPayment(
        
        body: ValidateCustomerRequest
    )
    : Deferred<Response<ValidateCustomerResponse>> {
        return paymentApiList.verifyCustomerForPayment(
            
            body = body
        )
    }
    
    override fun verifyAndChargePayment(
        
        body: ChargeCustomerRequest
    )
    : Deferred<Response<ChargeCustomerResponse>> {
        return paymentApiList.verifyAndChargePayment(
            
            body = body
        )
    }
    
    override fun initialisePayment(
        
        body: PaymentInitializationRequest
    )
    : Deferred<Response<PaymentInitializationResponse>> {
        return paymentApiList.initialisePayment(
            
            body = body
        )
    }
    
    override fun checkAndUpdatePaymentStatus(
        
        body: PaymentStatusUpdateRequest
    )
    : Deferred<Response<PaymentStatusUpdateResponse>> {
        return paymentApiList.checkAndUpdatePaymentStatus(
            
            body = body
        )
    }
    
    override fun getPaymentModeRoutes(
         amount: Int,  cart_id: String,  pincode: Int,  checkout_mode: String,  refresh: Boolean?,  assign_card_id: String?,  delivery_address: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>> {
        return paymentApiList.getPaymentModeRoutes(
            amount = amount, cart_id = cart_id, pincode = pincode, checkout_mode = checkout_mode, refresh = refresh, assign_card_id = assign_card_id, delivery_address = delivery_address
            
        )
    }
    
    override fun getPosPaymentModeRoutes(
         amount: Int,  cart_id: String,  pincode: Int,  checkout_mode: String,  refresh: Boolean?,  assign_card_id: String?,  order_type: String,  delivery_address: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>> {
        return paymentApiList.getPosPaymentModeRoutes(
            amount = amount, cart_id = cart_id, pincode = pincode, checkout_mode = checkout_mode, refresh = refresh, assign_card_id = assign_card_id, order_type = order_type, delivery_address = delivery_address
            
        )
    }
    
    override fun getUserBeneficiariesDetail(
         order_id: String
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiList.getUserBeneficiariesDetail(
            order_id = order_id
            
        )
    }
    
    override fun verifyIfscCode(
         ifsc_code: String?
        
    )
    : Deferred<Response<IfscCodeResponse>> {
        return paymentApiList.verifyIfscCode(
            ifsc_code = ifsc_code
            
        )
    }
    
    override fun getOrderBeneficiariesDetail(
         order_id: String
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiList.getOrderBeneficiariesDetail(
            order_id = order_id
            
        )
    }
    
    override fun verifyOtpAndAddBeneficiaryForBank(
        
        body: AddBeneficiaryViaOtpVerificationRequest
    )
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>> {
        return paymentApiList.verifyOtpAndAddBeneficiaryForBank(
            
            body = body
        )
    }
    
    override fun addBeneficiaryDetails(
        
        body: AddBeneficiaryDetailsRequest
    )
    : Deferred<Response<RefundAccountResponse>> {
        return paymentApiList.addBeneficiaryDetails(
            
            body = body
        )
    }
    
    override fun verifyOtpAndAddBeneficiaryForWallet(
        
        body: WalletOtpRequest
    )
    : Deferred<Response<WalletOtpResponse>> {
        return paymentApiList.verifyOtpAndAddBeneficiaryForWallet(
            
            body = body
        )
    }
    
    override fun updateDefaultBeneficiary(
        
        body: SetDefaultBeneficiaryRequest
    )
    : Deferred<Response<SetDefaultBeneficiaryResponse>> {
        return paymentApiList.updateDefaultBeneficiary(
            
            body = body
        )
    }
    

    private fun generatepaymentApiList(): PaymentApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Payment"
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as PaymentApiList
    }
}

class OrderApiHelperClass(val config: ApplicationConfig) : OrderApiHelperFace  {
    
   private val orderApiList: OrderApiList by lazy {
        generateorderApiList()
    }

    
    override fun getOrders(
         page_no: String?,  page_size: String?,  from_date: String?,  to_date: String?
        
    )
    : Deferred<Response<OrderList>> {
        return orderApiList.getOrders(
            page_no = page_no, page_size = page_size, from_date = from_date, to_date = to_date
            
        )
    }
    
    override fun getOrderById(
         order_id: String
        
    )
    : Deferred<Response<OrderById>> {
        return orderApiList.getOrderById(
            order_id = order_id
            
        )
    }
    
    override fun getShipmentById(
         shipment_id: String
        
    )
    : Deferred<Response<ShipmentById>> {
        return orderApiList.getShipmentById(
            shipment_id = shipment_id
            
        )
    }
    
    override fun getShipmentReasons(
         shipment_id: String
        
    )
    : Deferred<Response<ShipmentReasons>> {
        return orderApiList.getShipmentReasons(
            shipment_id = shipment_id
            
        )
    }
    
    override fun updateShipmentStatus(
         shipment_id: String,
        body: ShipmentStatusUpdateBody
    )
    : Deferred<Response<ShipmentStatusUpdate>> {
        return orderApiList.updateShipmentStatus(
            shipment_id = shipment_id,
            body = body
        )
    }
    
    override fun trackShipment(
         shipment_id: String
        
    )
    : Deferred<Response<ShipmentTrack>> {
        return orderApiList.trackShipment(
            shipment_id = shipment_id
            
        )
    }
    

    private fun generateorderApiList(): OrderApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Order"
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as OrderApiList
    }
}

class RewardsApiHelperClass(val config: ApplicationConfig) : RewardsApiHelperFace  {
    
   private val rewardsApiList: RewardsApiList by lazy {
        generaterewardsApiList()
    }

    
    override fun getPointsOnProduct(
        
        body: CatalogueOrderRequest
    )
    : Deferred<Response<CatalogueOrderResponse>> {
        return rewardsApiList.getPointsOnProduct(
            
            body = body
        )
    }
    
    override fun getOrderDiscount(
        
        body: OrderDiscountRequest
    )
    : Deferred<Response<OrderDiscountResponse>> {
        return rewardsApiList.getOrderDiscount(
            
            body = body
        )
    }
    
    override fun getUserPoints(
        
        
    )
    : Deferred<Response<PointsResponse>> {
        return rewardsApiList.getUserPoints(
            
            
        )
    }
    
    override fun getUserPointsHistory(
         pageID: String?,  pageSize: Int?
        
    )
    : Deferred<Response<PointsHistoryResponse>> {
        return rewardsApiList.getUserPointsHistory(
            pageID = pageID, pageSize = pageSize
            
        )
    }
    
    override fun getUserReferralDetails(
        
        
    )
    : Deferred<Response<ReferralDetailsResponse>> {
        return rewardsApiList.getUserReferralDetails(
            
            
        )
    }
    
    override fun redeemReferralCode(
        
        body: RedeemReferralCodeRequest
    )
    : Deferred<Response<RedeemReferralCodeResponse>> {
        return rewardsApiList.redeemReferralCode(
            
            body = body
        )
    }
    

    private fun generaterewardsApiList(): RewardsApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Rewards"
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as RewardsApiList
    }
}

class FeedbackApiHelperClass(val config: ApplicationConfig) : FeedbackApiHelperFace  {
    
   private val feedbackApiList: FeedbackApiList by lazy {
        generatefeedbackApiList()
    }

    
    override fun createAbuseReport(
        
        body: ReportAbuseRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createAbuseReport(
            
            body = body
        )
    }
    
    override fun updateAbuseReport(
        
        body: UpdateAbuseStatusRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateAbuseReport(
            
            body = body
        )
    }
    
    override fun getAbuseReports(
         entity_id: String,  entity_type: String,  id: String?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiList.getAbuseReports(
            entity_id = entity_id, entity_type = entity_type, id = id, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getAttributes(
        
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiList.getAttributes(
            
            
        )
    }
    
    override fun createAttribute(
        
        body: SaveAttributeRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createAttribute(
            
            body = body
        )
    }
    
    override fun getAttribute(
         slug: String
        
    )
    : Deferred<Response<Attribute>> {
        return feedbackApiList.getAttribute(
            slug = slug
            
        )
    }
    
    override fun updateAttribute(
         slug: String,
        body: UpdateAttributeRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateAttribute(
            slug = slug,
            body = body
        )
    }
    
    override fun createComment(
        
        body: CommentRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createComment(
            
            body = body
        )
    }
    
    override fun updateComment(
        
        body: UpdateCommentRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateComment(
            
            body = body
        )
    }
    
    override fun getComments(
         entity_type: String,  id: String?,  entity_id: String?,  user_id: String?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getComments(
            entity_type = entity_type, id = id, entity_id = entity_id, user_id = user_id, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun checkEligibility(
         entity_type: String,  entity_id: String
        
    )
    : Deferred<Response<CheckEligibilityResponse>> {
        return feedbackApiList.checkEligibility(
            entity_type = entity_type, entity_id = entity_id
            
        )
    }
    
    override fun deleteMedia(
        
        
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.deleteMedia(
            
            
        )
    }
    
    override fun createMedia(
        
        body: AddMediaListRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createMedia(
            
            body = body
        )
    }
    
    override fun updateMedia(
        
        body: UpdateMediaListRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateMedia(
            
            body = body
        )
    }
    
    override fun getMedias(
         entity_type: String,  entity_id: String,  id: String?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getMedias(
            entity_type = entity_type, entity_id = entity_id, id = id, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getReviewSummaries(
         entity_type: String,  entity_id: String,  id: String?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getReviewSummaries(
            entity_type = entity_type, entity_id = entity_id, id = id, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun createReview(
        
        body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.createReview(
            
            body = body
        )
    }
    
    override fun updateReview(
        
        body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateReview(
            
            body = body
        )
    }
    
    override fun getReviews(
         entity_type: String,  entity_id: String,  id: String?,  user_id: String?,  media: String?,  rating: ArrayList<Double>?,  attribute_rating: ArrayList<String>?,  facets: Boolean?,  sort: String?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getReviews(
            entity_type = entity_type, entity_id = entity_id, id = id, user_id = user_id, media = media, rating = rating, attribute_rating = attribute_rating, facets = facets, sort = sort, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getTemplates(
         template_id: String?,  entity_id: String?,  entity_type: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getTemplates(
            template_id = template_id, entity_id = entity_id, entity_type = entity_type
            
        )
    }
    
    override fun createQuestion(
        
        body: CreateQNARequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createQuestion(
            
            body = body
        )
    }
    
    override fun updateQuestion(
        
        body: UpdateQNARequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateQuestion(
            
            body = body
        )
    }
    
    override fun getQuestionAndAnswers(
         entity_type: String,  entity_id: String,  id: String?,  show_answer: Boolean?,  page_id: String?,  page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getQuestionAndAnswers(
            entity_type = entity_type, entity_id = entity_id, id = id, show_answer = show_answer, page_id = page_id, page_size = page_size
            
        )
    }
    
    override fun getVotes(
         id: String?,  ref_type: String?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiList.getVotes(
            id = id, ref_type = ref_type
            
        )
    }
    
    override fun createVote(
        
        body: VoteRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiList.createVote(
            
            body = body
        )
    }
    
    override fun updateVote(
        
        body: UpdateVoteRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiList.updateVote(
            
            body = body
        )
    }
    

    private fun generatefeedbackApiList(): FeedbackApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Feedback"
        )
        return retrofitHttpClient?.initializeRestClient(FeedbackApiList::class.java) as FeedbackApiList
    }
}

class PosCartApiHelperClass(val config: ApplicationConfig) : PosCartApiHelperFace  {
    
   private val posCartApiList: PosCartApiList by lazy {
        generateposCartApiList()
    }

    
    override fun getCart(
         uid: Int?,  assign_card_id: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiList.getCart(
            uid = uid, assign_card_id = assign_card_id
            
        )
    }
    
    override fun getCartLastModified(
         uid: Int?
        
    )
    : Deferred<Response<Any>> {
        return posCartApiList.getCartLastModified(
            uid = uid
            
        )
    }
    
    override fun addItems(
        
        body: AddCartRequest
    )
    : Deferred<Response<AddCartResponse>> {
        return posCartApiList.addItems(
            
            body = body
        )
    }
    
    override fun updateCart(
        
        body: UpdateCartRequest
    )
    : Deferred<Response<UpdateCartResponse>> {
        return posCartApiList.updateCart(
            
            body = body
        )
    }
    
    override fun getItemCount(
         uid: Int?
        
    )
    : Deferred<Response<CartItemCountResponse>> {
        return posCartApiList.getItemCount(
            uid = uid
            
        )
    }
    
    override fun getCoupons(
         uid: Int?
        
    )
    : Deferred<Response<GetCouponResponse>> {
        return posCartApiList.getCoupons(
            uid = uid
            
        )
    }
    
    override fun applyCoupon(
         i: Boolean?,  b: Boolean?,  p: Boolean?,
        body: ApplyCouponRequest
    )
    : Deferred<Response<SaveCouponResponse>> {
        return posCartApiList.applyCoupon(
            i = i, b = b, p = p,
            body = body
        )
    }
    
    override fun removeCoupon(
         uid: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiList.removeCoupon(
            uid = uid
            
        )
    }
    
    override fun getBulkDiscountOffers(
         item_id: Int?,  article_id: String?,  uid: Int?,  slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return posCartApiList.getBulkDiscountOffers(
            item_id = item_id, article_id = article_id, uid = uid, slug = slug
            
        )
    }
    
    override fun getAddresses(
         uid: Int?,  mobile_no: Int?,  checkout_mode: String?,  tags: Int?,  is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiList.getAddresses(
            uid = uid, mobile_no = mobile_no, checkout_mode = checkout_mode, tags = tags, is_default = is_default
            
        )
    }
    
    override fun addAddress(
        
        body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>> {
        return posCartApiList.addAddress(
            
            body = body
        )
    }
    
    override fun getAddressById(
         id: Int,  uid: Int?,  mobile_no: Int?,  checkout_mode: String?,  tags: Int?,  is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiList.getAddressById(
            id = id, uid = uid, mobile_no = mobile_no, checkout_mode = checkout_mode, tags = tags, is_default = is_default
            
        )
    }
    
    override fun updateAddress(
         id: Int,
        body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>> {
        return posCartApiList.updateAddress(
            id = id,
            body = body
        )
    }
    
    override fun removeAddress(
         id: Int
        
    )
    : Deferred<Response<DeleteAddressResponse>> {
        return posCartApiList.removeAddress(
            id = id
            
        )
    }
    
    override fun selectAddress(
        
        body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiList.selectAddress(
            
            body = body
        )
    }
    
    override fun getPaymentModes(
         uid: String?,  address_id: String?,  payment_mode: String?,  payment_identifier: String?,  aggregator_name: String?,  merchant_code: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return posCartApiList.getPaymentModes(
            uid = uid, address_id = address_id, payment_mode = payment_mode, payment_identifier = payment_identifier, aggregator_name = aggregator_name, merchant_code = merchant_code
            
        )
    }
    
    override fun selectPaymentMode(
         uid: String?,
        body: UpdateCartPaymentRequest
    )
    : Deferred<Response<PaymentOptions>> {
        return posCartApiList.selectPaymentMode(
            uid = uid,
            body = body
        )
    }
    
    override fun getShipments(
         pick_at_store_uid: Int?,  ordering_store_id: Int?,  p: Boolean?,  uid: Int?,  address_id: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return posCartApiList.getShipments(
            pick_at_store_uid = pick_at_store_uid, ordering_store_id = ordering_store_id, p = p, uid = uid, address_id = address_id
            
        )
    }
    
    override fun checkoutCart(
         uid: Boolean?,
        body: CartCheckoutRequest
    )
    : Deferred<Response<CartCheckoutResponse>> {
        return posCartApiList.checkoutCart(
            uid = uid,
            body = body
        )
    }
    
    override fun updateCartMeta(
         uid: Int?,
        body: CartMetaRequest
    )
    : Deferred<Response<CartMetaResponse>> {
        return posCartApiList.updateCartMeta(
            uid = uid,
            body = body
        )
    }
    
    override fun getAvailableDeliveryModes(
         area_code: Int,  uid: Int?
        
    )
    : Deferred<Response<CartDeliveryModesResponse>> {
        return posCartApiList.getAvailableDeliveryModes(
            area_code = area_code, uid = uid
            
        )
    }
    
    override fun getStoreAddressByUid(
         area_code: Int
        
    )
    : Deferred<Response<StoreDetailsResponse>> {
        return posCartApiList.getStoreAddressByUid(
            area_code = area_code
            
        )
    }
    
    override fun getCartShareLink(
        
        body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>> {
        return posCartApiList.getCartShareLink(
            
            body = body
        )
    }
    
    override fun getCartSharedItems(
         token: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return posCartApiList.getCartSharedItems(
            token = token
            
        )
    }
    
    override fun updateCartWithSharedItems(
         token: String,  action: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return posCartApiList.updateCartWithSharedItems(
            token = token, action = action
            
        )
    }
    

    private fun generateposCartApiList(): PosCartApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "PosCart"
        )
        return retrofitHttpClient?.initializeRestClient(PosCartApiList::class.java) as PosCartApiList
    }
}
