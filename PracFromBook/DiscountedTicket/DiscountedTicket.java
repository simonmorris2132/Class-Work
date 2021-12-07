import java.util.Scanner;

public class DiscountedTicket {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int age;
       double price = 0.00;
       char reply;
       
       System.out.println("How old are you?");
       age = scanner.nextInt();

       if (age >= 12 && age < 65) {
           price = 9.25;
       }
   } 
}
