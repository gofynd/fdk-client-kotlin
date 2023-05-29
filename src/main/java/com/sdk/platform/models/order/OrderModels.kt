package com.sdk.platform.models.order

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("discount")
    var discount: Int?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Int?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("pm_price_split")
    var pmPriceSplit: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBagItem
*/
@Parcelize
data class OrderBagItem(
    
    
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("brand")
    var brand: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagConfigs
*/
@Parcelize
data class BagConfigs(
    
    
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("allow_force_return")
    var allowForceReturn: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagGST
*/
@Parcelize
data class BagGST(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Int?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBrandName
*/
@Parcelize
data class OrderBrandName(
    
    
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
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
    Model: OrderBags
*/
@Parcelize
data class OrderBags(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("item")
    var item: OrderBagItem?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("bag_configs")
    var bagConfigs: BagConfigs?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGST?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("brand")
    var brand: OrderBrandName?=null,
    
    @SerializedName("article")
    var article: OrderBagArticle?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GST
*/
@Parcelize
data class GST(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPDetails
*/
@Parcelize
data class DPDetails(
    
    
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatusData
*/
@Parcelize
data class ShipmentStatusData(
    
    
    
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetailsData
*/
@Parcelize
data class OrderDetailsData(
    
    
    
    @SerializedName("order_value")
    var orderValue: String?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPayments
*/
@Parcelize
data class ShipmentPayments(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null
    
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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
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
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagStatusHistory
*/
@Parcelize
data class BagStatusHistory(
    
    
    
    @SerializedName("display_name")
    var displayName: Boolean?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: Boolean?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("forward")
    var forward: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("state_type")
    var stateType: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TrackingList
*/
@Parcelize
data class TrackingList(
    
    
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInfoResponse
*/
@Parcelize
data class ShipmentInfoResponse(
    
    
    
    @SerializedName("bags")
    var bags: OrderBags?=null,
    
    @SerializedName("forward_shipment_status")
    var forwardShipmentStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("forward_tracking_list")
    var forwardTrackingList: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("refund_text")
    var refundText: String?=null,
    
    @SerializedName("is_fynd_store")
    var isFyndStore: String?=null,
    
    @SerializedName("company")
    var company: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GST?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user_info")
    var userInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetails?=null,
    
    @SerializedName("order_status")
    var orderStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_pdsr")
    var isPdsr: String?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("can_break")
    var canBreak: String?=null,
    
    @SerializedName("go_green")
    var goGreen: Boolean?=null,
    
    @SerializedName("delivery_status")
    var deliveryStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("bank_data")
    var bankData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("child_nodes")
    var childNodes: ArrayList<String>?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("replacement_details")
    var replacementDetails: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pay_button")
    var payButton: String?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("mid")
    var mid: String?=null,
    
    @SerializedName("kirana_store_id")
    var kiranaStoreId: String?=null,
    
    @SerializedName("status_progress")
    var statusProgress: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("escalation")
    var escalation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("secured_delivery_flag")
    var securedDeliveryFlag: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("forward_order_status")
    var forwardOrderStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: String?=null,
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: UserDetailsData?=null,
    
    @SerializedName("is_packaging_order")
    var isPackagingOrder: Boolean?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: Boolean?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_invoiced")
    var isInvoiced: Boolean?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("is_fynd_coupon")
    var isFyndCoupon: Boolean?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("is_not_fynd_source")
    var isNotFyndSource: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("billing_details")
    var billingDetails: UserDetailsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubLane
*/
@Parcelize
data class SubLane(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("current_state")
    var currentState: ArrayList<String>?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("total_shipments")
    var totalShipments: Int?=null,
    
    @SerializedName("next_state")
    var nextState: ArrayList<String>?=null,
    
    @SerializedName("index")
    var index: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuperLane
*/
@Parcelize
data class SuperLane(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<SubLane>?=null
    
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
    Model: OrderDict
*/
@Parcelize
data class OrderDict(
    
    
    
    @SerializedName("shipment_count")
    var shipmentCount: Int?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("is_validated")
    var isValidated: Boolean?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipment
*/
@Parcelize
data class Shipment(
    
    
    
    @SerializedName("bags")
    var bags: OrderBags?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GST?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetails?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: String?=null,
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: UserDetailsData?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: String?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("billing_details")
    var billingDetails: UserDetailsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetailsResponse
*/
@Parcelize
data class ShipmentDetailsResponse(
    
    
    
    @SerializedName("order")
    var order: OrderDict?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipment>?=null,
    
    @SerializedName("is_validated")
    var isValidated: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("options")
    var options: ArrayList<FilterInfoOption>?=null
    
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
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagUnit
*/
@Parcelize
data class BagUnit(
    
    
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("item_quantity")
    var itemQuantity: Int?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("gst")
    var gst: GST?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
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
    
    @SerializedName("hex_code")
    var hexCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("actual_status")
    var actualStatus: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDataInfo
*/
@Parcelize
data class UserDataInfo(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("avis_user_id")
    var avisUserId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
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
    Model: ShipmentItem
*/
@Parcelize
data class ShipmentItem(
    
    
    
    @SerializedName("payment_mode_info")
    var paymentModeInfo: PaymentModeInfo?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<BagUnit>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("total_bags_count")
    var totalBagsCount: Int?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("fulfilling_centre")
    var fulfillingCentre: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("application")
    var application: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("channel")
    var channel: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: Int?=null,
    
    @SerializedName("sla")
    var sla: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: ShipmentItemFulFillingStore?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentInternalPlatformViewResponse
*/
@Parcelize
data class ShipmentInternalPlatformViewResponse(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ShipmentItem>?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPricesDataSet
*/
@Parcelize
data class ShipmentPricesDataSet(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Int?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Int?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Int?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipment1
*/
@Parcelize
data class Shipment1(
    
    
    
    @SerializedName("shipment_status")
    var shipmentStatus: String?=null,
    
    @SerializedName("rtd_done")
    var rtdDone: String?=null,
    
    @SerializedName("total_items")
    var totalItems: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("prices")
    var prices: ShipmentPricesDataSet?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManifestShipmentResponse
*/
@Parcelize
data class ManifestShipmentResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipment1>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorSchemaDataSet
*/
@Parcelize
data class ErrorSchemaDataSet(
    
    
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPricesDataInfo
*/
@Parcelize
data class ShipmentPricesDataInfo(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("coupon_value")
    var couponValue: String?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("discount")
    var discount: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDataSet
*/
@Parcelize
data class ShipmentDataSet(
    
    
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Int?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Int?=null,
    
    @SerializedName("prices")
    var prices: ShipmentPricesDataInfo?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDataSet
*/
@Parcelize
data class UserDataSet(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDataSet
*/
@Parcelize
data class OrderDataSet(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentDataSet>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("user_info")
    var userInfo: UserDataSet?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderListingResponse
*/
@Parcelize
data class OrderListingResponse(
    
    
    
    @SerializedName("orders")
    var orders: ArrayList<OrderDataSet>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderErrorSchemaDataSet
*/
@Parcelize
data class OrderErrorSchemaDataSet(
    
    
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: FiltersResponse
*/
@Parcelize
data class FiltersResponse(
    
    
    
    @SerializedName("channels")
    var channels: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("delivery_partners")
    var deliveryPartners: ArrayList<FiltersInfo>?=null
    
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
    
    
    
    @SerializedName("report_created_at")
    var reportCreatedAt: String?=null,
    
    @SerializedName("report_requested_at")
    var reportRequestedAt: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("report_type")
    var reportType: String?=null,
    
    @SerializedName("report_name")
    var reportName: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("request_details")
    var requestDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("s3_key")
    var s3Key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JioCodeUpsertDataSet
*/
@Parcelize
data class JioCodeUpsertDataSet(
    
    
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("jio_code")
    var jioCode: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
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
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JioCodeUpsertResponse
*/
@Parcelize
data class JioCodeUpsertResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("error")
    var error: ArrayList<NestedErrorSchemaDataSet>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentBody
*/
@Parcelize
data class ShipmentBody(
    
    
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("data_update")
    var dataUpdate: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("reason")
    var reason: ArrayList<Int>?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Int>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDetail
*/
@Parcelize
data class ShipmentDetail(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: ShipmentBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Statuses
*/
@Parcelize
data class Statuses(
    
    
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("shipments")
    var shipments: ShipmentDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentStatusInternal
*/
@Parcelize
data class PlatformShipmentStatusInternal(
    
    
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("statuses")
    var statuses: Statuses?=null
    
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
    Model: ErrorDetail
*/
@Parcelize
data class ErrorDetail(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: HistoryDict
*/
@Parcelize
data class HistoryDict(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("l3_detail")
    var l3Detail: String?=null,
    
    @SerializedName("l1_detail")
    var l1Detail: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("createdat")
    var createdat: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("ticket_url")
    var ticketUrl: String?=null,
    
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
    Model: PlatformOrderUpdate
*/
@Parcelize
data class PlatformOrderUpdate(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
}



