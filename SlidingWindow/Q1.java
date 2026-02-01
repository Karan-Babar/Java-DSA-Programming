package SlidingWindow;

public class Q1 {

    //Find the minimum length subarray whose sum is ≥ S.
    public static int minSubarrayLen(int[] arr, int s) {
        int windowSum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            while (windowSum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= arr[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int s = 7;
        System.out.println(minSubarrayLen(arr, s)); 
    }
}