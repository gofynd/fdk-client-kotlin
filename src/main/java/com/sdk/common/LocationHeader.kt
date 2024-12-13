package com.sdk.common

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.annotations.Expose
import kotlinx.parcelize.RawValue
import com.google.gson.annotations.SerializedName


@Parcelize
data class LocationHeader(

        @SerializedName("country_iso_code")
        val countryIsoCode: String? = null,

        @SerializedName("state")
        val state: String? = null,

        @SerializedName("city")
        val city: String? = null,

        @SerializedName("sector")
        val sector: String? = null,

        @SerializedName("pincode")
        val pincode: String? = null,

) : Parcelable