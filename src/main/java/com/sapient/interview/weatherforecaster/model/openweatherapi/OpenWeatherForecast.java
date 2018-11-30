package com.sapient.interview.weatherforecaster.model.openweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.sapient.interview.weatherforecaster.service.CustomDateDeserializer;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherForecast {
    private OpenWeatherMain main;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonProperty("dt_txt")
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OpenWeatherMain getMain() {
        return main;
    }


    public void setMain(OpenWeatherMain main) {
        this.main = main;
    }
}
