package com.sdk.platform.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun getAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeatureResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun updateAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeature>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun modifyAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest, @HeaderMap headers: Map<String, String>? = null)
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
    : Response<TokenResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    suspend fun updateAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TokenResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<TokenResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    suspend fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompaniesResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    suspend fun getAppStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoresResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun updateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInventory, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun partiallyUpdateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppInventoryPartialUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInventory>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/owner-application/{application_id}/configuration")
    suspend fun getApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OwnerAppConfig>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun getAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppSupportedCurrency>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun createAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppSupportedCurrency>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun updateAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppSupportedCurrency>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    suspend fun getAppSupportedCurrency(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppCurrencyResponse>
    
    @POST ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    suspend fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStores>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeploymentMeta>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun getOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStoreConfig>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    suspend fun getStaffOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStoresResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun getOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreSelectRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun removeOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/{store_id}")
    suspend fun getStoreDetailById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_id") storeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStore>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores")
    suspend fun getOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStores>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun getDomains(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun addDomain(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainAddRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<Domain>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{domain_id}")
    suspend fun removeDomainById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("domain_id") domainId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    suspend fun changeDomainType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateDomainTypeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    suspend fun getDomainStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainStatusRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainStatusResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun createApplication(@Path("company_id") companyId: String,@Body body: CreateApplicationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateAppResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun getApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    suspend fun getApplicationById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Application>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    suspend fun updateApplication(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Application, @HeaderMap headers: Map<String, String>? = null)
    : Response<Application>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    suspend fun getCurrencies(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CurrenciesResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    suspend fun createCurrency(@Path("company_id") companyId: String,@Body body: Currency, @HeaderMap headers: Map<String, String>? = null)
    : Response<Currency>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    suspend fun getCurrency(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Currency>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    suspend fun updateCurrency(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: Currency, @HeaderMap headers: Map<String, String>? = null)
    : Response<Currency>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    suspend fun getDomainAvailibility(@Path("company_id") companyId: String,@Body body: DomainSuggestionsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainSuggestionsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/suggestions")
    suspend fun getApplicationDomainAvailibility(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainSuggestionsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainSuggestionsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    suspend fun getBrandsByCompany(@Path("company_id") companyId: String, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandsByCompanyResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    suspend fun getCompanyByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: CompanyByBrandsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyByBrandsResponse>
    
    @POST ("/service/platform/configuration/v2.0/company/{company_id}/inventory/stores-by-brands")
    suspend fun getStoreByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: StoreByBrandsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreByBrandsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    suspend fun getOtherSellerApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OtherSellerApplications>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}")
    suspend fun getOtherSellerApplicationById(@Path("company_id") companyId: String, @Path("app_id") appId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptedApplicationResponse>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}/opt_out")
    suspend fun optOutFromApplication(@Path("company_id") companyId: String, @Path("app_id") appId: String,@Body body: OptOutInventory, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/version")
    suspend fun updateApplicationVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformVersionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformVersion>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens")
    suspend fun createTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Application>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens/{token}")
    suspend fun deleteToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("token") token: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Application>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/locations")
    suspend fun getLocations(@Path("company_id") companyId: String, @Query("location_type") locationType: String?, @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Locations>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    suspend fun getUrlRedirections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UrlRedirectionResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    suspend fun createUrlRedirection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UrlRedirectionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UrlRedirection>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    suspend fun getUrlRedirection(@Path("company_id") companyId: String, @Path("redirection_domain_id") redirectionDomainId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UrlRedirection>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    suspend fun updateUrlRedirection(@Path("redirection_domain_id") redirectionDomainId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UrlRedirection, @HeaderMap headers: Map<String, String>? = null)
    : Response<UrlRedirection>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    suspend fun deleteUrlRedirection(@Path("redirection_domain_id") redirectionDomainId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/company/{company}")
    suspend fun getStoresForACompany(@Path("company_id") companyId: String, @Path("company") company: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListStoreResponse>
    
    @GET ("/service/platform/configuration/v2.0/company/{company_id}/domain/options")
    suspend fun getDomainOptions(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DomainOptionsResponse>
    
}
