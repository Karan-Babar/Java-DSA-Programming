package Sorting;

//worst case O(n^2).
//best case O(n). (array is already sorted)
public class BubbleSort {
    public static void sort(int arr[]){
        int swaps = 0;

      for(int turn=0; turn<arr.length-1; turn++){
        boolean swapped = false;

        for(int j=0; j<arr.length-1-turn; j++){
            if(arr[j] > arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swaps++;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
      }
      System.out.println("total swaps = " + swaps);

      if (swaps == 0) {
        System.out.println("Array is already sorted");
      }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sort(arr);
        printArr(arr);
    }
}
