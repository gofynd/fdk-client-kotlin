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
    
    fun followById( collection_type: String, collection_id: Int
        
        
    )
    :Deferred<Response<FollowPostResponse>>
    
    fun unfollowById( collection_type: String, collection_id: Int
        
        
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

interface ThemeApiHelperFace {
    
    fun getAppliedTheme(
        
        
    )
    :Deferred<Response<ThemesSchema>>
    
    fun getThemeForPreview( theme_id: String
        
        
    )
    :Deferred<Response<ThemesSchema>>
    
}

interface UserApiHelperFace {
    
    fun loginWithFacebook(
        
        body: OAuthRequestSchema
    )
    :Deferred<Response<AuthSuccess>>
    
    fun loginWithGoogle(
        
        body: OAuthRequestSchema
    )
    :Deferred<Response<AuthSuccess>>
    
    fun loginWithGoogleAndroid(
        
        body: OAuthRequestSchema
    )
    :Deferred<Response<AuthSuccess>>
    
    fun loginWithGoogleIOS(
        
        body: OAuthRequestSchema
    )
    :Deferred<Response<AuthSuccess>>
    
    fun loginWithOTP(
         platform: String?=null,
        body: SendOtpRequestSchema
    )
    :Deferred<Response<SendOtpResponse>>
    
    fun loginWithEmailAndPassword(
        
        body: PasswordLoginRequestSchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun sendResetPasswordEmail(
         platform: String?=null,
        body: SendResetPasswordEmailRequestSchema
    )
    :Deferred<Response<ResetPasswordSuccess>>
    
    fun forgotPassword(
        
        body: ForgotPasswordRequestSchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun sendResetToken(
        
        body: CodeRequestBodySchema
    )
    :Deferred<Response<ResetPasswordSuccess>>
    
    fun loginWithToken(
        
        body: TokenRequestBodySchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun registerWithForm(
         platform: String?=null,
        body: FormRegisterRequestSchema
    )
    :Deferred<Response<RegisterFormSuccess>>
    
    fun verifyEmail(
        
        body: CodeRequestBodySchema
    )
    :Deferred<Response<VerifyEmailSuccess>>
    
    fun verifyMobile(
        
        body: CodeRequestBodySchema
    )
    :Deferred<Response<VerifyEmailSuccess>>
    
    fun hasPassword(
        
        
    )
    :Deferred<Response<HasPasswordSuccess>>
    
    fun updatePassword(
        
        body: UpdatePasswordRequestSchema
    )
    :Deferred<Response<VerifyEmailSuccess>>
    
    fun logout(
        
        
    )
    :Deferred<Response<LogoutSuccess>>
    
    fun sendOTPOnMobile(
         platform: String?=null,
        body: SendMobileOtpRequestSchema
    )
    :Deferred<Response<OtpSuccess>>
    
    fun verifyMobileOTP(
         platform: String?=null,
        body: VerifyOtpRequestSchema
    )
    :Deferred<Response<VerifyOtpSuccess>>
    
    fun sendOTPOnEmail(
         platform: String?=null,
        body: SendEmailOtpRequestSchema
    )
    :Deferred<Response<EmailOtpSuccess>>
    
    fun verifyEmailOTP(
         platform: String?=null,
        body: VerifyOtpRequestSchema
    )
    :Deferred<Response<VerifyOtpSuccess>>
    
    fun getLoggedInUser(
        
        
    )
    :Deferred<Response<UserSchema>>
    
    fun getListOfActiveSessions(
        
        
    )
    :Deferred<Response<SessionListSuccess>>
    
    fun getPlatformConfig(
         name: String?=null
        
    )
    :Deferred<Response<PlatformSchema>>
    
    fun updateProfile(
         platform: String?=null,
        body: EditProfileRequestSchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun addMobileNumber(
         platform: String?=null,
        body: EditMobileRequestSchema
    )
    :Deferred<Response<VerifyMobileOTPSuccess>>
    
    fun deleteMobileNumber( active: Boolean, primary: Boolean, verified: Boolean, country_code: String, phone: String,
         platform: String?=null
        
    )
    :Deferred<Response<LoginSuccess>>
    
    fun setMobileNumberAsPrimary(
        
        body: SendVerificationLinkMobileRequestSchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun sendVerificationLinkToMobile(
         platform: String?=null,
        body: SendVerificationLinkMobileRequestSchema
    )
    :Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    fun addEmail(
         platform: String?=null,
        body: EditEmailRequestSchema
    )
    :Deferred<Response<VerifyEmailOTPSuccess>>
    
    fun deleteEmail( active: Boolean, primary: Boolean, verified: Boolean, email: String,
         platform: String?=null
        
    )
    :Deferred<Response<LoginSuccess>>
    
    fun setEmailAsPrimary(
        
        body: EditEmailRequestSchema
    )
    :Deferred<Response<LoginSuccess>>
    
    fun sendVerificationLinkToEmail(
         platform: String?=null,
        body: EditEmailRequestSchema
    )
    :Deferred<Response<SendEmailVerifyLinkSuccess>>
    
}

interface ContentApiHelperFace {
    
    fun getAnnouncements(
        
        
    )
    :Deferred<Response<AnnouncementsResponseSchema>>
    
    fun getBlog( slug: String
        
        
    )
    :Deferred<Response<CustomBlog>>
    
    fun getFaqs(
        
        
    )
    :Deferred<Response<FaqResponseSchema>>
    
    fun getLandingPage( x-device-platform: String
        
        
    )
    :Deferred<Response<LandingPage>>
    
    fun getLegalInformation(
        
        
    )
    :Deferred<Response<ApplicationLegal>>
    
    fun getNavigations( x-device-platform: String
        
        
    )
    :Deferred<Response<Navigation>>
    
    fun getPage( slug: String
        
        
    )
    :Deferred<Response<CustomPage>>
    
    fun getSeoConfiguration(
        
        
    )
    :Deferred<Response<Seo>>
    
    fun getSlideshow( slug: String, x-device-platform: String
        
        
    )
    :Deferred<Response<Slideshow>>
    
    fun getSupportInformation(
        
        
    )
    :Deferred<Response<Support>>
    
    fun getTags(
        
        
    )
    :Deferred<Response<TagsSchema>>
    
}

interface CommunicationApiHelperFace {
    
    fun getCommunicationConsent(
        
        
    )
    :Deferred<Response<CommunicationConsent>>
    
    fun upsertCommunicationConsent(
        
        body: CommunicationConsentReq
    )
    :Deferred<Response<CommunicationConsentRes>>
    
    fun upsertPushtoken(
        
        body: PushtokenReq
    )
    :Deferred<Response<PushtokenRes>>
    
}

interface ShareApiHelperFace {
    
    fun getApplicationQRCode(
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getProductQRCodeBySlug( slug: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getCollectionQRCodeBySlug( slug: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getUrlQRCode( url: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun createShortLink(
        
        body: ShortLinkReq
    )
    :Deferred<Response<ShortLinkRes>>
    
    fun getShortLinkByHash( hash: String
        
        
    )
    :Deferred<Response<ShortLinkRes>>
    
    fun getOriginalShortLinkByHash( hash: String
        
        
    )
    :Deferred<Response<ShortLinkRes>>
    
}

interface FileStorageApiHelperFace {
    
    fun completeUpload( namespace: String, company_id: Int,
        
        body: StartResponse
    )
    :Deferred<Response<CompleteResponse>>
    
    fun startUpload( namespace: String, company_id: Int,
        
        body: StartRequest
    )
    :Deferred<Response<StartResponse>>
    
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

interface FeedbackApiHelperFace {
    
    fun createAbuseReport(
        
        body: ReportAbuseRequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun updateAbuseReport(
        
        body: UpdateAbuseStatusRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun getAbuseReports( entity_id: String, entity_type: String,
         id: String?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XNumberGetResponse>>
    
    fun getAttributes(
        
        
    )
    :Deferred<Response<XNumberGetResponse>>
    
    fun createAttribute(
        
        body: SaveAttributeRequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun getAttribute( slug: String
        
        
    )
    :Deferred<Response<Attribute>>
    
    fun updateAttribute( slug: String,
        
        body: UpdateAttributeRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun createComment(
        
        body: CommentRequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun updateComment(
        
        body: UpdateCommentRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun getComments( entity_type: String,
         id: String?=null, entity_id: String?=null, user_id: String?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun checkEligibility( entity_type: String, entity_id: String
        
        
    )
    :Deferred<Response<CheckEligibilityResponse>>
    
    fun deleteMedia(
        
        
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun createMedia(
        
        body: AddMediaListRequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun updateMedia(
        
        body: UpdateMediaListRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun getMedias( entity_type: String, entity_id: String,
         id: String?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun getReviewSummaries( entity_type: String, entity_id: String,
         id: String?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun createReview(
        
        body: UpdateReviewRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun updateReview(
        
        body: UpdateReviewRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun getReviews( entity_type: String, entity_id: String,
         id: String?=null, user_id: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attribute_rating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun getTemplates(
         template_id: String?=null, entity_id: String?=null, entity_type: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun createQuestion(
        
        body: CreateQNARequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun updateQuestion(
        
        body: UpdateQNARequest
    )
    :Deferred<Response<XUpdateResponse>>
    
    fun getQuestionAndAnswers( entity_type: String, entity_id: String,
         id: String?=null, show_answer: Boolean?=null, page_id: String?=null, page_size: String?=null
        
    )
    :Deferred<Response<XCursorGetResponse>>
    
    fun getVotes(
         id: String?=null, ref_type: String?=null
        
    )
    :Deferred<Response<XNumberGetResponse>>
    
    fun createVote(
        
        body: VoteRequest
    )
    :Deferred<Response<XInsertResponse>>
    
    fun updateVote(
        
        body: UpdateVoteRequest
    )
    :Deferred<Response<XUpdateResponse>>
    
}

interface PosCartApiHelperFace {
    
    fun getCart(
         uid: Int?=null, assign_card_id: Int?=null
        
    )
    :Deferred<Response<CartResponse>>
    
    fun getCartLastModified(
         uid: Int?=null
        
    )
    :Deferred<Response<Any>>
    
    fun addItems(
        
        body: AddCartRequest
    )
    :Deferred<Response<AddCartResponse>>
    
    fun updateCart(
        
        body: UpdateCartRequest
    )
    :Deferred<Response<UpdateCartResponse>>
    
    fun getItemCount(
         uid: Int?=null
        
    )
    :Deferred<Response<CartItemCountResponse>>
    
    fun getCoupons(
         uid: Int?=null
        
    )
    :Deferred<Response<GetCouponResponse>>
    
    fun applyCoupon(
         i: Boolean?=null, b: Boolean?=null, p: Boolean?=null,
        body: ApplyCouponRequest
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
         uid: Int?=null, mobile_no: Int?=null, checkout_mode: String?=null, tags: Int?=null, is_default: Boolean?=null
        
    )
    :Deferred<Response<GetAddressResponse>>
    
    fun addAddress(
        
        body: SaveAddressRequest
    )
    :Deferred<Response<SaveAddressResponse>>
    
    fun getAddressById( id: Int,
         uid: Int?=null, mobile_no: Int?=null, checkout_mode: String?=null, tags: Int?=null, is_default: Boolean?=null
        
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
        body: CartMetaRequest
    )
    :Deferred<Response<CartMetaResponse>>
    
    fun getAvailableDeliveryModes( area_code: Int,
         uid: Int?=null
        
    )
    :Deferred<Response<CartDeliveryModesResponse>>
    
    fun getStoreAddressByUid( area_code: Int
        
        
    )
    :Deferred<Response<StoreDetailsResponse>>
    
    fun getCartShareLink(
        
        body: GetShareCartLinkRequest
    )
    :Deferred<Response<GetShareCartLinkResponse>>
    
    fun getCartSharedItems( token: String
        
        
    )
    :Deferred<Response<SharedCartResponse>>
    
    fun updateCartWithSharedItems( token: String, action: String
        
        
    )
    :Deferred<Response<SharedCartResponse>>
    
}

