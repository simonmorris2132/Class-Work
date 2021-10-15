package InterChallenge.PigLatin;

import java.util.Scanner;

public class PigLatin {

    public static void run() {
        System.out.println("Please enter a sentence to convert into Pig Latin: \n");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        String encoded = "";

        for (int i = 0; i < strArr.length; i++) {
            boolean vowelCheck = strArr[i].matches("^[aeiouAIEOU].*");

            if (vowelCheck) {
                strArr[i] = wordFlip(strArr[i]);
                strArr[i] += "way";
            } else {
                strArr[i] = wordFlip(strArr[i]);
                strArr[i] += "ay";
            }
            encoded += strArr[i] + " ";
        }
        System.out.println(encoded.trim());
    }

    static String wordFlip(String val) {

        char[] chArr = val.toCharArray();
        int lastIndex = chArr.length - 1;
        char temp = chArr[0];
        chArr[0] = chArr[lastIndex];
        chArr[lastIndex] = temp;

        String flipped = new String (chArr);

        return flipped;
    }
    
}

/* Stole this from the advancedCLI project lol */