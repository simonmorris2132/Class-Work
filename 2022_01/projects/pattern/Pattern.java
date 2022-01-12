package projects.pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("How many stars? :)");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        for (int i = 0; i <= s; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = s - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
