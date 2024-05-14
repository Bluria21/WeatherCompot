package com.blruia.yourweather.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class AstroDto(
    @SerializedName("sunrise")
    @Expose
    val sunrise: String, // 06:49 AM
    @SerializedName("sunset")
    @Expose
    val sunset: String, // 06:55 PM
    @SerializedName("moonrise")
    @Expose
    val moonrise: String, // 05:16 PM
    @SerializedName("moonset")
    @Expose
    val moonset: String, // No moonset
    @SerializedName("moon_phase")
    @Expose
    val moonPhase: String, // Waxing Gibbous
    @SerializedName("moon_illumination")
    @Expose
    val moonIllumination: String, // 63
    @SerializedName("is_moon_up")
    @Expose
    val isMoonUp: Int, // 0
    @SerializedName("is_sun_up")
    @Expose
    val isSunUp: Int // 0
)