package Arrays;

public class Q2 {

    //Given an integer array, find the subarray with the largest sum and return that sum.
    //Solved using Kadane’s Algorithm (O(n))
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {2,4,5,6,7,6,6};

        System.out.println("Largest Subarray Sum = " + maxSubArray(nums));
    }
}


