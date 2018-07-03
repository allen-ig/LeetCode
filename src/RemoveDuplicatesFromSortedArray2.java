public class RemoveDuplicatesFromSortedArray2 {
    /**
     * space: O(1)
     * time: O(n)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int i = 1;
        int j = 0;
        boolean dupFlag = false;
        while (i < nums.length){
            if (nums[i] == nums[j] && dupFlag){
                while (i < nums.length && nums[i] == nums[j]){
                    i++;
                }
                dupFlag = false;
            }else {
                dupFlag = nums[i] == nums[j];
                nums[j + 1] = nums[i];
                i++;
                j++;
            }
        }
        return j + 1;
    }
}
