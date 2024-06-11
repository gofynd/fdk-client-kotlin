package com.sdk.application.webhook

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ClickEventBatch
*/
@Parcelize
data class ClickEventBatch(
    
    
    
    @SerializedName("event_name")
    var eventName: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ClickEventRequest
*/
@Parcelize
data class ClickEventRequest(
    
    
    
    @SerializedName("batch")
    var batch: ArrayList<ClickEventBatch>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ClickEventResponse
*/
@Parcelize
data class ClickEventResponse(
    
    
    
    @SerializedName("success_count")
    var successCount: Int?=null,
    
    @SerializedName("failed_count")
    var failedCount: Int?=null,
    
    @SerializedName("failed_events")
    var failedEvents: ArrayList<ClickEventBatch>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





