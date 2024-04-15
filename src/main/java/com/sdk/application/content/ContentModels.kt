package com.sdk.application.content

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ApplicationLegal
*/
@Parcelize
data class ApplicationLegal(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("tnc")
    var tnc: String?=null,
    
    @SerializedName("policy")
    var policy: String?=null,
    
    @SerializedName("shipping")
    var shipping: String?=null,
    
    @SerializedName("returns")
    var returns: String?=null,
    
    @SerializedName("faq")
    var faq: ArrayList<ApplicationLegalFAQ>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationLegalFAQ
*/
@Parcelize
data class ApplicationLegalFAQ(
    
    
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SeoComponent
*/
@Parcelize
data class SeoComponent(
    
    
    
    @SerializedName("seo")
    var seo: SeoSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SeoSchema
*/
@Parcelize
data class SeoSchema(
    
    
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("robots_txt")
    var robotsTxt: String?=null,
    
    @SerializedName("sitemap_enabled")
    var sitemapEnabled: Boolean?=null,
    
    @SerializedName("additonal_sitemap")
    var additonalSitemap: String?=null,
    
    @SerializedName("cannonical_enabled")
    var cannonicalEnabled: Boolean?=null,
    
    @SerializedName("custom_meta_tags")
    var customMetaTags: ArrayList<CustomMetaTag>?=null,
    
    @SerializedName("details")
    var details: Detail?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomMetaTag
*/
@Parcelize
data class CustomMetaTag(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Detail
*/
@Parcelize
data class Detail(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("image_url")
    var imageUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SeoSchemaComponent
*/
@Parcelize
data class SeoSchemaComponent(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SEOSchemaMarkupTemplate>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SEOSchemaMarkupTemplate
*/
@Parcelize
data class SEOSchemaMarkupTemplate(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("schema")
    var schema: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("application")
    var application: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("duration")
    var duration: Double?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NextSchedule
*/
@Parcelize
data class NextSchedule(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementSchema
*/
@Parcelize
data class AnnouncementSchema(
    
    
    
    @SerializedName("announcement")
    var announcement: String?=null,
    
    @SerializedName("schedule")
    var schedule: ScheduleStartSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ScheduleStartSchema
*/
@Parcelize
data class ScheduleStartSchema(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BlogGetResponse
*/
@Parcelize
data class BlogGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BlogSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResourceContent
*/
@Parcelize
data class ResourceContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Author
*/
@Parcelize
data class Author(
    
    
    
    @SerializedName("designation")
    var designation: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BlogSchema
*/
@Parcelize
data class BlogSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("reading_time")
    var readingTime: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SEO
*/
@Parcelize
data class SEO(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("image")
    var image: SEOImage?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("meta_tags")
    var metaTags: ArrayList<SEOMetaItem>?=null,
    
    @SerializedName("sitemap")
    var sitemap: SEOSitemap?=null,
    
    @SerializedName("breadcrumb")
    var breadcrumb: ArrayList<SEObreadcrumb>?=null,
    
    @SerializedName("canonical_url")
    var canonicalUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SEOImage
*/
@Parcelize
data class SEOImage(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
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
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocaleLanguage
*/
@Parcelize
data class LocaleLanguage(
    
    
    
    @SerializedName("hi")
    var hi: Language?=null,
    
    @SerializedName("ar")
    var ar: Language?=null,
    
    @SerializedName("en_us")
    var enUs: Language?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Language
*/
@Parcelize
data class Language(
    
    
    
    @SerializedName("display")
    var display: String?=null
    
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
    Model: NavigationReference
*/
@Parcelize
data class NavigationReference(
    
    
    
    @SerializedName("acl")
    var acl: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: LocaleLanguage?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("sort_order")
    var sortOrder: Int?=null,
    
    @SerializedName("sub_navigation")
    var subNavigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationSchema
*/
@Parcelize
data class ConfigurationSchema(
    
    
    
    @SerializedName("sleep_time")
    var sleepTime: Int?=null,
    
    @SerializedName("start_on_launch")
    var startOnLaunch: Boolean?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("slide_direction")
    var slideDirection: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SlideshowMedia
*/
@Parcelize
data class SlideshowMedia(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("bg_color")
    var bgColor: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("auto_decide_duration")
    var autoDecideDuration: Boolean?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    
    
    @SerializedName("announcements")
    var announcements: HashMap<String,ArrayList<AnnouncementSchema>>?=null,
    
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FaqResponseSchema
*/
@Parcelize
data class FaqResponseSchema(
    
    
    
    @SerializedName("faqs")
    var faqs: ArrayList<FaqSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DataLoaderSchema
*/
@Parcelize
data class DataLoaderSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("service")
    var service: String?=null,
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DataLoaderSourceSchema
*/
@Parcelize
data class DataLoaderSourceSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DataLoadersSchema
*/
@Parcelize
data class DataLoadersSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DataLoaderSchema>?=null
    
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
    Model: CommonError
*/
@Parcelize
data class CommonError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CategorySchema
*/
@Parcelize
data class CategorySchema(
    
    
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("children")
    var children: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("icon_url")
    var iconUrl: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChildrenSchema
*/
@Parcelize
data class ChildrenSchema(
    
    
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FAQCategorySchema
*/
@Parcelize
data class FAQCategorySchema(
    
    
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("children")
    var children: ArrayList<ChildrenSchema>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("icon_url")
    var iconUrl: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FaqSchema
*/
@Parcelize
data class FaqSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetFaqSchema
*/
@Parcelize
data class GetFaqSchema(
    
    
    
    @SerializedName("faqs")
    var faqs: ArrayList<FaqSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetFaqCategoriesSchema
*/
@Parcelize
data class GetFaqCategoriesSchema(
    
    
    
    @SerializedName("categories")
    var categories: ArrayList<CategorySchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetFaqCategoryBySlugSchema
*/
@Parcelize
data class GetFaqCategoryBySlugSchema(
    
    
    
    @SerializedName("category")
    var category: FAQCategorySchema?=null
    
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
    Model: LandingPageSchema
*/
@Parcelize
data class LandingPageSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NavigationGetResponse
*/
@Parcelize
data class NavigationGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<NavigationSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Orientation
*/
@Parcelize
data class Orientation(
    
    
    
    @SerializedName("portrait")
    var portrait: ArrayList<String>?=null,
    
    @SerializedName("landscape")
    var landscape: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NavigationSchema
*/
@Parcelize
data class NavigationSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("orientation")
    var orientation: Orientation?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("navigation")
    var navigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageGetResponse
*/
@Parcelize
data class PageGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PageSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    
    @SerializedName("content")
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("content_path")
    var contentPath: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("page_meta")
    var pageMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("visibility")
    var visibility: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedBySchema
*/
@Parcelize
data class CreatedBySchema(
    
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CronSchedule
*/
@Parcelize
data class CronSchedule(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("duration")
    var duration: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SlideshowGetResponse
*/
@Parcelize
data class SlideshowGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SlideshowSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SlideshowSchema
*/
@Parcelize
data class SlideshowSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    
    @SerializedName("media")
    var media: ArrayList<SlideshowMedia>?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Support
*/
@Parcelize
data class Support(
    
    
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("contact")
    var contact: ContactSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneProperties
*/
@Parcelize
data class PhoneProperties(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PhoneSchema
*/
@Parcelize
data class PhoneSchema(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("phone")
    var phone: ArrayList<PhoneProperties>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EmailProperties
*/
@Parcelize
data class EmailProperties(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EmailSchema
*/
@Parcelize
data class EmailSchema(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("email")
    var email: ArrayList<EmailProperties>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ContactSchema
*/
@Parcelize
data class ContactSchema(
    
    
    
    @SerializedName("phone")
    var phone: PhoneSchema?=null,
    
    @SerializedName("email")
    var email: EmailSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TagSchema
*/
@Parcelize
data class TagSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("__source")
    var source: TagSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TagSourceSchema
*/
@Parcelize
data class TagSourceSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectFieldValue
*/
@Parcelize
data class CustomObjectFieldValue(
    
    
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomObjectListItemDefinationSchema
*/
@Parcelize
data class CustomObjectListItemDefinationSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectFieldSchema
*/
@Parcelize
data class CustomObjectFieldSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: ArrayList<CustomObjectFieldValue>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectByIdSchema
*/
@Parcelize
data class CustomObjectByIdSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("definition")
    var definition: CustomObjectListItemDefinationSchema?=null,
    
    @SerializedName("references")
    var references: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("fields")
    var fields: ArrayList<CustomObjectFieldSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldValue
*/
@Parcelize
data class CustomFieldValue(
    
    
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomFieldSchema
*/
@Parcelize
data class CustomFieldSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("value")
    var value: ArrayList<CustomFieldValue>?=null,
    
    @SerializedName("resource_id")
    var resourceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("has_invalid_values")
    var hasInvalidValues: Boolean?=null,
    
    @SerializedName("invalid_value_errors")
    var invalidValueErrors: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldsResponseByResourceIdSchema
*/
@Parcelize
data class CustomFieldsResponseByResourceIdSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomFieldSchema>?=null
    
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







