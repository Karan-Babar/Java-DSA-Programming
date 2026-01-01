package Recursion;

//Check if a given array is sorted or not.(ascending order)
public class Problem3 {
    
    public static boolean isSorted(int arr[],int i){

        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int arr2[] = {2,5,3,6,5};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr2, 0));
    }
}
