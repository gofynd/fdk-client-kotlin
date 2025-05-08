package com.sdk.platform.webhook

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: BroadcasterConfig
*/
@Parcelize
data class BroadcasterConfig(
    
    
    
    @SerializedName("topic")
    var topic: String?=null,
    
    @SerializedName("queue")
    var queue: String?=null,
    
    @SerializedName("event_bridge_name")
    var eventBridgeName: String?=null,
    
    @SerializedName("workflow_name")
    var workflowName: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("detail_type")
    var detailType: String?=null
    
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
    
    @SerializedName("broadcaster_config")
    var broadcasterConfig: BroadcasterConfig?=null,
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
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
    Model: EventConfigResult
*/
@Parcelize
data class EventConfigResult(
    
    
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
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
    Model: SubscriberDetails
*/
@Parcelize
data class SubscriberDetails(
    
    
    
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
    var topic: String?=null,
    
    @SerializedName("queue")
    var queue: String?=null,
    
    @SerializedName("event_bridge_name")
    var eventBridgeName: String?=null,
    
    @SerializedName("workflow_name")
    var workflowName: String?=null,
    
    @SerializedName("detail_type")
    var detailType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberConfigPostRequestV2
*/
@Parcelize
data class SubscriberConfigPostRequestV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
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
    Model: SubscriberConfigResult
*/
@Parcelize
data class SubscriberConfigResult(
    
    
    
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
    var items: ArrayList<SubscriberDetails>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RestEventData
*/
@Parcelize
data class RestEventData(
    
    
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RestConfig
*/
@Parcelize
data class RestConfig(
    
    
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("events")
    var events: ArrayList<RestEventData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: QueueEventData
*/
@Parcelize
data class QueueEventData(
    
    
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("topic")
    var topic: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: KafkaConfig
*/
@Parcelize
data class KafkaConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("events")
    var events: ArrayList<QueueEventData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PubSubConfig
*/
@Parcelize
data class PubSubConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("events")
    var events: ArrayList<QueueEventData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TemporalEventData
*/
@Parcelize
data class TemporalEventData(
    
    
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("queue")
    var queue: String?=null,
    
    @SerializedName("workflow_name")
    var workflowName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemporalConfig
*/
@Parcelize
data class TemporalConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("events")
    var events: ArrayList<TemporalEventData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SqsEventData
*/
@Parcelize
data class SqsEventData(
    
    
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("queue")
    var queue: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SqsConfig
*/
@Parcelize
data class SqsConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("events")
    var events: ArrayList<SqsEventData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventBridgeData
*/
@Parcelize
data class EventBridgeData(
    
    
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("event_bridge_name")
    var eventBridgeName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventBridgeConfig
*/
@Parcelize
data class EventBridgeConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("events")
    var events: ArrayList<EventBridgeData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventMapBody
*/
@Parcelize
data class EventMapBody(
    
    
    
    @SerializedName("rest")
    var rest: RestConfig?=null,
    
    @SerializedName("kafka")
    var kafka: KafkaConfig?=null,
    
    @SerializedName("pub_sub")
    var pubSub: PubSubConfig?=null,
    
    @SerializedName("temporal")
    var temporal: TemporalConfig?=null,
    
    @SerializedName("sqs")
    var sqs: SqsConfig?=null,
    
    @SerializedName("event_bridge")
    var eventBridge: EventBridgeConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WebhookConfig
*/
@Parcelize
data class WebhookConfig(
    
    
    
    @SerializedName("notification_email")
    var notificationEmail: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("event_map")
    var eventMap: EventMapBody?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpsertSubscriberConfig
*/
@Parcelize
data class UpsertSubscriberConfig(
    
    
    
    @SerializedName("webhook_config")
    var webhookConfig: WebhookConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpsertSubscriberConfigResult
*/
@Parcelize
data class UpsertSubscriberConfigResult(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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

