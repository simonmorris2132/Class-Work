package reverseAString;

public class NestedPattern {
    
    public static void main(String[] args) {
       String r = reverse("Oranges are neat!!!");
       System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int indexLetter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            letters[indexLetter] = s.charAt(i);         /* This sets the foundation for the problem. It takes the length of the string, and sets it at the last index (-1). Then, at the indexLetter, we say it is equal to this index. It then iterates backwards. */
            indexLetter++;
        }

        String reverse = "";
        for (int i = 0; i < s.length(); i++) {          /* This pushes everything from the first forloop into the new string variable called reverse */
            reverse = reverse + letters[i];
        }

        return reverse;
    }

}
