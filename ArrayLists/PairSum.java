package ArrayLists;

public class PairSum {
    
    //Find if any pair in a sorted ArrayList has a target sum.
    public static boolean pairs(int[] arr, int target){
        
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if(arr[left] + arr[right] == target){
                System.out.println("("+left+","+right+")");
                return true;
            } else if(arr[left] + arr[right] > target){
                right--;
            } else {
                left++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,8};

        System.out.println(pairs(arr, 12));
    }
}