package com.company;

public class FibonacciSequence {

public static void main(String[] args) {
    int n1 = 0, n2 = 1, n3, i, count = 15;
    System.out.print(n1 + " " + n2); /* prints 0 & 1 */

    for (i = 2; i < count; i++) { /* it starts at two cuz 0 & 1 r printed */
        n3 = n1 + n2;
        System.out.print(" " + n3);
        n1 = n2;
        n2 = n3;
    }
}
}
