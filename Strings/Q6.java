package Strings;

import java.util.*;

public class Q6 {

    //Determine if 2 Strings are anagrams of each other.
    public static boolean isAnagram(String s1, String s2) {

        //length check
        if (s1.length() != s2.length()) {
            return false;
        }

        //convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        //sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        if (isAnagram(s1, s2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are NOT anagrams");
        }
    }
}

