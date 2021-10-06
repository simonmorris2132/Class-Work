package InterChallenge.diffArray;

public class diffArray {

    static int[] arr1 = {1, 2, 3, 4, 5};
    static int m = arr1.length;
    static int[] arr2 = {1, 2, 3, 5, 6, 7};
    static int n = arr2.length;

    public static void run() {

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                System.out.println(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.println(arr2[j] + " ");
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < n) {
            System.out.println(arr1[i] + " ");
            i++;
        }
        
        while (j < m) {
            System.out.println(arr2[j] + " ");
            j++;
        }

    }
    
}

/*  */