package com.sdk.platform

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: TicketList
*/
@Parcelize
data class TicketList(
    
    
    @SerializedName("items")
    var items: ArrayList<Ticket>?=null,
    @SerializedName("filters")
    var filters: Filter?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: TicketHistoryList
*/
@Parcelize
data class TicketHistoryList(
    
    
    @SerializedName("docs")
    var docs: ArrayList<TicketHistory>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable

/*
    Model: CustomFormList
*/
@Parcelize
data class CustomFormList(
    
    
    @SerializedName("docs")
    var docs: ArrayList<CustomForm>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable

/*
    Model: CreateCustomFormPayload
*/
@Parcelize
data class CreateCustomFormPayload(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable

/*
    Model: EditCustomFormPayload
*/
@Parcelize
data class EditCustomFormPayload(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable

/*
    Model: EditTicketPayload
*/
@Parcelize
data class EditTicketPayload(
    
    
    @SerializedName("content")
    var content: TicketContent?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("assigned_to")
    var assignedTo: AgentChangePayload?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: AgentChangePayload
*/
@Parcelize
data class AgentChangePayload(
    
    
    @SerializedName("agent_id")
    var agentId: String?=null
    
): Parcelable

/*
    Model: CreateVideoRoomResponse
*/
@Parcelize
data class CreateVideoRoomResponse(
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null
    
): Parcelable

/*
    Model: CloseVideoRoomResponse
*/
@Parcelize
data class CloseVideoRoomResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: CreateVideoRoomPayload
*/
@Parcelize
data class CreateVideoRoomPayload(
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null,
    @SerializedName("notify")
    var notify: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: Filter
*/
@Parcelize
data class Filter(
    
    
    @SerializedName("priorities")
    var priorities: ArrayList<Priority>?=null,
    @SerializedName("categories")
    var categories: ArrayList<TicketCategory>?=null,
    @SerializedName("statuses")
    var statuses: ArrayList<Status>?=null,
    @SerializedName("assignees")
    var assignees: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    
    @SerializedName("response")
    var response: ArrayList<KeyValue>?=null
    
): Parcelable

/*
    Model: KeyValue
*/
@Parcelize
data class KeyValue(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    
    @SerializedName("access_token")
    var accessToken: String?=null
    
): Parcelable

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    
    @SerializedName("participants")
    var participants: ArrayList<Participant>?=null
    
): Parcelable

/*
    Model: Participant
*/
@Parcelize
data class Participant(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("identity")
    var identity: String?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("account_type")
    var accountType: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("debug")
    var debug: Debug?=null,
    @SerializedName("has_old_password_hash")
    var hasOldPasswordHash: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable

/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable

/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    
    @SerializedName("ticket")
    var ticket: Ticket?=null
    
): Parcelable

/*
    Model: TicketContext
*/
@Parcelize
data class TicketContext(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable

/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null
    
): Parcelable

/*
    Model: TicketAsset
*/
@Parcelize
data class TicketAsset(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: TicketContent
*/
@Parcelize
data class TicketContent(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable

/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("content")
    var content: TicketContent?=null
    
): Parcelable

/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable

/*
    Model: Status
*/
@Parcelize
data class Status(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable

/*
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("form")
    var form: CustomForm?=null
    
): Parcelable

/*
    Model: SubmitButton
*/
@Parcelize
data class SubmitButton(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("title_color")
    var titleColor: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable

/*
    Model: PollForAssignment
*/
@Parcelize
data class PollForAssignment(
    
    
    @SerializedName("duration")
    var duration: Double?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("failure_message")
    var failureMessage: String?=null
    
): Parcelable

/*
    Model: CustomForm
*/
@Parcelize
data class CustomForm(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("header_image")
    var headerImage: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("submit_button")
    var submitButton: SubmitButton?=null,
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null,
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable

/*
    Model: TicketHistory
*/
@Parcelize
data class TicketHistory(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable

/*
    Model: Ticket
*/
@Parcelize
data class Ticket(
    
    
    @SerializedName("context")
    var context: TicketContext?=null,
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    @SerializedName("response_id")
    var responseId: String?=null,
    @SerializedName("content")
    var content: TicketContent?=null,
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    @SerializedName("category")
    var category: TicketCategory?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("status")
    var status: Status?=null,
    @SerializedName("priority")
    var priority: Priority?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("assigned_to")
    var assignedTo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable



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
    
): Parcelable

/*
    Model: ThemesListingResponseSchema
*/
@Parcelize
data class ThemesListingResponseSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<ThemesSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable

/*
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    
    @SerializedName("theme_id")
    var themeId: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: FontsSchema
*/
@Parcelize
data class FontsSchema(
    
    
    @SerializedName("items")
    var items: FontsSchemaItems?=null,
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable

/*
    Model: BlitzkriegApiErrorSchema
*/
@Parcelize
data class BlitzkriegApiErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: BlitzkriegNotFoundSchema
*/
@Parcelize
data class BlitzkriegNotFoundSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@Parcelize
data class BlitzkriegInternalServerErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

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
    @SerializedName("available_pages")
    var availablePages: AvailablePages?=null,
    @SerializedName("pages")
    var pages: Pages?=null,
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    @SerializedName("sections")
    var sections: ArrayList<sectionSchema>?=null,
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    @SerializedName("config")
    var config: Config?=null,
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("font")
    var font: Font?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("colors")
    var colors: Colors?=null
    
): Parcelable

/*
    Model: pagesSchema
*/
@Parcelize
data class pagesSchema(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sections")
    var sections: Sections?=null
    
): Parcelable

/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    
    @SerializedName("blocks")
    var blocks: Blocks?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: sectionSchema
*/
@Parcelize
data class sectionSchema(
    
    
    @SerializedName("page_key")
    var pageKey: String?=null,
    @SerializedName("page_sections")
    var pageSections: PageSections?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

/*
    Model: Src
*/
@Parcelize
data class Src(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: UmdJs
*/
@Parcelize
data class UmdJs(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: CommonJs
*/
@Parcelize
data class CommonJs(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Css
*/
@Parcelize
data class Css(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: AvailablePages
*/
@Parcelize
data class AvailablePages(
    
    
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("seo")
    var seo: Seo?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sections")
    var sections: Sections?=null
    
): Parcelable

/*
    Model: Seo
*/
@Parcelize
data class Seo(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable

/*
    Model: Sections
*/
@Parcelize
data class Sections(
    
    
    @SerializedName("attributes")
    var attributes: String?=null
    
): Parcelable

/*
    Model: Pages
*/
@Parcelize
data class Pages(
    
    
    @SerializedName("collection-listing")
    var collectionListing: pagesSchema?=null,
    @SerializedName("brands")
    var brands: pagesSchema?=null,
    @SerializedName("cart-landing")
    var cartLanding: pagesSchema?=null,
    @SerializedName("collections")
    var collections: pagesSchema?=null,
    @SerializedName("product-description")
    var productDescription: pagesSchema?=null,
    @SerializedName("product-listing")
    var productListing: pagesSchema?=null,
    @SerializedName("home")
    var home: pagesSchema?=null,
    @SerializedName("categories")
    var categories: pagesSchema?=null,
    @SerializedName("compare-products")
    var compareProducts: pagesSchema?=null,
    @SerializedName("wishlist")
    var wishlist: pagesSchema?=null
    
): Parcelable

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
    var list: ListSchema?=null
    
): Parcelable

/*
    Model: Preset
*/
@Parcelize
data class Preset(
    
    
    @SerializedName("sections")
    var sections: sectionSchema?=null
    
): Parcelable

/*
    Model: GlobalSchema
*/
@Parcelize
data class GlobalSchema(
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ListSchema
*/
@Parcelize
data class ListSchema(
    
    
    @SerializedName("global")
    var global: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: ConfigPage?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Custom
*/
@Parcelize
data class Custom(
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ConfigPage
*/
@Parcelize
data class ConfigPage(
    
    
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: String?=null
    
): Parcelable

/*
    Model: Font
*/
@Parcelize
data class Font(
    
    
    @SerializedName("family")
    var family: String?=null,
    @SerializedName("variants")
    var variants: Variants?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Medium
*/
@Parcelize
data class Medium(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable

/*
    Model: SemiBold
*/
@Parcelize
data class SemiBold(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable

/*
    Model: Bold
*/
@Parcelize
data class Bold(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable

/*
    Model: Light
*/
@Parcelize
data class Light(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable

/*
    Model: Regular
*/
@Parcelize
data class Regular(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable

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
    var props: BlocksProps?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: PageSections
*/
@Parcelize
data class PageSections(
    
    
    @SerializedName("blocks")
    var blocks: PageSectionsBlocks?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    @SerializedName("preset")
    var preset: @RawValue HashMap<String,Any>?=null,
    @SerializedName("predicate")
    var predicate: Predicate?=null
    
): Parcelable

/*
    Model: PageSectionsBlocks
*/
@Parcelize
data class PageSectionsBlocks(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("props")
    var props: PageSectionsBlocksProps?=null
    
): Parcelable

/*
    Model: PageSectionsBlocksProps
*/
@Parcelize
data class PageSectionsBlocksProps(
    
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: Predicate
*/
@Parcelize
data class Predicate(
    
    
    @SerializedName("screen")
    var screen: Screen?=null,
    @SerializedName("user")
    var user: PredicateUserSchema?=null,
    @SerializedName("route")
    var route: Route?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: PredicateUserSchema
*/
@Parcelize
data class PredicateUserSchema(
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable

/*
    Model: Route
*/
@Parcelize
data class Route(
    
    
    @SerializedName("selected")
    var selected: String?=null,
    @SerializedName("exact_url")
    var exactUrl: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable



/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@Parcelize
data class SendVerificationLinkMobileRequestSchema(
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable

/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable

/*
    Model: EditProfileRequestSchema
*/
@Parcelize
data class EditProfileRequestSchema(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("dob")
    var dob: String?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("android_hash")
    var androidHash: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable

/*
    Model: SendEmailOtpRequestSchema
*/
@Parcelize
data class SendEmailOtpRequestSchema(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable

/*
    Model: VerifyOtpRequestSchema
*/
@Parcelize
data class VerifyOtpRequestSchema(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable

/*
    Model: SendMobileOtpRequestSchema
*/
@Parcelize
data class SendMobileOtpRequestSchema(
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("android_hash")
    var androidHash: String?=null,
    @SerializedName("force")
    var force: String?=null
    
): Parcelable

/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    @SerializedName("new_password")
    var newPassword: String?=null
    
): Parcelable

/*
    Model: FormRegisterRequestSchema
*/
@Parcelize
data class FormRegisterRequestSchema(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("phone")
    var phone: FormRegisterRequestSchemaPhone?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable

/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable

/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("password")
    var password: String?=null
    
): Parcelable

/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null
    
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: SendOtpRequestSchema
*/
@Parcelize
data class SendOtpRequestSchema(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable

/*
    Model: OAuthRequestSchema
*/
@Parcelize
data class OAuthRequestSchema(
    
    
    @SerializedName("is_signed_in")
    var isSignedIn: Boolean?=null,
    @SerializedName("oauth2")
    var oauth2: OAuthRequestSchemaOauth2?=null,
    @SerializedName("profile")
    var profile: OAuthRequestSchemaProfile?=null
    
): Parcelable

/*
    Model: AuthSuccess
*/
@Parcelize
data class AuthSuccess(
    
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    @SerializedName("user")
    var user: AuthSuccessUser?=null
    
): Parcelable

/*
    Model: SendOtpResponse
*/
@Parcelize
data class SendOtpResponse(
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable

/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable

/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable

/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable

/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    
    @SerializedName("result")
    var result: Boolean?=null
    
): Parcelable

/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    
    @SerializedName("logout")
    var logout: Boolean?=null
    
): Parcelable

/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable

/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    
    @SerializedName("resend_token")
    var resendToken: String?=null
    
): Parcelable

/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
    
): Parcelable

/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable

/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable

/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable

/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable

/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
    
): Parcelable

/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable

/*
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable

/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: ProfileEditSuccessSchema
*/
@Parcelize
data class ProfileEditSuccessSchema(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    @SerializedName("user")
    var user: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable

/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable

/*
    Model: OAuthRequestSchemaOauth2
*/
@Parcelize
data class OAuthRequestSchemaOauth2(
    
    
    @SerializedName("access_token")
    var accessToken: String?=null,
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("refresh_token")
    var refreshToken: String?=null
    
): Parcelable

/*
    Model: OAuthRequestSchemaProfile
*/
@Parcelize
data class OAuthRequestSchemaProfile(
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable

/*
    Model: AuthSuccessUser
*/
@Parcelize
data class AuthSuccessUser(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("debug")
    var debug: AuthSuccessUserDebug?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("emails")
    var emails: AuthSuccessUserEmails?=null
    
): Parcelable

/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable

/*
    Model: AuthSuccessUserEmails
*/
@Parcelize
data class AuthSuccessUserEmails(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable

/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("look_and_feel")
    var lookAndFeel: LookAndFeel?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    @SerializedName("login")
    var login: Login?=null,
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: MetaSchema?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("social")
    var social: Social?=null,
    @SerializedName("required_fields")
    var requiredFields: RequiredFields?=null,
    @SerializedName("register_required_fields")
    var registerRequiredFields: RegisterRequiredFields?=null,
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    @SerializedName("flash_card")
    var flashCard: FlashCard?=null,
    @SerializedName("subtext")
    var subtext: String?=null,
    @SerializedName("social_tokens")
    var socialTokens: SocialTokens?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("register")
    var register: Boolean?=null
    
): Parcelable

/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable

/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable

/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable

/*
    Model: Social
*/
@Parcelize
data class Social(
    
    
    @SerializedName("account_kit")
    var accountKit: Boolean?=null,
    @SerializedName("facebook")
    var facebook: Boolean?=null,
    @SerializedName("google")
    var google: Boolean?=null
    
): Parcelable

/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    @SerializedName("email")
    var email: Email?=null,
    @SerializedName("mobile")
    var mobile: Mobile?=null
    
): Parcelable

/*
    Model: Mobile
*/
@Parcelize
data class Mobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable

/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: FlashCard
*/
@Parcelize
data class FlashCard(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("text_color")
    var textColor: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable

/*
    Model: SocialTokens
*/
@Parcelize
data class SocialTokens(
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("account_kit")
    var accountKit: Accountkit?=null,
    @SerializedName("google")
    var google: Google?=null
    
): Parcelable

/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable



/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable

/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
    
): Parcelable

/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    @SerializedName("small")
    var small: String?=null,
    @SerializedName("large")
    var large: String?=null
    
): Parcelable

/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null
    
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null
    
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
    
): Parcelable

/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null
    
): Parcelable

/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable

/*
    Model: DeletePayoutResponse
*/
@Parcelize
data class DeletePayoutResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: SubscriptionPaymentMethodResponse
*/
@Parcelize
data class SubscriptionPaymentMethodResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@Parcelize
data class DeleteSubscriptionPaymentMethodResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: SubscriptionConfigResponse
*/
@Parcelize
data class SubscriptionConfigResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@Parcelize
data class SaveSubscriptionSetupIntentRequest(
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable

/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@Parcelize
data class SaveSubscriptionSetupIntentResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable



/*
    Model: GetActivityStatus
*/
@Parcelize
data class GetActivityStatus(
    
    
    @SerializedName("activity_history")
    var activityHistory: ActivityHistory?=null
    
): Parcelable

/*
    Model: ActivityHistory
*/
@Parcelize
data class ActivityHistory(
    
    
    @SerializedName("createdat")
    var createdat: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("user")
    var user: String?=null
    
): Parcelable

/*
    Model: FailedOrders
*/
@Parcelize
data class FailedOrders(
    
    
    @SerializedName("orders")
    var orders: FailOrder?=null
    
): Parcelable

/*
    Model: FailOrder
*/
@Parcelize
data class FailOrder(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("marketplace_order")
    var marketplaceOrder: MarketplaceOrder?=null,
    @SerializedName("marketplace_order_id")
    var marketplaceOrderId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("marketplace")
    var marketplace: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable

/*
    Model: MarketplaceOrder
*/
@Parcelize
data class MarketplaceOrder(
    
    
    @SerializedName("order_status_url")
    var orderStatusUrl: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("test")
    var test: Boolean?=null,
    @SerializedName("note")
    var note: String?=null,
    @SerializedName("total_price")
    var totalPrice: String?=null,
    @SerializedName("app_id")
    var appId: Int?=null,
    @SerializedName("total_discounts_set")
    var totalDiscountsSet: TotalDiscountsSet?=null,
    @SerializedName("total_price_set")
    var totalPriceSet: TotalPriceSet?=null,
    @SerializedName("total_tax_set")
    var totalTaxSet: TotalTaxSet?=null,
    @SerializedName("gateway")
    var gateway: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("subtotal_price_set")
    var subtotalPriceSet: SubtotalPriceSet?=null,
    @SerializedName("number")
    var number: Int?=null,
    @SerializedName("buyer_accepts_marketing")
    var buyerAcceptsMarketing: Boolean?=null,
    @SerializedName("contact_email")
    var contactEmail: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("source_name")
    var sourceName: String?=null,
    @SerializedName("payment_gateway_names")
    var paymentGatewayNames: @RawValue ArrayList<Any>?=null,
    @SerializedName("presentment_currency")
    var presentmentCurrency: String?=null,
    @SerializedName("subtotal_price")
    var subtotalPrice: String?=null,
    @SerializedName("processed_at")
    var processedAt: String?=null,
    @SerializedName("order_number")
    var orderNumber: Int?=null,
    @SerializedName("total_tip_received")
    var totalTipReceived: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("confirmed")
    var confirmed: Boolean?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("total_line_items_price")
    var totalLineItemsPrice: String?=null,
    @SerializedName("line_items")
    var lineItems: LineItems?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("total_weight")
    var totalWeight: Int?=null,
    @SerializedName("billing_address")
    var billingAddress: BillingAddress?=null,
    @SerializedName("total_shipping_price_set")
    var totalShippingPriceSet: TotalShippingPriceSet?=null,
    @SerializedName("customer")
    var customer: Customer?=null,
    @SerializedName("total_discounts")
    var totalDiscounts: String?=null,
    @SerializedName("total_line_items_price_set")
    var totalLineItemsPriceSet: TotalLineItemsPriceSet?=null,
    @SerializedName("tags")
    var tags: String?=null,
    @SerializedName("total_price_usd")
    var totalPriceUsd: String?=null,
    @SerializedName("user_id")
    var userId: Int?=null,
    @SerializedName("total_tax")
    var totalTax: String?=null,
    @SerializedName("processing_method")
    var processingMethod: String?=null,
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    @SerializedName("taxes_included")
    var taxesIncluded: Boolean?=null,
    @SerializedName("financial_status")
    var financialStatus: String?=null
    
): Parcelable

/*
    Model: TotalDiscountsSet
*/
@Parcelize
data class TotalDiscountsSet(
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: PresentmentMoney?=null,
    @SerializedName("shop_money")
    var shopMoney: ShopMoney?=null
    
): Parcelable

/*
    Model: PresentmentMoney
*/
@Parcelize
data class PresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: ShopMoney
*/
@Parcelize
data class ShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalPriceSet
*/
@Parcelize
data class TotalPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalPriceSetShopMoney
*/
@Parcelize
data class TotalPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalPriceSetPresentmentMoney
*/
@Parcelize
data class TotalPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalTaxSet
*/
@Parcelize
data class TotalTaxSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalTaxSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalTaxSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalTaxSetShopMoney
*/
@Parcelize
data class TotalTaxSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalTaxSetPresentmentMoney
*/
@Parcelize
data class TotalTaxSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: SubtotalPriceSet
*/
@Parcelize
data class SubtotalPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: SubtotalPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: SubtotalPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: SubtotalPriceSetShopMoney
*/
@Parcelize
data class SubtotalPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: SubtotalPriceSetPresentmentMoney
*/
@Parcelize
data class SubtotalPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: LineItems
*/
@Parcelize
data class LineItems(
    
    
    @SerializedName("sku")
    var sku: String?=null,
    @SerializedName("fulfillable_quantity")
    var fulfillableQuantity: Int?=null,
    @SerializedName("grams")
    var grams: Int?=null,
    @SerializedName("total_discount")
    var totalDiscount: String?=null,
    @SerializedName("article")
    var article: LineItemsArticle?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("variant_inventory_management")
    var variantInventoryManagement: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("variant_id")
    var variantId: Int?=null,
    @SerializedName("variant_title")
    var variantTitle: String?=null,
    @SerializedName("product_exists")
    var productExists: Boolean?=null,
    @SerializedName("price")
    var price: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("vendor")
    var vendor: String?=null,
    @SerializedName("fulfillment_service")
    var fulfillmentService: String?=null,
    @SerializedName("taxable")
    var taxable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("product_id")
    var productId: Int?=null,
    @SerializedName("price_set")
    var priceSet: PriceSet?=null,
    @SerializedName("tax_lines")
    var taxLines: TaxLines?=null,
    @SerializedName("requires_shipping")
    var requiresShipping: Boolean?=null,
    @SerializedName("gift_card")
    var giftCard: Boolean?=null,
    @SerializedName("total_discount_set")
    var totalDiscountSet: TotalDiscountSet?=null
    
): Parcelable

/*
    Model: LineItemsArticle
*/
@Parcelize
data class LineItemsArticle(
    
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    @SerializedName("old_article_uid")
    var oldArticleUid: String?=null,
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    @SerializedName("manufacturer")
    var manufacturer: Manufacturer?=null,
    @SerializedName("price")
    var price: ArticlePrice?=null,
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    @SerializedName("company")
    var company: Company?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    @SerializedName("marketplace_identifiers")
    var marketplaceIdentifiers: MarketplaceIdentifiers?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    @SerializedName("weight")
    var weight: Weight?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("meta")
    var meta: ArticleMeta?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("brand")
    var brand: ArticleBrand?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("identifier")
    var identifier: Identifier?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable

/*
    Model: Quantities
*/
@Parcelize
data class Quantities(
    
    
    @SerializedName("not_available")
    var notAvailable: NotAvailable?=null,
    @SerializedName("sellable")
    var sellable: Sellable?=null,
    @SerializedName("order_committed")
    var orderCommitted: OrderCommitted?=null,
    @SerializedName("damaged")
    var damaged: Damaged?=null
    
): Parcelable

/*
    Model: NotAvailable
*/
@Parcelize
data class NotAvailable(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: Sellable
*/
@Parcelize
data class Sellable(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: OrderCommitted
*/
@Parcelize
data class OrderCommitted(
    
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

/*
    Model: Damaged
*/
@Parcelize
data class Damaged(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: Manufacturer
*/
@Parcelize
data class Manufacturer(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: ArticlePrice
*/
@Parcelize
data class ArticlePrice(
    
    
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("effective")
    var effective: Int?=null,
    @SerializedName("transfer")
    var transfer: Int?=null
    
): Parcelable

/*
    Model: Company
*/
@Parcelize
data class Company(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("pan_no")
    var panNo: String?=null,
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    @SerializedName("meta")
    var meta: String?=null,
    @SerializedName("exchange_allowed")
    var exchangeAllowed: Boolean?=null,
    @SerializedName("agreement_start_date")
    var agreementStartDate: String?=null,
    @SerializedName("exchange_within_days")
    var exchangeWithinDays: Int?=null,
    @SerializedName("payment_procesing_charge")
    var paymentProcesingCharge: Int?=null,
    @SerializedName("fynd_a_fit_available")
    var fyndAFitAvailable: Boolean?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("return_within_days")
    var returnWithinDays: Int?=null
    
): Parcelable

/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: MarketplaceIdentifiers
*/
@Parcelize
data class MarketplaceIdentifiers(
    
    
    @SerializedName("tatacliq_luxury")
    var tatacliqLuxury: TatacliqLuxury?=null
    
): Parcelable

/*
    Model: TatacliqLuxury
*/
@Parcelize
data class TatacliqLuxury(
    
    
    @SerializedName("sku")
    var sku: String?=null
    
): Parcelable

/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    @SerializedName("height")
    var height: Int?=null,
    @SerializedName("width")
    var width: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("length")
    var length: Int?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("shipping")
    var shipping: Int?=null
    
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable

/*
    Model: ArticleMeta
*/
@Parcelize
data class ArticleMeta(
    
    
    @SerializedName("service")
    var service: String?=null
    
): Parcelable

/*
    Model: ArticleBrand
*/
@Parcelize
data class ArticleBrand(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable

/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable

/*
    Model: PriceSet
*/
@Parcelize
data class PriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: PriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: PriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: PriceSetShopMoney
*/
@Parcelize
data class PriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: PriceSetPresentmentMoney
*/
@Parcelize
data class PriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TaxLines
*/
@Parcelize
data class TaxLines(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("price")
    var price: String?=null,
    @SerializedName("rate")
    var rate: Int?=null,
    @SerializedName("price_set")
    var priceSet: TaxLinesPriceSet?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSet
*/
@Parcelize
data class TaxLinesPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TaxLinesPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TaxLinesPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSetShopMoney
*/
@Parcelize
data class TaxLinesPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TaxLinesPriceSetPresentmentMoney
*/
@Parcelize
data class TaxLinesPriceSetPresentmentMoney(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("amount")
    var amount: String?=null
    
): Parcelable

/*
    Model: TotalDiscountSet
*/
@Parcelize
data class TotalDiscountSet(
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalDiscountSetPresentmentMoney?=null,
    @SerializedName("shop_money")
    var shopMoney: TotalDiscountSetShopMoney?=null
    
): Parcelable

/*
    Model: TotalDiscountSetPresentmentMoney
*/
@Parcelize
data class TotalDiscountSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalDiscountSetShopMoney
*/
@Parcelize
data class TotalDiscountSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: BillingAddress
*/
@Parcelize
data class BillingAddress(
    
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("zip")
    var zip: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("province")
    var province: String?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSet
*/
@Parcelize
data class TotalShippingPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalShippingPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalShippingPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSetShopMoney
*/
@Parcelize
data class TotalShippingPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalShippingPriceSetPresentmentMoney
*/
@Parcelize
data class TotalShippingPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: Customer
*/
@Parcelize
data class Customer(
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("last_order_id")
    var lastOrderId: Int?=null,
    @SerializedName("note")
    var note: String?=null,
    @SerializedName("verified_email")
    var verifiedEmail: Boolean?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("accepts_marketing")
    var acceptsMarketing: Boolean?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("tags")
    var tags: String?=null,
    @SerializedName("last_order_name")
    var lastOrderName: String?=null,
    @SerializedName("orders_count")
    var ordersCount: Int?=null,
    @SerializedName("total_spent")
    var totalSpent: String?=null,
    @SerializedName("tax_exempt")
    var taxExempt: Boolean?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("accepts_marketing_updated_at")
    var acceptsMarketingUpdatedAt: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("admin_graphql_api_id")
    var adminGraphqlApiId: String?=null,
    @SerializedName("default_address")
    var defaultAddress: DefaultAddress?=null
    
): Parcelable

/*
    Model: DefaultAddress
*/
@Parcelize
data class DefaultAddress(
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("customer_id")
    var customerId: Int?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("country_name")
    var countryName: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("province")
    var province: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("zip")
    var zip: String?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSet
*/
@Parcelize
data class TotalLineItemsPriceSet(
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalLineItemsPriceSetShopMoney?=null,
    @SerializedName("presentment_money")
    var presentmentMoney: TotalLineItemsPriceSetPresentmentMoney?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSetShopMoney
*/
@Parcelize
data class TotalLineItemsPriceSetShopMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: TotalLineItemsPriceSetPresentmentMoney
*/
@Parcelize
data class TotalLineItemsPriceSetPresentmentMoney(
    
    
    @SerializedName("amount")
    var amount: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable

/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("zip")
    var zip: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("province_code")
    var provinceCode: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("province")
    var province: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("company")
    var company: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: OrderListing
*/
@Parcelize
data class OrderListing(
    
    
    @SerializedName("items")
    var items: ArrayList<OrderItems>?=null,
    @SerializedName("filters")
    var filters: Filters?=null,
    @SerializedName("next_order_status")
    var nextOrderStatus: NextOrderStatus?=null,
    @SerializedName("page")
    var page: PlatformOrderPage?=null,
    @SerializedName("applied_filters")
    var appliedFilters: AppliedFilters?=null
    
): Parcelable

/*
    Model: OrderItems
*/
@Parcelize
data class OrderItems(
    
    
    @SerializedName("user")
    var user: PlatformOrderUserInfo?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    @SerializedName("channel")
    var channel: Channel?=null,
    @SerializedName("breakup_values")
    var breakupValues: PlatformBreakupValues?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("application")
    var application: PlatformApplication?=null,
    @SerializedName("shipments")
    var shipments: PlatformShipment?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    @SerializedName("payments")
    var payments: ItemsPayments?=null
    
): Parcelable

/*
    Model: PlatformOrderUserInfo
*/
@Parcelize
data class PlatformOrderUserInfo(
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("avis_user_id")
    var avisUserId: String?=null
    
): Parcelable

/*
    Model: PlatformDeliveryAddress
*/
@Parcelize
data class PlatformDeliveryAddress(
    
    
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null
    
): Parcelable

/*
    Model: Channel
*/
@Parcelize
data class Channel(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: PlatformBreakupValues
*/
@Parcelize
data class PlatformBreakupValues(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: PlatformApplication
*/
@Parcelize
data class PlatformApplication(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("owner")
    var owner: String?=null,
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable

/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable

/*
    Model: PlatformShipment
*/
@Parcelize
data class PlatformShipment(
    
    
    @SerializedName("status")
    var status: PlatformShipmentStatus?=null,
    @SerializedName("bags")
    var bags: Bags?=null,
    @SerializedName("prices")
    var prices: ShipmentPrices?=null,
    @SerializedName("breakup_values")
    var breakupValues: ShipmentBreakupValues?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("dp_details")
    var dpDetails: DpDetails?=null,
    @SerializedName("invoice")
    var invoice: ShipmentInvoice?=null,
    @SerializedName("fulfilling_store")
    var fulfillingStore: PlatformFulfillingStore?=null,
    @SerializedName("payments")
    var payments: Payments?=null,
    @SerializedName("gst")
    var gst: ShipmentGst?=null,
    @SerializedName("company")
    var company: Company?=null,
    @SerializedName("brand")
    var brand: PlatformShipmentBrand?=null,
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_source")
    var orderSource: String?=null,
    @SerializedName("is_not_fynd_source")
    var isNotFyndSource: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("promise")
    var promise: Promise?=null,
    @SerializedName("tracking_details")
    var trackingDetails: ShipmentTrackingDetails?=null,
    @SerializedName("is_fynd_coupon")
    var isFyndCoupon: Boolean?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("user")
    var user: ShipmentUser?=null
    
): Parcelable

/*
    Model: PlatformShipmentStatus
*/
@Parcelize
data class PlatformShipmentStatus(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("progress")
    var progress: Int?=null,
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    @SerializedName("color_code")
    var colorCode: String?=null
    
): Parcelable

/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<BagFinancialBreakup>?=null,
    @SerializedName("status")
    var status: BagCurrStatus?=null,
    @SerializedName("item")
    var item: BagItem?=null,
    @SerializedName("article")
    var article: BagArticle?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("prices")
    var prices: BagPrices?=null,
    @SerializedName("gst_details")
    var gstDetails: GstDetails?=null,
    @SerializedName("breakup_values")
    var breakupValues: BagBreakupValues?=null,
    @SerializedName("update_time")
    var updateTime: Int?=null,
    @SerializedName("current_status")
    var currentStatus: BagCurrentStatus?=null,
    @SerializedName("bag_status")
    var bagStatus: BagStatus?=null
    
): Parcelable

/*
    Model: BagFinancialBreakup
*/
@Parcelize
data class BagFinancialBreakup(
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    @SerializedName("item_name")
    var itemName: String?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable

/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable

/*
    Model: BagCurrStatus
*/
@Parcelize
data class BagCurrStatus(
    
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null
    
): Parcelable

/*
    Model: BagItem
*/
@Parcelize
data class BagItem(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("attributes")
    var attributes: BagItemAttributes?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null
    
): Parcelable

/*
    Model: BagItemAttributes
*/
@Parcelize
data class BagItemAttributes(
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable

/*
    Model: BagArticle
*/
@Parcelize
data class BagArticle(
    
    
    @SerializedName("identifiers")
    var identifiers: ArticleIdentifiers?=null,
    @SerializedName("esp_modified")
    var espModified: Boolean?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("set")
    var set: Set?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("return_config")
    var returnConfig: BagArticleReturnConfig?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ArticleIdentifiers
*/
@Parcelize
data class ArticleIdentifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable

/*
    Model: Set
*/
@Parcelize
data class Set(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size_distribution")
    var sizeDistribution: SetSizeDistribution?=null
    
): Parcelable

/*
    Model: SetSizeDistribution
*/
@Parcelize
data class SetSizeDistribution(
    
    
    @SerializedName("sizes")
    var sizes: Sizes?=null
    
): Parcelable

/*
    Model: Sizes
*/
@Parcelize
data class Sizes(
    
    
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable

/*
    Model: BagArticleReturnConfig
*/
@Parcelize
data class BagArticleReturnConfig(
    
    
    @SerializedName("time")
    var time: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable

/*
    Model: ShipmentPrices
*/
@Parcelize
data class ShipmentPrices(
    
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null
    
): Parcelable

/*
    Model: GstDetails
*/
@Parcelize
data class GstDetails(
    
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null
    
): Parcelable

/*
    Model: BagBreakupValues
*/
@Parcelize
data class BagBreakupValues(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable

/*
    Model: BagCurrentStatus
*/
@Parcelize
data class BagCurrentStatus(
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null
    
): Parcelable

/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null
    
): Parcelable

/*
    Model: BagStatus
*/
@Parcelize
data class BagStatus(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStatusBagStateMapper?=null
    
): Parcelable

/*
    Model: BagStatusBagStateMapper
*/
@Parcelize
data class BagStatusBagStateMapper(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null
    
): Parcelable

/*
    Model: BagPrices
*/
@Parcelize
data class BagPrices(
    
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null
    
): Parcelable

/*
    Model: ShipmentBreakupValues
*/
@Parcelize
data class ShipmentBreakupValues(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable

/*
    Model: DpDetails
*/
@Parcelize
data class DpDetails(
    
    
    @SerializedName("gst_tag")
    var gstTag: String?=null
    
): Parcelable

/*
    Model: ShipmentInvoice
*/
@Parcelize
data class ShipmentInvoice(
    
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    @SerializedName("label_url")
    var labelUrl: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("amount_to_collect")
    var amountToCollect: Double?=null,
    @SerializedName("rto_address")
    var rtoAddress: RtoAddress?=null
    
): Parcelable

/*
    Model: RtoAddress
*/
@Parcelize
data class RtoAddress(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddressJson?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("address2")
    var address2: String?=null
    
): Parcelable

/*
    Model: StoreAddressJson
*/
@Parcelize
data class StoreAddressJson(
    
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable

/*
    Model: PlatformFulfillingStore
*/
@Parcelize
data class PlatformFulfillingStore(
    
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("meta")
    var meta: FulfillingStoreMeta?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: FulfillingStoreStoreAddressJson?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("login_username")
    var loginUsername: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: FulfillingStoreMeta
*/
@Parcelize
data class FulfillingStoreMeta(
    
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: AdditionalContactDetails?=null,
    @SerializedName("documents")
    var documents: Documents?=null,
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfig?=null,
    @SerializedName("allow_dp_assignment_from_fynd")
    var allowDpAssignmentFromFynd: Boolean?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("timing")
    var timing: Timing?=null
    
): Parcelable

/*
    Model: AdditionalContactDetails
*/
@Parcelize
data class AdditionalContactDetails(
    
    
    @SerializedName("number")
    var number: ArrayList<String>?=null
    
): Parcelable

/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    
    @SerializedName("gst")
    var gst: Gst?=null
    
): Parcelable

/*
    Model: Gst
*/
@Parcelize
data class Gst(
    
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable

/*
    Model: ProductReturnConfig
*/
@Parcelize
data class ProductReturnConfig(
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable

/*
    Model: Timing
*/
@Parcelize
data class Timing(
    
    
    @SerializedName("opening")
    var opening: Opening?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: Closing?=null
    
): Parcelable

/*
    Model: Opening
*/
@Parcelize
data class Opening(
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable

/*
    Model: Closing
*/
@Parcelize
data class Closing(
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable

/*
    Model: FulfillingStoreStoreAddressJson
*/
@Parcelize
data class FulfillingStoreStoreAddressJson(
    
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null
    
): Parcelable

/*
    Model: Payments
*/
@Parcelize
data class Payments(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("source_nickname")
    var sourceNickname: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("mode")
    var mode: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable

/*
    Model: ShipmentGst
*/
@Parcelize
data class ShipmentGst(
    
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: Double?=null
    
): Parcelable

/*
    Model: PlatformShipmentBrand
*/
@Parcelize
data class PlatformShipmentBrand(
    
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null
    
): Parcelable

/*
    Model: Timestamp
*/
@Parcelize
data class Timestamp(
    
    
    @SerializedName("min")
    var min: String?=null,
    @SerializedName("max")
    var max: String?=null
    
): Parcelable

/*
    Model: ShipmentTrackingDetails
*/
@Parcelize
data class ShipmentTrackingDetails(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("time")
    var time: String?=null,
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    @SerializedName("is_current")
    var isCurrent: Boolean?=null
    
): Parcelable

/*
    Model: ShipmentUser
*/
@Parcelize
data class ShipmentUser(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    @SerializedName("mongo_user_id")
    var mongoUserId: String?=null
    
): Parcelable

/*
    Model: ItemsPayments
*/
@Parcelize
data class ItemsPayments(
    
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("source_nickname")
    var sourceNickname: String?=null,
    @SerializedName("mode")
    var mode: String?=null,
    @SerializedName("source")
    var source: String?=null
    
): Parcelable

/*
    Model: Filters
*/
@Parcelize
data class Filters(
    
    
    @SerializedName("stages")
    var stages: Stages?=null
    
): Parcelable

/*
    Model: Stages
*/
@Parcelize
data class Stages(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("filters")
    var filters: StagesFilters?=null
    
): Parcelable

/*
    Model: StagesFilters
*/
@Parcelize
data class StagesFilters(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("options")
    var options: Options?=null
    
): Parcelable

/*
    Model: Options
*/
@Parcelize
data class Options(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: NextOrderStatus
*/
@Parcelize
data class NextOrderStatus(
    
    
    @SerializedName("bag_confirmed")
    var bagConfirmed: BagConfirmed?=null,
    @SerializedName("dp_assigned")
    var dpAssigned: DpAssigned?=null,
    @SerializedName("return_bag_delivered")
    var returnBagDelivered: ReturnBagDelivered?=null,
    @SerializedName("placed")
    var placed: Placed?=null,
    @SerializedName("delivery_done")
    var deliveryDone: DeliveryDone?=null,
    @SerializedName("pending")
    var pending: Pending?=null,
    @SerializedName("bag_packed")
    var bagPacked: BagPacked?=null
    
): Parcelable

/*
    Model: BagConfirmed
*/
@Parcelize
data class BagConfirmed(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: DpAssigned
*/
@Parcelize
data class DpAssigned(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: ReturnBagDelivered
*/
@Parcelize
data class ReturnBagDelivered(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: Placed
*/
@Parcelize
data class Placed(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: DeliveryDone
*/
@Parcelize
data class DeliveryDone(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: Pending
*/
@Parcelize
data class Pending(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: BagPacked
*/
@Parcelize
data class BagPacked(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: PlatformOrderPage
*/
@Parcelize
data class PlatformOrderPage(
    
    
    @SerializedName("next")
    var next: String?=null,
    @SerializedName("previous")
    var previous: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: ItemTotal?=null
    
): Parcelable

/*
    Model: ItemTotal
*/
@Parcelize
data class ItemTotal(
    
    
    @SerializedName("new")
    var new: Int?=null,
    @SerializedName("processing")
    var processing: Int?=null,
    @SerializedName("returns")
    var returns: Int?=null,
    @SerializedName("all")
    var all: Int?=null
    
): Parcelable

/*
    Model: AppliedFilters
*/
@Parcelize
data class AppliedFilters(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("stores")
    var stores: ArrayList<String>?=null,
    @SerializedName("from_date")
    var fromDate: String?=null,
    @SerializedName("to_date")
    var toDate: String?=null
    
): Parcelable

/*
    Model: UpdateOrderReprocessResponse
*/
@Parcelize
data class UpdateOrderReprocessResponse(
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: PlatformOrderTrack
*/
@Parcelize
data class PlatformOrderTrack(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null
    
): Parcelable

/*
    Model: GetPingResponse
*/
@Parcelize
data class GetPingResponse(
    
    
    @SerializedName("ping")
    var ping: String?=null
    
): Parcelable

/*
    Model: UpdateShipmentStatusResponse
*/
@Parcelize
data class UpdateShipmentStatusResponse(
    
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    @SerializedName("error_shipments")
    var errorShipments: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: UpdateShipmentStatusBody
*/
@Parcelize
data class UpdateShipmentStatusBody(
    
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    @SerializedName("task")
    var task: Boolean?=null
    
): Parcelable

/*
    Model: PlatformShipmentTrack
*/
@Parcelize
data class PlatformShipmentTrack(
    
    
    @SerializedName("results")
    var results: Results?=null
    
): Parcelable

/*
    Model: Results
*/
@Parcelize
data class Results(
    
    
    @SerializedName("awb")
    var awb: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    @SerializedName("account_name")
    var accountName: String?=null
    
): Parcelable

/*
    Model: UpdateProcessShipmenstRequestBody
*/
@Parcelize
data class UpdateProcessShipmenstRequestBody(
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    @SerializedName("expected_status")
    var expectedStatus: String?=null
    
): Parcelable

/*
    Model: UpdateProcessShipmenstRequestResponse
*/
@Parcelize
data class UpdateProcessShipmenstRequestResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: GetVoiceCallbackResponse
*/
@Parcelize
data class GetVoiceCallbackResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: GetClickToCallResponse
*/
@Parcelize
data class GetClickToCallResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable



/*
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null
    
): Parcelable

/*
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: ReferralInfo
*/
@Parcelize
data class ReferralInfo(
    
    
    @SerializedName("referral_code")
    var referralCode: String?=null
    
): Parcelable

/*
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    
    @SerializedName("address")
    var address: CompanyAddress?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("document")
    var document: Document?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null
    
): Parcelable

/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: Website
*/
@Parcelize
data class Website(
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    @SerializedName("website")
    var website: Website?=null
    
): Parcelable

/*
    Model: BusinessCountryInfo1
*/
@Parcelize
data class BusinessCountryInfo1(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

/*
    Model: ContactDetails
*/
@Parcelize
data class ContactDetails(
    
    
    @SerializedName("phone")
    var phone: ArrayList<PhoneNumber>?=null,
    @SerializedName("emails")
    var emails: ArrayList<String>?=null
    
): Parcelable

/*
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable

/*
    Model: DocumentsObj
*/
@Parcelize
data class DocumentsObj(
    
    
    @SerializedName("pending")
    var pending: Int?=null,
    @SerializedName("verified")
    var verified: Int?=null
    
): Parcelable

/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    @SerializedName("product")
    var product: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null
    
): Parcelable

/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    
    @SerializedName("portrait")
    var portrait: String?=null,
    @SerializedName("landscape")
    var landscape: String?=null
    
): Parcelable

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null
    
): Parcelable

/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null
    
): Parcelable

/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable

/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: GetAddressSerializer1
*/
@Parcelize
data class GetAddressSerializer1(
    
    
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable

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
    var mobileNo: PhoneNumber?=null
    
): Parcelable

/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    @SerializedName("store_uid")
    var storeUid: Int?=null,
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable

/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null,
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null
    
): Parcelable

/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null
    
): Parcelable

/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    @SerializedName("order")
    var order: String?=null,
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null
    
): Parcelable



/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: StartResponse
*/
@Parcelize
data class StartResponse(
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null
    
): Parcelable

/*
    Model: StartRequest
*/
@Parcelize
data class StartRequest(
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: CompleteResponse
*/
@Parcelize
data class CompleteResponse(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null,
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: Opts
*/
@Parcelize
data class Opts(
    
    
    @SerializedName("attempts")
    var attempts: Int?=null,
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    @SerializedName("delay")
    var delay: Int?=null
    
): Parcelable

/*
    Model: CopyFileTask
*/
@Parcelize
data class CopyFileTask(
    
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("data")
    var data: BulkRequest?=null,
    @SerializedName("opts")
    var opts: Opts?=null,
    @SerializedName("progress")
    var progress: Int?=null,
    @SerializedName("delay")
    var delay: Int?=null,
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    @SerializedName("attempts_made")
    var attemptsMade: Int?=null,
    @SerializedName("stacktrace")
    var stacktrace: ArrayList<String>?=null,
    @SerializedName("finished_on")
    var finishedOn: Int?=null,
    @SerializedName("processed_on")
    var processedOn: Int?=null
    
): Parcelable

/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("task")
    var task: CopyFileTask?=null
    
): Parcelable

/*
    Model: ReqConfiguration
*/
@Parcelize
data class ReqConfiguration(
    
    
    @SerializedName("concurrency")
    var concurrency: Int?=null
    
): Parcelable

/*
    Model: Destination
*/
@Parcelize
data class Destination(
    
    
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("rewrite")
    var rewrite: String?=null,
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable

/*
    Model: BulkRequest
*/
@Parcelize
data class BulkRequest(
    
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    @SerializedName("destination")
    var destination: Destination?=null,
    @SerializedName("configuration")
    var configuration: ReqConfiguration?=null
    
): Parcelable

/*
    Model: Urls
*/
@Parcelize
data class Urls(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("signed_url")
    var signedUrl: String?=null,
    @SerializedName("expiry")
    var expiry: Int?=null
    
): Parcelable

/*
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable

/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
): Parcelable

/*
    Model: DbRecord
*/
@Parcelize
data class DbRecord(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<DbRecord>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable



/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: WebRedirect
*/
@Parcelize
data class WebRedirect(
    
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    
    @SerializedName("ios")
    var ios: RedirectDevice?=null,
    @SerializedName("android")
    var android: RedirectDevice?=null,
    @SerializedName("web")
    var web: WebRedirect?=null,
    @SerializedName("force_web")
    var forceWeb: Boolean?=null
    
): Parcelable

/*
    Model: ShortLinkReq
*/
@Parcelize
data class ShortLinkReq(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("hash")
    var hash: String?=null,
    @SerializedName("active")
    var active: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
    
): Parcelable

/*
    Model: UrlInfo
*/
@Parcelize
data class UrlInfo(
    
    
    @SerializedName("original")
    var original: String?=null,
    @SerializedName("short")
    var short: String?=null,
    @SerializedName("hash")
    var hash: String?=null
    
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: UrlInfo?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("personalized")
    var personalized: String?=null,
    @SerializedName("app_redirect")
    var appRedirect: String?=null,
    @SerializedName("fallback")
    var fallback: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: Boolean?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("user_id")
    var userId: Boolean?=null,
    @SerializedName("created_at")
    var createdAt: Boolean?=null,
    @SerializedName("updated_at")
    var updatedAt: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
    
): Parcelable

/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable



/*
    Model: DataTresholdDTO
*/
@Parcelize
data class DataTresholdDTO(
    
    
    @SerializedName("min_price")
    var minPrice: Double?=null,
    @SerializedName("safe_stock")
    var safeStock: Int?=null,
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    @SerializedName("period_type_list")
    var periodTypeList: ArrayList<GenericDTO>?=null
    
): Parcelable

/*
    Model: GenericDTO
*/
@Parcelize
data class GenericDTO(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: JobConfigDTO
*/
@Parcelize
data class JobConfigDTO(
    
    
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("integration_data")
    var integrationData: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("task_details")
    var taskDetails: TaskDTO?=null,
    @SerializedName("threshold_details")
    var thresholdDetails: DataTresholdDTO?=null,
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("alias")
    var alias: String?=null
    
): Parcelable

/*
    Model: TaskDTO
*/
@Parcelize
data class TaskDTO(
    
    
    @SerializedName("type")
    var type: Int?=null,
    @SerializedName("group_list")
    var groupList: ArrayList<GenericDTO>?=null
    
): Parcelable

/*
    Model: ResponseEnvelopeString
*/
@Parcelize
data class ResponseEnvelopeString(
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: String?=null,
    @SerializedName("payload")
    var payload: String?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: AWSS3config
*/
@Parcelize
data class AWSS3config(
    
    
    @SerializedName("bucket")
    var bucket: String?=null,
    @SerializedName("region")
    var region: String?=null,
    @SerializedName("dir")
    var dir: String?=null,
    @SerializedName("access_key")
    var accessKey: String?=null,
    @SerializedName("secret_key")
    var secretKey: String?=null,
    @SerializedName("local_file_path")
    var localFilePath: String?=null,
    @SerializedName("archive_path")
    var archivePath: String?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("delete")
    var delete: Boolean?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable

/*
    Model: ArchiveConfig
*/
@Parcelize
data class ArchiveConfig(
    
    
    @SerializedName("delete")
    var delete: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("archive_dir")
    var archiveDir: String?=null
    
): Parcelable

/*
    Model: Audit
*/
@Parcelize
data class Audit(
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: CatalogMasterConfig
*/
@Parcelize
data class CatalogMasterConfig(
    
    
    @SerializedName("source_slug")
    var sourceSlug: String?=null
    
): Parcelable

/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("exclude_steps")
    var excludeSteps: ArrayList<Int>?=null,
    @SerializedName("hidden_closet_keys")
    var hiddenClosetKeys: ArrayList<String>?=null,
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null
    
): Parcelable

/*
    Model: DBConfig
*/
@Parcelize
data class DBConfig(
    
    
    @SerializedName("vendor")
    var vendor: String?=null,
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("dbname")
    var dbname: String?=null,
    @SerializedName("query")
    var query: String?=null,
    @SerializedName("procedure")
    var procedure: Boolean?=null,
    @SerializedName("driver_class")
    var driverClass: String?=null,
    @SerializedName("jdbc_url")
    var jdbcUrl: String?=null,
    @SerializedName("optional_properties")
    var optionalProperties: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: DBConnectionProfile
*/
@Parcelize
data class DBConnectionProfile(
    
    
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable

/*
    Model: DBParamConfig
*/
@Parcelize
data class DBParamConfig(
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: DefaultHeadersDTO
*/
@Parcelize
data class DefaultHeadersDTO(
    
    
    @SerializedName("store")
    var store: PropBeanDTO?=null,
    @SerializedName("intf_article_id")
    var intfArticleId: PropBeanDTO?=null,
    @SerializedName("price_effective")
    var priceEffective: PropBeanDTO?=null,
    @SerializedName("quantity")
    var quantity: PropBeanDTO?=null
    
): Parcelable

/*
    Model: DocMappingConfig
*/
@Parcelize
data class DocMappingConfig(
    
    
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("unwind_field")
    var unwindField: String?=null,
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
    
): Parcelable

/*
    Model: EmailConfig
*/
@Parcelize
data class EmailConfig(
    
    
    @SerializedName("recepient")
    var recepient: String?=null,
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("read_from_content")
    var readFromContent: Boolean?=null,
    @SerializedName("filter_based_on_recepients")
    var filterBasedOnRecepients: Boolean?=null,
    @SerializedName("pcol")
    var pcol: String?=null,
    @SerializedName("subject_line_regex")
    var subjectLineRegex: String?=null,
    @SerializedName("sender_address")
    var senderAddress: String?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("folder_name_hierarchies")
    var folderNameHierarchies: ArrayList<String>?=null,
    @SerializedName("attachment_regex")
    var attachmentRegex: String?=null,
    @SerializedName("body_content_regex")
    var bodyContentRegex: String?=null,
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("attachment_mandate")
    var attachmentMandate: Boolean?=null,
    @SerializedName("filter_files_after_extraction")
    var filterFilesAfterExtraction: Boolean?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_unread_mails")
    var readAllUnreadMails: Boolean?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("downloadable_link")
    var downloadableLink: Boolean?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: FTPConfig
*/
@Parcelize
data class FTPConfig(
    
    
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable

/*
    Model: FileConfig
*/
@Parcelize
data class FileConfig(
    
    
    @SerializedName("delimiter")
    var delimiter: String?=null,
    @SerializedName("charset")
    var charset: String?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("file_has_header")
    var fileHasHeader: Boolean?=null,
    @SerializedName("header_index")
    var headerIndex: Int?=null,
    @SerializedName("header_array")
    var headerArray: ArrayList<String>?=null,
    @SerializedName("data_start_index")
    var dataStartIndex: Int?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    @SerializedName("file_type")
    var fileType: String?=null,
    @SerializedName("line_validity_check")
    var lineValidityCheck: Boolean?=null,
    @SerializedName("sheet_names")
    var sheetNames: ArrayList<String>?=null,
    @SerializedName("read_all_sheets")
    var readAllSheets: Boolean?=null,
    @SerializedName("quote_char")
    var quoteChar: String?=null,
    @SerializedName("escape_char")
    var escapeChar: String?=null,
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
    
): Parcelable

/*
    Model: GoogleSpreadSheetConfig
*/
@Parcelize
data class GoogleSpreadSheetConfig(
    
    
    @SerializedName("range")
    var range: String?=null,
    @SerializedName("sheet_id")
    var sheetId: String?=null,
    @SerializedName("client_secret_location")
    var clientSecretLocation: String?=null,
    @SerializedName("cred_storage_directory")
    var credStorageDirectory: String?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable

/*
    Model: HttpConfig
*/
@Parcelize
data class HttpConfig(
    
    
    @SerializedName("hosturl")
    var hosturl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("http_method")
    var httpMethod: String?=null,
    @SerializedName("request_payload")
    var requestPayload: String?=null,
    @SerializedName("local_path")
    var localPath: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable

/*
    Model: JobConfig
*/
@Parcelize
data class JobConfig(
    
    
    @SerializedName("_id")
    var id: Int?=null,
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("task_type")
    var taskType: String?=null,
    @SerializedName("sync_delay")
    var syncDelay: Int?=null,
    @SerializedName("cron_expression")
    var cronExpression: String?=null,
    @SerializedName("store_filter")
    var storeFilter: StoreFilter?=null,
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    @SerializedName("store_config")
    var storeConfig: ArrayList<StoreConfig>?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null,
    @SerializedName("immediate_first_run")
    var immediateFirstRun: Boolean?=null,
    @SerializedName("disable")
    var disable: Boolean?=null,
    @SerializedName("dependent_job_codes")
    var dependentJobCodes: ArrayList<String>?=null,
    @SerializedName("company_config")
    var companyConfig: ArrayList<CompanyConfig>?=null,
    @SerializedName("company_ids")
    var companyIds: ArrayList<Int>?=null,
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    @SerializedName("db_connection_profile")
    var dbConnectionProfile: DBConnectionProfile?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null,
    @SerializedName("catalog_master_config")
    var catalogMasterConfig: CatalogMasterConfig?=null,
    @SerializedName("aggregator_types")
    var aggregatorTypes: ArrayList<String>?=null,
    @SerializedName("integration_type")
    var integrationType: String?=null,
    @SerializedName("min_price")
    var minPrice: Double?=null,
    @SerializedName("audit")
    var audit: Audit?=null,
    @SerializedName("version")
    var version: Int?=null,
    @SerializedName("alias")
    var alias: String?=null
    
): Parcelable

/*
    Model: JobConfigRawDTO
*/
@Parcelize
data class JobConfigRawDTO(
    
    
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("data")
    var data: JobConfig?=null
    
): Parcelable

/*
    Model: JsonDocConfig
*/
@Parcelize
data class JsonDocConfig(
    
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null
    
): Parcelable

/*
    Model: LocalFileConfig
*/
@Parcelize
data class LocalFileConfig(
    
    
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("working_dir")
    var workingDir: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable

/*
    Model: MongoDocConfig
*/
@Parcelize
data class MongoDocConfig(
    
    
    @SerializedName("collection_name")
    var collectionName: String?=null,
    @SerializedName("find_query")
    var findQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    @SerializedName("aggregate_pipeline")
    var aggregatePipeline: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("skip_save")
    var skipSave: Boolean?=null
    
): Parcelable

/*
    Model: OAuthConfig
*/
@Parcelize
data class OAuthConfig(
    
    
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("consumer_key")
    var consumerKey: String?=null,
    @SerializedName("consumer_secret")
    var consumerSecret: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("token_secret")
    var tokenSecret: String?=null,
    @SerializedName("rest_url")
    var restUrl: String?=null,
    @SerializedName("rest_base_url")
    var restBaseUrl: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null
    
): Parcelable

/*
    Model: ProcessConfig
*/
@Parcelize
data class ProcessConfig(
    
    
    @SerializedName("db_config")
    var dbConfig: DBConfig?=null,
    @SerializedName("db_param_config")
    var dbParamConfig: DBParamConfig?=null,
    @SerializedName("sftp_config")
    var sftpConfig: SFTPConfig?=null,
    @SerializedName("aws_s3_config")
    var awsS3Config: AWSS3config?=null,
    @SerializedName("mongo_doc_config")
    var mongoDocConfig: MongoDocConfig?=null,
    @SerializedName("ftp_config")
    var ftpConfig: FTPConfig?=null,
    @SerializedName("email_config")
    var emailConfig: EmailConfig?=null,
    @SerializedName("file_config")
    var fileConfig: FileConfig?=null,
    @SerializedName("json_doc_config")
    var jsonDocConfig: JsonDocConfig?=null,
    @SerializedName("doc_mapping_config")
    var docMappingConfig: DocMappingConfig?=null,
    @SerializedName("task_step_config")
    var taskStepConfig: TaskStepConfig?=null,
    @SerializedName("http_config")
    var httpConfig: HttpConfig?=null,
    @SerializedName("local_file_config")
    var localFileConfig: LocalFileConfig?=null,
    @SerializedName("oauth_config")
    var oauthConfig: OAuthConfig?=null,
    @SerializedName("google_spreadsheet_config")
    var googleSpreadsheetConfig: GoogleSpreadSheetConfig?=null
    
): Parcelable

/*
    Model: PropBeanConfig
*/
@Parcelize
data class PropBeanConfig(
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("mapping")
    var mapping: @RawValue HashMap<String,Any>?=null,
    @SerializedName("optional")
    var optional: Boolean?=null,
    @SerializedName("send")
    var send: Send?=null,
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    @SerializedName("include")
    var include: Boolean?=null,
    @SerializedName("source_field")
    var sourceField: String?=null,
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    @SerializedName("destination_field")
    var destinationField: String?=null,
    @SerializedName("data_type")
    var dataType: String?=null,
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("concat_str")
    var concatStr: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null,
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    @SerializedName("index_field")
    var indexField: String?=null,
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable

/*
    Model: PropBeanDTO
*/
@Parcelize
data class PropBeanDTO(
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("optional")
    var optional: Boolean?=null,
    @SerializedName("include")
    var include: Boolean?=null,
    @SerializedName("source_field")
    var sourceField: String?=null,
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    @SerializedName("destination_field")
    var destinationField: String?=null,
    @SerializedName("data_type")
    var dataType: String?=null,
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    @SerializedName("concat_str")
    var concatStr: String?=null,
    @SerializedName("function_name")
    var functionName: String?=null,
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    @SerializedName("index_field")
    var indexField: String?=null,
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,Any>?=null,
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigRawDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigRawDTO(
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigRawDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigRawDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: SFTPConfig
*/
@Parcelize
data class SFTPConfig(
    
    
    @SerializedName("host")
    var host: String?=null,
    @SerializedName("port")
    var port: Int?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    @SerializedName("retries")
    var retries: Int?=null,
    @SerializedName("interval")
    var interval: Int?=null,
    @SerializedName("private_key_path")
    var privateKeyPath: String?=null,
    @SerializedName("strict_host_key_checking")
    var strictHostKeyChecking: Boolean?=null,
    @SerializedName("local_dir")
    var localDir: String?=null,
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable

/*
    Model: Send
*/
@Parcelize
data class Send(
    
    
    @SerializedName("raw")
    var raw: Boolean?=null,
    @SerializedName("processed")
    var processed: Boolean?=null
    
): Parcelable

/*
    Model: StoreConfig
*/
@Parcelize
data class StoreConfig(
    
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    @SerializedName("storeid")
    var storeid: String?=null,
    @SerializedName("store_alias")
    var storeAlias: String?=null,
    @SerializedName("store_file_regex")
    var storeFileRegex: String?=null,
    @SerializedName("store_file_name")
    var storeFileName: String?=null,
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: StoreFilter
*/
@Parcelize
data class StoreFilter(
    
    
    @SerializedName("include_tags")
    var includeTags: ArrayList<String>?=null,
    @SerializedName("exclude_tags")
    var excludeTags: ArrayList<String>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: TaskConfig
*/
@Parcelize
data class TaskConfig(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("task_config_id")
    var taskConfigId: Int?=null,
    @SerializedName("task_params")
    var taskParams: ArrayList<TaskParam>?=null
    
): Parcelable

/*
    Model: TaskParam
*/
@Parcelize
data class TaskParam(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: TaskStepConfig
*/
@Parcelize
data class TaskStepConfig(
    
    
    @SerializedName("task_configs")
    var taskConfigs: ArrayList<TaskConfig>?=null,
    @SerializedName("task_config_ids")
    var taskConfigIds: ArrayList<Int>?=null,
    @SerializedName("task_config_group_ids")
    var taskConfigGroupIds: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigDTO(
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: ResponseEnvelopeJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeJobConfigDTO(
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: JobConfigDTO?=null,
    @SerializedName("payload")
    var payload: JobConfigDTO?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: JobConfigListDTO
*/
@Parcelize
data class JobConfigListDTO(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("alias")
    var alias: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ResponseEnvelopeListJobConfigListDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigListDTO(
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("exception")
    var exception: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    @SerializedName("http_status")
    var httpStatus: String?=null,
    @SerializedName("items")
    var items: ArrayList<JobConfigListDTO>?=null,
    @SerializedName("payload")
    var payload: ArrayList<JobConfigListDTO>?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable



/*
    Model: StoreMapping
*/
@Parcelize
data class StoreMapping(
    
    
    @SerializedName("enabled")
    var enabled: String?=null,
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    @SerializedName("store_id")
    var storeId: Double?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: AllChannels
*/
@Parcelize
data class AllChannels(
    
    
    @SerializedName("mkp_name")
    var mkpName: Boolean?=null
    
): Parcelable

/*
    Model: MyntraPayload
*/
@Parcelize
data class MyntraPayload(
    
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    @SerializedName("secret_key")
    var secretKey: String?=null
    
): Parcelable

/*
    Model: AmazonPayload
*/
@Parcelize
data class AmazonPayload(
    
    
    @SerializedName("seller_id")
    var sellerId: String?=null,
    @SerializedName("mws_auth_token")
    var mwsAuthToken: String?=null
    
): Parcelable

/*
    Model: FlipkartPayload
*/
@Parcelize
data class FlipkartPayload(
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: TatacliqPayload
*/
@Parcelize
data class TatacliqPayload(
    
    
    @SerializedName("user_name")
    var userName: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("merchant_id")
    var merchantId: String?=null
    
): Parcelable

/*
    Model: AjioPayload
*/
@Parcelize
data class AjioPayload(
    
    
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("client_ip")
    var clientIp: String?=null
    
): Parcelable

/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    @SerializedName("inventory")
    var inventory: Boolean?=null,
    @SerializedName("price")
    var price: Boolean?=null
    
): Parcelable

/*
    Model: StoreMappingPayload
*/
@Parcelize
data class StoreMappingPayload(
    
    
    @SerializedName("store_mapping_enabled")
    var storeMappingEnabled: Boolean?=null,
    @SerializedName("store_mapping")
    var storeMapping: ArrayList<StoreMapping>?=null
    
): Parcelable

/*
    Model: StatusPayload
*/
@Parcelize
data class StatusPayload(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable

/*
    Model: StatusResp
*/
@Parcelize
data class StatusResp(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable

/*
    Model: SyncPayload
*/
@Parcelize
data class SyncPayload(
    
    
    @SerializedName("modified_since")
    var modifiedSince: String?=null
    
): Parcelable

/*
    Model: SyncResp
*/
@Parcelize
data class SyncResp(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: MkpResp
*/
@Parcelize
data class MkpResp(
    
    
    @SerializedName("marketplace")
    var marketplace: String?=null,
    @SerializedName("worker")
    var worker: Double?=null,
    @SerializedName("worker_assigned")
    var workerAssigned: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("store_mapping_enabled")
    var storeMappingEnabled: String?=null,
    @SerializedName("company_id")
    var companyId: Double?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_mapping")
    var storeMapping: ArrayList<StoreMapping>?=null
    
): Parcelable



/*
    Model: StatGroup
*/
@Parcelize
data class StatGroup(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: StatsGroups
*/
@Parcelize
data class StatsGroups(
    
    
    @SerializedName("groups")
    var groups: ArrayList<StatGroup>?=null
    
): Parcelable

/*
    Model: StatsGroupComponent
*/
@Parcelize
data class StatsGroupComponent(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: StatsGroupComponents
*/
@Parcelize
data class StatsGroupComponents(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("components")
    var components: ArrayList<StatsGroupComponent>?=null
    
): Parcelable

/*
    Model: StatsRes
*/
@Parcelize
data class StatsRes(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ReceivedAt
*/
@Parcelize
data class ReceivedAt(
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: AbandonCartsDetail
*/
@Parcelize
data class AbandonCartsDetail(
    
    
    @SerializedName("properties_cart_id")
    var propertiesCartId: String?=null,
    @SerializedName("context_traits_first_name")
    var contextTraitsFirstName: String?=null,
    @SerializedName("context_traits_last_name")
    var contextTraitsLastName: String?=null,
    @SerializedName("context_traits_phone_number")
    var contextTraitsPhoneNumber: String?=null,
    @SerializedName("context_traits_email")
    var contextTraitsEmail: String?=null,
    @SerializedName("context_app_application_id")
    var contextAppApplicationId: String?=null,
    @SerializedName("properties_breakup_values_raw_total")
    var propertiesBreakupValuesRawTotal: String?=null,
    @SerializedName("received_at")
    var receivedAt: ReceivedAt?=null
    
): Parcelable

/*
    Model: AbdCartPage
*/
@Parcelize
data class AbdCartPage(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("current")
    var current: String?=null,
    @SerializedName("has_next")
    var hasNext: String?=null,
    @SerializedName("item_total")
    var itemTotal: String?=null
    
): Parcelable

/*
    Model: AbandonCartsList
*/
@Parcelize
data class AbandonCartsList(
    
    
    @SerializedName("items")
    var items: ArrayList<AbandonCartsDetail>?=null,
    @SerializedName("cart_total")
    var cartTotal: String?=null,
    @SerializedName("page")
    var page: AbdCartPage?=null
    
): Parcelable

/*
    Model: AbandonCartDetail
*/
@Parcelize
data class AbandonCartDetail(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("cart_value")
    var cartValue: String?=null,
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("breakup")
    var breakup: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ExportJobReq
*/
@Parcelize
data class ExportJobReq(
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    @SerializedName("start_time")
    var startTime: String?=null,
    @SerializedName("end_time")
    var endTime: String?=null,
    @SerializedName("event_type")
    var eventType: String?=null
    
): Parcelable

/*
    Model: ExportJobRes
*/
@Parcelize
data class ExportJobRes(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable

/*
    Model: ExportJobStatusRes
*/
@Parcelize
data class ExportJobStatusRes(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("job_id")
    var jobId: String?=null,
    @SerializedName("download_url")
    var downloadUrl: String?=null
    
): Parcelable

/*
    Model: GetLogsListReq
*/
@Parcelize
data class GetLogsListReq(
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    @SerializedName("start_date")
    var startDate: String?=null,
    @SerializedName("company_id")
    var companyId: String?=null,
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable

/*
    Model: MkpLogsResp
*/
@Parcelize
data class MkpLogsResp(
    
    
    @SerializedName("start_time_iso")
    var startTimeIso: String?=null,
    @SerializedName("end_time_iso")
    var endTimeIso: String?=null,
    @SerializedName("event_type")
    var eventType: String?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("count")
    var count: String?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: LogsPage
*/
@Parcelize
data class LogsPage(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("current")
    var current: String?=null,
    @SerializedName("has_next")
    var hasNext: String?=null,
    @SerializedName("item_total")
    var itemTotal: String?=null
    
): Parcelable

/*
    Model: GetLogsListRes
*/
@Parcelize
data class GetLogsListRes(
    
    
    @SerializedName("items")
    var items: ArrayList<MkpLogsResp>?=null,
    @SerializedName("page")
    var page: LogsPage?=null
    
): Parcelable

/*
    Model: SearchLogReq
*/
@Parcelize
data class SearchLogReq(
    
    
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    @SerializedName("start_date")
    var startDate: String?=null,
    @SerializedName("company_id")
    var companyId: String?=null,
    @SerializedName("end_date")
    var endDate: String?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("identifier_value")
    var identifierValue: String?=null
    
): Parcelable

/*
    Model: LogInfo
*/
@Parcelize
data class LogInfo(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("event_type")
    var eventType: String?=null,
    @SerializedName("marketplace_name")
    var marketplaceName: String?=null,
    @SerializedName("event")
    var event: String?=null,
    @SerializedName("trace_id")
    var traceId: String?=null,
    @SerializedName("company_id")
    var companyId: Double?=null,
    @SerializedName("brand_id")
    var brandId: Double?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("store_id")
    var storeId: Double?=null,
    @SerializedName("item_id")
    var itemId: Double?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null
    
): Parcelable

/*
    Model: SearchLogRes
*/
@Parcelize
data class SearchLogRes(
    
    
    @SerializedName("items")
    var items: ArrayList<LogInfo>?=null,
    @SerializedName("page")
    var page: LogsPage?=null
    
): Parcelable

