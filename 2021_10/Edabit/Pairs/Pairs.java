package Edabit.Pairs;

import java.util.Arrays;

public class Pairs {
    
    public static void run() {
      System.out.println(Arrays.toString(makePairs(2, 2)));  
    }

    static int[] makePairs(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        return arr;
    }

}
