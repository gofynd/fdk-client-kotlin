package com.sdk.application.models.order

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: OrderStatuses
*/
@Parcelize
data class OrderStatuses(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: Int?=null
    
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
    Model: OrderPage
*/
@Parcelize
data class OrderPage(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentTotalDetails
*/
@Parcelize
data class ShipmentTotalDetails(
    
    
    
    @SerializedName("sizes")
    var sizes: Int?=null,
    
    @SerializedName("total_price")
    var totalPrice: Double?=null,
    
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NestedTrackingDetails
*/
@Parcelize
data class NestedTrackingDetails(
    
    
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TrackingDetails
*/
@Parcelize
data class TrackingDetails(
    
    
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<NestedTrackingDetails>?=null
    
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
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPayment
*/
@Parcelize
data class ShipmentPayment(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("mop")
    var mop: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TimeStampData
*/
@Parcelize
data class TimeStampData(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
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
    
    
    
    @SerializedName("id")
    var id: Double?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l1_categories")
    var l1Categories: ArrayList<String>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("l2_categories")
    var l2Categories: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ItemBrand?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: @RawValue HashMap<String,Any>?=null,
    
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
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Double?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    
    @SerializedName("sku_code")
    var skuCode: String?=null,
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentUserInfo
*/
@Parcelize
data class ShipmentUserInfo(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
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
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    
    @SerializedName("size_info")
    var sizeInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("can_break")
    var canBreak: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    
    @SerializedName("invoice")
    var invoice: Invoice?=null,
    
    @SerializedName("total_details")
    var totalDetails: ShipmentTotalDetails?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<TrackingDetails>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_meta")
    var returnMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("payment")
    var payment: ShipmentPayment?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("show_download_invoice")
    var showDownloadInvoice: Boolean?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    
    @SerializedName("show_track_link")
    var showTrackLink: Boolean?=null,
    
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    
    @SerializedName("user_info")
    var userInfo: ShipmentUserInfo?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("fulfilling_company")
    var fulfillingCompany: FulfillingCompany?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
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
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderSchema
*/
@Parcelize
data class OrderSchema(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("user_info")
    var userInfo: UserInfo?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    
    @SerializedName("bags_for_reorder")
    var bagsForReorder: ArrayList<BagsForReorder>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    
    
    @SerializedName("filters")
    var filters: OrderFilters?=null,
    
    @SerializedName("page")
    var page: OrderPage?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderSchema>?=null
    
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
    
    
    
    @SerializedName("presigned_type")
    var presignedType: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Track
*/
@Parcelize
data class Track(
    
    
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("account_name")
    var accountName: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
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
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
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
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyOtp
*/
@Parcelize
data class VerifyOtp(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp_code")
    var otpCode: String?=null
    
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
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
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
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("meta")
    var meta: BagReasonMeta?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null
    
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
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("flow")
    var flow: String?=null,
    
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
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



             
/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
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
    Model: ProductsReasonsFilters
*/
@Parcelize
data class ProductsReasonsFilters(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsReasons
*/
@Parcelize
data class ProductsReasons(
    
    
    
    @SerializedName("data")
    var data: ProductsReasonsData?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsReasonsFilters>?=null
    
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
    
    
    
    @SerializedName("data")
    var data: EntityReasonData?=null,
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsDataUpdatesFilters>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntitiesDataUpdates
*/
@Parcelize
data class EntitiesDataUpdates(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DataUpdates
*/
@Parcelize
data class DataUpdates(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsDataUpdates>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesDataUpdates>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsRequest
*/
@Parcelize
data class ShipmentsRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null,
    
    @SerializedName("reasons")
    var reasons: ReasonsData?=null,
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdates?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatuesRequest
*/
@Parcelize
data class StatuesRequest(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsRequest>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateShipmentStatusRequest
*/
@Parcelize
data class UpdateShipmentStatusRequest(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesRequest>?=null,
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StatusesBodyResponse
*/
@Parcelize
data class StatusesBodyResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ShipmentApplicationStatusResponse
*/
@Parcelize
data class ShipmentApplicationStatusResponse(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatusesBodyResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



