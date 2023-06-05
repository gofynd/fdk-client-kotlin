package com.sdk.common

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.annotations.Expose
import kotlinx.parcelize.RawValue
import com.google.gson.annotations.SerializedName


@Parcelize
data class FdkError(

    var authenticated:Boolean?=null,

    @Expose
    @SerializedName("message")
    var message: String? = null,

    @Expose
    @SerializedName("status")
    var status: Int? = null,

    @Expose
    @SerializedName("code")
    var code: String? = null,

    @Expose
    @SerializedName("exception")
    var exception: String? = null,

    @Expose
    @SerializedName("info")
    var info: String? = null,

    @Expose
    @SerializedName("request_id")
    var requestId: String? = null,

    @Expose
    @SerializedName("stack_trace")
    var stackTrace: String? = null,

    @Expose
    @SerializedName("meta")
    var meta: @RawValue HashMap<String, Any>? = null,

    var rawErrorString: String? = null

) : Parcelable
