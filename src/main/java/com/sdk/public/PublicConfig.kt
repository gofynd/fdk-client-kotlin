package com.sdk.public
import java.net.CookieStore


class PublicConfig(
    var domain : String = "https://api.fynd.com",
    var userAgent: String ?= null,
    var language: String ?= "en-IN",
    var currency: String ?= "INR",
    var persistentCookieStore: CookieStore?=null,
    var applicationToken: String?,
    var debuggable: Boolean = false
)
