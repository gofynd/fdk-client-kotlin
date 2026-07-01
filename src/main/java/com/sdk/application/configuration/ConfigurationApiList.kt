package com.sdk.application.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface ConfigurationApiList {
    
    
    @GET
    suspend fun getApplication(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<Application>
    
    
    @GET
    suspend fun getOwnerInfo(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationAboutResponseSchema>
    
    
    @GET
    suspend fun getBasicDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationDetail>
    
    
    @GET
    suspend fun getIntegrationTokens(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AppTokenResponseSchema>
    
    
    @GET
    suspend fun getOrderingStores(@Url url1: String?    ,    @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStores>
    
    
    @GET
    suspend fun getStoreDetailById(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderingStore>
    
    
    @GET
    suspend fun getFeatures(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AppFeatureResponseSchema>
    
    
    @GET
    suspend fun getContactInfo(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationInformation>
    
    
    @GET
    suspend fun getCurrencies(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<CurrenciesResponseSchema>
    
    
    @GET
    suspend fun getCurrencyById(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<Currency>
    
    
    @GET
    suspend fun getAppCurrencies(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AppCurrencyResponseSchema>
    
    
    @GET
    suspend fun getLanguages(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<LanguageResponseSchema>
    
    
    @POST
    suspend fun getOrderingStoreCookie(@Url url1: String?   ,@Body body: OrderingStoreSelectRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    
    @DELETE
    suspend fun removeOrderingStoreCookie(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessMessageResponseSchema>
    
    
    @GET
    suspend fun getAppStaffList(@Url url1: String?    ,       @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?, @Query("user_name") userName: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppStaffListResponseSchema>
    
    
    @GET
    suspend fun getAppStaffs(@Url url1: String?    ,    @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppStaffResponseSchema>
    
}
