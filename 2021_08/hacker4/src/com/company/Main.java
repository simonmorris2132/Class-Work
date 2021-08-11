package com.company;

import java.util.*;

public class Main {

    public String weird = "Weird";
    public String notWeird = "Not Weird";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println(((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
    }
}


