@SuppressWarnings("ALL")

public class Boohoo {

    static boolean isTrue = false;

    public static void run() {

        if (isTrue == false) {
            System.out.println("This value is declared is a boolean: " + isTrue);
        } else if (isTrue == true) {
            System.out.println("This value declared is a boolean: " + isTrue);
        }

    }
    
}