package com.company;

public class Product {

   private float price;
   private String productName;
   private int qSold;
   private int qAvailable;
   private float profit;
   private int potentialProfit = (int) (profit * price);
   private boolean isRotten;
   private String productType;

    public Product(float prices, int quantAvailable, int quantSold, String name) {

        this.price = prices;
        this.productName = name;
        this.qAvailable = quantAvailable;
        this.qSold = quantSold;

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
