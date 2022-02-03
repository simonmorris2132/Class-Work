package factory.factory;

import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Country?");
        String countryName = scanner.nextLine();

        System.out.println("How many people live here?");
        long population = scanner.nextLong();
        scanner.nextLine();

        System.out.println("What is the capital?");
        String countryCaptial = scanner.nextLine();

        scanner.close();

        Country country = new Country(countryName, population, countryCaptial);

        System.out.println(country);
    }
}
