package com.sdk.platform

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import com.sdk.common.*




class UserDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val userApiList by lazy {
        generateuserApiList()
    }
    
    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCustomers(q: String?=null, pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<CustomerListResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getCustomers(companyId = config.companyId , applicationId = applicationId , q = q, pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun searchUsers(q: String?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformConfig()
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getPlatformConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updatePlatformConfig(body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updatePlatformConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}

class PaymentDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }
    
    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformPayment",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    
    
    
    
    
    suspend fun getAllPayouts(uniqueExternalId: String?=null)
    : Deferred<Response<PayoutsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getAllPayouts(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun savePayout(body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.savePayout(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePayout(uniqueTransferNo: String,body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.updatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activateAndDectivatePayout(uniqueTransferNo: String,body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.activateAndDectivatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deletePayout(uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deletePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionPaymentMethod()
    : Deferred<Response<SubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSubscriptionPaymentMethod(uniqueExternalId: String, paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deleteSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId, paymentMethodId = paymentMethodId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionConfig()
    : Deferred<Response<SubscriptionConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun saveSubscriptionSetupIntent(body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.saveSubscriptionSetupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBrandPaymentGatewayConfig()
    : Deferred<Response<PaymentGatewayConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun saveBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.saveBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeRoutes(refresh: Boolean, requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeRoutes(companyId = config.companyId , applicationId = applicationId , refresh = refresh, requestType = requestType )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
}
}

class CatalogDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val catalogApiList by lazy {
        generatecatalogApiList()
    }
    
    private fun generatecatalogApiList(): CatalogApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCatalog",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createProductBundle(body: ProductBundleRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductBundle(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundle(q: String?=null)
    : Deferred<Response<GetProductBundleListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundleDetail(id: String)
    : Deferred<Response<GetProductBundleResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundleDetail(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun createSizeGuide(body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createSizeGuide(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuides(active: Boolean?=null, q: String?=null, tag: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ListSizeGuide>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuides(
        companyId = config.companyId, active = active, q = q, tag = tag, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateSizeGuide(id: String,body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateSizeGuide(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuide(id: String)
    : Deferred<Response<SizeGuideResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSellerInsights(sellerAppId: String)
    : Deferred<Response<CrossSellingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSellerInsights(
        companyId = config.companyId, sellerAppId = sellerAppId )
        } else {
            null
        } 
    }
    
    
    suspend fun createMarketplaceOptin(marketplace: String,body: OptInPostRequest)
    : Deferred<Response<UpdatedResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createMarketplaceOptin(
        companyId = config.companyId, marketplace = marketplace, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getMarketplaceOptinDetail()
    : Deferred<Response<GetOptInPlatform>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getMarketplaceOptinDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyDetail()
    : Deferred<Response<OptinCompanyDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyBrandDetail(isActive: Boolean?=null, q: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null, marketplace: String?=null)
    : Deferred<Response<OptinCompanyBrandDetailsView>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandDetail(
        companyId = config.companyId, isActive = isActive, q = q, pageNo = pageNo, pageSize = pageSize, marketplace = marketplace )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<OptinCompanyMetrics>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getStoreDetail(q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OptinStoreDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getStoreDetail(
        companyId = config.companyId, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateCategories(department: String, itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId, department = department, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun listDepartmentData()
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentData(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getDepertmantsData(uid: String)
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getDepertmantsData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplate(departments: String)
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId, departments = departments )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplate(slug: String)
    : Deferred<Response<TemplatesValidationResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplate(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateViews(slug: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateView(itemType: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateView(
        companyId = config.companyId, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplateSchema(itemType: String)
    : Deferred<Response<InventoryValidationResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplateSchema(
        companyId = config.companyId, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun listHSNCodes()
    : Deferred<Response<HSNCodesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listHSNCodes(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateExportDetails()
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String)
    : Deferred<Response<ProductConfligurationDownloads>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun createCategories(body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createCategories(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listCategories(level: String?=null, q: String?=null)
    : Deferred<Response<CategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId, level = level, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCategory(uid: String,body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateCategory(
        companyId = config.companyId, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCategoryData(uid: String)
    : Deferred<Response<Category>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun createProduct(body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProducts(brandIds: Double?=null, categoryIds: Double?=null, search: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, search = search, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProduct(itemId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun editProduct(itemId: String,body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.editProduct(
        companyId = config.companyId, itemId = itemId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProduct(itemCode: String?=null, itemId: String, brandUid: Int?=null, uid: Int?=null)
    : Deferred<Response<Product>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductValidation()
    : Deferred<Response<ValidateProduct>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductValidation(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductSize(itemCode: String?=null, itemId: String, brandUid: Int?=null, uid: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductSize(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateProductAssetsInBulk(body: BulkJob)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductBulkRequestList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductsInBulk(batchId: String,body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductsInBulk(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProductBulkJob(batchId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProductBulkJob(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyTags()
    : Deferred<Response<ProductTagsViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyTags(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductAssetsInBulk(body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductAssetsInBulk(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkAssetResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAssetsInBulk(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSize(itemId: String, size: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteSize(
        companyId = config.companyId, itemId = itemId, size = size )
        } else {
            null
        } 
    }
    
    
    suspend fun addInventory(itemId: String, size: String,body: InventoryRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.addInventory(
        companyId = config.companyId, itemId = itemId, size = size, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventory(itemId: String, size: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<InventoryRequest1>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventory(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteInventory(itemId: String, locationId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteInventory(
        companyId = config.companyId, itemId = itemId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventoryJob(body: BulkJob)
    : Deferred<Response<CommonResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventoryJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkRequestGet>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventory(body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteBulkInventoryJob()
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExportJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryExport()
    : Deferred<Response<InventoryExportJob>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExport(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun exportInventoryConfig(filterType: String?=null)
    : Deferred<Response<InventoryConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.exportInventoryConfig(
        companyId = config.companyId, filterType = filterType )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun deleteSearchKeywords(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchKeywords(id: String,body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchKeywords(id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomKeyword(body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomKeyword(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllSearchKeyword()
    : Deferred<Response<GetSearchWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllSearchKeyword(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun deleteAutocompleteKeyword(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteKeywordDetail(id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomAutocompleteRule(body: CreateAutocompleteKeyword)
    : Deferred<Response<CreateAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomAutocompleteRule(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteConfig()
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun getCatalogConfiguration()
    : Deferred<Response<GetCatalogConfigurationMetaData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationProductListing(body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationProductListing(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurations()
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurations(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationByType(type: String,body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationByType(type: String)
    : Deferred<Response<GetAppCatalogEntityConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type )
        } else {
            null
        }
    }
    
    
    suspend fun getQueryFilters()
    : Deferred<Response<GetCollectionQueryOptionResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getQueryFilters(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCollection(body: CreateCollection)
    : Deferred<Response<CollectionCreateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCollection(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllCollections()
    : Deferred<Response<GetCollectionListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionDetail(slug: String)
    : Deferred<Response<CollectionDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionDetail(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun updateCollection(id: String)
    : Deferred<Response<CollectionCreateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun deleteCollection(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteCollection(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addCollectionItems(id: String,body: CollectionItemRequest)
    : Deferred<Response<UpdatedResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionItems(id: String, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GetCollectionItemsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, sortOn = sortOn, pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getCatalogInsights(brand: String?=null)
    : Deferred<Response<CatalogInsightResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogInsights(companyId = config.companyId , applicationId = applicationId , brand = brand )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class CompanyProfileDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }
    
    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCompanyProfile",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun cbsOnboardGet()
    : Deferred<Response<GetCompanyProfileSerializerResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCompany(body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateCompany(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<MetricsSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBrand(brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrand(
        companyId = config.companyId, brandId = brandId )
        } else {
            null
        } 
    }
    
    
    suspend fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId, brandId = brandId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrands()
    : Deferred<Response<CompanyBrandListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocations(storeType: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LocationListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocations(
        companyId = config.companyId, storeType = storeType, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createLocation(body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocationDetail(locationId: String)
    : Deferred<Response<GetLocationSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationDetail(
        companyId = config.companyId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId, locationId = locationId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class AssetsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val assetsApiList by lazy {
        generateassetsApiList()
    }
    
    private fun generateassetsApiList(): AssetsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAssets",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AssetsApiList::class.java) as? AssetsApiList
    }
    
    
    suspend fun companyCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.companyCopyFiles(
        sync = sync, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.getSignUrls(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun companyBrowse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.companyBrowse(
        namespace = namespace, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    suspend fun proxy(url: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.proxy(
        companyId = config.companyId, url = url )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appCopyFiles(sync = sync, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appBrowse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for appBrowse
    **/
    fun appBrowsePaginator(
    namespace: String
    
    ) : Paginator<BrowseResponse>{
        val paginator = Paginator<BrowseResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrowseResponse> {
            override suspend fun onNext(
                onSuccess: (Event<BrowseResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }
        })
        return paginator
    }
    
}
}