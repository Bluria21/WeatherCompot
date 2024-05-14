package com.blruia.weathercompot.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.blruia.weathercompot.Network.WeatherApiClient
import com.blruia.weathercompot.nav.RouterScreen
import com.blruia.weathercompot.repository.WeatherRepository
import com.blruia.weathercompot.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { RouterScreen() }
    }
}