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
    
): Parcelable

/*
    Model: ApplicationLegalFAQ
*/
@Parcelize
data class ApplicationLegalFAQ(
    
    
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable

/*
    Model: CustomMetaTag
*/
@Parcelize
data class CustomMetaTag(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("content")
    var content: String?=null
    
): Parcelable

/*
    Model: Detail
*/
@Parcelize
data class Detail(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable

/*
    Model: StorefrontAnnouncement
*/
@Parcelize
data class StorefrontAnnouncement(
    
    
    @SerializedName("announcements")
    var announcements: AnnouncementSchema?=null,
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
    
): Parcelable

/*
    Model: AnnouncementPageSchema
*/
@Parcelize
data class AnnouncementPageSchema(
    
    
    @SerializedName("page_slug")
    var pageSlug: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: AnnouncementAuthorSchema
*/
@Parcelize
data class AnnouncementAuthorSchema(
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable

/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
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
    
): Parcelable

/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("duration")
    var duration: Double?=null,
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: NextSchedule
*/
@Parcelize
data class NextSchedule(
    
    
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("end")
    var end: String?=null
    
): Parcelable

/*
    Model: AnnouncementSchema
*/
@Parcelize
data class AnnouncementSchema(
    
    
    @SerializedName("page_slug")
    var pageSlug: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: announcementSchema
*/
@Parcelize
data class announcementSchema(
    
    
    @SerializedName("announcement")
    var announcement: String?=null,
    @SerializedName("schedule")
    var schedule: scheduleStartSchema?=null
    
): Parcelable

/*
    Model: scheduleStartSchema
*/
@Parcelize
data class scheduleStartSchema(
    
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable

/*
    Model: BlogGetResponse
*/
@Parcelize
data class BlogGetResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ResourceContent
*/
@Parcelize
data class ResourceContent(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: BlogSchema
*/
@Parcelize
data class BlogSchema(
    
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null
    
): Parcelable

/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: BlogRequest
*/
@Parcelize
data class BlogRequest(
    
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null
    
): Parcelable

/*
    Model: CreateAnnouncementSchema
*/
@Parcelize
data class CreateAnnouncementSchema(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: AdminAnnouncementSchema?=null
    
): Parcelable

/*
    Model: Navigation
*/
@Parcelize
data class Navigation(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("orientation")
    var orientation: String?=null,
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("position")
    var position: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("navigation")
    var navigation: NavigationReference?=null
    
): Parcelable

/*
    Model: LocaleLanguage
*/
@Parcelize
data class LocaleLanguage(
    
    
    @SerializedName("hi")
    var hi: Language?=null,
    @SerializedName("ar")
    var ar: Language?=null,
    @SerializedName("en-US")
    var enUs: Language?=null
    
): Parcelable

/*
    Model: Language
*/
@Parcelize
data class Language(
    
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("popup")
    var popup: Page?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: NavigationReference
*/
@Parcelize
data class NavigationReference(
    
    
    @SerializedName("acl")
    var acl: @RawValue Any?=null,
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
    var subNavigation: NavigationReference?=null
    
): Parcelable

/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("platform")
    var platform: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null
    
): Parcelable

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
    var duration: Int?=null
    
): Parcelable

/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
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
    
): Parcelable

/*
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    @SerializedName("media")
    var media: ArrayList<Media>?=null,
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable

/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    
    @SerializedName("announcements")
    var announcements: ArrayList<AnnouncementDataSchema>?=null,
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
    
): Parcelable

/*
    Model: AnnouncementDataSchema
*/
@Parcelize
data class AnnouncementDataSchema(
    
    
    @SerializedName("page_slug")
    var pageSlug: String?=null,
    @SerializedName("announcement")
    var announcement: StorefrontAnnouncement?=null
    
): Parcelable

/*
    Model: FaqResponseSchema
*/
@Parcelize
data class FaqResponseSchema(
    
    
    @SerializedName("faqs")
    var faqs: ArrayList<FAQ>?=null
    
): Parcelable

/*
    Model: UpdateHandpickedSchema
*/
@Parcelize
data class UpdateHandpickedSchema(
    
    
    @SerializedName("tag")
    var tag: HandpickedTagSchema?=null
    
): Parcelable

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
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("sub_type")
    var subType: String?=null,
    @SerializedName("content")
    var content: String?=null
    
): Parcelable

/*
    Model: RemoveHandpickedSchema
*/
@Parcelize
data class RemoveHandpickedSchema(
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable

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
    var position: String?=null
    
): Parcelable

/*
    Model: CreateTagRequestSchema
*/
@Parcelize
data class CreateTagRequestSchema(
    
    
    @SerializedName("tags")
    var tags: ArrayList<CreateTagSchema>?=null
    
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    
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
    
): Parcelable

/*
    Model: CategorySchema
*/
@Parcelize
data class CategorySchema(
    
    
    @SerializedName("index")
    var index: Int?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

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
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable

/*
    Model: CategoryRequestSchema
*/
@Parcelize
data class CategoryRequestSchema(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: FAQCategorySchema
*/
@Parcelize
data class FAQCategorySchema(
    
    
    @SerializedName("index")
    var index: Int?=null,
    @SerializedName("children")
    var children: ChildrenSchema?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: FaqSchema
*/
@Parcelize
data class FaqSchema(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: CreateFaqResponseSchema
*/
@Parcelize
data class CreateFaqResponseSchema(
    
    
    @SerializedName("faq")
    var faq: FaqSchema?=null
    
): Parcelable

/*
    Model: CreateFaqSchema
*/
@Parcelize
data class CreateFaqSchema(
    
    
    @SerializedName("faq")
    var faq: FAQ?=null
    
): Parcelable

/*
    Model: GetFaqSchema
*/
@Parcelize
data class GetFaqSchema(
    
    
    @SerializedName("faqs")
    var faqs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: UpdateFaqCategoryRequestSchema
*/
@Parcelize
data class UpdateFaqCategoryRequestSchema(
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
): Parcelable

/*
    Model: CreateFaqCategoryRequestSchema
*/
@Parcelize
data class CreateFaqCategoryRequestSchema(
    
    
    @SerializedName("category")
    var category: CategoryRequestSchema?=null
    
): Parcelable

/*
    Model: CreateFaqCategorySchema
*/
@Parcelize
data class CreateFaqCategorySchema(
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
): Parcelable

/*
    Model: GetFaqCategoriesSchema
*/
@Parcelize
data class GetFaqCategoriesSchema(
    
    
    @SerializedName("categories")
    var categories: ArrayList<CategorySchema>?=null
    
): Parcelable

/*
    Model: GetFaqCategoryByIdOrSlugSchema
*/
@Parcelize
data class GetFaqCategoryByIdOrSlugSchema(
    
    
    @SerializedName("category")
    var category: FAQCategorySchema?=null
    
): Parcelable

/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
    
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
    
): Parcelable

/*
    Model: LandingPageGetResponse
*/
@Parcelize
data class LandingPageGetResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    var createdBy: CreatedBy?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
    
): Parcelable

/*
    Model: LandingPageRequest
*/
@Parcelize
data class LandingPageRequest(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null
    
): Parcelable

/*
    Model: DefaultNavigationResponse
*/
@Parcelize
data class DefaultNavigationResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: NavigationGetResponse
*/
@Parcelize
data class NavigationGetResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

/*
    Model: Orientation
*/
@Parcelize
data class Orientation(
    
    
    @SerializedName("portrait")
    var portrait: ArrayList<String>?=null,
    @SerializedName("landscape")
    var landscape: ArrayList<String>?=null
    
): Parcelable

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
    @SerializedName("orientation")
    var orientation: @RawValue Any?=null,
    @SerializedName("navigation")
    var navigation: NavigationReference?=null
    
): Parcelable

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
    @SerializedName("navigation")
    var navigation: NavigationReference?=null
    
): Parcelable

/*
    Model: CustomPageSchema
*/
@Parcelize
data class CustomPageSchema(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("orientation")
    var orientation: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("content")
    var content: ArrayList<ContentSchema>?=null,
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null
    
): Parcelable

/*
    Model: ContentSchema
*/
@Parcelize
data class ContentSchema(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    
    @SerializedName("data")
    var data: CustomPageSchema?=null
    
): Parcelable

/*
    Model: CustomBlogSchema
*/
@Parcelize
data class CustomBlogSchema(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("feature_image")
    var featureImage: FeatureImage?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("content")
    var content: ContentSchema?=null,
    @SerializedName("author")
    var author: Author?=null,
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: FeatureImage
*/
@Parcelize
data class FeatureImage(
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

/*
    Model: CustomBlog
*/
@Parcelize
data class CustomBlog(
    
    
    @SerializedName("data")
    var data: CustomBlogSchema?=null
    
): Parcelable

/*
    Model: PageGetResponse
*/
@Parcelize
data class PageGetResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PageSpec
*/
@Parcelize
data class PageSpec(
    
    
    @SerializedName("specifications")
    var specifications: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

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
    var params: ArrayList<String>?=null,
    @SerializedName("query")
    var query: ArrayList<String>?=null
    
): Parcelable

/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: @RawValue ArrayList<Any>?=null,
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    @SerializedName("content")
    var content: ArrayList<PageContent>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page_meta")
    var pageMeta: ArrayList<PageMeta>?=null,
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
    @SerializedName("visibility")
    var visibility: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable

/*
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PageRequest
*/
@Parcelize
data class PageRequest(
    
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: PagePublishRequest
*/
@Parcelize
data class PagePublishRequest(
    
    
    @SerializedName("publish")
    var publish: Boolean?=null
    
): Parcelable

/*
    Model: PageMetaSchema
*/
@Parcelize
data class PageMetaSchema(
    
    
    @SerializedName("system_pages")
    var systemPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("custom_pages")
    var customPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable

/*
    Model: SlideshowGetResponse
*/
@Parcelize
data class SlideshowGetResponse(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    var media: Media?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
    
): Parcelable

/*
    Model: SlideshowRequest
*/
@Parcelize
data class SlideshowRequest(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    @SerializedName("media")
    var media: Media?=null,
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Phone
*/
@Parcelize
data class Phone(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("number")
    var number: String?=null
    
): Parcelable

/*
    Model: PhoneSchema
*/
@Parcelize
data class PhoneSchema(
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("phone")
    var phone: ArrayList<Phone>?=null
    
): Parcelable

/*
    Model: EmailSchema
*/
@Parcelize
data class EmailSchema(
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("email")
    var email: ArrayList<Email>?=null
    
): Parcelable

/*
    Model: ContactSchema
*/
@Parcelize
data class ContactSchema(
    
    
    @SerializedName("phone")
    var phone: PhoneSchema?=null,
    @SerializedName("email")
    var email: EmailSchema?=null
    
): Parcelable

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
    
): Parcelable

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
    @SerializedName("position")
    var position: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable



/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable

/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null
    
): Parcelable

/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    @SerializedName("large")
    var large: String?=null,
    @SerializedName("small")
    var small: String?=null
    
): Parcelable

/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null
    
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("name")
    var name: String?=null,
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
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
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
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null
    
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
    
    
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null
    
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
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable

/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: CompanyAddress?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("document")
    var document: Document?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null
    
): Parcelable

/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable

/*
    Model: BusinessCountryInfo1
*/
@Parcelize
data class BusinessCountryInfo1(
    
    
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable

/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null
    
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
    
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("product")
    var product: DocumentsObj?=null,
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null,
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable

/*
    Model: BrandBannerSerializer
*/
@Parcelize
data class BrandBannerSerializer(
    
    
    @SerializedName("landscape")
    var landscape: String?=null,
    @SerializedName("portrait")
    var portrait: String?=null
    
): Parcelable

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: String?=null
    
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
    
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: CompanyBrandPostRequestSerializer
*/
@Parcelize
data class CompanyBrandPostRequestSerializer(
    
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("company")
    var company: Int?=null
    
): Parcelable

/*
    Model: CompanyBrandListSerializer
*/
@Parcelize
data class CompanyBrandListSerializer(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetAddressSerializer1
*/
@Parcelize
data class GetAddressSerializer1(
    
    
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null
    
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
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable

/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null
    
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
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null,
    @SerializedName("store_uid")
    var storeUid: Int?=null
    
): Parcelable

/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null
    
): Parcelable

/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable

/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    @SerializedName("order")
    var order: String?=null
    
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
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
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable

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
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("exclude_category")
    var excludeCategory: @RawValue ArrayList<Any>?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("company_store")
    var companyStore: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: InventoryBrand
*/
@Parcelize
data class InventoryBrand(
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: AppStoreRules
*/
@Parcelize
data class AppStoreRules(
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: InventoryCategory
*/
@Parcelize
data class InventoryCategory(
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("categories")
    var categories: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: InventoryPrice
*/
@Parcelize
data class InventoryPrice(
    
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable

/*
    Model: InventoryDiscount
*/
@Parcelize
data class InventoryDiscount(
    
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable

/*
    Model: AuthenticationConfig
*/
@Parcelize
data class AuthenticationConfig(
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable

/*
    Model: ArticleAssignmentConfig
*/
@Parcelize
data class ArticleAssignmentConfig(
    
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRules?=null,
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("enforced_stores")
    var enforcedStores: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: ArticleAssignmentRules
*/
@Parcelize
data class ArticleAssignmentRules(
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriority?=null
    
): Parcelable

/*
    Model: StorePriority
*/
@Parcelize
data class StorePriority(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("storetype_order")
    var storetypeOrder: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: RewardPointsConfig
*/
@Parcelize
data class RewardPointsConfig(
    
    
    @SerializedName("credit")
    var credit: Credit?=null,
    @SerializedName("debit")
    var debit: Debit?=null
    
): Parcelable

/*
    Model: Credit
*/
@Parcelize
data class Credit(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

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
    
): Parcelable

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
    var bulkCoupons: Boolean?=null
    
): Parcelable

/*
    Model: DeliveryCharges
*/
@Parcelize
data class DeliveryCharges(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("charges")
    var charges: Charges?=null
    
): Parcelable

/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    @SerializedName("charges")
    var charges: Double?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: CallbackUrl
*/
@Parcelize
data class CallbackUrl(
    
    
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("web")
    var web: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: PaymentModeConfig
*/
@Parcelize
data class PaymentModeConfig(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: AppOrderConfig
*/
@Parcelize
data class AppOrderConfig(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null
    
): Parcelable

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
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null
    
): Parcelable

/*
    Model: BrandCompanyInfo
*/
@Parcelize
data class BrandCompanyInfo(
    
    
    @SerializedName("company_name")
    var companyName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable

/*
    Model: CompanyByBrandsRequest
*/
@Parcelize
data class CompanyByBrandsRequest(
    
    
    @SerializedName("brands")
    var brands: Int?=null,
    @SerializedName("search_text")
    var searchText: String?=null
    
): Parcelable

/*
    Model: CompanyByBrandsResponse
*/
@Parcelize
data class CompanyByBrandsResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<BrandCompanyInfo>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: StoreByBrandsResponse
*/
@Parcelize
data class StoreByBrandsResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<BrandStoreInfo>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

/*
    Model: BrandsByCompanyResponse
*/
@Parcelize
data class BrandsByCompanyResponse(
    
    
    @SerializedName("brands")
    var brands: CompanyBrandInfo?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: CreateAppResponse
*/
@Parcelize
data class CreateAppResponse(
    
    
    @SerializedName("app")
    var app: Application?=null,
    @SerializedName("configuration")
    var configuration: ApplicationInventory?=null
    
): Parcelable

/*
    Model: ApplicationsResponse
*/
@Parcelize
data class ApplicationsResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<Application>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: LandingImage
*/
@Parcelize
data class LandingImage(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

/*
    Model: SplashImage
*/
@Parcelize
data class SplashImage(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: BuildVersionHistory
*/
@Parcelize
data class BuildVersionHistory(
    
    
    @SerializedName("versions")
    var versions: BuildVersion?=null,
    @SerializedName("latest_available_version_name")
    var latestAvailableVersionName: String?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

/*
    Model: DefaultCurrency
*/
@Parcelize
data class DefaultCurrency(
    
    
    @SerializedName("ref")
    var ref: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: DomainAdd
*/
@Parcelize
data class DomainAdd(
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: DomainAddRequest
*/
@Parcelize
data class DomainAddRequest(
    
    
    @SerializedName("domain")
    var domain: DomainAdd?=null
    
): Parcelable

/*
    Model: DomainsResponse
*/
@Parcelize
data class DomainsResponse(
    
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null
    
): Parcelable

/*
    Model: UpdateDomain
*/
@Parcelize
data class UpdateDomain(
    
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable

/*
    Model: UpdateDomainTypeRequest
*/
@Parcelize
data class UpdateDomainTypeRequest(
    
    
    @SerializedName("domain")
    var domain: UpdateDomain?=null,
    @SerializedName("action")
    var action: String?=null
    
): Parcelable

/*
    Model: DomainStatusRequest
*/
@Parcelize
data class DomainStatusRequest(
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null
    
): Parcelable

/*
    Model: DomainStatus
*/
@Parcelize
data class DomainStatus(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable

/*
    Model: DomainStatusResponse
*/
@Parcelize
data class DomainStatusResponse(
    
    
    @SerializedName("connected")
    var connected: Boolean?=null,
    @SerializedName("status")
    var status: ArrayList<DomainStatus>?=null
    
): Parcelable

/*
    Model: DomainSuggestionsRequest
*/
@Parcelize
data class DomainSuggestionsRequest(
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null,
    @SerializedName("custom")
    var custom: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: DomainSuggestionsResponse
*/
@Parcelize
data class DomainSuggestionsResponse(
    
    
    @SerializedName("domains")
    var domains: ArrayList<DomainSuggestion>?=null
    
): Parcelable

/*
    Model: GetIntegrationsOptInsResponse
*/
@Parcelize
data class GetIntegrationsOptInsResponse(
    
    
    @SerializedName("items")
    var items: IntegrationOptIn?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    var meta: IntegrationMeta?=null,
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
    
): Parcelable

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
    
): Parcelable

/*
    Model: CompanyValidator
*/
@Parcelize
data class CompanyValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: JsonSchema?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: StoreValidator
*/
@Parcelize
data class StoreValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

/*
    Model: InventoryValidator
*/
@Parcelize
data class InventoryValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

/*
    Model: OrderValidator
*/
@Parcelize
data class OrderValidator(
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable

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
    
): Parcelable

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
    var meta: IntegrationMeta?=null,
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
    
): Parcelable

/*
    Model: IntegrationConfigResponse
*/
@Parcelize
data class IntegrationConfigResponse(
    
    
    @SerializedName("items")
    var items: IntegrationLevel?=null
    
): Parcelable

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
    var lastPatch: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("integration")
    var integration: String?=null,
    @SerializedName("level")
    var level: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue ArrayList<Any>?=null,
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
    
): Parcelable

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
    
): Parcelable

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
    var lastPatch: LastPatch?=null,
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
    
): Parcelable

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
    
): Parcelable

/*
    Model: OtherEntityData
*/
@Parcelize
data class OtherEntityData(
    
    
    @SerializedName("article_identifier")
    var articleIdentifier: String?=null
    
): Parcelable

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
    
): Parcelable

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
    @SerializedName("payment")
    var payment: InventoryPaymentConfig?=null,
    @SerializedName("article_assignment")
    var articleAssignment: InventoryArticleAssignment?=null
    
): Parcelable

/*
    Model: AppDomain
*/
@Parcelize
data class AppDomain(
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CompaniesResponse
*/
@Parcelize
data class CompaniesResponse(
    
    
    @SerializedName("items")
    var items: AppInventoryCompanies?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: StoresResponse
*/
@Parcelize
data class StoresResponse(
    
    
    @SerializedName("items")
    var items: AppInventoryStores?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

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
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable

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
    var app: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: OrderingStoreConfig
*/
@Parcelize
data class OrderingStoreConfig(
    
    
    @SerializedName("deployment_meta")
    var deploymentMeta: DeploymentMeta?=null
    
): Parcelable

/*
    Model: OtherSellerCompany
*/
@Parcelize
data class OtherSellerCompany(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: OtherSellerApplications
*/
@Parcelize
data class OtherSellerApplications(
    
    
    @SerializedName("items")
    var items: ArrayList<OtherSellerApplication>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: OptedCompany
*/
@Parcelize
data class OptedCompany(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: OptedInventory
*/
@Parcelize
data class OptedInventory(
    
    
    @SerializedName("opt_type")
    var optType: OptType?=null,
    @SerializedName("items")
    var items: @RawValue Any?=null
    
): Parcelable

/*
    Model: OptType
*/
@Parcelize
data class OptType(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: OptOutInventory
*/
@Parcelize
data class OptOutInventory(
    
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    @SerializedName("company")
    var company: ArrayList<Int>?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    @SerializedName("params")
    var params: String?=null,
    @SerializedName("query")
    var query: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable

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
    @SerializedName("listing_page")
    var listingPage: ListingPageFeature?=null,
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null
    
): Parcelable

/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable

/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable

/*
    Model: ListingPageFeature
*/
@Parcelize
data class ListingPageFeature(
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

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
    var googleMap: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable

/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
): Parcelable

/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable

/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable

/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

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
    var domain: Domain?=null
    
): Parcelable

/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    @SerializedName("source")
    var source: String?=null
    
): Parcelable

/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
    
): Parcelable

/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("enforced_stores")
    var enforcedStores: ArrayList<Int>?=null,
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

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
    
): Parcelable

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
    var phone: InformationPhone?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable

/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("number")
    var number: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("instagram")
    var instagram: Instagram?=null,
    @SerializedName("twitter")
    var twitter: Twitter?=null,
    @SerializedName("pinterest")
    var pinterest: Pinterest?=null,
    @SerializedName("google_plus")
    var googlePlus: GooglePlus?=null,
    @SerializedName("youtube")
    var youtube: Youtube?=null,
    @SerializedName("linked_in")
    var linkedIn: LinkedIn?=null,
    @SerializedName("vimeo")
    var vimeo: Vimeo?=null,
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable

/*
    Model: Instagram
*/
@Parcelize
data class Instagram(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Twitter
*/
@Parcelize
data class Twitter(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Pinterest
*/
@Parcelize
data class Pinterest(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: GooglePlus
*/
@Parcelize
data class GooglePlus(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Youtube
*/
@Parcelize
data class Youtube(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: LinkedIn
*/
@Parcelize
data class LinkedIn(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

/*
    Model: Vimeo
*/
@Parcelize
data class Vimeo(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable

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
    
): Parcelable

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
    var id: String?=null
    
): Parcelable

/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
    
): Parcelable

/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable

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
    var latLong: LatLong?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("city")
    var city: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    
    @SerializedName("page")
    var page: Pagination?=null,
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
    
): Parcelable

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
    
): Parcelable

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
    @SerializedName("auth")
    var auth: Auth?=null,
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
    
): Parcelable

/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable

/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable

/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable

/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    
    @SerializedName("write_key")
    var writeKey: String?=null
    
): Parcelable

/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable

/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable

/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable

/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
    
): Parcelable

/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    
    @SerializedName("public_key")
    var publicKey: String?=null
    
): Parcelable

/*
    Model: Auth
*/
@Parcelize
data class Auth(
    
    
    @SerializedName("google")
    var google: Google?=null,
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("accountkit")
    var accountkit: Accountkit?=null
    
): Parcelable

/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
    
): Parcelable

/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable



/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null
    
): Parcelable

/*
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable

/*
    Model: State
*/
@Parcelize
data class State(
    
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("is_public")
    var isPublic: Boolean?=null
    
): Parcelable

/*
    Model: Validity
*/
@Parcelize
data class Validity(
    
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("key")
    var key: Double?=null
    
): Parcelable

/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: CouponAuthor
*/
@Parcelize
data class CouponAuthor(
    
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable

/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    @SerializedName("value_type")
    var valueType: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("applicable_on")
    var applicableOn: String?=null
    
): Parcelable

/*
    Model: PaymentAllowValue
*/
@Parcelize
data class PaymentAllowValue(
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable

/*
    Model: PaymentModes
*/
@Parcelize
data class PaymentModes(
    
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null
    
): Parcelable

/*
    Model: PaymentCodes
*/
@Parcelize
data class PaymentCodes(
    
    
    @SerializedName("upi")
    var upi: PaymentModes?=null,
    @SerializedName("ps")
    var ps: PaymentModes?=null,
    @SerializedName("wl")
    var wl: PaymentModes?=null,
    @SerializedName("pl")
    var pl: PaymentModes?=null,
    @SerializedName("nb")
    var nb: PaymentModes?=null,
    @SerializedName("qr")
    var qr: PaymentModes?=null,
    @SerializedName("card")
    var card: PaymentModes?=null
    
): Parcelable

/*
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
): Parcelable

/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    @SerializedName("user")
    var user: Int?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("app")
    var app: Int?=null
    
): Parcelable

/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null,
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null
    
): Parcelable

/*
    Model: PostOrder
*/
@Parcelize
data class PostOrder(
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
): Parcelable

/*
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable

/*
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    @SerializedName("payments")
    var payments: PaymentCodes?=null,
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    @SerializedName("price_range")
    var priceRange: PriceRange?=null
    
): Parcelable

/*
    Model: DisplayMetaDict
*/
@Parcelize
data class DisplayMetaDict(
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: DisplayMeta
*/
@Parcelize
data class DisplayMeta(
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null
    
): Parcelable

/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null
    
): Parcelable

/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    @SerializedName("page")
    var page: Pagination?=null,
    @SerializedName("items")
    var items: CouponAdd?=null
    
): Parcelable

/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null
    
): Parcelable

/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    @SerializedName("schedule")
    var schedule: Schedule?=null,
    @SerializedName("archive")
    var archive: Boolean?=null
    
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
    var storeMappingEnabled: Boolean?=null,
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

