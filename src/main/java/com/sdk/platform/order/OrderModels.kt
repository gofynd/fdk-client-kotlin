package com.sdk.platform.order

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: InvalidateShipmentCachePayload
*/
@Parcelize
data class InvalidateShipmentCachePayload(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    
    @SerializedName("affiliate_bag_ids")
    var affiliateBagIds: ArrayList<String>?=null,
    
    @SerializedName("bag_ids")
    var bagIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidateShipmentCacheNestedResponseSchema
*/
@Parcelize
data class InvalidateShipmentCacheNestedResponseSchema(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidateShipmentCacheResponseSchema
*/
@Parcelize
data class InvalidateShipmentCacheResponseSchema(
    
    
    
    @SerializedName("response")
    var response: ArrayList<InvalidateShipmentCacheNestedResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdatePackingErrorResponseSchema
*/
@Parcelize
data class UpdatePackingErrorResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponseSchema
*/
@Parcelize
data class ErrorResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error_trace")
    var errorTrace: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreReassign
*/
@Parcelize
data class StoreReassign(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("set_id")
    var setId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("reason_ids")
    var reasonIds: ArrayList<Int>?=null,
    
    @SerializedName("mongo_article_id")
    var mongoArticleId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreReassignResponseSchema
*/
@Parcelize
data class StoreReassignResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LockManagerEntities
*/
@Parcelize
data class LockManagerEntities(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentLockPayload
*/
@Parcelize
data class UpdateShipmentLockPayload(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<LockManagerEntities>?=null,
    
    @SerializedName("resume_tasks_after_unlock")
    var resumeTasksAfterUnlock: Boolean?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OriginalFilter
*/
@Parcelize
data class OriginalFilter(
    
    
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckResponseSchema
*/
@Parcelize
data class CheckResponseSchema(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_bag_locked")
    var isBagLocked: Boolean?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("original_filter")
    var originalFilter: OriginalFilter?=null,
    
    @SerializedName("is_shipment_locked")
    var isShipmentLocked: Boolean?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentLockResponseSchema
*/
@Parcelize
data class UpdateShipmentLockResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("check_response")
    var checkResponse: ArrayList<CheckResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementResponseSchema
*/
@Parcelize
data class AnnouncementResponseSchema(
    
    
    
    @SerializedName("to_datetime")
    var toDatetime: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("platform_name")
    var platformName: String?=null,
    
    @SerializedName("from_datetime")
    var fromDatetime: String?=null,
    
    @SerializedName("platform_id")
    var platformId: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("logo_url")
    var logoUrl: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    
    
    @SerializedName("announcements")
    var announcements: ArrayList<AnnouncementResponseSchema>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BaseResponseSchema
*/
@Parcelize
data class BaseResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDetail
*/
@Parcelize
data class ErrorDetail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsReasonsFilters
*/
@Parcelize
data class ProductsReasonsFilters(
    
    
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsReasonsData
*/
@Parcelize
data class ProductsReasonsData(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsReasons
*/
@Parcelize
data class ProductsReasons(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsReasonsFilters>?=null,
    
    @SerializedName("data")
    var data: ProductsReasonsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityReasonData
*/
@Parcelize
data class EntityReasonData(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntitiesReasons
*/
@Parcelize
data class EntitiesReasons(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: EntityReasonData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReasonsData
*/
@Parcelize
data class ReasonsData(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsReasons>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderItemDataUpdates
*/
@Parcelize
data class OrderItemDataUpdates(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductsDataUpdatesFilters
*/
@Parcelize
data class ProductsDataUpdatesFilters(
    
    
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsDataUpdates
*/
@Parcelize
data class ProductsDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsDataUpdatesFilters>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntitiesDataUpdates
*/
@Parcelize
data class EntitiesDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDataUpdates
*/
@Parcelize
data class OrderDataUpdates(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DataUpdates
*/
@Parcelize
data class DataUpdates(
    
    
    
    @SerializedName("order_item_status")
    var orderItemStatus: ArrayList<OrderItemDataUpdates>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductsDataUpdates>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesDataUpdates>?=null,
    
    @SerializedName("order")
    var order: ArrayList<OrderDataUpdates>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsRequestSchema
*/
@Parcelize
data class ShipmentsRequestSchema(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("reasons")
    var reasons: ReasonsData?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null,
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdates?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatedAddressSchema
*/
@Parcelize
data class UpdatedAddressSchema(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
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
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAddressRequestBody
*/
@Parcelize
data class UpdateAddressRequestBody(
    
    
    
    @SerializedName("updated_address")
    var updatedAddress: UpdatedAddressSchema?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatuesRequestSchema
*/
@Parcelize
data class StatuesRequestSchema(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsRequestSchema>?=null,
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("split_shipment")
    var splitShipment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentStatusRequestSchema
*/
@Parcelize
data class UpdateShipmentStatusRequestSchema(
    
    
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesRequestSchema>?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("resume_tasks_after_unlock")
    var resumeTasksAfterUnlock: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsResponseSchema
*/
@Parcelize
data class ShipmentsResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("final_state")
    var finalState: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPConfiguration
*/
@Parcelize
data class DPConfiguration(
    
    
    
    @SerializedName("shipping_by")
    var shippingBy: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentConfig
*/
@Parcelize
data class PaymentConfig(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LockStateMessage
*/
@Parcelize
data class LockStateMessage(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderConfig
*/
@Parcelize
data class CreateOrderConfig(
    
    
    
    @SerializedName("dp_configuration")
    var dpConfiguration: DPConfiguration?=null,
    
    @SerializedName("location_reassignment")
    var locationReassignment: Boolean?=null,
    
    @SerializedName("payment")
    var payment: PaymentConfig?=null,
    
    @SerializedName("optimal_shipment_creation")
    var optimalShipmentCreation: Boolean?=null,
    
    @SerializedName("lock_state_messages")
    var lockStateMessages: ArrayList<LockStateMessage>?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatuesResponseSchema
*/
@Parcelize
data class StatuesResponseSchema(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentStatusResponseBody
*/
@Parcelize
data class UpdateShipmentStatusResponseBody(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderUser
*/
@Parcelize
data class OrderUser(
    
    
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderPriority
*/
@Parcelize
data class OrderPriority(
    
    
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("affiliate_priority_code")
    var affiliatePriorityCode: String?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDetails
*/
@Parcelize
data class ArticleDetails(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetails
*/
@Parcelize
data class ShipmentDetails(
    
    
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails>?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("action_to_status")
    var actionToStatus: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentConfig
*/
@Parcelize
data class ShipmentConfig(
    
    
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("shipment")
    var shipment: ArrayList<ShipmentDetails>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentData
*/
@Parcelize
data class ShipmentData(
    
    
    
    @SerializedName("shipment_data")
    var shipmentData: ShipmentConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MarketPlacePdf
*/
@Parcelize
data class MarketPlacePdf(
    
    
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("label")
    var label: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateBag
*/
@Parcelize
data class AffiliateBag(
    
    
    
    @SerializedName("pdf_links")
    var pdfLinks: MarketPlacePdf?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("sku")
    var sku: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("unit_price")
    var unitPrice: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("fynd_store_id")
    var fyndStoreId: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("avl_qty")
    var avlQty: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserData
*/
@Parcelize
data class UserData(
    
    
    
    @SerializedName("shipping_user")
    var shippingUser: OrderUser?=null,
    
    @SerializedName("billing_user")
    var billingUser: OrderUser?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderInfo
*/
@Parcelize
data class OrderInfo(
    
    
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("billing_address")
    var billingAddress: OrderUser?=null,
    
    @SerializedName("payment")
    var payment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_priority")
    var orderPriority: OrderPriority?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentData?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: OrderUser?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<AffiliateBag>?=null,
    
    @SerializedName("user")
    var user: UserData?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateAppConfigMeta
*/
@Parcelize
data class AffiliateAppConfigMeta(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateAppConfig
*/
@Parcelize
data class AffiliateAppConfig(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<AffiliateAppConfigMeta>?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryArticleAssignmentConfig
*/
@Parcelize
data class AffiliateInventoryArticleAssignmentConfig(
    
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryPaymentConfig
*/
@Parcelize
data class AffiliateInventoryPaymentConfig(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryStoreConfig
*/
@Parcelize
data class AffiliateInventoryStoreConfig(
    
    
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryOrderConfig
*/
@Parcelize
data class AffiliateInventoryOrderConfig(
    
    
    
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryLogisticsConfig
*/
@Parcelize
data class AffiliateInventoryLogisticsConfig(
    
    
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AffiliateInventoryConfig
*/
@Parcelize
data class AffiliateInventoryConfig(
    
    
    
    @SerializedName("article_assignment")
    var articleAssignment: AffiliateInventoryArticleAssignmentConfig?=null,
    
    @SerializedName("payment")
    var payment: AffiliateInventoryPaymentConfig?=null,
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryStoreConfig?=null,
    
    @SerializedName("order")
    var order: AffiliateInventoryOrderConfig?=null,
    
    @SerializedName("logistics")
    var logistics: AffiliateInventoryLogisticsConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateConfig
*/
@Parcelize
data class AffiliateConfig(
    
    
    
    @SerializedName("app")
    var app: AffiliateAppConfig?=null,
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryConfig?=null,
    
    @SerializedName("app_company_id")
    var appCompanyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Affiliate
*/
@Parcelize
data class Affiliate(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("config")
    var config: AffiliateConfig?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateStoreIdMapping
*/
@Parcelize
data class AffiliateStoreIdMapping(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderConfig
*/
@Parcelize
data class OrderConfig(
    
    
    
    @SerializedName("create_user")
    var createUser: Boolean?=null,
    
    @SerializedName("article_lookup")
    var articleLookup: String?=null,
    
    @SerializedName("bag_end_state")
    var bagEndState: String?=null,
    
    @SerializedName("affiliate")
    var affiliate: Affiliate?=null,
    
    @SerializedName("store_lookup")
    var storeLookup: String?=null,
    
    @SerializedName("affiliate_store_id_mapping")
    var affiliateStoreIdMapping: ArrayList<AffiliateStoreIdMapping>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderResponseSchema
*/
@Parcelize
data class CreateOrderResponseSchema(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DispatchManifest
*/
@Parcelize
data class DispatchManifest(
    
    
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SuccessResponseSchema
*/
@Parcelize
data class SuccessResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActionInfo
*/
@Parcelize
data class ActionInfo(
    
    
    
    @SerializedName("display_text")
    var displayText: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetActionsResponseSchema
*/
@Parcelize
data class GetActionsResponseSchema(
    
    
    
    @SerializedName("permissions")
    var permissions: ArrayList<ActionInfo>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: HistoryReason
*/
@Parcelize
data class HistoryReason(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("dislay_name")
    var dislayName: String?=null,
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundInformation
*/
@Parcelize
data class RefundInformation(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("refund_status")
    var refundStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryMeta
*/
@Parcelize
data class HistoryMeta(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("status1")
    var status1: String?=null,
    
    @SerializedName("call_id")
    var callId: String?=null,
    
    @SerializedName("starttime")
    var starttime: String?=null,
    
    @SerializedName("reason")
    var reason: HistoryReason?=null,
    
    @SerializedName("short_link")
    var shortLink: String?=null,
    
    @SerializedName("endtime")
    var endtime: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("caller")
    var caller: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("billsec")
    var billsec: String?=null,
    
    @SerializedName("recordpath")
    var recordpath: String?=null,
    
    @SerializedName("status2")
    var status2: String?=null,
    
    @SerializedName("callerid")
    var callerid: String?=null,
    
    @SerializedName("duration")
    var duration: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("activity_comment")
    var activityComment: String?=null,
    
    @SerializedName("activity_type")
    var activityType: String?=null,
    
    @SerializedName("receiver")
    var receiver: String?=null,
    
    @SerializedName("recipient")
    var recipient: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("prev_store_name")
    var prevStoreName: String?=null,
    
    @SerializedName("prev_store_code")
    var prevStoreCode: String?=null,
    
    @SerializedName("prev_store_id")
    var prevStoreId: String?=null,
    
    @SerializedName("refund_to")
    var refundTo: String?=null,
    
    @SerializedName("refund_information")
    var refundInformation: ArrayList<RefundInformation>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryDict
*/
@Parcelize
data class HistoryDict(
    
    
    
    @SerializedName("display_message")
    var displayMessage: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("ticket_url")
    var ticketUrl: String?=null,
    
    @SerializedName("l3_detail")
    var l3Detail: String?=null,
    
    @SerializedName("createdat")
    var createdat: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("activity_type")
    var activityType: String?=null,
    
    @SerializedName("l2_detail")
    var l2Detail: String?=null,
    
    @SerializedName("assigned_agent")
    var assignedAgent: String?=null,
    
    @SerializedName("meta")
    var meta: HistoryMeta?=null,
    
    @SerializedName("l1_detail")
    var l1Detail: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("user")
    var user: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentHistoryResponseSchema
*/
@Parcelize
data class ShipmentHistoryResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("activity_history")
    var activityHistory: ArrayList<HistoryDict>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostHistoryFilters
*/
@Parcelize
data class PostHistoryFilters(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PostHistoryData
*/
@Parcelize
data class PostHistoryData(
    
    
    
    @SerializedName("user_name")
    var userName: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostHistoryDict
*/
@Parcelize
data class PostHistoryDict(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<PostHistoryFilters>?=null,
    
    @SerializedName("data")
    var data: PostHistoryData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostShipmentHistory
*/
@Parcelize
data class PostShipmentHistory(
    
    
    
    @SerializedName("activity_history")
    var activityHistory: ArrayList<PostHistoryDict>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SmsDataPayload
*/
@Parcelize
data class SmsDataPayload(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendSmsPayload
*/
@Parcelize
data class SendSmsPayload(
    
    
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("data")
    var data: SmsDataPayload?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetails
*/
@Parcelize
data class OrderDetails(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: TaxDetails?=null,
    
    @SerializedName("mongo_cart_id")
    var mongoCartId: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("created_time")
    var createdTime: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("total_order_value")
    var totalOrderValue: Double?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("cashback_value")
    var cashbackValue: Double?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("affiliate_order_date")
    var affiliateOrderDate: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("payment_mode_id")
    var paymentModeId: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<PriceAdjustmentCharge>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("kafka_emission_status")
    var kafkaEmissionStatus: Int?=null,
    
    @SerializedName("state_manager_used")
    var stateManagerUsed: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetail
*/
@Parcelize
data class ShipmentDetail(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("remarks")
    var remarks: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderStatusData
*/
@Parcelize
data class OrderStatusData(
    
    
    
    @SerializedName("order_details")
    var orderDetails: OrderDetails?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null,
    
    @SerializedName("shipment_details")
    var shipmentDetails: ArrayList<ShipmentDetail>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("color_code")
    var colorCode: String?=null,
    
    @SerializedName("expected_delivery_date")
    var expectedDeliveryDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderStatusResult
*/
@Parcelize
data class OrderStatusResult(
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("result")
    var result: ArrayList<OrderStatusData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendSmsResponseSchema
*/
@Parcelize
data class SendSmsResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePackagingDimensionsPayload
*/
@Parcelize
data class UpdatePackagingDimensionsPayload(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("dimension")
    var dimension: ArrayList<Dimension>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePackagingDimensionsResponseSchema
*/
@Parcelize
data class UpdatePackagingDimensionsResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Tax
*/
@Parcelize
data class Tax(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("breakup")
    var breakup: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("amount")
    var amount: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AmountSchema
*/
@Parcelize
data class AmountSchema(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Charge
*/
@Parcelize
data class Charge(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: AmountSchema?=null,
    
    @SerializedName("tax")
    var tax: Tax?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LineItem
*/
@Parcelize
data class LineItem(
    
    
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_message")
    var customMessage: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("external_line_id")
    var externalLineId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessingDates
*/
@Parcelize
data class ProcessingDates(
    
    
    
    @SerializedName("dp_pickup_slot")
    var dpPickupSlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dispatch_after_date")
    var dispatchAfterDate: String?=null,
    
    @SerializedName("dispatch_by_date")
    var dispatchByDate: String?=null,
    
    @SerializedName("confirm_by_date")
    var confirmByDate: String?=null,
    
    @SerializedName("customer_pickup_slot")
    var customerPickupSlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pack_by_date")
    var packByDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Tag
*/
@Parcelize
data class Tag(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessAfterConfig
*/
@Parcelize
data class ProcessAfterConfig(
    
    
    
    @SerializedName("is_scheduled_shipment")
    var isScheduledShipment: Boolean?=null,
    
    @SerializedName("enable_processing_after")
    var enableProcessingAfter: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SystemMessages
*/
@Parcelize
data class SystemMessages(
    
    
    
    @SerializedName("message_type")
    var messageType: String?=null,
    
    @SerializedName("priority")
    var priority: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("inject_at")
    var injectAt: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipment
*/
@Parcelize
data class Shipment(
    
    
    
    @SerializedName("line_items")
    var lineItems: ArrayList<LineItem>?=null,
    
    @SerializedName("external_shipment_id")
    var externalShipmentId: String?=null,
    
    @SerializedName("processing_dates")
    var processingDates: ProcessingDates?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("location_id")
    var locationId: Int?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("system_messages")
    var systemMessages: ArrayList<SystemMessages>?=null,
    
    @SerializedName("process_after_config")
    var processAfterConfig: ProcessAfterConfig?=null,
    
    @SerializedName("parent_type")
    var parentType: String?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("billing_address_json")
    var billingAddressJson: Address?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("previous_shipment_id")
    var previousShipmentId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_address_json")
    var deliveryAddressJson: Address?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("hand_over_contact_json")
    var handOverContactJson: Address?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("quantity")
    var quantity: Double?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("price")
    var price: Prices?=null,
    
    @SerializedName("gst")
    var gst: ShipmentGstDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeoLocationSchema
*/
@Parcelize
data class GeoLocationSchema(
    
    
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingInfo
*/
@Parcelize
data class ShippingInfo(
    
    
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("shipping_type")
    var shippingType: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocationSchema?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("slot")
    var slot: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BillingInfo
*/
@Parcelize
data class BillingInfo(
    
    
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxInfo
*/
@Parcelize
data class TaxInfo(
    
    
    
    @SerializedName("b2b_gstin_number")
    var b2BGstinNumber: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethod
*/
@Parcelize
data class PaymentMethod(
    
    
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transaction_data")
    var transactionData: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInfo
*/
@Parcelize
data class PaymentInfo(
    
    
    
    @SerializedName("primary_mode")
    var primaryMode: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderAPI
*/
@Parcelize
data class CreateOrderAPI(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipment>?=null,
    
    @SerializedName("shipping_info")
    var shippingInfo: ShippingInfo?=null,
    
    @SerializedName("billing_info")
    var billingInfo: ShippingInfo?=null,
    
    @SerializedName("currency_info")
    var currencyInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null,
    
    @SerializedName("external_creation_date")
    var externalCreationDate: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tax_info")
    var taxInfo: TaxInfo?=null,
    
    @SerializedName("config")
    var config: CreateOrderConfig?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: PaymentInfo?=null,
    
    @SerializedName("user_info")
    var userInfo: UserInfo?=null,
    
    @SerializedName("ordering_store_id")
    var orderingStoreId: Int?=null,
    
    @SerializedName("order_platform")
    var orderPlatform: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("system_messages")
    var systemMessages: ArrayList<SystemMessages>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("external_shipment_id")
    var externalShipmentId: String?=null,
    
    @SerializedName("custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderErrorReponse
*/
@Parcelize
data class CreateOrderErrorReponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Double?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethods
*/
@Parcelize
data class PaymentMethods(
    
    
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelPaymentInfo
*/
@Parcelize
data class CreateChannelPaymentInfo(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethods>?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelConfig
*/
@Parcelize
data class CreateChannelConfig(
    
    
    
    @SerializedName("dp_configuration")
    var dpConfiguration: DPConfiguration?=null,
    
    @SerializedName("shipment_assignment")
    var shipmentAssignment: String?=null,
    
    @SerializedName("location_reassignment")
    var locationReassignment: Boolean?=null,
    
    @SerializedName("logo_url")
    var logoUrl: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: CreateChannelPaymentInfo?=null,
    
    @SerializedName("lock_states")
    var lockStates: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelConfigData
*/
@Parcelize
data class CreateChannelConfigData(
    
    
    
    @SerializedName("config_data")
    var configData: CreateChannelConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateChannelConifgErrorResponseSchema
*/
@Parcelize
data class CreateChannelConifgErrorResponseSchema(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("info")
    var info: @RawValue Any?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UploadManifestConsent
*/
@Parcelize
data class UploadManifestConsent(
    
    
    
    @SerializedName("consent_url")
    var consentUrl: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelConfigResponseSchema
*/
@Parcelize
data class CreateChannelConfigResponseSchema(
    
    
    
    @SerializedName("is_inserted")
    var isInserted: Boolean?=null,
    
    @SerializedName("is_upserted")
    var isUpserted: Boolean?=null,
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOrderUpdate
*/
@Parcelize
data class PlatformOrderUpdate(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResponseDetail
*/
@Parcelize
data class ResponseDetail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FyndOrderIdList
*/
@Parcelize
data class FyndOrderIdList(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: ArrayList<String>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderStatus
*/
@Parcelize
data class OrderStatus(
    
    
    
    @SerializedName("order_details")
    var orderDetails: ArrayList<FyndOrderIdList>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStateTransitionMap
*/
@Parcelize
data class BagStateTransitionMap(
    
    
    
    @SerializedName("fynd")
    var fynd: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate")
    var affiliate: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RoleBaseStateTransitionMapping
*/
@Parcelize
data class RoleBaseStateTransitionMapping(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("next_statuses")
    var nextStatuses: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FetchCreditBalanceRequestPayload
*/
@Parcelize
data class FetchCreditBalanceRequestPayload(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: String?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditBalanceInfo
*/
@Parcelize
data class CreditBalanceInfo(
    
    
    
    @SerializedName("total_credited_balance")
    var totalCreditedBalance: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FetchCreditBalanceResponsePayload
*/
@Parcelize
data class FetchCreditBalanceResponsePayload(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditBalanceInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundModeConfigRequestPayload
*/
@Parcelize
data class RefundModeConfigRequestPayload(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOption
*/
@Parcelize
data class RefundOption(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundModeFormat
*/
@Parcelize
data class RefundModeFormat(
    
    
    
    @SerializedName("refund_to")
    var refundTo: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RefundModeInfo
*/
@Parcelize
data class RefundModeInfo(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<RefundOption>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("format")
    var format: RefundModeFormat?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundModeConfigResponsePayload
*/
@Parcelize
data class RefundModeConfigResponsePayload(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<RefundModeInfo>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachUserOtpData
*/
@Parcelize
data class AttachUserOtpData(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AttachUserInfo
*/
@Parcelize
data class AttachUserInfo(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachOrderUser
*/
@Parcelize
data class AttachOrderUser(
    
    
    
    @SerializedName("otp_data")
    var otpData: AttachUserOtpData?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("user_info")
    var userInfo: AttachUserInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachOrderUserResponseSchema
*/
@Parcelize
data class AttachOrderUserResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SendUserMobileOTP
*/
@Parcelize
data class SendUserMobileOTP(
    
    
    
    @SerializedName("mobile")
    var mobile: Double?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PointBlankOtpData
*/
@Parcelize
data class PointBlankOtpData(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendUserMobileOtpResponseSchema
*/
@Parcelize
data class SendUserMobileOtpResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: PointBlankOtpData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpData
*/
@Parcelize
data class VerifyOtpData(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("otp_code")
    var otpCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyMobileOTP
*/
@Parcelize
data class VerifyMobileOTP(
    
    
    
    @SerializedName("otp_data")
    var otpData: VerifyOtpData?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpResponseData
*/
@Parcelize
data class VerifyOtpResponseData(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpResponseSchema
*/
@Parcelize
data class VerifyOtpResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: VerifyOtpResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkReportsDownloadRequestSchema
*/
@Parcelize
data class BulkReportsDownloadRequestSchema(
    
    
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<String>?=null,
    
    @SerializedName("lane_type")
    var laneType: String?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: ArrayList<String>?=null,
    
    @SerializedName("report_type")
    var reportType: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<String>?=null,
    
    @SerializedName("filter_type")
    var filterType: String?=null,
    
    @SerializedName("is_cross_company_enabled")
    var isCrossCompanyEnabled: Boolean?=null,
    
    @SerializedName("custom_filters_for_lane")
    var customFiltersForLane: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkReportsDownloadResponseSchema
*/
@Parcelize
data class BulkReportsDownloadResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: APIFailedResponseSchema
*/
@Parcelize
data class APIFailedResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkStateTransistionRequestSchema
*/
@Parcelize
data class BulkStateTransistionRequestSchema(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkStateTransistionResponseSchema
*/
@Parcelize
data class BulkStateTransistionResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentActionInfo
*/
@Parcelize
data class ShipmentActionInfo(
    
    
    
    @SerializedName("label")
    var label: ArrayList<String>?=null,
    
    @SerializedName("invoice")
    var invoice: ArrayList<String>?=null,
    
    @SerializedName("failed_shipments")
    var failedShipments: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("processing_shipments")
    var processingShipments: ArrayList<String>?=null,
    
    @SerializedName("successful_shipments")
    var successfulShipments: ArrayList<String>?=null,
    
    @SerializedName("invoiceable_shipments")
    var invoiceableShipments: ArrayList<String>?=null,
    
    @SerializedName("failed_invoiced_shipments")
    var failedInvoicedShipments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("processing_invoice_shipments")
    var processingInvoiceShipments: ArrayList<String>?=null,
    
    @SerializedName("successful_invoiced_shipments")
    var successfulInvoicedShipments: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionListingData
*/
@Parcelize
data class BulkActionListingData(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("shipments_action_info")
    var shipmentsActionInfo: ShipmentActionInfo?=null,
    
    @SerializedName("is_invoiceable")
    var isInvoiceable: Boolean?=null,
    
    @SerializedName("user_name")
    var userName: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("invoice_document_type")
    var invoiceDocumentType: String?=null,
    
    @SerializedName("label_document_type")
    var labelDocumentType: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("updated_ts")
    var updatedTs: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("bulk_action_type")
    var bulkActionType: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("invoice_status")
    var invoiceStatus: String?=null,
    
    @SerializedName("do_invoice_label_generated")
    var doInvoiceLabelGenerated: Boolean?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("last_selected_invoice_label_type")
    var lastSelectedInvoiceLabelType: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("uploaded_by")
    var uploadedBy: String?=null,
    
    @SerializedName("invoicelabel_document_type")
    var invoicelabelDocumentType: String?=null,
    
    @SerializedName("failed_sh_count")
    var failedShCount: Int?=null,
    
    @SerializedName("successful_sh_count")
    var successfulShCount: Int?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("failed_shipments")
    var failedShipments: ArrayList<String>?=null,
    
    @SerializedName("successful_invoiced_count")
    var successfulInvoicedCount: Int?=null,
    
    @SerializedName("failed_invoiced_count")
    var failedInvoicedCount: Int?=null,
    
    @SerializedName("total_invoiced_count")
    var totalInvoicedCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListinPage
*/
@Parcelize
data class BulkListinPage(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListingResponseSchema
*/
@Parcelize
data class BulkListingResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<BulkActionListingData>?=null,
    
    @SerializedName("page")
    var page: BulkListinPage?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobDetailsData
*/
@Parcelize
data class JobDetailsData(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("total_shipments_count")
    var totalShipmentsCount: Int?=null,
    
    @SerializedName("successful_shipment_ids")
    var successfulShipmentIds: ArrayList<String>?=null,
    
    @SerializedName("successful_shipments_count")
    var successfulShipmentsCount: Int?=null,
    
    @SerializedName("failed_shipments_count")
    var failedShipmentsCount: Int?=null,
    
    @SerializedName("processing_shipments_count")
    var processingShipmentsCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobDetailsResponseSchema
*/
@Parcelize
data class JobDetailsResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<JobDetailsData>?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("uploaded_by")
    var uploadedBy: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobFailedResponseSchema
*/
@Parcelize
data class JobFailedResponseSchema(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestPageInfo
*/
@Parcelize
data class ManifestPageInfo(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestItemDetails
*/
@Parcelize
data class ManifestItemDetails(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestShipmentListing
*/
@Parcelize
data class ManifestShipmentListing(
    
    
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("page")
    var page: ManifestPageInfo?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<ManifestItemDetails>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DateRange
*/
@Parcelize
data class DateRange(
    
    
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Filters
*/
@Parcelize
data class Filters(
    
    
    
    @SerializedName("date_range")
    var dateRange: DateRange?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("stores")
    var stores: Int?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("dp_ids")
    var dpIds: String?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("selected_shipments")
    var selectedShipments: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("deselected_shipments")
    var deselectedShipments: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestFile
*/
@Parcelize
data class ManifestFile(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("bucket")
    var bucket: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestMediaUpdate
*/
@Parcelize
data class ManifestMediaUpdate(
    
    
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("media_type")
    var mediaType: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("file")
    var file: ManifestFile?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PDFMeta
*/
@Parcelize
data class PDFMeta(
    
    
    
    @SerializedName("consent")
    var consent: String?=null,
    
    @SerializedName("media_updates")
    var mediaUpdates: ArrayList<ManifestMediaUpdate>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TotalShipmentPricesCount
*/
@Parcelize
data class TotalShipmentPricesCount(
    
    
    
    @SerializedName("total_price")
    var totalPrice: Double?=null,
    
    @SerializedName("shipment_count")
    var shipmentCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestMeta
*/
@Parcelize
data class ManifestMeta(
    
    
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("total_shipment_prices_count")
    var totalShipmentPricesCount: TotalShipmentPricesCount?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Manifest
*/
@Parcelize
data class Manifest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("pdf_meta")
    var pdfMeta: PDFMeta?=null,
    
    @SerializedName("meta")
    var meta: ManifestMeta?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestList
*/
@Parcelize
data class ManifestList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Manifest>?=null,
    
    @SerializedName("page")
    var page: ManifestPageInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestDetails
*/
@Parcelize
data class ManifestDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ManifestItemDetails>?=null,
    
    @SerializedName("page")
    var page: ManifestPageInfo?=null,
    
    @SerializedName("additional_shipment_count")
    var additionalShipmentCount: Int?=null,
    
    @SerializedName("manifest_details")
    var manifestDetails: ArrayList<Manifest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FiltersRequestSchema
*/
@Parcelize
data class FiltersRequestSchema(
    
    
    
    @SerializedName("date_range")
    var dateRange: DateRange?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("stores")
    var stores: Int?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("dp_ids")
    var dpIds: Int?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessManifest
*/
@Parcelize
data class ProcessManifest(
    
    
    
    @SerializedName("filters")
    var filters: FiltersRequestSchema?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessManifestResponseSchema
*/
@Parcelize
data class ProcessManifestResponseSchema(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessManifestItemResponseSchema
*/
@Parcelize
data class ProcessManifestItemResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ProcessManifestResponseSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FilterInfoOption
*/
@Parcelize
data class FilterInfoOption(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("placeholder_text")
    var placeholderText: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("min_search_size")
    var minSearchSize: Int?=null,
    
    @SerializedName("show_ui")
    var showUi: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FiltersInfo
*/
@Parcelize
data class FiltersInfo(
    
    
    
    @SerializedName("options")
    var options: ArrayList<FilterInfoOption>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("placeholder_text")
    var placeholderText: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestFiltersResponseSchema
*/
@Parcelize
data class ManifestFiltersResponseSchema(
    
    
    
    @SerializedName("advance_filter")
    var advanceFilter: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("global_filter")
    var globalFilter: ArrayList<FiltersInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PageDetails
*/
@Parcelize
data class PageDetails(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceIrnDetails
*/
@Parcelize
data class EInvoiceIrnDetails(
    
    
    
    @SerializedName("ack_dt")
    var ackDt: String?=null,
    
    @SerializedName("ack_no")
    var ackNo: String?=null,
    
    @SerializedName("irn")
    var irn: String?=null,
    
    @SerializedName("signed_invoice")
    var signedInvoice: String?=null,
    
    @SerializedName("signed_qr_code")
    var signedQrCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceErrorDetails
*/
@Parcelize
data class EInvoiceErrorDetails(
    
    
    
    @SerializedName("error_code")
    var errorCode: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceDetails
*/
@Parcelize
data class EInvoiceDetails(
    
    
    
    @SerializedName("irn_details")
    var irnDetails: EInvoiceIrnDetails?=null,
    
    @SerializedName("error_details")
    var errorDetails: ArrayList<EInvoiceErrorDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceResponseData
*/
@Parcelize
data class EInvoiceResponseData(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("einvoice_type")
    var einvoiceType: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EInvoiceDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceRetry
*/
@Parcelize
data class EInvoiceRetry(
    
    
    
    @SerializedName("shipments_data")
    var shipmentsData: ArrayList<EInvoiceRetryShipmentData>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EInvoiceRetryResponseSchema
*/
@Parcelize
data class EInvoiceRetryResponseSchema(
    
    
    
    @SerializedName("response_data")
    var responseData: ArrayList<EInvoiceResponseData>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EInvoiceErrorInfo
*/
@Parcelize
data class EInvoiceErrorInfo(
    
    
    
    @SerializedName("error_details")
    var errorDetails: ArrayList<EInvoiceErrorDetails>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EInvoiceErrorResponseData
*/
@Parcelize
data class EInvoiceErrorResponseData(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("einvoice_type")
    var einvoiceType: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EInvoiceErrorInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceErrorResponseSchema
*/
@Parcelize
data class EInvoiceErrorResponseSchema(
    
    
    
    @SerializedName("response_data")
    var responseData: ArrayList<EInvoiceErrorResponseData>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceErrorResponseDetails
*/
@Parcelize
data class EInvoiceErrorResponseDetails(
    
    
    
    @SerializedName("response_data")
    var responseData: ArrayList<EInvoiceErrorResponseData>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoiceRetryShipmentData
*/
@Parcelize
data class EInvoiceRetryShipmentData(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("einvoice_type")
    var einvoiceType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerTrackingDetails
*/
@Parcelize
data class CourierPartnerTrackingDetails(
    
    
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("dp_location")
    var dpLocation: String?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("dp_status")
    var dpStatus: String?=null,
    
    @SerializedName("dp_status_updated_at")
    var dpStatusUpdatedAt: String?=null,
    
    @SerializedName("estimated_delivery_date")
    var estimatedDeliveryDate: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("promised_delivery_date")
    var promisedDeliveryDate: String?=null,
    
    @SerializedName("remark")
    var remark: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerTrackingResponseSchema
*/
@Parcelize
data class CourierPartnerTrackingResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerTrackingDetails>?=null,
    
    @SerializedName("page")
    var page: PageDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogsChannelDetails
*/
@Parcelize
data class LogsChannelDetails(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogPaymentDetails
*/
@Parcelize
data class LogPaymentDetails(
    
    
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FailedOrdersItem
*/
@Parcelize
data class FailedOrdersItem(
    
    
    
    @SerializedName("log_id")
    var logId: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("channel")
    var channel: LogsChannelDetails?=null,
    
    @SerializedName("payment")
    var payment: LogPaymentDetails?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("display_message")
    var displayMessage: String?=null,
    
    @SerializedName("method_name")
    var methodName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailedOrderLogs
*/
@Parcelize
data class FailedOrderLogs(
    
    
    
    @SerializedName("items")
    var items: FailedOrdersItem?=null,
    
    @SerializedName("page")
    var page: PageDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FailedOrderLogDetails
*/
@Parcelize
data class FailedOrderLogDetails(
    
    
    
    @SerializedName("error_trace")
    var errorTrace: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateInvoiceIDResponseData
*/
@Parcelize
data class GenerateInvoiceIDResponseData(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateInvoiceIDErrorResponseData
*/
@Parcelize
data class GenerateInvoiceIDErrorResponseData(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenerateInvoiceIDRequestSchema
*/
@Parcelize
data class GenerateInvoiceIDRequestSchema(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GenerateInvoiceIDResponseSchema
*/
@Parcelize
data class GenerateInvoiceIDResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GenerateInvoiceIDResponseData>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GenerateInvoiceIDErrorResponseSchema
*/
@Parcelize
data class GenerateInvoiceIDErrorResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GenerateInvoiceIDErrorResponseData>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ManifestResponseSchema
*/
@Parcelize
data class ManifestResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ManifestItems?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProcessManifestRequestSchema
*/
@Parcelize
data class ProcessManifestRequestSchema(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestItems
*/
@Parcelize
data class ManifestItems(
    
    
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("courier_partner_slug")
    var courierPartnerSlug: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestErrorResponseSchema
*/
@Parcelize
data class ManifestErrorResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigData
*/
@Parcelize
data class ConfigData(
    
    
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null,
    
    @SerializedName("is_upserted")
    var isUpserted: Boolean?=null,
    
    @SerializedName("is_inserted")
    var isInserted: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigUpdatedResponseSchema
*/
@Parcelize
data class ConfigUpdatedResponseSchema(
    
    
    
    @SerializedName("data")
    var data: ArrayList<ConfigData>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FlagData
*/
@Parcelize
data class FlagData(
    
    
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Flags
*/
@Parcelize
data class Flags(
    
    
    
    @SerializedName("allow_partial_transition")
    var allowPartialTransition: ArrayList<FlagData>?=null,
    
    @SerializedName("can_break_entity")
    var canBreakEntity: ArrayList<FlagData>?=null,
    
    @SerializedName("allowed_bag_updates")
    var allowedBagUpdates: ArrayList<FlagData>?=null,
    
    @SerializedName("allowed_bag_status_updates")
    var allowedBagStatusUpdates: ArrayList<FlagData>?=null,
    
    @SerializedName("allowed_entity_updates")
    var allowedEntityUpdates: ArrayList<FlagData>?=null,
    
    @SerializedName("allowed_entity_status_updates")
    var allowedEntityStatusUpdates: ArrayList<FlagData>?=null,
    
    @SerializedName("status_update_type")
    var statusUpdateType: ArrayList<FlagData>?=null,
    
    @SerializedName("is_bag_status_reason_allowed")
    var isBagStatusReasonAllowed: ArrayList<FlagData>?=null,
    
    @SerializedName("is_entity_status_reason_allowed")
    var isEntityStatusReasonAllowed: ArrayList<FlagData>?=null,
    
    @SerializedName("transition_strategy")
    var transitionStrategy: ArrayList<FlagData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Filter
*/
@Parcelize
data class Filter(
    
    
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("is_partial_transition")
    var isPartialTransition: Boolean?=null,
    
    @SerializedName("auto_trigger_dp_assignment_acf")
    var autoTriggerDpAssignmentAcf: Boolean?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("resume_tasks_after_unlock")
    var resumeTasksAfterUnlock: Boolean?=null,
    
    @SerializedName("is_invoice_id_present")
    var isInvoiceIdPresent: Boolean?=null,
    
    @SerializedName("is_credit_note_generated")
    var isCreditNoteGenerated: Boolean?=null,
    
    @SerializedName("fulfill_virtual_invoice")
    var fulfillVirtualInvoice: Boolean?=null,
    
    @SerializedName("next_status")
    var nextStatus: String?=null,
    
    @SerializedName("is_hook_enabled")
    var isHookEnabled: Boolean?=null,
    
    @SerializedName("pos_credit_note_check")
    var posCreditNoteCheck: Boolean?=null,
    
    @SerializedName("order_platform")
    var orderPlatform: String?=null,
    
    @SerializedName("refund_type")
    var refundType: String?=null,
    
    @SerializedName("is_non_pos_platform")
    var isNonPosPlatform: Boolean?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("seller_country_code")
    var sellerCountryCode: String?=null,
    
    @SerializedName("customer_country_code")
    var customerCountryCode: String?=null,
    
    @SerializedName("is_test_order")
    var isTestOrder: Boolean?=null,
    
    @SerializedName("task_trigger_condition")
    var taskTriggerCondition: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PostHook
*/
@Parcelize
data class PostHook(
    
    
    
    @SerializedName("task")
    var task: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: Filter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PreHook
*/
@Parcelize
data class PreHook(
    
    
    
    @SerializedName("task")
    var task: String?=null,
    
    @SerializedName("kwargs")
    var kwargs: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: Filter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Config
*/
@Parcelize
data class Config(
    
    
    
    @SerializedName("from_state")
    var fromState: String?=null,
    
    @SerializedName("to_state")
    var toState: String?=null,
    
    @SerializedName("pre_hooks")
    var preHooks: ArrayList<PreHook>?=null,
    
    @SerializedName("post_hooks")
    var postHooks: ArrayList<PostHook>?=null,
    
    @SerializedName("flags")
    var flags: Flags?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransitionConfigCondition
*/
@Parcelize
data class TransitionConfigCondition(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("entity")
    var entity: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransitionConfigData
*/
@Parcelize
data class TransitionConfigData(
    
    
    
    @SerializedName("conditions")
    var conditions: TransitionConfigCondition?=null,
    
    @SerializedName("configs")
    var configs: ArrayList<Config>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransitionConfigPayload
*/
@Parcelize
data class TransitionConfigPayload(
    
    
    
    @SerializedName("data")
    var data: TransitionConfigData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RuleListRequestSchema
*/
@Parcelize
data class RuleListRequestSchema(
    
    
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("channel")
    var channel: ArrayList<String>?=null,
    
    @SerializedName("department")
    var department: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleErrorResponseSchema
*/
@Parcelize
data class RuleErrorResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RMAPageInfo
*/
@Parcelize
data class RMAPageInfo(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleAction
*/
@Parcelize
data class RuleAction(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reason>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: QuestionSetItem
*/
@Parcelize
data class QuestionSetItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Reason
*/
@Parcelize
data class Reason(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reason>?=null,
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Conditions
*/
@Parcelize
data class Conditions(
    
    
    
    @SerializedName("department")
    var department: String?=null,
    
    @SerializedName("l3")
    var l3: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RuleItem
*/
@Parcelize
data class RuleItem(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("channel")
    var channel: String?=null,
    
    @SerializedName("actions")
    var actions: RuleAction?=null,
    
    @SerializedName("qc_enabled")
    var qcEnabled: Boolean?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("conditions")
    var conditions: Conditions?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rule_type")
    var ruleType: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleError
*/
@Parcelize
data class RuleError(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleListResponseSchema
*/
@Parcelize
data class RuleListResponseSchema(
    
    
    
    @SerializedName("page")
    var page: RMAPageInfo?=null,
    
    @SerializedName("items")
    var items: ArrayList<RuleItem>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: RuleError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentPaymentMode
*/
@Parcelize
data class UpdateShipmentPaymentMode(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductSchema>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethodSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommonErrorResponseSchema
*/
@Parcelize
data class CommonErrorResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExceptionErrorResponseSchema
*/
@Parcelize
data class ExceptionErrorResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSchema
*/
@Parcelize
data class ProductSchema(
    
    
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethodSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodSchema
*/
@Parcelize
data class PaymentMethodSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("meta")
    var meta: PaymentMetaDataSchema?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("action")
    var action: ActionDetailSchema?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActionDetailSchema
*/
@Parcelize
data class ActionDetailSchema(
    
    
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("current_mode")
    var currentMode: String?=null,
    
    @SerializedName("current_identifier")
    var currentIdentifier: String?=null,
    
    @SerializedName("refund_to")
    var refundTo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMetaDataSchema
*/
@Parcelize
data class PaymentMetaDataSchema(
    
    
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentMetaLogoURLSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMetaLogoURLSchema
*/
@Parcelize
data class PaymentMetaLogoURLSchema(
    
    
    
    @SerializedName("large")
    var large: String?=null,
    
    @SerializedName("small")
    var small: String?=null
    
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
    Model: BagReasonMeta
*/
@Parcelize
data class BagReasonMeta(
    
    
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: QuestionSet
*/
@Parcelize
data class QuestionSet(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BagReasons
*/
@Parcelize
data class BagReasons(
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: BagReasonMeta?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentBagReasons
*/
@Parcelize
data class ShipmentBagReasons(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("rule_id")
    var ruleId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status_created_at")
    var statusCreatedAt: String?=null,
    
    @SerializedName("updated_ts")
    var updatedTs: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDataInfo
*/
@Parcelize
data class UserDataInfo(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("user_oid")
    var userOid: String?=null,
    
    @SerializedName("mongo_user_id")
    var mongoUserId: String?=null,
    
    @SerializedName("external_customer_id")
    var externalCustomerId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("meta")
    var meta: String?=null,
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("longitude")
    var longitude: Int?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("latitude")
    var latitude: Int?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentListingChannel
*/
@Parcelize
data class ShipmentListingChannel(
    
    
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null,
    
    @SerializedName("is_affiliate")
    var isAffiliate: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("pm_price_split")
    var pmPriceSplit: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gift_price")
    var giftPrice: Double?=null,
    
    @SerializedName("amount_to_be_collected")
    var amountToBeCollected: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeDistributionSchema
*/
@Parcelize
data class ChargeDistributionSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logic")
    var logic: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeDistributionLogic
*/
@Parcelize
data class ChargeDistributionLogic(
    
    
    
    @SerializedName("distribution")
    var distribution: ChargeDistributionSchema?=null,
    
    @SerializedName("distribution_level")
    var distributionLevel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeAmountCurrency
*/
@Parcelize
data class ChargeAmountCurrency(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeAmount
*/
@Parcelize
data class ChargeAmount(
    
    
    
    @SerializedName("base_currency")
    var baseCurrency: ChargeAmountCurrency?=null,
    
    @SerializedName("ordering_currency")
    var orderingCurrency: ChargeAmountCurrency?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentCharge
*/
@Parcelize
data class PriceAdjustmentCharge(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("amount")
    var amount: ChargeAmount?=null,
    
    @SerializedName("distribution_logic")
    var distributionLogic: ChargeDistributionLogic?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingCurrencyPrices
*/
@Parcelize
data class OrderingCurrencyPrices(
    
    
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("pm_price_split")
    var pmPriceSplit: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gift_price")
    var giftPrice: Double?=null,
    
    @SerializedName("amount_to_be_collected")
    var amountToBeCollected: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("alu")
    var alu: String?=null,
    
    @SerializedName("ean")
    var ean: String?=null,
    
    @SerializedName("sku_code")
    var skuCode: String?=null,
    
    @SerializedName("upc")
    var upc: String?=null,
    
    @SerializedName("isbn")
    var isbn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("amount_to_be_collected")
    var amountToBeCollected: Double?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GSTDetailsData
*/
@Parcelize
data class GSTDetailsData(
    
    
    
    @SerializedName("cgst_tax_percentage")
    var cgstTaxPercentage: Double?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("igst_tax_percentage")
    var igstTaxPercentage: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("igst_gst_fee")
    var igstGstFee: Double?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("sgst_gst_fee")
    var sgstGstFee: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("cgst_gst_fee")
    var cgstGstFee: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("sgst_tax_percentage")
    var sgstTaxPercentage: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStatusHistory
*/
@Parcelize
data class BagStatusHistory(
    
    
    
    @SerializedName("forward")
    var forward: Boolean?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("bsh_id")
    var bshId: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_ts")
    var updatedTs: String?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dimensions
*/
@Parcelize
data class Dimensions(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("length")
    var length: Double?=null
    
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
    var time: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("shipping")
    var shipping: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dimensions")
    var dimensions: Dimensions?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("esp_modified")
    var espModified: Boolean?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentListingBrand
*/
@Parcelize
data class ShipmentListingBrand(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo_base64")
    var logoBase64: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReplacementDetails
*/
@Parcelize
data class ReplacementDetails(
    
    
    
    @SerializedName("replacement_type")
    var replacementType: String?=null,
    
    @SerializedName("original_affiliate_order_id")
    var originalAffiliateOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    
    
    @SerializedName("order_item_id")
    var orderItemId: String?=null,
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("replacement_details")
    var replacementDetails: ReplacementDetails?=null,
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null,
    
    @SerializedName("marketplace_invoice_id")
    var marketplaceInvoiceId: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    
    @SerializedName("is_serial_number_required")
    var isSerialNumberRequired: Boolean?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("customer_selling_price")
    var customerSellingPrice: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformArticleAttributes
*/
@Parcelize
data class PlatformArticleAttributes(
    
    
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformItem
*/
@Parcelize
data class PlatformItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("attributes")
    var attributes: PlatformArticleAttributes?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("branch_url")
    var branchUrl: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dates
*/
@Parcelize
data class Dates(
    
    
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("order_created")
    var orderCreated: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BagReturnableCancelableStatus
*/
@Parcelize
data class BagReturnableCancelableStatus(
    
    
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagUnit
*/
@Parcelize
data class BagUnit(
    
    
    
    @SerializedName("bag_type")
    var bagType: String?=null,
    
    @SerializedName("gst")
    var gst: GSTDetailsData?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("bag_expiry_date")
    var bagExpiryDate: String?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("brand")
    var brand: ShipmentListingBrand?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("product_quantity")
    var productQuantity: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null,
    
    @SerializedName("dates")
    var dates: Dates?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentItemFulFillingStore
*/
@Parcelize
data class ShipmentItemFulFillingStore(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingCurrency
*/
@Parcelize
data class OrderingCurrency(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_name")
    var currencyName: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_sub_unit")
    var currencySubUnit: String?=null
    
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
    var rates: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyInfo
*/
@Parcelize
data class CurrencyInfo(
    
    
    
    @SerializedName("ordering_currency")
    var orderingCurrency: OrderingCurrency?=null,
    
    @SerializedName("conversion_rate")
    var conversionRate: ConversionRate?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentItem
*/
@Parcelize
data class ShipmentItem(
    
    
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("order_created_ts")
    var orderCreatedTs: String?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("estimated_sla_time")
    var estimatedSlaTime: String?=null,
    
    @SerializedName("estimated_sla_ts")
    var estimatedSlaTs: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: Address?=null,
    
    @SerializedName("billing_address")
    var billingAddress: Address?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channel")
    var channel: ShipmentListingChannel?=null,
    
    @SerializedName("previous_shipment_id")
    var previousShipmentId: String?=null,
    
    @SerializedName("forward_end_shipment_id")
    var forwardEndShipmentId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("status_created_at")
    var statusCreatedAt: String?=null,
    
    @SerializedName("status_created_ts")
    var statusCreatedTs: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<BagUnit>?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: ShipmentItemFulFillingStore?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("can_process")
    var canProcess: Boolean?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("ordering_channnel")
    var orderingChannnel: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("customer_note")
    var customerNote: String?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("shipment_created_ts")
    var shipmentCreatedTs: String?=null,
    
    @SerializedName("currency")
    var currency: Currency?=null,
    
    @SerializedName("currency_info")
    var currencyInfo: CurrencyInfo?=null,
    
    @SerializedName("is_lapa_enabled")
    var isLapaEnabled: Boolean?=null,
    
    @SerializedName("logistics_meta")
    var logisticsMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInternalPlatformViewResponseSchema
*/
@Parcelize
data class ShipmentInternalPlatformViewResponseSchema(
    
    
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<ShipmentItem>?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TrackingList
*/
@Parcelize
data class TrackingList(
    
    
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceInfo
*/
@Parcelize
data class InvoiceInfo(
    
    
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    
    @SerializedName("external_invoice_id")
    var externalInvoiceId: String?=null,
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("links")
    var links: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetailsData
*/
@Parcelize
data class OrderDetailsData(
    
    
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_value")
    var orderValue: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetailsData
*/
@Parcelize
data class UserDetailsData(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneDetails
*/
@Parcelize
data class PhoneDetails(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ContactDetails
*/
@Parcelize
data class ContactDetails(
    
    
    
    @SerializedName("phone")
    var phone: ArrayList<PhoneDetails>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDetails
*/
@Parcelize
data class CompanyDetails(
    
    
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_cin")
    var companyCin: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("company_gst")
    var companyGst: String?=null,
    
    @SerializedName("company_contact")
    var companyContact: ContactDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStoreDetails
*/
@Parcelize
data class OrderingStoreDetails(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPDetailsData
*/
@Parcelize
data class DPDetailsData(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuyerDetails
*/
@Parcelize
data class BuyerDetails(
    
    
    
    @SerializedName("ajio_site_id")
    var ajioSiteId: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DebugInfo
*/
@Parcelize
data class DebugInfo(
    
    
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EinvoiceInfo
*/
@Parcelize
data class EinvoiceInfo(
    
    
    
    @SerializedName("credit_note")
    var creditNote: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTags
*/
@Parcelize
data class ShipmentTags(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LockData
*/
@Parcelize
data class LockData(
    
    
    
    @SerializedName("locked")
    var locked: Boolean?=null,
    
    @SerializedName("mto")
    var mto: Boolean?=null,
    
    @SerializedName("lock_message")
    var lockMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTimeStamp
*/
@Parcelize
data class ShipmentTimeStamp(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("estimated_delivery_date")
    var estimatedDeliveryDate: String?=null,
    
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    
    @SerializedName("b2b_buyer_details")
    var b2BBuyerDetails: BuyerDetails?=null,
    
    @SerializedName("formatted")
    var formatted: Formatted?=null,
    
    @SerializedName("debug_info")
    var debugInfo: DebugInfo?=null,
    
    @SerializedName("return_awb_number")
    var returnAwbNumber: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("return_affiliate_shipment_id")
    var returnAffiliateShipmentId: String?=null,
    
    @SerializedName("parent_dp_id")
    var parentDpId: String?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("dimension")
    var dimension: Dimensions?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("store_invoice_updated_date")
    var storeInvoiceUpdatedDate: String?=null,
    
    @SerializedName("forward_affiliate_shipment_id")
    var forwardAffiliateShipmentId: String?=null,
    
    @SerializedName("return_store_node")
    var returnStoreNode: Int?=null,
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("shipment_tags")
    var shipmentTags: ArrayList<ShipmentTags>?=null,
    
    @SerializedName("external")
    var external: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("lock_data")
    var lockData: LockData?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ewaybill_info")
    var ewaybillInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    
    @SerializedName("return_details")
    var returnDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("packaging_name")
    var packagingName: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: ShipmentTimeStamp?=null,
    
    @SerializedName("auto_trigger_dp_assignment_acf")
    var autoTriggerDpAssignmentAcf: Boolean?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("po_number")
    var poNumber: String?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("b2c_buyer_details")
    var b2CBuyerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("forward_affiliate_order_id")
    var forwardAffiliateOrderId: String?=null,
    
    @SerializedName("return_affiliate_order_id")
    var returnAffiliateOrderId: String?=null,
    
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("refund_to")
    var refundTo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PDFLinks
*/
@Parcelize
data class PDFLinks(
    
    
    
    @SerializedName("invoice_type")
    var invoiceType: String?=null,
    
    @SerializedName("label_a6")
    var labelA6: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("label_pos")
    var labelPos: String?=null,
    
    @SerializedName("invoice_a6")
    var invoiceA6: String?=null,
    
    @SerializedName("b2b")
    var b2B: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("label_a4")
    var labelA4: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("invoice_export")
    var invoiceExport: String?=null,
    
    @SerializedName("credit_note_url")
    var creditNoteUrl: String?=null,
    
    @SerializedName("delivery_challan_a4")
    var deliveryChallanA4: String?=null,
    
    @SerializedName("label_export")
    var labelExport: String?=null,
    
    @SerializedName("invoice_a4")
    var invoiceA4: String?=null,
    
    @SerializedName("invoice_pos")
    var invoicePos: String?=null,
    
    @SerializedName("po_invoice")
    var poInvoice: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateDetails
*/
@Parcelize
data class AffiliateDetails(
    
    
    
    @SerializedName("shipment_meta")
    var shipmentMeta: ShipmentMeta?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("company_affiliate_tag")
    var companyAffiliateTag: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: PDFLinks?=null,
    
    @SerializedName("config")
    var config: AffiliateConfig?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagConfigs
*/
@Parcelize
data class BagConfigs(
    
    
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("allow_force_return")
    var allowForceReturn: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBagArticle
*/
@Parcelize
data class OrderBagArticle(
    
    
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBrandName
*/
@Parcelize
data class OrderBrandName(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateBagsDetails
*/
@Parcelize
data class AffiliateBagsDetails(
    
    
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagPaymentMethods
*/
@Parcelize
data class BagPaymentMethods(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRules
*/
@Parcelize
data class DiscountRules(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemCriterias
*/
@Parcelize
data class ItemCriterias(
    
    
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BuyRules
*/
@Parcelize
data class BuyRules(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriterias?=null,
    
    @SerializedName("cart_conditions")
    var cartConditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PriceMinMax
*/
@Parcelize
data class PriceMinMax(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemPriceDetails
*/
@Parcelize
data class ItemPriceDetails(
    
    
    
    @SerializedName("marked")
    var marked: PriceMinMax?=null,
    
    @SerializedName("effective")
    var effective: PriceMinMax?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItems
*/
@Parcelize
data class FreeGiftItems(
    
    
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: ItemPriceDetails?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromos
*/
@Parcelize
data class AppliedPromos(
    
    
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRules>?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBags
*/
@Parcelize
data class OrderBags(
    
    
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: FinancialBreakup?=null,
    
    @SerializedName("bag_configs")
    var bagConfigs: BagConfigs?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: Address?=null,
    
    @SerializedName("article")
    var article: OrderBagArticle?=null,
    
    @SerializedName("brand")
    var brand: OrderBrandName?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagsDetails?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<BagPaymentMethods>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: ArrayList<BagPaymentMethods>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<PriceAdjustmentCharge>?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("is_parent")
    var isParent: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPayments
*/
@Parcelize
data class ShipmentPayments(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatusData
*/
@Parcelize
data class ShipmentStatusData(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    
    @SerializedName("status_created_at")
    var statusCreatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentLockDetails
*/
@Parcelize
data class ShipmentLockDetails(
    
    
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("lock_message")
    var lockMessage: String?=null,
    
    @SerializedName("action_to_status")
    var actionToStatus: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipment
*/
@Parcelize
data class PlatformShipment(
    
    
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("invoice")
    var invoice: InvoiceInfo?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null,
    
    @SerializedName("order_status")
    var orderStatus: OrderStatusData?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: Boolean?=null,
    
    @SerializedName("custom_message")
    var customMessage: String?=null,
    
    @SerializedName("estimated_sla_time")
    var estimatedSlaTime: String?=null,
    
    @SerializedName("estimated_sla_ts")
    var estimatedSlaTs: String?=null,
    
    @SerializedName("can_update_dimension")
    var canUpdateDimension: Boolean?=null,
    
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_details")
    var billingDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("forward_shipment_id")
    var forwardShipmentId: String?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("shipment_details")
    var shipmentDetails: ShipmentLockDetails?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("company_details")
    var companyDetails: CompanyDetails?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: OrderingStoreDetails?=null,
    
    @SerializedName("order_platform")
    var orderPlatform: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetailsData?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("is_dp_assign_enabled")
    var isDpAssignEnabled: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<OrderBags>?=null,
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<PriceAdjustmentCharge>?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("shipment_created_ts")
    var shipmentCreatedTs: String?=null,
    
    @SerializedName("currency")
    var currency: Currency?=null,
    
    @SerializedName("currency_info")
    var currencyInfo: CurrencyInfo?=null,
    
    @SerializedName("previous_shipment_id")
    var previousShipmentId: String?=null,
    
    @SerializedName("shipment_update_time")
    var shipmentUpdateTime: Double?=null,
    
    @SerializedName("rto_address")
    var rtoAddress: Address?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("is_lapa_enabled")
    var isLapaEnabled: Boolean?=null,
    
    @SerializedName("forward_end_shipment_id")
    var forwardEndShipmentId: String?=null,
    
    @SerializedName("logistics_meta")
    var logisticsMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInfoResponseSchema
*/
@Parcelize
data class ShipmentInfoResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxDetails
*/
@Parcelize
data class TaxDetails(
    
    
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInfoData
*/
@Parcelize
data class PaymentInfoData(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("collected")
    var collected: Boolean?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencySchema
*/
@Parcelize
data class CurrencySchema(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderData
*/
@Parcelize
data class OrderData(
    
    
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("created_ts")
    var createdTs: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: TaxDetails?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<PriceAdjustmentCharge>?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: ArrayList<PaymentInfoData>?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencySchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetailsResponseSchema
*/
@Parcelize
data class OrderDetailsResponseSchema(
    
    
    
    @SerializedName("order")
    var order: OrderData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubLane
*/
@Parcelize
data class SubLane(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("actions")
    var actions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("index")
    var index: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuperLane
*/
@Parcelize
data class SuperLane(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<SubLane>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LaneConfigResponseSchema
*/
@Parcelize
data class LaneConfigResponseSchema(
    
    
    
    @SerializedName("super_lanes")
    var superLanes: ArrayList<SuperLane>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformBreakupValues
*/
@Parcelize
data class PlatformBreakupValues(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformChannel
*/
@Parcelize
data class PlatformChannel(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOrderItems
*/
@Parcelize
data class PlatformOrderItems(
    
    
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<PlatformBreakupValues>?=null,
    
    @SerializedName("total_order_value")
    var totalOrderValue: Double?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("order_created_ts")
    var orderCreatedTs: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("channel")
    var channel: PlatformChannel?=null,
    
    @SerializedName("user_info")
    var userInfo: UserDataInfo?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("currency")
    var currency: Currency?=null,
    
    @SerializedName("currency_info")
    var currencyInfo: CurrencyInfo?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("ordering_currency_prices")
    var orderingCurrencyPrices: OrderingCurrencyPrices?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderListingResponseSchema
*/
@Parcelize
data class OrderListingResponseSchema(
    
    
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<PlatformOrderItems>?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformTrack
*/
@Parcelize
data class PlatformTrack(
    
    
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("raw_status")
    var rawStatus: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("account_name")
    var accountName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentTrack
*/
@Parcelize
data class PlatformShipmentTrack(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("results")
    var results: ArrayList<PlatformTrack>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AdvanceFilterInfo
*/
@Parcelize
data class AdvanceFilterInfo(
    
    
    
    @SerializedName("returned")
    var returned: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("action_centre")
    var actionCentre: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("unfulfilled")
    var unfulfilled: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("processed")
    var processed: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FiltersResponseSchema
*/
@Parcelize
data class FiltersResponseSchema(
    
    
    
    @SerializedName("advance")
    var advance: AdvanceFilterInfo?=null,
    
    @SerializedName("global_1")
    var global1: FiltersInfo?=null,
    
    @SerializedName("advance_filter")
    var advanceFilter: AdvanceFilterInfo?=null,
    
    @SerializedName("global_filter")
    var globalFilter: ArrayList<FiltersInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: URL
*/
@Parcelize
data class URL(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FileResponseSchema
*/
@Parcelize
data class FileResponseSchema(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("cdn")
    var cdn: URL?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionTemplate
*/
@Parcelize
data class BulkActionTemplate(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionTemplateResponseSchema
*/
@Parcelize
data class BulkActionTemplateResponseSchema(
    
    
    
    @SerializedName("template_x_slug")
    var templateXSlug: ArrayList<BulkActionTemplate>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentReasonsResponseSchema
*/
@Parcelize
data class PlatformShipmentReasonsResponseSchema(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reason>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponseReasons
*/
@Parcelize
data class ShipmentResponseReasons(
    
    
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentReasonsResponseSchema
*/
@Parcelize
data class ShipmentReasonsResponseSchema(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<ShipmentResponseReasons>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAddress
*/
@Parcelize
data class StoreAddress(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("state")
    var state: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoicePortalDetails
*/
@Parcelize
data class EInvoicePortalDetails(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreEinvoice
*/
@Parcelize
data class StoreEinvoice(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreEwaybill
*/
@Parcelize
data class StoreEwaybill(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StoreGstCredentials
*/
@Parcelize
data class StoreGstCredentials(
    
    
    
    @SerializedName("e_invoice")
    var eInvoice: StoreEinvoice?=null,
    
    @SerializedName("e_waybill")
    var eWaybill: StoreEwaybill?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDocuments
*/
@Parcelize
data class StoreDocuments(
    
    
    
    @SerializedName("gst")
    var gst: Document?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("timing")
    var timing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("ewaybill_portal_details")
    var ewaybillPortalDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_portal_details")
    var einvoicePortalDetails: EInvoicePortalDetails?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: StoreGstCredentials?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("documents")
    var documents: StoreDocuments?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("alohomora_user_id")
    var alohomoraUserId: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("mall_area")
    var mallArea: String?=null,
    
    @SerializedName("vat_no")
    var vatNo: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("display_address")
    var displayAddress: String?=null,
    
    @SerializedName("store_active_from")
    var storeActiveFrom: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("parent_store_id")
    var parentStoreId: Int?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddress?=null,
    
    @SerializedName("meta")
    var meta: StoreMeta?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("login_username")
    var loginUsername: String?=null,
    
    @SerializedName("mall_name")
    var mallName: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("credit_note_expiry_days")
    var creditNoteExpiryDays: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("invoice_prefix")
    var invoicePrefix: String?=null,
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    
    @SerializedName("script_last_ran")
    var scriptLastRan: String?=null,
    
    @SerializedName("pickup_location")
    var pickupLocation: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("webstore_product_url")
    var webstoreProductUrl: String?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l1_category_id")
    var l1CategoryId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("branch_url")
    var branchUrl: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("l2_category_id")
    var l2CategoryId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleStatusDetails
*/
@Parcelize
data class ArticleStatusDetails(
    
    
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Company
*/
@Parcelize
data class Company(
    
    
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("agreement_start_date")
    var agreementStartDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentGstDetails
*/
@Parcelize
data class ShipmentGstDetails(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliverySlotDetails
*/
@Parcelize
data class DeliverySlotDetails(
    
    
    
    @SerializedName("slot")
    var slot: String?=null,
    
    @SerializedName("upper_bound")
    var upperBound: String?=null,
    
    @SerializedName("lower_bound")
    var lowerBound: String?=null,
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetails
*/
@Parcelize
data class InvoiceDetails(
    
    
    
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("label_url")
    var labelUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetails
*/
@Parcelize
data class UserDetails(
    
    
    
    @SerializedName("user_oid")
    var userOid: String?=null,
    
    @SerializedName("external_customer_id")
    var externalCustomerId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("mongo_user_id")
    var mongoUserId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WeightData
*/
@Parcelize
data class WeightData(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BagDetails
*/
@Parcelize
data class BagDetails(
    
    
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("article_details")
    var articleDetails: ArticleStatusDetails?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("company")
    var company: Company?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("dates")
    var dates: Dates?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: Address?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: DeliverySlotDetails?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("fallback_user")
    var fallbackUser: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: Store?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null,
    
    @SerializedName("invoice")
    var invoice: InvoiceDetails?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("order")
    var order: OrderDetails?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<PriceAdjustmentCharge>?=null,
    
    @SerializedName("qc_required")
    var qcRequired: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Double?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rto_address")
    var rtoAddress: Address?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("shipment")
    var shipment: Shipment?=null,
    
    @SerializedName("shipment_details")
    var shipmentDetails: ShipmentDetails?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("shipment_gst")
    var shipmentGst: ShipmentGstDetails?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatusData?=null,
    
    @SerializedName("shipment_status_history")
    var shipmentStatusHistory: ArrayList<ShipmentStatusData>?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("user")
    var user: UserDetails?=null,
    
    @SerializedName("weight")
    var weight: WeightData?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagDetailsPlatformResponseSchema
*/
@Parcelize
data class BagDetailsPlatformResponseSchema(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("data")
    var data: BagDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BagsPage
*/
@Parcelize
data class BagsPage(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagData
*/
@Parcelize
data class BagData(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BagDetails>?=null,
    
    @SerializedName("page")
    var page: BagsPage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetBagsPlatformResponseSchema
*/
@Parcelize
data class GetBagsPlatformResponseSchema(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("data")
    var data: BagData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GeneratePosOrderReceiptResponseSchema
*/
@Parcelize
data class GeneratePosOrderReceiptResponseSchema(
    
    
    
    @SerializedName("customer_cn_receipt")
    var customerCnReceipt: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("invoice_receipt")
    var invoiceReceipt: String?=null,
    
    @SerializedName("payment_receipt")
    var paymentReceipt: String?=null,
    
    @SerializedName("merchant_cn_receipt")
    var merchantCnReceipt: String?=null,
    
    @SerializedName("payment_receipt_template")
    var paymentReceiptTemplate: String?=null,
    
    @SerializedName("customer_cn_receipt_template")
    var customerCnReceiptTemplate: String?=null,
    
    @SerializedName("invoice_receipt_template")
    var invoiceReceiptTemplate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Templates
*/
@Parcelize
data class Templates(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AllowedTemplatesResponseSchema
*/
@Parcelize
data class AllowedTemplatesResponseSchema(
    
    
    
    @SerializedName("template_x_slug")
    var templateXSlug: ArrayList<Templates>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TemplateDownloadResponseSchema
*/
@Parcelize
data class TemplateDownloadResponseSchema(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkFailedResponseSchema
*/
@Parcelize
data class BulkFailedResponseSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





