package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*


interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(
        @Path("slug") slug: String, @Query("store_id") store_id: String?
        
    )
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/price/")
    fun getProductPriceBySlug(
        @Path("slug") slug: String, @Path("size") size: String, @Query("pincode") pincode: Int?, @Query("store_id") store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/sellers/")
    fun getProductSellersBySlug(
        @Path("slug") slug: String, @Path("size") size: String, @Query("pincode") pincode: Int?, @Query("page_no") page_no: Int?, @Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(
        @Query("slug") slug: String
        
    )
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(
        @Path("slug") slug: String, @Path("similar_type") similar_type: String
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds(
        @Query("item_id") item_id: String?, @Query("alu") alu: String?, @Query("sku_code") sku_code: String?, @Query("ean") ean: String?, @Query("upc") upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(
        @Query("timestamp") timestamp: String, @Query("page_size") page_size: Int?, @Query("page_id") page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>>
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts(
        @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sort_on: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: Int?, @Query("page_no") page_no: Int?, @Query("page_type") page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands(
        @Query("department") department: String?, @Query("page_no") page_no: Int?, @Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(
        @Query("department") department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<CategoryMetaResponse>>
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts(
        @Query("sort_on") sort_on: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments(
        
        
    )
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(
        @Query("q") q: String
        
    )
    : Deferred<Response<AutoCompleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections(
        @Query("page_id") page_id: String?, @Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(
        @Path("slug") slug: String, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sort_on: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: Int?
        
    )
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(
        @Path("collection_type") collection_type: String
        
    )
    : Deferred<Response<GetFollowListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(
        @Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(
        @Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(
        @Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String
        
    )
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(
        @Query("collection_type") collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>>
    
    @GET ("/service/application/catalog/v1.0/locations/")
    fun getStores(
        @Query("page_no") page_no: Int?, @Query("page_size") page_size: Int?, @Query("q") q: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>>
    
}

interface CartApiList {
    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart(
        @Query("uid") uid: Int?, @Query("assign_card_id") assign_card_id: Int?
        
    )
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems(
        
        @Body body: AddCartRequest
    )
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart(
        
        @Body body: UpdateCartRequest
    )
    : Deferred<Response<UpdateCartResponse>>
    
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
        @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?,
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
        @Query("item_id") item_id: Int?, @Query("article_id") article_id: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses(
        @Query("uid") uid: Int?, @Query("mobile_no") mobile_no: Int?, @Query("checkout_mode") checkout_mode: String?, @Query("tags") tags: Int?, @Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress(
        
        @Body body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    fun getAddressById(
        @Path("id") id: Int, @Query("uid") uid: Int?, @Query("mobile_no") mobile_no: Int?, @Query("checkout_mode") checkout_mode: String?, @Query("tags") tags: Int?, @Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    fun updateAddress(
        @Path("id") id: Int,
        @Body body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    fun removeAddress(
        @Path("id") id: Int
        
    )
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress(
        
        @Body body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/payment")
    fun getPaymentModes(
        @Query("uid") uid: String?, @Query("address_id") address_id: String?, @Query("payment_mode") payment_mode: String?, @Query("payment_identifier") payment_identifier: String?, @Query("aggregator_name") aggregator_name: String?, @Query("merchant_code") merchant_code: String?
        
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
        @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") address_id: Int?
        
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
    fun getCartSharedItems(
        @Path("token") token: String
        
    )
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(
        @Path("token") token: String, @Path("action") action: String
        
    )
    : Deferred<Response<SharedCartResponse>>
    
}

interface LeadApiList {
    
    @GET ("service/application/lead/v1.0/ticket/{id}")
    fun getTicket(
        @Path("id") id: String
        
    )
    : Deferred<Response<Ticket>>
    
    @POST ("service/application/lead/v1.0/ticket/{ticket_id}/history")
    fun createHistoryForTicket(
        @Path("ticket_id") ticket_id: String,
        @Body body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>>
    
    @POST ("service/application/lead/v1.0/ticket/")
    fun createTicket(
        
        @Body body: AddTicketPayload
    )
    : Deferred<Response<Ticket>>
    
    @GET ("service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<CustomForm>>
    
    @POST ("service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(
        @Path("slug") slug: String,
        @Body body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>>
    
    @GET ("service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(
        @Path("unique_name") unique_name: String
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(
        @Path("unique_name") unique_name: String
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface ThemeApiList {
    
    @GET ("/service/application/theme/v1.0/applied-theme")
    fun getAppliedTheme(
        
        
    )
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/application/theme/v1.0/{theme_id}/preview")
    fun getThemeForPreview(
        @Path("theme_id") theme_id: String
        
    )
    : Deferred<Response<ThemesSchema>>
    
}

interface UserApiList {
    
    @POST ("/service/application/user/authentication/v1.0/login/facebook-token")
    fun loginWithFacebook(
        
        @Body body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-token")
    fun loginWithGoogle(
        
        @Body body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-android")
    fun loginWithGoogleAndroid(
        
        @Body body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-ios")
    fun loginWithGoogleIOS(
        
        @Body body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/otp")
    fun loginWithOTP(
        @Query("platform") platform: String?,
        @Body body: SendOtpRequestSchema
    )
    : Deferred<Response<SendOtpResponse>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password")
    fun loginWithEmailAndPassword(
        
        @Body body: PasswordLoginRequestSchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset")
    fun sendResetPasswordEmail(
        @Query("platform") platform: String?,
        @Body body: SendResetPasswordEmailRequestSchema
    )
    : Deferred<Response<ResetPasswordSuccess>>
    
    @POST ("/service/application/userauthentication/v1.0/login/password/reset/forgot")
    fun forgotPassword(
        
        @Body body: ForgotPasswordRequestSchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/token")
    fun sendResetToken(
        
        @Body body: CodeRequestBodySchema
    )
    : Deferred<Response<ResetPasswordSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/token")
    fun loginWithToken(
        
        @Body body: TokenRequestBodySchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/register/form")
    fun registerWithForm(
        @Query("platform") platform: String?,
        @Body body: FormRegisterRequestSchema
    )
    : Deferred<Response<RegisterFormSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/verify/email")
    fun verifyEmail(
        
        @Body body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/verify/mobile")
    fun verifyMobile(
        
        @Body body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>>
    
    @GET ("/service/application/user/authentication/v1.0/has-password")
    fun hasPassword(
        
        
    )
    : Deferred<Response<HasPasswordSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/password")
    fun updatePassword(
        
        @Body body: UpdatePasswordRequestSchema
    )
    : Deferred<Response<VerifyEmailSuccess>>
    
    @GET ("/service/application/user/authentication/v1.0/logout")
    fun logout(
        
        
    )
    : Deferred<Response<LogoutSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/send")
    fun sendOTPOnMobile(
        @Query("platform") platform: String?,
        @Body body: SendMobileOtpRequestSchema
    )
    : Deferred<Response<OtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/verify")
    fun verifyMobileOTP(
        @Query("platform") platform: String?,
        @Body body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/send")
    fun sendOTPOnEmail(
        @Query("platform") platform: String?,
        @Body body: SendEmailOtpRequestSchema
    )
    : Deferred<Response<EmailOtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/verify")
    fun verifyEmailOTP(
        @Query("platform") platform: String?,
        @Body body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>>
    
    @GET ("/service/application/user/authentication/v1.0/session")
    fun getLoggedInUser(
        
        
    )
    : Deferred<Response<UserSchema>>
    
    @GET ("/service/application/user/authentication/v1.0/sessions")
    fun getListOfActiveSessions(
        
        
    )
    : Deferred<Response<SessionListSuccess>>
    
    @GET ("/service/application/user/platform/v1.0/config")
    fun getPlatformConfig(
        @Query("name") name: String?
        
    )
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/application/user/profile/v1.0/detail")
    fun updateProfile(
        @Query("platform") platform: String?,
        @Body body: EditProfileRequestSchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @PUT ("/service/application/user/profile/v1.0/mobile")
    fun addMobileNumber(
        @Query("platform") platform: String?,
        @Body body: EditMobileRequestSchema
    )
    : Deferred<Response<VerifyMobileOTPSuccess>>
    
    @DELETE ("/service/application/user/profile/v1.0/mobile")
    fun deleteMobileNumber(
        @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") country_code: String, @Query("phone") phone: String
        
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/primary")
    fun setMobileNumberAsPrimary(
        
        @Body body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/link/send")
    fun sendVerificationLinkToMobile(
        @Query("platform") platform: String?,
        @Body body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    @PUT ("/service/application/user/profile/v1.0/email")
    fun addEmail(
        @Query("platform") platform: String?,
        @Body body: EditEmailRequestSchema
    )
    : Deferred<Response<VerifyEmailOTPSuccess>>
    
    @DELETE ("/service/application/user/profile/v1.0/email")
    fun deleteEmail(
        @Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String
        
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/email/primary")
    fun setEmailAsPrimary(
        
        @Body body: EditEmailRequestSchema
    )
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/email/link/send")
    fun sendVerificationLinkToEmail(
        @Query("platform") platform: String?,
        @Body body: EditEmailRequestSchema
    )
    : Deferred<Response<SendEmailVerifyLinkSuccess>>
    
}

interface ContentApiList {
    
    @GET ("/service/application/content/v1.0/announcements")
    fun getAnnouncements(
        
        
    )
    : Deferred<Response<AnnouncementsResponseSchema>>
    
    @GET ("/service/application/content/v1.0/blogs/{slug}")
    fun getBlog(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<CustomBlog>>
    
    @GET ("/service/application/content/v1.0/faqs")
    fun getFaqs(
        
        
    )
    : Deferred<Response<FaqResponseSchema>>
    
    @GET ("/service/application/content/v1.0/landing-page")
    fun getLandingPage(
        @Header("x-device-platform") x-device-platform: String
        
    )
    : Deferred<Response<LandingPage>>
    
    @GET ("/service/application/content/v1.0/legal")
    fun getLegalInformation(
        
        
    )
    : Deferred<Response<ApplicationLegal>>
    
    @GET ("/service/application/content/v1.0/navigations/")
    fun getNavigations(
        @Header("x-device-platform") x-device-platform: String
        
    )
    : Deferred<Response<Navigation>>
    
    @GET ("/service/application/content/v1.0/pages/{slug}")
    fun getPage(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<CustomPage>>
    
    @GET ("/service/application/content/v1.0/seo")
    fun getSeoConfiguration(
        
        
    )
    : Deferred<Response<Seo>>
    
    @GET ("/service/application/content/v1.0/slideshow/{slug}")
    fun getSlideshow(
        @Path("slug") slug: String, @Header("x-device-platform") x-device-platform: String
        
    )
    : Deferred<Response<Slideshow>>
    
    @GET ("/service/application/content/v1.0/support")
    fun getSupportInformation(
        
        
    )
    : Deferred<Response<Support>>
    
    @GET ("/service/application/content/v1.0/tags")
    fun getTags(
        
        
    )
    : Deferred<Response<TagsSchema>>
    
}

interface CommunicationApiList {
    
    @GET ("/service/application/communication/v1.0/consent")
    fun getCommunicationConsent(
        
        
    )
    : Deferred<Response<CommunicationConsent>>
    
    @POST ("/service/application/communication/v1.0/consent")
    fun upsertCommunicationConsent(
        
        @Body body: CommunicationConsentReq
    )
    : Deferred<Response<CommunicationConsentRes>>
    
    @POST ("/service/platform/communication/v1.0/pn-token")
    fun upsertPushtoken(
        
        @Body body: PushtokenReq
    )
    : Deferred<Response<PushtokenRes>>
    
}

interface ShareApiList {
    
    @POST ("/service/application/share/v1.0/qr/")
    fun getApplicationQRCode(
        
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/products/{slug}/")
    fun getProductQRCodeBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/collection/{slug}/")
    fun getCollectionQRCodeBySlug(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/url/")
    fun getUrlQRCode(
        @Query("url") url: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/links/short-link/")
    fun createShortLink(
        
        @Body body: ShortLinkReq
    )
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/")
    fun getShortLinkByHash(
        @Path("hash") hash: String
        
    )
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/original/")
    fun getOriginalShortLinkByHash(
        @Path("hash") hash: String
        
    )
    : Deferred<Response<ShortLinkRes>>
    
}

interface FileStorageApiList {
    
    @POST ("/service/application/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    fun completeUpload(
        @Path("namespace") namespace: String, @Path("company_id") company_id: Int,
        @Body body: StartResponse
    )
    : Deferred<Response<CompleteResponse>>
    
    @POST ("/service/application/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    fun startUpload(
        @Path("namespace") namespace: String, @Path("company_id") company_id: Int,
        @Body body: StartRequest
    )
    : Deferred<Response<StartResponse>>
    
}

interface PaymentApiList {
    
    @GET ("/service/application/payment/v1.0/config/aggregators/key")
    fun getAggregatorsConfig(
        @Header("x-api-token") x-api-token: String, @Query("refresh") refresh: Boolean?
        
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
    
    @GET ("/service/application/payment/v1.0/payment/options")
    fun getPaymentModeRoutes(
        @Query("amount") amount: Int, @Query("cart_id") cart_id: String, @Query("pincode") pincode: Int, @Query("checkout_mode") checkout_mode: String, @Query("refresh") refresh: Boolean?, @Query("assign_card_id") assign_card_id: String?, @Query("delivery_address") delivery_address: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>>
    
    @GET ("/service/application/payment/v1.0/payment/options/pos")
    fun getPosPaymentModeRoutes(
        @Query("amount") amount: Int, @Query("cart_id") cart_id: String, @Query("pincode") pincode: Int, @Query("checkout_mode") checkout_mode: String, @Query("refresh") refresh: Boolean?, @Query("assign_card_id") assign_card_id: String?, @Query("order_type") order_type: String, @Query("delivery_address") delivery_address: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiary/user")
    fun getUserBeneficiariesDetail(
        @Query("order_id") order_id: String
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @GET ("/service/application/payment/v1.0/ifsc-code/verify")
    fun verifyIfscCode(
        @Query("ifsc_code") ifsc_code: String?
        
    )
    : Deferred<Response<IfscCodeResponse>>
    
    @GET ("/service/application/payment/v1.0/refund/beneficiaries/order")
    fun getOrderBeneficiariesDetail(
        @Query("order_id") order_id: String
        
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
    : Deferred<Response<RefundAccountResponse>>
    
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

interface OrderApiList {
    
    @GET ("/services/application/v1.0/orders")
    fun getOrders(
        @Query("page_no") page_no: String?, @Query("page_size") page_size: String?, @Query("from_date") from_date: String?, @Query("to_date") to_date: String?
        
    )
    : Deferred<Response<OrderList>>
    
    @GET ("/services/application/v1.0/orders/{order_id}")
    fun getOrderById(
        @Path("order_id") order_id: String
        
    )
    : Deferred<Response<OrderById>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}")
    fun getShipmentById(
        @Path("shipment_id") shipment_id: String
        
    )
    : Deferred<Response<ShipmentById>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}/reasons")
    fun getShipmentReasons(
        @Path("shipment_id") shipment_id: String
        
    )
    : Deferred<Response<ShipmentReasons>>
    
    @PUT ("/services/application/v1.0/orders/shipments/{shipment_id}/status")
    fun updateShipmentStatus(
        @Path("shipment_id") shipment_id: String,
        @Body body: ShipmentStatusUpdateBody
    )
    : Deferred<Response<ShipmentStatusUpdate>>
    
    @GET ("/services/application/v1.0/orders/shipments/{shipment_id}/track")
    fun trackShipment(
        @Path("shipment_id") shipment_id: String
        
    )
    : Deferred<Response<ShipmentTrack>>
    
}

interface RewardsApiList {
    
    @POST ("/service/application/rewards/v1.0/catalogue/offer/order/")
    fun getPointsOnProduct(
        
        @Body body: CatalogueOrderRequest
    )
    : Deferred<Response<CatalogueOrderResponse>>
    
    @POST ("/service/application/rewards/v1.0/user/offers/order-discount/")
    fun getOrderDiscount(
        
        @Body body: OrderDiscountRequest
    )
    : Deferred<Response<OrderDiscountResponse>>
    
    @GET ("/service/application/rewards/v1.0/user/points")
    fun getUserPoints(
        
        
    )
    : Deferred<Response<PointsResponse>>
    
    @GET ("/service/application/rewards/v1.0/user/points/history/")
    fun getUserPointsHistory(
        @Query("pageID") pageID: String?, @Query("pageSize") pageSize: Int?
        
    )
    : Deferred<Response<PointsHistoryResponse>>
    
    @GET ("/service/application/rewards/v1.0/user/referral/")
    fun getUserReferralDetails(
        
        
    )
    : Deferred<Response<ReferralDetailsResponse>>
    
    @POST ("/service/application/rewards/v1.0/user/referral/redeem/")
    fun redeemReferralCode(
        
        @Body body: RedeemReferralCodeRequest
    )
    : Deferred<Response<RedeemReferralCodeResponse>>
    
}

interface FeedbackApiList {
    
    @POST ("/service/application/feedback/v1.0/abuse")
    fun createAbuseReport(
        
        @Body body: ReportAbuseRequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/abuse")
    fun updateAbuseReport(
        
        @Body body: UpdateAbuseStatusRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}")
    fun getAbuseReports(
        @Path("entity_id") entity_id: String, @Path("entity_type") entity_type: String, @Query("id") id: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XNumberGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes")
    fun getAttributes(
        
        
    )
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/attributes")
    fun createAttribute(
        
        @Body body: SaveAttributeRequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes/{slug}")
    fun getAttribute(
        @Path("slug") slug: String
        
    )
    : Deferred<Response<Attribute>>
    
    @PUT ("/service/application/feedback/v1.0/attributes/{slug}")
    fun updateAttribute(
        @Path("slug") slug: String,
        @Body body: UpdateAttributeRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/comment")
    fun createComment(
        
        @Body body: CommentRequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/comment")
    fun updateComment(
        
        @Body body: UpdateCommentRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/comment/entity/{entity_type}")
    fun getComments(
        @Path("entity_type") entity_type: String, @Query("id") id: String?, @Query("entity_id") entity_id: String?, @Query("user_id") user_id: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}")
    fun checkEligibility(
        @Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String
        
    )
    : Deferred<Response<CheckEligibilityResponse>>
    
    @DELETE ("/service/application/feedback/v1.0/media/")
    fun deleteMedia(
        
        
    )
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/media/")
    fun createMedia(
        
        @Body body: AddMediaListRequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/media/")
    fun updateMedia(
        
        @Body body: UpdateMediaListRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}")
    fun getMedias(
        @Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String, @Query("id") id: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviewSummaries(
        @Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String, @Query("id") id: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/review/")
    fun createReview(
        
        @Body body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @PUT ("/service/application/feedback/v1.0/review/")
    fun updateReview(
        
        @Body body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviews(
        @Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String, @Query("id") id: String?, @Query("user_id") user_id: String?, @Query("media") media: String?, @Query("rating") rating: ArrayList<Double>?, @Query("attribute_rating") attribute_rating: ArrayList<String>?, @Query("facets") facets: Boolean?, @Query("sort") sort: String?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/")
    fun getTemplates(
        @Query("template_id") template_id: String?, @Query("entity_id") entity_id: String?, @Query("entity_type") entity_type: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/template/qna/")
    fun createQuestion(
        
        @Body body: CreateQNARequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/template/qna/")
    fun updateQuestion(
        
        @Body body: UpdateQNARequest
    )
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}")
    fun getQuestionAndAnswers(
        @Path("entity_type") entity_type: String, @Path("entity_id") entity_id: String, @Query("id") id: String?, @Query("show_answer") show_answer: Boolean?, @Query("page_id") page_id: String?, @Query("page_size") page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/vote/")
    fun getVotes(
        @Query("id") id: String?, @Query("ref_type") ref_type: String?
        
    )
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/vote/")
    fun createVote(
        
        @Body body: VoteRequest
    )
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/vote/")
    fun updateVote(
        
        @Body body: UpdateVoteRequest
    )
    : Deferred<Response<XUpdateResponse>>
    
}

interface PosCartApiList {
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart(
        @Query("uid") uid: Int?, @Query("assign_card_id") assign_card_id: Int?
        
    )
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified(
        @Query("uid") uid: Int?
        
    )
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems(
        
        @Body body: AddCartRequest
    )
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart(
        
        @Body body: UpdateCartRequest
    )
    : Deferred<Response<UpdateCartResponse>>
    
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
        @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?,
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
        @Query("item_id") item_id: Int?, @Query("article_id") article_id: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses(
        @Query("uid") uid: Int?, @Query("mobile_no") mobile_no: Int?, @Query("checkout_mode") checkout_mode: String?, @Query("tags") tags: Int?, @Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress(
        
        @Body body: SaveAddressRequest
    )
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    fun getAddressById(
        @Path("id") id: Int, @Query("uid") uid: Int?, @Query("mobile_no") mobile_no: Int?, @Query("checkout_mode") checkout_mode: String?, @Query("tags") tags: Int?, @Query("is_default") is_default: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    fun updateAddress(
        @Path("id") id: Int,
        @Body body: UpdateAddressRequest
    )
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    fun removeAddress(
        @Path("id") id: Int
        
    )
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress(
        
        @Body body: SelectCartAddressRequest
    )
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/payment")
    fun getPaymentModes(
        @Query("uid") uid: String?, @Query("address_id") address_id: String?, @Query("payment_mode") payment_mode: String?, @Query("payment_identifier") payment_identifier: String?, @Query("aggregator_name") aggregator_name: String?, @Query("merchant_code") merchant_code: String?
        
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
        @Query("pick_at_store_uid") pick_at_store_uid: Int?, @Query("ordering_store_id") ordering_store_id: Int?, @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") address_id: Int?
        
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
    
    @GET ("/service/application/pos/cart/v1.0/available-delivery-mode")
    fun getAvailableDeliveryModes(
        @Query("area_code") area_code: Int, @Query("uid") uid: Int?
        
    )
    : Deferred<Response<CartDeliveryModesResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/store-address")
    fun getStoreAddressByUid(
        @Query("area_code") area_code: Int
        
    )
    : Deferred<Response<StoreDetailsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink(
        
        @Body body: GetShareCartLinkRequest
    )
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(
        @Path("token") token: String
        
    )
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(
        @Path("token") token: String, @Path("action") action: String
        
    )
    : Deferred<Response<SharedCartResponse>>
    
}

