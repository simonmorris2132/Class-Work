package com.company;

import java.util.Scanner;

@SuppressWarnings("ALL")

public class RepeatAString {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to repeat 3 times (Put a space at the end so you can read it properly!):");
        String abc = scanner.nextLine();
        String abcRepeated = abc.repeat(3);
        System.out.println(abcRepeated);
        abcRepeated.equals(abc);
    }

}

/* So, I used the built in repeat object to repeat whatever string the user inputs. While the eastiest way to complete this algorithm, it doesn't challenge. I'll have to come back and do some loops (even for the context of the challenge is redundant when there is a built in repeat class) to practice. */