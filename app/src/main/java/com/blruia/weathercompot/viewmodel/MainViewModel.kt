package com.blruia.weathercompot.viewmodel

import Model.ConditionDto
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.blruia.weathercompot.model.WeatherResponse
import com.blruia.weathercompot.repository.WeatherRepository
import com.blruia.yourweather.data.model.LocationDto
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(
    private val repository: WeatherRepository,
) : ViewModel() {

    lateinit var responseList: List<WeatherResponse>
    var location: MutableState<LocationDto?> = mutableStateOf(null)
    var icon: MutableState<ConditionDto?> = mutableStateOf(null)
    var buttonAction: ((String) -> Unit) = { name ->

    }
}

