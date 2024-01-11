package com.sdk.universal.content

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CredentialSchema
*/
@Parcelize
data class CredentialSchema(
    
    
    
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_enable")
    var isEnable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CredentialsSchema
*/
@Parcelize
data class CredentialsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CredentialSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ContentAPIError
*/
@Parcelize
data class ContentAPIError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





