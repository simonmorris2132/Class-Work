public class IntroToRecursion {
    public static void main(String[] args) {
        System.out.println(countDown(5));
    }

    public static int countDown(int counting) {
        
        if (counting >= 1) {
            return countDown(counting - 1) + counting;
        }
        
        return counting;
    }

}
