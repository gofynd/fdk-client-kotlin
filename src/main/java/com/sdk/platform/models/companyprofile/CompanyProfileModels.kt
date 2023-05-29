package com.sdk.platform.models.companyprofile

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
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
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
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
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
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
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
    
    
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
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
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer1>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CreateUpdateAddressSerializer>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
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
    
    
    
    @SerializedName("verified")
    var verified: Int?=null,
    
    @SerializedName("pending")
    var pending: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    
    
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("store")
    var store: DocumentsObj?=null,
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    
    
    @SerializedName("landscape")
    var landscape: String?=null,
    
    @SerializedName("portrait")
    var portrait: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null
    
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
    Model: CompanySocialAccounts
*/
@Parcelize
data class CompanySocialAccounts(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("market_channels")
    var marketChannels: ArrayList<String>?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("details")
    var details: CompanyDetails?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandSerializer
*/
@Parcelize
data class CompanyBrandSerializer(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("brand")
    var brand: GetBrandResponseSerializer?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company")
    var company: CompanySerializer?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
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
    
    
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    
    @SerializedName("open")
    var open: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
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
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetLocationSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    Model: _ArticleQuery
*/
@Parcelize
data class _ArticleQuery(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: _ArticleAssignment
*/
@Parcelize
data class _ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: _AssignStoreArticle
*/
@Parcelize
data class _AssignStoreArticle(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("query")
    var query: _ArticleQuery?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStoreRequestValidator
*/
@Parcelize
data class AssignStoreRequestValidator(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<_AssignStoreArticle>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStoreResponseSerializer
*/
@Parcelize
data class AssignStoreResponseSerializer(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("store_pincode")
    var storePincode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null,
    
    @SerializedName("preice_effective")
    var preiceEffective: Double?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("index")
    var index: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



