package com.api.parking_control.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class TimeZoneConfig {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/sao_Paulo"));
    }
}
