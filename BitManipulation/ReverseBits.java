package BitManipulation;

public class ReverseBits {
    
    //Reverse Bits 1010 -> 0101
    public static int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 4; i++) {
            result <<= 1;          // shift result left
            
            result |= (n & 1);     // take last bit of n
            
            n >>>= 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 12;

        System.out.println(reverseBits(n));
    }
}