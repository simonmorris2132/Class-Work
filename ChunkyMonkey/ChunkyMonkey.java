import java.util.Arrays;
import java.util.Scanner;

public class ChunkyMonkey {
    
    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick a number higher or equal to 7!");
        System.out.println("Please enter the size of your array: ");

        int size = scanner.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {

            myArray[i] = scanner.nextInt();
            
        }

        System.out.println(Arrays.toString(myArray));

        int[] array1 = Arrays.copyOfRange(myArray, 4, 7);
        
        System.out.println("This is the array that is now sectioned: " + Arrays.toString(array1));

    }

}

/* So, I saw this solution on Tutorialspoint (https://www.tutorialspoint.com/How-to-divide-an-array-into-half-in-java) And basically, it's taking user input to make the size and what elements are in the array. Then, it iterates through the size of the array the user has given. Then, we copy the range of our original array and then making a new array with the elements from index 4 to 7. */