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
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
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
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
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
    @SerializedName("shipping")
    var shipping: String?=null,
    @SerializedName("faq")
    var faq: ArrayList<ApplicationLegalFAQ>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
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
    @SerializedName("custom_meta_tags")
    var customMetaTags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("details")
    var details: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable

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
    
): Parcelable

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
    var id: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("seo")
    var seo: SEO?=null,
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null
    
): Parcelable

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
    var title: String?=null
    
): Parcelable

/*
    Model: SEOImage
*/
@Parcelize
data class SEOImage(
    
    
    @SerializedName("url")
    var url: String?=null
    
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
    
    
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("seo")
    var seo: SEO?=null,
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null
    
): Parcelable

/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null,
    @SerializedName("page")
    var page: Pagination?=null
    
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
    var page: ActionPage?=null,
    @SerializedName("popup")
    var popup: ActionPage?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ActionPage
*/
@Parcelize
data class ActionPage(
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

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
    var subNavigation: NavigationReference?=null
    
): Parcelable

/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    
    @SerializedName("data")
    var data: LandingPageSchema?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
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
    var duration: Int?=null,
    @SerializedName("slide_direction")
    var slideDirection: String?=null
    
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
    
    
    @SerializedName("data")
    var data: SlideshowSchema?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    
    @SerializedName("announcements")
    var announcements: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("url")
    var url: String?=null,
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
    var position: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: String?=null
    
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
    var application: String?=null
    
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
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("children")
    var children: ChildrenSchema?=null,
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
    var archived: Boolean?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
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
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    @SerializedName("orientation")
    var orientation: Orientation?=null,
    @SerializedName("version")
    var version: Double?=null,
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
    Model: PageSpecParam
*/
@Parcelize
data class PageSpecParam(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("required")
    var required: Boolean?=null
    
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
    var params: ArrayList<PageSpecParam>?=null,
    @SerializedName("query")
    var query: ArrayList<PageSpecParam>?=null
    
): Parcelable

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
    var schedule: CronSchedule?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("orientation")
    var orientation: String?=null,
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
    @SerializedName("seo")
    var seo: SEO?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

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
    var media: ArrayList<Media>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
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
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("position")
    var position: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: String?=null
    
): Parcelable



/*
    Model: StatsImported
*/
@Parcelize
data class StatsImported(
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: StatsProcessedEmail
*/
@Parcelize
data class StatsProcessedEmail(
    
    
    @SerializedName("success")
    var success: Int?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("suppressed")
    var suppressed: Int?=null
    
): Parcelable

/*
    Model: StatsProcessedSms
*/
@Parcelize
data class StatsProcessedSms(
    
    
    @SerializedName("success")
    var success: Int?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("suppressed")
    var suppressed: Int?=null
    
): Parcelable

/*
    Model: StatsProcessed
*/
@Parcelize
data class StatsProcessed(
    
    
    @SerializedName("email")
    var email: StatsProcessedEmail?=null,
    @SerializedName("sms")
    var sms: StatsProcessedSms?=null
    
): Parcelable

/*
    Model: Stats
*/
@Parcelize
data class Stats(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("imported")
    var imported: @RawValue Any?=null,
    @SerializedName("processed")
    var processed: @RawValue Any?=null
    
): Parcelable

/*
    Model: GetStats
*/
@Parcelize
data class GetStats(
    
    
    @SerializedName("items")
    var items: ArrayList<Stats>?=null
    
): Parcelable

/*
    Model: CampaignReq
*/
@Parcelize
data class CampaignReq(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null
    
): Parcelable

/*
    Model: RecipientHeaders
*/
@Parcelize
data class RecipientHeaders(
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable

/*
    Model: CampaignEmailTemplate
*/
@Parcelize
data class CampaignEmailTemplate(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: CampignEmailProvider
*/
@Parcelize
data class CampignEmailProvider(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("from_name")
    var fromName: String?=null,
    @SerializedName("from_email")
    var fromEmail: String?=null
    
): Parcelable

/*
    Model: CampaignEmail
*/
@Parcelize
data class CampaignEmail(
    
    
    @SerializedName("template")
    var template: CampaignEmailTemplate?=null,
    @SerializedName("provider")
    var provider: CampignEmailProvider?=null
    
): Parcelable

/*
    Model: Campaign
*/
@Parcelize
data class Campaign(
    
    
    @SerializedName("recipient_headers")
    var recipientHeaders: RecipientHeaders?=null,
    @SerializedName("email")
    var email: CampaignEmail?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("datasource")
    var datasource: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: Campaigns
*/
@Parcelize
data class Campaigns(
    
    
    @SerializedName("items")
    var items: ArrayList<Campaign>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: BigqueryHeadersReq
*/
@Parcelize
data class BigqueryHeadersReq(
    
    
    @SerializedName("query")
    var query: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: BigqueryHeadersResHeaders
*/
@Parcelize
data class BigqueryHeadersResHeaders(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: BigqueryHeadersRes
*/
@Parcelize
data class BigqueryHeadersRes(
    
    
    @SerializedName("headers")
    var headers: ArrayList<BigqueryHeadersResHeaders>?=null
    
): Parcelable

/*
    Model: GetNRecordsCsvReq
*/
@Parcelize
data class GetNRecordsCsvReq(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("header")
    var header: Boolean?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: GetNRecordsCsvResItems
*/
@Parcelize
data class GetNRecordsCsvResItems(
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("firstname")
    var firstname: String?=null,
    @SerializedName("lastname")
    var lastname: String?=null,
    @SerializedName("orderid")
    var orderid: String?=null
    
): Parcelable

/*
    Model: GetNRecordsCsvRes
*/
@Parcelize
data class GetNRecordsCsvRes(
    
    
    @SerializedName("items")
    var items: ArrayList<GetNRecordsCsvResItems>?=null
    
): Parcelable

/*
    Model: AudienceReq
*/
@Parcelize
data class AudienceReq(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null
    
): Parcelable

/*
    Model: Audience
*/
@Parcelize
data class Audience(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("headers")
    var headers: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file_url")
    var fileUrl: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("records_count")
    var recordsCount: Int?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: Audiences
*/
@Parcelize
data class Audiences(
    
    
    @SerializedName("items")
    var items: ArrayList<Audience>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: EmailProviderReqFrom
*/
@Parcelize
data class EmailProviderReqFrom(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: EmailProviderReq
*/
@Parcelize
data class EmailProviderReq(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("from")
    var from: ArrayList<EmailProviderReqFrom>?=null
    
): Parcelable

/*
    Model: EmailProvider
*/
@Parcelize
data class EmailProvider(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("from")
    var from: ArrayList<EmailProviderReqFrom>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: EmailProviders
*/
@Parcelize
data class EmailProviders(
    
    
    @SerializedName("items")
    var items: ArrayList<EmailProvider>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: EmailTemplateDeleteSuccessRes
*/
@Parcelize
data class EmailTemplateDeleteSuccessRes(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: EmailTemplateDeleteFailureRes
*/
@Parcelize
data class EmailTemplateDeleteFailureRes(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: EmailTemplateKeys
*/
@Parcelize
data class EmailTemplateKeys(
    
    
    @SerializedName("to")
    var to: String?=null,
    @SerializedName("cc")
    var cc: String?=null,
    @SerializedName("bcc")
    var bcc: String?=null
    
): Parcelable

/*
    Model: EmailTemplateHeaders
*/
@Parcelize
data class EmailTemplateHeaders(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: EmailTemplateReq
*/
@Parcelize
data class EmailTemplateReq(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("keys")
    var keys: EmailTemplateKeys?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("static_to")
    var staticTo: ArrayList<String>?=null,
    @SerializedName("static_cc")
    var staticCc: ArrayList<String>?=null,
    @SerializedName("static_bcc")
    var staticBcc: ArrayList<String>?=null,
    @SerializedName("reply_to")
    var replyTo: String?=null,
    @SerializedName("headers")
    var headers: ArrayList<EmailTemplateHeaders>?=null,
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    @SerializedName("html")
    var html: TemplateAndType?=null,
    @SerializedName("text")
    var text: TemplateAndType?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null
    
): Parcelable

/*
    Model: TemplateAndType
*/
@Parcelize
data class TemplateAndType(
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    @SerializedName("template")
    var template: String?=null
    
): Parcelable

/*
    Model: EmailTemplateRes
*/
@Parcelize
data class EmailTemplateRes(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("static_to")
    var staticTo: ArrayList<String>?=null,
    @SerializedName("static_cc")
    var staticCc: ArrayList<String>?=null,
    @SerializedName("static_bcc")
    var staticBcc: ArrayList<String>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("keys")
    var keys: EmailTemplateKeys?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("reply_to")
    var replyTo: String?=null,
    @SerializedName("headers")
    var headers: ArrayList<EmailTemplateHeaders>?=null,
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    @SerializedName("html")
    var html: TemplateAndType?=null,
    @SerializedName("text")
    var text: TemplateAndType?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: EmailTemplate
*/
@Parcelize
data class EmailTemplate(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("static_to")
    var staticTo: @RawValue ArrayList<Any>?=null,
    @SerializedName("static_cc")
    var staticCc: @RawValue ArrayList<Any>?=null,
    @SerializedName("static_bcc")
    var staticBcc: @RawValue ArrayList<Any>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("from_name")
    var fromName: String?=null,
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    @SerializedName("html")
    var html: TemplateAndType?=null,
    @SerializedName("text")
    var text: TemplateAndType?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: SystemEmailTemplate
*/
@Parcelize
data class SystemEmailTemplate(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("static_to")
    var staticTo: @RawValue ArrayList<Any>?=null,
    @SerializedName("static_cc")
    var staticCc: @RawValue ArrayList<Any>?=null,
    @SerializedName("static_bcc")
    var staticBcc: @RawValue ArrayList<Any>?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("from_name")
    var fromName: String?=null,
    @SerializedName("subject")
    var subject: TemplateAndType?=null,
    @SerializedName("html")
    var html: TemplateAndType?=null,
    @SerializedName("text")
    var text: TemplateAndType?=null,
    @SerializedName("headers")
    var headers: @RawValue ArrayList<Any>?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: EmailTemplates
*/
@Parcelize
data class EmailTemplates(
    
    
    @SerializedName("items")
    var items: ArrayList<EmailTemplate>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: SystemEmailTemplates
*/
@Parcelize
data class SystemEmailTemplates(
    
    
    @SerializedName("items")
    var items: ArrayList<SystemEmailTemplate>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: EventSubscriptionTemplateSms
*/
@Parcelize
data class EventSubscriptionTemplateSms(
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    @SerializedName("template")
    var template: String?=null
    
): Parcelable

/*
    Model: EventSubscriptionTemplateEmail
*/
@Parcelize
data class EventSubscriptionTemplateEmail(
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    @SerializedName("template")
    var template: String?=null
    
): Parcelable

/*
    Model: EventSubscriptionTemplate
*/
@Parcelize
data class EventSubscriptionTemplate(
    
    
    @SerializedName("sms")
    var sms: EventSubscriptionTemplateSms?=null,
    @SerializedName("email")
    var email: EventSubscriptionTemplateEmail?=null
    
): Parcelable

/*
    Model: EventSubscription
*/
@Parcelize
data class EventSubscription(
    
    
    @SerializedName("template")
    var template: EventSubscriptionTemplate?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("event")
    var event: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: EventSubscriptions
*/
@Parcelize
data class EventSubscriptions(
    
    
    @SerializedName("items")
    var items: ArrayList<EventSubscription>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: TriggerJobResponse
*/
@Parcelize
data class TriggerJobResponse(
    
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable

/*
    Model: TriggerJobRequest
*/
@Parcelize
data class TriggerJobRequest(
    
    
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable

/*
    Model: Job
*/
@Parcelize
data class Job(
    
    
    @SerializedName("completed")
    var completed: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("campaign")
    var campaign: String?=null,
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
    Model: Jobs
*/
@Parcelize
data class Jobs(
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<Any>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: JobLog
*/
@Parcelize
data class JobLog(
    
    
    @SerializedName("imported")
    var imported: @RawValue Any?=null,
    @SerializedName("processed")
    var processed: @RawValue Any?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("job")
    var job: String?=null,
    @SerializedName("campaign")
    var campaign: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: JobLogs
*/
@Parcelize
data class JobLogs(
    
    
    @SerializedName("items")
    var items: ArrayList<JobLog>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: LogEmail
*/
@Parcelize
data class LogEmail(
    
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable

/*
    Model: LogPushnotification
*/
@Parcelize
data class LogPushnotification(
    
    
    @SerializedName("pushtokens")
    var pushtokens: ArrayList<String>?=null
    
): Parcelable

/*
    Model: LogMeta
*/
@Parcelize
data class LogMeta(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("offset")
    var offset: String?=null,
    @SerializedName("partition")
    var partition: String?=null,
    @SerializedName("topic")
    var topic: String?=null
    
): Parcelable

/*
    Model: Log
*/
@Parcelize
data class Log(
    
    
    @SerializedName("email")
    var email: LogEmail?=null,
    @SerializedName("pushnotification")
    var pushnotification: LogPushnotification?=null,
    @SerializedName("meta")
    var meta: LogMeta?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("service")
    var service: String?=null,
    @SerializedName("step")
    var step: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("data")
    var data: @RawValue Any?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable

/*
    Model: Logs
*/
@Parcelize
data class Logs(
    
    
    @SerializedName("items")
    var items: ArrayList<Log>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    @SerializedName("push_token")
    var pushToken: String?=null,
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null
    
): Parcelable

/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    @SerializedName("push_token")
    var pushToken: String?=null,
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("expired_at")
    var expiredAt: String?=null
    
): Parcelable

/*
    Model: SmsProviderReq
*/
@Parcelize
data class SmsProviderReq(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("authkey")
    var authkey: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable

/*
    Model: SmsProvider
*/
@Parcelize
data class SmsProvider(
    
    
    @SerializedName("rpt")
    var rpt: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("authkey")
    var authkey: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: SmsProviders
*/
@Parcelize
data class SmsProviders(
    
    
    @SerializedName("items")
    var items: ArrayList<SmsProvider>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: SmsTemplateDeleteSuccessRes
*/
@Parcelize
data class SmsTemplateDeleteSuccessRes(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: SmsTemplateDeleteFailureRes
*/
@Parcelize
data class SmsTemplateDeleteFailureRes(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: SmsTemplateMessage
*/
@Parcelize
data class SmsTemplateMessage(
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    @SerializedName("template")
    var template: String?=null
    
): Parcelable

/*
    Model: SmsTemplateReq
*/
@Parcelize
data class SmsTemplateReq(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    @SerializedName("template_variables")
    var templateVariables: @RawValue Any?=null,
    @SerializedName("attachments")
    var attachments: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null
    
): Parcelable

/*
    Model: SmsTemplateRes
*/
@Parcelize
data class SmsTemplateRes(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    @SerializedName("template_variables")
    var templateVariables: @RawValue Any?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: SmsTemplate
*/
@Parcelize
data class SmsTemplate(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    @SerializedName("template_variables")
    var templateVariables: @RawValue Any?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: SystemSmsTemplate
*/
@Parcelize
data class SystemSmsTemplate(
    
    
    @SerializedName("is_system")
    var isSystem: Boolean?=null,
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<Any>?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("message")
    var message: SmsTemplateMessage?=null,
    @SerializedName("template_variables")
    var templateVariables: @RawValue Any?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable

/*
    Model: SmsTemplates
*/
@Parcelize
data class SmsTemplates(
    
    
    @SerializedName("items")
    var items: ArrayList<SmsTemplate>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: SystemSmsTemplates
*/
@Parcelize
data class SystemSmsTemplates(
    
    
    @SerializedName("items")
    var items: ArrayList<SystemSmsTemplate>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: Notification
*/
@Parcelize
data class Notification(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("body")
    var body: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("deeplink")
    var deeplink: String?=null,
    @SerializedName("click_action")
    var clickAction: String?=null
    
): Parcelable

/*
    Model: SystemNotificationUser
*/
@Parcelize
data class SystemNotificationUser(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: SystemNotificationSettings
*/
@Parcelize
data class SystemNotificationSettings(
    
    
    @SerializedName("sound")
    var sound: Boolean?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("time_to_live")
    var timeToLive: String?=null
    
): Parcelable

/*
    Model: SystemNotification
*/
@Parcelize
data class SystemNotification(
    
    
    @SerializedName("notification")
    var notification: Notification?=null,
    @SerializedName("user")
    var user: SystemNotificationUser?=null,
    @SerializedName("settings")
    var settings: SystemNotificationUser?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("group")
    var group: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable

/*
    Model: SystemNotificationsPage
*/
@Parcelize
data class SystemNotificationsPage(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable

/*
    Model: SystemNotifications
*/
@Parcelize
data class SystemNotifications(
    
    
    @SerializedName("items")
    var items: ArrayList<SystemNotification>?=null,
    @SerializedName("last_read_anchor")
    var lastReadAnchor: Int?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable



/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable

/*
    Model: PaymentGatewayConfigRequest
*/
@Parcelize
data class PaymentGatewayConfigRequest(
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: PaymentGatewayConfig?=null,
    @SerializedName("app_id")
    var appId: String?=null
    
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
    
    
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null
    
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null
    
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
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable

/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable

/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transfer_type")
    var transferType: String?=null,
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created")
    var created: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
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
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
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
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
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
    var dateMeta: FailOrderDateMeta?=null,
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
    var identifier: LineItemsArticleIdentifier?=null,
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
    Model: FailOrderDateMeta
*/
@Parcelize
data class FailOrderDateMeta(
    
    
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
    Model: LineItemsArticleIdentifier
*/
@Parcelize
data class LineItemsArticleIdentifier(
    
    
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
    Model: DeleteResponse
*/
@Parcelize
data class DeleteResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable

/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable

/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("next_page_id")
    var nextPageId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable

/*
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: GetSearchWordsData?=null
    
): Parcelable

/*
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null
    
): Parcelable

/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    
    @SerializedName("page")
    var page: AutocompletePageAction?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("action")
    var action: AutocompleteAction?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable

/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null
    
): Parcelable

/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null
    
): Parcelable

/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null
    
): Parcelable

/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null
    
): Parcelable

/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
    
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null,
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable

/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    @SerializedName("price")
    var price: Price?=null,
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null
    
): Parcelable

/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("choice")
    var choice: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null,
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable

/*
    Model: Guide
*/
@Parcelize
data class Guide(
    
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable

/*
    Model: ValidateSizeGuide
*/
@Parcelize
data class ValidateSizeGuide(
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("guide")
    var guide: Guide?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
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
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null,
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: MetaDataListingSortMetaResponse
*/
@Parcelize
data class MetaDataListingSortMetaResponse(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable

/*
    Model: MetaDataListingSortResponse
*/
@Parcelize
data class MetaDataListingSortResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingSortMetaResponse>?=null
    
): Parcelable

/*
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: MetaDataListingFilterResponse
*/
@Parcelize
data class MetaDataListingFilterResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingFilterMetaResponse>?=null
    
): Parcelable

/*
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null,
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null
    
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable

/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationProductSimilar
*/
@Parcelize
data class ConfigurationProductSimilar(
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("size")
    var size: ProductSize?=null,
    @SerializedName("display_type")
    var displayType: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationProductVariant
*/
@Parcelize
data class ConfigurationProductVariant(
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductVariantConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null,
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null
    
): Parcelable

/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    @SerializedName("end")
    var end: Double?=null,
    @SerializedName("start")
    var start: Double?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sort")
    var sort: String?=null,
    @SerializedName("condition")
    var condition: String?=null,
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null,
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null
    
): Parcelable

/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null,
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null
    
): Parcelable

/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null
    
): Parcelable

/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    @SerializedName("listing")
    var listing: ConfigurationListing?=null
    
): Parcelable

/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null
    
): Parcelable

/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null,
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null
    
): Parcelable

/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("data")
    var data: EntityConfiguration?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("kind")
    var kind: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null,
    @SerializedName("key")
    var key: ProductFiltersKey?=null
    
): Parcelable

/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    
    @SerializedName("landscape")
    var landscape: CollectionImage?=null,
    @SerializedName("portrait")
    var portrait: CollectionImage?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("sort_on")
    var sortOn: String?=null,
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    @SerializedName("landscape")
    var landscape: BannerImage?=null,
    @SerializedName("portrait")
    var portrait: BannerImage?=null
    
): Parcelable

/*
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: BannerImage?=null
    
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null,
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null
    
): Parcelable

/*
    Model: Media1
*/
@Parcelize
data class Media1(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    
    @SerializedName("page")
    var page: ProductListingActionPage?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("logo")
    var logo: Media1?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: Media1?=null
    
): Parcelable

/*
    Model: CollectionItemRequest
*/
@Parcelize
data class CollectionItemRequest(
    
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable

/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    @SerializedName("effective")
    var effective: Price1?=null,
    @SerializedName("marked")
    var marked: Price1?=null
    
): Parcelable

/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("discount")
    var discount: String?=null
    
): Parcelable

/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable

/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null,
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    @SerializedName("total_sizes")
    var totalSizes: Int?=null,
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null
    
): Parcelable

/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    @SerializedName("item")
    var item: CatalogInsightItem?=null
    
): Parcelable

/*
    Model: CrossSellingData
*/
@Parcelize
data class CrossSellingData(
    
    
    @SerializedName("products")
    var products: Int?=null,
    @SerializedName("articles")
    var articles: Int?=null
    
): Parcelable

/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    @SerializedName("data")
    var data: CrossSellingData?=null
    
): Parcelable

/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: Int?=null,
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null
    
): Parcelable

/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable

/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("total_article")
    var totalArticle: Int?=null
    
): Parcelable

/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null
    
): Parcelable

/*
    Model: OptinCompanyMetrics
*/
@Parcelize
data class OptinCompanyMetrics(
    
    
    @SerializedName("brand")
    var brand: Int?=null,
    @SerializedName("store")
    var store: Int?=null,
    @SerializedName("company")
    var company: String?=null
    
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
    
): Parcelable

/*
    Model: BasePage
*/
@Parcelize
data class BasePage(
    
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable

/*
    Model: MultipleCommon
*/
@Parcelize
data class MultipleCommon(
    
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable

/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    @SerializedName("page")
    var page: BasePage?=null,
    @SerializedName("items")
    var items: MultipleCommon?=null
    
): Parcelable

/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: BasePage1
*/
@Parcelize
data class BasePage1(
    
    
    @SerializedName("next_page_id")
    var nextPageId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable

/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable

/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable

/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    @SerializedName("page")
    var page: BasePage1?=null,
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null
    
): Parcelable

/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("status")
    var status: Int?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable

/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null
    
): Parcelable

/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    @SerializedName("page")
    var page: BasePage?=null,
    @SerializedName("items")
    var items: ProductTemplate?=null
    
): Parcelable

/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    @SerializedName("data")
    var data: MultipleCommon?=null
    
): Parcelable

/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: MultipleCommon?=null
    
): Parcelable

/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null
    
): Parcelable

/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: HSNData?=null
    
): Parcelable

/*
    Model: ProductConfligurationDownloads
*/
@Parcelize
data class ProductConfligurationDownloads(
    
    
    @SerializedName("multivalue")
    var multivalue: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<MultipleCommon>?=null
    
): Parcelable

/*
    Model: Media2
*/
@Parcelize
data class Media2(
    
    
    @SerializedName("landscape")
    var landscape: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("portrait")
    var portrait: String?=null
    
): Parcelable

/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    @SerializedName("catalog_id")
    var catalogId: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null,
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null,
    @SerializedName("google")
    var google: CategoryMappingValues?=null
    
): Parcelable

/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    @SerializedName("l2")
    var l2: Int?=null,
    @SerializedName("department")
    var department: Int?=null,
    @SerializedName("l1")
    var l1: Int?=null
    
): Parcelable

/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("level")
    var level: Int?=null,
    @SerializedName("media")
    var media: Media2?=null,
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable

/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    @SerializedName("page")
    var page: BasePage1?=null,
    @SerializedName("items")
    var items: ArrayList<Category>?=null
    
): Parcelable

/*
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable

/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null
    
): Parcelable

/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: OrderQuantity
*/
@Parcelize
data class OrderQuantity(
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("maximum")
    var maximum: Int?=null,
    @SerializedName("minimum")
    var minimum: Int?=null
    
): Parcelable

/*
    Model: TeaserTag
*/
@Parcelize
data class TeaserTag(
    
    
    @SerializedName("tag")
    var tag: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("time")
    var time: Int?=null
    
): Parcelable

/*
    Model: ProductCreateUpdate
*/
@Parcelize
data class ProductCreateUpdate(
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    @SerializedName("change_request_id")
    var changeRequestId: String?=null,
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    @SerializedName("trader")
    var trader: Trader?=null,
    @SerializedName("moq")
    var moq: OrderQuantity?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("requester")
    var requester: String?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("trader_type")
    var traderType: String?=null,
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null
    
): Parcelable

/*
    Model: PageData
*/
@Parcelize
data class PageData(
    
    
    @SerializedName("current")
    var current: String?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable

/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable

/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    
    @SerializedName("pattern")
    var pattern: String?=null,
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    @SerializedName("product_fit")
    var productFit: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("essential")
    var essential: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    @SerializedName("material")
    var material: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("gender")
    var gender: ArrayList<String>?=null,
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    @SerializedName("meta_nature")
    var metaNature: String?=null,
    @SerializedName("sleeve_length")
    var sleeveLength: String?=null,
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("primary_material")
    var primaryMaterial: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("neck_type")
    var neckType: String?=null
    
): Parcelable

/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable

/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Logo?=null
    
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("highlights")
    var highlights: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    @SerializedName("all_sizes")
    var allSizes: ArrayList<String>?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("brand")
    var brand: Brand?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ArrayList<Product>?=null
    
): Parcelable

/*
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    
    @SerializedName("valid")
    var valid: Boolean?=null
    
): Parcelable

/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null
    
): Parcelable

/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("username")
    var username: String?=null
    
): Parcelable

/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("template")
    var template: ProductTemplate?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null
    
): Parcelable

/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ProductBulkRequest?=null
    
): Parcelable

/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("batch_id")
    var batchId: String?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: NestedTags
*/
@Parcelize
data class NestedTags(
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ProductTagsViewResponse
*/
@Parcelize
data class ProductTagsViewResponse(
    
    
    @SerializedName("items")
    var items: NestedTags?=null
    
): Parcelable

/*
    Model: ProductBulkAssets
*/
@Parcelize
data class ProductBulkAssets(
    
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable

/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    @SerializedName("failed")
    var failed: Int?=null,
    @SerializedName("retry")
    var retry: Int?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("succeed")
    var succeed: Int?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    @SerializedName("cancelled")
    var cancelled: Int?=null
    
): Parcelable

/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    @SerializedName("page")
    var page: PageData?=null,
    @SerializedName("items")
    var items: ArrayList<Items>?=null
    
): Parcelable

/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_uid")
    var brandUid: Int?=null
    
): Parcelable

/*
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    @SerializedName("gtin_type")
    var gtinType: String?=null
    
): Parcelable

/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    @SerializedName("size")
    var size: String?=null
    
): Parcelable

/*
    Model: SizeDistribution
*/
@Parcelize
data class SizeDistribution(
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable

/*
    Model: InventorySet
*/
@Parcelize
data class InventorySet(
    
    
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable

/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price")
    var price: Double?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null
    
): Parcelable

/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    
    @SerializedName("item")
    var item: ItemQuery?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null
    
): Parcelable

/*
    Model: InventoryRequest1
*/
@Parcelize
data class InventoryRequest1(
    
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("search")
    var search: String?=null,
    @SerializedName("size")
    var size: String?=null
    
): Parcelable

/*
    Model: CommonResponse
*/
@Parcelize
data class CommonResponse(
    
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable

/*
    Model: BulkRequestGet
*/
@Parcelize
data class BulkRequestGet(
    
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    @SerializedName("page_no")
    var pageNo: Int?=null,
    @SerializedName("start_date")
    var startDate: String?=null,
    @SerializedName("end_date")
    var endDate: String?=null,
    @SerializedName("template_tag")
    var templateTag: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("search")
    var search: String?=null
    
): Parcelable

/*
    Model: Size1
*/
@Parcelize
data class Size1(
    
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    @SerializedName("identifiers")
    var identifiers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    @SerializedName("item_length")
    var itemLength: Double?=null,
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    @SerializedName("price")
    var price: Double?=null,
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("set")
    var set: InventorySet?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null
    
): Parcelable

/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<Size1>?=null,
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable

/*
    Model: InventoryExportRequest
*/
@Parcelize
data class InventoryExportRequest(
    
    
    @SerializedName("brand")
    var brand: ArrayList<Int>?=null,
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable

/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    @SerializedName("task_id")
    var taskId: String?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    @SerializedName("completed_on")
    var completedOn: String?=null,
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable

/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable

/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null
    
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
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null
    
): Parcelable

/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null
    
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
    Model: CompanyStoreSerializerRequest
*/
@Parcelize
data class CompanyStoreSerializerRequest(
    
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("referral_info")
    var referralInfo: ReferralInfo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address")
    var address: CompanyAddress?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("document")
    var document: Document?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null
    
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
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null
    
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
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("business_info")
    var businessInfo: String?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo1?=null
    
): Parcelable

/*
    Model: DocumentsObj
*/
@Parcelize
data class DocumentsObj(
    
    
    @SerializedName("verified")
    var verified: Int?=null,
    @SerializedName("pending")
    var pending: Int?=null
    
): Parcelable

/*
    Model: MetricsSerializer
*/
@Parcelize
data class MetricsSerializer(
    
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    @SerializedName("product")
    var product: DocumentsObj?=null,
    @SerializedName("store")
    var store: DocumentsObj?=null
    
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
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable

/*
    Model: GetBrandResponseSerializer
*/
@Parcelize
data class GetBrandResponseSerializer(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null
    
): Parcelable

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company_id")
    var companyId: Int?=null,
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
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
    
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null
    
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
    Model: GetAddressSerializer1
*/
@Parcelize
data class GetAddressSerializer1(
    
    
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("city")
    var city: String?=null
    
): Parcelable

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
    
): Parcelable

/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null,
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null
    
): Parcelable

/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("mobile_no")
    var mobileNo: PhoneNumber?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("company")
    var company: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("address")
    var address: GetAddressSerializer1?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null
    
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
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("company_type")
    var companyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("business_type")
    var businessType: String?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null
    
): Parcelable

/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    @SerializedName("store_type")
    var storeType: String?=null,
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
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
    Model: Page
*/
@Parcelize
data class Page(
    
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("type")
    var type: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null
    
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
    Model: Attribution
*/
@Parcelize
data class Attribution(
    
    
    @SerializedName("campaign_cookie_expiry")
    var campaignCookieExpiry: String?=null
    
): Parcelable

/*
    Model: SocialMediaTags
*/
@Parcelize
data class SocialMediaTags(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("image")
    var image: String?=null
    
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
    var active: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    @SerializedName("campaign")
    var campaign: Campaign?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
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
    @SerializedName("app_redirect")
    var appRedirect: Boolean?=null,
    @SerializedName("fallback")
    var fallback: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    @SerializedName("campaign")
    var campaign: Campaign?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
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
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
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
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null,
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    @SerializedName("types")
    var types: ArrayList<String>?=null
    
): Parcelable

/*
    Model: PaymentCodes
*/
@Parcelize
data class PaymentCodes(
    
    
    @SerializedName("ps")
    var ps: PaymentModes?=null,
    @SerializedName("wl")
    var wl: PaymentModes?=null,
    @SerializedName("qr")
    var qr: PaymentModes?=null,
    @SerializedName("upi")
    var upi: PaymentModes?=null,
    @SerializedName("card")
    var card: PaymentModes?=null,
    @SerializedName("nb")
    var nb: PaymentModes?=null,
    @SerializedName("pl")
    var pl: PaymentModes?=null
    
): Parcelable

/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    @SerializedName("app")
    var app: Int?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("user")
    var user: Int?=null
    
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
    
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    @SerializedName("payments")
    var payments: PaymentCodes?=null,
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    @SerializedName("price_range")
    var priceRange: PriceRange?=null
    
): Parcelable

/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    @SerializedName("value_type")
    var valueType: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    @SerializedName("calculate_on")
    var calculateOn: String?=null
    
): Parcelable

/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    @SerializedName("end")
    var end: String?=null,
    @SerializedName("cron")
    var cron: String?=null,
    @SerializedName("start")
    var start: String?=null,
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable

/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
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
    Model: CouponAction
*/
@Parcelize
data class CouponAction(
    
    
    @SerializedName("txn_mode")
    var txnMode: String?=null,
    @SerializedName("action_date")
    var actionDate: String?=null
    
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
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null
    
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
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable

/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("key")
    var key: Double?=null,
    @SerializedName("max")
    var max: Double?=null
    
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
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("action")
    var action: CouponAction?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null
    
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
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    @SerializedName("validity")
    var validity: Validity?=null,
    @SerializedName("action")
    var action: CouponAction?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    @SerializedName("state")
    var state: State?=null,
    @SerializedName("validation")
    var validation: Validation?=null,
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    @SerializedName("author")
    var author: CouponAuthor?=null
    
): Parcelable

/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("schedule")
    var schedule: CouponSchedule?=null
    
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
    Model: AbandonCartsList
*/
@Parcelize
data class AbandonCartsList(
    
    
    @SerializedName("items")
    var items: ArrayList<AbandonCartsDetail>?=null,
    @SerializedName("cart_total")
    var cartTotal: String?=null,
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: GetLogsListRes
*/
@Parcelize
data class GetLogsListRes(
    
    
    @SerializedName("items")
    var items: ArrayList<MkpLogsResp>?=null,
    @SerializedName("page")
    var page: Page?=null
    
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
    var page: Page?=null
    
): Parcelable

