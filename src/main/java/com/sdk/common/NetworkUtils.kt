package com.sdk.common

import android.app.Application
import android.content.pm.PackageManager
import android.content.res.Resources
import android.os.Build
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
            //val sharedPrefs = app.getSharedPreferences(AppConstants.UNIKET_SHARED_PREFS, Context.MODE_PRIVATE)
            //val globalSharedPrefs = app.getSharedPreferences(AppConstants.GLOBAL_SHARED_PREFS, Context.MODE_PRIVATE)
            //val prefsHelperClass = PrefsHelperClass(app, sharedPrefs,globalSharedPrefs)
            val token = ""
            val affiliateID = ""
            headerList["x-application-token"] = token
            headerList["x-application-id"] = affiliateID
            val currencyCode: String
            /*val selectedCurrency = prefsHelperClass.getSelectedCurrency()
            if (!selectedCurrency?.code.isNullOrEmpty()) {
                currencyCode = selectedCurrency?.code!!
                headerList["x-currency-code"] = currencyCode
            }*/

            //val selectedLanguage = prefsHelperClass.getSelectedLanguage()
            //headerList["Accept-Language"] = selectedLanguage?.code ?: "en-IN"

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
                    "app.getString(R.string.app_name_header)" + " App-Version/" +
                    verName.replace("Pre|D|snapshot".toRegex(), "") +
                    " Identifier/" + app.packageName

        }
    
}
