public class SuroundedRegions {
    /**
     * space: O(1)
     * time: O(mn)
     * @param board
     */
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++){
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][n - 1] == 'O') dfs(board, i, n - 1);
        }
        for (int i = 1; i < n - 1; i++){
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[m - 1][i] == 'O') dfs(board, m - 1, i);
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j){
        if (i < 0 || j < 0 || i > board.length || j > board[0].length || board[i][j] == 'X') return;
        board[i][j] = '*';
        if (i > 1 && board[i - 1][j] == 'O') dfs(board, i - 1, j);
        if (i < board.length - 2 && board[i + 1][j] == 'O') dfs(board, i + 1, j);
        if (j > 1 && board[i][j - 1] == 'O') dfs(board, i, j - 1);
        if (j < board[i].length - 2 && board[i][j + 1] == 'O') dfs(board, i, j + 1);
    }
}
