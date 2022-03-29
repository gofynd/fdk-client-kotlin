package com.sdk.public

import com.google.gson.annotations.SerializedName






    /*
        Enum: SubscriberStatus
        Used By: Webhook
    */
    enum class SubscriberStatus(val value:String){
        
        @SerializedName("active")
        active("active"), 
        
        @SerializedName("inactive")
        inactive("inactive"), 
        
        @SerializedName("blocked")
        blocked("blocked");
        

        companion object {
            fun valueOfSubscriberStatus(value : String): SubscriberStatus? {
                return SubscriberStatus.values().find {
                    it.value == value
                }
            }
        }
    }

