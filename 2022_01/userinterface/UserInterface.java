package userinterface;

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a byte: ");
        byte a = scanner.nextByte();
        System.out.println("Enter your name");
        String b = scanner.nextLine();
    }
}
