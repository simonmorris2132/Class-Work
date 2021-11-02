package com.company;

@SuppressWarnings("ALL")

public class ConfirmTheEnding {

    public static void run() {

        String helpMeGod = "Bastiox";

        boolean whereAmI = helpMeGod.endsWith("n");

        if (whereAmI == true) {
            System.out.println("'n' is the last character of the string.");
        } else {
            System.out.println("the string does not end with 'n'.");
        }

    }

}

/* This one was a good to practice booleans in if statements. I know the exercise on fcc says not to use endsWith but it works best with it. Using booleans types with the if statements are really cool because of how deceptively simple they can be. here it's at it's most barebones. In the future i will use this exercise to better my understanding of if else statements. */