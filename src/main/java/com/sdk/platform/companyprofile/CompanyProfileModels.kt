package com.sdk.platform.companyprofile

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CompanyTaxesSerializer
*/
@Parcelize
data class CompanyTaxesSerializer(
    
    
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("enable")
    var enable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Website
*/
@Parcelize
data class Website(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    
    @SerializedName("website")
    var website: Website?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SellerPhoneNumber
*/
@Parcelize
data class SellerPhoneNumber(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ContactDetails
*/
@Parcelize
data class ContactDetails(
    
    
    
    @SerializedName("emails")
    var emails: ArrayList<String>?=null,
    
    @SerializedName("phone")
    var phone: ArrayList<SellerPhoneNumber>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CountryCurrencyInfo
*/
@Parcelize
data class CountryCurrencyInfo(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("currency")
    var currency: CountryCurrencyInfo?=null,
    
    @SerializedName("timezone")
    var timezone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("code")
    var code: Double?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyTaxesSerializer1
*/
@Parcelize
data class CompanyTaxesSerializer1(
    
    
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("enable")
    var enable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUpdateAddressSerializer
*/
@Parcelize
data class CreateUpdateAddressSerializer(
    
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCompany
*/
@Parcelize
data class UpdateCompany(
    
    
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer1>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CreateUpdateAddressSerializer>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProfileSuccessResponse
*/
@Parcelize
data class ProfileSuccessResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DocumentsObj
*/
@Parcelize
data class DocumentsObj(
    
    
    
    @SerializedName("pending")
    var pending: Int?=null,
    
    @SerializedName("verified")
    var verified: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("store")
    var store: DocumentsObj?=null,
    
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    
    
    @SerializedName("portrait")
    var portrait: String?=null,
    
    @SerializedName("landscape")
    var landscape: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanySocialAccounts
*/
@Parcelize
data class CompanySocialAccounts(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDetails
*/
@Parcelize
data class CompanyDetails(
    
    
    
    @SerializedName("socials")
    var socials: ArrayList<CompanySocialAccounts>?=null,
    
    @SerializedName("website_url")
    var websiteUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanySerializer
*/
@Parcelize
data class CompanySerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("market_channels")
    var marketChannels: ArrayList<String>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("details")
    var details: CompanyDetails?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandSerializer
*/
@Parcelize
data class CompanyBrandSerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("company")
    var company: CompanySerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("brand")
    var brand: GetBrandResponseSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandSerializer>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("company")
    var company: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null,
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HolidayDateSerializer
*/
@Parcelize
data class HolidayDateSerializer(
    
    
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HolidaySchemaSerializer
*/
@Parcelize
data class HolidaySchemaSerializer(
    
    
    
    @SerializedName("date")
    var date: HolidayDateSerializer?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("holiday_type")
    var holidayType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null,
    
    @SerializedName("store_uid")
    var storeUid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("auto_invoice")
    var autoInvoice: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("credit_note")
    var creditNote: Boolean?=null,
    
    @SerializedName("holiday")
    var holiday: ArrayList<HolidaySchemaSerializer>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("default_order_acceptance_timing")
    var defaultOrderAcceptanceTiming: Boolean?=null,
    
    @SerializedName("order_acceptance_timing")
    var orderAcceptanceTiming: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("avg_order_processing_time")
    var avgOrderProcessingTime: AverageOrderProcessingTime?=null,
    
    @SerializedName("bulk_shipment")
    var bulkShipment: Boolean?=null,
    
    @SerializedName("auto_assign_courier_partner")
    var autoAssignCourierPartner: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetLocationSerializer>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddressSerializer
*/
@Parcelize
data class AddressSerializer(
    
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: AddressSerializer?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("auto_invoice")
    var autoInvoice: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("credit_note")
    var creditNote: Boolean?=null,
    
    @SerializedName("holiday")
    var holiday: ArrayList<HolidaySchemaSerializer>?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("default_order_acceptance_timing")
    var defaultOrderAcceptanceTiming: Boolean?=null,
    
    @SerializedName("order_acceptance_timing")
    var orderAcceptanceTiming: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("avg_order_processing_time")
    var avgOrderProcessingTime: AverageOrderProcessingTime?=null,
    
    @SerializedName("bulk_shipment")
    var bulkShipment: Boolean?=null,
    
    @SerializedName("auto_assign_courier_partner")
    var autoAssignCourierPartner: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkLocationSerializer
*/
@Parcelize
data class BulkLocationSerializer(
    
    
    
    @SerializedName("data")
    var data: ArrayList<LocationSerializer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AverageOrderProcessingTime
*/
@Parcelize
data class AverageOrderProcessingTime(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("duration_type")
    var durationType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTagsResponseSchema
*/
@Parcelize
data class StoreTagsResponseSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





