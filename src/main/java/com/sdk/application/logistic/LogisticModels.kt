package com.sdk.application.logistic

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PackagingDimension
*/
@Parcelize
data class PackagingDimension(
    
    
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentArticleMeta
*/
@Parcelize
data class ShipmentArticleMeta(
    
    
    
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
    Model: DeliveryTatSchema
*/
@Parcelize
data class DeliveryTatSchema(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryTat
*/
@Parcelize
data class DeliveryTat(
    
    
    
    @SerializedName("tat")
    var tat: DeliveryTatSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerPromiseData
*/
@Parcelize
data class CourierPartnerPromiseData(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("attributes")
    var attributes: DeliveryTat?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseMeta
*/
@Parcelize
data class PromiseMeta(
    
    
    
    @SerializedName("seller_promise")
    var sellerPromise: PromiseData?=null,
    
    @SerializedName("courier_partner_promise")
    var courierPartnerPromise: CourierPartnerPromiseData?=null,
    
    @SerializedName("customer_initial_promise")
    var customerInitialPromise: PromiseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseData
*/
@Parcelize
data class PromiseData(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnersTat
*/
@Parcelize
data class CourierPartnersTat(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
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
    Model: ArticleSizeDistribution
*/
@Parcelize
data class ArticleSizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SetSizeItem
*/
@Parcelize
data class SetSizeItem(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetSizeDistribution
*/
@Parcelize
data class SetSizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSizeItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PromiseObject
*/
@Parcelize
data class PromiseObject(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("customer_promise")
    var customerPromise: PromiseData?=null,
    
    @SerializedName("meta")
    var meta: PromiseMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryPromiseObject
*/
@Parcelize
data class DeliveryPromiseObject(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JourneyPromiseObject
*/
@Parcelize
data class JourneyPromiseObject(
    
    
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: DeliveryPromiseObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartners
*/
@Parcelize
data class ShipmentCourierPartners(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("area_code")
    var areaCode: AreaCode?=null,
    
    @SerializedName("tat")
    var tat: CourierPartnersTat?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_qc_enabled")
    var isQcEnabled: Boolean?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("forward_pickup_cutoff")
    var forwardPickupCutoff: String?=null,
    
    @SerializedName("reverse_pickup_cutoff")
    var reversePickupCutoff: String?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: Int?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsArticles
*/
@Parcelize
data class ShipmentsArticles(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("set")
    var set: ArticleSet?=null,
    
    @SerializedName("sla")
    var sla: String?=null,
    
    @SerializedName("meta")
    var meta: ShipmentArticleMeta?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("group_info")
    var groupInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("group_info_ids")
    var groupInfoIds: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
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
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("ewaybill_enabled")
    var ewaybillEnabled: Boolean?=null,
    
    @SerializedName("mps")
    var mps: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentsArticles>?=null,
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<ShipmentCourierPartners>?=null,
    
    @SerializedName("promise")
    var promise: PromiseObject?=null,
    
    @SerializedName("journey_wise_promise")
    var journeyWisePromise: ArrayList<JourneyPromiseObject>?=null,
    
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_mto")
    var isMto: Boolean?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("packaging")
    var packaging: Packaging?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArticleDeliverySlots?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: Double?=null,
    
    @SerializedName("is_auto_assign")
    var isAutoAssign: Boolean?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("from_serviceability")
    var fromServiceability: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: ShipmentError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentError
*/
@Parcelize
data class ShipmentError(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetailsArticle
*/
@Parcelize
data class LocationDetailsArticle(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("group_info")
    var groupInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("group_info_ids")
    var groupInfoIds: ArrayList<String>?=null,
    
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
    Model: GenerateShipmentsLocationArticles
*/
@Parcelize
data class GenerateShipmentsLocationArticles(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_serviceability")
    var fromServiceability: LocationDetailsServiceability?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<LocationDetailsArticle>?=null,
    
    @SerializedName("ewaybill_enabled")
    var ewaybillEnabled: Boolean?=null,
    
    @SerializedName("is_home_delivery")
    var isHomeDelivery: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateShipmentsRequest
*/
@Parcelize
data class GenerateShipmentsRequest(
    
    
    
    @SerializedName("to_serviceability")
    var toServiceability: LocationDetailsServiceability?=null,
    
    @SerializedName("location_articles")
    var locationArticles: ArrayList<GenerateShipmentsLocationArticles>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateShipmentsAndCourierPartnerResponse
*/
@Parcelize
data class GenerateShipmentsAndCourierPartnerResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null
    
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
    var parentId: ArrayList<String>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaGetResponseBody
*/
@Parcelize
data class GeoAreaGetResponseBody(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GeoAreaItemResponse>?=null,
    
    @SerializedName("page")
    var page: Page2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeoAreaItemResponse
*/
@Parcelize
data class GeoAreaItemResponse(
    
    
    
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
    var modifiedBy: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
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
    Model: ServiceabilityZoneErrorResponse
*/
@Parcelize
data class ServiceabilityZoneErrorResponse(
    
    
    
    @SerializedName("error")
    var error: ArrayList<ServiceabilityErrorResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResponse
*/
@Parcelize
data class ServiceabilityErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoreResponse
*/
@Parcelize
data class GetStoreResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreItemResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreItemResponse
*/
@Parcelize
data class StoreItemResponse(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("processing_time")
    var processingTime: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateAddressRequest
*/
@Parcelize
data class ValidateAddressRequest(
    
    
    
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
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMetaResponse
*/
@Parcelize
data class PincodeMetaResponse(
    
    
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("internal_zone_id")
    var internalZoneId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeErrorSchemaResponse
*/
@Parcelize
data class PincodeErrorSchemaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("meta_code")
    var metaCode: CountryMetaResponse?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeApiResponse
*/
@Parcelize
data class PincodeApiResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATCategoryRequest
*/
@Parcelize
data class TATCategoryRequest(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATArticlesRequest
*/
@Parcelize
data class TATArticlesRequest(
    
    
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsRequest
*/
@Parcelize
data class TATLocationDetailsRequest(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesRequest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewRequest
*/
@Parcelize
data class TATViewRequest(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsRequest>?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATErrorSchemaResponse
*/
@Parcelize
data class TATErrorSchemaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATTimestampResponse
*/
@Parcelize
data class TATTimestampResponse(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATFormattedResponse
*/
@Parcelize
data class TATFormattedResponse(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATPromiseResponse
*/
@Parcelize
data class TATPromiseResponse(
    
    
    
    @SerializedName("timestamp")
    var timestamp: TATTimestampResponse?=null,
    
    @SerializedName("formatted")
    var formatted: TATFormattedResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATArticlesResponse
*/
@Parcelize
data class TATArticlesResponse(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsResponse
*/
@Parcelize
data class TATLocationDetailsResponse(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewResponse
*/
@Parcelize
data class TATViewResponse(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DP
*/
@Parcelize
data class DP(
    
    
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticsResponse
*/
@Parcelize
data class LogisticsResponse(
    
    
    
    @SerializedName("dp")
    var dp: HashMap<String,DP>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CountryMetaResponse
*/
@Parcelize
data class CountryMetaResponse(
    
    
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("deliverables")
    var deliverables: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<CountryHierarchy>?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryEntityResponse
*/
@Parcelize
data class CountryEntityResponse(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("lat_long")
    var latLong: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: CountryMetaResponse?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryListResponse
*/
@Parcelize
data class CountryListResponse(
    
    
    
    @SerializedName("results")
    var results: ArrayList<CountryEntityResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewRequest
*/
@Parcelize
data class GetZoneFromPincodeViewRequest(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewResponse
*/
@Parcelize
data class GetZoneFromPincodeViewResponse(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReAssignStoreRequest
*/
@Parcelize
data class ReAssignStoreRequest(
    
    
    
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("ignored_locations")
    var ignoredLocations: ArrayList<Int>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReAssignStoreResponse
*/
@Parcelize
data class ReAssignStoreResponse(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("pystormbreaker_uuid")
    var pystormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("assigned_stores")
    var assignedStores: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    @SerializedName("pre_fill")
    var preFill: String?=null,
    
    @SerializedName("validation")
    var validation: FieldValidation?=null,
    
    @SerializedName("values")
    var values: GetCountryFieldsAddressValues?=null,
    
    @SerializedName("error_text")
    var errorText: String?=null
    
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
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponseV2
*/
@Parcelize
data class ErrorResponseV2(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: StandardError
*/
@Parcelize
data class StandardError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ShipmentRequest
*/
@Parcelize
data class ShipmentRequest(
    
    
    
    @SerializedName("to_serviceability")
    var toServiceability: ServiceabilityNew?=null,
    
    @SerializedName("location_articles")
    var locationArticles: ArrayList<LocationArticle>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationArticle
*/
@Parcelize
data class LocationArticle(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_serviceability")
    var fromServiceability: ServiceabilityNew?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<Article>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
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
    var set: Set?=null,
    
    @SerializedName("set_quantity")
    var setQuantity: Int?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: DeliverySlots?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    
    @SerializedName("shipping")
    var shipping: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    
    
    @SerializedName("battery_operated")
    var batteryOperated: String?=null,
    
    @SerializedName("is_flammable")
    var isFlammable: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("height")
    var height: Int?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("length")
    var length: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Set
*/
@Parcelize
data class Set(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: SetSizeDistribution?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliverySlots
*/
@Parcelize
data class DeliverySlots(
    
    
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("min_slot")
    var minSlot: String?=null,
    
    @SerializedName("max_slot")
    var maxSlot: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityNew
*/
@Parcelize
data class ServiceabilityNew(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("location")
    var location: Location?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Location
*/
@Parcelize
data class Location(
    
    
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentItem>?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("shipment_cost")
    var shipmentCost: Double?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ShipmentItem
*/
@Parcelize
data class ShipmentItem(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_tags")
    var fulfillmentTags: ArrayList<String>?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("from_serviceability")
    var fromServiceability: ServiceabilityNew?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<Article>?=null,
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<CourierPartner>?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("is_mto")
    var isMto: Boolean?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("packaging")
    var packaging: Packaging?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: DeliverySlots?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: Double?=null,
    
    @SerializedName("ewaybill_enabled")
    var ewaybillEnabled: String?=null,
    
    @SerializedName("mps")
    var mps: Boolean?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("is_auto_assign")
    var isAutoAssign: Boolean?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null
    
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
    Model: CourierPartner
*/
@Parcelize
data class CourierPartner(
    
    
    
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
    var reversePickupCutoff: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    
    @SerializedName("customer_promise")
    var customerPromise: PromiseDetails?=null,
    
    @SerializedName("meta")
    var meta: PromiseMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseDetails
*/
@Parcelize
data class PromiseDetails(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
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
    var dimension: PackagingDimension?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StorePromise
*/
@Parcelize
data class StorePromise(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("promise")
    var promise: PromiseDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPromiseDetails
*/
@Parcelize
data class GetPromiseDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StorePromise>?=null,
    
    @SerializedName("promise")
    var promise: PromiseDetails?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetQCPromiseDetails
*/
@Parcelize
data class GetQCPromiseDetails(
    
    
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("tat_min")
    var tatMin: String?=null,
    
    @SerializedName("tat_max")
    var tatMax: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}





