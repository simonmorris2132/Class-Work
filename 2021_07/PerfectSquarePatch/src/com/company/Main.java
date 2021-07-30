package com.company;

import java.util.Arrays;

public class Main extends PerfectPatch {

    public static void main(String[] args) {
        PerfectPatch.squarePatch(3);
        System.out.println(Arrays.deepToString(PerfectPatch.squarePatch(3)));
    }
}

