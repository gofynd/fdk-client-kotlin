package com.sdk.platform.webhook

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: Event
*/
@Parcelize
data class Event(
    
    
    
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
    Model: EventProcessRequest
*/
@Parcelize
data class EventProcessRequest(
    
    
    
    @SerializedName("search_text")
    var searchText: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("subscriber_ids")
    var subscriberIds: ArrayList<Int>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("event")
    var event: ArrayList<Event>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportResponse
*/
@Parcelize
data class DownloadReportResponse(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventProcessReports
*/
@Parcelize
data class EventProcessReports(
    
    
    
    @SerializedName("rows")
    var rows: ArrayList<EventProcessReportObject>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventProcessReportObject
*/
@Parcelize
data class EventProcessReportObject(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("response_code")
    var responseCode: Int?=null,
    
    @SerializedName("response_message")
    var responseMessage: String?=null,
    
    @SerializedName("data")
    var data: String?=null,
    
    @SerializedName("attempt")
    var attempt: Int?=null,
    
    @SerializedName("last_attempted_on")
    var lastAttemptedOn: Double?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("response_time")
    var responseTime: Int?=null,
    
    @SerializedName("message_id")
    var messageId: String?=null,
    
    @SerializedName("event_trace_id")
    var eventTraceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PingWebhook
*/
@Parcelize
data class PingWebhook(
    
    
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PingWebhookResponse
*/
@Parcelize
data class PingWebhookResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberEventMapping
*/
@Parcelize
data class SubscriberEventMapping(
    
    
    
    @SerializedName("id")
    var id: Double?=null,
    
    @SerializedName("event_id")
    var eventId: Double?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: Double?=null,
    
    @SerializedName("topic")
    var topic: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
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
    
    @SerializedName("subscriber_event_mapping")
    var subscriberEventMapping: SubscriberEventMapping?=null,
    
    @SerializedName("event_schema")
    var eventSchema: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("group")
    var group: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventConfigResponse
*/
@Parcelize
data class EventConfigResponse(
    
    
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReportFiltersPayload
*/
@Parcelize
data class ReportFiltersPayload(
    
    
    
    @SerializedName("subscriber_ids")
    var subscriberIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReportFilterResponse
*/
@Parcelize
data class ReportFilterResponse(
    
    
    
    @SerializedName("filter_name")
    var filterName: String?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryPayload
*/
@Parcelize
data class HistoryPayload(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryFilters
*/
@Parcelize
data class HistoryFilters(
    
    
    
    @SerializedName("events")
    var events: ArrayList<String>?=null,
    
    @SerializedName("search_text")
    var searchText: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("subscribers")
    var subscribers: ArrayList<Int>?=null,
    
    @SerializedName("webhook_type")
    var webhookType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Url
*/
@Parcelize
data class Url(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CdnObject
*/
@Parcelize
data class CdnObject(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<Url>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UploadServiceObject
*/
@Parcelize
data class UploadServiceObject(
    
    
    
    @SerializedName("cdn")
    var cdn: CdnObject?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: HistoryAssociation
*/
@Parcelize
data class HistoryAssociation(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("subscriber_ids")
    var subscriberIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryItems
*/
@Parcelize
data class HistoryItems(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("association")
    var association: HistoryAssociation?=null,
    
    @SerializedName("filters")
    var filters: HistoryFilters?=null,
    
    @SerializedName("filename")
    var filename: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("upload_service_response")
    var uploadServiceResponse: UploadServiceObject?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryResponse
*/
@Parcelize
data class HistoryResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<HistoryItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CancelResponse
*/
@Parcelize
data class CancelResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Association
*/
@Parcelize
data class Association(
    
    
    
    @SerializedName("application_id")
    var applicationId: ArrayList<String>?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("criteria")
    var criteria: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssociationResp
*/
@Parcelize
data class AssociationResp(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: ArrayList<String>?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("criteria")
    var criteria: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AuthMeta
*/
@Parcelize
data class AuthMeta(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberResponse
*/
@Parcelize
data class SubscriberResponse(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("association")
    var association: AssociationResp?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Events
*/
@Parcelize
data class Events(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("topic")
    var topic: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigPostRequestV2
*/
@Parcelize
data class SubscriberConfigPostRequestV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("events")
    var events: ArrayList<Events>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigUpdateRequestV2
*/
@Parcelize
data class SubscriberConfigUpdateRequestV2(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("events")
    var events: ArrayList<Events>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigPost
*/
@Parcelize
data class SubscriberConfigPost(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("event_id")
    var eventId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigUpdate
*/
@Parcelize
data class SubscriberConfigUpdate(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("event_id")
    var eventId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigResponse
*/
@Parcelize
data class SubscriberConfigResponse(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("association")
    var association: AssociationResp?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("event_id")
    var eventId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigList
*/
@Parcelize
data class SubscriberConfigList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SubscriberResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}







    /*
        Enum: SubscriberStatus
        Used By: Webhook
    */
    enum class SubscriberStatus(val value:String){
        
        @SerializedName("active")
        active("active"), 
        
        @SerializedName("inactive")
        inactive("inactive");
        

        companion object {
            fun valueOfSubscriberStatus(value : String): SubscriberStatus? {
                return SubscriberStatus.values().find {
                    it.value == value
                }
            }
        }
    }

