package Strings;

public class IntegerPali {
    
     public static boolean pali(int number){
        
        String str = Integer.toString(number);
        
        int j = str.length()-1;
        
       for(int i=0; i<str.length()/2; i++){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        } else {
            j--;
        }
       }
       return true;
    }

    // public static void palindrome(int number){
    //     String str = Integer.toString(number);
    //     String reverse = new StringBuilder(str).reverse().toString();

    //     if (str.equals(reverse)) {
    //         System.out.println("Palindrome");
    //     } else {
    //         System.out.println("Not a Palindrome");
    //     }
    // }
    
    public static void main(String[] args) {
       int number = 1234321;
       
       System.out.print(pali(number));
       //palindrome(number);
    }
}
