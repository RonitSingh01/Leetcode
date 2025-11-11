import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        initializeBoard(board);
        solve(board, 0, solutions);
        return solutions;
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
    }

    private static void solve(char[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            solutions.add(saveSolution(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';     
                solve(board, row + 1, solutions);
                board[row][col] = '.';    
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> saveSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }
        return solution;
    }
}