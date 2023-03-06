package com.sdk.platform

import com.google.gson.annotations.SerializedName
import android.net.Uri


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
        
        @SerializedName("profile-order-shipment")
        profileOrderShipment("profile-order-shipment"), 
        
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
        cartReview("cart-review"), 
        
        @SerializedName("login")
        login("login"), 
        
        @SerializedName("register")
        register("register"), 
        
        @SerializedName("shipping-policy")
        shippingPolicy("shipping-policy"), 
        
        @SerializedName("return-policy")
        returnPolicy("return-policy");
        

        companion object {
            fun valueOfPageType(value : String): PageType? {
                return PageType.values().find {
                    it.value == value
                }
            }

            fun fromUrl(url: String) : PageType?{

                val uri = Uri.parse(url)

                var pageType: PageType? = null

                val pathSegments: MutableList<String> = uri.pathSegments

                var uriPath = "/"
                pathSegments.forEachIndexed { index, pathSegment ->
                    uriPath = "$uriPath$pathSegment/"
                }

                val builder = StringBuilder(uriPath)
                if (builder.isNotEmpty() && builder[0].toString() == "/") {
                    builder.deleteCharAt(0)
                }
                if (builder.isNotEmpty() && builder[builder.length - 1].toString() == "/") {
                    builder.deleteCharAt(builder.length - 1)
                }

                run loop@{
                    Navigator.values().forEachIndexed { index, model ->
                        val sb = StringBuilder(model.link)

                        sb.deleteCharAt(0)

                        if (sb.length > 1 && sb[sb.lastIndex] == '/') {
                            sb.deleteCharAt(sb.lastIndex)
                        }

                        val splitStr: List<String> = sb.split("/")

                        val b = arrayListOf<Boolean>()
                        splitStr.forEach {
                            when {
                                it.startsWith(":") -> {

                                }
                                builder.split("/").any { deepLinkPath ->
                                    deepLinkPath.equals(it, true)
                                } -> {
                                    b.add(true)
                                }
                                else -> {
                                    b.add(false)
                                }
                            }
                        }

                        val sizeB = if (model.params?.get(0)?.required == true) {
                            builder.split("/").size == splitStr.size
                        } else {
                            builder.split("/").size <= splitStr.size
                        }

                        if (sizeB && b.all { it }) {
                            val regexStr = StringBuilder("")
                            splitStr.forEachIndexed { i, a ->
                                when {
                                    a.startsWith(":") -> {
                                        regexStr.append("/([^;]*)")
                                    }
                                    i == 0 -> {
                                        regexStr.append(a)
                                    }
                                    else -> {
                                        regexStr.append("/$a")
                                    }
                                }
                            }
                            if (sb == regexStr || sb.toString()
                                    .matches(regex = Regex(regexStr.toString()))
                            ) {
                                pageType = model.pageType
                                return@loop
                            }
                        }
                    }
                }

                return pageType
            }
        }
    }
