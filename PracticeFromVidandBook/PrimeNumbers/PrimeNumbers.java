package PrimeNumbers;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        findPrimes(1, 100);
    }

    public static ArrayList<Integer> findPrimes (int start, int end) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        int n = 4;
        boolean prime = true;

        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }

        System.out.println(prime);

        return null;
    }

}
