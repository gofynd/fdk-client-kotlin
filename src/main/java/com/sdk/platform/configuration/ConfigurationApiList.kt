package com.sdk.platform.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    suspend fun getBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<MobileAppConfiguration>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    suspend fun updateBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String,@Body body: MobileAppConfigRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<MobileAppConfiguration>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    suspend fun getPreviousVersions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BuildVersionHistory>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun getAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeatureResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun updateAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeature>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun modifyAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeature>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun getAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationDetail>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun updateAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationDetail, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationDetail>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    suspend fun getAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInformation>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    suspend fun updateAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInformation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInformation>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    suspend fun getAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TokenResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    suspend fun updateAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TokenResponseSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<TokenResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    suspend fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompaniesResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    suspend fun getAppStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoresResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun updateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInventory, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun partiallyUpdateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppInventoryPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun getAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppSupportedCurrency>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun updateAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppSupportedCurrency>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    suspend fun getAppSupportedCurrency(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppCurrencyResponseSchema>
    
    @POST ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    suspend fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStores>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeploymentMeta>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun getOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStoreConfig>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    suspend fun getStaffOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStoresResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun getOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreSelectRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun removeOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun getDomains(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainsResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun addDomain(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainAddRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<Domain>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    suspend fun removeDomainById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    suspend fun changeDomainType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateDomainTypeRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainsResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    suspend fun getDomainStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainStatusRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainStatusResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun createApplication(@Path("company_id") companyId: String,@Body body: CreateApplicationRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun getApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationsResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    suspend fun getApplicationById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationById>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    suspend fun getCurrencies(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CurrenciesResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    suspend fun getDomainAvailibility(@Path("company_id") companyId: String,@Body body: DomainSuggestionsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainSuggestionsResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    suspend fun getBrandsByCompany(@Path("company_id") companyId: String, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandsByCompanyResponseSchema>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    suspend fun getCompanyByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: CompanyByBrandsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyByBrandsResponseSchema>
    
    @POST ("/service/platform/configuration/v2.0/company/{company_id}/inventory/stores-by-brands")
    suspend fun getStoreByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: StoreByBrandsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreByBrandsResponseSchema>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    suspend fun getOtherSellerApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OtherSellerApplications>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    suspend fun getOtherSellerApplicationById(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptedApplicationResponseSchema>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    suspend fun optOutFromApplication(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: OptOutInventory, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/currency-exchange")
    suspend fun getCurrencyExchangeRates(@Query("currency_code") currencyCode: String?, @Query("exchange_currency_code") exchangeCurrencyCode: String?, @Query("exchange_country_code") exchangeCountryCode: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CurrencyExchangeResponseV2>
    
}
