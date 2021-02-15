

/*
    Model: GetTokenForVideoRoomResponse,
*/

@Parcelize
data class GetTokenForVideoRoomResponse(
    
    val accessToken: String?
    
): Parcelable

/*
    Model: GetParticipantsInsideVideoRoomResponse,
*/

@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    val participants: [Any]?
    
): Parcelable

/*
    Model: SubmitCustomFormResponse,
*/

@Parcelize
data class SubmitCustomFormResponse(
    
    val ticket: Ticket?
    
): Parcelable

/*
    Model: Context,
*/

@Parcelize
data class Context(
    
    val applicationId: String?,
    
    val companyId: String?
    
): Parcelable

/*
    Model: CreatedOn,
*/

@Parcelize
data class CreatedOn(
    
    val userAgent: String?
    
): Parcelable

/*
    Model: Asset,
*/

@Parcelize
data class Asset(
    
    val display: String?,
    
    val value: String?,
    
    val type: String?
    
): Parcelable

/*
    Model: Content,
*/

@Parcelize
data class Content(
    
    val title: String?,
    
    val description: String?,
    
    val attachments: [Any]?
    
): Parcelable

/*
    Model: APIError,
*/

@Parcelize
data class APIError(
    
    val code: Double?,
    
    val error: [String: Any]?,
    
    val message: String?
    
): Parcelable

/*
    Model: AddTicketPayload,
*/

@Parcelize
data class AddTicketPayload(
    
    val status: String?,
    
    val priority: String?,
    
    val category: String?,
    
    val content: Content?
    
): Parcelable

/*
    Model: Priority,
*/

@Parcelize
data class Priority(
    
    val key: String?,
    
    val display: String?,
    
    val color: String?
    
): Parcelable

/*
    Model: Status,
*/

@Parcelize
data class Status(
    
    val key: String?,
    
    val display: String?,
    
    val color: String?
    
): Parcelable

/*
    Model: Category,
*/

@Parcelize
data class Category(
    
    val key: String?,
    
    val display: String?
    
): Parcelable

/*
    Model: SubmitButton,
*/

@Parcelize
data class SubmitButton(
    
    val title: String?,
    
    val titleColor: String?,
    
    val backgroundColor: String?
    
): Parcelable

/*
    Model: PollForAssignment,
*/

@Parcelize
data class PollForAssignment(
    
    val duration: Double?,
    
    val message: String?,
    
    val successMessage: String?,
    
    val failureMessage: String?
    
): Parcelable

/*
    Model: CustomForm,
*/

@Parcelize
data class CustomForm(
    
    val applicationId: String?,
    
    val slug: String?,
    
    val headerImage: String?,
    
    val title: String?,
    
    val description: String?,
    
    val loginRequired: Boolean?,
    
    val shouldNotify: Boolean?,
    
    val successMessage: String?,
    
    val submitButton: SubmitButton?,
    
    val inputs: [Any]?,
    
    val createdOn: CreatedOn?,
    
    val createdBy: [String: Any]?,
    
    val pollForAssignment: PollForAssignment?,
    
    val id: String?,
    
    val updatedAt: String?,
    
    val createdAt: String?
    
): Parcelable

/*
    Model: TicketHistory,
*/

@Parcelize
data class TicketHistory(
    
    val type: String?,
    
    val value: [String: Any]?,
    
    val ticketId: String?,
    
    val createdOn: CreatedOn?,
    
    val createdBy: [String: Any]?,
    
    val id: String?,
    
    val updatedAt: String?,
    
    val createdAt: String?
    
): Parcelable

/*
    Model: Ticket,
*/

@Parcelize
data class Ticket(
    
    val context: Context?,
    
    val createdOn: CreatedOn?,
    
    val responseId: String?,
    
    val content: Content?,
    
    val ticketId: String?,
    
    val category: Category?,
    
    val source: String?,
    
    val status: Status?,
    
    val priority: Priority?,
    
    val createdBy: [String: Any]?,
    
    val assignedTo: [String: Any]?,
    
    val tags: [Any]?,
    
    val customJson: [String: Any]?,
    
    val id: String?,
    
    val updatedAt: String?,
    
    val createdAt: String?
    
): Parcelable

