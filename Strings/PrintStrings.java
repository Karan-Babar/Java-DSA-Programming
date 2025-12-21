package Strings;

import java.util.Scanner;

public class PrintStrings {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
         
        // String name = "Karan";
        // System.out.println(name);

        //Concatenation
        String firstName = "karan";
        String lastName = "babar";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); //Line used for print two or more words in string.
        System.out.println(name);

          printLetters(name);
    }
}