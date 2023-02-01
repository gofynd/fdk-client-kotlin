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
    var name: String?=null,
    
    @SerializedName("is_predefined")
    var isPredefined: Boolean?=null
    
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
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
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
    
    @SerializedName("support_communication")
    var supportCommunication: CommunicationDetails?=null,
    
    @SerializedName("show_support_dris")
    var showSupportDris: Boolean?=null,
    
    @SerializedName("integration")
    var integration: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FeedbackForm
*/
@Parcelize
data class FeedbackForm(
    
    
    
    @SerializedName("inputs")
    var inputs: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("timestamps")
    var timestamps: @RawValue HashMap<String,Any>?=null
    
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
    var display: String?=null,
    
    @SerializedName("sub_categories")
    var subCategories: TicketSubCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("sub_categories")
    var subCategories: TicketCategory?=null,
    
    @SerializedName("group_id")
    var groupId: Double?=null,
    
    @SerializedName("feedback_form")
    var feedbackForm: FeedbackForm?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryData
*/
@Parcelize
data class CategoryData(
    
    
    
    @SerializedName("list")
    var list: TicketCategory?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: IntegrationConfig
*/
@Parcelize
data class IntegrationConfig(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null,
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("create_ticket_apikey")
    var createTicketApikey: String?=null,
    
    @SerializedName("update_ticket_apikey")
    var updateTicketApikey: String?=null,
    
    @SerializedName("category_sync_apikey")
    var categorySyncApikey: String?=null,
    
    @SerializedName("category_data")
    var categoryData: CategoryData?=null,
    
    @SerializedName("webhook_apikey")
    var webhookApikey: String?=null,
    
    @SerializedName("config_completed")
    var configCompleted: Boolean?=null,
    
    @SerializedName("allow_ticket_creation")
    var allowTicketCreation: Boolean?=null,
    
    @SerializedName("show_listing")
    var showListing: Boolean?=null
    
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
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("sub_category")
    var subCategory: String?=null,
    
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
    
    @SerializedName("integration")
    var integration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
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
    Model: DeleteApplicationUserRequestSchema
*/
@Parcelize
data class DeleteApplicationUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UnDeleteUserRequestSchema
*/
@Parcelize
data class UnDeleteUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null
    
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
    Model: SendResetPasswordMobileRequestSchema
*/
@Parcelize
data class SendResetPasswordMobileRequestSchema(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
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
    var mobile: String?=null,
    
    @SerializedName("android_hash")
    var androidHash: String?=null
    
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
    Model: DeleteUserSuccess
*/
@Parcelize
data class DeleteUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnDeleteUserSuccess
*/
@Parcelize
data class UnDeleteUserSuccess(
    
    
    
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
    var items: ArrayList<SessionListResponseInfo>?=null
    
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
    Model: SessionListResponseInfo
*/
@Parcelize
data class SessionListResponseInfo(
    
    
    
    @SerializedName("session_id")
    var sessionId: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("ip")
    var ip: String?=null,
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("expire_in")
    var expireIn: String?=null
    
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
    Model: UserGroupResponseSchema
*/
@Parcelize
data class UserGroupResponseSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserGroupListResponseSchema
*/
@Parcelize
data class UserGroupListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserGroupResponseSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateUserGroupSchema
*/
@Parcelize
data class CreateUserGroupSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
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
    var desktopImage: String?=null,
    
    @SerializedName("delete_account_day")
    var deleteAccountDay: Int?=null,
    
    @SerializedName("delete_account_reasons")
    var deleteAccountReasons: ArrayList<DeleteAccountReasons>?=null,
    
    @SerializedName("delete_account_consent")
    var deleteAccountConsent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("session_config")
    var sessionConfig: @RawValue HashMap<String,Any>?=null
    
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
    Model: DeleteAccountReasons
*/
@Parcelize
data class DeleteAccountReasons(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeleteAccountConsent
*/
@Parcelize
data class DeleteAccountConsent(
    
    
    
    @SerializedName("consent_text")
    var consentText: String?=null
    
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
    Model: SessionExpiry
*/
@Parcelize
data class SessionExpiry(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_rolling")
    var isRolling: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateUserGroupSchema
*/
@Parcelize
data class UpdateUserGroupSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
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
    
    @SerializedName("__source")
    var source: TagSourceSchema?=null
    
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
    var subNavigation: ArrayList<NavigationReference>?=null
    
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
    var answer: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
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
    Model: BadRequestSchema
*/
@Parcelize
data class BadRequestSchema(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    var value: @RawValue Any?=null
    
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
    Model: SendOtpSmsCommsTemplate
*/
@Parcelize
data class SendOtpSmsCommsTemplate(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendOtpSmsCommsProvider
*/
@Parcelize
data class SendOtpSmsCommsProvider(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendOtpEmailCommsTemplate
*/
@Parcelize
data class SendOtpEmailCommsTemplate(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsReqData
*/
@Parcelize
data class SendOtpCommsReqData(
    
    
    
    @SerializedName("send_same_otp_to_channel")
    var sendSameOtpToChannel: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("to")
    var to: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsReqSms
*/
@Parcelize
data class SendOtpCommsReqSms(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("template")
    var template: SendOtpSmsCommsTemplate?=null,
    
    @SerializedName("provider")
    var provider: SendOtpSmsCommsProvider?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsReqEmail
*/
@Parcelize
data class SendOtpCommsReqEmail(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("template")
    var template: SendOtpEmailCommsTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsResSms
*/
@Parcelize
data class SendOtpCommsResSms(
    
    
    
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
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsResEmail
*/
@Parcelize
data class SendOtpCommsResEmail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("to")
    var to: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsReq
*/
@Parcelize
data class SendOtpCommsReq(
    
    
    
    @SerializedName("data")
    var data: SendOtpCommsReqData?=null,
    
    @SerializedName("sms")
    var sms: SendOtpCommsReqSms?=null,
    
    @SerializedName("email")
    var email: SendOtpCommsReqEmail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpCommsRes
*/
@Parcelize
data class SendOtpCommsRes(
    
    
    
    @SerializedName("sms")
    var sms: SendOtpCommsResSms?=null,
    
    @SerializedName("email")
    var email: SendOtpCommsResEmail?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpCommsReq
*/
@Parcelize
data class VerifyOtpCommsReq(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpCommsSuccessRes
*/
@Parcelize
data class VerifyOtpCommsSuccessRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpCommsErrorRes
*/
@Parcelize
data class VerifyOtpCommsErrorRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("display_fields")
    var displayFields: ArrayList<String>?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("excluded_fields")
    var excludedFields: ArrayList<String>?=null,
    
    @SerializedName("aggregators")
    var aggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentGatewayConfig
*/
@Parcelize
data class PaymentGatewayConfig(
    
    
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("merchant_salt")
    var merchantSalt: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentGatewayToBeReviewed
*/
@Parcelize
data class PaymentGatewayToBeReviewed(
    
    
    
    @SerializedName("aggregator")
    var aggregator: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    
    @SerializedName("small")
    var small: String?=null,
    
    @SerializedName("large")
    var large: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: IntentApp
*/
@Parcelize
data class IntentApp(
    
    
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
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
    
    
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null
    
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
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payouts_aggregators")
    var payoutsAggregators: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("more_attributes")
    var moreAttributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("customers")
    var customers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutBankDetails
*/
@Parcelize
data class PayoutBankDetails(
    
    
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutRequest
*/
@Parcelize
data class PayoutRequest(
    
    
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("bank_details")
    var bankDetails: PayoutBankDetails?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PayoutResponse
*/
@Parcelize
data class PayoutResponse(
    
    
    
    @SerializedName("users")
    var users: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("unique_transfer_no")
    var uniqueTransferNo: String?=null,
    
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    
    @SerializedName("payouts")
    var payouts: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("bank_details")
    var bankDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer_type")
    var transferType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatePayoutResponse
*/
@Parcelize
data class UpdatePayoutResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
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
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentConfirmationRequest
*/
@Parcelize
data class PaymentConfirmationRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentConfirmationResponse
*/
@Parcelize
data class PaymentConfirmationResponse(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CODdata
*/
@Parcelize
data class CODdata(
    
    
    
    @SerializedName("remaining_limit")
    var remainingLimit: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("usages")
    var usages: Int?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetUserCODLimitResponse
*/
@Parcelize
data class GetUserCODLimitResponse(
    
    
    
    @SerializedName("user_cod_data")
    var userCodData: CODdata?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SetCODForUserRequest
*/
@Parcelize
data class SetCODForUserRequest(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("merchant_user_id")
    var merchantUserId: String?=null,
    
    @SerializedName("mobileno")
    var mobileno: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SetCODOptionResponse
*/
@Parcelize
data class SetCODOptionResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: FilterInfoOption
*/
@Parcelize
data class FilterInfoOption(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: FiltersInfo
*/
@Parcelize
data class FiltersInfo(
    
    
    
    @SerializedName("options")
    var options: ArrayList<FilterInfoOption>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("ops_status")
    var opsStatus: String?=null,
    
    @SerializedName("hex_code")
    var hexCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("actual_status")
    var actualStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDataInfo
*/
@Parcelize
data class UserDataInfo(
    
    
    
    @SerializedName("is_anonymous_user")
    var isAnonymousUser: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("avis_user_id")
    var avisUserId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentItemFulFillingStore
*/
@Parcelize
data class ShipmentItemFulFillingStore(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeInfo
*/
@Parcelize
data class PaymentModeInfo(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GSTDetailsData
*/
@Parcelize
data class GSTDetailsData(
    
    
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformItem
*/
@Parcelize
data class PlatformItem(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagUnit
*/
@Parcelize
data class BagUnit(
    
    
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("item_quantity")
    var itemQuantity: Int?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("gst")
    var gst: GSTDetailsData?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("total_shipment_bags")
    var totalShipmentBags: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentItem
*/
@Parcelize
data class ShipmentItem(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("fulfilling_centre")
    var fulfillingCentre: String?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("total_bags_count")
    var totalBagsCount: Int?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("application")
    var application: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user")
    var user: UserDataInfo?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: ShipmentItemFulFillingStore?=null,
    
    @SerializedName("channel")
    var channel: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode_info")
    var paymentModeInfo: PaymentModeInfo?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<BagUnit>?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: Int?=null,
    
    @SerializedName("sla")
    var sla: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentInternalPlatformViewResponse
*/
@Parcelize
data class ShipmentInternalPlatformViewResponse(
    
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("applied_filters")
    var appliedFilters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ShipmentItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TrackingList
*/
@Parcelize
data class TrackingList(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentStatusData
*/
@Parcelize
data class ShipmentStatusData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDetailsData
*/
@Parcelize
data class OrderDetailsData(
    
    
    
    @SerializedName("order_value")
    var orderValue: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("ordering_channel_logo")
    var orderingChannelLogo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("tax_details")
    var taxDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetailsData
*/
@Parcelize
data class UserDetailsData(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DPDetailsData
*/
@Parcelize
data class DPDetailsData(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("eway_bill_id")
    var ewayBillId: String?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    
    @SerializedName("bs_id")
    var bsId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("app_state_name")
    var appStateName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagStatusHistory
*/
@Parcelize
data class BagStatusHistory(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("forward")
    var forward: Boolean?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("delivery_partner_id")
    var deliveryPartnerId: Int?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("app_display_name")
    var appDisplayName: Boolean?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    
    @SerializedName("delivery_awb_number")
    var deliveryAwbNumber: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null,
    
    @SerializedName("display_name")
    var displayName: Boolean?=null,
    
    @SerializedName("bsh_id")
    var bshId: Int?=null,
    
    @SerializedName("state_type")
    var stateType: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("state_id")
    var stateId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("ean")
    var ean: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("cashback")
    var cashback: Int?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("discount")
    var discount: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Int?=null,
    
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("pm_price_split")
    var pmPriceSplit: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Int?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Int?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBagArticle
*/
@Parcelize
data class OrderBagArticle(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountRules
*/
@Parcelize
data class DiscountRules(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ItemCriterias
*/
@Parcelize
data class ItemCriterias(
    
    
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BuyRules
*/
@Parcelize
data class BuyRules(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriterias?=null,
    
    @SerializedName("cart_conditions")
    var cartConditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AppliedPromos
*/
@Parcelize
data class AppliedPromos(
    
    
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRules>?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformDeliveryAddress
*/
@Parcelize
data class PlatformDeliveryAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("latitude")
    var latitude: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("longitude")
    var longitude: Int?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagConfigs
*/
@Parcelize
data class BagConfigs(
    
    
    
    @SerializedName("allow_force_return")
    var allowForceReturn: Boolean?=null,
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBrandName
*/
@Parcelize
data class OrderBrandName(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagGST
*/
@Parcelize
data class BagGST(
    
    
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Int?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Int?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBags
*/
@Parcelize
data class OrderBags(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("item")
    var item: PlatformItem?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("article")
    var article: OrderBagArticle?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: PlatformDeliveryAddress?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("bag_configs")
    var bagConfigs: BagConfigs?=null,
    
    @SerializedName("brand")
    var brand: OrderBrandName?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGST?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPayments
*/
@Parcelize
data class ShipmentPayments(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentInfoResponse
*/
@Parcelize
data class ShipmentInfoResponse(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("go_green")
    var goGreen: Boolean?=null,
    
    @SerializedName("bank_data")
    var bankData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("escalation")
    var escalation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("company")
    var company: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("child_nodes")
    var childNodes: ArrayList<String>?=null,
    
    @SerializedName("user_info")
    var userInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("kirana_store_id")
    var kiranaStoreId: String?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("delivery_status")
    var deliveryStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("can_break")
    var canBreak: String?=null,
    
    @SerializedName("secured_delivery_flag")
    var securedDeliveryFlag: String?=null,
    
    @SerializedName("fyndstore_emp")
    var fyndstoreEmp: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("replacement_details")
    var replacementDetails: String?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: UserDetailsData?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetailsData?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("status_progress")
    var statusProgress: Int?=null,
    
    @SerializedName("refund_text")
    var refundText: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("current_shipment_status")
    var currentShipmentStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("pay_button")
    var payButton: String?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("email_id")
    var emailId: String?=null,
    
    @SerializedName("order_status")
    var orderStatus: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mid")
    var mid: String?=null,
    
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("forward_order_status")
    var forwardOrderStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_pdsr")
    var isPdsr: String?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<OrderBags>?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_not_fynd_source")
    var isNotFyndSource: Boolean?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_packaging_order")
    var isPackagingOrder: Boolean?=null,
    
    @SerializedName("forward_shipment_status")
    var forwardShipmentStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: String?=null,
    
    @SerializedName("billing_details")
    var billingDetails: UserDetailsData?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: Boolean?=null,
    
    @SerializedName("is_fynd_coupon")
    var isFyndCoupon: Boolean?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("credit_note_id")
    var creditNoteId: String?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("is_fynd_store")
    var isFyndStore: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("is_invoiced")
    var isInvoiced: Boolean?=null,
    
    @SerializedName("forward_tracking_list")
    var forwardTrackingList: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: String?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipment
*/
@Parcelize
data class PlatformShipment(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("picked_date")
    var pickedDate: String?=null,
    
    @SerializedName("priority_text")
    var priorityText: String?=null,
    
    @SerializedName("enable_dp_tracking")
    var enableDpTracking: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("tracking_list")
    var trackingList: ArrayList<TrackingList>?=null,
    
    @SerializedName("packaging_type")
    var packagingType: String?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: ShipmentStatusData?=null,
    
    @SerializedName("order")
    var order: OrderDetailsData?=null,
    
    @SerializedName("delivery_details")
    var deliveryDetails: UserDetailsData?=null,
    
    @SerializedName("dp_details")
    var dpDetails: DPDetailsData?=null,
    
    @SerializedName("shipment_quantity")
    var shipmentQuantity: Int?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("vertical")
    var vertical: String?=null,
    
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<OrderBags>?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: String?=null,
    
    @SerializedName("billing_details")
    var billingDetails: UserDetailsData?=null,
    
    @SerializedName("platform_logo")
    var platformLogo: String?=null,
    
    @SerializedName("payments")
    var payments: ShipmentPayments?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("gst_details")
    var gstDetails: GSTDetailsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDict
*/
@Parcelize
data class OrderDict(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("order_date")
    var orderDate: String?=null,
    
    @SerializedName("shipment_count")
    var shipmentCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetailsResponse
*/
@Parcelize
data class ShipmentDetailsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("order")
    var order: OrderDict?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubLane
*/
@Parcelize
data class SubLane(
    
    
    
    @SerializedName("actions")
    var actions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SuperLane
*/
@Parcelize
data class SuperLane(
    
    
    
    @SerializedName("options")
    var options: ArrayList<SubLane>?=null,
    
    @SerializedName("total_items")
    var totalItems: Int?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LaneConfigResponse
*/
@Parcelize
data class LaneConfigResponse(
    
    
    
    @SerializedName("super_lanes")
    var superLanes: ArrayList<SuperLane>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PlatformBreakupValues
*/
@Parcelize
data class PlatformBreakupValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformChannel
*/
@Parcelize
data class PlatformChannel(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformOrderItems
*/
@Parcelize
data class PlatformOrderItems(
    
    
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipment>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<PlatformBreakupValues>?=null,
    
    @SerializedName("channel")
    var channel: PlatformChannel?=null,
    
    @SerializedName("total_order_value")
    var totalOrderValue: Double?=null,
    
    @SerializedName("user_info")
    var userInfo: UserDataInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderListingResponse
*/
@Parcelize
data class OrderListingResponse(
    
    
    
    @SerializedName("lane")
    var lane: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<PlatformOrderItems>?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null
    
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
    var value: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MetricsCount
*/
@Parcelize
data class MetricsCount(
    
    
    
    @SerializedName("options")
    var options: ArrayList<Options>?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetricCountResponse
*/
@Parcelize
data class MetricCountResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<MetricsCount>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PlatformTrack
*/
@Parcelize
data class PlatformTrack(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("account_name")
    var accountName: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    
    @SerializedName("raw_status")
    var rawStatus: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentTrack
*/
@Parcelize
data class PlatformShipmentTrack(
    
    
    
    @SerializedName("results")
    var results: ArrayList<PlatformTrack>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AdvanceFilterInfo
*/
@Parcelize
data class AdvanceFilterInfo(
    
    
    
    @SerializedName("returned")
    var returned: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("action_centre")
    var actionCentre: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("processed")
    var processed: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("unfulfilled")
    var unfulfilled: ArrayList<FiltersInfo>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<FiltersInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FiltersResponse
*/
@Parcelize
data class FiltersResponse(
    
    
    
    @SerializedName("advance_filter")
    var advanceFilter: AdvanceFilterInfo?=null,
    
    @SerializedName("global_filter")
    var globalFilter: ArrayList<FiltersInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Success
*/
@Parcelize
data class Success(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OmsReports
*/
@Parcelize
data class OmsReports(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("report_type")
    var reportType: String?=null,
    
    @SerializedName("request_details")
    var requestDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("report_created_at")
    var reportCreatedAt: String?=null,
    
    @SerializedName("report_name")
    var reportName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("s3_key")
    var s3Key: String?=null,
    
    @SerializedName("report_id")
    var reportId: String?=null,
    
    @SerializedName("report_requested_at")
    var reportRequestedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JioCodeUpsertDataSet
*/
@Parcelize
data class JioCodeUpsertDataSet(
    
    
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("jio_code")
    var jioCode: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: JioCodeUpsertPayload
*/
@Parcelize
data class JioCodeUpsertPayload(
    
    
    
    @SerializedName("data")
    var data: ArrayList<JioCodeUpsertDataSet>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: NestedErrorSchemaDataSet
*/
@Parcelize
data class NestedErrorSchemaDataSet(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: JioCodeUpsertResponse
*/
@Parcelize
data class JioCodeUpsertResponse(
    
    
    
    @SerializedName("error")
    var error: ArrayList<NestedErrorSchemaDataSet>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkInvoicingResponse
*/
@Parcelize
data class BulkInvoicingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkInvoiceLabelResponse
*/
@Parcelize
data class BulkInvoiceLabelResponse(
    
    
    
    @SerializedName("label")
    var label: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("do_invoice_label_generated")
    var doInvoiceLabelGenerated: Boolean?=null,
    
    @SerializedName("invoice")
    var invoice: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("invoice_status")
    var invoiceStatus: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FileUploadResponse
*/
@Parcelize
data class FileUploadResponse(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: URL
*/
@Parcelize
data class URL(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FileResponse
*/
@Parcelize
data class FileResponse(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("upload")
    var upload: FileUploadResponse?=null,
    
    @SerializedName("cdn")
    var cdn: URL?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: bulkListingData
*/
@Parcelize
data class bulkListingData(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("successful")
    var successful: Int?=null,
    
    @SerializedName("processing_shipments")
    var processingShipments: ArrayList<String>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("user_name")
    var userName: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null,
    
    @SerializedName("processing")
    var processing: Int?=null,
    
    @SerializedName("failed_shipments")
    var failedShipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("successful_shipments")
    var successfulShipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("excel_url")
    var excelUrl: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkListingPage
*/
@Parcelize
data class BulkListingPage(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkListingResponse
*/
@Parcelize
data class BulkListingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<bulkListingData>?=null,
    
    @SerializedName("page")
    var page: BulkListingPage?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: QuestionSet
*/
@Parcelize
data class QuestionSet(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Reason
*/
@Parcelize
data class Reason(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformShipmentReasonsResponse
*/
@Parcelize
data class PlatformShipmentReasonsResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reason>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkActionPayload
*/
@Parcelize
data class BulkActionPayload(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BulkActionResponse
*/
@Parcelize
data class BulkActionResponse(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkActionDetailsDataField
*/
@Parcelize
data class BulkActionDetailsDataField(
    
    
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("total_shipments_count")
    var totalShipmentsCount: Int?=null,
    
    @SerializedName("processing_shipments_count")
    var processingShipmentsCount: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("failed_shipments_count")
    var failedShipmentsCount: Int?=null,
    
    @SerializedName("successful_shipment_ids")
    var successfulShipmentIds: ArrayList<String>?=null,
    
    @SerializedName("successful_shipments_count")
    var successfulShipmentsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkActionDetailsResponse
*/
@Parcelize
data class BulkActionDetailsResponse(
    
    
    
    @SerializedName("error")
    var error: ArrayList<String>?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("uploaded_by")
    var uploadedBy: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<BulkActionDetailsDataField>?=null,
    
    @SerializedName("uploaded_on")
    var uploadedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("channel_shipment_id")
    var channelShipmentId: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("channel_order_id")
    var channelOrderId: String?=null,
    
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    
    @SerializedName("order_item_id")
    var orderItemId: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PDFLinks
*/
@Parcelize
data class PDFLinks(
    
    
    
    @SerializedName("po_invoice")
    var poInvoice: String?=null,
    
    @SerializedName("invoice")
    var invoice: String?=null,
    
    @SerializedName("invoice_pos")
    var invoicePos: String?=null,
    
    @SerializedName("label_a4")
    var labelA4: String?=null,
    
    @SerializedName("label_pos")
    var labelPos: String?=null,
    
    @SerializedName("invoice_a6")
    var invoiceA6: String?=null,
    
    @SerializedName("invoice_type")
    var invoiceType: String?=null,
    
    @SerializedName("label_a6")
    var labelA6: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("b2b")
    var b2B: String?=null,
    
    @SerializedName("invoice_a4")
    var invoiceA4: String?=null,
    
    @SerializedName("credit_note_url")
    var creditNoteUrl: String?=null,
    
    @SerializedName("label_type")
    var labelType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LockData
*/
@Parcelize
data class LockData(
    
    
    
    @SerializedName("mto")
    var mto: Boolean?=null,
    
    @SerializedName("lock_message")
    var lockMessage: String?=null,
    
    @SerializedName("locked")
    var locked: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTimeStamp
*/
@Parcelize
data class ShipmentTimeStamp(
    
    
    
    @SerializedName("t_min")
    var tMin: String?=null,
    
    @SerializedName("t_max")
    var tMax: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EInvoice
*/
@Parcelize
data class EInvoice(
    
    
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null,
    
    @SerializedName("signed_invoice")
    var signedInvoice: String?=null,
    
    @SerializedName("acknowledge_date")
    var acknowledgeDate: String?=null,
    
    @SerializedName("acknowledge_no")
    var acknowledgeNo: Int?=null,
    
    @SerializedName("irn")
    var irn: String?=null,
    
    @SerializedName("signed_qr_code")
    var signedQrCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EinvoiceInfo
*/
@Parcelize
data class EinvoiceInfo(
    
    
    
    @SerializedName("credit_note")
    var creditNote: EInvoice?=null,
    
    @SerializedName("invoice")
    var invoice: EInvoice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BuyerDetails
*/
@Parcelize
data class BuyerDetails(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("ajio_site_id")
    var ajioSiteId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    
    @SerializedName("f_max")
    var fMax: String?=null,
    
    @SerializedName("f_min")
    var fMin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DebugInfo
*/
@Parcelize
data class DebugInfo(
    
    
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    
    @SerializedName("return_awb_number")
    var returnAwbNumber: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("fulfilment_priority_text")
    var fulfilmentPriorityText: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("forward_affiliate_order_id")
    var forwardAffiliateOrderId: String?=null,
    
    @SerializedName("due_date")
    var dueDate: String?=null,
    
    @SerializedName("b2c_buyer_details")
    var b2CBuyerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    
    @SerializedName("return_affiliate_order_id")
    var returnAffiliateOrderId: String?=null,
    
    @SerializedName("lock_data")
    var lockData: LockData?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("external")
    var external: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("ewaybill_info")
    var ewaybillInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("timestamp")
    var timestamp: ShipmentTimeStamp?=null,
    
    @SerializedName("packaging_name")
    var packagingName: String?=null,
    
    @SerializedName("einvoice_info")
    var einvoiceInfo: EinvoiceInfo?=null,
    
    @SerializedName("po_number")
    var poNumber: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("b2b_buyer_details")
    var b2BBuyerDetails: BuyerDetails?=null,
    
    @SerializedName("awb_number")
    var awbNumber: String?=null,
    
    @SerializedName("return_store_node")
    var returnStoreNode: Int?=null,
    
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("forward_affiliate_shipment_id")
    var forwardAffiliateShipmentId: String?=null,
    
    @SerializedName("formatted")
    var formatted: Formatted?=null,
    
    @SerializedName("weight")
    var weight: Int?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("return_details")
    var returnDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_affiliate_shipment_id")
    var returnAffiliateShipmentId: String?=null,
    
    @SerializedName("debug_info")
    var debugInfo: DebugInfo?=null,
    
    @SerializedName("store_invoice_updated_date")
    var storeInvoiceUpdatedDate: String?=null,
    
    @SerializedName("auto_trigger_dp_assignment_acf")
    var autoTriggerDpAssignmentAcf: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateDetails
*/
@Parcelize
data class AffiliateDetails(
    
    
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: PDFLinks?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("company_affiliate_tag")
    var companyAffiliateTag: String?=null,
    
    @SerializedName("shipment_meta")
    var shipmentMeta: ShipmentMeta?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("ad_id")
    var adId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleDetails
*/
@Parcelize
data class ArticleDetails(
    
    
    
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    
    
    @SerializedName("marketer_name")
    var marketerName: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("primary_material")
    var primaryMaterial: String?=null,
    
    @SerializedName("primary_color_hex")
    var primaryColorHex: String?=null,
    
    @SerializedName("gender")
    var gender: ArrayList<String>?=null,
    
    @SerializedName("marketer_address")
    var marketerAddress: String?=null,
    
    @SerializedName("essential")
    var essential: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    
    @SerializedName("branch_url")
    var branchUrl: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("l1_category_id")
    var l1CategoryId: Int?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("l2_category_id")
    var l2CategoryId: Int?=null,
    
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("webstore_product_url")
    var webstoreProductUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagReturnableCancelableStatus
*/
@Parcelize
data class BagReturnableCancelableStatus(
    
    
    
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null
    
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
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
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
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("ds_type")
    var dsType: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
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
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("product_return_config")
    var productReturnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("einvoice_portal_details")
    var einvoicePortalDetails: EInvoicePortalDetails?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: StoreGstCredentials?=null,
    
    @SerializedName("documents")
    var documents: StoreDocuments?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    
    @SerializedName("timing")
    var timing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("ewaybill_portal_details")
    var ewaybillPortalDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreAddress
*/
@Parcelize
data class StoreAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("login_username")
    var loginUsername: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("parent_store_id")
    var parentStoreId: Int?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("vat_no")
    var vatNo: String?=null,
    
    @SerializedName("s_id")
    var sId: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("alohomora_user_id")
    var alohomoraUserId: Int?=null,
    
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("brand_id")
    var brandId: @RawValue Any?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("brand_store_tags")
    var brandStoreTags: ArrayList<String>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    
    @SerializedName("mall_area")
    var mallArea: String?=null,
    
    @SerializedName("store_active_from")
    var storeActiveFrom: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("meta")
    var meta: StoreMeta?=null,
    
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddress?=null,
    
    @SerializedName("mall_name")
    var mallName: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Dates
*/
@Parcelize
data class Dates(
    
    
    
    @SerializedName("delivery_date")
    var deliveryDate: @RawValue Any?=null,
    
    @SerializedName("order_created")
    var orderCreated: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("shipping")
    var shipping: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Dimensions
*/
@Parcelize
data class Dimensions(
    
    
    
    @SerializedName("width")
    var width: Int?=null,
    
    @SerializedName("length")
    var length: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("height")
    var height: Int?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
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
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("esp_modified")
    var espModified: @RawValue Any?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("child_details")
    var childDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("dimensions")
    var dimensions: Dimensions?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("a_set")
    var aSet: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue Any?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: B2BPODetails
*/
@Parcelize
data class B2BPODetails(
    
    
    
    @SerializedName("po_tax_amount")
    var poTaxAmount: Double?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("docker_number")
    var dockerNumber: String?=null,
    
    @SerializedName("po_line_amount")
    var poLineAmount: Double?=null,
    
    @SerializedName("item_base_price")
    var itemBasePrice: Double?=null,
    
    @SerializedName("total_gst_percentage")
    var totalGstPercentage: Double?=null
    
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
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("script_last_ran")
    var scriptLastRan: String?=null,
    
    @SerializedName("invoice_prefix")
    var invoicePrefix: String?=null,
    
    @SerializedName("credit_note_expiry_days")
    var creditNoteExpiryDays: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    
    @SerializedName("pickup_location")
    var pickupLocation: String?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagGSTDetails
*/
@Parcelize
data class BagGSTDetails(
    
    
    
    @SerializedName("sgst_tax_percentage")
    var sgstTaxPercentage: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("cgst_gst_fee")
    var cgstGstFee: String?=null,
    
    @SerializedName("gstin_code")
    var gstinCode: String?=null,
    
    @SerializedName("tax_collected_at_source")
    var taxCollectedAtSource: Double?=null,
    
    @SerializedName("cgst_tax_percentage")
    var cgstTaxPercentage: Double?=null,
    
    @SerializedName("sgst_gst_fee")
    var sgstGstFee: String?=null,
    
    @SerializedName("igst_tax_percentage")
    var igstTaxPercentage: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("igst_gst_fee")
    var igstGstFee: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagDetailsPlatformResponse
*/
@Parcelize
data class BagDetailsPlatformResponse(
    
    
    
    @SerializedName("quantity")
    var quantity: Double?=null,
    
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("affiliate_details")
    var affiliateDetails: AffiliateDetails?=null,
    
    @SerializedName("article_details")
    var articleDetails: ArticleDetails?=null,
    
    @SerializedName("original_bag_list")
    var originalBagList: ArrayList<Int>?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("status")
    var status: BagReturnableCancelableStatus?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("bag_status_history")
    var bagStatusHistory: BagStatusHistory?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("operational_status")
    var operationalStatus: String?=null,
    
    @SerializedName("qc_required")
    var qcRequired: @RawValue Any?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("restore_promos")
    var restorePromos: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Store?=null,
    
    @SerializedName("current_operational_status")
    var currentOperationalStatus: BagStatusHistory?=null,
    
    @SerializedName("dates")
    var dates: Dates?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("article")
    var article: Article?=null,
    
    @SerializedName("b_id")
    var bId: Int?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("restore_coupon")
    var restoreCoupon: Boolean?=null,
    
    @SerializedName("current_status")
    var currentStatus: BagStatusHistory?=null,
    
    @SerializedName("bag_update_time")
    var bagUpdateTime: Double?=null,
    
    @SerializedName("no_of_bags_order")
    var noOfBagsOrder: Int?=null,
    
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatusHistory>?=null,
    
    @SerializedName("b_type")
    var bType: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("meta")
    var meta: BagMeta?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("order_integration_id")
    var orderIntegrationId: String?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("gst_details")
    var gstDetails: BagGSTDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Page1
*/
@Parcelize
data class Page1(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetBagsPlatformResponse
*/
@Parcelize
data class GetBagsPlatformResponse(
    
    
    
    @SerializedName("page")
    var page: Page1?=null,
    
    @SerializedName("items")
    var items: ArrayList<BagDetailsPlatformResponse>?=null
    
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
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null
    
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
    Model: ErrorResponse1
*/
@Parcelize
data class ErrorResponse1(
    
    
    
    @SerializedName("error_trace")
    var errorTrace: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreReassign
*/
@Parcelize
data class StoreReassign(
    
    
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("set_id")
    var setId: String?=null,
    
    @SerializedName("mongo_article_id")
    var mongoArticleId: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null,
    
    @SerializedName("reason_ids")
    var reasonIds: ArrayList<Int>?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    
    @SerializedName("item_id")
    var itemId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreReassignResponse
*/
@Parcelize
data class StoreReassignResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Entities
*/
@Parcelize
data class Entities(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentLockPayload
*/
@Parcelize
data class UpdateShipmentLockPayload(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<Entities>?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OriginalFilter
*/
@Parcelize
data class OriginalFilter(
    
    
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
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
    
    
    
    @SerializedName("is_shipment_locked")
    var isShipmentLocked: Boolean?=null,
    
    @SerializedName("original_filter")
    var originalFilter: OriginalFilter?=null,
    
    @SerializedName("is_bag_locked")
    var isBagLocked: Boolean?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    
    @SerializedName("lock_status")
    var lockStatus: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentLockResponse
*/
@Parcelize
data class UpdateShipmentLockResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("check_response")
    var checkResponse: ArrayList<CheckResponse>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AnnouncementResponse
*/
@Parcelize
data class AnnouncementResponse(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("to_datetime")
    var toDatetime: String?=null,
    
    @SerializedName("platform_name")
    var platformName: String?=null,
    
    @SerializedName("platform_id")
    var platformId: String?=null,
    
    @SerializedName("from_datetime")
    var fromDatetime: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AnnouncementsResponse
*/
@Parcelize
data class AnnouncementsResponse(
    
    
    
    @SerializedName("announcements")
    var announcements: ArrayList<AnnouncementResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BaseResponse
*/
@Parcelize
data class BaseResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Click2CallResponse
*/
@Parcelize
data class Click2CallResponse(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("call_id")
    var callId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasonsFilters
*/
@Parcelize
data class ProductsReasonsFilters(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasonsData
*/
@Parcelize
data class ProductsReasonsData(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasons
*/
@Parcelize
data class ProductsReasons(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsReasonsFilters>?=null,
    
    @SerializedName("data")
    var data: ProductsReasonsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityReasonData
*/
@Parcelize
data class EntityReasonData(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntitiesReasons
*/
@Parcelize
data class EntitiesReasons(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: EntityReasonData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReasonsData
*/
@Parcelize
data class ReasonsData(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsReasons>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsDataUpdatesFilters
*/
@Parcelize
data class ProductsDataUpdatesFilters(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsDataUpdates
*/
@Parcelize
data class ProductsDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsDataUpdatesFilters>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntitiesDataUpdates
*/
@Parcelize
data class EntitiesDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DataUpdates
*/
@Parcelize
data class DataUpdates(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsDataUpdates>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesDataUpdates>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentsRequest
*/
@Parcelize
data class ShipmentsRequest(
    
    
    
    @SerializedName("reasons")
    var reasons: ReasonsData?=null,
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdates?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatuesRequest
*/
@Parcelize
data class StatuesRequest(
    
    
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsRequest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusRequest
*/
@Parcelize
data class UpdateShipmentStatusRequest(
    
    
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesRequest>?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentsResponse
*/
@Parcelize
data class ShipmentsResponse(
    
    
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("final_state")
    var finalState: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatuesResponse
*/
@Parcelize
data class StatuesResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusResponseBody
*/
@Parcelize
data class UpdateShipmentStatusResponseBody(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesResponse>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AffiliateStoreIdMapping
*/
@Parcelize
data class AffiliateStoreIdMapping(
    
    
    
    @SerializedName("marketplace_store_id")
    var marketplaceStoreId: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null
    
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
    Model: AffiliateInventoryPaymentConfig
*/
@Parcelize
data class AffiliateInventoryPaymentConfig(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null
    
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
    Model: AffiliateInventoryLogisticsConfig
*/
@Parcelize
data class AffiliateInventoryLogisticsConfig(
    
    
    
    @SerializedName("dp_assignment")
    var dpAssignment: Boolean?=null
    
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
    Model: AffiliateInventoryConfig
*/
@Parcelize
data class AffiliateInventoryConfig(
    
    
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryStoreConfig?=null,
    
    @SerializedName("payment")
    var payment: AffiliateInventoryPaymentConfig?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: AffiliateInventoryArticleAssignmentConfig?=null,
    
    @SerializedName("logistics")
    var logistics: AffiliateInventoryLogisticsConfig?=null,
    
    @SerializedName("order")
    var order: AffiliateInventoryOrderConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateAppConfigMeta
*/
@Parcelize
data class AffiliateAppConfigMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AffiliateAppConfig
*/
@Parcelize
data class AffiliateAppConfig(
    
    
    
    @SerializedName("meta")
    var meta: ArrayList<AffiliateAppConfigMeta>?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AffiliateConfig
*/
@Parcelize
data class AffiliateConfig(
    
    
    
    @SerializedName("inventory")
    var inventory: AffiliateInventoryConfig?=null,
    
    @SerializedName("app")
    var app: AffiliateAppConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Affiliate
*/
@Parcelize
data class Affiliate(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("config")
    var config: AffiliateConfig?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderConfig
*/
@Parcelize
data class OrderConfig(
    
    
    
    @SerializedName("store_lookup")
    var storeLookup: String?=null,
    
    @SerializedName("create_user")
    var createUser: Boolean?=null,
    
    @SerializedName("affiliate_store_id_mapping")
    var affiliateStoreIdMapping: ArrayList<AffiliateStoreIdMapping>?=null,
    
    @SerializedName("bag_end_state")
    var bagEndState: String?=null,
    
    @SerializedName("affiliate")
    var affiliate: Affiliate?=null,
    
    @SerializedName("article_lookup")
    var articleLookup: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderUser
*/
@Parcelize
data class OrderUser(
    
    
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("mobile")
    var mobile: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
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
    Model: ArticleDetails1
*/
@Parcelize
data class ArticleDetails1(
    
    
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("weight")
    var weight: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dimension")
    var dimension: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails1>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetails
*/
@Parcelize
data class ShipmentDetails(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<ArticleDetails1>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("dp_id")
    var dpId: Int?=null,
    
    @SerializedName("affiliate_shipment_id")
    var affiliateShipmentId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentConfig
*/
@Parcelize
data class ShipmentConfig(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    
    @SerializedName("shipment")
    var shipment: ArrayList<ShipmentDetails>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
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
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("affiliate_meta")
    var affiliateMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("pdf_links")
    var pdfLinks: MarketPlacePdf?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("affiliate_store_id")
    var affiliateStoreId: String?=null,
    
    @SerializedName("avl_qty")
    var avlQty: Int?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("unit_price")
    var unitPrice: Double?=null,
    
    @SerializedName("sku")
    var sku: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("fynd_store_id")
    var fyndStoreId: String?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderInfo
*/
@Parcelize
data class OrderInfo(
    
    
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("billing_address")
    var billingAddress: OrderUser?=null,
    
    @SerializedName("payment")
    var payment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("order_value")
    var orderValue: Double?=null,
    
    @SerializedName("user")
    var user: UserData?=null,
    
    @SerializedName("order_priority")
    var orderPriority: OrderPriority?=null,
    
    @SerializedName("shipment")
    var shipment: ShipmentData?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: OrderUser?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<AffiliateBag>?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderPayload
*/
@Parcelize
data class CreateOrderPayload(
    
    
    
    @SerializedName("order_config")
    var orderConfig: OrderConfig?=null,
    
    @SerializedName("order_info")
    var orderInfo: OrderInfo?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null
    
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
    Model: DispatchManifest
*/
@Parcelize
data class DispatchManifest(
    
    
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ActionInfo
*/
@Parcelize
data class ActionInfo(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetActionsResponse
*/
@Parcelize
data class GetActionsResponse(
    
    
    
    @SerializedName("permissions")
    var permissions: ActionInfo?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: HistoryDict
*/
@Parcelize
data class HistoryDict(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("createdat")
    var createdat: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("ticket_url")
    var ticketUrl: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("l3_detail")
    var l3Detail: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("l1_detail")
    var l1Detail: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("l2_detail")
    var l2Detail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentHistoryResponse
*/
@Parcelize
data class ShipmentHistoryResponse(
    
    
    
    @SerializedName("activity_history")
    var activityHistory: ArrayList<HistoryDict>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ErrorDetail
*/
@Parcelize
data class ErrorDetail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SmsDataPayload
*/
@Parcelize
data class SmsDataPayload(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: Int?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: Int?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendSmsPayload
*/
@Parcelize
data class SendSmsPayload(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    
    @SerializedName("data")
    var data: SmsDataPayload?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("kafka_emission_status")
    var kafkaEmissionStatus: Int?=null,
    
    @SerializedName("state_manager_used")
    var stateManagerUsed: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentDetail
*/
@Parcelize
data class ShipmentDetail(
    
    
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("remarks")
    var remarks: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("bag_list")
    var bagList: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDetails
*/
@Parcelize
data class OrderDetails(
    
    
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderStatusData
*/
@Parcelize
data class OrderStatusData(
    
    
    
    @SerializedName("shipment_details")
    var shipmentDetails: ArrayList<ShipmentDetail>?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null,
    
    @SerializedName("order_details")
    var orderDetails: OrderDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderStatusResult
*/
@Parcelize
data class OrderStatusResult(
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("result")
    var result: ArrayList<OrderStatusData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ManualAssignDPToShipment
*/
@Parcelize
data class ManualAssignDPToShipment(
    
    
    
    @SerializedName("dp_id")
    var dpId: Int?=null,
    
    @SerializedName("qc_required")
    var qcRequired: String?=null,
    
    @SerializedName("shipment_ids")
    var shipmentIds: ArrayList<String>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ManualAssignDPToShipmentResponse
*/
@Parcelize
data class ManualAssignDPToShipmentResponse(
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShippingInfo
*/
@Parcelize
data class ShippingInfo(
    
    
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("shipping_type")
    var shippingType: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("slot")
    var slot: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Tax
*/
@Parcelize
data class Tax(
    
    
    
    @SerializedName("amount")
    var amount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("breakup")
    var breakup: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Charge
*/
@Parcelize
data class Charge(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("tax")
    var tax: Tax?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("amount")
    var amount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LineItem
*/
@Parcelize
data class LineItem(
    
    
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_messasge")
    var customMessasge: String?=null,
    
    @SerializedName("external_line_id")
    var externalLineId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProcessingDates
*/
@Parcelize
data class ProcessingDates(
    
    
    
    @SerializedName("dp_pickup_slot")
    var dpPickupSlot: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dispatch_after_date")
    var dispatchAfterDate: String?=null,
    
    @SerializedName("pack_by_date")
    var packByDate: String?=null,
    
    @SerializedName("confirm_by_date")
    var confirmByDate: String?=null,
    
    @SerializedName("dispatch_by_date")
    var dispatchByDate: String?=null,
    
    @SerializedName("customer_pickup_slot")
    var customerPickupSlot: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Shipment
*/
@Parcelize
data class Shipment(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("line_items")
    var lineItems: ArrayList<LineItem>?=null,
    
    @SerializedName("processing_dates")
    var processingDates: ProcessingDates?=null,
    
    @SerializedName("external_shipment_id")
    var externalShipmentId: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("location_id")
    var locationId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TaxInfo
*/
@Parcelize
data class TaxInfo(
    
    
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("b2b_gstin_number")
    var b2BGstinNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BillingInfo
*/
@Parcelize
data class BillingInfo(
    
    
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("customer_code")
    var customerCode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("floor_no")
    var floorNo: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("primary_mobile_number")
    var primaryMobileNumber: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("primary_email")
    var primaryEmail: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("alternate_mobile_number")
    var alternateMobileNumber: String?=null,
    
    @SerializedName("external_customer_code")
    var externalCustomerCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("alternate_email")
    var alternateEmail: String?=null,
    
    @SerializedName("house_no")
    var houseNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentMethod
*/
@Parcelize
data class PaymentMethod(
    
    
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("transaction_data")
    var transactionData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentInfo
*/
@Parcelize
data class PaymentInfo(
    
    
    
    @SerializedName("primary_mode")
    var primaryMode: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderAPI
*/
@Parcelize
data class CreateOrderAPI(
    
    
    
    @SerializedName("currency_info")
    var currencyInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipping_info")
    var shippingInfo: ShippingInfo?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipment>?=null,
    
    @SerializedName("tax_info")
    var taxInfo: TaxInfo?=null,
    
    @SerializedName("external_creation_date")
    var externalCreationDate: String?=null,
    
    @SerializedName("billing_info")
    var billingInfo: BillingInfo?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Charge>?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: PaymentInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderErrorReponse
*/
@Parcelize
data class CreateOrderErrorReponse(
    
    
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("info")
    var info: @RawValue Any?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DpConfiguration
*/
@Parcelize
data class DpConfiguration(
    
    
    
    @SerializedName("shipping_by")
    var shippingBy: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PaymentMethods
*/
@Parcelize
data class PaymentMethods(
    
    
    
    @SerializedName("collect_by")
    var collectBy: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("refund_by")
    var refundBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateChannelPaymentInfo
*/
@Parcelize
data class CreateChannelPaymentInfo(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethods>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateChannelConfig
*/
@Parcelize
data class CreateChannelConfig(
    
    
    
    @SerializedName("lock_states")
    var lockStates: ArrayList<String>?=null,
    
    @SerializedName("logo_url")
    var logoUrl: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_assignment")
    var shipmentAssignment: String?=null,
    
    @SerializedName("dp_configuration")
    var dpConfiguration: DpConfiguration?=null,
    
    @SerializedName("location_reassignment")
    var locationReassignment: Boolean?=null,
    
    @SerializedName("payment_info")
    var paymentInfo: CreateChannelPaymentInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateChannelConfigData
*/
@Parcelize
data class CreateChannelConfigData(
    
    
    
    @SerializedName("config_data")
    var configData: CreateChannelConfig?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateChannelConfigResponse
*/
@Parcelize
data class CreateChannelConfigResponse(
    
    
    
    @SerializedName("is_upserted")
    var isUpserted: Boolean?=null,
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null,
    
    @SerializedName("is_inserted")
    var isInserted: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateChannelConifgErrorResponse
*/
@Parcelize
data class CreateChannelConifgErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UploadConsent
*/
@Parcelize
data class UploadConsent(
    
    
    
    @SerializedName("consent_url")
    var consentUrl: String?=null,
    
    @SerializedName("manifest_id")
    var manifestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformOrderUpdate
*/
@Parcelize
data class PlatformOrderUpdate(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ResponseDetail
*/
@Parcelize
data class ResponseDetail(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FyndOrderIdList
*/
@Parcelize
data class FyndOrderIdList(
    
    
    
    @SerializedName("fynd_order_id")
    var fyndOrderId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderStatus
*/
@Parcelize
data class OrderStatus(
    
    
    
    @SerializedName("mobile")
    var mobile: Int?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("order_details")
    var orderDetails: ArrayList<FyndOrderIdList>?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: GetSearchWordsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
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
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
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
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: AutocompleteAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("guide")
    var guide: Guide?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("image")
    var image: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MetaFields
*/
@Parcelize
data class MetaFields(
    
    
    
    @SerializedName("key")
    var key: @RawValue Any?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("maximum")
    var maximum: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationItemSEO
*/
@Parcelize
data class ApplicationItemSEO(
    
    
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("title")
    var title: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationItemMeta
*/
@Parcelize
data class ApplicationItemMeta(
    
    
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<MetaFields>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SuccessResponse1
*/
@Parcelize
data class SuccessResponse1(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MOQData
*/
@Parcelize
data class MOQData(
    
    
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("maximum")
    var maximum: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SEOData
*/
@Parcelize
data class SEOData(
    
    
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("title")
    var title: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OwnerAppItemResponse
*/
@Parcelize
data class OwnerAppItemResponse(
    
    
    
    @SerializedName("moq")
    var moq: MOQData?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("seo")
    var seo: SEOData?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetConfigMetadataResponse
*/
@Parcelize
data class GetConfigMetadataResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("condition")
    var condition: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeDetailsGroup
*/
@Parcelize
data class AttributeDetailsGroup(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppConfigurationDetail
*/
@Parcelize
data class AppConfigurationDetail(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<AttributeDetailsGroup>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("template_slugs")
    var templateSlugs: ArrayList<String>?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("next")
    var next: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetConfigResponse
*/
@Parcelize
data class GetConfigResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: PageResponseType?=null
    
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
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
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
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null,
    
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null,
    
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null,
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
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
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
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
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null,
    
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null,
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    
    @SerializedName("end")
    var end: Double?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("start")
    var start: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    
    @SerializedName("sort")
    var sort: String?=null,
    
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("condition")
    var condition: String?=null,
    
    @SerializedName("map_values")
    var mapValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null,
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null,
    
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    
    @SerializedName("data")
    var data: EntityConfiguration?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("operators")
    var operators: ArrayList<String>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
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
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CollectionSchedule
*/
@Parcelize
data class CollectionSchedule(
    
    
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null,
    
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
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
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
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
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
    
    
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: BannerImage?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
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
    Model: Media1
*/
@Parcelize
data class Media1(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCollection
*/
@Parcelize
data class UpdateCollection(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item")
    var item: ArrayList<ItemQueryForUserCollection>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items_not_updated")
    var itemsNotUpdated: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    
    @SerializedName("effective")
    var effective: Price1?=null,
    
    @SerializedName("marked")
    var marked: Price1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null,
    
    @SerializedName("total_sizes")
    var totalSizes: Int?=null,
    
    @SerializedName("total_articles")
    var totalArticles: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null,
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    
    @SerializedName("item")
    var item: CatalogInsightItem?=null
    
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
    
    
    
    @SerializedName("data")
    var data: CrossSellingData?=null,
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("total_article")
    var totalArticle: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null
    
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
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("manager")
    var manager: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterFilter
*/
@Parcelize
data class AttributeMasterFilter(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("depends_on")
    var dependsOn: ArrayList<String>?=null,
    
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
    Model: AttributeSchemaRange
*/
@Parcelize
data class AttributeSchemaRange(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMaster
*/
@Parcelize
data class AttributeMaster(
    
    
    
    @SerializedName("range")
    var range: AttributeSchemaRange?=null,
    
    @SerializedName("mandatory")
    var mandatory: Boolean?=null,
    
    @SerializedName("multi")
    var multi: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allowed_values")
    var allowedValues: ArrayList<String>?=null,
    
    @SerializedName("format")
    var format: String?=null
    
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
    
    
    
    @SerializedName("enriched")
    var enriched: Boolean?=null,
    
    @SerializedName("mandatory_details")
    var mandatoryDetails: AttributeMasterMandatoryDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GenderDetail
*/
@Parcelize
data class GenderDetail(
    
    
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("meta")
    var meta: AttributeMasterMeta?=null,
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCreateUpdate
*/
@Parcelize
data class DepartmentCreateUpdate(
    
    
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCreateResponse
*/
@Parcelize
data class DepartmentCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("search")
    var search: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("super_user")
    var superUser: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentModel
*/
@Parcelize
data class DepartmentModel(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("_cls")
    var cls: @RawValue Any?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("attributes_schema")
    var attributesSchema: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Properties
*/
@Parcelize
data class Properties(
    
    
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("command")
    var command: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader_type")
    var traderType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_publish")
    var productPublish: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GlobalValidation
*/
@Parcelize
data class GlobalValidation(
    
    
    
    @SerializedName("definitions")
    var definitions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("properties")
    var properties: Properties?=null,
    
    @SerializedName("required")
    var required: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplateValidationData
*/
@Parcelize
data class TemplateValidationData(
    
    
    
    @SerializedName("template_validation")
    var templateValidation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("global_validation")
    var globalValidation: GlobalValidation?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TemplateDetails
*/
@Parcelize
data class TemplateDetails(
    
    
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("attributes_schema")
    var attributesSchema: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    
    @SerializedName("data")
    var data: TemplateValidationData?=null,
    
    @SerializedName("template_details")
    var templateDetails: TemplateDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    
    @SerializedName("data")
    var data: HSNData?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadItemsData
*/
@Parcelize
data class ProductDownloadItemsData(
    
    
    
    @SerializedName("brand")
    var brand: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("templates")
    var templates: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadsItems
*/
@Parcelize
data class ProductDownloadsItems(
    
    
    
    @SerializedName("data")
    var data: ProductDownloadItemsData?=null,
    
    @SerializedName("created_by")
    var createdBy: VerifiedBy?=null,
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("template_tags")
    var templateTags: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDownloadsResponse
*/
@Parcelize
data class ProductDownloadsResponse(
    
    
    
    @SerializedName("items")
    var items: ProductDownloadsItems?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductConfigurationDownloads
*/
@Parcelize
data class ProductConfigurationDownloads(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("multivalue")
    var multivalue: Boolean?=null
    
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
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    
    @SerializedName("department")
    var department: Int?=null,
    
    @SerializedName("l2")
    var l2: Int?=null,
    
    @SerializedName("l1")
    var l1: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("catalog_id")
    var catalogId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null,
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null,
    
    @SerializedName("google")
    var google: CategoryMappingValues?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("media")
    var media: Media2?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: Media2?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Category>?=null
    
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
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
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
    Model: TaxIdentifier
*/
@Parcelize
data class TaxIdentifier(
    
    
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("unit")
    var unit: @RawValue Any?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: ProductCreateUpdateSchemaV2
*/
@Parcelize
data class ProductCreateUpdateSchemaV2(
    
    
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue Any?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: @RawValue Any?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("requester")
    var requester: String?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("bulk_job_id")
    var bulkJobId: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Double?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
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
    Model: Product
*/
@Parcelize
data class Product(
    
    
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Product>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductVariants
*/
@Parcelize
data class ProductVariants(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariants>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttributeMasterSerializer
*/
@Parcelize
data class AttributeMasterSerializer(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("raw_key")
    var rawKey: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("variant")
    var variant: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("suggestion")
    var suggestion: String?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    Model: CustomOrder1
*/
@Parcelize
data class CustomOrder1(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Media3
*/
@Parcelize
data class Media3(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TeaserTag1
*/
@Parcelize
data class TeaserTag1(
    
    
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TaxIdentifier1
*/
@Parcelize
data class TaxIdentifier1(
    
    
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReturnConfig1
*/
@Parcelize
data class ReturnConfig1(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
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
    Model: ProductPublish1
*/
@Parcelize
data class ProductPublish1(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductPatch
*/
@Parcelize
data class ProductPatch(
    
    
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder1?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media3>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue Any?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag1?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier1?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: @RawValue Any?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("requester")
    var requester: String?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig1?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader1>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("bulk_job_id")
    var bulkJobId: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish1?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SuccessResponseProduct
*/
@Parcelize
data class SuccessResponseProduct(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ValidateIdentifier
*/
@Parcelize
data class ValidateIdentifier(
    
    
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ALLSizes
*/
@Parcelize
data class ALLSizes(
    
    
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("size")
    var size: @RawValue Any?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<ValidateIdentifier>?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListALLSizes
*/
@Parcelize
data class ListALLSizes(
    
    
    
    @SerializedName("all_sizes")
    var allSizes: ArrayList<ALLSizes>?=null
    
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
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetail1
*/
@Parcelize
data class UserDetail1(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("full_name")
    var fullName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail1?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail1?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("template")
    var template: ProductTemplate?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductBulkRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
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
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("retry")
    var retry: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Items>?=null
    
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
    
    
    
    @SerializedName("data")
    var data: ProductSizeDeleteDataResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
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
    var gtinValue: @RawValue Any?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("size")
    var size: @RawValue Any?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("item")
    var item: ItemQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryResponse
*/
@Parcelize
data class InventoryResponse(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("sellable_quantity")
    var sellableQuantity: Int?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryResponsePaginated
*/
@Parcelize
data class InventoryResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyMeta
*/
@Parcelize
data class CompanyMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PriceMeta
*/
@Parcelize
data class PriceMeta(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: QuantityBase
*/
@Parcelize
data class QuantityBase(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Quantities
*/
@Parcelize
data class Quantities(
    
    
    
    @SerializedName("not_available")
    var notAvailable: QuantityBase?=null,
    
    @SerializedName("sellable")
    var sellable: QuantityBase?=null,
    
    @SerializedName("damaged")
    var damaged: QuantityBase?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: QuantityBase?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DimensionResponse
*/
@Parcelize
data class DimensionResponse(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ManufacturerResponse
*/
@Parcelize
data class ManufacturerResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandMeta
*/
@Parcelize
data class BrandMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReturnConfig2
*/
@Parcelize
data class ReturnConfig2(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Trader2
*/
@Parcelize
data class Trader2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: WeightResponse
*/
@Parcelize
data class WeightResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventorySellerResponse
*/
@Parcelize
data class InventorySellerResponse(
    
    
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("company")
    var company: CompanyMeta?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: StoreMeta?=null,
    
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("price")
    var price: PriceMeta?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig2?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader2>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("fynd_meta")
    var fyndMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@Parcelize
data class InventorySellerIdentifierResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventorySellerResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BulkInventoryGetItems
*/
@Parcelize
data class BulkInventoryGetItems(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkInventoryGet
*/
@Parcelize
data class BulkInventoryGet(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BulkInventoryGetItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyMeta1
*/
@Parcelize
data class CompanyMeta1(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ArticleStoreResponse
*/
@Parcelize
data class ArticleStoreResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PriceArticle
*/
@Parcelize
data class PriceArticle(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DimensionResponse1
*/
@Parcelize
data class DimensionResponse1(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ManufacturerResponse1
*/
@Parcelize
data class ManufacturerResponse1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandMeta1
*/
@Parcelize
data class BrandMeta1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReturnConfig3
*/
@Parcelize
data class ReturnConfig3(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Trader3
*/
@Parcelize
data class Trader3(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: WeightResponse1
*/
@Parcelize
data class WeightResponse1(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Quantity
*/
@Parcelize
data class Quantity(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: QuantitiesArticle
*/
@Parcelize
data class QuantitiesArticle(
    
    
    
    @SerializedName("not_available")
    var notAvailable: Quantity?=null,
    
    @SerializedName("sellable")
    var sellable: Quantity?=null,
    
    @SerializedName("damaged")
    var damaged: Quantity?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: Quantity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetInventories
*/
@Parcelize
data class GetInventories(
    
    
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("company")
    var company: CompanyMeta1?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: ArticleStoreResponse?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("price")
    var price: PriceArticle?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse1?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse1?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta1?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig3?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader3>?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse1?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("quantities")
    var quantities: QuantitiesArticle?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetInventoriesResponse
*/
@Parcelize
data class GetInventoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetInventories>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryJobPayload
*/
@Parcelize
data class InventoryJobPayload(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<InventoryJobPayload>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
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
    
    
    
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    
    @SerializedName("request_params")
    var requestParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trigger_on")
    var triggerOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null,
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryPayload
*/
@Parcelize
data class InventoryPayload(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("errors")
    var errors: String?=null
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponseItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HsnUpsert
*/
@Parcelize
data class HsnUpsert(
    
    
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesObject
*/
@Parcelize
data class HsnCodesObject(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null
    
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
    
    
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesListingResponse
*/
@Parcelize
data class HsnCodesListingResponse(
    
    
    
    @SerializedName("page")
    var page: PageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<HsnCodesObject>?=null
    
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
    
    @SerializedName("cess")
    var cess: Double?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HSNDataInsertV2
*/
@Parcelize
data class HSNDataInsertV2(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<TaxSlab>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HsnCodesListingResponseSchemaV2
*/
@Parcelize
data class HsnCodesListingResponseSchemaV2(
    
    
    
    @SerializedName("page")
    var page: PageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<HSNDataInsertV2>?=null
    
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
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("query")
    var query: ArticleQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStore
*/
@Parcelize
data class AssignStore(
    
    
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<AssignStoreArticle>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null
    
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
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment1?=null,
    
    @SerializedName("store_pincode")
    var storePincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("department")
    var department: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationProductListingResponse
*/
@Parcelize
data class ApplicationProductListingResponse(
    
    
    
    @SerializedName("operators")
    var operators: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryPage
*/
@Parcelize
data class InventoryPage(
    
    
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryStockResponse
*/
@Parcelize
data class InventoryStockResponse(
    
    
    
    @SerializedName("page")
    var page: InventoryPage?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserSerializer2
*/
@Parcelize
data class UserSerializer2(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SellerPhoneNumber
*/
@Parcelize
data class SellerPhoneNumber(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


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
    var mobileNo: SellerPhoneNumber?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    
    @SerializedName("store_uid")
    var storeUid: Int?=null,
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null,
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer2?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer2?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer2?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
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
    Model: ApplicationDepartment
*/
@Parcelize
data class ApplicationDepartment(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationDepartmentListingResponse
*/
@Parcelize
data class ApplicationDepartmentListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ApplicationDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationDepartmentJson
*/
@Parcelize
data class ApplicationDepartmentJson(
    
    
    
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
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyTaxesSerializer
*/
@Parcelize
data class CompanyTaxesSerializer(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null
    
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
    Model: GetCompanyProfileSerializerResponse
*/
@Parcelize
data class GetCompanyProfileSerializerResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer>?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateAddressSerializer
*/
@Parcelize
data class CreateUpdateAddressSerializer(
    
    
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyTaxesSerializer1
*/
@Parcelize
data class CompanyTaxesSerializer1(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCompany
*/
@Parcelize
data class UpdateCompany(
    
    
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: String?=null,
    
    @SerializedName("contact_details")
    var contactDetails: ContactDetails?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_details")
    var businessDetails: BusinessDetails?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CreateUpdateAddressSerializer>?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<CompanyTaxesSerializer1>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("franchise_enabled")
    var franchiseEnabled: Boolean?=null,
    
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
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: DocumentsObj?=null,
    
    @SerializedName("product")
    var product: DocumentsObj?=null,
    
    @SerializedName("store")
    var store: DocumentsObj?=null,
    
    @SerializedName("store_documents")
    var storeDocuments: DocumentsObj?=null,
    
    @SerializedName("company_documents")
    var companyDocuments: DocumentsObj?=null,
    
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
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUpdateBrandRequestSerializer
*/
@Parcelize
data class CreateUpdateBrandRequestSerializer(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("brand_tier")
    var brandTier: String?=null,
    
    @SerializedName("banner")
    var banner: BrandBannerSerializer?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("website_url")
    var websiteUrl: String?=null,
    
    @SerializedName("socials")
    var socials: ArrayList<CompanySocialAccounts>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanySerializer
*/
@Parcelize
data class CompanySerializer(
    
    
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("details")
    var details: CompanyDetails?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("market_channels")
    var marketChannels: ArrayList<String>?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyBrandSerializer
*/
@Parcelize
data class CompanyBrandSerializer(
    
    
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer?=null,
    
    @SerializedName("brand")
    var brand: GetBrandResponseSerializer?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("company")
    var company: CompanySerializer?=null
    
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
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("company")
    var company: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: HolidayDateSerializer
*/
@Parcelize
data class HolidayDateSerializer(
    
    
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HolidaySchemaSerializer
*/
@Parcelize
data class HolidaySchemaSerializer(
    
    
    
    @SerializedName("date")
    var date: HolidayDateSerializer?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("holiday_type")
    var holidayType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationSerializer
*/
@Parcelize
data class LocationSerializer(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("holiday")
    var holiday: ArrayList<HolidaySchemaSerializer>?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
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
    Model: _ArticleAssignment
*/
@Parcelize
data class _ArticleAssignment(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: _ArticleQuery
*/
@Parcelize
data class _ArticleQuery(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: _AssignStoreArticle
*/
@Parcelize
data class _AssignStoreArticle(
    
    
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: _ArticleQuery?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreRequestValidator
*/
@Parcelize
data class AssignStoreRequestValidator(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<_AssignStoreArticle>?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreResponseSerializer
*/
@Parcelize
data class AssignStoreResponseSerializer(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: _ArticleAssignment?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("preice_effective")
    var preiceEffective: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("store_pincode")
    var storePincode: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("size")
    var size: String?=null
    
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
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("empty_cart")
    var emptyCart: Boolean?=null
    
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
    var codCharges: Double?=null,
    
    @SerializedName("anonymous_cod")
    var anonymousCod: Boolean?=null
    
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
    Model: ValidationFailedResponse
*/
@Parcelize
data class ValidationFailedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    var txtRecords: ArrayList<String>?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
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
    private var project_id_b64: String?=null,
    
    
    @SerializedName("gcm_sender_id")
    private var gcm_sender_id_b64: String?=null,
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    
    
    
    
    var projectId : String
    get(){
        try{
            return String(Base64.decode(project_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return project_id_b64 ?: ""
        }
    }
    set(value){
        project_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var gcmSenderId : String
    get(){
        try{
            return String(Base64.decode(gcm_sender_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return gcm_sender_id_b64 ?: ""
        }
    }
    set(value){
        gcm_sender_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
}


/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
}


/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var write_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var writeKey : String
    get(){
        try{
            return String(Base64.decode(write_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return write_key_b64 ?: ""
        }
    }
    set(value){
        write_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var app_id_b64: String?=null,
    
    
    @SerializedName("app_key")
    private var app_key_b64: String?=null,
    
    
    @SerializedName("web_token")
    private var web_token_b64: String?=null
    
    
): Parcelable {
    
    
    
    var appId : String
    get(){
        try{
            return String(Base64.decode(app_id_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return app_id_b64 ?: ""
        }
    }
    set(value){
        app_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var appKey : String
    get(){
        try{
            return String(Base64.decode(app_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return app_key_b64 ?: ""
        }
    }
    set(value){
        app_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
    var webToken : String
    get(){
        try{
            return String(Base64.decode(web_token_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return web_token_b64 ?: ""
        }
    }
    set(value){
        web_token_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var public_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var publicKey : String
    get(){
        try{
            return String(Base64.decode(public_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return public_key_b64 ?: ""
        }
    }
    set(value){
        public_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.DEFAULT))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.DEFAULT)
    }
    
    
    
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
    var value: String?=null,
    
    @SerializedName("sort")
    var sort: String?=null
    
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
    
    
    
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
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
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null
    
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
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null
    
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
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
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
    
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null
    
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
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModes>?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: State
*/
@Parcelize
data class State(
    
    
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null
    
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
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    
    @SerializedName("items")
    var items: CouponAdd?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("schedule")
    var schedule: CouponSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionSchedule
*/
@Parcelize
data class PromotionSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ownership1
*/
@Parcelize
data class Ownership1(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
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
    
    
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue1?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: UsesRemaining1
*/
@Parcelize
data class UsesRemaining1(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("user")
    var user: Int?=null
    
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
    Model: UserRegistered
*/
@Parcelize
data class UserRegistered(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Restrictions1
*/
@Parcelize
data class Restrictions1(
    
    
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PromotionPaymentModes>?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction1?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegistered?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompareObject
*/
@Parcelize
data class CompareObject(
    
    
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ItemCriteria
*/
@Parcelize
data class ItemCriteria(
    
    
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Int>?=null,
    
    @SerializedName("cart_unique_item_quantity")
    var cartUniqueItemQuantity: CompareObject?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObject?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("product_tags")
    var productTags: ArrayList<String>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null,
    
    @SerializedName("cart_unique_item_amount")
    var cartUniqueItemAmount: CompareObject?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("cart_total")
    var cartTotal: CompareObject?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DisplayMeta1
*/
@Parcelize
data class DisplayMeta1(
    
    
    
    @SerializedName("offer_label")
    var offerLabel: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null
    
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
    Model: DiscountOffer
*/
@Parcelize
data class DiscountOffer(
    
    
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("apportion_discount")
    var apportionDiscount: Boolean?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("max_usage_per_transaction")
    var maxUsagePerTransaction: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountRule
*/
@Parcelize
data class DiscountRule(
    
    
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("offer")
    var offer: DiscountOffer?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriteria?=null,
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null
    
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
    Model: PromotionDateMeta
*/
@Parcelize
data class PromotionDateMeta(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionListItem
*/
@Parcelize
data class PromotionListItem(
    
    
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionsResponse
*/
@Parcelize
data class PromotionsResponse(
    
    
    
    @SerializedName("items")
    var items: PromotionListItem?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromotionAdd
*/
@Parcelize
data class PromotionAdd(
    
    
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionUpdate
*/
@Parcelize
data class PromotionUpdate(
    
    
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionPartialUpdate
*/
@Parcelize
data class PromotionPartialUpdate(
    
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("schedule")
    var schedule: PromotionSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ActivePromosResponse
*/
@Parcelize
data class ActivePromosResponse(
    
    
    
    @SerializedName("example")
    var example: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("entity_slug")
    var entitySlug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartItem
*/
@Parcelize
data class CartItem(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("product_id")
    var productId: String?=null
    
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
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
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
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
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
    Model: DiscountRulesApp
*/
@Parcelize
data class DiscountRulesApp(
    
    
    
    @SerializedName("raw_offer")
    var rawOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null,
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FreeGiftItem
*/
@Parcelize
data class FreeGiftItem(
    
    
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null,
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItem?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
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
    
    
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null
    
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
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
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
    
    
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenapiCartDetailsResponse
*/
@Parcelize
data class OpenapiCartDetailsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiErrorResponse
*/
@Parcelize
data class OpenApiErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCartServiceabilityRequest
*/
@Parcelize
data class OpenApiCartServiceabilityRequest(
    
    
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("cart_items")
    var cartItems: CartItem?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null,
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCartServiceabilityResponse
*/
@Parcelize
data class OpenApiCartServiceabilityResponse(
    
    
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartItemMeta
*/
@Parcelize
data class CartItemMeta(
    
    
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("primary_item")
    var primaryItem: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpenApiFiles
*/
@Parcelize
data class OpenApiFiles(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpenApiOrderItem
*/
@Parcelize
data class OpenApiOrderItem(
    
    
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiPlatformCheckoutReq
*/
@Parcelize
data class OpenApiPlatformCheckoutReq(
    
    
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItem>?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddress?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OpenApiCheckoutResponse
*/
@Parcelize
data class OpenApiCheckoutResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_ref_id")
    var orderRefId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AbandonedCart
*/
@Parcelize
data class AbandonedCart(
    
    
    
    @SerializedName("fc_index_map")
    var fcIndexMap: ArrayList<Int>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_archive")
    var isArchive: Boolean?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("promotion")
    var promotion: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cashback")
    var cashback: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bulk_coupon_discount")
    var bulkCouponDiscount: Double?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merge_qty")
    var mergeQty: Boolean?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AbandonedCartResponse
*/
@Parcelize
data class AbandonedCartResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<AbandonedCart>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AddCartDetailResponse
*/
@Parcelize
data class AddCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateCartDetailResponse
*/
@Parcelize
data class UpdateCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}




/*
    Model: E
*/
@Parcelize
data class E(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    var cron: String?=null
    
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
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    
    
    @SerializedName("email")
    var email: Int?=null,
    
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
    Model: Points
*/
@Parcelize
data class Points(
    
    
    
    @SerializedName("available")
    var available: Double?=null
    
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
    Model: Referral
*/
@Parcelize
data class Referral(
    
    
    
    @SerializedName("code")
    var code: String?=null
    
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
    Model: GiveawayAudience
*/
@Parcelize
data class GiveawayAudience(
    
    
    
    @SerializedName("audience_id")
    var audienceId: String?=null,
    
    @SerializedName("current_count")
    var currentCount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HistoryRes
*/
@Parcelize
data class HistoryRes(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PointsHistory>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PointsHistory
*/
@Parcelize
data class PointsHistory(
    
    
    
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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
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
    Model: DiscountItems
*/
@Parcelize
data class DiscountItems(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkDiscount
*/
@Parcelize
data class BulkDiscount(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<DiscountItems>?=null
    
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




/*
    Model: ServiceabilityrErrorResponse
*/
@Parcelize
data class ServiceabilityrErrorResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationServiceabilityConfig
*/
@Parcelize
data class ApplicationServiceabilityConfig(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationServiceabilityConfigResponse
*/
@Parcelize
data class ApplicationServiceabilityConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ServiceabilityrErrorResponse?=null,
    
    @SerializedName("data")
    var data: ApplicationServiceabilityConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityRegionView_Request
*/
@Parcelize
data class EntityRegionView_Request(
    
    
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null,
    
    @SerializedName("sub_type")
    var subType: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityRegionView_page
*/
@Parcelize
data class EntityRegionView_page(
    
    
    
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
    Model: EntityRegionView_Error
*/
@Parcelize
data class EntityRegionView_Error(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityRegionView_Items
*/
@Parcelize
data class EntityRegionView_Items(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityRegionView_Response
*/
@Parcelize
data class EntityRegionView_Response(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: EntityRegionView_page?=null,
    
    @SerializedName("error")
    var error: EntityRegionView_Error?=null,
    
    @SerializedName("data")
    var data: ArrayList<EntityRegionView_Items>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListViewSummary
*/
@Parcelize
data class ListViewSummary(
    
    
    
    @SerializedName("total_active_zones")
    var totalActiveZones: Int?=null,
    
    @SerializedName("total_pincodes_served")
    var totalPincodesServed: Int?=null,
    
    @SerializedName("total_zones")
    var totalZones: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
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
    Model: ListViewChannels
*/
@Parcelize
data class ListViewChannels(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ListViewProduct
*/
@Parcelize
data class ListViewProduct(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("channels")
    var channels: ListViewChannels?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null,
    
    @SerializedName("product")
    var product: ListViewProduct?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListViewResponse
*/
@Parcelize
data class ListViewResponse(
    
    
    
    @SerializedName("summary")
    var summary: ArrayList<ListViewSummary>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyStoreView_PageItems
*/
@Parcelize
data class CompanyStoreView_PageItems(
    
    
    
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
    Model: CompanyStoreView_Response
*/
@Parcelize
data class CompanyStoreView_Response(
    
    
    
    @SerializedName("page")
    var page: ArrayList<CompanyStoreView_PageItems>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetZoneDataViewChannels
*/
@Parcelize
data class GetZoneDataViewChannels(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ZoneProductTypes
*/
@Parcelize
data class ZoneProductTypes(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ZoneMappingType
*/
@Parcelize
data class ZoneMappingType(
    
    
    
    @SerializedName("pincode")
    var pincode: ArrayList<String>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetZoneDataViewItems
*/
@Parcelize
data class GetZoneDataViewItems(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetSingleZoneDataViewResponse
*/
@Parcelize
data class GetSingleZoneDataViewResponse(
    
    
    
    @SerializedName("data")
    var data: GetZoneDataViewItems?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateZoneData
*/
@Parcelize
data class UpdateZoneData(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ZoneUpdateRequest
*/
@Parcelize
data class ZoneUpdateRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: UpdateZoneData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ZoneSuccessResponse
*/
@Parcelize
data class ZoneSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateZoneData
*/
@Parcelize
data class CreateZoneData(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ZoneRequest
*/
@Parcelize
data class ZoneRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: CreateZoneData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ZoneResponse
*/
@Parcelize
data class ZoneResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetZoneFromPincodeViewRequest
*/
@Parcelize
data class GetZoneFromPincodeViewRequest(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetZoneFromPincodeViewResponse
*/
@Parcelize
data class GetZoneFromPincodeViewResponse(
    
    
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EwayBillResponse
*/
@Parcelize
data class EwayBillResponse(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EinvoiceResponse
*/
@Parcelize
data class EinvoiceResponse(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GstCredentialsResponse
*/
@Parcelize
data class GstCredentialsResponse(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: EwayBillResponse?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: EinvoiceResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OpeningClosing
*/
@Parcelize
data class OpeningClosing(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TimmingResponse
*/
@Parcelize
data class TimmingResponse(
    
    
    
    @SerializedName("closing")
    var closing: OpeningClosing?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("opening")
    var opening: OpeningClosing?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddressResponse
*/
@Parcelize
data class AddressResponse(
    
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatedByResponse
*/
@Parcelize
data class CreatedByResponse(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ModifiedByResponse
*/
@Parcelize
data class ModifiedByResponse(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DocumentsResponse
*/
@Parcelize
data class DocumentsResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ContactNumberResponse
*/
@Parcelize
data class ContactNumberResponse(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MobileNo
*/
@Parcelize
data class MobileNo(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ManagerResponse
*/
@Parcelize
data class ManagerResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: MobileNo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: WarningsResponse
*/
@Parcelize
data class WarningsResponse(
    
    
    
    @SerializedName("store_address")
    var storeAddress: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Dp
*/
@Parcelize
data class Dp(
    
    
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("area_code")
    var areaCode: Int?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LogisticsResponse
*/
@Parcelize
data class LogisticsResponse(
    
    
    
    @SerializedName("override")
    var override: Boolean?=null,
    
    @SerializedName("dp")
    var dp: Dp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: IntegrationTypeResponse
*/
@Parcelize
data class IntegrationTypeResponse(
    
    
    
    @SerializedName("order")
    var order: String?=null,
    
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductReturnConfigResponse
*/
@Parcelize
data class ProductReturnConfigResponse(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ItemResponse
*/
@Parcelize
data class ItemResponse(
    
    
    
    @SerializedName("gst_credentials")
    var gstCredentials: GstCredentialsResponse?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<TimmingResponse>?=null,
    
    @SerializedName("address")
    var address: AddressResponse?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedByResponse?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<DocumentsResponse>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<ContactNumberResponse>?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manager")
    var manager: ManagerResponse?=null,
    
    @SerializedName("warnings")
    var warnings: WarningsResponse?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: IntegrationTypeResponse?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetStoresViewResponse
*/
@Parcelize
data class GetStoresViewResponse(
    
    
    
    @SerializedName("page")
    var page: PageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<ItemResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


