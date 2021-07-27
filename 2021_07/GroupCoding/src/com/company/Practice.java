package com.company;

public class Practice {

public static void sequence(String[] args) {
    int n1 = 0, n2 = 1, n3, i, count = 10;
    System.out.print(n1 + " " + n2);

    for (i =2; i < count; i++) {
        n3 = n1 + n2;
        System.out.print(" " + n3);
        n1 = n2;
        n2 = n3;
    }
}

    public static void leapYear(String[] args) {
        int year = 2016;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else {
                leap = true;
            }
        }
        else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
