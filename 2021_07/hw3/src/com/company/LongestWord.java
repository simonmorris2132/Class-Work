package com.company;

public class LongestWord {

    String str = "The quick brown fox jumped over the lazy dog";
    String stringArray[] = str.split("\\s");

    public String compare (String st1, String st2) {
        if (st1.length() > st2.length()) {
            return st1;
        } else {
            return st2;
        }
    }
    LongestWord() {
        String word = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (i == 0) {
                word = stringArray[0];
            }
            word = compare(word, stringArray[i]);
        }
        System.out.println("The longest word is " + word);
    }
    public static void main(String[] args) {
        new LongestWord();
    }
}
