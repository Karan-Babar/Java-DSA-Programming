package Recursion;

//Friends pairing problem
//Given n friends, each one can remain single or can be paired up with some other friend.
//Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class Problem8 {
    
    public static int totalPair(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //choice
        //single 
        int fnm1 = totalPair(n-1);

        //pair
        int fnm2 = totalPair(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;

        return totalWays;
    }
    public static void main(String[] args){
        
        System.out.println(totalPair(4));
    }
}
