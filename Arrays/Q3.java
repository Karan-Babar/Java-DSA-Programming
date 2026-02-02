package Arrays;

//Divide an Array Into Subarrays With Minimum Cost I
public class Q3 {
    public static int minimumCost(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second) {
                second = x;
            }
        }
        return nums[0] + first + second;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,12};

        System.out.println(minimumCost(nums));
    }
}