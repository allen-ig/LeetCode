public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        if (A == null || A.length == 0) return 0;
        int n = A.length;
        int res = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        
        System.arraycopy(A[0], 0, dp[0], 0, n);

        for (int i = 1; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == 0) dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]);
                else if (j == n - 1) dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                else dp[i][j] = Math.min(dp[i - 1][j + 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                dp[i][j] += A[i][j];
            }
        }

        for (int j = 0; j < n; j++){
            if (dp[n - 1][j] < res) res = dp[n - 1][j];
        }
        return res;
    }
}
