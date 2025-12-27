package BitManipulation;

public class Q7 {
    
    //Swap two numbers without using any third variable
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap:");
        System.out.println("a = " + a + ", b = " + b);

        // Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
