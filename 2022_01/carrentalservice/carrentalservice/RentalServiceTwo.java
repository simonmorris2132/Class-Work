package carrentalservice.carrentalservice;

import java.util.ArrayList;

public class RentalServiceTwo {
    public static void main(String[] args) {
        Car car1 = new Car("Chevy", "Cruze");
        Car car2 = new Car("Hyundai", "Elantra");
        Car car3 = new Car("Honda", "Accord");

        //ArrayList
        ArrayList<Car> availCars = new ArrayList<>();
        ArrayList<Car> rentedCars = new ArrayList<>();

        availCars.add(car1);
        availCars.add(car3);
        rentedCars.add(car2);

        System.out.println("Available Cars:");
        for (int i = 0; i < availCars.size(); i++) {
            System.out.println((i + 1) + ") " + availCars.get(i).getMake() + " " + availCars.get(i).getModel());
            //System.out.println((i + 1) + ") " + carStorage[i].getMake() + " " + carStorage[i].getModel());
        }
        
    }
}
