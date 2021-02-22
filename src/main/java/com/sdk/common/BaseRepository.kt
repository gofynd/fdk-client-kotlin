package com.sdk.common

import com.google.gson.Gson
import kotlinx.coroutines.Deferred
import org.json.JSONObject
import retrofit2.Response

abstract class BaseRepository {

    suspend fun <T : Any> Deferred<Response<T>>.safeAwait(retrofitResponseCallBack: ResponseCallBack<Event<T>>) {

        return try {
            val call = this.await()
            if ((call.code() == 200 || call.code() == 201) &&
                (call.body() != null || call.raw().request().method() == "HEAD")
            ) {
                retrofitResponseCallBack.onSuccess(response = Event(call.body(), call.headers()));
            } else {
                val response = JSONObject(call.errorBody()?.toString() ?: "")
                val error = Gson().fromJson(response.toString(), FdkError::class.java)
                error.status=call.code()
                retrofitResponseCallBack.onFailure(error)
            }
        } catch (e: Exception) {
            val message = e.message
            val error = FdkError(message = message)
            retrofitResponseCallBack.onFailure(error = error)
        }
    }

}