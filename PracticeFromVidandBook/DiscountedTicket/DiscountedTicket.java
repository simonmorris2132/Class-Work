package DiscountedTicket;

import java.util.Scanner;
@SuppressWarnings("ALL")

public class DiscountedTicket {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int age;
       double price = 0.00;
       char reply;
       
       System.out.println("How old are you?");
       age = scanner.nextInt();

       System.out.println("Have a Coupon? Y/N?");
       reply = scanner.findWithinHorizon(".", 0).charAt(0);

       if (age >= 12 && age < 65) {
           price = 9.25;
       } else if (age < 12 || age >= 65) {
           price = 5.25;
       }

       if (reply == 'Y' || reply == 'y') {
           price -= 2.00;
       } else if (reply != 'Y' && reply != 'y' && reply != 'n' && reply != 'N') {
           System.out.println("huh?");
       }

       System.out.println("Please Pay $" + price + ".");
       System.out.print("Enjoy the show!");
       scanner.close();
   } 
}
