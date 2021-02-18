package com.sdk.common

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.google.gson.Gson
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Response

abstract class BaseRepository {

    suspend fun <T : Any> Deferred<Response<T>>.safeAwait(): StateData<Event<T>> {
        val applicationContext = getApplicationContext()

        val stateData = StateData<Event<T>>()

        return if (Helper.isNetworkAvailable(applicationContext)) {
            //connected
            try {
                val call = this.await()
                if ((call.code() == 200 || call.code() == 201) && (call.body() != null || call.raw().request().method() == "HEAD")) {
                    stateData.success(Event(call.body(), call.headers()))
                    stateData
                } else {
                    if (call.code() == 401 /*|| call.code() == 403)*/) {
                       /* EventBus.getDefault()
                            .post(
                                ForcedLogOutEvent(
                                    call.raw().request().url().toString(),
                                    call.code()
                                )
                            )*/
                    } else if (call.body() != null) {
                        stateData.error(call.code(), Event(call.body()))
                    } else if (call.errorBody() != null && call.code() == 400) {
                        val message = getErrorBody(call.errorBody())
                        if (message != null) {
                            stateData.error(call.code(), null, message)
                        }
                    } else {
                        val errorBody = getErrorBody(call.errorBody())
                        if (call.errorBody() != null && errorBody != null) {
                            stateData.error(call.code(), null, errorBody)
                        } else {
                            stateData.error(call.code())
                        }
                    }
                    stateData
                }
            } catch (e: Exception) {
                stateData.error(HttpResCodes.STATUS_INTERNAL_ERROR)
                stateData
            }
        } else {
            stateData.error(HttpResCodes.STATUS_NO_INTERNET)
            stateData
        }
    }

    private fun getErrorBody(errorBody: ResponseBody?): String? {
        if (errorBody == null) return null
        val response = JSONObject(errorBody.string())
        return errorBody.toString()//Gson().fromJson(response.toString(), FDKError::class.java)?.message
    }

    abstract fun getApplicationContext(): Application

}