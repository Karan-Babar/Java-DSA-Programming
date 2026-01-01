package Recursion;

//find the first occurence of an element in an array.
public class Problem4 {
    
    public static int findKey(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return findKey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,5};
        int key = 5;

        System.out.println(findKey(arr, key,0));
    }
}
