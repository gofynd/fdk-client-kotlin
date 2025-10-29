package com.sdk.universal.webhook

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: EventConfig
*/
@Parcelize
data class EventConfig(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_schema")
    var eventSchema: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("group")
    var group: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventDetails
*/
@Parcelize
data class EventDetails(
    
    
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventConfigBase
*/
@Parcelize
data class EventConfigBase(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventNotifier
*/
@Parcelize
data class EventNotifier(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventSchema
*/
@Parcelize
data class EventSchema(
    
    
    
    @SerializedName("payload")
    var payload: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InternalTransformEvent
*/
@Parcelize
data class InternalTransformEvent(
    
    
    
    @SerializedName("trace_id")
    var traceId: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("created_timestamp")
    var createdTimestamp: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransformEventData
*/
@Parcelize
data class TransformEventData(
    
    
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("event")
    var event: InternalTransformEvent?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("contains")
    var contains: ArrayList<String>?=null,
    
    @SerializedName("payload")
    var payload: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransformEventServiceMeta
*/
@Parcelize
data class TransformEventServiceMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TransformEventAssociation
*/
@Parcelize
data class TransformEventAssociation(
    
    
    
    @SerializedName("company_id")
    var companyId: Double?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TransformEventPayload
*/
@Parcelize
data class TransformEventPayload(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_version")
    var eventVersion: String?=null,
    
    @SerializedName("event")
    var event: EventSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateSchemaPayload
*/
@Parcelize
data class ValidateSchemaPayload(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_version")
    var eventVersion: String?=null,
    
    @SerializedName("event")
    var event: EventSchema?=null,
    
    @SerializedName("event_schema")
    var eventSchema: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateSchemaResult
*/
@Parcelize
data class ValidateSchemaResult(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransformEventResult
*/
@Parcelize
data class TransformEventResult(
    
    
    
    @SerializedName("event_trace_id")
    var eventTraceId: ArrayList<String>?=null,
    
    @SerializedName("data")
    var data: TransformEventData?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("service_meta")
    var serviceMeta: TransformEventServiceMeta?=null,
    
    @SerializedName("association")
    var association: TransformEventAssociation?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





