package Backtracking;

//Total number of solution
public class LeetCode52 {
    static int count;
    public static int totalNQueens(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        count = 0;

        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {         
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return nQueens(board, 0);
    }

      public static int nQueens(char board[][], int row){
        if(board.length == row){
            count++;   
            return count;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
               board[row][j] = 'Q';
               nQueens(board, row+1);
               board[row][j] = '.';
            }
        }

        return count;
    }

    public static boolean isSafe(char board[][], int row, int column){
        
        //Vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][column] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=column-1; i>=0 && j>=0; i--, j--){
           if(board[i][j] == 'Q'){
            return false;
           }
        }

        //diag right up
        for(int i=row-1, j=column+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(totalNQueens(n));
    }
}

