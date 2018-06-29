import java.util.HashSet;

public class FirstMissingPositive {
    /**
     * time: O(n)
     * space: O(n)
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums){
        if (nums == null || nums.length == 0) return 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++){
            if (!set.contains(i + 1)) return i + 1;
        }
        return nums.length;
    }
    /**
     * time: O(n)
     * space: O(1)
     */
    public int firstMissingPositive2(int[] nums){
        int i = 0;
        while (i < nums.length){
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > nums.length) i++;
            else if (nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else i++;
        }
        i = 0;
        while (i < nums.length && nums[i] == i + 1) i++;
        return i + 1;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
