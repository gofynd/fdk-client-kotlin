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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun listCategories(level: String?=null,department: Int?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null,uids: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<CategoryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId,level = level,department = department,q = q,pageNo = pageNo,pageSize = pageSize,uids = uids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCategoryData(uid: String, headers: Map<String, String> = emptyMap())
    : Response<SingleCategoryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId,uid = uid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSellerInsights(sellerAppId: String, headers: Map<String, String> = emptyMap())
    : Response<CrossSellingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSellerInsights(
        companyId = config.companyId,sellerAppId = sellerAppId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listDepartmentsData(pageNo: Int?=null,itemType: String?=null,pageSize: Int?=null,name: String?=null,search: String?=null,isActive: Boolean?=null,uids: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<DepartmentsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId,pageNo = pageNo,itemType = itemType,pageSize = pageSize,name = name,search = search,isActive = isActive,uids = uids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDepartmentData(uid: String, headers: Map<String, String> = emptyMap())
    : Response<DepartmentsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getDepartmentData(
        companyId = config.companyId,uid = uid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String,templateTag: String?=null,itemType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductConfigurationDownloads>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId,filter = filter,templateTag = templateTag,itemType = itemType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventories(itemId: Int?=null,size: String?=null,pageNo: Int?=null,pageSize: Int?=null,pageId: String?=null,pageType: String?=null,q: String?=null,sellable: Boolean?=null,storeIds: ArrayList<Int>?=null,brandIds: ArrayList<Int>?=null,sellerIdentifiers: ArrayList<String>?=null,minSellable: Int?=null,maxSellable: Int?=null,fromDate: String?=null,toDate: String?=null,sizeIdentifier: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetInventoriesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventories(
        companyId = config.companyId,itemId = itemId,size = size,pageNo = pageNo,pageSize = pageSize,pageId = pageId,pageType = pageType,q = q,sellable = sellable,storeIds = storeIds,brandIds = brandIds,sellerIdentifiers = sellerIdentifiers,minSellable = minSellable,maxSellable = maxSellable,fromDate = fromDate,toDate = toDate,sizeIdentifier = sizeIdentifier, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkInventoryGet>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkInventoryJob(body: InventoryBulkJob, headers: Map<String, String> = emptyMap())
    : Response<InventoryBulkResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventoryJob(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteBulkInventoryJob(batchId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId,batchId = batchId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkInventory(batchId: String,body: InventoryBulkRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId,batchId = batchId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<InventoryExportResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExportJob(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryExport( headers: Map<String, String> = emptyMap())
    : Response<InventoryExportJobResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExport(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchProductExportDetail(jobId: String,body: ExportPatchRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<PatchProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.patchProductExportDetail(
        companyId = config.companyId,jobId = jobId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductExportDetail(jobId: String, headers: Map<String, String> = emptyMap())
    : Response<GetProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductExportDetail(
        companyId = config.companyId,jobId = jobId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchInventoryExportDetail(jobId: String,body: ExportPatchRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<EditInventoryDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.patchInventoryExportDetail(
        companyId = config.companyId,jobId = jobId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryExportDetail(jobId: String, headers: Map<String, String> = emptyMap())
    : Response<EditInventoryDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExportDetail(
        companyId = config.companyId,jobId = jobId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportInventoryConfig(filter: String, headers: Map<String, String> = emptyMap())
    : Response<InventoryConfig>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.exportInventoryConfig(
        companyId = config.companyId,filter = filter, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadInventoryTemplateView(type: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadInventoryTemplateView(
        companyId = config.companyId,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateProductTemplateSchema(itemType: String,bulk: Boolean, headers: Map<String, String> = emptyMap())
    : Response<InventoryValidationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplateSchema(
        companyId = config.companyId,itemType = itemType,bulk = bulk, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyBrandDetail(isActive: Boolean?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null,marketplace: String?=null, headers: Map<String, String> = emptyMap())
    : Response<OptinCompanyBrandDetailsView>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandDetail(
        companyId = config.companyId,isActive = isActive,q = q,pageNo = pageNo,pageSize = pageSize,marketplace = marketplace, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyDetail( headers: Map<String, String> = emptyMap())
    : Response<OptinCompanyDetail>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyDetail(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyMetrics( headers: Map<String, String> = emptyMap())
    : Response<OptinCompanyMetrics>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyMetrics(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreDetail(q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<OptinStoreDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getStoreDetail(
        companyId = config.companyId,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductAttributes(category: String,filter: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductAttributesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAttributes(
        companyId = config.companyId,category = category,filter = filter, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAttribute(attributeSlug: String, headers: Map<String, String> = emptyMap())
    : Response<AttributeDetail>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAttribute(
        companyId = config.companyId,attributeSlug = attributeSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProductBundle(body: ProductBundleRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<GetProductBundleCreateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductBundle(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductBundle(q: String?=null,slug: ArrayList<String>?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetProductBundleListingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId,q = q,slug = slug,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductBundleDetail(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetProductBundleResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundleDetail(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<GetProductBundleCreateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductAssetsInBulk(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkAssetResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAssetsInBulk(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProductAssetsInBulk(body: ProductBulkAssets, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductAssetsInBulk(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductBulkUploadHistory(search: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductBulkRequestSchemaList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId,search = search,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkProductUploadJob(body: BulkProductUploadJob, headers: Map<String, String> = emptyMap())
    : Response<ProductBulkResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkProductUploadJob(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteProductBulkJob(batchId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProductBulkJob(
        companyId = config.companyId,batchId = batchId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProductsInBulk(batchId: String,body: BulkProductRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductsInBulk(
        companyId = config.companyId,batchId = batchId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listHSNCodes( headers: Map<String, String> = emptyMap())
    : Response<HSNCodesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listHSNCodes(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductTags( headers: Map<String, String> = emptyMap())
    : Response<ProductTagsViewResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTags(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listProductTemplate(department: String, headers: Map<String, String> = emptyMap())
    : Response<TemplatesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId,department = department, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listProductTemplateCategories(departments: String,itemType: String,pageSize: Double?=null,pageNo: Double?=null,q: Double?=null, headers: Map<String, String> = emptyMap())
    : Response<ProdcutTemplateCategoriesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId,departments = departments,itemType = itemType,pageSize = pageSize,pageNo = pageNo,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadProductTemplateViews(slug: String,itemType: String?=null,type: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId,slug = slug,itemType = itemType,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateProductTemplate(slug: String,itemType: String?=null,bulk: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<TemplatesValidationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplate(
        companyId = config.companyId,slug = slug,itemType = itemType,bulk = bulk, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateProductGlobalTemplate(itemType: String?=null,bulk: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<TemplatesGlobalValidationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductGlobalTemplate(
        companyId = config.companyId,itemType = itemType,bulk = bulk, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductValidation(type: String,slug: String, headers: Map<String, String> = emptyMap())
    : Response<ValidateProduct>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductValidation(
        companyId = config.companyId,type = type,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryBySizeIdentifier(itemId: String,sizeIdentifier: String,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,locationIds: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationInventorySellerIdentifierResponsePaginated>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySizeIdentifier(
        companyId = config.companyId,itemId = itemId,sizeIdentifier = sizeIdentifier,pageNo = pageNo,pageSize = pageSize,q = q,locationIds = locationIds, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductSize(itemCode: String?=null,itemId: String,brandUid: Int?=null,uid: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<Product>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductSize(
        itemCode = itemCode,companyId = config.companyId,itemId = itemId,brandUid = brandUid,uid = uid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSize(itemId: String,size: String, headers: Map<String, String> = emptyMap())
    : Response<ProductSizeDeleteResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteSize(
        companyId = config.companyId,itemId = itemId,size = size, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryBySize(itemId: String,size: String,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,sellable: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<InventoryResponsePaginated>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySize(
        companyId = config.companyId,itemId = itemId,size = size,pageNo = pageNo,pageSize = pageSize,q = q,sellable = sellable, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getVariantsOfProducts(itemId: String,variantType: String,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductVariantsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getVariantsOfProducts(
        companyId = config.companyId,itemId = itemId,variantType = variantType,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyVerification(q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyVerificationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyVerification(
        companyId = config.companyId,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductVerificationDetails(itemId: String, headers: Map<String, String> = emptyMap())
    : Response<ProductVerificationModel>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductVerificationDetails(
        companyId = config.companyId,itemId = itemId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getVariantTypes(templateTag: String, headers: Map<String, String> = emptyMap())
    : Response<VariantTypesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getVariantTypes(
        companyId = config.companyId,templateTag = templateTag, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSizeGuide(body: ValidateSizeGuide, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createSizeGuide(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSizeGuides(active: Boolean?=null,q: String?=null,brandId: Int?=null,tag: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ListSizeGuide>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuides(
        companyId = config.companyId,active = active,q = q,brandId = brandId,tag = tag,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSizeGuide(id: String, headers: Map<String, String> = emptyMap())
    : Response<SizeGuideResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        id = id,companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSizeGuide(id: String,body: ValidateSizeGuide, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateSizeGuide(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getAllProductHsnCodes(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,type: String?=null, headers: Map<String, String> = emptyMap())
    : Response<HsnCodesListingResponseSchemaV2>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAllProductHsnCodes(
        pageNo = pageNo,pageSize = pageSize,q = q,type = type,companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSingleProductHSNCode(reportingHsn: String, headers: Map<String, String> = emptyMap())
    : Response<HSNDataInsertV2>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSingleProductHSNCode(
        reportingHsn = reportingHsn,companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateInventories(body: InventoryV2RequestSchema, headers: Map<String, String> = emptyMap())
    : Response<InventoryUpdateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateInventories(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun listInventoryExport(status: String?=null,fromDate: String?=null,toDate: String?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<InventoryExportJobListResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listInventoryExport(
        companyId = config.companyId,status = status,fromDate = fromDate,toDate = toDate,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createInventoryExport(body: InventoryCreateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<InventoryExportResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExport(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProducts(brandIds: ArrayList<Int>?=null,multiSize: Boolean?=null,categoryIds: ArrayList<Int>?=null,itemIds: ArrayList<Int>?=null,departmentIds: ArrayList<Int>?=null,itemCode: ArrayList<String>?=null,name: String?=null,slug: String?=null,allIdentifiers: ArrayList<String>?=null,q: String?=null,tags: ArrayList<String>?=null,pageNo: Int?=null,pageSize: Int?=null,pageType: String?=null,sortOn: String?=null,pageId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductListingResponseV2Schema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId,brandIds = brandIds,multiSize = multiSize,categoryIds = categoryIds,itemIds = itemIds,departmentIds = departmentIds,itemCode = itemCode,name = name,slug = slug,allIdentifiers = allIdentifiers,q = q,tags = tags,pageNo = pageNo,pageSize = pageSize,pageType = pageType,sortOn = sortOn,pageId = pageId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProduct(body: ProductCreateUpdateSchemaV2, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun uploadBulkProducts(department: String,productType: String,body: BulkProductJob, headers: Map<String, String> = emptyMap())
    : Response<ProductBulkResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.uploadBulkProducts(
        companyId = config.companyId,department = department,productType = productType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductExportJobs(status: String?=null,fromDate: String?=null,toDate: String?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductExportJobs(
        companyId = config.companyId,status = status,fromDate = fromDate,toDate = toDate,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProductExportJob(body: ProductTemplateDownloadsExport, headers: Map<String, String> = emptyMap())
    : Response<CreateProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductExportJob(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProduct(itemId: String,brandUid: Int?=null,itemCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SingleProductResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        companyId = config.companyId,itemId = itemId,brandUid = brandUid,itemCode = itemCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editProduct(itemId: String,body: ProductCreateUpdateSchemaV2, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.editProduct(
        companyId = config.companyId,itemId = itemId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteProduct(itemId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId,itemId = itemId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun allSizes(itemId: String, headers: Map<String, String> = emptyMap())
    : Response<GetAllSizes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.allSizes(
        companyId = config.companyId,itemId = itemId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteRealtimeInventory(itemId: String,sellerIdentifier: String,body: InventoryV2RequestSchema, headers: Map<String, String> = emptyMap())
    : Response<InventoryUpdateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteRealtimeInventory(
        companyId = config.companyId,itemId = itemId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateRealtimeInventory(itemId: String,sellerIdentifier: String,body: InventoryV2RequestSchema, headers: Map<String, String> = emptyMap())
    : Response<InventoryUpdateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateRealtimeInventory(
        companyId = config.companyId,itemId = itemId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductTemplateBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<GetProductTemplateSlugResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTemplateBySlug(
        companyId = config.companyId,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMarketplaces( headers: Map<String, String> = emptyMap())
    : Response<GetAllMarketplaces>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getMarketplaces(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMarketplaceOptin(marketplace: String,body: UpdateMarketplaceOptinRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateMarketplaceOptinResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateMarketplaceOptin(
        companyId = config.companyId,marketplace = marketplace, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMarketplaceOptin(marketplace: String,body: CreateMarketplaceOptinRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateMarketplaceOptinResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createMarketplaceOptin(
        companyId = config.companyId,marketplace = marketplace, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getCompanyBrandsDRI(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyDRIListResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandsDRI(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocationTags( headers: Map<String, String> = emptyMap())
    : Response<StoreTagsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getLocationTags(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCatalogInsights(brand: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CatalogInsightResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogInsights(companyId = config.companyId ,applicationId = applicationId ,brand = brand, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationBrandListing(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationBrandListingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationBrandListing(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
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
    
    ) : Paginator<ApplicationBrandListingSchema>{
        val paginator = Paginator<ApplicationBrandListingSchema>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationBrandListingSchema> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationBrandListingSchema>?,FdkError?) -> Unit){

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
    
    suspend fun updateAppBrand(brandUid: String,body: ApplicationBrandJson, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppBrand(companyId = config.companyId ,applicationId = applicationId ,brandUid = brandUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationBrands(department: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,brandId: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<BrandListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationBrands(companyId = config.companyId ,applicationId = applicationId ,department = department,pageNo = pageNo,pageSize = pageSize,q = q,brandId = brandId, headers = headers)
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
    
    ) : Paginator<BrandListingResponseSchema>{
        val paginator = Paginator<BrandListingResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<BrandListingResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<BrandListingResponseSchema>?,FdkError?) -> Unit){

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
    
    suspend fun getCategories(department: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CategoryListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCategories(companyId = config.companyId ,applicationId = applicationId ,department = department, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationCategoryListing(departmentId: Int?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationCategoryListingSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationCategoryListing(companyId = config.companyId ,applicationId = applicationId ,departmentId = departmentId,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
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
    
    ) : Paginator<ApplicationCategoryListingSchema>{
        val paginator = Paginator<ApplicationCategoryListingSchema>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationCategoryListingSchema> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationCategoryListingSchema>?,FdkError?) -> Unit){

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
    
    suspend fun updateAppCategory(categoryUid: String,body: ApplicationCategoryJson, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategory(companyId = config.companyId ,applicationId = applicationId ,categoryUid = categoryUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCollection(body: CreateCollection, headers: Map<String, String> = emptyMap())
    : Response<CollectionCreateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCollection(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllCollections(q: String?=null,scheduleStatus: String?=null,type: String?=null,tag: ArrayList<String>?=null,isActive: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCollectionListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId ,applicationId = applicationId ,q = q,scheduleStatus = scheduleStatus,type = type,tag = tag,isActive = isActive,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationFilterValues(filterKey: String,c: String?=null,collectionId: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetQueryFiltersValuesResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationFilterValues(companyId = config.companyId ,applicationId = applicationId ,filterKey = filterKey,c = c,collectionId = collectionId,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationFilterKeys(c: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetQueryFiltersKeysResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationFilterKeys(companyId = config.companyId ,applicationId = applicationId ,c = c, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getQueryFilters( headers: Map<String, String> = emptyMap())
    : Response<GetQueryFiltersResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getQueryFilters(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionItems(id: String,sortOn: String?=null,pageSize: Int?=null,pageNo: Int?=null,isPinned: Boolean?=null,q: String?=null,isExcluded: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCollectionItemsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId ,applicationId = applicationId ,id = id,sortOn = sortOn,pageSize = pageSize,pageNo = pageNo,isPinned = isPinned,q = q,isExcluded = isExcluded, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun clearCollectionItemsPriority(id: String, headers: Map<String, String> = emptyMap())
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.clearCollectionItemsPriority(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addCollectionItems(id: String,body: CollectionItemUpdateSchema, headers: Map<String, String> = emptyMap())
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addCollectionItems(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionDetail(slug: String, headers: Map<String, String> = emptyMap())
    : Response<GetCollectionDetailResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionDetail(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCollection(id: String,body: UpdateCollection, headers: Map<String, String> = emptyMap())
    : Response<UpdateCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCollection(id: String, headers: Map<String, String> = emptyMap())
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteCollection(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationDepartmentListing(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationDepartmentListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationDepartmentListing(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
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
    
    ) : Paginator<ApplicationDepartmentListingResponseSchema>{
        val paginator = Paginator<ApplicationDepartmentListingResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationDepartmentListingResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationDepartmentListingResponseSchema>?,FdkError?) -> Unit){

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
    
    suspend fun updateAppDepartment(departmentUid: String,body: ApplicationDepartmentJson, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppDepartment(companyId = config.companyId ,applicationId = applicationId ,departmentUid = departmentUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationsFilterMetadata(filter: String, headers: Map<String, String> = emptyMap())
    : Response<FilterResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationsFilterMetadata(companyId = config.companyId ,applicationId = applicationId ,filter = filter, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDepartments( headers: Map<String, String> = emptyMap())
    : Response<DepartmentResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDepartments(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppInventory(itemIds: ArrayList<Int>?=null,storeIds: ArrayList<Int>?=null,brandIds: ArrayList<Int>?=null,sellerIdentifiers: ArrayList<String>?=null,timestamp: String?=null,pageSize: Int?=null,pageId: String?=null,qtyGt: Int?=null,qtyLt: Int?=null,qtyType: String?=null,fromDate: String?=null,toDate: String?=null, headers: Map<String, String> = emptyMap())
    : Response<InventoryStockResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppInventory(companyId = config.companyId ,applicationId = applicationId ,itemIds = itemIds,storeIds = storeIds,brandIds = brandIds,sellerIdentifiers = sellerIdentifiers,timestamp = timestamp,pageSize = pageSize,pageId = pageId,qtyGt = qtyGt,qtyLt = qtyLt,qtyType = qtyType,fromDate = fromDate,toDate = toDate, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppLocations(storeType: String?=null,uid: ArrayList<Int>?=null,q: String?=null,stage: String?=null,pageNo: Int?=null,pageSize: Int?=null,tags: ArrayList<String>?=null,storeTypes: ArrayList<String>?=null,companyUids: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<LocationListSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppLocations(companyId = config.companyId ,applicationId = applicationId ,storeType = storeType,uid = uid,q = q,stage = stage,pageNo = pageNo,pageSize = pageSize,tags = tags,storeTypes = storeTypes,companyUids = companyUids, headers = headers)
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
    
    ) : Paginator<LocationListSchema>{
        val paginator = Paginator<LocationListSchema>()
        paginator.setCallBack(object : PaginatorCallback<LocationListSchema> {

            override suspend fun onNext(
                onResponse: (Event<LocationListSchema>?,FdkError?) -> Unit){

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
    
    suspend fun getConfigurations( headers: Map<String, String> = emptyMap())
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurations(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationProductListing(body: AppConfiguration, headers: Map<String, String> = emptyMap())
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationProductListing(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCatalogConfiguration( headers: Map<String, String> = emptyMap())
    : Response<GetCatalogConfigurationMetaData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationByType(type: String, headers: Map<String, String> = emptyMap())
    : Response<GetAppCatalogEntityConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationByType(companyId = config.companyId ,applicationId = applicationId ,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationByType(type: String,body: AppConfiguration, headers: Map<String, String> = emptyMap())
    : Response<GetAppCatalogConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationByType(companyId = config.companyId ,applicationId = applicationId ,type = type, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProduct(itemId: String, headers: Map<String, String> = emptyMap())
    : Response<OwnerAppItemResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProduct(companyId = config.companyId ,applicationId = applicationId ,itemId = itemId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppProduct(itemId: String,body: ApplicationItemMeta, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppProduct(companyId = config.companyId ,applicationId = applicationId ,itemId = itemId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationProducts(q: String?=null,f: String?=null,c: String?=null,filters: Boolean?=null,isDependent: Boolean?=null,sortOn: String?=null,pageId: String?=null,pageSize: Int?=null,pageNo: Int?=null,pageType: String?=null,itemIds: ArrayList<String>?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationProductListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationProducts(companyId = config.companyId ,applicationId = applicationId ,q = q,f = f,c = c,filters = filters,isDependent = isDependent,sortOn = sortOn,pageId = pageId,pageSize = pageSize,pageNo = pageNo,pageType = pageType,itemIds = itemIds, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationProducts
    **/
    fun getApplicationProductsPaginator(
    q: String?=null, f: String?=null, c: String?=null, filters: Boolean?=null, isDependent: Boolean?=null, sortOn: String?=null, pageSize: Int?=null, itemIds: ArrayList<String>?=null
    
    ) : Paginator<ApplicationProductListingResponseSchema>{
        val paginator = Paginator<ApplicationProductListingResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationProductListingResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationProductListingResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    catalogApiList?.getApplicationProducts(companyId = config.companyId , applicationId = applicationId , q = q, f = f, c = c, filters = filters, isDependent = isDependent, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType, itemIds = itemIds)?.safeAwait{ response, error ->
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
    
    suspend fun getDiscountedInventoryBySizeIdentifier(itemId: String,sizeIdentifier: String,pageNo: Int?=null,pageSize: Int?=null,locationIds: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationInventorySellerIdentifierResponsePaginated>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDiscountedInventoryBySizeIdentifier(companyId = config.companyId ,applicationId = applicationId ,itemId = itemId,sizeIdentifier = sizeIdentifier,pageNo = pageNo,pageSize = pageSize,locationIds = locationIds, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductDetailBySlug(slug: String, headers: Map<String, String> = emptyMap())
    : Response<ProductDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductDetailBySlug(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProducts(brandIds: ArrayList<Int>?=null,categoryIds: ArrayList<Int>?=null,departmentIds: ArrayList<Int>?=null,tags: ArrayList<String>?=null,itemIds: ArrayList<Int>?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<RawProductListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProducts(companyId = config.companyId ,applicationId = applicationId ,brandIds = brandIds,categoryIds = categoryIds,departmentIds = departmentIds,tags = tags,itemIds = itemIds,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppReturnConfiguration( headers: Map<String, String> = emptyMap())
    : Response<AppReturnConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppReturnConfiguration(body: CreateUpdateAppReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppReturnConfiguration(body: CreateUpdateAppReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAppCategoryReturnConfiguration(body: DeleteAppCategoryReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAppCategoryReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCategoryReturnConfig(q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<BaseAppCategoryReturnConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppCategoryReturnConfig(companyId = config.companyId ,applicationId = applicationId ,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppCategoryReturnConfiguration(body: BaseAppCategoryReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppCategoryReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCategoryReturnConfiguration(body: BaseAppCategoryReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategoryReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomAutocompleteRule(body: CreateAutocompleteKeyword, headers: Map<String, String> = emptyMap())
    : Response<CreateAutocompleteWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomAutocompleteRule(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteConfig(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,isActive: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q,isActive = isActive, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteKeywordDetail(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword, headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAutocompleteKeyword(id: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSearchRerank(body: CreateSearchRerankRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateSearchRerankResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSearchRerank(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchRerank( headers: Map<String, String> = emptyMap())
    : Response<GetSearchRerankResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchRerank(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchRerankDetail(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetSearchRerankDetailResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchRerankDetail(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchRerankConfiguration(id: String,body: UpdateSearchRerankRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateSearchRerankResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchRerankConfiguration(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchRerankConfiguration(id: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteSearchRerankConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchRerankConfiguration(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSearchConfiguration(body: CreateSearchConfigurationRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchConfiguration( headers: Map<String, String> = emptyMap())
    : Response<GetSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchConfiguration(body: UpdateSearchConfigurationRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchConfiguration( headers: Map<String, String> = emptyMap())
    : Response<DeleteSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomKeyword(body: CreateSearchKeyword, headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomKeyword(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllSearchKeyword(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,isActive: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllSearchKeyword(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q,isActive = isActive, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchKeywords(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchKeywords(id: String,body: CreateSearchKeyword, headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchKeywords(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSearchKeywords(id: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppLocation(storeUid: String,body: ApplicationStoreJson, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponse1Schema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppLocation(companyId = config.companyId ,applicationId = applicationId ,storeUid = storeUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateAllowSingle(body: AllowSingleRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ConfigSuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAllowSingle(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateDefaultSort(body: DefaultKeyRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ConfigSuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateDefaultSort(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createListingConfiguration(configType: String,body: AppConfigurationsFilter, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationsFilterResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getListingConfigurations(configType: String,pageNo: Int?=null,pageSize: Int?=null,search: String?=null,uids: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<GetListingConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getListingConfigurations(companyId = config.companyId ,applicationId = applicationId ,configType = configType,pageNo = pageNo,pageSize = pageSize,search = search,uids = uids, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createGroupConfiguration(configType: String,body: AppConfigurationCreateDetail, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createGroupConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGroupConfigurations(configType: String,pageNo: Int?=null,pageSize: Int?=null,search: String?=null,templateSlug: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getGroupConfigurations(companyId = config.companyId ,applicationId = applicationId ,configType = configType,pageNo = pageNo,pageSize = pageSize,search = search,templateSlug = templateSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateGroupConfiguration(configType: String,groupSlug: String,body: AppConfigurationDetail, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateGroupConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,groupSlug = groupSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteGroupConfiguration(configType: String,groupSlug: String, headers: Map<String, String> = emptyMap())
    : Response<Any>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteGroupConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,groupSlug = groupSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateListingConfiguration(configType: String,configId: String,body: AppConfigurationsFilterResponseSchema, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationsFilterResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,configId = configId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteListingConfiguration(configType: String,configId: String, headers: Map<String, String> = emptyMap())
    : Response<ConfigSuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,configId = configId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationMetadata(configType: String,templateSlug: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetConfigMetadataResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationMetadata(companyId = config.companyId ,applicationId = applicationId ,configType = configType,templateSlug = templateSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createAutocompleteSettings(body: AutocompleteRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<AutocompleteUpsertResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAutocompleteSettings(applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteSettings( headers: Map<String, String> = emptyMap())
    : Response<AutocompleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteSettings(applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteSettings(id: String,body: AutocompleteRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<AutocompleteUpsertResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteSettings(applicationId = applicationId ,companyId = config.companyId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompletePreview(q: String?=null,categorySuggestion: Int?=null,brandSuggestion: Int?=null,collectionSuggestion: Int?=null,productSuggestion: Int?=null,querySuggestion: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<AutocompletePreviewResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompletePreview(applicationId = applicationId ,companyId = config.companyId ,q = q,categorySuggestion = categorySuggestion,brandSuggestion = brandSuggestion,collectionSuggestion = collectionSuggestion,productSuggestion = productSuggestion,querySuggestion = querySuggestion, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRulePinAction(merchandisingRuleId: String,body: PinRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRulePinAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRulePinAction(merchandisingRuleId: String,body: PinRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRulePinAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRulePinAction(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<PinResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRulePinAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleHideAction(merchandisingRuleId: String,body: HideRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleHideAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleHideAction(merchandisingRuleId: String,body: HideRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleHideAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleHideAction(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<HideResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleHideAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleBoostAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleBoostAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleBoostAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleBoostAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleBoostAction(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<GetMerchandisingRuleBoostAction>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleBoostAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleBuryAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleBuryAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleBuryAction(merchandisingRuleId: String,body: PostMerchandisingRuleBoostAction, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleBuryAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRuleBuryAction(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<GetMerchandisingRuleBuryAction>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRuleBuryAction(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchandisingRuleQuery(body: MerchandisingRuleQueryPost, headers: Map<String, String> = emptyMap())
    : Response<MerchandiseQueryResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createMerchandisingRuleQuery(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingQuery(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<SearchResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingQuery(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchandisingRuleQuery(merchandisingRuleId: String,body: MerchandisingRuleQueryPost, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateMerchandisingRuleQuery(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun saveMerchandisingRules(merchandisingRuleId: String,body: MerchandisingRuleSave, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.saveMerchandisingRules(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteMerchandisingRule(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteMerchandisingRule(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchandisingRules(pageId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<MerchandisingRulesList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getMerchandisingRules(companyId = config.companyId ,applicationId = applicationId ,pageId = pageId,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteMerchandisingRulesPreview(merchandisingRuleId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseMerchandising>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteMerchandisingRulesPreview(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLivePreview(merchandisingRuleId: String,searchKeyword: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getLivePreview(companyId = config.companyId ,applicationId = applicationId ,merchandisingRuleId = merchandisingRuleId,searchKeyword = searchKeyword, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppPriceFactory(body: CreateAppPriceFactoryRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppPriceFactory(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppPriceFactories(isActive: Boolean?=null,factoryTypeId: String?=null,code: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetAppPriceFactoryResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppPriceFactories(companyId = config.companyId ,applicationId = applicationId ,isActive = isActive,factoryTypeId = factoryTypeId,code = code,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppPriceFactory(id: String, headers: Map<String, String> = emptyMap())
    : Response<AppPriceFactory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppPriceFactory(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editAppPriceFactory(id: String,body: EditAppPriceFactoryRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<AppPriceFactory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.editAppPriceFactory(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addProductsInPriceFactoryByZoneId(id: String,body: CreatePriceFactoryProductRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreatePriceFactoryProductResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addProductsInPriceFactoryByZoneId(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getProductsInPriceFactoryByZoneId(id: String,zoneId: String,itemId: Double?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductsInPriceFactoryByZoneId(companyId = config.companyId ,applicationId = applicationId ,id = id,zoneId = zoneId,itemId = itemId,q = q,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createProductPriceFactoryBulkJob(id: String,body: CreateAppPriceFactoryProductBulkJobRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductBulkJobResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createProductPriceFactoryBulkJob(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun pollProductPriceFactoryBulkJob(id: String,jobId: String, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductBulkJobPollResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollProductPriceFactoryBulkJob(companyId = config.companyId ,applicationId = applicationId ,id = id,jobId = jobId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateProductPriceFactoryBulkJob(id: String,jobId: String,body: CreateAppPriceFactoryProductBulkJobRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductBulkJobValidateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.validateProductPriceFactoryBulkJob(companyId = config.companyId ,applicationId = applicationId ,id = id,jobId = jobId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun processProductPriceFactoryBulkJob(id: String,jobId: String,body: CreateAppPriceFactoryProductBulkJobRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductBulkJobResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.processProductPriceFactoryBulkJob(companyId = config.companyId ,applicationId = applicationId ,id = id,jobId = jobId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportProductsInPriceFactory(id: String,body: CreateAppPriceFactoryProductExportJobRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductExportJobResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.exportProductsInPriceFactory(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun pollPriceFactoryJobs(id: String,startDate: String?=null,endDate: String?=null,stage: ArrayList<String>?=null,isActive: Boolean?=null,q: String?=null,type: ArrayList<String>?=null, headers: Map<String, String> = emptyMap())
    : Response<CreateAppPriceFactoryProductExportJobPollResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollPriceFactoryJobs(companyId = config.companyId ,applicationId = applicationId ,id = id,startDate = startDate,endDate = endDate,stage = stage,isActive = isActive,q = q,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProductPrices(itemIds: ArrayList<Int>?=null,factoryTypeIds: ArrayList<String>?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductPrices>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProductPrices(companyId = config.companyId ,applicationId = applicationId ,itemIds = itemIds,factoryTypeIds = factoryTypeIds,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSynonyms(id: String?=null,name: String?=null,type: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SynonymListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSynonyms(companyId = config.companyId ,applicationId = applicationId ,id = id,name = name,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSynonyms(body: SynonymCreateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SynonymCreateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createSynonyms(applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSynonyms(id: String,body: SynonymCreateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SynonymUpdateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSynonyms(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSynonym(id: String, headers: Map<String, String> = emptyMap())
    : Response<SynonymDeleteResponseSchemaSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSynonym(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun exportSynonyms( headers: Map<String, String> = emptyMap())
    : Response<SynonymExportResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.exportSynonyms(applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleBulkSynonymsFile(type: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.sampleBulkSynonymsFile(type = type,applicationId = applicationId ,companyId = config.companyId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun uploadSynonyms(body: SynonymUploadRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SynonymUploadResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.uploadSynonyms(applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateBulkSynonyms(body: SynonymBulkValidateRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SynonymBulkValidateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.validateBulkSynonyms(applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun processBulkSynonyms(body: SynonymBulkProcessRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SynonymBulkProcessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.processBulkSynonyms(applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun pollBulkSynonyms(id: String, headers: Map<String, String> = emptyMap())
    : Response<SynonymBulkPollResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.pollBulkSynonyms(applicationId = applicationId ,companyId = config.companyId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getAppPriceById(itemId: String,storeIds: ArrayList<Int>?=null,factoryTypeIds: ArrayList<String>?=null,sellerId: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<AppPriceByIdResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppPriceById(applicationId = applicationId ,companyId = config.companyId ,itemId = itemId,storeIds = storeIds,factoryTypeIds = factoryTypeIds,sellerId = sellerId, headers = headers)
        } else {
            null
        }
    }
    
}
}