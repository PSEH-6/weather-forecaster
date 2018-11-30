package com.sapient.interview.weatherforecaster.service;

import com.sapient.interview.weatherforecaster.model.openweatherapi.OpenWeatherForecastResource;
import com.sapient.interview.weatherforecaster.repository.OpenWeatherClientApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherForecastService implements WeatherForecastService {

    @Autowired
    private OpenWeatherClientApi openWeatherClientApi;

    @Override
    public String getForecast(String city) {
        OpenWeatherForecastResource resource = openWeatherClientApi.getDataFromOpenWeatherMap(city);
        return resource.getCity().getName();
    }
}
