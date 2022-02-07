import java.util.ArrayList;

public class Inventory {
    public ArrayList<Car> available = new ArrayList<>();
    public ArrayList<Car> rented = new ArrayList<>();

    public void initializeCars() {
        Car car1 = new Car("Hyundai", "Elantra");
        available.add(car1);

        Car car2 = new Car("Toyota", "Camry");
        available.add(car2);

        Car car3 = new Car("Ford", "Focus");
        available.add(car3);
    }

    public void showAvailMenu() {
        System.out.println("\nThis is our current available cars to rent: ");
        for (int i = 0; i < available.size(); i++) {
            System.out.println(i + 1 + ") " + available.get(i).getMake() + " " + available.get(i).getModel());
        }
    }

    public void showRentedMenu() {
        System.out.println("\nThis is our selection of cars that have been rented: ");
        for(int i = 0; i < rented.size(); i++) {
            System.out.println(i + 1 + ") " + rented.get(i).getMake() + " " + rented.get(i).getModel());
        }
    }

    public ArrayList<Car> getAvailables() {
        return available;
    }

    public ArrayList<Car> getRented() {
        return rented;
    }

}
