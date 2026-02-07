package Strings;

import java.util.Stack;

//1653. Minimum Deletions to Make String Balanced
public class StringBalanced {
    
    public static int minimumDeletions(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && s.charAt(i) == 'a' && st.peek() == 'b') { //'ba'
                st.pop();
                count++;
            } else {
                st.push(s.charAt(i));
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aababbab";

        System.out.println(minimumDeletions(s));
    }
}
