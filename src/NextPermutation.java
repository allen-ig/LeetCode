public class NextPermutation {
    /**
     * time: O(n)
     * space: O(1)
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int i = nums.length - 1;

        for (; i > 0; i--){
            if (nums[i] > nums[i - 1]) break;
        }
        if (i != 0) swap(nums, i - 1);
        reverse(nums, i);
    }

    private void swap(int[] nums, int i){
        for (int j = nums.length - 1; j > i; j--){
            if (nums[j] > nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
    }

    private void reverse(int[] nums, int index){
        int first = index;
        int last = nums.length - 1;
        while (first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
}
