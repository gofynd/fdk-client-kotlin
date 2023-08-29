package com.sdk.platform.filestorage

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    
    
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
    Model: StartResponse
*/
@Parcelize
data class StartResponse(
    
    
    
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
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StartRequest
*/
@Parcelize
data class StartRequest(
    
    
    
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
    Model: CompleteResponse
*/
@Parcelize
data class CompleteResponse(
    
    
    
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
    var modifiedOn: String?=null
    
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
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
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
    Model: DbRecord
*/
@Parcelize
data class DbRecord(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DbRecord>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceTypesResponse
*/
@Parcelize
data class InvoiceTypesResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("format")
    var format: ArrayList<String>?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("visibility")
    var visibility: Boolean?=null,
    
    @SerializedName("schema")
    var schema: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DummyTemplateDataItems
*/
@Parcelize
data class DummyTemplateDataItems(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Double?=null,
    
    @SerializedName("payload")
    var payload: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Status
*/
@Parcelize
data class Status(
    
    
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("failed")
    var failed: Double?=null,
    
    @SerializedName("succeeded")
    var succeeded: Double?=null,
    
    @SerializedName("result")
    var result: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FileSrc
*/
@Parcelize
data class FileSrc(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: File
*/
@Parcelize
data class File(
    
    
    
    @SerializedName("src")
    var src: FileSrc?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FilesSuccess
*/
@Parcelize
data class FilesSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("file")
    var file: File?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUploadSyncMode
*/
@Parcelize
data class BulkUploadSyncMode(
    
    
    
    @SerializedName("status")
    var status: Status?=null,
    
    @SerializedName("files")
    var files: ArrayList<FilesSuccess>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUploadFailResponse
*/
@Parcelize
data class BulkUploadFailResponse(
    
    
    
    @SerializedName("status")
    var status: Status?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: pdfRender
*/
@Parcelize
data class pdfRender(
    
    
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("payload")
    var payload: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: pdfConfig
*/
@Parcelize
data class pdfConfig(
    
    
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfConfigSuccess
*/
@Parcelize
data class PdfConfigSuccess(
    
    
    
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
    Model: PdfDefaultTemplateSuccess
*/
@Parcelize
data class PdfDefaultTemplateSuccess(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
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





