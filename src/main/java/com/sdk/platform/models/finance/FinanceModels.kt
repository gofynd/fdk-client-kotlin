package com.sdk.platform.models.finance

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GenerateReportMeta
*/
@Parcelize
data class GenerateReportMeta(
    
    
    
    @SerializedName("channel")
    var channel: String?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportFilters
*/
@Parcelize
data class GenerateReportFilters(
    
    
    
    @SerializedName("channel")
    var channel: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ArrayList<String>?=null,
    
    @SerializedName("company")
    var company: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateReportPlatform
*/
@Parcelize
data class GenerateReportPlatform(
    
    
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("meta")
    var meta: GenerateReportMeta?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("filters")
    var filters: GenerateReportFilters?=null
    
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
    
    
    
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<ArrayList<String>>?=null
    
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
    
    
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportItems
*/
@Parcelize
data class DownloadReportItems(
    
    
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("meta")
    var meta: GenerateReportMeta?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("type_of_request")
    var typeOfRequest: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("filters")
    var filters: GenerateReportFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DownloadReportList
*/
@Parcelize
data class DownloadReportList(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<DownloadReportItems>?=null
    
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
    
    
    
    @SerializedName("project")
    var project: ArrayList<String>?=null,
    
    @SerializedName("filters")
    var filters: GetEngineFilters?=null,
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
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
    
    
    
    @SerializedName("listing_enabled")
    var listingEnabled: Boolean?=null,
    
    @SerializedName("role_name")
    var roleName: String?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("docs")
    var docs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    
    
    @SerializedName("pdf_s3_url")
    var pdfS3Url: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
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
    
    
    
    @SerializedName("source_reference")
    var sourceReference: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("invoice_number")
    var invoiceNumber: String?=null,
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null,
    
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
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetInvoiceListPayloadData
*/
@Parcelize
data class GetInvoiceListPayloadData(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetInvoiceListRequest
*/
@Parcelize
data class GetInvoiceListRequest(
    
    
    
    @SerializedName("data")
    var data: GetInvoiceListPayloadData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetInvoiceListResponse
*/
@Parcelize
data class GetInvoiceListResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_status_list")
    var paymentStatusList: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("invoice_type_list")
    var invoiceTypeList: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceListingPayloadData
*/
@Parcelize
data class InvoiceListingPayloadData(
    
    
    
    @SerializedName("end_end")
    var endEnd: String?=null,
    
    @SerializedName("pagesize")
    var pagesize: Int?=null,
    
    @SerializedName("start_end")
    var startEnd: String?=null,
    
    @SerializedName("search")
    var search: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: Int?=null
    
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
    Model: InvoiceListingResponse
*/
@Parcelize
data class InvoiceListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("item_count")
    var itemCount: Int?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<String>?=null,
    
    @SerializedName("error")
    var error: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



