package com.sdk.platform.apis.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.catalog.*

interface CatalogApiList {
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword)
    : Response<GetSearchWordsData>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<GetSearchWordsDetailResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    suspend fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<DeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    suspend fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetSearchWordsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    suspend fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword)
    : Response<GetSearchWordsData>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword)
    : Response<GetAutocompleteWordsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<GetAutocompleteWordsResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    suspend fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<DeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    suspend fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetAutocompleteWordsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    suspend fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword)
    : Response<CreateAutocompleteWordsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    suspend fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("slug") slug: ArrayList<String>?)
    : Response<GetProductBundleListingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    suspend fun createProductBundle(@Path("company_id") companyId: String,@Body body: ProductBundleRequest)
    : Response<GetProductBundleCreateResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    suspend fun updateProductBundle(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ProductBundleUpdateRequest)
    : Response<GetProductBundleCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    suspend fun getProductBundleDetail(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<GetProductBundleResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun getSizeGuides(@Path("company_id") companyId: String, @Query("active") active: Boolean?, @Query("q") q: String?, @Query("tag") tag: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ListSizeGuide>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    suspend fun createSizeGuide(@Path("company_id") companyId: String,@Body body: ValidateSizeGuide)
    : Response<SuccessResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    suspend fun updateSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ValidateSizeGuide)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    suspend fun getSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<SizeGuideResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    suspend fun getAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String)
    : Response<OwnerAppItemResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    suspend fun updateAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String,@Body body: ApplicationItemMeta)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    suspend fun getConfigurationMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("template_slug") templateSlug: String?)
    : Response<GetConfigMetadataResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun getGroupConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("template_slug") templateSlug: String?)
    : Response<GetConfigResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    suspend fun createGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationDetail)
    : Response<AppConfigurationDetail>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun updateGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String,@Body body: AppConfigurationDetail)
    : Response<AppConfigurationDetail>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    suspend fun deleteGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String)
    : Response<ConfigSuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    suspend fun getListingConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?)
    : Response<GetConfigResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    suspend fun createListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationsSort)
    : Response<AppConfigurationsSort>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    suspend fun updateListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String,@Body body: AppConfigurationsSort)
    : Response<AppConfigurationsSort>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    suspend fun deleteListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String)
    : Response<ConfigSuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    suspend fun updateAllowSingle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AllowSingleRequest)
    : Response<ConfigSuccessResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    suspend fun updateDefaultSort(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DefaultKeyRequest)
    : Response<ConfigSuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    suspend fun getCatalogConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetCatalogConfigurationMetaData>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    suspend fun getConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetAppCatalogConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    suspend fun createConfigurationProductListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppConfiguration)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    suspend fun getConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String)
    : Response<GetAppCatalogEntityConfiguration>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    suspend fun createConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: AppConfiguration)
    : Response<GetAppCatalogConfiguration>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    suspend fun getQueryFilters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetCollectionQueryOptionResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    suspend fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("schedule_status") scheduleStatus: String?, @Query("type") type: String?, @Query("tags") tags: ArrayList<String>?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<GetCollectionListingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    suspend fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection)
    : Response<CollectionCreateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    suspend fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<CollectionDetailResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    suspend fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateCollection)
    : Response<UpdateCollection>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    suspend fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<DeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    suspend fun getCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Response<GetCollectionItemsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    suspend fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemUpdate)
    : Response<UpdatedResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    suspend fun getCatalogInsights(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand") brand: String?)
    : Response<CatalogInsightResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    suspend fun getSellerInsights(@Path("company_id") companyId: String, @Path("seller_app_id") sellerAppId: String)
    : Response<CrossSellingResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/{marketplace}/optin/")
    suspend fun createMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace") marketplace: String,@Body body: OptInPostRequest)
    : Response<UpdatedResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    suspend fun getMarketplaceOptinDetail(@Path("company_id") companyId: String)
    : Response<GetOptInPlatform>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    suspend fun getCompanyDetail(@Path("company_id") companyId: String)
    : Response<OptinCompanyDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    suspend fun getCompanyBrandDetail(@Path("company_id") companyId: String, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("marketplace") marketplace: String?)
    : Response<OptinCompanyBrandDetailsView>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    suspend fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Response<OptinCompanyMetrics>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    suspend fun getStoreDetail(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<OptinStoreDetails>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    suspend fun getGenderAttribute(@Path("company_id") companyId: String, @Path("attribute_slug") attributeSlug: String)
    : Response<GenderDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    suspend fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String)
    : Response<ProdcutTemplateCategoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    suspend fun listDepartmentsData(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("item_type") itemType: String?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("search") search: String?, @Query("is_active") isActive: Boolean?)
    : Response<DepartmentsResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    suspend fun createDepartments(@Path("company_id") companyId: String,@Body body: DepartmentCreateUpdate)
    : Response<DepartmentCreateResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    suspend fun updateDepartment(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: DepartmentCreateUpdate)
    : Response<DepartmentModel>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    suspend fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Response<DepartmentsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    suspend fun listProductTemplate(@Path("company_id") companyId: String, @Query("department") department: String)
    : Response<TemplatesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    suspend fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Response<TemplatesValidationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    suspend fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    suspend fun downloadInventoryTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Response<ResponseBody>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    suspend fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Response<InventoryValidationResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    suspend fun listHSNCodes(@Path("company_id") companyId: String)
    : Response<HSNCodesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    suspend fun listProductTemplateExportDetails(@Path("company_id") companyId: String)
    : Response<ProductDownloadsResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    suspend fun getProductExportJobs(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?)
    : Response<ProductDownloadsResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    suspend fun createProductExportJob(@Path("company_id") companyId: String,@Body body: ProductTemplateDownloadsExport)
    : Response<ProductDownloadsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    suspend fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String, @Query("template_tag") templateTag: String?, @Query("item_type") itemType: String?)
    : Response<ProductConfigurationDownloads>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    suspend fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("departments") departments: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<CategoryResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    suspend fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody)
    : Response<CategoryCreateResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    suspend fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody)
    : Response<CategoryUpdateResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    suspend fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Response<SingleCategoryResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    suspend fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("item_code") itemCode: ArrayList<String>?, @Query("q") q: String?, @Query("tags") tags: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ProductListingResponseV2>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    suspend fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    suspend fun getVariantsOfProducts(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("variant_type") variantType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ProductVariantsResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    suspend fun getProductAttributes(@Path("company_id") companyId: String, @Query("category") category: String, @Query("filter") filter: Boolean?)
    : Response<ProductAttributesResponse>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun getProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("item_code") itemCode: String?)
    : Response<SingleProductResponse>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    suspend fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    suspend fun allSizes(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Response<GetAllSizes>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    suspend fun getProductValidation(@Path("company_id") companyId: String)
    : Response<ValidateProduct>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    suspend fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Response<ProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ProductBulkRequestList>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    suspend fun createBulkProductUploadJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Response<BulkResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    suspend fun uploadBulkProducts(@Path("company_id") companyId: String, @Query("department") department: String, @Query("product_type") productType: String,@Body body: BulkJob)
    : Response<BulkResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest)
    : Response<SuccessResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    suspend fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    suspend fun getProductTags(@Path("company_id") companyId: String)
    : Response<ProductTagsViewResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    suspend fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<BulkAssetResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    suspend fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets)
    : Response<SuccessResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String)
    : Response<ProductSizeDeleteResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun getInventoryBySize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?)
    : Response<InventoryResponsePaginated>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    suspend fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    suspend fun getInventories(@Path("company_id") companyId: String, @Query("item_id") itemId: String?, @Query("size") size: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("size_identifier") sizeIdentifier: String?)
    : Response<GetInventoriesResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    suspend fun getDiscountedInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Response<InventorySellerIdentifierResponsePaginated>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/location/{location_id}/")
    suspend fun deleteInventory(@Path("company_id") companyId: String, @Path("size") size: String, @Path("item_id") itemId: String, @Path("location_id") locationId: String)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    suspend fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<BulkInventoryGet>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    suspend fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Response<BulkResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    suspend fun createBulkInventory(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: InventoryBulkRequest)
    : Response<SuccessResponse>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    suspend fun deleteBulkInventoryJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    suspend fun getInventoryExport(@Path("company_id") companyId: String)
    : Response<InventoryExportJob>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    suspend fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    suspend fun listInventoryExport(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?)
    : Response<InventoryExportJobListResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    suspend fun createInventoryExport(@Path("company_id") companyId: String,@Body body: InventoryCreateRequest)
    : Response<InventoryExportResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    suspend fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?)
    : Response<InventoryConfig>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    suspend fun updateRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    suspend fun deleteRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    suspend fun updateInventories(@Path("company_id") companyId: String,@Body body: InventoryRequestSchemaV2)
    : Response<InventoryUpdateResponse>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    suspend fun updateHsnCode(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: HsnUpsert)
    : Response<HsnCode>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    suspend fun getHsnCode(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<HsnCode>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    suspend fun bulkHsnCode(@Path("company_id") companyId: String,@Body body: BulkHsnUpsert)
    : Response<BulkHsnResponse>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    suspend fun getAllProductHsnCodes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("type") type: String?, @Path("company_id") companyId: String)
    : Response<HsnCodesListingResponseSchemaV2>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    suspend fun getSingleProductHSNCode(@Path("reporting_hsn") reportingHsn: String, @Path("company_id") companyId: String)
    : Response<HSNDataInsertV2>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    suspend fun getApplicationBrands(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("brand_id") brandId: ArrayList<Int>?)
    : Response<BrandListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    suspend fun getDepartments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<DepartmentResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    suspend fun getCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?)
    : Response<CategoryListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    suspend fun getAppicationProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("f") f: String?, @Query("c") c: String?, @Query("filters") filters: Boolean?, @Query("is_dependent") isDependent: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @Query("item_ids") itemIds: ArrayList<Int>?)
    : Response<ApplicationProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    suspend fun getProductDetailBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<ProductDetail>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    suspend fun getAppProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("tags") tags: ArrayList<String>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<ProductListingResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    suspend fun getAppInventory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("timestamp") timestamp: String?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Response<InventoryStockResponse>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: AssignStore)
    : Response<StoreAssignResponse>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/locations")
    suspend fun getAppLocations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_type") storeType: String?, @Query("uid") uid: ArrayList<Int>?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<LocationListSerializer>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    suspend fun getApplicationBrandListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<BrandListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    suspend fun updateAppBrand(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("brand_uid") brandUid: String,@Body body: ApplicationBrandJson)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    suspend fun getApplicationCategoryListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department_id") departmentId: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<BrandListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    suspend fun updateAppCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_uid") categoryUid: String,@Body body: ApplicationCategoryJson)
    : Response<SuccessResponse1>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    suspend fun getApplicationDepartmentListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<ApplicationDepartmentListingResponse>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    suspend fun updateAppDepartment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("department_uid") departmentUid: String,@Body body: ApplicationDepartmentJson)
    : Response<SuccessResponse1>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    suspend fun updateAppLocation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_uid") storeUid: String,@Body body: ApplicationStoreJson)
    : Response<SuccessResponse1>
    
}