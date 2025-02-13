package com.sdk.platform.lead

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GeneralConfigResponse
*/
@Parcelize
data class GeneralConfigResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("support_communication")
    var supportCommunication: ArrayList<SupportCommunicationSchema>?=null,
    
    @SerializedName("show_communication_info")
    var showCommunicationInfo: Boolean?=null,
    
    @SerializedName("show_support_dris")
    var showSupportDris: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("integration")
    var integration: GeneralConfigIntegrationSchema?=null,
    
    @SerializedName("allow_ticket_creation")
    var allowTicketCreation: Boolean?=null,
    
    @SerializedName("show_listing")
    var showListing: Boolean?=null,
    
    @SerializedName("available_integration")
    var availableIntegration: ArrayList<String>?=null,
    
    @SerializedName("enable_dris")
    var enableDris: Boolean?=null,
    
    @SerializedName("support_email")
    var supportEmail: SupportSchema?=null,
    
    @SerializedName("support_phone")
    var supportPhone: SupportSchema?=null,
    
    @SerializedName("support_faq")
    var supportFaq: SupportSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SupportSchema
*/
@Parcelize
data class SupportSchema(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SupportCommunicationSchema
*/
@Parcelize
data class SupportCommunicationSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GeneralConfigIntegrationSchema
*/
@Parcelize
data class GeneralConfigIntegrationSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null
    
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
    var size: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
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
    var priority: String?=null,
    
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
    var priority: String?=null,
    
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
    var assignees: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("all_categories")
    var allCategories: @RawValue HashMap<String,Any>?=null
    
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
    var userAgent: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null
    
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
            return String(Base64.decode(description_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return description_b64 ?: ""
        }
    }
    set(value){
        description_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    
    
}



             
/*
    Model: AdditionalInfoSchema
*/
@Parcelize
data class AdditionalInfoSchema(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("display_value")
    var displayValue: String?=null,
    
    @SerializedName("priority")
    var priority: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
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
    
    @SerializedName("additional_info")
    var additionalInfo: ArrayList<AdditionalInfoSchema>?=null,
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("subscribers")
    var subscribers: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
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
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SLA
*/
@Parcelize
data class SLA(
    
    
    
    @SerializedName("resolution_time")
    var resolutionTime: String?=null
    
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
    
    @SerializedName("available_assignees")
    var availableAssignees: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null
    
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
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("sub_categories")
    var subCategories: ArrayList<TicketCategory>?=null,
    
    @SerializedName("group_id")
    var groupId: Double?=null,
    
    @SerializedName("feedback_form")
    var feedbackForm: FeedbackForm?=null
    
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
    var key: String?=null
    
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
    var createdAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
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
    var createdAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
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
    var category: TicketCategory?=null,
    
    @SerializedName("sub_category")
    var subCategory: String?=null,
    
    @SerializedName("source")
    var source: TicketSourceEnum?=null,
    
    @SerializedName("status")
    var status: Status?=null,
    
    @SerializedName("priority")
    var priority: Priority?=null,
    
    @SerializedName("sla")
    var sla: SLA?=null,
    
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
    var createdAt: String?=null,
    
    @SerializedName("video_room_id")
    var videoRoomId: String?=null,
    
    @SerializedName("subscribers")
    var subscribers: ArrayList<String>?=null,
    
    @SerializedName("additional_info")
    var additionalInfo: ArrayList<AdditionalInfoSchema>?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error4XX
*/
@Parcelize
data class Error4XX(
    
    
    
    @SerializedName("message")
    var message: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stack")
    var stack: String?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundError
*/
@Parcelize
data class NotFoundError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}







    /*
        Enum: TicketAssetTypeEnum
        Used By: Lead
    */
    enum class TicketAssetTypeEnum(val value:String){
        
        @SerializedName("image")
        image("image"), 
        
        @SerializedName("video")
        video("video"), 
        
        @SerializedName("file")
        file("file"), 
        
        @SerializedName("youtube")
        youtube("youtube"), 
        
        @SerializedName("product")
        product("product"), 
        
        @SerializedName("collection")
        collection("collection"), 
        
        @SerializedName("brand")
        brand("brand"), 
        
        @SerializedName("shipment")
        shipment("shipment"), 
        
        @SerializedName("order")
        order("order");
        

        companion object {
            fun valueOfTicketAssetTypeEnum(value : String): TicketAssetTypeEnum? {
                return TicketAssetTypeEnum.values().find {
                    it.value == value
                }
            }
        }
    }



    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    enum class PriorityEnum(val value:String){
        
        @SerializedName("high")
        high("high"), 
        
        @SerializedName("low")
        low("low"), 
        
        @SerializedName("medium")
        medium("medium"), 
        
        @SerializedName("urgent")
        urgent("urgent");
        

        companion object {
            fun valueOfPriorityEnum(value : String): PriorityEnum? {
                return PriorityEnum.values().find {
                    it.value == value
                }
            }
        }
    }



    /*
        Enum: HistoryTypeEnum
        Used By: Lead
    */
    enum class HistoryTypeEnum(val value:String){
        
        @SerializedName("rating")
        rating("rating"), 
        
        @SerializedName("log")
        log("log"), 
        
        @SerializedName("comment")
        comment("comment"), 
        
        @SerializedName("diff")
        diff("diff"), 
        
        @SerializedName("thread")
        thread("thread");
        

        companion object {
            fun valueOfHistoryTypeEnum(value : String): HistoryTypeEnum? {
                return HistoryTypeEnum.values().find {
                    it.value == value
                }
            }
        }
    }



    /*
        Enum: TicketSourceEnum
        Used By: Lead
    */
    enum class TicketSourceEnum(val value:String){
        
        @SerializedName("platform_panel")
        platformPanel("platform_panel"), 
        
        @SerializedName("sales_channel")
        salesChannel("sales_channel"), 
        
        @SerializedName("partner_panel")
        partnerPanel("partner_panel");
        

        companion object {
            fun valueOfTicketSourceEnum(value : String): TicketSourceEnum? {
                return TicketSourceEnum.values().find {
                    it.value == value
                }
            }
        }
    }

