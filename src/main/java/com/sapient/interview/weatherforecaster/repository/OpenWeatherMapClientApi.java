package com.sapient.interview.weatherforecaster.repository;

import com.sapient.interview.weatherforecaster.model.openweatherapi.OpenWeatherForecastResource;

public interface OpenWeatherMapClientApi {
    OpenWeatherForecastResource getDataFromOpenWeatherMap(String city);
}
