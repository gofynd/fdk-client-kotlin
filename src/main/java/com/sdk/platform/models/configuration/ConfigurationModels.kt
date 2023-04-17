package com.sdk.platform.models.configuration

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ApplicationInventory
*/
@Parcelize
data class ApplicationInventory(
    
    
    
    @SerializedName("inventory")
    var inventory: AppInventoryConfig?=null,
    
    @SerializedName("authentication")
    var authentication: AuthenticationConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignmentConfig?=null,
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null,
    
    @SerializedName("cart")
    var cart: AppCartConfig?=null,
    
    @SerializedName("payment")
    var payment: AppPaymentConfig?=null,
    
    @SerializedName("order")
    var order: AppOrderConfig?=null,
    
    @SerializedName("logistics")
    var logistics: AppLogisticsConfig?=null,
    
    @SerializedName("business")
    var business: String?=null,
    
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null,
    
    @SerializedName("communication")
    var communication: CommunicationConfig?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPointsConfig?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppInventoryConfig
*/
@Parcelize
data class AppInventoryConfig(
    
    
    
    @SerializedName("brand")
    var brand: InventoryBrand?=null,
    
    @SerializedName("store")
    var store: InventoryStore?=null,
    
    @SerializedName("category")
    var category: InventoryCategory?=null,
    
    @SerializedName("price")
    var price: InventoryPrice?=null,
    
    @SerializedName("discount")
    var discount: InventoryDiscount?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("only_verified_products")
    var onlyVerifiedProducts: Boolean?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("exclude_category")
    var excludeCategory: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("company_store")
    var companyStore: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryBrand
*/
@Parcelize
data class InventoryBrand(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryStore
*/
@Parcelize
data class InventoryStore(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("stores")
    var stores: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("rules")
    var rules: AppStoreRules?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppStoreRules
*/
@Parcelize
data class AppStoreRules(
    
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryCategory
*/
@Parcelize
data class InventoryCategory(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("categories")
    var categories: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPrice
*/
@Parcelize
data class InventoryPrice(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryDiscount
*/
@Parcelize
data class InventoryDiscount(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AuthenticationConfig
*/
@Parcelize
data class AuthenticationConfig(
    
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignmentConfig
*/
@Parcelize
data class ArticleAssignmentConfig(
    
    
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRules?=null,
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignmentRules
*/
@Parcelize
data class ArticleAssignmentRules(
    
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriority?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StorePriority
*/
@Parcelize
data class StorePriority(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("storetype_order")
    var storetypeOrder: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppCartConfig
*/
@Parcelize
data class AppCartConfig(
    
    
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null,
    
    @SerializedName("min_cart_value")
    var minCartValue: Double?=null,
    
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("empty_cart")
    var emptyCart: Boolean?=null,
    
    @SerializedName("pan_card")
    var panCard: PanCardConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryCharges
*/
@Parcelize
data class DeliveryCharges(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("charges")
    var charges: Charges?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    
    @SerializedName("charges")
    var charges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppPaymentConfig
*/
@Parcelize
data class AppPaymentConfig(
    
    
    
    @SerializedName("callback_url")
    var callbackUrl: CallbackUrl?=null,
    
    @SerializedName("methods")
    var methods: Methods?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("cod_amount_limit")
    var codAmountLimit: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CallbackUrl
*/
@Parcelize
data class CallbackUrl(
    
    
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("web")
    var web: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Methods
*/
@Parcelize
data class Methods(
    
    
    
    @SerializedName("pl")
    var pl: PaymentModeConfig?=null,
    
    @SerializedName("card")
    var card: PaymentModeConfig?=null,
    
    @SerializedName("nb")
    var nb: PaymentModeConfig?=null,
    
    @SerializedName("wl")
    var wl: PaymentModeConfig?=null,
    
    @SerializedName("ps")
    var ps: PaymentModeConfig?=null,
    
    @SerializedName("upi")
    var upi: PaymentModeConfig?=null,
    
    @SerializedName("qr")
    var qr: PaymentModeConfig?=null,
    
    @SerializedName("cod")
    var cod: PaymentModeConfig?=null,
    
    @SerializedName("pp")
    var pp: PaymentModeConfig?=null,
    
    @SerializedName("jp")
    var jp: PaymentModeConfig?=null,
    
    @SerializedName("pac")
    var pac: PaymentModeConfig?=null,
    
    @SerializedName("fc")
    var fc: PaymentModeConfig?=null,
    
    @SerializedName("jiopp")
    var jiopp: PaymentModeConfig?=null,
    
    @SerializedName("stripepg")
    var stripepg: PaymentModeConfig?=null,
    
    @SerializedName("juspaypg")
    var juspaypg: PaymentModeConfig?=null,
    
    @SerializedName("payubizpg")
    var payubizpg: PaymentModeConfig?=null,
    
    @SerializedName("payumoneypg")
    var payumoneypg: PaymentModeConfig?=null,
    
    @SerializedName("rupifipg")
    var rupifipg: PaymentModeConfig?=null,
    
    @SerializedName("simpl")
    var simpl: PaymentModeConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeConfig
*/
@Parcelize
data class PaymentModeConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppOrderConfig
*/
@Parcelize
data class AppOrderConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppLogisticsConfig
*/
@Parcelize
data class AppLogisticsConfig(
    
    
    
    @SerializedName("logistics_by_seller")
    var logisticsBySeller: Boolean?=null,
    
    @SerializedName("serviceability_check")
    var serviceabilityCheck: Boolean?=null,
    
    @SerializedName("same_day_delivery")
    var sameDayDelivery: Boolean?=null,
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPointsConfig
*/
@Parcelize
data class LoyaltyPointsConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppInventoryPartialUpdate
*/
@Parcelize
data class AppInventoryPartialUpdate(
    
    
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null,
    
    @SerializedName("cart")
    var cart: AppCartConfig?=null,
    
    @SerializedName("payment")
    var payment: AppPaymentConfig?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPointsConfig?=null,
    
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null,
    
    @SerializedName("communication")
    var communication: CommunicationConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandCompanyInfo
*/
@Parcelize
data class BrandCompanyInfo(
    
    
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyByBrandsRequest
*/
@Parcelize
data class CompanyByBrandsRequest(
    
    
    
    @SerializedName("brands")
    var brands: Int?=null,
    
    @SerializedName("search_text")
    var searchText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyByBrandsResponse
*/
@Parcelize
data class CompanyByBrandsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandCompanyInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreByBrandsRequest
*/
@Parcelize
data class StoreByBrandsRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("brands")
    var brands: Int?=null,
    
    @SerializedName("search_text")
    var searchText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreByBrandsResponse
*/
@Parcelize
data class StoreByBrandsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandStoreInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BrandStoreInfo
*/
@Parcelize
data class BrandStoreInfo(
    
    
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_address")
    var storeAddress: OptedStoreAddress?=null,
    
    @SerializedName("company")
    var company: OptedCompany?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandInfo
*/
@Parcelize
data class CompanyBrandInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("brand_logo_url")
    var brandLogoUrl: String?=null,
    
    @SerializedName("brand_banner_url")
    var brandBannerUrl: String?=null,
    
    @SerializedName("brand_banner_portrait_url")
    var brandBannerPortraitUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandsByCompanyResponse
*/
@Parcelize
data class BrandsByCompanyResponse(
    
    
    
    @SerializedName("brands")
    var brands: CompanyBrandInfo?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PanCardConfig
*/
@Parcelize
data class PanCardConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("cod_threshold_amount")
    var codThresholdAmount: Double?=null,
    
    @SerializedName("online_threshold_amount")
    var onlineThresholdAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConfig
*/
@Parcelize
data class CommunicationConfig(
    
    
    
    @SerializedName("email")
    var email: CommsConfig?=null,
    
    @SerializedName("sms")
    var sms: CommsConfig?=null,
    
    @SerializedName("voice")
    var voice: CommsConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommsConfig
*/
@Parcelize
data class CommsConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateApplicationRequest
*/
@Parcelize
data class CreateApplicationRequest(
    
    
    
    @SerializedName("app")
    var app: App?=null,
    
    @SerializedName("configuration")
    var configuration: AppInventory?=null,
    
    @SerializedName("domain")
    var domain: AppDomain?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAppResponse
*/
@Parcelize
data class CreateAppResponse(
    
    
    
    @SerializedName("app")
    var app: Application?=null,
    
    @SerializedName("configuration")
    var configuration: ApplicationInventory?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationsResponse
*/
@Parcelize
data class ApplicationsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Application>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MobileAppConfiguration
*/
@Parcelize
data class MobileAppConfiguration(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app_name")
    var appName: String?=null,
    
    @SerializedName("landing_image")
    var landingImage: LandingImage?=null,
    
    @SerializedName("splash_image")
    var splashImage: SplashImage?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("platform_type")
    var platformType: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LandingImage
*/
@Parcelize
data class LandingImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SplashImage
*/
@Parcelize
data class SplashImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MobileAppConfigRequest
*/
@Parcelize
data class MobileAppConfigRequest(
    
    
    
    @SerializedName("app_name")
    var appName: String?=null,
    
    @SerializedName("landing_image")
    var landingImage: LandingImage?=null,
    
    @SerializedName("splash_image")
    var splashImage: SplashImage?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuildVersionHistory
*/
@Parcelize
data class BuildVersionHistory(
    
    
    
    @SerializedName("versions")
    var versions: BuildVersion?=null,
    
    @SerializedName("latest_available_version_name")
    var latestAvailableVersionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BuildVersion
*/
@Parcelize
data class BuildVersion(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("platform_type")
    var platformType: String?=null,
    
    @SerializedName("build_status")
    var buildStatus: String?=null,
    
    @SerializedName("version_name")
    var versionName: String?=null,
    
    @SerializedName("version_code")
    var versionCode: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppSupportedCurrency
*/
@Parcelize
data class AppSupportedCurrency(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("supported_currency")
    var supportedCurrency: ArrayList<String>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: DefaultCurrency?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultCurrency
*/
@Parcelize
data class DefaultCurrency(
    
    
    
    @SerializedName("ref")
    var ref: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyConfig
*/
@Parcelize
data class CurrencyConfig(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("decimal_digits")
    var decimalDigits: Int?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DomainAdd
*/
@Parcelize
data class DomainAdd(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DomainAddRequest
*/
@Parcelize
data class DomainAddRequest(
    
    
    
    @SerializedName("domain")
    var domain: DomainAdd?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DomainsResponse
*/
@Parcelize
data class DomainsResponse(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateDomain
*/
@Parcelize
data class UpdateDomain(
    
    
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateDomainTypeRequest
*/
@Parcelize
data class UpdateDomainTypeRequest(
    
    
    
    @SerializedName("domain")
    var domain: UpdateDomain?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DomainStatusRequest
*/
@Parcelize
data class DomainStatusRequest(
    
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DomainStatus
*/
@Parcelize
data class DomainStatus(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DomainStatusResponse
*/
@Parcelize
data class DomainStatusResponse(
    
    
    
    @SerializedName("connected")
    var connected: Boolean?=null,
    
    @SerializedName("status")
    var status: ArrayList<DomainStatus>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DomainSuggestionsRequest
*/
@Parcelize
data class DomainSuggestionsRequest(
    
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null,
    
    @SerializedName("custom")
    var custom: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DomainSuggestion
*/
@Parcelize
data class DomainSuggestion(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("unsupported")
    var unsupported: Boolean?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DomainSuggestionsResponse
*/
@Parcelize
data class DomainSuggestionsResponse(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<DomainSuggestion>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetIntegrationsOptInsResponse
*/
@Parcelize
data class GetIntegrationsOptInsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationOptIn>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationOptIn
*/
@Parcelize
data class IntegrationOptIn(
    
    
    
    @SerializedName("validators")
    var validators: Validators?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("description_html")
    var descriptionHtml: String?=null,
    
    @SerializedName("constants")
    var constants: String?=null,
    
    @SerializedName("companies")
    var companies: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("support")
    var support: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<IntegrationMeta>?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Validators
*/
@Parcelize
data class Validators(
    
    
    
    @SerializedName("company")
    var company: CompanyValidator?=null,
    
    @SerializedName("store")
    var store: StoreValidator?=null,
    
    @SerializedName("inventory")
    var inventory: InventoryValidator?=null,
    
    @SerializedName("order")
    var order: OrderValidator?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyValidator
*/
@Parcelize
data class CompanyValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: JsonSchema
*/
@Parcelize
data class JsonSchema(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tooltip")
    var tooltip: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreValidator
*/
@Parcelize
data class StoreValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryValidator
*/
@Parcelize
data class InventoryValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderValidator
*/
@Parcelize
data class OrderValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationMeta
*/
@Parcelize
data class IntegrationMeta(
    
    
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Integration
*/
@Parcelize
data class Integration(
    
    
    
    @SerializedName("validators")
    var validators: Validators?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("description_html")
    var descriptionHtml: String?=null,
    
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("companies")
    var companies: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("support")
    var support: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<IntegrationMeta>?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationConfigResponse
*/
@Parcelize
data class IntegrationConfigResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationLevel>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: IntegrationLevel
*/
@Parcelize
data class IntegrationLevel(
    
    
    
    @SerializedName("opted")
    var opted: Boolean?=null,
    
    @SerializedName("permissions")
    var permissions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("last_patch")
    var lastPatch: ArrayList<LastPatch>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<IntegrationMeta>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateIntegrationLevelRequest
*/
@Parcelize
data class UpdateIntegrationLevelRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationLevel>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OptedStoreIntegration
*/
@Parcelize
data class OptedStoreIntegration(
    
    
    
    @SerializedName("other_opted")
    var otherOpted: Boolean?=null,
    
    @SerializedName("other_integration")
    var otherIntegration: IntegrationOptIn?=null,
    
    @SerializedName("other_entity")
    var otherEntity: OtherEntity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OtherEntity
*/
@Parcelize
data class OtherEntity(
    
    
    
    @SerializedName("opted")
    var opted: Boolean?=null,
    
    @SerializedName("permissions")
    var permissions: ArrayList<String>?=null,
    
    @SerializedName("last_patch")
    var lastPatch: ArrayList<LastPatch>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("data")
    var data: OtherEntityData?=null,
    
    @SerializedName("meta")
    var meta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LastPatch
*/
@Parcelize
data class LastPatch(
    
    
    
    @SerializedName("op")
    var op: String?=null,
    
    @SerializedName("path")
    var path: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OtherEntityData
*/
@Parcelize
data class OtherEntityData(
    
    
    
    @SerializedName("article_identifier")
    var articleIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: App
*/
@Parcelize
data class App(
    
    
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("auth")
    var auth: ApplicationAuth?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("desc")
    var desc: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppInventory
*/
@Parcelize
data class AppInventory(
    
    
    
    @SerializedName("brand")
    var brand: InventoryBrandRule?=null,
    
    @SerializedName("store")
    var store: InventoryStoreRule?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("only_verified_products")
    var onlyVerifiedProducts: Boolean?=null,
    
    @SerializedName("payment")
    var payment: InventoryPaymentConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: InventoryArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppDomain
*/
@Parcelize
data class AppDomain(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompaniesResponse
*/
@Parcelize
data class CompaniesResponse(
    
    
    
    @SerializedName("items")
    var items: AppInventoryCompanies?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppInventoryCompanies
*/
@Parcelize
data class AppInventoryCompanies(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoresResponse
*/
@Parcelize
data class StoresResponse(
    
    
    
    @SerializedName("items")
    var items: AppInventoryStores?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppInventoryStores
*/
@Parcelize
data class AppInventoryStores(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FilterOrderingStoreRequest
*/
@Parcelize
data class FilterOrderingStoreRequest(
    
    
    
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    
    @SerializedName("q")
    var q: String?=null,
    
    @SerializedName("only_deployed")
    var onlyDeployed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeploymentMeta
*/
@Parcelize
data class DeploymentMeta(
    
    
    
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStoreConfig
*/
@Parcelize
data class OrderingStoreConfig(
    
    
    
    @SerializedName("deployment_meta")
    var deploymentMeta: DeploymentMeta?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OtherSellerCompany
*/
@Parcelize
data class OtherSellerCompany(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtherSellerApplication
*/
@Parcelize
data class OtherSellerApplication(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("company")
    var company: OtherSellerCompany?=null,
    
    @SerializedName("opt_type")
    var optType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OtherSellerApplications
*/
@Parcelize
data class OtherSellerApplications(
    
    
    
    @SerializedName("items")
    var items: ArrayList<OtherSellerApplication>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptedApplicationResponse
*/
@Parcelize
data class OptedApplicationResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("company")
    var company: OptedCompany?=null,
    
    @SerializedName("opted_inventory")
    var optedInventory: OptedInventory?=null,
    
    @SerializedName("opt_out_inventory")
    var optOutInventory: OptOutInventory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptedCompany
*/
@Parcelize
data class OptedCompany(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptedInventory
*/
@Parcelize
data class OptedInventory(
    
    
    
    @SerializedName("opt_type")
    var optType: OptType?=null,
    
    @SerializedName("items")
    var items: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptType
*/
@Parcelize
data class OptType(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptedStore
*/
@Parcelize
data class OptedStore(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("address")
    var address: OptedStoreAddress?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptOutInventory
*/
@Parcelize
data class OptOutInventory(
    
    
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    
    @SerializedName("company")
    var company: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TokenResponse
*/
@Parcelize
data class TokenResponse(
    
    
    
    @SerializedName("tokens")
    var tokens: Tokens?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Tokens
*/
@Parcelize
data class Tokens(
    
    
    
    @SerializedName("firebase")
    var firebase: Firebase?=null,
    
    @SerializedName("moengage")
    var moengage: Moengage?=null,
    
    @SerializedName("segment")
    var segment: Segment?=null,
    
    @SerializedName("gtm")
    var gtm: Gtm?=null,
    
    @SerializedName("freshchat")
    var freshchat: Freshchat?=null,
    
    @SerializedName("safetynet")
    var safetynet: Safetynet?=null,
    
    @SerializedName("fynd_rewards")
    var fyndRewards: FyndRewards?=null,
    
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Credentials
*/
@Parcelize
data class Credentials(
    
    
    
    @SerializedName("ios")
    var ios: Ios?=null,
    
    @SerializedName("android")
    var android: Android?=null,
    
    @SerializedName("project_id")
    var projectId: String?=null,
    
    @SerializedName("gcm_sender_id")
    var gcmSenderId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    
    
    @SerializedName("write_key")
    var writeKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FreshchatCredentials
*/
@Parcelize
data class FreshchatCredentials(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("app_key")
    var appKey: String?=null,
    
    @SerializedName("web_token")
    var webToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    
    
    @SerializedName("public_key")
    var publicKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RewardPointsConfig
*/
@Parcelize
data class RewardPointsConfig(
    
    
    
    @SerializedName("credit")
    var credit: Credit?=null,
    
    @SerializedName("debit")
    var debit: Debit?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Credit
*/
@Parcelize
data class Credit(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Debit
*/
@Parcelize
data class Debit(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("strategy_channel")
    var strategyChannel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailFeature
*/
@Parcelize
data class ProductDetailFeature(
    
    
    
    @SerializedName("similar")
    var similar: ArrayList<String>?=null,
    
    @SerializedName("seller_selection")
    var sellerSelection: Boolean?=null,
    
    @SerializedName("update_product_meta")
    var updateProductMeta: Boolean?=null,
    
    @SerializedName("request_product")
    var requestProduct: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LandingPageFeature
*/
@Parcelize
data class LandingPageFeature(
    
    
    
    @SerializedName("launch_page")
    var launchPage: LaunchPage?=null,
    
    @SerializedName("continue_as_guest")
    var continueAsGuest: Boolean?=null,
    
    @SerializedName("login_btn_text")
    var loginBtnText: String?=null,
    
    @SerializedName("show_domain_textbox")
    var showDomainTextbox: Boolean?=null,
    
    @SerializedName("show_register_btn")
    var showRegisterBtn: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppFeature
*/
@Parcelize
data class AppFeature(
    
    
    
    @SerializedName("product_detail")
    var productDetail: ProductDetailFeature?=null,
    
    @SerializedName("landing_page")
    var landingPage: LandingPageFeature?=null,
    
    @SerializedName("registration_page")
    var registrationPage: RegistrationPageFeature?=null,
    
    @SerializedName("home_page")
    var homePage: HomePageFeature?=null,
    
    @SerializedName("common")
    var common: CommonFeature?=null,
    
    @SerializedName("cart")
    var cart: CartFeature?=null,
    
    @SerializedName("qr")
    var qr: QrFeature?=null,
    
    @SerializedName("pcr")
    var pcr: PcrFeature?=null,
    
    @SerializedName("order")
    var order: OrderFeature?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CommonFeature
*/
@Parcelize
data class CommonFeature(
    
    
    
    @SerializedName("communication_optin_dialog")
    var communicationOptinDialog: CommunicationOptinDialogFeature?=null,
    
    @SerializedName("deployment_store_selection")
    var deploymentStoreSelection: DeploymentStoreSelectionFeature?=null,
    
    @SerializedName("listing_price")
    var listingPrice: ListingPriceFeature?=null,
    
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null,
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CurrencyFeature
*/
@Parcelize
data class CurrencyFeature(
    
    
    
    @SerializedName("value")
    var value: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartFeature
*/
@Parcelize
data class CartFeature(
    
    
    
    @SerializedName("gst_input")
    var gstInput: Boolean?=null,
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null,
    
    @SerializedName("placing_for_customer")
    var placingForCustomer: Boolean?=null,
    
    @SerializedName("google_map")
    var googleMap: Boolean?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: QrFeature
*/
@Parcelize
data class QrFeature(
    
    
    
    @SerializedName("application")
    var application: Boolean?=null,
    
    @SerializedName("products")
    var products: Boolean?=null,
    
    @SerializedName("collections")
    var collections: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("decimal_digits")
    var decimalDigits: Int?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_predefined")
    var isPredefined: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Application
*/
@Parcelize
data class Application(
    
    
    
    @SerializedName("website")
    var website: ApplicationWebsite?=null,
    
    @SerializedName("cors")
    var cors: ApplicationCors?=null,
    
    @SerializedName("auth")
    var auth: ApplicationAuth?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("cache_ttl")
    var cacheTtl: Int?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("redirections")
    var redirections: ArrayList<ApplicationRedirections>?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<ApplicationMeta>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    
    @SerializedName("app_type")
    var appType: String?=null,
    
    @SerializedName("mobile_logo")
    var mobileLogo: SecureUrl?=null,
    
    @SerializedName("domain")
    var domain: Domain?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryStoreRule
*/
@Parcelize
data class InventoryStoreRule(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<StoreCriteriaRule>?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyAboutAddress
*/
@Parcelize
data class CompanyAboutAddress(
    
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserEmail
*/
@Parcelize
data class UserEmail(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserPhoneNumber
*/
@Parcelize
data class UserPhoneNumber(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
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
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    
    
    @SerializedName("address")
    var address: InformationAddress?=null,
    
    @SerializedName("support")
    var support: InformationSupport?=null,
    
    @SerializedName("social_links")
    var socialLinks: SocialLinks?=null,
    
    @SerializedName("links")
    var links: Links?=null,
    
    @SerializedName("copyright_text")
    var copyrightText: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("business_highlights")
    var businessHighlights: BusinessHighlights?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InformationAddress
*/
@Parcelize
data class InformationAddress(
    
    
    
    @SerializedName("loc")
    var loc: String?=null,
    
    @SerializedName("address_line")
    var addressLine: ArrayList<String>?=null,
    
    @SerializedName("phone")
    var phone: ArrayList<InformationPhone>?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InformationSupport
*/
@Parcelize
data class InformationSupport(
    
    
    
    @SerializedName("phone")
    var phone: ArrayList<String>?=null,
    
    @SerializedName("email")
    var email: ArrayList<String>?=null,
    
    @SerializedName("timing")
    var timing: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    
    @SerializedName("facebook")
    var facebook: FacebookLink?=null,
    
    @SerializedName("instagram")
    var instagram: InstagramLink?=null,
    
    @SerializedName("twitter")
    var twitter: TwitterLink?=null,
    
    @SerializedName("pinterest")
    var pinterest: PinterestLink?=null,
    
    @SerializedName("google_plus")
    var googlePlus: GooglePlusLink?=null,
    
    @SerializedName("youtube")
    var youtube: YoutubeLink?=null,
    
    @SerializedName("linked_in")
    var linkedIn: LinkedInLink?=null,
    
    @SerializedName("vimeo")
    var vimeo: VimeoLink?=null,
    
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FacebookLink
*/
@Parcelize
data class FacebookLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InstagramLink
*/
@Parcelize
data class InstagramLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TwitterLink
*/
@Parcelize
data class TwitterLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PinterestLink
*/
@Parcelize
data class PinterestLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GooglePlusLink
*/
@Parcelize
data class GooglePlusLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: YoutubeLink
*/
@Parcelize
data class YoutubeLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LinkedInLink
*/
@Parcelize
data class LinkedInLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VimeoLink
*/
@Parcelize
data class VimeoLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlogLink
*/
@Parcelize
data class BlogLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessHighlights
*/
@Parcelize
data class BusinessHighlights(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationDetail
*/
@Parcelize
data class ApplicationDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    
    @SerializedName("mobile_logo")
    var mobileLogo: SecureUrl?=null,
    
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    
    @SerializedName("domain")
    var domain: Domain?=null,
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppCurrencyResponse
*/
@Parcelize
data class AppCurrencyResponse(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: DefaultCurrency?=null,
    
    @SerializedName("supported_currency")
    var supportedCurrency: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreLatLong
*/
@Parcelize
data class StoreLatLong(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptedStoreAddress
*/
@Parcelize
data class OptedStoreAddress(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("lat_long")
    var latLong: StoreLatLong?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStore
*/
@Parcelize
data class OrderingStore(
    
    
    
    @SerializedName("address")
    var address: OptedStoreAddress?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null,
    
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderingStoresResponse
*/
@Parcelize
data class OrderingStoresResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



