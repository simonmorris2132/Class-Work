package com.company;

public class Fruit extends Product {


    private String flavor;
    private String[] flavorTypes = {"Sweet", "Sour", "Bitter", "Nutty", "Tangy"};
    private String color;

    public Fruit(String name, float prices, int quantAvailable, int quantSold, int flavIndex, String types) {
        super(prices, quantAvailable, quantSold, name, types);
        this.flavor = flavorTypes[flavIndex];
    }

    void setFlavorTypes(int flav) {
        flavorTypes[flav] = flavor; /* flavorTypes[] is inputting the index of the flavor type and sending it to the flavor field */
    }

    void getFlavor() {
        System.out.println(flavor);
    }

    boolean checkColor(String clr) {
        if (color == clr) {
            return true;
        } else return false;
    }

}
