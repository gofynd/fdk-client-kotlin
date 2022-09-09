package com.sdk.platform

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName


/*
    Model: ApplicationResponse
*/
@Parcelize
data class ApplicationResponse(
    
    
    
    @SerializedName("application")
    var application: Application?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BadRequest
*/
@Parcelize
data class BadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LocationDefaultLanguage
*/
@Parcelize
data class LocationDefaultLanguage(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LocationDefaultCurrency
*/
@Parcelize
data class LocationDefaultCurrency(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationCountry
*/
@Parcelize
data class LocationCountry(
    
    
    
    @SerializedName("capital")
    var capital: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("parent")
    var parent: String?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: LocationDefaultCurrency?=null,
    
    @SerializedName("default_language")
    var defaultLanguage: LocationDefaultLanguage?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Locations
*/
@Parcelize
data class Locations(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}




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
    Model: TicketHistoryList
*/
@Parcelize
data class TicketHistoryList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TicketHistory>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomFormList
*/
@Parcelize
data class CustomFormList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomForm>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    
    @SerializedName("success_message")
    var successMessage: String?=null,
    
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditTicketPayload
*/
@Parcelize
data class EditTicketPayload(
    
    
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("sub_category")
    var subCategory: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("assigned_to")
    var assignedTo: AgentChangePayload?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AgentChangePayload
*/
@Parcelize
data class AgentChangePayload(
    
    
    
    @SerializedName("agent_id")
    var agentId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateVideoRoomResponse
*/
@Parcelize
data class CreateVideoRoomResponse(
    
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CloseVideoRoomResponse
*/
@Parcelize
data class CloseVideoRoomResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateVideoRoomPayload
*/
@Parcelize
data class CreateVideoRoomPayload(
    
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null,
    
    @SerializedName("notify")
    var notify: ArrayList<NotifyUser>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: NotifyUser
*/
@Parcelize
data class NotifyUser(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: HistoryTypeEnum?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    
    
    @SerializedName("response")
    var response: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    
    
    @SerializedName("access_token")
    var accessToken: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    
    
    @SerializedName("participants")
    var participants: ArrayList<Participant>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("ticket")
    var ticket: Ticket?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TicketContext
*/
@Parcelize
data class TicketContext(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var type: TicketAssetTypeEnum?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketContent
*/
@Parcelize
data class TicketContent(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    private var description_b64: String?=null,
    
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable {
    
    
    
    
    
    var description : String
    get(){
        try{
            return String(Base64.decode(description_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return description_b64 ?: ""
        }
    }
    set(value){
        description_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    
    
}


/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    
    
    @SerializedName("key")
    var key: PriorityEnum?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    var form: CustomForm?=null,
    
    @SerializedName("sub_categories")
    var subCategories: ArrayList<TicketSubCategory>?=null,
    
    @SerializedName("feedback_form")
    var feedbackForm: TicketFeedbackForm?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketSubCategory
*/
@Parcelize
data class TicketSubCategory(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedbackForm
*/
@Parcelize
data class TicketFeedbackForm(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display")
    var display: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedbackList
*/
@Parcelize
data class TicketFeedbackList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TicketFeedback>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TicketFeedbackPayload
*/
@Parcelize
data class TicketFeedbackPayload(
    
    
    
    @SerializedName("form_response")
    var formResponse: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("priority")
    var priority: Priority?=null,
    
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
    
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationDetails
*/
@Parcelize
data class CommunicationDetails(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SupportGeneralConfig
*/
@Parcelize
data class SupportGeneralConfig(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("support_email")
    var supportEmail: CommunicationDetails?=null,
    
    @SerializedName("support_phone")
    var supportPhone: CommunicationDetails?=null,
    
    @SerializedName("support_faq")
    var supportFaq: CommunicationDetails?=null,
    
    @SerializedName("show_communication_info")
    var showCommunicationInfo: Boolean?=null,
    
    @SerializedName("show_support_dris")
    var showSupportDris: Boolean?=null,
    
    @SerializedName("integration")
    var integration: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FeedbackResponseItem
*/
@Parcelize
data class FeedbackResponseItem(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedback
*/
@Parcelize
data class TicketFeedback(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("response")
    var response: ArrayList<FeedbackResponseItem>?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("sub_category")
    var subCategory: TicketSubCategory?=null,
    
    @SerializedName("source")
    var source: TicketSourceEnum?=null,
    
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
    
    @SerializedName("is_feedback_pending")
    var isFeedbackPending: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: Activity
*/
@Parcelize
data class Activity(
    
    
    
    @SerializedName("current_state")
    var currentState: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("document_id")
    var documentId: String?=null,
    
    @SerializedName("previous_state")
    var previousState: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ActivityDump
*/
@Parcelize
data class ActivityDump(
    
    
    
    @SerializedName("activity")
    var activity: Activity?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBy?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddMediaListRequest
*/
@Parcelize
data class AddMediaListRequest(
    
    
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("media_list")
    var mediaList: ArrayList<AddMediaRequest>?=null,
    
    @SerializedName("ref_id")
    var refId: String?=null,
    
    @SerializedName("ref_type")
    var refType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddMediaRequest
*/
@Parcelize
data class AddMediaRequest(
    
    
    
    @SerializedName("cloud_id")
    var cloudId: String?=null,
    
    @SerializedName("cloud_name")
    var cloudName: String?=null,
    
    @SerializedName("cloud_provider")
    var cloudProvider: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("media_url")
    var mediaUrl: String?=null,
    
    @SerializedName("ref_id")
    var refId: String?=null,
    
    @SerializedName("ref_type")
    var refType: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("thumbnail_url")
    var thumbnailUrl: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApproveRequest
*/
@Parcelize
data class ApproveRequest(
    
    
    
    @SerializedName("approve")
    var approve: Boolean?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Attribute
*/
@Parcelize
data class Attribute(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagMeta>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeObject
*/
@Parcelize
data class AttributeObject(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagMeta>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CursorGetResponse
*/
@Parcelize
data class CursorGetResponse(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: DeviceMeta
*/
@Parcelize
data class DeviceMeta(
    
    
    
    @SerializedName("app_version")
    var appVersion: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Entity
*/
@Parcelize
data class Entity(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityRequest
*/
@Parcelize
data class EntityRequest(
    
    
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FeedbackAttributes
*/
@Parcelize
data class FeedbackAttributes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Attribute>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FeedbackError
*/
@Parcelize
data class FeedbackError(
    
    
    
    @SerializedName("code")
    var code: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FeedbackState
*/
@Parcelize
data class FeedbackState(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("media")
    var media: String?=null,
    
    @SerializedName("qna")
    var qna: Boolean?=null,
    
    @SerializedName("rating")
    var rating: Boolean?=null,
    
    @SerializedName("review")
    var review: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetResponse
*/
@Parcelize
data class GetResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetReviewResponse
*/
@Parcelize
data class GetReviewResponse(
    
    
    
    @SerializedName("facets")
    var facets: ArrayList<ReviewFacet>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<SortMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InsertResponse
*/
@Parcelize
data class InsertResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: MediaMeta
*/
@Parcelize
data class MediaMeta(
    
    
    
    @SerializedName("max_count")
    var maxCount: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: MediaMetaRequest
*/
@Parcelize
data class MediaMetaRequest(
    
    
    
    @SerializedName("max_count")
    var maxCount: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: NumberGetResponse
*/
@Parcelize
data class NumberGetResponse(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageCursor
*/
@Parcelize
data class PageCursor(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PageNumber
*/
@Parcelize
data class PageNumber(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Rating
*/
@Parcelize
data class Rating(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<Attribute>?=null,
    
    @SerializedName("attributes_slugs")
    var attributesSlugs: ArrayList<String>?=null,
    
    @SerializedName("ui")
    var ui: UI?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: RatingRequest
*/
@Parcelize
data class RatingRequest(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("ui")
    var ui: UI?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReportAbuseRequest
*/
@Parcelize
data class ReportAbuseRequest(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Review
*/
@Parcelize
data class Review(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("image_meta")
    var imageMeta: MediaMeta?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("video_meta")
    var videoMeta: MediaMeta?=null,
    
    @SerializedName("vote_allowed")
    var voteAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReviewFacet
*/
@Parcelize
data class ReviewFacet(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("selected")
    var selected: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReviewRequest
*/
@Parcelize
data class ReviewRequest(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("image_meta")
    var imageMeta: MediaMetaRequest?=null,
    
    @SerializedName("is_vote_allowed")
    var isVoteAllowed: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("video_meta")
    var videoMeta: MediaMetaRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SaveAttributeRequest
*/
@Parcelize
data class SaveAttributeRequest(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SortMethod
*/
@Parcelize
data class SortMethod(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("selected")
    var selected: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TagMeta
*/
@Parcelize
data class TagMeta(
    
    
    
    @SerializedName("media")
    var media: ArrayList<MediaMeta>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Template
*/
@Parcelize
data class Template(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("entity")
    var entity: Entity?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rating")
    var rating: Rating?=null,
    
    @SerializedName("review")
    var review: Review?=null,
    
    @SerializedName("state")
    var state: FeedbackState?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagMeta>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplateGetResponse
*/
@Parcelize
data class TemplateGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Template>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TemplateRequest
*/
@Parcelize
data class TemplateRequest(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("enable_media_type")
    var enableMediaType: String?=null,
    
    @SerializedName("enable_qna")
    var enableQna: Boolean?=null,
    
    @SerializedName("enable_rating")
    var enableRating: Boolean?=null,
    
    @SerializedName("enable_review")
    var enableReview: Boolean?=null,
    
    @SerializedName("entity")
    var entity: EntityRequest?=null,
    
    @SerializedName("rating")
    var rating: RatingRequest?=null,
    
    @SerializedName("review")
    var review: ReviewRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplateRequestList
*/
@Parcelize
data class TemplateRequestList(
    
    
    
    @SerializedName("template_list")
    var templateList: ArrayList<TemplateRequest>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UI
*/
@Parcelize
data class UI(
    
    
    
    @SerializedName("feedback_question")
    var feedbackQuestion: ArrayList<String>?=null,
    
    @SerializedName("icon")
    var icon: UIIcon?=null,
    
    @SerializedName("text")
    var text: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UIIcon
*/
@Parcelize
data class UIIcon(
    
    
    
    @SerializedName("active")
    var active: String?=null,
    
    @SerializedName("inactive")
    var inactive: String?=null,
    
    @SerializedName("selected")
    var selected: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateAttributeRequest
*/
@Parcelize
data class UpdateAttributeRequest(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateResponse
*/
@Parcelize
data class UpdateResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateReviewRequest
*/
@Parcelize
data class UpdateReviewRequest(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("approve")
    var approve: Boolean?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("attributes_rating")
    var attributesRating: ArrayList<AttributeObject>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("device_meta")
    var deviceMeta: DeviceMeta?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("media_resource")
    var mediaResource: ArrayList<MediaMeta>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("review_id")
    var reviewId: String?=null,
    
    @SerializedName("template_id")
    var templateId: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateTemplateRequest
*/
@Parcelize
data class UpdateTemplateRequest(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("enable_media_type")
    var enableMediaType: String?=null,
    
    @SerializedName("enable_qna")
    var enableQna: Boolean?=null,
    
    @SerializedName("enable_rating")
    var enableRating: Boolean?=null,
    
    @SerializedName("enable_review")
    var enableReview: Boolean?=null,
    
    @SerializedName("entity")
    var entity: EntityRequest?=null,
    
    @SerializedName("rating")
    var rating: RatingRequest?=null,
    
    @SerializedName("review")
    var review: ReviewRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateTemplateStatusRequest
*/
@Parcelize
data class UpdateTemplateStatusRequest(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null
    
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
    Model: BlockUserRequestSchema
*/
@Parcelize
data class BlockUserRequestSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArchiveUserRequestSchema
*/
@Parcelize
data class ArchiveUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var mobile: EditProfileMobileSchema?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditProfileMobileSchema
*/
@Parcelize
data class EditProfileMobileSchema(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailOtpRequestSchema
*/
@Parcelize
data class VerifyEmailOtpRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    var force: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    
    @SerializedName("new_password")
    var newPassword: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchema
*/
@Parcelize
data class OAuthRequestAppleSchema(
    
    
    
    @SerializedName("user_identifier")
    var userIdentifier: String?=null,
    
    @SerializedName("oauth")
    var oauth: OAuthRequestAppleSchemaOauth?=null,
    
    @SerializedName("profile")
    var profile: OAuthRequestAppleSchemaProfile?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserObjectSchema
*/
@Parcelize
data class UserObjectSchema(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    var countryCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProfileEditSuccess
*/
@Parcelize
data class ProfileEditSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
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
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    
    
    @SerializedName("result")
    var result: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    
    
    @SerializedName("logout")
    var logout: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BlockUserSuccess
*/
@Parcelize
data class BlockUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ArchiveUserSuccess
*/
@Parcelize
data class ArchiveUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SessionListResponseSchema
*/
@Parcelize
data class SessionListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SessionDeleteResponseSchema
*/
@Parcelize
data class SessionDeleteResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthenticationInternalServerErrorSchema
*/
@Parcelize
data class AuthenticationInternalServerErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchemaOauth
*/
@Parcelize
data class OAuthRequestAppleSchemaOauth(
    
    
    
    @SerializedName("identity_token")
    var identityToken: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchemaProfile
*/
@Parcelize
data class OAuthRequestAppleSchemaProfile(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserRequestSchema
*/
@Parcelize
data class CreateUserRequestSchema(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserResponseSchema
*/
@Parcelize
data class CreateUserResponseSchema(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateUserSessionRequestSchema
*/
@Parcelize
data class CreateUserSessionRequestSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserSessionResponseSchema
*/
@Parcelize
data class CreateUserSessionResponseSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
    @SerializedName("secure")
    var secure: Boolean?=null,
    
    @SerializedName("http_only")
    var httpOnly: Boolean?=null,
    
    @SerializedName("cookie")
    var cookie: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var register: Boolean?=null,
    
    @SerializedName("mobile_image")
    var mobileImage: String?=null,
    
    @SerializedName("desktop_image")
    var desktopImage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var google: Boolean?=null,
    
    @SerializedName("apple")
    var apple: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    
    @SerializedName("email")
    var email: PlatformEmail?=null,
    
    @SerializedName("mobile")
    var mobile: PlatformMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformEmail
*/
@Parcelize
data class PlatformEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformMobile
*/
@Parcelize
data class PlatformMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateUserRequestSchema
*/
@Parcelize
data class UpdateUserRequestSchema(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
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
    Model: PathMappingSchema
*/
@Parcelize
data class PathMappingSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("redirections")
    var redirections: ArrayList<RedirectionSchema>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RedirectionSchema
*/
@Parcelize
data class RedirectionSchema(
    
    
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null
    
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
    
    @SerializedName("custom_meta_tags")
    var customMetaTags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
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
    var description: String?=null
    
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
    var title: String?=null
    
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
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DataLoaderResetResponseSchema
*/
@Parcelize
data class DataLoaderResetResponseSchema(
    
    
    
    @SerializedName("reset")
    var reset: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var createdBy: CreatedBySchema?=null,
    
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
    
    @SerializedName("popup")
    var popup: ActionPage?=null,
    
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
    var type: PageType?=null
    
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
    var subNavigation: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    
    
    @SerializedName("data")
    var data: LandingPageSchema?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    
    
    @SerializedName("data")
    var data: SlideshowSchema?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    var answer: String?=null
    
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
    var faqs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    var customJson: @RawValue HashMap<String,Any>?=null
    
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
    var navigation: ArrayList<NavigationReference>?=null
    
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
    
    @SerializedName("navigation")
    var navigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ContentSchema
*/
@Parcelize
data class ContentSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    
    
    @SerializedName("data")
    var data: CustomPageSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FeatureImage
*/
@Parcelize
data class FeatureImage(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
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
    var specifications: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
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
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
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
    var title: String?=null
    
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
    var systemPages: ArrayList<NavigationSchema>?=null,
    
    @SerializedName("custom_pages")
    var customPages: ArrayList<PageSchema>?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
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
    var media: SlideshowMedia?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
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
    Model: UnauthenticatedUser
*/
@Parcelize
data class UnauthenticatedUser(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnauthenticatedApplication
*/
@Parcelize
data class UnauthenticatedApplication(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ResourceNotFound
*/
@Parcelize
data class ResourceNotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InternalServerError
*/
@Parcelize
data class InternalServerError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CheckValidityResponse
*/
@Parcelize
data class CheckValidityResponse(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlanRecurring
*/
@Parcelize
data class PlanRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_count")
    var intervalCount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Plan
*/
@Parcelize
data class Plan(
    
    
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
    @SerializedName("plan_group")
    var planGroup: String?=null,
    
    @SerializedName("tag_lines")
    var tagLines: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: Double?=null,
    
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DetailedPlanComponents
*/
@Parcelize
data class DetailedPlanComponents(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("group")
    var group: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("links")
    var links: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DetailedPlan
*/
@Parcelize
data class DetailedPlan(
    
    
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
    @SerializedName("plan_group")
    var planGroup: String?=null,
    
    @SerializedName("tag_lines")
    var tagLines: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: Double?=null,
    
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("components")
    var components: ArrayList<DetailedPlanComponents>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionTrialPeriod
*/
@Parcelize
data class SubscriptionTrialPeriod(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityChargePrice
*/
@Parcelize
data class EntityChargePrice(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityChargeRecurring
*/
@Parcelize
data class EntityChargeRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ChargeLineItem
*/
@Parcelize
data class ChargeLineItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("recurring")
    var recurring: EntityChargeRecurring?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateSubscriptionCharge
*/
@Parcelize
data class CreateSubscriptionCharge(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("line_items")
    var lineItems: ArrayList<ChargeLineItem>?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OneTimeChargeItem
*/
@Parcelize
data class OneTimeChargeItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOneTimeCharge
*/
@Parcelize
data class CreateOneTimeCharge(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("charge")
    var charge: OneTimeChargeItem?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CurrentPeriod
*/
@Parcelize
data class CurrentPeriod(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionCharge
*/
@Parcelize
data class SubscriptionCharge(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("recurring")
    var recurring: EntityChargeRecurring?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("billing_date")
    var billingDate: String?=null,
    
    @SerializedName("current_period")
    var currentPeriod: CurrentPeriod?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntitySubscription
*/
@Parcelize
data class EntitySubscription(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: SubscriptionTrialPeriod?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("line_items")
    var lineItems: ArrayList<SubscriptionCharge>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OneTimeChargeEntity
*/
@Parcelize
data class OneTimeChargeEntity(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOneTimeChargeResponse
*/
@Parcelize
data class CreateOneTimeChargeResponse(
    
    
    
    @SerializedName("charge")
    var charge: OneTimeChargeEntity?=null,
    
    @SerializedName("confirm_url")
    var confirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateSubscriptionResponse
*/
@Parcelize
data class CreateSubscriptionResponse(
    
    
    
    @SerializedName("subscription")
    var subscription: EntitySubscription?=null,
    
    @SerializedName("confirm_url")
    var confirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPeriod
*/
@Parcelize
data class InvoiceDetailsPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsClient
*/
@Parcelize
data class InvoiceDetailsClient(
    
    
    
    @SerializedName("address_lines")
    var addressLines: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsStatusTrail
*/
@Parcelize
data class InvoiceDetailsStatusTrail(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPaymentMethodsDataChecks
*/
@Parcelize
data class InvoiceDetailsPaymentMethodsDataChecks(
    
    
    
    @SerializedName("cvc_check")
    var cvcCheck: String?=null,
    
    @SerializedName("address_line1_check")
    var addressLine1Check: String?=null,
    
    @SerializedName("address_postal_code_check")
    var addressPostalCodeCheck: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPaymentMethodsDataNetworks
*/
@Parcelize
data class InvoiceDetailsPaymentMethodsDataNetworks(
    
    
    
    @SerializedName("available")
    var available: ArrayList<String>?=null,
    
    @SerializedName("preferred")
    var preferred: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPaymentMethodsDataThreeDSecureUsage
*/
@Parcelize
data class InvoiceDetailsPaymentMethodsDataThreeDSecureUsage(
    
    
    
    @SerializedName("supported")
    var supported: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPaymentMethodsData
*/
@Parcelize
data class InvoiceDetailsPaymentMethodsData(
    
    
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("last4")
    var last4: String?=null,
    
    @SerializedName("checks")
    var checks: InvoiceDetailsPaymentMethodsDataChecks?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("funding")
    var funding: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("networks")
    var networks: InvoiceDetailsPaymentMethodsDataNetworks?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("fingerprint")
    var fingerprint: String?=null,
    
    @SerializedName("generated_from")
    var generatedFrom: String?=null,
    
    @SerializedName("three_d_secure_usage")
    var threeDSecureUsage: InvoiceDetailsPaymentMethodsDataThreeDSecureUsage?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsPaymentMethods
*/
@Parcelize
data class InvoiceDetailsPaymentMethods(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null,
    
    @SerializedName("data")
    var data: InvoiceDetailsPaymentMethodsData?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoicePaymentMethod
*/
@Parcelize
data class InvoicePaymentMethod(
    
    
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvoiceDetails
*/
@Parcelize
data class InvoiceDetails(
    
    
    
    @SerializedName("period")
    var period: InvoiceDetailsPeriod?=null,
    
    @SerializedName("client")
    var client: InvoiceDetailsClient?=null,
    
    @SerializedName("auto_advance")
    var autoAdvance: Boolean?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("paid")
    var paid: Boolean?=null,
    
    @SerializedName("attemp")
    var attemp: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("pg_data")
    var pgData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("receipt_number")
    var receiptNumber: String?=null,
    
    @SerializedName("statement_descriptor")
    var statementDescriptor: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("status_trail")
    var statusTrail: ArrayList<InvoiceDetailsStatusTrail>?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("subscription")
    var subscription: String?=null,
    
    @SerializedName("next_action_time")
    var nextActionTime: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("hash_identifier")
    var hashIdentifier: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: InvoicePaymentMethod?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceItemsPlanRecurring
*/
@Parcelize
data class InvoiceItemsPlanRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_count")
    var intervalCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceItemsPlan
*/
@Parcelize
data class InvoiceItemsPlan(
    
    
    
    @SerializedName("recurring")
    var recurring: InvoiceItemsPlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
    @SerializedName("plan_group")
    var planGroup: String?=null,
    
    @SerializedName("tag_lines")
    var tagLines: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: Int?=null,
    
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceItemsPeriod
*/
@Parcelize
data class InvoiceItemsPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceItems
*/
@Parcelize
data class InvoiceItems(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("plan")
    var plan: InvoiceItemsPlan?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("period")
    var period: InvoiceItemsPeriod?=null,
    
    @SerializedName("unit_amount")
    var unitAmount: Double?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    
    @SerializedName("invoice")
    var invoice: InvoiceDetails?=null,
    
    @SerializedName("invoice_items")
    var invoiceItems: ArrayList<InvoiceItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoicesDataClient
*/
@Parcelize
data class InvoicesDataClient(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("address_lines")
    var addressLines: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoicesDataPeriod
*/
@Parcelize
data class InvoicesDataPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoicesDataPaymentMethod
*/
@Parcelize
data class InvoicesDataPaymentMethod(
    
    
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvoicesData
*/
@Parcelize
data class InvoicesData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("client")
    var client: InvoicesDataClient?=null,
    
    @SerializedName("auto_advance")
    var autoAdvance: Boolean?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("paid")
    var paid: Boolean?=null,
    
    @SerializedName("attemp")
    var attemp: Int?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("pg_data")
    var pgData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("period")
    var period: InvoicesDataPeriod?=null,
    
    @SerializedName("receipt_number")
    var receiptNumber: String?=null,
    
    @SerializedName("statement_descriptor")
    var statementDescriptor: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("status_trail")
    var statusTrail: ArrayList<InvoiceDetailsStatusTrail>?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("subscription")
    var subscription: String?=null,
    
    @SerializedName("next_action_time")
    var nextActionTime: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("hash_identifier")
    var hashIdentifier: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: InvoicesDataPaymentMethod?=null,
    
    @SerializedName("invoice_items")
    var invoiceItems: ArrayList<InvoiceItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Invoices
*/
@Parcelize
data class Invoices(
    
    
    
    @SerializedName("data")
    var data: ArrayList<InvoicesData>?=null,
    
    @SerializedName("start")
    var start: Int?=null,
    
    @SerializedName("end")
    var end: Int?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Phone
*/
@Parcelize
data class Phone(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("phone_country_code")
    var phoneCountryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionBillingAddress
*/
@Parcelize
data class SubscriptionBillingAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("line1")
    var line1: String?=null,
    
    @SerializedName("line2")
    var line2: String?=null,
    
    @SerializedName("postal_code")
    var postalCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionCustomer
*/
@Parcelize
data class SubscriptionCustomer(
    
    
    
    @SerializedName("phone")
    var phone: Phone?=null,
    
    @SerializedName("billing_address")
    var billingAddress: SubscriptionBillingAddress?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionCustomerCreate
*/
@Parcelize
data class SubscriptionCustomerCreate(
    
    
    
    @SerializedName("phone")
    var phone: Phone?=null,
    
    @SerializedName("billing_address")
    var billingAddress: SubscriptionBillingAddress?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionCurrentPeriod
*/
@Parcelize
data class SubscriptionCurrentPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionPauseCollection
*/
@Parcelize
data class SubscriptionPauseCollection(
    
    
    
    @SerializedName("behavior")
    var behavior: String?=null,
    
    @SerializedName("resume_at")
    var resumeAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionTrial
*/
@Parcelize
data class SubscriptionTrial(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionInvoiceSettings
*/
@Parcelize
data class SubscriptionInvoiceSettings(
    
    
    
    @SerializedName("generation")
    var generation: Boolean?=null,
    
    @SerializedName("charging")
    var charging: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Subscription
*/
@Parcelize
data class Subscription(
    
    
    
    @SerializedName("current_period")
    var currentPeriod: SubscriptionCurrentPeriod?=null,
    
    @SerializedName("pause_collection")
    var pauseCollection: SubscriptionPauseCollection?=null,
    
    @SerializedName("trial")
    var trial: SubscriptionTrial?=null,
    
    @SerializedName("invoice_settings")
    var invoiceSettings: SubscriptionInvoiceSettings?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cancel_at_period_end")
    var cancelAtPeriodEnd: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("plan_data")
    var planData: Plan?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("latest_invoice")
    var latestInvoice: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionStatus
*/
@Parcelize
data class SubscriptionStatus(
    
    
    
    @SerializedName("is_enabled")
    var isEnabled: Boolean?=null,
    
    @SerializedName("subscription")
    var subscription: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionLimitApplication
*/
@Parcelize
data class SubscriptionLimitApplication(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("hard_limit")
    var hardLimit: Int?=null,
    
    @SerializedName("soft_limit")
    var softLimit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionLimitMarketplace
*/
@Parcelize
data class SubscriptionLimitMarketplace(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriptionLimitOtherPlatform
*/
@Parcelize
data class SubscriptionLimitOtherPlatform(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriptionLimitTeam
*/
@Parcelize
data class SubscriptionLimitTeam(
    
    
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriptionLimitProducts
*/
@Parcelize
data class SubscriptionLimitProducts(
    
    
    
    @SerializedName("bulk")
    var bulk: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionLimitExtensions
*/
@Parcelize
data class SubscriptionLimitExtensions(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionLimitIntegrations
*/
@Parcelize
data class SubscriptionLimitIntegrations(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionLimit
*/
@Parcelize
data class SubscriptionLimit(
    
    
    
    @SerializedName("application")
    var application: SubscriptionLimitApplication?=null,
    
    @SerializedName("marketplace")
    var marketplace: SubscriptionLimitMarketplace?=null,
    
    @SerializedName("other_platform")
    var otherPlatform: SubscriptionLimitOtherPlatform?=null,
    
    @SerializedName("team")
    var team: SubscriptionLimitTeam?=null,
    
    @SerializedName("products")
    var products: SubscriptionLimitProducts?=null,
    
    @SerializedName("extensions")
    var extensions: SubscriptionLimitExtensions?=null,
    
    @SerializedName("integrations")
    var integrations: SubscriptionLimitIntegrations?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionActivateReq
*/
@Parcelize
data class SubscriptionActivateReq(
    
    
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("product_suite")
    var productSuite: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriptionActivateRes
*/
@Parcelize
data class SubscriptionActivateRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CancelSubscriptionReq
*/
@Parcelize
data class CancelSubscriptionReq(
    
    
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("product_suite")
    var productSuite: String?=null,
    
    @SerializedName("subscription_id")
    var subscriptionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CancelSubscriptionRes
*/
@Parcelize
data class CancelSubscriptionRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: StatsImported
*/
@Parcelize
data class StatsImported(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatsProcessed
*/
@Parcelize
data class StatsProcessed(
    
    
    
    @SerializedName("email")
    var email: StatsProcessedEmail?=null,
    
    @SerializedName("sms")
    var sms: StatsProcessedSms?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetStats
*/
@Parcelize
data class GetStats(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Stats>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RecipientHeaders
*/
@Parcelize
data class RecipientHeaders(
    
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CampaignEmailTemplate
*/
@Parcelize
data class CampaignEmailTemplate(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CampaignEmail
*/
@Parcelize
data class CampaignEmail(
    
    
    
    @SerializedName("template")
    var template: CampaignEmailTemplate?=null,
    
    @SerializedName("provider")
    var provider: CampignEmailProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Campaigns
*/
@Parcelize
data class Campaigns(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Campaign>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BigqueryHeadersReq
*/
@Parcelize
data class BigqueryHeadersReq(
    
    
    
    @SerializedName("query")
    var query: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BigqueryHeadersResHeaders
*/
@Parcelize
data class BigqueryHeadersResHeaders(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BigqueryHeadersRes
*/
@Parcelize
data class BigqueryHeadersRes(
    
    
    
    @SerializedName("headers")
    var headers: ArrayList<BigqueryHeadersResHeaders>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetNRecordsCsvRes
*/
@Parcelize
data class GetNRecordsCsvRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetNRecordsCsvResItems>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Audiences
*/
@Parcelize
data class Audiences(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Audience>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("from_address")
    var fromAddress: ArrayList<EmailProviderReqFrom>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailProvider
*/
@Parcelize
data class EmailProvider(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("provider")
    var provider: String?=null,
    
    @SerializedName("from_address")
    var fromAddress: ArrayList<EmailProviderReqFrom>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailProviders
*/
@Parcelize
data class EmailProviders(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EmailProvider>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EmailTemplateDeleteSuccessRes
*/
@Parcelize
data class EmailTemplateDeleteSuccessRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EmailTemplateDeleteFailureRes
*/
@Parcelize
data class EmailTemplateDeleteFailureRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailTemplateHeaders
*/
@Parcelize
data class EmailTemplateHeaders(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplateAndType
*/
@Parcelize
data class TemplateAndType(
    
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailTemplates
*/
@Parcelize
data class EmailTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EmailTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SystemEmailTemplates
*/
@Parcelize
data class SystemEmailTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SystemEmailTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayloadEmailTemplateStructure
*/
@Parcelize
data class PayloadEmailTemplateStructure(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayloadEmailProviderStructure
*/
@Parcelize
data class PayloadEmailProviderStructure(
    
    
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PayloadEmailStructure
*/
@Parcelize
data class PayloadEmailStructure(
    
    
    
    @SerializedName("template")
    var template: PayloadEmailTemplateStructure?=null,
    
    @SerializedName("provider")
    var provider: PayloadEmailProviderStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayloadSmsTemplateStructure
*/
@Parcelize
data class PayloadSmsTemplateStructure(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayloadSmsProviderStructure
*/
@Parcelize
data class PayloadSmsProviderStructure(
    
    
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PayloadSmsStructure
*/
@Parcelize
data class PayloadSmsStructure(
    
    
    
    @SerializedName("template")
    var template: PayloadSmsTemplateStructure?=null,
    
    @SerializedName("provider")
    var provider: PayloadSmsProviderStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayloadStructure
*/
@Parcelize
data class PayloadStructure(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("email")
    var email: PayloadEmailStructure?=null,
    
    @SerializedName("sms")
    var sms: PayloadSmsStructure?=null,
    
    @SerializedName("application")
    var application: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetaStructure
*/
@Parcelize
data class MetaStructure(
    
    
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("trace")
    var trace: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EngineRequest
*/
@Parcelize
data class EngineRequest(
    
    
    
    @SerializedName("payload")
    var payload: PayloadStructure?=null,
    
    @SerializedName("meta")
    var meta: MetaStructure?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EngineResponse
*/
@Parcelize
data class EngineResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EventSubscriptionTemplateSms
*/
@Parcelize
data class EventSubscriptionTemplateSms(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EventSubscriptionTemplateEmail
*/
@Parcelize
data class EventSubscriptionTemplateEmail(
    
    
    
    @SerializedName("subscribed")
    var subscribed: Boolean?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EventSubscriptionTemplate
*/
@Parcelize
data class EventSubscriptionTemplate(
    
    
    
    @SerializedName("sms")
    var sms: EventSubscriptionTemplateSms?=null,
    
    @SerializedName("email")
    var email: EventSubscriptionTemplateEmail?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EventSubscriptions
*/
@Parcelize
data class EventSubscriptions(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EventSubscription>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TriggerJobResponse
*/
@Parcelize
data class TriggerJobResponse(
    
    
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TriggerJobRequest
*/
@Parcelize
data class TriggerJobRequest(
    
    
    
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Jobs
*/
@Parcelize
data class Jobs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Job>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JobLogs
*/
@Parcelize
data class JobLogs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<JobLog>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LogEmail
*/
@Parcelize
data class LogEmail(
    
    
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LogPushnotification
*/
@Parcelize
data class LogPushnotification(
    
    
    
    @SerializedName("pushtokens")
    var pushtokens: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Logs
*/
@Parcelize
data class Logs(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Log>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SmsProviders
*/
@Parcelize
data class SmsProviders(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SmsProvider>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SmsTemplateDeleteSuccessRes
*/
@Parcelize
data class SmsTemplateDeleteSuccessRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SmsTemplateDeleteFailureRes
*/
@Parcelize
data class SmsTemplateDeleteFailureRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SmsTemplateMessage
*/
@Parcelize
data class SmsTemplateMessage(
    
    
    
    @SerializedName("template_type")
    var templateType: String?=null,
    
    @SerializedName("template")
    var template: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SmsTemplates
*/
@Parcelize
data class SmsTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SmsTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SystemSmsTemplates
*/
@Parcelize
data class SystemSmsTemplates(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SystemSmsTemplate>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SystemNotificationUser
*/
@Parcelize
data class SystemNotificationUser(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}




/*
    Model: PaymentGatewayConfigResponse
*/
@Parcelize
data class PaymentGatewayConfigResponse(
    
    
    
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    
    @SerializedName("large")
    var large: String?=null,
    
    @SerializedName("small")
    var small: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: IntentApp
*/
@Parcelize
data class IntentApp(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: IntentAppErrorList
*/
@Parcelize
data class IntentAppErrorList(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PayoutsResponse
*/
@Parcelize
data class PayoutsResponse(
    
    
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutBankDetails
*/
@Parcelize
data class PayoutBankDetails(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null,
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null,
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatePayoutRequest
*/
@Parcelize
data class UpdatePayoutRequest(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeletePayoutResponse
*/
@Parcelize
data class DeletePayoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriptionPaymentMethodResponse
*/
@Parcelize
data class SubscriptionPaymentMethodResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@Parcelize
data class DeleteSubscriptionPaymentMethodResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriptionConfigResponse
*/
@Parcelize
data class SubscriptionConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@Parcelize
data class SaveSubscriptionSetupIntentRequest(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@Parcelize
data class SaveSubscriptionSetupIntentResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null,
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentConfirmationRequest
*/
@Parcelize
data class PaymentConfirmationRequest(
    
    
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentConfirmationResponse
*/
@Parcelize
data class PaymentConfirmationResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}




/*
    Model: GetActivityStatus
*/
@Parcelize
data class GetActivityStatus(
    
    
    
    @SerializedName("activity_history")
    var activityHistory: ActivityHistory?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CanBreakRequestBody
*/
@Parcelize
data class CanBreakRequestBody(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CanBreakResponse
*/
@Parcelize
data class CanBreakResponse(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("valid_actions")
    var validActions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FailedOrders
*/
@Parcelize
data class FailedOrders(
    
    
    
    @SerializedName("orders")
    var orders: FailOrder?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var shippingAddress: OrderShippingAddress?=null,
    
    @SerializedName("taxes_included")
    var taxesIncluded: Boolean?=null,
    
    @SerializedName("financial_status")
    var financialStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TotalDiscountsSet
*/
@Parcelize
data class TotalDiscountsSet(
    
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: PresentmentMoney?=null,
    
    @SerializedName("shop_money")
    var shopMoney: ShopMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PresentmentMoney
*/
@Parcelize
data class PresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShopMoney
*/
@Parcelize
data class ShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalPriceSet
*/
@Parcelize
data class TotalPriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalPriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalPriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalPriceSetShopMoney
*/
@Parcelize
data class TotalPriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalPriceSetPresentmentMoney
*/
@Parcelize
data class TotalPriceSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalTaxSet
*/
@Parcelize
data class TotalTaxSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalTaxSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalTaxSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalTaxSetShopMoney
*/
@Parcelize
data class TotalTaxSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalTaxSetPresentmentMoney
*/
@Parcelize
data class TotalTaxSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubtotalPriceSet
*/
@Parcelize
data class SubtotalPriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: SubtotalPriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: SubtotalPriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubtotalPriceSetShopMoney
*/
@Parcelize
data class SubtotalPriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubtotalPriceSetPresentmentMoney
*/
@Parcelize
data class SubtotalPriceSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NotAvailable
*/
@Parcelize
data class NotAvailable(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Sellable
*/
@Parcelize
data class Sellable(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderCommitted
*/
@Parcelize
data class OrderCommitted(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Damaged
*/
@Parcelize
data class Damaged(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MarketplaceIdentifiers
*/
@Parcelize
data class MarketplaceIdentifiers(
    
    
    
    @SerializedName("tatacliq_luxury")
    var tatacliqLuxury: TatacliqLuxury?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TatacliqLuxury
*/
@Parcelize
data class TatacliqLuxury(
    
    
    
    @SerializedName("sku")
    var sku: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ArticleMeta
*/
@Parcelize
data class ArticleMeta(
    
    
    
    @SerializedName("service")
    var service: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ArticleBrand
*/
@Parcelize
data class ArticleBrand(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LineItemsArticleIdentifier
*/
@Parcelize
data class LineItemsArticleIdentifier(
    
    
    
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PriceSet
*/
@Parcelize
data class PriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: PriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: PriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PriceSetShopMoney
*/
@Parcelize
data class PriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PriceSetPresentmentMoney
*/
@Parcelize
data class PriceSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TaxLinesPriceSet
*/
@Parcelize
data class TaxLinesPriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: TaxLinesPriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: TaxLinesPriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TaxLinesPriceSetShopMoney
*/
@Parcelize
data class TaxLinesPriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TaxLinesPriceSetPresentmentMoney
*/
@Parcelize
data class TaxLinesPriceSetPresentmentMoney(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalDiscountSet
*/
@Parcelize
data class TotalDiscountSet(
    
    
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalDiscountSetPresentmentMoney?=null,
    
    @SerializedName("shop_money")
    var shopMoney: TotalDiscountSetShopMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalDiscountSetPresentmentMoney
*/
@Parcelize
data class TotalDiscountSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalDiscountSetShopMoney
*/
@Parcelize
data class TotalDiscountSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("province_code")
    var provinceCode: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TotalShippingPriceSet
*/
@Parcelize
data class TotalShippingPriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalShippingPriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalShippingPriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalShippingPriceSetShopMoney
*/
@Parcelize
data class TotalShippingPriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalShippingPriceSetPresentmentMoney
*/
@Parcelize
data class TotalShippingPriceSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TotalLineItemsPriceSet
*/
@Parcelize
data class TotalLineItemsPriceSet(
    
    
    
    @SerializedName("shop_money")
    var shopMoney: TotalLineItemsPriceSetShopMoney?=null,
    
    @SerializedName("presentment_money")
    var presentmentMoney: TotalLineItemsPriceSetPresentmentMoney?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalLineItemsPriceSetShopMoney
*/
@Parcelize
data class TotalLineItemsPriceSetShopMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TotalLineItemsPriceSetPresentmentMoney
*/
@Parcelize
data class TotalLineItemsPriceSetPresentmentMoney(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderShippingAddress
*/
@Parcelize
data class OrderShippingAddress(
    
    
    
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
    
    @SerializedName("province_code")
    var provinceCode: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("province")
    var province: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var nextOrderStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: PlatformOrderPage?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: AppliedFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: PlatformApplication?=null,
    
    @SerializedName("shipments")
    var shipments: PlatformShipment?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Channel
*/
@Parcelize
data class Channel(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformApplication
*/
@Parcelize
data class PlatformApplication(
    
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("gst")
    var gst: ShipmentGst?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ShipmentBreakupValues?=null,
    
    @SerializedName("priority")
    var priority: Double?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
    @SerializedName("item")
    var item: BagItem?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentBreakupValues
*/
@Parcelize
data class ShipmentBreakupValues(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Filters
*/
@Parcelize
data class Filters(
    
    
    
    @SerializedName("stage")
    var stage: Stage?=null,
    
    @SerializedName("stages")
    var stages: Stages?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Stage
*/
@Parcelize
data class Stage(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("filters")
    var filters: StagesFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Options
*/
@Parcelize
data class Options(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: ItemTotal?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppliedFilters
*/
@Parcelize
data class AppliedFilters(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<String>?=null,
    
    @SerializedName("deployment_stores")
    var deploymentStores: ArrayList<String>?=null,
    
    @SerializedName("dp")
    var dp: ArrayList<Int>?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDetails
*/
@Parcelize
data class OrderDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<OrderPicklistListing>?=null,
    
    @SerializedName("page")
    var page: PlatformOrderPage?=null,
    
    @SerializedName("filters")
    var filters: Filters?=null,
    
    @SerializedName("next_order_status")
    var nextOrderStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: AppliedFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDetailsItem
*/
@Parcelize
data class OrderDetailsItem(
    
    
    
    @SerializedName("user")
    var user: PlatformOrderUserInfo?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    
    @SerializedName("channel")
    var channel: Channel?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: PlatformBreakupValues?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: PlatformApplication?=null,
    
    @SerializedName("shipments")
    var shipments: PlatformShipmentDetails?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("payments")
    var payments: ItemsPayments?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentDetails
*/
@Parcelize
data class PlatformShipmentDetails(
    
    
    
    @SerializedName("status")
    var status: PlatformShipmentDetailsStatus?=null,
    
    @SerializedName("bags")
    var bags: BagsDetails?=null,
    
    @SerializedName("prices")
    var prices: ShipmentPrices?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ShipmentBreakupValues?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DpDetails?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
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
    var brand: PlatformShipmentDetailsBrand?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_source")
    var orderSource: String?=null,
    
    @SerializedName("is_not_fynd_source")
    var isNotFyndSource: Boolean?=null,
    
    @SerializedName("can_break")
    var canBreak: @RawValue HashMap<String,Any>?=null,
    
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
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("pod")
    var pod: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Double?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("auto_trigger_dp_assignment")
    var autoTriggerDpAssignment: Boolean?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("dates")
    var dates: ShipmentDates?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentDetailsStatus
*/
@Parcelize
data class PlatformShipmentDetailsStatus(
    
    
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagsDetails
*/
@Parcelize
data class BagsDetails(
    
    
    
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
    var bagStatus: BagStatus?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleIdentifiers
*/
@Parcelize
data class ArticleIdentifiers(
    
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Set
*/
@Parcelize
data class Set(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: SetSizeDistribution?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SetSizeDistribution
*/
@Parcelize
data class SetSizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: Sizes?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Sizes
*/
@Parcelize
data class Sizes(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DpDetails
*/
@Parcelize
data class DpDetails(
    
    
    
    @SerializedName("gst_tag")
    var gstTag: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreAddressJson
*/
@Parcelize
data class StoreAddressJson(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
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
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AdditionalContactDetails
*/
@Parcelize
data class AdditionalContactDetails(
    
    
    
    @SerializedName("number")
    var number: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    
    
    @SerializedName("gst")
    var gst: Gst?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductReturnConfig
*/
@Parcelize
data class ProductReturnConfig(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Opening
*/
@Parcelize
data class Opening(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Closing
*/
@Parcelize
data class Closing(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentDetailsBrand
*/
@Parcelize
data class PlatformShipmentDetailsBrand(
    
    
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Timestamp
*/
@Parcelize
data class Timestamp(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformOrderDetailsPage
*/
@Parcelize
data class PlatformOrderDetailsPage(
    
    
    
    @SerializedName("next")
    var next: String?=null,
    
    @SerializedName("previous")
    var previous: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDates
*/
@Parcelize
data class ShipmentDates(
    
    
    
    @SerializedName("due_date")
    var dueDate: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderLanesCount
*/
@Parcelize
data class OrderLanesCount(
    
    
    
    @SerializedName("stages")
    var stages: ArrayList<StageItem>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: StageItem
*/
@Parcelize
data class StageItem(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateOrderReprocessResponse
*/
@Parcelize
data class UpdateOrderReprocessResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderPicklistListing
*/
@Parcelize
data class OrderPicklistListing(
    
    
    
    @SerializedName("user")
    var user: PlatformOrderUserInfo?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    
    @SerializedName("channel")
    var channel: Channel?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: PlatformBreakupValues?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: PlatformApplication?=null,
    
    @SerializedName("shipments")
    var shipments: PlatformShipmentDetails?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("payments")
    var payments: ItemsPayments?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetPingResponse
*/
@Parcelize
data class GetPingResponse(
    
    
    
    @SerializedName("ping")
    var ping: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetShipmentAddressResponse
*/
@Parcelize
data class GetShipmentAddressResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: DataShipmentAddress?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DataShipmentAddress
*/
@Parcelize
data class DataShipmentAddress(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentAddressRequest
*/
@Parcelize
data class UpdateShipmentAddressRequest(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentAddressResponse
*/
@Parcelize
data class UpdateShipmentAddressResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponse
*/
@Parcelize
data class ShipmentTrackResponse(
    
    
    
    @SerializedName("bag_list")
    var bagList: ArrayList<ShipmentTrackResponseBagListItem>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_value")
    var orderValue: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItem
*/
@Parcelize
data class ShipmentTrackResponseBagListItem(
    
    
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("price")
    var price: String?=null,
    
    @SerializedName("time_slot")
    var timeSlot: String?=null,
    
    @SerializedName("product_name")
    var productName: String?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("is_try_at_home")
    var isTryAtHome: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<ShipmentTrackResponseBagListItemBreakValues>?=null,
    
    @SerializedName("statuses")
    var statuses: ArrayList<ShipmentTrackResponseBagListItemStatuses>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("bag_id")
    var bagId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("payment_mode_source")
    var paymentModeSource: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: ShipmentTrackResponseBagListItemDpDetails?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("product_image")
    var productImage: ShipmentTrackResponseBagListItemsProductImage?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("fynd_cash_msg")
    var fyndCashMsg: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemBreakValues
*/
@Parcelize
data class ShipmentTrackResponseBagListItemBreakValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemStatuses
*/
@Parcelize
data class ShipmentTrackResponseBagListItemStatuses(
    
    
    
    @SerializedName("nps_rating")
    var npsRating: Int?=null,
    
    @SerializedName("nps_string")
    var npsString: String?=null,
    
    @SerializedName("progress_status")
    var progressStatus: ArrayList<ShipmentTrackResponseBagListItemStatusesProgress>?=null,
    
    @SerializedName("flow_type")
    var flowType: String?=null,
    
    @SerializedName("status_progress")
    var statusProgress: Int?=null,
    
    @SerializedName("is_nps_done")
    var isNpsDone: Boolean?=null,
    
    @SerializedName("header_message")
    var headerMessage: String?=null,
    
    @SerializedName("is_delayed")
    var isDelayed: String?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<ShipmentTrackResponseBagListItemStatusesTrack>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemStatusesProgress
*/
@Parcelize
data class ShipmentTrackResponseBagListItemStatusesProgress(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("state")
    var state: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemStatusesTrack
*/
@Parcelize
data class ShipmentTrackResponseBagListItemStatusesTrack(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemDpDetails
*/
@Parcelize
data class ShipmentTrackResponseBagListItemDpDetails(
    
    
    
    @SerializedName("tracking_no")
    var trackingNo: String?=null,
    
    @SerializedName("courier")
    var courier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrackResponseBagListItemsProductImage
*/
@Parcelize
data class ShipmentTrackResponseBagListItemsProductImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusResponse
*/
@Parcelize
data class UpdateShipmentStatusResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_shipments")
    var errorShipments: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentReasonsResponse
*/
@Parcelize
data class ShipmentReasonsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<ShipmentResponseReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentResponseReasons
*/
@Parcelize
data class ShipmentResponseReasons(
    
    
    
    @SerializedName("reason_id")
    var reasonId: Double?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentTrack
*/
@Parcelize
data class PlatformShipmentTrack(
    
    
    
    @SerializedName("results")
    var results: Results?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentUpdateRequest
*/
@Parcelize
data class ShipmentUpdateRequest(
    
    
    
    @SerializedName("bags")
    var bags: ArrayList<String>?=null,
    
    @SerializedName("reason")
    var reason: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("comments")
    var comments: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentUpdateResponse
*/
@Parcelize
data class ShipmentUpdateResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateProcessShipmenstRequestBody
*/
@Parcelize
data class UpdateProcessShipmenstRequestBody(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    
    @SerializedName("expected_status")
    var expectedStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateProcessShipmenstRequestResponse
*/
@Parcelize
data class UpdateProcessShipmenstRequestResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetVoiceCallbackResponse
*/
@Parcelize
data class GetVoiceCallbackResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetClickToCallResponse
*/
@Parcelize
data class GetClickToCallResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderUser
*/
@Parcelize
data class OrderUser(
    
    
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderPriority
*/
@Parcelize
data class OrderPriority(
    
    
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("affiliate_priority_code")
    var affiliatePriorityCode: String?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleDetails
*/
@Parcelize
data class ArticleDetails(
    
    
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetails
*/
@Parcelize
data class ShipmentDetails(
    
    
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails>?=null,
    
    @SerializedName("dp_id")
    var dpId: Int?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentConfig
*/
@Parcelize
data class ShipmentConfig(
    
    
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("shipment")
    var shipment: ArrayList<ShipmentDetails>?=null,
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentData
*/
@Parcelize
data class ShipmentData(
    
    
    
    @SerializedName("shipment_data")
    var shipmentData: ShipmentConfig?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: MarketPlacePdf
*/
@Parcelize
data class MarketPlacePdf(
    
    
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AffiliateBag
*/
@Parcelize
data class AffiliateBag(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("fynd_store_id")
    var fyndStoreId: String?=null,
    
    @SerializedName("sku")
    var sku: String?=null,
    
    @SerializedName("unit_price")
    var unitPrice: Double?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("avl_qty")
    var avlQty: Int?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: MarketPlacePdf?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserData
*/
@Parcelize
data class UserData(
    
    
    
    @SerializedName("shipping_user")
    var shippingUser: OrderUser?=null,
    
    @SerializedName("billing_user")
    var billingUser: OrderUser?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderInfo
*/
@Parcelize
data class OrderInfo(
    
    
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: OrderUser?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("order_priority")
    var orderPriority: OrderPriority?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentData?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<AffiliateBag>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: OrderUser?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("user")
    var user: UserData?=null,
    
    @SerializedName("payment")
    var payment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateStoreIdMapping
*/
@Parcelize
data class AffiliateStoreIdMapping(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AffiliateAppConfigMeta
*/
@Parcelize
data class AffiliateAppConfigMeta(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AffiliateAppConfig
*/
@Parcelize
data class AffiliateAppConfig(
    
    
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<AffiliateAppConfigMeta>?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateInventoryLogisticsConfig
*/
@Parcelize
data class AffiliateInventoryLogisticsConfig(
    
    
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AffiliateInventoryArticleAssignmentConfig
*/
@Parcelize
data class AffiliateInventoryArticleAssignmentConfig(
    
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AffiliateInventoryStoreConfig
*/
@Parcelize
data class AffiliateInventoryStoreConfig(
    
    
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AffiliateInventoryOrderConfig
*/
@Parcelize
data class AffiliateInventoryOrderConfig(
    
    
    
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AffiliateInventoryPaymentConfig
*/
@Parcelize
data class AffiliateInventoryPaymentConfig(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AffiliateInventoryConfig
*/
@Parcelize
data class AffiliateInventoryConfig(
    
    
    
    @SerializedName("logistics")
    var logistics: AffiliateInventoryLogisticsConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: AffiliateInventoryArticleAssignmentConfig?=null,
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryStoreConfig?=null,
    
    @SerializedName("order")
    var order: AffiliateInventoryOrderConfig?=null,
    
    @SerializedName("payment")
    var payment: AffiliateInventoryPaymentConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateConfig
*/
@Parcelize
data class AffiliateConfig(
    
    
    
    @SerializedName("app")
    var app: AffiliateAppConfig?=null,
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Affiliate
*/
@Parcelize
data class Affiliate(
    
    
    
    @SerializedName("config")
    var config: AffiliateConfig?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderConfig
*/
@Parcelize
data class OrderConfig(
    
    
    
    @SerializedName("create_user")
    var createUser: Boolean?=null,
    
    @SerializedName("affiliate_store_id_mapping")
    var affiliateStoreIdMapping: ArrayList<AffiliateStoreIdMapping>?=null,
    
    @SerializedName("bag_end_state")
    var bagEndState: String?=null,
    
    @SerializedName("affiliate")
    var affiliate: Affiliate?=null,
    
    @SerializedName("store_lookup")
    var storeLookup: String?=null,
    
    @SerializedName("article_lookup")
    var articleLookup: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderPayload
*/
@Parcelize
data class CreateOrderPayload(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("order_info")
    var orderInfo: OrderInfo?=null,
    
    @SerializedName("order_config")
    var orderConfig: OrderConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderResponse
*/
@Parcelize
data class CreateOrderResponse(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error_trace")
    var errorTrace: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvalidateShipmentCachePayload
*/
@Parcelize
data class InvalidateShipmentCachePayload(
    
    
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvalidateShipmentCacheNestedResponse
*/
@Parcelize
data class InvalidateShipmentCacheNestedResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvalidateShipmentCacheResponse
*/
@Parcelize
data class InvalidateShipmentCacheResponse(
    
    
    
    @SerializedName("response")
    var response: ArrayList<InvalidateShipmentCacheNestedResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: StoreReassign
*/
@Parcelize
data class StoreReassign(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("reason_ids")
    var reasonIds: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("set_id")
    var setId: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("mongo_article_id")
    var mongoArticleId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreReassignResponse
*/
@Parcelize
data class StoreReassignResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Entities
*/
@Parcelize
data class Entities(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentLockPayload
*/
@Parcelize
data class UpdateShipmentLockPayload(
    
    
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<Entities>?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OriginalFilter
*/
@Parcelize
data class OriginalFilter(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Bags1
*/
@Parcelize
data class Bags1(
    
    
    
    @SerializedName("is_locked")
    var isLocked: Boolean?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CheckResponse
*/
@Parcelize
data class CheckResponse(
    
    
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("is_shipment_locked")
    var isShipmentLocked: Boolean?=null,
    
    @SerializedName("original_filter")
    var originalFilter: OriginalFilter?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags1>?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("is_bag_locked")
    var isBagLocked: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentLockResponse
*/
@Parcelize
data class UpdateShipmentLockResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("check_response")
    var checkResponse: ArrayList<CheckResponse>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: RecursiveUpdate
*/
@Parcelize
data class RecursiveUpdate(
    
    
    
    @SerializedName("bag_ids")
    var bagIds: ArrayList<String>?=null,
    
    @SerializedName("entity_ids")
    var entityIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DataUpdatePerEntity
*/
@Parcelize
data class DataUpdatePerEntity(
    
    
    
    @SerializedName("entity_id")
    var entityId: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DataUpdate
*/
@Parcelize
data class DataUpdate(
    
    
    
    @SerializedName("recursive_updates")
    var recursiveUpdates: RecursiveUpdate?=null,
    
    @SerializedName("entity_ids")
    var entityIds: DataUpdatePerEntity?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReasonText
*/
@Parcelize
data class ReasonText(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReasonsPerEntity
*/
@Parcelize
data class ReasonsPerEntity(
    
    
    
    @SerializedName("entity_key")
    var entityKey: ReasonText?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EntityReason
*/
@Parcelize
data class EntityReason(
    
    
    
    @SerializedName("bag_ids")
    var bagIds: ReasonsPerEntity?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EntityBody
*/
@Parcelize
data class EntityBody(
    
    
    
    @SerializedName("next_status")
    var nextStatus: String?=null,
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdate?=null,
    
    @SerializedName("bag_ids")
    var bagIds: ArrayList<String>?=null,
    
    @SerializedName("reasons")
    var reasons: EntityReason?=null,
    
    @SerializedName("entity_ids")
    var entityIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntitiesDetail
*/
@Parcelize
data class EntitiesDetail(
    
    
    
    @SerializedName("entity_id")
    var entityId: EntityBody?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusPayload
*/
@Parcelize
data class UpdateShipmentStatusPayload(
    
    
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null,
    
    @SerializedName("entities")
    var entities: EntitiesDetail?=null,
    
    @SerializedName("process_in_background")
    var processInBackground: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityTransitionError
*/
@Parcelize
data class EntityTransitionError(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusResponse1
*/
@Parcelize
data class UpdateShipmentStatusResponse1(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("error_entities")
    var errorEntities: ArrayList<EntityTransitionError>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPrices1
*/
@Parcelize
data class ShipmentPrices1(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateConfig1
*/
@Parcelize
data class AffiliateConfig1(
    
    
    
    @SerializedName("app_company_id")
    var appCompanyId: Int?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null,
    
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("ac_id")
    var acId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BuyerDetails
*/
@Parcelize
data class BuyerDetails(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("ajio_site_id")
    var ajioSiteId: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EInvoice
*/
@Parcelize
data class EInvoice(
    
    
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("acknowledge_date")
    var acknowledgeDate: String?=null,
    
    @SerializedName("signed_qr_code")
    var signedQrCode: String?=null,
    
    @SerializedName("acknowledge_no")
    var acknowledgeNo: Int?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null,
    
    @SerializedName("signed_invoice")
    var signedInvoice: String?=null,
    
    @SerializedName("irn")
    var irn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EinvoiceInfo
*/
@Parcelize
data class EinvoiceInfo(
    
    
    
    @SerializedName("invoice")
    var invoice: EInvoice?=null,
    
    @SerializedName("credit_note")
    var creditNote: EInvoice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    
    @SerializedName("forward_affiliate_order_id")
    var forwardAffiliateOrderId: String?=null,
    
    @SerializedName("return_details")
    var returnDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("forward_affiliate_shipment_id")
    var forwardAffiliateShipmentId: String?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("b2b_buyer_details")
    var b2BBuyerDetails: BuyerDetails?=null,
    
    @SerializedName("external")
    var external: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("return_store_node")
    var returnStoreNode: Int?=null,
    
    @SerializedName("auto_trigger_dp_assignment_acf")
    var autoTriggerDpAssignmentAcf: Boolean?=null,
    
    @SerializedName("b2c_buyer_details")
    var b2CBuyerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_awb_number")
    var returnAwbNumber: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("ewaybill_info")
    var ewaybillInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("return_affiliate_shipment_id")
    var returnAffiliateShipmentId: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("return_affiliate_order_id")
    var returnAffiliateOrderId: String?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    
    @SerializedName("formatted")
    var formatted: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("debug_info")
    var debugInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("packaging_name")
    var packagingName: String?=null,
    
    @SerializedName("po_number")
    var poNumber: String?=null,
    
    @SerializedName("store_invoice_updated_date")
    var storeInvoiceUpdatedDate: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PDFLinks
*/
@Parcelize
data class PDFLinks(
    
    
    
    @SerializedName("b2b")
    var b2B: String?=null,
    
    @SerializedName("label_a4")
    var labelA4: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null,
    
    @SerializedName("invoice_a4")
    var invoiceA4: String?=null,
    
    @SerializedName("label_a6")
    var labelA6: String?=null,
    
    @SerializedName("credit_note_url")
    var creditNoteUrl: String?=null,
    
    @SerializedName("invoice_a6")
    var invoiceA6: String?=null,
    
    @SerializedName("invoice_type")
    var invoiceType: String?=null,
    
    @SerializedName("po_invoice")
    var poInvoice: String?=null,
    
    @SerializedName("invoice_pos")
    var invoicePos: String?=null,
    
    @SerializedName("label_pos")
    var labelPos: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("label")
    var label: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null,
    
    @SerializedName("order_item_id")
    var orderItemId: String?=null,
    
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null,
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateDetails
*/
@Parcelize
data class AffiliateDetails(
    
    
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("config")
    var config: AffiliateConfig1?=null,
    
    @SerializedName("shipment_meta")
    var shipmentMeta: ShipmentMeta?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("company_affiliate_tag")
    var companyAffiliateTag: String?=null,
    
    @SerializedName("ad_id")
    var adId: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: PDFLinks?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreAddress
*/
@Parcelize
data class StoreAddress(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("ds_type")
    var dsType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreDocuments
*/
@Parcelize
data class StoreDocuments(
    
    
    
    @SerializedName("gst")
    var gst: Document?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: StoreEwaybill
*/
@Parcelize
data class StoreEwaybill(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: StoreEinvoice
*/
@Parcelize
data class StoreEinvoice(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreGstCredentials
*/
@Parcelize
data class StoreGstCredentials(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: StoreEwaybill?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: StoreEinvoice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EInvoicePortalDetails
*/
@Parcelize
data class EInvoicePortalDetails(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("documents")
    var documents: StoreDocuments?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("ewaybill_portal_details")
    var ewaybillPortalDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: StoreGstCredentials?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_portal_details")
    var einvoicePortalDetails: EInvoicePortalDetails?=null,
    
    @SerializedName("timing")
    var timing: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("brand_id")
    var brandId: @RawValue Any?=null,
    
    @SerializedName("store_active_from")
    var storeActiveFrom: String?=null,
    
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddress?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("login_username")
    var loginUsername: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("mall_name")
    var mallName: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("alohomora_user_id")
    var alohomoraUserId: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("mall_area")
    var mallArea: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("vat_no")
    var vatNo: String?=null,
    
    @SerializedName("parent_store_id")
    var parentStoreId: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("meta")
    var meta: StoreMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserObj
*/
@Parcelize
data class UserObj(
    
    
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("user_oid")
    var userOid: String?=null,
    
    @SerializedName("mongo_user_id")
    var mongoUserId: String?=null,
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("u_id")
    var uId: Int?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Documents1
*/
@Parcelize
data class Documents1(
    
    
    
    @SerializedName("gst")
    var gst: Document?=null,
    
    @SerializedName("pan")
    var pan: Document?=null,
    
    @SerializedName("cin")
    var cin: Document?=null,
    
    @SerializedName("digital_signature")
    var digitalSignature: Document?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyAddress
*/
@Parcelize
data class CompanyAddress(
    
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyMeta
*/
@Parcelize
data class CompanyMeta(
    
    
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("documents")
    var documents: Documents1?=null,
    
    @SerializedName("business_details")
    var businessDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<CompanyAddress>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("contact_details")
    var contactDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Company1
*/
@Parcelize
data class Company1(
    
    
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("exchange_within_days")
    var exchangeWithinDays: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("fynd_a_fit_available")
    var fyndAFitAvailable: Boolean?=null,
    
    @SerializedName("cst")
    var cst: String?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("c_id")
    var cId: Int?=null,
    
    @SerializedName("payment_procesing_charge")
    var paymentProcesingCharge: Double?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    
    @SerializedName("tan_no")
    var tanNo: String?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("commission")
    var commission: Double?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("exchange_allowed")
    var exchangeAllowed: Boolean?=null,
    
    @SerializedName("agreement_start_date")
    var agreementStartDate: Int?=null,
    
    @SerializedName("return_within_days")
    var returnWithinDays: Int?=null,
    
    @SerializedName("vat_no")
    var vatNo: String?=null,
    
    @SerializedName("meta")
    var meta: CompanyMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentStatusCommon
*/
@Parcelize
data class ShipmentStatusCommon(
    
    
    
    @SerializedName("bag_list")
    var bagList: ArrayList<String>?=null,
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    
    @SerializedName("ss_id")
    var ssId: Int?=null,
    
    @SerializedName("status_created_at")
    var statusCreatedAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentGst1
*/
@Parcelize
data class ShipmentGst1(
    
    
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Int?=null,
    
    @SerializedName("tcs_percentage")
    var tcsPercentage: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagGSTDetails
*/
@Parcelize
data class BagGSTDetails(
    
    
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("cgst_tax_percentage")
    var cgstTaxPercentage: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("igst_tax_percentage")
    var igstTaxPercentage: Double?=null,
    
    @SerializedName("sgst_gst_fee")
    var sgstGstFee: String?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("igst_gst_fee")
    var igstGstFee: String?=null,
    
    @SerializedName("sgst_tax_percentage")
    var sgstTaxPercentage: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("cgst_gst_fee")
    var cgstGstFee: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Int?=null,
    
    @SerializedName("tcs_percentage")
    var tcsPercentage: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("branch_url")
    var branchUrl: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("webstore_product_url")
    var webstoreProductUrl: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    
    @SerializedName("last_updated_at")
    var lastUpdatedAt: Int?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagReturnableCancelableStatus
*/
@Parcelize
data class BagReturnableCancelableStatus(
    
    
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagStateMapper1
*/
@Parcelize
data class BagStateMapper1(
    
    
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    
    @SerializedName("bs_id")
    var bsId: Int?=null,
    
    @SerializedName("app_facing")
    var appFacing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagStatusHistory
*/
@Parcelize
data class BagStatusHistory(
    
    
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper1?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("bsh_id")
    var bshId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("invoice_prefix")
    var invoicePrefix: String?=null,
    
    @SerializedName("script_last_ran")
    var scriptLastRan: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("credit_note_expiry_days")
    var creditNoteExpiryDays: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    
    @SerializedName("pickup_location")
    var pickupLocation: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("esp_modified")
    var espModified: @RawValue Any?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: @RawValue Any?=null,
    
    @SerializedName("a_set")
    var aSet: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue Any?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: B2BPODetails
*/
@Parcelize
data class B2BPODetails(
    
    
    
    @SerializedName("total_gst_percentage")
    var totalGstPercentage: Double?=null,
    
    @SerializedName("po_tax_amount")
    var poTaxAmount: Double?=null,
    
    @SerializedName("item_base_price")
    var itemBasePrice: Double?=null,
    
    @SerializedName("po_line_amount")
    var poLineAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagMeta
*/
@Parcelize
data class BagMeta(
    
    
    
    @SerializedName("b2b_po_details")
    var b2BPoDetails: B2BPODetails?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ShipmentProduct
*/
@Parcelize
data class ShipmentProduct(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGSTDetails?=null,
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("b_type")
    var bType: String?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("dates")
    var dates: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("b_id")
    var bId: Int?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: BagMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CurrentShipmentStatus
*/
@Parcelize
data class CurrentShipmentStatus(
    
    
    
    @SerializedName("bag_list")
    var bagList: ArrayList<String>?=null,
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: String?=null,
    
    @SerializedName("ss_id")
    var ssId: Int?=null,
    
    @SerializedName("status_created_at")
    var statusCreatedAt: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: Int?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPayments
*/
@Parcelize
data class ShipmentPayments(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("source_nickname")
    var sourceNickname: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("sp_id")
    var spId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DpDetails1
*/
@Parcelize
data class DpDetails1(
    
    
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("dpd_id")
    var dpdId: String?=null,
    
    @SerializedName("dp_return_charges")
    var dpReturnCharges: Int?=null,
    
    @SerializedName("dp_charges")
    var dpCharges: Int?=null,
    
    @SerializedName("amount_handling_charges")
    var amountHandlingCharges: Int?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentHandOverCustomerContact
*/
@Parcelize
data class ShipmentHandOverCustomerContact(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BillingAddress1
*/
@Parcelize
data class BillingAddress1(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetails1
*/
@Parcelize
data class ShipmentDetails1(
    
    
    
    @SerializedName("delivery_address_json")
    var deliveryAddressJson: DeliveryAddress?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("fulfilment_priority")
    var fulfilmentPriority: Int?=null,
    
    @SerializedName("sd_type")
    var sdType: String?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("created_at")
    var createdAt: Int?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("previous_shipment_id")
    var previousShipmentId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("parent_type")
    var parentType: String?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("hand_over_contact_json")
    var handOverContactJson: ShipmentHandOverCustomerContact?=null,
    
    @SerializedName("billing_address_json")
    var billingAddressJson: BillingAddress1?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: PDFLinks?=null,
    
    @SerializedName("meta")
    var meta: ShipmentMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RequestedDPConfs
*/
@Parcelize
data class RequestedDPConfs(
    
    
    
    @SerializedName("rdpc_id")
    var rdpcId: Int?=null,
    
    @SerializedName("exclude_dps")
    var excludeDps: ArrayList<Int>?=null,
    
    @SerializedName("awb_type")
    var awbType: String?=null,
    
    @SerializedName("ewbn")
    var ewbn: @RawValue Any?=null,
    
    @SerializedName("is_dp_assigned_manually")
    var isDpAssignedManually: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Bag
*/
@Parcelize
data class Bag(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGSTDetails?=null,
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("b_type")
    var bType: String?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("dates")
    var dates: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("b_id")
    var bId: Int?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: BagMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderPrices
*/
@Parcelize
data class OrderPrices(
    
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderTaxDetails
*/
@Parcelize
data class OrderTaxDetails(
    
    
    
    @SerializedName("b2b_gstin_number")
    var b2BGstinNumber: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderMeta
*/
@Parcelize
data class OrderMeta(
    
    
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("employee_id")
    var employeeId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("order_child_entities")
    var orderChildEntities: ArrayList<String>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mongo_cart_id")
    var mongoCartId: @RawValue Any?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("order_platform")
    var orderPlatform: String?=null,
    
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("files")
    var files: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderObj
*/
@Parcelize
data class OrderObj(
    
    
    
    @SerializedName("prices")
    var prices: OrderPrices?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("raw_user_agent")
    var rawUserAgent: String?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("payment_mode_id")
    var paymentModeId: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: String?=null,
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("user_id")
    var userId: Int?=null,
    
    @SerializedName("mongo_cart_id")
    var mongoCartId: @RawValue Any?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("created_time")
    var createdTime: Int?=null,
    
    @SerializedName("o_id")
    var oId: Int?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("tax_details")
    var taxDetails: OrderTaxDetails?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("total_order_value")
    var totalOrderValue: Double?=null,
    
    @SerializedName("affiliate_order_date")
    var affiliateOrderDate: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("cashback_value")
    var cashbackValue: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("meta")
    var meta: OrderMeta?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RtoAddress1
*/
@Parcelize
data class RtoAddress1(
    
    
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("rtoa_id")
    var rtoaId: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddress?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentInvoice1
*/
@Parcelize
data class ShipmentInvoice1(
    
    
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("store_invoice_id")
    var storeInvoiceId: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetailsPlatformResponse
*/
@Parcelize
data class ShipmentDetailsPlatformResponse(
    
    
    
    @SerializedName("prices")
    var prices: ShipmentPrices1?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("order_source")
    var orderSource: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: Store1?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null,
    
    @SerializedName("user")
    var user: UserObj?=null,
    
    @SerializedName("company")
    var company: Company1?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store1?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("qc_required")
    var qcRequired: @RawValue Any?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("shipment_status_history")
    var shipmentStatusHistory: ArrayList<ShipmentStatusCommon>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("fallback_user")
    var fallbackUser: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_gst")
    var shipmentGst: ShipmentGst1?=null,
    
    @SerializedName("products")
    var products: ArrayList<ShipmentProduct>?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: CurrentShipmentStatus?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DpDetails1?=null,
    
    @SerializedName("search_key")
    var searchKey: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("shipment_update_time")
    var shipmentUpdateTime: Double?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("article_details")
    var articleDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("shipment_value")
    var shipmentValue: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentDetails1?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("requested_dp_conf")
    var requestedDpConf: RequestedDPConfs?=null,
    
    @SerializedName("is_processing")
    var isProcessing: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bag>?=null,
    
    @SerializedName("order")
    var order: OrderObj?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rto_address")
    var rtoAddress: RtoAddress1?=null,
    
    @SerializedName("invoice")
    var invoice: ShipmentInvoice1?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorResponse1
*/
@Parcelize
data class ErrorResponse1(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Shipment
*/
@Parcelize
data class Shipment(
    
    
    
    @SerializedName("prices")
    var prices: ShipmentPrices1?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("order_source")
    var orderSource: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: Store1?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null,
    
    @SerializedName("user")
    var user: UserObj?=null,
    
    @SerializedName("company")
    var company: Company1?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store1?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("qc_required")
    var qcRequired: @RawValue Any?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("shipment_status_history")
    var shipmentStatusHistory: ArrayList<ShipmentStatusCommon>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("fallback_user")
    var fallbackUser: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_gst")
    var shipmentGst: ShipmentGst1?=null,
    
    @SerializedName("products")
    var products: ArrayList<ShipmentProduct>?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: CurrentShipmentStatus?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DpDetails1?=null,
    
    @SerializedName("search_key")
    var searchKey: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("shipment_update_time")
    var shipmentUpdateTime: Double?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("article_details")
    var articleDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("shipment_value")
    var shipmentValue: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentDetails1?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("requested_dp_conf")
    var requestedDpConf: RequestedDPConfs?=null,
    
    @SerializedName("is_processing")
    var isProcessing: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bag>?=null,
    
    @SerializedName("order")
    var order: OrderObj?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rto_address")
    var rtoAddress: RtoAddress1?=null,
    
    @SerializedName("invoice")
    var invoice: ShipmentInvoice1?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkShipmentDetailsPlatformResponse
*/
@Parcelize
data class BulkShipmentDetailsPlatformResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Shipment>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderDetailsPlatformResponse
*/
@Parcelize
data class OrderDetailsPlatformResponse(
    
    
    
    @SerializedName("prices")
    var prices: ShipmentPrices1?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("payment_type")
    var paymentType: String?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("order_source")
    var orderSource: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: Store1?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null,
    
    @SerializedName("user")
    var user: UserObj?=null,
    
    @SerializedName("company")
    var company: Company1?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store1?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("qc_required")
    var qcRequired: @RawValue Any?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("transaction_type")
    var transactionType: String?=null,
    
    @SerializedName("shipment_status_history")
    var shipmentStatusHistory: ArrayList<ShipmentStatusCommon>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null,
    
    @SerializedName("fallback_user")
    var fallbackUser: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_gst")
    var shipmentGst: ShipmentGst1?=null,
    
    @SerializedName("products")
    var products: ArrayList<ShipmentProduct>?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: CurrentShipmentStatus?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DpDetails1?=null,
    
    @SerializedName("search_key")
    var searchKey: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("shipment_update_time")
    var shipmentUpdateTime: Double?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("article_details")
    var articleDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null,
    
    @SerializedName("shipment_value")
    var shipmentValue: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentDetails1?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("requested_dp_conf")
    var requestedDpConf: RequestedDPConfs?=null,
    
    @SerializedName("is_processing")
    var isProcessing: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bag>?=null,
    
    @SerializedName("order")
    var order: OrderObj?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rto_address")
    var rtoAddress: RtoAddress1?=null,
    
    @SerializedName("invoice")
    var invoice: ShipmentInvoice1?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetBagsPlatformResponse
*/
@Parcelize
data class GetBagsPlatformResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Bag>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BagDetailsPlatformResponse
*/
@Parcelize
data class BagDetailsPlatformResponse(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGSTDetails?=null,
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("b_type")
    var bType: String?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("dates")
    var dates: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("b_id")
    var bId: Int?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: BagMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: DeleteResponse
*/
@Parcelize
data class DeleteResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    
    @SerializedName("items")
    var items: GetSearchWordsData?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    
    
    @SerializedName("page")
    var page: AutocompletePageAction?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("action")
    var action: AutocompleteAction?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Guide
*/
@Parcelize
data class Guide(
    
    
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ValidateSizeGuide
*/
@Parcelize
data class ValidateSizeGuide(
    
    
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("guide")
    var guide: Guide?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetaFields
*/
@Parcelize
data class MetaFields(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationItemMeta
*/
@Parcelize
data class ApplicationItemMeta(
    
    
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<MetaFields>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SuccessResponse1
*/
@Parcelize
data class SuccessResponse1(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetConfigMetadataResponse
*/
@Parcelize
data class GetConfigMetadataResponse(
    
    
    
    @SerializedName("condition")
    var condition: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeDetailsGroup
*/
@Parcelize
data class AttributeDetailsGroup(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppConfigurationDetail
*/
@Parcelize
data class AppConfigurationDetail(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<AttributeDetailsGroup>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("template_slugs")
    var templateSlugs: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigErrorResponse
*/
@Parcelize
data class ConfigErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageResponseType
*/
@Parcelize
data class PageResponseType(
    
    
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("next")
    var next: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetConfigResponse
*/
@Parcelize
data class GetConfigResponse(
    
    
    
    @SerializedName("page")
    var page: PageResponseType?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigSuccessResponse
*/
@Parcelize
data class ConfigSuccessResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppConfigurationsSort
*/
@Parcelize
data class AppConfigurationsSort(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AllowSingleRequest
*/
@Parcelize
data class AllowSingleRequest(
    
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DefaultKeyRequest
*/
@Parcelize
data class DefaultKeyRequest(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetaDataListingFilterResponse
*/
@Parcelize
data class MetaDataListingFilterResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingFilterMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: MetaDataListingSortMetaResponse
*/
@Parcelize
data class MetaDataListingSortMetaResponse(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MetaDataListingSortResponse
*/
@Parcelize
data class MetaDataListingSortResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingSortMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null,
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    
    @SerializedName("start")
    var start: Double?=null,
    
    @SerializedName("end")
    var end: Double?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("map_values")
    var mapValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("condition")
    var condition: String?=null,
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null,
    
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null,
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationProductVariant
*/
@Parcelize
data class ConfigurationProductVariant(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductVariantConfig>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationProductSimilar
*/
@Parcelize
data class ConfigurationProductSimilar(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductConfig>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null,
    
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: EntityConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("operators")
    var operators: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    
    
    @SerializedName("operators")
    var operators: HashMap<String,String>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionQuery
*/
@Parcelize
data class CollectionQuery(
    
    
    
    @SerializedName("attribute")
    var attribute: String?=null,
    
    @SerializedName("value")
    var value: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("op")
    var op: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    
    
    @SerializedName("portrait")
    var portrait: CollectionImage?=null,
    
    @SerializedName("landscape")
    var landscape: CollectionImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionSchedule
*/
@Parcelize
data class CollectionSchedule(
    
    
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    
    @SerializedName("portrait")
    var portrait: BannerImage?=null,
    
    @SerializedName("landscape")
    var landscape: BannerImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("logo")
    var logo: BannerImage?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null,
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCollection
*/
@Parcelize
data class UpdateCollection(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ItemQueryForUserCollection
*/
@Parcelize
data class ItemQueryForUserCollection(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionItemRequest
*/
@Parcelize
data class CollectionItemRequest(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("item")
    var item: ArrayList<ItemQueryForUserCollection>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    
    @SerializedName("items_not_updated")
    var itemsNotUpdated: ArrayList<Int>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    
    @SerializedName("marked")
    var marked: Price1?=null,
    
    @SerializedName("effective")
    var effective: Price1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("total_sizes")
    var totalSizes: Int?=null,
    
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    
    @SerializedName("item")
    var item: CatalogInsightItem?=null,
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CrossSellingData
*/
@Parcelize
data class CrossSellingData(
    
    
    
    @SerializedName("products")
    var products: Int?=null,
    
    @SerializedName("articles")
    var articles: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    
    @SerializedName("data")
    var data: CrossSellingData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("total_article")
    var totalArticle: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("manager")
    var manager: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterMandatoryDetails
*/
@Parcelize
data class AttributeMasterMandatoryDetails(
    
    
    
    @SerializedName("l3_keys")
    var l3Keys: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AttributeMasterMeta
*/
@Parcelize
data class AttributeMasterMeta(
    
    
    
    @SerializedName("mandatory_details")
    var mandatoryDetails: AttributeMasterMandatoryDetails?=null,
    
    @SerializedName("enriched")
    var enriched: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeSchemaRange
*/
@Parcelize
data class AttributeSchemaRange(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMaster
*/
@Parcelize
data class AttributeMaster(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("mandatory")
    var mandatory: Boolean?=null,
    
    @SerializedName("multi")
    var multi: Boolean?=null,
    
    @SerializedName("range")
    var range: AttributeSchemaRange?=null,
    
    @SerializedName("format")
    var format: String?=null,
    
    @SerializedName("allowed_values")
    var allowedValues: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterFilter
*/
@Parcelize
data class AttributeMasterFilter(
    
    
    
    @SerializedName("depends_on")
    var dependsOn: ArrayList<String>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("indexing")
    var indexing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterDetails
*/
@Parcelize
data class AttributeMasterDetails(
    
    
    
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GenderDetail
*/
@Parcelize
data class GenderDetail(
    
    
    
    @SerializedName("meta")
    var meta: AttributeMasterMeta?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCreateUpdate
*/
@Parcelize
data class DepartmentCreateUpdate(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCreateResponse
*/
@Parcelize
data class DepartmentCreateResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCreateErrorResponse
*/
@Parcelize
data class DepartmentCreateErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BaseUserSerializerWithID
*/
@Parcelize
data class BaseUserSerializerWithID(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: BaseUserSerializerWithID?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: BaseUserSerializerWithID?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("search")
    var search: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentModel
*/
@Parcelize
data class DepartmentModel(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("_cls")
    var cls: @RawValue Any?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    
    @SerializedName("items")
    var items: ProductTemplate?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TemplateDetails
*/
@Parcelize
data class TemplateDetails(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Properties
*/
@Parcelize
data class Properties(
    
    
    
    @SerializedName("item_code")
    var itemCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_publish")
    var productPublish: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader_type")
    var traderType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("command")
    var command: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GlobalValidation
*/
@Parcelize
data class GlobalValidation(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("definitions")
    var definitions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("properties")
    var properties: Properties?=null,
    
    @SerializedName("required")
    var required: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplateValidationData
*/
@Parcelize
data class TemplateValidationData(
    
    
    
    @SerializedName("global_validation")
    var globalValidation: GlobalValidation?=null,
    
    @SerializedName("template_validation")
    var templateValidation: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    
    @SerializedName("template_details")
    var templateDetails: TemplateDetails?=null,
    
    @SerializedName("data")
    var data: TemplateValidationData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: HSNData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadItemsData
*/
@Parcelize
data class ProductDownloadItemsData(
    
    
    
    @SerializedName("brand")
    var brand: ArrayList<String>?=null,
    
    @SerializedName("templates")
    var templates: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadsItems
*/
@Parcelize
data class ProductDownloadsItems(
    
    
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: VerifiedBy?=null,
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("template_tags")
    var templateTags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("data")
    var data: ProductDownloadItemsData?=null,
    
    @SerializedName("seller_id")
    var sellerId: Double?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadsResponse
*/
@Parcelize
data class ProductDownloadsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductDownloadsItems?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductConfigurationDownloads
*/
@Parcelize
data class ProductConfigurationDownloads(
    
    
    
    @SerializedName("multivalue")
    var multivalue: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    
    @SerializedName("catalog_id")
    var catalogId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null,
    
    @SerializedName("google")
    var google: CategoryMappingValues?=null,
    
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    
    @SerializedName("l2")
    var l2: Int?=null,
    
    @SerializedName("l1")
    var l1: Int?=null,
    
    @SerializedName("department")
    var department: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Media2
*/
@Parcelize
data class Media2(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("portrait")
    var portrait: String?=null,
    
    @SerializedName("landscape")
    var landscape: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("media")
    var media: Media2?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("media")
    var media: Media2?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Category>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SingleCategoryResponse
*/
@Parcelize
data class SingleCategoryResponse(
    
    
    
    @SerializedName("data")
    var data: Category?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TeaserTag
*/
@Parcelize
data class TeaserTag(
    
    
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderQuantity
*/
@Parcelize
data class OrderQuantity(
    
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TaxIdentifier
*/
@Parcelize
data class TaxIdentifier(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductCreateUpdate
*/
@Parcelize
data class ProductCreateUpdate(
    
    
    
    @SerializedName("item_code")
    var itemCode: @RawValue Any?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("requester")
    var requester: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: @RawValue Any?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("moq")
    var moq: OrderQuantity?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("bulk_job_id")
    var bulkJobId: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Product>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterSerializer
*/
@Parcelize
data class AttributeMasterSerializer(
    
    
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("variant")
    var variant: Boolean?=null,
    
    @SerializedName("suggestion")
    var suggestion: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("raw_key")
    var rawKey: String?=null,
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductAttributesResponse
*/
@Parcelize
data class ProductAttributesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AttributeMasterSerializer>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    
    
    @SerializedName("valid")
    var valid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetail1
*/
@Parcelize
data class UserDetail1(
    
    
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail1?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail1?=null,
    
    @SerializedName("template")
    var template: ProductTemplate?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    
    @SerializedName("items")
    var items: ProductBulkRequest?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NestedTags
*/
@Parcelize
data class NestedTags(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductTagsViewResponse
*/
@Parcelize
data class ProductTagsViewResponse(
    
    
    
    @SerializedName("items")
    var items: NestedTags?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("retry")
    var retry: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Items>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSizeDeleteDataResponse
*/
@Parcelize
data class ProductSizeDeleteDataResponse(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductSizeDeleteResponse
*/
@Parcelize
data class ProductSizeDeleteResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ProductSizeDeleteDataResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SizeDistribution
*/
@Parcelize
data class SizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InventorySet
*/
@Parcelize
data class InventorySet(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryResponse
*/
@Parcelize
data class InventoryResponse(
    
    
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("sellable_quantity")
    var sellableQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryResponsePaginated
*/
@Parcelize
data class InventoryResponsePaginated(
    
    
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PriceMeta
*/
@Parcelize
data class PriceMeta(
    
    
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: WeightResponse
*/
@Parcelize
data class WeightResponse(
    
    
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DimensionResponse
*/
@Parcelize
data class DimensionResponse(
    
    
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReturnConfig1
*/
@Parcelize
data class ReturnConfig1(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandMeta
*/
@Parcelize
data class BrandMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ManufacturerResponse
*/
@Parcelize
data class ManufacturerResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: QuantityBase
*/
@Parcelize
data class QuantityBase(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Trader1
*/
@Parcelize
data class Trader1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventorySellerResponse
*/
@Parcelize
data class InventorySellerResponse(
    
    
    
    @SerializedName("price")
    var price: PriceMeta?=null,
    
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("created_by")
    var createdBy: BaseUserSerializerWithID?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig1?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("net_quantity_value")
    var netQuantityValue: Double?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("net_quantity_unit")
    var netQuantityUnit: @RawValue Any?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta?=null,
    
    @SerializedName("company")
    var company: CompanyMeta?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse?=null,
    
    @SerializedName("store")
    var store: StoreMeta?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader1>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: BaseUserSerializerWithID?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("fynd_meta")
    var fyndMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@Parcelize
data class InventorySellerIdentifierResponsePaginated(
    
    
    
    @SerializedName("items")
    var items: ArrayList<InventorySellerResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkInventoryGetItems
*/
@Parcelize
data class BulkInventoryGetItems(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkInventoryGet
*/
@Parcelize
data class BulkInventoryGet(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkInventoryGetItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryJobPayload
*/
@Parcelize
data class InventoryJobPayload(
    
    
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<InventoryJobPayload>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryExportResponse
*/
@Parcelize
data class InventoryExportResponse(
    
    
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryPayload
*/
@Parcelize
data class InventoryPayload(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryRequestSchemaV2
*/
@Parcelize
data class InventoryRequestSchemaV2(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<InventoryPayload>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryFailedReason
*/
@Parcelize
data class InventoryFailedReason(
    
    
    
    @SerializedName("errors")
    var errors: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryResponseItem
*/
@Parcelize
data class InventoryResponseItem(
    
    
    
    @SerializedName("data")
    var data: InventoryPayload?=null,
    
    @SerializedName("reason")
    var reason: InventoryFailedReason?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryUpdateResponse
*/
@Parcelize
data class InventoryUpdateResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponseItem>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HsnUpsert
*/
@Parcelize
data class HsnUpsert(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesObject
*/
@Parcelize
data class HsnCodesObject(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCode
*/
@Parcelize
data class HsnCode(
    
    
    
    @SerializedName("data")
    var data: HsnCodesObject?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageResponse
*/
@Parcelize
data class PageResponse(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesListingResponse
*/
@Parcelize
data class HsnCodesListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<HsnCodesObject>?=null,
    
    @SerializedName("page")
    var page: PageResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkHsnUpsert
*/
@Parcelize
data class BulkHsnUpsert(
    
    
    
    @SerializedName("data")
    var data: ArrayList<HsnUpsert>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BulkHsnResponse
*/
@Parcelize
data class BulkHsnResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TaxSlab
*/
@Parcelize
data class TaxSlab(
    
    
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("cess")
    var cess: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HSNDataInsertV2
*/
@Parcelize
data class HSNDataInsertV2(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<TaxSlab>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesListingResponseSchemaV2
*/
@Parcelize
data class HsnCodesListingResponseSchemaV2(
    
    
    
    @SerializedName("items")
    var items: ArrayList<HSNDataInsertV2>?=null,
    
    @SerializedName("page")
    var page: PageResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null,
    
    @SerializedName("department")
    var department: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null,
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationProductListingResponse
*/
@Parcelize
data class ApplicationProductListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("operators")
    var operators: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryPage
*/
@Parcelize
data class InventoryPage(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryStockResponse
*/
@Parcelize
data class InventoryStockResponse(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: InventoryPage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ArticleQuery
*/
@Parcelize
data class ArticleQuery(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreArticle
*/
@Parcelize
data class AssignStoreArticle(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArticleQuery?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStore
*/
@Parcelize
data class AssignStore(
    
    
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<AssignStoreArticle>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignment1
*/
@Parcelize
data class ArticleAssignment1(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StoreAssignResponse
*/
@Parcelize
data class StoreAssignResponse(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("store_pincode")
    var storePincode: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BaseUserSerializer
*/
@Parcelize
data class BaseUserSerializer(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
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
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("created_by")
    var createdBy: BaseUserSerializer?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: BaseUserSerializer?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: BaseUserSerializer?=null,
    
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
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    
    @SerializedName("order")
    var order: String?=null,
    
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("created_by")
    var createdBy: BaseUserSerializer?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: BaseUserSerializer?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: BaseUserSerializer?=null
    
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
    Model: ApplicationBrandJson
*/
@Parcelize
data class ApplicationBrandJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationCategoryJson
*/
@Parcelize
data class ApplicationCategoryJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationStoreJson
*/
@Parcelize
data class ApplicationStoreJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
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
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
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
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer>?=null
    
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
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCompany
*/
@Parcelize
data class UpdateCompany(
    
    
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer1>?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CreateUpdateAddressSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null
    
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
    
    
    
    @SerializedName("store")
    var store: DocumentsObj?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
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
    
    
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
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
    
    
    
    @SerializedName("market_channels")
    var marketChannels: ArrayList<String>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("details")
    var details: CompanyDetails?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyBrandSerializer
*/
@Parcelize
data class CompanyBrandSerializer(
    
    
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("brand")
    var brand: GetBrandResponseSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("company")
    var company: CompanySerializer?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null
    
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
    
    
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company")
    var company: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("company")
    var company: Int?=null
    
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
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var cdn: CDN?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var tags: ArrayList<String>?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var success: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkUploadResponse
*/
@Parcelize
data class BulkUploadResponse(
    
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("task")
    var task: CopyFileTask?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReqConfiguration
*/
@Parcelize
data class ReqConfiguration(
    
    
    
    @SerializedName("concurrency")
    var concurrency: Int?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DbRecord>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: WebRedirect
*/
@Parcelize
data class WebRedirect(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CampaignShortLink
*/
@Parcelize
data class CampaignShortLink(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("medium")
    var medium: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Attribution
*/
@Parcelize
data class Attribution(
    
    
    
    @SerializedName("campaign_cookie_expiry")
    var campaignCookieExpiry: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    var campaign: CampaignShortLink?=null,
    
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    
    @SerializedName("campaign")
    var campaign: CampaignShortLink?=null,
    
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ErrorRes
*/
@Parcelize
data class ErrorRes(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}




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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GenericDTO
*/
@Parcelize
data class GenericDTO(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: JobConfigDTO
*/
@Parcelize
data class JobConfigDTO(
    
    
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("integration_data")
    var integrationData: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TaskDTO
*/
@Parcelize
data class TaskDTO(
    
    
    
    @SerializedName("type")
    var type: Int?=null,
    
    @SerializedName("group_list")
    var groupList: ArrayList<GenericDTO>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogMasterConfig
*/
@Parcelize
data class CatalogMasterConfig(
    
    
    
    @SerializedName("source_slug")
    var sourceSlug: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var openTags: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var optionalProperties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DBConnectionProfile
*/
@Parcelize
data class DBConnectionProfile(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DBParamConfig
*/
@Parcelize
data class DBParamConfig(
    
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DocMappingConfig
*/
@Parcelize
data class DocMappingConfig(
    
    
    
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    
    @SerializedName("unwind_field")
    var unwindField: String?=null,
    
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var properties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var properties: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var requestParams: HashMap<String,String>?=null,
    
    @SerializedName("http_method")
    var httpMethod: String?=null,
    
    @SerializedName("request_payload")
    var requestPayload: String?=null,
    
    @SerializedName("local_path")
    var localPath: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var properties: HashMap<String,String>?=null,
    
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
    var params: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JsonDocConfig
*/
@Parcelize
data class JsonDocConfig(
    
    
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MongoDocConfig
*/
@Parcelize
data class MongoDocConfig(
    
    
    
    @SerializedName("collection_name")
    var collectionName: String?=null,
    
    @SerializedName("find_query")
    var findQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    
    @SerializedName("aggregate_pipeline")
    var aggregatePipeline: @RawValue ArrayList<HashMap<String,HashMap<String,Any>>>?=null,
    
    @SerializedName("skip_save")
    var skipSave: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PropBeanConfig
*/
@Parcelize
data class PropBeanConfig(
    
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("mapping")
    var mapping: HashMap<String,PropBeanConfig>?=null,
    
    @SerializedName("optional")
    var optional: Boolean?=null,
    
    @SerializedName("send")
    var send: Send?=null,
    
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,HashMap<String,Any>>>?=null,
    
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
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Send
*/
@Parcelize
data class Send(
    
    
    
    @SerializedName("raw")
    var raw: Boolean?=null,
    
    @SerializedName("processed")
    var processed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var properties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var query: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TaskParam
*/
@Parcelize
data class TaskParam(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: JobStepsDTO
*/
@Parcelize
data class JobStepsDTO(
    
    
    
    @SerializedName("step_name")
    var stepName: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("step_execution_time")
    var stepExecutionTime: Int?=null,
    
    @SerializedName("start_count")
    var startCount: Int?=null,
    
    @SerializedName("end_count")
    var endCount: Int?=null,
    
    @SerializedName("deleted_count")
    var deletedCount: Int?=null,
    
    @SerializedName("processed_start_time")
    var processedStartTime: String?=null,
    
    @SerializedName("processed_at")
    var processedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ResponseEnvelopeListJobStepsDTO
*/
@Parcelize
data class ResponseEnvelopeListJobStepsDTO(
    
    
    
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
    var items: ArrayList<JobStepsDTO>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<JobStepsDTO>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JobHistoryDto
*/
@Parcelize
data class JobHistoryDto(
    
    
    
    @SerializedName("total_added_count")
    var totalAddedCount: Int?=null,
    
    @SerializedName("total_updated_count")
    var totalUpdatedCount: Int?=null,
    
    @SerializedName("total_suppressed_count")
    var totalSuppressedCount: Int?=null,
    
    @SerializedName("total_initial_count")
    var totalInitialCount: Int?=null,
    
    @SerializedName("job_id")
    var jobId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("processed_on")
    var processedOn: String?=null,
    
    @SerializedName("filename")
    var filename: ArrayList<String>?=null,
    
    @SerializedName("error_type")
    var errorType: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JobMetricsDto
*/
@Parcelize
data class JobMetricsDto(
    
    
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("is_run_more_than_usual")
    var isRunMoreThanUsual: String?=null,
    
    @SerializedName("job_history")
    var jobHistory: ArrayList<JobHistoryDto>?=null,
    
    @SerializedName("total_success_count")
    var totalSuccessCount: Int?=null,
    
    @SerializedName("total_failure_count")
    var totalFailureCount: Int?=null,
    
    @SerializedName("total_warning_count")
    var totalWarningCount: Int?=null,
    
    @SerializedName("total_suppressed_count")
    var totalSuppressedCount: Int?=null,
    
    @SerializedName("total_job_runs")
    var totalJobRuns: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ResponseEnvelopeJobMetricsDto
*/
@Parcelize
data class ResponseEnvelopeJobMetricsDto(
    
    
    
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
    var items: JobMetricsDto?=null,
    
    @SerializedName("payload")
    var payload: JobMetricsDto?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




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
    var loyaltyPoints: LoyaltyPointsConfig?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("only_verified_products")
    var onlyVerifiedProducts: Boolean?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("exclude_category")
    var excludeCategory: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("company_store")
    var companyStore: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryBrand
*/
@Parcelize
data class InventoryBrand(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppStoreRules
*/
@Parcelize
data class AppStoreRules(
    
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryCategory
*/
@Parcelize
data class InventoryCategory(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("categories")
    var categories: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryPrice
*/
@Parcelize
data class InventoryPrice(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryDiscount
*/
@Parcelize
data class InventoryDiscount(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AuthenticationConfig
*/
@Parcelize
data class AuthenticationConfig(
    
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("provider")
    var provider: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignmentConfig
*/
@Parcelize
data class ArticleAssignmentConfig(
    
    
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRules?=null,
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignmentRules
*/
@Parcelize
data class ArticleAssignmentRules(
    
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriority?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: StorePriority
*/
@Parcelize
data class StorePriority(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("storetype_order")
    var storetypeOrder: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeliveryCharges
*/
@Parcelize
data class DeliveryCharges(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("charges")
    var charges: Charges?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    
    @SerializedName("charges")
    var charges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CallbackUrl
*/
@Parcelize
data class CallbackUrl(
    
    
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("web")
    var web: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeConfig
*/
@Parcelize
data class PaymentModeConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppOrderConfig
*/
@Parcelize
data class AppOrderConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("force_reassignment")
    var forceReassignment: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoyaltyPointsConfig
*/
@Parcelize
data class LoyaltyPointsConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var loyaltyPoints: LoyaltyPointsConfig?=null,
    
    @SerializedName("comms_enabled")
    var commsEnabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandCompanyInfo
*/
@Parcelize
data class BrandCompanyInfo(
    
    
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyByBrandsRequest
*/
@Parcelize
data class CompanyByBrandsRequest(
    
    
    
    @SerializedName("brands")
    var brands: Int?=null,
    
    @SerializedName("search_text")
    var searchText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyByBrandsResponse
*/
@Parcelize
data class CompanyByBrandsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandCompanyInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreByBrandsResponse
*/
@Parcelize
data class StoreByBrandsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandStoreInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandsByCompanyResponse
*/
@Parcelize
data class BrandsByCompanyResponse(
    
    
    
    @SerializedName("brands")
    var brands: CompanyBrandInfo?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateAppResponse
*/
@Parcelize
data class CreateAppResponse(
    
    
    
    @SerializedName("app")
    var app: Application?=null,
    
    @SerializedName("configuration")
    var configuration: ApplicationInventory?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationsResponse
*/
@Parcelize
data class ApplicationsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Application>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LandingImage
*/
@Parcelize
data class LandingImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SplashImage
*/
@Parcelize
data class SplashImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BuildVersionHistory
*/
@Parcelize
data class BuildVersionHistory(
    
    
    
    @SerializedName("versions")
    var versions: BuildVersion?=null,
    
    @SerializedName("latest_available_version_name")
    var latestAvailableVersionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DefaultCurrency
*/
@Parcelize
data class DefaultCurrency(
    
    
    
    @SerializedName("ref")
    var ref: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DomainAdd
*/
@Parcelize
data class DomainAdd(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("txt_records")
    var txtRecords: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DomainAddRequest
*/
@Parcelize
data class DomainAddRequest(
    
    
    
    @SerializedName("domain")
    var domain: DomainAdd?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DomainsResponse
*/
@Parcelize
data class DomainsResponse(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateDomain
*/
@Parcelize
data class UpdateDomain(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateDomainTypeRequest
*/
@Parcelize
data class UpdateDomainTypeRequest(
    
    
    
    @SerializedName("domain")
    var domain: UpdateDomain?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DomainStatusRequest
*/
@Parcelize
data class DomainStatusRequest(
    
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DomainStatus
*/
@Parcelize
data class DomainStatus(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DomainStatusResponse
*/
@Parcelize
data class DomainStatusResponse(
    
    
    
    @SerializedName("connected")
    var connected: Boolean?=null,
    
    @SerializedName("status")
    var status: ArrayList<DomainStatus>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DomainSuggestionsRequest
*/
@Parcelize
data class DomainSuggestionsRequest(
    
    
    
    @SerializedName("domain_url")
    var domainUrl: String?=null,
    
    @SerializedName("custom")
    var custom: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DomainSuggestionsResponse
*/
@Parcelize
data class DomainSuggestionsResponse(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<DomainSuggestion>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetIntegrationsOptInsResponse
*/
@Parcelize
data class GetIntegrationsOptInsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationOptIn>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var meta: ArrayList<IntegrationMeta>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyValidator
*/
@Parcelize
data class CompanyValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreValidator
*/
@Parcelize
data class StoreValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryValidator
*/
@Parcelize
data class InventoryValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderValidator
*/
@Parcelize
data class OrderValidator(
    
    
    
    @SerializedName("json_schema")
    var jsonSchema: ArrayList<JsonSchema>?=null,
    
    @SerializedName("browser_script")
    var browserScript: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    var meta: ArrayList<IntegrationMeta>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: IntegrationConfigResponse
*/
@Parcelize
data class IntegrationConfigResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationLevel>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var lastPatch: ArrayList<LastPatch>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<IntegrationMeta>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateIntegrationLevelRequest
*/
@Parcelize
data class UpdateIntegrationLevelRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<IntegrationLevel>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    var lastPatch: ArrayList<LastPatch>?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OtherEntityData
*/
@Parcelize
data class OtherEntityData(
    
    
    
    @SerializedName("article_identifier")
    var articleIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("only_verified_products")
    var onlyVerifiedProducts: Boolean?=null,
    
    @SerializedName("payment")
    var payment: InventoryPaymentConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: InventoryArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppDomain
*/
@Parcelize
data class AppDomain(
    
    
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CompaniesResponse
*/
@Parcelize
data class CompaniesResponse(
    
    
    
    @SerializedName("items")
    var items: AppInventoryCompanies?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoresResponse
*/
@Parcelize
data class StoresResponse(
    
    
    
    @SerializedName("items")
    var items: AppInventoryStores?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("only_deployed")
    var onlyDeployed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    var app: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStoreConfig
*/
@Parcelize
data class OrderingStoreConfig(
    
    
    
    @SerializedName("deployment_meta")
    var deploymentMeta: DeploymentMeta?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OtherSellerCompany
*/
@Parcelize
data class OtherSellerCompany(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OtherSellerApplications
*/
@Parcelize
data class OtherSellerApplications(
    
    
    
    @SerializedName("items")
    var items: ArrayList<OtherSellerApplication>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptedCompany
*/
@Parcelize
data class OptedCompany(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptedInventory
*/
@Parcelize
data class OptedInventory(
    
    
    
    @SerializedName("opt_type")
    var optType: OptType?=null,
    
    @SerializedName("items")
    var items: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptType
*/
@Parcelize
data class OptType(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptOutInventory
*/
@Parcelize
data class OptOutInventory(
    
    
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    
    @SerializedName("company")
    var company: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    
    
    @SerializedName("write_key")
    var writeKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    
    
    @SerializedName("public_key")
    var publicKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: RewardPointsConfig
*/
@Parcelize
data class RewardPointsConfig(
    
    
    
    @SerializedName("credit")
    var credit: Credit?=null,
    
    @SerializedName("debit")
    var debit: Debit?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Credit
*/
@Parcelize
data class Credit(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null,
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


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
    var googleMap: Boolean?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    
    @SerializedName("facebook")
    var facebook: FacebookLink?=null,
    
    @SerializedName("instagram")
    var instagram: InstagramLink?=null,
    
    @SerializedName("twitter")
    var twitter: TwitterLink?=null,
    
    @SerializedName("pinterest")
    var pinterest: PinterestLink?=null,
    
    @SerializedName("google_plus")
    var googlePlus: GooglePlusLink?=null,
    
    @SerializedName("youtube")
    var youtube: YoutubeLink?=null,
    
    @SerializedName("linked_in")
    var linkedIn: LinkedInLink?=null,
    
    @SerializedName("vimeo")
    var vimeo: VimeoLink?=null,
    
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FacebookLink
*/
@Parcelize
data class FacebookLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InstagramLink
*/
@Parcelize
data class InstagramLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TwitterLink
*/
@Parcelize
data class TwitterLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PinterestLink
*/
@Parcelize
data class PinterestLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GooglePlusLink
*/
@Parcelize
data class GooglePlusLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: YoutubeLink
*/
@Parcelize
data class YoutubeLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LinkedInLink
*/
@Parcelize
data class LinkedInLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: VimeoLink
*/
@Parcelize
data class VimeoLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppCurrencyResponse
*/
@Parcelize
data class AppCurrencyResponse(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: DefaultCurrency?=null,
    
    @SerializedName("supported_currency")
    var supportedCurrency: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreLatLong
*/
@Parcelize
data class StoreLatLong(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var latLong: StoreLatLong?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStoresResponse
*/
@Parcelize
data class OrderingStoresResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Validity
*/
@Parcelize
data class Validity(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DisplayMetaDict
*/
@Parcelize
data class DisplayMetaDict(
    
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DisplayMeta
*/
@Parcelize
data class DisplayMeta(
    
    
    
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    
    @SerializedName("value_type")
    var valueType: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponAuthor
*/
@Parcelize
data class CouponAuthor(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CouponAction
*/
@Parcelize
data class CouponAction(
    
    
    
    @SerializedName("txn_mode")
    var txnMode: String?=null,
    
    @SerializedName("action_date")
    var actionDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: State
*/
@Parcelize
data class State(
    
    
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    
    
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null,
    
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PostOrder
*/
@Parcelize
data class PostOrder(
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PaymentAllowValue
*/
@Parcelize
data class PaymentAllowValue(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PaymentModes
*/
@Parcelize
data class PaymentModes(
    
    
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModes>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: CouponAdd?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    
    @SerializedName("schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionAction
*/
@Parcelize
data class PromotionAction(
    
    
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("action_date")
    var actionDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompareObject
*/
@Parcelize
data class CompareObject(
    
    
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null,
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ItemCriteria
*/
@Parcelize
data class ItemCriteria(
    
    
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null,
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObject?=null,
    
    @SerializedName("cart_total")
    var cartTotal: CompareObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountOffer
*/
@Parcelize
data class DiscountOffer(
    
    
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null,
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountRule
*/
@Parcelize
data class DiscountRule(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriteria?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("offer")
    var offer: DiscountOffer?=null,
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionAuthor
*/
@Parcelize
data class PromotionAuthor(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DisplayMeta1
*/
@Parcelize
data class DisplayMeta1(
    
    
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ownership1
*/
@Parcelize
data class Ownership1(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionDateMeta
*/
@Parcelize
data class PromotionDateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionSchedule
*/
@Parcelize
data class PromotionSchedule(
    
    
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UsesRemaining1
*/
@Parcelize
data class UsesRemaining1(
    
    
    
    @SerializedName("user")
    var user: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UsesRestriction1
*/
@Parcelize
data class UsesRestriction1(
    
    
    
    @SerializedName("maximum")
    var maximum: UsesRemaining1?=null,
    
    @SerializedName("remaining")
    var remaining: UsesRemaining1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PostOrder1
*/
@Parcelize
data class PostOrder1(
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UserRegistered
*/
@Parcelize
data class UserRegistered(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentAllowValue1
*/
@Parcelize
data class PaymentAllowValue1(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PromotionPaymentModes
*/
@Parcelize
data class PromotionPaymentModes(
    
    
    
    @SerializedName("uses")
    var uses: PaymentAllowValue1?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Restrictions1
*/
@Parcelize
data class Restrictions1(
    
    
    
    @SerializedName("uses")
    var uses: UsesRestriction1?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegistered?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PromotionPaymentModes>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null,
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Visibility
*/
@Parcelize
data class Visibility(
    
    
    
    @SerializedName("coupon_list")
    var couponList: Boolean?=null,
    
    @SerializedName("pdp")
    var pdp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionListItem
*/
@Parcelize
data class PromotionListItem(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionsResponse
*/
@Parcelize
data class PromotionsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: PromotionListItem?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionAdd
*/
@Parcelize
data class PromotionAdd(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionUpdate
*/
@Parcelize
data class PromotionUpdate(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionPartialUpdate
*/
@Parcelize
data class PromotionPartialUpdate(
    
    
    
    @SerializedName("schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CartItem
*/
@Parcelize
data class CartItem(
    
    
    
    @SerializedName("product_id")
    var productId: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenapiCartDetailsRequest
*/
@Parcelize
data class OpenapiCartDetailsRequest(
    
    
    
    @SerializedName("cart_items")
    var cartItems: CartItem?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("selling")
    var selling: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: ProductPrice?=null,
    
    @SerializedName("base")
    var base: ProductPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: BasePrice?=null,
    
    @SerializedName("base")
    var base: BasePrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromoMeta
*/
@Parcelize
data class PromoMeta(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductAction
*/
@Parcelize
data class ProductAction(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ActionQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenapiCartDetailsResponse
*/
@Parcelize
data class OpenapiCartDetailsResponse(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiErrorResponse
*/
@Parcelize
data class OpenApiErrorResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCartServiceabilityRequest
*/
@Parcelize
data class OpenApiCartServiceabilityRequest(
    
    
    
    @SerializedName("cart_items")
    var cartItems: CartItem?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null,
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCartServiceabilityResponse
*/
@Parcelize
data class OpenApiCartServiceabilityResponse(
    
    
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiFiles
*/
@Parcelize
data class OpenApiFiles(
    
    
    
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CartItemMeta
*/
@Parcelize
data class CartItemMeta(
    
    
    
    @SerializedName("primary_item")
    var primaryItem: Boolean?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpenApiOrderItem
*/
@Parcelize
data class OpenApiOrderItem(
    
    
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiPlatformCheckoutReq
*/
@Parcelize
data class OpenApiPlatformCheckoutReq(
    
    
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItem>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddress?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCheckoutResponse
*/
@Parcelize
data class OpenApiCheckoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("order_ref_id")
    var orderRefId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: AppUser
*/
@Parcelize
data class AppUser(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("block_reason")
    var blockReason: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: E
*/
@Parcelize
data class E(
    
    
    
    @SerializedName("code")
    var code: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Giveaway
*/
@Parcelize
data class Giveaway(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("audience")
    var audience: RewardsAudience?=null,
    
    @SerializedName("banner_image")
    var bannerImage: Asset?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rule")
    var rule: RewardsRule?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GiveawayResponse
*/
@Parcelize
data class GiveawayResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Giveaway>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HistoryPretty
*/
@Parcelize
data class HistoryPretty(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("claimed")
    var claimed: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("remaining_points")
    var remainingPoints: Double?=null,
    
    @SerializedName("text_1")
    var text1: String?=null,
    
    @SerializedName("text_2")
    var text2: String?=null,
    
    @SerializedName("text_3")
    var text3: String?=null,
    
    @SerializedName("txn_name")
    var txnName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HistoryRes
*/
@Parcelize
data class HistoryRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<HistoryPretty>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Offer
*/
@Parcelize
data class Offer(
    
    
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("banner_image")
    var bannerImage: Asset?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rule")
    var rule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("share")
    var share: ShareMessages?=null,
    
    @SerializedName("sub_text")
    var subText: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Points
*/
@Parcelize
data class Points(
    
    
    
    @SerializedName("available")
    var available: Double?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Referral
*/
@Parcelize
data class Referral(
    
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: RewardUser
*/
@Parcelize
data class RewardUser(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("referral")
    var referral: Referral?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("user_block_reason")
    var userBlockReason: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RewardsAudience
*/
@Parcelize
data class RewardsAudience(
    
    
    
    @SerializedName("header_user_id")
    var headerUserId: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RewardsRule
*/
@Parcelize
data class RewardsRule(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("facebook")
    var facebook: String?=null,
    
    @SerializedName("fallback")
    var fallback: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("messenger")
    var messenger: String?=null,
    
    @SerializedName("sms")
    var sms: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("twitter")
    var twitter: String?=null,
    
    @SerializedName("whatsapp")
    var whatsapp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserRes
*/
@Parcelize
data class UserRes(
    
    
    
    @SerializedName("points")
    var points: Points?=null,
    
    @SerializedName("user")
    var user: RewardUser?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatsGroups
*/
@Parcelize
data class StatsGroups(
    
    
    
    @SerializedName("groups")
    var groups: ArrayList<StatGroup>?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatsGroupComponents
*/
@Parcelize
data class StatsGroupComponents(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("components")
    var components: ArrayList<StatsGroupComponent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReceivedAt
*/
@Parcelize
data class ReceivedAt(
    
    
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    var eventType: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ExportJobRes
*/
@Parcelize
data class ExportJobRes(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("job_id")
    var jobId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetLogsListRes
*/
@Parcelize
data class GetLogsListRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<MkpLogsResp>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SearchLogRes
*/
@Parcelize
data class SearchLogRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<LogInfo>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: ValidityObject
*/
@Parcelize
data class ValidityObject(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateDiscount
*/
@Parcelize
data class CreateUpdateDiscount(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_ids")
    var appIds: ArrayList<String>?=null,
    
    @SerializedName("extension_ids")
    var extensionIds: ArrayList<String>?=null,
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("discount_level")
    var discountLevel: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("validity")
    var validity: ValidityObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountJob
*/
@Parcelize
data class DiscountJob(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_ids")
    var appIds: ArrayList<String>?=null,
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("discount_level")
    var discountLevel: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("validity")
    var validity: ValidityObject?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetails?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetails?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListOrCalender
*/
@Parcelize
data class ListOrCalender(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DiscountJob>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FileJobResponse
*/
@Parcelize
data class FileJobResponse(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("body")
    var body: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("file_type")
    var fileType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DownloadFileJob
*/
@Parcelize
data class DownloadFileJob(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CancelJobResponse
*/
@Parcelize
data class CancelJobResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UserDetails
*/
@Parcelize
data class UserDetails(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BadRequestObject
*/
@Parcelize
data class BadRequestObject(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}




/*
    Model: AddProxyReq
*/
@Parcelize
data class AddProxyReq(
    
    
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AddProxyResponse
*/
@Parcelize
data class AddProxyResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RemoveProxyResponse
*/
@Parcelize
data class RemoveProxyResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: EventConfig
*/
@Parcelize
data class EventConfig(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EventConfigList
*/
@Parcelize
data class EventConfigList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EventConfig>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EventConfigResponse
*/
@Parcelize
data class EventConfigResponse(
    
    
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubscriberConfigList
*/
@Parcelize
data class SubscriberConfigList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SubscriberResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EventProcessedStatus
*/
@Parcelize
data class EventProcessedStatus(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("attempt")
    var attempt: Int?=null,
    
    @SerializedName("response_code")
    var responseCode: String?=null,
    
    @SerializedName("response_message")
    var responseMessage: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("processed_on")
    var processedOn: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EventPayload
*/
@Parcelize
data class EventPayload(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("event_trace_id")
    var eventTraceId: String?=null,
    
    @SerializedName("message_id")
    var messageId: String?=null,
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriberConfig
*/
@Parcelize
data class SubscriberConfig(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("event_id")
    var eventId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriberResponse
*/
@Parcelize
data class SubscriberResponse(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("webhook_url")
    var webhookUrl: String?=null,
    
    @SerializedName("association")
    var association: Association?=null,
    
    @SerializedName("custom_headers")
    var customHeaders: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("status")
    var status: SubscriberStatus?=null,
    
    @SerializedName("auth_meta")
    var authMeta: AuthMeta?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("event_configs")
    var eventConfigs: ArrayList<EventConfig>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubscriberEvent
*/
@Parcelize
data class SubscriberEvent(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: Int?=null,
    
    @SerializedName("event_id")
    var eventId: Int?=null,
    
    @SerializedName("created_date")
    var createdDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AuthMeta
*/
@Parcelize
data class AuthMeta(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Association
*/
@Parcelize
data class Association(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: ArrayList<String>?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("criteria")
    var criteria: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EventConfigBase
*/
@Parcelize
data class EventConfigBase(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null,
    
    @SerializedName("event_type")
    var eventType: String?=null,
    
    @SerializedName("event_category")
    var eventCategory: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: RequestBodyAuditLog
*/
@Parcelize
data class RequestBodyAuditLog(
    
    
    
    @SerializedName("log_meta")
    var logMeta: LogMetaObj?=null,
    
    @SerializedName("log_payload")
    var logPayload: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateLogResponse
*/
@Parcelize
data class CreateLogResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("internal_message")
    var internalMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LogMetaObj
*/
@Parcelize
data class LogMetaObj(
    
    
    
    @SerializedName("modifier")
    var modifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("entity")
    var entity: EntityObject?=null,
    
    @SerializedName("device_info")
    var deviceInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("location")
    var location: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityObject
*/
@Parcelize
data class EntityObject(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LogSchemaResponse
*/
@Parcelize
data class LogSchemaResponse(
    
    
    
    @SerializedName("docs")
    var docs: ArrayList<LogDocs>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LogDocs
*/
@Parcelize
data class LogDocs(
    
    
    
    @SerializedName("entity")
    var entity: EntityObj?=null,
    
    @SerializedName("modifier")
    var modifier: Modifier?=null,
    
    @SerializedName("device_info")
    var deviceInfo: DeviceInfo?=null,
    
    @SerializedName("location")
    var location: Location?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("sessions")
    var sessions: String?=null,
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("logs")
    var logs: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityObj
*/
@Parcelize
data class EntityObj(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("entity_details")
    var entityDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Modifier
*/
@Parcelize
data class Modifier(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("as_administrator")
    var asAdministrator: Boolean?=null,
    
    @SerializedName("user_details")
    var userDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeviceInfo
*/
@Parcelize
data class DeviceInfo(
    
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Location
*/
@Parcelize
data class Location(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EntityTypesResponse
*/
@Parcelize
data class EntityTypesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<EntityTypeObj>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EntityTypeObj
*/
@Parcelize
data class EntityTypeObj(
    
    
    
    @SerializedName("entity_value")
    var entityValue: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


