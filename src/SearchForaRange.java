public class SearchForaRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[] {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (nums[low] < nums[high]){
            int mid = low + (high - low) / 2;
            if (nums[mid] < target){
                low = mid + 1;
            }else if (nums[mid] > target){
                high = mid - 1;
            }else{
                if (nums[low] == nums[mid]){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return (nums[low] == nums[high] && nums[low] == target) ? new int[] {low, high} : new int[] {-1, -1};
    }
}
