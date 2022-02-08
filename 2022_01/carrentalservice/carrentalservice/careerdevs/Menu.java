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
        System.out.println("\nWe have a total of " + avaList.size() + " cars available for rent and " + rentList.size() + " currently being rented.");
        System.out.println("\nChoose from the following menu options:");
        System.out.println("1) Rent a car");
        System.out.println("2) Return a car");
        System.out.println("3) Exit the program");

        int usersInput = input.getInt(1, 3);

        if (usersInput == 1) {
            renting();
        } else if (usersInput == 2) {
            returnCar();
        } else {
            new UserInput().exit();
        }

        
    }

    public void renting() {
        while (avaList.size() != 0) {
            inv.showAvailMenu();
            
            System.out.println("Choose what car you want to rent: ");
            int selection = input.getInt(1, avaList.size());

            for (int i = 0; i < avaList.size(); i++) {
                if (selection - 1 == i) {
                    rentedTotal(i);
                    rentList.add(avaList.get(i));
                    avaList.remove(i);
                    subMenu();
                }
            }
        }
    }

    public void returnCar() {
        if (rentList.size() == 0) {
            System.out.println("\nWe have no cars out for rent! Returning to main menu...\n");
            run();
        }

        while (rentList.size() != 0) {
            inv.showRentedMenu();
            
            System.out.print("\n");
            int rentSelection = input.getInt(1, rentList.size());

            for (int i = 0; i < rentList.size(); i++) {
                if (rentSelection - 1 == i) {
                    System.out.println("\nThank you for returning the " + rentList.get(i).getMake() + " " + rentList.get(i).getModel() + "! We hope to see you again!");
                    avaList.add(rentList.get(i));
                    rentList.remove(i);
                    subMenu();
                }
            }
        }
    }

    public void rentedTotal(int i) {
        System.out.println(i);
        System.out.println("\nThank you for choosing the " + avaList.get(i).getMake() + " " + avaList.get(i).getModel() + "! How many days do you wish to rent it?\n");
        int select = input.getInt();
        System.out.println("For " + select + " days.");
    }

    public void subMenu() {
        subMenuDialogue();
        int subSelection = input.getInt(1, 5);
        userSelection(subSelection);
    }

    private void subMenuDialogue() {
        System.out.println("\nThank you for choosing the Car Rental Service! What would you like to do from this point?");
        System.out.println("1) Restart this program and refresh the lot");
        System.out.println("2) Return to the main menu.");
        System.out.println("3) Go to the rental menu to rent a car.");
        System.out.println("4) Go to the return menu to return a car.");
        System.out.println("5) Exit the program");
    }

    public void userSelection(int selectionParameter) {
        if (selectionParameter == 1) {
            System.out.println("\nRestarting the program!\n");
            avaList.clear();
            rentList.clear();
            start();
        } else if (selectionParameter == 2) {
            System.out.println("\nReturning to the main menu.\n");
            run();
        } else if (selectionParameter == 3) {
            System.out.println("\nSending you to the rental menu\n");
            renting();
        } else if (selectionParameter == 4) {
            System.out.println("\nSending you to the return menu\n");
            returnCar();
        } else {
            new UserInput().exit();
        }
    }

    public void returnTotal(int i) {
        System.out.println(i);
        System.out.println("\nThank you for choosing the " + avaList.get(i).getMake() + " " + avaList.get(i).getModel() + ". How many days would you like to rent it for?");
        int days = input.getInt();
        System.out.println("For a total of " + days);
    }


}
