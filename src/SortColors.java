public class SortColors {
    public void sortColors(int[] nums) {
        int zeroTail = 0;
        int twoHead = nums.length - 1;
        int i = 0;
        while (i <= twoHead){
            if (nums[i] == 0) {
                swap(nums, i, zeroTail);
                zeroTail++;
            }else if (nums[i] == 2){
                swap(nums, i, twoHead);
                twoHead--;
                i--;
            }
            i++;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
