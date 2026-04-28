package Arrays;

import java.util.*;
public class Q4 {
     
    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5,6,7,8};
        int[] arr2 = {1,3,5,9,2,4};
        int[] arr3 = {1,3,5,6,7,8};

        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int j=0; j<arr2.length; j++){
            set2.add(arr2[j]);
        }

        List<Integer> list = new ArrayList<>();
        for(int k=0; k<arr3.length; k++){
            if(set1.contains(arr3[k]) && set2.contains(arr3[k])){
               list.add(arr3[k]);
            }
        }

        System.out.println(list);
    }
}