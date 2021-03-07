package com.sdk.application

class ApplicationConfig(
    val applicationId: String?,
    var applicationToken: String?,
    var domain: String = "https://api.fynd.com",
    var userAgent: String,
    var auth_user_name: String = "slingshotapptoken",
    var auth_user_password: String = "slingsh0t@ppt0ken#fynd"
) {
    init {
        val regex = "^[0-9a-fA-F]{24}$"
        if (this.applicationId?.matches(regex.toRegex()) == false) {
            throw IllegalArgumentException("Invalid Application Id")
        }
    }
}