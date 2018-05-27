public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        while (startRow <= endRow && startCol <= endCol){
            for (int i = startRow; i <= endRow; i++){
                res[startCol][i] = count;
                count++;
            }
            startCol++;

            for (int i = startCol; i <= endCol; i++){
                res[i][endRow] = count;
                count++;
            }
            endRow--;

            if (startCol <= endCol){
                for (int i = endRow; i >= startRow; i--){
                    res[endCol][i] = count;
                    count++;
                }
            }
            endCol--;

            if (startRow <= endRow){
                for (int i = endCol; i >= startCol; i--){
                    res[i][startRow] = count;
                    count++;
                }
            }
            startRow++;
        }
        return res;
    }
}
