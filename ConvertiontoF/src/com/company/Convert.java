package com.company;

import java.util.Scanner;

@SuppressWarnings("all")

public class Convert {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        double cels = scanner.nextDouble();
        double faren = 0.0;
        faren = (cels * 1.8) + 32;
        System.out.println("The Temp in Farenheit is " + faren);
    }
}
/* I used the scanner class to take in user input. I first read about this on w3schools.com, they have a very in depth article about the Scanner class. */