package com.company;

import java.io.Serializable;

public class Fruit implements Serializable {

    float price;
    String name;
    String fruitType;
    int quantSold;
    int quantAvailable;
    float profit;

    public Fruit (String fruitType, String name, float price, int quantityAvailable) {

        this.price = price;
        this.quantAvailable = quantityAvailable;
        int qSold = this.quantSold;
        this.name = name;
        this.fruitType = fruitType;
        Stand.inventory.add ( this );

    }

    void Quantity(int sold){
        quantSold += sold;
        quantAvailable -= sold;
        profit = quantSold * price;
        Stand.totalProfit += profit;
    }

    void addQuantity(int bought){
        quantAvailable += bought;
    }

    void getProfit(){
        System.out.println (name +" has to made $" + profit);
    }

    void getPotentialProfit(){
        float potentialProfit = quantAvailable * price;
        System.out.println (name +" has a potential to make $" + potentialProfit);
    }


    @Override
    public String toString(){
        String fruitInfo = "Fruit Type: " + fruitType + ", Name: " + name + ", Price: " + price + ", Available: " + quantAvailable + ", Sold:" + quantSold;
        return fruitInfo;
    }



}