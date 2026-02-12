package ArrayLists;

import java.util.*;

public class Maximum {
    public static void main(String[] args) {

        int maxValue = Integer.MIN_VALUE;
        
       ArrayList<Integer> list = new ArrayList<>();

       //Add element O(1)
       list.add(1);
       list.add(2);
       list.add(10);
       list.add(4);
       list.add(5);

       for(int i=0; i<list.size(); i++){
          maxValue = Math.max(maxValue, list.get(i));
       }

       System.out.println("Maximum number : "+maxValue);
    }
}