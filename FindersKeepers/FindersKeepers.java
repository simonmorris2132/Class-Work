@SuppressWarnings("ALL")

public class FindersKeepers {

    static int[] lookThru = new int[] {1, 2, 3, 4};

    public static void run() {

        for (int i = 0; i < lookThru.length; i++) {
            if (lookThru[i] <= lookThru[0]) {
                System.out.println("This is the first element: " + lookThru[i]);
            } else if (lookThru[i] >= lookThru[0]) {
                System.out.println("This is not the first element: " + lookThru[i]);
            }
        }
    }
}

/* This algorithm is pretty simple. loop through the array, if its less than this, say that and vice versa. */