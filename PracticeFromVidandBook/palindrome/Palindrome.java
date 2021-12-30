package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String original = "abcd";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {

            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            System.out.println(i);
        }

    }
}
