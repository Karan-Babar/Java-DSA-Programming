package Arrays;

import java.util.HashMap;

public class Infy {
//  You are given an array A of length N and an
// integer k.
// It is given that a subarray from l to r is considered
// good, if the number of distinct elements in that
// subarray doesn’t exceed k. Additionally, an empty
// subarray is also a good subarray and its sum is
// considered to be zero.
// Find the maximum sum of a good subarray.
    
    public static int subArray(int[] arr, int k){
        
        int sum = 0;
        int maxSum = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
            sum += arr[i];

            while(map.size() > k){
                map.put(arr[left], map.get(arr[left]) - 1);
                sum -= arr[left];

                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }

                left++;
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 2, 3, 5, 1, 2, 1, 1};
        int k = 2;

        System.out.println(subArray(arr, k));
    }
}
