package com.sdk.platform

import android.util.Base64.NO_WRAP
import android.util.Base64.encodeToString
import com.sdk.common.BaseRepository
import com.sdk.common.HttpClient
import com.sdk.common.RequestSignerInterceptor
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Url
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.HashMap


class AccessToken {
    var token: String? = null
    var expiry: Long? = null
    val isExpired: Boolean
        get() {
            return (System.currentTimeMillis() < (expiry ?: 0)).not()
        }
}

typealias RefreshToken = String

class PlatformOAuthClient(val config: PlatformConfig) : BaseRepository() {

    private var callback: (() -> AccessToken)? = null
    private var customToken: (suspend () -> AccessToken)? = null
    var token: AccessToken? = null
    var refreshToken: RefreshToken? = null

    fun set(token: AccessToken) {
        this.token = token
    }

    enum class GrantType {
        authorization_code,
        refresh_token
    }

    private fun getRandomState(): String {
        val b = ByteArray(15)
        Random().nextBytes(b)
        val accessMode = Base64.getUrlEncoder().encodeToString(b);
        return accessMode
    }


    fun getAuthorizationURL(
        scope: Array<String>,
        redirectUri: String,
        isOnline: Boolean = true
    ): String {

        val apiKey = config.apiKey
        if (apiKey.isNullOrEmpty()) {
            throw Exception("API Key missing in config")
        }
        val accessMode = if (isOnline) "online" else "offline"
        val query =
            "client_id=$apiKey&scope=${scope.joinToString(",")}&redirect_uri=$redirectUri&state=${getRandomState()}&access_mode=$accessMode"

        return "https://${config.domain}/v1.0/company/${config.companyId}/oauth/authorize?$query"
    }

    fun getCustomToken(customToken: (suspend () -> AccessToken)?) {
        this.customToken = customToken
    }

    suspend fun isAccessTokenValid(): Boolean {

        if (token?.token != null && token?.isExpired == false) {
            return true
        }

        customToken?.let {
            token = it()
            return !token?.token.isNullOrEmpty() && token?.isExpired == false
        }

        if (!refreshToken.isNullOrEmpty()) {
            val encodedToken =
                encodeToString("${config.apiKey}:${config.apiSecret}".toByteArray(), NO_WRAP)
            val body = HashMap<String, String>()
            body["grant_type"] = GrantType.authorization_code.toString()
            body["refresh_token"] = refreshToken ?: ""
            val url =
                "${config.domain}/service/panel/authentication/v1.0/company/${config.companyId}/oauth/token"
            val newToken = getToken(body, url, encodedToken)
            return if (newToken != null) {
                token = newToken
                !token?.token.isNullOrEmpty() && token?.isExpired == false
            } else {
                false
            }

        } else {
            return false

        }
    }

    private suspend fun getToken(
        body: HashMap<String, String>,
        url: String,
        encodedToken: String
    ): AccessToken? {

        val tokenApiList by lazy {
            val interceptorMap = HashMap<String, List<Interceptor>>()
            val headersMap = HashMap<String, String>()
            headersMap["Authorization"] = "Basic $encodedToken"
            val requestSignerInterceptor = RequestSignerInterceptor()
            val interceptorList = ArrayList<Interceptor>()
            interceptorList.add(requestSignerInterceptor)
            interceptorMap["interceptor"] = interceptorList
            HttpClient.setDebuggable(config.debuggable)
            val retrofitHttpClient = HttpClient.initialize(
                baseUrl = config.domain,
                headers = headersMap,
                interceptorList = interceptorMap,
                namespace = "ExtensionOauthToken",
                certPublicKey = config.certPublicKey,
            )
            retrofitHttpClient?.initializeRestClient(TokenApiList::class.java) as? TokenApiList
        }

        val response = tokenApiList?.getAccessToken(url, body)?.await()
        return if (response?.isSuccessful == true && response.body() != null) {
            AccessToken().apply {
                token = response.body()?.access_token
                refreshToken = response.body()?.refresh_token
                expiry = TimeUnit.SECONDS.toMillis(
                    response.body()?.expires_in ?: 0
                ) + System.currentTimeMillis()
            }
        } else {
            null
        }

    }


    private interface TokenApiList {
        @FormUrlEncoded
        @POST
        fun getAccessToken(
            @Url url: String,
            @FieldMap map: HashMap<String, String>
        ): Deferred<Response<AccessResponse>>
    }

    data class AccessResponse(
        val access_token: String? = null,
        val refresh_token: String? = null,
        val expires_in: Long? = null
    )

}