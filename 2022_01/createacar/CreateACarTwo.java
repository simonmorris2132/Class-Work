package createacar;

import java.util.*;

public class CreateACarTwo {
    public static void main(String[] args) {
        System.out.println("Enter the make, model, mileage, and gas percentage");
        List<Object> car = createACarObject();
        System.out.println(car);
    }

    public static List<Object> createACarObject() {
        Scanner scanner = new Scanner(System.in);

        String make = scanner.nextLine();
        String model = scanner.nextLine();
        int mileage = scanner.nextInt();
        float gasMilePercentage = scanner.nextFloat();

        return Arrays.asList(make, model, mileage, gasMilePercentage);

    }

}
