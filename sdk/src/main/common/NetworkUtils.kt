package co.go.uniket.helpers

import android.app.Application
import android.content.Context
import android.content.res.Resources
import co.go.uniket.R
import co.go.uniket.data.sharedprefs.PrefsHelperClass
import com.client.DeviceUtil
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
            val sharedPrefs = app.getSharedPreferences(AppConstants.UNIKET_SHARED_PREFS, Context.MODE_PRIVATE)
            val globalSharedPrefs = app.getSharedPreferences(AppConstants.GLOBAL_SHARED_PREFS, Context.MODE_PRIVATE)
            val prefsHelperClass = PrefsHelperClass(app, sharedPrefs,globalSharedPrefs)
            val token = prefsHelperClass.getAccessToken()
            val affiliateID = prefsHelperClass.getAffiliateId()
            headerList["x-application-token"] = token
            headerList["x-application-id"] = affiliateID
            val currencyCode: String
            val selectedCurrency = prefsHelperClass.getSelectedCurrency()
            if (!selectedCurrency?.code.isNullOrEmpty()) {
                currencyCode = selectedCurrency?.code!!
                headerList["x-currency-code"] = currencyCode
            }

            val selectedLanguage = prefsHelperClass.getSelectedLanguage()
            headerList["Accept-Language"] = selectedLanguage?.code ?: "en-IN"

            return headerList
        }

        fun provideUserAgent(app: Application): String {
            return "Platform/Android Platform-Version/" + DeviceUtil.getPlatformVer() + " App-Name/" +
                    app.getString(R.string.app_name_header) + " App-Version/" +
                    DeviceUtil.getAppVer(app).replace("Pre|D|snapshot".toRegex(), "") +
                    " Identifier/" + app.packageName

        }
    
}
