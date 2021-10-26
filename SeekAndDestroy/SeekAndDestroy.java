@SuppressWarnings("ALL")

public class SeekAndDestroy {

    public static void run() {

        int[] arr = {1, 2, 3, 4, 5};
        int nums = 4;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nums) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.println("This is the array with the deleted element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }   
}

/* This challenge is essentially the same as another one we did. I need to find a way to have the last element not copy itself. we're basically pushing the array to the left to get rid of the number matching with out nums variable. */