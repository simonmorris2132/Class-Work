package factory.factory;

import java.util.*;

public class FruitMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the fruit");
        String fruitName = scanner.nextLine();

        System.out.println("What is the color?");
        String fruitColor = scanner.nextLine();

        System.out.println("Does this fruit have seeds?");
        boolean fruitSeeds = scanner.nextBoolean();
        scanner.nextLine();

        scanner.close();

        Fruit fruit = new Fruit(fruitName, fruitColor, fruitSeeds);
        System.out.println(fruit);
    }
}
