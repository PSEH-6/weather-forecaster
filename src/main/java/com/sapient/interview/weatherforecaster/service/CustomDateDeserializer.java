package com.sapient.interview.weatherforecaster.service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.time.format.DateTimeFormatter;

public class CustomDateDeserializer extends LocalDateTimeDeserializer {
    public CustomDateDeserializer() {
        super(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
