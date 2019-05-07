public class HouseRobber2 {
    public int rob(int[] nums) {
        if (nums == null) return 0;
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
    }

    private int helper(int[] nums, int start, int end){
        int yes = 0, no = 0, maxYes = 0, maxNo = 0;
        for (int i = start; i <= end; i++){
            maxYes = no + nums[i];
            maxNo = Math.max(yes, no);

            yes = maxYes;
            no = maxNo;
        }
        return Math.max(maxYes, maxNo);
    }
}
