class Solution {

    public boolean isSafe(char[][] board, int row, int col, char c) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == c) {
                return false;
            }
        }
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) {
                return false;
            }
        }
        // Check 3 x 3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == c) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {

                        if (isSafe(board, i, j, c)) {
                            board[i][j] = c;
                            
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Backtrack
                            board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }
}