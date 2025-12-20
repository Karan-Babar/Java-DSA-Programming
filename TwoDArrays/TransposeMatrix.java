package TwoDArrays;

public class TransposeMatrix {
    
    public static void printTranspose(int matrix[][]){

        for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }

       // Transpose matrix
        System.out.println("\nTransposed Matrix:");
         for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}};

        printTranspose(matrix);                
    }
}
