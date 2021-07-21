package com.company;


import java.util.Arrays;

public class Main {
    /* modifiers are basically things that give access to classes, fields, or methods. static is a different kind of modifier. We can use fields without stating the class. Void means that after the program runs, nothing else should follow. Void is a return-type. main() is the name of the function, and inside of it's parenthesis is the arguments. */
    public static void main(String[] args) {

        titleCase("i am a developer");

    }

    /*  */
    public static String titleCase(String input) {

        //split string into array of strings
        //iterate
        //join array back into one string

        //let splitInput = input.split(" ");
        String[] splitInput = input.split(" ");

        for (int i =0; i < splitInput.length; i++) {
            System.out.println(splitInput[i]);
            splitInput[i] = i + " ";

        }
        System.out.println(Arrays.toString(splitInput));
        return "";
    }

}