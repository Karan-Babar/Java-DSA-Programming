package Recursion;

public class Factorial {
    
    public static int Facto(int n){
       if(n == 0){
          return 1;
       }

       int fnm1 = Facto(n-1);
       int fn = n * Facto(n-1);
       return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(Facto(n));
    }
}
