package com.sdk.platform.serviceability

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PlatformShipmentsRequestSchema
*/
@Parcelize
data class PlatformShipmentsRequestSchema(
    
    
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("location_articles")
    var locationArticles: ArrayList<PlatformLocationArticles>?=null,
    
    @SerializedName("to_serviceability")
    var toServiceability: PlatformShipmentsToServiceability?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentsResponseSchema
*/
@Parcelize
data class PlatformShipmentsResponseSchema(
    
    
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipmentsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsErrorResult
*/
@Parcelize
data class ShipmentsErrorResult(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOption
*/
@Parcelize
data class FulfillmentOption(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: ArrayList<BusinessUnit>?=null,
    
    @SerializedName("fulfillment_stores")
    var fulfillmentStores: FulfillmentStores?=null,
    
    @SerializedName("products")
    var products: FulfillmentProducts?=null,
    
    @SerializedName("cp_schemes")
    var cpSchemes: CourierPartnerSchemes?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionsList
*/
@Parcelize
data class FulfillmentOptionsList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FulfillmentOptionItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionProducts
*/
@Parcelize
data class FulfillmentOptionProducts(
    
    
    
    @SerializedName("items")
    var items: FulfillmentOptionProduct?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionStores
*/
@Parcelize
data class FulfillmentOptionStores(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FulfillmentOptionStore>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionBulkValidate
*/
@Parcelize
data class FulfillmentOptionBulkValidate(
    
    
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("fulfillment_option_slug")
    var fulfillmentOptionSlug: String?=null,
    
    @SerializedName("request")
    var request: FulfillmentOptionValidate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionBulkValidateData
*/
@Parcelize
data class FulfillmentOptionBulkValidateData(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionBulk
*/
@Parcelize
data class FulfillmentOptionBulk(
    
    
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionBulkData
*/
@Parcelize
data class FulfillmentOptionBulkData(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("request")
    var request: FulfillmentOptionValidate?=null,
    
    @SerializedName("fulfillment_option_slug")
    var fulfillmentOptionSlug: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OperationResponseSchema
*/
@Parcelize
data class OperationResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SelfshipSchema
*/
@Parcelize
data class SelfshipSchema(
    
    
    
    @SerializedName("tat")
    var tat: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResult
*/
@Parcelize
data class ServiceabilityErrorResult(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateZoneData
*/
@Parcelize
data class UpdateZoneData(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneUpdateSuccessResult
*/
@Parcelize
data class ZoneUpdateSuccessResult(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityDeleteErrorResult
*/
@Parcelize
data class ServiceabilityDeleteErrorResult(
    
    
    
    @SerializedName("error")
    var error: ArrayList<ServiceabilityErrorResult>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ZoneDeleteSuccessResult
*/
@Parcelize
data class ZoneDeleteSuccessResult(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListViewSchema
*/
@Parcelize
data class ListViewSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneByIdSchema
*/
@Parcelize
data class GetZoneByIdSchema(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("overlapping_file_url")
    var overlappingFileUrl: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("overlapping_zone_names")
    var overlappingZoneNames: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommonErrorResult
*/
@Parcelize
data class CommonErrorResult(
    
    
    
    @SerializedName("error")
    var error: ArrayList<Error>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateZoneDataSchema
*/
@Parcelize
data class CreateZoneDataSchema(
    
    
    
    @SerializedName("fulfillment_option_slug")
    var fulfillmentOptionSlug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("stores")
    var stores: ZoneStores?=null,
    
    @SerializedName("product")
    var product: ZoneProduct?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneBulkExport
*/
@Parcelize
data class ZoneBulkExport(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetZoneBulkExport
*/
@Parcelize
data class GetZoneBulkExport(
    
    
    
    @SerializedName("items")
    var items: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateBulkZoneData
*/
@Parcelize
data class CreateBulkZoneData(
    
    
    
    @SerializedName("file_url")
    var fileUrl: @RawValue Any?=null,
    
    @SerializedName("product_type")
    var productType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneSchema
*/
@Parcelize
data class ZoneSchema(
    
    
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("fulfillment_option_slug")
    var fulfillmentOptionSlug: String?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("company_id")
    var companyId: @RawValue Any?=null,
    
    @SerializedName("application_id")
    var applicationId: @RawValue Any?=null,
    
    @SerializedName("is_active")
    var isActive: @RawValue Any?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: @RawValue Any?=null,
    
    @SerializedName("stores")
    var stores: @RawValue Any?=null,
    
    @SerializedName("product")
    var product: @RawValue Any?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: @RawValue Any?=null,
    
    @SerializedName("zone_id")
    var zoneId: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateBulkZoneResult
*/
@Parcelize
data class CreateBulkZoneResult(
    
    
    
    @SerializedName("zone_id")
    var zoneId: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkCreateZoneExport
*/
@Parcelize
data class BulkCreateZoneExport(
    
    
    
    @SerializedName("placeholder")
    var placeholder: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PincodeMopData
*/
@Parcelize
data class PincodeMopData(
    
    
    
    @SerializedName("pincodes")
    var pincodes: ArrayList<Int>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMOPResult
*/
@Parcelize
data class PincodeMOPResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("pincodes")
    var pincodes: ArrayList<Int>?=null,
    
    @SerializedName("updated_pincodes")
    var updatedPincodes: ArrayList<PincodeMopUpdateResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditError
*/
@Parcelize
data class PincodeMopUpdateAuditError(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopBulkError
*/
@Parcelize
data class PincodeMopBulkError(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: ArrayList<Error>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommonError
*/
@Parcelize
data class CommonError(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: ArrayList<Error>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopBulkData
*/
@Parcelize
data class PincodeMopBulkData(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeBulkViewResult
*/
@Parcelize
data class PincodeBulkViewResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingDetails
*/
@Parcelize
data class PincodeCodStatusListingDetails(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingResult
*/
@Parcelize
data class PincodeCodStatusListingResult(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeCodStatusItem>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<Error>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("summary")
    var summary: PincodeCodStatusListingSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryDetails
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryDetails(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryResultData
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResultData(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("page")
    var page: PincodeMopUpdateAuditHistoryPaging?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeMopUpdateAuditHistoryResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkGeoAreaDetails
*/
@Parcelize
data class BulkGeoAreaDetails(
    
    
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkGeoAreaResult
*/
@Parcelize
data class BulkGeoAreaResult(
    
    
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkGeoAreaGetResult
*/
@Parcelize
data class BulkGeoAreaGetResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaBulkCreationResult
*/
@Parcelize
data class GeoAreaBulkCreationResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GeoAreaBulkExportResult
*/
@Parcelize
data class GeoAreaBulkExportResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaRequestBody
*/
@Parcelize
data class GeoAreaRequestBody(
    
    
    
    @SerializedName("is_polygon")
    var isPolygon: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("areas")
    var areas: ArrayList<Area>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaErrorResult
*/
@Parcelize
data class GeoAreaErrorResult(
    
    
    
    @SerializedName("error")
    var error: ArrayList<GeoAreaResponseDetail>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GeoAreaResponseBody
*/
@Parcelize
data class GeoAreaResponseBody(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("areas")
    var areas: ArrayList<Area>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("is_polygon")
    var isPolygon: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaPutResponseBody
*/
@Parcelize
data class GeoAreaPutResponseBody(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null,
    
    @SerializedName("is_polygon")
    var isPolygon: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("areas")
    var areas: ArrayList<Area>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("upload_type")
    var uploadType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaGetResponseBody
*/
@Parcelize
data class GeoAreaGetResponseBody(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GeoAreaItemResult>?=null,
    
    @SerializedName("page")
    var page: Page2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaDetails
*/
@Parcelize
data class GeoAreaDetails(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_polygon")
    var isPolygon: Boolean?=null,
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("areas")
    var areas: ArrayList<AreaExpanded>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountDetailsBody
*/
@Parcelize
data class CourierAccountDetailsBody(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResult
*/
@Parcelize
data class CourierPartnerRuleResult(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleConditions?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerRuleCPListResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRule
*/
@Parcelize
data class CourierPartnerRule(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleConditions?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkFailureResult
*/
@Parcelize
data class BulkFailureResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<Error>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FailureResult
*/
@Parcelize
data class FailureResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<Error>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRulesListResult
*/
@Parcelize
data class CourierPartnerRulesListResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerRuleResult>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartnerDetails
*/
@Parcelize
data class ShipmentCourierPartnerDetails(
    
    
    
    @SerializedName("from_location")
    var fromLocation: ShipmentsCourierPartnersServiceability?=null,
    
    @SerializedName("to_location")
    var toLocation: ShipmentsCourierPartnersServiceability?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<CPShipments>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartnerResult
*/
@Parcelize
data class ShipmentCourierPartnerResult(
    
    
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<CourierPartners>?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentCourierPartners>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_rate_card_enabled")
    var isRateCardEnabled: Boolean?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("logistics_as_actual")
    var logisticsAsActual: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPatch
*/
@Parcelize
data class ApplicationConfigPatch(
    
    
    
    @SerializedName("courier_partner_config")
    var courierPartnerConfig: CourierPartnerConfig?=null,
    
    @SerializedName("buybox_rule_config")
    var buyboxRuleConfig: BuyboxRuleConfig?=null,
    
    @SerializedName("promise_config")
    var promiseConfig: PromiseConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPatchResult
*/
@Parcelize
data class ApplicationConfigPatchResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkRegionJobDetails
*/
@Parcelize
data class BulkRegionJobDetails(
    
    
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("region")
    var region: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionResultItemData
*/
@Parcelize
data class BulkRegionResultItemData(
    
    
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("error_file_path")
    var errorFilePath: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionResult
*/
@Parcelize
data class BulkRegionResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkRegionResultItemData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleConfigData
*/
@Parcelize
data class StoreRuleConfigData(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleDataSchema
*/
@Parcelize
data class StoreRuleDataSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoreRulesApiResult
*/
@Parcelize
data class GetStoreRulesApiResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreRuleDataSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateStoreRuleDetailsSchema
*/
@Parcelize
data class CreateStoreRuleDetailsSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleResultSchema
*/
@Parcelize
data class StoreRuleResultSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleUpdateResultSchema
*/
@Parcelize
data class StoreRuleUpdateResultSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountResult
*/
@Parcelize
data class CourierAccountResult(
    
    
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierPartnerSchemeModel?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyCourierPartnerAccountListResult
*/
@Parcelize
data class CompanyCourierPartnerAccountListResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierAccountResult>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterial
*/
@Parcelize
data class PackageMaterial(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageMaterialRule>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<Channel>?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialNotFound
*/
@Parcelize
data class PackageMaterialNotFound(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialsErrorResult
*/
@Parcelize
data class PackageMaterialsErrorResult(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialResult
*/
@Parcelize
data class PackageMaterialResult(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageMaterialRule>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<Channel>?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRule
*/
@Parcelize
data class PackageRule(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("category_id")
    var categoryId: PackageRuleCategory?=null,
    
    @SerializedName("product_id")
    var productId: PackageRuleProduct?=null,
    
    @SerializedName("product_tag")
    var productTag: PackageRuleProductTag?=null,
    
    @SerializedName("department_id")
    var departmentId: PackageRuleDepartmentId?=null,
    
    @SerializedName("product_attributes")
    var productAttributes: PackageRuleProductAttributes?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleResult
*/
@Parcelize
data class PackageRuleResult(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product_tag")
    var productTag: PackageRuleProductTag?=null,
    
    @SerializedName("product_id")
    var productId: PackageRuleProduct?=null,
    
    @SerializedName("department_id")
    var departmentId: PackageRuleDepartmentId?=null,
    
    @SerializedName("product_attributes")
    var productAttributes: PackageRuleProductAttributes?=null,
    
    @SerializedName("category_id")
    var categoryId: PackageRuleCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackagesListResult
*/
@Parcelize
data class PackagesListResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PackageItem>?=null,
    
    @SerializedName("page")
    var page: PackagePageInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageItem
*/
@Parcelize
data class PackageItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<PackageChannel>?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageRuleSchema>?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityDetails
*/
@Parcelize
data class RulePriorityDetails(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityResult
*/
@Parcelize
data class RulePriorityResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsResult
*/
@Parcelize
data class OptimalLocationsResult(
    
    
    
    @SerializedName("assigned_stores")
    var assignedStores: ArrayList<OptimalLocationAssignedStoresResult>?=null,
    
    @SerializedName("faulty_articles")
    var faultyArticles: ArrayList<Error>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimlLocationsRequestSchema
*/
@Parcelize
data class OptimlLocationsRequestSchema(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("to_serviceability")
    var toServiceability: LocationDetailsServiceability?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationsArticles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationError
*/
@Parcelize
data class ValidationError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("field")
    var field: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StandardError
*/
@Parcelize
data class StandardError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeDetailsModel
*/
@Parcelize
data class CourierPartnerSchemeDetailsModel(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("default_forward_pickup_cutoff")
    var defaultForwardPickupCutoff: String?=null,
    
    @SerializedName("default_reverse_pickup_cutoff")
    var defaultReversePickupCutoff: String?=null,
    
    @SerializedName("default_cutoff_timezone")
    var defaultCutoffTimezone: String?=null,
    
    @SerializedName("default_tat")
    var defaultTat: CourierPartnerSchemeDefaultTat?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("delivery_type")
    var deliveryType: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("status_updates")
    var statusUpdates: String?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("qc_shipment_item_quantity")
    var qcShipmentItemQuantity: Int?=null,
    
    @SerializedName("non_qc_shipment_item_quantity")
    var nonQcShipmentItemQuantity: Int?=null,
    
    @SerializedName("feature")
    var feature: CourierPartnerSchemeFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeModelSchema
*/
@Parcelize
data class CourierPartnerSchemeModelSchema(
    
    
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("delivery_type")
    var deliveryType: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("status_updates")
    var statusUpdates: String?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("qc_shipment_item_quantity")
    var qcShipmentItemQuantity: Int?=null,
    
    @SerializedName("non_qc_shipment_item_quantity")
    var nonQcShipmentItemQuantity: Int?=null,
    
    @SerializedName("feature")
    var feature: CourierPartnerSchemeFeatures?=null,
    
    @SerializedName("default_forward_pickup_cutoff")
    var defaultForwardPickupCutoff: String?=null,
    
    @SerializedName("default_reverse_pickup_cutoff")
    var defaultReversePickupCutoff: String?=null,
    
    @SerializedName("default_cutoff_timezone")
    var defaultCutoffTimezone: String?=null,
    
    @SerializedName("default_tat")
    var defaultTat: CourierPartnerSchemeDefaultTat?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeUpdateDetailsSchema
*/
@Parcelize
data class CourierPartnerSchemeUpdateDetailsSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("delivery_type")
    var deliveryType: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("status_updates")
    var statusUpdates: String?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("qc_shipment_item_quantity")
    var qcShipmentItemQuantity: Int?=null,
    
    @SerializedName("non_qc_shipment_item_quantity")
    var nonQcShipmentItemQuantity: Int?=null,
    
    @SerializedName("feature")
    var feature: CourierPartnerSchemeFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeList
*/
@Parcelize
data class CourierPartnerSchemeList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerSchemeModelSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionServiceabilityTatDetails
*/
@Parcelize
data class BulkRegionServiceabilityTatDetails(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionServiceabilityTatResultItemData
*/
@Parcelize
data class BulkRegionServiceabilityTatResultItemData(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionServiceabilityTatResult
*/
@Parcelize
data class BulkRegionServiceabilityTatResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkRegionServiceabilityTatResultItemData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountries
*/
@Parcelize
data class GetCountries(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetCountriesItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocalities
*/
@Parcelize
data class GetLocalities(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Localities>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountry
*/
@Parcelize
data class GetCountry(
    
    
    
    @SerializedName("meta")
    var meta: CountryMetaFields?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("timezones")
    var timezones: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<CountryHierarchy>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("fields")
    var fields: GetCountryFields?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkImportLocalitiesDetails
*/
@Parcelize
data class BulkImportLocalitiesDetails(
    
    
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkImportLocalitiesResult
*/
@Parcelize
data class BulkImportLocalitiesResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkErrorResult
*/
@Parcelize
data class BulkErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("total_error_count")
    var totalErrorCount: Int?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocalitiesBulkExport
*/
@Parcelize
data class LocalitiesBulkExport(
    
    
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("offset")
    var offset: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocalitiesBulkExportFetch
*/
@Parcelize
data class LocalitiesBulkExportFetch(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("download_percentage")
    var downloadPercentage: Int?=null,
    
    @SerializedName("url_path")
    var urlPath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocalitiesErrorResult
*/
@Parcelize
data class LocalitiesErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocality
*/
@Parcelize
data class GetLocality(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("parents")
    var parents: LocalityParents?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateAddress
*/
@Parcelize
data class ValidateAddress(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address_meta")
    var addressMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResult
*/
@Parcelize
data class ErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: Error?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPut
*/
@Parcelize
data class ApplicationConfigPut(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPutDetail
*/
@Parcelize
data class ApplicationConfigPutDetail(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigGetResult
*/
@Parcelize
data class ApplicationConfigGetResult(
    
    
    
    @SerializedName("zones")
    var zones: ZoneConfig?=null,
    
    @SerializedName("courier_partner_config")
    var courierPartnerConfig: CourierPartnerConfig?=null,
    
    @SerializedName("buybox_rule_config")
    var buyboxRuleConfig: BuyboxRuleConfig?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: ArrayList<PromiseType>?=null,
    
    @SerializedName("promise_config")
    var promiseConfig: PromiseConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InstallCourierPartnerResponseSchema
*/
@Parcelize
data class InstallCourierPartnerResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<InstallCourierPartnerItemsSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocalitiesBulkHistory
*/
@Parcelize
data class GetLocalitiesBulkHistory(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<HistoryObject>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyConfigurationSchema
*/
@Parcelize
data class CompanyConfigurationSchema(
    
    
    
    @SerializedName("is_rate_card_enabled")
    var isRateCardEnabled: Boolean?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformLocationArticles
*/
@Parcelize
data class PlatformLocationArticles(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<PlatformLocationArticle>?=null,
    
    @SerializedName("fulfillment_location_id")
    var fulfillmentLocationId: Int?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformLocationArticle
*/
@Parcelize
data class PlatformLocationArticle(
    
    
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ParentItemIdentifiers?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ParentItemIdentifiers
*/
@Parcelize
data class ParentItemIdentifiers(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("parent_item_id")
    var parentItemId: String?=null,
    
    @SerializedName("parent_item_size")
    var parentItemSize: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentsToServiceability
*/
@Parcelize
data class PlatformShipmentsToServiceability(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentsSchema
*/
@Parcelize
data class PlatformShipmentsSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("packaging")
    var packaging: Packaging?=null,
    
    @SerializedName("fulfillment_option")
    var fulfillmentOption: FulfillmentOptionItem?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("is_auto_assign")
    var isAutoAssign: Boolean?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: Double?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("promise")
    var promise: ShipmentsPromise?=null,
    
    @SerializedName("is_ewaybill_enabled")
    var isEwaybillEnabled: Boolean?=null,
    
    @SerializedName("is_mto")
    var isMto: Boolean?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentsArticle>?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("mps")
    var mps: Boolean?=null,
    
    @SerializedName("fulfillment_location_id")
    var fulfillmentLocationId: Int?=null,
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<ShipmentsCourierPartner>?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Packaging
*/
@Parcelize
data class Packaging(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("dimension")
    var dimension: Dimension?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionItem
*/
@Parcelize
data class FulfillmentOptionItem(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsPromise
*/
@Parcelize
data class ShipmentsPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("customer_promise")
    var customerPromise: CustomerPromise?=null,
    
    @SerializedName("meta")
    var meta: ShipmentPromiseMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerPromise
*/
@Parcelize
data class CustomerPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPromiseMeta
*/
@Parcelize
data class ShipmentPromiseMeta(
    
    
    
    @SerializedName("seller_promise")
    var sellerPromise: SellerPromise?=null,
    
    @SerializedName("courier_partner_promise")
    var courierPartnerPromise: CourierPartnerPromise?=null,
    
    @SerializedName("customer_initial_promise")
    var customerInitialPromise: CustomerInitialPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerPromise
*/
@Parcelize
data class SellerPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerPromise
*/
@Parcelize
data class CourierPartnerPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("attributes")
    var attributes: CourierPartnerAttributes?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerAttributes
*/
@Parcelize
data class CourierPartnerAttributes(
    
    
    
    @SerializedName("tat")
    var tat: CourierPartnerTAT?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerTAT
*/
@Parcelize
data class CourierPartnerTAT(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerInitialPromise
*/
@Parcelize
data class CustomerInitialPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsArticle
*/
@Parcelize
data class ShipmentsArticle(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: ShipmentDimension?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_reason")
    var returnReason: String?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("meta")
    var meta: ShipmentsMeta?=null,
    
    @SerializedName("is_mto")
    var isMto: Boolean?=null,
    
    @SerializedName("sla")
    var sla: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDimension
*/
@Parcelize
data class ShipmentDimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsMeta
*/
@Parcelize
data class ShipmentsMeta(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set_article")
    var isSetArticle: Boolean?=null,
    
    @SerializedName("set_quantity")
    var setQuantity: Int?=null,
    
    @SerializedName("split_article_id")
    var splitArticleId: String?=null,
    
    @SerializedName("promo_ids")
    var promoIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsCourierPartner
*/
@Parcelize
data class ShipmentsCourierPartner(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("area_code")
    var areaCode: AreaCode?=null,
    
    @SerializedName("tat")
    var tat: TAT?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_qc_enabled")
    var isQcEnabled: Boolean?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("forward_pickup_cutoff")
    var forwardPickupCutoff: String?=null,
    
    @SerializedName("reverse_pickup_cutoff")
    var reversePickupCutoff: String?=null,
    
    @SerializedName("qc_shipment_item_quantity")
    var qcShipmentItemQuantity: Int?=null,
    
    @SerializedName("non_qc_shipment_item_quantity")
    var nonQcShipmentItemQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AreaCode
*/
@Parcelize
data class AreaCode(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("destination")
    var destination: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TAT
*/
@Parcelize
data class TAT(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessUnit
*/
@Parcelize
data class BusinessUnit(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentStores
*/
@Parcelize
data class FulfillmentStores(
    
    
    
    @SerializedName("values")
    var values: ArrayList<Int>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentProducts
*/
@Parcelize
data class FulfillmentProducts(
    
    
    
    @SerializedName("values")
    var values: ArrayList<Int>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemes
*/
@Parcelize
data class CourierPartnerSchemes(
    
    
    
    @SerializedName("values")
    var values: ArrayList<CourierPartnerScheme>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerScheme
*/
@Parcelize
data class CourierPartnerScheme(
    
    
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("cp_ext_id")
    var cpExtId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionProduct
*/
@Parcelize
data class FulfillmentOptionProduct(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("company_ids")
    var companyIds: ArrayList<Int>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: String?=null,
    
    @SerializedName("trader")
    var trader: Trader?=null,
    
    @SerializedName("trader_type")
    var traderType: String?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TaxIdentifier
*/
@Parcelize
data class TaxIdentifier(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("size_priority")
    var sizePriority: Int?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<Identifier>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
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
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionStore
*/
@Parcelize
data class FulfillmentOptionStore(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("address")
    var address: Address?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("avg_order_processing_time")
    var avgOrderProcessingTime: Int?=null,
    
    @SerializedName("timezone")
    var timezone: String?=null,
    
    @SerializedName("holiday_list")
    var holidayList: ArrayList<ArrayList<String>>?=null,
    
    @SerializedName("customfields")
    var customfields: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_open")
    var isOpen: Boolean?=null,
    
    @SerializedName("promise_customfields")
    var promiseCustomfields: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("distance")
    var distance: StoreDistance?=null,
    
    @SerializedName("timing")
    var timing: StoreTimingDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("postal_code")
    var postalCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDistance
*/
@Parcelize
data class StoreDistance(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTimingDetails
*/
@Parcelize
data class StoreTimingDetails(
    
    
    
    @SerializedName("operational_timing")
    var operationalTiming: ArrayList<StoreTiming>?=null,
    
    @SerializedName("order_acceptance_timing")
    var orderAcceptanceTiming: ArrayList<StoreTiming>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTiming
*/
@Parcelize
data class StoreTiming(
    
    
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: Time?=null,
    
    @SerializedName("closing")
    var closing: Time?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Time
*/
@Parcelize
data class Time(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionValidate
*/
@Parcelize
data class FulfillmentOptionValidate(
    
    
    
    @SerializedName("entity_filter_type")
    var entityFilterType: String?=null,
    
    @SerializedName("fulfillment_option_type")
    var fulfillmentOptionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSchema
*/
@Parcelize
data class ProductSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoresSchema
*/
@Parcelize
data class StoresSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ModifiedBy
*/
@Parcelize
data class ModifiedBy(
    
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<GeoArea>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("stores")
    var stores: ListViewProduct?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product")
    var product: ListViewProduct?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("summary")
    var summary: Summary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoArea
*/
@Parcelize
data class GeoArea(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewProduct
*/
@Parcelize
data class ListViewProduct(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Summary
*/
@Parcelize
data class Summary(
    
    
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("products_count")
    var productsCount: Int?=null,
    
    @SerializedName("regions")
    var regions: ArrayList<RegionSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RegionSchema
*/
@Parcelize
data class RegionSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneStores
*/
@Parcelize
data class ZoneStores(
    
    
    
    @SerializedName("type")
    var type: @RawValue Any?=null,
    
    @SerializedName("values")
    var values: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneProduct
*/
@Parcelize
data class ZoneProduct(
    
    
    
    @SerializedName("type")
    var type: @RawValue Any?=null,
    
    @SerializedName("values")
    var values: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneBulkItem
*/
@Parcelize
data class ZoneBulkItem(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("total")
    var total: @RawValue Any?=null,
    
    @SerializedName("failed")
    var failed: @RawValue Any?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("action")
    var action: @RawValue Any?=null,
    
    @SerializedName("updated_at")
    var updatedAt: @RawValue Any?=null,
    
    @SerializedName("updated_by")
    var updatedBy: @RawValue Any?=null,
    
    @SerializedName("type")
    var type: @RawValue Any?=null,
    
    @SerializedName("stage")
    var stage: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateResult
*/
@Parcelize
data class PincodeMopUpdateResult(
    
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusItem
*/
@Parcelize
data class PincodeCodStatusItem(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingSummary
*/
@Parcelize
data class PincodeCodStatusListingSummary(
    
    
    
    @SerializedName("total_active_pincodes")
    var totalActivePincodes: Int?=null,
    
    @SerializedName("total_inactive_pincodes")
    var totalInactivePincodes: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryPaging
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryPaging(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryResult
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("error_file_s3_url")
    var errorFileS3Url: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Area
*/
@Parcelize
data class Area(
    
    
    
    @SerializedName("regions")
    var regions: ArrayList<String>?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaResponseDetail
*/
@Parcelize
data class GeoAreaResponseDetail(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaItemResult
*/
@Parcelize
data class GeoAreaItemResult(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("areas")
    var areas: ArrayList<AreaExpanded>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedBy?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AreaExpanded
*/
@Parcelize
data class AreaExpanded(
    
    
    
    @SerializedName("country")
    var country: Country?=null,
    
    @SerializedName("regions")
    var regions: ArrayList<Region>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Country
*/
@Parcelize
data class Country(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Region
*/
@Parcelize
data class Region(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Page2
*/
@Parcelize
data class Page2(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleConditions
*/
@Parcelize
data class CourierPartnerRuleConditions(
    
    
    
    @SerializedName("forward")
    var forward: LocationRule?=null,
    
    @SerializedName("reverse")
    var reverse: LocationRule?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: StringComparisonOperations?=null,
    
    @SerializedName("category_ids")
    var categoryIds: IntComparisonOperations?=null,
    
    @SerializedName("product_ids")
    var productIds: IntComparisonOperations?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: StringComparisonOperations?=null,
    
    @SerializedName("department_ids")
    var departmentIds: IntComparisonOperations?=null,
    
    @SerializedName("brand_ids")
    var brandIds: IntComparisonOperations?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: DateOperations?=null,
    
    @SerializedName("store_ids")
    var storeIds: IntComparisonOperations?=null,
    
    @SerializedName("store_type")
    var storeType: StringComparisonOperations?=null,
    
    @SerializedName("store_tags")
    var storeTags: StringComparisonOperations?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: ArithmeticOperations?=null,
    
    @SerializedName("shipment_cost")
    var shipmentCost: ArithmeticOperations?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: ArithmeticOperations?=null,
    
    @SerializedName("store_customer_location")
    var storeCustomerLocation: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationRule
*/
@Parcelize
data class LocationRule(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("includes")
    var includes: ArrayList<LocationRuleValues>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationRuleValues
*/
@Parcelize
data class LocationRuleValues(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StringComparisonOperations
*/
@Parcelize
data class StringComparisonOperations(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: IntComparisonOperations
*/
@Parcelize
data class IntComparisonOperations(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DateOperations
*/
@Parcelize
data class DateOperations(
    
    
    
    @SerializedName("lte")
    var lte: String?=null,
    
    @SerializedName("gte")
    var gte: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArithmeticOperations
*/
@Parcelize
data class ArithmeticOperations(
    
    
    
    @SerializedName("lt")
    var lt: Int?=null,
    
    @SerializedName("gt")
    var gt: Int?=null,
    
    @SerializedName("lte")
    var lte: Int?=null,
    
    @SerializedName("gte")
    var gte: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleCPListResult
*/
@Parcelize
data class CourierPartnerRuleCPListResult(
    
    
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierPartnerSchemeDetailsModel?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeDefaultTat
*/
@Parcelize
data class CourierPartnerSchemeDefaultTat(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("tat")
    var tat: CourierPartnerSchemeTat?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeTat
*/
@Parcelize
data class CourierPartnerSchemeTat(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeFeatures
*/
@Parcelize
data class CourierPartnerSchemeFeatures(
    
    
    
    @SerializedName("doorstep_qc")
    var doorstepQc: Boolean?=null,
    
    @SerializedName("qr")
    var qr: Boolean?=null,
    
    @SerializedName("mps")
    var mps: Boolean?=null,
    
    @SerializedName("b2b")
    var b2B: Boolean?=null,
    
    @SerializedName("ndr")
    var ndr: Boolean?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("dangerous_goods")
    var dangerousGoods: Boolean?=null,
    
    @SerializedName("fragile_goods")
    var fragileGoods: Boolean?=null,
    
    @SerializedName("restricted_goods")
    var restrictedGoods: Boolean?=null,
    
    @SerializedName("cold_storage_goods")
    var coldStorageGoods: Boolean?=null,
    
    @SerializedName("doorstep_exchange")
    var doorstepExchange: Boolean?=null,
    
    @SerializedName("doorstep_return")
    var doorstepReturn: Boolean?=null,
    
    @SerializedName("product_installation")
    var productInstallation: Boolean?=null,
    
    @SerializedName("openbox_delivery")
    var openboxDelivery: Boolean?=null,
    
    @SerializedName("status_updates")
    var statusUpdates: String?=null,
    
    @SerializedName("multi_pick_single_drop")
    var multiPickSingleDrop: Boolean?=null,
    
    @SerializedName("single_pick_multi_drop")
    var singlePickMultiDrop: Boolean?=null,
    
    @SerializedName("multi_pick_multi_drop")
    var multiPickMultiDrop: Boolean?=null,
    
    @SerializedName("ewaybill")
    var ewaybill: Boolean?=null,
    
    @SerializedName("qc_shipment_item_quantity")
    var qcShipmentItemQuantity: Int?=null,
    
    @SerializedName("non_qc_shipment_item_quantity")
    var nonQcShipmentItemQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerList
*/
@Parcelize
data class CourierPartnerList(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsCourierPartnersServiceability
*/
@Parcelize
data class ShipmentsCourierPartnersServiceability(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector_code")
    var sectorCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("city_code")
    var cityCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CPShipments
*/
@Parcelize
data class CPShipments(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("location_id")
    var locationId: Double?=null,
    
    @SerializedName("location_tags")
    var locationTags: ArrayList<String>?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("shipment_cost")
    var shipmentCost: Double?=null,
    
    @SerializedName("shipment_dimension")
    var shipmentDimension: ShipmentDimension?=null,
    
    @SerializedName("courier_partner_schemes")
    var courierPartnerSchemes: ArrayList<String>?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentsArticles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsArticles
*/
@Parcelize
data class ShipmentsArticles(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("sla")
    var sla: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("weight")
    var weight: ArticleWeight?=null,
    
    @SerializedName("attributes")
    var attributes: ArticleAttributes?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: ArticleDimension?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("mto_quantity")
    var mtoQuantity: Int?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("set")
    var set: ArticleSet?=null,
    
    @SerializedName("set_quantity")
    var setQuantity: Int?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArticleDeliverySlots?=null,
    
    @SerializedName("return_reason")
    var returnReason: ArticleReturnReason?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleWeight
*/
@Parcelize
data class ArticleWeight(
    
    
    
    @SerializedName("shipping")
    var shipping: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAttributes
*/
@Parcelize
data class ArticleAttributes(
    
    
    
    @SerializedName("battery_operated")
    var batteryOperated: String?=null,
    
    @SerializedName("is_flammable")
    var isFlammable: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDimension
*/
@Parcelize
data class ArticleDimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleSet
*/
@Parcelize
data class ArticleSet(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: ArticleSizeDistribution?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleSizeDistribution
*/
@Parcelize
data class ArticleSizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDeliverySlots
*/
@Parcelize
data class ArticleDeliverySlots(
    
    
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("min_slot")
    var minSlot: String?=null,
    
    @SerializedName("max_slot")
    var maxSlot: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleReturnReason
*/
@Parcelize
data class ArticleReturnReason(
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartners
*/
@Parcelize
data class CourierPartners(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartners
*/
@Parcelize
data class ShipmentCourierPartners(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<CourierPartners>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerConfig
*/
@Parcelize
data class CourierPartnerConfig(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuyboxRuleConfig
*/
@Parcelize
data class BuyboxRuleConfig(
    
    
    
    @SerializedName("store_type_priority")
    var storeTypePriority: ArrayList<String>?=null,
    
    @SerializedName("store_tag_priority")
    var storeTagPriority: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseConfig
*/
@Parcelize
data class PromiseConfig(
    
    
    
    @SerializedName("store_attributes")
    var storeAttributes: StorePromiseAttributeConfig?=null,
    
    @SerializedName("delivery_service_attributes")
    var deliveryServiceAttributes: DeliveryServiceAttributeConfig?=null,
    
    @SerializedName("buffer_field")
    var bufferField: BufferField?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StorePromiseAttributeConfig
*/
@Parcelize
data class StorePromiseAttributeConfig(
    
    
    
    @SerializedName("is_operational_timing_enabled")
    var isOperationalTimingEnabled: Boolean?=null,
    
    @SerializedName("is_order_acceptance_timing_enabled")
    var isOrderAcceptanceTimingEnabled: Boolean?=null,
    
    @SerializedName("is_average_processing_time")
    var isAverageProcessingTime: Boolean?=null,
    
    @SerializedName("is_holiday_enabled")
    var isHolidayEnabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryServiceAttributeConfig
*/
@Parcelize
data class DeliveryServiceAttributeConfig(
    
    
    
    @SerializedName("is_pickup_cutoff_time_enabled")
    var isPickupCutoffTimeEnabled: Boolean?=null,
    
    @SerializedName("is_service_tat_enabled")
    var isServiceTatEnabled: Boolean?=null,
    
    @SerializedName("is_holiday_enabled")
    var isHolidayEnabled: Boolean?=null,
    
    @SerializedName("is_all_dps_considered")
    var isAllDpsConsidered: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BufferField
*/
@Parcelize
data class BufferField(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StorePrioritySchema
*/
@Parcelize
data class StorePrioritySchema(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleConditionSchema
*/
@Parcelize
data class StoreRuleConditionSchema(
    
    
    
    @SerializedName("department_ids")
    var departmentIds: IntComparisonOperations?=null,
    
    @SerializedName("category_ids")
    var categoryIds: IntComparisonOperations?=null,
    
    @SerializedName("brand_ids")
    var brandIds: IntComparisonOperations?=null,
    
    @SerializedName("to_location")
    var toLocation: LocationRule?=null,
    
    @SerializedName("customer_radius")
    var customerRadius: CustomerRadiusSchema?=null,
    
    @SerializedName("store_type")
    var storeType: StringComparisonOperations?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("product_ids")
    var productIds: IntComparisonOperations?=null,
    
    @SerializedName("store_tags")
    var storeTags: StringComparisonOperations?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: DateOperations?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerRadiusSchema
*/
@Parcelize
data class CustomerRadiusSchema(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("lt")
    var lt: Int?=null,
    
    @SerializedName("lte")
    var lte: Int?=null,
    
    @SerializedName("gt")
    var gt: Int?=null,
    
    @SerializedName("gte")
    var gte: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeModel
*/
@Parcelize
data class CourierPartnerSchemeModel(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("delivery_type")
    var deliveryType: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("feature")
    var feature: CourierPartnerSchemeFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialRule
*/
@Parcelize
data class PackageMaterialRule(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: PackageMaterialRuleQuantity?=null,
    
    @SerializedName("weight")
    var weight: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialRuleQuantity
*/
@Parcelize
data class PackageMaterialRuleQuantity(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Channel
*/
@Parcelize
data class Channel(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleCategory
*/
@Parcelize
data class PackageRuleCategory(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleProduct
*/
@Parcelize
data class PackageRuleProduct(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleProductTag
*/
@Parcelize
data class PackageRuleProductTag(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleDepartmentId
*/
@Parcelize
data class PackageRuleDepartmentId(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleProductAttributes
*/
@Parcelize
data class PackageRuleProductAttributes(
    
    
    
    @SerializedName("includes")
    var includes: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageChannel
*/
@Parcelize
data class PackageChannel(
    
    
    
    @SerializedName("store_filter")
    var storeFilter: StoreFilter?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreFilter
*/
@Parcelize
data class StoreFilter(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("ids")
    var ids: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleSchema
*/
@Parcelize
data class PackageRuleSchema(
    
    
    
    @SerializedName("quantity")
    var quantity: Quantity?=null,
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("weight")
    var weight: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Quantity
*/
@Parcelize
data class Quantity(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackagePageInfo
*/
@Parcelize
data class PackagePageInfo(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationAssignedStoresResult
*/
@Parcelize
data class OptimalLocationAssignedStoresResult(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationArticlesResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationArticlesResult
*/
@Parcelize
data class OptimalLocationArticlesResult(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("is_primary_item")
    var isPrimaryItem: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("ignore_locations")
    var ignoreLocations: ArrayList<Int>?=null,
    
    @SerializedName("assign_locations")
    var assignLocations: ArrayList<Int>?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("mto_quantity")
    var mtoQuantity: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetailsServiceability
*/
@Parcelize
data class LocationDetailsServiceability(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("location")
    var location: ServiceabilityLocation?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityLocation
*/
@Parcelize
data class ServiceabilityLocation(
    
    
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsArticles
*/
@Parcelize
data class OptimalLocationsArticles(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("is_primary_item")
    var isPrimaryItem: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("ignore_locations")
    var ignoreLocations: ArrayList<Int>?=null,
    
    @SerializedName("assign_locations")
    var assignLocations: ArrayList<Int>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountriesItems
*/
@Parcelize
data class GetCountriesItems(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("timezones")
    var timezones: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<HierarchyItems>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("has_next_hierarchy")
    var hasNextHierarchy: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HierarchyItems
*/
@Parcelize
data class HierarchyItems(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyObject
*/
@Parcelize
data class CurrencyObject(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Localities
*/
@Parcelize
data class Localities(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeLatLongData
*/
@Parcelize
data class PincodeLatLongData(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocalityParent
*/
@Parcelize
data class LocalityParent(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("serviceability")
    var serviceability: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryMetaFields
*/
@Parcelize
data class CountryMetaFields(
    
    
    
    @SerializedName("application_fields")
    var applicationFields: ApplicationFields?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationFields
*/
@Parcelize
data class ApplicationFields(
    
    
    
    @SerializedName("address")
    var address: ArrayList<GetCountryFieldsAddress>?=null,
    
    @SerializedName("serviceability_fields")
    var serviceabilityFields: ArrayList<String>?=null,
    
    @SerializedName("address_template")
    var addressTemplate: GetCountryFieldsAddressTemplateApplication?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddress
*/
@Parcelize
data class GetCountryFieldsAddress(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("edit")
    var edit: Boolean?=null,
    
    @SerializedName("input")
    var input: String?=null,
    
    @SerializedName("validation")
    var validation: FieldValidation?=null,
    
    @SerializedName("values")
    var values: GetCountryFieldsAddressValues?=null,
    
    @SerializedName("error_text")
    var errorText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FieldValidation
*/
@Parcelize
data class FieldValidation(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("regex")
    var regex: FieldValidationRegex?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FieldValidationRegex
*/
@Parcelize
data class FieldValidationRegex(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("length")
    var length: LengthValidation?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LengthValidation
*/
@Parcelize
data class LengthValidation(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressValues
*/
@Parcelize
data class GetCountryFieldsAddressValues(
    
    
    
    @SerializedName("get_one")
    var getOne: GetOneOrAll?=null,
    
    @SerializedName("get_all")
    var getAll: GetOneOrAll?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAll
*/
@Parcelize
data class GetOneOrAll(
    
    
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("params")
    var params: GetOneOrAllParams?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllParams
*/
@Parcelize
data class GetOneOrAllParams(
    
    
    
    @SerializedName("path")
    var path: GetOneOrAllPath?=null,
    
    @SerializedName("query")
    var query: GetOneOrAllQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllPath
*/
@Parcelize
data class GetOneOrAllPath(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllQuery
*/
@Parcelize
data class GetOneOrAllQuery(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressTemplateApplication
*/
@Parcelize
data class GetCountryFieldsAddressTemplateApplication(
    
    
    
    @SerializedName("checkout_form")
    var checkoutForm: String?=null,
    
    @SerializedName("store_os_form")
    var storeOsForm: String?=null,
    
    @SerializedName("default_display")
    var defaultDisplay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryHierarchy
*/
@Parcelize
data class CountryHierarchy(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFields
*/
@Parcelize
data class GetCountryFields(
    
    
    
    @SerializedName("address")
    var address: ArrayList<GetCountryFieldsAddress>?=null,
    
    @SerializedName("serviceability_fields")
    var serviceabilityFields: ArrayList<String>?=null,
    
    @SerializedName("address_template")
    var addressTemplate: GetCountryFieldsAddressTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressTemplate
*/
@Parcelize
data class GetCountryFieldsAddressTemplate(
    
    
    
    @SerializedName("checkout_form")
    var checkoutForm: String?=null,
    
    @SerializedName("store_os_form")
    var storeOsForm: String?=null,
    
    @SerializedName("default_display")
    var defaultDisplay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocalityParents
*/
@Parcelize
data class LocalityParents(
    
    
    
    @SerializedName("city")
    var city: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country")
    var country: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneConfig
*/
@Parcelize
data class ZoneConfig(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("active_count")
    var activeCount: Int?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseType
*/
@Parcelize
data class PromiseType(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_all_dps_considered")
    var isAllDpsConsidered: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InstallCourierPartnerItemsSchema
*/
@Parcelize
data class InstallCourierPartnerItemsSchema(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("extention_type")
    var extentionType: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("is_installed")
    var isInstalled: Boolean?=null,
    
    @SerializedName("launch_type")
    var launchType: String?=null,
    
    @SerializedName("logo")
    var logo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryObject
*/
@Parcelize
data class HistoryObject(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("total_error_count")
    var totalErrorCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





