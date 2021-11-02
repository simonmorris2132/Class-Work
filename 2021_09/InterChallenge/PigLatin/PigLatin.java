package InterChallenge.PigLatin;

public class PigLatin {

    public static void run() {
        String str = "Please enter a sentence to convert into Pig Latin\n";
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

        String flipped = new String(chArr);

        return flipped;
    }
    
}

/* Stole this from the advancedCLI project lol. essentially it's taking the given sentence and saying if this string matches this encode, flip the characters with these characters. the word flip method is what makes this character flipping possible, with the "val" property being the strArr variable we made that holds our string in an array so we can mess with it. this doesn't really convert it into pig latin though. */