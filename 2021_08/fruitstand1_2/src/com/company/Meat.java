package com.company;

public class Meat extends Product {

    private int weight;
    private static String[] meatGrade = {"Prime", "Choice", "Select"};
    private String grade;

    public Meat(String name, float prices, int weight, int mGrade, int quantAvailable, int quantSold, String types) {
        super(prices, quantAvailable, quantSold, name, types);

        this.grade = meatGrade[mGrade]; //this grade will be equal to whatever we pull from the index
        this.weight = weight;

    }

    void getGrade() {
        System.out.println(grade);
    }

}
