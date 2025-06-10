package com.sdk.platform.discount

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    
    @SerializedName("zone_ids")
    var zoneIds: ArrayList<String>?=null,
    
    @SerializedName("validity")
    var validity: ValidityObject?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountMeta
*/
@Parcelize
data class DiscountMeta(
    
    
    
    @SerializedName("timer")
    var timer: Boolean?=null,
    
    @SerializedName("hours")
    var hours: Double?=null,
    
    @SerializedName("minutes")
    var minutes: Double?=null
    
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
    
    @SerializedName("zone_ids")
    var zoneIds: ArrayList<String>?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null,
    
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
    Model: FileJobBody
*/
@Parcelize
data class FileJobBody(
    
    
    
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
    
    @SerializedName("extension_ids")
    var extensionIds: ArrayList<String>?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: ArrayList<String>?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null,
    
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
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null
    
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
    Model: FileJobResponseSchema
*/
@Parcelize
data class FileJobResponseSchema(
    
    
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("body")
    var body: FileJobBody?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("file_type")
    var fileType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("progress")
    var progress: Int?=null,
    
    @SerializedName("extension_ids")
    var extensionIds: ArrayList<String>?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FileJobRequestSchema
*/
@Parcelize
data class FileJobRequestSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("app_ids")
    var appIds: ArrayList<String>?=null,
    
    @SerializedName("job_type")
    var jobType: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("discount_level")
    var discountLevel: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("validity")
    var validity: ValidityObject?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    Model: CancelJobResponseSchema
*/
@Parcelize
data class CancelJobResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
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
    Model: BadRequestData
*/
@Parcelize
data class BadRequestData(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BadRequestObjectGet
*/
@Parcelize
data class BadRequestObjectGet(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("data")
    var data: BadRequestData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





