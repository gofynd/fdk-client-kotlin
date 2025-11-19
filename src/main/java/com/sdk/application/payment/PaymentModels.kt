package com.sdk.application.payment

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
    
    
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorsConfigDetail
*/
@Parcelize
data class AggregatorsConfigDetail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("env")
    var env: String?=null
    
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
    Model: HttpErrorCodeAndResponseSchema
*/
@Parcelize
data class HttpErrorCodeAndResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HttpErrorCodeDetails
*/
@Parcelize
data class HttpErrorCodeDetails(
    
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCard
*/
@Parcelize
data class AttachCard(
    
    
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("refresh")
    var refresh: Boolean?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardsDetails
*/
@Parcelize
data class AttachCardsDetails(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActiveCardPaymentGatewayDetails
*/
@Parcelize
data class ActiveCardPaymentGatewayDetails(
    
    
    
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
    
    
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListCardsDetails
*/
@Parcelize
data class ListCardsDetails(
    
    
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteCard
*/
@Parcelize
data class DeleteCard(
    
    
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteCardsDetails
*/
@Parcelize
data class DeleteCardsDetails(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomer
*/
@Parcelize
data class ValidateCustomer(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_items")
    var orderItems: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerDetails
*/
@Parcelize
data class ValidateCustomerDetails(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomer
*/
@Parcelize
data class ChargeCustomer(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerDetails
*/
@Parcelize
data class ChargeCustomerDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitialization
*/
@Parcelize
data class PaymentInitialization(
    
    
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationDetails
*/
@Parcelize
data class PaymentInitializationDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("status_code")
    var statusCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdate
*/
@Parcelize
data class PaymentStatusUpdate(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("merchant_url")
    var merchantUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateDetails
*/
@Parcelize
data class PaymentStatusUpdateDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
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
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("partial_payment_allowed")
    var partialPaymentAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("supported_methods")
    var supportedMethods: ArrayList<SupportedMethodDetails>?=null,
    
    @SerializedName("stored_payment_details")
    var storedPaymentDetails: ArrayList<StoredPaymentDetails>?=null,
    
    @SerializedName("suggested_list")
    var suggestedList: ArrayList<String>?=null,
    
    @SerializedName("flow")
    var flow: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SupportedMethodDetails
*/
@Parcelize
data class SupportedMethodDetails(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("api_link")
    var apiLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentDefaultSelection
*/
@Parcelize
data class PaymentDefaultSelection(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("skip")
    var skip: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null,
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null,
    
    @SerializedName("payment_default_selection")
    var paymentDefaultSelection: PaymentDefaultSelection?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AdvanceObject
*/
@Parcelize
data class AdvanceObject(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("time_unit")
    var timeUnit: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("prepayment_type")
    var prepaymentType: String?=null,
    
    @SerializedName("prepayment_value")
    var prepaymentValue: Double?=null,
    
    @SerializedName("cancellation_type")
    var cancellationType: String?=null,
    
    @SerializedName("refund_time_limit")
    var refundTimeLimit: Double?=null,
    
    @SerializedName("all_prepayment_type")
    var allPrepaymentType: ArrayList<String>?=null,
    
    @SerializedName("allow_custom_advance_amount")
    var allowCustomAdvanceAmount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SplitObject
*/
@Parcelize
data class SplitObject(
    
    
    
    @SerializedName("total_number_of_splits")
    var totalNumberOfSplits: Double?=null,
    
    @SerializedName("splits_remaining")
    var splitsRemaining: Double?=null,
    
    @SerializedName("amount_remaining")
    var amountRemaining: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AdvancePaymentObject
*/
@Parcelize
data class AdvancePaymentObject(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Double?=null,
    
    @SerializedName("payment_mode_id")
    var paymentModeId: Double?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("split")
    var split: SplitObject?=null,
    
    @SerializedName("advance")
    var advance: AdvanceObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeRouteDetails
*/
@Parcelize
data class PaymentModeRouteDetails(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_breakup")
    var paymentBreakup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("advance_payment")
    var advancePayment: ArrayList<AdvancePaymentObject>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoredPaymentDetails
*/
@Parcelize
data class StoredPaymentDetails(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("cvv_length")
    var cvvLength: Int?=null,
    
    @SerializedName("cvv_less")
    var cvvLess: Boolean?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WalletLinkRequestSchema
*/
@Parcelize
data class WalletLinkRequestSchema(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("wallet_code")
    var walletCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WalletVerifyRequestSchema
*/
@Parcelize
data class WalletVerifyRequestSchema(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("link_token")
    var linkToken: String?=null,
    
    @SerializedName("otp")
    var otp: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WalletDelinkRequestSchema
*/
@Parcelize
data class WalletDelinkRequestSchema(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("wallet_code")
    var walletCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletResponseSchema
*/
@Parcelize
data class WalletResponseSchema(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPayment
*/
@Parcelize
data class ResendOrCancelPayment(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("request_type")
    var requestType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LinkStatus
*/
@Parcelize
data class LinkStatus(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_payment_done")
    var isPaymentDone: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentDetails
*/
@Parcelize
data class ResendOrCancelPaymentDetails(
    
    
    
    @SerializedName("data")
    var data: LinkStatus?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RenderHTML
*/
@Parcelize
data class RenderHTML(
    
    
    
    @SerializedName("returntype")
    var returntype: String?=null,
    
    @SerializedName("base64_html")
    var base64Html: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RenderHTMLDetails
*/
@Parcelize
data class RenderHTMLDetails(
    
    
    
    @SerializedName("html")
    var html: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateVPA
*/
@Parcelize
data class ValidateVPA(
    
    
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateUPI
*/
@Parcelize
data class ValidateUPI(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateVPADetails
*/
@Parcelize
data class ValidateVPADetails(
    
    
    
    @SerializedName("data")
    var data: ValidateUPI?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CardDetails
*/
@Parcelize
data class CardDetails(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("bank_code")
    var bankCode: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("card_exp_year")
    var cardExpYear: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("card_sub_type")
    var cardSubType: String?=null,
    
    @SerializedName("is_domestic_card")
    var isDomesticCard: Boolean?=null,
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null,
    
    @SerializedName("card_exp_month")
    var cardExpMonth: String?=null,
    
    @SerializedName("extended_card_type")
    var extendedCardType: String?=null,
    
    @SerializedName("card_object")
    var cardObject: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("bank")
    var bank: String?=null,
    
    @SerializedName("cvv_length")
    var cvvLength: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("is_enabled")
    var isEnabled: Boolean?=null,
    
    @SerializedName("is_card_valid")
    var isCardValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CardDetailsFetchedDetails
*/
@Parcelize
data class CardDetailsFetchedDetails(
    
    
    
    @SerializedName("data")
    var data: CardDetails?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferItemsDetails
*/
@Parcelize
data class TransferItemsDetails(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("logo_large")
    var logoLarge: String?=null,
    
    @SerializedName("logo_small")
    var logoSmall: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeDetails
*/
@Parcelize
data class TransferModeDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TransferItemsDetails>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeFetchDetails
*/
@Parcelize
data class TransferModeFetchDetails(
    
    
    
    @SerializedName("data")
    var data: ArrayList<TransferModeDetails>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateRefundTransferMode
*/
@Parcelize
data class UpdateRefundTransferMode(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundTransferModeUpdateDetails
*/
@Parcelize
data class RefundTransferModeUpdateDetails(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryFetchDetails
*/
@Parcelize
data class OrderBeneficiaryFetchDetails(
    
    
    
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
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IfscCodeDetails
*/
@Parcelize
data class IfscCodeDetails(
    
    
    
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
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerification
*/
@Parcelize
data class AddBeneficiaryViaOtpVerification(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationDetails
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationDetails(
    
    
    
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
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetails
*/
@Parcelize
data class AddBeneficiaryDetails(
    
    
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountDetails
*/
@Parcelize
data class RefundAccountDetails(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsOTP
*/
@Parcelize
data class AddBeneficiaryDetailsOTP(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtp
*/
@Parcelize
data class WalletOtp(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpDetails
*/
@Parcelize
data class WalletOtpDetails(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiary
*/
@Parcelize
data class SetDefaultBeneficiary(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryDetails
*/
@Parcelize
data class SetDefaultBeneficiaryDetails(
    
    
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentLinkDetails
*/
@Parcelize
data class GetPaymentLinkDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDetails
*/
@Parcelize
data class ErrorDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkMeta
*/
@Parcelize
data class CreatePaymentLinkMeta(
    
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLink
*/
@Parcelize
data class CreatePaymentLink(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("success_redirection_url")
    var successRedirectionUrl: String?=null,
    
    @SerializedName("failure_redirection_url")
    var failureRedirectionUrl: String?=null,
    
    @SerializedName("send_communication")
    var sendCommunication: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkDetails
*/
@Parcelize
data class CreatePaymentLinkDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelOrResendPaymentLink
*/
@Parcelize
data class CancelOrResendPaymentLink(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResendPaymentLinkDetails
*/
@Parcelize
data class ResendPaymentLinkDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelPaymentLinkDetails
*/
@Parcelize
data class CancelPaymentLinkDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PollingPaymentLinkDetails
*/
@Parcelize
data class PollingPaymentLinkDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodsMeta
*/
@Parcelize
data class PaymentMethodsMeta(
    
    
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserPaymentMethods
*/
@Parcelize
data class CreateOrderUserPaymentMethods(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("meta")
    var meta: PaymentMethodsMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUser
*/
@Parcelize
data class CreateOrderUser(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: CreateOrderUserPaymentMethods?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserData
*/
@Parcelize
data class CreateOrderUserData(
    
    
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserDetails
*/
@Parcelize
data class CreateOrderUserDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreateOrderUserData?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BalanceDetails
*/
@Parcelize
data class BalanceDetails(
    
    
    
    @SerializedName("formatted_value")
    var formattedValue: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditSummary
*/
@Parcelize
data class CreditSummary(
    
    
    
    @SerializedName("total_due_amount")
    var totalDueAmount: BalanceDetails?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("limit")
    var limit: BalanceDetails?=null,
    
    @SerializedName("credit_line_id")
    var creditLineId: String?=null,
    
    @SerializedName("amount_available")
    var amountAvailable: BalanceDetails?=null,
    
    @SerializedName("due_amount")
    var dueAmount: BalanceDetails?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("balance")
    var balance: BalanceDetails?=null,
    
    @SerializedName("status_message")
    var statusMessage: String?=null,
    
    @SerializedName("repayment_url")
    var repaymentUrl: String?=null,
    
    @SerializedName("soa_url")
    var soaUrl: String?=null,
    
    @SerializedName("is_eligible_for_txn")
    var isEligibleForTxn: Boolean?=null,
    
    @SerializedName("merchant_customer_ref_id")
    var merchantCustomerRefId: String?=null,
    
    @SerializedName("buyer_status")
    var buyerStatus: String?=null,
    
    @SerializedName("activation_url")
    var activationUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerCreditSummaryDetails
*/
@Parcelize
data class CustomerCreditSummaryDetails(
    
    
    
    @SerializedName("data")
    var data: CreditSummary?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectURL
*/
@Parcelize
data class RedirectURL(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("extra")
    var extra: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectToAggregatorDetails
*/
@Parcelize
data class RedirectToAggregatorDetails(
    
    
    
    @SerializedName("data")
    var data: RedirectURL?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditDetail
*/
@Parcelize
data class CreditDetail(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("is_registered")
    var isRegistered: Boolean?=null,
    
    @SerializedName("signup_url")
    var signupUrl: String?=null,
    
    @SerializedName("available_credit")
    var availableCredit: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCreditDetails
*/
@Parcelize
data class CheckCreditDetails(
    
    
    
    @SerializedName("data")
    var data: CreditDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: KYCAddress
*/
@Parcelize
data class KYCAddress(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("addressline2")
    var addressline2: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("ownership_type")
    var ownershipType: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("land_mark")
    var landMark: String?=null,
    
    @SerializedName("addressline1")
    var addressline1: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserPersonalInfoInDetails
*/
@Parcelize
data class UserPersonalInfoInDetails(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("voter_id")
    var voterId: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("passport")
    var passport: String?=null,
    
    @SerializedName("fathers_name")
    var fathersName: String?=null,
    
    @SerializedName("mothers_name")
    var mothersName: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("driving_license")
    var drivingLicense: String?=null,
    
    @SerializedName("email_verified")
    var emailVerified: Boolean?=null,
    
    @SerializedName("address_as_per_id")
    var addressAsPerId: KYCAddress?=null,
    
    @SerializedName("mobile_verified")
    var mobileVerified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceInfo
*/
@Parcelize
data class MarketplaceInfo(
    
    
    
    @SerializedName("date_of_joining")
    var dateOfJoining: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("membership_id")
    var membershipId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    
    @SerializedName("business_ownership_type")
    var businessOwnershipType: String?=null,
    
    @SerializedName("vintage")
    var vintage: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("shop_and_establishment")
    var shopAndEstablishment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fssai")
    var fssai: String?=null,
    
    @SerializedName("fda")
    var fda: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: KYCAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeviceDetails
*/
@Parcelize
data class DeviceDetails(
    
    
    
    @SerializedName("identification_number")
    var identificationNumber: String?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    
    @SerializedName("device_model")
    var deviceModel: String?=null,
    
    @SerializedName("device_make")
    var deviceMake: String?=null,
    
    @SerializedName("device_type")
    var deviceType: String?=null,
    
    @SerializedName("os")
    var os: String?=null,
    
    @SerializedName("os_version")
    var osVersion: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboarding
*/
@Parcelize
data class CustomerOnboarding(
    
    
    
    @SerializedName("personal_info")
    var personalInfo: UserPersonalInfoInDetails?=null,
    
    @SerializedName("mcc")
    var mcc: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("marketplace_info")
    var marketplaceInfo: MarketplaceInfo?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: BusinessDetails?=null,
    
    @SerializedName("device")
    var device: DeviceDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OnboardSummary
*/
@Parcelize
data class OnboardSummary(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("session")
    var session: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("status_remark")
    var statusRemark: String?=null,
    
    @SerializedName("is_eligible_for_txn")
    var isEligibleForTxn: Boolean?=null,
    
    @SerializedName("merchant_customer_ref_id")
    var merchantCustomerRefId: String?=null,
    
    @SerializedName("activation_url")
    var activationUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboardingDetails
*/
@Parcelize
data class CustomerOnboardingDetails(
    
    
    
    @SerializedName("data")
    var data: OnboardSummary?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaidOrderDetails
*/
@Parcelize
data class PaidOrderDetails(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteRefundAccountDetails
*/
@Parcelize
data class DeleteRefundAccountDetails(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionsDetails
*/
@Parcelize
data class RefundOptionsDetails(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptions
*/
@Parcelize
data class RefundOptions(
    
    
    
    @SerializedName("items")
    var items: RefundOptionsDetails?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OfflineRefundOptions
*/
@Parcelize
data class OfflineRefundOptions(
    
    
    
    @SerializedName("items")
    var items: RefundOptionsDetails?=null,
    
    @SerializedName("payment_modes")
    var paymentModes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionDetails
*/
@Parcelize
data class RefundOptionDetails(
    
    
    
    @SerializedName("offline_refund_options")
    var offlineRefundOptions: OfflineRefundOptions?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("refund_options")
    var refundOptions: RefundOptions?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SelectedRefundOptionDetails
*/
@Parcelize
data class SelectedRefundOptionDetails(
    
    
    
    @SerializedName("transfer_mode")
    var transferMode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WalletBeneficiaryDetails
*/
@Parcelize
data class WalletBeneficiaryDetails(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("wallet_address")
    var walletAddress: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpiBeneficiaryDetails
*/
@Parcelize
data class UpiBeneficiaryDetails(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("vpa_address")
    var vpaAddress: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryRefundOptions
*/
@Parcelize
data class BeneficiaryRefundOptions(
    
    
    
    @SerializedName("bank")
    var bank: OrderBeneficiaryDetails?=null,
    
    @SerializedName("wallet")
    var wallet: WalletBeneficiaryDetails?=null,
    
    @SerializedName("upi")
    var upi: UpiBeneficiaryDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryDetailsSchemaV2
*/
@Parcelize
data class OrderBeneficiaryDetailsSchemaV2(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("data")
    var data: BeneficiaryRefundOptions?=null,
    
    @SerializedName("limit")
    var limit: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateValidateAddress
*/
@Parcelize
data class ValidateValidateAddress(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VPADetails
*/
@Parcelize
data class VPADetails(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateValidateAddressDetails
*/
@Parcelize
data class ValidateValidateAddressDetails(
    
    
    
    @SerializedName("upi")
    var upi: VPADetails?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("ifsc")
    var ifsc: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodsMetaOrder
*/
@Parcelize
data class PaymentMethodsMetaOrder(
    
    
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrderMethods
*/
@Parcelize
data class PaymentOrderMethods(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment")
    var payment: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("meta")
    var meta: PaymentMethodsMetaOrder?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrder
*/
@Parcelize
data class PaymentOrder(
    
    
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentOrderMethods>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrderData
*/
@Parcelize
data class PaymentOrderData(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrderDetails
*/
@Parcelize
data class PaymentOrderDetails(
    
    
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("data")
    var data: PaymentOrderData?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefund
*/
@Parcelize
data class ShipmentRefund(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefundDetail
*/
@Parcelize
data class ShipmentRefundDetail(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefundDetails
*/
@Parcelize
data class ShipmentRefundDetails(
    
    
    
    @SerializedName("data")
    var data: ShipmentRefundDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerValidationSchema
*/
@Parcelize
data class CustomerValidationSchema(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("transaction_amount")
    var transactionAmount: Double?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCreditSchema
*/
@Parcelize
data class UserCreditSchema(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditAccountSummary
*/
@Parcelize
data class CreditAccountSummary(
    
    
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("redeemable_balance")
    var redeemableBalance: UserCreditSchema?=null,
    
    @SerializedName("available_balance")
    var availableBalance: UserCreditSchema?=null,
    
    @SerializedName("amount_on_hold")
    var amountOnHold: ArrayList<UserCreditSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerCreditSchema
*/
@Parcelize
data class ValidateCustomerCreditSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_eligible")
    var isEligible: Boolean?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("account")
    var account: CreditAccountSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundBeneficiaries
*/
@Parcelize
data class RefundBeneficiaries(
    
    
    
    @SerializedName("upi")
    var upi: ArrayList<UPIBeneficiary>?=null,
    
    @SerializedName("bank")
    var bank: ArrayList<BankBeneficiary>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UPIBeneficiary
*/
@Parcelize
data class UPIBeneficiary(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_verified")
    var isVerified: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("vpa_address")
    var vpaAddress: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankBeneficiary
*/
@Parcelize
data class BankBeneficiary(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_verified")
    var isVerified: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryDetails
*/
@Parcelize
data class BeneficiaryDetails(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("upi")
    var upi: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryRequestDetails
*/
@Parcelize
data class AddBeneficiaryRequestDetails(
    
    
    
    @SerializedName("details")
    var details: BeneficiaryDetails?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryResponseDetails
*/
@Parcelize
data class AddBeneficiaryResponseDetails(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_verified")
    var isVerified: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("upi")
    var upi: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteBeneficiary
*/
@Parcelize
data class DeleteBeneficiary(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteBeneficiaryDetails
*/
@Parcelize
data class DeleteBeneficiaryDetails(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}





