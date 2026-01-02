package Recursion;

//Print x to the power n.
public class Problem5 {
    
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        // int Xnm1 = power(x, n-1);
        // int xn = x * Xnm1;
        // return xn;

        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(power(2, 10));
    }
}
