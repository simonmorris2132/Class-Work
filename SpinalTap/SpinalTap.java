public class SpinalTap {
    public static void run() {
        String str = "This is a sentence";
        String[] strArr = str.split(" ");
        String newStr = "";
        
        for (int i = 0; i < strArr.length; i++) {
            newStr += strArr[i].substring(0, 1) + strArr[i].substring(1) + "-";
        }
        System.out.println(newStr.trim());
    }
}

/* This is essentially the titlecase a string option from the advanced CLI project we did a while back. I need to find a way to remove the dash from the end of the string. */