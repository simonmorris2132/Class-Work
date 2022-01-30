package carrentalservice;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Car Rental App!");

        //Traditional/Standard Array
        Car[] carStorage = new Car[3];

        Car car1 = new Car("Chevy", "Cruze");
        Car car2 = new Car("Hyundai", "Elantra");
        Car car3 = new Car("Toyota", "Camry");

        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        car2.setIsRented(true);

        System.out.println("Available cars:");
        int listNumber = 1;
        for (int i = 0; i < carStorage.length; i++) {
            if (!carStorage[i].isIsRented()) {
                System.out.println((i + 1) + ") " + carStorage[i].getMake() + " " + carStorage[i].getModel());
                listNumber++;
            }
        }

        System.out.println("All Cars:");
        for (int i = 0; i < carStorage.length; i++) {
            String carStatus;
            if (!carStorage[i].isIsRented()) {
                carStatus = "Available";
            } else {
                carStatus = "Unavailable";
            }
            System.out.println((i + 1) + ") " + carStorage[i].getMake() + " " + carStorage[i].getModel());
        }


    }
}
