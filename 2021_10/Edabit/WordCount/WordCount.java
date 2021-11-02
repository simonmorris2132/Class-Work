package Edabit.WordCount;

@SuppressWarnings("ALL")

public class WordCount {
    
    public static void run() {
        
        System.out.println(countWords("Hello my name is johnny."));

    }

    static int countWords(String str) {
        return str.split(" ").length;
    }

}

/* https://edabit.com/challenge/5LnycSd2xT4uwZCpi This is reminissint of the intermediate challenges where we split the string by the spaces between each word, and count the words by using .length */
