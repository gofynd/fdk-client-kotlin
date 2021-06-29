package com.sdk.application

import java.net.CookieStore

class ApplicationConfig(
    var applicationId: String?,
    var applicationToken: String?,
    var domain: String = "https://api.fynd.com",
    var userAgent: String,
    val persistentCookieStore: CookieStore?=null
) {
    init {
        val regex = "^[0-9a-fA-F]{24}$"
        if (this.applicationId?.matches(regex.toRegex()) == false) {
            throw IllegalArgumentException("Invalid Application Id")
        }
    }
}