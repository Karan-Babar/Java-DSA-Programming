package Recursion;

//Print x to the power n.
public class Problem5 {
    
    //O(n)
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        // int Xnm1 = power(x, n-1);
        // int xn = x * Xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    //Optimized O(logn)
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
         
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 5));
    }
}
