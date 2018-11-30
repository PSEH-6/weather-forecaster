package com.sapient.interview.weatherforecaster.resource;

import com.sapient.interview.weatherforecaster.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/forecast")
public class WeatherForecastResource {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @GetMapping("/{city}")
    public String forecast(@PathVariable String city) {
        return weatherForecastService.getForecast(city);
    }

}
