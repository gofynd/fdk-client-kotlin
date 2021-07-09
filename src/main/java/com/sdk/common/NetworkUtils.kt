package com.sdk.common

import android.util.Base64.NO_WRAP
import android.util.Base64.encodeToString
import com.sdk.application.ApplicationConfig
import com.sdk.platform.PlatformConfig
import java.util.*

object NetworkUtils {
    fun getCommonRestHeaders(applicationConfig: ApplicationConfig?): Map<String, String> {
        val headerList = HashMap<String, String>()
        headerList["User-Agent"] = applicationConfig?.userAgent ?: ""
        return headerList
    }

    fun interceptHeaders(applicationConfig: ApplicationConfig?): Map<String, String> {
        val headerList = HashMap<String, String>()
        val token = applicationConfig?.applicationToken ?: ""
        val affiliateId = applicationConfig?.applicationId ?: ""
        headerList["x-application-token"] = token
        headerList["x-application-id"] = affiliateId
        headerList["Accept-Language"] = applicationConfig?.languageCode ?: "en-IN"
        headerList["x-currency-code"] = applicationConfig?.currencyCode ?: "INR"
        val bearerToken =
            encodeToString("$affiliateId:$token".toByteArray(), NO_WRAP)
        headerList["Authorization"] = "Bearer $bearerToken"
        return headerList
    }

}