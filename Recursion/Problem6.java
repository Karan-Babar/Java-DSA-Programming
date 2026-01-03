package Recursion;

//Find maximum element in an array using recursion.
public class Problem6 {

    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {   
            return arr[index];
        }
        int max = findMax(arr, index + 1);
        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        System.out.println(findMax(arr, 0));
    }
}

