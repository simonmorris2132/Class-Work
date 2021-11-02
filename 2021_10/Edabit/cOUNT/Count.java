package Edabit.cOUNT;

public class Count {
    
    public static void run() {
       /*  String str = "hello this is a word";
        String[] str1 = str.split(" ");

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i].toString().length());
        } */
       System.out.println(countWord("hello always convert a string into an array of strings"));
    }
    static int countWord(String str) {
        return str.split(" ").length;
    }
}
