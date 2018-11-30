package com.sapient.interview.weatherforecaster.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.interview.weatherforecaster.model.openweatherapi.OpenWeatherForecastResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class OpenWeatherClientApi implements OpenWeatherMapClientApi {

    @Value("${weather-api.url}")
    private String url;

    public OpenWeatherForecastResource getDataFromOpenWeatherMap(String city) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<OpenWeatherForecastResource> response
                = restTemplate.getForEntity(url, OpenWeatherForecastResource.class, city);
        return response.getBody();

    }
}
