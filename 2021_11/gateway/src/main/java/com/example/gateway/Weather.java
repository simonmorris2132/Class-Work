package com.example.gateway;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {
    
    private String city;
    private String statecode;
    private String temp;
    private String weather;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatecode() {
        return this.statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}
