package com.sdk.application.apis.logistic

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.logistic.*

interface LogisticApiList {
    
    
    @POST 
    fun getTatProduct(@Url url1: String?   ,@Body body: GetTatProductReqBody)
    : Deferred<Response<GetTatProductResponse>>
    
    
    @GET 
    fun getPincodeCity(@Url url1: String?    )
    : Deferred<Response<GetPincodeCityResponse>>
    
}