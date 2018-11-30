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
        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class, city);
        ObjectMapper mapper = new ObjectMapper();
            OpenWeatherForecastResource res = null;
        try {
            res = mapper.readValue(response.getBody(), OpenWeatherForecastResource.class);
        } catch (IOException e) {

            throw new RuntimeException(e.getMessage());
        }
        return res;

    }
}
