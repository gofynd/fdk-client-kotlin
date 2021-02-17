package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Path
import javax.inject.Inject

class ApiHelperHelperClass @Inject constructor(private val apiList: ApiList) : ApiHelperFace  {

    
    override fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>> {
        return apiList.getProductDetailBySlug(slug = slug)
    }
    
    override fun getProductSizesBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductSizes>> {
        return apiList.getProductSizesBySlug(slug = slug)
    }
    
    override fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizePriceResponse>> {
        return apiList.getProductPriceBySlug(slug = slug, size = size)
    }
    
    override fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeSellersResponse>> {
        return apiList.getProductSellersBySlug(slug = slug, size = size)
    }
    
    override fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>> {
        return apiList.getProductComparisonBySlugs(slug = slug)
    }
    
    override fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>> {
        return apiList.getSimilarComparisonProductBySlug(slug = slug)
    }
    
    override fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return apiList.getComparedFrequentlyProductBySlug(slug = slug)
    }
    
    override fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return apiList.getProductSimilarByIdentifier(slug = slug, similar_type = similar_type)
    }
    
    override fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>> {
        return apiList.getProductVariantsBySlug(slug = slug)
    }
    
    override fun getProductStockByIds()
    : Deferred<Response<ProductStockStatusResponse>> {
        return apiList.getProductStockByIds()
    }
    
    override fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    : Deferred<Response<ProductStockPolling>> {
        return apiList.getProductStockForTimeByIds(timestamp = timestamp)
    }
    
    override fun getProducts()
    : Deferred<Response<ProductListingResponse>> {
        return apiList.getProducts()
    }
    
    override fun getBrands()
    : Deferred<Response<BrandListingResponse>> {
        return apiList.getBrands()
    }
    
    override fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>> {
        return apiList.getBrandDetailBySlug(slug = slug)
    }
    
    override fun getCategories()
    : Deferred<Response<CategoryListingResponse>> {
        return apiList.getCategories()
    }
    
    override fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>> {
        return apiList.getCategoryDetailBySlug(slug = slug)
    }
    
    override fun getHomeProducts()
    : Deferred<Response<HomeListingResponse>> {
        return apiList.getHomeProducts()
    }
    
    override fun getDepartments()
    : Deferred<Response<DepartmentResponse>> {
        return apiList.getDepartments()
    }
    
    override fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>> {
        return apiList.getSearchResults(q = q)
    }
    
    override fun addCollection()
    : Deferred<Response<CollectionDetailResponse>> {
        return apiList.addCollection()
    }
    
    override fun getCollections()
    : Deferred<Response<GetCollectionListingResponse>> {
        return apiList.getCollections()
    }
    
    override fun addCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionItemsResponse>> {
        return apiList.addCollectionItemsBySlug(slug = slug)
    }
    
    override fun getCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return apiList.getCollectionItemsBySlug(slug = slug)
    }
    
    override fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return apiList.deleteCollectionDetailBySlug(slug = slug)
    }
    
    override fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return apiList.updateCollectionDetailBySlug(slug = slug)
    }
    
    override fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>> {
        return apiList.getCollectionDetailBySlug(slug = slug)
    }
    
    override fun getFollowedListing(@Path("collection_type") collection_type: String)
    : Deferred<Response<GetFollowListingResponse>> {
        return apiList.getFollowedListing(collection_type = collection_type)
    }
    
    override fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return apiList.unfollowById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return apiList.followById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    : Deferred<Response<FollowerCountResponse>> {
        return apiList.getFollowerCountById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowIds()
    : Deferred<Response<FollowIdsResponse>> {
        return apiList.getFollowIds()
    }
    

    
    override fun getCart()
    : Deferred<Response<GetCartResponse>> {
        return apiList.getCart()
    }
    
    override fun getCartLastModified()
    : Deferred<Response<Any>> {
        return apiList.getCartLastModified()
    }
    
    override fun addItems()
    : Deferred<Response<CartResponse>> {
        return apiList.addItems()
    }
    
    override fun updateCart()
    : Deferred<Response<CartResponse>> {
        return apiList.updateCart()
    }
    
    override fun getItemCount()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getItemCount()
    }
    
    override fun getCoupons()
    : Deferred<Response<GetCouponResponse>> {
        return apiList.getCoupons()
    }
    
    override fun applyCoupon()
    : Deferred<Response<Any>> {
        return apiList.applyCoupon()
    }
    
    override fun removeCoupon()
    : Deferred<Response<CartResponse>> {
        return apiList.removeCoupon()
    }
    
    override fun getBulkDiscountOffers()
    : Deferred<Response<BulkPriceResponse>> {
        return apiList.getBulkDiscountOffers()
    }
    
    override fun getAddresses()
    : Deferred<Response<GetAddressResponse>> {
        return apiList.getAddresses()
    }
    
    override fun addAddress()
    : Deferred<Response<SaveAddressResponse>> {
        return apiList.addAddress()
    }
    
    override fun getAddressById(@Path("id") id: Int)
    : Deferred<Response<GetAddressResponse>> {
        return apiList.getAddressById(id = id)
    }
    
    override fun updateAddress(@Path("id") id: Int)
    : Deferred<Response<Any>> {
        return apiList.updateAddress(id = id)
    }
    
    override fun removeAddress(@Path("id") id: Int)
    : Deferred<Response<Any>> {
        return apiList.removeAddress(id = id)
    }
    
    override fun selectAddress()
    : Deferred<Response<Any>> {
        return apiList.selectAddress()
    }
    
    override fun getPaymentModes()
    : Deferred<Response<PaymentOptions>> {
        return apiList.getPaymentModes()
    }
    
    override fun selectPaymentMode()
    : Deferred<Response<PaymentOptions>> {
        return apiList.selectPaymentMode()
    }
    
    override fun getShipments()
    : Deferred<Response<CartShipmentsResponse>> {
        return apiList.getShipments()
    }
    
    override fun checkoutCart()
    : Deferred<Response<CartCheckoutResponse>> {
        return apiList.checkoutCart()
    }
    
    override fun updateCartMeta()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updateCartMeta()
    }
    
    override fun getCartShareLink()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getCartShareLink()
    }
    
    override fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getCartSharedItems(token = token)
    }
    
    override fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updateCartWithSharedItems(token = token, action = action)
    }
    

    
    override fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>> {
        return apiList.getTicket(id = id)
    }
    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>> {
        return apiList.createHistoryForTicket(ticket_id = ticket_id)
    }
    
    override fun createTicket()
    : Deferred<Response<Ticket>> {
        return apiList.createTicket()
    }
    
    override fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>> {
        return apiList.getCustomForm(slug = slug)
    }
    
    override fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>> {
        return apiList.submitCustomForm(slug = slug)
    }
    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return apiList.getParticipantsInsideVideoRoom(unique_name = unique_name)
    }
    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return apiList.getTokenForVideoRoom(unique_name = unique_name)
    }
    

    
    override fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>> {
        return apiList.getAppliedTheme()
    }
    
    override fun getThemeForPreview(@Path("themeId") themeId: String)
    : Deferred<Response<ThemesSchema>> {
        return apiList.getThemeForPreview(themeId = themeId)
    }
    

    
    override fun loginWithFacebook()
    : Deferred<Response<Any>> {
        return apiList.loginWithFacebook()
    }
    
    override fun loginWithGoogle()
    : Deferred<Response<Any>> {
        return apiList.loginWithGoogle()
    }
    
    override fun loginWithGoogleAndroid()
    : Deferred<Response<Any>> {
        return apiList.loginWithGoogleAndroid()
    }
    
    override fun loginWithGoogleIOS()
    : Deferred<Response<Any>> {
        return apiList.loginWithGoogleIOS()
    }
    
    override fun loginWithOTP()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.loginWithOTP()
    }
    
    override fun loginWithEmailAndPassword()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.loginWithEmailAndPassword()
    }
    
    override fun sendResetPasswordEmail()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.sendResetPasswordEmail()
    }
    
    override fun forgotPassword()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.forgotPassword()
    }
    
    override fun sendResetToken()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.sendResetToken()
    }
    
    override fun loginWithToken()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.loginWithToken()
    }
    
    override fun registerWithForm()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.registerWithForm()
    }
    
    override fun verifyEmail()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.verifyEmail()
    }
    
    override fun verifyMobile()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.verifyMobile()
    }
    
    override fun hasPassword()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.hasPassword()
    }
    
    override fun updatePassword()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updatePassword()
    }
    
    override fun logout()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.logout()
    }
    
    override fun sendOTPOnMobile()
    : Deferred<Response<Any>> {
        return apiList.sendOTPOnMobile()
    }
    
    override fun verifyMobileOTP()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.verifyMobileOTP()
    }
    
    override fun sendOTPOnEmail()
    : Deferred<Response<Any>> {
        return apiList.sendOTPOnEmail()
    }
    
    override fun verifyEmailOTP()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.verifyEmailOTP()
    }
    
    override fun getLoggedInUser()
    : Deferred<Response<UserSchema>> {
        return apiList.getLoggedInUser()
    }
    
    override fun getListOfActiveSessions()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getListOfActiveSessions()
    }
    
    override fun getPlatformConfig()
    : Deferred<Response<Any>> {
        return apiList.getPlatformConfig()
    }
    
    override fun updateProfile()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updateProfile()
    }
    
    override fun addMobileNumber()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.addMobileNumber()
    }
    
    override fun deleteMobileNumber(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") country_code: String, @Query("phone") phone: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.deleteMobileNumber(active = active, primary = primary, verified = verified, country_code = country_code, phone = phone)
    }
    
    override fun setMobileNumberAsPrimary()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.setMobileNumberAsPrimary()
    }
    
    override fun sendVerificationLinkToMobile()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.sendVerificationLinkToMobile()
    }
    
    override fun addEmail()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.addEmail()
    }
    
    override fun deleteEmail(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.deleteEmail(active = active, primary = primary, verified = verified, email = email)
    }
    
    override fun setEmailAsPrimary()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.setEmailAsPrimary()
    }
    
    override fun sendVerificationLinkToEmail()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.sendVerificationLinkToEmail()
    }
    

    
    override fun getAnnouncements()
    : Deferred<Response<Any>> {
        return apiList.getAnnouncements()
    }
    
    override fun getBlog(@Path("slug") slug: String)
    : Deferred<Response<CustomBlog>> {
        return apiList.getBlog(slug = slug)
    }
    
    override fun getFaqs()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getFaqs()
    }
    
    override fun getLandingPage(@Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<LandingPage>> {
        return apiList.getLandingPage(x-device-platform = x-device-platform)
    }
    
    override fun getLegalInformation()
    : Deferred<Response<ApplicationLegal>> {
        return apiList.getLegalInformation()
    }
    
    override fun getNavigations(@Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<Navigation>> {
        return apiList.getNavigations(x-device-platform = x-device-platform)
    }
    
    override fun getPage(@Path("slug") slug: String)
    : Deferred<Response<CustomPage>> {
        return apiList.getPage(slug = slug)
    }
    
    override fun getSeoConfiguration()
    : Deferred<Response<Seo>> {
        return apiList.getSeoConfiguration()
    }
    
    override fun getSlideshow(@Path("slug") slug: String, @Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<Slideshow>> {
        return apiList.getSlideshow(slug = slug, x-device-platform = x-device-platform)
    }
    
    override fun getSupportInformation()
    : Deferred<Response<Support>> {
        return apiList.getSupportInformation()
    }
    
    override fun getFPITags()
    : Deferred<Response<TagsSchema>> {
        return apiList.getFPITags()
    }
    

    
    override fun getCommunicationConsent()
    : Deferred<Response<CommunicationConsent>> {
        return apiList.getCommunicationConsent()
    }
    
    override fun upsertCommunicationConsent()
    : Deferred<Response<CommunicationConsentRes>> {
        return apiList.upsertCommunicationConsent()
    }
    
    override fun upsertPushtoken()
    : Deferred<Response<PushtokenRes>> {
        return apiList.upsertPushtoken()
    }
    

    
    override fun getApplicationQRCode()
    : Deferred<Response<QRCodeResp>> {
        return apiList.getApplicationQRCode()
    }
    
    override fun getProductQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return apiList.getProductQRCodeBySlug(slug = slug)
    }
    
    override fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return apiList.getCollectionQRCodeBySlug(slug = slug)
    }
    
    override fun getUrlQRCode(@Query("url") url: String)
    : Deferred<Response<QRCodeResp>> {
        return apiList.getUrlQRCode(url = url)
    }
    
    override fun createShortLink()
    : Deferred<Response<ShortLinkRes>> {
        return apiList.createShortLink()
    }
    
    override fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return apiList.getShortLinkByHash(hash = hash)
    }
    
    override fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return apiList.getOriginalShortLinkByHash(hash = hash)
    }
    

    
    override fun startUpload(@Path("namespace") namespace: String)
    : Deferred<Response<startResponse>> {
        return apiList.startUpload(namespace = namespace)
    }
    
    override fun completeUpload(@Path("namespace") namespace: String)
    : Deferred<Response<completeResponse>> {
        return apiList.completeUpload(namespace = namespace)
    }
    

    
    override fun getApplication()
    : Deferred<Response<Application>> {
        return apiList.getApplication()
    }
    
    override fun getOwnerInfo()
    : Deferred<Response<ApplicationAboutResponse>> {
        return apiList.getOwnerInfo()
    }
    
    override fun getBasicDetails()
    : Deferred<Response<ApplicationDetailResponse>> {
        return apiList.getBasicDetails()
    }
    
    override fun getIntegrationTokens()
    : Deferred<Response<TokensResponse>> {
        return apiList.getIntegrationTokens()
    }
    
    override fun getAppVersion()
    : Deferred<Response<Any>> {
        return apiList.getAppVersion()
    }
    
    override fun getOrderingStores()
    : Deferred<Response<OrderingStores>> {
        return apiList.getOrderingStores()
    }
    
    override fun getFeatures()
    : Deferred<Response<AppFeatureResponse>> {
        return apiList.getFeatures()
    }
    
    override fun getContactInfo()
    : Deferred<Response<ApplicationInformation>> {
        return apiList.getContactInfo()
    }
    
    override fun getCurrencies()
    : Deferred<Response<Any>> {
        return apiList.getCurrencies()
    }
    
    override fun getCurrencyById(@Path("id") id: String)
    : Deferred<Response<Currency>> {
        return apiList.getCurrencyById(id = id)
    }
    
    override fun getLanguages()
    : Deferred<Response<LanguageResponse>> {
        return apiList.getLanguages()
    }
    
    override fun ()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.()
    }
    

    
    override fun getAggregatorsConfig()
    : Deferred<Response<AggregatorsConfigDetailResponse>> {
        return apiList.getAggregatorsConfig()
    }
    
    override fun attachCardToCustomer()
    : Deferred<Response<AttachCardsResponse>> {
        return apiList.attachCardToCustomer()
    }
    
    override fun getActiveCardAggregator()
    : Deferred<Response<ActiveCardPaymentGatewayResponse>> {
        return apiList.getActiveCardAggregator()
    }
    
    override fun getActiveUserCards()
    : Deferred<Response<ListCardsResponse>> {
        return apiList.getActiveUserCards()
    }
    
    override fun deleteUserCard()
    : Deferred<Response<DeleteCardsResponse>> {
        return apiList.deleteUserCard()
    }
    
    override fun verifyCustomerForPayment()
    : Deferred<Response<ValidateCustomerResponse>> {
        return apiList.verifyCustomerForPayment()
    }
    
    override fun verifyAndChargePayment()
    : Deferred<Response<ChargeCustomerResponse>> {
        return apiList.verifyAndChargePayment()
    }
    
    override fun initialisePayment()
    : Deferred<Response<PaymentInitializationResponse>> {
        return apiList.initialisePayment()
    }
    
    override fun checkAndUpdatePaymentStatus()
    : Deferred<Response<PaymentStatusUpdateResponse>> {
        return apiList.checkAndUpdatePaymentStatus()
    }
    
    override fun getUserBeneficiariesDetail(@Query("order_id") order_id: String)
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return apiList.getUserBeneficiariesDetail(order_id = order_id)
    }
    
    override fun verifyIfscCode()
    : Deferred<Response<IfscCodeResponse>> {
        return apiList.verifyIfscCode()
    }
    
    override fun getOrderBeneficiariesDetail(@Query("order_id") order_id: String)
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return apiList.getOrderBeneficiariesDetail(order_id = order_id)
    }
    
    override fun verifyOtpAndAddBeneficiaryForBank()
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>> {
        return apiList.verifyOtpAndAddBeneficiaryForBank()
    }
    
    override fun addBeneficiaryDetails()
    : Deferred<Response<Any>> {
        return apiList.addBeneficiaryDetails()
    }
    
    override fun verifyOtpAndAddBeneficiaryForWallet()
    : Deferred<Response<WalletOtpResponse>> {
        return apiList.verifyOtpAndAddBeneficiaryForWallet()
    }
    
    override fun updateDefaultBeneficiary()
    : Deferred<Response<SetDefaultBeneficiaryResponse>> {
        return apiList.updateDefaultBeneficiary()
    }
    

    
    override fun getOrders()
    : Deferred<Response<OrderList>> {
        return apiList.getOrders()
    }
    
    override fun getOrderById(@Path("order_id") order_id: String)
    : Deferred<Response<OrderById>> {
        return apiList.getOrderById(order_id = order_id)
    }
    
    override fun getShipmentById(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentById>> {
        return apiList.getShipmentById(shipment_id = shipment_id)
    }
    
    override fun getShipmentReasons(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentReasons>> {
        return apiList.getShipmentReasons(shipment_id = shipment_id)
    }
    
    override fun updateShipmentStatus(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentStatusUpdate>> {
        return apiList.updateShipmentStatus(shipment_id = shipment_id)
    }
    
    override fun trackShipment(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentTrack>> {
        return apiList.trackShipment(shipment_id = shipment_id)
    }
    

    
    override fun getPointsOnProduct()
    : Deferred<Response<CatalogueOrderResponse>> {
        return apiList.getPointsOnProduct()
    }
    
    override fun getOrderDiscount()
    : Deferred<Response<points.OrderDiscountRes>> {
        return apiList.getOrderDiscount()
    }
    
    override fun getUserPoints()
    : Deferred<Response<points.PointsRes>> {
        return apiList.getUserPoints()
    }
    
    override fun getUserPointsHistory()
    : Deferred<Response<PointsHistoryResponse>> {
        return apiList.getUserPointsHistory()
    }
    
    override fun getUserReferralDetails()
    : Deferred<Response<points.ReferralInfoRes>> {
        return apiList.getUserReferralDetails()
    }
    
    override fun redeemReferralCode()
    : Deferred<Response<points.RedeemReferralCodeRes>> {
        return apiList.redeemReferralCode()
    }
    

    
    override fun createAbuseReport()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createAbuseReport()
    }
    
    override fun updateAbuseReport()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateAbuseReport()
    }
    
    override fun getAbuseReports(@Path("entity_id") entity_id: String, @Path("entity_type") entity_type: String)
    : Deferred<Response<XNumberGetResponse>> {
        return apiList.getAbuseReports(entity_id = entity_id, entity_type = entity_type)
    }
    
    override fun getAttributes()
    : Deferred<Response<XNumberGetResponse>> {
        return apiList.getAttributes()
    }
    
    override fun createAttribute()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createAttribute()
    }
    
    override fun getAttribute(@Path("slug") slug: String)
    : Deferred<Response<Attribute>> {
        return apiList.getAttribute(slug = slug)
    }
    
    override fun updateAttribute(@Path("slug") slug: String)
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateAttribute(slug = slug)
    }
    
    override fun createComment()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createComment()
    }
    
    override fun updateComment()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateComment()
    }
    
    override fun getComments(@Path("entity_type") entity_type: String)
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getComments(entity_type = entity_type)
    }
    
    override fun checkEligibility(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<CheckEligibilityResponse>> {
        return apiList.checkEligibility(entity_type = entity_type, entity_id = entity_id)
    }
    
    override fun deleteMedia()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.deleteMedia()
    }
    
    override fun createMedia()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createMedia()
    }
    
    override fun updateMedia()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateMedia()
    }
    
    override fun getMedias(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getMedias(entity_type = entity_type, entity_id = entity_id)
    }
    
    override fun getReviewSummaries(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getReviewSummaries(entity_type = entity_type, entity_id = entity_id)
    }
    
    override fun createReview()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.createReview()
    }
    
    override fun updateReview()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateReview()
    }
    
    override fun getReviews(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getReviews(entity_type = entity_type, entity_id = entity_id)
    }
    
    override fun getTemplates()
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getTemplates()
    }
    
    override fun createQuestion()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createQuestion()
    }
    
    override fun updateQuestion()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateQuestion()
    }
    
    override fun getQuestionAndAnswers(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>> {
        return apiList.getQuestionAndAnswers(entity_type = entity_type, entity_id = entity_id)
    }
    
    override fun getVotes()
    : Deferred<Response<XNumberGetResponse>> {
        return apiList.getVotes()
    }
    
    override fun createVote()
    : Deferred<Response<XInsertResponse>> {
        return apiList.createVote()
    }
    
    override fun updateVote()
    : Deferred<Response<XUpdateResponse>> {
        return apiList.updateVote()
    }
    

    
    override fun getCart()
    : Deferred<Response<GetCartResponse>> {
        return apiList.getCart()
    }
    
    override fun getCartLastModified()
    : Deferred<Response<Any>> {
        return apiList.getCartLastModified()
    }
    
    override fun addItems()
    : Deferred<Response<CartResponse>> {
        return apiList.addItems()
    }
    
    override fun updateCart()
    : Deferred<Response<CartResponse>> {
        return apiList.updateCart()
    }
    
    override fun getItemCount()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getItemCount()
    }
    
    override fun getCoupons()
    : Deferred<Response<GetCouponResponse>> {
        return apiList.getCoupons()
    }
    
    override fun applyCoupon()
    : Deferred<Response<Any>> {
        return apiList.applyCoupon()
    }
    
    override fun removeCoupon()
    : Deferred<Response<CartResponse>> {
        return apiList.removeCoupon()
    }
    
    override fun getBulkDiscountOffers()
    : Deferred<Response<BulkPriceResponse>> {
        return apiList.getBulkDiscountOffers()
    }
    
    override fun getAddresses()
    : Deferred<Response<GetAddressResponse>> {
        return apiList.getAddresses()
    }
    
    override fun addAddress()
    : Deferred<Response<SaveAddressResponse>> {
        return apiList.addAddress()
    }
    
    override fun getAddressById(@Path("id") id: Int)
    : Deferred<Response<GetAddressResponse>> {
        return apiList.getAddressById(id = id)
    }
    
    override fun updateAddress(@Path("id") id: Int)
    : Deferred<Response<Any>> {
        return apiList.updateAddress(id = id)
    }
    
    override fun removeAddress(@Path("id") id: Int)
    : Deferred<Response<Any>> {
        return apiList.removeAddress(id = id)
    }
    
    override fun selectAddress()
    : Deferred<Response<Any>> {
        return apiList.selectAddress()
    }
    
    override fun getPaymentModes()
    : Deferred<Response<PaymentOptions>> {
        return apiList.getPaymentModes()
    }
    
    override fun selectPaymentMode()
    : Deferred<Response<PaymentOptions>> {
        return apiList.selectPaymentMode()
    }
    
    override fun getShipments()
    : Deferred<Response<CartShipmentsResponse>> {
        return apiList.getShipments()
    }
    
    override fun updateShipments()
    : Deferred<Response<CartShipmentsResponse>> {
        return apiList.updateShipments()
    }
    
    override fun checkoutCart()
    : Deferred<Response<CartCheckoutResponse>> {
        return apiList.checkoutCart()
    }
    
    override fun updateCartMeta()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updateCartMeta()
    }
    
    override fun getCartShareLink()
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getCartShareLink()
    }
    
    override fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.getCartSharedItems(token = token)
    }
    
    override fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<HashMap<String,Any>>> {
        return apiList.updateCartWithSharedItems(token = token, action = action)
    }
    

}