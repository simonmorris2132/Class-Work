package com.example.gateway.Weather;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {
    
    private Coordinate coord;
    private Main main;

    class Coordinate {
        public float lon;
        public float lat;
    }

    class Main {
        public float temp;
        public float feels_like;

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


}
