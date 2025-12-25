package BitManipulation;

public class Operations {
    
    //Get ith bit
    public static void getIthBit(int n,int i){

        if((n & (1<<i)) == 0){
            System.out.println("bit is : 0");
        } else {
            System.out.println("bit is : 1");
        }
    }

    //Set ith bit
    public static void setIthBit(int n,int i){
        System.out.println(n | (1<<i));
    }

    //Clear ith bit
    public static void clearIthBit(int n,int i){
        System.out.println(n & ~(1<<i));
    }

    //Update ith bit
    public static void updateIthBit(int n,int i, int newBit){

        if(newBit == 0){
            System.out.println(n & ~(1<<i));
        } else if(newBit == 1){
            System.out.println(n | (1<<i));
        } else {
            System.out.println(n);
        }

        //Another approach
        // n = n & ~(1<<i);
        // System.out.println(n | newBit<<i);
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 2;

        getIthBit(n,i);
        setIthBit(5, 1);
        clearIthBit(5, 2);
        updateIthBit(7, 1, 0);
        updateIthBit(8, 2, 1);
    }
}
