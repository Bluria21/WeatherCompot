package com.blruia.yourweather.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ForecastDto(
    @SerializedName("forecastday")
    @Expose
    val forecastday: List<ForecastDayDto>
)