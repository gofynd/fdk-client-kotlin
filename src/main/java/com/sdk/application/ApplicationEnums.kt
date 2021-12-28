package com.sdk.application







    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    enum class PriorityEnum(val value:String){
        
        low("low"),
        
        medium("medium"),
        
        high("high"),
        
        urgent("urgent"),
        
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
        Enum: TicketAssetTypeEnum
        Used By: Lead
    */
    enum class TicketAssetTypeEnum(val value:String){
        
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






    /*
        Enum: PageType
        Used By: Content
    */
    enum class PageType(val value:String){
        
        aboutUs("about-us"),
        
        addresses("addresses"),
        
        blog("blog"),
        
        brands("brands"),
        
        cards("cards"),
        
        cart("cart"),
        
        categories("categories"),
        
        brand("brand"),
        
        category("category"),
        
        collection("collection"),
        
        collections("collections"),
        
        contactUs("contact-us"),
        
        externalLink("external"),
        
        faq("faq"),
        
        freshchat("freshchat"),
        
        home("home"),
        
        notificationSettings("notification-settings"),
        
        orders("orders"),
        
        page("page"),
        
        policy("policy"),
        
        product("product"),
        
        productReviews("product-reviews"),
        
        addProductReview("add-product-review"),
        
        productRequest("product-request"),
        
        products("products"),
        
        profile("profile"),
        
        profileBasic("profile-basic"),
        
        profileCompany("profile-company"),
        
        profileEmails("profile-emails"),
        
        profilePhones("profile-phones"),
        
        rateUs("rate-us"),
        
        referEarn("refer-earn"),
        
        settings("settings"),
        
        sharedCart("shared-cart"),
        
        tnc("tnc"),
        
        trackOrder("track-order"),
        
        wishlist("wishlist"),
        
        sections("sections"),
        
        form("form"),
        
        cartDelivery("cart-delivery"),
        
        cartPayment("cart-payment"),
        
        cartReview("cart-review"),
        
    }











