package com.sdk.platform.authorization

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: StandardError
*/
@Parcelize
data class StandardError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidationErrors
*/
@Parcelize
data class ValidationErrors(
    
    
    
    @SerializedName("errors")
    var errors: ArrayList<ValidationError>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationStaff
*/
@Parcelize
data class ApplicationStaff(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("order_incent")
    var orderIncent: Boolean?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationStaffPage
*/
@Parcelize
data class ApplicationStaffPage(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ApplicationStaff>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationError
*/
@Parcelize
data class ValidationError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("field")
    var field: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





