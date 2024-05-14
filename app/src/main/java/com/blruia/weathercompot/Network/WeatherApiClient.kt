package com.blruia.weathercompot.Network

import com.blruia.yourweather.data.model.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "407a33859ea44e60ad993818240403"
private const val FORECAST_DAYS_COUNT = 3

interface WeatherApiClient {

    @GET("forecast.json")
    fun getCurrentWeather(
        @Query("q") city: String,
        @Query("lang") lang: String,
        @Query("key") key: String = API_KEY,
        @Query("days") days: Int = FORECAST_DAYS_COUNT,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no"
    ): Single<WeatherResponse>
}