package TwoDArrays;

//print duplicate values in 2D Array
public class Q1 {
    public static void findSame(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                   count++;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
        System.out.println("Same key values :" + count);
    }

    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}};

        findSame(matrix, 8);                   
    }
}
