package com.example.gateway.Weather;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {
    
    private Weather[] weather;
    private Coordinate coord;

    class weather { 
        private String main;
        private String description;
    }

    class Coordinate {
        private float lon;
        private float lat;
    }


    public Weather[] getWeather() {
        return this.weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public Coordinate getCoord() {
        return this.coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }


}
