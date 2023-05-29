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
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PricesBreakup
*/
@Parcelize
data class PricesBreakup(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInfo
*/
@Parcelize
data class PaymentInfo(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("mop")
    var mop: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillingCompany
*/
@Parcelize
data class FulfillingCompany(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
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
    
    
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("brand")
    var brand: ItemBrand?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Int?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Int?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Int?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("pm_price_split")
    var pmPriceSplit: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("discount")
    var discount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BagsData
*/
@Parcelize
data class BagsData(
    
    
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("user_info")
    var userInfo: UserInfo?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<PricesBreakup>?=null,
    
    @SerializedName("size_info")
    var sizeInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("promise")
    var promise: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("show_download_invoice")
    var showDownloadInvoice: Boolean?=null,
    
    @SerializedName("show_track_link")
    var showTrackLink: Boolean?=null,
    
    @SerializedName("payment")
    var payment: PaymentInfo?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_break")
    var canBreak: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("fulfilling_company")
    var fulfillingCompany: FulfillingCompany?=null,
    
    @SerializedName("total_details")
    var totalDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<BagsData>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    
    
    @SerializedName("shipment")
    var shipment: ShipmentResponse?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomerDetailsResponse
*/
@Parcelize
data class CustomerDetailsResponse(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SendOtpToCustomerResponse
*/
@Parcelize
data class SendOtpToCustomerResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentReasonsResponse
*/
@Parcelize
data class ShipmentReasonsResponse(
    
    
    
    @SerializedName("flow")
    var flow: String?=null,
    
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
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
    var otpCode: Int?=null
    
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
    Model: OrderItems
*/
@Parcelize
data class OrderItems(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("user_info")
    var userInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("bags_for_reorder")
    var bagsForReorder: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Statuses
*/
@Parcelize
data class Statuses(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Filters
*/
@Parcelize
data class Filters(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<Statuses>?=null
    
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
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<OrderItems>?=null,
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TrackShipmentResults
*/
@Parcelize
data class TrackShipmentResults(
    
    
    
    @SerializedName("account_name")
    var accountName: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TrackShipmentResponse
*/
@Parcelize
data class TrackShipmentResponse(
    
    
    
    @SerializedName("results")
    var results: ArrayList<TrackShipmentResults>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentBody
*/
@Parcelize
data class ShipmentBody(
    
    
    
    @SerializedName("reason")
    var reason: ArrayList<Int>?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductDetail>?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Int>?=null,
    
    @SerializedName("data_update")
    var dataUpdate: @RawValue HashMap<String,Any>?=null
    
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
    Model: Statuses1
*/
@Parcelize
data class Statuses1(
    
    
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("shipments")
    var shipments: ShipmentDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatusUpdateBody
*/
@Parcelize
data class ShipmentStatusUpdateBody(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<Statuses1>?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentStatusUpdate
*/
@Parcelize
data class ShipmentStatusUpdate(
    
    
    
    @SerializedName("message")
    var message: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
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



