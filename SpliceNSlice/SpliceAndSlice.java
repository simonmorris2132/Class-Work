import java.util.Arrays;

@SuppressWarnings("ALL")

public class SpliceAndSlice {

    public static void run() {

        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, 3, b.length);
        System.out.println(Arrays.toString(result));

    }
    
}

/* This is a solution i found on stack overflow. What it's doing is making a locale number that sets where in the new array the b array will start. Then I used arrayCopy() to copy it's contents and specify where it goes into the new resul array. https://stackoverflow.com/questions/43925430/insert-array-into-another-array */
