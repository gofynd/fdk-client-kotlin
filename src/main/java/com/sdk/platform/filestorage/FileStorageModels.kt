package com.sdk.platform.filestorage

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: FailedBrowseFilesResult
*/
@Parcelize
data class FailedBrowseFilesResult(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("absolute_url")
    var absoluteUrl: String?=null,
    
    @SerializedName("relative_url")
    var relativeUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FileUpload
*/
@Parcelize
data class FileUpload(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FileUploadStart
*/
@Parcelize
data class FileUploadStart(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FileUploadComplete
*/
@Parcelize
data class FileUploadComplete(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProxyFileAccess
*/
@Parcelize
data class ProxyFileAccess(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("support")
    var support: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DestinationNamespace
*/
@Parcelize
data class DestinationNamespace(
    
    
    
    @SerializedName("namespace")
    var namespace: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CopyFiles
*/
@Parcelize
data class CopyFiles(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    
    @SerializedName("destination")
    var destination: DestinationNamespace?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Urls
*/
@Parcelize
data class Urls(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("signed_url")
    var signedUrl: String?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SignUrlResult
*/
@Parcelize
data class SignUrlResult(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SignUrl
*/
@Parcelize
data class SignUrl(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfig
*/
@Parcelize
data class PdfConfig(
    
    
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("default_template")
    var defaultTemplate: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfigSuccessData
*/
@Parcelize
data class PdfConfigSuccessData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfigSuccess
*/
@Parcelize
data class PdfConfigSuccess(
    
    
    
    @SerializedName("data")
    var data: ArrayList<PdfConfigSuccessData>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfigSaveSuccessData
*/
@Parcelize
data class PdfConfigSaveSuccessData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfigSaveSuccess
*/
@Parcelize
data class PdfConfigSaveSuccess(
    
    
    
    @SerializedName("data")
    var data: PdfConfigSaveSuccessData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptRequestBody
*/
@Parcelize
data class PaymentReceiptRequestBody(
    
    
    
    @SerializedName("payload")
    var payload: PaymentReceiptPayload?=null,
    
    @SerializedName("meta")
    var meta: PaymentReceiptMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptOrderDetails
*/
@Parcelize
data class PaymentReceiptOrderDetails(
    
    
    
    @SerializedName("jiomart_order_id")
    var jiomartOrderId: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Double?=null,
    
    @SerializedName("final_amount")
    var finalAmount: Double?=null,
    
    @SerializedName("final_amount_in_words")
    var finalAmountInWords: String?=null,
    
    @SerializedName("order_created_date")
    var orderCreatedDate: String?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("prm_id")
    var prmId: String?=null,
    
    @SerializedName("receipt_no")
    var receiptNo: String?=null,
    
    @SerializedName("taxes")
    var taxes: PaymentReceiptTaxes?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptCustomerDetails
*/
@Parcelize
data class PaymentReceiptCustomerDetails(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptPayments
*/
@Parcelize
data class PaymentReceiptPayments(
    
    
    
    @SerializedName("payment_desc")
    var paymentDesc: String?=null,
    
    @SerializedName("txn_date")
    var txnDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptFormat
*/
@Parcelize
data class PaymentReceiptFormat(
    
    
    
    @SerializedName("payment_receipt")
    var paymentReceipt: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptService
*/
@Parcelize
data class PaymentReceiptService(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptTaxes
*/
@Parcelize
data class PaymentReceiptTaxes(
    
    
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pancard")
    var pancard: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptPayload
*/
@Parcelize
data class PaymentReceiptPayload(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("order_detail")
    var orderDetail: PaymentReceiptOrderDetails?=null,
    
    @SerializedName("customer_detail")
    var customerDetail: PaymentReceiptCustomerDetails?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PaymentReceiptPayments>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentReceiptMeta
*/
@Parcelize
data class PaymentReceiptMeta(
    
    
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("event")
    var event: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("organizaton_id")
    var organizatonId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("application_id")
    var applicationId: ArrayList<String>?=null,
    
    @SerializedName("format")
    var format: PaymentReceiptFormat?=null,
    
    @SerializedName("trace_id")
    var traceId: ArrayList<String>?=null,
    
    @SerializedName("created_timestamp")
    var createdTimestamp: Double?=null,
    
    @SerializedName("service")
    var service: PaymentReceiptService?=null,
    
    @SerializedName("event_trace_info")
    var eventTraceInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trace")
    var trace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionSlug
*/
@Parcelize
data class ExtensionSlug(
    
    
    
    @SerializedName("extension_slug")
    var extensionSlug: String?=null
    
): Parcelable {
    
    
    
    
    
}





