package ArrayLists;

import java.util.*;

public class Sorting {
    
  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(5);
    list.add(30);
    list.add(80);
    list.add(34);
    list.add(20);

    System.out.println(list);
    Collections.sort(list); //Ascending order
    System.out.println(list);

    //Descending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
  }

}