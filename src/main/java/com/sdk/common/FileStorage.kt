package com.sdk.common

import com.sdk.application.filestorage.FileUploadComplete
import com.sdk.application.filestorage.FileStorageDataManagerClass
import com.sdk.application.filestorage.FileUploadStart
import com.sdk.application.filestorage.Params
import kotlinx.coroutines.Deferred
import kotlinx.parcelize.RawValue
import okhttp3.MediaType.Companion.toMediaType
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
    tags: ArrayList<String>?=null,
    params: Params?=null,
    onResponse: (Event<FileUploadComplete>?, FdkError?) -> Unit = { response, error -> }
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
        val startRequest = FileUploadStart(
            fileName = fileName,
            contentType = contentType,
            size = size,
            tags = tags,
            params = params
        )
        startUpload(namespace, startRequest)?.safeAwait { response, error ->
            response?.let {
                val startResponse = it.peekContent()
                val uploadUrl = startResponse?.upload?.url
                if (file != null && !uploadUrl.isNullOrEmpty()) {
                    val contentTypeFromResponse = startResponse.contentType ?: ""
                    apiList?.updateAWSMedia(
                        contentTypeFromResponse,
                        uploadUrl,
                        RequestBody.create(contentTypeFromResponse.toMediaType(), file)
                    )?.safeAwait { response, error ->
                        response?.let {
                            completeUpload(
                                namespace = namespace,
                                body = startResponse
                            )?.safeAwait { response, error ->
                                response?.let {
                                    onResponse.invoke(Event(it.peekContent()), null)
                                }
                                error?.let {
                                    onResponse.invoke(null, it)
                                }
                            }
                        }
                        error?.let {
                            onResponse.invoke(null, it)
                        }
                    }
                } else {
                    onResponse.invoke(null, FdkError(message = "Something went wrong"))
                }
            }
            error?.let {
                onResponse.invoke(null, it)
            }
        }
    }
}

interface AwsApiList {

    @PUT
    suspend fun updateAWSMedia(
        @Header("Content-Type") header: String,
        @Url url: String,
        @Body image: RequestBody
    ): Response<ResponseBody>

}
