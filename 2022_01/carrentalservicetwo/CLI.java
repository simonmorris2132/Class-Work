package carrentalservicetwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question);
                System.out.print("Number (" + min + " - " + max + "): ");

                int userData = scanner.nextInt();

                if (userData >= min && userData <= max) {
                    return userData;
                }
                System.out.println("Number must be in range " + "(" + min + " - " + max + ")");
            } catch (InputMismatchException e) {
                System.out.println("You must enter a whole number, try again.");
                scanner.nextLine();
            }
        }
    }
}
