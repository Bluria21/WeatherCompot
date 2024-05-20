package com.blruia.weathercompot.model


import com.blruia.yourweather.data.model.CurrentDataDto
import com.blruia.yourweather.data.model.ForecastDto
import com.blruia.yourweather.data.model.LocationDto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("location")
    @Expose
    val location: LocationDto,
    @SerializedName("current")
    @Expose
    val current: CurrentDataDto,
    @SerializedName("forecast")
    @Expose
    val forecast: ForecastDto
)