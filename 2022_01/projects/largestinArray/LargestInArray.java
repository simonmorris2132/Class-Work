public class LargestInArray {
    public static void main(String[] args) {
       System.out.println(run()); 
    }

    static int[] arr = {1, 5, 6, 3, 2000};

    static int run() {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    
        return max;

    }


}
