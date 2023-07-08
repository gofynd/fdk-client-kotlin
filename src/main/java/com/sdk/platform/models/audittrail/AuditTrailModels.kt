package com.sdk.platform.models.audittrail

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
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
    Model: CreateLogResponse
*/
@Parcelize
data class CreateLogResponse(
    
    
    
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
    var location: @RawValue HashMap<String,Any>?=null
    
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
    Model: LogSchemaResponse
*/
@Parcelize
data class LogSchemaResponse(
    
    
    
    @SerializedName("docs")
    var docs: ArrayList<LogDocs>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LogDocs
*/
@Parcelize
data class LogDocs(
    
    
    
    @SerializedName("entity")
    var entity: EntityObj?=null,
    
    @SerializedName("modifier")
    var modifier: Modifier?=null,
    
    @SerializedName("device_info")
    var deviceInfo: DeviceInfo?=null,
    
    @SerializedName("location")
    var location: Location?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("sessions")
    var sessions: String?=null,
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("logs")
    var logs: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityObj
*/
@Parcelize
data class EntityObj(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("entity_details")
    var entityDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Modifier
*/
@Parcelize
data class Modifier(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("as_administrator")
    var asAdministrator: Boolean?=null,
    
    @SerializedName("user_details")
    var userDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeviceInfo
*/
@Parcelize
data class DeviceInfo(
    
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Location
*/
@Parcelize
data class Location(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BadRequest
*/
@Parcelize
data class BadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResourceNotFound
*/
@Parcelize
data class ResourceNotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InternalServerError
*/
@Parcelize
data class InternalServerError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityTypesResponse
*/
@Parcelize
data class EntityTypesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EntityTypeObj>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EntityTypeObj
*/
@Parcelize
data class EntityTypeObj(
    
    
    
    @SerializedName("entity_value")
    var entityValue: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



