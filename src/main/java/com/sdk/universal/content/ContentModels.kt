package com.sdk.universal.content

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: BasicDetailsPayloadSchema
*/
@Parcelize
data class BasicDetailsPayloadSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: String?=null,
    
    @SerializedName("favicon_url")
    var faviconUrl: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("meta_title")
    var metaTitle: String?=null,
    
    @SerializedName("meta_description")
    var metaDescription: String?=null,
    
    @SerializedName("meta_image")
    var metaImage: String?=null,
    
    @SerializedName("whats_new")
    var whatsNew: ArrayList<WhatsNew>?=null,
    
    @SerializedName("features")
    var features: ArrayList<Features>?=null,
    
    @SerializedName("authentication")
    var authentication: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_account")
    var businessAccount: BusinessAccount?=null,
    
    @SerializedName("seller_support")
    var sellerSupport: SellerSupport?=null,
    
    @SerializedName("copyright")
    var copyright: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("documentation_url")
    var documentationUrl: String?=null,
    
    @SerializedName("faq_url")
    var faqUrl: String?=null,
    
    @SerializedName("facebook_url")
    var facebookUrl: String?=null,
    
    @SerializedName("instagram_url")
    var instagramUrl: String?=null,
    
    @SerializedName("privacy_url")
    var privacyUrl: String?=null,
    
    @SerializedName("twitter_url")
    var twitterUrl: String?=null,
    
    @SerializedName("termsofservice_url")
    var termsofserviceUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WhatsNew
*/
@Parcelize
data class WhatsNew(
    
    
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Features
*/
@Parcelize
data class Features(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<String>?=null,
    
    @SerializedName("image")
    var image: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessAccount
*/
@Parcelize
data class BusinessAccount(
    
    
    
    @SerializedName("is_limit")
    var isLimit: Boolean?=null,
    
    @SerializedName("threshold")
    var threshold: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SellerSupport
*/
@Parcelize
data class SellerSupport(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MenuSchema
*/
@Parcelize
data class MenuSchema(
    
    
    
    @SerializedName("sales_channel")
    var salesChannel: SalesChannelSchema?=null,
    
    @SerializedName("other_seller")
    var otherSeller: OtherSellerSchema?=null,
    
    @SerializedName("footer_content")
    var footerContent: FooterContentSchema?=null,
    
    @SerializedName("can_create_business_account")
    var canCreateBusinessAccount: Boolean?=null,
    
    @SerializedName("company_level")
    var companyLevel: ArrayList<CompanyLevelMenuItemSchema>?=null,
    
    @SerializedName("application_level")
    var applicationLevel: ArrayList<ApplicationLevelMenuItemSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MenusSchema
*/
@Parcelize
data class MenusSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("desktop")
    var desktop: MenuTypeSchema?=null,
    
    @SerializedName("mobile")
    var mobile: MenuTypeSchema?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MenuTypeSchema
*/
@Parcelize
data class MenuTypeSchema(
    
    
    
    @SerializedName("menu")
    var menu: MenuSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompanyLevelMenuItemSchema
*/
@Parcelize
data class CompanyLevelMenuItemSchema(
    
    
    
    @SerializedName("visible_on")
    var visibleOn: VisibleOnSchema?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("permissions")
    var permissions: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("is_disabled")
    var isDisabled: Boolean?=null,
    
    @SerializedName("child")
    var child: ArrayList<CompanyLevelMenuItemSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationLevelMenuItemSchema
*/
@Parcelize
data class ApplicationLevelMenuItemSchema(
    
    
    
    @SerializedName("visible_on")
    var visibleOn: VisibleOnSchema?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("permissions")
    var permissions: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("is_disabled")
    var isDisabled: Boolean?=null,
    
    @SerializedName("child")
    var child: ArrayList<ApplicationLevelMenuItemSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VisibleOnSchema
*/
@Parcelize
data class VisibleOnSchema(
    
    
    
    @SerializedName("web")
    var web: Boolean?=null,
    
    @SerializedName("ios")
    var ios: Boolean?=null,
    
    @SerializedName("android")
    var android: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SalesChannelSchema
*/
@Parcelize
data class SalesChannelSchema(
    
    
    
    @SerializedName("can_add")
    var canAdd: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtherSellerSchema
*/
@Parcelize
data class OtherSellerSchema(
    
    
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FooterContentSchema
*/
@Parcelize
data class FooterContentSchema(
    
    
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("line_one")
    var lineOne: String?=null,
    
    @SerializedName("line_two")
    var lineTwo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnalyticsTagsSchema
*/
@Parcelize
data class AnalyticsTagsSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("body_code")
    var bodyCode: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("header_code")
    var headerCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomPageBySlugSchema
*/
@Parcelize
data class CustomPageBySlugSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("content")
    var content: ArrayList<ItemSchema>?=null,
    
    @SerializedName("seo")
    var seo: CreateCustomPageSeoSchema?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: CreatedBySchema?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemSchema
*/
@Parcelize
data class ItemSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateCustomPageSeoSchema
*/
@Parcelize
data class CreateCustomPageSeoSchema(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RawHtmlContentSchema
*/
@Parcelize
data class RawHtmlContentSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FooterSchema
*/
@Parcelize
data class FooterSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("content")
    var content: ArrayList<RawHtmlContentSchema>?=null,
    
    @SerializedName("footer_meta")
    var footerMeta: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: CreatedBySchema?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HomePageContentSchema
*/
@Parcelize
data class HomePageContentSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NavItemSchema
*/
@Parcelize
data class NavItemSchema(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("href")
    var href: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NavbarSchema
*/
@Parcelize
data class NavbarSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<NavItemSchema>?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: CreatedBySchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MediaSchema
*/
@Parcelize
data class MediaSchema(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("alt")
    var alt: String?=null,
    
    @SerializedName("anchor_link")
    var anchorLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedBySchema
*/
@Parcelize
data class CreatedBySchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PricingBannerSchema
*/
@Parcelize
data class PricingBannerSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("web_banner")
    var webBanner: MediaSchema?=null,
    
    @SerializedName("mobile_banner")
    var mobileBanner: MediaSchema?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: CreatedBySchema?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SdkReadmeSchema
*/
@Parcelize
data class SdkReadmeSchema(
    
    
    
    @SerializedName("data")
    var data: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomItemSchema>?=null,
    
    @SerializedName("page")
    var page: PageSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomItemSchema
*/
@Parcelize
data class CustomItemSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSchema?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Double?=null,
    
    @SerializedName("size")
    var size: Double?=null,
    
    @SerializedName("item_total")
    var itemTotal: Double?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CredentialSchema
*/
@Parcelize
data class CredentialSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_enable")
    var isEnable: Boolean?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationSchema
*/
@Parcelize
data class ConfigurationSchema(
    
    
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("host")
    var host: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CredentialsSchema
*/
@Parcelize
data class CredentialsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CredentialSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ContentAPIError
*/
@Parcelize
data class ContentAPIError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Language
*/
@Parcelize
data class Language(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("locale")
    var locale: String?=null,
    
    @SerializedName("direction")
    var direction: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TranslatableResource
*/
@Parcelize
data class TranslatableResource(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResourceTranslation
*/
@Parcelize
data class ResourceTranslation(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("locale")
    var locale: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





