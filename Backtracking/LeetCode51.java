package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode51 {

    static List<List<String>> result = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {

        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {         
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

         nQueens(board, 0);
         return result;
    }

      public static void nQueens(char board[][], int row){
        if(board.length == row){
           result.add(construct(board));   
            return;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
               board[row][j] = 'Q';
               nQueens(board, row+1);
               board[row][j] = '.';
            }
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            list.add(new String(board[i]));
        }
        return list;
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
        System.out.println(solveNQueens(n));
    }
}