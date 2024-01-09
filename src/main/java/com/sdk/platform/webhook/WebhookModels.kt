package com.sdk.platform.webhook

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CancelResponse
*/
@Parcelize
data class CancelResponse(
    
    
    
    @SerializedName("code")
    var code: Int?=null
    
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
    
    @SerializedName("event")
    var event: ArrayList<Event>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
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
    Model: ManualRetryFailedResponse
*/
@Parcelize
data class ManualRetryFailedResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailedEventsCountSuccessResponse
*/
@Parcelize
data class FailedEventsCountSuccessResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EventCountItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventCountItem
*/
@Parcelize
data class EventCountItem(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RetryStatusResponse
*/
@Parcelize
data class RetryStatusResponse(
    
    
    
    @SerializedName("total_event")
    var totalEvent: Int?=null,
    
    @SerializedName("success_count")
    var successCount: Int?=null,
    
    @SerializedName("failure_count")
    var failureCount: Int?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventSuccessResponse
*/
@Parcelize
data class EventSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventProcessedSuccessResponse
*/
@Parcelize
data class EventProcessedSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
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
    var lastAttemptedOn: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("response_time")
    var responseTime: Int?=null
    
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
    Model: ReportFiltersPayload
*/
@Parcelize
data class ReportFiltersPayload(
    
    
    
    @SerializedName("subscriber_ids")
    var subscriberIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FilterValues
*/
@Parcelize
data class FilterValues(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FilterResponseObject
*/
@Parcelize
data class FilterResponseObject(
    
    
    
    @SerializedName("filter_name")
    var filterName: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<FilterValues>?=null
    
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
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReportFilterResponse
*/
@Parcelize
data class ReportFilterResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FilterResponseObject>?=null
    
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
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("subscribers")
    var subscribers: ArrayList<Int>?=null
    
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
    Model: HistoryResponseObject
*/
@Parcelize
data class HistoryResponseObject(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("association")
    var association: AssociationDetails?=null,
    
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
    var items: ArrayList<HistoryResponseObject>?=null
    
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
    Model: AssociationDetails
*/
@Parcelize
data class AssociationDetails(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriberResponse
*/
@Parcelize
data class SubscriberResponse(
    
    
    
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
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
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
    Model: Association
*/
@Parcelize
data class Association(
    
    
    
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
    Model: SubscriberConfig
*/
@Parcelize
data class SubscriberConfig(
    
    
    
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
        inactive("inactive"), 
        
        @SerializedName("blocked")
        blocked("blocked");
        

        companion object {
            fun valueOfSubscriberStatus(value : String): SubscriberStatus? {
                return SubscriberStatus.values().find {
                    it.value == value
                }
            }
        }
    }

