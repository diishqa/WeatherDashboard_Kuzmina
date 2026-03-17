package com.kuzmina.weatherdashboard_kuz.data

import android.health.connect.datatypes.units.Temperature
import kotlinx.coroutines.delay
import kotlin.random.Random

data class WeatherData(
    val temperature: Int? = null,
    val humidity: Int? = null,
    val windSpeed: Int? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)