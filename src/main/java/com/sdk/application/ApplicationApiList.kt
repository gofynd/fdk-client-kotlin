package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/%s/")
    fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String, @Query("store_id") storeId: String?)
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/sizes/%s/pincode/%s/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String, @Path("pincode") pincode: String, @Query("store_id") storeId: String?)
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/sizes/%s/pincode/%s/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String, @Path("pincode") pincode: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: ArrayList<String>)
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/similar/%s/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similarType: String)
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/%s/variants/")
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
    
    @GET ("/service/application/catalog/v1.0/brands/%s/")
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(@Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/%s/")
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
    fun getCollections(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/%s/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/%s/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/%s/")
    fun getFollowedListing(@Path("collection_type") collectionType: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetFollowListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/%s/%s/")
    fun followById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/%s/%s/")
    fun unfollowById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/%s/%s/count/")
    fun getFollowerCountById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(@Query("collection_type") collectionType: String?)
    : Deferred<Response<FollowIdsResponse>>
    
    @GET ("/service/application/catalog/v1.0/locations/")
    fun getStores(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<StoreListingResponse>>
    
}

interface CartApiList {
    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified(@Query("uid") uid: Int?)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartResponse>>
    
    @GET ("/service/application/cart/v1.0/basic")
    fun getItemCount(@Query("uid") uid: Int?)
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/cart/v1.0/coupon")
    fun getCoupons(@Query("uid") uid: Int?)
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?,@Body body: ApplyCouponRequest)
    : Deferred<Response<CartResponse>>
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    fun removeCoupon(@Query("uid") uid: Int?)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses(@Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/cart/v1.0/address/%d")
    fun getAddressById(@Path("id") id: String, @Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    @PUT ("/service/application/cart/v1.0/address/%d")
    fun updateAddress(@Path("id") id: String,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/cart/v1.0/address/%d")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: SelectCartAddressRequest)
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/cart/v1.0/payment")
    fun selectPaymentMode(@Query("uid") uid: String?,@Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("uid") uid: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    @GET ("/service/application/cart/v1.0/shipment")
    fun getShipments(@Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("area_code") areaCode: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/cart/v1.0/checkout")
    fun checkoutCart(@Body body: CartCheckoutRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/cart/v1.0/meta")
    fun updateCartMeta(@Query("uid") uid: Int?,@Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/cart/v1.0/share-cart/%s")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart/%s/%s")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface LeadApiList {
    
    @GET ("/service/application/lead/v1.0/ticket/%s")
    fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @POST ("/service/application/lead/v1.0/ticket/%s/history")
    fun createHistory(@Path("ticket_id") ticketId: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket(@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/application/lead/v1.0/form/%s")
    fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>>
    
    @POST ("/service/application/lead/v1.0/form/%s/submit")
    fun submitCustomForm(@Path("slug") slug: String,@Body body: CustomFormSubmissionPayload)
    : Deferred<Response<SubmitCustomFormResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/%s/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/%s/token")
    fun getTokenForVideoRoom(@Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface UserApiList {
    
    @POST ("/service/application/user/authentication/v1.0/login/facebook-token")
    fun loginWithFacebook(@Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-token")
    fun loginWithGoogle(@Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-android")
    fun loginWithGoogleAndroid(@Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/google-ios")
    fun loginWithGoogleIOS(@Body body: OAuthRequestSchema)
    : Deferred<Response<AuthSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/otp")
    fun loginWithOTP(@Query("platform") platform: String?,@Body body: SendOtpRequestSchema)
    : Deferred<Response<SendOtpResponse>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password")
    fun loginWithEmailAndPassword(@Body body: PasswordLoginRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset")
    fun sendResetPasswordEmail(@Query("platform") platform: String?,@Body body: SendResetPasswordEmailRequestSchema)
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
    fun registerWithForm(@Query("platform") platform: String?,@Body body: FormRegisterRequestSchema)
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
    fun sendOTPOnMobile(@Query("platform") platform: String?,@Body body: SendMobileOtpRequestSchema)
    : Deferred<Response<OtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/verify")
    fun verifyMobileOTP(@Query("platform") platform: String?,@Body body: VerifyOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/send")
    fun sendOTPOnEmail(@Query("platform") platform: String?,@Body body: SendEmailOtpRequestSchema)
    : Deferred<Response<EmailOtpSuccess>>
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/verify")
    fun verifyEmailOTP(@Query("platform") platform: String?,@Body body: VerifyOtpRequestSchema)
    : Deferred<Response<VerifyOtpSuccess>>
    
    @GET ("/service/application/user/authentication/v1.0/session")
    fun getLoggedInUser()
    : Deferred<Response<UserSchema>>
    
    @GET ("/service/application/user/authentication/v1.0/sessions")
    fun getListOfActiveSessions()
    : Deferred<Response<SessionListSuccess>>
    
    @GET ("/service/application/user/platform/v1.0/config")
    fun getPlatformConfig(@Query("name") name: String?)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/application/user/profile/v1.0/detail")
    fun updateProfile(@Query("platform") platform: String?,@Body body: EditProfileRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    @PUT ("/service/application/user/profile/v1.0/mobile")
    fun addMobileNumber(@Query("platform") platform: String?,@Body body: EditMobileRequestSchema)
    : Deferred<Response<VerifyMobileOTPSuccess>>
    
    @DELETE ("/service/application/user/profile/v1.0/mobile")
    fun deleteMobileNumber(@Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("country_code") countryCode: String, @Query("phone") phone: String)
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/primary")
    fun setMobileNumberAsPrimary(@Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/mobile/link/send")
    fun sendVerificationLinkToMobile(@Query("platform") platform: String?,@Body body: SendVerificationLinkMobileRequestSchema)
    : Deferred<Response<SendMobileVerifyLinkSuccess>>
    
    @PUT ("/service/application/user/profile/v1.0/email")
    fun addEmail(@Query("platform") platform: String?,@Body body: EditEmailRequestSchema)
    : Deferred<Response<VerifyEmailOTPSuccess>>
    
    @DELETE ("/service/application/user/profile/v1.0/email")
    fun deleteEmail(@Query("platform") platform: String?, @Query("active") active: Boolean, @Query("primary") primary: Boolean, @Query("verified") verified: Boolean, @Query("email") email: String)
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/email/primary")
    fun setEmailAsPrimary(@Body body: EditEmailRequestSchema)
    : Deferred<Response<LoginSuccess>>
    
    @POST ("/service/application/user/profile/v1.0/email/link/send")
    fun sendVerificationLinkToEmail(@Query("platform") platform: String?,@Body body: EditEmailRequestSchema)
    : Deferred<Response<SendEmailVerifyLinkSuccess>>
    
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
    
    @POST ("/service/application/share/v1.0/qr/products/%s/")
    fun getProductQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/collection/%s/")
    fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/url/")
    fun getUrlQRCode(@Query("url") url: String)
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/links/short-link/")
    fun createShortLink(@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/%s/")
    fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/%s/original/")
    fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
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
    : Deferred<Response<TokenResponse>>
    
    @GET ("/service/application/configuration/v1.0/ordering-store/stores")
    fun getOrderingStores(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStores>>
    
    @GET ("/service/application/configuration/v1.0/feature")
    fun getFeatures()
    : Deferred<Response<AppFeatureResponse>>
    
    @GET ("/service/application/configuration/v1.0/information")
    fun getContactInfo()
    : Deferred<Response<ApplicationInformation>>
    
    @GET ("/service/application/configuration/v1.0/currencies")
    fun getCurrencies()
    : Deferred<Response<CurrenciesResponse>>
    
    @GET ("/service/application/configuration/v1.0/currency/%s")
    fun getCurrencyById(@Path("id") id: String)
    : Deferred<Response<Currency>>
    
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
    fun getAggregatorsConfig(@Header("x-api-token") xApiToken: String, @Query("refresh") refresh: Boolean?)
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
    fun getPaymentModeRoutes(@Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("assign_card_id") assignCardId: String?, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    @GET ("/service/application/payment/v1.0/payment/options/pos")
    fun getPosPaymentModeRoutes(@Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("assign_card_id") assignCardId: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
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
    
    @POST ("/service/application/payment/v1.0/refund/verification/wallet")
    fun verifyOtpAndAddBeneficiaryForWallet(@Body body: WalletOtpRequest)
    : Deferred<Response<WalletOtpResponse>>
    
    @POST ("/service/application/payment/v1.0/refund/beneficiary/default")
    fun updateDefaultBeneficiary(@Body body: SetDefaultBeneficiaryRequest)
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    
}

interface PosCartApiList {
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified(@Query("uid") uid: Int?)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    fun getItemCount(@Query("uid") uid: Int?)
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    fun getCoupons(@Query("uid") uid: Int?)
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?,@Body body: ApplyCouponRequest)
    : Deferred<Response<CartResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    fun removeCoupon(@Query("uid") uid: Int?)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses(@Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address/%d")
    fun getAddressById(@Path("id") id: String, @Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: String?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    @PUT ("/service/application/pos/cart/v1.0/address/%d")
    fun updateAddress(@Path("id") id: String,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/address/%d")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: SelectCartAddressRequest)
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    fun selectPaymentMode(@Query("uid") uid: String?,@Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("uid") uid: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentCouponValidate>>
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    fun getShipments(@Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    fun updateShipments(@Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    fun checkoutCart(@Query("uid") uid: Int?,@Body body: CartPosCheckoutRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    fun updateCartMeta(@Query("uid") uid: Int?,@Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/available-delivery-mode")
    fun getAvailableDeliveryModes(@Query("area_code") areaCode: String, @Query("uid") uid: Int?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/store-address")
    fun getStoreAddressByUid(@Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/%s")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/%s/%s")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface LogisticApiList {
    
    @POST ("/service/application/logistics/v1.0")
    fun getTatProduct(@Body body: GetTatProductReqBody)
    : Deferred<Response<GetTatProductResponse>>
    
    @GET ("/service/application/logistics/v1.0/pincode/%s")
    fun getPincodeCity(@Path("pincode") pincode: String)
    : Deferred<Response<GetPincodeCityResponse>>
    
}

