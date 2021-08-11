package com.company;

public class Challenge {

    public static String atbash(String str) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (alpha.indexOf(Character.toLowerCase(c)) > -1) {
                int n = Math.subtractExact(25, alpha.indexOf(Character.toLowerCase(c)));
                if (Character.isUpperCase(c))
                    cipher.append(Character.toUpperCase(alpha.charAt(n)));
                else
                    cipher.append(alpha.charAt(n));
            } else {
                cipher.append(c);
            }
        }
        return cipher.toString();
    }
}
