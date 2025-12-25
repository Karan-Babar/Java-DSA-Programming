package BitManipulation;

public class Q1 {
    
    public static void oddOrEven(int n){

        if((n & 1) == 0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        int n = 5;

        oddOrEven(n);
    }
}
