package com.sdk.platform.audittrail

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: RequestBodyAuditLog
*/
@Parcelize
data class RequestBodyAuditLog(
    
    
    
    @SerializedName("log_meta")
    var logMeta: LogMetaObj?=null,
    
    @SerializedName("log_payload")
    var logPayload: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateLogResp
*/
@Parcelize
data class CreateLogResp(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("internal_message")
    var internalMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogMetaObj
*/
@Parcelize
data class LogMetaObj(
    
    
    
    @SerializedName("modifier")
    var modifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("entity")
    var entity: EntityObject?=null,
    
    @SerializedName("device_info")
    var deviceInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("location")
    var location: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sessions")
    var sessions: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityObject
*/
@Parcelize
data class EntityObject(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BadRequestSchema
*/
@Parcelize
data class BadRequestSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}





