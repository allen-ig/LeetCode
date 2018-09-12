import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    /**
     * O(n ^ 2)
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++){
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> cubes = new HashSet<>();
            for (int j = 0; j < 9; j++){
                if (board[i][j] != ('.') && !rows.add(board[i][j])) return false;
                if (board[j][i] != ('.') && !cols.add(board[j][i])) return false;
                int rIndex = 3 * (i / 3);
                int cIndex = 3 * (i % 3);
                if (board[rIndex + j / 3][cIndex + j % 3] != ('.') && !cubes.add(board[rIndex + j / 3][cIndex + j % 3]))
                    return false;
            }
        }
        return true;
    }
}
