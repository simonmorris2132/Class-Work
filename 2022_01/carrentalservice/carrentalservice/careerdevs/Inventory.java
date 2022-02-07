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

    

}
