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
        System.out.println("2) How many vowels");
        System.out.println("3) two makes ten");
        System.out.println("4) reverse a string");
        System.out.println("5) get word count");
        System.out.println("6) capture the rook");
        System.out.println("7) Exit the program");

        int userSelect = UI.readInt("Select an option", 1, 7);
        System.out.println("You selected " + userSelect);


        switch (userSelect) {
            case 1 -> repeatAString();

            case 2 -> howManyVowels();

            case 3 -> twoMakesTen();

            case 4 -> reverseAString();

            case 5 -> getWordCount();

            case 6 -> captureTheRook();

            case 7 -> System.out.println("Thank you for using the program");

        }

    }

    private static void repeatAString() {

        String strToRepeat = UI.readString("Enter a string to repeat");

        int numOfRepeats = UI.readInt("How many times do you wanna repeat the string?", 1, 10);

        String repeatedString = strToRepeat.repeat(numOfRepeats);

        System.out.println(repeatedString);

        mainMenu();

    }

    private static void howManyVowels() {

    }

    private static void twoMakesTen() {

    }

    private static void reverseAString() {

        String ques1 = "Enter a string to reverse";

        String strToReverse = UI.readString(ques1);

        String reversedString = new StringBuilder(strToReverse).reverse().toString();

        System.out.println(reversedString);

        mainMenu();
    }

    private static void getWordCount() {

    }

    private static void captureTheRook() {

    }

}
