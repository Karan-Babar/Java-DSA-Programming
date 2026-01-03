package Recursion;

//Check if a number is palindrome using recursion
public class Palindrome {

    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String num = "121";
        System.out.println(isPalindrome(num, 0, num.length() - 1));
    }
}

