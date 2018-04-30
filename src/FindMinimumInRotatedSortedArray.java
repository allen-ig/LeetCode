public class FindMinimumInRotatedSortedArray {
    /**
     * brute force straight-forward solution
     * time: O(n)
     * space: O(1)
     */
    public int findMin(int[] nums) {
        int res = 0;
        int count = 0;
        if (nums == null || nums.length == 0) return res;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i + 1]) {
                res = nums[i + 1];
                break;
            }
            count++;
        }
        if (count == nums.length - 1) return nums[0];
        else return res;
    }

    /**
     * binary search
     * time: O(logn)
     * space: O(1)
     */
    public int findMin2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) start = mid + 1;
            else end = mid - 1;
        }
        return nums[start];
    }
}
