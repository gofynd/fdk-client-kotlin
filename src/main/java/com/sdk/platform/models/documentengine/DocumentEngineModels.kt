package com.sdk.platform.models.documentengine

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GenerateBulkInvoiceLabelShipment
*/
@Parcelize
data class GenerateBulkInvoiceLabelShipment(
    
    
    
    @SerializedName("store_id")
    var storeId: Double?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("document_type")
    var documentType: String?=null,
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkInvoiceOrLabelUrl
*/
@Parcelize
data class GenerateBulkInvoiceOrLabelUrl(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("document_type")
    var documentType: String?=null,
    
    @SerializedName("batch_id")
    var batchId: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DocumentType
*/
@Parcelize
data class DocumentType(
    
    
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("label")
    var label: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListBadRequestResponse
*/
@Parcelize
data class BulkListBadRequestResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListFailedResponse
*/
@Parcelize
data class BulkListFailedResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponseGenerateBulkShipment
*/
@Parcelize
data class SuccessResponseGenerateBulkShipment(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("job_id")
    var jobId: Double?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponseBulkStatus
*/
@Parcelize
data class SuccessResponseBulkStatus(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkUrlSuccessResponse
*/
@Parcelize
data class GenerateBulkUrlSuccessResponse(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InternalErrorResponseGenerateBulkShipment
*/
@Parcelize
data class InternalErrorResponseGenerateBulkShipment(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BadRequestResponseGenerateBulkUrl
*/
@Parcelize
data class BadRequestResponseGenerateBulkUrl(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InternalErrorResponseGenerateBulkUrl
*/
@Parcelize
data class InternalErrorResponseGenerateBulkUrl(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkShipment
*/
@Parcelize
data class GenerateBulkShipment(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("document_type")
    var documentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkUrl
*/
@Parcelize
data class GenerateBulkUrl(
    
    
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null,
    
    @SerializedName("document_type")
    var documentType: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetBulkStatusRequest
*/
@Parcelize
data class GetBulkStatusRequest(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BadRequestResponseGenerateBulkItemParameters
*/
@Parcelize
data class BadRequestResponseGenerateBulkItemParameters(
    
    
    
    @SerializedName("missing_property")
    var missingProperty: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BadRequestResponseGenerateBulkItem
*/
@Parcelize
data class BadRequestResponseGenerateBulkItem(
    
    
    
    @SerializedName("keyword")
    var keyword: String?=null,
    
    @SerializedName("data_path")
    var dataPath: String?=null,
    
    @SerializedName("schema_path")
    var schemaPath: String?=null,
    
    @SerializedName("parameters")
    var parameters: BadRequestResponseGenerateBulkItemParameters?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponseGenerateBulk
*/
@Parcelize
data class SuccessResponseGenerateBulk(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BadRequestResponseGenerateBulk
*/
@Parcelize
data class BadRequestResponseGenerateBulk(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: ArrayList<BadRequestResponseGenerateBulkItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InternalErrorResponseGenerateBulk
*/
@Parcelize
data class InternalErrorResponseGenerateBulk(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingToAddress
*/
@Parcelize
data class ShippingToAddress(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerAddress
*/
@Parcelize
data class SellerAddress(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BoxDetails
*/
@Parcelize
data class BoxDetails(
    
    
    
    @SerializedName("box_id")
    var boxId: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: String?=null,
    
    @SerializedName("package_count")
    var packageCount: String?=null,
    
    @SerializedName("dimension")
    var dimension: String?=null,
    
    @SerializedName("weight")
    var weight: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetails
*/
@Parcelize
data class ShipmentDetails(
    
    
    
    @SerializedName("shipment_no")
    var shipmentNo: String?=null,
    
    @SerializedName("appointment_no")
    var appointmentNo: String?=null,
    
    @SerializedName("total_sku")
    var totalSku: String?=null,
    
    @SerializedName("item_qty")
    var itemQty: String?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: String?=null,
    
    @SerializedName("shipping_to")
    var shippingTo: String?=null,
    
    @SerializedName("seller_name")
    var sellerName: String?=null,
    
    @SerializedName("gstin_number")
    var gstinNumber: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingToAddress?=null,
    
    @SerializedName("seller_address")
    var sellerAddress: SellerAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkBoxLabel
*/
@Parcelize
data class GenerateBulkBoxLabel(
    
    
    
    @SerializedName("stock_transfer_id")
    var stockTransferId: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_name")
    var sellerName: String?=null,
    
    @SerializedName("template_id")
    var templateId: Double?=null,
    
    @SerializedName("box_details")
    var boxDetails: ArrayList<BoxDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkShipmentLabel
*/
@Parcelize
data class GenerateBulkShipmentLabel(
    
    
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("template_id")
    var templateId: Double?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateNoc
*/
@Parcelize
data class GenerateNoc(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_name")
    var sellerName: String?=null,
    
    @SerializedName("seller_gstin")
    var sellerGstin: String?=null,
    
    @SerializedName("fc_gstin")
    var fcGstin: String?=null,
    
    @SerializedName("template_id")
    var templateId: Double?=null,
    
    @SerializedName("fc_address")
    var fcAddress: SellerAddress?=null,
    
    @SerializedName("seller_address")
    var sellerAddress: SellerAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageDetails
*/
@Parcelize
data class PackageDetails(
    
    
    
    @SerializedName("package_id")
    var packageId: String?=null,
    
    @SerializedName("item_quantity")
    var itemQuantity: String?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("dimension")
    var dimension: String?=null,
    
    @SerializedName("weight")
    var weight: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageItemDetails
*/
@Parcelize
data class PackageItemDetails(
    
    
    
    @SerializedName("jio_code")
    var jioCode: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("mrp")
    var mrp: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("best_before_date")
    var bestBeforeDate: String?=null,
    
    @SerializedName("ean")
    var ean: String?=null,
    
    @SerializedName("package_details")
    var packageDetails: ArrayList<PackageDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateBulkPackageLabel
*/
@Parcelize
data class GenerateBulkPackageLabel(
    
    
    
    @SerializedName("stock_transfer_id")
    var stockTransferId: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_name")
    var sellerName: String?=null,
    
    @SerializedName("template_id")
    var templateId: Double?=null,
    
    @SerializedName("item_details")
    var itemDetails: ArrayList<PackageItemDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SignedSuccessResponse
*/
@Parcelize
data class SignedSuccessResponse(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkPresignedSuccessResponse
*/
@Parcelize
data class BulkPresignedSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SignedBadRequestResponse
*/
@Parcelize
data class SignedBadRequestResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SignedFailedResponse
*/
@Parcelize
data class SignedFailedResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StatusSuccessResponse
*/
@Parcelize
data class StatusSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StatusBadRequestResponse
*/
@Parcelize
data class StatusBadRequestResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StatusFailedResponse
*/
@Parcelize
data class StatusFailedResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateManifest
*/
@Parcelize
data class GenerateManifest(
    
    
    
    @SerializedName("store_id")
    var storeId: Double?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeneratePresignedManifestUrl
*/
@Parcelize
data class GeneratePresignedManifestUrl(
    
    
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestLink
*/
@Parcelize
data class ManifestLink(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateManifestUrlSuccessResponse
*/
@Parcelize
data class GenerateManifestUrlSuccessResponse(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestListFailedResponse
*/
@Parcelize
data class ManifestListFailedResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceLabelPresignedRequestBody
*/
@Parcelize
data class InvoiceLabelPresignedRequestBody(
    
    
    
    @SerializedName("document_type")
    var documentType: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



