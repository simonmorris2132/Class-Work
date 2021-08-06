package com.company;

public class Product {

   float price;
   String names;
   int qSold;
   int qAvailable;
   float profit;
   private int potentialProfit = (int) (profit * price);
   private boolean isRotten;
   private String productType;

    public Product(float prices, int quantAvailable, int quantSold, String name, String types) {

        this.price = prices;
        this.names = name;
        this.qAvailable = quantAvailable;
        this.qSold = quantSold;
        this.productType = types;

    }

    void Quantity(int sold) {
        qSold += sold;
        qAvailable -= sold;
        profit = qSold * price;
        Stand.totalProfit += profit;
    }

    void addStock(int sum) {
        qAvailable += sum;
    }

    void purchase(int sold) {
        qAvailable -= sold;
        qSold += sold;
    }
}
