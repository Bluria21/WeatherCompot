package com.blruia.weathercompot.repository

import com.blruia.weathercompot.Network.WeatherApiClient
import com.blruia.yourweather.data.model.LocationDto
import javax.inject.Inject

class WeatherRepository
@Inject constructor(
    private val apiClient: WeatherApiClient,
){

}