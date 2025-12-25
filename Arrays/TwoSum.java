package Arrays;

public class TwoSum {
    public static void twoSum(int[] nums, int target) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                System.out.println("("+i+","+j+")");
                count++;
            }
        }
    }

    if (count == 0) {
            System.out.println("Target not found");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,3,7,9,3};
        int target = 7;

        twoSum(nums, target);
    }
}
