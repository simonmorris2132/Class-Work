package Edabit.ArrayofMultiples;

import java.util.Arrays;

public class ArrayOfMul {
    public static void run() {
        System.out.println(Arrays.toString(arrayOfMultiples(6, 5)));
    }

    static int[] arrayOfMultiples(int num, int length) {

        int[] array = new int[length];

        for (int i = 0; i < length; ++i) {
            array[i] = num * (i + 1);
        }
        return array;
    }


}
