package Sorting;
import java.util.Arrays;
import java.util.Collections;

public interface InbuildSort {
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {3,4,1,2,5};

        Arrays.sort(arr);
        printArr(arr);
        // Descending order
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}