package com.company;

@SuppressWarnings("All")

public class reversethestring {

    public static void run() {
        StringBuilder builder = new StringBuilder("This is a normal message.").reverse();
        System.out.println("This is a reversed string: " + builder);
    }

}
/* I used the Stringbuilder constructor (is it a constructor? i have a hard time remembering) to take advantage of it's built in reverse thingy. I found out about this from geeksforgeeks.com */