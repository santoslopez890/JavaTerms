package LeetCode;

import java.util.Arrays;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        char[] one = s.toCharArray();
        Arrays.sort(one);
        char[] two = t.toCharArray();
        Arrays.sort(two);
        return Arrays.equals(one, two);
    }
}
