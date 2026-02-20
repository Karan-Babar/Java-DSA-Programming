package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //O(n^2)
    // public static void twoSum(int[] nums, int target) {
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    //     for (int j = i + 1; j < nums.length; j++) {
    //         if (nums[i] + nums[j] == target) {
    //             System.out.println("("+i+","+j+")");
    //             count++;
    //         }
    //     }
    // }

    // if (count == 0) {
    //         System.out.println("Target not found");
    //     }
    // }

    //O(n)
     public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int remaining = target - nums[i];
            
            if (mp.containsKey(remaining)) {
                return new int[]{mp.get(remaining), i};
            }
            
            mp.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {2,3,7,9,3};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}