package com.careerdevs.algocli;

public class Main {

    /* Reverse a string
       How many vowels
       two makes ten
       capture the rook
       get word count    
    */

    public static void main(String[] args) {
        System.out.println("Welcome to the Algorithm CLI");
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println(UI.lineSpacer() + "\n   MAIN MENU\n" + UI.lineSpacer());
        System.out.println("1) Repeat a String");
        System.out.println("2) Exit the program");

        int userSelect = UI.readInt("Select an option", 1, 2);
        System.out.println("You selected " + userSelect);


        switch (userSelect) {
            case 1 -> repeatAString();

            case 2 -> System.out.println("Thank you for using the program");

        }

    }

    private static void repeatAString() {

        String strToRepeat = UI.readString("Enter a string to repeat");

        int numOfRepeats = UI.readInt("How many times do you wanna repeat the string?", 1, 10);

        mainMenu();

    }

}
