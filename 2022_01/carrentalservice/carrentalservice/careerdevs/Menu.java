import java.util.ArrayList;

public class Menu {
    Inventory inv = new Inventory();
    ArrayList<Car> avaList = inv.getAvailables();
    UserInput input = new UserInput();
    ArrayList<Car> rentList = inv.getRented();

    public void start() {
        System.out.println("Welcome to the Car Rental CLI!");
        inv.initializeCars();
        run();
    }

    public void run() {
        
    }
}
