package Backtracking;

public class GridWays {

    public static int countWays(int i, int j, int n, int m){

        if(i == n-1 && j == m-1){
            return 1;
        } else if(i == n || j == m){
            return 0;
        }

        //Down step
        int W1 = countWays(i+1, j, n, m);
        //Right step
        int W2 = countWays(i, j+1, n, m);

        int totalWays = W1 + W2;

        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(countWays(0, 0, n, m));
    }
}
