package com.sdk.platform.catalog

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
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createCategories(body: CategoryRequestBody)
    : Response<CategoryCreateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createCategories(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listCategories(level: String?=null, department: Int?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null, uids: ArrayList<Int>?=null)
    : Response<CategoryResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId, level = level, department = department, q = q, pageNo = pageNo, pageSize = pageSize, uids = uids )
        } else {
            null
        } 
    }
    
    
    suspend fun getCategoryData(uid: String)
    : Response<SingleCategoryResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCategory(uid: String,body: CategoryRequestBody)
    : Response<CategoryUpdateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateCategory(
        companyId = config.companyId, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSellerInsights(sellerAppId: String)
    : Response<CrossSellingResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSellerInsights(
        companyId = config.companyId, sellerAppId = sellerAppId )
        } else {
            null
        } 
    }
    
    
    suspend fun createDepartments(body: DepartmentCreateUpdate)
    : Response<DepartmentCreateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createDepartments(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listDepartmentsData(pageNo: Int?=null, itemType: String?=null, pageSize: Int?=null, name: String?=null, search: String?=null, isActive: Boolean?=null, uids: ArrayList<Int>?=null)
    : Response<DepartmentsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId, pageNo = pageNo, itemType = itemType, pageSize = pageSize, name = name, search = search, isActive = isActive, uids = uids )
        } else {
            null
        } 
    }
    
    
    suspend fun getDepartmentData(uid: String)
    : Response<DepartmentsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getDepartmentData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateDepartment(uid: String,body: DepartmentCreateUpdate)
    : Response<DepartmentModel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateDepartment(
        companyId = config.companyId, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String, templateTag: String?=null, itemType: String?=null)
    : Response<ProductConfigurationDownloads>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId, filter = filter, templateTag = templateTag, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun bulkHsnCode(body: BulkHsnUpsert)
    : Response<BulkHsnResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.bulkHsnCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getHsnCode(id: String)
    : Response<HsnCode>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getHsnCode(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateHsnCode(id: String,body: HsnUpsert)
    : Response<UpdateHsnCode>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateHsnCode(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventories(itemId: Int?=null, size: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null, storeIds: ArrayList<Int>?=null, sizeIdentifier: String?=null)
    : Response<GetInventoriesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventories(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable, storeIds = storeIds, sizeIdentifier = sizeIdentifier )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Response<BulkInventoryGet>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventoryJob(body: InventoryBulkJob)
    : Response<InventoryBulkResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventoryJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteBulkInventoryJob(batchId: String)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventory(batchId: String,body: InventoryBulkRequest)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequest)
    : Response<InventoryExportResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExportJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryExport()
    : Response<InventoryExportJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExport(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun patchProductExportDetail(jobId: String,body: ExportPatchRequest)
    : Response<PatchProductDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.patchProductExportDetail(
        companyId = config.companyId, jobId = jobId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductExportDetail(jobId: String)
    : Response<GetProductDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductExportDetail(
        companyId = config.companyId, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun patchInventoryExportDetail(jobId: String,body: ExportPatchRequest)
    : Response<EditInventoryDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.patchInventoryExportDetail(
        companyId = config.companyId, jobId = jobId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryExportDetail(jobId: String)
    : Response<EditInventoryDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExportDetail(
        companyId = config.companyId, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun exportInventoryConfig(filter: String)
    : Response<InventoryConfig>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.exportInventoryConfig(
        companyId = config.companyId, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadInventoryTemplateView(type: String)
    : Response<ResponseBody>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadInventoryTemplateView(
        companyId = config.companyId, type = type )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplateSchema(itemType: String, bulk: Boolean)
    : Response<InventoryValidationResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplateSchema(
        companyId = config.companyId, itemType = itemType, bulk = bulk )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyBrandDetail(isActive: Boolean?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null, marketplace: String?=null)
    : Response<OptinCompanyBrandDetailsView>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandDetail(
        companyId = config.companyId, isActive = isActive, q = q, pageNo = pageNo, pageSize = pageSize, marketplace = marketplace )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyDetail()
    : Response<OptinCompanyDetail>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Response<OptinCompanyMetrics>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getStoreDetail(q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<OptinStoreDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getStoreDetail(
        companyId = config.companyId, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductAttributes(category: String, filter: Boolean?=null)
    : Response<ProductAttributesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAttributes(
        companyId = config.companyId, category = category, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun getGenderAttribute(attributeSlug: String)
    : Response<GenderDetail>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getGenderAttribute(
        companyId = config.companyId, attributeSlug = attributeSlug )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductBundle(body: ProductBundleRequest)
    : Response<GetProductBundleCreateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductBundle(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundle(q: String?=null, slug: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetProductBundleListingResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId, q = q, slug = slug, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundleDetail(id: String)
    : Response<GetProductBundleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundleDetail(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequest)
    : Response<GetProductBundleCreateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductAssetsInBulk(pageNo: Int?=null, pageSize: Int?=null)
    : Response<BulkAssetResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAssetsInBulk(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductAssetsInBulk(body: ProductBulkAssets)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBulkUploadHistory(search: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<ProductBulkRequestList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId, search = search, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkProductUploadJob(body: BulkProductUploadJob)
    : Response<ProductBulkResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkProductUploadJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProductBulkJob(batchId: String)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProductBulkJob(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductsInBulk(batchId: String,body: BulkProductRequest)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductsInBulk(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateExportDetails()
    : Response<ProductDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listHSNCodes()
    : Response<HSNCodesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listHSNCodes(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductTags()
    : Response<ProductTagsViewResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTags(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplate(department: String)
    : Response<TemplatesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId, department = department )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateCategories(departments: String, itemType: String)
    : Response<ProdcutTemplateCategoriesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId, departments = departments, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateViews(slug: String, itemType: String?=null, type: String?=null)
    : Response<ResponseBody>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId, slug = slug, itemType = itemType, type = type )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplate(slug: String, itemType: String?=null, bulk: Boolean?=null)
    : Response<TemplatesValidationResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplate(
        companyId = config.companyId, slug = slug, itemType = itemType, bulk = bulk )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductValidation(type: String, slug: String)
    : Response<ValidateProduct>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductValidation(
        companyId = config.companyId, type = type, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBySizeIdentifier(itemId: String, sizeIdentifier: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, locationIds: ArrayList<Int>?=null)
    : Response<InventorySellerIdentifierResponsePaginated>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySizeIdentifier(
        companyId = config.companyId, itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, q = q, locationIds = locationIds )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductSize(itemId: String)
    : Response<Product>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductSize(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSize(itemId: String, size: String)
    : Response<ProductSizeDeleteResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteSize(
        companyId = config.companyId, itemId = itemId, size = size )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBySize(itemId: String, size: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null)
    : Response<InventoryResponsePaginated>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySize(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable )
        } else {
            null
        } 
    }
    
    
    suspend fun getVariantsOfProducts(itemId: String, variantType: String, pageNo: Int?=null, pageSize: Int?=null)
    : Response<ProductVariantsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getVariantsOfProducts(
        companyId = config.companyId, itemId = itemId, variantType = variantType, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyVerification(q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<CompanyVerificationResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyVerification(
        companyId = config.companyId, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductVerificationDetails(itemId: String)
    : Response<ProductVerificationModel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductVerificationDetails(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun getVariantTypes(templateTag: String)
    : Response<VariantTypesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getVariantTypes(
        companyId = config.companyId, templateTag = templateTag )
        } else {
            null
        } 
    }
    
    
    suspend fun createSizeGuide(body: ValidateSizeGuide)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createSizeGuide(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuides(active: Boolean?=null, q: String?=null, brandId: Int?=null, tag: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<ListSizeGuide>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuides(
        companyId = config.companyId, active = active, q = q, brandId = brandId, tag = tag, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuide(id: String)
    : Response<SizeGuideResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        id = id, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateSizeGuide(id: String,body: ValidateSizeGuide)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateSizeGuide(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getAllProductHsnCodes(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, type: String?=null)
    : Response<HsnCodesListingResponseSchemaV2>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAllProductHsnCodes(
        pageNo = pageNo, pageSize = pageSize, q = q, type = type, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSingleProductHSNCode(reportingHsn: String)
    : Response<HSNDataInsertV2>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSingleProductHSNCode(
        reportingHsn = reportingHsn, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateInventories(body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateInventories(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listInventoryExport(status: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null)
    : Response<InventoryExportJobListResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listInventoryExport(
        companyId = config.companyId, status = status, fromDate = fromDate, toDate = toDate, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun createInventoryExport(body: InventoryCreateRequest)
    : Response<InventoryExportResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, itemIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, itemCode: ArrayList<String>?=null, q: String?=null, tags: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<ProductListingResponseV2>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, itemIds = itemIds, departmentIds = departmentIds, itemCode = itemCode, q = q, tags = tags, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createProduct(body: ProductCreateUpdateSchemaV2)
    : Response<SuccessResponse1>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun uploadBulkProducts(department: String, productType: String,body: BulkProductJob)
    : Response<ProductBulkResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.uploadBulkProducts(
        companyId = config.companyId, department = department, productType = productType, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductExportJobs(status: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null)
    : Response<ProductDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductExportJobs(
        companyId = config.companyId, status = status, fromDate = fromDate, toDate = toDate, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductExportJob(body: ProductTemplateDownloadsExport)
    : Response<CreateProductDownloadsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductExportJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProduct(itemId: String, brandUid: Int?=null, itemCode: String?=null)
    : Response<SingleProductResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        companyId = config.companyId, itemId = itemId, brandUid = brandUid, itemCode = itemCode )
        } else {
            null
        } 
    }
    
    
    suspend fun editProduct(itemId: String,body: ProductCreateUpdateSchemaV2)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.editProduct(
        companyId = config.companyId, itemId = itemId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProduct(itemId: String)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun allSizes(itemId: String)
    : Response<GetAllSizes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.allSizes(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteRealtimeInventory(itemId: String, sellerIdentifier: String,body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteRealtimeInventory(
        companyId = config.companyId, itemId = itemId, sellerIdentifier = sellerIdentifier, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateRealtimeInventory(itemId: String, sellerIdentifier: String,body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateRealtimeInventory(
        companyId = config.companyId, itemId = itemId, sellerIdentifier = sellerIdentifier, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductTemplateBySlug(slug: String)
    : Response<GetProductTemplateSlugResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTemplateBySlug(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun getMarketplaces()
    : Response<GetAllMarketplaces>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getMarketplaces(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateMarketplaceOptin(marketplace: String,body: UpdateMarketplaceOptinRequest)
    : Response<UpdateMarketplaceOptinResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateMarketplaceOptin(
        companyId = config.companyId, marketplace = marketplace, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createMarketplaceOptin(marketplace: String,body: CreateMarketplaceOptinRequest)
    : Response<CreateMarketplaceOptinResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createMarketplaceOptin(
        companyId = config.companyId, marketplace = marketplace, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getCompanyBrandsDRI(pageNo: Int?=null, pageSize: Int?=null)
    : Response<CompanyDRIListResponseSchema>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandsDRI(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getLocationTags()
    : Response<StoreTagsResponseSchema>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getLocationTags(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCatalogInsights(brand: String?=null)
    : Response<CatalogInsightResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogInsights(companyId = config.companyId , applicationId = applicationId , brand = brand )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationBrandListing(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<BrandListingResponse>? {
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
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppBrand(companyId = config.companyId , applicationId = applicationId , brandUid = brandUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationBrands(department: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, brandId: ArrayList<Int>?=null)
    : Response<BrandListingResponse>? {
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
    
    suspend fun getCategories(department: String?=null)
    : Response<CategoryListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCategories(companyId = config.companyId , applicationId = applicationId , department = department )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationCategoryListing(departmentId: Int?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<BrandListingResponse>? {
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
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategory(companyId = config.companyId , applicationId = applicationId , categoryUid = categoryUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createCollection(body: CreateCollection)
    : Response<CollectionCreateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCollection(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllCollections(q: String?=null, scheduleStatus: String?=null, type: String?=null, tag: ArrayList<String>?=null, isActive: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetCollectionListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId , q = q, scheduleStatus = scheduleStatus, type = type, tag = tag, isActive = isActive, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationFilterValues(filterKey: String, c: String?=null, collectionId: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<GetQueryFiltersValuesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationFilterValues(companyId = config.companyId , applicationId = applicationId , filterKey = filterKey, c = c, collectionId = collectionId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationFilterKeys(c: String?=null)
    : Response<GetQueryFiltersKeysResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationFilterKeys(companyId = config.companyId , applicationId = applicationId , c = c )
        } else {
            null
        }
    }
    
    
    suspend fun getQueryFilters()
    : Response<GetQueryFiltersResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getQueryFilters(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionItems(id: String, sortOn: String?=null, pageSize: Int?=null, pageNo: Int?=null, isPinned: Boolean?=null, q: String?=null, isExcluded: Boolean?=null)
    : Response<GetCollectionItemsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, sortOn = sortOn, pageSize = pageSize, pageNo = pageNo, isPinned = isPinned, q = q, isExcluded = isExcluded )
        } else {
            null
        }
    }
    
    
    suspend fun clearCollectionItemsPriority(id: String)
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.clearCollectionItemsPriority(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addCollectionItems(id: String,body: CollectionItemUpdateSchema)
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionDetail(slug: String)
    : Response<GetCollectionDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionDetail(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun updateCollection(id: String,body: UpdateCollection)
    : Response<UpdateCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCollection(id: String)
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteCollection(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationDepartmentListing(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<ApplicationDepartmentListingResponse>? {
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
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppDepartment(companyId = config.companyId , applicationId = applicationId , departmentUid = departmentUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationsFilterMetadata(filter: String)
    : Response<FilterResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationsFilterMetadata(companyId = config.companyId , applicationId = applicationId , filter = filter )
        } else {
            null
        }
    }
    
    
    suspend fun getDepartments()
    : Response<DepartmentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDepartments(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getAppInventory(itemIds: ArrayList<Int>?=null, storeIds: ArrayList<Int>?=null, brandIds: ArrayList<Int>?=null, sellerIdentifiers: ArrayList<String>?=null, timestamp: String?=null, pageSize: Int?=null, pageId: String?=null)
    : Response<InventoryStockResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppInventory(companyId = config.companyId , applicationId = applicationId , itemIds = itemIds, storeIds = storeIds, brandIds = brandIds, sellerIdentifiers = sellerIdentifiers, timestamp = timestamp, pageSize = pageSize, pageId = pageId )
        } else {
            null
        }
    }
    
    
    suspend fun getAppLocations(storeType: String?=null, uid: ArrayList<Int>?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null, tags: ArrayList<String>?=null, storeTypes: ArrayList<String>?=null, companyUids: ArrayList<Int>?=null)
    : Response<LocationListSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppLocations(companyId = config.companyId , applicationId = applicationId , storeType = storeType, uid = uid, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize, tags = tags, storeTypes = storeTypes, companyUids = companyUids )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppLocations
    **/
    fun getAppLocationsPaginator(
    storeType: String?=null, uid: ArrayList<Int>?=null, q: String?=null, stage: String?=null, pageSize: Int?=null, tags: ArrayList<String>?=null, storeTypes: ArrayList<String>?=null, companyUids: ArrayList<Int>?=null
    
    ) : Paginator<LocationListSerializer>{
        val paginator = Paginator<LocationListSerializer>()
        paginator.setCallBack(object : PaginatorCallback<LocationListSerializer> {
            
            override suspend fun onNext(
                onResponse: (Event<LocationListSerializer>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getAppLocations(companyId = config.companyId , applicationId = applicationId , storeType = storeType, uid = uid, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize, tags = tags, storeTypes = storeTypes, companyUids = companyUids)?.safeAwait{ response, error ->
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
    
    suspend fun getConfigurations()
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurations(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationProductListing(body: AppConfiguration)
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationProductListing(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCatalogConfiguration()
    : Response<GetCatalogConfigurationMetaData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationByType(type: String)
    : Response<GetAppCatalogEntityConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationByType(type: String,body: AppConfiguration)
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProduct(itemId: String)
    : Response<OwnerAppItemResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProduct(companyId = config.companyId , applicationId = applicationId , itemId = itemId )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppProduct(itemId: String,body: ApplicationItemMeta)
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppProduct(companyId = config.companyId , applicationId = applicationId , itemId = itemId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppicationProducts(q: String?=null, f: String?=null, c: String?=null, filters: Boolean?=null, isDependent: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null, pageNo: Int?=null, pageType: String?=null, itemIds: ArrayList<String>?=null)
    : Response<ApplicationProductListingResponse>? {
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
    q: String?=null, f: String?=null, c: String?=null, filters: Boolean?=null, isDependent: Boolean?=null, sortOn: String?=null, pageSize: Int?=null, itemIds: ArrayList<String>?=null
    
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
    
    suspend fun getDiscountedInventoryBySizeIdentifier(itemId: String, sizeIdentifier: String, pageNo: Int?=null, pageSize: Int?=null, locationIds: ArrayList<Int>?=null)
    : Response<InventorySellerIdentifierResponsePaginated>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDiscountedInventoryBySizeIdentifier(companyId = config.companyId , applicationId = applicationId , itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, locationIds = locationIds )
        } else {
            null
        }
    }
    
    
    suspend fun getProductDetailBySlug(slug: String)
    : Response<ProductDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductDetailBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun getAppProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, tags: ArrayList<String>?=null, itemIds: ArrayList<Int>?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<RawProductListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProducts(companyId = config.companyId , applicationId = applicationId , brandIds = brandIds, categoryIds = categoryIds, departmentIds = departmentIds, tags = tags, itemIds = itemIds, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getAppReturnConfiguration()
    : Response<AppReturnConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppReturnConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createAppReturnConfiguration(body: CreateUpdateAppReturnConfig)
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppReturnConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppReturnConfiguration(body: CreateUpdateAppReturnConfig)
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppReturnConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCategoryReturnConfiguration(body: DeleteAppCategoryReturnConfig)
    : Response<SuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAppCategoryReturnConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCategoryReturnConfig()
    : Response<BaseAppCategoryReturnConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppCategoryReturnConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createAppCategoryReturnConfiguration(body: BaseAppCategoryReturnConfig)
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppCategoryReturnConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCategoryReturnConfiguration(body: BaseAppCategoryReturnConfig)
    : Response<SuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategoryReturnConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomAutocompleteRule(body: CreateAutocompleteKeyword)
    : Response<CreateAutocompleteWordsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomAutocompleteRule(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteConfig(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, isActive: Boolean?=null)
    : Response<GetAutocompleteWordsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, isActive = isActive )
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteKeywordDetail(id: String)
    : Response<GetAutocompleteWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword)
    : Response<GetAutocompleteWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAutocompleteKeyword(id: String)
    : Response<DeleteResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createSearchRerank(body: CreateSearchRerankRequest)
    : Response<CreateSearchRerankResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSearchRerank(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchRerank()
    : Response<GetSearchRerankResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchRerank(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getSearchRerankDetail(id: String)
    : Response<GetSearchRerankDetailResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchRerankDetail(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchRerankConfiguration(id: String,body: UpdateSearchRerankRequest)
    : Response<UpdateSearchRerankResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchRerankConfiguration(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchRerankConfiguration(id: String)
    : Response<DeleteSearchRerankConfigurationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchRerankConfiguration(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createSearchConfiguration(body: CreateSearchConfigurationRequest)
    : Response<CreateSearchConfigurationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSearchConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchConfiguration()
    : Response<GetSearchConfigurationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchConfiguration(body: UpdateSearchConfigurationRequest)
    : Response<UpdateSearchConfigurationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchConfiguration()
    : Response<DeleteSearchConfigurationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomKeyword(body: CreateSearchKeyword)
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomKeyword(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllSearchKeyword(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, isActive: Boolean?=null)
    : Response<GetSearchWordsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllSearchKeyword(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q, isActive = isActive )
        } else {
            null
        }
    }
    
    
    suspend fun getSearchKeywords(id: String)
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchKeywords(id: String,body: CreateSearchKeyword)
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchKeywords(id: String)
    : Response<DeleteResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppLocation(storeUid: String,body: ApplicationStoreJson)
    : Response<SuccessResponse1>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppLocation(companyId = config.companyId , applicationId = applicationId , storeUid = storeUid, body = body)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateAllowSingle(body: AllowSingleRequest)
    : Response<ConfigSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAllowSingle(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateDefaultSort(body: DefaultKeyRequest)
    : Response<ConfigSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateDefaultSort(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createListingConfiguration(configType: String,body: AppConfigurationsFilter)
    : Response<AppConfigurationsFilterResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getListingConfigurations(configType: String, pageNo: Int?=null, pageSize: Int?=null, search: String?=null, uids: ArrayList<Int>?=null)
    : Response<GetListingConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getListingConfigurations(companyId = config.companyId , applicationId = applicationId , configType = configType, pageNo = pageNo, pageSize = pageSize, search = search, uids = uids )
        } else {
            null
        }
    }
    
    
    suspend fun createGroupConfiguration(configType: String,body: AppConfigurationCreateDetail)
    : Response<AppConfigurationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGroupConfigurations(configType: String, pageNo: Int?=null, pageSize: Int?=null, search: String?=null, templateSlug: String?=null)
    : Response<GetConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getGroupConfigurations(companyId = config.companyId , applicationId = applicationId , configType = configType, pageNo = pageNo, pageSize = pageSize, search = search, templateSlug = templateSlug )
        } else {
            null
        }
    }
    
    
    suspend fun updateGroupConfiguration(configType: String, groupSlug: String,body: AppConfigurationDetail)
    : Response<AppConfigurationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, groupSlug = groupSlug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteGroupConfiguration(configType: String, groupSlug: String)
    : Response<Any>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteGroupConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, groupSlug = groupSlug )
        } else {
            null
        }
    }
    
    
    suspend fun updateListingConfiguration(configType: String, configId: String,body: AppConfigurationsFilterResponse)
    : Response<AppConfigurationsFilterResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, configId = configId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteListingConfiguration(configType: String, configId: String)
    : Response<ConfigSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteListingConfiguration(companyId = config.companyId , applicationId = applicationId , configType = configType, configId = configId )
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationMetadata(configType: String, templateSlug: String?=null)
    : Response<GetConfigMetadataResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationMetadata(companyId = config.companyId , applicationId = applicationId , configType = configType, templateSlug = templateSlug )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createAutocompleteSettings(body: AutocompleteRequestSchema)
    : Response<AutocompleteUpsertResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAutocompleteSettings(applicationId = applicationId , companyId = config.companyId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteSettings()
    : Response<AutocompleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteSettings(applicationId = applicationId , companyId = config.companyId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteSettings(id: String,body: AutocompleteRequestSchema)
    : Response<AutocompleteUpsertResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteSettings(applicationId = applicationId , companyId = config.companyId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompletePreview(q: String?=null, categorySuggestion: Int?=null, brandSuggestion: Int?=null, collectionSuggestion: Int?=null, productSuggestion: Int?=null, querySuggestion: Int?=null)
    : Response<AutocompletePreviewResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompletePreview(applicationId = applicationId , companyId = config.companyId , q = q, categorySuggestion = categorySuggestion, brandSuggestion = brandSuggestion, collectionSuggestion = collectionSuggestion, productSuggestion = productSuggestion, querySuggestion = querySuggestion )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRulePinAction(merchandisingRuleId: String,body: PinRequest)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRulePinAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRulePinAction(merchandisingRuleId: String,body: PinRequest)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRulePinAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRulePinAction(merchandisingRuleId: String)
    : Response<PinResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRulePinAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleHideAction(merchandisingRuleId: String,body: HideRequest)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleHideAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleHideAction(merchandisingRuleId: String,body: HideRequest)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleHideAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleHideAction(merchandisingRuleId: String)
    : Response<HideResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleHideAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleBoostAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleBoostAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleBoostAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleBoostAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleBoostAction(merchandisingRuleId: String)
    : Response<GetMerchandisingRuleBoostAction>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleBoostAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleBuryAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleBuryAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleBuryAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleBuryAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleBuryAction(merchandisingRuleId: String)
    : Response<GetMerchandisingRuleBuryAction>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleBuryAction(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleQuery(body: MerchandisingRuleQueryPost)
    : Response<MerchandiseQueryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleQuery(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingQuery(merchandisingRuleId: String)
    : Response<SearchResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingQuery(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleQuery(merchandisingRuleId: String,body: MerchandisingRuleQueryPost)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleQuery(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun saveMerchandisingRules(merchandisingRuleId: String,body: MerchandisingRuleSave)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.saveMerchandisingRules(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteMerchandisingRule(merchandisingRuleId: String)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteMerchandisingRule(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRules(pageId: String?=null, pageSize: Int?=null)
    : Response<MerchandisingRulesList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRules(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun deleteMerchandisingRulesPreview(merchandisingRuleId: String)
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteMerchandisingRulesPreview(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId )
        } else {
            null
        }
    }
    
    
    suspend fun getLivePreview(merchandisingRuleId: String, searchKeyword: String?=null)
    : Response<ProductListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getLivePreview(companyId = config.companyId , applicationId = applicationId , merchandisingRuleId = merchandisingRuleId, searchKeyword = searchKeyword )
        } else {
            null
        }
    }
    
    
    suspend fun createAppPriceFactory(body: CreateAppPriceFactoryRequestSchema)
    : Response<CreateAppPriceFactoryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppPriceFactory(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppPriceFactories(isActive: Boolean?=null, factoryTypeId: String?=null, code: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetAppPriceFactoryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppPriceFactories(companyId = config.companyId , applicationId = applicationId , isActive = isActive, factoryTypeId = factoryTypeId, code = code, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getAppPriceFactory(id: String)
    : Response<AppPriceFactory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppPriceFactory(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun editAppPriceFactory(id: String,body: EditAppPriceFactoryRequestSchema)
    : Response<AppPriceFactory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.editAppPriceFactory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun addProductsInPriceFactoryByZoneId(id: String,body: CreatePriceFactoryProductRequest)
    : Response<CreatePriceFactoryProductResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addProductsInPriceFactoryByZoneId(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getProductsInPriceFactoryByZoneId(id: String, zoneId: String, itemId: Double?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<CreateAppPriceFactoryProductsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductsInPriceFactoryByZoneId(companyId = config.companyId , applicationId = applicationId , id = id, zoneId = zoneId, itemId = itemId, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun createProductPriceFactoryBulkJob(id: String,body: CreateAppPriceFactoryProductBulkJobRequest)
    : Response<CreateAppPriceFactoryProductBulkJobResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createProductPriceFactoryBulkJob(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun pollProductPriceFactoryBulkJob(id: String, jobId: String)
    : Response<CreateAppPriceFactoryProductBulkJobPollResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollProductPriceFactoryBulkJob(companyId = config.companyId , applicationId = applicationId , id = id, jobId = jobId )
        } else {
            null
        }
    }
    
    
    suspend fun validateProductPriceFactoryBulkJob(id: String, jobId: String,body: CreateAppPriceFactoryProductBulkJobRequest)
    : Response<CreateAppPriceFactoryProductBulkJobValidateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.validateProductPriceFactoryBulkJob(companyId = config.companyId , applicationId = applicationId , id = id, jobId = jobId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun processProductPriceFactoryBulkJob(id: String, jobId: String,body: CreateAppPriceFactoryProductBulkJobRequest)
    : Response<CreateAppPriceFactoryProductBulkJobResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.processProductPriceFactoryBulkJob(companyId = config.companyId , applicationId = applicationId , id = id, jobId = jobId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun exportProductsInPriceFactory(id: String,body: CreateAppPriceFactoryProductExportJobRequest)
    : Response<CreateAppPriceFactoryProductExportJobResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.exportProductsInPriceFactory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun pollPriceFactoryJobs(id: String)
    : Response<CreateAppPriceFactoryProductExportJobPollResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollPriceFactoryJobs(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getAppProductPrices(itemIds: ArrayList<Int>?=null, factoryTypeIds: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<ProductPrices>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProductPrices(companyId = config.companyId , applicationId = applicationId , itemIds = itemIds, factoryTypeIds = factoryTypeIds, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getSynonyms(id: String?=null, name: String?=null, type: String?=null)
    : Response<SynonymListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSynonyms(companyId = config.companyId , applicationId = applicationId , id = id, name = name, type = type )
        } else {
            null
        }
    }
    
    
    suspend fun createSynonyms(body: SynonymCreateRequestSchema)
    : Response<SynonymCreateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSynonyms(applicationId = applicationId , companyId = config.companyId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateSynonyms(id: String,body: SynonymCreateRequestSchema)
    : Response<SynonymUpdateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSynonyms(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSynonym(id: String)
    : Response<SynonymDeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSynonym(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun exportSynonyms()
    : Response<SynonymExportResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.exportSynonyms(applicationId = applicationId , companyId = config.companyId  )
        } else {
            null
        }
    }
    
    
    suspend fun sampleBulkSynonymsFile(type: String)
    : Response<ResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.sampleBulkSynonymsFile(type = type, applicationId = applicationId , companyId = config.companyId  )
        } else {
            null
        }
    }
    
    
    suspend fun uploadSynonyms(body: SynonymUploadRequestSchema)
    : Response<SynonymUploadResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.uploadSynonyms(applicationId = applicationId , companyId = config.companyId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun validateBulkSynonyms(body: SynonymBulkValidateRequestSchema)
    : Response<SynonymBulkValidateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.validateBulkSynonyms(applicationId = applicationId , companyId = config.companyId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun processBulkSynonyms(body: SynonymBulkProcessRequestSchema)
    : Response<SynonymBulkProcessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.processBulkSynonyms(applicationId = applicationId , companyId = config.companyId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun pollBulkSynonyms(id: String)
    : Response<SynonymBulkPollResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollBulkSynonyms(applicationId = applicationId , companyId = config.companyId , id = id )
        } else {
            null
        }
    }
    
    
    
}
}