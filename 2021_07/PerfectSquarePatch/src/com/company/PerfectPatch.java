package com.company;

import java.util.Arrays;

public class PerfectPatch {
    public static int[][] squarePatch(int n) {
        int gridArray[][] = new int[n][n];
        if(n == 0) {
            return gridArray;
        }
        for (int[] row : gridArray) {
            Arrays.fill(row, n);
        }
        return gridArray;
    }
}
