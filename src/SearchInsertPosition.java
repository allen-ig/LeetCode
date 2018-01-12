public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head + 1 < tail){
            int mid = (head + tail) / 2;
            if (target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                tail = mid;
            }else{
                head = mid;
            }
        }
        if (target <= nums[head]){
            return head;
        }else if(target <= nums[tail]){
            return tail;
        }else {
            return tail + 1;
        }
    }
}
