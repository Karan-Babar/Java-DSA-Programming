package SlidingWindow;

public class Subarray {

    //Find the maximum sum of subarray of size k.
    public static int maxSubarraySum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        //Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        //Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];       // add next element
            windowSum -= arr[i - k];   // remove left element
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(arr, k)); 
    }
}