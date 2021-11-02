package com.company;

@SuppressWarnings("ALL")

public class FindLargestNum {

    //static int[][] myNumbers = {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}};

    public static void run() {
        int[][] test = new int[][] {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}};
        int largest = test[0][0];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                if (largest < test[i][j]) {
                    largest = test[i][j];
                }
            }
        }
        System.out.println("The largest number in the array is: " + largest);
    }
}

/* Gabe helped with this a bit, but overall I understand the majority of what this is doing. I think this will help with the majority of the exercises going forward. Basically we make one loop to get into the array itself, and a second forloop within the first forloop to access the elements within. */
