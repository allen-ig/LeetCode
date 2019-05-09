class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int m = costs.length / 2;
        int[][] dp = new int[m + 1][m + 1];
        for (int i = 1; i <= m; i++){
            dp[i][0] = dp[i - 1][0] + costs[i - 1][0];
        }

        for (int i = 1; i <= m; i++){
            dp[0][i] = dp[0][i - 1] + costs[i - 1][1];
        }

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= m; j++){
                dp[i][j] = Math.min(dp[i - 1][j] + costs[i + j - 1][0], dp[i][j - 1] + costs[i + j - 1][1]);
            }
        }
        return dp[m][m];
    }
}