package Edabit.ShuffleName;

public class Shuffle {


    public static void run() {
        
        System.out.println(Shuffle("Trump Donald"));

    }
    
    static String Shuffle(String str) {

        String[] strSplit = str.split(" "); //This turns the string into an array and removes each space

        return strSplit[1] + " " + strSplit[0]; //This swaps the words in the string from this index.


    }

}
