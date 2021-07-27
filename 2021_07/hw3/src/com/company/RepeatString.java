package com.company;

public class RepeatString {
    public static void main(String[] args) {
        String str = "abc";
        String repeated = str.repeat(5);
        repeated.equals("abcabcabc");
        System.out.println(repeated);
    }
}
