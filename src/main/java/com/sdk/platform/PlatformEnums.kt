package com.sdk.platform

import com.google.gson.annotations.SerializedName






    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    enum class PriorityEnum(val value:String){
        
        @SerializedName("low")
        low("low"), 
        
        @SerializedName("medium")
        medium("medium"), 
        
        @SerializedName("high")
        high("high"), 
        
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
        comment("comment");
        

        companion object {
            fun valueOfHistoryTypeEnum(value : String): HistoryTypeEnum? {
                return HistoryTypeEnum.values().find {
                    it.value == value
                }
            }
        }
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



    /*
        Enum: TicketIntegrationDetails
        Used By: Lead
    */
    enum class TicketIntegrationDetails(val value:String){
        
        @SerializedName("default")
        defaultCase("default"), 
        
        @SerializedName("freshdesk")
        freshdesk("freshdesk"), 
        
        @SerializedName("kapture")
        kapture("kapture");
        

        companion object {
            fun valueOfTicketIntegrationDetails(value : String): TicketIntegrationDetails? {
                return TicketIntegrationDetails.values().find {
                    it.value == value
                }
            }
        }
    }






    /*
        Enum: GenerationEntityType
        Used By: Content
    */
    enum class GenerationEntityType(val value:String){
        
        @SerializedName("title")
        title("title"), 
        
        @SerializedName("description")
        description("description");
        

        companion object {
            fun valueOfGenerationEntityType(value : String): GenerationEntityType? {
                return GenerationEntityType.values().find {
                    it.value == value
                }
            }
        }
    }





















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



