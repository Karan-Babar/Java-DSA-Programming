package Arrays;

import java.util.HashSet;
import java.util.Set;

//Longest Balanced Subarray I
public class BalancedSubarray {
    
    public static int longestBalanced(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for (int j = i; j < n; j++) {

                if (nums[j] % 2 == 0) {
                    evenSet.add(nums[j]); 
                } else {
                    oddSet.add(nums[j]);  
                }

                if (evenSet.size() == oddSet.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,2};

        System.out.println(longestBalanced(nums));
    }
}
