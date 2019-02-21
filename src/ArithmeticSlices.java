public class ArithmeticSlices {
    /**
     * time: O(N)
     * space: O(N)
     * @param A
     * @return
     */
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        int res = 0;
        for (int i = 2; i < dp.length; i++){
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]){
                dp[i] = 1 + dp[i - 1];
                res += dp[i];
            }
        }
        return res;
    }
}
