package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        
        // Bit-wise Operators
        System.out.println((5&6)); //Binary AND &
        System.out.println((5|6)); //Binary OR |
        System.out.println((5^6)); //Binary XOR ^
        System.out.println((~5));  //Binary One's Complement
        System.out.println((5<<2)); //Binary left shift <<  (formula : a<<b = a*2^b)
        System.out.println((5>>2)); //Binary right shift >> 
    }
}
