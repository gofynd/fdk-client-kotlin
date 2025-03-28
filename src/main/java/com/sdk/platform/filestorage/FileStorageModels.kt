package com.sdk.platform.filestorage

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PdfTypeByIdDetails
*/
@Parcelize
data class PdfTypeByIdDetails(
    
    
    
    @SerializedName("store_os")
    var storeOs: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("format")
    var format: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfDefaultTemplateById
*/
@Parcelize
data class PdfDefaultTemplateById(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfDefaultTemplateSuccess
*/
@Parcelize
data class PdfDefaultTemplateSuccess(
    
    
    
    @SerializedName("data")
    var data: ArrayList<Document>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
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
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
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
    Model: InvoiceTypesData
*/
@Parcelize
data class InvoiceTypesData(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
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
    
    @SerializedName("store_os")
    var storeOs: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceTypes
*/
@Parcelize
data class InvoiceTypes(
    
    
    
    @SerializedName("data")
    var data: ArrayList<InvoiceTypesData>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConversionRate
*/
@Parcelize
data class ConversionRate(
    
    
    
    @SerializedName("base")
    var base: String?=null,
    
    @SerializedName("rates")
    var rates: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("timestamp")
    var timestamp: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryPartnerDetail
*/
@Parcelize
data class DeliveryPartnerDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("awb_number_barcode")
    var awbNumberBarcode: String?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("origin")
    var origin: String?=null,
    
    @SerializedName("destination")
    var destination: String?=null,
    
    @SerializedName("eway_bill_number")
    var ewayBillNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    
    @SerializedName("sales_channel_logo")
    var salesChannelLogo: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentData
*/
@Parcelize
data class PaymentData(
    
    
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetail
*/
@Parcelize
data class InvoiceDetail(
    
    
    
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
    
    @SerializedName("signed_qrcode")
    var signedQrcode: String?=null,
    
    @SerializedName("upi_qrcode")
    var upiQrcode: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("marketplace_invoice_id")
    var marketplaceInvoiceId: String?=null,
    
    @SerializedName("marketplace_shipment_id")
    var marketplaceShipmentId: String?=null,
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    
    
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
    var zipCode: Double?=null,
    
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
    var email: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("phone")
    var phone: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trn")
    var trn: String?=null,
    
    @SerializedName("vat")
    var vat: String?=null,
    
    @SerializedName("business_country_timezone")
    var businessCountryTimezone: String?=null,
    
    @SerializedName("business_country_currency")
    var businessCountryCurrency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
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
    var gstin: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerBillingDetail
*/
@Parcelize
data class CustomerBillingDetail(
    
    
    
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
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerShippingDetail
*/
@Parcelize
data class CustomerShippingDetail(
    
    
    
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
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnDetail
*/
@Parcelize
data class ReturnDetail(
    
    
    
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
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null
    
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
    Model: Cgst
*/
@Parcelize
data class Cgst(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("percent")
    var percent: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Sgst
*/
@Parcelize
data class Sgst(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("percent")
    var percent: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Igst
*/
@Parcelize
data class Igst(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("percent")
    var percent: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Tax
*/
@Parcelize
data class Tax(
    
    
    
    @SerializedName("cgst")
    var cgst: Cgst?=null,
    
    @SerializedName("sgst")
    var sgst: Sgst?=null,
    
    @SerializedName("igst")
    var igst: Igst?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemsProductTable
*/
@Parcelize
data class ItemsProductTable(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("total_units")
    var totalUnits: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("mrp")
    var mrp: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("taxable_amount")
    var taxableAmount: Double?=null,
    
    @SerializedName("total_taxable_amount")
    var totalTaxableAmount: Double?=null,
    
    @SerializedName("tax")
    var tax: Tax?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTable
*/
@Parcelize
data class ProductTable(
    
    
    
    @SerializedName("total_items")
    var totalItems: Double?=null,
    
    @SerializedName("products")
    var products: ArrayList<ItemsProductTable>?=null,
    
    @SerializedName("grand_total")
    var grandTotal: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("delivery_charge_text")
    var deliveryChargeText: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("fynd_discounts")
    var fyndDiscounts: Double?=null,
    
    @SerializedName("total_in_words")
    var totalInWords: String?=null,
    
    @SerializedName("gift_price")
    var giftPrice: Double?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Double?=null,
    
    @SerializedName("sub_total")
    var subTotal: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("promotion")
    var promotion: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("reward")
    var reward: Double?=null,
    
    @SerializedName("round_off")
    var roundOff: Double?=null,
    
    @SerializedName("total_value_of_goods")
    var totalValueOfGoods: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Taxes
*/
@Parcelize
data class Taxes(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("tax")
    var tax: Tax?=null,
    
    @SerializedName("total_tax_value")
    var totalTaxValue: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxTable
*/
@Parcelize
data class TaxTable(
    
    
    
    @SerializedName("taxes")
    var taxes: ArrayList<Taxes>?=null,
    
    @SerializedName("total_tax")
    var totalTax: Double?=null,
    
    @SerializedName("tax_in_words")
    var taxInWords: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RegisteredCompanyDetail
*/
@Parcelize
data class RegisteredCompanyDetail(
    
    
    
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
    var zipCode: Double?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Kwargs
*/
@Parcelize
data class Kwargs(
    
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ShipmentIdBarcodeGenerator
*/
@Parcelize
data class ShipmentIdBarcodeGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: Kwargs?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SignedQrcodeGenerator
*/
@Parcelize
data class SignedQrcodeGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: Kwargs?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: KwargsUpiQrcode
*/
@Parcelize
data class KwargsUpiQrcode(
    
    
    
    @SerializedName("qr_data")
    var qrData: String?=null,
    
    @SerializedName("qr_url")
    var qrUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpiQrcodeGenerator
*/
@Parcelize
data class UpiQrcodeGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: KwargsUpiQrcode?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DigitalsignatureGenerator
*/
@Parcelize
data class DigitalsignatureGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: Kwargs?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: KwargsAwbNumber
*/
@Parcelize
data class KwargsAwbNumber(
    
    
    
    @SerializedName("value")
    var value: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AwbNumberLabelBarcodeGenerator
*/
@Parcelize
data class AwbNumberLabelBarcodeGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: KwargsAwbNumber?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AwbNumberBarcodeGenerator
*/
@Parcelize
data class AwbNumberBarcodeGenerator(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: Kwargs?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetaProperty
*/
@Parcelize
data class MetaProperty(
    
    
    
    @SerializedName("shipment_id_barcode_generator")
    var shipmentIdBarcodeGenerator: ShipmentIdBarcodeGenerator?=null,
    
    @SerializedName("signed_qrcode_generator")
    var signedQrcodeGenerator: SignedQrcodeGenerator?=null,
    
    @SerializedName("upi_qrcode_generator")
    var upiQrcodeGenerator: UpiQrcodeGenerator?=null,
    
    @SerializedName("digitalsignature_generator")
    var digitalsignatureGenerator: DigitalsignatureGenerator?=null,
    
    @SerializedName("awb_number_label_barcode_generator")
    var awbNumberLabelBarcodeGenerator: AwbNumberLabelBarcodeGenerator?=null,
    
    @SerializedName("awb_number_barcode_generator")
    var awbNumberBarcodeGenerator: AwbNumberBarcodeGenerator?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("generator")
    var generator: MetaProperty?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PdfPayloadDetails
*/
@Parcelize
data class PdfPayloadDetails(
    
    
    
    @SerializedName("is_export")
    var isExport: Boolean?=null,
    
    @SerializedName("is_export_shipment")
    var isExportShipment: Boolean?=null,
    
    @SerializedName("app_domain_name")
    var appDomainName: String?=null,
    
    @SerializedName("txn_id")
    var txnId: String?=null,
    
    @SerializedName("utr")
    var utr: String?=null,
    
    @SerializedName("po_number")
    var poNumber: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("current_date")
    var currentDate: String?=null,
    
    @SerializedName("total_value_of_goods")
    var totalValueOfGoods: Double?=null,
    
    @SerializedName("b2b_buyer_details")
    var b2BBuyerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_qwik")
    var isQwik: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("conversion_rate")
    var conversionRate: ConversionRate?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("delivery_partner_detail")
    var deliveryPartnerDetail: DeliveryPartnerDetail?=null,
    
    @SerializedName("image")
    var image: Image?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PaymentData>?=null,
    
    @SerializedName("invoice_detail")
    var invoiceDetail: InvoiceDetail?=null,
    
    @SerializedName("company_detail")
    var companyDetail: CompanyDetail?=null,
    
    @SerializedName("store_detail")
    var storeDetail: StoreDetail?=null,
    
    @SerializedName("customer_billing_detail")
    var customerBillingDetail: CustomerBillingDetail?=null,
    
    @SerializedName("customer_shipping_detail")
    var customerShippingDetail: CustomerShippingDetail?=null,
    
    @SerializedName("return_detail")
    var returnDetail: ReturnDetail?=null,
    
    @SerializedName("product_table")
    var productTable: ProductTable?=null,
    
    @SerializedName("tax_table")
    var taxTable: TaxTable?=null,
    
    @SerializedName("declaration_texts")
    var declarationTexts: ArrayList<String>?=null,
    
    @SerializedName("registered_company_detail")
    var registeredCompanyDetail: RegisteredCompanyDetail?=null,
    
    @SerializedName("disclaimer")
    var disclaimer: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("is_self_pickup")
    var isSelfPickup: Boolean?=null,
    
    @SerializedName("platform_name")
    var platformName: String?=null,
    
    @SerializedName("amount_to_be_collected")
    var amountToBeCollected: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("waybills")
    var waybills: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("total_items")
    var totalItems: Double?=null,
    
    @SerializedName("brand_logo")
    var brandLogo: String?=null,
    
    @SerializedName("shipment_id_barcode")
    var shipmentIdBarcode: String?=null,
    
    @SerializedName("signed_qrcode")
    var signedQrcode: String?=null,
    
    @SerializedName("upi_qrcode")
    var upiQrcode: String?=null,
    
    @SerializedName("digitalsignature")
    var digitalsignature: String?=null,
    
    @SerializedName("awb_number_barcode")
    var awbNumberBarcode: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DummyTemplateData
*/
@Parcelize
data class DummyTemplateData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Double?=null,
    
    @SerializedName("payload")
    var payload: PdfPayloadDetails?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MapperDetails
*/
@Parcelize
data class MapperDetails(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Double?=null,
    
    @SerializedName("payload")
    var payload: PdfPayloadDetails?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PdfDataItemsDetails
*/
@Parcelize
data class PdfDataItemsDetails(
    
    
    
    @SerializedName("data")
    var data: ArrayList<DummyTemplateData>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("pdf_type_id")
    var pdfTypeId: Int?=null,
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("template")
    var template: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
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





