package com.sdk.application.models.order

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemBrand
*/
@Parcelize
data class ItemBrand(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("brand")
    var brand: ItemBrand?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("id")
    var id: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    
    @SerializedName("ean")
    var ean: String?=null,
    
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
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
    
    
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Double?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NestedTrackingDetails
*/
@Parcelize
data class NestedTrackingDetails(
    
    
    
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
    Model: TrackingDetails
*/
@Parcelize
data class TrackingDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<NestedTrackingDetails>?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTotalDetails
*/
@Parcelize
data class ShipmentTotalDetails(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("sizes")
    var sizes: Int?=null,
    
    @SerializedName("total_price")
    var totalPrice: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPayment
*/
@Parcelize
data class ShipmentPayment(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("mop")
    var mop: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentUserInfo
*/
@Parcelize
data class ShipmentUserInfo(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TimeStampData
*/
@Parcelize
data class TimeStampData(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: TimeStampData?=null,
    
    @SerializedName("show_promise")
    var showPromise: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingCompany
*/
@Parcelize
data class FulfillingCompany(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("hex_code")
    var hexCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    
    @SerializedName("invoice")
    var invoice: Invoice?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("return_meta")
    var returnMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    
    @SerializedName("show_track_link")
    var showTrackLink: Boolean?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<TrackingDetails>?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("can_break")
    var canBreak: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("size_info")
    var sizeInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_details")
    var totalDetails: ShipmentTotalDetails?=null,
    
    @SerializedName("payment")
    var payment: ShipmentPayment?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("show_download_invoice")
    var showDownloadInvoice: Boolean?=null,
    
    @SerializedName("user_info")
    var userInfo: ShipmentUserInfo?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null,
    
    @SerializedName("fulfilling_company")
    var fulfillingCompany: FulfillingCompany?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagsForReorderArticleAssignment
*/
@Parcelize
data class BagsForReorderArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BagsForReorder
*/
@Parcelize
data class BagsForReorder(
    
    
    
    @SerializedName("article_assignment")
    var articleAssignment: BagsForReorderArticleAssignment?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderSchema
*/
@Parcelize
data class OrderSchema(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("user_info")
    var userInfo: UserInfo?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("bags_for_reorder")
    var bagsForReorder: ArrayList<BagsForReorder>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderPage
*/
@Parcelize
data class OrderPage(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderStatuses
*/
@Parcelize
data class OrderStatuses(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderFilters
*/
@Parcelize
data class OrderFilters(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<OrderStatuses>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<OrderSchema>?=null,
    
    @SerializedName("page")
    var page: OrderPage?=null,
    
    @SerializedName("filters")
    var filters: OrderFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderById
*/
@Parcelize
data class OrderById(
    
    
    
    @SerializedName("order")
    var order: OrderSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    
    
    @SerializedName("shipment")
    var shipment: Shipments?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResponseGetInvoiceShipment
*/
@Parcelize
data class ResponseGetInvoiceShipment(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Track
*/
@Parcelize
data class Track(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("account_name")
    var accountName: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    
    
    @SerializedName("results")
    var results: ArrayList<Track>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomerDetailsResponse
*/
@Parcelize
data class CustomerDetailsResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpToCustomerResponse
*/
@Parcelize
data class SendOtpToCustomerResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtp
*/
@Parcelize
data class VerifyOtp(
    
    
    
    @SerializedName("otp_code")
    var otpCode: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtpResponse
*/
@Parcelize
data class VerifyOtpResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: BagReasonMeta
*/
@Parcelize
data class BagReasonMeta(
    
    
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BagReasons
*/
@Parcelize
data class BagReasons(
    
    
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("meta")
    var meta: BagReasonMeta?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null,
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentBagReasons
*/
@Parcelize
data class ShipmentBagReasons(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentReason
*/
@Parcelize
data class ShipmentReason(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("flow")
    var flow: String?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<ShipmentReason>?=null
    
): Parcelable {
    
    
    
    
    
}



