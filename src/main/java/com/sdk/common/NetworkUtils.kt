package com.sdk.common
import android.app.Application
import android.content.pm.PackageManager
import android.content.res.Resources
import android.os.Build
import android.util.Base64.NO_WRAP
import android.util.Base64.encodeToString
import com.fynd.sdk.R
import com.sdk.application.SDK
import java.util.*

object NetworkUtils {
    fun getCommonRestHeaders(app: Application): Map<String, String> {
        val headerList = HashMap<String, String>()
        headerList["display-width"] = Resources.getSystem().displayMetrics.widthPixels.toString()
        headerList["User-Agent"] = provideUserAgent(app)
        return headerList
    }
    fun interceptHeaders(app: Application): Map<String, String> {
        val headerList = HashMap<String, String>()
        val token = SDK.applicationToken ?: ""
        val affiliateId = SDK.applicationId ?: ""
        headerList["x-application-token"] = token
        headerList["x-application-id"] = affiliateId
        headerList["Accept-Language"] = "en-IN"
        val bearerToken =
            encodeToString("$affiliateId:$token".toByteArray(), NO_WRAP)
        headerList["Authorization"] = "Bearer $bearerToken"
        return headerList
    }
    fun provideUserAgent(app: Application): String {
        var verName = ""
        try {
            verName =
                app.packageManager.getPackageInfo(app.packageName, 0).versionName
        } catch (e: PackageManager.NameNotFoundException) {
        }
        return "Platform/Android Platform-Version/" + Build.VERSION.RELEASE + " App-Name/" +
                app.getString(R.string.app_name_header) + " App-Version/" +
                verName.replace("Pre|D|snapshot".toRegex(), "") +
                " Identifier/" + app.packageName
    }
}