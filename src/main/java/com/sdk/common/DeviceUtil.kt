package com.sdk.common

import android.content.Context
import android.content.Context.WIFI_SERVICE
import android.content.pm.PackageManager
import android.content.res.Resources
import android.graphics.Point
import android.location.Geocoder
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.os.Build
import android.provider.Settings
import android.text.TextUtils
import android.text.format.Formatter
import android.util.DisplayMetrics
import android.util.Log
import android.util.TypedValue
import android.view.KeyCharacterMap
import android.view.KeyEvent
import android.view.ViewConfiguration
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import java.net.NetworkInterface
import java.util.*
import java.util.regex.Pattern

class DeviceUtil {
    companion object {

        var DIME_TYPE_WIDTH = 1
        var DIME_TYPE_HEIGHT = 2
        var deviceWidth = 0
        var deviceHeight = 0

        fun getPlatformVer(): String {
            return Build.VERSION.RELEASE
        }

        fun getAppVer(mContext: Context): String {
            var verName = ""
            try {
                verName = mContext.packageManager.getPackageInfo(mContext.packageName, 0).versionName
            } catch (e: PackageManager.NameNotFoundException) {

            }
            return verName
        }

        fun getDeviceSize(type: Int, context: Context): Int {
            val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val display = wm.defaultDisplay
            val size = Point()
            display.getSize(size)
            var deviceWidth = size.x
            var deviceHeight = size.y
            return if (type == DIME_TYPE_WIDTH) {
                deviceWidth
            } else {
                deviceHeight
            }
        }

        fun getDeviceWidth(context: Context): Int {
            return if (deviceWidth > 0) deviceWidth else getDeviceSize(
                DIME_TYPE_WIDTH,
                context
            )
        }

        fun getDeviceHeight(context: Context): Int {
            return if (deviceHeight > 0) deviceHeight else getDeviceSize(
                DIME_TYPE_HEIGHT,
                context
            )
        }

        fun getStatusBarHeight(context: Context): Int {
            var result = 0
            val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = context.resources.getDimensionPixelSize(resourceId)
            } else {
                return Math.ceil(((if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) 24 else 25) * context.resources.displayMetrics.density).toDouble())
                    .toInt()
            }
            return result
        }

        fun pxToDp(context: Context, px: Int): Int {
            val displayMetrics = context.resources.displayMetrics
            return Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
        }

        fun dpToPx(context: Context?, dp: Int): Int {
            if (context == null)
                return 0
            val displayMetrics = context.resources.displayMetrics
            return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
        }

        fun isLocationEnabled(mContext: Context): Boolean {
            var locationMode = 0
            val locationProviders: String
            val networkLocationEnabled: Boolean

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                try {
                    locationMode = Settings.Secure.getInt(mContext.contentResolver, Settings.Secure.LOCATION_MODE)
                } catch (e: Settings.SettingNotFoundException) {

                }
                networkLocationEnabled =
                    locationMode != Settings.Secure.LOCATION_MODE_OFF && locationMode != Settings.Secure.LOCATION_MODE_SENSORS_ONLY

            } else {
                locationProviders =
                    Settings.Secure.getString(mContext.contentResolver, Settings.Secure.LOCATION_PROVIDERS_ALLOWED)
                networkLocationEnabled = !TextUtils.isEmpty(locationProviders) && locationProviders.contains("network")
            }
            return networkLocationEnabled
        }

        fun getNavBarHeight(context: AppCompatActivity): Int {
            val resources = context.resources
            val resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android")
            return if (resourceId > 0) {
                resources.getDimensionPixelSize(resourceId)
            } else 0
        }

        fun hasNavBar(c: AppCompatActivity): Boolean {
            val hasSoftwareKeys: Boolean

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                val d = c.windowManager.defaultDisplay

                val realDisplayMetrics = DisplayMetrics()
                d.getRealMetrics(realDisplayMetrics)

                val realHeight = realDisplayMetrics.heightPixels
                val realWidth = realDisplayMetrics.widthPixels

                val displayMetrics = DisplayMetrics()
                d.getMetrics(displayMetrics)

                val displayHeight = displayMetrics.heightPixels
                val displayWidth = displayMetrics.widthPixels

                hasSoftwareKeys = realWidth - displayWidth > 0 || realHeight - displayHeight > 0
            } else {
                val hasMenuKey = ViewConfiguration.get(c).hasPermanentMenuKey()
                val hasBackKey = KeyCharacterMap.deviceHasKey(KeyEvent.KEYCODE_BACK)
                hasSoftwareKeys = !hasMenuKey && !hasBackKey
            }
            return hasSoftwareKeys
        }

        fun isNetworkAvailable(context: Context): Boolean {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE)
            return if (connectivityManager is ConnectivityManager) {
                val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
                networkInfo?.isConnected ?: false
            } else false
        }

        fun getDeviceId(mContext: Context): String {
            return Settings.Secure.getString(mContext.contentResolver, Settings.Secure.ANDROID_ID)
        }

        fun getCacheDirectory(mContext: Context): String {
            return mContext.cacheDir.toString()
        }

        fun getLocalDirectory(mContext: Context): String {
            return mContext.filesDir.toString()
        }

        fun getDatabaseDirectory(mContext: Context): String {
            return mContext.getDatabasePath("test").toString()
        }

        fun getIPAddress(mContext: Context): String? {
            var IPaddress: String? = ""
            try {
                var WIFI = false
                var MOBILE = false
                val CM = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                val networkInfo = CM.allNetworkInfo

                for (netInfo in networkInfo) {
                    if (netInfo.typeName.equals("WIFI", ignoreCase = true))
                        if (netInfo.isConnected)
                            WIFI = true
                    if (netInfo.typeName.equals("MOBILE", ignoreCase = true))
                        if (netInfo.isConnected)
                            MOBILE = true
                }

                if (WIFI) {
                    IPaddress = GetDeviceIpWiFiData(mContext)
                }

                if (MOBILE) {
                    IPaddress = GetDeviceipMobileData(mContext)
                }
            } catch (ex: Exception) {

            }
            return IPaddress
        }


        fun GetDeviceipMobileData(mContext: Context): String? {
            try {
                val en = NetworkInterface.getNetworkInterfaces()
                while (en.hasMoreElements()) {
                    val networkinterface = en.nextElement()
                    val enumIpAddr = networkinterface.inetAddresses
                    while (enumIpAddr.hasMoreElements()) {
                        val inetAddress = enumIpAddr.nextElement()
                        if (!inetAddress.isLoopbackAddress) {
                            return inetAddress.hostAddress
                        }
                    }
                }
            } catch (ex: Exception) {
                Log.e("Current IP", ex.toString())
            }

            return null
        }

        fun GetDeviceIpWiFiData(mContext: Context): String {
            val wm = mContext.applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
            return Formatter.formatIpAddress(wm.connectionInfo.ipAddress)
        }

        interface Listener<T> {
            fun on(arg: T)
        }

        fun getPackageName(mContext: Context): String {
            return mContext.packageName
        }

        fun getPinCodeFromLatLon(context: Context, latitude: Double, longitude: Double): String? {
            val geoCoder = Geocoder(context, Locale.getDefault())
            val addresses = geoCoder.getFromLocation(latitude, longitude, 1)
            return addresses[0].postalCode
        }

        fun getPxFromDp(resources: Resources, dpValue: Float): Int {
            return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dpValue,
                resources.displayMetrics
            ).toInt()
        }

        fun getAspectRatio(ratioText: String): Float {
            if (ratioText.matches(regex = "\\d+:\\d+".toRegex())) {
                val aspects = ratioText.split(":")
                return (aspects[0].toFloat() / aspects[1].toFloat())
            }
            throw IllegalArgumentException("Aspect ratio is invalid")
        }


        fun isEmailValid(emailStr: String): Boolean {
            val VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile(
                    "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                    Pattern.CASE_INSENSITIVE
                )
            val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr)
            return matcher.find()
        }

        fun getDeviceDimension(context: FragmentActivity?): Pair<Int, Int> {
            val displayMetrics = DisplayMetrics()
            context?.windowManager?.defaultDisplay?.getMetrics(displayMetrics)
            return Pair(displayMetrics.widthPixels, displayMetrics.heightPixels)
        }

    }
}