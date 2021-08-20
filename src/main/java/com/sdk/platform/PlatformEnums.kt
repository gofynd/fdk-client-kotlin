package com.sdk.platform





    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    enum class PriorityEnum(val value:String){
        
        low("low"),
        
        medium("medium"),
        
        high("high"),
        
    }



    /*
        Enum: HistoryTypeEnum
        Used By: Lead
    */
    enum class HistoryTypeEnum(val value:String){
        
        rating("rating"),
        
        log("log"),
        
        comment("comment"),
        
    }



    /*
        Enum: TicketAssetType
        Used By: Lead
    */
    enum class TicketAssetType(val value:String){
        
        image("image"),
        
        video("video"),
        
        file("file"),
        
        youtube("youtube"),
        
        product("product"),
        
        collection("collection"),
        
        brand("brand"),
        
        shipment("shipment"),
        
        order("order"),
        
    }



    /*
        Enum: TicketSourceEnum
        Used By: Lead
    */
    enum class TicketSourceEnum(val value:String){
        
        platformPanel("platform_panel"),
        
        salesChannel("sales_channel"),
        
    }





















