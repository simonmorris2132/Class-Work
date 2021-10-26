package com.company;

@SuppressWarnings("ALL")

public class TurncateAString {

    static String str = "The green pot is big and scary";
    static int maxLength = 25;

    public static void run() {
        // str = str.substring(0, Math.min(str.length(), 27));
        if (str.length() <= maxLength) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(0, maxLength - 2) + "...");
        }
       
    }

}


/* This one is a bit buggy. I saw a few different ways to get this done on a Stack OVerflow thread. Theres the Apache Common Lang package example where theres a class inside of the package that does all of this for you. The example I used includes the .substring class to trim down the string from the max length variable made outside the method. https://stackoverflow.com/questions/8499698/trim-a-string-based-on-the-string-length/8499776 */