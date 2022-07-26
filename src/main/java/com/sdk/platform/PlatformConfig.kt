package com.sdk.platform

import com.sdk.common.BaseRepository
import java.net.CookieStore

class PlatformConfig(
    var companyId: String,
    var domain: String = "https://api.fynd.com",
    var userAgent: String? = null,
    var apiKey: String? = null,
    var apiSecret: String? = null,
    val persistentCookieStore: CookieStore?=null,
    var debuggable: Boolean = false,
    var extraHeaders: HashMap<String,String>
) : BaseRepository() {


    val oauthClient by lazy { PlatformOAuthClient(this) }

    init {
        if (this.companyId.isNullOrEmpty()) {
            throw IllegalArgumentException("Invalid Company Id")
        }
    }

}
