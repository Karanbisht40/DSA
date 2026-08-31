class Solution {
    List<List<String>> result = new ArrayList<>();
    int N;

    // Ye check karega ki row,col par Queen rakh sakte hain ya nahi
    boolean isValid(List<String> board, int row, int col) {
    
    //upword
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        // 2. Upper Left Diagonal check karo
        // i row upar jayegi
        // j column left jayega
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        // 3. Upper Right Diagonal check karo
        // i-- => row upar jayegi
        // j++ => column right jayega
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < N;
             i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
    void solve(List<String> board, int row) {

        if (row >= N) {
            result.add(new ArrayList<>(board));
            return;
        }


        // Current row mein har column try karo
        for (int col = 0; col < N; col++) {
            // Check karo ki current position safe hai ya nahi
            if (isValid(board, row, col)) {

                // Current row ki string lo
                StringBuilder str = new StringBuilder(board.get(row));

                // Current column par Queen 'Q' place karo
                str.setCharAt(col, 'Q');

                // Board mein updated row daal do
                board.set(row, str.toString());
               
                solve(board, row + 1);


                // BACKTRACKING
                str.setCharAt(col, '.');
                board.set(row, str.toString());
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        N = n;
        // Empty board banao
        List<String> board = new ArrayList<>();
        // Har row mein initially "." fill karo
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        solve(board, 0);//row =0
        return result;
    }
}