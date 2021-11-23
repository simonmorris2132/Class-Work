package com.example.gateway.Weather;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherResponse {
    
    private Coordinate coord;
    private Main main;
    private Weather[] weather;

    public class Coordinate {
        public float lon;
        public float lat;
    }

    public class Main {
        public float temp;
        public float feels_like;
        public float temp_min;
        public float temp_max;
        public short pressure;
        public byte humidity;

    }

    public class Weather {
        public short id;
        public String main;
        public String description;
        public String icon;
    }

    public Coordinate getCoord() {
        return this.coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public Main getMain() {
        return this.main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather[] getWeather() {
        return this.weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

}
