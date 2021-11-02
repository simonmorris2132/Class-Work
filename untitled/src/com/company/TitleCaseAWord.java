package com.company;

import java.util.Locale;

public class TitleCaseAWord {

    private static String val;

    public static void run() {

        String str = "I'm a little teapot";

        String newString = str.toLowerCase();

        String[] converToArray = str.toLowerCase().split(" ");

        String[] tcArray = new String[converToArray.length];

        String tcSentence = "";

        for (int i = 0; i < converToArray.length; i++) {
//            String tcWord = Character.toString(Character.toUpperCase(converToArray[i].charAt(0)));
            tcArray[i] = converToArray[i].replace(converToArray[i].charAt(0), Character.toUpperCase(converToArray[i].charAt(0)));
            tcSentence += tcArray[i] + " ";
//            System.out.println(tcArray[i]);
        }
        System.out.println(tcSentence);
    }

}
