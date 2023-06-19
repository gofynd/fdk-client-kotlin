package com.sdk.application.models.payment

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    
    @SerializedName("env")
    var env: String?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("refresh")
    var refresh: Boolean?=null,
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("api")
    var api: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeletehCardRequest
*/
@Parcelize
data class DeletehCardRequest(
    
    
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteCardsResponse
*/
@Parcelize
data class DeleteCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payload")
    var payload: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("api_link")
    var apiLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorRoute?=null,
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    
    @SerializedName("large")
    var large: String?=null,
    
    @SerializedName("small")
    var small: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null,
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RupifiBannerData
*/
@Parcelize
data class RupifiBannerData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("kyc_url")
    var kycUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RupifiBannerResponse
*/
@Parcelize
data class RupifiBannerResponse(
    
    
    
    @SerializedName("data")
    var data: RupifiBannerData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferItemsDetails
*/
@Parcelize
data class TransferItemsDetails(
    
    
    
    @SerializedName("display_name")
    var displayName: Boolean?=null,
    
    @SerializedName("logo_large")
    var logoLarge: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo_small")
    var logoSmall: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeDetails
*/
@Parcelize
data class TransferModeDetails(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<TransferItemsDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeResponse
*/
@Parcelize
data class TransferModeResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<TransferModeDetails>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateRefundTransferModeRequest
*/
@Parcelize
data class UpdateRefundTransferModeRequest(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateRefundTransferModeResponse
*/
@Parcelize
data class UpdateRefundTransferModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("comment")
    var comment: Boolean?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null,
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



