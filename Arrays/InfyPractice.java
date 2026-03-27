package Arrays;

import java.util.*;
public class InfyPractice {
    
    static final long MOD = 1000000007;
    public static void solve(int[] arr, int[][] queries){
       long totalSum = 0;

        for(int[] q : queries){
            int type = q[0];
            int l = q[1];
            int r = q[2];

            if(type == 1){
                for(int i=l; i<=r; i++){
                    long value = (long)(i-l+1) * arr[l];
                    arr[i] = (int)(value % MOD);
                }
            }
            printArray(arr);

            long sum = 0;
            if(type == 2){
                for(int i=l; i<=r; i++){
                    sum = (sum + arr[i]) % MOD;
                }
                System.out.println(sum);
                totalSum = (totalSum + sum) % MOD;
            }
        }

        System.out.println(totalSum % MOD);
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 5, 1, 6, 7, 8}; 
        int[][] queries = {{1,1,6},{1,1,5},{2,5,5},{2,3,4},{2,3,3}};
        
        solve(arr, queries);
    }
}
