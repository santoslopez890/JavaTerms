package LeetCode;

public class validPal {
    public static boolean isPalindrome(String s) {
        StringBuilder one = new StringBuilder(s);
        one.reverse();
        return (one.toString().toLowerCase().equals(s.toLowerCase()));
    }

    public static void main(String[] args) {
        String s="Was it a car or a cat I saw";
        System.out.println(isPalindrome(s));
    }
}
