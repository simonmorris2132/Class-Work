package com.company;

@SuppressWarnings("all")

public class FindTheLongestWord {

    public static void run() {

        String s = "The quick brown fox jumped over the lazy dog";

        String[] wrd = s.split(" ");

        String longestWord = "";

        for (int i = 0; i < wrd.length; i++) {

            if (wrd[i].length() >= longestWord.length()) {

                longestWord = wrd[i];

            }

        }
        System.out.println("The longest word is: " + longestWord);
    }

}


/* This one was pretty simple, I found a super simple one forloop solution for this on stack overflow. first we make a variable with the given string, make an array where we split up the string into only the spaces (I think thats how .split works), and then we create another string variable that only has a value of whitespace. We create a for-loop to iterate through the wrd array, which only has the spaces between each word of the string from our first string variable. Insde of our forloop, we have an if statement that says if the length of the array is greater than or equal to the length of our second variable, make longestWord equal to the index of wrd. */