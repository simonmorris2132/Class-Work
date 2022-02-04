package com.careerdevs.algocli;

public class Main {
    public static void main(String[] args) {
        int userSelect = UI.readInt("Whats your age", 1, 99);
        System.out.println(userSelect);
    }
}
