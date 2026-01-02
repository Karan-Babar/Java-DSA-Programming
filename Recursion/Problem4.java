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

    //find the Last occurence of an element in an array.
    public static int findLastKey(int arr[], int key, int i){
     if(i == arr.length){
        return -1;
     }
     int isFound = findLastKey(arr, key, i+1);
     if(isFound == -1 && arr[i] == key){
        return i;
     }

     return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,7,5};
        int key = 5;

        System.out.println(findKey(arr, key,0));
        System.out.println(findLastKey(arr, key,0));
    }
}
