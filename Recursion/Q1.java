package Recursion;

//Find all the occurrences of a given element(key) and print them.
public class Q1 {
    
    public static void findKey(int arr[], int idx, int key){
       
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }

        findKey(arr, idx+1, key);
    }
    public static void main(String[] args){

        int arr[] = {3,2,4,5,6,2,7,2,2};

        findKey(arr, 0, 2);
    }
}
