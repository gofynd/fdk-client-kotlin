package com.sdk.platform.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    suspend fun getBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Response<MobileAppConfiguration>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    suspend fun updateBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String,@Body body: MobileAppConfigRequest)
    : Response<MobileAppConfiguration>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    suspend fun getPreviousVersions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Response<BuildVersionHistory>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun getAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<AppFeatureResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun updateAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest)
    : Response<AppFeature>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    suspend fun modifyAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest)
    : Response<AppFeature>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun getAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationDetail>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    suspend fun updateAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationDetail)
    : Response<ApplicationDetail>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    suspend fun getAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationInformation>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    suspend fun updateAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInformation)
    : Response<ApplicationInformation>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    suspend fun getAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<TokenResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    suspend fun updateAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TokenResponse)
    : Response<TokenResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    suspend fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<CompaniesResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    suspend fun getAppStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<StoresResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationInventory>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun updateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInventory)
    : Response<ApplicationInventory>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun partiallyUpdateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppInventoryPartialUpdate)
    : Response<ApplicationInventory>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun getAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<AppSupportedCurrency>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    suspend fun updateAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency)
    : Response<AppSupportedCurrency>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    suspend fun getAppSupportedCurrency(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<AppCurrencyResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    suspend fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequest)
    : Response<OrderingStores>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig)
    : Response<DeploymentMeta>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    suspend fun getOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<OrderingStoreConfig>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    suspend fun getStaffOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<OrderingStoresResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun getOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreSelectRequest)
    : Response<SuccessMessageResponse>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    suspend fun removeOrderingStoreCookie(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<SuccessMessageResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun getDomains(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<DomainsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    suspend fun addDomain(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainAddRequest)
    : Response<Domain>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    suspend fun removeDomainById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SuccessMessageResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    suspend fun changeDomainType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateDomainTypeRequest)
    : Response<DomainsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    suspend fun getDomainStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainStatusRequest)
    : Response<DomainStatusResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun createApplication(@Path("company_id") companyId: String,@Body body: CreateApplicationRequest)
    : Response<CreateAppResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    suspend fun getApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<ApplicationsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    suspend fun getApplicationById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<Application>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    suspend fun getCurrencies(@Path("company_id") companyId: String)
    : Response<CurrenciesResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    suspend fun getDomainAvailibility(@Path("company_id") companyId: String,@Body body: DomainSuggestionsRequest)
    : Response<DomainSuggestionsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration/{id}")
    suspend fun getIntegrationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<Integration>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/available")
    suspend fun getAvailableOptIns(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<GetIntegrationsOptInsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/selected/{level}/{uid}")
    suspend fun getSelectedOptIns(@Path("company_id") companyId: String, @Path("level") level: String, @Path("uid") uid: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<GetIntegrationsOptInsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    suspend fun getIntegrationLevelConfig(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Query("opted") opted: Boolean?, @Query("check_permission") checkPermission: Boolean?)
    : Response<IntegrationConfigResponse>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    suspend fun updateLevelIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String,@Body body: UpdateIntegrationLevelRequest)
    : Response<IntegrationLevel>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    suspend fun getIntegrationByLevelId(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Response<IntegrationLevel>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    suspend fun updateLevelUidIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String,@Body body: IntegrationLevel)
    : Response<IntegrationLevel>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    suspend fun getLevelActiveIntegrations(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Response<OptedStoreIntegration>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    suspend fun getBrandsByCompany(@Path("company_id") companyId: String, @Query("q") q: String?)
    : Response<BrandsByCompanyResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    suspend fun getCompanyByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: CompanyByBrandsRequest)
    : Response<CompanyByBrandsResponse>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/stores-by-brands")
    suspend fun getStoreByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: StoreByBrandsRequest)
    : Response<StoreByBrandsResponse>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    suspend fun getOtherSellerApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<OtherSellerApplications>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    suspend fun getOtherSellerApplicationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<OptedApplicationResponse>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    suspend fun optOutFromApplication(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: OptOutInventory)
    : Response<SuccessMessageResponse>
    
}