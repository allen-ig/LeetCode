import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix[0].length - 1;
        int startCol = 0;
        int endCol = matrix.length - 1;
        while (startRow <= endRow && startCol <= endCol){
            for (int i = startRow; i <= endRow; i++){
                res.add(matrix[startCol][i]);
            }
            startCol++;

            for (int i = startCol; i <= endCol; i++){
                res.add(matrix[i][endRow]);
            }
            endRow--;

            if (startCol <= endCol){
                for (int i = endRow; i >= startRow; i--){
                    res.add(matrix[endCol][i]);
                }
            }
            endCol--;

            if (startRow <= endRow){
                for (int i = endCol; i >= startCol; i--){
                    res.add(matrix[i][startRow]);
                }
            }
            startRow++;
        }
        return res;
    }
}
