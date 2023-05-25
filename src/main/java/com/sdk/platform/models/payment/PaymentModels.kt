package com.sdk.platform.models.payment

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
    
    
    
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null,
    
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
    var success: Boolean?=null
    
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
    
    
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null
    
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
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutAggregator
*/
@Parcelize
data class PayoutAggregator(
    
    
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("payout_details_id")
    var payoutDetailsId: Int?=null,
    
    @SerializedName("aggregator_fund_id")
    var aggregatorFundId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutMoreAttributes
*/
@Parcelize
data class PayoutMoreAttributes(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutCustomer
*/
@Parcelize
data class PayoutCustomer(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Payout
*/
@Parcelize
data class Payout(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: ArrayList<PayoutAggregator>?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("more_attributes")
    var moreAttributes: PayoutMoreAttributes?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("customers")
    var customers: PayoutCustomer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Payout>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutBankDetails
*/
@Parcelize
data class PayoutBankDetails(
    
    
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeletePayoutResponse
*/
@Parcelize
data class DeletePayoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionPaymentMethodResponse
*/
@Parcelize
data class SubscriptionPaymentMethodResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@Parcelize
data class DeleteSubscriptionPaymentMethodResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionConfigResponse
*/
@Parcelize
data class SubscriptionConfigResponse(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@Parcelize
data class SaveSubscriptionSetupIntentRequest(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@Parcelize
data class SaveSubscriptionSetupIntentResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null
    
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
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
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
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformPaymentOptions
*/
@Parcelize
data class PlatformPaymentOptions(
    
    
    
    @SerializedName("methods")
    var methods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("anonymous_cod")
    var anonymousCod: Boolean?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("cod_amount_limit")
    var codAmountLimit: Int?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatfromPaymentConfig
*/
@Parcelize
data class PlatfromPaymentConfig(
    
    
    
    @SerializedName("data")
    var data: PlatformPaymentOptions?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePlatformPaymentConfig
*/
@Parcelize
data class UpdatePlatformPaymentConfig(
    
    
    
    @SerializedName("methods")
    var methods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("anonymous_cod")
    var anonymousCod: Boolean?=null,
    
    @SerializedName("cod_amount_limit")
    var codAmountLimit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CODdata
*/
@Parcelize
data class CODdata(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Int?=null,
    
    @SerializedName("usages")
    var usages: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetUserCODLimitResponse
*/
@Parcelize
data class GetUserCODLimitResponse(
    
    
    
    @SerializedName("user_cod_data")
    var userCodData: CODdata?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetCODForUserRequest
*/
@Parcelize
data class SetCODForUserRequest(
    
    
    
    @SerializedName("mobileno")
    var mobileno: String?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetCODOptionResponse
*/
@Parcelize
data class SetCODOptionResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null,
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null,
    
    @SerializedName("terminal_serial_no")
    var terminalSerialNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDevice
*/
@Parcelize
data class EdcDevice(
    
    
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null,
    
    @SerializedName("merchant_store_pos_code")
    var merchantStorePosCode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("terminal_unique_identifier")
    var terminalUniqueIdentifier: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null,
    
    @SerializedName("terminal_serial_no")
    var terminalSerialNo: String?=null
    
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
    
    
    
    @SerializedName("aggregator_id")
    var aggregatorId: Int?=null,
    
    @SerializedName("device_tag")
    var deviceTag: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("merchant_store_pos_code")
    var merchantStorePosCode: String?=null,
    
    @SerializedName("edc_model")
    var edcModel: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("edc_device_serial_no")
    var edcDeviceSerialNo: String?=null
    
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
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EdcDeviceListResponse
*/
@Parcelize
data class EdcDeviceListResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<EdcDevice>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null
    
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
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
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
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("refunded_by")
    var refundedBy: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("aggregator_payment_object")
    var aggregatorPaymentObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("collected_by")
    var collectedBy: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("payment_mode_identifier")
    var paymentModeIdentifier: String?=null,
    
    @SerializedName("refund_object")
    var refundObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount_in_paisa")
    var amountInPaisa: String?=null,
    
    @SerializedName("user_object")
    var userObject: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_status")
    var allStatus: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusObject
*/
@Parcelize
data class PaymentStatusObject(
    
    
    
    @SerializedName("payment_object_list")
    var paymentObjectList: ArrayList<PaymentObjectListSerializer>?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusBulkHandlerResponse
*/
@Parcelize
data class PaymentStatusBulkHandlerResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<PaymentStatusObject>?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetOauthUrlResponse
*/
@Parcelize
data class GetOauthUrlResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RevokeOAuthToken
*/
@Parcelize
data class RevokeOAuthToken(
    
    
    
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
    
    
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("order_items")
    var orderItems: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentLinkResponse
*/
@Parcelize
data class GetPaymentLinkResponse(
    
    
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("error")
    var error: ErrorDescription?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkMeta
*/
@Parcelize
data class CreatePaymentLinkMeta(
    
    
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkRequest
*/
@Parcelize
data class CreatePaymentLinkRequest(
    
    
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkResponse
*/
@Parcelize
data class CreatePaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
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
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
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
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelPaymentLinkResponse
*/
@Parcelize
data class CancelPaymentLinkResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



