package Recursion;

public class ReverseString {

    static void reverse(String s) {
        if (s.length() == 0) {   // base case
            return;
        }
        System.out.print(s.charAt(s.length() - 1));
        reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        reverse("hello");
    }
}

