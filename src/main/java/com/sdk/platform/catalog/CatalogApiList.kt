package com.sdk.platform.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface CatalogApiList {
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights")
    suspend fun getCatalogInsights(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand") brand: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CatalogInsightResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    suspend fun getApplicationBrandListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationBrandListingSchema>
    
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
    : Response<ApplicationCategoryListingSchema>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    suspend fun updateAppCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_uid") categoryUid: String,@Body body: ApplicationCategoryJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections")
    suspend fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection, @HeaderMap headers: Map<String, String>? = null)
    : Response<CollectionCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections")
    suspend fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("schedule_status") scheduleStatus: String?, @Query("type") type: String?, @Query("tag") tag: ArrayList<String>?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/{filter_key}/values")
    suspend fun getApplicationFilterValues(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("filter_key") filterKey: String, @Query("c") c: String?, @Query("collection_id") collectionId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersValuesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/keys")
    suspend fun getApplicationFilterKeys(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("c") c: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersKeysResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options")
    suspend fun getQueryFilters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetQueryFiltersResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    suspend fun getCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("sort_on") sortOn: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("is_pinned") isPinned: Boolean?, @Query("q") q: String?, @Query("is_excluded") isExcluded: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionItemsResponseSchema>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    suspend fun clearCollectionItemsPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CommonResponseSchemaCollection>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    suspend fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemUpdateSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CommonResponseSchemaCollection>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}")
    suspend fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionDetailResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}")
    suspend fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateCollection, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCollection>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}")
    suspend fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CommonResponseSchemaCollection>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    suspend fun getApplicationDepartmentListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationDepartmentListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    suspend fun updateAppDepartment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("department_uid") departmentUid: String,@Body body: ApplicationDepartmentJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/{filter}")
    suspend fun getConfigurationsFilterMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("filter") filter: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FilterResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    suspend fun getDepartments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory")
    suspend fun getAppInventory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("timestamp") timestamp: String?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @Query("qty_gt") qtyGt: Int?, @Query("qty_lt") qtyLt: Int?, @Query("qty_type") qtyType: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryStockResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/locations")
    suspend fun getAppLocations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_type") storeType: String?, @Query("uid") uid: ArrayList<Int>?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tags") tags: ArrayList<String>?, @Query("store_types") storeTypes: ArrayList<String>?, @Query("company_uids") companyUids: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LocationListSerializer>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration")
    suspend fun getConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration")
    suspend fun createConfigurationProductListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata")
    suspend fun getCatalogConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCatalogConfigurationMetaData>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}")
    suspend fun getConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogEntityConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}")
    suspend fun createConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: AppConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}")
    suspend fun getAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OwnerAppItemResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}")
    suspend fun updateAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String,@Body body: ApplicationItemMeta, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    suspend fun getAppicationProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("f") f: String?, @Query("c") c: String?, @Query("filters") filters: Boolean?, @Query("is_dependent") isDependent: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @Query("item_ids") itemIds: ArrayList<String>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getDiscountedInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("location_ids") locationIds: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    suspend fun getProductDetailBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products")
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
    suspend fun getAppCategoryReturnConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BaseAppCategoryReturnConfigResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun createAppCategoryReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BaseAppCategoryReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    suspend fun updateAppCategoryReturnConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BaseAppCategoryReturnConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete")
    suspend fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAutocompleteWordsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete")
    suspend fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    suspend fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsData>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    suspend fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAutocompleteWordsData>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    suspend fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank")
    suspend fun createSearchRerank(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchRerankRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateSearchRerankResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank")
    suspend fun getSearchRerank(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchRerankResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    suspend fun getSearchRerankDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchRerankDetailResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    suspend fun updateSearchRerankConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateSearchRerankRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateSearchRerankResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    suspend fun deleteSearchRerankConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteSearchRerankConfigurationResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    suspend fun createSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchConfigurationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateSearchConfigurationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    suspend fun getSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchConfigurationResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    suspend fun updateSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateSearchConfigurationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateSearchConfigurationResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    suspend fun deleteSearchConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteSearchConfigurationResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword")
    suspend fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsData>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword")
    suspend fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    suspend fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsData>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    suspend fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetSearchWordsData>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    suspend fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    suspend fun updateAppLocation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_uid") storeUid: String,@Body body: ApplicationStoreJson, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category")
    suspend fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category")
    suspend fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("department") department: Int?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("uids") uids: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}")
    suspend fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SingleCategoryResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}")
    suspend fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights")
    suspend fun getSellerInsights(@Path("company_id") companyId: String, @Path("seller_app_id") sellerAppId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CrossSellingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments")
    suspend fun createDepartments(@Path("company_id") companyId: String,@Body body: DepartmentCreateUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments")
    suspend fun listDepartmentsData(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("item_type") itemType: String?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("search") search: String?, @Query("is_active") isActive: Boolean?, @Query("uids") uids: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}")
    suspend fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentsResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}")
    suspend fun updateDepartment(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: DepartmentCreateUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentModel>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration")
    suspend fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String, @Query("template_tag") templateTag: String?, @Query("item_type") itemType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductConfigurationDownloads>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}")
    suspend fun getHsnCode(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HsnCode>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    suspend fun getInventories(@Path("company_id") companyId: String, @Query("item_id") itemId: Int?, @Query("size") size: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @Query("page_type") pageType: String?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("min_sellable") minSellable: Int?, @Query("max_sellable") maxSellable: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("size_identifier") sizeIdentifier: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetInventoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk")
    suspend fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkInventoryGet>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk")
    suspend fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: InventoryBulkJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryBulkResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}")
    suspend fun deleteBulkInventoryJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}")
    suspend fun createBulkInventory(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: InventoryBulkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download")
    suspend fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download")
    suspend fun getInventoryExport(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportJobResponse>
    
    @PATCH ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/{job_id}")
    suspend fun patchProductExportDetail(@Path("company_id") companyId: String, @Path("job_id") jobId: String,@Body body: ExportPatchRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PatchProductDownloadsResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/{job_id}")
    suspend fun getProductExportDetail(@Path("company_id") companyId: String, @Path("job_id") jobId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductDownloadsResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/{job_id}")
    suspend fun patchInventoryExportDetail(@Path("company_id") companyId: String, @Path("job_id") jobId: String,@Body body: ExportPatchRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EditInventoryDownloadsResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/{job_id}")
    suspend fun getInventoryExportDetail(@Path("company_id") companyId: String, @Path("job_id") jobId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EditInventoryDownloadsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration")
    suspend fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter") filter: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryConfig>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download")
    suspend fun downloadInventoryTemplateView(@Path("company_id") companyId: String, @Query("type") type: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema")
    suspend fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String, @Query("bulk") bulk: Boolean, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryValidationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details")
    suspend fun getCompanyBrandDetail(@Path("company_id") companyId: String, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("marketplace") marketplace: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyBrandDetailsView>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/company-details")
    suspend fun getCompanyDetail(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics")
    suspend fun getCompanyMetrics(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinCompanyMetrics>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/location-details")
    suspend fun getStoreDetail(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptinStoreDetails>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes")
    suspend fun getProductAttributes(@Path("company_id") companyId: String, @Query("category") category: String, @Query("filter") filter: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductAttributesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    suspend fun getGenderAttribute(@Path("company_id") companyId: String, @Path("attribute_slug") attributeSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenderDetail>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle")
    suspend fun createProductBundle(@Path("company_id") companyId: String,@Body body: ProductBundleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleCreateResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle")
    suspend fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("slug") slug: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleListingResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle/{id}")
    suspend fun getProductBundleDetail(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle/{id}")
    suspend fun updateProductBundle(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ProductBundleUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductBundleCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk")
    suspend fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkAssetResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk")
    suspend fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBulkRequestList>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun createBulkProductUploadJob(@Path("company_id") companyId: String,@Body body: BulkProductUploadJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBulkResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn")
    suspend fun listHSNCodes(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HSNCodesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    suspend fun getProductTags(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductTagsViewResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates")
    suspend fun listProductTemplate(@Path("company_id") companyId: String, @Query("department") department: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplatesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories")
    suspend fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String, @Query("page_size") pageSize: Double?, @Query("page_no") pageNo: Double?, @Query("q") q: Double?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProdcutTemplateCategoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download")
    suspend fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String, @Query("item_type") itemType: String?, @Query("type") type: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema")
    suspend fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String, @Query("item_type") itemType: String?, @Query("bulk") bulk: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplatesValidationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation")
    suspend fun getProductValidation(@Path("company_id") companyId: String, @Query("type") type: String, @Query("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateProduct>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes")
    suspend fun getProductSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Product>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizeDeleteResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun getInventoryBySize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    suspend fun getVariantsOfProducts(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("variant_type") variantType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductVariantsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/verification")
    suspend fun getCompanyVerification(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyVerificationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/verification/products/{item_id}")
    suspend fun getProductVerificationDetails(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductVerificationModel>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/variant-types")
    suspend fun getVariantTypes(@Path("company_id") companyId: String, @Query("template_tag") templateTag: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<VariantTypesResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun createSizeGuide(@Path("company_id") companyId: String,@Body body: ValidateSizeGuide, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun getSizeGuides(@Path("company_id") companyId: String, @Query("active") active: Boolean?, @Query("q") q: String?, @Query("brand_id") brandId: Int?, @Query("tag") tag: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListSizeGuide>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}")
    suspend fun getSizeGuide(@Path("id") id: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SizeGuideResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}")
    suspend fun updateSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ValidateSizeGuide, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    suspend fun updateAllowSingle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AllowSingleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    suspend fun updateDefaultSort(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DefaultKeyRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}")
    suspend fun createListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationsFilter, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationsFilterResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}")
    suspend fun getListingConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("uids") uids: ArrayList<Int>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetListingConfigResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun createGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationCreateDetail, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationDetail>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun getGroupConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("template_slug") templateSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetConfigResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun updateGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String,@Body body: AppConfigurationDetail, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationDetail>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun deleteGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Any>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}")
    suspend fun updateListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String,@Body body: AppConfigurationsFilterResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppConfigurationsFilterResponse>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}")
    suspend fun deleteListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigSuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata")
    suspend fun getConfigurationMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("template_slug") templateSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetConfigMetadataResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn")
    suspend fun getAllProductHsnCodes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("type") type: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HsnCodesListingResponseSchemaV2>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    suspend fun getSingleProductHSNCode(@Path("reporting_hsn") reportingHsn: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HSNDataInsertV2>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory")
    suspend fun updateInventories(@Path("company_id") companyId: String,@Body body: InventoryRequestSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download")
    suspend fun listInventoryExport(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportJobListResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download")
    suspend fun createInventoryExport(@Path("company_id") companyId: String,@Body body: InventoryCreateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products")
    suspend fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("multi_size") multiSize: Boolean?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("item_code") itemCode: ArrayList<String>?, @Query("name") name: String?, @Query("slug") slug: String?, @Query("all_identifiers") allIdentifiers: ArrayList<String>?, @Query("q") q: String?, @Query("tags") tags: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("page_type") pageType: String?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponseV2>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products")
    suspend fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdateSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse1>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    suspend fun uploadBulkProducts(@Path("company_id") companyId: String, @Query("department") department: String, @Query("product_type") productType: String,@Body body: BulkProductJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBulkResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads")
    suspend fun getProductExportJobs(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDownloadsResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads")
    suspend fun createProductExportJob(@Path("company_id") companyId: String,@Body body: ProductTemplateDownloadsExport, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateProductDownloadsResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    suspend fun getProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("item_code") itemCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SingleProductResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    suspend fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdateSchemaV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    suspend fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @HeaderMap headers: Map<String, String>? = null)
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
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}")
    suspend fun getProductTemplateBySlug(@Path("company_id") companyId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetProductTemplateSlugResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/channel")
    suspend fun getMarketplaces(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAllMarketplaces>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace}/opt-in")
    suspend fun updateMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace") marketplace: String,@Body body: UpdateMarketplaceOptinRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateMarketplaceOptinResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace}/opt-in")
    suspend fun createMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace") marketplace: String,@Body body: CreateMarketplaceOptinRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateMarketplaceOptinResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings")
    suspend fun createAutocompleteSettings(@Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: AutocompleteRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutocompleteUpsertResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings")
    suspend fun getAutocompleteSettings(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutocompleteResponseSchema>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings/{id}")
    suspend fun updateAutocompleteSettings(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Path("id") id: String,@Body body: AutocompleteRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutocompleteUpsertResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/preview")
    suspend fun getAutocompletePreview(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Query("q") q: String?, @Query("category_suggestion") categorySuggestion: Int?, @Query("brand_suggestion") brandSuggestion: Int?, @Query("collection_suggestion") collectionSuggestion: Int?, @Query("product_suggestion") productSuggestion: Int?, @Query("query_suggestion") querySuggestion: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutocompletePreviewResponseSchema>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    suspend fun createMerchandisingRulePinAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PinRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    suspend fun updateMerchandisingRulePinAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PinRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    suspend fun getMerchandisingRulePinAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PinResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    suspend fun createMerchandisingRuleHideAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: HideRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    suspend fun updateMerchandisingRuleHideAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: HideRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    suspend fun getMerchandisingRuleHideAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<HideResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    suspend fun createMerchandisingRuleBoostAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PostMerchandisingRuleBoostAction, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    suspend fun updateMerchandisingRuleBoostAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PostMerchandisingRuleBoostAction, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    suspend fun getMerchandisingRuleBoostAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetMerchandisingRuleBoostAction>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    suspend fun createMerchandisingRuleBuryAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PostMerchandisingRuleBoostAction, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    suspend fun updateMerchandisingRuleBuryAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: PostMerchandisingRuleBoostAction, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    suspend fun getMerchandisingRuleBuryAction(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetMerchandisingRuleBuryAction>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/query")
    suspend fun createMerchandisingRuleQuery(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchandisingRuleQueryPost, @HeaderMap headers: Map<String, String>? = null)
    : Response<MerchandiseQueryResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/query")
    suspend fun getMerchandisingQuery(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SearchResponseSchema>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/query")
    suspend fun updateMerchandisingRuleQuery(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: MerchandisingRuleQueryPost, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}")
    suspend fun saveMerchandisingRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String,@Body body: MerchandisingRuleSave, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}")
    suspend fun deleteMerchandisingRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules")
    suspend fun getMerchandisingRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<MerchandisingRulesList>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/preview")
    suspend fun deleteMerchandisingRulesPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponseMerchandising>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/preview")
    suspend fun getLivePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("merchandising_rule_id") merchandisingRuleId: String, @Query("search_keyword") searchKeyword: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory")
    suspend fun createAppPriceFactory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAppPriceFactoryRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory")
    suspend fun getAppPriceFactories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("is_active") isActive: Boolean?, @Query("factory_type_id") factoryTypeId: String?, @Query("code") code: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAppPriceFactoryResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}")
    suspend fun getAppPriceFactory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppPriceFactory>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}")
    suspend fun editAppPriceFactory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EditAppPriceFactoryRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppPriceFactory>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/products")
    suspend fun addProductsInPriceFactoryByZoneId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreatePriceFactoryProductRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePriceFactoryProductResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/products")
    suspend fun getProductsInPriceFactoryByZoneId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("zone_id") zoneId: String, @Query("item_id") itemId: Double?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk")
    suspend fun createProductPriceFactoryBulkJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAppPriceFactoryProductBulkJobRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductBulkJobResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/poll/{job_id}")
    suspend fun pollProductPriceFactoryBulkJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Path("job_id") jobId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductBulkJobPollResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk/{job_id}/validate")
    suspend fun validateProductPriceFactoryBulkJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Path("job_id") jobId: String,@Body body: CreateAppPriceFactoryProductBulkJobRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductBulkJobValidateResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk/{job_id}/process")
    suspend fun processProductPriceFactoryBulkJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Path("job_id") jobId: String,@Body body: CreateAppPriceFactoryProductBulkJobRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductBulkJobResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/export")
    suspend fun exportProductsInPriceFactory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAppPriceFactoryProductExportJobRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductExportJobResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/poll")
    suspend fun pollPriceFactoryJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppPriceFactoryProductExportJobPollResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-prices")
    suspend fun getAppProductPrices(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("factory_type_ids") factoryTypeIds: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductPrices>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonyms")
    suspend fun getSynonyms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("name") name: String?, @Query("type") type: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymListResponseSchema>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonyms")
    suspend fun createSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: SynonymCreateRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymCreateResponseSchema>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonym/{id}")
    suspend fun updateSynonyms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SynonymCreateRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymUpdateResponseSchema>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonym")
    suspend fun deleteSynonym(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymDeleteResponseSchema>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/export")
    suspend fun exportSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymExportResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/sample")
    suspend fun sampleBulkSynonymsFile(@Query("type") type: String, @Path("application_id") applicationId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk")
    suspend fun uploadSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: SynonymUploadRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymUploadResponseSchema>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/validate")
    suspend fun validateBulkSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: SynonymBulkValidateRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymBulkValidateResponseSchema>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/process")
    suspend fun processBulkSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: SynonymBulkProcessRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymBulkProcessResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/poll/{id}")
    suspend fun pollBulkSynonyms(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SynonymBulkPollResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/poc")
    suspend fun getCompanyBrandsDRI(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyDRIListResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/location/tags")
    suspend fun getLocationTags(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreTagsResponseSchema>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/item/{item_id}/price")
    suspend fun getAppPriceById(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("factory_type_ids") factoryTypeIds: ArrayList<String>?, @Query("seller_id") sellerId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppPriceByIdResponse>
    
}
