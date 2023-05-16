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
    
    
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("env")
    var env: String?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("refresh")
    var refresh: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_items")
    var orderItems: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
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
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("jiopay")
    var jiopay: AggregatorRoute?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorRoute?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    
    @SerializedName("epaylater")
    var epaylater: AggregatorRoute?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null
    
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
    Model: IntentApp
*/
@Parcelize
data class IntentApp(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IntentAppErrorList
*/
@Parcelize
data class IntentAppErrorList(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: RupifiBannerData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EpaylaterBannerData
*/
@Parcelize
data class EpaylaterBannerData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display")
    var display: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EpaylaterBannerResponse
*/
@Parcelize
data class EpaylaterBannerResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: EpaylaterBannerData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentRequest
*/
@Parcelize
data class ResendOrCancelPaymentRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("request_type")
    var requestType: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LinkStatus
*/
@Parcelize
data class LinkStatus(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentResponse
*/
@Parcelize
data class ResendOrCancelPaymentResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: LinkStatus?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: renderHTMLRequest
*/
@Parcelize
data class renderHTMLRequest(
    
    
    
    @SerializedName("returntype")
    var returntype: String?=null,
    
    @SerializedName("base64_html")
    var base64Html: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: renderHTMLResponse
*/
@Parcelize
data class renderHTMLResponse(
    
    
    
    @SerializedName("html")
    var html: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateVPARequest
*/
@Parcelize
data class ValidateVPARequest(
    
    
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateUPI
*/
@Parcelize
data class ValidateUPI(
    
    
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateVPAResponse
*/
@Parcelize
data class ValidateVPAResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ValidateUPI?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferItemsDetails
*/
@Parcelize
data class TransferItemsDetails(
    
    
    
    @SerializedName("logo_small")
    var logoSmall: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("logo_large")
    var logoLarge: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentLinkResponse
*/
@Parcelize
data class GetPaymentLinkResponse(
    
    
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null,
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkMeta
*/
@Parcelize
data class CreatePaymentLinkMeta(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkRequest
*/
@Parcelize
data class CreatePaymentLinkRequest(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkResponse
*/
@Parcelize
data class CreatePaymentLinkResponse(
    
    
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelOrResendPaymentLinkRequest
*/
@Parcelize
data class CancelOrResendPaymentLinkRequest(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResendPaymentLinkResponse
*/
@Parcelize
data class ResendPaymentLinkResponse(
    
    
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelPaymentLinkResponse
*/
@Parcelize
data class CancelPaymentLinkResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PollingPaymentLinkResponse
*/
@Parcelize
data class PollingPaymentLinkResponse(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodsMeta
*/
@Parcelize
data class PaymentMethodsMeta(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserPaymentMethods
*/
@Parcelize
data class CreateOrderUserPaymentMethods(
    
    
    
    @SerializedName("meta")
    var meta: PaymentMethodsMeta?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserRequest
*/
@Parcelize
data class CreateOrderUserRequest(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success_callback_url")
    var successCallbackUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("failure_callback_url")
    var failureCallbackUrl: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: CreateOrderUserPaymentMethods?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserData
*/
@Parcelize
data class CreateOrderUserData(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserResponse
*/
@Parcelize
data class CreateOrderUserResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("data")
    var data: CreateOrderUserData?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BalanceDetails
*/
@Parcelize
data class BalanceDetails(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("formatted_value")
    var formattedValue: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditSummary
*/
@Parcelize
data class CreditSummary(
    
    
    
    @SerializedName("merchant_customer_ref_id")
    var merchantCustomerRefId: String?=null,
    
    @SerializedName("balance")
    var balance: BalanceDetails?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("status_message")
    var statusMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerCreditSummaryResponse
*/
@Parcelize
data class CustomerCreditSummaryResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectURL
*/
@Parcelize
data class RedirectURL(
    
    
    
    @SerializedName("signup_url")
    var signupUrl: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectToAggregatorResponse
*/
@Parcelize
data class RedirectToAggregatorResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: RedirectURL?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditDetail
*/
@Parcelize
data class CreditDetail(
    
    
    
    @SerializedName("signup_url")
    var signupUrl: String?=null,
    
    @SerializedName("is_registered")
    var isRegistered: Boolean?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCreditResponse
*/
@Parcelize
data class CheckCreditResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: KYCAddress
*/
@Parcelize
data class KYCAddress(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("addressline1")
    var addressline1: String?=null,
    
    @SerializedName("land_mark")
    var landMark: String?=null,
    
    @SerializedName("ownership_type")
    var ownershipType: String?=null,
    
    @SerializedName("addressline2")
    var addressline2: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    
    @SerializedName("shop_and_establishment")
    var shopAndEstablishment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("business_ownership_type")
    var businessOwnershipType: String?=null,
    
    @SerializedName("address")
    var address: KYCAddress?=null,
    
    @SerializedName("fssai")
    var fssai: String?=null,
    
    @SerializedName("fda")
    var fda: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("vintage")
    var vintage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserPersonalInfoInDetails
*/
@Parcelize
data class UserPersonalInfoInDetails(
    
    
    
    @SerializedName("address_as_per_id")
    var addressAsPerId: KYCAddress?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("driving_license")
    var drivingLicense: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("email_verified")
    var emailVerified: Boolean?=null,
    
    @SerializedName("mobile_verified")
    var mobileVerified: Boolean?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("passport")
    var passport: String?=null,
    
    @SerializedName("mothers_name")
    var mothersName: String?=null,
    
    @SerializedName("voter_id")
    var voterId: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("fathers_name")
    var fathersName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeviceDetails
*/
@Parcelize
data class DeviceDetails(
    
    
    
    @SerializedName("device_model")
    var deviceModel: String?=null,
    
    @SerializedName("identification_number")
    var identificationNumber: String?=null,
    
    @SerializedName("device_type")
    var deviceType: String?=null,
    
    @SerializedName("device_make")
    var deviceMake: String?=null,
    
    @SerializedName("os")
    var os: String?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    
    @SerializedName("os_version")
    var osVersion: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceInfo
*/
@Parcelize
data class MarketplaceInfo(
    
    
    
    @SerializedName("membership_id")
    var membershipId: String?=null,
    
    @SerializedName("date_of_joining")
    var dateOfJoining: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboardingRequest
*/
@Parcelize
data class CustomerOnboardingRequest(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("mcc")
    var mcc: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: BusinessDetails?=null,
    
    @SerializedName("personal_info")
    var personalInfo: UserPersonalInfoInDetails?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("device")
    var device: DeviceDetails?=null,
    
    @SerializedName("marketplace_info")
    var marketplaceInfo: MarketplaceInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OnboardSummary
*/
@Parcelize
data class OnboardSummary(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("session")
    var session: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboardingResponse
*/
@Parcelize
data class CustomerOnboardingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: OnboardSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



