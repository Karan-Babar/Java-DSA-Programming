package Strings;

public class Q1 {
    
    public static float getShortestPath(String path){
        int X=0;
        int Y=0;
        
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

        //South
        if(dir == 'S'){
            Y--;
        }
        //North
        else if(dir == 'N'){
            Y++;
        }
        //East
        else if(dir == 'E'){
            X++;
        }
        //West
        else{
            X--;
        }
      }  
      int X2 = X*X;
      int Y2 = Y*Y;
      return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}
