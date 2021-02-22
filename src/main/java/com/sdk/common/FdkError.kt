package com.sdk.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


@Parcelize
data class FdkError(

    @SerializedName("message")
    var message: String? = null,

    @SerializedName("status")
    var status: Int? = null,

    @SerializedName("code")
    var code: String? = null,

    @SerializedName("exception")
    var exception: String? = null,

    @SerializedName("info")
    var info: String? = null,

    @SerializedName("request_id")
    var requestId: String? = null,

    @SerializedName("stack_trace")
    var stackTrace: String? = null,

    @SerializedName("meta")
    var meta: @RawValue HashMap<String, Any>? = null

) : Parcelable
