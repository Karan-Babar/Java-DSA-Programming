package Strings;

import java.util.Arrays;

//Longest Common Prefix. like  Input:strs = ["flower","flow","flight"] Output: "fl"
public class Q8 {
    
    public static String longestCommonPrefix(String[] strs) {
         Arrays.sort(strs);

         String s1 = strs[0];
         String s2 = strs[strs.length-1];
         int index = 0;

         while(index<s1.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            } else {
                break;
            }
         } 
         return index==0?"":s1.substring(0,index);
    }

     public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
