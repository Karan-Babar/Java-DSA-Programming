package Strings;

import java.util.Scanner;

public class Q5 {
    
    //Count how many times lowercase vowels occurred in a string entered by the user.
      public static int countVowels(String str,String vowels){
         int count = 0;

         for(int i=0; i<str.length(); i++){
            for(int j=0; j<vowels.length(); j++){
                if(str.charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
         }
         System.out.print("lowercase vowels : ");
         return count;
      }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

         String vowels = "aeiou";
         
         System.out.println(countVowels(str, vowels));
    }
}
