package com.sdk.platform.payment

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    
    @SerializedName("aggregators")
    var aggregators: ArrayList<AggregatorConfig>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorConfig
*/
@Parcelize
data class AggregatorConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("display")
    var display: DisplayDetails?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayDetails
*/
@Parcelize
data class DisplayDetails(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("review_status")
    var reviewStatus: String?=null,
    
    @SerializedName("info")
    var info: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: PaymentGatewayConfig?=null,
    
    @SerializedName("razorpay")
    var razorpay: PaymentGatewayConfig?=null,
    
    @SerializedName("juspay")
    var juspay: PaymentGatewayConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    
    @SerializedName("aggregators")
    var aggregators: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<String>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundErrorCodeAndResponse
*/
@Parcelize
data class RefundErrorCodeAndResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: IFSCErrorData?=null,
    
    @SerializedName("error")
    var error: EDCError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionErrorCodeAndResponse
*/
@Parcelize
data class PaymentOptionErrorCodeAndResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionErrorCodeAndResponse
*/
@Parcelize
data class RefundOptionErrorCodeAndResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: RefundOptionMessage?=null,
    
    @SerializedName("error")
    var error: RefundOptionError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCODAdvanceErrorCodeAndResponse
*/
@Parcelize
data class UserCODAdvanceErrorCodeAndResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: UserCodErrorMessage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserCodErrorMessage
*/
@Parcelize
data class UserCodErrorMessage(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: RefundOptionError?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionMessage
*/
@Parcelize
data class RefundOptionMessage(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("description")
    var description: RefundOptionError?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: ArrayList<String>?=null,
    
    @SerializedName("order_id")
    var orderId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionError
*/
@Parcelize
data class RefundOptionError(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: ArrayList<String>?=null,
    
    @SerializedName("order_id")
    var orderId: ArrayList<String>?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: RefundOptionError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionError
*/
@Parcelize
data class PaymentOptionError(
    
    
    
    @SerializedName("option_type")
    var optionType: ArrayList<String>?=null,
    
    @SerializedName("order_type")
    var orderType: ArrayList<String>?=null,
    
    @SerializedName("checksum")
    var checksum: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSessionError
*/
@Parcelize
data class PaymentSessionError(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: PaymentErrorCodeDescription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentErrorCodeDescription
*/
@Parcelize
data class PaymentErrorCodeDescription(
    
    
    
    @SerializedName("description")
    var description: PaymentOptionError?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EDCError
*/
@Parcelize
data class EDCError(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IFSCErrorData
*/
@Parcelize
data class IFSCErrorData(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("subcode")
    var subcode: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IntentAppErrorList
*/
@Parcelize
data class IntentAppErrorList(
    
    
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductCODData
*/
@Parcelize
data class ProductCODData(
    
    
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: CODChargesLimitsResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CODChargesLimitsResponse
*/
@Parcelize
data class CODChargesLimitsResponse(
    
    
    
    @SerializedName("max_cart_value")
    var maxCartValue: Double?=null,
    
    @SerializedName("min_cart_value")
    var minCartValue: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null
    
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
    
    
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("bank_code")
    var bankCode: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("wallet_name")
    var walletName: String?=null,
    
    @SerializedName("wallet_code")
    var walletCode: String?=null,
    
    @SerializedName("wallet_id")
    var walletId: Int?=null,
    
    @SerializedName("collect_flow")
    var collectFlow: Boolean?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("product_cod_data")
    var productCodData: ProductCODData?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("payment_mode_id")
    var paymentModeId: Int?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("version")
    var version: Version?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Version
*/
@Parcelize
data class Version(
    
    
    
    @SerializedName("razorpay")
    var razorpay: ArrayList<VersionDetails>?=null,
    
    @SerializedName("rupifi")
    var rupifi: ArrayList<VersionDetails>?=null,
    
    @SerializedName("jio")
    var jio: ArrayList<VersionDetails>?=null,
    
    @SerializedName("stripe")
    var stripe: ArrayList<VersionDetails>?=null,
    
    @SerializedName("payumoney")
    var payumoney: ArrayList<VersionDetails>?=null,
    
    @SerializedName("jiopay")
    var jiopay: ArrayList<VersionDetails>?=null,
    
    @SerializedName("fynd")
    var fynd: ArrayList<VersionDetails>?=null,
    
    @SerializedName("potlee")
    var potlee: ArrayList<VersionDetails>?=null,
    
    @SerializedName("juspay")
    var juspay: ArrayList<VersionDetails>?=null,
    
    @SerializedName("simpl")
    var simpl: ArrayList<VersionDetails>?=null,
    
    @SerializedName("checkout")
    var checkout: ArrayList<VersionDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VersionDetails
*/
@Parcelize
data class VersionDetails(
    
    
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentFlowData
*/
@Parcelize
data class PaymentFlowData(
    
    
    
    @SerializedName("is_customer_validation_required")
    var isCustomerValidationRequired: Boolean?=null,
    
    @SerializedName("cust_validation_url")
    var custValidationUrl: String?=null,
    
    @SerializedName("config")
    var config: PaymentConfig?=null,
    
    @SerializedName("data")
    var data: GatewayData?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentConfig
*/
@Parcelize
data class PaymentConfig(
    
    
    
    @SerializedName("redirect")
    var redirect: Boolean?=null,
    
    @SerializedName("final_payment_action_url")
    var finalPaymentActionUrl: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("action_url")
    var actionUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GatewayData
*/
@Parcelize
data class GatewayData(
    
    
    
    @SerializedName("route")
    var route: String?=null,
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("is_customer_validation_required")
    var isCustomerValidationRequired: Boolean?=null,
    
    @SerializedName("cust_validation_url")
    var custValidationUrl: String?=null,
    
    @SerializedName("sdk")
    var sdk: SDKDetails?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null,
    
    @SerializedName("user_email")
    var userEmail: String?=null,
    
    @SerializedName("user_phone")
    var userPhone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SDKDetails
*/
@Parcelize
data class SDKDetails(
    
    
    
    @SerializedName("config")
    var config: SDKConfig?=null,
    
    @SerializedName("data")
    var data: UserData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SDKConfig
*/
@Parcelize
data class SDKConfig(
    
    
    
    @SerializedName("redirect")
    var redirect: Boolean?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("action_url")
    var actionUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserData
*/
@Parcelize
data class UserData(
    
    
    
    @SerializedName("user_phone")
    var userPhone: String?=null,
    
    @SerializedName("user_email")
    var userEmail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRouteData
*/
@Parcelize
data class AggregatorRouteData(
    
    
    
    @SerializedName("gateway")
    var gateway: GatewayData?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: PaymentFlowData?=null,
    
    @SerializedName("data")
    var data: GatewayData?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    
    @SerializedName("route")
    var route: String?=null,
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("is_customer_validation_required")
    var isCustomerValidationRequired: Boolean?=null,
    
    @SerializedName("cust_validation_url")
    var custValidationUrl: String?=null,
    
    @SerializedName("sdk")
    var sdk: SDKDetails?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null,
    
    @SerializedName("user_email")
    var userEmail: String?=null,
    
    @SerializedName("user_phone")
    var userPhone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("data")
    var data: AggregatorRouteData?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    
    @SerializedName("epaylater")
    var epaylater: AggregatorRoute?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    
    @SerializedName("ajiodhan")
    var ajiodhan: AggregatorRoute?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorRoute?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    
    @SerializedName("jiopay")
    var jiopay: AggregatorRoute?=null,
    
    @SerializedName("jio")
    var jio: AggregatorRoute?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorRoute?=null,
    
    @SerializedName("openapi")
    var openapi: AggregatorRoute?=null,
    
    @SerializedName("potlee")
    var potlee: AggregatorRoute?=null,
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    
    @SerializedName("creditnote")
    var creditnote: AggregatorRoute?=null,
    
    @SerializedName("pinelabs")
    var pinelabs: AggregatorRoute?=null,
    
    @SerializedName("checkout")
    var checkout: AggregatorRoute?=null,
    
    @SerializedName("cashfree")
    var cashfree: AggregatorRoute?=null,
    
    @SerializedName("jio_extension")
    var jioExtension: AggregatorRoute?=null
    
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
    var paymentFlows: PaymentFlow?=null
    
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
    
    @SerializedName("all_cancellation_type")
    var allCancellationType: ArrayList<String>?=null,
    
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
    
    
    
    @SerializedName("version")
    var version: Version?=null,
    
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
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_breakup")
    var paymentBreakup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("advance_payment")
    var advancePayment: ArrayList<AdvancePaymentObject>?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArrayList<DeliverySlot>?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("max_cart_value")
    var maxCartValue: Int?=null,
    
    @SerializedName("min_cart_value")
    var minCartValue: Int?=null,
    
    @SerializedName("store_emp_list")
    var storeEmpList: ArrayList<String>?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Int?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Int?=null,
    
    @SerializedName("product_cod_data")
    var productCodData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_product_cod_available")
    var isProductCodAvailable: Boolean?=null,
    
    @SerializedName("is_pincode_cod_available")
    var isPincodeCodAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliverySlot
*/
@Parcelize
data class DeliverySlot(
    
    
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: ArrayList<DeliverySlotDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeliverySlotDetail
*/
@Parcelize
data class DeliverySlotDetail(
    
    
    
    @SerializedName("delivery_slot_timing")
    var deliverySlotTiming: String?=null,
    
    @SerializedName("delivery_slot_id")
    var deliverySlotId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_breakup")
    var paymentBreakup: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutCustomer
*/
@Parcelize
data class PayoutCustomer(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutMoreAttributes
*/
@Parcelize
data class PayoutMoreAttributes(
    
    
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutAggregator
*/
@Parcelize
data class PayoutAggregator(
    
    
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("aggregator_fund_id")
    var aggregatorFundId: Int?=null,
    
    @SerializedName("payout_details_id")
    var payoutDetailsId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Payout
*/
@Parcelize
data class Payout(
    
    
    
    @SerializedName("customers")
    var customers: PayoutCustomer?=null,
    
    @SerializedName("more_attributes")
    var moreAttributes: PayoutMoreAttributes?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: ArrayList<PayoutAggregator>?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<Payout>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutBankDetails
*/
@Parcelize
data class PayoutBankDetails(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutUserDetails
*/
@Parcelize
data class PayoutUserDetails(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("users")
    var users: PayoutUserDetails?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    
    @SerializedName("users")
    var users: PayoutUserDetails?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("payouts")
    var payouts: PayoutDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutDetails
*/
@Parcelize
data class PayoutDetails(
    
    
    
    @SerializedName("more_attributes")
    var moreAttributes: BankDetails?=null,
    
    @SerializedName("aggregator_fund_id")
    var aggregatorFundId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetails
*/
@Parcelize
data class BankDetails(
    
    
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("aggregator_fund_id")
    var aggregatorFundId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("users")
    var users: PayoutUserDetails?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("updated")
    var updated: Boolean?=null,
    
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    
    @SerializedName("payouts")
    var payouts: Payouts?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Payouts
*/
@Parcelize
data class Payouts(
    
    
    
    @SerializedName("aggregator_fund_id")
    var aggregatorFundId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeletePayoutResponse
*/
@Parcelize
data class DeletePayoutResponse(
    
    
    
    @SerializedName("delete")
    var delete: Boolean?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetRefundAccountResponse
*/
@Parcelize
data class GetRefundAccountResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<BankDetailsForOTP>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("is_verified")
    var isVerified: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("txn_id")
    var txnId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("default_beneficiary")
    var defaultBeneficiary: Boolean?=null
    
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
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("bank")
    var bank: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("payment_gateway_slug")
    var paymentGatewaySlug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentConfirmationRequest
*/
@Parcelize
data class PaymentConfirmationRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentConfirmationResponse
*/
@Parcelize
data class PaymentConfirmationResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: String?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AdvancePaymentLimitConfig
*/
@Parcelize
data class AdvancePaymentLimitConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("prepayment_type")
    var prepaymentType: String?=null,
    
    @SerializedName("prepayment_value")
    var prepaymentValue: Double?=null,
    
    @SerializedName("cancellation_type")
    var cancellationType: String?=null,
    
    @SerializedName("all_cancellation_type")
    var allCancellationType: ArrayList<String>?=null,
    
    @SerializedName("all_prepayment_type")
    var allPrepaymentType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CODLimitConfig
*/
@Parcelize
data class CODLimitConfig(
    
    
    
    @SerializedName("storefront")
    var storefront: Double?=null,
    
    @SerializedName("pos")
    var pos: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CODPaymentLimitConfig
*/
@Parcelize
data class CODPaymentLimitConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("usages")
    var usages: Double?=null,
    
    @SerializedName("user_id")
    var userId: Int?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: String?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Int?=null,
    
    @SerializedName("limit")
    var limit: CODLimitConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetUserBULimitResponse
*/
@Parcelize
data class GetUserBULimitResponse(
    
    
    
    @SerializedName("buisness_unit")
    var buisnessUnit: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("config")
    var config: CODPaymentLimitConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetUserCODLimitResponse
*/
@Parcelize
data class GetUserCODLimitResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetUserBULimitResponse>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetAdvanceLimitConfig
*/
@Parcelize
data class SetAdvanceLimitConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("prepayment_type")
    var prepaymentType: String?=null,
    
    @SerializedName("prepayment_value")
    var prepaymentValue: Double?=null,
    
    @SerializedName("cancellation_type")
    var cancellationType: String?=null,
    
    @SerializedName("all_cancellation_type")
    var allCancellationType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetCODLimitConfig
*/
@Parcelize
data class SetCODLimitConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("usages")
    var usages: Double?=null,
    
    @SerializedName("user_id")
    var userId: Int?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: String?=null,
    
    @SerializedName("limit")
    var limit: CODLimitConfig?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetUserPaymentLimitConfig
*/
@Parcelize
data class SetUserPaymentLimitConfig(
    
    
    
    @SerializedName("advance")
    var advance: SetAdvanceLimitConfig?=null,
    
    @SerializedName("cod")
    var cod: SetCODLimitConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetBUPaymentLimit
*/
@Parcelize
data class SetBUPaymentLimit(
    
    
    
    @SerializedName("buisness_unit")
    var buisnessUnit: String?=null,
    
    @SerializedName("config")
    var config: SetUserPaymentLimitConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetCODForUserRequest
*/
@Parcelize
data class SetCODForUserRequest(
    
    
    
    @SerializedName("mobile_no")
    var mobileNo: String?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<SetBUPaymentLimit>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcModelData
*/
@Parcelize
data class EdcModelData(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("models")
    var models: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcAggregatorAndModelListResponse
*/
@Parcelize
data class EdcAggregatorAndModelListResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<EdcModelData>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StatisticsData
*/
@Parcelize
data class StatisticsData(
    
    
    
    @SerializedName("inactive_device_count")
    var inactiveDeviceCount: Int?=null,
    
    @SerializedName("active_device_count")
    var activeDeviceCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDeviceStatsResponse
*/
@Parcelize
data class EdcDeviceStatsResponse(
    
    
    
    @SerializedName("statistics")
    var statistics: StatisticsData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EdcAddRequest
*/
@Parcelize
data class EdcAddRequest(
    
    
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null,
    
    @SerializedName("terminal_serial_no")
    var terminalSerialNo: String?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDevice
*/
@Parcelize
data class EdcDevice(
    
    
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("terminal_unique_identifier")
    var terminalUniqueIdentifier: String?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("terminal_serial_no")
    var terminalSerialNo: String?=null,
    
    @SerializedName("merchant_store_pos_code")
    var merchantStorePosCode: String?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDeviceAddResponse
*/
@Parcelize
data class EdcDeviceAddResponse(
    
    
    
    @SerializedName("data")
    var data: EdcDevice?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDeviceDetailsResponse
*/
@Parcelize
data class EdcDeviceDetailsResponse(
    
    
    
    @SerializedName("data")
    var data: EdcDevice?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EdcUpdateRequest
*/
@Parcelize
data class EdcUpdateRequest(
    
    
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("merchant_store_pos_code")
    var merchantStorePosCode: String?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDeviceUpdateResponse
*/
@Parcelize
data class EdcDeviceUpdateResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: EdcDeviceListResponse
*/
@Parcelize
data class EdcDeviceListResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EdcDevice>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("unique_link_id")
    var uniqueLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentRequest
*/
@Parcelize
data class ResendOrCancelPaymentRequest(
    
    
    
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
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentResponse
*/
@Parcelize
data class ResendOrCancelPaymentResponse(
    
    
    
    @SerializedName("data")
    var data: LinkStatus?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusBulkHandlerRequest
*/
@Parcelize
data class PaymentStatusBulkHandlerRequest(
    
    
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentObjectListSerializer
*/
@Parcelize
data class PaymentObjectListSerializer(
    
    
    
    @SerializedName("user_object")
    var userObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("collected_by")
    var collectedBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("refund_object")
    var refundObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("aggregator_payment_object")
    var aggregatorPaymentObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("refunded_by")
    var refundedBy: String?=null,
    
    @SerializedName("amount_in_paisa")
    var amountInPaisa: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("payment_mode_identifier")
    var paymentModeIdentifier: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("all_status")
    var allStatus: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusObject
*/
@Parcelize
data class PaymentStatusObject(
    
    
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("payment_object_list")
    var paymentObjectList: ArrayList<PaymentObjectListSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusBulkHandlerResponse
*/
@Parcelize
data class PaymentStatusBulkHandlerResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("data")
    var data: ArrayList<PaymentStatusObject>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetOauthUrlResponse
*/
@Parcelize
data class GetOauthUrlResponse(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RevokeOAuthToken
*/
@Parcelize
data class RevokeOAuthToken(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RepaymentRequestDetails
*/
@Parcelize
data class RepaymentRequestDetails(
    
    
    
    @SerializedName("fwd_shipment_id")
    var fwdShipmentId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("outstanding_details_id")
    var outstandingDetailsId: Int?=null,
    
    @SerializedName("aggregator_transaction_id")
    var aggregatorTransactionId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("payment_mode_identifier")
    var paymentModeIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RepaymentDetailsSerialiserPayAll
*/
@Parcelize
data class RepaymentDetailsSerialiserPayAll(
    
    
    
    @SerializedName("total_amount")
    var totalAmount: Double?=null,
    
    @SerializedName("extension_order_id")
    var extensionOrderId: String?=null,
    
    @SerializedName("aggregator_transaction_id")
    var aggregatorTransactionId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("shipment_details")
    var shipmentDetails: ArrayList<RepaymentRequestDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RepaymentResponse
*/
@Parcelize
data class RepaymentResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MerchantOnBoardingRequest
*/
@Parcelize
data class MerchantOnBoardingRequest(
    
    
    
    @SerializedName("credit_line_id")
    var creditLineId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MerchantOnBoardingResponse
*/
@Parcelize
data class MerchantOnBoardingResponse(
    
    
    
    @SerializedName("data")
    var data: MerchantOnboardingData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MerchantOnboardingData
*/
@Parcelize
data class MerchantOnboardingData(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: AddressDetail?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("order_items")
    var orderItems: ArrayList<OrderItems>?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: MerchantParams?=null,
    
    @SerializedName("billing_address")
    var billingAddress: AddressDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MerchantParams
*/
@Parcelize
data class MerchantParams(
    
    
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderItems
*/
@Parcelize
data class OrderItems(
    
    
    
    @SerializedName("sku")
    var sku: String?=null,
    
    @SerializedName("price")
    var price: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
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
    var data: ValidateCustomer?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ValidateCustomer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomer
*/
@Parcelize
data class ValidateCustomer(
    
    
    
    @SerializedName("data")
    var data: ValidateCustomerData?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("api_version")
    var apiVersion: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerData
*/
@Parcelize
data class ValidateCustomerData(
    
    
    
    @SerializedName("approved")
    var approved: Boolean?=null,
    
    @SerializedName("button_text")
    var buttonText: String?=null,
    
    @SerializedName("first_transaction")
    var firstTransaction: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("total_credited_balance")
    var totalCreditedBalance: Double?=null,
    
    @SerializedName("is_cn_locked")
    var isCnLocked: Boolean?=null,
    
    @SerializedName("total_locked_amount")
    var totalLockedAmount: Double?=null,
    
    @SerializedName("allowed_redemption_amount")
    var allowedRedemptionAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentLinkResponse
*/
@Parcelize
data class GetPaymentLinkResponse(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null
    
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
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkRequest
*/
@Parcelize
data class CreatePaymentLinkRequest(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkResponse
*/
@Parcelize
data class CreatePaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PollingPaymentLinkResponse
*/
@Parcelize
data class PollingPaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
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
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentLinkError
*/
@Parcelize
data class PaymentLinkError(
    
    
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("msg")
    var msg: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CancelPaymentLinkResponse
*/
@Parcelize
data class CancelPaymentLinkResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Code
*/
@Parcelize
data class Code(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCode
*/
@Parcelize
data class PaymentCode(
    
    
    
    @SerializedName("codes")
    var codes: ArrayList<Code>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentCode
*/
@Parcelize
data class GetPaymentCode(
    
    
    
    @SerializedName("cod")
    var cod: PaymentCode?=null,
    
    @SerializedName("nb")
    var nb: PaymentCode?=null,
    
    @SerializedName("wl")
    var wl: PaymentCode?=null,
    
    @SerializedName("card")
    var card: PaymentCode?=null,
    
    @SerializedName("pl")
    var pl: PaymentCode?=null,
    
    @SerializedName("ps")
    var ps: PaymentCode?=null,
    
    @SerializedName("op")
    var op: PaymentCode?=null,
    
    @SerializedName("upi")
    var upi: PaymentCode?=null,
    
    @SerializedName("qr")
    var qr: PaymentCode?=null,
    
    @SerializedName("fc")
    var fc: PaymentCode?=null,
    
    @SerializedName("pac")
    var pac: PaymentCode?=null,
    
    @SerializedName("stripepg")
    var stripepg: PaymentCode?=null,
    
    @SerializedName("payumoneypg")
    var payumoneypg: PaymentCode?=null,
    
    @SerializedName("rupifipg")
    var rupifipg: PaymentCode?=null,
    
    @SerializedName("cas")
    var cas: PaymentCode?=null,
    
    @SerializedName("csas")
    var csas: PaymentCode?=null,
    
    @SerializedName("ccavenuepg")
    var ccavenuepg: PaymentCode?=null,
    
    @SerializedName("cardless_emi")
    var cardlessEmi: PaymentCode?=null,
    
    @SerializedName("cashback")
    var cashback: PaymentCode?=null,
    
    @SerializedName("loyalty")
    var loyalty: PaymentCode?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: PaymentCode?=null,
    
    @SerializedName("paymentlink")
    var paymentlink: PaymentCode?=null,
    
    @SerializedName("epaylater")
    var epaylater: PaymentCode?=null,
    
    @SerializedName("udhaari")
    var udhaari: PaymentCode?=null,
    
    @SerializedName("creditnote")
    var creditnote: PaymentCode?=null,
    
    @SerializedName("checkout")
    var checkout: PaymentCode?=null,
    
    @SerializedName("rone")
    var rone: PaymentCode?=null,
    
    @SerializedName("emi")
    var emi: PaymentCode?=null,
    
    @SerializedName("sodexo")
    var sodexo: PaymentCode?=null,
    
    @SerializedName("jm_wallet")
    var jmWallet: PaymentCode?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentCodeResponse
*/
@Parcelize
data class GetPaymentCodeResponse(
    
    
    
    @SerializedName("data")
    var data: GetPaymentCode?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOnlineOfflinePaymentResponse
*/
@Parcelize
data class PlatformOnlineOfflinePaymentResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: PlatformOnlineOfflineItem?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PatchPlatformOnlineOfflinePaymentResponse
*/
@Parcelize
data class PatchPlatformOnlineOfflinePaymentResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PlatformOnlineOfflineItem>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOnlineOfflineItem
*/
@Parcelize
data class PlatformOnlineOfflineItem(
    
    
    
    @SerializedName("online")
    var online: OnlinePaymentDetails?=null,
    
    @SerializedName("offline")
    var offline: OfflinePaymentDetails?=null,
    
    @SerializedName("advance")
    var advance: PlatformOfflineAdvanceResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OnlinePaymentDetails
*/
@Parcelize
data class OnlinePaymentDetails(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("aggregators")
    var aggregators: ArrayList<AggregatorDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OfflinePaymentDetails
*/
@Parcelize
data class OfflinePaymentDetails(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payment_modes")
    var paymentModes: CODOffline?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CODOffline
*/
@Parcelize
data class CODOffline(
    
    
    
    @SerializedName("cod")
    var cod: CODPaymentMode?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AggregatorDetails
*/
@Parcelize
data class AggregatorDetails(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null,
    
    @SerializedName("config")
    var config: ArrayList<String>?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_tnc_accepted")
    var isTncAccepted: Boolean?=null,
    
    @SerializedName("label")
    var label: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CODPaymentMode
*/
@Parcelize
data class CODPaymentMode(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformPaymentModeRequest
*/
@Parcelize
data class PlatformPaymentModeRequest(
    
    
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("device")
    var device: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentModeItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformPaymentModeResponse
*/
@Parcelize
data class PlatformPaymentModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("device")
    var device: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentOptionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorPlatformPaymentModeResponse
*/
@Parcelize
data class AggregatorPlatformPaymentModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("device")
    var device: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("save_allowed")
    var saveAllowed: Boolean?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentOptionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOfflineAdvanceRequest
*/
@Parcelize
data class PlatformOfflineAdvanceRequest(
    
    
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<OfflineAdvanceConfig>?=null,
    
    @SerializedName("device")
    var device: OfflineAdvanceDevice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformOfflineAdvanceResponse
*/
@Parcelize
data class PlatformOfflineAdvanceResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<OfflineAdvanceConfigurationItem>?=null,
    
    @SerializedName("errors")
    var errors: ErrorCodeAndDescription?=null,
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfflineAdvanceConfigurationItem
*/
@Parcelize
data class OfflineAdvanceConfigurationItem(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("config")
    var config: OfflineAdvanceConfig?=null,
    
    @SerializedName("device")
    var device: OfflineAdvanceDevice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfflineAdvanceDevice
*/
@Parcelize
data class OfflineAdvanceDevice(
    
    
    
    @SerializedName("android")
    var android: Boolean?=null,
    
    @SerializedName("ios")
    var ios: Boolean?=null,
    
    @SerializedName("desktop")
    var desktop: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfflineAdvanceConfig
*/
@Parcelize
data class OfflineAdvanceConfig(
    
    
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    
    @SerializedName("user_limit")
    var userLimit: Int?=null,
    
    @SerializedName("charges")
    var charges: Int?=null,
    
    @SerializedName("charges_max_value")
    var chargesMaxValue: Int?=null,
    
    @SerializedName("charges_min_value")
    var chargesMinValue: Int?=null,
    
    @SerializedName("max_order_value")
    var maxOrderValue: Int?=null,
    
    @SerializedName("min_order_value")
    var minOrderValue: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("number_of_split")
    var numberOfSplit: Double?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("save_allowed")
    var saveAllowed: Boolean?=null,
    
    @SerializedName("prepayment_type")
    var prepaymentType: String?=null,
    
    @SerializedName("prepayment_value")
    var prepaymentValue: Int?=null,
    
    @SerializedName("refund_time_limit")
    var refundTimeLimit: Int?=null,
    
    @SerializedName("time_unit")
    var timeUnit: String?=null,
    
    @SerializedName("cancellation_type")
    var cancellationType: String?=null,
    
    @SerializedName("all_cancellation_type")
    var allCancellationType: ArrayList<String>?=null,
    
    @SerializedName("allow_custom_advance_amount")
    var allowCustomAdvanceAmount: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeItem
*/
@Parcelize
data class PaymentModeItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("sub_payment_mode")
    var subPaymentMode: ArrayList<SubPaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MerchantPaymentModeRequest
*/
@Parcelize
data class MerchantPaymentModeRequest(
    
    
    
    @SerializedName("offline")
    var offline: ModeIsactive?=null,
    
    @SerializedName("online")
    var online: ModeIsactive?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ModeIsactive
*/
@Parcelize
data class ModeIsactive(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OfferSerializer
*/
@Parcelize
data class OfferSerializer(
    
    
    
    @SerializedName("offer_amount")
    var offerAmount: Double?=null,
    
    @SerializedName("offer_code")
    var offerCode: String?=null,
    
    @SerializedName("offer_description")
    var offerDescription: String?=null,
    
    @SerializedName("offer_id")
    var offerId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedOfferSerializer
*/
@Parcelize
data class AppliedOfferSerializer(
    
    
    
    @SerializedName("total_applied_offer_amount")
    var totalAppliedOfferAmount: Double?=null,
    
    @SerializedName("offer_list")
    var offerList: ArrayList<OfferSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDetail
*/
@Parcelize
data class OrderDetail(
    
    
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("aggregator_order_details")
    var aggregatorOrderDetails: AggregatorOrderDetail?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorOrderDetail
*/
@Parcelize
data class AggregatorOrderDetail(
    
    
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GoogleMapPoint
*/
@Parcelize
data class GoogleMapPoint(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("sub_locality")
    var subLocality: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddressDetail
*/
@Parcelize
data class AddressDetail(
    
    
    
    @SerializedName("line1")
    var line1: String?=null,
    
    @SerializedName("line2")
    var line2: String?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: GoogleMapPoint?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("g_address_id")
    var gAddressId: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LatLongDetail
*/
@Parcelize
data class LatLongDetail(
    
    
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSessionDetail
*/
@Parcelize
data class PaymentSessionDetail(
    
    
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("success_url")
    var successUrl: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: AddressDetail?=null,
    
    @SerializedName("amount_captured")
    var amountCaptured: Int?=null,
    
    @SerializedName("amount_refunded")
    var amountRefunded: Int?=null,
    
    @SerializedName("aggregator_customer_id")
    var aggregatorCustomerId: String?=null,
    
    @SerializedName("cancel_url")
    var cancelUrl: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMode>?=null,
    
    @SerializedName("created")
    var created: String?=null,
    
    @SerializedName("g_user_id")
    var gUserId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("merchant_locale")
    var merchantLocale: String?=null,
    
    @SerializedName("locale")
    var locale: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: AddressDetail?=null,
    
    @SerializedName("captured")
    var captured: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AmountSerializer
*/
@Parcelize
data class AmountSerializer(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeAmountSerializer
*/
@Parcelize
data class ChargeAmountSerializer(
    
    
    
    @SerializedName("ordering_currency")
    var orderingCurrency: AmountSerializer?=null,
    
    @SerializedName("base_currency")
    var baseCurrency: AmountSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartChargesSerializer
*/
@Parcelize
data class CartChargesSerializer(
    
    
    
    @SerializedName("charge_type")
    var chargeType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("amount")
    var amount: ChargeAmountSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentSessionResponse
*/
@Parcelize
data class GetPaymentSessionResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("applied_payment_offers")
    var appliedPaymentOffers: AppliedOfferSerializer?=null,
    
    @SerializedName("checksum")
    var checksum: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_details")
    var paymentDetails: PaymentSessionDetail?=null,
    
    @SerializedName("cart_details")
    var cartDetails: CartDetailsSerializer?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null,
    
    @SerializedName("refund_details")
    var refundDetails: ArrayList<RefundDetailsSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSessionRequestSerializer
*/
@Parcelize
data class PaymentSessionRequestSerializer(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("applied_payment_offers")
    var appliedPaymentOffers: AppliedOfferSerializer?=null,
    
    @SerializedName("checksum")
    var checksum: String?=null,
    
    @SerializedName("order_details")
    var orderDetails: OrderDetail?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_details")
    var paymentDetails: ArrayList<PaymentSessionDetail>?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransactionDetail
*/
@Parcelize
data class TransactionDetail(
    
    
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSessionResponseSerializer
*/
@Parcelize
data class PaymentSessionResponseSerializer(
    
    
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("platform_transaction_details")
    var platformTransactionDetails: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("transaction_details")
    var transactionDetails: ArrayList<TransactionDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundSessionDetail
*/
@Parcelize
data class RefundSessionDetail(
    
    
    
    @SerializedName("refund_utr")
    var refundUtr: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("created")
    var created: String?=null,
    
    @SerializedName("source_transfer_reversal")
    var sourceTransferReversal: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("transfer_reversal")
    var transferReversal: String?=null,
    
    @SerializedName("balance_transaction")
    var balanceTransaction: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundSessionRequestSerializer
*/
@Parcelize
data class RefundSessionRequestSerializer(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_details")
    var paymentDetails: PaymentSessionDetail?=null,
    
    @SerializedName("checksum")
    var checksum: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null,
    
    @SerializedName("refund_details")
    var refundDetails: ArrayList<RefundSessionDetail>?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundSessionResponseSerializer
*/
@Parcelize
data class RefundSessionResponseSerializer(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("platform_refund_details")
    var platformRefundDetails: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("total_refund_amount")
    var totalRefundAmount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentDetailsSerializer
*/
@Parcelize
data class PaymentDetailsSerializer(
    
    
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("amount_refunded")
    var amountRefunded: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("merchant_locale")
    var merchantLocale: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("success_url")
    var successUrl: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("captured")
    var captured: Boolean?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("g_user_id")
    var gUserId: String?=null,
    
    @SerializedName("locale")
    var locale: String?=null,
    
    @SerializedName("cancel_url")
    var cancelUrl: String?=null,
    
    @SerializedName("created")
    var created: String?=null,
    
    @SerializedName("amount_captured")
    var amountCaptured: Int?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("aggregator_customer_id")
    var aggregatorCustomerId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailsSerializer
*/
@Parcelize
data class CartDetailsSerializer(
    
    
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_charges")
    var cartCharges: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundDetailsSerializer
*/
@Parcelize
data class RefundDetailsSerializer(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("created")
    var created: String?=null,
    
    @SerializedName("refund_utr")
    var refundUtr: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSessionSerializer
*/
@Parcelize
data class PaymentSessionSerializer(
    
    
    
    @SerializedName("payment_details")
    var paymentDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("total_amount")
    var totalAmount: Int?=null,
    
    @SerializedName("gid")
    var gid: String?=null,
    
    @SerializedName("cart_details")
    var cartDetails: CartDetailsSerializer?=null,
    
    @SerializedName("refund_details")
    var refundDetails: ArrayList<RefundDetailsSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundSourcesPriority
*/
@Parcelize
data class RefundSourcesPriority(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundPriorityResponseSerializer
*/
@Parcelize
data class RefundPriorityResponseSerializer(
    
    
    
    @SerializedName("configuration")
    var configuration: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("apportion")
    var apportion: Boolean?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("settle_offline")
    var settleOffline: Boolean?=null,
    
    @SerializedName("refund_sources_priority")
    var refundSourcesPriority: ArrayList<RefundSourcesPriority>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundPriorityRequestSerializer
*/
@Parcelize
data class RefundPriorityRequestSerializer(
    
    
    
    @SerializedName("settle_offline")
    var settleOffline: Boolean?=null,
    
    @SerializedName("apportion")
    var apportion: Boolean?=null,
    
    @SerializedName("refund_sources_priority")
    var refundSourcesPriority: ArrayList<RefundSourcesPriority>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FromConfig
*/
@Parcelize
data class FromConfig(
    
    
    
    @SerializedName("device")
    var device: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ToConfig
*/
@Parcelize
data class ToConfig(
    
    
    
    @SerializedName("device")
    var device: ArrayList<String>?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformPaymentModeCopyConfigRequest
*/
@Parcelize
data class PlatformPaymentModeCopyConfigRequest(
    
    
    
    @SerializedName("from_config")
    var fromConfig: FromConfig?=null,
    
    @SerializedName("to_config")
    var toConfig: ToConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodsMetaOrder
*/
@Parcelize
data class PaymentMethodsMetaOrder(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_extra_identifiers")
    var paymentExtraIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null
    
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
    Model: PaymentOrderRequest
*/
@Parcelize
data class PaymentOrderRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentOrderMethods>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("customer_details")
    var customerDetails: CustomerDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerDetails
*/
@Parcelize
data class CustomerDetails(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrderData
*/
@Parcelize
data class PaymentOrderData(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("encdata")
    var encdata: String?=null,
    
    @SerializedName("checksum")
    var checksum: String?=null,
    
    @SerializedName("mcode")
    var mcode: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("payment_mode_identifier")
    var paymentModeIdentifier: String?=null,
    
    @SerializedName("bank")
    var bank: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOrderResponse
*/
@Parcelize
data class PaymentOrderResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("data")
    var data: PaymentOrderData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorVersionItemSchema
*/
@Parcelize
data class AggregatorVersionItemSchema(
    
    
    
    @SerializedName("is_equal_to")
    var isEqualTo: String?=null,
    
    @SerializedName("is_less_than")
    var isLessThan: String?=null,
    
    @SerializedName("is_greater_than")
    var isGreaterThan: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorVersionResponse
*/
@Parcelize
data class AggregatorVersionResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<AggregatorVersionItemSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorVersionRequestSchema
*/
@Parcelize
data class AggregatorVersionRequestSchema(
    
    
    
    @SerializedName("is_equal_to")
    var isEqualTo: String?=null,
    
    @SerializedName("is_less_than")
    var isLessThan: String?=null,
    
    @SerializedName("is_greater_than")
    var isGreaterThan: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorControlRequest
*/
@Parcelize
data class AggregatorControlRequest(
    
    
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("device")
    var device: String?=null,
    
    @SerializedName("version")
    var version: AggregatorVersionRequestSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeCustomConfigSchema
*/
@Parcelize
data class PaymentModeCustomConfigSchema(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("custom_config")
    var customConfig: PaymentCustomConfigDetailsSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigDetailsSchema
*/
@Parcelize
data class PaymentCustomConfigDetailsSchema(
    
    
    
    @SerializedName("customer")
    var customer: PaymentCustomConfigCustomerSchema?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: PaymentCustomConfigDetailsSchema?=null,
    
    @SerializedName("min_order_value")
    var minOrderValue: Double?=null,
    
    @SerializedName("available")
    var available: Boolean?=null,
    
    @SerializedName("pre_order")
    var preOrder: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigCustomerSchema
*/
@Parcelize
data class PaymentCustomConfigCustomerSchema(
    
    
    
    @SerializedName("restriction")
    var restriction: String?=null,
    
    @SerializedName("groups")
    var groups: ArrayList<Int>?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigModeSchema
*/
@Parcelize
data class PaymentCustomConfigModeSchema(
    
    
    
    @SerializedName("available")
    var available: Boolean?=null,
    
    @SerializedName("pre_order")
    var preOrder: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigDetailsRequestSchema
*/
@Parcelize
data class PaymentCustomConfigDetailsRequestSchema(
    
    
    
    @SerializedName("customer")
    var customer: PaymentCustomConfigCustomerRequestSchema?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: PaymentCustomConfigModeSchema?=null,
    
    @SerializedName("min_order_value")
    var minOrderValue: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigCustomerRequestSchema
*/
@Parcelize
data class PaymentCustomConfigCustomerRequestSchema(
    
    
    
    @SerializedName("restriction")
    var restriction: String?=null,
    
    @SerializedName("groups")
    var groups: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigRequestSchema
*/
@Parcelize
data class PaymentCustomConfigRequestSchema(
    
    
    
    @SerializedName("business_unit")
    var businessUnit: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentCustomConfigDetailsRequestSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCustomConfigResponseSchema
*/
@Parcelize
data class PaymentCustomConfigResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentModeCustomConfigSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteBeneficiaryRequest
*/
@Parcelize
data class DeleteBeneficiaryRequest(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteRefundAccountResponse
*/
@Parcelize
data class DeleteRefundAccountResponse(
    
    
    
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
    var items: RefundOptionsDetails?=null,
    
    @SerializedName("offline_refund_collect_type")
    var offlineRefundCollectType: ArrayList<String>?=null
    
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
    var paymentModes: ArrayList<String>?=null,
    
    @SerializedName("offline_refund_collect_type")
    var offlineRefundCollectType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionResponse
*/
@Parcelize
data class RefundOptionResponse(
    
    
    
    @SerializedName("offline_refund_options")
    var offlineRefundOptions: OfflineRefundOptions?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("refund_options")
    var refundOptions: RefundOptions?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SelectedRefundOptionResponse
*/
@Parcelize
data class SelectedRefundOptionResponse(
    
    
    
    @SerializedName("transfer_mode")
    var transferMode: TransferMode?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransferMode
*/
@Parcelize
data class TransferMode(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
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
    var bank: ArrayList<OrderBeneficiaryDetails>?=null,
    
    @SerializedName("wallet")
    var wallet: WalletBeneficiaryDetails?=null,
    
    @SerializedName("upi")
    var upi: UpiBeneficiaryDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryResponseSchemaV2
*/
@Parcelize
data class OrderBeneficiaryResponseSchemaV2(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("data")
    var data: BeneficiaryRefundOptions?=null,
    
    @SerializedName("limit")
    var limit: RefundOptionsLimit?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionsLimit
*/
@Parcelize
data class RefundOptionsLimit(
    
    
    
    @SerializedName("bank")
    var bank: Int?=null,
    
    @SerializedName("wallet")
    var wallet: Int?=null,
    
    @SerializedName("upi")
    var upi: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateValidateAddressRequest
*/
@Parcelize
data class ValidateValidateAddressRequest(
    
    
    
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
    Model: ValidateValidateAddressResponse
*/
@Parcelize
data class ValidateValidateAddressResponse(
    
    
    
    @SerializedName("upi")
    var upi: VPADetails?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("ifsc")
    var ifsc: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("vpa")
    var vpa: VPADetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("merchant_shipment_id")
    var merchantShipmentId: String?=null
    
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



             
/*
    Model: ShipmentRefundRequestMeta
*/
@Parcelize
data class ShipmentRefundRequestMeta(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("utr")
    var utr: String?=null,
    
    @SerializedName("notes")
    var notes: String?=null,
    
    @SerializedName("billing_employee_code")
    var billingEmployeeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefundRequest
*/
@Parcelize
data class ShipmentRefundRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: ShipmentRefundRequestMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefundDetail
*/
@Parcelize
data class ShipmentRefundDetail(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentRefundResponse
*/
@Parcelize
data class ShipmentRefundResponse(
    
    
    
    @SerializedName("data")
    var data: ShipmentRefundDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("refund_options")
    var refundOptions: String?=null,
    
    @SerializedName("refund_options_priority")
    var refundOptionsPriority: RefundOptionsPriority?=null,
    
    @SerializedName("offline_refund_options_priority")
    var offlineRefundOptionsPriority: RefundOptionsPriority?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundOptionsPriority
*/
@Parcelize
data class RefundOptionsPriority(
    
    
    
    @SerializedName("payment_modes")
    var paymentModes: ArrayList<String>?=null,
    
    @SerializedName("items")
    var items: ArrayList<RefundItem>?=null,
    
    @SerializedName("payment_gateways")
    var paymentGateways: ArrayList<String>?=null,
    
    @SerializedName("offline_refund_collect_type")
    var offlineRefundCollectType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundItem
*/
@Parcelize
data class RefundItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PennyDropValidationResponse
*/
@Parcelize
data class PennyDropValidationResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("allow_pennydrop_validation")
    var allowPennydropValidation: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePennyDropValidationRequest
*/
@Parcelize
data class UpdatePennyDropValidationRequest(
    
    
    
    @SerializedName("allow_pennydrop_validation")
    var allowPennydropValidation: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AggregatorConfigResponse
*/
@Parcelize
data class AggregatorConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentOptionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeResponse
*/
@Parcelize
data class PaymentModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<PaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionItem
*/
@Parcelize
data class PaymentOptionItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("config")
    var config: ArrayList<String>?=null,
    
    @SerializedName("payment_modes")
    var paymentModes: ArrayList<PaymentMode>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<PaymentMode>?=null,
    
    @SerializedName("checkout_type")
    var checkoutType: String?=null,
    
    @SerializedName("country")
    var country: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: ArrayList<String>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("save_allowed")
    var saveAllowed: Boolean?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMode
*/
@Parcelize
data class PaymentMode(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("sub_payment_mode")
    var subPaymentMode: ArrayList<SubPaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubPaymentMode
*/
@Parcelize
data class SubPaymentMode(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorCredentialRequest
*/
@Parcelize
data class AggregatorCredentialRequest(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorCredential?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorCredential?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorCredential?=null,
    
    @SerializedName("potlee")
    var potlee: AggregatorCredential?=null,
    
    @SerializedName("jio")
    var jio: AggregatorCredential?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PatchAggregatorCredentialResponse
*/
@Parcelize
data class PatchAggregatorCredentialResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregators")
    var aggregators: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorCredentialResponse
*/
@Parcelize
data class AggregatorCredentialResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    
    @SerializedName("aggregators")
    var aggregators: ArrayList<AggregatorCredential>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorCredential
*/
@Parcelize
data class AggregatorCredential(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("display")
    var display: AggregatorDisplayItem?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorDisplayItem
*/
@Parcelize
data class AggregatorDisplayItem(
    
    
    
    @SerializedName("info")
    var info: ArrayList<String>?=null,
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("review_status")
    var reviewStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetDeviceResponse
*/
@Parcelize
data class GetDeviceResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: BusinessUnitDevice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessUnitDevice
*/
@Parcelize
data class BusinessUnitDevice(
    
    
    
    @SerializedName("business_unit")
    var businessUnit: ArrayList<BusinessUnit>?=null,
    
    @SerializedName("device")
    var device: ArrayList<Device>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessUnit
*/
@Parcelize
data class BusinessUnit(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Device
*/
@Parcelize
data class Device(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorHistoryResponse
*/
@Parcelize
data class AggregatorHistoryResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<HistoryItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HistoryItem
*/
@Parcelize
data class HistoryItem(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("reviewer")
    var reviewer: String?=null,
    
    @SerializedName("comments")
    var comments: String?=null,
    
    @SerializedName("review_status")
    var reviewStatus: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("public_token")
    var publicToken: String?=null,
    
    @SerializedName("razorpay_account_id")
    var razorpayAccountId: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("webhook_secret")
    var webhookSecret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckoutType
*/
@Parcelize
data class CheckoutType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Mode
*/
@Parcelize
data class Mode(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Country
*/
@Parcelize
data class Country(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundTo
*/
@Parcelize
data class RefundTo(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("others")
    var others: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodConfigResponse
*/
@Parcelize
data class PaymentMethodConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("refund_to")
    var refundTo: RefundTo?=null,
    
    @SerializedName("required_session_paths")
    var requiredSessionPaths: ArrayList<RequiredSessionPath>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMode>?=null,
    
    @SerializedName("checkout_type")
    var checkoutType: ArrayList<CheckoutType>?=null,
    
    @SerializedName("auto_capture")
    var autoCapture: ArrayList<Boolean>?=null,
    
    @SerializedName("mode")
    var mode: ArrayList<Mode>?=null,
    
    @SerializedName("country")
    var country: ArrayList<Country>?=null,
    
    @SerializedName("currency")
    var currency: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RequiredSessionPath
*/
@Parcelize
data class RequiredSessionPath(
    
    
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("paths")
    var paths: ArrayList<SessionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SessionItem
*/
@Parcelize
data class SessionItem(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uri_path")
    var uriPath: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("methods")
    var methods: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentErrorCodeAndResponse
*/
@Parcelize
data class PaymentErrorCodeAndResponse(
    
    
    
    @SerializedName("error")
    var error: PaymentError?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_msg")
    var errorMsg: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentError
*/
@Parcelize
data class PaymentError(
    
    
    
    @SerializedName("order_id")
    var orderId: ArrayList<String>?=null,
    
    @SerializedName("order_type")
    var orderType: ArrayList<String>?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentBeneficiaryDetailsResponse
*/
@Parcelize
data class ShipmentBeneficiaryDetailsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: TransferMode?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}





