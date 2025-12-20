package TwoDArrays;

public class DiagonalSum {

     //Time complexity O(n^2)
    public static int diagonalSum(int matrix[][]){
       
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("diagonal sum : "+sum);
        return sum;
    }

    //Time complexity O(n)
    // public static int diagonalSum(int matrix[][]){
       
    //     int sum = 0;
    //     for(int i=0; i<matrix.length; i++){
    //         //pd
    //         sum += matrix[i][i];
    //         //sd
    //         sum += matrix[i][matrix.length-i-1];
    //     }

    //     System.out.println("diagonal sum : "+sum);
    //     return sum;
    // }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        diagonalSum(matrix);
    }
}