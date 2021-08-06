package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 1.50F, 20, 24, 0, "Gala");
        Fruit fruit2 = new Fruit("Grape", 3.00F, 60, 10, 1, "Sour");
        Fruit fruit3 = new Fruit("Orange", 3.50F, 45, 25, 0, "Clementine");

        Scanner input = new Scanner (System.in);
        int count = 0;

        boolean addMoreFruit = false;

        System.out.print ("Would you like to add items to inventory?: (Y/N) ");

        String check = input.nextLine();

        switch (check) {
            case "Y", "y", "Yes", "yes" -> addMoreFruit = true;
            default -> System.out.println ( "No items have been added to inventory!" );
        }

        while (addMoreFruit) {

            Fruit fruityies = new Fruit (null,0,0,0, 0, null);

            System.out.print ("Please enter Product Name: ");
            fruityies.names = input.nextLine();
            System.out.print ("Please enter Product Price: ");
            fruityies.price = input.nextFloat();
            System.out.print ("Please enter the Quantity Available: ");
            fruityies.qAvailable = input.nextInt();
            System.out.println("What is the quantity sold: ");
            fruityies.qSold = input.nextInt();
            System.out.print ("Would you like to add another product? (Y/N) ");
            String check2 = input.next();
            addMoreFruit = false;
            count++;
            switch (check2) {
                case "Y", "y", "Yes", "yes" -> addMoreFruit = true;
                default -> System.out.println ( count +" item(s) have been added to inventory!" );
            }
        }
        Stand.displayFruit ();
    }
}