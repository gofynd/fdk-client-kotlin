package com.sdk.platform.analytics

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
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConditionsSchema
*/
@Parcelize
data class ConditionsSchema(
    
    
    
    @SerializedName("column_name")
    var columnName: String?=null,
    
    @SerializedName("conditional_operator")
    var conditionalOperator: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WhereSchema
*/
@Parcelize
data class WhereSchema(
    
    
    
    @SerializedName("conditions")
    var conditions: ArrayList<ConditionsSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SortBySchema
*/
@Parcelize
data class SortBySchema(
    
    
    
    @SerializedName("column")
    var column: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: JobExecute
*/
@Parcelize
data class JobExecute(
    
    
    
    @SerializedName("query")
    var query: String?=null,
    
    @SerializedName("encoding")
    var encoding: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





