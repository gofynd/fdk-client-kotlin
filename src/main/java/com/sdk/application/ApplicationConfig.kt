package com.sdk.application

import java.net.CookieStore

class ApplicationConfig(
    var applicationId: String?,
    var applicationToken: String?,
    var domain: String = "https://api.fynd.com",
    var userAgent: String,
    val persistentCookieStore: CookieStore?=null,
    var languageCode: String = "en-IN",
    var currencyCode: String = "INR",
    var debuggable: Boolean = false,
    var extraHeaders: HashMap<String,String>? = null
) {
    init {
        val regex = "^[0-9a-fA-F]{24}$"
        if (this.applicationId?.matches(regex.toRegex()) == false) {
            throw IllegalArgumentException("Invalid Application Id")
        }
    }
}
