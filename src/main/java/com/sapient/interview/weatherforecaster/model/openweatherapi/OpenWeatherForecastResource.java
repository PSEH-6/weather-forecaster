package com.sapient.interview.weatherforecaster.model.openweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherForecastResource {
    private Integer cnt;
    private OpenWeatherCity city;
    private List<OpenWeatherForecast> list;

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public OpenWeatherCity getCity() {
        return city;
    }

    public void setCity(OpenWeatherCity city) {
        this.city = city;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<OpenWeatherForecast> getList() {
        return list;
    }

    public void setList(List<OpenWeatherForecast> list) {
        this.list = list;
    }
}
