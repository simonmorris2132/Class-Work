package com.company;


import java.io.IOException;
import java.util.Scanner;
import static com.company.UserInput.saveOutput;

public class Main {

    public static void main(String[] args) throws IOException {

        Fruit fruitOne = new Fruit ( "Grape","Cotton Candy",4.99f,20);
        Fruit fruitTwo = new Fruit ( "Oranages", "Blood Orange",2.99f,20);
        Fruit fruitThree = new Fruit ( "Apple","Fuji",0.99f,20);


        Scanner input = new Scanner ( System.in );
        int count = 0;

        boolean addMoreFruit = false;

        System.out.print ("Would you like to add items to inventory?: (Y/N) ");

        String check = input.nextLine ();

        switch (check){
            case "Y", "y", "Yes", "yes" -> addMoreFruit = true;
            default -> System.out.println ( "No items have been added to inventory!" );
        }

        while (addMoreFruit){

            Fruit fruits = new Fruit ( null,null,0,0 );

            System.out.print ("Please enter Fruit Type: ");
            fruits.fruitType = input.nextLine();
            System.out.print ("Please enter Fruit Name: ");
            fruits.name = input.nextLine();
            System.out.print ("Please enter Fruit Price: ");
            fruits.price = input.nextFloat();
            System.out.print ("Please enter the Quantity Available: ");
            fruits.quantAvailable = input.nextInt();
            saveOutput (fruits);
            System.out.print ("Would you like to add another fruit? (Y/N) ");
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