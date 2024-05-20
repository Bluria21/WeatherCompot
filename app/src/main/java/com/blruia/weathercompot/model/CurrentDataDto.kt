package com.blruia.yourweather.data.model


import Model.ConditionDto
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CurrentDataDto(
    @SerializedName("last_updated_epoch")
    @Expose
    val lastUpdatedEpoch: Int, // 1695573900
    @SerializedName("last_updated")
    @Expose
    val lastUpdated: String, // 2023-09-24 17:45
    @SerializedName("temp_c")
    @Expose
    val tempC: Double, // 18.0
    @SerializedName("temp_f")
    @Expose
    val tempF: Double, // 64.4
    @SerializedName("is_day")
    @Expose
    val isDay: Int, // 1
    @SerializedName("condition")
    @Expose
    val condition: ConditionDto,
    @SerializedName("wind_mph")
    @Expose
    val windMph: Double, // 13.6
    @SerializedName("wind_kph")
    @Expose
    val windKph: Double, // 22.0
    @SerializedName("wind_degree")
    @Expose
    val windDegree: Int, // 200
    @SerializedName("wind_dir")
    @Expose
    val windDir: String, // SSW
    @SerializedName("pressure_mb")
    @Expose
    val pressureMb: Double, // 1016.0
    @SerializedName("pressure_in")
    @Expose
    val pressureIn: Double, // 30.0
    @SerializedName("precip_mm")
    @Expose
    val precipMm: Double, // 0.0
    @SerializedName("precip_in")
    @Expose
    val precipIn: Double, // 0.0
    @SerializedName("humidity")
    @Expose
    val humidity: Int, // 77
    @SerializedName("cloud")
    @Expose
    val cloud: Int, // 75
    @SerializedName("feelslike_c")
    @Expose
    val feelslikeC: Double, // 18.0
    @SerializedName("feelslike_f")
    @Expose
    val feelslikeF: Double, // 64.4
    @SerializedName("vis_km")
    @Expose
    val visKm: Double, // 10.0
    @SerializedName("vis_miles")
    @Expose
    val visMiles: Double, // 6.0
    @SerializedName("uv")
    @Expose
    val uv: Double, // 5.0
    @SerializedName("gust_mph")
    @Expose
    val gustMph: Double, // 18.3
    @SerializedName("gust_kph")
    @Expose
    val gustKph: Double // 29.5
)