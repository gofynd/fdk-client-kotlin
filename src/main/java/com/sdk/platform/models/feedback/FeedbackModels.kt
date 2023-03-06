package com.sdk.platform.models.feedback

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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



