package Model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ConditionDto(
    @SerializedName("text")
    @Expose
    val text: String, // Partly cloudy
    @SerializedName("icon")
    @Expose
    val icon: String, // //cdn.weatherapi.com/weather/64x64/day/116.png
    @SerializedName("code")
    @Expose
    val code: Int // 1003
)