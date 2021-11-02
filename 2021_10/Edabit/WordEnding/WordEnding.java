package Edabit.WordEnding;

@SuppressWarnings("ALL")

public class WordEnding {
    
    public static void run() {
        
        System.out.println(wordEnder("ABC", "BC"));

    }

    static boolean wordEnder(String str1, String str2) {
        return str1.endsWith(str2);
    }

}

/* https://edabit.com/challenge/PZnwXraqBPYv7w4Sm This is also really simple with the use of the endsWith module. */