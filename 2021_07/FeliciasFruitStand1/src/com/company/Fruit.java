package com.company;

/*
fruit object: price, name, quantity available and quantity sold
fruit class methods: Override toString(returns an output with all of a fruits' info), purchased(update sold quantity), addInventory(update available quantity).
Data types: strings, floats, integers
fruit: Mango, Apples, Oranges
*/

public class Fruit {

    private int price = 0;
    private String name = "";
    private int qAvailable = 0;
    private int qSold = 0;

    public Fruit(String name, int price, int qAvail, int qSale) {
        this.price = price;
        this.name = name;
        this.qAvailable = qAvail;
        this.qSold = qSale;
    }

    public void purchase(int value) {

        this.qSold += value;
        this.qAvailable -= value;
    }

    public int getqSold() {
        return qSold;
    }

    public void addInventory(int value) {

        this.qAvailable += value;

    }

    public int getqAvailable() {
        return qAvailable;
    }

}
