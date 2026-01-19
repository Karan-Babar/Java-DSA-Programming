package Backtracking;

public class Arrays {
    
    //Time complexity O(n)
    public static void addValue(int arr[], int i, int val){
       //base
        if(i == arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[i] = val;
        addValue(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int arr[]){
       for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];

        addValue(arr, 0, 1);
        printArray(arr);
    }
}
