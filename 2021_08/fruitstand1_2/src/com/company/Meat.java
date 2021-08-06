package com.company;

public class Meat extends Product {

    int weight;
    static String[] meatGrade = {"Prime", "Choice", "Select"};
    String grade;

    public Meat(String name, float prices, int quantAvailable, int quantSold, int weight, int mGrade, String types) {
        super(prices, quantAvailable, quantSold, name, types);

        this.grade = meatGrade[mGrade]; //this grade will be equal to whatever we pull from the index
        this.weight = weight;

    }

    void getGrade() {
        System.out.println(grade);
    }

    void getWeight() {
        System.out.println(weight);
    }

}
