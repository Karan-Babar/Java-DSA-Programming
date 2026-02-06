package Arrays;

import java.util.Arrays;

//3634. Minimum Removals to Balance Array
public class BalanceArray {
       public static int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int maxLen = 1;

        for (int j = 0; j < n; j++) {
            long maxEl = nums[j];
            long minEl = nums[i];

            while (i < j && maxEl > (long) k * minEl) {
                i++;
                minEl = nums[i];
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return n - maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {2,1,5};

        System.out.println(minRemoval(nums, 2));
    }
}
