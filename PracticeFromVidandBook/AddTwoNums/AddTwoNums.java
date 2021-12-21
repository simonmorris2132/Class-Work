package AddTwoNums;

import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println(a + b);

    }
}
