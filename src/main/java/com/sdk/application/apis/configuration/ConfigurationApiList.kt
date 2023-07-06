package com.sdk.application.apis.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.configuration.*

interface ConfigurationApiList {
    
    
    @GET 
    fun getApplication(@Url url1: String?   )
    : Deferred<Response<Application>>
    
    
    @GET 
    fun getOwnerInfo(@Url url1: String?   )
    : Deferred<Response<ApplicationAboutResponse>>
    
    
    @GET 
    fun getBasicDetails(@Url url1: String?   )
    : Deferred<Response<ApplicationDetail>>
    
    
    @GET 
    fun getIntegrationTokens(@Url url1: String?   )
    : Deferred<Response<AppTokenResponse>>
    
    
    @GET 
    fun getOrderingStores(@Url url1: String?    ,    @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStores>>
    
    
    @GET 
    fun getStoreDetailById(@Url url1: String?    )
    : Deferred<Response<OrderingStore>>
    
    
    @GET 
    fun getFeatures(@Url url1: String?   )
    : Deferred<Response<AppFeatureResponse>>
    
    
    @GET 
    fun getContactInfo(@Url url1: String?   )
    : Deferred<Response<ApplicationInformation>>
    
    
    @GET 
    fun getCurrencies(@Url url1: String?   )
    : Deferred<Response<CurrenciesResponse>>
    
    
    @GET 
    fun getCurrencyById(@Url url1: String?    )
    : Deferred<Response<Currency>>
    
    
    @GET 
    fun getAppCurrencies(@Url url1: String?   )
    : Deferred<Response<AppCurrencyResponse>>
    
    
    @GET 
    fun getLanguages(@Url url1: String?   )
    : Deferred<Response<LanguageResponse>>
    
    
    @POST 
    fun getOrderingStoreCookie(@Url url1: String?   ,@Body body: OrderingStoreSelectRequest)
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @DELETE 
    fun removeOrderingStoreCookie(@Url url1: String?   )
    : Deferred<Response<SuccessMessageResponse>>
    
    
    @GET 
    fun getAppStaffList(@Url url1: String?    ,       @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?, @Query("user_name") userName: String?)
    : Deferred<Response<AppStaffListResponse>>
    
    
    @GET 
    fun getAppStaffs(@Url url1: String?    ,    @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?)
    : Deferred<Response<AppStaffResponse>>
    
}