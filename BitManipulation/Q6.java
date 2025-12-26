package BitManipulation;

public class Q6 {
    
    //What is the value of X^X for any value of X?
    public static int fastExpo(int n){
        int ans = 1;
        int a = 0;
        a = n;
        while (n > 0) {
            if((n & 1) != 0){
                
                ans = ans * a;     
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        
        System.out.println(fastExpo(3));
    }
}

