package com.sdk.platform.models.finance

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GenerateReportFilters
*/
@Parcelize
data class GenerateReportFilters(
    
    
    
    @SerializedName("brand")
    var brand: ArrayList<String>?=null,
    
    @SerializedName("channel")
    var channel: ArrayList<String>?=null,
    
    @SerializedName("company")
    var company: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportMeta
*/
@Parcelize
data class GenerateReportMeta(
    
    
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("channel")
    var channel: String?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportPlatform
*/
@Parcelize
data class GenerateReportPlatform(
    
    
    
    @SerializedName("filters")
    var filters: GenerateReportFilters?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("meta")
    var meta: GenerateReportMeta?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportRequest
*/
@Parcelize
data class GenerateReportRequest(
    
    
    
    @SerializedName("data")
    var data: GenerateReportPlatform?=null
    
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
    Model: GenerateReportJson
*/
@Parcelize
data class GenerateReportJson(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ArrayList<String>>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReport
*/
@Parcelize
data class DownloadReport(
    
    
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportItems
*/
@Parcelize
data class DownloadReportItems(
    
    
    
    @SerializedName("type_of_request")
    var typeOfRequest: String?=null,
    
    @SerializedName("filters")
    var filters: GenerateReportFilters?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("meta")
    var meta: GenerateReportMeta?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportList
*/
@Parcelize
data class DownloadReportList(
    
    
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<DownloadReportItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetEngineFilters
*/
@Parcelize
data class GetEngineFilters(
    
    
    
    @SerializedName("config_field")
    var configField: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetEngineData
*/
@Parcelize
data class GetEngineData(
    
    
    
    @SerializedName("filters")
    var filters: GetEngineFilters?=null,
    
    @SerializedName("project")
    var project: ArrayList<String>?=null,
    
    @SerializedName("table_name")
    var tableName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetEngineRequest
*/
@Parcelize
data class GetEngineRequest(
    
    
    
    @SerializedName("data")
    var data: GetEngineData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetEngineResponse
*/
@Parcelize
data class GetEngineResponse(
    
    
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetReason
*/
@Parcelize
data class GetReason(
    
    
    
    @SerializedName("reason_type")
    var reasonType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetReasonRequest
*/
@Parcelize
data class GetReasonRequest(
    
    
    
    @SerializedName("data")
    var data: GetReason?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetDocs
*/
@Parcelize
data class GetDocs(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("docs")
    var docs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetReasonResponse
*/
@Parcelize
data class GetReasonResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: GetDocs?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetReportListData
*/
@Parcelize
data class GetReportListData(
    
    
    
    @SerializedName("role_name")
    var roleName: String?=null,
    
    @SerializedName("listing_enabled")
    var listingEnabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetReportListRequest
*/
@Parcelize
data class GetReportListRequest(
    
    
    
    @SerializedName("data")
    var data: GetReportListData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetAffiliate
*/
@Parcelize
data class GetAffiliate(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetAffiliateResponse
*/
@Parcelize
data class GetAffiliateResponse(
    
    
    
    @SerializedName("docs")
    var docs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadCreditDebitNote
*/
@Parcelize
data class DownloadCreditDebitNote(
    
    
    
    @SerializedName("note_id")
    var noteId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DownloadCreditDebitNoteRequest
*/
@Parcelize
data class DownloadCreditDebitNoteRequest(
    
    
    
    @SerializedName("data")
    var data: DownloadCreditDebitNote?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DownloadCreditDebitNoteResponseData
*/
@Parcelize
data class DownloadCreditDebitNoteResponseData(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pdf_s3_url")
    var pdfS3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadCreditDebitNoteResponse
*/
@Parcelize
data class DownloadCreditDebitNoteResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<DownloadCreditDebitNoteResponseData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentProcessPayload
*/
@Parcelize
data class PaymentProcessPayload(
    
    
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source_reference")
    var sourceReference: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentProcessRequest
*/
@Parcelize
data class PaymentProcessRequest(
    
    
    
    @SerializedName("data")
    var data: PaymentProcessPayload?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentProcessResponse
*/
@Parcelize
data class PaymentProcessResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditlineDataPlatformPayload
*/
@Parcelize
data class CreditlineDataPlatformPayload(
    
    
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("end_end")
    var endEnd: String?=null,
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("seller_id")
    var sellerId: String?=null,
    
    @SerializedName("start_end")
    var startEnd: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditlineDataPlatformRequest
*/
@Parcelize
data class CreditlineDataPlatformRequest(
    
    
    
    @SerializedName("data")
    var data: CreditlineDataPlatformPayload?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreditlineDataPlatformResponse
*/
@Parcelize
data class CreditlineDataPlatformResponse(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("show_mr")
    var showMr: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IsCreditlinePayload
*/
@Parcelize
data class IsCreditlinePayload(
    
    
    
    @SerializedName("seller_id")
    var sellerId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: IsCreditlinePlatformRequest
*/
@Parcelize
data class IsCreditlinePlatformRequest(
    
    
    
    @SerializedName("data")
    var data: IsCreditlinePayload?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: IsCreditlinePlatformResponse
*/
@Parcelize
data class IsCreditlinePlatformResponse(
    
    
    
    @SerializedName("is_creditline_opted")
    var isCreditlineOpted: Boolean?=null,
    
    @SerializedName("code")
    var code: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceTypePayloadData
*/
@Parcelize
data class InvoiceTypePayloadData(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoiceTypeRequest
*/
@Parcelize
data class InvoiceTypeRequest(
    
    
    
    @SerializedName("data")
    var data: InvoiceTypePayloadData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoiceTypeResponseItems
*/
@Parcelize
data class InvoiceTypeResponseItems(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceTypeResponse
*/
@Parcelize
data class InvoiceTypeResponse(
    
    
    
    @SerializedName("invoice_type_list")
    var invoiceTypeList: ArrayList<InvoiceTypeResponseItems>?=null,
    
    @SerializedName("payment_status_list")
    var paymentStatusList: ArrayList<InvoiceTypeResponseItems>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InoviceListingPayloadDataFilters
*/
@Parcelize
data class InoviceListingPayloadDataFilters(
    
    
    
    @SerializedName("company_id")
    var companyId: ArrayList<String>?=null,
    
    @SerializedName("payment_status")
    var paymentStatus: ArrayList<String>?=null,
    
    @SerializedName("invoice_type")
    var invoiceType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceListingPayloadData
*/
@Parcelize
data class InvoiceListingPayloadData(
    
    
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("filters")
    var filters: InoviceListingPayloadDataFilters?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("search")
    var search: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceListingRequest
*/
@Parcelize
data class InvoiceListingRequest(
    
    
    
    @SerializedName("data")
    var data: InvoiceListingPayloadData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UnpaidInvoiceDataItems
*/
@Parcelize
data class UnpaidInvoiceDataItems(
    
    
    
    @SerializedName("total_unpaid_amount")
    var totalUnpaidAmount: Double?=null,
    
    @SerializedName("total_unpaid_invoice_count")
    var totalUnpaidInvoiceCount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceListingResponseItems
*/
@Parcelize
data class InvoiceListingResponseItems(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("invoice_type")
    var invoiceType: String?=null,
    
    @SerializedName("is_downloadable")
    var isDownloadable: Boolean?=null,
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("invoice_date")
    var invoiceDate: String?=null,
    
    @SerializedName("period")
    var period: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceListingResponse
*/
@Parcelize
data class InvoiceListingResponse(
    
    
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("unpaid_invoice_data")
    var unpaidInvoiceData: UnpaidInvoiceDataItems?=null,
    
    @SerializedName("items")
    var items: ArrayList<InvoiceListingResponseItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoicePdfPayloadData
*/
@Parcelize
data class InvoicePdfPayloadData(
    
    
    
    @SerializedName("invoice_number")
    var invoiceNumber: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoicePdfRequest
*/
@Parcelize
data class InvoicePdfRequest(
    
    
    
    @SerializedName("data")
    var data: InvoicePdfPayloadData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoicePdfResponse
*/
@Parcelize
data class InvoicePdfResponse(
    
    
    
    @SerializedName("error")
    var error: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AsCnRefundData
*/
@Parcelize
data class AsCnRefundData(
    
    
    
    @SerializedName("toggle_edit_required")
    var toggleEditRequired: Boolean?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AsCnRefundRequest
*/
@Parcelize
data class AsCnRefundRequest(
    
    
    
    @SerializedName("data")
    var data: AsCnRefundData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AsCnRefundResponseData
*/
@Parcelize
data class AsCnRefundResponseData(
    
    
    
    @SerializedName("is_first_time_user")
    var isFirstTimeUser: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AsCnRefundResponse
*/
@Parcelize
data class AsCnRefundResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: AsCnRefundResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditNoteConfigNotificationEvents
*/
@Parcelize
data class CreditNoteConfigNotificationEvents(
    
    
    
    @SerializedName("expiration_reminder_to_customer")
    var expirationReminderToCustomer: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateSellerCreditNoteConfig
*/
@Parcelize
data class CreateSellerCreditNoteConfig(
    
    
    
    @SerializedName("ordering_channel")
    var orderingChannel: ArrayList<String>?=null,
    
    @SerializedName("is_cn_as_refund_method")
    var isCnAsRefundMethod: Boolean?=null,
    
    @SerializedName("validity")
    var validity: Int?=null,
    
    @SerializedName("source_channel")
    var sourceChannel: ArrayList<String>?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("notification_events")
    var notificationEvents: CreditNoteConfigNotificationEvents?=null,
    
    @SerializedName("sales_channel_name")
    var salesChannelName: String?=null,
    
    @SerializedName("slug_values")
    var slugValues: ArrayList<String>?=null,
    
    @SerializedName("currency_type")
    var currencyType: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateSellerCreditNoteConfigRequest
*/
@Parcelize
data class CreateSellerCreditNoteConfigRequest(
    
    
    
    @SerializedName("data")
    var data: CreateSellerCreditNoteConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateSellerCreditNoteConfigResponse
*/
@Parcelize
data class CreateSellerCreditNoteConfigResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteConfig
*/
@Parcelize
data class DeleteConfig(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("slug_values")
    var slugValues: ArrayList<String>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteConfigRequest
*/
@Parcelize
data class DeleteConfigRequest(
    
    
    
    @SerializedName("data")
    var data: DeleteConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteConfigResponse
*/
@Parcelize
data class DeleteConfigResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChannelDisplayName
*/
@Parcelize
data class ChannelDisplayName(
    
    
    
    @SerializedName("platform_pos")
    var platformPos: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ChannelDisplayNameResponse
*/
@Parcelize
data class ChannelDisplayNameResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ChannelDisplayName?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CnReferenceNumber
*/
@Parcelize
data class CnReferenceNumber(
    
    
    
    @SerializedName("cn_reference_number")
    var cnReferenceNumber: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetPdfUrlViewRequest
*/
@Parcelize
data class GetPdfUrlViewRequest(
    
    
    
    @SerializedName("data")
    var data: CnReferenceNumber?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetPdfUrlViewResponseData
*/
@Parcelize
data class GetPdfUrlViewResponseData(
    
    
    
    @SerializedName("cn_reference_number")
    var cnReferenceNumber: String?=null,
    
    @SerializedName("s3_pdf_link")
    var s3PdfLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPdfUrlViewResponse
*/
@Parcelize
data class GetPdfUrlViewResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: GetPdfUrlViewResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditNoteDetailsRequest
*/
@Parcelize
data class CreditNoteDetailsRequest(
    
    
    
    @SerializedName("data")
    var data: CnReferenceNumber?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CnDetails
*/
@Parcelize
data class CnDetails(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("expiry_date")
    var expiryDate: String?=null,
    
    @SerializedName("staff_id")
    var staffId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("date_issued")
    var dateIssued: String?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null,
    
    @SerializedName("channel_of_issuance")
    var channelOfIssuance: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RedemptionDetails
*/
@Parcelize
data class RedemptionDetails(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("staff_id")
    var staffId: String?=null,
    
    @SerializedName("amount_debited")
    var amountDebited: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditNoteDetails
*/
@Parcelize
data class CreditNoteDetails(
    
    
    
    @SerializedName("cn_details")
    var cnDetails: ArrayList<CnDetails>?=null,
    
    @SerializedName("redemption_details")
    var redemptionDetails: ArrayList<RedemptionDetails>?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("cn_reference_number")
    var cnReferenceNumber: String?=null,
    
    @SerializedName("cn_amount")
    var cnAmount: Int?=null,
    
    @SerializedName("cn_status")
    var cnStatus: String?=null,
    
    @SerializedName("available_cn_balance")
    var availableCnBalance: Int?=null,
    
    @SerializedName("remaining_cn_amount")
    var remainingCnAmount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditNoteDetailsResponse
*/
@Parcelize
data class CreditNoteDetailsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditNoteDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCustomerCreditBalance
*/
@Parcelize
data class GetCustomerCreditBalance(
    
    
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCustomerCreditBalanceRequest
*/
@Parcelize
data class GetCustomerCreditBalanceRequest(
    
    
    
    @SerializedName("data")
    var data: GetCustomerCreditBalance?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetCustomerCreditBalanceResponseData
*/
@Parcelize
data class GetCustomerCreditBalanceResponseData(
    
    
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("total_credited_balance")
    var totalCreditedBalance: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCustomerCreditBalanceResponse
*/
@Parcelize
data class GetCustomerCreditBalanceResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: GetCustomerCreditBalanceResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCnConfigRequest
*/
@Parcelize
data class GetCnConfigRequest(
    
    
    
    @SerializedName("data")
    var data: DeleteConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetCnConfigResponseMeta
*/
@Parcelize
data class GetCnConfigResponseMeta(
    
    
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("source_channel")
    var sourceChannel: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCnConfigResponseData
*/
@Parcelize
data class GetCnConfigResponseData(
    
    
    
    @SerializedName("is_cn_as_refund_method")
    var isCnAsRefundMethod: Boolean?=null,
    
    @SerializedName("validity")
    var validity: Int?=null,
    
    @SerializedName("notification_events")
    var notificationEvents: CreditNoteConfigNotificationEvents?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("meta")
    var meta: GetCnConfigResponseMeta?=null,
    
    @SerializedName("currency_type")
    var currencyType: String?=null,
    
    @SerializedName("redemption_ordering_channel")
    var redemptionOrderingChannel: ArrayList<String>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCnConfigResponse
*/
@Parcelize
data class GetCnConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: GetCnConfigResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CnGenerateReportFilters
*/
@Parcelize
data class CnGenerateReportFilters(
    
    
    
    @SerializedName("ordering_channel")
    var orderingChannel: ArrayList<String>?=null,
    
    @SerializedName("staff_id")
    var staffId: ArrayList<String>?=null,
    
    @SerializedName("utilisation")
    var utilisation: ArrayList<String>?=null,
    
    @SerializedName("types_of_transaction")
    var typesOfTransaction: ArrayList<String>?=null,
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    
    @SerializedName("channel_of_issuance")
    var channelOfIssuance: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CnGenerateReport
*/
@Parcelize
data class CnGenerateReport(
    
    
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("filters")
    var filters: CnGenerateReportFilters?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("search_type")
    var searchType: String?=null,
    
    @SerializedName("meta")
    var meta: GenerateReportFilters?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("search")
    var search: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportCustomerCnRequest
*/
@Parcelize
data class GenerateReportCustomerCnRequest(
    
    
    
    @SerializedName("data")
    var data: CnGenerateReport?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CnGenerateReportItems
*/
@Parcelize
data class CnGenerateReportItems(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("expiry_date")
    var expiryDate: String?=null,
    
    @SerializedName("credit_note_number")
    var creditNoteNumber: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("date_issued")
    var dateIssued: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportCustomerCnResponse
*/
@Parcelize
data class GenerateReportCustomerCnResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CnGenerateReportItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("allowed_filters")
    var allowedFilters: ArrayList<String>?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("row_header_display_order")
    var rowHeaderDisplayOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("primary_headers")
    var primaryHeaders: ArrayList<String>?=null,
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CnDownloadReport
*/
@Parcelize
data class CnDownloadReport(
    
    
    
    @SerializedName("status")
    var status: ArrayList<String>?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("search_type")
    var searchType: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("search")
    var search: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportCustomerCnRequest
*/
@Parcelize
data class DownloadReportCustomerCnRequest(
    
    
    
    @SerializedName("data")
    var data: CnDownloadReport?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DownloadReportResponseData
*/
@Parcelize
data class DownloadReportResponseData(
    
    
    
    @SerializedName("report_config_id")
    var reportConfigId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("download_link")
    var downloadLink: String?=null,
    
    @SerializedName("requested_by")
    var requestedBy: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("request_dict")
    var requestDict: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("report_name")
    var reportName: String?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("full_name")
    var fullName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportCustomerCnResponse
*/
@Parcelize
data class DownloadReportCustomerCnResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<DownloadReportResponseData>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetReportingFilters
*/
@Parcelize
data class GetReportingFilters(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("options")
    var options: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetReportingNestedFilters
*/
@Parcelize
data class GetReportingNestedFilters(
    
    
    
    @SerializedName("placeholder_text")
    var placeholderText: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("options")
    var options: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetReportingFiltersResponse
*/
@Parcelize
data class GetReportingFiltersResponse(
    
    
    
    @SerializedName("search")
    var search: GetReportingFilters?=null,
    
    @SerializedName("status")
    var status: GetReportingFilters?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<GetReportingNestedFilters>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



