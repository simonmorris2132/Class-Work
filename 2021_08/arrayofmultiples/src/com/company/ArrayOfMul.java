package com.company;

public class ArrayOfMul {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = num * i;
        }
        return array;
    }
}
