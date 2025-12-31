package Recursion;

//Recursion is a programming technique where a function solves a problem 
// by calling itself with smaller versions of the same problem until it 
// reaches a simple "base case" that stops the process, avoiding infinite loops.

//Print numbers ftom n to 1 (Decreasing Order)
public class Problem1 {
    
    public static void printDec(int n){
         if(n == 1){
            System.out.print(n);
            return;
         }

         System.out.print(n+" ");
         printDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;

        printDec(n);
    }
}
