package com.sdk.platform.models.companyprofile

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

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
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
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
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyTaxesSerializer
*/
@Parcelize
data class CompanyTaxesSerializer(
    
    
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("enable")
    var enable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
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
    
    
    
    @SerializedName("phone")
    var phone: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateAddressSerializer
*/
@Parcelize
data class CreateUpdateAddressSerializer(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyTaxesSerializer1
*/
@Parcelize
data class CompanyTaxesSerializer1(
    
    
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("enable")
    var enable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCompany
*/
@Parcelize
data class UpdateCompany(
    
    
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CreateUpdateAddressSerializer>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer1>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProfileSuccessResponse
*/
@Parcelize
data class ProfileSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store")
    var store: DocumentsObj?=null,
    
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
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    
    
    @SerializedName("website_url")
    var websiteUrl: String?=null,
    
    @SerializedName("socials")
    var socials: ArrayList<CompanySocialAccounts>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanySerializer
*/
@Parcelize
data class CompanySerializer(
    
    
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("details")
    var details: CompanyDetails?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("market_channels")
    var marketChannels: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyBrandSerializer
*/
@Parcelize
data class CompanyBrandSerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("company")
    var company: CompanySerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("brand")
    var brand: GetBrandResponseSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null
    
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
    
    
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: HolidayDateSerializer
*/
@Parcelize
data class HolidayDateSerializer(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HolidaySchemaSerializer
*/
@Parcelize
data class HolidaySchemaSerializer(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("holiday_type")
    var holidayType: String?=null,
    
    @SerializedName("date")
    var date: HolidayDateSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
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
    
    
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("holiday")
    var holiday: ArrayList<HolidaySchemaSerializer>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
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
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("holiday")
    var holiday: ArrayList<HolidaySchemaSerializer>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("address")
    var address: AddressSerializer?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    Model: _ArticleAssignment
*/
@Parcelize
data class _ArticleAssignment(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: _ArticleQuery
*/
@Parcelize
data class _ArticleQuery(
    
    
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: _AssignStoreArticle
*/
@Parcelize
data class _AssignStoreArticle(
    
    
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: _ArticleQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreRequestValidator
*/
@Parcelize
data class AssignStoreRequestValidator(
    
    
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<_AssignStoreArticle>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreResponseSerializer
*/
@Parcelize
data class AssignStoreResponseSerializer(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("store_pincode")
    var storePincode: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("preice_effective")
    var preiceEffective: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


