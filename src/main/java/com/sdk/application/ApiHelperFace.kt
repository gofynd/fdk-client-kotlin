package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Path

interface ApiHelperFace {

    
    fun getProductDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductDetail>>

    
    fun getProductSizesBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductSizes>>

    
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    :Deferred<Response<ProductSizePriceResponse>>

    
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    :Deferred<Response<ProductSizeSellersResponse>>

    
    fun getProductComparisonBySlugs(@Query("slug") slug: String)
    :Deferred<Response<ProductsComparisonResponse>>

    
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductCompareResponse>>

    
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductFrequentlyComparedSimilarResponse>>

    
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    :Deferred<Response<SimilarProductByTypeResponse>>

    
    fun getProductVariantsBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductVariantsResponse>>

    
    fun getProductStockByIds()
    :Deferred<Response<ProductStockStatusResponse>>

    
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    :Deferred<Response<ProductStockPolling>>

    
    fun getProducts()
    :Deferred<Response<ProductListingResponse>>

    
    fun getBrands()
    :Deferred<Response<BrandListingResponse>>

    
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<BrandDetailResponse>>

    
    fun getCategories()
    :Deferred<Response<CategoryListingResponse>>

    
    fun getCategoryDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CategoryMetaResponse>>

    
    fun getHomeProducts()
    :Deferred<Response<HomeListingResponse>>

    
    fun getDepartments()
    :Deferred<Response<DepartmentResponse>>

    
    fun getSearchResults(@Query("q") q: String)
    :Deferred<Response<AutoCompleteResponse>>

    
    fun addCollection()
    :Deferred<Response<CollectionDetailResponse>>

    
    fun getCollections()
    :Deferred<Response<GetCollectionListingResponse>>

    
    fun addCollectionItemsBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionItemsResponse>>

    
    fun getCollectionItemsBySlug(@Path("slug") slug: String)
    :Deferred<Response<GetCollectionListingItemsResponse>>

    
    fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionDetailViewDeleteResponse>>

    
    fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionsUpdateDetailResponse>>

    
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionDetailResponse>>

    
    fun getFollowedListing(@Path("collection_type") collection_type: String)
    :Deferred<Response<GetFollowListingResponse>>

    
    fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    :Deferred<Response<FollowPostResponse>>

    
    fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    :Deferred<Response<FollowPostResponse>>

    
    fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    :Deferred<Response<FollowerCountResponse>>

    
    fun getFollowIds()
    :Deferred<Response<FollowIdsResponse>>

    
}

    
    fun getCart()
    :Deferred<Response<GetCartResponse>>

    
    fun getCartLastModified()
    :Deferred<Response<Any>>

    
    fun addItems()
    :Deferred<Response<CartResponse>>

    
    fun updateCart()
    :Deferred<Response<CartResponse>>

    
    fun getItemCount()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCoupons()
    :Deferred<Response<GetCouponResponse>>

    
    fun applyCoupon()
    :Deferred<Response<Any>>

    
    fun removeCoupon()
    :Deferred<Response<CartResponse>>

    
    fun getBulkDiscountOffers()
    :Deferred<Response<BulkPriceResponse>>

    
    fun getAddresses()
    :Deferred<Response<GetAddressResponse>>

    
    fun addAddress()
    :Deferred<Response<SaveAddressResponse>>

    
    fun getAddressById(@Path("id") id: Int)
    :Deferred<Response<GetAddressResponse>>

    
    fun updateAddress(@Path("id") id: Int)
    :Deferred<Response<Any>>

    
    fun removeAddress(@Path("id") id: Int)
    :Deferred<Response<Any>>

    
    fun selectAddress()
    :Deferred<Response<Any>>

    
    fun getPaymentModes()
    :Deferred<Response<PaymentOptions>>

    
    fun selectPaymentMode()
    :Deferred<Response<PaymentOptions>>

    
    fun getShipments()
    :Deferred<Response<CartShipmentsResponse>>

    
    fun checkoutCart()
    :Deferred<Response<CartCheckoutResponse>>

    
    fun updateCartMeta()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCartShareLink()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCartSharedItems(@Path("token") token: String)
    :Deferred<Response<HashMap<String,Any>>>

    
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    :Deferred<Response<HashMap<String,Any>>>

    
}

    
    fun getTicket(@Path("id") id: String)
    :Deferred<Response<Ticket>>

    
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Deferred<Response<TicketHistory>>

    
    fun createTicket()
    :Deferred<Response<Ticket>>

    
    fun getCustomForm(@Path("slug") slug: String)
    :Deferred<Response<CustomForm>>

    
    fun submitCustomForm(@Path("slug") slug: String)
    :Deferred<Response<SubmitCustomFormResponse>>

    
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetParticipantsInsideVideoRoomResponse>>

    
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetTokenForVideoRoomResponse>>

    
}

    
    fun getAppliedTheme()
    :Deferred<Response<ThemesSchema>>

    
    fun getThemeForPreview(@Path("themeId") themeId: String)
    :Deferred<Response<ThemesSchema>>

    
}

    
    fun loginWithFacebook()
    :Deferred<Response<Any>>

    
    fun loginWithGoogle()
    :Deferred<Response<Any>>

    
    fun loginWithGoogleAndroid()
    :Deferred<Response<Any>>

    
    fun loginWithGoogleIOS()
    :Deferred<Response<Any>>

    
    fun loginWithOTP()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun loginWithEmailAndPassword()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendResetPasswordEmail()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun forgotPassword()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendResetToken()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun loginWithToken()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun registerWithForm()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun verifyEmail()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun verifyMobile()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun hasPassword()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun updatePassword()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun logout()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendOTPOnMobile()
    :Deferred<Response<Any>>

    
    fun verifyMobileOTP()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendOTPOnEmail()
    :Deferred<Response<Any>>

    
    fun verifyEmailOTP()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getLoggedInUser()
    :Deferred<Response<UserSchema>>

    
    fun getListOfActiveSessions()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getPlatformConfig()
    :Deferred<Response<Any>>

    
    fun updateProfile()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun addMobileNumber()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun deleteMobileNumber(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") country_code: String, @Query("phone") phone: String)
    :Deferred<Response<HashMap<String,Any>>>

    
    fun setMobileNumberAsPrimary()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendVerificationLinkToMobile()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun addEmail()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun deleteEmail(@Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    :Deferred<Response<HashMap<String,Any>>>

    
    fun setEmailAsPrimary()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun sendVerificationLinkToEmail()
    :Deferred<Response<HashMap<String,Any>>>

    
}

    
    fun getAnnouncements()
    :Deferred<Response<Any>>

    
    fun getBlog(@Path("slug") slug: String)
    :Deferred<Response<CustomBlog>>

    
    fun getFaqs()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getLandingPage(@Header("x-device-platform") x-device-platform: String)
    :Deferred<Response<LandingPage>>

    
    fun getLegalInformation()
    :Deferred<Response<ApplicationLegal>>

    
    fun getNavigations(@Header("x-device-platform") x-device-platform: String)
    :Deferred<Response<Navigation>>

    
    fun getPage(@Path("slug") slug: String)
    :Deferred<Response<CustomPage>>

    
    fun getSeoConfiguration()
    :Deferred<Response<Seo>>

    
    fun getSlideshow(@Path("slug") slug: String, @Header("x-device-platform") x-device-platform: String)
    :Deferred<Response<Slideshow>>

    
    fun getSupportInformation()
    :Deferred<Response<Support>>

    
    fun getFPITags()
    :Deferred<Response<TagsSchema>>

    
}

    
    fun getCommunicationConsent()
    :Deferred<Response<CommunicationConsent>>

    
    fun upsertCommunicationConsent()
    :Deferred<Response<CommunicationConsentRes>>

    
    fun upsertPushtoken()
    :Deferred<Response<PushtokenRes>>

    
}

    
    fun getApplicationQRCode()
    :Deferred<Response<QRCodeResp>>

    
    fun getProductQRCodeBySlug(@Path("slug") slug: String)
    :Deferred<Response<QRCodeResp>>

    
    fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    :Deferred<Response<QRCodeResp>>

    
    fun getUrlQRCode(@Query("url") url: String)
    :Deferred<Response<QRCodeResp>>

    
    fun createShortLink()
    :Deferred<Response<ShortLinkRes>>

    
    fun getShortLinkByHash(@Path("hash") hash: String)
    :Deferred<Response<ShortLinkRes>>

    
    fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    :Deferred<Response<ShortLinkRes>>

    
}

    
    fun startUpload(@Path("namespace") namespace: String)
    :Deferred<Response<startResponse>>

    
    fun completeUpload(@Path("namespace") namespace: String)
    :Deferred<Response<completeResponse>>

    
}

    
    fun getApplication()
    :Deferred<Response<Application>>

    
    fun getOwnerInfo()
    :Deferred<Response<ApplicationAboutResponse>>

    
    fun getBasicDetails()
    :Deferred<Response<ApplicationDetailResponse>>

    
    fun getIntegrationTokens()
    :Deferred<Response<TokensResponse>>

    
    fun getAppVersion()
    :Deferred<Response<Any>>

    
    fun getOrderingStores()
    :Deferred<Response<OrderingStores>>

    
    fun getFeatures()
    :Deferred<Response<AppFeatureResponse>>

    
    fun getContactInfo()
    :Deferred<Response<ApplicationInformation>>

    
    fun getCurrencies()
    :Deferred<Response<Any>>

    
    fun getCurrencyById(@Path("id") id: String)
    :Deferred<Response<Currency>>

    
    fun getLanguages()
    :Deferred<Response<LanguageResponse>>

    
    fun ()
    :Deferred<Response<HashMap<String,Any>>>

    
}

    
    fun getAggregatorsConfig()
    :Deferred<Response<AggregatorsConfigDetailResponse>>

    
    fun attachCardToCustomer()
    :Deferred<Response<AttachCardsResponse>>

    
    fun getActiveCardAggregator()
    :Deferred<Response<ActiveCardPaymentGatewayResponse>>

    
    fun getActiveUserCards()
    :Deferred<Response<ListCardsResponse>>

    
    fun deleteUserCard()
    :Deferred<Response<DeleteCardsResponse>>

    
    fun verifyCustomerForPayment()
    :Deferred<Response<ValidateCustomerResponse>>

    
    fun verifyAndChargePayment()
    :Deferred<Response<ChargeCustomerResponse>>

    
    fun initialisePayment()
    :Deferred<Response<PaymentInitializationResponse>>

    
    fun checkAndUpdatePaymentStatus()
    :Deferred<Response<PaymentStatusUpdateResponse>>

    
    fun getUserBeneficiariesDetail(@Query("order_id") order_id: String)
    :Deferred<Response<OrderBeneficiaryResponse>>

    
    fun verifyIfscCode()
    :Deferred<Response<IfscCodeResponse>>

    
    fun getOrderBeneficiariesDetail(@Query("order_id") order_id: String)
    :Deferred<Response<OrderBeneficiaryResponse>>

    
    fun verifyOtpAndAddBeneficiaryForBank()
    :Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>

    
    fun addBeneficiaryDetails()
    :Deferred<Response<Any>>

    
    fun verifyOtpAndAddBeneficiaryForWallet()
    :Deferred<Response<WalletOtpResponse>>

    
    fun updateDefaultBeneficiary()
    :Deferred<Response<SetDefaultBeneficiaryResponse>>

    
}

    
    fun getOrders()
    :Deferred<Response<OrderList>>

    
    fun getOrderById(@Path("order_id") order_id: String)
    :Deferred<Response<OrderById>>

    
    fun getShipmentById(@Path("shipment_id") shipment_id: String)
    :Deferred<Response<ShipmentById>>

    
    fun getShipmentReasons(@Path("shipment_id") shipment_id: String)
    :Deferred<Response<ShipmentReasons>>

    
    fun updateShipmentStatus(@Path("shipment_id") shipment_id: String)
    :Deferred<Response<ShipmentStatusUpdate>>

    
    fun trackShipment(@Path("shipment_id") shipment_id: String)
    :Deferred<Response<ShipmentTrack>>

    
}

    
    fun getPointsOnProduct()
    :Deferred<Response<CatalogueOrderResponse>>

    
    fun getOrderDiscount()
    :Deferred<Response<points.OrderDiscountRes>>

    
    fun getUserPoints()
    :Deferred<Response<points.PointsRes>>

    
    fun getUserPointsHistory()
    :Deferred<Response<PointsHistoryResponse>>

    
    fun getUserReferralDetails()
    :Deferred<Response<points.ReferralInfoRes>>

    
    fun redeemReferralCode()
    :Deferred<Response<points.RedeemReferralCodeRes>>

    
}

    
    fun createAbuseReport()
    :Deferred<Response<XInsertResponse>>

    
    fun updateAbuseReport()
    :Deferred<Response<XUpdateResponse>>

    
    fun getAbuseReports(@Path("entity_id") entity_id: String, @Path("entity_type") entity_type: String)
    :Deferred<Response<XNumberGetResponse>>

    
    fun getAttributes()
    :Deferred<Response<XNumberGetResponse>>

    
    fun createAttribute()
    :Deferred<Response<XInsertResponse>>

    
    fun getAttribute(@Path("slug") slug: String)
    :Deferred<Response<Attribute>>

    
    fun updateAttribute(@Path("slug") slug: String)
    :Deferred<Response<XUpdateResponse>>

    
    fun createComment()
    :Deferred<Response<XInsertResponse>>

    
    fun updateComment()
    :Deferred<Response<XUpdateResponse>>

    
    fun getComments(@Path("entity_type") entity_type: String)
    :Deferred<Response<XCursorGetResponse>>

    
    fun checkEligibility(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    :Deferred<Response<CheckEligibilityResponse>>

    
    fun deleteMedia()
    :Deferred<Response<XUpdateResponse>>

    
    fun createMedia()
    :Deferred<Response<XInsertResponse>>

    
    fun updateMedia()
    :Deferred<Response<XUpdateResponse>>

    
    fun getMedias(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    :Deferred<Response<XCursorGetResponse>>

    
    fun getReviewSummaries(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    :Deferred<Response<XCursorGetResponse>>

    
    fun createReview()
    :Deferred<Response<XUpdateResponse>>

    
    fun updateReview()
    :Deferred<Response<XUpdateResponse>>

    
    fun getReviews(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    :Deferred<Response<XCursorGetResponse>>

    
    fun getTemplates()
    :Deferred<Response<XCursorGetResponse>>

    
    fun createQuestion()
    :Deferred<Response<XInsertResponse>>

    
    fun updateQuestion()
    :Deferred<Response<XUpdateResponse>>

    
    fun getQuestionAndAnswers(@Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String)
    :Deferred<Response<XCursorGetResponse>>

    
    fun getVotes()
    :Deferred<Response<XNumberGetResponse>>

    
    fun createVote()
    :Deferred<Response<XInsertResponse>>

    
    fun updateVote()
    :Deferred<Response<XUpdateResponse>>

    
}

    
    fun getCart()
    :Deferred<Response<GetCartResponse>>

    
    fun getCartLastModified()
    :Deferred<Response<Any>>

    
    fun addItems()
    :Deferred<Response<CartResponse>>

    
    fun updateCart()
    :Deferred<Response<CartResponse>>

    
    fun getItemCount()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCoupons()
    :Deferred<Response<GetCouponResponse>>

    
    fun applyCoupon()
    :Deferred<Response<Any>>

    
    fun removeCoupon()
    :Deferred<Response<CartResponse>>

    
    fun getBulkDiscountOffers()
    :Deferred<Response<BulkPriceResponse>>

    
    fun getAddresses()
    :Deferred<Response<GetAddressResponse>>

    
    fun addAddress()
    :Deferred<Response<SaveAddressResponse>>

    
    fun getAddressById(@Path("id") id: Int)
    :Deferred<Response<GetAddressResponse>>

    
    fun updateAddress(@Path("id") id: Int)
    :Deferred<Response<Any>>

    
    fun removeAddress(@Path("id") id: Int)
    :Deferred<Response<Any>>

    
    fun selectAddress()
    :Deferred<Response<Any>>

    
    fun getPaymentModes()
    :Deferred<Response<PaymentOptions>>

    
    fun selectPaymentMode()
    :Deferred<Response<PaymentOptions>>

    
    fun getShipments()
    :Deferred<Response<CartShipmentsResponse>>

    
    fun updateShipments()
    :Deferred<Response<CartShipmentsResponse>>

    
    fun checkoutCart()
    :Deferred<Response<CartCheckoutResponse>>

    
    fun updateCartMeta()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCartShareLink()
    :Deferred<Response<HashMap<String,Any>>>

    
    fun getCartSharedItems(@Path("token") token: String)
    :Deferred<Response<HashMap<String,Any>>>

    
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    :Deferred<Response<HashMap<String,Any>>>

    
}
