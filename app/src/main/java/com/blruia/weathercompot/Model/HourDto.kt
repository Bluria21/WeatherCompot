package com.blruia.yourweather.data.model


import Model.ConditionDto
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class HourDto(
    @SerializedName("time_epoch")
    @Expose
    val timeEpoch: Int, // 1695510000
    @SerializedName("time")
    @Expose
    val time: String, // 2023-09-24 00:00
    @SerializedName("temp_c")
    @Expose
    val tempC: Double, // 13.9
    @SerializedName("temp_f")
    @Expose
    val tempF: Double, // 57.0
    @SerializedName("is_day")
    @Expose
    val isDay: Int, // 0
    @SerializedName("condition")
    @Expose
    val condition: ConditionDto,
    @SerializedName("wind_mph")
    @Expose
    val windMph: Double, // 8.9
    @SerializedName("wind_kph")
    @Expose
    val windKph: Double, // 14.4
    @SerializedName("wind_degree")
    @Expose
    val windDegree: Int, // 188
    @SerializedName("wind_dir")
    @Expose
    val windDir: String, // S
    @SerializedName("pressure_mb")
    @Expose
    val pressureMb: Double, // 1019.0
    @SerializedName("pressure_in")
    @Expose
    val pressureIn: Double, // 30.1
    @SerializedName("precip_mm")
    @Expose
    val precipMm: Double, // 0.0
    @SerializedName("precip_in")
    @Expose
    val precipIn: Double, // 0.0
    @SerializedName("humidity")
    @Expose
    val humidity: Int, // 64
    @SerializedName("cloud")
    @Expose
    val cloud: Int, // 22
    @SerializedName("feelslike_c")
    @Expose
    val feelslikeC: Double, // 12.8
    @SerializedName("feelslike_f")
    @Expose
    val feelslikeF: Double, // 55.0
    @SerializedName("windchill_c")
    @Expose
    val windchillC: Double, // 12.8
    @SerializedName("windchill_f")
    @Expose
    val windchillF: Double, // 55.0
    @SerializedName("heatindex_c")
    @Expose
    val heatindexC: Double, // 13.9
    @SerializedName("heatindex_f")
    @Expose
    val heatindexF: Double, // 57.0
    @SerializedName("dewpoint_c")
    @Expose
    val dewpointC: Double, // 7.2
    @SerializedName("dewpoint_f")
    @Expose
    val dewpointF: Double, // 44.9
    @SerializedName("will_it_rain")
    @Expose
    val willItRain: Int, // 0
    @SerializedName("chance_of_rain")
    @Expose
    val chanceOfRain: Int, // 0
    @SerializedName("will_it_snow")
    @Expose
    val willItSnow: Int, // 0
    @SerializedName("chance_of_snow")
    @Expose
    val chanceOfSnow: Int, // 0
    @SerializedName("vis_km")
    @Expose
    val visKm: Double, // 10.0
    @SerializedName("vis_miles")
    @Expose
    val visMiles: Double, // 6.0
    @SerializedName("gust_mph")
    @Expose
    val gustMph: Double, // 14.2
    @SerializedName("gust_kph")
    @Expose
    val gustKph: Double, // 22.9
    @SerializedName("uv")
    @Expose
    val uv: Double // 1.0
)