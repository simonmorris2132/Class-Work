package com.company;

/* Felicia's fruit stand:

Create a new InteliJ project called "FeliciasFruitStand"

Objects
Create a fruit class that can has properties for price, name, quantity available and quantity sold

fruit object: price, name, quantity available and quantity sold
fruit class methods: Override toString(returns an output with all of a fruits' info), purchased(update sold quantity), addInventory(update available quantity).

Create a Stand class that has a property for inventory

stand object: inventory
stand class methods: displayFruit(prints the info of all fruits available).

Methods


The fruit class should have an "Override" toString method that returns an output with all of a Fruits information


The fruit class should also include methods called "purchase" & "addInventory" that update the available and sold quantity of the fruit


The Stand class should have a method called displayFruit that prints the information of all Fruits available */

public class Main {

    public static void main(String[] args) {
        //Fruit(String name, int price, int qAvail, int qSold)
        Fruit fruit1 = new Fruit("Apple", 250, 57, 120);
        Fruit fruit2 = new Fruit("Mango", 300, 63, 50);
        Fruit fruit3 = new Fruit("Oranges", 350, 70, 66);
        fruit1.addInventory(5);
        System.out.println(fruit1.getqAvailable());

        fruit2.purchase(10);
        System.out.println(fruit2.getqAvailable());

    }
}
