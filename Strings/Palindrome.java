package Strings;

//Palindrome means string start to end and end to start is same. like "madam" "noon" "racecar"
public class Palindrome {
    
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("This is not palindrome");
                return false;
            }
        }
        System.out.println("This is palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str);
         
        isPalindrome(str);
        // System.out.println(isPalindrome(str));
    }
}
