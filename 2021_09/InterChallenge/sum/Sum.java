package InterChallenge.sum;

public class Sum {
    
    public static void run() {

        int[] twoNums = {1, 4};
        int firstNum = twoNums[0];
        int secondNum = twoNums[1];
        int sum = 0;

        while (true) {
            if (firstNum < secondNum) {
                sum += firstNum;
                firstNum++;
            }
            if (secondNum < firstNum) {
                sum += secondNum;
                secondNum++;
            }
            if (firstNum == secondNum || secondNum == firstNum) {
                System.out.print("the sum is = " + sum);
                break;
            }
        }
    }
}

/* So I found this solution on stack overflow. the while loop is checking if each number is equal or greater than each other, and adding those numbers together with every number in between. However it doesn't work completely. */