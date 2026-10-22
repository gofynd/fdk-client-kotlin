package com.sdk.platform.authorization

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface AuthorizationApiList {
    
    @GET ("/service/platform/authorization/v1.0/company/{company_id}/application/{application_id}/staff/list")
    suspend fun getApplicationStaffList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("order_incent") orderIncent: Boolean?, @Query("ordering_store") orderingStore: Int?, @Query("user") user: String?, @Query("user_name") userName: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationStaffPage>
    
}
