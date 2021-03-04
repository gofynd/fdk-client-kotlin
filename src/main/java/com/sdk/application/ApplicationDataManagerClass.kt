package com.sdk.application

import com.sdk.common.*
import kotlinx.coroutines.Deferred
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response

class CatalogDataManagerClass(val config: ApplicationConfig) : CatalogApiList,BaseRepository() {
    
    val catalogApiList by lazy {
        generatecatalogApiList()
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

    
    override fun getProductDetailBySlug(
        slug: String
        
    )
    : Deferred<Response<ProductDetail>> {
        return catalogApiList.getProductDetailBySlug(
        slug = slug 
        
        )
    }


    


    override fun getProductSizesBySlug(
        slug: String, storeId: String?
        
    )
    : Deferred<Response<ProductSizes>> {
        return catalogApiList.getProductSizesBySlug(
        slug = slug, storeId = storeId 
        
        )
    }


    


    override fun getProductPriceBySlug(
        slug: String, size: String, pincode: Int?, storeId: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiList.getProductPriceBySlug(
        slug = slug, size = size, pincode = pincode, storeId = storeId 
        
        )
    }


    


    override fun getProductSellersBySlug(
        slug: String, size: String, pincode: Int?, pageNo: Int?, pageSize: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiList.getProductSellersBySlug(
        slug = slug, size = size, pincode = pincode, pageNo = pageNo, pageSize = pageSize 
        
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
        slug: String, similarType: String
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiList.getProductSimilarByIdentifier(
        slug = slug, similarType = similarType 
        
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
        itemId: String?, alu: String?, skuCode: String?, ean: String?, upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiList.getProductStockByIds(
        itemId = itemId, alu = alu, skuCode = skuCode, ean = ean, upc = upc 
        
        )
    }


    


    override fun getProductStockForTimeByIds(
        timestamp: String, pageSize: Int?, pageId: String?
        
    )
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiList.getProductStockForTimeByIds(
        timestamp = timestamp, pageSize = pageSize, pageId = pageId 
        
        )
    }


    


    override fun getProducts(
        q: String?, f: String?, filters: Boolean?, sortOn: String?, pageId: String?, pageSize: Int?, pageNo: Int?, pageType: String?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiList.getProducts(
        q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType 
        
        )
    }


    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
/**
*
* Summary: Paginator for getProducts
**/
fun getProductsPaginator(
    q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null
    
) : Paginator<ProductListingResponse>{


    val paginator = Paginator<ProductListingResponse>()

    paginator.setCallBack(object : PaginatorCallback<ProductListingResponse> {
            override suspend fun onNext(
                onSuccess: (Event<ProductListingResponse>) -> Unit,
                onFailure: (FdkError) -> Unit
            ) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                catalogApiList.getProducts(
                q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType
                
                ).safeAwait(onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                    
                    onSuccess.invoke(response)

                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
            }

        })
        return paginator

}



    override fun getBrands(
        department: String?, pageNo: Int?, pageSize: Int?
        
    )
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiList.getBrands(
        department = department, pageNo = pageNo, pageSize = pageSize 
        
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
        sortOn: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiList.getHomeProducts(
        sortOn = sortOn, pageId = pageId, pageSize = pageSize 
        
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
        pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiList.getCollections(
        pageId = pageId, pageSize = pageSize 
        
        )
    }


    


    override fun getCollectionItemsBySlug(
        slug: String, f: String?, filters: Boolean?, sortOn: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiList.getCollectionItemsBySlug(
        slug = slug, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize 
        
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
        collectionType: String
        
    )
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiList.getFollowedListing(
        collectionType = collectionType 
        
        )
    }


    


    override fun unfollowById(
        collectionType: String, collectionId: Int
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.unfollowById(
        collectionType = collectionType, collectionId = collectionId 
        
        )
    }


    


    override fun followById(
        collectionType: String, collectionId: Int
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.followById(
        collectionType = collectionType, collectionId = collectionId 
        
        )
    }


    


    override fun getFollowerCountById(
        collectionType: String, collectionId: String
        
    )
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiList.getFollowerCountById(
        collectionType = collectionType, collectionId = collectionId 
        
        )
    }


    


    override fun getFollowIds(
        collectionType: String?
        
    )
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiList.getFollowIds(
        collectionType = collectionType 
        
        )
    }


    


    override fun getStores(
        pageNo: Int?, pageSize: Int?, q: String?, range: Int?, latitude: Double?, longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiList.getStores(
        pageNo = pageNo, pageSize = pageSize, q = q, range = range, latitude = latitude, longitude = longitude 
        
        )
    }


    


}

class CartDataManagerClass(val config: ApplicationConfig) : CartApiList,BaseRepository() {
    
    val cartApiList by lazy {
        generatecartApiList()
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

    
    override fun getCart(
        uid: Int?, assignCardId: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return cartApiList.getCart(
        uid = uid, assignCardId = assignCardId 
        
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
        i: Boolean?, b: Boolean?, p: Boolean?,
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
        itemId: Int?, articleId: String?, uid: Int?, slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return cartApiList.getBulkDiscountOffers(
        itemId = itemId, articleId = articleId, uid = uid, slug = slug 
        
        )
    }


    


    override fun getAddresses(
        uid: Int?, mobileNo: Int?, checkoutMode: String?, tags: Int?, isDefault: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiList.getAddresses(
        uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault 
        
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
        id: Int, uid: Int?, mobileNo: Int?, checkoutMode: String?, tags: Int?, isDefault: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return cartApiList.getAddressById(
        id = id, uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault 
        
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
        uid: String?, addressId: String?, paymentMode: String?, paymentIdentifier: String?, aggregatorName: String?, merchantCode: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return cartApiList.getPaymentModes(
        uid = uid, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode 
        
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
        p: Boolean?, uid: Int?, addressId: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return cartApiList.getShipments(
        p = p, uid = uid, addressId = addressId 
        
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
        token: String, action: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return cartApiList.updateCartWithSharedItems(
        token = token, action = action 
        
        )
    }


    


}

class LeadDataManagerClass(val config: ApplicationConfig) : LeadApiList,BaseRepository() {
    
    val leadApiList by lazy {
        generateleadApiList()
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

    
    override fun getTicket(
        id: String
        
    )
    : Deferred<Response<Ticket>> {
        return leadApiList.getTicket(
        id = id 
        
        )
    }


    


    override fun createHistoryForTicket(
        ticketId: String,
        body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>> {
        return leadApiList.createHistoryForTicket(
        ticketId = ticketId, 
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
        uniqueName: String
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiList.getParticipantsInsideVideoRoom(
        uniqueName = uniqueName 
        
        )
    }


    


    override fun getTokenForVideoRoom(
        uniqueName: String
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiList.getTokenForVideoRoom(
        uniqueName = uniqueName 
        
        )
    }


    


}

class ThemeDataManagerClass(val config: ApplicationConfig) : ThemeApiList,BaseRepository() {
    
    val themeApiList by lazy {
        generatethemeApiList()
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

    
    override fun getAppliedTheme(
        
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiList.getAppliedTheme(
         
        
        )
    }


    


    override fun getThemeForPreview(
        themeId: String
        
    )
    : Deferred<Response<ThemesSchema>> {
        return themeApiList.getThemeForPreview(
        themeId = themeId 
        
        )
    }


    


}

class UserDataManagerClass(val config: ApplicationConfig) : UserApiList,BaseRepository() {
    
    val userApiList by lazy {
        generateuserApiList()
    }

    private fun generateuserApiList(): UserApiList {
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
            headerList, interceptorMap, "User"
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as UserApiList
    }

    
    override fun loginWithFacebook(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiList.loginWithFacebook(
         
        body = body
        )
    }


    


    override fun loginWithGoogle(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiList.loginWithGoogle(
         
        body = body
        )
    }


    


    override fun loginWithGoogleAndroid(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiList.loginWithGoogleAndroid(
         
        body = body
        )
    }


    


    override fun loginWithGoogleIOS(
        
        body: OAuthRequestSchema
    )
    : Deferred<Response<AuthSuccess>> {
        return userApiList.loginWithGoogleIOS(
         
        body = body
        )
    }


    


    override fun loginWithOTP(
        platform: String?,
        body: SendOtpRequestSchema
    )
    : Deferred<Response<SendOtpResponse>> {
        return userApiList.loginWithOTP(
        platform = platform, 
        body = body
        )
    }


    


    override fun loginWithEmailAndPassword(
        
        body: PasswordLoginRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.loginWithEmailAndPassword(
         
        body = body
        )
    }


    


    override fun sendResetPasswordEmail(
        platform: String?,
        body: SendResetPasswordEmailRequestSchema
    )
    : Deferred<Response<ResetPasswordSuccess>> {
        return userApiList.sendResetPasswordEmail(
        platform = platform, 
        body = body
        )
    }


    


    override fun forgotPassword(
        
        body: ForgotPasswordRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.forgotPassword(
         
        body = body
        )
    }


    


    override fun sendResetToken(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<ResetPasswordSuccess>> {
        return userApiList.sendResetToken(
         
        body = body
        )
    }


    


    override fun loginWithToken(
        
        body: TokenRequestBodySchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.loginWithToken(
         
        body = body
        )
    }


    


    override fun registerWithForm(
        platform: String?,
        body: FormRegisterRequestSchema
    )
    : Deferred<Response<RegisterFormSuccess>> {
        return userApiList.registerWithForm(
        platform = platform, 
        body = body
        )
    }


    


    override fun verifyEmail(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiList.verifyEmail(
         
        body = body
        )
    }


    


    override fun verifyMobile(
        
        body: CodeRequestBodySchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiList.verifyMobile(
         
        body = body
        )
    }


    


    override fun hasPassword(
        
        
    )
    : Deferred<Response<HasPasswordSuccess>> {
        return userApiList.hasPassword(
         
        
        )
    }


    


    override fun updatePassword(
        
        body: UpdatePasswordRequestSchema
    )
    : Deferred<Response<VerifyEmailSuccess>> {
        return userApiList.updatePassword(
         
        body = body
        )
    }


    


    override fun logout(
        
        
    )
    : Deferred<Response<LogoutSuccess>> {
        return userApiList.logout(
         
        
        )
    }


    


    override fun sendOTPOnMobile(
        platform: String?,
        body: SendMobileOtpRequestSchema
    )
    : Deferred<Response<OtpSuccess>> {
        return userApiList.sendOTPOnMobile(
        platform = platform, 
        body = body
        )
    }


    


    override fun verifyMobileOTP(
        platform: String?,
        body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>> {
        return userApiList.verifyMobileOTP(
        platform = platform, 
        body = body
        )
    }


    


    override fun sendOTPOnEmail(
        platform: String?,
        body: SendEmailOtpRequestSchema
    )
    : Deferred<Response<EmailOtpSuccess>> {
        return userApiList.sendOTPOnEmail(
        platform = platform, 
        body = body
        )
    }


    


    override fun verifyEmailOTP(
        platform: String?,
        body: VerifyOtpRequestSchema
    )
    : Deferred<Response<VerifyOtpSuccess>> {
        return userApiList.verifyEmailOTP(
        platform = platform, 
        body = body
        )
    }


    


    override fun getLoggedInUser(
        
        
    )
    : Deferred<Response<UserSchema>> {
        return userApiList.getLoggedInUser(
         
        
        )
    }


    


    override fun getListOfActiveSessions(
        
        
    )
    : Deferred<Response<SessionListSuccess>> {
        return userApiList.getListOfActiveSessions(
         
        
        )
    }


    


    override fun getPlatformConfig(
        name: String?
        
    )
    : Deferred<Response<PlatformSchema>> {
        return userApiList.getPlatformConfig(
        name = name 
        
        )
    }


    


    override fun updateProfile(
        platform: String?,
        body: EditProfileRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.updateProfile(
        platform = platform, 
        body = body
        )
    }


    


    override fun addMobileNumber(
        platform: String?,
        body: EditMobileRequestSchema
    )
    : Deferred<Response<VerifyMobileOTPSuccess>> {
        return userApiList.addMobileNumber(
        platform = platform, 
        body = body
        )
    }


    


    override fun deleteMobileNumber(
        platform: String?, active: Boolean, primary: Boolean, verified: Boolean, countryCode: String, phone: String
        
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.deleteMobileNumber(
        platform = platform, active = active, primary = primary, verified = verified, countryCode = countryCode, phone = phone 
        
        )
    }


    


    override fun setMobileNumberAsPrimary(
        
        body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.setMobileNumberAsPrimary(
         
        body = body
        )
    }


    


    override fun sendVerificationLinkToMobile(
        platform: String?,
        body: SendVerificationLinkMobileRequestSchema
    )
    : Deferred<Response<SendMobileVerifyLinkSuccess>> {
        return userApiList.sendVerificationLinkToMobile(
        platform = platform, 
        body = body
        )
    }


    


    override fun addEmail(
        platform: String?,
        body: EditEmailRequestSchema
    )
    : Deferred<Response<VerifyEmailOTPSuccess>> {
        return userApiList.addEmail(
        platform = platform, 
        body = body
        )
    }


    


    override fun deleteEmail(
        platform: String?, active: Boolean, primary: Boolean, verified: Boolean, email: String
        
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.deleteEmail(
        platform = platform, active = active, primary = primary, verified = verified, email = email 
        
        )
    }


    


    override fun setEmailAsPrimary(
        
        body: EditEmailRequestSchema
    )
    : Deferred<Response<LoginSuccess>> {
        return userApiList.setEmailAsPrimary(
         
        body = body
        )
    }


    


    override fun sendVerificationLinkToEmail(
        platform: String?,
        body: EditEmailRequestSchema
    )
    : Deferred<Response<SendEmailVerifyLinkSuccess>> {
        return userApiList.sendVerificationLinkToEmail(
        platform = platform, 
        body = body
        )
    }


    


}

class ContentDataManagerClass(val config: ApplicationConfig) : ContentApiList,BaseRepository() {
    
    val contentApiList by lazy {
        generatecontentApiList()
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
        xDevicePlatform: String
        
    )
    : Deferred<Response<LandingPage>> {
        return contentApiList.getLandingPage(
        xDevicePlatform = xDevicePlatform 
        
        )
    }


    


    override fun getLegalInformation(
        
        
    )
    : Deferred<Response<ApplicationLegal>> {
        return contentApiList.getLegalInformation(
         
        
        )
    }


    


    override fun getNavigations(
        xDevicePlatform: String
        
    )
    : Deferred<Response<Navigation>> {
        return contentApiList.getNavigations(
        xDevicePlatform = xDevicePlatform 
        
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
        slug: String, xDevicePlatform: String
        
    )
    : Deferred<Response<Slideshow>> {
        return contentApiList.getSlideshow(
        slug = slug, xDevicePlatform = xDevicePlatform 
        
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


    


}

class CommunicationDataManagerClass(val config: ApplicationConfig) : CommunicationApiList,BaseRepository() {
    
    val communicationApiList by lazy {
        generatecommunicationApiList()
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


    


}

class ShareDataManagerClass(val config: ApplicationConfig) : ShareApiList,BaseRepository() {
    
    val shareApiList by lazy {
        generateshareApiList()
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


    


}

class FileStorageDataManagerClass(val config: ApplicationConfig) : FileStorageApiList,BaseRepository() {
    
    val fileStorageApiList by lazy {
        generatefileStorageApiList()
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

    
    override fun completeUpload(
        namespace: String, companyId: Int,
        body: StartResponse
    )
    : Deferred<Response<CompleteResponse>> {
        return fileStorageApiList.completeUpload(
        namespace = namespace, companyId = companyId, 
        body = body
        )
    }


    


    override fun startUpload(
        namespace: String, companyId: Int,
        body: StartRequest
    )
    : Deferred<Response<StartResponse>> {
        return fileStorageApiList.startUpload(
        namespace = namespace, companyId = companyId, 
        body = body
        )
    }


    


}

class PaymentDataManagerClass(val config: ApplicationConfig) : PaymentApiList,BaseRepository() {
    
    val paymentApiList by lazy {
        generatepaymentApiList()
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

    
    override fun getAggregatorsConfig(
        xApiToken: String, refresh: Boolean?
        
    )
    : Deferred<Response<AggregatorsConfigDetailResponse>> {
        return paymentApiList.getAggregatorsConfig(
        xApiToken = xApiToken, refresh = refresh 
        
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
        forceRefresh: Boolean?
        
    )
    : Deferred<Response<ListCardsResponse>> {
        return paymentApiList.getActiveUserCards(
        forceRefresh = forceRefresh 
        
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
        amount: Int, cartId: String, pincode: Int, checkoutMode: String, refresh: Boolean?, assignCardId: String?, deliveryAddress: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>> {
        return paymentApiList.getPaymentModeRoutes(
        amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, assignCardId = assignCardId, deliveryAddress = deliveryAddress 
        
        )
    }


    


    override fun getPosPaymentModeRoutes(
        amount: Int, cartId: String, pincode: Int, checkoutMode: String, refresh: Boolean?, assignCardId: String?, orderType: String, deliveryAddress: String?
        
    )
    : Deferred<Response<PaymentOptionsResponse>> {
        return paymentApiList.getPosPaymentModeRoutes(
        amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, assignCardId = assignCardId, orderType = orderType, deliveryAddress = deliveryAddress 
        
        )
    }


    


    override fun getUserBeneficiariesDetail(
        orderId: String
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiList.getUserBeneficiariesDetail(
        orderId = orderId 
        
        )
    }


    


    override fun verifyIfscCode(
        ifscCode: String?
        
    )
    : Deferred<Response<IfscCodeResponse>> {
        return paymentApiList.verifyIfscCode(
        ifscCode = ifscCode 
        
        )
    }


    


    override fun getOrderBeneficiariesDetail(
        orderId: String
        
    )
    : Deferred<Response<OrderBeneficiaryResponse>> {
        return paymentApiList.getOrderBeneficiariesDetail(
        orderId = orderId 
        
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


    


}

class OrderDataManagerClass(val config: ApplicationConfig) : OrderApiList,BaseRepository() {
    
    val orderApiList by lazy {
        generateorderApiList()
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

    
    override fun getOrders(
        pageNo: String?, pageSize: String?, fromDate: String?, toDate: String?
        
    )
    : Deferred<Response<OrderList>> {
        return orderApiList.getOrders(
        pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate 
        
        )
    }


    


    override fun getOrderById(
        orderId: String
        
    )
    : Deferred<Response<OrderById>> {
        return orderApiList.getOrderById(
        orderId = orderId 
        
        )
    }


    


    override fun getShipmentById(
        shipmentId: String
        
    )
    : Deferred<Response<ShipmentById>> {
        return orderApiList.getShipmentById(
        shipmentId = shipmentId 
        
        )
    }


    


    override fun getShipmentReasons(
        shipmentId: String
        
    )
    : Deferred<Response<ShipmentReasons>> {
        return orderApiList.getShipmentReasons(
        shipmentId = shipmentId 
        
        )
    }


    


    override fun updateShipmentStatus(
        shipmentId: String,
        body: ShipmentStatusUpdateBody
    )
    : Deferred<Response<ShipmentStatusUpdate>> {
        return orderApiList.updateShipmentStatus(
        shipmentId = shipmentId, 
        body = body
        )
    }


    


    override fun trackShipment(
        shipmentId: String
        
    )
    : Deferred<Response<ShipmentTrack>> {
        return orderApiList.trackShipment(
        shipmentId = shipmentId 
        
        )
    }


    


}

class RewardsDataManagerClass(val config: ApplicationConfig) : RewardsApiList,BaseRepository() {
    
    val rewardsApiList by lazy {
        generaterewardsApiList()
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
        pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<PointsHistoryResponse>> {
        return rewardsApiList.getUserPointsHistory(
        pageId = pageId, pageSize = pageSize 
        
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


    


}

class FeedbackDataManagerClass(val config: ApplicationConfig) : FeedbackApiList,BaseRepository() {
    
    val feedbackApiList by lazy {
        generatefeedbackApiList()
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
        entityId: String, entityType: String, id: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiList.getAbuseReports(
        entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize 
        
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
        entityType: String, id: String?, entityId: String?, userId: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getComments(
        entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize 
        
        )
    }


    


    override fun checkEligibility(
        entityType: String, entityId: String
        
    )
    : Deferred<Response<CheckEligibilityResponse>> {
        return feedbackApiList.checkEligibility(
        entityType = entityType, entityId = entityId 
        
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
        entityType: String, entityId: String, id: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getMedias(
        entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize 
        
        )
    }


    


    override fun getReviewSummaries(
        entityType: String, entityId: String, id: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getReviewSummaries(
        entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize 
        
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
        entityType: String, entityId: String, id: String?, userId: String?, media: String?, rating: ArrayList<Double>?, attributeRating: ArrayList<String>?, facets: Boolean?, sort: String?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getReviews(
        entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, pageId = pageId, pageSize = pageSize 
        
        )
    }


    


    override fun getTemplates(
        templateId: String?, entityId: String?, entityType: String?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getTemplates(
        templateId = templateId, entityId = entityId, entityType = entityType 
        
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
        entityType: String, entityId: String, id: String?, showAnswer: Boolean?, pageId: String?, pageSize: Int?
        
    )
    : Deferred<Response<XCursorGetResponse>> {
        return feedbackApiList.getQuestionAndAnswers(
        entityType = entityType, entityId = entityId, id = id, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize 
        
        )
    }


    


    override fun getVotes(
        id: String?, refType: String?
        
    )
    : Deferred<Response<XNumberGetResponse>> {
        return feedbackApiList.getVotes(
        id = id, refType = refType 
        
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


    


}

class PosCartDataManagerClass(val config: ApplicationConfig) : PosCartApiList,BaseRepository() {
    
    val posCartApiList by lazy {
        generateposCartApiList()
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

    
    override fun getCart(
        uid: Int?, assignCardId: Int?
        
    )
    : Deferred<Response<CartResponse>> {
        return posCartApiList.getCart(
        uid = uid, assignCardId = assignCardId 
        
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
        i: Boolean?, b: Boolean?, p: Boolean?,
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
        itemId: Int?, articleId: String?, uid: Int?, slug: String?
        
    )
    : Deferred<Response<BulkPriceResponse>> {
        return posCartApiList.getBulkDiscountOffers(
        itemId = itemId, articleId = articleId, uid = uid, slug = slug 
        
        )
    }


    


    override fun getAddresses(
        uid: Int?, mobileNo: Int?, checkoutMode: String?, tags: Int?, isDefault: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiList.getAddresses(
        uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault 
        
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
        id: Int, uid: Int?, mobileNo: Int?, checkoutMode: String?, tags: Int?, isDefault: Boolean?
        
    )
    : Deferred<Response<GetAddressResponse>> {
        return posCartApiList.getAddressById(
        id = id, uid = uid, mobileNo = mobileNo, checkoutMode = checkoutMode, tags = tags, isDefault = isDefault 
        
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
        uid: String?, addressId: String?, paymentMode: String?, paymentIdentifier: String?, aggregatorName: String?, merchantCode: String?
        
    )
    : Deferred<Response<PaymentOptions>> {
        return posCartApiList.getPaymentModes(
        uid = uid, addressId = addressId, paymentMode = paymentMode, paymentIdentifier = paymentIdentifier, aggregatorName = aggregatorName, merchantCode = merchantCode 
        
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
        pickAtStoreUid: Int?, orderingStoreId: Int?, p: Boolean?, uid: Int?, addressId: Int?
        
    )
    : Deferred<Response<CartShipmentsResponse>> {
        return posCartApiList.getShipments(
        pickAtStoreUid = pickAtStoreUid, orderingStoreId = orderingStoreId, p = p, uid = uid, addressId = addressId 
        
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
        areaCode: Int, uid: Int?
        
    )
    : Deferred<Response<CartDeliveryModesResponse>> {
        return posCartApiList.getAvailableDeliveryModes(
        areaCode = areaCode, uid = uid 
        
        )
    }


    


    override fun getStoreAddressByUid(
        areaCode: Int
        
    )
    : Deferred<Response<StoreDetailsResponse>> {
        return posCartApiList.getStoreAddressByUid(
        areaCode = areaCode 
        
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
        token: String, action: String
        
    )
    : Deferred<Response<SharedCartResponse>> {
        return posCartApiList.updateCartWithSharedItems(
        token = token, action = action 
        
        )
    }


    


}

