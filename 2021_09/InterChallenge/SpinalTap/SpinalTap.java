package InterChallenge.SpinalTap;

public class SpinalTap {
    public static void run() {
        String str = "Hi my name is BrettMarcotte";
        String[] strArr = str.split(" ");
        String newStr = "";

        for (int i = 0; i < strArr.length; i++) {
            String newWord = "";
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) > 64 && strArr[i].charAt(j) < 97 && j != 0) {
                    newWord += "-";
                }
                newWord += strArr[i].charAt(j);
            }
            // System.out.println(newWord);
            if (i < 4) {
                newStr += newWord + "-";
            } else {
                newStr += newWord;
            }
        }
        System.out.println(newStr.toLowerCase());
    }
}

/* This is essentially the titlecase a string option from the advanced CLI project we did a while back. I need to find a way to remove the dash from the end of the string. */