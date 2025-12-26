package BitManipulation;

public class Q2 {
    
    //Clear last i bits like i=2, 1111 to 1100
    public static void clearIBit(int n,int i){
        System.out.println(n & ((~0)<<i));
    }

    public static void main(String[] args) {

        clearIBit(15, 2);
    }
}
