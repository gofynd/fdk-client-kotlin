package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiList{

    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds()
    : Deferred<Response<ProductStockStatusResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    : Deferred<Response<ProductStockPolling>>
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts()
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands()
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories()
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>>
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts()
    : Deferred<Response<HomeListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments()
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/")
    fun addCollection()
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections()
    : Deferred<Response<GetCollectionListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun addCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionItemsResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetCollectionListingItemsResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/collections/{slug}/")
    fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailViewDeleteResponse>>
    
    @PUT ("/service/application/catalog/v1.0/collections/{slug}/")
    fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionsUpdateDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(@Path("collection_type") collection_type: String)
    : Deferred<Response<GetFollowListingResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds()
    : Deferred<Response<FollowIdsResponse>>
    

    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart()
    : Deferred<Response<GetCartResponse>>
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems()
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart()
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/basic")
    fun getItemCount()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/cart/v1.0/coupon")
    fun getCoupons()
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/cart/v1.0/coupon")
    fun applyCoupon()
    : Deferred<Response<Any>>
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    fun removeCoupon()
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers()
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses()
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress()
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: Int)
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: Int)
    : Deferred<Response<Any>>
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: Int)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress()
    : Deferred<Response<Any>>
    
    @GET ("/service/application/cart/v1.0/payment")
    fun getPaymentModes()
    : Deferred<Response<PaymentOptions>>
    
    @PUT ("/service/application/cart/v1.0/payment")
    fun selectPaymentMode()
    : Deferred<Response<PaymentOptions>>
    
    @GET ("/service/application/cart/v1.0/shipment")
    fun getShipments()
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/cart/v1.0/checkout")
    fun checkoutCart()
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/cart/v1.0/meta")
    fun updateCartMeta()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/cart/v1.0/share-cart")
    fun getCartShareLink()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<HashMap<String,Any>>>
    

    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @POST ("/service/application/lead/v1.0/ticket/{ticket_id}/history")
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>>
    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket()
    : Deferred<Response<Ticket>>
    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>>
    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    

    
    @GET ("/service/application/theme/v1.0/applied-theme")
    fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/application/theme/v1.0/{themeId}/preview")
    fun getThemeForPreview(@Path("themeId") themeId: String)
    : Deferred<Response<ThemesSchema>>
    

    
    @POST ("/service/application/user/authentication/v1.0/login/facebook-token")
    fun loginWithFacebook()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-token")
    fun loginWithGoogle()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-android")
    fun loginWithGoogleAndroid()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-ios")
    fun loginWithGoogleIOS()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/login/otp")
    fun loginWithOTP()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password")
    fun loginWithEmailAndPassword()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset")
    fun sendResetPasswordEmail()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/userauthentication/v1.0/login/password/reset/forgot")
    fun forgotPassword()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/token")
    fun sendResetToken()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/login/token")
    fun loginWithToken()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/register/form")
    fun registerWithForm()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/verify/email")
    fun verifyEmail()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/verify/mobile")
    fun verifyMobile()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/user/authentication/v1.0/has-password")
    fun hasPassword()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/password")
    fun updatePassword()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/user/authentication/v1.0/logout")
    fun logout()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/send")
    fun sendOTPOnMobile()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/verify")
    fun verifyMobileOTP()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/send")
    fun sendOTPOnEmail()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/verify")
    fun verifyEmailOTP()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/user/authentication/v1.0/session")
    fun getLoggedInUser()
    : Deferred<Response<UserSchema>>
    
    @GET ("/service/application/user/authentication/v1.0/sessions")
    fun getListOfActiveSessions()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/user/platform/v1.0/config")
    fun getPlatformConfig()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/user/profile/v1.0/detail")
    fun updateProfile()
    : Deferred<Response<HashMap<String,Any>>>
    
    @PUT ("/service/application/user/profile/v1.0/mobile")
    fun addMobileNumber()
    : Deferred<Response<HashMap<String,Any>>>
    
    @DELETE ("/service/application/user/profile/v1.0/mobile")
    fun deleteMobileNumber(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") country_code: String, @Query("phone") phone: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/primary")
    fun setMobileNumberAsPrimary()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/link/send")
    fun sendVerificationLinkToMobile()
    : Deferred<Response<HashMap<String,Any>>>
    
    @PUT ("/service/application/user/profile/v1.0/email")
    fun addEmail()
    : Deferred<Response<HashMap<String,Any>>>
    
    @DELETE ("/service/application/user/profile/v1.0/email")
    fun deleteEmail(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/profile/v1.0/email/primary")
    fun setEmailAsPrimary()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/user/profile/v1.0/email/link/send")
    fun sendVerificationLinkToEmail()
    : Deferred<Response<HashMap<String,Any>>>
    

    
    @GET ("/service/application/content/v1.0/announcements")
    fun getAnnouncements()
    : Deferred<Response<Any>>
    
    @GET ("/service/application/content/v1.0/blogs/{slug}")
    fun getBlog(@Path("slug") slug: String)
    : Deferred<Response<CustomBlog>>
    
    @GET ("/service/application/content/v1.0/faqs")
    fun getFaqs()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/content/v1.0/landing-page")
    fun getLandingPage(@Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<LandingPage>>
    
    @GET ("/service/application/content/v1.0/legal")
    fun getLegalInformation()
    : Deferred<Response<ApplicationLegal>>
    
    @GET ("/service/application/content/v1.0/navigations/")
    fun getNavigations(@Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<Navigation>>
    
    @GET ("/service/application/content/v1.0/pages/{slug}")
    fun getPage(@Path("slug") slug: String)
    : Deferred<Response<CustomPage>>
    
    @GET ("/service/application/content/v1.0/seo")
    fun getSeoConfiguration()
    : Deferred<Response<Seo>>
    
    @GET ("/service/application/content/v1.0/slideshow/{slug}")
    fun getSlideshow(@Path("slug") slug: String, @Header("x-device-platform") x-device-platform: String)
    : Deferred<Response<Slideshow>>
    
    @GET ("/service/application/content/v1.0/support")
    fun getSupportInformation()
    : Deferred<Response<Support>>
    
    @GET ("/service/application/content/v1.0/tags")
    fun getFPITags()
    : Deferred<Response<TagsSchema>>
    

    
    @GET ("/service/application/communication/v1.0/consent")
    fun getCommunicationConsent()
    : Deferred<Response<CommunicationConsent>>
    
    @POST ("/service/application/communication/v1.0/consent")
    fun upsertCommunicationConsent()
    : Deferred<Response<CommunicationConsentRes>>
    
    @POST ("/service/platform/communication/v1.0/pn-token")
    fun upsertPushtoken()
    : Deferred<Response<PushtokenRes>>
    

    
    @POST ("/service/application/share/v1.0/qr/")
    fun getApplicationQRCode()
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/products/{slug}/")
    fun getProductQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/collection/{slug}/")
    fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/url/")
    fun getUrlQRCode(@Query("url") url: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/links/short-link/")
    fun createShortLink()
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/")
    fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/original/")
    fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    

    
    @POST ("/service/application/assets/v1.0/uploads/{namespace}/start/")
    fun startUpload(@Path("namespace") namespace: String)
    : Deferred<Response<startResponse>>
    
    @POST ("/service/application/assets/v1.0/uploads/{namespace}/complete/")
    fun completeUpload(@Path("namespace") namespace: String)
    : Deferred<Response<completeResponse>>
    

    
    @GET ("/service/application/configuration/v1.0/application")
    fun getApplication()
    : Deferred<Response<Application>>
    
    @GET ("/service/application/configuration/v1.0/about")
    fun getOwnerInfo()
    : Deferred<Response<ApplicationAboutResponse>>
    
    @GET ("/service/application/configuration/v1.0/detail")
    fun getBasicDetails()
    : Deferred<Response<ApplicationDetailResponse>>
    
    @GET ("/service/application/configuration/v1.0/token")
    fun getIntegrationTokens()
    : Deferred<Response<TokensResponse>>
    
    @POST ("/service/application/configuration/v1.0/version")
    fun getAppVersion()
    : Deferred<Response<Any>>
    
    @GET ("/service/application/configuration/v1.0/ordering_store/stores")
    fun getOrderingStores()
    : Deferred<Response<OrderingStores>>
    
    @GET ("/service/application/configuration/v1.0/feature")
    fun getFeatures()
    : Deferred<Response<AppFeatureResponse>>
    
    @GET ("/service/application/configuration/v1.0/information")
    fun getContactInfo()
    : Deferred<Response<ApplicationInformation>>
    
    @GET ("/service/application/configuration/v1.0/currencies")
    fun getCurrencies()
    : Deferred<Response<Any>>
    
    @GET ("/service/application/configuration/v1.0/currency/{id}")
    fun getCurrencyById(@Path("id") id: String)
    : Deferred<Response<Currency>>
    
    @GET ("/service/application/configuration/v1.0/languages")
    fun getLanguages()
    : Deferred<Response<LanguageResponse>>
    
    @POST ("/application/current/ordering_store/select")
    fun ()
    : Deferred<Response<HashMap<String,Any>>>
    

    
    @GET ("/service/application/payment/v1.0/config/aggregators/key")
    fun getAggregatorsConfig()
    : Deferred<Response<AggregatorsConfigDetailResponse>>
    
    @POST ("/service/application/payment/v1.0/card/attach")
    fun attachCardToCustomer()
    : Deferred<Response<AttachCardsResponse>>
    
    @GET ("/service/application/payment/v1.0/card/aggregator")
    fun getActiveCardAggregator()
    : Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    @GET ("/service/application/payment/v1.0/cards")
    fun getActiveUserCards()
    : Deferred<Response<ListCardsResponse>>
    
    @POST ("/service/application/payment/v1.0/card/remove")
    fun deleteUserCard()
    : Deferred<Response<DeleteCardsResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/customer/validation")
    fun verifyCustomerForPayment()
    : Deferred<Response<ValidateCustomerResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/confirm/charge")
    fun verifyAndChargePayment()
    : Deferred<Response<ChargeCustomerResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/request")
    fun initialisePayment()
    : Deferred<Response<PaymentInitializationResponse>>
    
    @POST ("/service/application/payment/v1.0/payment/confirm/polling")
    fun checkAndUpdatePaymentStatus()
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiary/user")
    fun getUserBeneficiariesDetail(@Query("order_id") order_id: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @GET ("/service/application/payment/v1.0/ifsc-code/verify")
    fun verifyIfscCode()
    : Deferred<Response<IfscCodeResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiaries/order")
    fun getOrderBeneficiariesDetail(@Query("order_id") order_id: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/verification/bank")
    fun verifyOtpAndAddBeneficiaryForBank()
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/account")
    fun addBeneficiaryDetails()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/payment/v1.0/refund/verification/wallet")
    fun verifyOtpAndAddBeneficiaryForWallet()
    : Deferred<Response<WalletOtpResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/beneficiary/default")
    fun updateDefaultBeneficiary()
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    

    
    @GET ("/services/application/v1.0/orders")
    fun getOrders()
    : Deferred<Response<OrderList>>
    
    @GET ("/services/application/v1.0/orders/{order_id}")
    fun getOrderById(@Path("order_id") order_id: String)
    : Deferred<Response<OrderById>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}")
    fun getShipmentById(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentById>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}/reasons")
    fun getShipmentReasons(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentReasons>>
    
    @PUT ("/services/application/v1.0/orders/shipments/{shipment_id}/status")
    fun updateShipmentStatus(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentStatusUpdate>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}/track")
    fun trackShipment(@Path("shipment_id") shipment_id: String)
    : Deferred<Response<ShipmentTrack>>
    

    
    @POST ("/service/application/rewards/v1.0/catalogue/offer/order/")
    fun getPointsOnProduct()
    : Deferred<Response<CatalogueOrderResponse>>
    
    @POST ("/service/application/rewards/v1.0/user/offers/order-discount/")
    fun getOrderDiscount()
    : Deferred<Response<points.OrderDiscountRes>>
    
    @GET ("/service/application/rewards/v1.0/user/points")
    fun getUserPoints()
    : Deferred<Response<points.PointsRes>>
    
    @GET ("/service/application/rewards/v1.0/user/points/history/")
    fun getUserPointsHistory()
    : Deferred<Response<PointsHistoryResponse>>
    
    @GET ("/service/application/rewards/v1.0/user/referral/")
    fun getUserReferralDetails()
    : Deferred<Response<points.ReferralInfoRes>>
    
    @POST ("/service/application/rewards/v1.0/user/referral/redeem/")
    fun redeemReferralCode()
    : Deferred<Response<points.RedeemReferralCodeRes>>
    

    
    @POST ("/service/application/feedback/v1.0/abuse")
    fun createAbuseReport()
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/abuse")
    fun updateAbuseReport()
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}")
    fun getAbuseReports(@Path("entity_id") entity_id: String, @Path("entity_type") entity_type: String)
    : Deferred<Response<XNumberGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes")
    fun getAttributes()
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/attributes")
    fun createAttribute()
    : Deferred<Response<XInsertResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes/{slug}")
    fun getAttribute(@Path("slug") slug: String)
    : Deferred<Response<Attribute>>
    
    @PUT ("/service/application/feedback/v1.0/attributes/{slug}")
    fun updateAttribute(@Path("slug") slug: String)
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/comment")
    fun createComment()
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/comment")
    fun updateComment()
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/comment/entity/{entity_type}")
    fun getComments(@Path("entity_type") entity_type: String)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}")
    fun checkEligibility(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<CheckEligibilityResponse>>
    
    @DELETE ("/service/application/feedback/v1.0/media/")
    fun deleteMedia()
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/media/")
    fun createMedia()
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/media/")
    fun updateMedia()
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}")
    fun getMedias(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviewSummaries(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/review/")
    fun createReview()
    : Deferred<Response<XUpdateResponse>>
    
    @PUT ("/service/application/feedback/v1.0/review/")
    fun updateReview()
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviews(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/")
    fun getTemplates()
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/template/qna/")
    fun createQuestion()
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/template/qna/")
    fun updateQuestion()
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}")
    fun getQuestionAndAnswers(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/vote/")
    fun getVotes()
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/vote/")
    fun createVote()
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/vote/")
    fun updateVote()
    : Deferred<Response<XUpdateResponse>>
    

    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart()
    : Deferred<Response<GetCartResponse>>
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified()
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems()
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart()
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    fun getItemCount()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    fun getCoupons()
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    fun applyCoupon()
    : Deferred<Response<Any>>
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    fun removeCoupon()
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers()
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses()
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress()
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: Int)
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: Int)
    : Deferred<Response<Any>>
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: Int)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress()
    : Deferred<Response<Any>>
    
    @GET ("/service/application/pos/cart/v1.0/payment")
    fun getPaymentModes()
    : Deferred<Response<PaymentOptions>>
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    fun selectPaymentMode()
    : Deferred<Response<PaymentOptions>>
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    fun getShipments()
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    fun updateShipments()
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    fun checkoutCart()
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    fun updateCartMeta()
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink()
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<HashMap<String,Any>>>
    

}