package com.sdk.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


@Parcelize
data class FDKError(
    
    @SerializedName("message")
    val message: String?=null,
    
    @SerializedName("status")
    val status: Int?=null,

    @SerializedName("code")
    val code: String?=null,

    @SerializedName("exception")
    val exception: String?=null,

    @SerializedName("info")
    val info: String?=null,

    @SerializedName("request_id")
    val requestId: String?=null,

    @SerializedName("stack_trace")
    val stackTrace: String?=null,

    @SerializedName("meta")
    val meta:  @RawValue HashMap<String,Any>?=null
    
): Parcelable
