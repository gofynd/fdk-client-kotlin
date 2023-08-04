package com.sdk.platform.models.filestorage

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
    Model: Opts
*/
@Parcelize
data class Opts(
    
    
    
    @SerializedName("attempts")
    var attempts: Int?=null,
    
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    
    @SerializedName("delay")
    var delay: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CopyFileTask
*/
@Parcelize
data class CopyFileTask(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("data")
    var data: BulkRequest?=null,
    
    @SerializedName("opts")
    var opts: Opts?=null,
    
    @SerializedName("progress")
    var progress: Int?=null,
    
    @SerializedName("delay")
    var delay: Int?=null,
    
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    
    @SerializedName("attempts_made")
    var attemptsMade: Int?=null,
    
    @SerializedName("stacktrace")
    var stacktrace: ArrayList<String>?=null,
    
    @SerializedName("finished_on")
    var finishedOn: Int?=null,
    
    @SerializedName("processed_on")
    var processedOn: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUploadResponse
*/
@Parcelize
data class BulkUploadResponse(
    
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("task")
    var task: CopyFileTask?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Destination
*/
@Parcelize
data class Destination(
    
    
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("rewrite")
    var rewrite: String?=null,
    
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRequest
*/
@Parcelize
data class BulkRequest(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    
    @SerializedName("destination")
    var destination: Destination?=null
    
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
    Model: DestinationBasepath
*/
@Parcelize
data class DestinationBasepath(
    
    
    
    @SerializedName("basepath")
    var basepath: String?=null,
    
    @SerializedName("rewrite")
    var rewrite: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CopyFilesWithRewrite
*/
@Parcelize
data class CopyFilesWithRewrite(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    
    @SerializedName("destination")
    var destination: DestinationBasepath?=null
    
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
    Model: payments
*/
@Parcelize
data class payments(
    
    
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: invoiceDetail
*/
@Parcelize
data class invoiceDetail(
    
    
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("invoice_date")
    var invoiceDate: String?=null,
    
    @SerializedName("irn")
    var irn: String?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: companyDetail
*/
@Parcelize
data class companyDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("phone_no")
    var phoneNo: String?=null,
    
    @SerializedName("cin")
    var cin: String?=null,
    
    @SerializedName("website_url")
    var websiteUrl: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: storeDetail
*/
@Parcelize
data class storeDetail(
    
    
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: customerShippingDetail
*/
@Parcelize
data class customerShippingDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone_no")
    var phoneNo: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("total_units")
    var totalUnits: Double?=null,
    
    @SerializedName("mrp")
    var mrp: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("taxable_amount")
    var taxableAmount: Double?=null,
    
    @SerializedName("total_taxable_amount")
    var totalTaxableAmount: Double?=null,
    
    @SerializedName("tax")
    var tax: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: productTable
*/
@Parcelize
data class productTable(
    
    
    
    @SerializedName("total_items")
    var totalItems: Double?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null,
    
    @SerializedName("grand_total")
    var grandTotal: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: String?=null,
    
    @SerializedName("delivery_charge_text")
    var deliveryChargeText: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: String?=null,
    
    @SerializedName("fynd_discounts")
    var fyndDiscounts: String?=null,
    
    @SerializedName("total_in_words")
    var totalInWords: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: returnDetail
*/
@Parcelize
data class returnDetail(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxeItems
*/
@Parcelize
data class TaxeItems(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("tax")
    var tax: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: taxTable
*/
@Parcelize
data class taxTable(
    
    
    
    @SerializedName("taxes")
    var taxes: ArrayList<TaxeItems>?=null,
    
    @SerializedName("grand_total")
    var grandTotal: Double?=null,
    
    @SerializedName("tax_in_words")
    var taxInWords: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: customerBillingDetail
*/
@Parcelize
data class customerBillingDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone_no")
    var phoneNo: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: registeredCompanyDetail
*/
@Parcelize
data class registeredCompanyDetail(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("zip_code")
    var zipCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DummyTemplateDataPayloadImage
*/
@Parcelize
data class DummyTemplateDataPayloadImage(
    
    
    
    @SerializedName("sales_channel_logo")
    var salesChannelLogo: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DummyTemplateDataPayload
*/
@Parcelize
data class DummyTemplateDataPayload(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("amount_to_be_collected")
    var amountToBeCollected: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("awb_number_barcode")
    var awbNumberBarcode: String?=null,
    
    @SerializedName("signed_qrcode")
    var signedQrcode: String?=null,
    
    @SerializedName("shipment_id_barcode")
    var shipmentIdBarcode: String?=null,
    
    @SerializedName("upi_qrcode")
    var upiQrcode: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("is_self_pickup")
    var isSelfPickup: Boolean?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("image")
    var image: DummyTemplateDataPayloadImage?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<payments>?=null,
    
    @SerializedName("invoice_detail")
    var invoiceDetail: @RawValue Any?=null,
    
    @SerializedName("company_detail")
    var companyDetail: companyDetail?=null,
    
    @SerializedName("store_detail")
    var storeDetail: storeDetail?=null,
    
    @SerializedName("customer_shipping_detail")
    var customerShippingDetail: customerShippingDetail?=null,
    
    @SerializedName("return_detail")
    var returnDetail: returnDetail?=null,
    
    @SerializedName("product_table")
    var productTable: productTable?=null,
    
    @SerializedName("tax_table")
    var taxTable: taxTable?=null,
    
    @SerializedName("declaration_texts")
    var declarationTexts: ArrayList<String>?=null,
    
    @SerializedName("registered_company_detail")
    var registeredCompanyDetail: registeredCompanyDetail?=null,
    
    @SerializedName("disclaimer")
    var disclaimer: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_partner_detail")
    var deliveryPartnerDetail: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("customer_billing_detail")
    var customerBillingDetail: customerBillingDetail?=null
    
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
    var payload: DummyTemplateDataPayload?=null,
    
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
    Model: BulkUploadFailFileResponseItems
*/
@Parcelize
data class BulkUploadFailFileResponseItems(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("file")
    var file: File?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkUploadFailResponse
*/
@Parcelize
data class BulkUploadFailResponse(
    
    
    
    @SerializedName("status")
    var status: Status?=null,
    
    @SerializedName("files")
    var files: @RawValue ArrayList<Any>?=null
    
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
    var payload: ArrayList<DummyTemplateDataItems>?=null,
    
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



