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
        System.out.println("\nWe have a total of" + avaList.size() + " cars available for rent and " + rentList.size() + " currently being rented.");
        System.out.println("\nChoose from the following menu options:");
        System.out.println("1) Rent a car");
        System.out.println("2) Return a car");
        System.out.println("3) Exit the program");

        int usersInput = input.getInt(1, 3);

        
    }

    public void renting() {
        while (avaList.size() != 0) {
            inv.showAvailMenu();
        }
    }

}
