package ArrayLists;
import java.util.*;

public class Basics {
    
    public static void main(String[] args) {
        
       ArrayList<Integer> list = new ArrayList<>();

       //Add element O(1)
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       list.add(2,9); //O(n)
       System.out.println(list);
   
       //Get element O(1)
       System.out.println(list.get(2));

       //Remove element O(n)
       list.remove(3);

       //Set element at index O(n) 
       list.set(2, 4);

       //Contains element 
       System.out.println(list.contains(2));
       System.out.println(list.contains(12));
     
       System.out.println(list);
       System.out.println(list.size());

       //print the ArrayList
       for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
       }
    }
}
