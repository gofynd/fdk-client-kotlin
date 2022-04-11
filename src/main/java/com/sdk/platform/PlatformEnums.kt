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
        Enum: PageType
        Used By: Content
    */
    enum class PageType(val value:String){
        
        @SerializedName("about-us")
        aboutUs("about-us"), 
        
        @SerializedName("addresses")
        addresses("addresses"), 
        
        @SerializedName("blog")
        blog("blog"), 
        
        @SerializedName("brands")
        brands("brands"), 
        
        @SerializedName("cards")
        cards("cards"), 
        
        @SerializedName("cart")
        cart("cart"), 
        
        @SerializedName("categories")
        categories("categories"), 
        
        @SerializedName("brand")
        brand("brand"), 
        
        @SerializedName("category")
        category("category"), 
        
        @SerializedName("collection")
        collection("collection"), 
        
        @SerializedName("collections")
        collections("collections"), 
        
        @SerializedName("contact-us")
        contactUs("contact-us"), 
        
        @SerializedName("external")
        externalLink("external"), 
        
        @SerializedName("faq")
        faq("faq"), 
        
        @SerializedName("freshchat")
        freshchat("freshchat"), 
        
        @SerializedName("home")
        home("home"), 
        
        @SerializedName("notification-settings")
        notificationSettings("notification-settings"), 
        
        @SerializedName("orders")
        orders("orders"), 
        
        @SerializedName("page")
        page("page"), 
        
        @SerializedName("policy")
        policy("policy"), 
        
        @SerializedName("product")
        product("product"), 
        
        @SerializedName("product-reviews")
        productReviews("product-reviews"), 
        
        @SerializedName("add-product-review")
        addProductReview("add-product-review"), 
        
        @SerializedName("product-request")
        productRequest("product-request"), 
        
        @SerializedName("products")
        products("products"), 
        
        @SerializedName("profile")
        profile("profile"), 
        
        @SerializedName("profile-basic")
        profileBasic("profile-basic"), 
        
        @SerializedName("profile-company")
        profileCompany("profile-company"), 
        
        @SerializedName("profile-emails")
        profileEmails("profile-emails"), 
        
        @SerializedName("profile-phones")
        profilePhones("profile-phones"), 
        
        @SerializedName("rate-us")
        rateUs("rate-us"), 
        
        @SerializedName("refer-earn")
        referEarn("refer-earn"), 
        
        @SerializedName("settings")
        settings("settings"), 
        
        @SerializedName("shared-cart")
        sharedCart("shared-cart"), 
        
        @SerializedName("tnc")
        tnc("tnc"), 
        
        @SerializedName("track-order")
        trackOrder("track-order"), 
        
        @SerializedName("wishlist")
        wishlist("wishlist"), 
        
        @SerializedName("sections")
        sections("sections"), 
        
        @SerializedName("form")
        form("form"), 
        
        @SerializedName("cart-delivery")
        cartDelivery("cart-delivery"), 
        
        @SerializedName("cart-payment")
        cartPayment("cart-payment"), 
        
        @SerializedName("cart-review")
        cartReview("cart-review");
        

        companion object {
            fun valueOfPageType(value : String): PageType? {
                return PageType.values().find {
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


