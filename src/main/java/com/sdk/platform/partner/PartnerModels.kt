package com.sdk.platform.partner

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: AddProxyReq
*/
@Parcelize
data class AddProxyReq(
    
    
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddProxyResponse
*/
@Parcelize
data class AddProxyResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RemoveProxyResponse
*/
@Parcelize
data class RemoveProxyResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}





