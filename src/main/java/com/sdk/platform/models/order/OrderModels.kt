package com.sdk.platform.models.order

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ShipmentItemFulFillingStore
*/
@Parcelize
data class ShipmentItemFulFillingStore(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformItem
*/
@Parcelize
data class PlatformItem(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GSTDetailsData
*/
@Parcelize
data class GSTDetailsData(
    
    
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagUnit
*/
@Parcelize
data class BagUnit(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("item_quantity")
    var itemQuantity: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("gst")
    var gst: GSTDetailsData?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    
    @SerializedName("ops_status")
    var opsStatus: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("hex_code")
    var hexCode: String?=null,
    
    @SerializedName("actual_status")
    var actualStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDataInfo
*/
@Parcelize
data class UserDataInfo(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("avis_user_id")
    var avisUserId: String?=null,
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeInfo
*/
@Parcelize
data class PaymentModeInfo(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentItem
*/
@Parcelize
data class ShipmentItem(
    
    
    
    @SerializedName("channel")
    var channel: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: ShipmentItemFulFillingStore?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<BagUnit>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("sla")
    var sla: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_bags_count")
    var totalBagsCount: Int?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("fulfilling_centre")
    var fulfillingCentre: String?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_mode_info")
    var paymentModeInfo: PaymentModeInfo?=null,
    
    @SerializedName("application")
    var application: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FilterInfoOption
*/
@Parcelize
data class FilterInfoOption(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FiltersInfo
*/
@Parcelize
data class FiltersInfo(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<FilterInfoOption>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInternalPlatformViewResponse
*/
@Parcelize
data class ShipmentInternalPlatformViewResponse(
    
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ShipmentItem>?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<FiltersInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBagArticle
*/
@Parcelize
data class OrderBagArticle(
    
    
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagGST
*/
@Parcelize
data class BagGST(
    
    
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    
    @SerializedName("bs_id")
    var bsId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("current_status_id")
    var currentStatusId: Int?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRules
*/
@Parcelize
data class DiscountRules(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: Int?=null
    
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
    Model: AppliedPromos
*/
@Parcelize
data class AppliedPromos(
    
    
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRules>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBrandName
*/
@Parcelize
data class OrderBrandName(
    
    
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformDeliveryAddress
*/
@Parcelize
data class PlatformDeliveryAddress(
    
    
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("latitude")
    var latitude: Int?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("longitude")
    var longitude: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("discount")
    var discount: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Int?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagConfigs
*/
@Parcelize
data class BagConfigs(
    
    
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_force_return")
    var allowForceReturn: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBags
*/
@Parcelize
data class OrderBags(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("article")
    var article: OrderBagArticle?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGST?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("brand")
    var brand: OrderBrandName?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: FinancialBreakup?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("bag_configs")
    var bagConfigs: BagConfigs?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetailsData
*/
@Parcelize
data class OrderDetailsData(
    
    
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_value")
    var orderValue: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null,
    
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("order_item_id")
    var orderItemId: String?=null
    
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
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    
    @SerializedName("f_min")
    var fMin: String?=null,
    
    @SerializedName("f_max")
    var fMax: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTimeStamp
*/
@Parcelize
data class ShipmentTimeStamp(
    
    
    
    @SerializedName("t_min")
    var tMin: String?=null,
    
    @SerializedName("t_max")
    var tMax: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BuyerDetails
*/
@Parcelize
data class BuyerDetails(
    
    
    
    @SerializedName("ajio_site_id")
    var ajioSiteId: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EinvoiceInfo
*/
@Parcelize
data class EinvoiceInfo(
    
    
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("credit_note")
    var creditNote: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LockData
*/
@Parcelize
data class LockData(
    
    
    
    @SerializedName("locked")
    var locked: Boolean?=null,
    
    @SerializedName("lock_message")
    var lockMessage: String?=null,
    
    @SerializedName("mto")
    var mto: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    
    @SerializedName("packaging_name")
    var packagingName: String?=null,
    
    @SerializedName("debug_info")
    var debugInfo: DebugInfo?=null,
    
    @SerializedName("external")
    var external: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("formatted")
    var formatted: Formatted?=null,
    
    @SerializedName("timestamp")
    var timestamp: ShipmentTimeStamp?=null,
    
    @SerializedName("return_awb_number")
    var returnAwbNumber: String?=null,
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("auto_trigger_dp_assignment_acf")
    var autoTriggerDpAssignmentAcf: Boolean?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("po_number")
    var poNumber: String?=null,
    
    @SerializedName("return_affiliate_order_id")
    var returnAffiliateOrderId: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("ewaybill_info")
    var ewaybillInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("b2b_buyer_details")
    var b2BBuyerDetails: BuyerDetails?=null,
    
    @SerializedName("return_store_node")
    var returnStoreNode: Int?=null,
    
    @SerializedName("forward_affiliate_shipment_id")
    var forwardAffiliateShipmentId: String?=null,
    
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("store_invoice_updated_date")
    var storeInvoiceUpdatedDate: String?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("forward_affiliate_order_id")
    var forwardAffiliateOrderId: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("return_affiliate_shipment_id")
    var returnAffiliateShipmentId: String?=null,
    
    @SerializedName("lock_data")
    var lockData: LockData?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("return_details")
    var returnDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("b2c_buyer_details")
    var b2CBuyerDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PDFLinks
*/
@Parcelize
data class PDFLinks(
    
    
    
    @SerializedName("invoice_a4")
    var invoiceA4: String?=null,
    
    @SerializedName("invoice_a6")
    var invoiceA6: String?=null,
    
    @SerializedName("invoice_pos")
    var invoicePos: String?=null,
    
    @SerializedName("label_a4")
    var labelA4: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("po_invoice")
    var poInvoice: String?=null,
    
    @SerializedName("delivery_challan_a4")
    var deliveryChallanA4: String?=null,
    
    @SerializedName("label_a6")
    var labelA6: String?=null,
    
    @SerializedName("label_pos")
    var labelPos: String?=null,
    
    @SerializedName("credit_note_url")
    var creditNoteUrl: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("invoice_type")
    var invoiceType: String?=null,
    
    @SerializedName("b2b")
    var b2B: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateDetails
*/
@Parcelize
data class AffiliateDetails(
    
    
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("shipment_meta")
    var shipmentMeta: ShipmentMeta?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("ad_id")
    var adId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: PDFLinks?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("company_affiliate_tag")
    var companyAffiliateTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneDetails
*/
@Parcelize
data class PhoneDetails(
    
    
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
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
    
    
    
    @SerializedName("company_cin")
    var companyCin: String?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_contact")
    var companyContact: ContactDetails?=null,
    
    @SerializedName("company_gst")
    var companyGst: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStatusHistory
*/
@Parcelize
data class BagStatusHistory(
    
    
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("forward")
    var forward: Boolean?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("bsh_id")
    var bshId: Int?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetailsData
*/
@Parcelize
data class UserDetailsData(
    
    
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dimensions
*/
@Parcelize
data class Dimensions(
    
    
    
    @SerializedName("width")
    var width: Int?=null,
    
    @SerializedName("length")
    var length: Int?=null,
    
    @SerializedName("height")
    var height: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("dimension")
    var dimension: Dimensions?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TrackingList
*/
@Parcelize
data class TrackingList(
    
    
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("time")
    var time: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStoreDetails
*/
@Parcelize
data class OrderingStoreDetails(
    
    
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("ordering_store_id")
    var orderingStoreId: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPDetailsData
*/
@Parcelize
data class DPDetailsData(
    
    
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPayments
*/
@Parcelize
data class ShipmentPayments(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatusData
*/
@Parcelize
data class ShipmentStatusData(
    
    
    
    @SerializedName("bag_list")
    var bagList: ArrayList<String>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceInfo
*/
@Parcelize
data class InvoiceInfo(
    
    
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipment
*/
@Parcelize
data class PlatformShipment(
    
    
    
    @SerializedName("bags")
    var bags: ArrayList<OrderBags>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: Boolean?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("company_details")
    var companyDetails: CompanyDetails?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: String?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("forward_shipment_id")
    var forwardShipmentId: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: String?=null,
    
    @SerializedName("billing_details")
    var billingDetails: UserDetailsData?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: OrderingStoreDetails?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: UserDetailsData?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetailsData?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("invoice")
    var invoice: InvoiceInfo?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInfoResponse
*/
@Parcelize
data class ShipmentInfoResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: TransactionData
*/
@Parcelize
data class TransactionData(
    
    
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: String?=null,
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("unique_reference_number")
    var uniqueReferenceNumber: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("terminal_id")
    var terminalId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformUserDetails
*/
@Parcelize
data class PlatformUserDetails(
    
    
    
    @SerializedName("platform_user_id")
    var platformUserId: String?=null,
    
    @SerializedName("platform_user_last_name")
    var platformUserLastName: String?=null,
    
    @SerializedName("platform_user_employee_code")
    var platformUserEmployeeCode: String?=null,
    
    @SerializedName("platform_user_first_name")
    var platformUserFirstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BillingStaffDetails
*/
@Parcelize
data class BillingStaffDetails(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("staff_id")
    var staffId: Int?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderMeta
*/
@Parcelize
data class OrderMeta(
    
    
    
    @SerializedName("files")
    var files: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("employee_id")
    var employeeId: Int?=null,
    
    @SerializedName("order_platform")
    var orderPlatform: String?=null,
    
    @SerializedName("transaction_data")
    var transactionData: TransactionData?=null,
    
    @SerializedName("order_child_entities")
    var orderChildEntities: ArrayList<String>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("customer_note")
    var customerNote: String?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("mongo_cart_id")
    var mongoCartId: Int?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("platform_user_details")
    var platformUserDetails: PlatformUserDetails?=null,
    
    @SerializedName("company_logo")
    var companyLogo: String?=null,
    
    @SerializedName("billing_staff_details")
    var billingStaffDetails: BillingStaffDetails?=null,
    
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("order_tags")
    var orderTags: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDict
*/
@Parcelize
data class OrderDict(
    
    
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: TaxDetails?=null,
    
    @SerializedName("meta")
    var meta: OrderMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetailsResponse
*/
@Parcelize
data class ShipmentDetailsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null,
    
    @SerializedName("order")
    var order: OrderDict?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubLane
*/
@Parcelize
data class SubLane(
    
    
    
    @SerializedName("actions")
    var actions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuperLane
*/
@Parcelize
data class SuperLane(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<SubLane>?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LaneConfigResponse
*/
@Parcelize
data class LaneConfigResponse(
    
    
    
    @SerializedName("super_lanes")
    var superLanes: ArrayList<SuperLane>?=null
    
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
    Model: PlatformBreakupValues
*/
@Parcelize
data class PlatformBreakupValues(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOrderItems
*/
@Parcelize
data class PlatformOrderItems(
    
    
    
    @SerializedName("channel")
    var channel: PlatformChannel?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<PlatformBreakupValues>?=null,
    
    @SerializedName("user_info")
    var userInfo: UserDataInfo?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("total_order_value")
    var totalOrderValue: Double?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderListingResponse
*/
@Parcelize
data class OrderListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<PlatformOrderItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Options
*/
@Parcelize
data class Options(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetricsCount
*/
@Parcelize
data class MetricsCount(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<Options>?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetricCountResponse
*/
@Parcelize
data class MetricCountResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<MetricsCount>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformTrack
*/
@Parcelize
data class PlatformTrack(
    
    
    
    @SerializedName("raw_status")
    var rawStatus: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    
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
    Model: FiltersResponse
*/
@Parcelize
data class FiltersResponse(
    
    
    
    @SerializedName("advance")
    var advance: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Success
*/
@Parcelize
data class Success(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OmsReports
*/
@Parcelize
data class OmsReports(
    
    
    
    @SerializedName("report_name")
    var reportName: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("report_requested_at")
    var reportRequestedAt: String?=null,
    
    @SerializedName("report_created_at")
    var reportCreatedAt: String?=null,
    
    @SerializedName("report_type")
    var reportType: String?=null,
    
    @SerializedName("s3_key")
    var s3Key: String?=null,
    
    @SerializedName("request_details")
    var requestDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JioCodeUpsertDataSet
*/
@Parcelize
data class JioCodeUpsertDataSet(
    
    
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("jio_code")
    var jioCode: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JioCodeUpsertPayload
*/
@Parcelize
data class JioCodeUpsertPayload(
    
    
    
    @SerializedName("data")
    var data: ArrayList<JioCodeUpsertDataSet>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: NestedErrorSchemaDataSet
*/
@Parcelize
data class NestedErrorSchemaDataSet(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JioCodeUpsertResponse
*/
@Parcelize
data class JioCodeUpsertResponse(
    
    
    
    @SerializedName("error")
    var error: ArrayList<NestedErrorSchemaDataSet>?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInvoicingResponse
*/
@Parcelize
data class BulkInvoicingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInvoiceLabelResponse
*/
@Parcelize
data class BulkInvoiceLabelResponse(
    
    
    
    @SerializedName("do_invoice_label_generated")
    var doInvoiceLabelGenerated: Boolean?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("invoice_status")
    var invoiceStatus: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null,
    
    @SerializedName("label")
    var label: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FileUploadResponse
*/
@Parcelize
data class FileUploadResponse(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null
    
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
    Model: FileResponse
*/
@Parcelize
data class FileResponse(
    
    
    
    @SerializedName("upload")
    var upload: FileUploadResponse?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("cdn")
    var cdn: URL?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListingPage
*/
@Parcelize
data class BulkListingPage(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: bulkListingData
*/
@Parcelize
data class bulkListingData(
    
    
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("successful_shipments")
    var successfulShipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("user_name")
    var userName: String?=null,
    
    @SerializedName("processing")
    var processing: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_shipments")
    var failedShipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("processing_shipments")
    var processingShipments: ArrayList<String>?=null,
    
    @SerializedName("successful")
    var successful: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("excel_url")
    var excelUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkListingResponse
*/
@Parcelize
data class BulkListingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: BulkListingPage?=null,
    
    @SerializedName("data")
    var data: ArrayList<bulkListingData>?=null,
    
    @SerializedName("error")
    var error: String?=null
    
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
    Model: Reason
*/
@Parcelize
data class Reason(
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentReasonsResponse
*/
@Parcelize
data class PlatformShipmentReasonsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reason>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionPayload
*/
@Parcelize
data class BulkActionPayload(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkActionResponse
*/
@Parcelize
data class BulkActionResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionDetailsDataField
*/
@Parcelize
data class BulkActionDetailsDataField(
    
    
    
    @SerializedName("total_shipments_count")
    var totalShipmentsCount: Int?=null,
    
    @SerializedName("successful_shipments_count")
    var successfulShipmentsCount: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("failed_shipments_count")
    var failedShipmentsCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("successful_shipment_ids")
    var successfulShipmentIds: ArrayList<String>?=null,
    
    @SerializedName("processing_shipments_count")
    var processingShipmentsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkActionDetailsResponse
*/
@Parcelize
data class BulkActionDetailsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: ArrayList<String>?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<BulkActionDetailsDataField>?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("uploaded_by")
    var uploadedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null
    
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
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("time")
    var time: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("a_set")
    var aSet: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("dimensions")
    var dimensions: Dimensions?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("esp_modified")
    var espModified: @RawValue Any?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue Any?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagGSTDetails
*/
@Parcelize
data class BagGSTDetails(
    
    
    
    @SerializedName("sgst_tax_percentage")
    var sgstTaxPercentage: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("igst_gst_fee")
    var igstGstFee: String?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("cgst_tax_percentage")
    var cgstTaxPercentage: Double?=null,
    
    @SerializedName("sgst_gst_fee")
    var sgstGstFee: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("cgst_gst_fee")
    var cgstGstFee: String?=null,
    
    @SerializedName("igst_tax_percentage")
    var igstTaxPercentage: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDetails
*/
@Parcelize
data class ArticleDetails(
    
    
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: B2BPODetails
*/
@Parcelize
data class B2BPODetails(
    
    
    
    @SerializedName("po_tax_amount")
    var poTaxAmount: Double?=null,
    
    @SerializedName("total_gst_percentage")
    var totalGstPercentage: Double?=null,
    
    @SerializedName("po_line_amount")
    var poLineAmount: Double?=null,
    
    @SerializedName("item_base_price")
    var itemBasePrice: Double?=null,
    
    @SerializedName("docker_number")
    var dockerNumber: String?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagMeta
*/
@Parcelize
data class BagMeta(
    
    
    
    @SerializedName("b2b_po_details")
    var b2BPoDetails: B2BPODetails?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Dates
*/
@Parcelize
data class Dates(
    
    
    
    @SerializedName("order_created")
    var orderCreated: String?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EInvoicePortalDetails
*/
@Parcelize
data class EInvoicePortalDetails(
    
    
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user")
    var user: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("ds_type")
    var dsType: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
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
    Model: StoreEwaybill
*/
@Parcelize
data class StoreEwaybill(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StoreEinvoice
*/
@Parcelize
data class StoreEinvoice(
    
    
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreGstCredentials
*/
@Parcelize
data class StoreGstCredentials(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: StoreEwaybill?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: StoreEinvoice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ewaybill_portal_details")
    var ewaybillPortalDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("einvoice_portal_details")
    var einvoicePortalDetails: EInvoicePortalDetails?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("documents")
    var documents: StoreDocuments?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: StoreGstCredentials?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("timing")
    var timing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAddress
*/
@Parcelize
data class StoreAddress(
    
    
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("login_username")
    var loginUsername: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("store_active_from")
    var storeActiveFrom: String?=null,
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("meta")
    var meta: StoreMeta?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("brand_id")
    var brandId: @RawValue Any?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("mall_area")
    var mallArea: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddress?=null,
    
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    
    @SerializedName("alohomora_user_id")
    var alohomoraUserId: Int?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("vat_no")
    var vatNo: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("parent_store_id")
    var parentStoreId: Int?=null,
    
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    
    @SerializedName("mall_name")
    var mallName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    
    @SerializedName("script_last_ran")
    var scriptLastRan: String?=null,
    
    @SerializedName("pickup_location")
    var pickupLocation: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("credit_note_expiry_days")
    var creditNoteExpiryDays: Int?=null,
    
    @SerializedName("invoice_prefix")
    var invoicePrefix: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagReturnableCancelableStatus
*/
@Parcelize
data class BagReturnableCancelableStatus(
    
    
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    
    
    @SerializedName("marketer_address")
    var marketerAddress: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("gender")
    var gender: ArrayList<String>?=null,
    
    @SerializedName("primary_color_hex")
    var primaryColorHex: String?=null,
    
    @SerializedName("primary_material")
    var primaryMaterial: String?=null,
    
    @SerializedName("marketer_name")
    var marketerName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("essential")
    var essential: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("webstore_product_url")
    var webstoreProductUrl: String?=null,
    
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("l1_category_id")
    var l1CategoryId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("branch_url")
    var branchUrl: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l2_category_id")
    var l2CategoryId: Int?=null,
    
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagDetailsPlatformResponse
*/
@Parcelize
data class BagDetailsPlatformResponse(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: BagStatusHistory?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGSTDetails?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("article_details")
    var articleDetails: ArticleDetails?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("qc_required")
    var qcRequired: @RawValue Any?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("meta")
    var meta: BagMeta?=null,
    
    @SerializedName("dates")
    var dates: Dates?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("quantity")
    var quantity: Double?=null,
    
    @SerializedName("b_id")
    var bId: Int?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("b_type")
    var bType: String?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Page1
*/
@Parcelize
data class Page1(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetBagsPlatformResponse
*/
@Parcelize
data class GetBagsPlatformResponse(
    
    
    
    @SerializedName("page")
    var page: Page1?=null,
    
    @SerializedName("items")
    var items: ArrayList<BagDetailsPlatformResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidateShipmentCachePayload
*/
@Parcelize
data class InvalidateShipmentCachePayload(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvalidateShipmentCacheNestedResponse
*/
@Parcelize
data class InvalidateShipmentCacheNestedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidateShipmentCacheResponse
*/
@Parcelize
data class InvalidateShipmentCacheResponse(
    
    
    
    @SerializedName("response")
    var response: ArrayList<InvalidateShipmentCacheNestedResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ErrorResponse1
*/
@Parcelize
data class ErrorResponse1(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error_trace")
    var errorTrace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreReassign
*/
@Parcelize
data class StoreReassign(
    
    
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("set_id")
    var setId: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reason_ids")
    var reasonIds: ArrayList<Int>?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("mongo_article_id")
    var mongoArticleId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreReassignResponse
*/
@Parcelize
data class StoreReassignResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Entities
*/
@Parcelize
data class Entities(
    
    
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentLockPayload
*/
@Parcelize
data class UpdateShipmentLockPayload(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<Entities>?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null
    
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
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OriginalFilter
*/
@Parcelize
data class OriginalFilter(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CheckResponse
*/
@Parcelize
data class CheckResponse(
    
    
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("is_bag_locked")
    var isBagLocked: Boolean?=null,
    
    @SerializedName("is_shipment_locked")
    var isShipmentLocked: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("original_filter")
    var originalFilter: OriginalFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentLockResponse
*/
@Parcelize
data class UpdateShipmentLockResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("check_response")
    var checkResponse: ArrayList<CheckResponse>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementResponse
*/
@Parcelize
data class AnnouncementResponse(
    
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("platform_id")
    var platformId: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("platform_name")
    var platformName: String?=null,
    
    @SerializedName("to_datetime")
    var toDatetime: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: String?=null,
    
    @SerializedName("from_datetime")
    var fromDatetime: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementsResponse
*/
@Parcelize
data class AnnouncementsResponse(
    
    
    
    @SerializedName("announcements")
    var announcements: ArrayList<AnnouncementResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BaseResponse
*/
@Parcelize
data class BaseResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Click2CallResponse
*/
@Parcelize
data class Click2CallResponse(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("call_id")
    var callId: String?=null
    
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
    Model: ProductsReasonsFilters
*/
@Parcelize
data class ProductsReasonsFilters(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
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
    Model: ReasonsData
*/
@Parcelize
data class ReasonsData(
    
    
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesReasons>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductsReasons>?=null
    
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
    Model: ProductsDataUpdatesFilters
*/
@Parcelize
data class ProductsDataUpdatesFilters(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
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
    Model: DataUpdates
*/
@Parcelize
data class DataUpdates(
    
    
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesDataUpdates>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductsDataUpdates>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsRequest
*/
@Parcelize
data class ShipmentsRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("reasons")
    var reasons: ReasonsData?=null,
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdates?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatuesRequest
*/
@Parcelize
data class StatuesRequest(
    
    
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsRequest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentStatusRequest
*/
@Parcelize
data class UpdateShipmentStatusRequest(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesRequest>?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsResponse
*/
@Parcelize
data class ShipmentsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("final_state")
    var finalState: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatuesResponse
*/
@Parcelize
data class StatuesResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentStatusResponseBody
*/
@Parcelize
data class UpdateShipmentStatusResponseBody(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesResponse>?=null
    
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
    Model: AffiliateAppConfigMeta
*/
@Parcelize
data class AffiliateAppConfigMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateAppConfig
*/
@Parcelize
data class AffiliateAppConfig(
    
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<AffiliateAppConfigMeta>?=null
    
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
    Model: AffiliateInventoryLogisticsConfig
*/
@Parcelize
data class AffiliateInventoryLogisticsConfig(
    
    
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
    
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
    Model: AffiliateInventoryConfig
*/
@Parcelize
data class AffiliateInventoryConfig(
    
    
    
    @SerializedName("order")
    var order: AffiliateInventoryOrderConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: AffiliateInventoryArticleAssignmentConfig?=null,
    
    @SerializedName("payment")
    var payment: AffiliateInventoryPaymentConfig?=null,
    
    @SerializedName("logistics")
    var logistics: AffiliateInventoryLogisticsConfig?=null,
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryStoreConfig?=null
    
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
    var inventory: AffiliateInventoryConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Affiliate
*/
@Parcelize
data class Affiliate(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("config")
    var config: AffiliateConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderConfig
*/
@Parcelize
data class OrderConfig(
    
    
    
    @SerializedName("store_lookup")
    var storeLookup: String?=null,
    
    @SerializedName("article_lookup")
    var articleLookup: String?=null,
    
    @SerializedName("bag_end_state")
    var bagEndState: String?=null,
    
    @SerializedName("create_user")
    var createUser: Boolean?=null,
    
    @SerializedName("affiliate_store_id_mapping")
    var affiliateStoreIdMapping: ArrayList<AffiliateStoreIdMapping>?=null,
    
    @SerializedName("affiliate")
    var affiliate: Affiliate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderUser
*/
@Parcelize
data class OrderUser(
    
    
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserData
*/
@Parcelize
data class UserData(
    
    
    
    @SerializedName("billing_user")
    var billingUser: OrderUser?=null,
    
    @SerializedName("shipping_user")
    var shippingUser: OrderUser?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MarketPlacePdf
*/
@Parcelize
data class MarketPlacePdf(
    
    
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AffiliateBag
*/
@Parcelize
data class AffiliateBag(
    
    
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("sku")
    var sku: String?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("unit_price")
    var unitPrice: Double?=null,
    
    @SerializedName("fynd_store_id")
    var fyndStoreId: String?=null,
    
    @SerializedName("avl_qty")
    var avlQty: Int?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: MarketPlacePdf?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderPriority
*/
@Parcelize
data class OrderPriority(
    
    
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("affiliate_priority_code")
    var affiliatePriorityCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDetails1
*/
@Parcelize
data class ArticleDetails1(
    
    
    
    @SerializedName("dimension")
    var dimension: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails1>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetails
*/
@Parcelize
data class ShipmentDetails(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("dp_id")
    var dpId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails1>?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentConfig
*/
@Parcelize
data class ShipmentConfig(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("shipment")
    var shipment: ArrayList<ShipmentDetails>?=null
    
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
    Model: OrderInfo
*/
@Parcelize
data class OrderInfo(
    
    
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("user")
    var user: UserData?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: OrderUser?=null,
    
    @SerializedName("billing_address")
    var billingAddress: OrderUser?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<AffiliateBag>?=null,
    
    @SerializedName("payment")
    var payment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("order_priority")
    var orderPriority: OrderPriority?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentData?=null,
    
    @SerializedName("discount")
    var discount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderPayload
*/
@Parcelize
data class CreateOrderPayload(
    
    
    
    @SerializedName("order_config")
    var orderConfig: OrderConfig?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("order_info")
    var orderInfo: OrderInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderResponse
*/
@Parcelize
data class CreateOrderResponse(
    
    
    
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
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActionInfo
*/
@Parcelize
data class ActionInfo(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetActionsResponse
*/
@Parcelize
data class GetActionsResponse(
    
    
    
    @SerializedName("permissions")
    var permissions: ActionInfo?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PostHistoryFilters
*/
@Parcelize
data class PostHistoryFilters(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
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
    Model: PostActivityHistory
*/
@Parcelize
data class PostActivityHistory(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<PostHistoryFilters>?=null,
    
    @SerializedName("data")
    var data: PostHistoryData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostHistoryDict
*/
@Parcelize
data class PostHistoryDict(
    
    
    
    @SerializedName("activity_history")
    var activityHistory: PostActivityHistory?=null
    
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
    Model: HistoryDict
*/
@Parcelize
data class HistoryDict(
    
    
    
    @SerializedName("l3_detail")
    var l3Detail: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("ticket_url")
    var ticketUrl: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("createdat")
    var createdat: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("l1_detail")
    var l1Detail: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("l2_detail")
    var l2Detail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentHistoryResponse
*/
@Parcelize
data class ShipmentHistoryResponse(
    
    
    
    @SerializedName("activity_history")
    var activityHistory: ArrayList<HistoryDict>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ErrorDetail
*/
@Parcelize
data class ErrorDetail(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SmsDataPayload
*/
@Parcelize
data class SmsDataPayload(
    
    
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendSmsPayload
*/
@Parcelize
data class SendSmsPayload(
    
    
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("data")
    var data: SmsDataPayload?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetails
*/
@Parcelize
data class OrderDetails(
    
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Meta1
*/
@Parcelize
data class Meta1(
    
    
    
    @SerializedName("state_manager_used")
    var stateManagerUsed: String?=null,
    
    @SerializedName("kafka_emission_status")
    var kafkaEmissionStatus: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetail
*/
@Parcelize
data class ShipmentDetail(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("remarks")
    var remarks: String?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("meta")
    var meta: Meta1?=null
    
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
    var shipmentDetails: ArrayList<ShipmentDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderStatusResult
*/
@Parcelize
data class OrderStatusResult(
    
    
    
    @SerializedName("result")
    var result: ArrayList<OrderStatusData>?=null,
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManualAssignDPToShipment
*/
@Parcelize
data class ManualAssignDPToShipment(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    
    @SerializedName("qc_required")
    var qcRequired: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("dp_id")
    var dpId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManualAssignDPToShipmentResponse
*/
@Parcelize
data class ManualAssignDPToShipmentResponse(
    
    
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethod
*/
@Parcelize
data class PaymentMethod(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("transaction_data")
    var transactionData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInfo
*/
@Parcelize
data class PaymentInfo(
    
    
    
    @SerializedName("primary_mode")
    var primaryMode: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingInfo
*/
@Parcelize
data class ShippingInfo(
    
    
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("shipping_type")
    var shippingType: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("slot")
    var slot: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxInfo
*/
@Parcelize
data class TaxInfo(
    
    
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("b2b_gstin_number")
    var b2BGstinNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BillingInfo
*/
@Parcelize
data class BillingInfo(
    
    
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Tax
*/
@Parcelize
data class Tax(
    
    
    
    @SerializedName("breakup")
    var breakup: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("amount")
    var amount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Charge
*/
@Parcelize
data class Charge(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tax")
    var tax: Tax?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LineItem
*/
@Parcelize
data class LineItem(
    
    
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("external_line_id")
    var externalLineId: String?=null,
    
    @SerializedName("custom_messasge")
    var customMessasge: String?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessingDates
*/
@Parcelize
data class ProcessingDates(
    
    
    
    @SerializedName("dp_pickup_slot")
    var dpPickupSlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dispatch_by_date")
    var dispatchByDate: String?=null,
    
    @SerializedName("dispatch_after_date")
    var dispatchAfterDate: String?=null,
    
    @SerializedName("pack_by_date")
    var packByDate: String?=null,
    
    @SerializedName("customer_pickup_slot")
    var customerPickupSlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("confirm_by_date")
    var confirmByDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipment
*/
@Parcelize
data class Shipment(
    
    
    
    @SerializedName("line_items")
    var lineItems: ArrayList<LineItem>?=null,
    
    @SerializedName("processing_dates")
    var processingDates: ProcessingDates?=null,
    
    @SerializedName("external_shipment_id")
    var externalShipmentId: String?=null,
    
    @SerializedName("location_id")
    var locationId: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderAPI
*/
@Parcelize
data class CreateOrderAPI(
    
    
    
    @SerializedName("payment_info")
    var paymentInfo: PaymentInfo?=null,
    
    @SerializedName("shipping_info")
    var shippingInfo: ShippingInfo?=null,
    
    @SerializedName("tax_info")
    var taxInfo: TaxInfo?=null,
    
    @SerializedName("currency_info")
    var currencyInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("external_creation_date")
    var externalCreationDate: String?=null,
    
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_info")
    var billingInfo: BillingInfo?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipment>?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderErrorReponse
*/
@Parcelize
data class CreateOrderErrorReponse(
    
    
    
    @SerializedName("info")
    var info: @RawValue Any?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethods
*/
@Parcelize
data class PaymentMethods(
    
    
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelPaymentInfo
*/
@Parcelize
data class CreateChannelPaymentInfo(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethods>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpConfiguration
*/
@Parcelize
data class DpConfiguration(
    
    
    
    @SerializedName("shipping_by")
    var shippingBy: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateChannelConfig
*/
@Parcelize
data class CreateChannelConfig(
    
    
    
    @SerializedName("payment_info")
    var paymentInfo: CreateChannelPaymentInfo?=null,
    
    @SerializedName("shipment_assignment")
    var shipmentAssignment: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("location_reassignment")
    var locationReassignment: Boolean?=null,
    
    @SerializedName("dp_configuration")
    var dpConfiguration: DpConfiguration?=null,
    
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
    Model: CreateChannelConfigResponse
*/
@Parcelize
data class CreateChannelConfigResponse(
    
    
    
    @SerializedName("is_upserted")
    var isUpserted: Boolean?=null,
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null,
    
    @SerializedName("is_inserted")
    var isInserted: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateChannelConifgErrorResponse
*/
@Parcelize
data class CreateChannelConifgErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UploadConsent
*/
@Parcelize
data class UploadConsent(
    
    
    
    @SerializedName("consent_url")
    var consentUrl: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
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
    
    
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FyndOrderIdList
*/
@Parcelize
data class FyndOrderIdList(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderStatus
*/
@Parcelize
data class OrderStatus(
    
    
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("order_details")
    var orderDetails: ArrayList<FyndOrderIdList>?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



