package com.sdk.platform.communication

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: AppProvidersGlobalProviderRequestObjProvider
*/
@Parcelize
data class AppProvidersGlobalProviderRequestObjProvider(
    
    
    
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppProvidersGlobalProviderRequestObj
*/
@Parcelize
data class AppProvidersGlobalProviderRequestObj(
    
    
    
    @SerializedName("transaction")
    var transaction: AppProvidersGlobalProviderRequestObjProvider?=null,
    
    @SerializedName("otp")
    var otp: AppProvidersGlobalProviderRequestObjProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppProvidersGlobalProviderReq
*/
@Parcelize
data class AppProvidersGlobalProviderReq(
    
    
    
    @SerializedName("email")
    var email: AppProvidersGlobalProviderRequestObj?=null,
    
    @SerializedName("sms")
    var sms: AppProvidersGlobalProviderRequestObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAppProvidersGlobalProviderResEmailSmsObj
*/
@Parcelize
data class UpdateAppProvidersGlobalProviderResEmailSmsObj(
    
    
    
    @SerializedName("default_provider")
    var defaultProvider: String?=null,
    
    @SerializedName("otp_provider")
    var otpProvider: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAppProvidersGlobalProviderRes
*/
@Parcelize
data class UpdateAppProvidersGlobalProviderRes(
    
    
    
    @SerializedName("email")
    var email: UpdateAppProvidersGlobalProviderResEmailSmsObj?=null,
    
    @SerializedName("sms")
    var sms: UpdateAppProvidersGlobalProviderResEmailSmsObj?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultEmailProvidersFromAddresses
*/
@Parcelize
data class DefaultEmailProvidersFromAddresses(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultEmailProviders
*/
@Parcelize
data class DefaultEmailProviders(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("from_address")
    var fromAddress: ArrayList<DefaultEmailProvidersFromAddresses>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("expired_at")
    var expiredAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendInstantRes
*/
@Parcelize
data class SendInstantRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("response")
    var response: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaStructure
*/
@Parcelize
data class MetaStructure(
    
    
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("trace")
    var trace: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayloadSmsTemplateStructure
*/
@Parcelize
data class PayloadSmsTemplateStructure(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayloadSmsProviderStructure
*/
@Parcelize
data class PayloadSmsProviderStructure(
    
    
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PayloadEmailTemplateStructure
*/
@Parcelize
data class PayloadEmailTemplateStructure(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayloadEmailProviderStructure
*/
@Parcelize
data class PayloadEmailProviderStructure(
    
    
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PayloadEmailStructure
*/
@Parcelize
data class PayloadEmailStructure(
    
    
    
    @SerializedName("template")
    var template: PayloadEmailTemplateStructure?=null,
    
    @SerializedName("provider")
    var provider: PayloadEmailProviderStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayloadSmsStructure
*/
@Parcelize
data class PayloadSmsStructure(
    
    
    
    @SerializedName("template")
    var template: PayloadSmsTemplateStructure?=null,
    
    @SerializedName("provider")
    var provider: PayloadSmsProviderStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendSyncData
*/
@Parcelize
data class SendSyncData(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("to")
    var to: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendSyncReq
*/
@Parcelize
data class SendSyncReq(
    
    
    
    @SerializedName("data")
    var data: ArrayList<SendSyncData>?=null,
    
    @SerializedName("email")
    var email: PayloadEmailStructure?=null,
    
    @SerializedName("sms")
    var sms: PayloadSmsStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EngineReq
*/
@Parcelize
data class EngineReq(
    
    
    
    @SerializedName("payload")
    var payload: SendSyncReq?=null,
    
    @SerializedName("meta")
    var meta: MetaStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EngineRes
*/
@Parcelize
data class EngineRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionsBulkUpdateReq
*/
@Parcelize
data class EventSubscriptionsBulkUpdateReq(
    
    
    
    @SerializedName("subscriptions")
    var subscriptions: ArrayList<SubscriptionsObject>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionsBulkUpdateRes
*/
@Parcelize
data class EventSubscriptionsBulkUpdateRes(
    
    
    
    @SerializedName("template")
    var template: EventSubscriptionTemplate?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("event")
    var event: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionsObjectReq
*/
@Parcelize
data class SubscriptionsObjectReq(
    
    
    
    @SerializedName("event")
    var event: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("template")
    var template: TemplateObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionsObject
*/
@Parcelize
data class SubscriptionsObject(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("event")
    var event: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("template")
    var template: TemplateObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateObject
*/
@Parcelize
data class TemplateObject(
    
    
    
    @SerializedName("sms")
    var sms: CommunicationTemplate?=null,
    
    @SerializedName("email")
    var email: CommunicationTemplate?=null,
    
    @SerializedName("pushnotification")
    var pushnotification: CommunicationTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationTemplate
*/
@Parcelize
data class CommunicationTemplate(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppProvider
*/
@Parcelize
data class AppProvider(
    
    
    
    @SerializedName("email")
    var email: AppProviderRes?=null,
    
    @SerializedName("sms")
    var sms: AppProviderRes?=null,
    
    @SerializedName("voice")
    var voice: AppProviderResVoice?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppProviderRes
*/
@Parcelize
data class AppProviderRes(
    
    
    
    @SerializedName("transaction")
    var transaction: AppProviderResObj?=null,
    
    @SerializedName("promotional")
    var promotional: AppProviderResObj?=null,
    
    @SerializedName("otp")
    var otp: AppProviderResObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppProviderResVoice
*/
@Parcelize
data class AppProviderResVoice(
    
    
    
    @SerializedName("transaction")
    var transaction: AppProviderResObj?=null,
    
    @SerializedName("otp")
    var otp: AppProviderResObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppProviderResObj
*/
@Parcelize
data class AppProviderResObj(
    
    
    
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GlobalProviders
*/
@Parcelize
data class GlobalProviders(
    
    
    
    @SerializedName("email")
    var email: ArrayList<GlobalProvidersResObj>?=null,
    
    @SerializedName("sms")
    var sms: ArrayList<GlobalProvidersResObj>?=null,
    
    @SerializedName("voice")
    var voice: ArrayList<GlobalProvidersResObj>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalProvidersResObj
*/
@Parcelize
data class GlobalProvidersResObj(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppProviderReq
*/
@Parcelize
data class AppProviderReq(
    
    
    
    @SerializedName("email")
    var email: AppProviderRes?=null,
    
    @SerializedName("sms")
    var sms: AppProviderRes?=null,
    
    @SerializedName("voice")
    var voice: AppProviderResVoice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatsImported
*/
@Parcelize
data class StatsImported(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StatsProcessedEmail
*/
@Parcelize
data class StatsProcessedEmail(
    
    
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("suppressed")
    var suppressed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatsProcessedSms
*/
@Parcelize
data class StatsProcessedSms(
    
    
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("suppressed")
    var suppressed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatsProcessed
*/
@Parcelize
data class StatsProcessed(
    
    
    
    @SerializedName("email")
    var email: StatsProcessedEmail?=null,
    
    @SerializedName("sms")
    var sms: StatsProcessedSms?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Stats
*/
@Parcelize
data class Stats(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("imported")
    var imported: StatsImported?=null,
    
    @SerializedName("processed")
    var processed: StatsProcessed?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStats
*/
@Parcelize
data class GetStats(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Stats>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CampaignReq
*/
@Parcelize
data class CampaignReq(
    
    
    
    @SerializedName("recipient_headers")
    var recipientHeaders: RecipientHeaders?=null,
    
    @SerializedName("email")
    var email: CampaignEmail?=null,
    
    @SerializedName("datasource")
    var datasource: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    
    @SerializedName("application")
    var application: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RecipientHeaders
*/
@Parcelize
data class RecipientHeaders(
    
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CampaignEmailTemplate
*/
@Parcelize
data class CampaignEmailTemplate(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CampignEmailProvider
*/
@Parcelize
data class CampignEmailProvider(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("from_name")
    var fromName: String?=null,
    
    @SerializedName("from_email")
    var fromEmail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CampaignEmail
*/
@Parcelize
data class CampaignEmail(
    
    
    
    @SerializedName("template")
    var template: CampaignEmailTemplate?=null,
    
    @SerializedName("provider")
    var provider: CampignEmailProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Campaign
*/
@Parcelize
data class Campaign(
    
    
    
    @SerializedName("recipient_headers")
    var recipientHeaders: RecipientHeaders?=null,
    
    @SerializedName("email")
    var email: CampaignEmail?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("datasource")
    var datasource: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Campaigns
*/
@Parcelize
data class Campaigns(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Campaign>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AudienceReq
*/
@Parcelize
data class AudienceReq(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Audience
*/
@Parcelize
data class Audience(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Audiences
*/
@Parcelize
data class Audiences(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Audience>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetNRecordsCsvReq
*/
@Parcelize
data class GetNRecordsCsvReq(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("header")
    var header: Boolean?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetNRecordsCsvResItems
*/
@Parcelize
data class GetNRecordsCsvResItems(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("firstname")
    var firstname: String?=null,
    
    @SerializedName("lastname")
    var lastname: String?=null,
    
    @SerializedName("orderid")
    var orderid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetNRecordsCsvRes
*/
@Parcelize
data class GetNRecordsCsvRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetNRecordsCsvResItems>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DummyDatasources
*/
@Parcelize
data class DummyDatasources(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DummyDatasourcesMeta
*/
@Parcelize
data class DummyDatasourcesMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("data")
    var data: DummyDatasourcesMetaObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DummyDatasourcesMetaObj
*/
@Parcelize
data class DummyDatasourcesMetaObj(
    
    
    
    @SerializedName("b")
    var b: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EmailProviderReqFrom
*/
@Parcelize
data class EmailProviderReqFrom(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailProviderReq
*/
@Parcelize
data class EmailProviderReq(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("from_address")
    var fromAddress: ArrayList<EmailProviderReqFrom>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailProvider
*/
@Parcelize
data class EmailProvider(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("from_address")
    var fromAddress: ArrayList<EmailProviderReqFrom>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailProviders
*/
@Parcelize
data class EmailProviders(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EmailProvider>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EmailTemplateKeys
*/
@Parcelize
data class EmailTemplateKeys(
    
    
    
    @SerializedName("to")
    var to: String?=null,
    
    @SerializedName("cc")
    var cc: String?=null,
    
    @SerializedName("bcc")
    var bcc: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailTemplateHeaders
*/
@Parcelize
data class EmailTemplateHeaders(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EmailTemplateReq
*/
@Parcelize
data class EmailTemplateReq(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("from_name")
    var fromName: String?=null,
    
    @SerializedName("static_to")
    var staticTo: ArrayList<String>?=null,
    
    @SerializedName("static_cc")
    var staticCc: ArrayList<String>?=null,
    
    @SerializedName("static_bcc")
    var staticBcc: ArrayList<String>?=null,
    
    @SerializedName("reply_to")
    var replyTo: String?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    
    @SerializedName("html")
    var html: TemplateAndType?=null,
    
    @SerializedName("editor_type")
    var editorType: String?=null,
    
    @SerializedName("editor_meta")
    var editorMeta: String?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<Int>?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<EmailTemplateHeaders>?=null,
    
    @SerializedName("keys")
    var keys: EmailTemplateKeys?=null,
    
    @SerializedName("text")
    var text: TemplateAndType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateAndType
*/
@Parcelize
data class TemplateAndType(
    
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateKeys
*/
@Parcelize
data class TemplateKeys(
    
    
    
    @SerializedName("to")
    var to: String?=null,
    
    @SerializedName("cc")
    var cc: String?=null,
    
    @SerializedName("bcc")
    var bcc: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailTemplate
*/
@Parcelize
data class EmailTemplate(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("editor_type")
    var editorType: String?=null,
    
    @SerializedName("editor_meta")
    var editorMeta: String?=null,
    
    @SerializedName("static_to")
    var staticTo: ArrayList<String>?=null,
    
    @SerializedName("static_cc")
    var staticCc: ArrayList<String>?=null,
    
    @SerializedName("static_bcc")
    var staticBcc: ArrayList<String>?=null,
    
    @SerializedName("reply_to")
    var replyTo: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    
    @SerializedName("keys")
    var keys: TemplateKeys?=null,
    
    @SerializedName("html")
    var html: TemplateAndType?=null,
    
    @SerializedName("url_shorten")
    var urlShorten: EnabledObj?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<EmailTemplateHeaders>?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<Int>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("from_name")
    var fromName: String?=null,
    
    @SerializedName("text")
    var text: TemplateAndType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SystemEmailTemplate
*/
@Parcelize
data class SystemEmailTemplate(
    
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("static_to")
    var staticTo: ArrayList<String>?=null,
    
    @SerializedName("static_cc")
    var staticCc: ArrayList<String>?=null,
    
    @SerializedName("static_bcc")
    var staticBcc: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    
    @SerializedName("html")
    var html: TemplateAndType?=null,
    
    @SerializedName("url_shorten")
    var urlShorten: EnabledObj?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<EmailTemplateHeaders>?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<Int>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("text")
    var text: TemplateAndType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailTemplates
*/
@Parcelize
data class EmailTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EmailTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscribedSmsTemplates
*/
@Parcelize
data class SubscribedSmsTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SmsTemplates>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscribedEmailTemplates
*/
@Parcelize
data class SubscribedEmailTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EmailTemplate>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplateSms
*/
@Parcelize
data class EventSubscriptionTemplateSms(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplateEmail
*/
@Parcelize
data class EventSubscriptionTemplateEmail(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplatePushnotification
*/
@Parcelize
data class EventSubscriptionTemplatePushnotification(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplate
*/
@Parcelize
data class EventSubscriptionTemplate(
    
    
    
    @SerializedName("sms")
    var sms: EventSubscriptionTemplateSms?=null,
    
    @SerializedName("email")
    var email: EventSubscriptionTemplateEmail?=null,
    
    @SerializedName("pushnotification")
    var pushnotification: EventSubscriptionTemplatePushnotification?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscription
*/
@Parcelize
data class EventSubscription(
    
    
    
    @SerializedName("template")
    var template: EventSubscriptionTemplate?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("event")
    var event: @RawValue Any?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplateSmsObj
*/
@Parcelize
data class EventSubscriptionTemplateSmsObj(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplateEmailObj
*/
@Parcelize
data class EventSubscriptionTemplateEmailObj(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionTemplateObj
*/
@Parcelize
data class EventSubscriptionTemplateObj(
    
    
    
    @SerializedName("sms")
    var sms: EventSubscriptionTemplateSmsObj?=null,
    
    @SerializedName("email")
    var email: EventSubscriptionTemplateEmailObj?=null,
    
    @SerializedName("pushnotification")
    var pushnotification: EventSubscriptionTemplatePushnotification?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptionObj
*/
@Parcelize
data class EventSubscriptionObj(
    
    
    
    @SerializedName("template")
    var template: EventSubscriptionTemplateObj?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("event")
    var event: @RawValue Any?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EventSubscriptions
*/
@Parcelize
data class EventSubscriptions(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EventSubscriptionObj>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TriggerJobRes
*/
@Parcelize
data class TriggerJobRes(
    
    
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TriggerJobReq
*/
@Parcelize
data class TriggerJobReq(
    
    
    
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GlobalVariablesGetRes
*/
@Parcelize
data class GlobalVariablesGetRes(
    
    
    
    @SerializedName("read_only")
    var readOnly: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("editable")
    var editable: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalVariablesPostRes
*/
@Parcelize
data class GlobalVariablesPostRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("global_variables")
    var globalVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalVariablesReq
*/
@Parcelize
data class GlobalVariablesReq(
    
    
    
    @SerializedName("global_variables")
    var globalVariables: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Job
*/
@Parcelize
data class Job(
    
    
    
    @SerializedName("completed")
    var completed: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("campaign")
    var campaign: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Jobs
*/
@Parcelize
data class Jobs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Job>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateJobsRes
*/
@Parcelize
data class CreateJobsRes(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("campaign")
    var campaign: String?=null,
    
    @SerializedName("completed")
    var completed: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateJobsReq
*/
@Parcelize
data class CreateJobsReq(
    
    
    
    @SerializedName("campaign")
    var campaign: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: JobLog
*/
@Parcelize
data class JobLog(
    
    
    
    @SerializedName("imported")
    var imported: StatsImported?=null,
    
    @SerializedName("processed")
    var processed: StatsProcessed?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("job")
    var job: String?=null,
    
    @SerializedName("campaign")
    var campaign: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobLogs
*/
@Parcelize
data class JobLogs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<JobLog>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogEmail
*/
@Parcelize
data class LogEmail(
    
    
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("to")
    var to: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogSms
*/
@Parcelize
data class LogSms(
    
    
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogPushnotification
*/
@Parcelize
data class LogPushnotification(
    
    
    
    @SerializedName("pushtokens")
    var pushtokens: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LogMeta
*/
@Parcelize
data class LogMeta(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("job")
    var job: String?=null,
    
    @SerializedName("campaign")
    var campaign: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("offset")
    var offset: String?=null,
    
    @SerializedName("partition")
    var partition: String?=null,
    
    @SerializedName("topic")
    var topic: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Log
*/
@Parcelize
data class Log(
    
    
    
    @SerializedName("email")
    var email: LogEmail?=null,
    
    @SerializedName("sms")
    var sms: LogSms?=null,
    
    @SerializedName("pushnotification")
    var pushnotification: LogPushnotification?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pod")
    var pod: String?=null,
    
    @SerializedName("service")
    var service: String?=null,
    
    @SerializedName("step")
    var step: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("meta")
    var meta: LogMeta?=null,
    
    @SerializedName("application")
    var application: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Logs
*/
@Parcelize
data class Logs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Log>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpSmsCommsProvider
*/
@Parcelize
data class SendOtpSmsCommsProvider(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpEmailCommsProvider
*/
@Parcelize
data class SendOtpEmailCommsProvider(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpEmailCommsTemplate
*/
@Parcelize
data class SendOtpEmailCommsTemplate(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsReqData
*/
@Parcelize
data class SendOtpCommsReqData(
    
    
    
    @SerializedName("send_same_otp_to_channel")
    var sendSameOtpToChannel: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("to")
    var to: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsReqSms
*/
@Parcelize
data class SendOtpCommsReqSms(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("template")
    var template: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("provider")
    var provider: SendOtpSmsCommsProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsReqEmail
*/
@Parcelize
data class SendOtpCommsReqEmail(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("template")
    var template: SendOtpEmailCommsTemplate?=null,
    
    @SerializedName("provider")
    var provider: SendOtpEmailCommsProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsResSms
*/
@Parcelize
data class SendOtpCommsResSms(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsResEmail
*/
@Parcelize
data class SendOtpCommsResEmail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("to")
    var to: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsReq
*/
@Parcelize
data class SendOtpCommsReq(
    
    
    
    @SerializedName("data")
    var data: SendOtpCommsReqData?=null,
    
    @SerializedName("sms")
    var sms: SendOtpCommsReqSms?=null,
    
    @SerializedName("email")
    var email: SendOtpCommsReqEmail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpCommsRes
*/
@Parcelize
data class SendOtpCommsRes(
    
    
    
    @SerializedName("sms")
    var sms: SendOtpCommsResSms?=null,
    
    @SerializedName("email")
    var email: SendOtpCommsResEmail?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpCommsReq
*/
@Parcelize
data class VerifyOtpCommsReq(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpCommsSuccessRes
*/
@Parcelize
data class VerifyOtpCommsSuccessRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SmsProviderReq
*/
@Parcelize
data class SmsProviderReq(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("sender")
    var sender: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("authkey")
    var authkey: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("senderid")
    var senderid: String?=null,
    
    @SerializedName("feedid")
    var feedid: String?=null,
    
    @SerializedName("entityid")
    var entityid: String?=null,
    
    @SerializedName("override_dnd")
    var overrideDnd: Boolean?=null,
    
    @SerializedName("host")
    var host: String?=null,
    
    @SerializedName("port")
    var port: Int?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("apikey")
    var apikey: String?=null,
    
    @SerializedName("version_id")
    var versionId: Int?=null,
    
    @SerializedName("sender_id")
    var senderId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SmsProvider
*/
@Parcelize
data class SmsProvider(
    
    
    
    @SerializedName("rpt")
    var rpt: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("sender")
    var sender: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("authkey")
    var authkey: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SmsProviders
*/
@Parcelize
data class SmsProviders(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SmsProvider>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultSmsProviders
*/
@Parcelize
data class DefaultSmsProviders(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SmsTemplateMessage
*/
@Parcelize
data class SmsTemplateMessage(
    
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SmsTemplates
*/
@Parcelize
data class SmsTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SmsTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SmsTemplate
*/
@Parcelize
data class SmsTemplate(
    
    
    
    @SerializedName("url_shorten")
    var urlShorten: EnabledObj?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("meta")
    var meta: metaObj?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("template_id")
    var templateId: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SystemSmsTemplates
*/
@Parcelize
data class SystemSmsTemplates(
    
    
    
    @SerializedName("url_shorten")
    var urlShorten: EnabledObj?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("template_id")
    var templateId: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: metaObj
*/
@Parcelize
data class metaObj(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SmsTemplateReq
*/
@Parcelize
data class SmsTemplateReq(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("template_id")
    var templateId: String?=null,
    
    @SerializedName("meta")
    var meta: metaObj?=null,
    
    @SerializedName("template_variables")
    var templateVariables: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("message")
    var message: SmsTemplateMessage?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Notification
*/
@Parcelize
data class Notification(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("body")
    var body: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("deeplink")
    var deeplink: String?=null,
    
    @SerializedName("click_action")
    var clickAction: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SystemNotificationSetting
*/
@Parcelize
data class SystemNotificationSetting(
    
    
    
    @SerializedName("sound")
    var sound: Boolean?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("time_to_live")
    var timeToLive: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SystemNotificationUser
*/
@Parcelize
data class SystemNotificationUser(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SystemNotification
*/
@Parcelize
data class SystemNotification(
    
    
    
    @SerializedName("notification")
    var notification: Notification?=null,
    
    @SerializedName("user")
    var user: SystemNotificationUser?=null,
    
    @SerializedName("settings")
    var settings: SystemNotificationSetting?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("group")
    var group: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SystemNotifications
*/
@Parcelize
data class SystemNotifications(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SystemNotification>?=null,
    
    @SerializedName("last_read_anchor")
    var lastReadAnchor: Int?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    var size: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BasicDelete
*/
@Parcelize
data class BasicDelete(
    
    
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null,
    
    @SerializedName("deleted_count")
    var deletedCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EnabledObj
*/
@Parcelize
data class EnabledObj(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OtpConfigurationExpiryDuration
*/
@Parcelize
data class OtpConfigurationExpiryDuration(
    
    
    
    @SerializedName("time")
    var time: Double?=null,
    
    @SerializedName("denomination")
    var denomination: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfigurationExpiry
*/
@Parcelize
data class OtpConfigurationExpiry(
    
    
    
    @SerializedName("duration")
    var duration: OtpConfigurationExpiryDuration?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfigRateLimit
*/
@Parcelize
data class OtpConfigRateLimit(
    
    
    
    @SerializedName("duration")
    var duration: Double?=null,
    
    @SerializedName("limit")
    var limit: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfiguration
*/
@Parcelize
data class OtpConfiguration(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("expiry")
    var expiry: OtpConfigurationExpiry?=null,
    
    @SerializedName("rate_limit")
    var rateLimit: OtpConfigRateLimit?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





