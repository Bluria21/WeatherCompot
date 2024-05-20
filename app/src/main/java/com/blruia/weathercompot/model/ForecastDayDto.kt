package com.blruia.yourweather.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ForecastDayDto(
    @SerializedName("date")
    @Expose
    val date: String, // 2023-09-24
    @SerializedName("date_epoch")
    @Expose
    val dateEpoch: Int, // 1695513600
    @SerializedName("day")
    @Expose
    val day: DayDto,
    @SerializedName("astro")
    @Expose
    val astro: AstroDto,
    @SerializedName("hour")
    @Expose
    val hour: List<HourDto>
)