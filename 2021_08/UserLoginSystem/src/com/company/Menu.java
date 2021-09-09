package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<User> allUser = new ArrayList<>();

    public Menu() {
        this.scanner = scanner;
        this.allUser = allUser;
    }

    public void signUp() {

        System.out.println("SIGNUP");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        //TODO: string validation so they don't put in nothing and do not repeat themselves.

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

       //TODO: if (password.length() < 8) //try again

        User newUser = new User(username, password);

        System.out.println(newUser.getName());

        allUser.add(newUser);

    }

    public void logIn() {

        System.out.println("LOGIN");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        //check if the credentials is in the database

        for (User userCheck : allUser) {

//            System.out.println(userCheck.getName());
//            System.out.println(username);

            if (userCheck.getName().equals(username) && userCheck.getPassword().equals(password)) {
                System.out.println("SUCCESSFUL LOGIN");
            } else {
                System.out.println("INCORRECT CREDENTIALS");
                //TODO: Allow the user to try again.
            }

        }

    }

}
