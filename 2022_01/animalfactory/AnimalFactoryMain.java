package animalfactory;

import java.util.Scanner;

public class AnimalFactoryMain {
    public static void main(String[] args) {

        Animal testAnimal = new Animal("human", (short) 2, true);
        System.out.println("Species: " + testAnimal.species);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Animal Factory");

        System.out.println("Enter a species");
        String speciesInput = scanner.nextLine();

        System.out.println("Enter the # of legs");
        short legsInput = scanner.nextShort();
        
        System.out.println("Does this animal live on land");
        boolean livesOnLandInput = scanner.nextBoolean();

        Animal userGenAnimal = new Animal(speciesInput, legsInput, livesOnLandInput);
        System.out.println(userGenAnimal);

    }
}
