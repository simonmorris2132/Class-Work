public class CountingDown {
    public static void main(String[] args) {
        System.out.println(countDown(10));
    }

    public static int countDown(int count) {
        if (count == 0) {
            System.out.println("See YA!!!!!!");
        } else {
            System.out.println(count);
            countDown(count - 1);
        }
        return count - count;
    }

}
