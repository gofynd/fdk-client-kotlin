package com.sdk.common

import com.google.gson.Gson
import kotlinx.coroutines.Deferred
import org.json.JSONObject
import retrofit2.Response

abstract class BaseRepository {

    suspend inline fun <T : Any> Deferred<Response<T>>.safeAwait(
        onSuccess: (Event<T>) -> Unit,
        onFailure: (FdkError) -> Unit
    ) {
        try {
            val call = this.await()
            if ((call.code() == 200 || call.code() == 201) &&
                (call.body() != null || call.raw().request().method() == "HEAD")
            ) {
                onSuccess.invoke(Event(call.body(), call.headers()))
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val error = Gson().fromJson(response.toString(), FdkError::class.java)
                error.status = call.code()
                onFailure.invoke(error)
            }
        } catch (e: Exception) {
            val message = e.message
            val error = FdkError(status = 500,message = message)
            onFailure.invoke(error)
        }
    }

    suspend inline fun <T : Any> Deferred<Response<T>>.safeAwait(
        onResponse: (Event<T>?, FdkError?) -> Unit = { response, error -> }
    ) {
        try {
            val call = this.await()
            if ((call.code() == 200 || call.code() == 201) &&
                (call.body() != null || call.raw().request().method() == "HEAD")
            ) {
                onResponse.invoke(Event(call.body(), call.headers()), null)
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val error = Gson().fromJson(response.toString(), FdkError::class.java)
                error.status = call.code()
                onResponse.invoke(null, error)
            }
        } catch (e: Exception) {
            val message = e.message
            val error = FdkError(status = 500,message = message)
            onResponse.invoke(null, error)
        }
    }

    suspend inline fun <T : Any> Deferred<Response<T>>.safeAwait(): Pair<Event<T>?, FdkError?> {

        try {
            val call = this.await()
            if ((call.code() == 200 || call.code() == 201) &&
                (call.body() != null || call.raw().request().method() == "HEAD")
            ) {
                return Pair(Event(call.body(), call.headers()), null)
            } else {
                val response = JSONObject(call.errorBody()?.string() ?: "")
                val error = Gson().fromJson(response.toString(), FdkError::class.java)
                error.status = call.code()
                return Pair(null, error)
            }
        } catch (e: Exception) {
            val message = e.message
            val error = FdkError(status = 500,message = message)
            return Pair(null, error)
        }
    }

}