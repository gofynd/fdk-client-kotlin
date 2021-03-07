package com.sdk.platform

class PlatformConfig(
    val companyId: String,
    var domain: String = "https://api.fynd.com",
    var userAgent: String?=null
) {

    init {
        if (this.companyId.isNullOrEmpty()) {
            throw IllegalArgumentException("Invalid Company Id")
        }
    }

}