package Strings;

//Find the Index of the First Occurrence in a String.
public class FirstOccurrence {

    public static int strStr(String haystack, String needle) {

        // return haystack.indexOf(needle);
        
        int i = 0;
        char ch = needle.charAt(i);

        for(int j=0; j<haystack.length()-needle.length()+1; j++){
            if(ch == haystack.charAt(j)){
               String str = haystack.substring(j, needle.length()+j);

               if(str.equals(needle)){
                return j;
               } 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";

        System.out.println(strStr(haystack, needle));
    }
}
