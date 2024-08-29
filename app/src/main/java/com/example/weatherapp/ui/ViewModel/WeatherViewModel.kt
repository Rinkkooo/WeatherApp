package com.example.weatherapp.ui.WeatherViewModel

import androidx.lifecycle.ViewModel
import com.example.weatherapp.repository.WeatherRepository
import com.example.weatherapp.server.ApiClient
import com.example.weatherapp.server.ApiServices

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lon: Double, units: String) =
        repository.getCurrentWeather(lat, lon, units)

}