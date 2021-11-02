package Edabit.WordEnder;

public class WordEnding {
    public static void run() {
        System.out.println(wordEnder("ABC", "C"));
    }

    static boolean wordEnder(String str1, String str2) {
        return str1.endsWith(str2);
    }

}

