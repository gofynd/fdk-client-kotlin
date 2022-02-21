package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*

interface CatalogApiList {
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String, @Query("store_id") storeId: Int?)
    : Deferred<Response<ProductSizes>>
    
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: ArrayList<String>)
    : Deferred<Response<ProductsComparisonResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similarType: String)
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds(@Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?)
    : Deferred<Response<ProductStockStatusResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<ProductStockPolling>>
    
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts(@Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands(@Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BrandListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(@Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts(@Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HomeListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments()
    : Deferred<Response<DepartmentResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(@Path("collection_type") collectionType: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetFollowListingResponse>>
    
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowerCountResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(@Query("collection_type") collectionType: String?)
    : Deferred<Response<FollowIdsResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/locations/")
    fun getStores(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<StoreListingResponse>>
    
    
    @GET ("/service/application/catalog/v1.0/in-stock/locations/")
    fun getInStockLocations(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<ApplicationStoreListing>>
    
    
    @GET ("/service/application/catalog/v1.0/locations/{location_id}/")
    fun getLocationDetailsById(@Path("location_id") locationId: Int)
    : Deferred<Response<StoreDetails>>
    
    
    @GET ("/service/application/catalog/v1.0/product-grouping/")
    fun getProductBundlesBySlug(@Query("slug") slug: String?, @Query("id") id: String?)
    : Deferred<Response<ProductBundle>>
    
    
    @GET ("/service/application/catalog/v2.0/products/{slug}/sizes/{size}/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String, @Query("store_id") storeId: Int?, @Query("pincode") pincode: String?)
    : Deferred<Response<ProductSizePriceResponseV2>>
    
    
    @GET ("/service/application/catalog/v2.0/products/{slug}/sizes/{size}/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String, @Query("pincode") pincode: String?, @Query("strategy") strategy: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductSizeSellersResponseV2>>
    
}

interface CartApiList {
    
    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified(@Query("id") id: String?)
    : Deferred<Response<Void>>
    
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    
    @GET ("/service/application/cart/v1.0/basic")
    fun getItemCount(@Query("id") id: String?)
    : Deferred<Response<CartItemCountResponse>>
    
    
    @GET ("/service/application/cart/v1.0/coupon")
    fun getCoupons(@Query("id") id: String?)
    : Deferred<Response<GetCouponResponse>>
    
    
    @POST ("/service/application/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    fun removeCoupon(@Query("id") id: String?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    
    @POST ("/service/application/cart/v1.0/redeem/points/")
    fun applyRewardPoints(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: RewardPointRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses(@Query("cart_id") cartId: String?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: String, @Query("cart_id") cartId: String?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: String, @Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress(@Query("cart_id") cartId: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @PUT ("/service/application/cart/v1.0/payment")
    fun selectPaymentMode(@Query("id") id: String?, @Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("id") id: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    
    @GET ("/service/application/cart/v1.0/shipment")
    fun getShipments(@Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @POST ("/service/application/cart/v1.0/checkout")
    fun checkoutCart(@Body body: CartCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    
    @PUT ("/service/application/cart/v1.0/meta")
    fun updateCartMeta(@Query("id") id: String?, @Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    
    @POST ("/service/application/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    
    @GET ("/service/application/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface CommonApiList {
    
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    fun searchApplication(@Header("authorization") authorization: String?, @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    
    @GET ("/service/common/configuration/v1.0/location")
    fun getLocations(@Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}

interface LeadApiList {
    
    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    
    @POST ("/service/application/lead/v1.0/ticket/{id}/history")
    fun createHistory(@Path("id") id: String, @Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket(@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>>
    
    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(@Path("slug") slug: String, @Body body: CustomFormSubmissionPayload)
    : Deferred<Response<SubmitCustomFormResponse>>
    
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface ThemeApiList {
    
    
    @GET ("/service/application/theme/v1.0/{theme_id}/page")
    fun getAllPages(@Path("theme_id") themeId: String)
    : Deferred<Response<AllAvailablePageSchema>>
    
    
    @GET ("/service/application/theme/v1.0/{theme_id}/{page_value}")
    fun getPage(@Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Deferred<Response<AvailablePageSchema>>
    
    
    @GET ("/service/application/theme/v1.0/applied-theme")
    fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>
    
    
    @GET ("/service/application/theme/v1.0/{theme_id}/preview")
    fun getThemeForPreview(@Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
}

interface UserApiList {
    
    
    @POST ("/service/application/user/authentication/v1.0/login/facebook-token")
    fun loginWithFacebook(@Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/google-token")
    fun loginWithGoogle(@Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/google-android")
    fun loginWithGoogleAndroid(@Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/google-ios")
    fun loginWithGoogleIOS(@Query("platform") platform: String?, @Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/apple-ios")
    fun loginWithAppleIOS(@Query("platform") platform: String?, @Body body: OAuthRequestAppleSchema)
    : Deferred<Response<AuthSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/otp")
    fun loginWithOTP(@Query("platform") platform: String?, @Body body: SendOtpRequestSchema)
    : Deferred<Response<SendOtpResponse>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/password")
    fun loginWithEmailAndPassword(@Body body: PasswordLoginRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset")
    fun sendResetPasswordEmail(@Query("platform") platform: String?, @Body body: SendResetPasswordEmailRequestSchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/forgot")
    fun forgotPassword(@Body body: ForgotPasswordRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/token")
    fun sendResetToken(@Body body: CodeRequestBodySchema)
    : Deferred<Response<ResetPasswordSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/login/token")
    fun loginWithToken(@Body body: TokenRequestBodySchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/register/form")
    fun registerWithForm(@Query("platform") platform: String?, @Body body: FormRegisterRequestSchema)
    : Deferred<Response<RegisterFormSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/verify/email")
    fun verifyEmail(@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/verify/mobile")
    fun verifyMobile(@Body body: CodeRequestBodySchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @GET ("/service/application/user/authentication/v1.0/has-password")
    fun hasPassword()
    : Deferred<Response<HasPasswordSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/password")
    fun updatePassword(@Body body: UpdatePasswordRequestSchema)
    : Deferred<Response<VerifyEmailSuccess>>
    
    
    @GET ("/service/application/user/authentication/v1.0/logout")
    fun logout()
    : Deferred<Response<LogoutSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/send")
    fun sendOTPOnMobile(@Query("platform") platform: String?, @Body body: SendMobileOtpRequestSchema)
    : Deferred<Response<OtpSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/verify")
    fun verifyMobileOTP(@Query("platform") platform: String?, @Body body: VerifyOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/send")
    fun sendOTPOnEmail(@Query("platform") platform: String?, @Body body: SendEmailOtpRequestSchema)
    : Deferred<Response<EmailOtpSuccess>>
    
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/verify")
    fun verifyEmailOTP(@Query("platform") platform: String?, @Body body: VerifyEmailOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    
    @GET ("/service/application/user/authentication/v1.0/session")
    fun getLoggedInUser()
    : Deferred<Response<UserObjectSchema>>
    
    
    @GET ("/service/application/user/authentication/v1.0/sessions")
    fun getListOfActiveSessions()
    : Deferred<Response<SessionListSuccess>>
    
    
    @GET ("/service/application/user/platform/v1.0/config")
    fun getPlatformConfig(@Query("name") name: String?)
    : Deferred<Response<PlatformSchema>>
    
    
    @POST ("/service/application/user/profile/v1.0/detail")
    fun updateProfile(@Query("platform") platform: String?, @Body body: EditProfileRequestSchema)
    : Deferred<Response<ProfileEditSuccess>>
    
    
    @PUT ("/service/application/user/profile/v1.0/mobile")
    fun addMobileNumber(@Query("platform") platform: String?, @Body body: EditMobileRequestSchema)
    : Deferred<Response<VerifyMobileOTPSuccess>>
    
    
    @DELETE ("/service/application/user/profile/v1.0/mobile")
    fun deleteMobileNumber(@Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/profile/v1.0/mobile/primary")
    fun setMobileNumberAsPrimary(@Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/profile/v1.0/mobile/link/send")
    fun sendVerificationLinkToMobile(@Query("platform") platform: String?, @Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    
    @PUT ("/service/application/user/profile/v1.0/email")
    fun addEmail(@Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<VerifyEmailOTPSuccess>>
    
    
    @DELETE ("/service/application/user/profile/v1.0/email")
    fun deleteEmail(@Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/profile/v1.0/email/primary")
    fun setEmailAsPrimary(@Body body: EditEmailRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    
    @POST ("/service/application/user/profile/v1.0/email/link/send")
    fun sendVerificationLinkToEmail(@Query("platform") platform: String?, @Body body: EditEmailRequestSchema)
    : Deferred<Response<SendEmailVerifyLinkSuccess>>
    
}

interface ContentApiList {
    
    
    @GET ("/service/application/content/v1.0/announcements")
    fun getAnnouncements()
    : Deferred<Response<AnnouncementsResponseSchema>>
    
    
    @GET ("/service/application/content/v1.0/blogs/{slug}")
    fun getBlog(@Path("slug") slug: String, @Query("root_id") rootId: String?)
    : Deferred<Response<BlogSchema>>
    
    
    @GET ("/service/application/content/v1.0/blogs/")
    fun getBlogs(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BlogGetResponse>>
    
    
    @GET ("/service/application/content/v1.0/data-loader")
    fun getDataLoaders()
    : Deferred<Response<DataLoaderSchema>>
    
    
    @GET ("/service/application/content/v1.0/faq")
    fun getFaqs()
    : Deferred<Response<FaqResponseSchema>>
    
    
    @GET ("/service/application/content/v1.0/faq/categories")
    fun getFaqCategories()
    : Deferred<Response<GetFaqCategoriesSchema>>
    
    
    @GET ("/service/application/content/v1.0/faq/{slug}")
    fun getFaqBySlug(@Path("slug") slug: String)
    : Deferred<Response<FaqSchema>>
    
    
    @GET ("/service/application/content/v1.0/faq/category/{slug}")
    fun getFaqCategoryBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetFaqCategoryBySlugSchema>>
    
    
    @GET ("/service/application/content/v1.0/faq/category/{slug}/faqs")
    fun getFaqsByCategorySlug(@Path("slug") slug: String)
    : Deferred<Response<GetFaqSchema>>
    
    
    @GET ("/service/application/content/v1.0/landing-page")
    fun getLandingPage()
    : Deferred<Response<LandingPageSchema>>
    
    
    @GET ("/service/application/content/v1.0/legal")
    fun getLegalInformation()
    : Deferred<Response<ApplicationLegal>>
    
    
    @GET ("/service/application/content/v1.0/navigations/")
    fun getNavigations(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<NavigationGetResponse>>
    
    
    @GET ("/service/application/content/v1.0/seo")
    fun getSEOConfiguration()
    : Deferred<Response<SeoComponent>>
    
    
    @GET ("/service/application/content/v1.0/slideshow/")
    fun getSlideshows(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SlideshowGetResponse>>
    
    
    @GET ("/service/application/content/v1.0/slideshow/{slug}")
    fun getSlideshow(@Path("slug") slug: String)
    : Deferred<Response<SlideshowSchema>>
    
    
    @GET ("/service/application/content/v1.0/support")
    fun getSupportInformation()
    : Deferred<Response<Support>>
    
    
    @GET ("/service/application/content/v1.0/tags")
    fun getTags()
    : Deferred<Response<TagsSchema>>
    
    
    @GET ("/service/application/content/v2.0/pages/{slug}")
    fun getPage(@Path("slug") slug: String, @Query("root_id") rootId: String?)
    : Deferred<Response<PageSchema>>
    
    
    @GET ("/service/application/content/v2.0/pages/")
    fun getPages(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PageGetResponse>>
    
}

interface CommunicationApiList {
    
    
    @GET ("/service/application/communication/v1.0/consent")
    fun getCommunicationConsent()
    : Deferred<Response<CommunicationConsent>>
    
    
    @POST ("/service/application/communication/v1.0/consent")
    fun upsertCommunicationConsent(@Body body: CommunicationConsentReq)
    : Deferred<Response<CommunicationConsentRes>>
    
    
    @POST ("/service/application/communication/v1.0/pn-token")
    fun upsertAppPushtoken(@Body body: PushtokenReq)
    : Deferred<Response<PushtokenRes>>
    
}

interface ShareApiList {
    
    
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
    fun createShortLink(@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/")
    fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/original/")
    fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
}

interface FileStorageApiList {
    
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/start/")
    fun startUpload(@Path("namespace") namespace: String, @Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/complete/")
    fun completeUpload(@Path("namespace") namespace: String, @Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
}

interface ConfigurationApiList {
    
    
    @GET ("/service/application/configuration/v1.0/application")
    fun getApplication()
    : Deferred<Response<Application>>
    
    
    @GET ("/service/application/configuration/v1.0/about")
    fun getOwnerInfo()
    : Deferred<Response<ApplicationAboutResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/detail")
    fun getBasicDetails()
    : Deferred<Response<ApplicationDetail>>
    
    
    @GET ("/service/application/configuration/v1.0/token")
    fun getIntegrationTokens()
    : Deferred<Response<AppTokenResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/ordering-store/stores")
    fun getOrderingStores(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStores>>
    
    
    @GET ("/service/application/configuration/v1.0/ordering-store/stores/{store_id}")
    fun getStoreDetailById(@Path("store_id") storeId: Int)
    : Deferred<Response<OrderingStore>>
    
    
    @GET ("/service/application/configuration/v1.0/feature")
    fun getFeatures()
    : Deferred<Response<AppFeatureResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/information")
    fun getContactInfo()
    : Deferred<Response<ApplicationInformation>>
    
    
    @GET ("/service/application/configuration/v1.0/currencies")
    fun getCurrencies()
    : Deferred<Response<CurrenciesResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/currency/{id}")
    fun getCurrencyById(@Path("id") id: String)
    : Deferred<Response<Currency>>
    
    
    @GET ("/service/application/configuration/v1.0/currency")
    fun getAppCurrencies()
    : Deferred<Response<AppCurrencyResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/languages")
    fun getLanguages()
    : Deferred<Response<LanguageResponse>>
    
    
    @POST ("/service/application/configuration/v1.0/ordering-store/select")
    fun getOrderingStoreCookie(@Body body: OrderingStoreSelectRequest)
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @DELETE ("/service/application/configuration/v1.0/ordering-store/select")
    fun removeOrderingStoreCookie()
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @GET ("/service/application/configuration/v1.0/staff")
    fun getAppStaffs(@Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?)
    : Deferred<Response<AppStaffResponse>>
    
}

interface PaymentApiList {
    
    
    @GET ("/service/application/payment/v1.0/config/aggregators/key")
    fun getAggregatorsConfig(@Header("x-api-token") xApiToken: String?, @Query("refresh") refresh: Boolean?)
    : Deferred<Response<AggregatorsConfigDetailResponse>>
    
    
    @POST ("/service/application/payment/v1.0/card/attach")
    fun attachCardToCustomer(@Body body: AttachCardRequest)
    : Deferred<Response<AttachCardsResponse>>
    
    
    @GET ("/service/application/payment/v1.0/card/aggregator")
    fun getActiveCardAggregator(@Query("refresh") refresh: Boolean?)
    : Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    
    @GET ("/service/application/payment/v1.0/cards")
    fun getActiveUserCards(@Query("force_refresh") forceRefresh: Boolean?)
    : Deferred<Response<ListCardsResponse>>
    
    
    @POST ("/service/application/payment/v1.0/card/remove")
    fun deleteUserCard(@Body body: DeletehCardRequest)
    : Deferred<Response<DeleteCardsResponse>>
    
    
    @POST ("/service/application/payment/v1.0/payment/customer/validation")
    fun verifyCustomerForPayment(@Body body: ValidateCustomerRequest)
    : Deferred<Response<ValidateCustomerResponse>>
    
    
    @POST ("/service/application/payment/v1.0/payment/confirm/charge")
    fun verifyAndChargePayment(@Body body: ChargeCustomerRequest)
    : Deferred<Response<ChargeCustomerResponse>>
    
    
    @POST ("/service/application/payment/v1.0/payment/request")
    fun initialisePayment(@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    
    @POST ("/service/application/payment/v1.0/payment/confirm/polling")
    fun checkAndUpdatePaymentStatus(@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    
    @GET ("/service/application/payment/v1.0/payment/options")
    fun getPaymentModeRoutes(@Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET ("/service/application/payment/v1.0/payment/options/pos")
    fun getPosPaymentModeRoutes(@Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET ("/service/application/payment/v1.0/rupifi/banner")
    fun getRupifiBannerDetails()
    : Deferred<Response<RupifiBannerResponse>>
    
    
    @GET ("/service/application/payment/v1.0/refund/transfer-mode")
    fun getActiveRefundTransferModes()
    : Deferred<Response<TransferModeResponse>>
    
    
    @PUT ("/service/application/payment/v1.0/refund/transfer-mode")
    fun enableOrDisableRefundTransferMode(@Body body: UpdateRefundTransferModeRequest)
    : Deferred<Response<UpdateRefundTransferModeResponse>>
    
    
    @GET ("/service/application/payment/v1.0/refund/user/beneficiary")
    fun getUserBeneficiariesDetail(@Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @GET ("/service/application/payment/v1.0/ifsc-code/verify")
    fun verifyIfscCode(@Query("ifsc_code") ifscCode: String?)
    : Deferred<Response<IfscCodeResponse>>
    
    
    @GET ("/service/application/payment/v1.0/refund/order/beneficiaries")
    fun getOrderBeneficiariesDetail(@Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @POST ("/service/application/payment/v1.0/refund/verification/bank")
    fun verifyOtpAndAddBeneficiaryForBank(@Body body: AddBeneficiaryViaOtpVerificationRequest)
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    
    @POST ("/service/application/payment/v1.0/refund/account")
    fun addBeneficiaryDetails(@Body body: AddBeneficiaryDetailsRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST ("/service/application/payment/v1.0/refund/account/otp")
    fun addRefundBankAccountUsingOTP(@Body body: AddBeneficiaryDetailsOTPRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST ("/service/application/payment/v1.0/refund/verification/wallet")
    fun verifyOtpAndAddBeneficiaryForWallet(@Body body: WalletOtpRequest)
    : Deferred<Response<WalletOtpResponse>>
    
    
    @POST ("/service/application/payment/v1.0/refund/beneficiary/default")
    fun updateDefaultBeneficiary(@Body body: SetDefaultBeneficiaryRequest)
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    
}

interface OrderApiList {
    
    
    @GET ("/service/application/order/v1.0/orders")
    fun getOrders(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("status") status: Int?)
    : Deferred<Response<OrderList>>
    
    
    @GET ("/service/application/order/v1.0/orders/{order_id}")
    fun getOrderById(@Path("order_id") orderId: String)
    : Deferred<Response<OrderById>>
    
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}")
    fun getShipmentById(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentById>>
    
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons")
    fun getShipmentReasons(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentReasons>>
    
    
    @PUT ("/service/application/order/v1.0/orders/shipments/{shipment_id}/status")
    fun updateShipmentStatus(@Path("shipment_id") shipmentId: String, @Body body: ShipmentStatusUpdateBody)
    : Deferred<Response<ShipmentStatusUpdate>>
    
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/track")
    fun trackShipment(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentTrack>>
    
    
    @GET ("/service/application/order/v1.0/orders/pos-order/{order_id}")
    fun getPosOrderById(@Path("order_id") orderId: String)
    : Deferred<Response<PosOrderById>>
    
    
    @GET ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details")
    fun getCustomerDetailsByShipmentId(@Path("order_id") orderId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<CustomerDetailsByShipmentId>>
    
    
    @POST ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/")
    fun sendOtpToShipmentCustomer(@Path("order_id") orderId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<sendOTPApplicationResponse>>
    
    
    @POST ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify")
    fun verifyOtpShipmentCustomer(@Path("order_id") orderId: String, @Path("shipment_id") shipmentId: String, @Body body: ReqBodyVerifyOTPShipment)
    : Deferred<Response<ResponseVerifyOTPShipment>>
    
}

interface RewardsApiList {
    
    
    @POST ("/service/application/rewards/v1.0/catalogue/offer/order/")
    fun getPointsOnProduct(@Body body: CatalogueOrderRequest)
    : Deferred<Response<CatalogueOrderResponse>>
    
    
    @GET ("/service/application/rewards/v1.0/offers/{name}/")
    fun getOfferByName(@Path("name") name: String)
    : Deferred<Response<Offer>>
    
    
    @POST ("/service/application/rewards/v1.0/user/offers/order-discount/")
    fun getOrderDiscount(@Body body: OrderDiscountRequest)
    : Deferred<Response<OrderDiscountResponse>>
    
    
    @GET ("/service/application/rewards/v1.0/user/points/")
    fun getUserPoints()
    : Deferred<Response<PointsResponse>>
    
    
    @GET ("/service/application/rewards/v1.0/user/points/history/")
    fun getUserPointsHistory(@Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PointsHistoryResponse>>
    
    
    @GET ("/service/application/rewards/v1.0/user/referral/")
    fun getUserReferralDetails()
    : Deferred<Response<ReferralDetailsResponse>>
    
    
    @POST ("/service/application/rewards/v1.0/user/referral/redeem/")
    fun redeemReferralCode(@Body body: RedeemReferralCodeRequest)
    : Deferred<Response<RedeemReferralCodeResponse>>
    
}

interface FeedbackApiList {
    
    
    @POST ("/service/application/feedback/v1.0/abuse/")
    fun createAbuseReport(@Body body: ReportAbuseRequest)
    : Deferred<Response<InsertResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/abuse/")
    fun updateAbuseReport(@Body body: UpdateAbuseStatusRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}")
    fun getAbuseReports(@Path("entity_id") entityId: String, @Path("entity_type") entityType: String, @Query("id") id: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ReportAbuseGetResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/attributes/")
    fun getAttributes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<AttributeResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/attributes/")
    fun createAttribute(@Body body: SaveAttributeRequest)
    : Deferred<Response<InsertResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/attributes/{slug}")
    fun getAttribute(@Path("slug") slug: String)
    : Deferred<Response<Attribute>>
    
    
    @PUT ("/service/application/feedback/v1.0/attributes/{slug}")
    fun updateAttribute(@Path("slug") slug: String, @Body body: UpdateAttributeRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/comment/")
    fun createComment(@Body body: CommentRequest)
    : Deferred<Response<InsertResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/comment/")
    fun updateComment(@Body body: UpdateCommentRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/comment/entity/{entity_type}")
    fun getComments(@Path("entity_type") entityType: String, @Query("id") id: String?, @Query("entity_id") entityId: String?, @Query("user_id") userId: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CommentGetResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}")
    fun checkEligibility(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String)
    : Deferred<Response<CheckEligibilityResponse>>
    
    
    @DELETE ("/service/application/feedback/v1.0/media/")
    fun deleteMedia(@Query("ids") ids: ArrayList<String>)
    : Deferred<Response<UpdateResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/media/")
    fun createMedia(@Body body: AddMediaListRequest)
    : Deferred<Response<InsertResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/media/")
    fun updateMedia(@Body body: UpdateMediaListRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}")
    fun getMedias(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("type") type: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<MediaGetResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviewSummaries(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ReviewMetricGetResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/review/")
    fun createReview(@Body body: UpdateReviewRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/review/")
    fun updateReview(@Body body: UpdateReviewRequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviews(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("media") media: String?, @Query("rating") rating: ArrayList<Double>?, @Query("attribute_rating") attributeRating: ArrayList<String>?, @Query("facets") facets: Boolean?, @Query("sort") sort: String?, @Query("active") active: Boolean?, @Query("approve") approve: Boolean?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ReviewGetResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/template/")
    fun getTemplates(@Query("template_id") templateId: String?, @Query("entity_id") entityId: String?, @Query("entity_type") entityType: String?)
    : Deferred<Response<TemplateGetResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/template/qna/")
    fun createQuestion(@Body body: CreateQNARequest)
    : Deferred<Response<InsertResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/template/qna/")
    fun updateQuestion(@Body body: UpdateQNARequest)
    : Deferred<Response<UpdateResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}")
    fun getQuestionAndAnswers(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("show_answer") showAnswer: Boolean?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<QNAGetResponse>>
    
    
    @GET ("/service/application/feedback/v1.0/vote/")
    fun getVotes(@Query("id") id: String?, @Query("ref_type") refType: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<VoteResponse>>
    
    
    @POST ("/service/application/feedback/v1.0/vote/")
    fun createVote(@Body body: VoteRequest)
    : Deferred<Response<InsertResponse>>
    
    
    @PUT ("/service/application/feedback/v1.0/vote/")
    fun updateVote(@Body body: UpdateVoteRequest)
    : Deferred<Response<UpdateResponse>>
    
}

interface PosCartApiList {
    
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified(@Query("id") id: String?)
    : Deferred<Response<Void>>
    
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    fun getItemCount(@Query("id") id: String?)
    : Deferred<Response<CartItemCountResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    fun getCoupons(@Query("id") id: String?)
    : Deferred<Response<GetCouponResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Body body: ApplyCouponRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    fun removeCoupon(@Query("id") id: String?)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/redeem/points/")
    fun applyRewardPoints(@Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: RewardPointRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses(@Query("cart_id") cartId: String?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: String, @Query("cart_id") cartId: String?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: String, @Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress(@Query("cart_id") cartId: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Body body: SelectCartAddressRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    fun selectPaymentMode(@Query("id") id: String?, @Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartDetailResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("id") id: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    fun getShipments(@Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    fun updateShipments(@Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("id") id: String?, @Query("address_id") addressId: String?, @Query("order_type") orderType: String?, @Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    fun checkoutCart(@Query("id") id: String?, @Body body: CartPosCheckoutDetailRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    fun updateCartMeta(@Query("id") id: String?, @Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/available-delivery-mode")
    fun getAvailableDeliveryModes(@Query("area_code") areaCode: String, @Query("id") id: String?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/store-address")
    fun getStoreAddressByUid(@Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface LogisticApiList {
    
    
    @POST ("/service/application/logistics/v1.0")
    fun getTatProduct(@Body body: GetTatProductReqBody)
    : Deferred<Response<GetTatProductResponse>>
    
    
    @GET ("/service/application/logistics/v1.0/pincode/{pincode}")
    fun getPincodeCity(@Path("pincode") pincode: String)
    : Deferred<Response<GetPincodeCityResponse>>
    
}

