import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("How many stars? :)");
        Scanner scanner = new Scanner(System.in);
        int numOfStars = scanner.nextInt();
        
        for (int i = 1; i <= numOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numOfStars; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
