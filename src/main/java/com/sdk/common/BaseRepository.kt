package com.sdk.common

import kotlinx.coroutines.Deferred
import org.json.JSONObject
import retrofit2.Response

abstract class BaseRepository {

    suspend inline fun <T : Any> Response<T>.safeAwait(
        onSuccess: (Event<T>) -> Unit, onFailure: (FdkError) -> Unit
    ) {
        try {
            val call = this
            if ((call.code() == 200 || call.code() == 201) && (call.body() != null || call.raw().request.method == "HEAD")) {
                onSuccess.invoke(Event(call.body(), call.headers()))
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val errorResponseString = response.toString()
                val error = HttpClient.gson.fromJson(errorResponseString, FdkError::class.java)
                error.status = call.code()
                error.rawErrorString = errorResponseString
                onFailure.invoke(error)
            }
        } catch (jex: org.json.JSONException) {
            jex.printStackTrace()
            val message = "Something went wrong"
            val error = FdkError(status = 500, message = message, exception = jex::class.java.canonicalName)
            onFailure.invoke(error)
        } catch (e: Exception) {
            e.printStackTrace()
            val message = e.message
            val error = FdkError(status = 500, message = message)
            onFailure.invoke(error)
        }
    }

    suspend inline fun <T : Any> Response<T>.safeAwait(
        onResponse: (Event<T>?, FdkError?) -> Unit = { _, _ -> }
    ) {
        try {
            val call = this
            if ((call.code() == 200 || call.code() == 201) && (call.body() != null || call.raw().request.method == "HEAD")) {
                onResponse.invoke(Event(call.body(), call.headers()), null)
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val errorResponseString = response.toString()
                val error = HttpClient.gson.fromJson(errorResponseString, FdkError::class.java)
                error.status = call.code()
                error.rawErrorString = errorResponseString
                onResponse.invoke(null, error)
            }
        } catch (jex: org.json.JSONException) {
            jex.printStackTrace()
            val message = "Something went wrong"
            val error = FdkError(status = 500, message = message, exception = jex::class.java.canonicalName)
            onResponse.invoke(null, error)
        } catch (e: Exception) {
            e.printStackTrace()
            val message = e.message
            val error = FdkError(status = 500, message = message)
            onResponse.invoke(null, error)
        }
    }

    suspend inline fun <T : Any> Response<T>.safeAwait(): Pair<Event<T>?, FdkError?> {

        try {
            val call = this
            return if ((call.code() == 200 || call.code() == 201) && (call.body() != null || call.raw().request.method == "HEAD")) {
                Pair(Event(call.body(), call.headers()), null)
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val errorResponseString = response.toString()
                val error = HttpClient.gson.fromJson(errorResponseString, FdkError::class.java)
                error.status = call.code()
                error.rawErrorString = errorResponseString
                Pair(null, error)
            }
        } catch (jex: org.json.JSONException) {
            jex.printStackTrace()
            val message = "Something went wrong"
            val error = FdkError(status = 500, message = message, exception = jex::class.java.canonicalName)
            return Pair(null, error)
        } catch (e: Exception) {
            e.printStackTrace()
            val message = e.message
            val error = FdkError(status = 500, message = message)
            return Pair(null, error)
        }
    }
}