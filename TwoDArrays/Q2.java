package TwoDArrays;

//Print out the sum of the numbers in the second row
public class Q2 {
    public static void MatrixRowSum(int matrix[][]){

            int sum = 0;
        // second row → index 1
        for (int j = 0; j < matrix[1].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("sum of second row : "+sum);
    }

    public static void MatrixColumnSum(int matrix[][]){

        int col = 1; // column index
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        System.out.println("sum of second Col : "+sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };

       MatrixRowSum(matrix);
       MatrixColumnSum(matrix);
    }
}
