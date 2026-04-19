package GreedyAlgo;

import java.util.*;

public class ActivitySelection {
    
    public static void main(String[] args) {
        
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        
        //2D array helps to sort
        int activities[][] = new int[start.length][2];
        for(int i=0; i<start.length; i++){
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        //lambda function -> shortform
        //sorting based on end points
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[1]));
        
        //added first activity
        int count = 1;
        int st = activities[0][1];

        for(int i=1; i<start.length; i++){
           if(activities[i][0] >= st){
             count++;
             st = activities[i][1];
           }
        }

        System.out.println("Max activities = " + count);
    }
}