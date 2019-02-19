public class LongestIncreasingSubsequence {
    /**
     * time: O(n^2)
     * space: O(n)
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < dp.length; i++){
            int temp = 0;
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    temp = Math.max(temp, dp[j]);
                }
            }
            dp[i] = temp + 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
