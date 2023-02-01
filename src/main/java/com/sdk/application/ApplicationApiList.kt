package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url


interface CatalogApiList {
    
    
    @GET 
    fun getProductDetailBySlug(@Url url1: String?    )
    : Deferred<Response<ProductDetail>>
    
    
    @GET 
    fun getProductSizesBySlug(@Url url1: String?     ,  @Query("store_id") storeId: Int?)
    : Deferred<Response<ProductSizes>>
    
    
    @GET 
    fun getProductComparisonBySlugs(@Url url1: String?    ,  @Query("slug") slug: ArrayList<String>)
    : Deferred<Response<ProductsComparisonResponse>>
    
    
    @GET 
    fun getSimilarComparisonProductBySlug(@Url url1: String?    )
    : Deferred<Response<ProductCompareResponse>>
    
    
    @GET 
    fun getComparedFrequentlyProductBySlug(@Url url1: String?    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    
    @GET 
    fun getProductVariantsBySlug(@Url url1: String?    )
    : Deferred<Response<ProductVariantsResponse>>
    
    
    @GET 
    fun getProductStockByIds(@Url url1: String?    ,      @Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?)
    : Deferred<Response<ProductStockStatusResponse>>
    
    
    @GET 
    fun getProductStockForTimeByIds(@Url url1: String?    ,    @Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<ProductStockPolling>>
    
    
    @GET 
    fun getProducts(@Url url1: String?    ,         @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET 
    fun getBrands(@Url url1: String?    ,    @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BrandListingResponse>>
    
    
    @GET 
    fun getBrandDetailBySlug(@Url url1: String?    )
    : Deferred<Response<BrandDetailResponse>>
    
    
    @GET 
    fun getCategories(@Url url1: String?    ,  @Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    
    @GET 
    fun getCategoryDetailBySlug(@Url url1: String?    )
    : Deferred<Response<CategoryMetaResponse>>
    
    
    @GET 
    fun getHomeProducts(@Url url1: String?    ,    @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HomeListingResponse>>
    
    
    @GET 
    fun getDepartments(@Url url1: String?   )
    : Deferred<Response<DepartmentResponse>>
    
    
    @GET 
    fun getSearchResults(@Url url1: String?    ,  @Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>>
    
    
    @GET 
    fun getCollections(@Url url1: String?    ,    @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    
    @GET 
    fun getCollectionItemsBySlug(@Url url1: String?     ,      @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET 
    fun getCollectionDetailBySlug(@Url url1: String?    )
    : Deferred<Response<CollectionDetailResponse>>
    
    
    @GET 
    fun getFollowedListing(@Url url1: String?     ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetFollowListingResponse>>
    
    
    @POST 
    fun followById(@Url url1: String?     )
    : Deferred<Response<FollowPostResponse>>
    
    
    @DELETE 
    fun unfollowById(@Url url1: String?     )
    : Deferred<Response<FollowPostResponse>>
    
    
    @GET 
    fun getFollowerCountById(@Url url1: String?     )
    : Deferred<Response<FollowerCountResponse>>
    
    
    @GET 
    fun getFollowIds(@Url url1: String?    ,  @Query("collection_type") collectionType: String?)
    : Deferred<Response<FollowIdsResponse>>
    
    
    @GET 
    fun getStores(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<StoreListingResponse>>
    
    
    @GET 
    fun getInStockLocations(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<ApplicationStoreListing>>
    
    
    @GET 
    fun getLocationDetailsById(@Url url1: String?    )
    : Deferred<Response<StoreDetails>>
    
    
    @GET 
    fun getProductBundlesBySlug(@Url url1: String?    ,   @Query("slug") slug: String?, @Query("id") id: String?)
    : Deferred<Response<ProductBundle>>
    
    
    @GET 
    fun getProductPriceBySlug(@Url url1: String?      ,    @Query("store_id") storeId: Int?, @Query("pincode") pincode: String?, @Query("moq") moq: Int?)
    : Deferred<Response<ProductSizePriceResponseV2>>
    
    
    @GET 
    fun getProductSellersBySlug(@Url url1: String?      ,     @Query("pincode") pincode: String?, @Query("strategy") strategy: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductSizeSellersResponseV2>>
    
}

interface CartApiList {
    
    
    @GET 
    fun getCart(@Url url1: String?    ,       @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @HEAD 
    fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?)
    : Deferred<Response<Void>>
    
    
    @POST 
    fun addItems(@Url url1: String?    ,     @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    
    @PUT 
    fun updateCart(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    
    @GET 
    fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartItemCountResponse>>
    
    
    @GET 
    fun getCoupons(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<GetCouponResponse>>
    
    
    @POST 
    fun applyCoupon(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @DELETE 
    fun removeCoupon(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    
    @POST 
    fun applyRewardPoints(@Url url1: String?    ,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RewardPointRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    
    @POST 
    fun addAddress(@Url url1: String?   ,@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    
    @GET 
    fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    
    @PUT 
    fun updateAddress(@Url url1: String?    ,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    
    @DELETE 
    fun removeAddress(@Url url1: String?    )
    : Deferred<Response<DeleteAddressResponse>>
    
    
    @POST 
    fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @PUT 
    fun selectPaymentMode(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun validateCouponForPayment(@Url url1: String?    ,        @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    
    @GET 
    fun getShipments(@Url url1: String?    ,      @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @POST 
    fun checkoutCart(@Url url1: String?    ,  @Query("buy_now") buyNow: Boolean?, @Body body: CartCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    
    @PUT 
    fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    
    @POST 
    fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    
    @GET 
    fun getCartSharedItems(@Url url1: String?    )
    : Deferred<Response<SharedCartResponse>>
    
    
    @POST 
    fun updateCartWithSharedItems(@Url url1: String?     )
    : Deferred<Response<SharedCartResponse>>
    
    
    @GET 
    fun getPromotionOffers(@Url url1: String?    ,    @Query("slug") slug: String?, @Query("page_size") pageSize: Int?, @Query("promotion_group") promotionGroup: String?)
    : Deferred<Response<PromotionOffersResponse>>
    
    
    @GET 
    fun getLadderOffers(@Url url1: String?    ,     @Query("slug") slug: String, @Query("store_id") storeId: String?, @Query("promotion_id") promotionId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LadderPriceOffers>>
    
}

interface CommonApiList {
    
    
    @GET 
    fun searchApplication(@Url url1: String?    ,  @Header("authorization") authorization: String?,  @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    
    @GET 
    fun getLocations(@Url url1: String?    ,   @Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}

interface LeadApiList {
    
    
    @GET 
    fun getTicket(@Url url1: String?    )
    : Deferred<Response<Ticket>>
    
    
    @POST 
    fun createHistory(@Url url1: String?    ,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    
    @POST 
    fun createTicket(@Url url1: String?   ,@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    
    @GET 
    fun getCustomForm(@Url url1: String?    )
    : Deferred<Response<CustomForm>>
    
    
    @POST 
    fun submitCustomForm(@Url url1: String?    ,@Body body: CustomFormSubmissionPayload)
    : Deferred<Response<SubmitCustomFormResponse>>
    
    
    @GET 
    fun getParticipantsInsideVideoRoom(@Url url1: String?    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    
    @GET 
    fun getTokenForVideoRoom(@Url url1: String?    )
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface ThemeApiList {
    
    
    @GET 
    fun getAllPages(@Url url1: String?    )
    : Deferred<Response<AllAvailablePageSchema>>
    
    
    @GET 
    fun getPage(@Url url1: String?     )
    : Deferred<Response<AvailablePageSchema>>
    
    
    @GET 
    fun getAppliedTheme(@Url url1: String?   )
    : Deferred<Response<ThemesSchema>>
    
    
    @GET 
    fun getThemeForPreview(@Url url1: String?    )
    : Deferred<Response<ThemesSchema>>
    
}

interface UserApiList {
    
    
    @POST 
    fun loginWithFacebook(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogle(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogleAndroid(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithGoogleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithAppleIOS(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: OAuthRequestAppleSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST 
    fun loginWithOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendOtpRequestSchema)
    : Deferred<Response<SendOtpResponse>>
    
    
    @POST 
    fun loginWithEmailAndPassword(@Url url1: String?   ,@Body body: PasswordLoginRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendResetPasswordEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordEmailRequestSchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun sendResetPasswordMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendResetPasswordMobileRequestSchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun forgotPassword(@Url url1: String?   ,@Body body: ForgotPasswordRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendResetToken(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST 
    fun loginWithToken(@Url url1: String?   ,@Body body: TokenRequestBodySchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun registerWithForm(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: FormRegisterRequestSchema)
    : Deferred<Response<RegisterFormSuccess>>
    
    
    @POST 
    fun verifyEmail(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @POST 
    fun verifyMobile(@Url url1: String?   ,@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @GET 
    fun hasPassword(@Url url1: String?   )
    : Deferred<Response<HasPasswordSuccess>>
    
    
    @POST 
    fun updatePassword(@Url url1: String?   ,@Body body: UpdatePasswordRequestSchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @POST 
    fun deleteUser(@Url url1: String?   ,@Body body: DeleteApplicationUserRequestSchema)
    : Deferred<Response<DeleteUserSuccess>>
    
    
    @GET 
    fun logout(@Url url1: String?   )
    : Deferred<Response<LogoutSuccess>>
    
    
    @POST 
    fun sendOTPOnMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendMobileOtpRequestSchema)
    : Deferred<Response<OtpSuccess>>
    
    
    @POST 
    fun verifyMobileOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @POST 
    fun sendOTPOnEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendEmailOtpRequestSchema)
    : Deferred<Response<EmailOtpSuccess>>
    
    
    @POST 
    fun verifyEmailOTP(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: VerifyEmailOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @GET 
    fun getLoggedInUser(@Url url1: String?   )
    : Deferred<Response<UserObjectSchema>>
    
    
    @GET 
    fun getListOfActiveSessions(@Url url1: String?   )
    : Deferred<Response<SessionListSuccess>>
    
    
    @GET 
    fun getPlatformConfig(@Url url1: String?    ,  @Query("name") name: String?)
    : Deferred<Response<PlatformSchema>>
    
    
    @POST 
    fun updateProfile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditProfileRequestSchema)
    : Deferred<Response<ProfileEditSuccess>>
    
    
    @PUT 
    fun addMobileNumber(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditMobileRequestSchema)
    : Deferred<Response<VerifyMobileOTPSuccess>>
    
    
    @DELETE 
    fun deleteMobileNumber(@Url url1: String?    ,       @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun setMobileNumberAsPrimary(@Url url1: String?   ,@Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendVerificationLinkToMobile(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    
    @PUT 
    fun addEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<VerifyEmailOTPSuccess>>
    
    
    @DELETE 
    fun deleteEmail(@Url url1: String?    ,      @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun setEmailAsPrimary(@Url url1: String?   ,@Body body: EditEmailRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST 
    fun sendVerificationLinkToEmail(@Url url1: String?    ,  @Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<SendEmailVerifyLinkSuccess>>
    
}

interface ContentApiList {
    
    
    @GET 
    fun getAnnouncements(@Url url1: String?   )
    : Deferred<Response<AnnouncementsResponseSchema>>
    
    
    @GET 
    fun getBlog(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Deferred<Response<BlogSchema>>
    
    
    @GET 
    fun getBlogs(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BlogGetResponse>>
    
    
    @GET 
    fun getDataLoaders(@Url url1: String?   )
    : Deferred<Response<DataLoadersSchema>>
    
    
    @GET 
    fun getFaqs(@Url url1: String?   )
    : Deferred<Response<FaqResponseSchema>>
    
    
    @GET 
    fun getFaqCategories(@Url url1: String?   )
    : Deferred<Response<GetFaqCategoriesSchema>>
    
    
    @GET 
    fun getFaqBySlug(@Url url1: String?    )
    : Deferred<Response<FaqSchema>>
    
    
    @GET 
    fun getFaqCategoryBySlug(@Url url1: String?    )
    : Deferred<Response<GetFaqCategoryBySlugSchema>>
    
    
    @GET 
    fun getFaqsByCategorySlug(@Url url1: String?    )
    : Deferred<Response<GetFaqSchema>>
    
    
    @GET 
    fun getLandingPage(@Url url1: String?   )
    : Deferred<Response<LandingPageSchema>>
    
    
    @GET 
    fun getLegalInformation(@Url url1: String?   )
    : Deferred<Response<ApplicationLegal>>
    
    
    @GET 
    fun getNavigations(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<NavigationGetResponse>>
    
    
    @GET 
    fun getSEOConfiguration(@Url url1: String?   )
    : Deferred<Response<SeoComponent>>
    
    
    @GET 
    fun getSlideshows(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SlideshowGetResponse>>
    
    
    @GET 
    fun getSlideshow(@Url url1: String?    )
    : Deferred<Response<SlideshowSchema>>
    
    
    @GET 
    fun getSupportInformation(@Url url1: String?   )
    : Deferred<Response<Support>>
    
    
    @GET 
    fun getTags(@Url url1: String?   )
    : Deferred<Response<TagsSchema>>
    
    
    @GET 
    fun getPage(@Url url1: String?     ,  @Query("root_id") rootId: String?)
    : Deferred<Response<PageSchema>>
    
    
    @GET 
    fun getPages(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PageGetResponse>>
    
}

interface CommunicationApiList {
    
    
    @GET 
    fun getCommunicationConsent(@Url url1: String?   )
    : Deferred<Response<CommunicationConsent>>
    
    
    @POST 
    fun upsertCommunicationConsent(@Url url1: String?   ,@Body body: CommunicationConsentReq)
    : Deferred<Response<CommunicationConsentRes>>
    
    
    @POST 
    fun upsertAppPushtoken(@Url url1: String?   ,@Body body: PushtokenReq)
    : Deferred<Response<PushtokenRes>>
    
}

interface ShareApiList {
    
    
    @POST 
    fun getApplicationQRCode(@Url url1: String?   )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getProductQRCodeBySlug(@Url url1: String?    )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getCollectionQRCodeBySlug(@Url url1: String?    )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getUrlQRCode(@Url url1: String?    ,  @Query("url") url: String)
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun createShortLink(@Url url1: String?   ,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET 
    fun getShortLinkByHash(@Url url1: String?    )
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET 
    fun getOriginalShortLinkByHash(@Url url1: String?    )
    : Deferred<Response<ShortLinkRes>>
    
}

interface FileStorageApiList {
    
    
    @POST 
    fun startUpload(@Url url1: String?    ,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    
    @POST 
    fun completeUpload(@Url url1: String?    ,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
    
    @POST 
    fun signUrls(@Url url1: String?   ,@Body body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>
    
}

interface ConfigurationApiList {
    
    
    @GET 
    fun getApplication(@Url url1: String?   )
    : Deferred<Response<Application>>
    
    
    @GET 
    fun getOwnerInfo(@Url url1: String?   )
    : Deferred<Response<ApplicationAboutResponse>>
    
    
    @GET 
    fun getBasicDetails(@Url url1: String?   )
    : Deferred<Response<ApplicationDetail>>
    
    
    @GET 
    fun getIntegrationTokens(@Url url1: String?   )
    : Deferred<Response<AppTokenResponse>>
    
    
    @GET 
    fun getOrderingStores(@Url url1: String?    ,    @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStores>>
    
    
    @GET 
    fun getStoreDetailById(@Url url1: String?    )
    : Deferred<Response<OrderingStore>>
    
    
    @GET 
    fun getFeatures(@Url url1: String?   )
    : Deferred<Response<AppFeatureResponse>>
    
    
    @GET 
    fun getContactInfo(@Url url1: String?   )
    : Deferred<Response<ApplicationInformation>>
    
    
    @GET 
    fun getCurrencies(@Url url1: String?   )
    : Deferred<Response<CurrenciesResponse>>
    
    
    @GET 
    fun getCurrencyById(@Url url1: String?    )
    : Deferred<Response<Currency>>
    
    
    @GET 
    fun getAppCurrencies(@Url url1: String?   )
    : Deferred<Response<AppCurrencyResponse>>
    
    
    @GET 
    fun getLanguages(@Url url1: String?   )
    : Deferred<Response<LanguageResponse>>
    
    
    @POST 
    fun getOrderingStoreCookie(@Url url1: String?   ,@Body body: OrderingStoreSelectRequest)
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @DELETE 
    fun removeOrderingStoreCookie(@Url url1: String?   )
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @GET 
    fun getAppStaffList(@Url url1: String?    ,      @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?)
    : Deferred<Response<AppStaffListResponse>>
    
    
    @GET 
    fun getAppStaffs(@Url url1: String?    ,    @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?)
    : Deferred<Response<AppStaffResponse>>
    
}

interface PaymentApiList {
    
    
    @GET 
    fun getAggregatorsConfig(@Url url1: String?    ,  @Header("x-api-token") xApiToken: String?,  @Query("refresh") refresh: Boolean?)
    : Deferred<Response<AggregatorsConfigDetailResponse>>
    
    
    @POST 
    fun attachCardToCustomer(@Url url1: String?   ,@Body body: AttachCardRequest)
    : Deferred<Response<AttachCardsResponse>>
    
    
    @GET 
    fun getActiveCardAggregator(@Url url1: String?    ,  @Query("refresh") refresh: Boolean?)
    : Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    
    @GET 
    fun getActiveUserCards(@Url url1: String?    ,  @Query("force_refresh") forceRefresh: Boolean?)
    : Deferred<Response<ListCardsResponse>>
    
    
    @POST 
    fun deleteUserCard(@Url url1: String?   ,@Body body: DeletehCardRequest)
    : Deferred<Response<DeleteCardsResponse>>
    
    
    @POST 
    fun verifyCustomerForPayment(@Url url1: String?   ,@Body body: ValidateCustomerRequest)
    : Deferred<Response<ValidateCustomerResponse>>
    
    
    @POST 
    fun verifyAndChargePayment(@Url url1: String?   ,@Body body: ChargeCustomerRequest)
    : Deferred<Response<ChargeCustomerResponse>>
    
    
    @POST 
    fun initialisePayment(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    
    @POST 
    fun checkAndUpdatePaymentStatus(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    
    @GET 
    fun getPaymentModeRoutes(@Url url1: String?    ,        @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun getPosPaymentModeRoutes(@Url url1: String?    ,         @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun getRupifiBannerDetails(@Url url1: String?   )
    : Deferred<Response<RupifiBannerResponse>>
    
    
    @GET 
    fun getEpaylaterBannerDetails(@Url url1: String?   )
    : Deferred<Response<EpaylaterBannerResponse>>
    
    
    @POST 
    fun resendOrCancelPayment(@Url url1: String?   ,@Body body: ResendOrCancelPaymentRequest)
    : Deferred<Response<ResendOrCancelPaymentResponse>>
    
    
    @GET 
    fun getActiveRefundTransferModes(@Url url1: String?   )
    : Deferred<Response<TransferModeResponse>>
    
    
    @PUT 
    fun enableOrDisableRefundTransferMode(@Url url1: String?   ,@Body body: UpdateRefundTransferModeRequest)
    : Deferred<Response<UpdateRefundTransferModeResponse>>
    
    
    @GET 
    fun getUserBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @GET 
    fun verifyIfscCode(@Url url1: String?    ,  @Query("ifsc_code") ifscCode: String?)
    : Deferred<Response<IfscCodeResponse>>
    
    
    @GET 
    fun getOrderBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @POST 
    fun verifyOtpAndAddBeneficiaryForBank(@Url url1: String?   ,@Body body: AddBeneficiaryViaOtpVerificationRequest)
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    
    @POST 
    fun addBeneficiaryDetails(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST 
    fun addRefundBankAccountUsingOTP(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST 
    fun verifyOtpAndAddBeneficiaryForWallet(@Url url1: String?   ,@Body body: WalletOtpRequest)
    : Deferred<Response<WalletOtpResponse>>
    
    
    @POST 
    fun updateDefaultBeneficiary(@Url url1: String?   ,@Body body: SetDefaultBeneficiaryRequest)
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    
    
    @GET 
    fun getPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<GetPaymentLinkResponse>>
    
    
    @POST 
    fun createPaymentLink(@Url url1: String?   ,@Body body: CreatePaymentLinkRequest)
    : Deferred<Response<CreatePaymentLinkResponse>>
    
    
    @POST 
    fun resendPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<ResendPaymentLinkResponse>>
    
    
    @POST 
    fun cancelPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<CancelPaymentLinkResponse>>
    
    
    @GET 
    fun getPaymentModeRoutesPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun pollingPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<PollingPaymentLinkResponse>>
    
    
    @POST 
    fun createOrderHandlerPaymentLink(@Url url1: String?   ,@Body body: CreateOrderUserRequest)
    : Deferred<Response<CreateOrderUserResponse>>
    
    
    @POST 
    fun initialisePaymentPaymentLink(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    
    @POST 
    fun checkAndUpdatePaymentStatusPaymentLink(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    
    @GET 
    fun customerCreditSummary(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Deferred<Response<CustomerCreditSummaryResponse>>
    
    
    @GET 
    fun redirectToAggregator(@Url url1: String?    ,   @Query("source") source: String?, @Query("aggregator") aggregator: String?)
    : Deferred<Response<RedirectToAggregatorResponse>>
    
    
    @GET 
    fun checkCredit(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Deferred<Response<CheckCreditResponse>>
    
    
    @POST 
    fun customerOnboard(@Url url1: String?   ,@Body body: CustomerOnboardingRequest)
    : Deferred<Response<CustomerOnboardingResponse>>
    
}

interface OrderApiList {
    
    
    @GET 
    fun getOrders(@Url url1: String?    ,       @Query("status") status: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("custom_meta") customMeta: String?)
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getOrderById(@Url url1: String?    )
    : Deferred<Response<OrderById>>
    
    
    @GET 
    fun getPosOrderById(@Url url1: String?    )
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getShipmentById(@Url url1: String?    )
    : Deferred<Response<ShipmentById>>
    
    
    @GET 
    fun getInvoiceByShipmentId(@Url url1: String?    )
    : Deferred<Response<ResponseGetInvoiceShipment>>
    
    
    @GET 
    fun trackShipment(@Url url1: String?    )
    : Deferred<Response<ShipmentTrack>>
    
    
    @GET 
    fun getCustomerDetailsByShipmentId(@Url url1: String?     )
    : Deferred<Response<CustomerDetailsResponse>>
    
    
    @POST 
    fun sendOtpToShipmentCustomer(@Url url1: String?     )
    : Deferred<Response<SendOtpToCustomerResponse>>
    
    
    @POST 
    fun verifyOtpShipmentCustomer(@Url url1: String?     ,@Body body: VerifyOtp)
    : Deferred<Response<VerifyOtpResponse>>
    
    
    @GET 
    fun getShipmentBagReasons(@Url url1: String?     )
    : Deferred<Response<ShipmentBagReasons>>
    
    
    @GET 
    fun getShipmentReasons(@Url url1: String?    )
    : Deferred<Response<ShipmentReasons>>
    
    
    @PUT 
    fun updateShipmentStatus(@Url url1: String?    ,@Body body: UpdateShipmentStatusRequest)
    : Deferred<Response<ShipmentApplicationStatusResponse>>
    
}

interface RewardsApiList {
    
    
    @GET 
    fun getOfferByName(@Url url1: String?    )
    : Deferred<Response<Offer>>
    
    
    @POST 
    fun catalogueOrder(@Url url1: String?   ,@Body body: CatalogueOrderRequest)
    : Deferred<Response<CatalogueOrderResponse>>
    
    
    @GET 
    fun getPointsHistory(@Url url1: String?    ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PointsHistoryResponse>>
    
    
    @GET 
    fun getPoints(@Url url1: String?   )
    : Deferred<Response<PointsResponse>>
    
    
    @GET 
    fun referral(@Url url1: String?   )
    : Deferred<Response<ReferralDetailsResponse>>
    
    
    @POST 
    fun orderDiscount(@Url url1: String?   ,@Body body: OrderDiscountRequest)
    : Deferred<Response<OrderDiscountResponse>>
    
    
    @POST 
    fun redeemReferralCode(@Url url1: String?   ,@Body body: RedeemReferralCodeRequest)
    : Deferred<Response<RedeemReferralCodeResponse>>
    
}

interface PosCartApiList {
    
    
    @GET 
    fun getCart(@Url url1: String?    ,       @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @HEAD 
    fun getCartLastModified(@Url url1: String?    ,  @Query("id") id: String?)
    : Deferred<Response<Void>>
    
    
    @POST 
    fun addItems(@Url url1: String?    ,     @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    
    @PUT 
    fun updateCart(@Url url1: String?    ,      @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("area_code") areaCode: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    
    @GET 
    fun getItemCount(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartItemCountResponse>>
    
    
    @GET 
    fun getCoupons(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<GetCouponResponse>>
    
    
    @POST 
    fun applyCoupon(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @DELETE 
    fun removeCoupon(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getBulkDiscountOffers(@Url url1: String?    ,     @Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    
    @POST 
    fun applyRewardPoints(@Url url1: String?    ,     @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("buy_now") buyNow: Boolean?, @Body body: RewardPointRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun getAddresses(@Url url1: String?    ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    
    @POST 
    fun addAddress(@Url url1: String?   ,@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    
    @GET 
    fun getAddressById(@Url url1: String?     ,       @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    
    @PUT 
    fun updateAddress(@Url url1: String?    ,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    
    @DELETE 
    fun removeAddress(@Url url1: String?    )
    : Deferred<Response<DeleteAddressResponse>>
    
    
    @POST 
    fun selectAddress(@Url url1: String?    ,     @Query("cart_id") cartId: String?, @Query("buy_now") buyNow: Boolean?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @PUT 
    fun selectPaymentMode(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET 
    fun validateCouponForPayment(@Url url1: String?    ,        @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    
    @GET 
    fun getShipments(@Url url1: String?    ,        @Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @PUT 
    fun updateShipments(@Url url1: String?    ,      @Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @POST 
    fun checkoutCart(@Url url1: String?    ,  @Query("id") id: String?, @Body body: CartPosCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    
    @PUT 
    fun updateCartMeta(@Url url1: String?    ,   @Query("id") id: String?, @Query("buy_now") buyNow: Boolean?, @Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    
    @GET 
    fun getAvailableDeliveryModes(@Url url1: String?    ,   @Query("area_code") areaCode: String, @Query("id") id: String?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    
    @GET 
    fun getStoreAddressByUid(@Url url1: String?    ,  @Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    
    @POST 
    fun getCartShareLink(@Url url1: String?   ,@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    
    @GET 
    fun getCartSharedItems(@Url url1: String?    )
    : Deferred<Response<SharedCartResponse>>
    
    
    @POST 
    fun updateCartWithSharedItems(@Url url1: String?     )
    : Deferred<Response<SharedCartResponse>>
    
}

interface LogisticApiList {
    
    
    @GET 
    fun getPincodeCity(@Url url1: String?    )
    : Deferred<Response<PincodeApiResponse>>
    
    
    @POST 
    fun getTatProduct(@Url url1: String?   ,@Body body: TATViewRequest)
    : Deferred<Response<TATViewResponse>>
    
    
    @POST 
    fun getPincodeZones(@Url url1: String?   ,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    
    @POST 
    fun assignLocations(@Url url1: String?   ,@Body body: AssignStoreRequest)
    : Deferred<Response<AssignStoreResponse>>
    
}

