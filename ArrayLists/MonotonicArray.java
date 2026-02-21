package ArrayLists;

//896. Monotonic Array
public class MonotonicArray {
     public static boolean isMonotonic(int[] nums) {
        
        if(isIncre(nums)){
            return true;
        }

        if(isDecre(nums)){
            return true;
        }

        return false;
    }

    public static boolean isIncre(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean isDecre(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,6,4};

        System.out.println(isMonotonic(nums));
    }
}