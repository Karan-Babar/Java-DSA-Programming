package BitManipulation;

public class Q3 {
    
    //Clear Range of bits 
    public static int clearBitsInRange(int n,int i,int j){
          int a = ((~0)<<(j+1));
          int b = (1<<i)-1;
          
          return n & (a|b);
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
