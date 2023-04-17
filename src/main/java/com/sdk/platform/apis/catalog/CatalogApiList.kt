package com.sdk.platform.apis.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.catalog.*

interface CatalogApiList {
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetSearchWordsResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<CreateAutocompleteWordsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    fun createProductBundle(@Path("company_id") companyId: String,@Body body: ProductBundleRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("slug") slug: ArrayList<String>?)
    : Deferred<Response<GetProductBundleListingResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    fun updateProductBundle(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    fun getProductBundleDetail(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<GetProductBundleResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    fun createSizeGuide(@Path("company_id") companyId: String,@Body body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    fun getSizeGuides(@Path("company_id") companyId: String, @Query("active") active: Boolean?, @Query("q") q: String?, @Query("tag") tag: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ListSizeGuide>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    fun updateSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    fun getSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<SizeGuideResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    fun updateAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String,@Body body: ApplicationItemMeta)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    fun getAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String)
    : Deferred<Response<OwnerAppItemResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    fun getConfigurationMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("template_slug") templateSlug: String?)
    : Deferred<Response<GetConfigMetadataResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    fun createGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    fun getGroupConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("template_slug") templateSlug: String?)
    : Deferred<Response<GetConfigResponse>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    fun updateGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String,@Body body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    fun deleteGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    fun createListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    fun getListingConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?)
    : Deferred<Response<GetConfigResponse>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    fun updateListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String,@Body body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    fun deleteListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    fun updateAllowSingle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AllowSingleRequest)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    fun updateDefaultSort(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DefaultKeyRequest)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    fun getCatalogConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCatalogConfigurationMetaData>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    fun createConfigurationProductListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    fun getConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    fun createConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    fun getConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String)
    : Deferred<Response<GetAppCatalogEntityConfiguration>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    fun getQueryFilters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCollectionQueryOptionResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection)
    : Deferred<Response<CollectionCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("schedule_status") scheduleStatus: String?, @Query("type") type: String?, @Query("tags") tags: ArrayList<String>?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateCollection)
    : Deferred<Response<UpdateCollection>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemUpdate)
    : Deferred<Response<UpdatedResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    fun getCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionItemsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    fun getCatalogInsights(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand") brand: String?)
    : Deferred<Response<CatalogInsightResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    fun getSellerInsights(@Path("company_id") companyId: String, @Path("seller_app_id") sellerAppId: String)
    : Deferred<Response<CrossSellingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/{marketplace}/optin/")
    fun createMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace") marketplace: String,@Body body: OptInPostRequest)
    : Deferred<Response<UpdatedResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    fun getMarketplaceOptinDetail(@Path("company_id") companyId: String)
    : Deferred<Response<GetOptInPlatform>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    fun getCompanyDetail(@Path("company_id") companyId: String)
    : Deferred<Response<OptinCompanyDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    fun getCompanyBrandDetail(@Path("company_id") companyId: String, @Query("is_active") isActive: Boolean?, @Query("q") q: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("marketplace") marketplace: String?)
    : Deferred<Response<OptinCompanyBrandDetailsView>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Deferred<Response<OptinCompanyMetrics>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    fun getStoreDetail(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OptinStoreDetails>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    fun getGenderAttribute(@Path("company_id") companyId: String, @Path("attribute_slug") attributeSlug: String)
    : Deferred<Response<GenderDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun createDepartments(@Path("company_id") companyId: String,@Body body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun listDepartmentsData(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("item_type") itemType: String?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("search") search: String?, @Query("is_active") isActive: Boolean?)
    : Deferred<Response<DepartmentsResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun updateDepartment(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentModel>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    fun listProductTemplate(@Path("company_id") companyId: String, @Query("department") department: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<TemplatesValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    fun downloadInventoryTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<InventoryValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    fun listHSNCodes(@Path("company_id") companyId: String)
    : Deferred<Response<HSNCodesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    fun listProductTemplateExportDetails(@Path("company_id") companyId: String)
    : Deferred<Response<ProductDownloadsResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    fun createProductExportJob(@Path("company_id") companyId: String,@Body body: ProductTemplateDownloadsExport)
    : Deferred<Response<ProductDownloadsResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    fun getProductExportJobs(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?)
    : Deferred<Response<ProductDownloadsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String, @Query("template_tag") templateTag: String?, @Query("item_type") itemType: String?)
    : Deferred<Response<ProductConfigurationDownloads>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("departments") departments: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CategoryResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<SingleCategoryResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("item_code") itemCode: ArrayList<String>?, @Query("q") q: String?, @Query("tags") tags: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponseV2>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    fun getVariantsOfProducts(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("variant_type") variantType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    fun getProductAttributes(@Path("company_id") companyId: String, @Query("category") category: String, @Query("filter") filter: Boolean?)
    : Deferred<Response<ProductAttributesResponse>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun getProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("item_code") itemCode: String?)
    : Deferred<Response<SingleProductResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    fun allSizes(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<GetAllSizes>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    fun getProductValidation(@Path("company_id") companyId: String)
    : Deferred<Response<ValidateProduct>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun createBulkProductUploadJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductBulkRequestList>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    fun uploadBulkProducts(@Path("company_id") companyId: String, @Query("department") department: String, @Query("product_type") productType: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    fun getProductTags(@Path("company_id") companyId: String)
    : Deferred<Response<ProductTagsViewResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkAssetResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeDeleteResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun getInventoryBySize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?)
    : Deferred<Response<InventoryResponsePaginated>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    fun getInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    fun getInventories(@Path("company_id") companyId: String, @Query("item_id") itemId: String?, @Query("size") size: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("size_identifier") sizeIdentifier: String?)
    : Deferred<Response<GetInventoriesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    fun getDiscountedInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/location/{location_id}/")
    fun deleteInventory(@Path("company_id") companyId: String, @Path("size") size: String, @Path("item_id") itemId: String, @Path("location_id") locationId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkInventoryGet>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    fun createBulkInventory(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    fun deleteBulkInventoryJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest)
    : Deferred<Response<InventoryExportResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun getInventoryExport(@Path("company_id") companyId: String)
    : Deferred<Response<InventoryExportJob>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    fun createInventoryExport(@Path("company_id") companyId: String,@Body body: InventoryCreateRequest)
    : Deferred<Response<InventoryExportResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    fun listInventoryExport(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?)
    : Deferred<Response<InventoryExportJobListResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?)
    : Deferred<Response<InventoryConfig>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    fun updateRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    fun deleteRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    fun updateInventories(@Path("company_id") companyId: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    fun updateHsnCode(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: HsnUpsert)
    : Deferred<Response<HsnCode>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    fun getHsnCode(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<HsnCode>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    fun bulkHsnCode(@Path("company_id") companyId: String,@Body body: BulkHsnUpsert)
    : Deferred<Response<BulkHsnResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    fun getAllProductHsnCodes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("type") type: String?, @Path("company_id") companyId: String)
    : Deferred<Response<HsnCodesListingResponseSchemaV2>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    fun getSingleProductHSNCode(@Path("reporting_hsn") reportingHsn: String, @Path("company_id") companyId: String)
    : Deferred<Response<HSNDataInsertV2>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    fun getApplicationBrands(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("brand_id") brandId: ArrayList<Int>?)
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    fun getDepartments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    fun getCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    fun getAppicationProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("f") f: String?, @Query("c") c: String?, @Query("filters") filters: Boolean?, @Query("is_dependent") isDependent: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @Query("item_ids") itemIds: ArrayList<Int>?)
    : Deferred<Response<ApplicationProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    fun getProductDetailBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    fun getAppProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("tags") tags: ArrayList<String>?, @Query("is_dependent") isDependent: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    fun getAppInventory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("timestamp") timestamp: String?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<InventoryStockResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: AssignStore)
    : Deferred<Response<StoreAssignResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/locations")
    fun getAppLocations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_type") storeType: String?, @Query("uid") uid: ArrayList<Int>?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LocationListSerializer>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    fun getApplicationBrandListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<BrandListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    fun updateAppBrand(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("brand_uid") brandUid: String,@Body body: ApplicationBrandJson)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    fun getApplicationCategoryListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department_id") departmentId: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<BrandListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    fun updateAppCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_uid") categoryUid: String,@Body body: ApplicationCategoryJson)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    fun getApplicationDepartmentListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ApplicationDepartmentListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    fun updateAppDepartment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("department_uid") departmentUid: String,@Body body: ApplicationDepartmentJson)
    : Deferred<Response<SuccessResponse1>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    fun updateAppLocation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_uid") storeUid: String,@Body body: ApplicationStoreJson)
    : Deferred<Response<SuccessResponse1>>
    
}