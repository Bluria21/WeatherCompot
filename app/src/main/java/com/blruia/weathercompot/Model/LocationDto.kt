package com.blruia.yourweather.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class LocationDto(
    @SerializedName("name")
    @Expose
    val name: String, // London
    @SerializedName("region")
    @Expose
    val region: String, // City of London, Greater London
    @SerializedName("country")
    @Expose
    val country: String, // United Kingdom
    @SerializedName("lat")
    @Expose
    val lat: Double, // 51.52
    @SerializedName("lon")
    @Expose
    val lon: Double, // -0.11
    @SerializedName("tz_id")
    @Expose
    val tzId: String, // Europe/London
    @SerializedName("localtime_epoch")
    @Expose
    val localtimeEpoch: Int, // 1695574503
    @SerializedName("localtime")
    @Expose
    val localtime: String // 2023-09-24 17:55
)