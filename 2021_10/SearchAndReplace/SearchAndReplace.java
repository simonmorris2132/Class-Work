package SearchAndReplace;

public class SearchAndReplace {
    
    public static void run() {
        
        String str1 = "The great fox jumped over the big log";
        String str2 = "leaped";
        String[] strArr1 = str1.split(" ");

        for (int i = 0; i < strArr1.length; i++) {
            
        }

    }

}

/* 

Perform a search and replace on the sentence using the arguments provided and return the new sentence.

First argument is the sentence to perform the search and replace on.

Second argument is the word that you will be replacing (before).

Third argument is what you will be replacing the second argument with (after).

Note: Preserve the case of the first character in the original word when you are replacing it. For example if you mean to replace the word Book with the word dog, it should be replaced as Dog

*/