package Recursion;

//Print sum of first n natural numbers.
public class Problem2 {
    
    public static int sum(int n){
       if(n == 1){
        return 1;
       }
       int sum = sum(n-1); 
       int ans = n + sum;
       return ans;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(sum(n));
    }
}
