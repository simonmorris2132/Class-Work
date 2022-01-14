package createacar;

import java.util.*;

public class CreateACar {
    public static void main(String[] args) {
        System.out.println("Add the details of the owner and vehicle please.");
        List<Object> car = createACar();
        System.out.println(car);
    }

    public static List<Object> createACar() {
        Scanner scanner = new Scanner(System.in);

        String make = scanner.nextLine();
        String model = scanner.nextLine();
        String owner = scanner.nextLine();


        return Arrays.asList(make, model, owner);



    }


}

