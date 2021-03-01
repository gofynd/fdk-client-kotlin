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
    
    override fun addCollection(
        
        body: CreateCollection
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.addCollection(
        
        
        body = body
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
    
    override fun addCollectionItemsBySlug( slug: String,
        
        body: CollectionItemsRequest
    )
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogApiHelperClass.addCollectionItemsBySlug(
        slug = slug,
        
        body = body
        )
    }
    
    override fun getCollectionItemsBySlug( slug: String,
         f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiHelperClass.getCollectionItemsBySlug(
        slug = slug,
        f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size
        
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
    
    override fun getCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.getCollectionDetailBySlug(
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

class ThemeDataManagerClass(val config: ApplicationConfig) : ThemeDataManager {
    
    val themeApiHelperClass by lazy {
        ThemeApiHelperClass(config)
    }
    
    override fun getAppliedTheme(
        
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiHelperClass.getAppliedTheme(
        
        
        
        )
    }
    
    override fun getThemeForPreview( theme_id: String
        
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiHelperClass.getThemeForPreview(
        theme_id = theme_id
        
        
        )
    }
    
}

class UserDataManagerClass(val config: ApplicationConfig) : UserDataManager {
    
    val userApiHelperClass by lazy {
        UserApiHelperClass(config)
    }
    
    override fun loginWithFacebook(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiHelperClass.loginWithFacebook(
        
        
        body = body
        )
    }
    
    override fun loginWithGoogle(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiHelperClass.loginWithGoogle(
        
        
        body = body
        )
    }
    
    override fun loginWithGoogleAndroid(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiHelperClass.loginWithGoogleAndroid(
        
        
        body = body
        )
    }
    
    override fun loginWithGoogleIOS(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiHelperClass.loginWithGoogleIOS(
        
        
        body = body
        )
    }
    
    override fun loginWithOTP(
         platform: String?,
        body: SendOtpRequestSchema
    )
    : Deferred<Response<SendOtpResponse>> {
        return userApiHelperClass.loginWithOTP(
        
        platform = platform,
        body = body
        )
    }
    
    override fun loginWithEmailAndPassword(
        
        body: PasswordLoginRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.loginWithEmailAndPassword(
        
        
        body = body
        )
    }
    
    override fun sendResetPasswordEmail(
         platform: String?,
        body: SendResetPasswordEmailRequestSchema
    )
    : Deferred<Response<ResetPasswordSuccess>> {
        return userApiHelperClass.sendResetPasswordEmail(
        
        platform = platform,
        body = body
        )
    }
    
    override fun forgotPassword(
        
        body: ForgotPasswordRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.forgotPassword(
        
        
        body = body
        )
    }
    
    override fun sendResetToken(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<ResetPasswordSuccess>> {
        return userApiHelperClass.sendResetToken(
        
        
        body = body
        )
    }
    
    override fun loginWithToken(
        
        body: TokenRequestBodySchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.loginWithToken(
        
        
        body = body
        )
    }
    
    override fun registerWithForm(
         platform: String?,
        body: FormRegisterRequestSchema
    )
    : Deferred<Response<RegisterFormSuccess>> {
        return userApiHelperClass.registerWithForm(
        
        platform = platform,
        body = body
        )
    }
    
    override fun verifyEmail(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiHelperClass.verifyEmail(
        
        
        body = body
        )
    }
    
    override fun verifyMobile(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiHelperClass.verifyMobile(
        
        
        body = body
        )
    }
    
    override fun hasPassword(
        
        
    )
    : Deferred<Response<HasPasswordSuccess>> {
        return userApiHelperClass.hasPassword(
        
        
        
        )
    }
    
    override fun updatePassword(
        
        body: UpdatePasswordRequestSchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiHelperClass.updatePassword(
        
        
        body = body
        )
    }
    
    override fun logout(
        
        
    )
    : Deferred<Response<LogoutSuccess>> {
        return userApiHelperClass.logout(
        
        
        
        )
    }
    
    override fun sendOTPOnMobile(
         platform: String?,
        body: SendMobileOtpRequestSchema
    )
    : Deferred<Response<OtpSuccess>> {
        return userApiHelperClass.sendOTPOnMobile(
        
        platform = platform,
        body = body
        )
    }
    
    override fun verifyMobileOTP(
         platform: String?,
        body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>> {
        return userApiHelperClass.verifyMobileOTP(
        
        platform = platform,
        body = body
        )
    }
    
    override fun sendOTPOnEmail(
         platform: String?,
        body: SendEmailOtpRequestSchema
    )
    : Deferred<Response<EmailOtpSuccess>> {
        return userApiHelperClass.sendOTPOnEmail(
        
        platform = platform,
        body = body
        )
    }
    
    override fun verifyEmailOTP(
         platform: String?,
        body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>> {
        return userApiHelperClass.verifyEmailOTP(
        
        platform = platform,
        body = body
        )
    }
    
    override fun getLoggedInUser(
        
        
    )
    : Deferred<Response<UserSchema>> {
        return userApiHelperClass.getLoggedInUser(
        
        
        
        )
    }
    
    override fun getListOfActiveSessions(
        
        
    )
    : Deferred<Response<SessionListSuccess>> {
        return userApiHelperClass.getListOfActiveSessions(
        
        
        
        )
    }
    
    override fun getPlatformConfig(
         name: String?
        
    )
    : Deferred<Response<PlatformSchema>> {
        return userApiHelperClass.getPlatformConfig(
        
        name = name
        
        )
    }
    
    override fun updateProfile(
         platform: String?,
        body: EditProfileRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.updateProfile(
        
        platform = platform,
        body = body
        )
    }
    
    override fun addMobileNumber(
         platform: String?,
        body: EditMobileRequestSchema
    )
    : Deferred<Response<VerifyMobileOTPSuccess>> {
        return userApiHelperClass.addMobileNumber(
        
        platform = platform,
        body = body
        )
    }
    
    override fun deleteMobileNumber( active: Boolean, primary: Boolean, verified: Boolean, country_code: String, phone: String,
         platform: String?
        
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.deleteMobileNumber(
        active = active,primary = primary,verified = verified,country_code = country_code,phone = phone,
        platform = platform
        
        )
    }
    
    override fun setMobileNumberAsPrimary(
        
        body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.setMobileNumberAsPrimary(
        
        
        body = body
        )
    }
    
    override fun sendVerificationLinkToMobile(
         platform: String?,
        body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<SendMobileVerifyLinkSuccess>> {
        return userApiHelperClass.sendVerificationLinkToMobile(
        
        platform = platform,
        body = body
        )
    }
    
    override fun addEmail(
         platform: String?,
        body: EditEmailRequestSchema
    )
    : Deferred<Response<VerifyEmailOTPSuccess>> {
        return userApiHelperClass.addEmail(
        
        platform = platform,
        body = body
        )
    }
    
    override fun deleteEmail( active: Boolean, primary: Boolean, verified: Boolean, email: String,
         platform: String?
        
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.deleteEmail(
        active = active,primary = primary,verified = verified,email = email,
        platform = platform
        
        )
    }
    
    override fun setEmailAsPrimary(
        
        body: EditEmailRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiHelperClass.setEmailAsPrimary(
        
        
        body = body
        )
    }
    
    override fun sendVerificationLinkToEmail(
         platform: String?,
        body: EditEmailRequestSchema
    )
    : Deferred<Response<SendEmailVerifyLinkSuccess>> {
        return userApiHelperClass.sendVerificationLinkToEmail(
        
        platform = platform,
        body = body
        )
    }
    
}

class ContentDataManagerClass(val config: ApplicationConfig) : ContentDataManager {
    
    val contentApiHelperClass by lazy {
        ContentApiHelperClass(config)
    }
    
    override fun getAnnouncements(
        
        
    )
    : Deferred<Response<AnnouncementsResponseSchema>> {
        return contentApiHelperClass.getAnnouncements(
        
        
        
        )
    }
    
    override fun getBlog( slug: String
        
        
    )
    : Deferred<Response<CustomBlog>> {
        return contentApiHelperClass.getBlog(
        slug = slug
        
        
        )
    }
    
    override fun getFaqs(
        
        
    )
    : Deferred<Response<FaqResponseSchema>> {
        return contentApiHelperClass.getFaqs(
        
        
        
        )
    }
    
    override fun getLandingPage( x-device-platform: String
        
        
    )
    : Deferred<Response<LandingPage>> {
        return contentApiHelperClass.getLandingPage(
        x-device-platform = x-device-platform
        
        
        )
    }
    
    override fun getLegalInformation(
        
        
    )
    : Deferred<Response<ApplicationLegal>> {
        return contentApiHelperClass.getLegalInformation(
        
        
        
        )
    }
    
    override fun getNavigations( x-device-platform: String
        
        
    )
    : Deferred<Response<Navigation>> {
        return contentApiHelperClass.getNavigations(
        x-device-platform = x-device-platform
        
        
        )
    }
    
    override fun getPage( slug: String
        
        
    )
    : Deferred<Response<CustomPage>> {
        return contentApiHelperClass.getPage(
        slug = slug
        
        
        )
    }
    
    override fun getSeoConfiguration(
        
        
    )
    : Deferred<Response<Seo>> {
        return contentApiHelperClass.getSeoConfiguration(
        
        
        
        )
    }
    
    override fun getSlideshow( slug: String, x-device-platform: String
        
        
    )
    : Deferred<Response<Slideshow>> {
        return contentApiHelperClass.getSlideshow(
        slug = slug,x-device-platform = x-device-platform
        
        
        )
    }
    
    override fun getSupportInformation(
        
        
    )
    : Deferred<Response<Support>> {
        return contentApiHelperClass.getSupportInformation(
        
        
        
        )
    }
    
    override fun getTags(
        
        
    )
    : Deferred<Response<TagsSchema>> {
        return contentApiHelperClass.getTags(
        
        
        
        )
    }
    
}

class CommunicationDataManagerClass(val config: ApplicationConfig) : CommunicationDataManager {
    
    val communicationApiHelperClass by lazy {
        CommunicationApiHelperClass(config)
    }
    
    override fun getCommunicationConsent(
        
        
    )
    : Deferred<Response<CommunicationConsent>> {
        return communicationApiHelperClass.getCommunicationConsent(
        
        
        
        )
    }
    
    override fun upsertCommunicationConsent(
        
        body: CommunicationConsentReq
    )
    : Deferred<Response<CommunicationConsentRes>> {
        return communicationApiHelperClass.upsertCommunicationConsent(
        
        
        body = body
        )
    }
    
    override fun upsertPushtoken(
        
        body: PushtokenReq
    )
    : Deferred<Response<PushtokenRes>> {
        return communicationApiHelperClass.upsertPushtoken(
        
        
        body = body
        )
    }
    
}

class ShareDataManagerClass(val config: ApplicationConfig) : ShareDataManager {
    
    val shareApiHelperClass by lazy {
        ShareApiHelperClass(config)
    }
    
    override fun getApplicationQRCode(
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getApplicationQRCode(
        
        
        
        )
    }
    
    override fun getProductQRCodeBySlug( slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getProductQRCodeBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getCollectionQRCodeBySlug( slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getCollectionQRCodeBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getUrlQRCode( url: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getUrlQRCode(
        url = url
        
        
        )
    }
    
    override fun createShortLink(
        
        body: ShortLinkReq
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.createShortLink(
        
        
        body = body
        )
    }
    
    override fun getShortLinkByHash( hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getShortLinkByHash(
        hash = hash
        
        
        )
    }
    
    override fun getOriginalShortLinkByHash( hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getOriginalShortLinkByHash(
        hash = hash
        
        
        )
    }
    
}

class FileStorageDataManagerClass(val config: ApplicationConfig) : FileStorageDataManager {
    
    val fileStorageApiHelperClass by lazy {
        FileStorageApiHelperClass(config)
    }
    
    override fun completeUpload( namespace: String, company_id: Int,
        
        body: StartResponse
    )
    : Deferred<Response<CompleteResponse>> {
        return fileStorageApiHelperClass.completeUpload(
        namespace = namespace,company_id = company_id,
        
        body = body
        )
    }
    
    override fun startUpload( namespace: String, company_id: Int,
        
        body: StartRequest
    )
    : Deferred<Response<StartResponse>> {
        return fileStorageApiHelperClass.startUpload(
        namespace = namespace,company_id = company_id,
        
        body = body
        )
    }
    
}

class OrderDataManagerClass(val config: ApplicationConfig) : OrderDataManager {
    
    val orderApiHelperClass by lazy {
        OrderApiHelperClass(config)
    }
    
    override fun getOrders(
         page_no: String?, page_size: String?, from_date: String?, to_date: String?
        
    )
    : Deferred<Response<OrderList>> {
        return orderApiHelperClass.getOrders(
        
        page_no = page_no,page_size = page_size,from_date = from_date,to_date = to_date
        
        )
    }
    
    override fun getOrderById( order_id: String
        
        
    )
    : Deferred<Response<OrderById>> {
        return orderApiHelperClass.getOrderById(
        order_id = order_id
        
        
        )
    }
    
    override fun getShipmentById( shipment_id: String
        
        
    )
    : Deferred<Response<ShipmentById>> {
        return orderApiHelperClass.getShipmentById(
        shipment_id = shipment_id
        
        
        )
    }
    
    override fun getShipmentReasons( shipment_id: String
        
        
    )
    : Deferred<Response<ShipmentReasons>> {
        return orderApiHelperClass.getShipmentReasons(
        shipment_id = shipment_id
        
        
        )
    }
    
    override fun updateShipmentStatus( shipment_id: String,
        
        body: ShipmentStatusUpdateBody
    )
    : Deferred<Response<ShipmentStatusUpdate>> {
        return orderApiHelperClass.updateShipmentStatus(
        shipment_id = shipment_id,
        
        body = body
        )
    }
    
    override fun trackShipment( shipment_id: String
        
        
    )
    : Deferred<Response<ShipmentTrack>> {
        return orderApiHelperClass.trackShipment(
        shipment_id = shipment_id
        
        
        )
    }
    
}

class FeedbackDataManagerClass(val config: ApplicationConfig) : FeedbackDataManager {
    
    val feedbackApiHelperClass by lazy {
        FeedbackApiHelperClass(config)
    }
    
    override fun createAbuseReport(
        
        body: ReportAbuseRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createAbuseReport(
        
        
        body = body
        )
    }
    
    override fun updateAbuseReport(
        
        body: UpdateAbuseStatusRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateAbuseReport(
        
        
        body = body
        )
    }
    
    override fun getAbuseReports( entity_id: String, entity_type: String,
         id: String?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiHelperClass.getAbuseReports(
        entity_id = entity_id,entity_type = entity_type,
        id = id,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getAttributes(
        
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiHelperClass.getAttributes(
        
        
        
        )
    }
    
    override fun createAttribute(
        
        body: SaveAttributeRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createAttribute(
        
        
        body = body
        )
    }
    
    override fun getAttribute( slug: String
        
        
    )
    : Deferred<Response<Attribute>> {
        return feedbackApiHelperClass.getAttribute(
        slug = slug
        
        
        )
    }
    
    override fun updateAttribute( slug: String,
        
        body: UpdateAttributeRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateAttribute(
        slug = slug,
        
        body = body
        )
    }
    
    override fun createComment(
        
        body: CommentRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createComment(
        
        
        body = body
        )
    }
    
    override fun updateComment(
        
        body: UpdateCommentRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateComment(
        
        
        body = body
        )
    }
    
    override fun getComments( entity_type: String,
         id: String?, entity_id: String?, user_id: String?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getComments(
        entity_type = entity_type,
        id = id,entity_id = entity_id,user_id = user_id,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun checkEligibility( entity_type: String, entity_id: String
        
        
    )
    : Deferred<Response<CheckEligibilityResponse>> {
        return feedbackApiHelperClass.checkEligibility(
        entity_type = entity_type,entity_id = entity_id
        
        
        )
    }
    
    override fun deleteMedia(
        
        
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.deleteMedia(
        
        
        
        )
    }
    
    override fun createMedia(
        
        body: AddMediaListRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createMedia(
        
        
        body = body
        )
    }
    
    override fun updateMedia(
        
        body: UpdateMediaListRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateMedia(
        
        
        body = body
        )
    }
    
    override fun getMedias( entity_type: String, entity_id: String,
         id: String?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getMedias(
        entity_type = entity_type,entity_id = entity_id,
        id = id,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getReviewSummaries( entity_type: String, entity_id: String,
         id: String?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getReviewSummaries(
        entity_type = entity_type,entity_id = entity_id,
        id = id,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun createReview(
        
        body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.createReview(
        
        
        body = body
        )
    }
    
    override fun updateReview(
        
        body: UpdateReviewRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateReview(
        
        
        body = body
        )
    }
    
    override fun getReviews( entity_type: String, entity_id: String,
         id: String?, user_id: String?, media: String?, rating: ArrayList<Double>?, attribute_rating: ArrayList<String>?, facets: Boolean?, sort: String?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getReviews(
        entity_type = entity_type,entity_id = entity_id,
        id = id,user_id = user_id,media = media,rating = rating,attribute_rating = attribute_rating,facets = facets,sort = sort,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getTemplates(
         template_id: String?, entity_id: String?, entity_type: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getTemplates(
        
        template_id = template_id,entity_id = entity_id,entity_type = entity_type
        
        )
    }
    
    override fun createQuestion(
        
        body: CreateQNARequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createQuestion(
        
        
        body = body
        )
    }
    
    override fun updateQuestion(
        
        body: UpdateQNARequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateQuestion(
        
        
        body = body
        )
    }
    
    override fun getQuestionAndAnswers( entity_type: String, entity_id: String,
         id: String?, show_answer: Boolean?, page_id: String?, page_size: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiHelperClass.getQuestionAndAnswers(
        entity_type = entity_type,entity_id = entity_id,
        id = id,show_answer = show_answer,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getVotes(
         id: String?, ref_type: String?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiHelperClass.getVotes(
        
        id = id,ref_type = ref_type
        
        )
    }
    
    override fun createVote(
        
        body: VoteRequest
    )
    : Deferred<Response<XInsertResponse>> {
        return feedbackApiHelperClass.createVote(
        
        
        body = body
        )
    }
    
    override fun updateVote(
        
        body: UpdateVoteRequest
    )
    : Deferred<Response<XUpdateResponse>> {
        return feedbackApiHelperClass.updateVote(
        
        
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
    : Deferred<Response<CartResponse>> {
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
    : Deferred<Response<AddCartResponse>> {
        return posCartApiHelperClass.addItems(
        
        
        body = body
        )
    }
    
    override fun updateCart(
        
        body: UpdateCartRequest
    )
    : Deferred<Response<UpdateCartResponse>> {
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
    
    override fun getAvailableDeliveryModes( area_code: Int,
         uid: Int?
        
    )
    : Deferred<Response<CartDeliveryModesResponse>> {
        return posCartApiHelperClass.getAvailableDeliveryModes(
        area_code = area_code,
        uid = uid
        
        )
    }
    
    override fun getStoreAddressByUid( area_code: Int
        
        
    )
    : Deferred<Response<StoreDetailsResponse>> {
        return posCartApiHelperClass.getStoreAddressByUid(
        area_code = area_code
        
        
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

