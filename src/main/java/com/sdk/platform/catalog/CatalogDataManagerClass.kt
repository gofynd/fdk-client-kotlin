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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun listCategories(level: String?=null,department: Int?=null,q: String?=null,pageNo: Int?=null,pageSize: Int?=null,uids: ArrayList<Int>?=null,slug: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CategoryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId,level = level,department = department,q = q,pageNo = pageNo,pageSize = pageSize,uids = uids,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for listCategories
    **/
    fun listCategoriesPaginator(companyId: String, level: String?=null, department: Int?=null, q: String?=null, pageSize: Int?=null, uids: ArrayList<Int>?=null, slug: String?=null) : Paginator<CategoryResponseSchema>{
        val paginator = Paginator<CategoryResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<CategoryResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<CategoryResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.listCategories(
                    companyId = config.companyId, level = level, department = department, q = q, pageNo = pageNo, pageSize = pageSize, uids = uids, slug = slug
                    )?.safeAwait{ response, error ->
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
    
    
    suspend fun listDepartmentsData(pageNo: Int?=null,itemType: String?=null,pageSize: Int?=null,name: String?=null,search: String?=null,isActive: Boolean?=null,slug: String?=null, headers: Map<String, String> = emptyMap())
    : Response<DepartmentsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId,pageNo = pageNo,itemType = itemType,pageSize = pageSize,name = name,search = search,isActive = isActive,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for listDepartmentsData
    **/
    fun listDepartmentsDataPaginator(companyId: String, itemType: String?=null, pageSize: Int?=null, name: String?=null, search: String?=null, isActive: Boolean?=null, slug: String?=null) : Paginator<DepartmentsResponseSchema>{
        val paginator = Paginator<DepartmentsResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<DepartmentsResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<DepartmentsResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.listDepartmentsData(
                    companyId = config.companyId, pageNo = pageNo, itemType = itemType, pageSize = pageSize, name = name, search = search, isActive = isActive, slug = slug
                    )?.safeAwait{ response, error ->
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
    
    
    suspend fun bulkHsnCode(body: BulkHsnUpsert, headers: Map<String, String> = emptyMap())
    : Response<BulkHsnResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.bulkHsnCode(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getHsnCode(id: String, headers: Map<String, String> = emptyMap())
    : Response<HsnCode>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getHsnCode(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateHsnCode(id: String,body: HsnUpsert, headers: Map<String, String> = emptyMap())
    : Response<HsnCode>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateHsnCode(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventories(itemId: String?=null,size: String?=null,pageNo: Int?=null,pageSize: Int?=null,pageId: String?=null,pageType: String?=null,q: String?=null,sellable: Boolean?=null,storeIds: ArrayList<Int>?=null,brandIds: ArrayList<Int>?=null,sellerIdentifiers: ArrayList<String>?=null,qtyGt: Int?=null,qtyLt: Int?=null,qtyType: String?=null,fromDate: String?=null,toDate: String?=null,sizeIdentifier: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetInventoriesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventories(
        companyId = config.companyId,itemId = itemId,size = size,pageNo = pageNo,pageSize = pageSize,pageId = pageId,pageType = pageType,q = q,sellable = sellable,storeIds = storeIds,brandIds = brandIds,sellerIdentifiers = sellerIdentifiers,qtyGt = qtyGt,qtyLt = qtyLt,qtyType = qtyType,fromDate = fromDate,toDate = toDate,sizeIdentifier = sizeIdentifier, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
            
                
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getInventories
    **/
    fun getInventoriesPaginator(companyId: String, itemId: String?=null, size: String?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null, storeIds: ArrayList<Int>?=null, brandIds: ArrayList<Int>?=null, sellerIdentifiers: ArrayList<String>?=null, qtyGt: Int?=null, qtyLt: Int?=null, qtyType: String?=null, fromDate: String?=null, toDate: String?=null, sizeIdentifier: String?=null) : Paginator<GetInventoriesResponseSchema>{
        val paginator = Paginator<GetInventoriesResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<GetInventoriesResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<GetInventoriesResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    catalogApiList?.getInventories(
                    companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, pageId = pageId, pageType = pageType, q = q, sellable = sellable, storeIds = storeIds, brandIds = brandIds, sellerIdentifiers = sellerIdentifiers, qtyGt = qtyGt, qtyLt = qtyLt, qtyType = qtyType, fromDate = fromDate, toDate = toDate, sizeIdentifier = sizeIdentifier
                    )?.safeAwait{ response, error ->
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
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null,pageSize: Int?=null,search: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkInventoryGet>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,search = search, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getInventoryBulkUploadHistory
    **/
    fun getInventoryBulkUploadHistoryPaginator(companyId: String, pageSize: Int?=null, search: String?=null) : Paginator<BulkInventoryGet>{
        val paginator = Paginator<BulkInventoryGet>()
        paginator.setCallBack(object : PaginatorCallback<BulkInventoryGet> {

            override suspend fun onNext(
                onResponse: (Event<BulkInventoryGet>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getInventoryBulkUploadHistory(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, search = search
                    )?.safeAwait{ response, error ->
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
    
    suspend fun createBulkInventoryJob(body: BulkJob, headers: Map<String, String> = emptyMap())
    : Response<BulkResponseSchema>? {

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
    
    
    suspend fun getInventoryExport( headers: Map<String, String> = emptyMap())
    : Response<InventoryExportJob>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExport(
        companyId = config.companyId, headers = headers)
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
    
    
    suspend fun exportInventoryConfig(filterType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<InventoryConfig>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.exportInventoryConfig(
        companyId = config.companyId,filterType = filterType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadInventoryTemplateView(itemType: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadInventoryTemplateView(
        companyId = config.companyId,itemType = itemType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateProductTemplateSchema(itemType: String, headers: Map<String, String> = emptyMap())
    : Response<InventoryValidationResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplateSchema(
        companyId = config.companyId,itemType = itemType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOptimalLocations(body: AssignStore, headers: Map<String, String> = emptyMap())
    : Response<StoreAssignResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getOptimalLocations(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMarketplaceOptinDetail( headers: Map<String, String> = emptyMap())
    : Response<GetOptInPlatform>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getMarketplaceOptinDetail(
        companyId = config.companyId, headers = headers)
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStoreDetail
    **/
    fun getStoreDetailPaginator(companyId: String, q: String?=null, pageSize: Int?=null) : Paginator<OptinStoreDetails>{
        val paginator = Paginator<OptinStoreDetails>()
        paginator.setCallBack(object : PaginatorCallback<OptinStoreDetails> {

            override suspend fun onNext(
                onResponse: (Event<OptinStoreDetails>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getStoreDetail(
                    companyId = config.companyId, q = q, pageNo = pageNo, pageSize = pageSize
                    )?.safeAwait{ response, error ->
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
    
    
    suspend fun getProductBundle(q: String?=null,slug: ArrayList<String>?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetProductBundleListingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId,q = q,slug = slug,pageNo = pageNo,pageSize = pageSize, headers = headers)
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
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductAssetsInBulk
    **/
    fun getProductAssetsInBulkPaginator(companyId: String, pageSize: Int?=null) : Paginator<BulkAssetResponseSchema>{
        val paginator = Paginator<BulkAssetResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<BulkAssetResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<BulkAssetResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getProductAssetsInBulk(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize
                    )?.safeAwait{ response, error ->
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
    : Response<ProductBulkRequestList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId,search = search,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getProductBulkUploadHistory
    **/
    fun getProductBulkUploadHistoryPaginator(companyId: String, search: String?=null, pageSize: Int?=null) : Paginator<ProductBulkRequestList>{
        val paginator = Paginator<ProductBulkRequestList>()
        paginator.setCallBack(object : PaginatorCallback<ProductBulkRequestList> {

            override suspend fun onNext(
                onResponse: (Event<ProductBulkRequestList>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getProductBulkUploadHistory(
                    companyId = config.companyId, search = search, pageNo = pageNo, pageSize = pageSize
                    )?.safeAwait{ response, error ->
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
    
    suspend fun createBulkProductUploadJob(body: BulkJob, headers: Map<String, String> = emptyMap())
    : Response<BulkResponseSchema>? {

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
    
    
    suspend fun listProductTemplateExportDetails( headers: Map<String, String> = emptyMap())
    : Response<ProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId, headers = headers)
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
    
    
    suspend fun listProductTemplateCategories(departments: String,itemType: String, headers: Map<String, String> = emptyMap())
    : Response<ProdcutTemplateCategoriesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId,departments = departments,itemType = itemType, headers = headers)
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
    
    
    suspend fun getProductValidation( headers: Map<String, String> = emptyMap())
    : Response<ValidateProduct>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductValidation(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryBySizeIdentifier(itemId: String,sizeIdentifier: String,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,locationIds: ArrayList<Int>?=null, headers: Map<String, String> = emptyMap())
    : Response<InventorySellerIdentifierResponsePaginated>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySizeIdentifier(
        companyId = config.companyId,itemId = itemId,sizeIdentifier = sizeIdentifier,pageNo = pageNo,pageSize = pageSize,q = q,locationIds = locationIds, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getInventoryBySizeIdentifier
    **/
    fun getInventoryBySizeIdentifierPaginator(companyId: String, itemId: String, sizeIdentifier: String, pageSize: Int?=null, q: String?=null, locationIds: ArrayList<Int>?=null) : Paginator<InventorySellerIdentifierResponsePaginated>{
        val paginator = Paginator<InventorySellerIdentifierResponsePaginated>()
        paginator.setCallBack(object : PaginatorCallback<InventorySellerIdentifierResponsePaginated> {

            override suspend fun onNext(
                onResponse: (Event<InventorySellerIdentifierResponsePaginated>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getInventoryBySizeIdentifier(
                    companyId = config.companyId, itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, q = q, locationIds = locationIds
                    )?.safeAwait{ response, error ->
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
    
    suspend fun getProductSize(itemCode: String?=null,itemId: String,brandUid: Int?=null,uid: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductListingResponseSchema>? {

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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getInventoryBySize
    **/
    fun getInventoryBySizePaginator(companyId: String, itemId: String, size: String, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null) : Paginator<InventoryResponsePaginated>{
        val paginator = Paginator<InventoryResponsePaginated>()
        paginator.setCallBack(object : PaginatorCallback<InventoryResponsePaginated> {

            override suspend fun onNext(
                onResponse: (Event<InventoryResponsePaginated>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getInventoryBySize(
                    companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable
                    )?.safeAwait{ response, error ->
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
    
    suspend fun addInventory(itemId: String,size: String,body: InventoryRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.addInventory(
        companyId = config.companyId,itemId = itemId,size = size, body = body,headers = headers)
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getVariantsOfProducts
    **/
    fun getVariantsOfProductsPaginator(companyId: String, itemId: String, variantType: String, pageSize: Int?=null) : Paginator<ProductVariantsResponseSchema>{
        val paginator = Paginator<ProductVariantsResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<ProductVariantsResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<ProductVariantsResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getVariantsOfProducts(
                    companyId = config.companyId, itemId = itemId, variantType = variantType, pageNo = pageNo, pageSize = pageSize
                    )?.safeAwait{ response, error ->
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
    
    suspend fun getSizeGuides(active: Boolean?=null,q: String?=null,tag: String?=null,pageNo: Int?=null,pageSize: Int?=null,brandId: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ListSizeGuide>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuides(
        companyId = config.companyId,active = active,q = q,tag = tag,pageNo = pageNo,pageSize = pageSize,brandId = brandId, headers = headers)
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
    
    
    suspend fun getSizeGuide(id: String, headers: Map<String, String> = emptyMap())
    : Response<SizeGuideResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        companyId = config.companyId,id = id, headers = headers)
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
    
    
    suspend fun updateInventories(body: InventoryRequestSchemaV2, headers: Map<String, String> = emptyMap())
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
    
    
    suspend fun getProducts(brandIds: ArrayList<Int>?=null,categoryIds: ArrayList<Int>?=null,itemIds: ArrayList<Int>?=null,departmentIds: ArrayList<Int>?=null,itemCode: ArrayList<String>?=null,name: String?=null,slug: String?=null,allIdentifiers: ArrayList<String>?=null,q: String?=null,tags: ArrayList<String>?=null,pageNo: Int?=null,pageSize: Int?=null,pageType: String?=null,sortOn: String?=null,pageId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ProductListingResponseV2>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId,brandIds = brandIds,categoryIds = categoryIds,itemIds = itemIds,departmentIds = departmentIds,itemCode = itemCode,name = name,slug = slug,allIdentifiers = allIdentifiers,q = q,tags = tags,pageNo = pageNo,pageSize = pageSize,pageType = pageType,sortOn = sortOn,pageId = pageId, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
            
                
            
        
    /**
    *
    * Summary: Paginator for getProducts
    **/
    fun getProductsPaginator(companyId: String, brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, itemIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, itemCode: ArrayList<String>?=null, name: String?=null, slug: String?=null, allIdentifiers: ArrayList<String>?=null, q: String?=null, tags: ArrayList<String>?=null, pageSize: Int?=null, sortOn: String?=null) : Paginator<ProductListingResponseV2>{
        val paginator = Paginator<ProductListingResponseV2>()
        paginator.setCallBack(object : PaginatorCallback<ProductListingResponseV2> {

            override suspend fun onNext(
                onResponse: (Event<ProductListingResponseV2>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    catalogApiList?.getProducts(
                    companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, itemIds = itemIds, departmentIds = departmentIds, itemCode = itemCode, name = name, slug = slug, allIdentifiers = allIdentifiers, q = q, tags = tags, pageNo = pageNo, pageSize = pageSize, pageType = pageType, sortOn = sortOn, pageId = pageId
                    )?.safeAwait{ response, error ->
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
    
    suspend fun createProduct(body: ProductCreateUpdateSchemaV2, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseObject>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun uploadBulkProducts(department: String,productType: String,body: BulkProductJob, headers: Map<String, String> = emptyMap())
    : Response<BulkResponseSchema>? {

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
    : Response<ProductDownloadsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductExportJob(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteProduct(itemId: String,body: DeleteProductRequestBody, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId,itemId = itemId, body = body,headers = headers)
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
    
    
    suspend fun allSizes(itemId: String, headers: Map<String, String> = emptyMap())
    : Response<GetAllSizes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.allSizes(
        companyId = config.companyId,itemId = itemId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteRealtimeInventory(itemId: String,sellerIdentifier: String,body: InventoryRequestSchemaV2, headers: Map<String, String> = emptyMap())
    : Response<InventoryUpdateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteRealtimeInventory(
        companyId = config.companyId,itemId = itemId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateRealtimeInventory(itemId: String,sellerIdentifier: String,body: InventoryRequestSchemaV2, headers: Map<String, String> = emptyMap())
    : Response<InventoryUpdateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateRealtimeInventory(
        companyId = config.companyId,itemId = itemId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateLocationPrice(storeId: String,sellerIdentifier: String,body: LocationPriceRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<LocationPriceQuantitySuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateLocationPrice(
        companyId = config.companyId,storeId = storeId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateLocationQuantity(storeId: String,sellerIdentifier: String,body: LocationQuantityRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<LocationPriceQuantitySuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateLocationQuantity(
        companyId = config.companyId,storeId = storeId,sellerIdentifier = sellerIdentifier, body = body,headers = headers)
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
    
    
    suspend fun updateMarketplaceOptin(marketplaceSlug: String,body: UpdateMarketplaceOptinRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateMarketplaceOptinResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateMarketplaceOptin(
        companyId = config.companyId,marketplaceSlug = marketplaceSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMarketplaceOptin(marketplaceSlug: String,body: OptInPostRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<CreateMarketplaceOptinResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createMarketplaceOptin(
        companyId = config.companyId,marketplaceSlug = marketplaceSlug, body = body,headers = headers)
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
    : Response<SuccessResponseObject>? {
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
    : Response<SuccessResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppCategory(companyId = config.companyId ,applicationId = applicationId ,categoryUid = categoryUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllCollections(q: String?=null,scheduleStatus: String?=null,type: String?=null,tags: ArrayList<String>?=null,isActive: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCollectionListingResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId ,applicationId = applicationId ,q = q,scheduleStatus = scheduleStatus,type = type,tags = tags,isActive = isActive,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAllCollections
    **/
    fun getAllCollectionsPaginator(
    q: String?=null, scheduleStatus: String?=null, type: String?=null, tags: ArrayList<String>?=null, isActive: Boolean?=null, pageSize: Int?=null
    
    ) : Paginator<GetCollectionListingResponseSchema>{
        val paginator = Paginator<GetCollectionListingResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<GetCollectionListingResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<GetCollectionListingResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId , q = q, scheduleStatus = scheduleStatus, type = type, tags = tags, isActive = isActive, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createCollection(q: String?=null,scheduleStatus: String?=null,type: String?=null,tags: ArrayList<String>?=null,isActive: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null,body: CreateCollection, headers: Map<String, String> = emptyMap())
    : Response<CollectionCreateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCollection(companyId = config.companyId ,applicationId = applicationId ,q = q,scheduleStatus = scheduleStatus,type = type,tags = tags,isActive = isActive,pageNo = pageNo,pageSize = pageSize, body = body,headers = headers)
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
    
    
    suspend fun deleteCollection(id: String, headers: Map<String, String> = emptyMap())
    : Response<CommonResponseSchemaCollection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteCollection(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    suspend fun getCollectionItems(id: String,sortOn: String?=null,pageId: String?=null,pageSize: Int?=null,pageNo: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCollectionItemsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId ,applicationId = applicationId ,id = id,sortOn = sortOn,pageId = pageId,pageSize = pageSize,pageNo = pageNo, headers = headers)
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
    : Response<SuccessResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAppDepartment(companyId = config.companyId ,applicationId = applicationId ,departmentUid = departmentUid, body = body,headers = headers)
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
    
    
    suspend fun getAppLocations(storeType: String?=null,uid: ArrayList<Int>?=null,q: String?=null,stage: String?=null,pageNo: Int?=null,pageSize: Int?=null,tags: ArrayList<String>?=null,storeTypes: ArrayList<String>?=null, headers: Map<String, String> = emptyMap())
    : Response<LocationListSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppLocations(companyId = config.companyId ,applicationId = applicationId ,storeType = storeType,uid = uid,q = q,stage = stage,pageNo = pageNo,pageSize = pageSize,tags = tags,storeTypes = storeTypes, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppLocations
    **/
    fun getAppLocationsPaginator(
    storeType: String?=null, uid: ArrayList<Int>?=null, q: String?=null, stage: String?=null, pageSize: Int?=null, tags: ArrayList<String>?=null, storeTypes: ArrayList<String>?=null
    
    ) : Paginator<LocationListSchema>{
        val paginator = Paginator<LocationListSchema>()
        paginator.setCallBack(object : PaginatorCallback<LocationListSchema> {

            override suspend fun onNext(
                onResponse: (Event<LocationListSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getAppLocations(companyId = config.companyId , applicationId = applicationId , storeType = storeType, uid = uid, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize, tags = tags, storeTypes = storeTypes)?.safeAwait{ response, error ->
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
    : Response<SuccessResponseObject>? {
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getDiscountedInventoryBySizeIdentifier
    **/
    fun getDiscountedInventoryBySizeIdentifierPaginator(
    itemId: String, sizeIdentifier: String, pageSize: Int?=null, locationIds: ArrayList<Int>?=null
    
    ) : Paginator<ApplicationInventorySellerIdentifierResponsePaginated>{
        val paginator = Paginator<ApplicationInventorySellerIdentifierResponsePaginated>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationInventorySellerIdentifierResponsePaginated> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationInventorySellerIdentifierResponsePaginated>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getDiscountedInventoryBySizeIdentifier(companyId = config.companyId , applicationId = applicationId , itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, locationIds = locationIds)?.safeAwait{ response, error ->
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppProducts
    **/
    fun getAppProductsPaginator(
    brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, tags: ArrayList<String>?=null, itemIds: ArrayList<Int>?=null, pageSize: Int?=null, q: String?=null
    
    ) : Paginator<RawProductListingResponseSchema>{
        val paginator = Paginator<RawProductListingResponseSchema>()
        paginator.setCallBack(object : PaginatorCallback<RawProductListingResponseSchema> {

            override suspend fun onNext(
                onResponse: (Event<RawProductListingResponseSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getAppProducts(companyId = config.companyId , applicationId = applicationId , brandIds = brandIds, categoryIds = categoryIds, departmentIds = departmentIds, tags = tags, itemIds = itemIds, pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
    
    suspend fun getAppReturnConfiguration( headers: Map<String, String> = emptyMap())
    : Response<AppReturnConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppReturnConfiguration(body: CreateUpdateAppReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseObject>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createAppReturnConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppReturnConfiguration(body: CreateUpdateAppReturnConfig, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseObject>? {
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
    : Response<SuccessResponseObject>? {
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
    
    
    suspend fun getAutocompleteConfig( headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun deleteAutocompleteKeyword(id: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteKeywordDetail(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword, headers: Map<String, String> = emptyMap())
    : Response<GetAutocompleteWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
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
    
    
    suspend fun getSearchConfiguration( headers: Map<String, String> = emptyMap())
    : Response<GetSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun updateSearchConfiguration(body: UpdateSearchConfigurationRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateSearchConfigurationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllSearchKeyword( headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllSearchKeyword(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun deleteSearchKeywords(id: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchKeywords(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetSearchWordsDetailResponseSchema>? {
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
    
    
    suspend fun updateAppLocation(storeUid: String,body: ApplicationStoreJson, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseObject>? {
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
    
    
    suspend fun getListingConfigurations(configType: String,pageNo: Int?=null,pageSize: Int?=null,search: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getListingConfigurations(companyId = config.companyId ,applicationId = applicationId ,configType = configType,pageNo = pageNo,pageSize = pageSize,search = search, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createListingConfiguration(configType: String,body: AppConfigurationsSort, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationsSort>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
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
    
    
    suspend fun createGroupConfiguration(configType: String,body: AppConfigurationDetail, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createGroupConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteGroupConfiguration(configType: String,groupSlug: String, headers: Map<String, String> = emptyMap())
    : Response<ConfigSuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteGroupConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,groupSlug = groupSlug, headers = headers)
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
    
    
    suspend fun deleteListingConfiguration(configType: String,configId: String, headers: Map<String, String> = emptyMap())
    : Response<ConfigSuccessResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,configId = configId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateListingConfiguration(configType: String,configId: String,body: AppConfigurationsSort, headers: Map<String, String> = emptyMap())
    : Response<AppConfigurationsSort>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateListingConfiguration(companyId = config.companyId ,applicationId = applicationId ,configType = configType,configId = configId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationMetadata(configType: String,templateSlug: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetConfigMetadataResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationMetadata(companyId = config.companyId ,applicationId = applicationId ,configType = configType,templateSlug = templateSlug,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}