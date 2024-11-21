package com.sdk.application.finance

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface FinanceApiList {
    
    
    @POST
    suspend fun customerCreditBalance(@Url url1: String?   ,@Body body: CustomerCreditBalanceRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerCreditBalanceResponseSchema>
    
    
    @POST
    suspend fun lockUnlockCreditNote(@Url url1: String?   ,@Body body: LockUnlockRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<LockUnlockResponseSchema>
    
}
