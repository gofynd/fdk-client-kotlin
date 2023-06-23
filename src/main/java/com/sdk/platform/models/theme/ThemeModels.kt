package com.sdk.platform.models.theme

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ThemeReq
*/
@Parcelize
data class ThemeReq(
    
    
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ThemeSchema
*/
@Parcelize
data class ThemeSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: MarketplaceThemeId?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("meta")
    var meta: ThemeMeta?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceThemeId
*/
@Parcelize
data class MarketplaceThemeId(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeMeta
*/
@Parcelize
data class ThemeMeta(
    
    
    
    @SerializedName("payment")
    var payment: ThemePayment?=null,
    
    @SerializedName("industry")
    var industry: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("images")
    var images: ThemeImages?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemePayment
*/
@Parcelize
data class ThemePayment(
    
    
    
    @SerializedName("is_paid")
    var isPaid: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeImages
*/
@Parcelize
data class ThemeImages(
    
    
    
    @SerializedName("desktop")
    var desktop: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageSchema
*/
@Parcelize
data class AvailablePageSchema(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("path")
    var path: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sections")
    var sections: ArrayList<AvailablePageSchemaSections>?=null,
    
    @SerializedName("sections_meta")
    var sectionsMeta: ArrayList<AvailablePageSectionMetaAttributes>?=null,
    
    @SerializedName("theme")
    var theme: String?=null,
    
    @SerializedName("seo")
    var seo: AvailablePageSeo?=null,
    
    @SerializedName("props")
    var props: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageSectionMetaAttributes
*/
@Parcelize
data class AvailablePageSectionMetaAttributes(
    
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AvailablePageSeo
*/
@Parcelize
data class AvailablePageSeo(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageSchemaSections
*/
@Parcelize
data class AvailablePageSchemaSections(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("blocks")
    var blocks: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("preset")
    var preset: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("predicate")
    var predicate: AvailablePagePredicate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageScreenPredicate
*/
@Parcelize
data class AvailablePageScreenPredicate(
    
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("desktop")
    var desktop: Boolean?=null,
    
    @SerializedName("tablet")
    var tablet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageUserPredicate
*/
@Parcelize
data class AvailablePageUserPredicate(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageRoutePredicate
*/
@Parcelize
data class AvailablePageRoutePredicate(
    
    
    
    @SerializedName("selected")
    var selected: String?=null,
    
    @SerializedName("exact_url")
    var exactUrl: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePagePredicate
*/
@Parcelize
data class AvailablePagePredicate(
    
    
    
    @SerializedName("screen")
    var screen: AvailablePageScreenPredicate?=null,
    
    @SerializedName("user")
    var user: AvailablePageUserPredicate?=null,
    
    @SerializedName("route")
    var route: AvailablePageRoutePredicate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceThemeResponse
*/
@Parcelize
data class MarketplaceThemeResponse(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("body")
    var body: MarketplaceThemeResponseBody?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceThemeResponseBody
*/
@Parcelize
data class MarketplaceThemeResponseBody(
    
    
    
    @SerializedName("themes")
    var themes: ArrayList<MarketplaceTheme>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArrayOfMarketplaceTheme
*/
@Parcelize
data class ArrayOfMarketplaceTheme(
    
    
    
    @SerializedName("body")
    var body: ArrayList<MarketplaceTheme>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ThemeCreateRequest
*/
@Parcelize
data class ThemeCreateRequest(
    
    
    
    @SerializedName("src")
    var src: String?=null,
    
    @SerializedName("release")
    var release: Release?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceTheme
*/
@Parcelize
data class MarketplaceTheme(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("payment")
    var payment: PaymentInfo?=null,
    
    @SerializedName("contact")
    var contact: ContactInfo?=null,
    
    @SerializedName("industry")
    var industry: ArrayList<String>?=null,
    
    @SerializedName("is_update")
    var isUpdate: Boolean?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tagline")
    var tagline: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("catalog_size")
    var catalogSize: CatalogSize?=null,
    
    @SerializedName("images")
    var images: MarketplaceThemeImages?=null,
    
    @SerializedName("carousel")
    var carousel: ArrayList<CarouselItem>?=null,
    
    @SerializedName("src")
    var src: String?=null,
    
    @SerializedName("explore")
    var explore: ExploreInfo?=null,
    
    @SerializedName("features")
    var features: ArrayList<Feature>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<Highlight>?=null,
    
    @SerializedName("variations")
    var variations: ArrayList<Variation>?=null,
    
    @SerializedName("documentation")
    var documentation: Documentation?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("step")
    var step: Int?=null,
    
    @SerializedName("comments")
    var comments: Comments?=null,
    
    @SerializedName("release")
    var release: Release?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("template_theme_id")
    var templateThemeId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInfo
*/
@Parcelize
data class PaymentInfo(
    
    
    
    @SerializedName("is_paid")
    var isPaid: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ContactInfo
*/
@Parcelize
data class ContactInfo(
    
    
    
    @SerializedName("developer_contact")
    var developerContact: ArrayList<String>?=null,
    
    @SerializedName("seller_contact")
    var sellerContact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogSize
*/
@Parcelize
data class CatalogSize(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceThemeImages
*/
@Parcelize
data class MarketplaceThemeImages(
    
    
    
    @SerializedName("desktop")
    var desktop: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CarouselItem
*/
@Parcelize
data class CarouselItem(
    
    
    
    @SerializedName("desktop")
    var desktop: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExploreInfo
*/
@Parcelize
data class ExploreInfo(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Feature
*/
@Parcelize
data class Feature(
    
    
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<FeatureItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FeatureItem
*/
@Parcelize
data class FeatureItem(
    
    
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Highlight
*/
@Parcelize
data class Highlight(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("image")
    var image: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Variation
*/
@Parcelize
data class Variation(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("demo_url")
    var demoUrl: String?=null,
    
    @SerializedName("images")
    var images: MarketplaceThemeImages?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Documentation
*/
@Parcelize
data class Documentation(
    
    
    
    @SerializedName("notes")
    var notes: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Comments
*/
@Parcelize
data class Comments(
    
    
    
    @SerializedName("developer_remark")
    var developerRemark: String?=null,
    
    @SerializedName("reviewer_feedback")
    var reviewerFeedback: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Release
*/
@Parcelize
data class Release(
    
    
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("notes")
    var notes: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeSlugResponse
*/
@Parcelize
data class ThemeSlugResponse(
    
    
    
    @SerializedName("theme")
    var theme: MarketplaceTheme?=null,
    
    @SerializedName("organization")
    var organization: Organization?=null,
    
    @SerializedName("user")
    var user: ArrayList<ThemeCreator>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Organization
*/
@Parcelize
data class Organization(
    
    
    
    @SerializedName("meta")
    var meta: OrganizationMeta?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrganizationMeta
*/
@Parcelize
data class OrganizationMeta(
    
    
    
    @SerializedName("ecomm_platform_used")
    var ecommPlatformUsed: ArrayList<String>?=null,
    
    @SerializedName("goals")
    var goals: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeCreator
*/
@Parcelize
data class ThemeCreator(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    
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
    Model: ThemeAndUserDetailsResponse
*/
@Parcelize
data class ThemeAndUserDetailsResponse(
    
    
    
    @SerializedName("themes")
    var themes: ArrayList<MarketplaceTheme>?=null,
    
    @SerializedName("user")
    var user: ArrayList<ThemeCreator>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeRejectionReasons
*/
@Parcelize
data class ThemeRejectionReasons(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("theme_id")
    var themeId: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("admin_id")
    var adminId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("rejection_reasons")
    var rejectionReasons: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RejectionReason
*/
@Parcelize
data class RejectionReason(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ThemeReviewRequest
*/
@Parcelize
data class ThemeReviewRequest(
    
    
    
    @SerializedName("dynamic_properties")
    var dynamicProperties: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateReviewStatusRequest
*/
@Parcelize
data class UpdateReviewStatusRequest(
    
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AllAvailablePageSchema
*/
@Parcelize
data class AllAvailablePageSchema(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<AvailablePageSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaginationSchema
*/
@Parcelize
data class PaginationSchema(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemesListingResponseSchema
*/
@Parcelize
data class ThemesListingResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ThemesSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    
    
    @SerializedName("theme_id")
    var themeId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpgradableThemeSchema
*/
@Parcelize
data class UpgradableThemeSchema(
    
    
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("applied_theme")
    var appliedTheme: String?=null,
    
    @SerializedName("upgrade")
    var upgrade: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FontsSchema
*/
@Parcelize
data class FontsSchema(
    
    
    
    @SerializedName("items")
    var items: FontsSchemaItems?=null,
    
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BlitzkriegApiErrorSchema
*/
@Parcelize
data class BlitzkriegApiErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BlitzkriegNotFoundSchema
*/
@Parcelize
data class BlitzkriegNotFoundSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@Parcelize
data class BlitzkriegInternalServerErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FontsSchemaItems
*/
@Parcelize
data class FontsSchemaItems(
    
    
    
    @SerializedName("family")
    var family: String?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<String>?=null,
    
    @SerializedName("subsets")
    var subsets: ArrayList<String>?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("files")
    var files: FontsSchemaItemsFiles?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FontsSchemaItemsFiles
*/
@Parcelize
data class FontsSchemaItemsFiles(
    
    
    
    @SerializedName("regular")
    var regular: String?=null,
    
    @SerializedName("italic")
    var italic: String?=null,
    
    @SerializedName("bold")
    var bold: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemesSchema
*/
@Parcelize
data class ThemesSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("applied")
    var applied: Boolean?=null,
    
    @SerializedName("customized")
    var customized: Boolean?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("parent_theme_version")
    var parentThemeVersion: String?=null,
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("information")
    var information: Information?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("src")
    var src: Src?=null,
    
    @SerializedName("assets")
    var assets: AssetsSchema?=null,
    
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("config")
    var config: Config?=null,
    
    @SerializedName("font")
    var font: Font?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("colors")
    var colors: Colors?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<Blocks>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("props")
    var props: ArrayList<BlocksProps>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Information
*/
@Parcelize
data class Information(
    
    
    
    @SerializedName("images")
    var images: Images?=null,
    
    @SerializedName("features")
    var features: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Images
*/
@Parcelize
data class Images(
    
    
    
    @SerializedName("desktop")
    var desktop: ArrayList<String>?=null,
    
    @SerializedName("android")
    var android: ArrayList<String>?=null,
    
    @SerializedName("ios")
    var ios: ArrayList<String>?=null,
    
    @SerializedName("thumbnail")
    var thumbnail: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Src
*/
@Parcelize
data class Src(
    
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AssetsSchema
*/
@Parcelize
data class AssetsSchema(
    
    
    
    @SerializedName("umd_js")
    var umdJs: UmdJs?=null,
    
    @SerializedName("common_js")
    var commonJs: CommonJs?=null,
    
    @SerializedName("css")
    var css: Css?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UmdJs
*/
@Parcelize
data class UmdJs(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CommonJs
*/
@Parcelize
data class CommonJs(
    
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Css
*/
@Parcelize
data class Css(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Sections
*/
@Parcelize
data class Sections(
    
    
    
    @SerializedName("attributes")
    var attributes: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Config
*/
@Parcelize
data class Config(
    
    
    
    @SerializedName("preset")
    var preset: Preset?=null,
    
    @SerializedName("global_schema")
    var globalSchema: GlobalSchema?=null,
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<ListSchemaItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Preset
*/
@Parcelize
data class Preset(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<AvailablePageSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GlobalSchema
*/
@Parcelize
data class GlobalSchema(
    
    
    
    @SerializedName("props")
    var props: ArrayList<GlobalSchemaProps>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListSchemaItem
*/
@Parcelize
data class ListSchemaItem(
    
    
    
    @SerializedName("global_config")
    var globalConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ConfigPage>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Colors
*/
@Parcelize
data class Colors(
    
    
    
    @SerializedName("bg_color")
    var bgColor: String?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("secondary_color")
    var secondaryColor: String?=null,
    
    @SerializedName("accent_color")
    var accentColor: String?=null,
    
    @SerializedName("link_color")
    var linkColor: String?=null,
    
    @SerializedName("button_secondary_color")
    var buttonSecondaryColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Custom
*/
@Parcelize
data class Custom(
    
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigPage
*/
@Parcelize
data class ConfigPage(
    
    
    
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Font
*/
@Parcelize
data class Font(
    
    
    
    @SerializedName("family")
    var family: String?=null,
    
    @SerializedName("variants")
    var variants: Variants?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Variants
*/
@Parcelize
data class Variants(
    
    
    
    @SerializedName("medium")
    var medium: Medium?=null,
    
    @SerializedName("semi_bold")
    var semiBold: SemiBold?=null,
    
    @SerializedName("bold")
    var bold: Bold?=null,
    
    @SerializedName("light")
    var light: Light?=null,
    
    @SerializedName("regular")
    var regular: Regular?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Medium
*/
@Parcelize
data class Medium(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SemiBold
*/
@Parcelize
data class SemiBold(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Bold
*/
@Parcelize
data class Bold(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Light
*/
@Parcelize
data class Light(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Regular
*/
@Parcelize
data class Regular(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Blocks
*/
@Parcelize
data class Blocks(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: ArrayList<BlocksProps>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalSchemaProps
*/
@Parcelize
data class GlobalSchemaProps(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlocksProps
*/
@Parcelize
data class BlocksProps(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplyThemeRequestV2
*/
@Parcelize
data class ApplyThemeRequestV2(
    
    
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplyThemeResponseV2
*/
@Parcelize
data class ApplyThemeResponseV2(
    
    
    
    @SerializedName("font")
    var font: FontV2?=null,
    
    @SerializedName("config")
    var config: ConfigV2?=null,
    
    @SerializedName("applied")
    var applied: Boolean?=null,
    
    @SerializedName("is_private")
    var isPrivate: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: String?=null,
    
    @SerializedName("meta")
    var meta: MetaV2?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("template_theme_id")
    var templateThemeId: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllThemesApplicationResponseV2
*/
@Parcelize
data class AllThemesApplicationResponseV2(
    
    
    
    @SerializedName("font")
    var font: FontV2?=null,
    
    @SerializedName("config")
    var config: ConfigV2?=null,
    
    @SerializedName("applied")
    var applied: Boolean?=null,
    
    @SerializedName("is_private")
    var isPrivate: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: String?=null,
    
    @SerializedName("meta")
    var meta: MetaV2?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("template_theme_id")
    var templateThemeId: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("assets")
    var assets: AssetsV2?=null,
    
    @SerializedName("available_sections")
    var availableSections: ArrayList<SectionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeUpgradableResponseV2
*/
@Parcelize
data class ThemeUpgradableResponseV2(
    
    
    
    @SerializedName("upgrade")
    var upgrade: Boolean?=null,
    
    @SerializedName("versions")
    var versions: ThemeVersionsV2?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateThemeNameRequestBodyV2
*/
@Parcelize
data class UpdateThemeNameRequestBodyV2(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateThemeRequestBodyV2
*/
@Parcelize
data class UpdateThemeRequestBodyV2(
    
    
    
    @SerializedName("config")
    var config: ConfigV2?=null,
    
    @SerializedName("font")
    var font: FontV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FontV2
*/
@Parcelize
data class FontV2(
    
    
    
    @SerializedName("variants")
    var variants: FontVariantsV2?=null,
    
    @SerializedName("family")
    var family: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FontVariantsV2
*/
@Parcelize
data class FontVariantsV2(
    
    
    
    @SerializedName("light")
    var light: FontVariantV2?=null,
    
    @SerializedName("regular")
    var regular: FontVariantV2?=null,
    
    @SerializedName("medium")
    var medium: FontVariantV2?=null,
    
    @SerializedName("semi_bold")
    var semiBold: FontVariantV2?=null,
    
    @SerializedName("bold")
    var bold: FontVariantV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FontVariantV2
*/
@Parcelize
data class FontVariantV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigV2
*/
@Parcelize
data class ConfigV2(
    
    
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<ConfigurationV2>?=null,
    
    @SerializedName("global_schema")
    var globalSchema: GlobalSchemaV2?=null,
    
    @SerializedName("preset")
    var preset: PresetV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationV2
*/
@Parcelize
data class ConfigurationV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("global_config")
    var globalConfig: GlobalConfigV2?=null,
    
    @SerializedName("custom")
    var custom: CustomConfigV2?=null,
    
    @SerializedName("page")
    var page: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalConfigV2
*/
@Parcelize
data class GlobalConfigV2(
    
    
    
    @SerializedName("statics")
    var statics: StaticConfigV2?=null,
    
    @SerializedName("auth")
    var auth: AuthConfigV2?=null,
    
    @SerializedName("palette")
    var palette: PaletteConfigV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StaticConfigV2
*/
@Parcelize
data class StaticConfigV2(
    
    
    
    @SerializedName("props")
    var props: StaticPropsV2?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AuthConfigV2
*/
@Parcelize
data class AuthConfigV2(
    
    
    
    @SerializedName("show_header_auth")
    var showHeaderAuth: Boolean?=null,
    
    @SerializedName("show_footer_auth")
    var showFooterAuth: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaletteConfigV2
*/
@Parcelize
data class PaletteConfigV2(
    
    
    
    @SerializedName("general_setting")
    var generalSetting: GeneralSettingV2?=null,
    
    @SerializedName("advance_setting")
    var advanceSetting: AdvanceSettingV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomConfigV2
*/
@Parcelize
data class CustomConfigV2(
    
    
    
    @SerializedName("props")
    var props: CustomPropsV2?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MetaV2
*/
@Parcelize
data class MetaV2(
    
    
    
    @SerializedName("payment")
    var payment: PaymentV2?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("industry")
    var industry: ArrayList<String>?=null,
    
    @SerializedName("release")
    var release: ReleaseV2?=null,
    
    @SerializedName("images")
    var images: ImagesV2?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentV2
*/
@Parcelize
data class PaymentV2(
    
    
    
    @SerializedName("is_paid")
    var isPaid: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReleaseV2
*/
@Parcelize
data class ReleaseV2(
    
    
    
    @SerializedName("notes")
    var notes: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ImagesV2
*/
@Parcelize
data class ImagesV2(
    
    
    
    @SerializedName("desktop")
    var desktop: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StaticPropsV2
*/
@Parcelize
data class StaticPropsV2(
    
    
    
    @SerializedName("colors")
    var colors: ColorsV2?=null,
    
    @SerializedName("auth")
    var auth: AuthConfigV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ColorsV2
*/
@Parcelize
data class ColorsV2(
    
    
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("secondary_color")
    var secondaryColor: String?=null,
    
    @SerializedName("accent_color")
    var accentColor: String?=null,
    
    @SerializedName("link_color")
    var linkColor: String?=null,
    
    @SerializedName("button_secondary_color")
    var buttonSecondaryColor: String?=null,
    
    @SerializedName("bg_color")
    var bgColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeneralSettingV2
*/
@Parcelize
data class GeneralSettingV2(
    
    
    
    @SerializedName("theme")
    var theme: ThemeSettingV2?=null,
    
    @SerializedName("text")
    var text: TextSettingV2?=null,
    
    @SerializedName("button")
    var button: ButtonSettingV2?=null,
    
    @SerializedName("sale_discount")
    var saleDiscount: SaleDiscountSettingV2?=null,
    
    @SerializedName("header")
    var header: HeaderSettingV2?=null,
    
    @SerializedName("footer")
    var footer: FooterSettingV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AdvanceSettingV2
*/
@Parcelize
data class AdvanceSettingV2(
    
    
    
    @SerializedName("overlay_popup")
    var overlayPopup: OverlayPopupSettingV2?=null,
    
    @SerializedName("divider_stroke_highlight")
    var dividerStrokeHighlight: DividerStrokeHighlightSettingV2?=null,
    
    @SerializedName("user_alerts")
    var userAlerts: UserAlertsSettingV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeSettingV2
*/
@Parcelize
data class ThemeSettingV2(
    
    
    
    @SerializedName("page_background")
    var pageBackground: String?=null,
    
    @SerializedName("theme_accent")
    var themeAccent: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TextSettingV2
*/
@Parcelize
data class TextSettingV2(
    
    
    
    @SerializedName("text_heading")
    var textHeading: String?=null,
    
    @SerializedName("text_body")
    var textBody: String?=null,
    
    @SerializedName("text_label")
    var textLabel: String?=null,
    
    @SerializedName("text_secondary")
    var textSecondary: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ButtonSettingV2
*/
@Parcelize
data class ButtonSettingV2(
    
    
    
    @SerializedName("button_primary")
    var buttonPrimary: String?=null,
    
    @SerializedName("button_secondary")
    var buttonSecondary: String?=null,
    
    @SerializedName("button_link")
    var buttonLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SaleDiscountSettingV2
*/
@Parcelize
data class SaleDiscountSettingV2(
    
    
    
    @SerializedName("sale_badge_background")
    var saleBadgeBackground: String?=null,
    
    @SerializedName("sale_badge_text")
    var saleBadgeText: String?=null,
    
    @SerializedName("sale_discount_text")
    var saleDiscountText: String?=null,
    
    @SerializedName("sale_timer")
    var saleTimer: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HeaderSettingV2
*/
@Parcelize
data class HeaderSettingV2(
    
    
    
    @SerializedName("header_background")
    var headerBackground: String?=null,
    
    @SerializedName("header_nav")
    var headerNav: String?=null,
    
    @SerializedName("header_icon")
    var headerIcon: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FooterSettingV2
*/
@Parcelize
data class FooterSettingV2(
    
    
    
    @SerializedName("footer_background")
    var footerBackground: String?=null,
    
    @SerializedName("footer_bottom_background")
    var footerBottomBackground: String?=null,
    
    @SerializedName("footer_heading_text")
    var footerHeadingText: String?=null,
    
    @SerializedName("footer_body_text")
    var footerBodyText: String?=null,
    
    @SerializedName("footer_icon")
    var footerIcon: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverlayPopupSettingV2
*/
@Parcelize
data class OverlayPopupSettingV2(
    
    
    
    @SerializedName("dialog_backgroung")
    var dialogBackgroung: String?=null,
    
    @SerializedName("overlay")
    var overlay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DividerStrokeHighlightSettingV2
*/
@Parcelize
data class DividerStrokeHighlightSettingV2(
    
    
    
    @SerializedName("divider_strokes")
    var dividerStrokes: String?=null,
    
    @SerializedName("highlight")
    var highlight: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAlertsSettingV2
*/
@Parcelize
data class UserAlertsSettingV2(
    
    
    
    @SerializedName("success_background")
    var successBackground: String?=null,
    
    @SerializedName("success_text")
    var successText: String?=null,
    
    @SerializedName("error_background")
    var errorBackground: String?=null,
    
    @SerializedName("error_text")
    var errorText: String?=null,
    
    @SerializedName("info_background")
    var infoBackground: String?=null,
    
    @SerializedName("info_text")
    var infoText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomPropsV2
*/
@Parcelize
data class CustomPropsV2(
    
    
    
    @SerializedName("header_bg_color")
    var headerBgColor: String?=null,
    
    @SerializedName("header_text_color")
    var headerTextColor: String?=null,
    
    @SerializedName("header_border_color")
    var headerBorderColor: String?=null,
    
    @SerializedName("header_icon_color")
    var headerIconColor: String?=null,
    
    @SerializedName("header_cart_notification_bg_color")
    var headerCartNotificationBgColor: String?=null,
    
    @SerializedName("header_cart_notification_text_color")
    var headerCartNotificationTextColor: String?=null,
    
    @SerializedName("header_nav_hover_color")
    var headerNavHoverColor: String?=null,
    
    @SerializedName("button_primary_color")
    var buttonPrimaryColor: String?=null,
    
    @SerializedName("button_primary_label_color")
    var buttonPrimaryLabelColor: String?=null,
    
    @SerializedName("button_add_to_cart_color")
    var buttonAddToCartColor: String?=null,
    
    @SerializedName("button_add_to_cart_label_color")
    var buttonAddToCartLabelColor: String?=null,
    
    @SerializedName("button_secondary_color")
    var buttonSecondaryColor: String?=null,
    
    @SerializedName("button_secondary_label_color")
    var buttonSecondaryLabelColor: String?=null,
    
    @SerializedName("button_tertiary_color")
    var buttonTertiaryColor: String?=null,
    
    @SerializedName("button_tertiary_label_color")
    var buttonTertiaryLabelColor: String?=null,
    
    @SerializedName("button_tertiary_hover_color")
    var buttonTertiaryHoverColor: String?=null,
    
    @SerializedName("button_tertiary_hover_text_color")
    var buttonTertiaryHoverTextColor: String?=null,
    
    @SerializedName("text_heading_link_color")
    var textHeadingLinkColor: String?=null,
    
    @SerializedName("text_body_color")
    var textBodyColor: String?=null,
    
    @SerializedName("text_price_color")
    var textPriceColor: String?=null,
    
    @SerializedName("text_sale_price_color")
    var textSalePriceColor: String?=null,
    
    @SerializedName("text_strikethrough_price_color")
    var textStrikethroughPriceColor: String?=null,
    
    @SerializedName("text_discount_color")
    var textDiscountColor: String?=null,
    
    @SerializedName("footer_bg_color")
    var footerBgColor: String?=null,
    
    @SerializedName("footer_text_color")
    var footerTextColor: String?=null,
    
    @SerializedName("footer_border_color")
    var footerBorderColor: String?=null,
    
    @SerializedName("footer_nav_hover_color")
    var footerNavHoverColor: String?=null,
    
    @SerializedName("disable_cart")
    var disableCart: Boolean?=null,
    
    @SerializedName("is_menu_below_logo")
    var isMenuBelowLogo: Boolean?=null,
    
    @SerializedName("menu_position")
    var menuPosition: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalSchemaV2
*/
@Parcelize
data class GlobalSchemaV2(
    
    
    
    @SerializedName("props")
    var props: ArrayList<PropV2>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PropV2
*/
@Parcelize
data class PropV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("info")
    var info: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssetsV2
*/
@Parcelize
data class AssetsV2(
    
    
    
    @SerializedName("umd_js")
    var umdJs: UMDJs?=null,
    
    @SerializedName("common_js")
    var commonJs: CommonJS?=null,
    
    @SerializedName("css")
    var css: CSS?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UMDJs
*/
@Parcelize
data class UMDJs(
    
    
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CommonJS
*/
@Parcelize
data class CommonJS(
    
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CSS
*/
@Parcelize
data class CSS(
    
    
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SectionItem
*/
@Parcelize
data class SectionItem(
    
    
    
    @SerializedName("props")
    var props: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("blocks")
    var blocks: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("label")
    var label: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PresetV2
*/
@Parcelize
data class PresetV2(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<PageV2>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageV2
*/
@Parcelize
data class PageV2(
    
    
    
    @SerializedName("sections")
    var sections: ArrayList<SectionV2>?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SectionV2
*/
@Parcelize
data class SectionV2(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<BlockV2>?=null,
    
    @SerializedName("predicate")
    var predicate: PredicateV2?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: SectionPropsV2?=null,
    
    @SerializedName("preset")
    var preset: SectionPresetV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlockV2
*/
@Parcelize
data class BlockV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: BlockPropsV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PredicateV2
*/
@Parcelize
data class PredicateV2(
    
    
    
    @SerializedName("screen")
    var screen: ScreenV2?=null,
    
    @SerializedName("user")
    var user: UserV2?=null,
    
    @SerializedName("route")
    var route: RouteV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ScreenV2
*/
@Parcelize
data class ScreenV2(
    
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("desktop")
    var desktop: Boolean?=null,
    
    @SerializedName("tablet")
    var tablet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserV2
*/
@Parcelize
data class UserV2(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RouteV2
*/
@Parcelize
data class RouteV2(
    
    
    
    @SerializedName("selected")
    var selected: String?=null,
    
    @SerializedName("exact_url")
    var exactUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SectionPropsV2
*/
@Parcelize
data class SectionPropsV2(
    
    
    
    @SerializedName("title")
    var title: TextPropV2?=null,
    
    @SerializedName("item_margin")
    var itemMargin: TextPropV2?=null,
    
    @SerializedName("autoplay")
    var autoplay: CheckboxPropV2?=null,
    
    @SerializedName("slide_interval")
    var slideInterval: RangePropV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SectionPresetV2
*/
@Parcelize
data class SectionPresetV2(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<BlockV2>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BlockPropsV2
*/
@Parcelize
data class BlockPropsV2(
    
    
    
    @SerializedName("image")
    var image: ImagePickerPropV2?=null,
    
    @SerializedName("slide_link")
    var slideLink: UrlPropV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TextPropV2
*/
@Parcelize
data class TextPropV2(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CheckboxPropV2
*/
@Parcelize
data class CheckboxPropV2(
    
    
    
    @SerializedName("value")
    var value: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RangePropV2
*/
@Parcelize
data class RangePropV2(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ImagePickerPropV2
*/
@Parcelize
data class ImagePickerPropV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UrlPropV2
*/
@Parcelize
data class UrlPropV2(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeVersionsV2
*/
@Parcelize
data class ThemeVersionsV2(
    
    
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("applied_theme")
    var appliedTheme: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



