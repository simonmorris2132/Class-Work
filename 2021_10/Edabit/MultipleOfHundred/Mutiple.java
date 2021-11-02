package Edabit.MultipleOfHundred;

@SuppressWarnings("ALL")

public class Mutiple {
    
    public static void run() {
        
        System.out.println(MultipleOfHundred(500));

    }

    static boolean MultipleOfHundred(int divisible) {
        return divisible % 100 == 0;
    }

}

/* https://edabit.com/challenge/KnRj8TSD63JBpzDfi This is simple, you create a number parameter where you divide it by one hundred, and then say it is equal to 0. if it is not divisible by one hundred it returns fault, vice versa it returns true */