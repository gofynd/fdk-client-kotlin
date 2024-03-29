package com.sdk.universal
import java.net.CookieStore
import okhttp3.Interceptor


class PublicConfig(
    var domain : String = "https://api.fynd.com",
    var userAgent: String ?= null,
    var language: String ?= "en-IN",
    var currency: String ?= "INR",
    var persistentCookieStore: CookieStore?=null,
    var applicationToken: String?,
    var debuggable: Boolean = false,
    var extraHeaders: HashMap<String,String>,
    var interceptors: List<Interceptor>? = null
)
