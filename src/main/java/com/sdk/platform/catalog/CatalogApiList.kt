package com.sdk.platform.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface CatalogApiList {
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    suspend fun getCatalogInsights(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand") brand: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CatalogInsightResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    suspend fun getApplicationBrandListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    suspend fun updateAppBrand(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("brand_uid") brandUid: String,@Body body: ApplicationBrandJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    suspend fun getApplicationBrands(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("brand_id") brandId: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    suspend fun getCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    suspend fun getApplicationCategoryListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department_id") departmentId: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    suspend fun updateAppCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_uid") categoryUid: String,@Body body: ApplicationCategoryJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    suspend fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("schedule_status") scheduleStatus: String?, @Query("type") type: String?, @Query("tags") tags: ArrayList<String>?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionListingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    suspend fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection, @HeaderMap headers: Map<String, String>? = null)
    : Response<CollectionCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/{filter_key}/values")
    suspend fun getApplicationFilterValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("filter_key") filterKey: String, @Query("c") c: String?, @Query("collection_id") collectionId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersValuesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/keys")
    suspend fun getApplicationFilterKeys(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("c") c: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersKeysResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    suspend fun getQueryFilters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    suspend fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CommonResponseSchemaCollection>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    suspend fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateCollection, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCollection>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    suspend fun getCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionItemsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    suspend fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemUpdateSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CommonResponseSchemaCollection>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    suspend fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionDetailResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    suspend fun getApplicationDepartmentListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationDepartmentListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    suspend fun updateAppDepartment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("department_uid") departmentUid: String,@Body body: ApplicationDepartmentJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    suspend fun getDepartments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    suspend fun getAppInventory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("timestamp") timestamp: String?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @Query("qty_gt") qtyGt: Int?, @Query("qty_lt") qtyLt: Int?, @Query("qty_type") qtyType: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryStockResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/locations")
    suspend fun getAppLocations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_type") storeType: String?, @Query("uid") uid: ArrayList<Int>?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tags") tags: ArrayList<String>?, @Query("store_types") storeTypes: ArrayList<String>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LocationListSerializer>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    suspend fun getConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    suspend fun createConfigurationProductListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    suspend fun getCatalogConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCatalogConfigurationMetaData>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    suspend fun getConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogEntityConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    suspend fun createConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: AppConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    suspend fun getAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OwnerAppItemResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    suspend fun updateAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String,@Body body: ApplicationItemMeta, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    suspend fun getAppicationProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("f") f: String?, @Query("c") c: String?, @Query("filters") filters: Boolean?, @Query("is_dependent") isDependent: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @Query("item_ids") itemIds: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getDiscountedInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    suspend fun getProductDetailBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    suspend fun getAppProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("tags") tags: ArrayList<String>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<RawProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    suspend fun getAppReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppReturnConfigResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    suspend fun createAppReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUpdateAppReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    suspend fun updateAppReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUpdateAppReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun deleteAppCategoryReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DeleteAppCategoryReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun getAppCategoryReturnConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BaseAppCategoryReturnConfigResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun createAppCategoryReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BaseAppCategoryReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun updateAppCategoryReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BaseAppCategoryReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    suspend fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    suspend fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAutocompleteWordsResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    suspend fun deleteSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteSearchConfigurationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    suspend fun getSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchConfigurationResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    suspend fun createSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchConfigurationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateSearchConfigurationResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    suspend fun updateSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateSearchConfigurationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateSearchConfigurationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    suspend fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    suspend fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsData>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsDetailResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsData>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    suspend fun updateAppLocation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_uid") storeUid: String,@Body body: ApplicationStoreJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    suspend fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("department") department: Int?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("uids") uids: ArrayList<Int>?, @Query("slug") slug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    suspend fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    suspend fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SingleCategoryResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    suspend fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    suspend fun getSellerInsights(@Path("company_id") companyId: String, @Path("seller_app_id") sellerAppId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CrossSellingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    suspend fun listDepartmentsData(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("item_type") itemType: String?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("search") search: String?, @Query("is_active") isActive: Boolean?, @Query("slug") slug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    suspend fun createDepartments(@Path("company_id") companyId: String,@Body body: DepartmentCreateUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    suspend fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentsResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    suspend fun updateDepartment(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: DepartmentCreateUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentModel>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    suspend fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String, @Query("template_tag") templateTag: String?, @Query("item_type") itemType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductConfigurationDownloads>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    suspend fun bulkHsnCode(@Path("company_id") companyId: String,@Body body: BulkHsnUpsert, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkHsnResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    suspend fun getHsnCode(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HsnCode>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    suspend fun updateHsnCode(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: HsnUpsert, @HeaderMap headers: Map<String, String>? = null)
    : Response<HsnCode>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    suspend fun getInventories(@Path("company_id") companyId: String, @Query("item_id") itemId: String?, @Query("size") size: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @Query("page_type") pageType: String?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("qty_gt") qtyGt: Int?, @Query("qty_lt") qtyLt: Int?, @Query("qty_type") qtyType: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("size_identifier") sizeIdentifier: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetInventoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    suspend fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkInventoryGet>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    suspend fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    suspend fun deleteBulkInventoryJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    suspend fun createBulkInventory(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: InventoryBulkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    suspend fun getInventoryExport(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportJob>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    suspend fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    suspend fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryConfig>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    suspend fun downloadInventoryTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    suspend fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryValidationResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: AssignStore, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreAssignResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    suspend fun getMarketplaceOptinDetail(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetOptInPlatform>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    suspend fun getCompanyBrandDetail(@Path("company_id") companyId: String, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("marketplace") marketplace: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyBrandDetailsView>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    suspend fun getCompanyDetail(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    suspend fun getCompanyMetrics(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyMetrics>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    suspend fun getStoreDetail(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinStoreDetails>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    suspend fun getProductAttributes(@Path("company_id") companyId: String, @Query("category") category: String, @Query("filter") filter: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductAttributesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    suspend fun getGenderAttribute(@Path("company_id") companyId: String, @Path("attribute_slug") attributeSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenderDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    suspend fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("slug") slug: ArrayList<String>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleListingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    suspend fun createProductBundle(@Path("company_id") companyId: String,@Body body: ProductBundleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    suspend fun getProductBundleDetail(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    suspend fun updateProductBundle(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ProductBundleUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    suspend fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkAssetResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    suspend fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBulkRequestList>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun createBulkProductUploadJob(@Path("company_id") companyId: String,@Body body: BulkJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    suspend fun listProductTemplateExportDetails(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDownloadsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    suspend fun listHSNCodes(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HSNCodesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    suspend fun getProductTags(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductTagsViewResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    suspend fun listProductTemplate(@Path("company_id") companyId: String, @Query("department") department: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplatesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    suspend fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProdcutTemplateCategoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    suspend fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String, @Query("item_type") itemType: String?, @Query("type") type: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    suspend fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String, @Query("item_type") itemType: String?, @Query("bulk") bulk: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplatesValidationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    suspend fun getProductValidation(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateProduct>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    suspend fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizeDeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun getInventoryBySize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryResponsePaginated>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    suspend fun getVariantsOfProducts(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("variant_type") variantType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductVariantsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun getSizeGuides(@Path("company_id") companyId: String, @Query("active") active: Boolean?, @Query("q") q: String?, @Query("tag") tag: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("brand_id") brandId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListSizeGuide>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun createSizeGuide(@Path("company_id") companyId: String,@Body body: ValidateSizeGuide, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    suspend fun getSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SizeGuideResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    suspend fun updateSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ValidateSizeGuide, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    suspend fun updateAllowSingle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AllowSingleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    suspend fun updateDefaultSort(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DefaultKeyRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    suspend fun getListingConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetConfigResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    suspend fun createListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationsSort, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationsSort>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun getGroupConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("template_slug") templateSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetConfigResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun createGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationDetail, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationDetail>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun deleteGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun updateGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String,@Body body: AppConfigurationDetail, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationDetail>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    suspend fun deleteListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    suspend fun updateListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String,@Body body: AppConfigurationsSort, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationsSort>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    suspend fun getConfigurationMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("template_slug") templateSlug: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetConfigMetadataResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    suspend fun getAllProductHsnCodes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("type") type: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HsnCodesListingResponseSchemaV2>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    suspend fun getSingleProductHSNCode(@Path("reporting_hsn") reportingHsn: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HSNDataInsertV2>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    suspend fun updateInventories(@Path("company_id") companyId: String,@Body body: InventoryRequestSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    suspend fun listInventoryExport(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportJobListResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    suspend fun createInventoryExport(@Path("company_id") companyId: String,@Body body: InventoryCreateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    suspend fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("item_code") itemCode: ArrayList<String>?, @Query("name") name: String?, @Query("slug") slug: String?, @Query("all_identifiers") allIdentifiers: ArrayList<String>?, @Query("q") q: String?, @Query("tags") tags: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("page_type") pageType: String?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponseV2>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    suspend fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdateSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    suspend fun uploadBulkProducts(@Path("company_id") companyId: String, @Query("department") department: String, @Query("product_type") productType: String,@Body body: BulkProductJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    suspend fun getProductExportJobs(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDownloadsResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    suspend fun createProductExportJob(@Path("company_id") companyId: String,@Body body: ProductTemplateDownloadsExport, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDownloadsResponse>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun getProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("item_code") itemCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SingleProductResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdateSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    suspend fun allSizes(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAllSizes>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    suspend fun deleteRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryUpdateResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    suspend fun updateRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/channel")
    suspend fun getMarketplaces(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAllMarketplaces>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace_slug}/opt-in")
    suspend fun updateMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace_slug") marketplaceSlug: String,@Body body: UpdateMarketplaceOptinRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateMarketplaceOptinResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace_slug}/opt-in")
    suspend fun createMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace_slug") marketplaceSlug: String,@Body body: OptInPostRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateMarketplaceOptinResponse>
    
}
