package com.sdk.platform.serviceability

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GetExportPriceZoneHistory
*/
@Parcelize
data class GetExportPriceZoneHistory(
    
    
    
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
    Model: PriceBulkGeoAreaExportRequestPayload
*/
@Parcelize
data class PriceBulkGeoAreaExportRequestPayload(
    
    
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetBulkPriceZoneHistory
*/
@Parcelize
data class GetBulkPriceZoneHistory(
    
    
    
    @SerializedName("page")
    var page: Pagination?=null,
    
    @SerializedName("items")
    var items: ArrayList<BulkPriceZoneItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
    
    
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
    Model: BulkPriceZoneItem
*/
@Parcelize
data class BulkPriceZoneItem(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceBulkGeoAreaPayload
*/
@Parcelize
data class PriceBulkGeoAreaPayload(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
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
    Model: RuleConditionIntegerDetail
*/
@Parcelize
data class RuleConditionIntegerDetail(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("stage")
    var stage: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleConditionStringDetail
*/
@Parcelize
data class RuleConditionStringDetail(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("stage")
    var stage: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleResponseIntegerDetail
*/
@Parcelize
data class RuleResponseIntegerDetail(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<RuleConditionIntegerDetail>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RuleResponseStringDetail
*/
@Parcelize
data class RuleResponseStringDetail(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<RuleConditionStringDetail>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResponseDetailConditions
*/
@Parcelize
data class CourierPartnerRuleResponseDetailConditions(
    
    
    
    @SerializedName("forward")
    var forward: LocationRule?=null,
    
    @SerializedName("reverse")
    var reverse: LocationRule?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: StringComparisonOperations?=null,
    
    @SerializedName("category_ids")
    var categoryIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("product_ids")
    var productIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: RuleResponseStringDetail?=null,
    
    @SerializedName("department_ids")
    var departmentIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("brand_ids")
    var brandIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: ArithmeticOperationsV2?=null,
    
    @SerializedName("store_ids")
    var storeIds: RuleResponseIntegerDetail?=null,
    
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
    
    @SerializedName("company_ids")
    var companyIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResponseDetailSchema
*/
@Parcelize
data class CourierPartnerRuleResponseDetailSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleResponseDetailConditions?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("shipment_adjustment_type")
    var shipmentAdjustmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreLocationDetail
*/
@Parcelize
data class StoreLocationDetail(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleLocationDetailSchema
*/
@Parcelize
data class StoreRuleLocationDetailSchema(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<StoreLocationDetail>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StoreRuleConditionDetailSchema
*/
@Parcelize
data class StoreRuleConditionDetailSchema(
    
    
    
    @SerializedName("department_ids")
    var departmentIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("category_ids")
    var categoryIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("brand_ids")
    var brandIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("to_location")
    var toLocation: StoreRuleLocationDetailSchema?=null,
    
    @SerializedName("customer_radius")
    var customerRadius: CustomerRadiusSchema?=null,
    
    @SerializedName("store_type")
    var storeType: StringComparisonOperations?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("product_ids")
    var productIds: RuleResponseIntegerDetail?=null,
    
    @SerializedName("store_tags")
    var storeTags: StringComparisonOperations?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: ArithmeticOperationsV2?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: RuleResponseStringDetail?=null,
    
    @SerializedName("company_ids")
    var companyIds: RuleResponseIntegerDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleDataDetailsSchema
*/
@Parcelize
data class StoreRuleDataDetailsSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionDetailSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationArticlesResponseSchema
*/
@Parcelize
data class OptimalLocationArticlesResponseSchema(
    
    
    
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
    Model: OptimalLocationAssignedStoresResponseSchema
*/
@Parcelize
data class OptimalLocationAssignedStoresResponseSchema(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationArticlesResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsResponseSchema
*/
@Parcelize
data class OptimalLocationsResponseSchema(
    
    
    
    @SerializedName("assigned_stores")
    var assignedStores: ArrayList<OptimalLocationAssignedStoresResponseSchema>?=null,
    
    @SerializedName("faulty_articles")
    var faultyArticles: ArrayList<ErrorResponseSchema>?=null
    
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
    Model: ErrorResponseV3
*/
@Parcelize
data class ErrorResponseV3(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorObject
*/
@Parcelize
data class ErrorObject(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateAddressRequestSchema
*/
@Parcelize
data class ValidateAddressRequestSchema(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
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
    Model: CountryObject
*/
@Parcelize
data class CountryObject(
    
    
    
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
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountries
*/
@Parcelize
data class GetCountries(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CountryObject>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: GetCountry
*/
@Parcelize
data class GetCountry(
    
    
    
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
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null,
    
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
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
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
    Model: GetLocality
*/
@Parcelize
data class GetLocality(
    
    
    
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
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPutResponseSchema
*/
@Parcelize
data class ApplicationConfigPutResponseSchema(
    
    
    
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
    var isDefault: Boolean?=null
    
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
    Model: ApplicationConfigGetResponseSchema
*/
@Parcelize
data class ApplicationConfigGetResponseSchema(
    
    
    
    @SerializedName("zones")
    var zones: ZoneConfig?=null,
    
    @SerializedName("courier_partner_config")
    var courierPartnerConfig: CourierPartnerConfig?=null,
    
    @SerializedName("buybox_rule_config")
    var buyboxRuleConfig: BuyboxRuleConfig?=null,
    
    @SerializedName("promise_config")
    var promiseConfig: PromiseConfig?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: ArrayList<PromiseType>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPutRequestSchema
*/
@Parcelize
data class ApplicationConfigPutRequestSchema(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InstallCourierPartnerItemsSchema
*/
@Parcelize
data class InstallCourierPartnerItemsSchema(
    
    
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("callbacks")
    var callbacks: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_email")
    var contactEmail: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("developed_by_name")
    var developedByName: String?=null,
    
    @SerializedName("ext_version")
    var extVersion: String?=null,
    
    @SerializedName("extention_type")
    var extentionType: String?=null,
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
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
    
    @SerializedName("partner")
    var partner: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("whitelisted_urls")
    var whitelistedUrls: ArrayList<String>?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
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
    Model: ServiceabilityErrorResponseSchema
*/
@Parcelize
data class ServiceabilityErrorResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityConfig
*/
@Parcelize
data class ApplicationServiceabilityConfig(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Error
*/
@Parcelize
data class EntityRegionView_Error(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_page
*/
@Parcelize
data class EntityRegionView_page(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Items
*/
@Parcelize
data class EntityRegionView_Items(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewSummary
*/
@Parcelize
data class ListViewSummary(
    
    
    
    @SerializedName("total_zones")
    var totalZones: Int?=null,
    
    @SerializedName("total_pincodes_served")
    var totalPincodesServed: Int?=null,
    
    @SerializedName("total_active_zones")
    var totalActiveZones: Int?=null
    
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
    var values: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailsSchema
*/
@Parcelize
data class ProductDetailsSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<DetailsSchema>?=null
    
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
    Model: StoresDetailsSchema
*/
@Parcelize
data class StoresDetailsSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<StoreValueDetailsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DetailsSchema
*/
@Parcelize
data class DetailsSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreValueDetailsSchema
*/
@Parcelize
data class StoreValueDetailsSchema(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SummarySchema
*/
@Parcelize
data class SummarySchema(
    
    
    
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
    Model: ServiceabilityDeleteErrorResponseSchema
*/
@Parcelize
data class ServiceabilityDeleteErrorResponseSchema(
    
    
    
    @SerializedName("error")
    var error: ArrayList<ServiceabilityErrorResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListViewResponseV2
*/
@Parcelize
data class ListViewResponseV2(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ListViewItemsV2>?=null,
    
    @SerializedName("page")
    var page: ZoneDataItem?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewItemsV2
*/
@Parcelize
data class ListViewItemsV2(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<GeoArea>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("stores")
    var stores: ListViewProductV2?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("is_public_opted")
    var isPublicOpted: Boolean?=null,
    
    @SerializedName("product")
    var product: ListViewProductV2?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("summary")
    var summary: Summary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SummaryRegions
*/
@Parcelize
data class SummaryRegions(
    
    
    
    @SerializedName("regions")
    var regions: ArrayList<RegionSchema>?=null
    
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
    Model: ListViewProductV2
*/
@Parcelize
data class ListViewProductV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewProduct
*/
@Parcelize
data class ListViewProduct(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewChannels
*/
@Parcelize
data class ListViewChannels(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
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
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("regions_count")
    var regionsCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<ListViewChannels>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStoreView_PageItems
*/
@Parcelize
data class CompanyStoreView_PageItems(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneDataViewChannels
*/
@Parcelize
data class GetZoneDataViewChannels(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneProductTypes
*/
@Parcelize
data class ZoneProductTypes(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneMappingType
*/
@Parcelize
data class ZoneMappingType(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: ArrayList<String>?=null,
    
    @SerializedName("state")
    var state: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateZoneDataV2
*/
@Parcelize
data class UpdateZoneDataV2(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
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
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneUpdateSuccessResponseSchema
*/
@Parcelize
data class ZoneUpdateSuccessResponseSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("summary")
    var summary: Summary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDeleteSuccessResponseSchema
*/
@Parcelize
data class ZoneDeleteSuccessResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneDataViewItems
*/
@Parcelize
data class GetZoneDataViewItems(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null
    
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
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("product")
    var product: ProductSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresSchema?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("overlapping_file_url")
    var overlappingFileUrl: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("overlapping_zone_names")
    var overlappingZoneNames: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneByIdDetailsSchema
*/
@Parcelize
data class GetZoneByIdDetailsSchema(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("product")
    var product: ProductDetailsSchema?=null,
    
    @SerializedName("stores")
    var stores: StoresDetailsSchema?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("overlapping_file_url")
    var overlappingFileUrl: String?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<GeoAreaDetailsSchema>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
    @SerializedName("overlapping_zone_names")
    var overlappingZoneNames: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaDetailsSchema
*/
@Parcelize
data class GeoAreaDetailsSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateZoneV2Data
*/
@Parcelize
data class CreateZoneV2Data(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
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
    var items: ArrayList<ZoneBulkItem>?=null
    
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
    Model: CreateBulkZoneData
*/
@Parcelize
data class CreateBulkZoneData(
    
    
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("product_type")
    var productType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneStores
*/
@Parcelize
data class ZoneStores(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneProduct
*/
@Parcelize
data class ZoneProduct(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneResponseV2
*/
@Parcelize
data class ZoneResponseV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("access_level")
    var accessLevel: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_public_opted")
    var isPublicOpted: Boolean?=null,
    
    @SerializedName("is_opted")
    var isOpted: Boolean?=null,
    
    @SerializedName("geo_areas")
    var geoAreas: ArrayList<String>?=null,
    
    @SerializedName("stores")
    var stores: ListViewProductV2?=null,
    
    @SerializedName("product")
    var product: ListViewProductV2?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("summary")
    var summary: SummaryRegions?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateBulkZoneResponseSchema
*/
@Parcelize
data class CreateBulkZoneResponseSchema(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetBulkZoneHistory
*/
@Parcelize
data class GetBulkZoneHistory(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkZoneItems>?=null,
    
    @SerializedName("page")
    var page: PageV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkZoneItems
*/
@Parcelize
data class BulkZoneItems(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("error_file_url")
    var errorFileUrl: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageV2
*/
@Parcelize
data class PageV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Double?=null,
    
    @SerializedName("current")
    var current: Double?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkCreateZoneExport
*/
@Parcelize
data class BulkCreateZoneExport(
    
    
    
    @SerializedName("placeholder")
    var placeholder: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Zone
*/
@Parcelize
data class Zone(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MobileNo
*/
@Parcelize
data class MobileNo(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpeningClosing
*/
@Parcelize
data class OpeningClosing(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Dp
*/
@Parcelize
data class Dp(
    
    
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("area_code")
    var areaCode: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityZoneErrorResult
*/
@Parcelize
data class ServiceabilityZoneErrorResult(
    
    
    
    @SerializedName("error")
    var error: ArrayList<ServiceabilityErrorResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ServiceabilityZoneNonMarketplaceErrorResult
*/
@Parcelize
data class ServiceabilityZoneNonMarketplaceErrorResult(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
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
    Model: PincodeMopUpdateResponseSchema
*/
@Parcelize
data class PincodeMopUpdateResponseSchema(
    
    
    
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
    Model: PincodeMOPresponseSchema
*/
@Parcelize
data class PincodeMOPresponseSchema(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("pincodes")
    var pincodes: ArrayList<Int>?=null,
    
    @SerializedName("updated_pincodes")
    var updatedPincodes: ArrayList<PincodeMopUpdateResponseSchema>?=null
    
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
    var error: ArrayList<ErrorResponseSchema>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MoPCommonError
*/
@Parcelize
data class MoPCommonError(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponseSchema>?=null,
    
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
    Model: PincodeBulkViewResponseSchema
*/
@Parcelize
data class PincodeBulkViewResponseSchema(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingRequestSchema
*/
@Parcelize
data class PincodeCodStatusListingRequestSchema(
    
    
    
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
    Model: PincodeCodDataSchema
*/
@Parcelize
data class PincodeCodDataSchema(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingResponseSchema
*/
@Parcelize
data class PincodeCodStatusListingResponseSchema(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeCodDataSchema>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<Error>?=null,
    
    @SerializedName("page")
    var page: PincodeCodStatusListingPage?=null,
    
    @SerializedName("summary")
    var summary: PincodeCodStatusListingSummary?=null
    
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
    Model: PincodeCodStatusListingPage
*/
@Parcelize
data class PincodeCodStatusListingPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
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
    Model: PincodeMopUpdateAuditHistoryRequestSchema
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryRequestSchema(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null
    
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
    Model: PincodeMopUpdateAuditHistoryResponseSchema
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResponseSchema(
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryResponseData
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResponseData(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("page")
    var page: PincodeMopUpdateAuditHistoryPaging?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeMopUpdateAuditHistoryResponseSchema>?=null
    
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
    Model: SchemeRulesFeatures
*/
@Parcelize
data class SchemeRulesFeatures(
    
    
    
    @SerializedName("quality_check")
    var qualityCheck: Boolean?=null,
    
    @SerializedName("quick_response_code")
    var quickResponseCode: Boolean?=null,
    
    @SerializedName("e_waybill")
    var eWaybill: Boolean?=null,
    
    @SerializedName("multi_part_shipments")
    var multiPartShipments: Boolean?=null,
    
    @SerializedName("flammable")
    var flammable: Boolean?=null,
    
    @SerializedName("hazmat")
    var hazmat: Boolean?=null,
    
    @SerializedName("battery_operated")
    var batteryOperated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SchemeRules
*/
@Parcelize
data class SchemeRules(
    
    
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: ArrayList<String>?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("feature")
    var feature: SchemeRulesFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccount
*/
@Parcelize
data class CourierAccount(
    
    
    
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
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: @RawValue HashMap<String,Any>?=null
    
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
    Model: PriceGeoAreaExportResult
*/
@Parcelize
data class PriceGeoAreaExportResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkGeoAreaGetResponseSchema
*/
@Parcelize
data class BulkGeoAreaGetResponseSchema(
    
    
    
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
    Model: ErrorResponseItem
*/
@Parcelize
data class ErrorResponseItem(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error_name")
    var errorName: String?=null,
    
    @SerializedName("error_code")
    var errorCode: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("conflicting_areas")
    var conflictingAreas: ArrayList<ConflictingArea>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConflictingArea
*/
@Parcelize
data class ConflictingArea(
    
    
    
    @SerializedName("geoarea_id")
    var geoareaId: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    Model: ErrorResponseDetail
*/
@Parcelize
data class ErrorResponseDetail(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ErrorResponseItem>?=null
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
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
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("upload_type")
    var uploadType: String?=null
    
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
    Model: RegionV2
*/
@Parcelize
data class RegionV2(
    
    
    
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
    Model: AreaExpandedV2
*/
@Parcelize
data class AreaExpandedV2(
    
    
    
    @SerializedName("country")
    var country: Country?=null,
    
    @SerializedName("regions")
    var regions: ArrayList<RegionV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaResponseSchema
*/
@Parcelize
data class GeoAreaResponseSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaGetResponseBody
*/
@Parcelize
data class GeoAreaGetResponseBody(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GeoAreaItemResponseSchema>?=null,
    
    @SerializedName("page")
    var page: Page2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaItemResponseSchema
*/
@Parcelize
data class GeoAreaItemResponseSchema(
    
    
    
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
    var areas: ArrayList<AreaExpandedV2>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponseV2
*/
@Parcelize
data class ErrorResponseV2(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponseSchema
*/
@Parcelize
data class ErrorResponseSchema(
    
    
    
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
    Model: PackageMaterialsErrorResponseSchema
*/
@Parcelize
data class PackageMaterialsErrorResponseSchema(
    
    
    
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
    Model: CourierPartnerAccountFailureResponseSchema
*/
@Parcelize
data class CourierPartnerAccountFailureResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponseSchema>?=null
    
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
    Model: CourierPartnerList
*/
@Parcelize
data class CourierPartnerList(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
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
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationRuleValuesV2
*/
@Parcelize
data class LocationRuleValuesV2(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null
    
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
    Model: LocationRuleV2
*/
@Parcelize
data class LocationRuleV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("includes")
    var includes: ArrayList<LocationRuleValuesV2>?=null
    
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
    var orderPlaceDate: ArithmeticOperationsV2?=null,
    
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
    
    @SerializedName("company_ids")
    var companyIds: IntComparisonOperations?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResponseConditions
*/
@Parcelize
data class CourierPartnerRuleResponseConditions(
    
    
    
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
    var orderPlaceDate: ArithmeticOperationsV2?=null,
    
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
    
    @SerializedName("company_ids")
    var companyIds: IntComparisonOperations?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRule
*/
@Parcelize
data class CourierPartnerRule(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleConditions?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("shipment_adjustment_type")
    var shipmentAdjustmentType: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResponseSchema
*/
@Parcelize
data class CourierPartnerRuleResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleResponseConditions?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("shipment_adjustment_type")
    var shipmentAdjustmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailureResponseSchema
*/
@Parcelize
data class FailureResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRulesListResponseSchema
*/
@Parcelize
data class CourierPartnerRulesListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerRuleResponseSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("logistics_as_actual")
    var logisticsAsActual: String?=null
    
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
    var isHolidayEnabled: Boolean?=null
    
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
    Model: ApplicationConfig
*/
@Parcelize
data class ApplicationConfig(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<String>?=null,
    
    @SerializedName("zones")
    var zones: ZoneConfig?=null,
    
    @SerializedName("buybox_rule_config")
    var buyboxRuleConfig: BuyboxRuleConfig?=null,
    
    @SerializedName("promise_types")
    var promiseTypes: ArrayList<PromiseType>?=null,
    
    @SerializedName("promise_config")
    var promiseConfig: PromiseConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPatchRequestSchema
*/
@Parcelize
data class ApplicationConfigPatchRequestSchema(
    
    
    
    @SerializedName("courier_partner_config")
    var courierPartnerConfig: CourierPartnerConfig?=null,
    
    @SerializedName("buybox_rule_config")
    var buyboxRuleConfig: BuyboxRuleConfig?=null,
    
    @SerializedName("promise_config")
    var promiseConfig: PromiseConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationConfigPatchResponseSchema
*/
@Parcelize
data class ApplicationConfigPatchResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkRegionResponseItemData
*/
@Parcelize
data class BulkRegionResponseItemData(
    
    
    
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
    var errorFilePath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionResponseSchema
*/
@Parcelize
data class BulkRegionResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkRegionResponseItemData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SelfShipResponseSchema
*/
@Parcelize
data class SelfShipResponseSchema(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tat")
    var tat: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfig
*/
@Parcelize
data class ApplicationSelfShipConfig(
    
    
    
    @SerializedName("self_ship")
    var selfShip: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null
    
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
    var toLocation: LocationRuleV2?=null,
    
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
    var orderPlaceDate: ArithmeticOperationsV2?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: StringComparisonOperations?=null
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("meta_sort_priority")
    var metaSortPriority: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta_conditions")
    var metaConditions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
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
    Model: GetStoreRulesApiResponseSchema
*/
@Parcelize
data class GetStoreRulesApiResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreRuleDataSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateStoreRuleRequestSchema
*/
@Parcelize
data class CreateStoreRuleRequestSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleResponseSchema
*/
@Parcelize
data class StoreRuleResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleUpdateResponseSchema
*/
@Parcelize
data class StoreRuleUpdateResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    @SerializedName("manual_priority")
    var manualPriority: ArrayList<Int>?=null,
    
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
    Model: ServiceabilityModel
*/
@Parcelize
data class ServiceabilityModel(
    
    
    
    @SerializedName("lm_cod_limit")
    var lmCodLimit: Int?=null,
    
    @SerializedName("is_qc")
    var isQc: Boolean?=null,
    
    @SerializedName("pickup_cutoff")
    var pickupCutoff: String?=null,
    
    @SerializedName("route_code")
    var routeCode: String?=null,
    
    @SerializedName("is_first_mile")
    var isFirstMile: Boolean?=null,
    
    @SerializedName("is_return")
    var isReturn: Boolean?=null,
    
    @SerializedName("is_installation")
    var isInstallation: Boolean?=null,
    
    @SerializedName("is_last_mile")
    var isLastMile: Boolean?=null
    
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
    var ewaybill: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountSchemeResponseSchema
*/
@Parcelize
data class CourierAccountSchemeResponseSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
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
    Model: CourierAccountResponseSchema
*/
@Parcelize
data class CourierAccountResponseSchema(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierAccountSchemeResponseSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyCourierPartnerAccountListResponseSchema
*/
@Parcelize
data class CompanyCourierPartnerAccountListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierAccountResponseSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterial
*/
@Parcelize
data class PackageMaterial(
    
    
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("item_id")
    var itemId: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<Channel>?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageMaterialRule>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("mp_stores")
    var mpStores: ArrayList<PackageMpStores>?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleDeleteResponseSchema
*/
@Parcelize
data class CourierPartnerRuleDeleteResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StoreRuleDeleteResponseSchema
*/
@Parcelize
data class StoreRuleDeleteResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageMaterialDeleteResponseSchema
*/
@Parcelize
data class PackageMaterialDeleteResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageMaterialResponseSchema
*/
@Parcelize
data class PackageMaterialResponseSchema(
    
    
    
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
    var autoCalculate: Boolean?=null,
    
    @SerializedName("mp_stores")
    var mpStores: ArrayList<PackageMpStores>?=null
    
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
    var weight: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMpStores
*/
@Parcelize
data class PackageMpStores(
    
    
    
    @SerializedName("app_name")
    var appName: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("store_data")
    var storeData: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleRequestSchema
*/
@Parcelize
data class PackageRuleRequestSchema(
    
    
    
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
    Model: PackageRule
*/
@Parcelize
data class PackageRule(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    var autoCalculate: Boolean?=null,
    
    @SerializedName("mp_stores")
    var mpStores: ArrayList<PackageMpStores>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleResult
*/
@Parcelize
data class PackageRuleResult(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("product_id")
    var productId: PackageRuleProduct?=null,
    
    @SerializedName("category_id")
    var categoryId: PackageRuleCategory?=null,
    
    @SerializedName("department_id")
    var departmentId: PackageRuleDepartmentId?=null,
    
    @SerializedName("product_tag")
    var productTag: PackageRuleProductTag?=null,
    
    @SerializedName("product_attributes")
    var productAttributes: PackageRuleProductAttributes?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
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
    Model: PackageMaterialRuleList
*/
@Parcelize
data class PackageMaterialRuleList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PackageRuleResult>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialList
*/
@Parcelize
data class PackageMaterialList(
    
    
    
    @SerializedName("items")
    var items: @RawValue Any?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: PackageRuleCategory
*/
@Parcelize
data class PackageRuleCategory(
    
    
    
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
    Model: PackageRuleDepartmentId
*/
@Parcelize
data class PackageRuleDepartmentId(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
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
    Model: RulePriorityRequestSchema
*/
@Parcelize
data class RulePriorityRequestSchema(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityResponseSchema
*/
@Parcelize
data class RulePriorityResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompanySelfShip
*/
@Parcelize
data class CompanySelfShip(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tat")
    var tat: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArithmeticOperationsV2
*/
@Parcelize
data class ArithmeticOperationsV2(
    
    
    
    @SerializedName("lt")
    var lt: String?=null,
    
    @SerializedName("gt")
    var gt: String?=null,
    
    @SerializedName("lte")
    var lte: String?=null,
    
    @SerializedName("gte")
    var gte: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyConfigurationShema
*/
@Parcelize
data class CompanyConfigurationShema(
    
    
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
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





