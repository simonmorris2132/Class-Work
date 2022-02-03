package carrentalservicetwo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Menu program!\n\n");
        
        mainMenu();

        System.out.println("THANKS FOR USING");
    }

    public static void mainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1) Menu 1");
        System.out.println("2) Menu 2");
        System.out.println("3) Exit");
        
        int userSelect = CLI.readInt("Select an option", 1, 3);

        switch (userSelect) {
            case 1:
                menuOne();
                break;
            
            case 2:
                System.out.println("Menu 2");

                break;
        
            default:
                break;
        }
    }

    public static void menuOne() {
        System.out.println("\nYOU ON IN MENU ONE\n");
        mainMenu();
    }

}
