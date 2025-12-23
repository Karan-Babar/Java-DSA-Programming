package Strings;

public class stringBuilder {
    
    // time complexity O(26)
    //using StringBuilder we can change the strings.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
 
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
