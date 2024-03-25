package com.sdk.platform.content

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GenerateSEOContent
*/
@Parcelize
data class GenerateSEOContent(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("existing_text")
    var existingText: String?=null,
    
    @SerializedName("keywords")
    var keywords: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeneratedSEOContent
*/
@Parcelize
data class GeneratedSEOContent(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
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
    var createdAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
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
    Model: PathMappingSchema
*/
@Parcelize
data class PathMappingSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PathSourceSchema
*/
@Parcelize
data class PathSourceSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
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
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("robots_txt")
    var robotsTxt: String?=null,
    
    @SerializedName("sitemap_enabled")
    var sitemapEnabled: Boolean?=null,
    
    @SerializedName("additional_sitemap")
    var additionalSitemap: String?=null,
    
    @SerializedName("cannonical_enabled")
    var cannonicalEnabled: Boolean?=null,
    
    @SerializedName("custom_meta_tags")
    var customMetaTags: ArrayList<CustomMetaTag>?=null,
    
    @SerializedName("details")
    var details: Detail?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("sitemap")
    var sitemap: SEOSitemap?=null
    
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
    var items: ArrayList<SEOSchemaMarkupTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SEOSchemaMarkupTemplate
*/
@Parcelize
data class SEOSchemaMarkupTemplate(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("schema")
    var schema: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("target_json")
    var targetJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SEOSchemaMarkupTemplateRequestBody
*/
@Parcelize
data class SEOSchemaMarkupTemplateRequestBody(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("schema")
    var schema: String?=null,
    
    @SerializedName("target_json")
    var targetJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeletPathMappingSchema
*/
@Parcelize
data class DeletPathMappingSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: PathMappingSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePathMappingSchema
*/
@Parcelize
data class CreatePathMappingSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: PathMappingSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetAllPathMappingSchema
*/
@Parcelize
data class GetAllPathMappingSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: GetPathSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPathSchema
*/
@Parcelize
data class GetPathSchema(
    
    
    
    @SerializedName("docs")
    var docs: ArrayList<PathMappingSchema>?=null,
    
    @SerializedName("page")
    var page: Double?=null,
    
    @SerializedName("limit")
    var limit: Double?=null,
    
    @SerializedName("pages")
    var pages: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementPageSchema
*/
@Parcelize
data class AnnouncementPageSchema(
    
    
    
    @SerializedName("page_slug")
    var pageSlug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EditorMeta
*/
@Parcelize
data class EditorMeta(
    
    
    
    @SerializedName("foreground_color")
    var foregroundColor: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AnnouncementAuthorSchema
*/
@Parcelize
data class AnnouncementAuthorSchema(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("announcement")
    var announcement: String?=null,
    
    @SerializedName("pages")
    var pages: ArrayList<AnnouncementPageSchema>?=null,
    
    @SerializedName("editor_meta")
    var editorMeta: EditorMeta?=null,
    
    @SerializedName("author")
    var author: AnnouncementAuthorSchema?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultSchemaComponent
*/
@Parcelize
data class DefaultSchemaComponent(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DefaultSEOSchemaMarkupTemplate>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DefaultSEOSchemaMarkupTemplate
*/
@Parcelize
data class DefaultSEOSchemaMarkupTemplate(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("schema")
    var schema: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    
    
    @SerializedName("published")
    var published: Boolean?=null,
    
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
    var dateMeta: DateMeta?=null,
    
    @SerializedName("publish_date")
    var publishDate: String?=null
    
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
    
    @SerializedName("breadcrumbs")
    var breadcrumbs: ArrayList<SEObreadcrumb>?=null,
    
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
    Model: BlogRequest
*/
@Parcelize
data class BlogRequest(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
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
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("publish_date")
    var publishDate: String?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAnnouncementSchema
*/
@Parcelize
data class CreateAnnouncementSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: AdminAnnouncementSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DataLoaderItemsResponseSchema
*/
@Parcelize
data class DataLoaderItemsResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DataLoaderResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DataLoaderResponseSchema
*/
@Parcelize
data class DataLoaderResponseSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
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
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DataLoaderResetResponseSchema
*/
@Parcelize
data class DataLoaderResetResponseSchema(
    
    
    
    @SerializedName("resetted")
    var resetted: Boolean?=null
    
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
    
    
    
    @SerializedName("page")
    var page: ActionPage?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    var type: String?=null
    
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
    
    @SerializedName("schedule")
    var schedule: CronBasedScheduleSchema?=null,
    
    @SerializedName("sub_navigation")
    var subNavigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssignmentReference
*/
@Parcelize
data class AssignmentReference(
    
    
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("position")
    var position: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CronBasedScheduleSchema
*/
@Parcelize
data class CronBasedScheduleSchema(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateHandpickedSchema
*/
@Parcelize
data class UpdateHandpickedSchema(
    
    
    
    @SerializedName("tag")
    var tag: HandpickedTagSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: HandpickedTagSchema
*/
@Parcelize
data class HandpickedTagSchema(
    
    
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RemoveHandpickedSchema
*/
@Parcelize
data class RemoveHandpickedSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateTagSchema
*/
@Parcelize
data class CreateTagSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateTagRequestSchema
*/
@Parcelize
data class CreateTagRequestSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<CreateTagSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DataLoaderSchema
*/
@Parcelize
data class DataLoaderSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("service")
    var service: String?=null,
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
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
    Model: TagSpecSchema
*/
@Parcelize
data class TagSpecSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ServerSchema
*/
@Parcelize
data class ServerSchema(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DataLoadersApiSpecSchema
*/
@Parcelize
data class DataLoadersApiSpecSchema(
    
    
    
    @SerializedName("info")
    var info: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("servers")
    var servers: ArrayList<ServerSchema>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagSpecSchema>?=null,
    
    @SerializedName("openapi")
    var openapi: String?=null,
    
    @SerializedName("paths")
    var paths: @RawValue HashMap<String,Any>?=null
    
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
    Model: TagDeleteSuccessResponse
*/
@Parcelize
data class TagDeleteSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
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
    Model: CategoryRequestSchema
*/
@Parcelize
data class CategoryRequestSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FAQCategorySchema
*/
@Parcelize
data class FAQCategorySchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("children")
    var children: ArrayList<ChildrenSchema>?=null,
    
    @SerializedName("icon_url")
    var iconUrl: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
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
    var tags: ArrayList<String>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FAQ
*/
@Parcelize
data class FAQ(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateFaqResponseSchema
*/
@Parcelize
data class CreateFaqResponseSchema(
    
    
    
    @SerializedName("faq")
    var faq: FaqSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateFaqSchema
*/
@Parcelize
data class CreateFaqSchema(
    
    
    
    @SerializedName("faq")
    var faq: FAQ?=null
    
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
    Model: UpdateFaqCategoryRequestSchema
*/
@Parcelize
data class UpdateFaqCategoryRequestSchema(
    
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateFaqCategoryRequestSchema
*/
@Parcelize
data class CreateFaqCategoryRequestSchema(
    
    
    
    @SerializedName("category")
    var category: CategoryRequestSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateFaqCategorySchema
*/
@Parcelize
data class CreateFaqCategorySchema(
    
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
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
    Model: LandingPageGetResponse
*/
@Parcelize
data class LandingPageGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<LandingPageSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultNavigationResponse
*/
@Parcelize
data class DefaultNavigationResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<NavigationSchema>?=null
    
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
    var navigation: ArrayList<NavigationReference>?=null,
    
    @SerializedName("assignments")
    var assignments: ArrayList<AssignmentReference>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NavigationRequest
*/
@Parcelize
data class NavigationRequest(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("orientation")
    var orientation: Orientation?=null,
    
    @SerializedName("assignments")
    var assignments: ArrayList<NavigationAssignment>?=null,
    
    @SerializedName("navigation")
    var navigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NavigationAssignment
*/
@Parcelize
data class NavigationAssignment(
    
    
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("position")
    var position: String?=null
    
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
    Model: PageSpec
*/
@Parcelize
data class PageSpec(
    
    
    
    @SerializedName("specifications")
    var specifications: ArrayList<PageSpecItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageSpecParam
*/
@Parcelize
data class PageSpecParam(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PageSpecItem
*/
@Parcelize
data class PageSpecItem(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("params")
    var params: ArrayList<PageSpecParam>?=null,
    
    @SerializedName("query")
    var query: ArrayList<PageSpecParam>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageResponseError
*/
@Parcelize
data class PageResponseError(
    
    
    
    @SerializedName("errors")
    var errors: String?=null
    
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
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("content_path")
    var contentPath: String?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null,
    
    @SerializedName("page_meta")
    var pageMeta: ArrayList<PageMeta>?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("content")
    var content: ArrayList<PageContent>?=null,
    
    @SerializedName("sanitized_content")
    var sanitizedContent: ArrayList<SanitizedContent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SanitizedContent
*/
@Parcelize
data class SanitizedContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
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
    Model: PageRequestVisibility
*/
@Parcelize
data class PageRequestVisibility(
    
    
    
    @SerializedName("test")
    var test: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageRequest
*/
@Parcelize
data class PageRequest(
    
    
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("content")
    var content: ArrayList<PageContent>?=null,
    
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
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("visibility")
    var visibility: PageRequestVisibility?=null
    
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
    var duration: Double?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PagePublishRequest
*/
@Parcelize
data class PagePublishRequest(
    
    
    
    @SerializedName("publish")
    var publish: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageMetaSchema
*/
@Parcelize
data class PageMetaSchema(
    
    
    
    @SerializedName("system_pages")
    var systemPages: ArrayList<SystemPages>?=null,
    
    @SerializedName("custom_pages")
    var customPages: ArrayList<CustomePages>?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomePages
*/
@Parcelize
data class CustomePages(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SystemPagesActionPage
*/
@Parcelize
data class SystemPagesActionPage(
    
    
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SystemPagesAction
*/
@Parcelize
data class SystemPagesAction(
    
    
    
    @SerializedName("page")
    var page: SystemPagesActionPage?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SystemPages
*/
@Parcelize
data class SystemPages(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("action")
    var action: SystemPagesAction?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null
    
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
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
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
    
    @SerializedName("compatible_engines")
    var compatibleEngines: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
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
    Model: ResourcesSchema
*/
@Parcelize
data class ResourcesSchema(
    
    
    
    @SerializedName("resources")
    var resources: ArrayList<ResourceSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResourceSchema
*/
@Parcelize
data class ResourceSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("definitions_count")
    var definitionsCount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FieldValidations
*/
@Parcelize
data class FieldValidations(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationFieldDefinitionSchema
*/
@Parcelize
data class ApplicationFieldDefinitionSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<FieldValidations>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("type_name")
    var typeName: String?=null,
    
    @SerializedName("invalid_fields_count")
    var invalidFieldsCount: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FieldDefinitionSchema
*/
@Parcelize
data class FieldDefinitionSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<FieldValidations>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("type_name")
    var typeName: String?=null,
    
    @SerializedName("invalid_fields_count")
    var invalidFieldsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationCustomFieldDefinitionsSchema
*/
@Parcelize
data class ApplicationCustomFieldDefinitionsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ApplicationFieldDefinitionSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldDefinitionsSchema
*/
@Parcelize
data class CustomFieldDefinitionsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FieldDefinitionSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldDefinitionRequestSchema
*/
@Parcelize
data class CustomFieldDefinitionRequestSchema(
    
    
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<FieldValidations>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectCustomFieldDefinitions
*/
@Parcelize
data class CustomObjectCustomFieldDefinitions(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<FieldValidations>?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectDefinitionUpdateRequestSchema
*/
@Parcelize
data class CustomObjectDefinitionUpdateRequestSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name_key")
    var displayNameKey: String?=null,
    
    @SerializedName("field_definitions")
    var fieldDefinitions: ArrayList<CustomFieldDefinitionDetailResSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldDefinitionDetailResSchema
*/
@Parcelize
data class CustomFieldDefinitionDetailResSchema(
    
    
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("validations")
    var validations: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomDataDeleteSchema
*/
@Parcelize
data class CustomDataDeleteSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    @SerializedName("resource_id")
    var resourceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
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
    Model: CustomFieldsResponseSchema
*/
@Parcelize
data class CustomFieldsResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomFieldSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldsDeleteSchema
*/
@Parcelize
data class CustomFieldsDeleteSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: CustomField
*/
@Parcelize
data class CustomField(
    
    
    
    @SerializedName("definition_id")
    var definitionId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomFieldRequestSchema
*/
@Parcelize
data class CustomFieldRequestSchema(
    
    
    
    @SerializedName("fields")
    var fields: ArrayList<CustomField>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomObjectSchema
*/
@Parcelize
data class CustomObjectSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("fields")
    var fields: ArrayList<CustomFieldSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectDefinitionRequestSchema
*/
@Parcelize
data class CustomObjectDefinitionRequestSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name_key")
    var displayNameKey: String?=null,
    
    @SerializedName("field_definitions")
    var fieldDefinitions: ArrayList<CustomObjectCustomFieldDefinitions>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectCustomFieldDefinitionResSchema
*/
@Parcelize
data class CustomObjectCustomFieldDefinitionResSchema(
    
    
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("resource")
    var resource: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi_value")
    var multiValue: Boolean?=null,
    
    @SerializedName("validations")
    var validations: ArrayList<FieldValidations>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("metaobject_definition_id")
    var metaobjectDefinitionId: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectDefinitionSchema
*/
@Parcelize
data class CustomObjectDefinitionSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("display_name_key")
    var displayNameKey: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("field_definitions")
    var fieldDefinitions: ArrayList<CustomObjectCustomFieldDefinitionResSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectDefinitionDeleteResponseSchema
*/
@Parcelize
data class CustomObjectDefinitionDeleteResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectEntryBulkUploadResponse
*/
@Parcelize
data class CustomObjectEntryBulkUploadResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
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
    var type: String?=null,
    
    @SerializedName("display_name_key")
    var displayNameKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectListItemSchema
*/
@Parcelize
data class CustomObjectListItemSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("definition")
    var definition: CustomObjectListItemDefinationSchema?=null,
    
    @SerializedName("references")
    var references: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectsSchema
*/
@Parcelize
data class CustomObjectsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomObjectListItemSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetafieldTypesSchema
*/
@Parcelize
data class MetafieldTypesSchema(
    
    
    
    @SerializedName("metafield_types")
    var metafieldTypes: CustomFieldTypeSchema?=null
    
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
    
    @SerializedName("slug")
    var slug: String?=null,
    
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
    Model: CustomObjectBulkEntryInitiateDownload
*/
@Parcelize
data class CustomObjectBulkEntryInitiateDownload(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectMetaSchema
*/
@Parcelize
data class CustomObjectMetaSchema(
    
    
    
    @SerializedName("mo_total_count")
    var moTotalCount: Int?=null,
    
    @SerializedName("mo_success_count")
    var moSuccessCount: Int?=null,
    
    @SerializedName("mo_error_count")
    var moErrorCount: Int?=null,
    
    @SerializedName("mo_defintion_type")
    var moDefintionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobSchema
*/
@Parcelize
data class JobSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("jobs")
    var jobs: ArrayList<String>?=null,
    
    @SerializedName("finished_jobs")
    var finishedJobs: ArrayList<String>?=null,
    
    @SerializedName("error_jobs")
    var errorJobs: ArrayList<String>?=null,
    
    @SerializedName("errors_occured")
    var errorsOccured: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("creator")
    var creator: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("error_url")
    var errorUrl: String?=null,
    
    @SerializedName("finished_count")
    var finishedCount: Int?=null,
    
    @SerializedName("error_count")
    var errorCount: Int?=null,
    
    @SerializedName("success_count")
    var successCount: Int?=null,
    
    @SerializedName("total_jobs")
    var totalJobs: Int?=null,
    
    @SerializedName("meta")
    var meta: CustomObjectMetaSchema?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldBulkEntry
*/
@Parcelize
data class CustomFieldBulkEntry(
    
    
    
    @SerializedName("items")
    var items: ArrayList<JobSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectBulkEntry
*/
@Parcelize
data class CustomObjectBulkEntry(
    
    
    
    @SerializedName("items")
    var items: ArrayList<JobSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomFieldTypeSchema
*/
@Parcelize
data class CustomFieldTypeSchema(
    
    
    
    @SerializedName("string_single_line")
    var stringSingleLine: StringSingleLine?=null,
    
    @SerializedName("string_multi_line")
    var stringMultiLine: StringMultiLine?=null,
    
    @SerializedName("dropdown")
    var dropdown: Dropdown?=null,
    
    @SerializedName("integer")
    var integer: Integer?=null,
    
    @SerializedName("float_type")
    var floatType: FloatType?=null,
    
    @SerializedName("boolean_type")
    var booleanType: BooleanType?=null,
    
    @SerializedName("date")
    var date: Date?=null,
    
    @SerializedName("datetime")
    var datetime: Datetime?=null,
    
    @SerializedName("json")
    var json: Json?=null,
    
    @SerializedName("file")
    var file: File?=null,
    
    @SerializedName("url")
    var url: Url?=null,
    
    @SerializedName("metaobject")
    var metaobject: Metaobject?=null,
    
    @SerializedName("product")
    var product: Product?=null,
    
    @SerializedName("html")
    var html: HTML?=null,
    
    @SerializedName("duration")
    var duration: Duration?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SupportedValidationsSchema
*/
@Parcelize
data class SupportedValidationsSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Duration
*/
@Parcelize
data class Duration(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HTML
*/
@Parcelize
data class HTML(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StringSingleLine
*/
@Parcelize
data class StringSingleLine(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StringMultiLine
*/
@Parcelize
data class StringMultiLine(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dropdown
*/
@Parcelize
data class Dropdown(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Integer
*/
@Parcelize
data class Integer(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FloatType
*/
@Parcelize
data class FloatType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BooleanType
*/
@Parcelize
data class BooleanType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Date
*/
@Parcelize
data class Date(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Datetime
*/
@Parcelize
data class Datetime(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Json
*/
@Parcelize
data class Json(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: File
*/
@Parcelize
data class File(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Url
*/
@Parcelize
data class Url(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Metaobject
*/
@Parcelize
data class Metaobject(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list_enabled")
    var listEnabled: Boolean?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("supported_validations")
    var supportedValidations: ArrayList<SupportedValidationsSchema>?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectEntry
*/
@Parcelize
data class CustomObjectEntry(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("entries_count")
    var entriesCount: Int?=null,
    
    @SerializedName("fields_count")
    var fieldsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectDefinitionsSchema
*/
@Parcelize
data class CustomObjectDefinitionsSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomObjectEntry>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectEntryFieldSchema
*/
@Parcelize
data class CustomObjectEntryFieldSchema(
    
    
    
    @SerializedName("definition_id")
    var definitionId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomObjectRequestSchema
*/
@Parcelize
data class CustomObjectRequestSchema(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("definition_id")
    var definitionId: String?=null,
    
    @SerializedName("fields")
    var fields: ArrayList<CustomObjectEntryFieldSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomObjectBulkSchema
*/
@Parcelize
data class CustomObjectBulkSchema(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("total_records")
    var totalRecords: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





