package com.blruia.weathercompot.viewmodel

import androidx.lifecycle.ViewModel
import com.blruia.weathercompot.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondViewModel
@Inject constructor(
    private val repository: WeatherRepository,
) : ViewModel() {}