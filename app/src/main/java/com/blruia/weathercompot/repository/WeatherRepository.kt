package com.blruia.weathercompot.repository

import com.blruia.weathercompot.model.WeatherResponse
import com.blruia.weathercompot.network.WeatherApiClient
import javax.inject.Inject

class WeatherRepository
@Inject constructor(
    private val apiClient: WeatherApiClient,
    private val systemDataRepository: SystemDataRepository,
) {

    fun getCurrentWeather(city: String): WeatherResponse {
        val lang = systemDataRepository.getSystemLanguage()
        return apiClient.getCurrentWeather(city, lang)
    }
}