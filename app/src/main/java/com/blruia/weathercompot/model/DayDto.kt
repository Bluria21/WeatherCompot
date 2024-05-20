package com.blruia.yourweather.data.model


import Model.ConditionDto
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class DayDto(
    @SerializedName("maxtemp_c")
    @Expose
    val maxtempC: Double, // 19.9
    @SerializedName("maxtemp_f")
    @Expose
    val maxtempF: Double, // 67.9
    @SerializedName("mintemp_c")
    @Expose
    val mintempC: Double, // 13.9
    @SerializedName("mintemp_f")
    @Expose
    val mintempF: Double, // 57.0
    @SerializedName("avgtemp_c")
    @Expose
    val avgtempC: Double, // 17.0
    @SerializedName("avgtemp_f")
    @Expose
    val avgtempF: Double, // 62.6
    @SerializedName("maxwind_mph")
    @Expose
    val maxwindMph: Double, // 15.0
    @SerializedName("maxwind_kph")
    @Expose
    val maxwindKph: Double, // 24.1
    @SerializedName("totalprecip_mm")
    @Expose
    val totalprecipMm: Double, // 0.01
    @SerializedName("totalprecip_in")
    @Expose
    val totalprecipIn: Double, // 0.0
    @SerializedName("totalsnow_cm")
    @Expose
    val totalsnowCm: Double, // 0.0
    @SerializedName("avgvis_km")
    @Expose
    val avgvisKm: Double, // 10.0
    @SerializedName("avgvis_miles")
    @Expose
    val avgvisMiles: Double, // 6.0
    @SerializedName("avghumidity")
    @Expose
    val avghumidity: Double, // 67.0
    @SerializedName("daily_will_it_rain")
    @Expose
    val dailyWillItRain: Int, // 0
    @SerializedName("daily_chance_of_rain")
    @Expose
    val dailyChanceOfRain: Int, // 0
    @SerializedName("daily_will_it_snow")
    @Expose
    val dailyWillItSnow: Int, // 0
    @SerializedName("daily_chance_of_snow")
    @Expose
    val dailyChanceOfSnow: Int, // 0
    @SerializedName("condition")
    @Expose
    val condition: ConditionDto,
    @SerializedName("uv")
    @Expose
    val uv: Double // 4.0
)