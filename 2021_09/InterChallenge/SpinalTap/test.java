package InterChallenge.SpinalTap;

public class test {
    public static void main(String[] args) {
        String str = "Hello my name is jeff";
        String[] strArr = str.split(" ");
        String newStr = "";

        for (int i = 0; i < strArr.length; i++) {
            newStr += strArr[i].substring(0, 1) + strArr[i].substring(1) + "-";
        }
        System.out.println(newStr.trim());
    }
}