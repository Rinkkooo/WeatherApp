package com.example.weatherapp.repository

import com.example.weatherapp.server.ApiServices

class WeatherRepository(val api: ApiServices) {

    fun getCurrentWeather(lat: Double, lon: Double, units: String) =
        api.getCurrentWeather(lat, lon, units, "87e5553203a77867a8f796e90a019b51")

}