package com.company;

public class Main {

    public static void main(String[] args) {
        String input = "Hello";
        reverseString(input);
    }

    public static String reverseString(String input) {
        String answer = new StringBuilder().append(input).reverse().toString();

        System.out.println(answer);

        return answer;
    }
}
