package Edabit.Perimeter;

public class Perimeter {
    
    public static void run() {
        
        System.out.println(findThePerimeter(6, 7));

    }

    static int findThePerimeter(int length, int width) {

        return 2 * length + 2 * width;

    }

}

/* https://edabit.com/challenge/cMKLM7ExBd3TFJwPA this challenge was simple, just create a static method that we return the sum of two numbers we multiply by two. */