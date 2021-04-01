package com.sdk.common

import com.sdk.application.CompleteResponse
import com.sdk.application.FileStorageDataManagerClass
import com.sdk.application.StartRequest
import com.sdk.application.StartResponse
import kotlinx.coroutines.Deferred
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.PUT
import retrofit2.http.Url
import java.io.File

suspend fun FileStorageDataManagerClass.uploadMedia(
    fileName: String? = null,
    contentType: String? = null,
    size: Int? = null,
    namespace: String? = null,
    file: File? = null,
    onSuccess: (Event<CompleteResponse?>) -> Unit,
    onFailure: (FdkError) -> Unit
) {

    val apiList by lazy {
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            namespace = "AWSUpload"
        )
        retrofitHttpClient?.initializeRestClient(AwsApiList::class.java) as? AwsApiList
    }

    if (!fileName.isNullOrEmpty() && !contentType.isNullOrEmpty() && size != null && !namespace.isNullOrEmpty()) {
        val startRequest = StartRequest(
            fileName = fileName,
            contentType = contentType,
            size = size
        )
        startUpload(namespace, startRequest)?.safeAwait(
            onSuccess = {
                val response = it.peekContent()
                val cdnUrl = response?.cdn?.url
                if (!response?.cdn?.url.isNullOrEmpty() && file != null) {
                    apiList?.updateAWSMedia(
                        response?.contentType ?: "",
                        cdnUrl ?: "",
                        RequestBody.create(MediaType.parse(response?.contentType ?: ""), file)
                    )?.safeAwait(
                        onSuccess = {
                            completeUpload(
                                namespace = namespace,
                                body = response ?: StartResponse()
                            )?.safeAwait(onSuccess = {
                                onSuccess.invoke(Event(it.peekContent()))
                            }, onFailure = {
                                onFailure.invoke(it)
                            })
                        }, onFailure = {
                            onFailure.invoke(it)
                        })
                }
            }, onFailure = {
                onFailure.invoke(it)
            })
    }
}

interface AwsApiList {

    @PUT
    fun updateAWSMedia(
        @Header("Content-Type") header: String,
        @Url url: String,
        @Body image: RequestBody
    ): Deferred<Response<ResponseBody>>

}
