package com.sdk.platform.theme

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
    Model: CompanyThemeSchema
*/
@Parcelize
data class CompanyThemeSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("marketplace_theme_id")
    var marketplaceThemeId: MarketplaceThemeId?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("meta")
    var meta: CompanyThemeMeta?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("applied_themes")
    var appliedThemes: ArrayList<AppliedThemes>?=null
    
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
    var isDefault: Boolean?=null,
    
    @SerializedName("release")
    var release: Release?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyThemeMeta
*/
@Parcelize
data class CompanyThemeMeta(
    
    
    
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
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
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
    Model: SEOMetaItem
*/
@Parcelize
data class SEOMetaItem(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<SEOMetaItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SEOMetaItems
*/
@Parcelize
data class SEOMetaItems(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SEOSitemap
*/
@Parcelize
data class SEOSitemap(
    
    
    
    @SerializedName("priority")
    var priority: Double?=null,
    
    @SerializedName("frequency")
    var frequency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SEObreadcrumb
*/
@Parcelize
data class SEObreadcrumb(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Action
*/
@Parcelize
data class Action(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("page")
    var page: ActionPage?=null,
    
    @SerializedName("popup")
    var popup: ActionPage?=null
    
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
    
    @SerializedName("meta_tags")
    var metaTags: ArrayList<SEOMetaItem>?=null,
    
    @SerializedName("sitemap")
    var sitemap: SEOSitemap?=null,
    
    @SerializedName("breadcrumb")
    var breadcrumb: ArrayList<SEObreadcrumb>?=null,
    
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
    var predicate: AvailablePagePredicate?=null,
    
    @SerializedName("source")
    var source: String?=null
    
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
    var route: AvailablePageRoutePredicate?=null,
    
    @SerializedName("schedule")
    var schedule: AvailablePageSchedulePredicate?=null,
    
    @SerializedName("platform")
    var platform: AvailablePagePlatformPredicate?=null,
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null
    
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
    Model: AvailablePagePlatformPredicate
*/
@Parcelize
data class AvailablePagePlatformPredicate(
    
    
    
    @SerializedName("ios")
    var ios: Boolean?=null,
    
    @SerializedName("android")
    var android: Boolean?=null,
    
    @SerializedName("web")
    var web: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AvailablePageSchedulePredicate
*/
@Parcelize
data class AvailablePageSchedulePredicate(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
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
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    
    
    @SerializedName("theme_id")
    var themeId: String?=null
    
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
    
    
    
    @SerializedName("font")
    var font: Font?=null,
    
    @SerializedName("config")
    var config: Config?=null,
    
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
    var meta: ThemeMeta?=null,
    
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
    var assets: Assets?=null,
    
    @SerializedName("available_sections")
    var availableSections: ArrayList<SectionItem>?=null,
    
    @SerializedName("theme_type")
    var themeType: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("src")
    var src: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeUpgradableResponse
*/
@Parcelize
data class ThemeUpgradableResponse(
    
    
    
    @SerializedName("upgrade")
    var upgrade: Boolean?=null,
    
    @SerializedName("versions")
    var versions: ThemeVersions?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateThemeNameRequestBody
*/
@Parcelize
data class UpdateThemeNameRequestBody(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateThemeRequestBody
*/
@Parcelize
data class UpdateThemeRequestBody(
    
    
    
    @SerializedName("config")
    var config: Config?=null,
    
    @SerializedName("font")
    var font: Font?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Font
*/
@Parcelize
data class Font(
    
    
    
    @SerializedName("variants")
    var variants: FontVariants?=null,
    
    @SerializedName("family")
    var family: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FontVariants
*/
@Parcelize
data class FontVariants(
    
    
    
    @SerializedName("light")
    var light: FontVariant?=null,
    
    @SerializedName("regular")
    var regular: FontVariant?=null,
    
    @SerializedName("medium")
    var medium: FontVariant?=null,
    
    @SerializedName("semi_bold")
    var semiBold: FontVariant?=null,
    
    @SerializedName("bold")
    var bold: FontVariant?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FontVariant
*/
@Parcelize
data class FontVariant(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Config
*/
@Parcelize
data class Config(
    
    
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<ThemeConfiguration>?=null,
    
    @SerializedName("global_schema")
    var globalSchema: GlobalSchema?=null,
    
    @SerializedName("preset")
    var preset: Preset?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeConfiguration
*/
@Parcelize
data class ThemeConfiguration(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("global_config")
    var globalConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ThemeConfigListPage>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverlayPopup
*/
@Parcelize
data class OverlayPopup(
    
    
    
    @SerializedName("dialog_backgroung")
    var dialogBackgroung: String?=null,
    
    @SerializedName("overlay")
    var overlay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DividerStrokeHighlight
*/
@Parcelize
data class DividerStrokeHighlight(
    
    
    
    @SerializedName("divider_strokes")
    var dividerStrokes: String?=null,
    
    @SerializedName("highlight")
    var highlight: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserAlerts
*/
@Parcelize
data class UserAlerts(
    
    
    
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
    Model: OrderTracking
*/
@Parcelize
data class OrderTracking(
    
    
    
    @SerializedName("show_header")
    var showHeader: Boolean?=null,
    
    @SerializedName("show_footer")
    var showFooter: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeConfigListPage
*/
@Parcelize
data class ThemeConfigListPage(
    
    
    
    @SerializedName("page")
    var page: String?=null,
    
    @SerializedName("settings")
    var settings: ThemeConfigListPageSettingsProps?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeConfigListPageSettingsProps
*/
@Parcelize
data class ThemeConfigListPageSettingsProps(
    
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomConfig
*/
@Parcelize
data class CustomConfig(
    
    
    
    @SerializedName("props")
    var props: CustomProps?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ThemeMeta
*/
@Parcelize
data class ThemeMeta(
    
    
    
    @SerializedName("payment")
    var payment: ThemePayment?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("industry")
    var industry: ArrayList<String>?=null,
    
    @SerializedName("release")
    var release: Release?=null,
    
    @SerializedName("images")
    var images: Images?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Release
*/
@Parcelize
data class Release(
    
    
    
    @SerializedName("notes")
    var notes: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Images
*/
@Parcelize
data class Images(
    
    
    
    @SerializedName("desktop")
    var desktop: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomProps
*/
@Parcelize
data class CustomProps(
    
    
    
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
    Model: GlobalSchema
*/
@Parcelize
data class GlobalSchema(
    
    
    
    @SerializedName("props")
    var props: ArrayList<Prop>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Prop
*/
@Parcelize
data class Prop(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("info")
    var info: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Assets
*/
@Parcelize
data class Assets(
    
    
    
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
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
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
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
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
    Model: Preset
*/
@Parcelize
data class Preset(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<Page>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("sections")
    var sections: ArrayList<Section>?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Section
*/
@Parcelize
data class Section(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<Block>?=null,
    
    @SerializedName("predicate")
    var predicate: Predicate?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: SectionProps?=null,
    
    @SerializedName("preset")
    var preset: SectionPreset?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Block
*/
@Parcelize
data class Block(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: BlockProps?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Predicate
*/
@Parcelize
data class Predicate(
    
    
    
    @SerializedName("screen")
    var screen: Screen?=null,
    
    @SerializedName("user")
    var user: ThemeUserSchema?=null,
    
    @SerializedName("route")
    var route: Route?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Screen
*/
@Parcelize
data class Screen(
    
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("desktop")
    var desktop: Boolean?=null,
    
    @SerializedName("tablet")
    var tablet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeUserSchema
*/
@Parcelize
data class ThemeUserSchema(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Route
*/
@Parcelize
data class Route(
    
    
    
    @SerializedName("selected")
    var selected: String?=null,
    
    @SerializedName("exact_url")
    var exactUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SectionProps
*/
@Parcelize
data class SectionProps(
    
    
    
    @SerializedName("title")
    var title: TextProp?=null,
    
    @SerializedName("item_margin")
    var itemMargin: TextProp?=null,
    
    @SerializedName("autoplay")
    var autoplay: CheckboxProp?=null,
    
    @SerializedName("slide_interval")
    var slideInterval: RangeProp?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SectionPreset
*/
@Parcelize
data class SectionPreset(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<Block>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BlockProps
*/
@Parcelize
data class BlockProps(
    
    
    
    @SerializedName("image")
    var image: ImagePickerProp?=null,
    
    @SerializedName("slide_link")
    var slideLink: UrlProp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TextProp
*/
@Parcelize
data class TextProp(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CheckboxProp
*/
@Parcelize
data class CheckboxProp(
    
    
    
    @SerializedName("value")
    var value: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RangeProp
*/
@Parcelize
data class RangeProp(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ImagePickerProp
*/
@Parcelize
data class ImagePickerProp(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UrlProp
*/
@Parcelize
data class UrlProp(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThemeVersions
*/
@Parcelize
data class ThemeVersions(
    
    
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("applied_theme")
    var appliedTheme: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DummyResponse
*/
@Parcelize
data class DummyResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppliedThemes
*/
@Parcelize
data class AppliedThemes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyPrivateTheme
*/
@Parcelize
data class CompanyPrivateTheme(
    
    
    
    @SerializedName("theme_type")
    var themeType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("applied")
    var applied: Boolean?=null,
    
    @SerializedName("is_private")
    var isPrivate: Boolean?=null,
    
    @SerializedName("meta")
    var meta: CompanyThemeMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActionPage
*/
@Parcelize
data class ActionPage(
    
    
    
    @SerializedName("params")
    var params: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("query")
    var query: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: PageType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}







