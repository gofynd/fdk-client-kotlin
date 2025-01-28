package com.sdk.application.lead

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("rr_id")
    var rrId: String?=null
    
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
    var ticket: Ticket?=null,
    
    @SerializedName("notified_to")
    var notifiedTo: ArrayList<String>?=null,
    
    @SerializedName("response")
    var response: FormResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FormResponse
*/
@Parcelize
data class FormResponse(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("form_slug")
    var formSlug: String?=null,
    
    @SerializedName("response")
    var response: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
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
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
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
    var createdBy: String?=null,
    
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
    var additionalInfo: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
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
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
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
        Enum: TicketSourceEnum
        Used By: Lead
    */
    enum class TicketSourceEnum(val value:String){
        
        @SerializedName("platform_panel")
        platformPanel("platform_panel"), 
        
        @SerializedName("sales_channel")
        salesChannel("sales_channel");
        

        companion object {
            fun valueOfTicketSourceEnum(value : String): TicketSourceEnum? {
                return TicketSourceEnum.values().find {
                    it.value == value
                }
            }
        }
    }

