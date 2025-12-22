package Strings;

public class Comparison {
    
    public static void main(String[] args){
        
        String s1 = "karan";
        String s2 = "karan";
        String s3 = new String("karan");

        // This Comparison method is not working in String.
        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equals");
        // }

        // if(s1 == s3){
        //      System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equals");
        // }

        //Use this method for Comparison
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equals");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equals");
        }
    }
}
