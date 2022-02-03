package com.careerdevs.algocli;

import java.util.*;

public class UI {
    private static Scanner scanner = new Scanner(System.in);


    public static String readString(String question) {
        System.out.print(question + "\nInput: ");
        return scanner.nextLine();
    }


    
}
