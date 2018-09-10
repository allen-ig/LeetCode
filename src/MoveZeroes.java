public class MoveZeroes {
    /**
     * time: O(n)
     * space: O(1)
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int zero = 0;
        for (int num : nums){
            if (num != 0) {
                nums[zero] = num;
                zero++;
            }
        }
        while (zero < nums.length){
            nums[zero] = 0;
            zero++;
        }
    }
}
