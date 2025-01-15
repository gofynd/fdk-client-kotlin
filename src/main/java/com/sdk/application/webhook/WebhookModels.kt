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
    Model: ClickEventPayload
*/
@Parcelize
data class ClickEventPayload(
    
    
    
    @SerializedName("batch")
    var batch: ArrayList<ClickEventBatch>?=null,
    
    @SerializedName("sent_at")
    var sentAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ClickEventDetails
*/
@Parcelize
data class ClickEventDetails(
    
    
    
    @SerializedName("success_count")
    var successCount: Int?=null,
    
    @SerializedName("failed_count")
    var failedCount: Int?=null,
    
    @SerializedName("failed_events")
    var failedEvents: ArrayList<ClickEventBatch>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





