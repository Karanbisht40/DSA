class Solution {
    int m, n;
    int[][] directions = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    boolean find(char[][] board, int i, int j, int idx, String word) {
        // Base case
        if (idx == word.length()) {
            return true;
        }
        // Boundary condition
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '$') {
            return false;
        }
        // Character doesn't match
        if (board[i][j] != word.charAt(idx)) {
            return false;
        }
        // Store current ch
        char temp = board[i][j];

        board[i][j] = '$';
        // Try all 4 directions
        for (int[] dir : directions) {

            int new_i = i + dir[0];
            int new_j = j + dir[1];

            if (find(board, new_i, new_j, idx + 1, word)) {
                return true;
            }
        }
        // Backtracking
        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {

        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (find(board, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }
}