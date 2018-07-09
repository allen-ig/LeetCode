public class TransposeMatrix {
    /**
     * time: O(mn)
     * space: O(mn)
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) return null;
        int m = A.length;
        int n = A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
