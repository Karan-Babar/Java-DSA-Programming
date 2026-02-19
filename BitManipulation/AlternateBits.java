package BitManipulation;

public class AlternateBits {
    
    //Binary Number with Alternating Bits
    public static boolean hasAlternatingBits(int n) {
      
      String binary = Integer.toBinaryString(n);
         
        for(int i=0; i<binary.length()-1; i++){
            
            if(binary.charAt(i) == binary.charAt(i+1)){
                return false;
            } 
        }

        return true;
    }
    // Second Solution
    //   int currBit = n%2;
    //   n = n/2;

    //   while(n > 0){
    //     if(currBit == n%2){
    //         return false;
    //     } 
    //     currBit = n%2;
    //     n = n/2;
    //   }

    //     return true;
 
    public static void main(String[] args) {
        int n = 5; //101

        System.out.println(hasAlternatingBits(n));
    }

}
