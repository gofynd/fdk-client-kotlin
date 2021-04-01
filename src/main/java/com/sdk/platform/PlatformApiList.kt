package com.sdk.platform

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<CustomerListResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?)
    : Deferred<Response<UserSearchResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>
    
}

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PaymentGatewayConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun updateBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean, @Query("request_type") requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Deferred<Response<PayoutsResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionPaymentMethodResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    fun getSubscriptionConfig(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>
    
}

interface CatalogApiList {
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetSearchWordsResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
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
    fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?)
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
    fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<CollectionCreateResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemRequest)
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
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("department") department: String, @Query("item_type") itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun listDepartmentData(@Path("company_id") companyId: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun getDepertmantsData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    fun listProductTemplate(@Path("company_id") companyId: String, @Query("departments") departments: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<TemplatesValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<String>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    fun downloadProductTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<String>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<InventoryValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    fun listHSNCodes(@Path("company_id") companyId: String)
    : Deferred<Response<HSNCodesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    fun listProductTemplateExportDetails(@Path("company_id") companyId: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String)
    : Deferred<Response<ProductConfligurationDownloads>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("q") q: String?)
    : Deferred<Response<CategoryResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<Category>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: Double?, @Query("category_ids") categoryIds: Double?, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<SuccessResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun getProduct(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<Product>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    fun getProductValidation(@Path("company_id") companyId: String)
    : Deferred<Response<ValidateProduct>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun updateProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductBulkRequestList>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    fun getCompanyTags(@Path("company_id") companyId: String)
    : Deferred<Response<ProductTagsViewResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkAssetResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/")
    fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/")
    fun getInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<InventoryRequest1>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/<size>/location/{location_id}/")
    fun deleteInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("location_id") locationId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<CommonResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkRequestGet>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/<batch_id>/")
    fun createBulkInventory(@Path("company_id") companyId: String,@Body body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/<batch_id>/")
    fun deleteBulkInventoryJob(@Path("company_id") companyId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun getInventoryExport(@Path("company_id") companyId: String)
    : Deferred<Response<InventoryExportJob>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?)
    : Deferred<Response<InventoryConfig>>
    
}

interface CompanyProfileApiList {
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun cbsOnboardGet(@Path("company_id") companyId: String)
    : Deferred<Response<GetCompanyProfileSerializerResponse>>
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun updateCompany(@Path("company_id") companyId: String,@Body body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Deferred<Response<MetricsSerializer>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun getBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun editBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand")
    fun createBrand(@Path("company_id") companyId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun getBrands(@Path("company_id") companyId: String)
    : Deferred<Response<CompanyBrandListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun createBrand(@Path("company_id") companyId: String,@Body body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun getLocations(@Path("company_id") companyId: String, @Query("store_type") storeType: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LocationListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun createLocation(@Path("company_id") companyId: String,@Body body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun getLocationDetail(@Path("company_id") companyId: String, @Path("location_id") locationId: String)
    : Deferred<Response<GetLocationSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun updateLocation(@Path("company_id") companyId: String, @Path("location_id") locationId: String,@Body body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>
    
}

interface AssetsApiList {
    
    @POST ("/service/application/assets/v1.0/uploads/company/{company_id}/copy/")
    fun companyCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkResponse>>
    
    @POST ("/service/application/assets/v1.0/uploads/company/{company_id}/application/{application_id}/copy/")
    fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkResponse>>
    
    @POST ("/service/application/assets/v1.0/company/{company_id}/sign-urls/")
    fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>
    
    @GET ("/service/application/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    fun companyBrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String)
    : Deferred<Response<BrowseResponse>>
    
    @GET ("/service/application/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    fun appBrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<BrowseResponse>>
    
    @POST ("/service/application/assets/v1.0/company/{company_id}/proxy/")
    fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Deferred<Response<String>>
    
}

