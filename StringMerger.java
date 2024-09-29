import java.util.*;
public class StringMerger {
    public static String mergeStrings(String s1, String s2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            mergedString.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }

        // Append remaining characters from s1 if any
        if (i < s1.length()) {
            mergedString.append(s1.substring(i));
        }

        // Append remaining characters from s2 if any
        if (j < s2.length()) {
            mergedString.append(s2.substring(j));
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String mergedString = mergeStrings(s1, s2);
        System.out.println(mergedString);
    }
}