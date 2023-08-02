package com.sdk.platform.apis.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.configuration.*

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    fun getBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Deferred<Response<MobileAppConfiguration>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    fun updateBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String,@Body body: MobileAppConfigRequest)
    : Deferred<Response<MobileAppConfiguration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    fun getPreviousVersions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Deferred<Response<BuildVersionHistory>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    fun getAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppFeatureResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    fun updateAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest)
    : Deferred<Response<AppFeature>>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    fun modifyAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest)
    : Deferred<Response<AppFeature>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    fun getAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationDetail>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    fun updateAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationDetail)
    : Deferred<Response<ApplicationDetail>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    fun getAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationInformation>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    fun updateAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInformation)
    : Deferred<Response<ApplicationInformation>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    fun getAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TokenResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    fun updateAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TokenResponse)
    : Deferred<Response<TokenResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CompaniesResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    fun getAppStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<StoresResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun getInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationInventory>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun updateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInventory)
    : Deferred<Response<ApplicationInventory>>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun partiallyUpdateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppInventoryPartialUpdate)
    : Deferred<Response<ApplicationInventory>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    fun getAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppSupportedCurrency>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    fun updateAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency)
    : Deferred<Response<AppSupportedCurrency>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    fun getAppSupportedCurrency(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppCurrencyResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequest)
    : Deferred<Response<OrderingStores>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig)
    : Deferred<Response<DeploymentMeta>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    fun getStaffOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStoresResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    fun getDomains(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DomainsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    fun addDomain(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainAddRequest)
    : Deferred<Response<Domain>>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    fun removeDomainById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SuccessMessageResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    fun changeDomainType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateDomainTypeRequest)
    : Deferred<Response<DomainsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    fun getDomainStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainStatusRequest)
    : Deferred<Response<DomainStatusResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    fun createApplication(@Path("company_id") companyId: String,@Body body: CreateApplicationRequest)
    : Deferred<Response<CreateAppResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    fun getApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ApplicationsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    fun getApplicationById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<Application>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    fun getCurrencies(@Path("company_id") companyId: String)
    : Deferred<Response<CurrenciesResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    fun getDomainAvailibility(@Path("company_id") companyId: String,@Body body: DomainSuggestionsRequest)
    : Deferred<Response<DomainSuggestionsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration/{id}")
    fun getIntegrationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<Integration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/available")
    fun getAvailableOptIns(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetIntegrationsOptInsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/selected/{level}/{uid}")
    fun getSelectedOptIns(@Path("company_id") companyId: String, @Path("level") level: String, @Path("uid") uid: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetIntegrationsOptInsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    fun getIntegrationLevelConfig(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Query("opted") opted: Boolean?, @Query("check_permission") checkPermission: Boolean?)
    : Deferred<Response<IntegrationConfigResponse>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    fun updateLevelIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String,@Body body: UpdateIntegrationLevelRequest)
    : Deferred<Response<IntegrationLevel>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    fun getIntegrationByLevelId(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Deferred<Response<IntegrationLevel>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    fun updateLevelUidIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String,@Body body: IntegrationLevel)
    : Deferred<Response<IntegrationLevel>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    fun getLevelActiveIntegrations(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Deferred<Response<OptedStoreIntegration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    fun getBrandsByCompany(@Path("company_id") companyId: String, @Query("q") q: String?)
    : Deferred<Response<BrandsByCompanyResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    fun getCompanyByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: CompanyByBrandsRequest)
    : Deferred<Response<CompanyByBrandsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/stores-by-brands")
    fun getStoreByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: StoreByBrandsRequest)
    : Deferred<Response<StoreByBrandsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/")
    fun getOtherSellerApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OtherSellerApplications>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    fun getOtherSellerApplicationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<OptedApplicationResponse>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    fun optOutFromApplication(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: OptOutInventory)
    : Deferred<Response<SuccessMessageResponse>>
    
}