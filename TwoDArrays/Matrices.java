package TwoDArrays;
import java.util.Scanner;

public class Matrices {
   
  public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
              System.out.println("found at cell ("+i+","+j+")");
               return true;
            }
        }
      }
      System.out.println("key not found");
      return false;
  }

  public static void findLargSmal(int matrix[][]){
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if (smallest > matrix[i][j]) {
              smallest = matrix[i][j];
          }
          if (largest < matrix[i][j]) {
              largest = matrix[i][j];
          }
        
            }
        }
         System.out.println("largest value is : " + largest);
         System.out.println("Smallest value is : "+ smallest);
    
      }
  
   public static void main(String[] args) {
      int matrix[][] = new int [3][3];
      int n = matrix.length; 
      int m = matrix[0].length;

      Scanner sc = new Scanner(System.in);
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
      }

      //print array
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }

      search(matrix, 5);
      findLargSmal(matrix);
   }    
}
