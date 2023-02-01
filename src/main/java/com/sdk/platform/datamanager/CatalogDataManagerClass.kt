package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class CatalogDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
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
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun getProductBundle(q: String?=null, slug: ArrayList<String>?=null)
    : Deferred<Response<GetProductBundleListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId, q = q, slug = slug )
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
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId, id = id, body = body)
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
    
    
    suspend fun getSizeGuide(id: String)
    : Deferred<Response<SizeGuideResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        companyId = config.companyId, id = id )
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
    
    
    suspend fun getGenderAttribute(attributeSlug: String)
    : Deferred<Response<GenderDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getGenderAttribute(
        companyId = config.companyId, attributeSlug = attributeSlug )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateCategories(departments: String, itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId, departments = departments, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun createDepartments(body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createDepartments(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listDepartmentsData(pageNo: Int?=null, pageSize: Int?=null, name: String?=null, search: String?=null, isActive: Boolean?=null)
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, name = name, search = search, isActive = isActive )
        } else {
            null
        } 
    }
    
    
    suspend fun getDepartmentData(uid: String)
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getDepartmentData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateDepartment(uid: String,body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentModel>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateDepartment(
        companyId = config.companyId, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplate(department: String)
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId, department = department )
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
    : Deferred<Response<ResponseBody>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateView(itemType: String)
    : Deferred<Response<ResponseBody>>? {
        
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
    : Deferred<Response<ProductDownloadsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String, templateTag: String?=null, itemType: String?=null)
    : Deferred<Response<ProductConfigurationDownloads>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId, filter = filter, templateTag = templateTag, itemType = itemType )
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
    
    
    suspend fun listCategories(level: String?=null, departments: String?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<CategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId, level = level, departments = departments, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getCategoryData(uid: String)
    : Deferred<Response<SingleCategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId, uid = uid )
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
    
    
    suspend fun createProduct(body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, itemIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, itemCode: ArrayList<String>?=null, q: String?=null, tags: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, itemIds = itemIds, departmentIds = departmentIds, itemCode = itemCode, q = q, tags = tags, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getVariantsOfProducts(itemId: String, variantType: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductVariantsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getVariantsOfProducts(
        companyId = config.companyId, itemId = itemId, variantType = variantType, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductAttributes(category: String, filter: Boolean?=null)
    : Deferred<Response<ProductAttributesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAttributes(
        companyId = config.companyId, category = category, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun patchProduct(itemId: String,body: ProductPatch)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.patchProduct(
        companyId = config.companyId, itemId = itemId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProduct(itemCode: String?=null, itemId: String, brandUid: Int?=null)
    : Deferred<Response<Product>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid )
        } else {
            null
        } 
    }
    
    
    suspend fun editProduct(itemId: String,body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponseProduct>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.editProduct(
        companyId = config.companyId, itemId = itemId, body = body)
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
    
    
    suspend fun allSizes(itemId: String)
    : Deferred<Response<ListALLSizes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.allSizes(
        companyId = config.companyId, itemId = itemId )
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
    
    
    suspend fun createBulkProductUploadJob(body: BulkJob)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkProductUploadJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBulkUploadHistory(search: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductBulkRequestList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId, search = search, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun uploadBulkProducts(department: String, productType: String,body: BulkJob)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.uploadBulkProducts(
        companyId = config.companyId, department = department, productType = productType, body = body)
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
    
    
    suspend fun getProductTags()
    : Deferred<Response<ProductTagsViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTags(
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
    : Deferred<Response<ProductSizeDeleteResponse>>? {
        
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
    
    
    suspend fun getInventoryBySize(itemId: String, size: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null)
    : Deferred<Response<InventoryResponsePaginated>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySize(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBySizeIdentifier(itemId: String, sizeIdentifier: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, locationIds: ArrayList<Int>?=null)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySizeIdentifier(
        companyId = config.companyId, itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, q = q, locationIds = locationIds )
        } else {
            null
        } 
    }
    
    
    
    suspend fun deleteInventory(size: String, itemId: String, locationId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteInventory(
        companyId = config.companyId, size = size, itemId = itemId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventoryJob(body: BulkJob)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventoryJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkInventoryGet>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventories(itemId: String?=null, size: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null, storeIds: ArrayList<Int>?=null, sizeIdentifier: String?=null)
    : Deferred<Response<GetInventoriesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventories(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable, storeIds = storeIds, sizeIdentifier = sizeIdentifier )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventory(batchId: String,body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteBulkInventoryJob(batchId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequest)
    : Deferred<Response<InventoryExportResponse>>? {
        
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
    
    
    suspend fun updateRealtimeInventory(itemId: String, sellerIdentifier: String,body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateRealtimeInventory(
        companyId = config.companyId, itemId = itemId, sellerIdentifier = sellerIdentifier, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteRealtimeInventory(itemId: String, sellerIdentifier: String,body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteRealtimeInventory(
        companyId = config.companyId, itemId = itemId, sellerIdentifier = sellerIdentifier, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateInventories(body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateInventories(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createHsnCode(body: HsnUpsert)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createHsnCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAllHsnCodes(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<HsnCodesListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAllHsnCodes(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun getHsnCode(id: String)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getHsnCode(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateHsnCode(id: String,body: HsnUpsert)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateHsnCode(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun bulkHsnCode(body: BulkHsnUpsert)
    : Deferred<Response<BulkHsnResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.bulkHsnCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAllProductHsnCodes(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, type: String?=null)
    : Deferred<Response<HsnCodesListingResponseSchemaV2>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAllProductHsnCodes(
        pageNo = pageNo, pageSize = pageSize, q = q, type = type, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getOptimalLocations(body: AssignStore)
    : Deferred<Response<StoreAssignResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getOptimalLocations(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSingleProductHSNCode(reportingHsn: String)
    : Deferred<Response<HSNDataInsertV2>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSingleProductHSNCode(
        reportingHsn = reportingHsn, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getSearchKeywords(id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    suspend fun deleteSearchKeywords(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    suspend fun getAutocompleteKeywordDetail(id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    suspend fun deleteAutocompleteKeyword(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    
    
    
    
    
    
    
    
    suspend fun updateAppProduct(itemId: String,body: ApplicationItemMeta)
    : Deferred<Response<SuccessResponse1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppProduct(companyId = config.companyId , applicationId = applicationId , itemId = itemId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProduct(itemId: String)
    : Deferred<Response<OwnerAppItemResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProduct(companyId = config.companyId , applicationId = applicationId , itemId = itemId )
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationMetadata(configType: String, templateSlug: String?=null)
    : Deferred<Response<GetConfigMetadataResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationMetadata(companyId = config.companyId , applicationId = applicationId , configType = configType, templateSlug = templateSlug )
        } else {
            null
        }
    }
    
    
    suspend fun createGroupConfiguration(configType: String,body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGroupConfigurations(configType: String, pageNo: Int?=null, pageSize: Int?=null, search: String?=null, templateSlug: String?=null)
    : Deferred<Response<GetConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getGroupConfigurations(companyId = config.companyId , applicationId = applicationId , configType = configType, pageNo = pageNo, pageSize = pageSize, search = search, templateSlug = templateSlug )
        } else {
            null
        }
    }
    
    
    suspend fun updateGroupConfiguration(configType: String, groupSlug: String,body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, groupSlug = groupSlug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteGroupConfiguration(configType: String, groupSlug: String)
    : Deferred<Response<ConfigSuccessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, groupSlug = groupSlug )
        } else {
            null
        }
    }
    
    
    suspend fun createListingConfiguration(configType: String,body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getListingConfigurations(configType: String, pageNo: Int?=null, pageSize: Int?=null, search: String?=null)
    : Deferred<Response<GetConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getListingConfigurations(companyId = config.companyId , applicationId = applicationId , configType = configType, pageNo = pageNo, pageSize = pageSize, search = search )
        } else {
            null
        }
    }
    
    
    suspend fun updateListingConfiguration(configType: String, configId: String,body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, configId = configId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteListingConfiguration(configType: String, configId: String)
    : Deferred<Response<ConfigSuccessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, configId = configId )
        } else {
            null
        }
    }
    
    
    suspend fun updateAllowSingle(body: AllowSingleRequest)
    : Deferred<Response<ConfigSuccessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAllowSingle(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateDefaultSort(body: DefaultKeyRequest)
    : Deferred<Response<ConfigSuccessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateDefaultSort(companyId = config.companyId , applicationId = applicationId , body = body)
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
    
    
    suspend fun getAllCollections(q: String?=null, scheduleStatus: String?=null, type: String?=null, tags: ArrayList<String>?=null, isActive: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetCollectionListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId , q = q, scheduleStatus = scheduleStatus, type = type, tags = tags, isActive = isActive, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun updateCollection(id: String,body: UpdateCollection)
    : Deferred<Response<UpdateCollection>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getDiscountedInventoryBySizeIdentifier(itemId: String, sizeIdentifier: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, locationIds: ArrayList<Int>?=null)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDiscountedInventoryBySizeIdentifier(companyId = config.companyId , applicationId = applicationId , itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, q = q, locationIds = locationIds )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getApplicationBrands(department: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, brandId: ArrayList<Int>?=null)
    : Deferred<Response<BrandListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationBrands(companyId = config.companyId , applicationId = applicationId , department = department, pageNo = pageNo, pageSize = pageSize, q = q, brandId = brandId )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationBrands
    **/
    fun getApplicationBrandsPaginator(
    department: String?=null, pageSize: Int?=null, q: String?=null, brandId: ArrayList<Int>?=null
    
    ) : Paginator<BrandListingResponse>{
        val paginator = Paginator<BrandListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrandListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getApplicationBrands(companyId = config.companyId , applicationId = applicationId , department = department, pageNo = pageNo, pageSize = pageSize, q = q, brandId = brandId)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getDepartments()
    : Deferred<Response<DepartmentResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDepartments(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCategories(department: String?=null)
    : Deferred<Response<CategoryListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCategories(companyId = config.companyId , applicationId = applicationId , department = department )
        } else {
            null
        }
    }
    
    
    suspend fun getAppicationProducts(q: String?=null, f: String?=null, c: String?=null, filters: Boolean?=null, isDependent: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null, pageNo: Int?=null, pageType: String?=null, itemIds: ArrayList<Int>?=null)
    : Deferred<Response<ApplicationProductListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppicationProducts(companyId = config.companyId , applicationId = applicationId , q = q, f = f, c = c, filters = filters, isDependent = isDependent, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType, itemIds = itemIds )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppicationProducts
    **/
    fun getAppicationProductsPaginator(
    q: String?=null, f: String?=null, c: String?=null, filters: Boolean?=null, isDependent: Boolean?=null, sortOn: String?=null, pageSize: Int?=null, itemIds: ArrayList<Int>?=null
    
    ) : Paginator<ApplicationProductListingResponse>{
        val paginator = Paginator<ApplicationProductListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationProductListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<ApplicationProductListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    catalogApiList?.getAppicationProducts(companyId = config.companyId , applicationId = applicationId , q = q, f = f, c = c, filters = filters, isDependent = isDependent, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType, itemIds = itemIds)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getProductDetailBySlug(slug: String)
    : Deferred<Response<ProductDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductDetailBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun getAppProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, tags: ArrayList<String>?=null, isDependent: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<ProductListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProducts(companyId = config.companyId , applicationId = applicationId , brandIds = brandIds, categoryIds = categoryIds, departmentIds = departmentIds, tags = tags, isDependent = isDependent, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getAppInventory(itemIds: ArrayList<Int>?=null, storeIds: ArrayList<Int>?=null, brandIds: ArrayList<Int>?=null, sellerIdentifiers: ArrayList<String>?=null, timestamp: String?=null, pageSize: Int?=null, pageId: String?=null)
    : Deferred<Response<InventoryStockResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppInventory(companyId = config.companyId , applicationId = applicationId , itemIds = itemIds, storeIds = storeIds, brandIds = brandIds, sellerIdentifiers = sellerIdentifiers, timestamp = timestamp, pageSize = pageSize, pageId = pageId )
        } else {
            null
        }
    }
    
    
    suspend fun getAppLocations(storeType: String?=null, uid: ArrayList<Int>?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LocationListSerializer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppLocations(companyId = config.companyId , applicationId = applicationId , storeType = storeType, uid = uid, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppLocations
    **/
    fun getAppLocationsPaginator(
    storeType: String?=null, uid: ArrayList<Int>?=null, q: String?=null, stage: String?=null, pageSize: Int?=null
    
    ) : Paginator<LocationListSerializer>{
        val paginator = Paginator<LocationListSerializer>()
        paginator.setCallBack(object : PaginatorCallback<LocationListSerializer> {
            
            override suspend fun onNext(
                onResponse: (Event<LocationListSerializer>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getAppLocations(companyId = config.companyId , applicationId = applicationId , storeType = storeType, uid = uid, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getApplicationBrandListing(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<BrandListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationBrandListing(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationBrandListing
    **/
    fun getApplicationBrandListingPaginator(
    pageSize: Int?=null, q: String?=null
    
    ) : Paginator<BrandListingResponse>{
        val paginator = Paginator<BrandListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrandListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getApplicationBrandListing(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun updateAppBrand(brandUid: String,body: ApplicationBrandJson)
    : Deferred<Response<SuccessResponse1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppBrand(companyId = config.companyId , applicationId = applicationId , brandUid = brandUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationCategoryListing(departmentId: Int?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<BrandListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationCategoryListing(companyId = config.companyId , applicationId = applicationId , departmentId = departmentId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationCategoryListing
    **/
    fun getApplicationCategoryListingPaginator(
    departmentId: Int?=null, pageSize: Int?=null, q: String?=null
    
    ) : Paginator<BrandListingResponse>{
        val paginator = Paginator<BrandListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrandListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getApplicationCategoryListing(companyId = config.companyId , applicationId = applicationId , departmentId = departmentId, pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun updateAppCategory(categoryUid: String,body: ApplicationCategoryJson)
    : Deferred<Response<SuccessResponse1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategory(companyId = config.companyId , applicationId = applicationId , categoryUid = categoryUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationDepartmentListing(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<ApplicationDepartmentListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationDepartmentListing(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationDepartmentListing
    **/
    fun getApplicationDepartmentListingPaginator(
    pageSize: Int?=null, q: String?=null
    
    ) : Paginator<ApplicationDepartmentListingResponse>{
        val paginator = Paginator<ApplicationDepartmentListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationDepartmentListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<ApplicationDepartmentListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getApplicationDepartmentListing(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun updateAppDepartment(departmentUid: String,body: ApplicationDepartmentJson)
    : Deferred<Response<SuccessResponse1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppDepartment(companyId = config.companyId , applicationId = applicationId , departmentUid = departmentUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppLocation(storeUid: String,body: ApplicationStoreJson)
    : Deferred<Response<SuccessResponse1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppLocation(companyId = config.companyId , applicationId = applicationId , storeUid = storeUid, body = body)
        } else {
            null
        }
    }
    
}
}