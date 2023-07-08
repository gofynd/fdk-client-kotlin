package com.sdk.platform.models.analytics

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: StatGroup
*/
@Parcelize
data class StatGroup(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorRes
*/
@Parcelize
data class ErrorRes(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StatsGroups
*/
@Parcelize
data class StatsGroups(
    
    
    
    @SerializedName("groups")
    var groups: ArrayList<StatGroup>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StatsGroupComponent
*/
@Parcelize
data class StatsGroupComponent(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatsGroupComponents
*/
@Parcelize
data class StatsGroupComponents(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("components")
    var components: ArrayList<StatsGroupComponent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StatsRes
*/
@Parcelize
data class StatsRes(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReceivedAt
*/
@Parcelize
data class ReceivedAt(
    
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AbandonCartsDetail
*/
@Parcelize
data class AbandonCartsDetail(
    
    
    
    @SerializedName("properties_cart_id")
    var propertiesCartId: String?=null,
    
    @SerializedName("context_traits_first_name")
    var contextTraitsFirstName: String?=null,
    
    @SerializedName("context_traits_last_name")
    var contextTraitsLastName: String?=null,
    
    @SerializedName("context_traits_phone_number")
    var contextTraitsPhoneNumber: String?=null,
    
    @SerializedName("context_traits_email")
    var contextTraitsEmail: String?=null,
    
    @SerializedName("context_app_application_id")
    var contextAppApplicationId: String?=null,
    
    @SerializedName("properties_breakup_values_raw_total")
    var propertiesBreakupValuesRawTotal: String?=null,
    
    @SerializedName("received_at")
    var receivedAt: ReceivedAt?=null
    
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
    Model: AbandonCartsList
*/
@Parcelize
data class AbandonCartsList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AbandonCartsDetail>?=null,
    
    @SerializedName("cart_total")
    var cartTotal: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonCartDetail
*/
@Parcelize
data class AbandonCartDetail(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("breakup")
    var breakup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExportJobReq
*/
@Parcelize
data class ExportJobReq(
    
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    
    @SerializedName("start_time")
    var startTime: String?=null,
    
    @SerializedName("end_time")
    var endTime: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExportJobRes
*/
@Parcelize
data class ExportJobRes(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExportJobStatusRes
*/
@Parcelize
data class ExportJobStatusRes(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("job_id")
    var jobId: String?=null,
    
    @SerializedName("download_url")
    var downloadUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLogsListReq
*/
@Parcelize
data class GetLogsListReq(
    
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MkpLogsResp
*/
@Parcelize
data class MkpLogsResp(
    
    
    
    @SerializedName("start_time_iso")
    var startTimeIso: String?=null,
    
    @SerializedName("end_time_iso")
    var endTimeIso: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("count")
    var count: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLogsListRes
*/
@Parcelize
data class GetLogsListRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<MkpLogsResp>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SearchLogReq
*/
@Parcelize
data class SearchLogReq(
    
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("identifier_value")
    var identifierValue: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogInfo
*/
@Parcelize
data class LogInfo(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    
    @SerializedName("event")
    var event: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("brand_id")
    var brandId: Double?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_id")
    var storeId: Double?=null,
    
    @SerializedName("item_id")
    var itemId: Double?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SearchLogRes
*/
@Parcelize
data class SearchLogRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<LogInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



