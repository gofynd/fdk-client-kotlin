package com.sdk.platform

import java.util.*
import kotlin.collections.ArrayList

class NavParam(val key: String, val required: Boolean)

class NavQuery(val key: String, val required: Boolean)

enum class Navigator(
    val pageType: PageType,
    val navName: String,
    val link: String,
    val params: ArrayList<NavParam>? = null,
    val query: ArrayList<NavQuery>? = null
) {
   
    ABOUT_US(
        pageType = PageType.aboutUs,
        navName = "About Us",
        link = "/about-us"
    ),
   
    ADDRESSES(
        pageType = PageType.addresses,
        navName = "Saved Addresses",
        link = "/profile/address"
    ),
   
    BLOG(
        pageType = PageType.blog,
        navName = "Blog",
        link = "/blog/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = false)
        )
    ),
   
    BRANDS(
        pageType = PageType.brands,
        navName = "Brands",
        link = "/brands/:department",
        params = arrayListOf(
            NavParam(key = "department", required = false)
        )
    ),
   
    CARDS(
        pageType = PageType.cards,
        navName = "Saved Cards",
        link = "/profile/my-cards"
    ),
   
    CART(
        pageType = PageType.cart,
        navName = "Cart",
        link = "/cart/bag/"
    ),
   
    CATEGORIES(
        pageType = PageType.categories,
        navName = "Categories",
        link = "/categories/:department",
        params = arrayListOf(
            NavParam(key = "department", required = false)
        )
    ),
   
    BRAND(
        pageType = PageType.brand,
        navName = "Brand",
        link = "/brand/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    CATEGORY(
        pageType = PageType.category,
        navName = "Category",
        link = "/category/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    COLLECTION(
        pageType = PageType.collection,
        navName = "Collection",
        link = "/collection/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    COLLECTIONS(
        pageType = PageType.collections,
        navName = "Collections",
        link = "/collections/"
    ),
   
    CONTACT_US(
        pageType = PageType.contactUs,
        navName = "Contact Us",
        link = "/contact-us/"
    ),
   
    EXTERNAL(
        pageType = PageType.externalLink,
        navName = "External Link",
        link = "/external/",
        query = arrayListOf(
            NavQuery(key = "url", required = true)
        )
    ),
   
    FAQ(
        pageType = PageType.faq,
        navName = "FAQ",
        link = "/faq"
    ),
   
    FRESHCHAT(
        pageType = PageType.freshchat,
        navName = "Chat by Freshchat",
        link = "/freshchat"
    ),
   
    HOME(
        pageType = PageType.home,
        navName = "Home",
        link = "/"
    ),
   
    NOTIFICATION_SETTINGS(
        pageType = PageType.notificationSettings,
        navName = "Notification Settings",
        link = "/notification-settings"
    ),
   
    ORDERS(
        pageType = PageType.orders,
        navName = "Orders",
        link = "/profile/orders"
    ),
   
    PAGE(
        pageType = PageType.page,
        navName = "Page",
        link = "/page/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    POLICY(
        pageType = PageType.policy,
        navName = "Privacy Policy",
        link = "/privacy-policy"
    ),
   
    PRODUCT(
        pageType = PageType.product,
        navName = "Product",
        link = "/product/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    PRODUCT_REQUEST(
        pageType = PageType.productRequest,
        navName = "Product Request",
        link = "/product-request/"
    ),
   
    PRODUCTS(
        pageType = PageType.products,
        navName = "Products",
        link = "/products/"
    ),
   
    PROFILE(
        pageType = PageType.profile,
        navName = "Profile",
        link = "/profile"
    ),
   
    PROFILE_ORDER_SHIPMENT(
        pageType = PageType.profileOrderShipment,
        navName = "profile orders shipment",
        link = "/profile/orders/shipment/:shipmentid",
        params = arrayListOf(
            NavParam(key = "shipmentid", required = true)
        )
    ),
   
    PROFILE_BASIC(
        pageType = PageType.profileBasic,
        navName = "Basic Profile",
        link = "/profile/details"
    ),
   
    PROFILE_COMPANY(
        pageType = PageType.profileCompany,
        navName = "Profile Company",
        link = "/profile/company"
    ),
   
    PROFILE_EMAILS(
        pageType = PageType.profileEmails,
        navName = "Profile Emails",
        link = "/profile/email"
    ),
   
    PROFILE_PHONES(
        pageType = PageType.profilePhones,
        navName = "Profile Phones",
        link = "/profile/phone"
    ),
   
    RATE_US(
        pageType = PageType.rateUs,
        navName = "Rate Us",
        link = "/rate-us"
    ),
   
    REFER_EARN(
        pageType = PageType.referEarn,
        navName = "Refer & Earn",
        link = "/profile/refer-earn"
    ),
   
    SETTINGS(
        pageType = PageType.settings,
        navName = "Settings",
        link = "/setting/currency"
    ),
   
    SHARED_CART(
        pageType = PageType.sharedCart,
        navName = "Shared Cart",
        link = "/shared-cart/:token",
        params = arrayListOf(
            NavParam(key = "token", required = true)
        )
    ),
   
    TNC(
        pageType = PageType.tnc,
        navName = "Terms and Conditions",
        link = "/terms-and-conditions"
    ),
   
    TRACK_ORDER(
        pageType = PageType.trackOrder,
        navName = "Track Order",
        link = "/order-tracking/:orderId",
        params = arrayListOf(
            NavParam(key = "orderId", required = false)
        )
    ),
   
    WISHLIST(
        pageType = PageType.wishlist,
        navName = "Wishlist",
        link = "/wishlist/"
    ),
   
    SECTIONS(
        pageType = PageType.sections,
        navName = "Sections",
        link = "/sections/:group",
        params = arrayListOf(
            NavParam(key = "group", required = true)
        )
    ),
   
    FORM(
        pageType = PageType.form,
        navName = "Form",
        link = "/form/:slug",
        params = arrayListOf(
            NavParam(key = "slug", required = true)
        )
    ),
   
    CART_DELIVERY(
        pageType = PageType.cartDelivery,
        navName = "Cart Delivery",
        link = "/cart/delivery"
    ),
   
    CART_PAYMENT(
        pageType = PageType.cartPayment,
        navName = "Cart Payment Information",
        link = "/cart/payment-info"
    ),
   
    CART_REVIEW(
        pageType = PageType.cartReview,
        navName = "Cart Order Review",
        link = "/cart/order-review"
    ),
   
    LOGIN(
        pageType = PageType.login,
        navName = "Login",
        link = "/auth/login"
    ),
   
    REGISTER(
        pageType = PageType.register,
        navName = "Register",
        link = "/auth/register"
    ),
   
    SHIPPING_POLICY(
        pageType = PageType.shippingPolicy,
        navName = "Shipping policy",
        link = "/shipping-policy"
    ),
   
    RETURN_POLICY(
        pageType = PageType.returnPolicy,
        navName = "Return policy",
        link = "/return-policy"
    )
   
}