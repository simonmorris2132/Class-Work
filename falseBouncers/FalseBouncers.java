import java.util.Arrays;

@SuppressWarnings("ALL")

public class FalseBouncers {

    public static void run() {

        int[] arr = {1, 2, 3, 5, 4};

        for (int i = 3; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

/* Sooooo this one is a bit annoying. The problem with this challenge is that you can not have multiple vales of different types in one array. You could use an Object array but whatever. This challenge just wants us to remove a value from an array, which is honestly p simple. The for loop iterates from the third element forward. The length of the array is removed by one so that it removes the third element. Then, we assign the array[i] with itself plus one so it replaces 5 with 4, as it should be. It will duplicate the last index because it's just shifting the last index into the third element's spot. You can eliminate this issue by using two arrays. */