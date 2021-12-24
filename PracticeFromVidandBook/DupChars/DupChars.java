package DupChars;

public class DupChars {
    public static void main(String[] args) {
        
        String sen = "how many duplicates are there";
        System.out.println(sen);

        String chars = "";

        String dupes = "";

        for (int i = 0; i < sen.length(); i++) {
            String current = Character.toString(sen.charAt(i));
            if (chars.contains(current)) {
                if (!dupes.contains(current)) {
                    dupes += current + ", ";
                }
            }
            chars += current;
        }
        System.out.println(dupes);
    }
}
