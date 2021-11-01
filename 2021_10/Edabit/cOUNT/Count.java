package Edabit.cOUNT;

public class Count {
    
    public static void run() {
        String str = "why wont this";
        String[] str1 = str.split(" ");

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i].toString().length());
        }
        // System.out.println(str1.toString().length());
    }

    /* static String countWord(String str) {
        
      


    } */

}
