package carrentalservice;

import java.util.*;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public static int readInt(String question) {
        while (true) {
            try {
                System.out.println(question + "\nNumber: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You must enter an integer, try again.");
                scanner.nextLine();
            }
        }
    }
}
