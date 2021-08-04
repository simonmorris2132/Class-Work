package com.company;

public class Meat extends Product {

    private int weight;
    private String meatType;

    public Meat(float prices, int quantAvailable, int quantSold, String name, String types) {
        super(prices, quantAvailable, quantSold, name, types);
    }
}
